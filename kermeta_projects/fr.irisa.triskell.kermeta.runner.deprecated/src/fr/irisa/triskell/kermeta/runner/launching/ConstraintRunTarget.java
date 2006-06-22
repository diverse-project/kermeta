/* $Id: ConstraintRunTarget.java,v 1.4 2006-06-22 07:53:57 dvojtise Exp $
 * Project: KermetaRunner
 * File: ConstraintRunTarget.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2006
 * Authors: jmottu
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.ILaunch;

import fr.irisa.triskell.kermeta.runner.debug.process.KermetaRunProcess;

public class ConstraintRunTarget extends KermetaRunTarget {
	
	 public ConstraintRunTarget(ILaunch p_launch)
	 {  super(p_launch); }
	 
	 public void start()
	 { 
		 initPath();
	     initConsole();
		 kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", true, console);
		 
		 
		 kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute, getCurrentProjectPath());
		 kermeta_process.start();
	 }
}
