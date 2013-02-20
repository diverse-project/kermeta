/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 31 aout 2010
 * Authors : 
 *           Marie Gouyette <marie.gouyette@inria.fr> 
 */
package org.kermeta.utils.logger.eclipse.error_log;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.UnifiedMessage;


/**
 * 
 * @author mgouyett
 * This class permits to add error or warning in the error log view
 *
 */
public class LoggerEclipsePlugin extends Plugin{
	
	/**
	 * Display the message in the Error Log view only if it is a ProblemMessage of kind WARNING, ERROR, or FATAL.
	 * @param message : the message to display (if it is is a ProblemMessage of kind WARNING, ERROR, or FATAL), do nothing otherwise 
	 * @param e : an exception associated with the message
	 * @param plugin : the plugin on which the error appears
	 * @param plugin_id : the the id of this plugin
	 */
	public void addToErrorLog(UnifiedMessage message){
		if (message instanceof ProblemMessage) { // WARNING,ERROR, FATAL
			
			switch(((ProblemMessage)message).getSeverity()) {
			case WARNING : this.getLog().log((IStatus) new Status(IStatus.WARNING, message.getMessageGroup(), IStatus.WARNING, message.getMessage(),((ProblemMessage)message).getSenderTrace()));
						   break;
			case ERROR 	: this.getLog().log((IStatus) new Status(IStatus.ERROR,message.getMessageGroup(), IStatus.ERROR, message.getMessage(),((ProblemMessage)message).getSenderTrace()));
			   			  break;
			case FATAL  : this.getLog().log((IStatus) new Status(IStatus.ERROR,message.getMessageGroup(), IStatus.ERROR, message.getMessage(),((ProblemMessage)message).getSenderTrace()));
						  break;
			default     : break;						
			}
		}
		/*else {
			//This message not need to be on the error log view
		}*/
	}

}
