package org.kermeta.kp.launcher.eclipse.internal;

public class KermetaLauncherConfiguration {

	private KermetaLauncherConfiguration instance = null;
	
	public KermetaLauncherConfiguration getDefault(){
		if (instance == null) {
			instance = new KermetaLauncherConfiguration();
		}
		return instance;
	}
	
	private KermetaLauncherConfiguration(){
		
	}
	
	public static final String KM_LAUNCH_PARAMETERS = "KM_LAUNCH_PARAMETERS";
	public static final String KM_LAUNCH_KP_FILE = "KM_LAUNCH_KP_FILE";
	public static final String KM_LAUNCH_MAIN_CLASS = "KM_LAUNCH_MAIN_CLASS";
	public static final String KM_LAUNCH_MAIN_OPERATION = "KM_LAUNCH_MAIN_OPERATION";
	public static final String KM_LAUNCH_PROJECT = "KM_LAUNCH_PROJECT";
	
	
	
	
	
}
