package org.kermeta.kp.wizard.eclipse.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import org.eclipse.jface.preference.IPreferenceStore;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.dialogs.DialogUtil;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

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
	
	public final static String STD_TAB = "\t";

	public final static String STD_NL = "\r\n";
	
	private KmtNewWizardPage page;
	private IStructuredSelection selection;
	
	private IWorkbench workbench;

    private String packageTextString;

    private String classTextString;

    private String operationTextString;

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
		//final String containerName = page.getContainerName();
		//final String fileName = page.getFileName();
		final IPath containerPath = page.containerGroup.getContainerFullPath();
	    final String fileName = page.getFileName();
        packageTextString = page.getPackageTextString();
        classTextString = page.getMainClassTextString();
		operationTextString = page.getMainOperationTextString();
		
		
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerPath, fileName, monitor);
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
		IPath containerPath,//String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(containerPath);//new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerPath + "\" does not exist.");
		}
		// File the file with the template text
		IContainer container = (IContainer) resource;
		
		// Put .kmt extension if it does not exist in fileName 
				if (!fileName.endsWith(".kmt"))
				{   fileName = fileName+".kmt";		}
		
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		// FIXME : If file exists it is not editable --
		// I must display the errors
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
			    //BasicNewResourceWizard.selectAndReveal(file, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
				IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
				
				try {
				    if (dw == null)
				    {
				        dw = getWorkbench().openWorkbenchWindow("kermetaPerspective",ResourcesPlugin.getWorkspace());
				    }
				    
				    BasicNewResourceWizard.selectAndReveal(file, dw);
					if (dw != null) {
						IWorkbenchPage page = dw.getActivePage();
						if (page != null) {
						    page.setEditorAreaVisible(true);
						    IEditorPart part = IDE.openEditor(page, file, true);
						    part.setFocus();
						}
						else { System.out.println("Error : no active page was found (RunnerPlugin)");}
					}
				} catch (PartInitException e) {
					DialogUtil.openError(
						dw.getShell(),
						"Error : Could not open the requested file", //$NON-NLS-1$
						e.getMessage(),
						e);
				}
				
				catch (WorkbenchException e)
				{
				    e.printStackTrace();
				}
			}
		});
	 
		
//		getShell().getDisplay().asyncExec(new Runnable() {
//			public void run() {
//				IWorkbenchPage page =
//					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//				try {
//					IDE.openEditor(page, file, true);
//				} catch (PartInitException e) {
//				}
//			}
//		});
		monitor.worked(1);
	}
	
	/***
	 * Create the template file according to the default
	 * root package name and main class name and main operation name (all
	 * may be optional).
	 * @return
	 */
	private String createTemplate()
	{
		Date d = new Date(System.currentTimeMillis());
		//IPreferenceStore store = KermetaUIPlugin.getDefault().getPreferenceStore();
		//String header = store.getString(PreferenceConstants.P_KMT_HEADER_TEMPLATESTRING);
		// replace variables in the header
		//header = header.replaceAll(EscapeChars.forRegex("${date}"), DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(d));
		//header = header.replaceAll(EscapeChars.forRegex("${user}"), System.getProperty("user.name"));
		
	    String template_string = 
	    	//header+
	        "@mainClass \""+packageTextString+"::"+classTextString+"\"\n"+ 
	        "@mainOperation \""+operationTextString+"\"\n\n\n"+
	        "package "+packageTextString+";\n\n\n"+
	        "require kermeta\n"+
	        "class "+classTextString+
	        "\n{\n"+
	        	STD_TAB+"operation "+operationTextString+"() : Void is do \n"
	        +	STD_TAB+STD_TAB+"// TODO: implement '"+operationTextString+ "' operation\n"
	        +   STD_TAB+"end"+
	        "\n}";
	    return template_string;
	}
	
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.kmt file that should be word-sorted in the Preview page of the multi-page editor";
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
	
	public IWorkbench getWorkbench()
	{
	    return workbench;
	}
	
}