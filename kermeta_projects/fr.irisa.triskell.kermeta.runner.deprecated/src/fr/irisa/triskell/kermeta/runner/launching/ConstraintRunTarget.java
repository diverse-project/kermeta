package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.error.KermetaError;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.process.KermetaRunProcess;

public class ConstraintRunTarget extends KermetaRunTarget {
	
	 public ConstraintRunTarget(ILaunch p_launch)
	 {  super(p_launch); }
	 
	 public void start()
	 { 
		 initPath();
		 kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", true);
		 kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute);
		 kermeta_process.start();
	 }
}
