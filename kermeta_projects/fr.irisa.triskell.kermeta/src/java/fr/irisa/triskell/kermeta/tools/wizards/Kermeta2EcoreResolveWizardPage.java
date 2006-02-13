/* $Id: Kermeta2EcoreResolveWizardPage.java,v 1.1 2006-02-13 17:22:11 zdrey Exp $
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

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.internal.ui.dialogs.TableTextCellEditor;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IListAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.ListDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.Separator;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringButtonDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.model.WorkbenchContentProvider;

import fr.irisa.triskell.kermeta.KermetaMessages;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.tools.wizards.dialogs.CustomContainerSelectionGroup;

/**
 * Standard main page for a wizard that point to a destination file resource.
 * <p>
 * This page may be used by clients as-is; it may be also be subclassed to suit.
 * </p>
 * 
 */
public class Kermeta2EcoreResolveWizardPage extends WizardPage implements Listener {
	// The attributes default values linked to the options displayed on the page
	public static final String DEFAULT_GEN_DIR = "build/ecore"; // "platform:/resource/project_name/" + DEFAULT_GEN_DIR
	// TODO for this purpose, need to store the generated file names
	public static final boolean OVERWRITE_GEN_DIR = true;

	// The strings displayed in the windo
	public static final String DEFAULT_GEN_DIR_MESSAGE = KermetaMessages.getString("Kermeta.USEDEFAULTGENDIR");
    public static final String GEN_ALL_ECORE_FILES = KermetaMessages.getString("Kermeta.GENALLECOREFILES");
	
	// the current resource selection
	protected	IStructuredSelection currentSelection;
	
	protected StringButtonDialogField containerDialogField;
	private Group ecoreFileListGroup;
	private ListDialogField requiredEcoreFileDialogField;
	
	// The main sub group that will contain the different widgets
	Composite composite;
	private CustomContainerSelectionGroup containerGroup;
	
