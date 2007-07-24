/* $Id: Kermeta2EcoreResolveWizardPage.java,v 1.3 2007-07-24 13:46:39 ftanguy Exp $
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.internal.ui.dialogs.TableTextCellEditor;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IListAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.ListDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.Separator;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringButtonDialogField;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import fr.irisa.triskell.kermeta.KermetaMessages;
import fr.irisa.triskell.kermeta.tools.wizards.dialogs.BasicLabelProvider;
import fr.irisa.triskell.kermeta.tools.wizards.dialogs.ContainerFieldAdapter;
import fr.irisa.triskell.kermeta.tools.wizards.util.WizardHelper;

/**
 * Standard main page for a wizard that point to a destination file resource.
 * <p>
 * This page may be used by clients as-is; it may be also be subclassed to suit.
 * </p>
 * 
 */
public class Kermeta2EcoreResolveWizardPage extends WizardPage implements Listener {

	
	protected static final int PROBLEM_NONE = 0;
	
	// the current resource selection
	protected	IStructuredSelection currentSelection;
	protected IResource ecoreGenerationDirectory ;
	protected String ecoreFolder ;
	protected List<IFile> ecoreLinkedFiles;
	protected List<String> ecoreFileList;
	// Specific GUI elements
	/** Basic label provider to display properly graphical elements (like navigation tree view for file selection)*/
	protected BasicLabelProvider labelProvider;
	/**
	 * Dialog field to let the user choose the directory where ecore files will be generated.
	 * Only active if user asked to overwrite the generated ecore files. 
	 * */
	protected StringButtonDialogField containerDialogField;
	protected Group ecoreFileListGroup;
	protected ListDialogField requiredEcoreFileDialogField;
	
	// Wizard helper
	protected WizardHelper wizhelper;
	
	// The main sub group that will contain the different widgets
	protected Composite topLevel;
	protected int problemType;
	protected Button overwriteEcoreFilesButton;
	protected String enableOverwriteEcoreFilesString="Generate file ";
	protected Composite overwriteEcoreFilesComposite;
	
	public final static int INVALID_FIELD = 1;
	public final static int NONE = 0;
	
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
		setTitle("Ecore dependencies handling");
		setDescription("Choose where you want to save the ecore resource\n dependencies, or " +
				"which Ecore files you want to link to your converted file"); // + kmtfile.getName() + "\"");
		
