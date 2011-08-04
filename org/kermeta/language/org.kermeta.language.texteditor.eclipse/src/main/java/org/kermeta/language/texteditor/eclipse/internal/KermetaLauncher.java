package org.kermeta.language.texteditor.eclipse.internal;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.kermeta.language.builder.eclipse.KermetaBuilder;

public class KermetaLauncher implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		//configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PROJECT,"");
		//configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_KP_FILE,"");
		//configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_MAIN_CLASS,"");
		//configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_MAIN_OPERATION,"");
				
		
		String theParams = configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PARAMETERS,"");
		String[] separatedParams = theParams.split(" ");
		ArrayList<String> transmetedParams = new ArrayList<String>();
		for (String aParam : separatedParams) {
			transmetedParams.add(aParam);
		}
		
		KermetaBuilder.getDefault().runFromKP(configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_KP_FILE,""), transmetedParams);
	}

}
