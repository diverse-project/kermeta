package fr.irisa.triskell.osgi.introspector.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorDynamic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorStatic;
import fr.irisa.triskell.osgi.introspector.generator.resolver.Resolver;
import fr.irisa.triskell.osgi.introspector.generator.resolver.ResolverStaticWithSystemRepresentation;
import fr.irisa.triskell.osgi.introspector.generator.resolver.ResolverStaticWithoutSystemRepresentation;
import framework.Bundle;

/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class contains function which are used into
 * {@link OSGiIntrospectorDynamic} and {@link OSGiIntrospectorStatic}
 * 
 */
public class OSGiIntrospectorUtilStatic extends OSGiIntrospectorUtil {

	@Override
	public int entryExist(String reference, Bundle bundle) {
		java.io.File ioFile = new java.io.File(bundle.getLocation());
		return entryExist(reference, ioFile);
	}

	@Override
	public void log(Level level, String message, Bundle bundle) {
		if (bundle == null) {
			defineLoggerProperties("OSGi_Introspector");
			logger = Logger.getLogger("OSGi_Introspector");
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

	/**
	 * This function is used to configure the logger to used.
	 * 
	 * @param loggerName
	 *            the name of the log file(without extension).
	 */
	private void defineLoggerProperties(String loggerName) {
		try {
			Properties properties = new Properties();
			InputStream stream = this.getClass().getClassLoader().getResource(
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

	@Override
	public Resolver getResolver(boolean withSystemRepresentation) {
		if (withSystemRepresentation) {
			return new ResolverStaticWithSystemRepresentation(this);
		}
		return new ResolverStaticWithoutSystemRepresentation(this);
	}
}
