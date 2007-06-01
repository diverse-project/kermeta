/* $Id: ConstraintRunTarget.java,v 1.5 2007-06-01 11:33:22 dvojtise Exp $
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
		 
		 
		 kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute, getCurrentProjectOutputPath());
		 kermeta_process.start();
	 }
}