	/**
	 * selects a destination file wizard page. If the initial resource selection 
	 * contains exactly one container resource then it will be used as the default
	 * container resource.
	 *
	 * @param pageName the name of the page
	 * @param selection the current resource selection
	 */
	public Kermeta2EcoreResolveWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setPageComplete(false);
		this.currentSelection = selection;
	}
		 
	// ------ UI --------
	
	/**
	 * @see WizardPage#createControl
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		composite= new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());
		
		int nColumns= 4;
		
		GridLayout layout= new GridLayout();
		layout.numColumns= nColumns;		
		composite.setLayout(layout);
				
		// Create the container dialog field ( the one where user choose an output directory for resource ecore dependencies)
		createContainerControls(composite, nColumns);	
		
		// Create an esthetic separator
		createSeparator(composite, nColumns);

		// Create the ecore list where user 
		createRequiredEcoreFileList(composite, nColumns);
		
		setControl(composite);
			
		Dialog.applyDialogFont(composite);
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IJavaHelpContextIds.NEW_CLASS_WIZARD_PAGE);	
	}
	
	
	/**
	 * Creates the necessary controls (label, text field and browse button) to edit
	 * the source folder location. The method expects that the parent composite
	 * uses a <code>GridLayout</code> as its layout manager and that the
	 * grid layout has at least 3 columns.
	 * 
	 * @param parent the parent composite
	 * @param nColumns the number of columns to span. This number must be
	 *  greater or equal three
	 */
	protected void createContainerControls(Composite parent, int nColumns) {
		// Create the field where user choosed for the output directory for ecore-generated files
		ContainerFieldAdapter adapter= new ContainerFieldAdapter();
		containerDialogField= new StringButtonDialogField(adapter);
		containerDialogField.setDialogFieldListener(adapter);
		containerDialogField.setLabelText(KermetaMessages.getString("Kermeta2Ecore.GENDIR")); 
		containerDialogField.setButtonLabel(KermetaMessages.getString("KermetaPerspective.BROWSE"));
		containerDialogField.doFillIntoGrid(parent, nColumns);
		LayoutUtil.setWidthHint(containerDialogField.getTextControl(null), 50);
	}

	/**
	 * Creates a separator line. Expects a <code>GridLayout</code> with at least 1 column.
	 * 
	 * @param composite the parent composite
	 * @param nColumns number of columns to span
	 */
	protected void createSeparator(Composite composite, int nColumns) {
		(new Separator(SWT.SEPARATOR | SWT.HORIZONTAL)).doFillIntoGrid(composite, nColumns, convertHeightInCharsToPixels(1));		
	}

	/** 
	 * Create the Add... and Remove buttons.
	 * (jdt-copy)
	 */
	protected String[] createAddAndRemoveButtons()
	{
		String[] addButtons= new String[] {
				KermetaMessages.getString("Kermeta2Ecore.ADDBUTTON"), 
				/* 1 */ null,
				KermetaMessages.getString("Kermeta2Ecore.REMOVEBUTTON")
			}; 
		return addButtons;
	}
	
	/** Create the space (table-like) where ecore files added to the ecore dependencies are specified */
	protected void createEcoreFileField()
	{
		
		EcoreFieldsAdapter adapter =new EcoreFieldsAdapter(); // don't know the usefulness yet 
		requiredEcoreFileDialogField = new ListDialogField(
				adapter, 
				createAddAndRemoveButtons(), 
				new LabelProvider()); // FIXME : a simple LabelProvider would be better
		requiredEcoreFileDialogField.setDialogFieldListener(adapter);
		requiredEcoreFileDialogField.setTableColumns(new ListDialogField.ColumnsDescription(1, false));
		requiredEcoreFileDialogField.setLabelText("");
		requiredEcoreFileDialogField.setRemoveButtonIndex(2);
	}
	/**
	 * 
	 * Creates the controls for the superclass name field. Expects a <code>GridLayout</code> with 
	 * at least 3 columns.
	 * Copied from jdt plugin sources and adapted.
	 * @param composite the parent composite
	 * @param nColumns number of columns to span
	 * 
	 */			
	protected void createRequiredEcoreFileList(Composite composite, int nColumns) {
		
		final String INTERFACE= "interface"; //$NON-NLS-1$
		// Create the field table where ecore file list will be put.
		createEcoreFileField();
		
		requiredEcoreFileDialogField.doFillIntoGrid(composite, nColumns);
		final TableViewer tableViewer= requiredEcoreFileDialogField.getTableViewer();
		tableViewer.setColumnProperties(new String[] {INTERFACE});
		
		TableTextCellEditor cellEditor= new TableTextCellEditor(tableViewer, 0) {
		    protected void doSetFocus() {
		        if (text != null) {
		            text.setFocus();
		            text.setSelection(text.getText().length());
		            checkSelection();
		            checkDeleteable();
		            checkSelectable();
		        }
		    }
		};
		
		tableViewer.setCellEditors(new CellEditor[] { cellEditor });
		tableViewer.setCellModifier(new ICellModifier() {
			public void modify(Object element, String property, Object value) {
				if (element instanceof Item)
					element = ((Item) element).getData();
				
				requiredEcoreFileDialogField.elementChanged(element);
			}
			public Object getValue(Object element, String property) {
				return element.toString();
			}
			public boolean canModify(Object element, String property) {
				return true;
			}
		});
		tableViewer.getTable().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				if (event.keyCode == SWT.F2 && event.stateMask == 0) {
					ISelection selection= tableViewer.getSelection();
					if (! (selection instanceof IStructuredSelection))
						return;
					IStructuredSelection structuredSelection= (IStructuredSelection) selection;
					tableViewer.editElement(structuredSelection.getFirstElement(), 0);
				} 
			}
		});
		GridData gd= (GridData)requiredEcoreFileDialogField.getListControl(null).getLayoutData();

		gd.grabExcessVerticalSpace= false;
		//gd.widthHint= GridData.FILL_HORIZONTAL;
	}

	
	
	/*
	 * @see WizardPage#becomesVisible
	 */
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
		//	setFocus();
		}
	}
	
	/**
	 * creates controls that fit before the main controls
	 * @param parent
	 */
	protected void createPreControls(Composite parent) {
		// nothing special here, placeholder for children classes
	}
	
	/**
	 * Create the group that contains the option "(Re-)generate all required ecore files"
	 * and the subwindow that contains required ecore files specified by the user
	 * @param parent
	 */
	protected void createGeneratedEcoreFilesControl(Composite parent) {
		Font font = parent.getFont();
        // Advanced group
        ecoreFileListGroup = new Group(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2,false);
        ecoreFileListGroup.setLayout(layout);
        ecoreFileListGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        ecoreFileListGroup.setFont(font);
        ecoreFileListGroup.setText("I want to reuse the following ecore files for the process generation:");         
        
        // ecoreFileListGroup : the gui group where to add ...
        // 1) a radio button " overwrite last generated ecore directory content"
		// " Generate all the ecore files required by the main one "
        Label label = new Label(ecoreFileListGroup, SWT.NULL);
		label.setText(KermetaMessages.getString("Kermeta2Ecore.GENALLECOREFILES"));

		// 2) give, as an information, the list of files  in the gen directory (given by the user in this page)?

		
		// 2) a window, in which user will add the files that he wants to be used
		// Only enabled if user did not deselect the preceding radio button 
		
	}

	/**
	 * Creates a file resource handle for the file with the given workspace path.
	 * This method does not create the file resource; this is the responsibility
	 * of <code>createFile</code>.
	 *
	 * @param filePath the path of the file resource to create a handle for
	 * @return the new file resource handle
	 * @see #createFile
	 */
	protected IFile createFileHandle(IPath filePath) {
		return IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(filePath);
	}
	
	

	/**
	 * Returns a stream containing the initial contents to be given to new file resource
	 * instances.  <b>Subclasses</b> may wish to override.  This default implementation
	 * provides no initial contents.
	 *
	 * @return initial contents to be given to new file resource instances
	 */
	protected InputStream getInitialContents() {
		return null;
	}

	/**
	 * The <code>DestFileWizardPage</code> implementation of this 
	 * <code>Listener</code> method handles all events and enablements for controls
	 * on this page. Subclasses may extend.
	 */
	public void handleEvent(Event event) {
		setPageComplete(validatePage());
	}
	
	/**
	 * Returns whether this page's controls currently all contain valid 
	 * values.
	 *
	 * @return <code>true</code> if all controls are valid, and
	 *   <code>false</code> if at least one is invalid
	 */
	protected boolean validatePage() {
		boolean valid = true;
		return valid;
	}

	/**
	 * FIXME not needed
	 * Copied from jdt sources.
	 * @see org.eclipse.jdt.ui.wizards.NewContainerWizardPage
	 */
	private class ContainerFieldAdapter implements IStringButtonAdapter, IDialogFieldListener {
		// -------- IStringButtonAdapter
		public void changeControlPressed(DialogField field) {
			// actually it cannot be another type than StringDialogField.
			if (field instanceof StringDialogField)	handleBrowseFolders((StringDialogField)field);
		}
		// -------- IDialogFieldListener
		public void dialogFieldChanged(DialogField field) {
		}
	}
	
	
	private class EcoreFieldsAdapter implements IStringButtonAdapter, IDialogFieldListener, IListAdapter, SelectionListener {
		
		// -------- IStringButtonAdapter
		public void changeControlPressed(DialogField field) {
			System.err.println("change control pressed");
		}
		
		// -------- IListAdapter
		public void customButtonPressed(ListDialogField field, int index) {
			System.err.println("custom button pressed");
			handleBrowseEcoreFiles(field);
		}
		
		public void selectionChanged(ListDialogField field) {}
		
		// -------- IDialogFieldListener
		public void dialogFieldChanged(DialogField field) {
			System.err.println("dialog field changed");
		}
		
		public void doubleClicked(ListDialogField field) {}
		public void widgetSelected(SelectionEvent e) { System.err.println("widget selected"); }
		public void widgetDefaultSelected(SelectionEvent e) { System.err.println("widget default selected");}
	}

	
    /**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 * Copy from Runner --> redundant code...
	 */

	protected IResource handleBrowseResources() {
	    IResource result = null;
	    //LabelProvider labelProvider = new KermetaLabelProvider();
	    org.eclipse.jface.viewers.LabelProvider labelProvider = new LabelProvider();
	    containerGroup = new CustomContainerSelectionGroup(getShell(), this, true,
                null, true);
		
		// Now, create the tree
		//BasicTreeContentProvider contentProvider = new BasicTreeContentProvider();
		WorkbenchContentProvider contentProvider = new WorkbenchContentProvider();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), labelProvider, contentProvider);
		dialog.setTitle(KermetaMessages.getString("ArgTab.PROJECTSELECT"));
		dialog.setInput(containerGroup.getTreeViewer().getInput());
		dialog.setAllowMultiple(false);
		
		
		
		// Set the default selection to currently selected resource
		ISelection sresource = 
		KermetaPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (sresource instanceof IStructuredSelection)
		{ 
		    if (((IStructuredSelection)sresource).getFirstElement() instanceof IResource )
			{ dialog.setInitialSelections(new Object[] {((IStructuredSelection)sresource).getFirstElement()});}
		}

		if (dialog.open() == Window.OK)
		{		
			result = (IResource) dialog.getFirstResult();
		}
		return result;
		
	}
	
    /**
	 * Open a tree hierarchy of the current workspace folder, and update content
	 * by displaying the resource that the user selected in the given field.
	 */
	protected void handleBrowseFolders(StringDialogField field) {
		// Get the first resource selected by the user
		IResource result = handleBrowseResources();
		if (result != null)
			field.setText(result.getFullPath().toString() + "/" + result.getName());
	}
	
	/**
	 * Open a tree hierarchy of the current workspace folder, and update content
	 * by displaying the resource that the user selected in the given field.
	 */
	protected void handleBrowseEcoreFiles(ListDialogField field) {
		// Get the first resource selected by the user
		IResource result = handleBrowseResources();
		field.addElement(result.getFullPath().toString() + "/" + result.getName());
	}
	
}