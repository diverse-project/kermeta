/* $Id: DestFileWizardPage.java,v 1.14 2008-05-28 15:34:57 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewFileWizardPage.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2005
 * Authors: 
 * 			zdrey
 * 			dvojtise
 * Notes :
 * 	This file was primarily copied from WizardNewFileCreationPage
 * 	this is because we need to allow to overwrite existing file 
 * 	and eventually add new controls in the page 
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ContainerGenerator;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.ide.dialogs.CreateLinkedResourceGroup;
import org.eclipse.ui.internal.ide.misc.ResourceAndContainerGroup;

import fr.irisa.triskell.kermeta.KermetaMessages;

/**
 * Standard main page for a wizard that point to a destination file resource.
 * <p>
 * This page may be used by clients as-is; it may be also be subclassed to suit.
 * </p>
 * 
 */
public class DestFileWizardPage extends WizardPage implements Listener {
	protected static final int SIZING_CONTAINER_GROUP_HEIGHT = 250;

	// the current resource selection
	protected IStructuredSelection currentSelection;

	// cache of newly-created file
	protected IFile newFile;

	protected IPath linkTargetPath;

	// widgets
	protected ResourceAndContainerGroup resourceGroup;

	protected Button advancedButton;

	protected CreateLinkedResourceGroup linkedResourceGroup;

	public Composite linkedResourceParent;

	protected Composite linkedResourceComposite;

	protected Group fileExistsGroup;
	protected Group errorBehaviorGroup;
	protected Group deployGroup;

	protected Button forbidFileExistRadio;

	protected Button overwriteIfFileExistRadio;
	
	protected Button forceWriteEvenIfErrorCheck;
	protected Button deployCheck;

	// initial value stores
	protected String initialFileName;

	protected IPath initialContainerFullPath;

	/**
	 * Height of the "advanced" linked resource group. Set when the advanced
	 * group is first made visible.
	 */
	protected int linkedResourceGroupHeight = -1;

	/**
	 * First time the advanced group is validated.
	 */
	private boolean firstLinkCheck = true;

	protected Composite topLevel;

