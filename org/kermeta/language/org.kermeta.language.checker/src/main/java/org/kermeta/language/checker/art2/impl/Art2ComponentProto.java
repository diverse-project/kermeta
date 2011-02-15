/* $Id: $
 * Project    : org.kermeta.language.checker
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 sept. 2010
 * Authors : 
 *            username <usermail@inria.fr>
 */

package org.kermeta.language.checker.art2.impl;

import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;

import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKEvent;
import org.kermeta.language.api.port.PortLog;
import org.osgi.framework.Bundle;

/**
 * Define an art2 bundle template for template purpose : 
 * The bundle provides a Kevent port for processing kermeta events and requires a log port for the log messages
 * 
 * @author username
 */

@Provides( {
	/**
	 * Kevent port for handling kermeta events
	 */
	// @ProvidedPort(name = "asynclog", type=PortType.MESSAGE),
	@ProvidedPort(name = "kevent", type = PortType.SERVICE, className = PortKEvent.class) 
	}
)

@Requires( {
	/**
	 * Log port for sending technical messages
	 */
	@RequiredPort(name = "log", type = PortType.SERVICE, className = PortLog.class) 
	}
)
@Library(name= "org.kermeta.language")
@ComponentType
public class Art2ComponentProto extends AbstractComponentType {

	/**
	 * The log port used to send technical log messages
	 */
	protected PortLog logPort = null;

	/**
	 * The symbolic name of this bundle
	 */
	protected String bundleSymbolicName = "";

	/**
	 * This bundle
	 */
	protected Bundle bundle;

	/**
	 * The factory to create technical messages
	 */
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory
			.getInstance();

	/**
	 * Handle the actions to be performed when some object o(Kevent) are
	 * received
	 * 
	 * @param o the received kermeta event (Kevent)
	 */
	// @port(name="asynclog", method="process")
	@Port(name = "kevent", method = "processKEvent")
	public void processKEvent(Object o) {
		//TODO
	}

	/**
	 * Start this bundle dynamically
	 */
	@Start
	public void start() {
		logPort = getPortByName("log", PortLog.class);
		bundle = (Bundle) this.getDictionary().get("osgi.bundle");
		bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
		logPort.log(mFactory.createDebugMessage("Successfully started Art2ComponentProto", bundleSymbolicName));
	}

	/**
	 * Stop this bundle dynamically
	 */
	@Stop
	public void stop() {
		//TODO
	}

	/**
	 * Get the bundle symbolic name
	 * 
	 * @return the bundle symbolic name
	 */
	public String getBundleSymbolicName() {
		return bundleSymbolicName;
	}

	/**
	 * Get the bundle
	 * 
	 * @return the bundle
	 */
	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * Get the log port to send technical messages
	 * 
	 * @return the log port
	 */
	public PortLog getLogPort() {
		return logPort;
	}
}
