/*$Id: RunLaunchShortcut.java,v 1.3 2008-04-30 13:58:49 ftanguy Exp $
* Project : org.kermeta.runner.ui
* File : 	RunLaunchShortcut.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.kp.launcher.eclipse.internal;



public class RunKLaunchShortcut extends KLaunchShortcut {
	public static String CONFIGURATIONTYPE_ID = "org.kermeta.kp.launcher.eclipse.internal.KermetaLauncherID";
	
	public RunKLaunchShortcut() {
		super( CONFIGURATIONTYPE_ID );
	}
	
}