	/**
	 * selects a destination file wizard page. If the initial resource selection
	 * contains exactly one container resource then it will be used as the
	 * default container resource.
	 * 
	 * @param pageName
	 *            the name of the page
	 * @param selection
	 *            the current resource selection
	 */
	public DestFileWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setPageComplete(false);
		this.currentSelection = selection;
	}

	// FIXME : Temporary static strings, since we used to use
	// IDEWorkbenchMessages.getString which is not available anymore.
	public static final String NEW_FILE_MSG = KermetaMessages
			.getString("Kermeta.NEWFILE");

	private static final String FILE_CREATION_ERROR = KermetaMessages
			.getString("Kermeta.CREATION_PB");

	private static final String HIDE_ADVANCED_MSG = KermetaMessages
			.getString("Kermeta.HIDE_ADVANCED");

	private static final String SHOW_ADVANCED_MSG = KermetaMessages
			.getString("Kermeta.SHOW_ADVANCED");

	private static final String INTERNAL_ERROR_MSG = KermetaMessages
			.getString("Kermeta.INT_ERR");

	private static final String INTERNAL_ERROR_TITLE = KermetaMessages
			.getString("Kermeta.CREATION_PB");

	protected static final String FILE_CREATION_PROGRESS_MSG = KermetaMessages
			.getString("Kermeta.NEWFILE_PROGRESS");

	/**
	 * Creates the widget for advanced options.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	protected void createAdvancedControls(Composite parent) {
		Preferences preferences = ResourcesPlugin.getPlugin()
				.getPluginPreferences();

		if (preferences.getBoolean(ResourcesPlugin.PREF_DISABLE_LINKING) == false) {
			linkedResourceParent = new Composite(parent, SWT.NONE);
			linkedResourceParent.setFont(parent.getFont());
			linkedResourceParent.setLayoutData(new GridData(
					GridData.FILL_HORIZONTAL));
			GridLayout layout = new GridLayout();
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			linkedResourceParent.setLayout(layout);

			advancedButton = new Button(linkedResourceParent, SWT.PUSH);
			advancedButton.setFont(linkedResourceParent.getFont());
			advancedButton.setText(SHOW_ADVANCED_MSG);
			GridData data = setButtonLayoutData(advancedButton);
			data.horizontalAlignment = GridData.BEGINNING;
			advancedButton.setLayoutData(data);
			advancedButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					handleAdvancedButtonSelect();
				}
			});
		}
		
		linkedResourceGroup = new CreateLinkedResourceGroup(IResource.FILE,
				new Listener() {
					public void handleEvent(Event e) {
						setPageComplete(validatePage());
						firstLinkCheck = false;
					}
				} , null );
	}

	/**
	 * (non-Javadoc) Method declared on IDialogPage.
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		// top level group
		topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		// WorkbenchHelp.setHelp(topLevel,
		// IHelpContextIds.NEW_FILE_WIZARD_PAGE);

		createPreControls(topLevel);

		// resource and container group
		resourceGroup = new ResourceAndContainerGroup(topLevel, this,
				getNewFileLabel(), NEW_FILE_MSG, false,
				SIZING_CONTAINER_GROUP_HEIGHT); //$NON-NLS-1$
		resourceGroup.setAllowExistingResources(false);
		initialPopulateContainerNameField();
		createFileExistsBehaviorControls(topLevel);
		createErrorBehaviorControls(topLevel);
		createDeployControls(topLevel);
		createAdvancedControls(topLevel);
		if (initialFileName != null)
			resourceGroup.setResource(initialFileName);

		// Show description on opening
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		validatePage();

	}

	/**
	 * creates controls that fit before the main controls
	 * 
	 * @param parent
	 */
	protected void createPreControls(Composite parent) {
		// nothing special here, placeholder for children classes
	}

	/**
	 * @param parent
	 */
	protected void createFileExistsBehaviorControls(Composite parent) {
		Font font = parent.getFont();
		// Advanced group
		fileExistsGroup = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		fileExistsGroup.setLayout(layout);
		fileExistsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		fileExistsGroup.setFont(font);
		fileExistsGroup.setText("Behavior if file exists:");

		Label label = new Label(fileExistsGroup, SWT.NULL);
		label.setText("Do not owerwrite existing file ");
		forbidFileExistRadio = new Button(fileExistsGroup, SWT.RADIO);
		forbidFileExistRadio.setSelection(true);
		forbidFileExistRadio.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleFileExistsButtonSelect();
			}
		});
		label = new Label(fileExistsGroup, SWT.NULL);
		label.setText("Overwrite existing file ");
		overwriteIfFileExistRadio = new Button(fileExistsGroup, SWT.RADIO);
		overwriteIfFileExistRadio.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleFileExistsButtonSelect();
			}
		});

	}

	/**
	 * @param parent
	 */
	protected void createErrorBehaviorControls(Composite parent) {
		Font font = parent.getFont();
		// Advanced group
		errorBehaviorGroup = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		errorBehaviorGroup.setLayout(layout);
		errorBehaviorGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		errorBehaviorGroup.setFont(font);
		errorBehaviorGroup.setText("Behavior if there are errors:");

		Label label = new Label(errorBehaviorGroup, SWT.NULL);
		label.setText("Write file even if there are errors ");
		forceWriteEvenIfErrorCheck = new Button(errorBehaviorGroup, SWT.CHECK);
		forceWriteEvenIfErrorCheck.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Event trucEvent = new Event();
				handleEvent(trucEvent);
			}
		});
	}
	
	/**
	 * @param parent
	 */
	protected void createDeployControls(Composite parent) {
		Font font = parent.getFont();
		// Advanced group
		deployGroup = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		deployGroup.setLayout(layout);
		deployGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		deployGroup.setFont(font);
		deployGroup.setText("Deployment:");

		Label label = new Label(deployGroup, SWT.NULL);
		label.setText("Is executable ");
		deployCheck = new Button(deployGroup, SWT.CHECK);
		deployCheck.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Event trucEvent = new Event();
				handleEvent(trucEvent);
			}
		});
	}
	
	/**
	 * Creates a file resource given the file handle and contents.
	 * 
	 * @param fileHandle
	 *            the file handle to create a file resource with
	 * @param contents
	 *            the initial contents of the new file resource, or
	 *            <code>null</code> if none (equivalent to an empty stream)
	 * @param monitor
	 *            the progress monitor to show visual progress with
	 * @exception CoreException
	 *                if the operation fails
	 * @exception OperationCanceledException
	 *                if the operation is canceled
	 */
	protected void createFile(IFile fileHandle, InputStream contents,
			IProgressMonitor monitor) throws CoreException {
		if (contents == null)
			contents = new ByteArrayInputStream(new byte[0]);

		try {
			// Create a new file resource in the workspace
			if (linkTargetPath != null)
				fileHandle.createLink(linkTargetPath,
						IResource.ALLOW_MISSING_LOCAL, monitor);
			else
				fileHandle.create(contents, false, monitor);
		} catch (CoreException e) {
			// If the file already existed locally, just refresh to get contents
			if (e.getStatus().getCode() == IResourceStatus.PATH_OCCUPIED)
				fileHandle.refreshLocal(IResource.DEPTH_ZERO, null);
			else
				throw e;
		}

		if (monitor.isCanceled())
			throw new OperationCanceledException();
	}

	/**
	 * Creates a file resource handle for the file with the given workspace
	 * path. This method does not create the file resource; this is the
	 * responsibility of <code>createFile</code>.
	 * 
	 * @param filePath
	 *            the path of the file resource to create a handle for
	 * @return the new file resource handle
	 * @see #createFile
	 */
	protected IFile createFileHandle(IPath filePath) {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(
				filePath);
	}

	/**
	 * Creates the link target path if a link target has been specified.
	 */
	protected void createLinkTarget() {
		if (linkedResourceGroup.getLinkTargetURI() != null) {
			linkTargetPath = new Path(linkedResourceGroup.getLinkTargetURI().getPath());
		} else {
			linkTargetPath = null;
		}
	}

	/**
	 * Creates a new file resource in the selected container and with the
	 * selected name. Creates any missing resource containers along the path;
	 * does nothing if the container resources already exist.
	 * <p>
	 * In normal usage, this method is invoked after the user has pressed Finish
	 * on the wizard; the enablement of the Finish button implies that all
	 * controls on on this page currently contain valid values.
	 * </p>
	 * <p>
	 * Note that this page caches the new file once it has been successfully
	 * created; subsequent invocations of this method will answer the same file
	 * resource without attempting to create it again.
	 * </p>
	 * <p>
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * </p>
	 * 
	 * @return the created file resource, or <code>null</code> if the file was
	 *         not created
	 */
	public IFile createNewFile() {
		if (newFile != null)
			return newFile;

		// create the new file and cache it if successful

		final IPath containerPath = resourceGroup.getContainerFullPath();
		IPath newFilePath = containerPath.append(resourceGroup.getResource());
		final IFile newFileHandle = createFileHandle(newFilePath);
		final InputStream initialContents = getInitialContents();

		createLinkTarget();
		WorkspaceModifyOperation op = new WorkspaceModifyOperation(null) {
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				try {
					monitor.beginTask(FILE_CREATION_PROGRESS_MSG, 2000); //$NON-NLS-1$
					ContainerGenerator generator = new ContainerGenerator(
							containerPath);
					generator.generateContainer(new SubProgressMonitor(monitor,
							1000));
					createFile(newFileHandle, initialContents,
							new SubProgressMonitor(monitor, 1000));
				} finally {
					monitor.done();
				}
			}
		};

		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return null;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(), // Was
																	// Utilities.getFocusShell()
						FILE_CREATION_ERROR, //$NON-NLS-1$
						null, // no special message
						((CoreException) e.getTargetException()).getStatus());
			} else {
				// CoreExceptions are handled above, but unexpected runtime
				// exceptions and errors may still occur.
				IDEWorkbenchPlugin.log(MessageFormat.format(
								"Exception in {0}.getNewFile(): {1}",
								new Object[] { getClass().getName(),
										e.getTargetException() }));
				MessageDialog.openError(getContainer().getShell(),
						INTERNAL_ERROR_TITLE, INTERNAL_ERROR_MSG + ": "
								+ e.getTargetException().getMessage());
			}
			return null;
		}

		newFile = newFileHandle;

		return newFile;
	}

	/**
	 * Returns the current full path of the containing resource as entered or
	 * selected by the user, or its anticipated initial value.
	 * 
	 * @return the container's full path, anticipated initial value, or
	 *         <code>null</code> if no path is known
	 */
	public IPath getContainerFullPath() {
		return resourceGroup.getContainerFullPath();
	}

	/**
	 * Returns the current file name as entered by the user, or its anticipated
	 * initial value.
	 * 
	 * @return the file name, its anticipated initial value, or
	 *         <code>null</code> if no file name is known
	 */
	public String getFileName() {
		if (resourceGroup == null)
			return initialFileName;

		return resourceGroup.getResource();
	}

	/**
	 * Returns a stream containing the initial contents to be given to new file
	 * resource instances. <b>Subclasses</b> may wish to override. This default
	 * implementation provides no initial contents.
	 * 
	 * @return initial contents to be given to new file resource instances
	 */
	protected InputStream getInitialContents() {
		return null;
	}

	/**
	 * Returns the label to display in the file name specification visual
	 * component group.
	 * <p>
	 * Subclasses may reimplement.
	 * </p>
	 * 
	 * @return the label to display in the file name specification visual
	 *         component group
	 */
	protected String getNewFileLabel() {
		return "Fi&le name"; //$NON-NLS-1$
	}

	/**
	 * Shows/hides the advanced option widgets.
	 */
	protected void handleAdvancedButtonSelect() {
		Shell shell = getShell();
		Point shellSize = shell.getSize();
		Composite composite = (Composite) getControl();

		if (linkedResourceComposite != null) {
			linkedResourceComposite.dispose();
			linkedResourceComposite = null;
			composite.layout();
			shell.setSize(shellSize.x, shellSize.y - linkedResourceGroupHeight);
			advancedButton.setText(SHOW_ADVANCED_MSG); //$NON-NLS-1$
		} else {
			linkedResourceComposite = linkedResourceGroup
					.createContents(linkedResourceParent);
			if (linkedResourceGroupHeight == -1) {
				Point groupSize = linkedResourceComposite.computeSize(
						SWT.DEFAULT, SWT.DEFAULT, true);
				linkedResourceGroupHeight = groupSize.y;
			}
			shell.setSize(shellSize.x, shellSize.y + linkedResourceGroupHeight);
			composite.layout();
			advancedButton.setText(HIDE_ADVANCED_MSG); //$NON-NLS-1$
		}
	}

	/**
	 * Behavior when selecting FileExistButton. It enables and disables file
	 * exist error
	 */
	protected void handleFileExistsButtonSelect() {
		resourceGroup.setAllowExistingResources(!forbidFileExistRadio
				.getSelection());
		Event trucEvent = new Event();

		resourceGroup.handleEvent(trucEvent);
		setPageComplete(validatePage());
	}

	/**
	 * The <code>DestFileWizardPage</code> implementation of this
	 * <code>Listener</code> method handles all events and enablements for
	 * controls on this page. Subclasses may extend.
	 */
	public void handleEvent(Event event) {
		setPageComplete(validatePage());
	}

	/**
	 * Sets the initial contents of the container name entry field, based upon
	 * either a previously-specified initial value or the ability to determine
	 * such a value.
	 */
	protected void initialPopulateContainerNameField() {
		if (initialContainerFullPath != null)
			resourceGroup.setContainerFullPath(initialContainerFullPath);
		else {
			Iterator enumeration = currentSelection.iterator();
			if (enumeration.hasNext()) {
				Object object = enumeration.next();
				IResource selectedResource = null;
				if (object instanceof IResource) {
					selectedResource = (IResource) object;
				} else if (object instanceof IAdaptable) {
					selectedResource = (IResource) ((IAdaptable) object)
							.getAdapter(IResource.class);
				}
				if (selectedResource != null) {
					if (selectedResource.getType() == IResource.FILE)
						selectedResource = selectedResource.getParent();
					if (selectedResource.isAccessible())
						resourceGroup.setContainerFullPath(selectedResource
								.getFullPath());
				}
			}
		}
	}

	/**
	 * Sets the value of this page's container name field, or stores it for
	 * future use if this page's controls do not exist yet.
	 * 
	 * @param path
	 *            the full path to the container
	 */
	public void setContainerFullPath(IPath path) {
		if (resourceGroup == null)
			initialContainerFullPath = path;
		else
			resourceGroup.setContainerFullPath(path);
	}

	/**
	 * Sets the value of this page's file name field, or stores it for future
	 * use if this page's controls do not exist yet.
	 * 
	 * @param value
	 *            new file name
	 */
	public void setFileName(String value) {
		if (resourceGroup == null)
			initialFileName = value;
		else
			resourceGroup.setResource(value);
	}

	/**
	 * Checks whether the linked resource target is valid. Sets the error
	 * message accordingly and returns the status.
	 * 
	 * @return IStatus validation result from the CreateLinkedResourceGroup
	 */
	protected IStatus validateLinkedResource() {
		IPath containerPath = resourceGroup.getContainerFullPath();
		IPath newFilePath = containerPath.append(resourceGroup.getResource());
		IFile newFileHandle = createFileHandle(newFilePath);
		IStatus status = linkedResourceGroup
				.validateLinkLocation(newFileHandle);

		if (status.getSeverity() == IStatus.ERROR) {
			if (firstLinkCheck)
				setMessage(status.getMessage());
			else
				setErrorMessage(status.getMessage());
		} else if (status.getSeverity() == IStatus.WARNING) {
			setMessage(status.getMessage(), WARNING);
			setErrorMessage(null);
		}
		return status;
	}

	/**
	 * Returns whether this page's controls currently all contain valid values.
	 * 
	 * @return <code>true</code> if all controls are valid, and
	 *         <code>false</code> if at least one is invalid
	 */
	protected boolean validatePage() {
		boolean valid = true;

		if (!resourceGroup.areAllValuesValid()) {
			// if blank name then fail silently
			if (resourceGroup.getProblemType() == ResourceAndContainerGroup.PROBLEM_RESOURCE_EMPTY
					|| resourceGroup.getProblemType() == ResourceAndContainerGroup.PROBLEM_CONTAINER_EMPTY) {
				setMessage(resourceGroup.getProblemMessage());
				setErrorMessage(null);
			} else
				setErrorMessage(resourceGroup.getProblemMessage());
			valid = false;
		}

		IStatus linkedResourceStatus = null;
		if (valid) {
			linkedResourceStatus = validateLinkedResource();
			if (linkedResourceStatus.getSeverity() == IStatus.ERROR)
				valid = false;
		}
		// validateLinkedResource sets messages itself
		if (valid
				&& (linkedResourceStatus == null || linkedResourceStatus.isOK())) {
			setMessage(null);
			setErrorMessage(null);
		}
		return valid;
	}

	/*
	 * @see DialogPage.setVisible(boolean)
	 */
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible)
			resourceGroup.setFocus();
	}

}