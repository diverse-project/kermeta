

/*$Id: NewKermetaProjectWizard.java,v 1.4 2008-06-09 10:02:23 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kp.wizard.eclipse.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;



public class KermetaProjectNewWizard extends Wizard implements INewWizard {

	KermetaProjectNewWizardPage page = new KermetaProjectNewWizardPage();
	
	public KermetaProjectNewWizard() {
		addPage( page );
	}

	public KermetaProjectNewWizardPage getPage() {
		return page;
	}
	
	public void addKermetaNatureToProject(IProject project) {
		IProjectDescription description;
		try {
			description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = org.kermeta.language.texteditor.eclipse.nature.Activator.NATURE_ID;
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public boolean performFinish() {
		try {
			 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(page.getProjectName());
			 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				 public void run(IProgressMonitor monitor) throws CoreException {
					 project.create(monitor);
					 project.open(monitor);
					 //NatureHelper.addNatureToProject(project, KermetaNature.ID);
					 addKermetaNatureToProject(project);
					 //ProjectBuilderHelper.addBuilderToProject(project, KpmProjectBuilder.ID);
					  
						 createFolder(project, "src/main/kmt", monitor);
						 createDefaultKmt(project, "src/main/kmt/Main.kmt", monitor);
						 createDefaultKp(project, project.getName()+".kp", monitor);
//						 createFolder(project, page.getModelFolder(), monitor);
//						 createFolder(project, page.getMetamodelFolder(), monitor);
				 	
				 }
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
		} catch (CoreException exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Creates folder hierarchically from a path relative to a project.
	 * @param project
	 * @param path
	 * @param monitor
	 * @throws CoreException
	 */
	private void createFolder(IProject project, String path, IProgressMonitor monitor) throws CoreException {
		String[] strings = path.split("/");
		IContainer currentContainer = project;
		for ( String s : strings ) {
			IFolder folder = currentContainer.getFolder( new Path(s) );
			folder.create(true, true, monitor);
			currentContainer = folder;
		}
	}
	
	private void createDefaultKp(IProject project,String path,IProgressMonitor monitor) throws CoreException{
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents =
				"KermetaProject :\""+project.getName()+"\"\n"+ 
					"version :  \"0.0.1\"\n"+
					"group :\"group\"\n" +
					"{\n" +
					"source = \"${project.baseUri}/src/main/kmt/Main.kmt\"\n"+  
					"dependency \"language.model\" URL=\"mvn:org.kermeta.language/language.library.core/2.0.1-SNAPSHOT\""+
					"}";
		try {
			InputStream stream =  new ByteArrayInputStream(contents.getBytes());;
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
	}
	
	
	
	private void createDefaultKmt(IProject project,String path,IProgressMonitor monitor) throws CoreException{
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents =
				"using kermeta::standard\n\n"+
				 "package "+"mainpackage"+"{\n"+
		        "\tclass "+"MainClass"+
		        "\n\t{\n"+
		        "\t\toperation "+"mainOperation"+"() : Void is do \n"+
		        "\t\t\t// TODO: implement '"+"mainOperation"+ "' operation\n"+
		        "\t\tend"+
		        "\n\t}"+
		        "\n}";
		try {
			InputStream stream =  new ByteArrayInputStream(contents.getBytes());;
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
	}
	
}
