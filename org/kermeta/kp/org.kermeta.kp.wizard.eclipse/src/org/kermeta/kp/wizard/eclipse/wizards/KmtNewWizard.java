package org.kermeta.kp.wizard.eclipse.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpFactory;
import org.kermeta.kp.Source;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.kp.wizard.eclipse.Activator;
import org.kermeta.kp.wizard.eclipse.preferences.PreferenceConstants;
import org.kermeta.language.builder.eclipse.KermetaBuilderHelper;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "kmt". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class KmtNewWizard extends Wizard implements INewWizard {
	private KmtNewWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for KmtNewWizard.
	 */
	public KmtNewWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new KmtNewWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		final String operationName = page.getOperationName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, operationName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		String operationName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName)); 
		try {
			//String packageName = containerName.replaceAll(Pattern.quote("\\"), "::");
			String packageName = resource.getProjectRelativePath().toString();
			if(packageName.equals("src/main/kmt")) packageName = "rootPackage";
			else{
				packageName = packageName.replaceFirst(Pattern.quote("src/main/kmt/"), "").replaceAll(Pattern.quote("/"), "::");
			}
			InputStream stream = openContentStream(fileName.replace(".kmt", ""), packageName, operationName);
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
			// update kp that should reference this new file
			IFile kpfile = KermetaBuilderHelper.findRootKPinProject(file.getProject());
			KpLoaderImpl ldr = new KpLoaderImpl(org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem());
			
			// Load KP file
			KermetaProject kp = ldr.loadKp(kpfile.getLocationURI().toString());
			Source newSource = KpFactory.eINSTANCE.createSource();
			newSource.setUrl("${project.baseUri}/"+file.getProjectRelativePath());
			kp.getSources().add(newSource);
			
			// save back to disk
			kp.eResource().save(null);
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream(String className, String packageName, String operationName) {
		String contents = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_NEW_KMT_TEMPLATE_STRING);
		
		// replace variables with values from the user
		contents = contents.replaceAll(Pattern.quote("${class.name}"), className);
		contents = contents.replaceAll(Pattern.quote("${package.name}"), packageName);
		contents = contents.replaceAll(Pattern.quote("${operation.name}"), operationName);
				
			//"This is the initial file contents for *.kmt file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.kermeta.kp.wizard.eclipse", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}