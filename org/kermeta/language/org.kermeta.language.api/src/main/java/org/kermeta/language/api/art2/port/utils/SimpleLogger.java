/* $Id:$ 
 * Creation : 8 déc. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.art2.port.utils;

import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;

/**
 * Simple ART2 port aware logger
 * If the port isn't bound, then the messages goes to System.out
 */
public class SimpleLogger {
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	
	protected AbstractComponentType artComponent = null;
	protected String bundleSymbolicName = "";
	protected String logPortName = "log";
	
	public SimpleLogger(AbstractComponentType artComponent,
			String bundleSymbolicName, String logPortName) {
		super();
		this.artComponent = artComponent;
		this.bundleSymbolicName = bundleSymbolicName;
		this.logPortName = logPortName;
	}
	
	public MessagePort getLogPort() {
		if( artComponent == null) return null;
		return artComponent.getPortByName(logPortName, MessagePort.class);
	}
    /**
     * log debug message with support of optional log port
     * if port isn't present, log to System.out
     * @param msg
     */
    public void debug(String msg){
    	MessagePort port = getLogPort();
    	if(port!= null)
    		port.process(mFactory.createDebugMessage(msg, bundleSymbolicName));
    	else
    		System.out.println(msg);
    }
    /**
     * log info message with support of optional log port
     * if port isn't present, log to System.out
     * @param msg
     */
    public void info(String msg){
    	MessagePort port = getLogPort();
    	if(port!= null)
    		port.process(mFactory.createInfoMessage(msg, bundleSymbolicName));
    	else
    		System.out.println(msg);
    }
    /**
     * log debug message with support of optional log port
     * if port isn't present, log to System.out
     * @param msg
     */
    public void error(String msg, Exception senderTrace){
    	MessagePort port = getLogPort();
    	if(port!= null)
    		port.process(mFactory.createErrorMessage(msg, bundleSymbolicName, senderTrace));
    	else
    		System.out.println(msg);
    }

    /**
     * log debug message with support of optional log port
     * if port isn't present, log to System.out
     * @param msg
     */
    public void warning(String msg){
    	MessagePort port = getLogPort();
    	if(port!= null)
    		port.process(mFactory.createWarningMessage(msg, bundleSymbolicName));
    	else
    		System.out.println(msg);
    }
}
