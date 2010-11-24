/* $Id$
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 28 juil. 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.messaging.UnifiedMessage;
import org.kermeta.language.api.port.PortLog;
import org.kermeta.utils.logger.eclipse.ConsoleMessageFactory;
import org.kermeta.utils.logger.eclipse.console.ConsoleIO;
import org.kermeta.utils.logger.eclipse.console.EclipseConsoleIOFactory;
import org.kermeta.utils.logger.eclipse.error_log.LoggerEclipsePlugin;
import org.osgi.framework.Bundle;


/**
 * Implementation of a Message port dedicated to receive UnifiedMessage
 * and log them in Eclipse
 */
@ThirdParties({
	@ThirdParty(name="org.kermeta.language.model", url="mvn:org.kermeta.language/language.model"),
	@ThirdParty(name="org.kermeta.language.kp.model", url="mvn:org.kermeta.kp/kp.model"),
	@ThirdParty(name="org.kermeta.language.traceability.model", url="mvn:org.kermeta.traceability/traceability.model"),
	@ThirdParty(name="org.kermeta.language.api", url="mvn:org.kermeta.language/language.api")
})
@Provides({
    //@ProvidedPort(name = "asynclog", type=PortType.MESSAGE),
    @ProvidedPort(name = "log", type=PortType.MESSAGE)
})

@Library(name= "org.kermeta.utils")
@ComponentType
public class Art2ComponentEclipseLogger extends AbstractComponentType {
	private ConsoleIO logger;
	private ConsoleMessageFactory consoleMessageFactory = new ConsoleMessageFactory();
	protected String consoleUId ;
	private LoggerEclipsePlugin errorLog = new LoggerEclipsePlugin();
	
	
	//@port(name="asynclog", method="process")
	@Port(name="log",method="process")
    public void process(Object o){ 		
		if (o instanceof UnifiedMessage) {
			// TODO filter Developer message if not required by the UI (preference page, and/or toggle button etc...)
			
			UnifiedMessage kermetaMessage = (UnifiedMessage) o;
			// build consoleMessage from unifiedMessage then print it
			getLogger().println(consoleMessageFactory.getConsoleMessage(kermetaMessage));
			//Also log errors and warnings to Eclipse log view
			errorLog.addToErrorLog(kermetaMessage); // do nothing if the message is not a ProblemMessage of kind WARNING, ERROR, or FATAL
		} else {
                    //Best effort Try to display to String message
                    getLogger().println(o.toString());

                }
    }
	
	@Start
	public void start(){
		Bundle b = (Bundle)this.getDictionary().get("osgi.bundle");
		String bundleSymbolicName = b.getHeaders().get("Bundle-SymbolicName").toString();
		consoleUId = bundleSymbolicName+this.hashCode();
		logger = EclipseConsoleIOFactory.getInstance().getConsoleIO(consoleUId, bundleSymbolicName + " console");
	}
	
	
	
	@Stop
	public void stop(){
		EclipseConsoleIOFactory.getInstance().removeConsoleIO(consoleUId);
	}
	
	/* This should be removed when art bug will be fixed*/
	private ConsoleIO getLogger(){
		if(logger == null){
			// create a temporary console because we have been called before being completely started
			logger = EclipseConsoleIOFactory.getInstance().getConsoleIO(consoleUId, "Dummy console");
		}
		return logger;
	}
	
}

