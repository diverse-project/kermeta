/*$Id: LoaderJob.java,v 1.1 2008-04-09 07:28:36 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	LoaderJob.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.runtime.loader.emf;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * Class used to run the loading process of EMF2Runtime into a job
 * this job can be monitored and interruptibl by the user
 */
public class LoaderJob extends Job {

	private RuntimeObject resourceRO;
	private EMFRuntimeUnit runtimeUnit;
	
	public LoaderJob(String name, RuntimeObject resRO, EMFRuntimeUnit ru) {
		super(name);
		resourceRO =resRO;
		runtimeUnit=ru;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		runtimeUnit.monitoredLoad(resourceRO, monitor);
        return new Status(IStatus.OK, "fr.irisa.triskell.kermeta.interpreter", "model loaded");
	}

}