		setPageComplete(false);
		this.currentSelection = selection;
		this.wizhelper = new WizardHelper(this);
		this.ecoreLinkedFiles = new ArrayList<IFile>();
	}
	
	/**
	 * @see WizardPage#createControl
	 */
	public void createControl(Composite parent) {
		// init util
		topLevel= new Composite(parent, SWT.NONE);
		topLevel.setFont(parent.getFont());
		
		int nColumns= 4;
		GridLayout layout= new GridLayout(nColumns, false);
		topLevel.setLayout(layout);
		// FIXME for the moment GridData causes problems when WizardPage is updated in Eclipse source code
		// (ClassCastException)
/*		topLevel.setLayoutData(new GridData(
				GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));*/
		topLevel.setFont(parent.getFont());
		
		// Create the dialog field where user choose an output directory for resource ecore dependencies)
		createContainerControls(topLevel, nColumns);	
		
		// Create an esthetic separator
		createSeparator(topLevel, nColumns);

		// Create the ecore list where user 
		createRequiredEcoreFileList(topLevel, nColumns);
		
		setControl(topLevel);
		
		// Initialize the WizardPage state
		initControlState();
	
		Dialog.applyDialogFont(topLevel);
		
		validatePage();
	}
	
	/** Initialize the WizardPage state */
	private void initControlState() {
		handleOverwriteEcoreFilesButton();
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

		// create check button holder
		overwriteEcoreFilesComposite = new Composite(parent, SWT.NONE);
		overwriteEcoreFilesComposite.setLayout(new GridLayout(nColumns,false));

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=4;
		overwriteEcoreFilesComposite.setLayoutData(gd);
		
		overwriteEcoreFilesButton = new Button(overwriteEcoreFilesComposite, SWT.CHECK);
		overwriteEcoreFilesButton.setSelection(false);
		Label label = new Label(overwriteEcoreFilesComposite, SWT.NULL);
		label.setText(KermetaMessages.getString("Kermeta2Ecore.OVERWRITEGENDIR"));
		
		// Create the field where user choosed for the output directory for ecore-generated files
		ContainerFieldAdapter adapter= new ContainerFieldAdapter(this);
		containerDialogField= new StringButtonDialogField(adapter);
		containerDialogField.setDialogFieldListener(adapter);
		containerDialogField.setLabelText(KermetaMessages.getString("Kermeta2Ecore.GENDIR")); 
		containerDialogField.setButtonLabel(KermetaMessages.getString("KermetaPerspective.BROWSE"));
		containerDialogField.doFillIntoGrid(parent, nColumns);
		containerDialogField.setEnabled(false);
		LayoutUtil.setWidthHint(containerDialogField.getTextControl(null), 50);
		
		overwriteEcoreFilesButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleOverwriteEcoreFilesButton();
			}
		});
		setPageComplete(validatePage());
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
		EcoreFieldsAdapter adapter =new EcoreFieldsAdapter();
		requiredEcoreFileDialogField = new ListDialogField(
				adapter, 
				createAddAndRemoveButtons(), 
				new BasicLabelProvider());
		requiredEcoreFileDialogField.setDialogFieldListener(adapter);
		requiredEcoreFileDialogField.setTableColumns(new ListDialogField.ColumnsDescription(1, false));
		requiredEcoreFileDialogField.setLabelText(KermetaMessages.getString("Kermeta2Ecore.ADDCHOICE"));
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
	 * The <code>DestFileWizardPage</code> implementation of this 
	 * <code>Listener</code> method handles all events and enablements for controls
	 * on this page. Subclasses may extend.
	 */
	public void handleEvent(Event event) {
		setPageComplete(validatePage());
	}
	
	public void handleOverwriteEcoreFilesButton() {
		
		boolean selection = overwriteEcoreFilesButton.getSelection();
		if(!selection)
		{	// page is valid
			setErrorMessage(null);
			setMessage(null);
			setPageComplete(true);
		}
		containerDialogField.setEnabled(selection);
		requiredEcoreFileDialogField.setEnabled(!selection);
		//requiredEcoreFileDialogField.enableButton(0, !selection);
		setPageComplete(validatePage());
	}

	/**
	 * Returns whether this page's controls currently all contain valid 
	 * values. If it is the case, then it activates the Next/Finish button(s)
	 *
	 * @return <code>true</code> if all controls are valid, and
	 *   <code>false</code> if at least one is invalid;
	 */
	public boolean validatePage() {
		boolean valid = true;
		if(!overwriteEcoreFilesButton.getSelection())
		{
			valid = true;
		}
		else
		{
			valid = false;
			// Is the ecore gen directory provided?
			if (ecoreFolder==null || ecoreFolder.length()==0) {
				setMessage(KermetaMessages.getString("Kermeta2Ecore.PROBLEM_EMPTYGENDIR"));
			}
			else
			{
				valid = true;
				ecoreGenerationDirectory=getIPathFromString(ecoreFolder);
				if (ecoreGenerationDirectory==null)
				{
					setMessage(KermetaMessages.getString("Kermeta2Ecore.PROBLEM_BADGENDIR"));
				}
					
			}
		}
		if (valid == true && this.isCurrentPage() )
		{
			setMessage(null);
			setErrorMessage(null);
		}

		return valid;
	}
	
	/**
	 * @return <code>true</code> if given resource corresponds to a real resource,
	 *   <code>false</code> if it does not exist;
	 */
	public boolean validatePageForResource(String resource) {
		return (resource!=null && resource.length()>0 && getIPathFromString(resource)!=null);
	}
	
	/**
     * Returns a boolean indicating whether all controls in this group
     * contain valid values.
     *
     * @return boolean
     */
    public boolean areAllValuesValid() {
        return problemType == PROBLEM_NONE;
    }
	
	
    /** Adapter that handles events from the table field of this wizard page */
	private class EcoreFieldsAdapter implements IStringButtonAdapter, IDialogFieldListener, IListAdapter, SelectionListener {
		
		// -------- IStringButtonAdapter
		public void changeControlPressed(DialogField field) {}
		
		// -------- IListAdapter // index is always O... -> Add... button.
		public void customButtonPressed(ListDialogField field, int index) {
			wizhelper.handleBrowseEcoreFiles(field, ecoreLinkedFiles, index);
			ecoreFileList = field.getElements();
		}
		public void selectionChanged(ListDialogField field)
		{ecoreFileList = field.getElements();}
		
		// -------- IDialogFieldListener
		public void dialogFieldChanged(DialogField field) {}
		public void doubleClicked(ListDialogField field) {}
		public void widgetSelected(SelectionEvent e) {}
		public void widgetDefaultSelected(SelectionEvent e) {}
	}
	
	/** Helper method that checks if file exists 
	 *  @param filestring the string that we want to check if it corresponds to an existing file in 
	 *  current workspace. It must not be null.
	 *   */
	public static IResource getIPathFromString(String filestring) {
		return ResourcesPlugin.getWorkspace().getRoot().findMember(filestring);
	}

	/**
	 * @return Returns the ecoreGenerationDirectory.
	 */
	public String getEcoreFolder() {
		return ecoreFolder;
	}

	/**
	 * @return Returns the ecoreLinkedFiles.
	 */
	public List<IFile> getEcoreLinkedFiles() {
		return ecoreLinkedFiles;
	}

	/**
	 * @param ecoreFileList The ecoreFileList to set.
	 */
	public void setEcoreFileList(List<String> ecoreFileList) {
		this.ecoreFileList = ecoreFileList;
	}

	/**
	 * @param ecoreFolder The ecoreFolder to set.
	 */
	public void setEcoreFolder(String ecoreFolder) {
		this.ecoreFolder = ecoreFolder;
	}

	/**
	 * @return Returns the wizhelper.
	 */
	public WizardHelper getWizhelper() {
		return wizhelper;
	}

	/**
	 * @return Returns the problemType.
	 */
	public int getProblemType() {
		return problemType;
	}

	/**
	 * @param problemType The problemType to set.
	 */
	public void setProblemType(int problemType) {
		this.problemType = problemType;
	}

	/**
	 * @return Returns the topLevel.
	 */
	public Composite getTopLevel() {
		return topLevel;
	}
	
	/** @return true if user set an ecore directory and enabled the related check box
	 * false otherwise */
	public boolean overwriteGeneratedEcore()
	{
		return overwriteEcoreFilesButton.getSelection();
	}

	/**
	 * @return Returns the ecoreFileList.
	 */
	public List<String> getEcoreFileList() {
		return ecoreFileList;
	}
	
	

	
}