/* $Id$
 * Project    : org.kermeta.utils.logger.standalone
 * File       : Art2ComponentStandaloneLogger.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 juil. 2010
 * Authors : 
 *          Didier Vojtisek  <didier.vojtisek@inria.fr> 
 */
package org.kermeta.utils.logger.stdout.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.messaging.UnifiedMessage;
//import org.kermeta.art2.framework.MessagePort;
import org.kermeta.utils.logger.stdout.SimpleSystemOutLogger;

@Provides({
    @ProvidedPort(name = "logPort", type=PortType.MESSAGE)
})

@Library(name= "org.kermeta.utils")
@ComponentType
public class Art2ComponentStdOutLogger extends AbstractComponentType {
	protected SimpleSystemOutLogger logger;

	@Port(name="logPort",method="process")
    public void process(Object o){
		if (o instanceof UnifiedMessage) {
			logger.log((UnifiedMessage) o);
		}
    }
	
	/**
	 * Method called when starting a new component instance
	 */
	@Start
	public void start(){
		logger =  new SimpleSystemOutLogger();
	}
	
	public SimpleSystemOutLogger getLogger() {
		return logger;
	}
	
	/**
	 * Method called when stopping the component instance
	 */
	@Stop
	public void stop(){
		//logger.destroy();
	}
}
