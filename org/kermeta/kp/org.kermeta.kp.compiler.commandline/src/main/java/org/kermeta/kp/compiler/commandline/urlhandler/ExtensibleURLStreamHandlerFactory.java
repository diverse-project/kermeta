/* $Id:$ 
 * Creation : 16 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline.urlhandler;

import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ExtensibleURLStreamHandlerFactory implements
		URLStreamHandlerFactory {

	
	private static final String HANDLER_PKGS_SYSTEM_PROPERTY = "java.protocol.handler.pkgs";

	private static Map<String,URLStreamHandler> registry = Collections.synchronizedMap(new HashMap<String,URLStreamHandler>());

	@Override
	public URLStreamHandler createURLStreamHandler(String protocol) {
		URLStreamHandler handler = (URLStreamHandler) registry.get(protocol);
		if (handler == null)
		{
			handler = this.defaultHandlerCreateStrategy(protocol);
		}
		return handler;

	}
	
	/**
	 * Install an instance of this class as UrlStreamHandlerFactory. This may be
	 * done exactly once as {@link URL} will throw an {@link Error} on
	 * subsequent invocations.
	 * <p>
	 * This method takes care that multiple invocations are possible, but the
	 * UrlStreamHandlerFactory is installed only once.
	 */
	public static synchronized void installUrlStreamHandlerFactory() {
		/*
		 * When running under surefire or maven plugin, this class will be loaded by different
		 * class loaders and will be running in multiple "main" thread objects.
		 * Thus, there is no way for this class to register a globally available
		 * variable to store the info whether our custom UrlStreamHandlerFactory
		 * was already registered.
		 * 
		 * The only way to accomplish this is to catch the Error that is thrown
		 * by URL when trying to re-register the custom UrlStreamHandlerFactory.
		 */
		try {
			URL.setURLStreamHandlerFactory(new ExtensibleURLStreamHandlerFactory());
		} catch (Error err) {
			System.out.println("Custom MuleUrlStreamHandlerFactory already registered"
							+ err);

		}
	}

	public static void registerHandler(String protocol, URLStreamHandler handler) {
		registry.put(protocol, handler);
	}

	
	private URLStreamHandler defaultHandlerCreateStrategy(String protocol)
	{
		String packagePrefixList = System.getProperty(HANDLER_PKGS_SYSTEM_PROPERTY, "");

		if (packagePrefixList.endsWith("|") == false)
		{
			packagePrefixList += "|sun.net.www.protocol";
		}

		StringTokenizer tokenizer = new StringTokenizer(packagePrefixList, "|");

		URLStreamHandler handler = null;
		while (handler == null && tokenizer.hasMoreTokens())
		{
			String packagePrefix = tokenizer.nextToken().trim();
			String className = packagePrefix + "." + protocol + ".Handler";
			try
			{
				handler = (URLStreamHandler) Class.forName(className).newInstance();
			}
			catch (Exception ex)
			{
				// not much we can do here
			}
		}

		return handler;
	}
}
