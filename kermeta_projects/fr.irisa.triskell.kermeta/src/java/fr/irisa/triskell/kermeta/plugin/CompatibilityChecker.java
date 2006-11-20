/* $Id: CompatibilityChecker.java,v 1.1 2006-11-20 08:30:48 dvojtise Exp $
 * Project   : Kermeta 
 * File      : CompatibilityChecker.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 20 nov. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.plugin;

import org.eclipse.core.runtime.Status;

public class CompatibilityChecker {

	/**
	 * Run all the verifications supported by this checker 
	 * note: launched from the start method of the plugin => must not fail !
	 */	
	public void check(){
		try{
			checkJavaVersion();
		}
		catch(Exception e){
			//launched from the start method of the plugin => must not fail !
			e.printStackTrace(System.err);
		}
	}

	/** 
	 * Checks that the current version of java is >= 1.5 
	 * message goes to both log4j and the errorlog view
	 */
	private void checkJavaVersion() {
		String javaVersion =System.getProperty("java.version");
		String[] versionsNumbers = javaVersion.split("\\.");
		Integer major = new Integer(versionsNumbers[0]);
		Integer medium = new Integer(versionsNumbers[1]);
		if(!(major>=1 && medium >=5)){
			KermetaPlugin.getDefault().getLog().log(new Status(Status.ERROR, "fr.irisa.triskell.kermeta",
                    Status.OK, 
                    "Your java version ("+javaVersion+") doesn't match the minimum required (java 5)", 
                    null));
			KermetaPlugin.getLogger().error("Your java version ("+javaVersion+") doesn't match the minimum required (java 5)");
		}
	}
}
