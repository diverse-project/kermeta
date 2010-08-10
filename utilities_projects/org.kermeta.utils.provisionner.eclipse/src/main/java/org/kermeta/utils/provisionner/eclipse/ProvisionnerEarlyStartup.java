/*$Id: $
* Project : org.kermeta.utils.provisionner.eclipse
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.provisionner.eclipse;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IStartup;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

public class ProvisionnerEarlyStartup implements IStartup{

	@Override
	public void earlyStartup() {
		Activator.getDefault();
		Bundle paxURLbundle = Platform.getBundle("org.ops4j.pax.url.mvn");
		try {
			paxURLbundle.start();
		} catch (BundleException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, 0, "failed to start org.ops4j.pax.url.mvn. Maven URI won't be available", e));
		}
	}

}
