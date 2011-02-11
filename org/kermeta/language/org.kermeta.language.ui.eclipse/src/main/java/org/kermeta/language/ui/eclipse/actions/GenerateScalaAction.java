/* $Id:$ 
 * Creation : 2 févr. 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.ui.eclipse.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.ui.eclipse.art2.impl.Art2ComponentKermetaUI4Eclipse;

public class GenerateScalaAction implements IObjectActionDelegate{
	
	private ISelection selection;
	
	public GenerateScalaAction() {
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
	}

	@Override
	public void run(IAction arg0) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IFile file = null;
				
				if (element instanceof IFile) {
					file = (IFile) element;
				} else if (element instanceof IAdaptable) {
					file = (IFile) ((IAdaptable) element).getAdapter(IFile.class);
				}
				if (file != null) {
					
					URI uri = URI.createFileURI(file.getLocation().toString());
					file.getParent().getLocation().toString();
					Job j = new CompilerJob("Generate scala code", 
							uri.toString(),
							file.getParent().getLocation().toString());
					j.schedule();

					//sendGenerateExecutableKmEvent(uri.toString());
				}
				else {
					Art2ComponentKermetaUI4Eclipse.getDefault().getLogger().error("Cannot generate scala code from input",null);
					
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = selection;
	}
	
	class CompilerJob extends Job {
		String inputUnit;
		String outputFolder;
		
		public CompilerJob(String name, String inputUnit, String outputFolder) {
			super(name);
			this.inputUnit = inputUnit;
			this.outputFolder = outputFolder;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("Generating scala code for " + inputUnit, 3);
			Art2ComponentKermetaUI4Eclipse.getDefault().getLogger().debug("Loading " +inputUnit);
			ModelingUnit mu = Art2ComponentKermetaUI4Eclipse.getDefault().getKmLoaderPort().load(inputUnit);
			monitor.worked(1);
			Art2ComponentKermetaUI4Eclipse.getDefault().getLogger().debug("Generating scala code for " +inputUnit);
			Art2ComponentKermetaUI4Eclipse.getDefault().getKm2ScalaCompilerPort().compile(mu, outputFolder);
			Art2ComponentKermetaUI4Eclipse.getDefault().getLogger().debug("Code generated in " + outputFolder);
			monitor.done();
			return null;
		}
		
	}
}
