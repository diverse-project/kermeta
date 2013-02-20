/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 oct. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline.callable;

import java.util.concurrent.Callable;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.api.reference.FileReference;
/**
 * Marking errors might be long in eclipse, so we allow to run that in threads, 
 * when reporting many problems the UI thread will be able to process a group of them instead of switching thread for each of them
 *
 */
public class CallableLogProblem  implements Callable<Boolean> {

	public MessagingSystem logger;
	public MessagingSystem.Kind msgKing;
	public String msg;
	public String msgGroup;
	public FileReference ref;
	
	public CallableLogProblem(MessagingSystem logger, Kind msgKing, String msg,
			String msgGroup, FileReference ref) {
		super();
		this.logger = logger;
		this.msgKing = msgKing;
		this.msg = msg;
		this.msgGroup = msgGroup;
		this.ref = ref;
	}

	@Override
	public Boolean call() throws Exception {
		logger.logProblem(msgKing, msg, msgGroup, ref);
		return null;
	}

}
