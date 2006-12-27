/* $Id: KermetaNewFileWizard.java,v 1.10 2006-12-27 14:38:41 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewFileWizard.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2005
 * Authors: zdrey
 * Notes :
 * 	This file was primarily generated by Eclipse plug-in helper
 */
package fr.irisa.triskell.kermeta.runner.wizards;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.core.runtime.*;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.ui.*;
//import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.dialogs.DialogUtil;
//import org.eclipse.ui.internal.dialogs.NewWizard;
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

public class KermetaNewFileWizard extends  Wizard implements INewWizard {
    // TODO : move it in preference constants //
    public final static String STD_TAB = "\t";

    public final static String STD_NL = "\r\n";
    
	private KermetaNewFileWizardPage page;
	private IStructuredSelection selection;

    private IWorkbench workbench;

    private String packageTextString;

    private String classTextString;

    private String operationTextString;

	/**
	 * Constructor for KermetaNewFileWizard.
	 */
	public KermetaNewFileWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new KermetaNewFileWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 * Old version :
	 * <code>
	 * 		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
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
	 * 
	 * </code>
	 * 
	 */
	public boolean performFinish() {
	    //final String containerName = page.getContainerName();
	    //final String containerName = page.getContainerText();
	    final IPath containerPath = page.containerGroup.getContainerFullPath();
	    final String fileName = page.getFilename();
        packageTextString = page.getPackageTextString();
        classTextString = page.getMainClassTextString();
		operationTextString = page.getMainOperationTextString();
		// Put the finish action in a "runnable"
	    
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
	    
	    // Run the "finish" performer
	    try {
	        getContainer().run(true, false, op);
	    } catch (InterruptedException e) {
	        return false;
	    } catch (InvocationTargetException e) {
	        e.printStackTrace();
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
	private void doFinish( IPath containerPath, String fileName, IProgressMonitor monitor) throws CoreException {
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
		try
		{
			InputStream stream = openContentStream();
			if (!file.exists()) // FIXME : test does not seem efficient
			{
				file.create(stream, false, monitor);
			}
			stream.close();
		}
		catch (IOException e)
		{
		    System.out.println("Warning : "+e.getMessage());
		    //e.printStackTrace();
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
			
	//			try {
				    // Open in KermetaPerspective
				    //_openPage(page);
	//			    if (page!=null)
	//			    {
	//			        IEditorPart part = IDE.openEditor(page, file, true);
	//			    }
	//			} catch (PartInitException e) {
	//			    System.err.println("Part init exception :"+e+"\n------------\n");
	//			    e.printStackTrace();
	//			}
	//		}
		});
//		  Open editor on new file.
		
		
		
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
		
	    String template_string = 
	    	"/* $Id: KermetaNewFileWizard.java,v 1.10 2006-12-27 14:38:41 ftanguy Exp $\n"+ 
	    	" * Creation date: " + DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(d)+ "\n"+
	    	" * License:\n"+
	    	" * Copyright:\n"+
	    	" * Authors:\n"+
	    	" */\n"+
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
	    
		String contents = createTemplate();
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "fr.irisa.triskell.kermeta.runner", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	
	public IWorkbench getWorkbench()
	{
	    return workbench;
	}
}

