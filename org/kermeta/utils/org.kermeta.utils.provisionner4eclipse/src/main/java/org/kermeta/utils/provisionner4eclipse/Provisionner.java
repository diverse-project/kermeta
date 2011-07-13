/*$Id$
* Project : org.kermeta.utils.provisionner.eclipse
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 aout 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.provisionner4eclipse;

import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.kermeta.utils.provisionner4eclipse.preferences.PreferenceConstants;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class Provisionner {
	public void provisionFromPreferences(){
		String bundleList = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_BUNDLE_URI_LIST);
		String[] bundleRawURIs = bundleList.split("\n");
		ArrayList<IStatus> statusChildren = new ArrayList<IStatus>();
		boolean hasStartError = false;
		for (int i = 0; i < bundleRawURIs.length; i++) {
			String bundleURI = bundleRawURIs[i].trim();
			if(!bundleURI.startsWith("#") && !bundleURI.isEmpty()){
				
				try{
					BundleContext context = Activator.getDefault().getBundle().getBundleContext();
					Bundle bundle = context.installBundle(bundleURI);
					try{
						bundle.start();
						statusChildren.add(new Status(IStatus.INFO, Activator.PLUGIN_ID, 0, bundleURI + " installed and started ",null));
					}
					catch (Exception e) {
						statusChildren.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, "failed to start " + bundleURI, e));
						hasStartError = true;
					}
				}
				
				catch (Exception e) {
					if(e.getClass().getName().equals("org.eclipse.osgi.framework.internal.core.Framework$DuplicateBundleException")){
						statusChildren.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, 0, "ingored installation of already installed bundle " + bundleURI, e));
					}
					else{
						statusChildren.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, "failed to install " + bundleURI, e));
					}
					hasStartError = true;
				}
				
			}
		}
		
		String message= hasStartError? "One or more bundle failed to start or install":"All bundles have successfully started";
		MultiStatus mstatus = new MultiStatus(Activator.PLUGIN_ID, 0, message, null);
		for (IStatus iStatus : statusChildren) {
			mstatus.add(iStatus);
		}
		Activator.getDefault().getLog().log(mstatus);						
		
	}
}
