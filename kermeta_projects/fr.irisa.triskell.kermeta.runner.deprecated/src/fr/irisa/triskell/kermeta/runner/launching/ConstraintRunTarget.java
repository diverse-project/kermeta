package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;

public class ConstraintRunTarget extends AbstractKermetaTarget {
	
	 public ConstraintRunTarget(ILaunch p_launch)
	 {
		 launch = p_launch;
		 launch.getLaunchConfiguration();
	 }
	 
	 
	 public void start()
	 { 
		 initPath();
		 kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", true);
		 kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute);
		 kermeta_process.start();
	 }
	 
	 
	 
	 
	 public IThread[] getThreads() throws DebugException {
		 return threads;
	 }
}
