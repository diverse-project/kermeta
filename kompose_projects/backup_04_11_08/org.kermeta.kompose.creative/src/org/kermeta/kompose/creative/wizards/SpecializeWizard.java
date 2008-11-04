package org.kermeta.kompose.creative.wizards;




import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.kermeta.kompose.creative.generator.template.FilesGenerator;


public class SpecializeWizard extends Wizard implements INewWizard {

	private ISelection selection;
	
	private SpecializeWizardPage page;
	
	private SpecializerIntermediateDataContainer data;
	
	public SpecializeWizard(){
		super();
		setNeedsProgressMonitor(true);
	}
	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		this.page=new SpecializeWizardPage(this.selection,this.data);
		super.addPage(page);
	}
	@Override
	public boolean performFinish() {
		try {
			SpecializationSupport support=new SpecializationSupport();
			FilesGenerator generator=new FilesGenerator(data);
			IProject project=support.prepare(data);
			generator.generate();
			project.refreshLocal(IFile.DEPTH_INFINITE, new NullProgressMonitor());
			

		} catch (CoreException exception) {
			exception.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}	
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		this.selection = selection;
		this.data=new SpecializerIntermediateDataContainer();
	}

}
