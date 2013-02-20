/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 16 mars 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

public class CancelMonitor implements Runnable{
	Process monitoredProcess;
	KermetaRunner runner;
	public CancelMonitor(Process monitoredProcess, KermetaRunner runner){
		this.monitoredProcess = monitoredProcess;
		this.runner = runner;
	}
	@Override
	public void run() {
		try{
			while(true){
				synchronized(this)
		        {
					//runner.logger.debug("checking user interruption", KermetaCompiler.LOG_MESSAGE_GROUP);
					wait(2000);
					if(runner.mustCancelRun()){
						runner.logger.warn("User Interruption required", KermetaCompiler.LOG_MESSAGE_GROUP);
						monitoredProcess.destroy();
						return;
					}
		        }
			}
		}
		catch (InterruptedException e){}
	}
}