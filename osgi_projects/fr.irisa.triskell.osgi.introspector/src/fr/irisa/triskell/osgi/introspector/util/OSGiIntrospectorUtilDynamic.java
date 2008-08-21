package fr.irisa.triskell.osgi.introspector.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.generator.resolver.Resolver;
import fr.irisa.triskell.osgi.introspector.generator.resolver.ResolverDynamicWithSystemRepresentation;
import fr.irisa.triskell.osgi.introspector.generator.resolver.ResolverDynamicWithoutSystemRepresentation;
import framework.Bundle;

public class OSGiIntrospectorUtilDynamic extends OSGiIntrospectorUtil {

	private BundleContext context;

	public OSGiIntrospectorUtilDynamic(BundleContext context) {
		this.context = context;
	}

	@Override
	public int entryExist(String reference, Bundle bundle) {
		org.osgi.framework.Bundle bundleOSGi = context
				.getBundle(bundle.getId());

		URL url = bundleOSGi.getEntry(reference);
		if (url != null) {
			if (reference.endsWith("/")) {
				return 1;
			} else {
				return 0;
			}
		}
		return -1;
	}

	/**
	 * This function is used to configure the logger to used.
	 * 
	 * @param loggerName
	 *            the name of the log file(without extension).
	 */
	private void defineLoggerProperties(String loggerName) {
		try {
			Properties properties = new Properties();
			InputStream stream = context.getBundle().getEntry(
					"config/log4j.properties").openStream();
			properties.load(stream);
			properties.put("log4j.logger." + loggerName, "ALL, HTML_DATA");
			properties.put("log4j.appender.HTML_DATA.File", logLocation
					+ java.io.File.separator + "logs" + java.io.File.separator
					+ loggerName + ".html");
			PropertyConfigurator.configure(properties);
		} catch (IOException e) {
			System.err.println("OSGi Introspector error :");
			System.err.println("Error during configuration of log4j");
			e.printStackTrace();
		}

	}

	/**
	 * This function is used to log an event. It's used to log events with the
	 * same logger. All logs are saved into HTML files. If there are problems to
	 * use a {@link Logger}, the logs are just print into the standard output.
	 * 
	 * @param level
	 *            the {@link Level} of log
	 * @param message
	 *            the message to logged
	 */
	@Override
	public void log(Level level, String message, Bundle bundle) {
		if (bundle == null) {
			defineLoggerProperties(context.getBundle().getSymbolicName());
			logger = Logger.getLogger(context.getBundle().getSymbolicName());
		} else {
			String loggerName = bundle.getLocation();
			if (loggerName.endsWith("/") || loggerName.endsWith("\\")) {
				loggerName = loggerName.substring(0, loggerName.length() - 1);
			}
			int i = loggerName.lastIndexOf(java.io.File.separator) + 1;
			defineLoggerProperties(loggerName.substring(i));
			logger = Logger.getLogger(loggerName.substring(i));
		}
		if (logger != null) {
			logger.log(level, message);
		} else {
			if (bundle != null) {
				System.out.println("bundle : " + bundle.getLocation());
			}
			if (level == Level.DEBUG) {
				System.out.println("DEBUG :");
			} else if (level == Level.INFO) {
				System.out.println("INFO :");
			} else if (level == Level.WARN) {
				System.out.println("WARNING :");
			} else if (level == Level.ERROR) {
				System.out.println("ERROR :");
			}
			System.out.println(message);
			System.out.println();
		}
	}

	@Override
	public Resolver getResolver(boolean withSystemRepresentation) {
		if (withSystemRepresentation) {
			return new ResolverDynamicWithSystemRepresentation(this.context,
					this);
		}
		return new ResolverDynamicWithoutSystemRepresentation(this.context,
				this);
	}
}
