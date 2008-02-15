/* $Id: ConstraintRunTarget.java,v 1.7 2008-02-15 14:35:44 dvojtise Exp $
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
	     initConsole(this);
		 kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", true, console, this);
		 kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute, getCurrentProjectOutputPath(), getCurrentProjectRequiredEntries());
		 setKermetaInterpreter( ((KermetaRunProcess) kermeta_process).getInterpreter() ); 
		 kermeta_process.start();
	 }
}
