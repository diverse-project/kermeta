/* $Id: ArgumentConfigurationTab.java,v 1.9 2005-05-31 14:35:28 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: ArgumentConfigurationTab.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 20, 2005
 * Authors: zdrey
 * 
 * ----------------------------------------------------------------------------
 * Note :
 *   - Always call "layout()" method on widgets to display them
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.dialogs.SelectionListDialog;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
/**
 * 
 */
public class ArgumentConfigurationTab extends AbstractLaunchConfigurationTab {

    /**
     * The elements that compose this Tab window
     */
    protected String filenameString = "No file given";
    protected Text classQualifiedNameText;
    protected String classQualifiedNameString = "No class given";
    protected Text defaultOperationText;
    protected String defaultOperationString = "No operation given";
    public KermetaUnit selectedUnit;
    
    /** The labels to move in a .properties file */
    public String SOURCEFILE="File";
    
    /** Basic modify listener stolen from CommonTab source*/
    private ModifyListener fBasicModifyListener = new ModifyListener() {
		public void modifyText(ModifyEvent evt) {
			updateLaunchConfigurationDialog();
		}
};
	/** Listener for class Name modification */
	private ModifyListener fClassModifyListener = new ModifyListener() {
	public void modifyText(ModifyEvent evt) {
		updateLaunchConfigurationDialog();
		if (classNameText!=null && classNameText.getText().length()>0)
		    setOperationEnabled(true);
		else setOperationEnabled(false);

	}
};;
	/** Listener for file nape modification */
	private ModifyListener fFileModifyListener = new ModifyListener() {
    public void modifyText(ModifyEvent evt) {
        updateLaunchConfigurationDialog();
        if (sharedLocationText!=null && sharedLocationText.getText().length()>0)
            setClassEnabled(true);
        else
        {	setClassEnabled(false); setOperationEnabled(false); }
    }
};

    private Label sharedLocationLabel;
    private Text sharedLocationText;
    private Button sharedLocationButton;
    private Button classNameButton;
    private Label classNameLabel;
    /** The text widget for the selection of a Kermeta class from a given file */
    private Text classNameText;
    /** The path selected by the user through the "Browse" action*/
    private String selectedPath;
    /** The class qualified name chosen by the user */
    private String selectedClassString = null;
    /** The text widget for the selection of a Kermeta operation */
    private Text operationNameText;
    /** The button to click on in order to select an operation*/
    private Button operationNameButton;
    
    /**
     * 
     */
    public ArgumentConfigurationTab() {
        super();
        //getWorkspaceRoot().
        filenameString = getWorkspaceRoot().getLocation().toString();
        //ifile.getLocation().toString()
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent)
    {
        // Initialize layouts
        
        GridLayout gClassLayout = new GridLayout();
        GridLayout gOperationLayout = new GridLayout();
        
		//Composite area = (Composite) super.createDialogArea(parent);
        Composite area = new Composite(parent, SWT.NULL);
		area.layout();
		setControl(area);		
		
		// Create the area for the filename to get
		createFileLayout(area, null);
		
		// Create the area for the classQualifiedName
		createClassNameLayout(area, null);
		
		// Set the field for the operation choice
		createOperationNameLayout(area, null);


    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub

    }

    /**
     * Fills the configuration that is launched with the values of the last configuration
     * (provided user saved it!)
     * @param configuration The selected configuration
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeFrom(ILaunchConfiguration configuration)
    {	  // just to remember how to access a launch group
//        ILaunchGroup group = DebugUITools.getLaunchGroup(configuration, LaunchManager.RUN_MODE);
        String selectedOperationString = "";
        if (DebugUITools.getSelectedResource()!=null)
        {      
           selectedPath = DebugUITools.getSelectedResource().getFullPath().toOSString();//.getLocation().toOSString();
        }
		try
		{
		    String currentPath = configuration.getAttribute(KermetaLaunchConfiguration.KM_FILENAME,
            "");
		    // If user created a new configuration ?
		    currentPath = (currentPath.equals(""))?selectedPath:currentPath;
		    
		    // Create the Unit corresponding to the chosen Kermeta file
		    // (either the SelectedResource one, or the path of current configuration)
		    selectedUnit = KermetaRunHelper.parse(currentPath);
		    ArrayList point = KermetaRunHelper.findEntryPoint(selectedUnit);
		    selectedClassString = (String)point.get(0);
		    selectedOperationString = (String)point.get(1);
		    
		    
            getSharedLocationText().setText(configuration.getAttribute(KermetaLaunchConfiguration.KM_FILENAME,
                    currentPath));
       
            getclassNameText().setText(
                    configuration.getAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME,
                            selectedClassString));
            getOperationNameText().setText(
                    configuration.getAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME,
                            selectedOperationString));
		}
		catch (CoreException e)
		{
		    e.printStackTrace();
		}
		catch (Exception e)
		{
		    System.err.println("Exception : the KermetaUnit for selected file could" +
		    		"probably not be loaded");
		    e.printStackTrace();
		}

    }

	/**
	 * When the button "Apply" is pushed, this method is launched
	 * The configuration is saved.
	 * INPUT, OUTPUT and PATH
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        //updateConfigFromLocalShared(configuration); nullpointerexception->works when config stored in afile
        
		configuration.setAttribute(KermetaLaunchConfiguration.KM_FILENAME, sharedLocationText.getText());
		configuration.setAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME, classNameText.getText());
		configuration.setAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME, operationNameText.getText());
		
    }
    
    /***
     * Update configuration
     * @param config
     */
	private void updateConfigFromLocalShared(ILaunchConfigurationWorkingCopy config) {
		String containerPathString = getSharedLocationText().getText();
		IContainer container = getContainer(containerPathString);
		config.setContainer(container);
	}

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() {
        
        return "Argument configuration";
    }

    /***
     * Create the Field where user enters file to execute
     * @param parent
     * @param font
     * @return
     */
    public Composite createFileLayout(Composite parent, Font font)
    {
        createInputTextLayout(parent, "Set the location of your Kermeta file");
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        
        setSharedLocationText(new Text(parent, SWT.SINGLE | SWT.BORDER));
        getSharedLocationText().setLayoutData(gd);
        getSharedLocationText().setFont(font);
        getSharedLocationText().addModifyListener(fFileModifyListener);
        setSharedLocationButton(createPushButton(parent, "Browse", null));	 //$NON-NLS-1$
        getSharedLocationButton().addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent evt) {
                handleSharedLocationButtonSelected();
            }
        });	
        return parent;
    }
 
    
    /**
     * 
     * @param parent the Parent of this argument tab
     * @param labelString the label of the input text to create
     * @param adapter the event that is "provoked" when clicking on OK button
     */
    public void createInputTextLayout(Composite parent,
            String labelString)
    {
        GridLayout locationLayout = new GridLayout();
        locationLayout.numColumns = 2;
        locationLayout.marginHeight = 0;
        locationLayout.marginWidth = 0;
        parent.setLayout(locationLayout);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        parent.setLayoutData(gd);
        //parent.setFont(null);
        
        Label inputLabel = new Label(parent, SWT.NONE);
        inputLabel.setText(labelString); //$NON-NLS-1$
        gd = new GridData();
        gd.horizontalSpan = 2;
        inputLabel.setLayoutData(gd);
    }


    public void createClassNameLayout(Composite parent, Font font)
    {
        // Create common layout basis
        createInputTextLayout(parent, "Class qualified name");
        
        classNameText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        classNameText.setLayoutData(gd);
        //classNameText().setFont(font);
        classNameText.addModifyListener(fClassModifyListener);
        
        classNameButton = createPushButton(parent, "Search...", null);	 //$NON-NLS-1$
        classNameButton.addSelectionListener(
                new SelectionAdapter() {
        			public void widgetSelected(SelectionEvent evt) {
        		    	handleClassNameButtonSelected();
        				}
        }
        );
    }
    
    /**
     * Create the operation input zone
     * @param parent composite inside which this input zone is created
     * @param font
     */
    public void createOperationNameLayout(Composite parent, Font font)
    {
        // Create common layout basis
        createInputTextLayout(parent, "Operation name");
        
        operationNameText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        operationNameText.setLayoutData(gd);
        //operationNameText().setFont(font);
        operationNameText.addModifyListener(fBasicModifyListener);
        
        operationNameButton = createPushButton(parent, "Search...", null);	 //$NON-NLS-1$
        operationNameButton.addSelectionListener(
                new SelectionAdapter() {
        			public void widgetSelected(SelectionEvent evt) {
        		    	handleOperationNameButtonSelected();
        				}
        }
        );
        if (selectedClassString==null || selectedClassString.length()==0)
        {
            operationNameButton.setEnabled(false);
            operationNameText.setEnabled(false);
        }
        
    }
    
    /**
     * Action that is done when user clicked on the selection button of 
     * Operation name input Text.
     * TODO : (to check) enable it if, and only if, selectedClassString is assigned
     */
    protected void handleOperationNameButtonSelected()
    {
        FClassDefinition selectedFClassDef = (FClassDefinition)selectedUnit.
        getTypeDefinitionByName(
                selectedClassString);
        
        // Get the operations of this class (super operation also?)
        EList foperations = selectedFClassDef.getFOwnedOperation();
        ArrayList opnamelist = new ArrayList(foperations.size());
        for (int i = 0; i< foperations.size(); i++)
        {
            opnamelist.add(((FOperation)foperations.get(i)).getFName());
        }
        
        SelectionListDialog opDialog = new SelectionListDialog(getShell());
        
        opDialog.setList(opnamelist);
        int code = opDialog.open();
        // If user clicked on OK
        if (code == InputDialog.OK)
        {
            getOperationNameText().setText(opDialog.getSelectedItem());
        }
        
    }


    /**
     * Browse the current workspace so that user can select the source file that
     * he wants to execute.
     */
    protected void handleSharedLocationButtonSelected()
    {   
		String selectedPath = handleBrowse(getSharedLocationText());
		// Parse the selected file
		if (selectedPath!=null)
		{   // update the className and the operationName
		    parseFileAndUpdateFields(selectedPath);
		    //selectedUnit.saveAsXMIModel(selectedPath);
		}
    }
    
    
	/**
	 * Parse the file specified by current path (i.e. creates its Kermeta Unit)
	 * and update the fields of this configuration tab. The new configuration is not
	 * saved, so user must ask it explicitely (click on Apply) if he wants to. 
     * @param currentPath
     */
    protected void parseFileAndUpdateFields(String currentPath)
    {
        selectedUnit = KermetaRunHelper.parse(currentPath);
	    ArrayList point = KermetaRunHelper.findEntryPoint(selectedUnit);
	    selectedClassString = (String)point.get(0);
	    String selectedOperationString = (String)point.get(1);
	    
        getSharedLocationText().setText(currentPath);
        getclassNameText().setText(selectedClassString);
        getOperationNameText().setText(selectedOperationString);
    }

    /**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private String handleBrowse(Text containerText) {
	    String resultPath = null;
		ResourceSelectionDialog dialog =
			new ResourceSelectionDialog(getShell(),
			    ResourcesPlugin.getWorkspace().getRoot(),
			    "Select a file"
			        );
		// Set the default selection to currently selected resource
		ISelection sresource = RunnerPlugin.getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (sresource instanceof IStructuredSelection)
		{ 
		    if (((IStructuredSelection)sresource).getFirstElement() instanceof IResource)
			{ dialog.setInitialSelections(new Object[] {((IStructuredSelection)sresource).getFirstElement()});}
		}
		
		if (dialog.open() == ResourceSelectionDialog.OK)
		{
			Object[] results = dialog.getResult();
			
			if (results != null) {
			    // Get only the first selected file / TODO : forbid multi-selection
			    if (results[0] instanceof IFile)
			        resultPath = ((IFile) results[0]).getFullPath().toOSString();
					containerText.setText(resultPath);
			}
		}
		return resultPath;
	}
    
    /***
     * Clicking on this button gets the list of available classes in the
     * given source file
     */
    private void handleClassNameButtonSelected()
    {
        
        // TODO Handle null pointer exception
//        List classDefinitionList = createClassList(getShell(), selectedUnit);
        // The selectedUnit can be null when trying to run new configurations
        // Try to load it again.
/*        if (selectedUnit == null)
        {
            
        }
*/
                
        EList typedefs = selectedUnit.rootPackage.getFOwnedTypeDefinition();
        // Get all the classes defined in this Unit
        ArrayList qnameList = new ArrayList(typedefs.size());
        for (int i=0; i<typedefs.size(); i++)
        {
            qnameList.add(selectedUnit.getQualifiedName((FNamedElement)typedefs.get(i)));
        }
        
        SelectionListDialog classDialog = new SelectionListDialog(getShell());
        classDialog.setList(qnameList);
        int code = classDialog.open();
        selectedClassString = classDialog.getSelectedItem();
        // If user clicked on OK, set the field to the class he selected
        if (code == InputDialog.OK)
        {
            getclassNameText().setText(selectedClassString);
        }
        // Disable the operation choice if needed
        if (selectedClassString != null)
            setOperationEnabled(true);
        else setOperationEnabled(false);
    }
    
    
    
    
    protected void setOperationEnabled(boolean isEnabled)
    {
        if (!isEnabled) {operationNameText.setText("");}
        operationNameButton.setEnabled(isEnabled);
        operationNameText.setEnabled(isEnabled);
    }


    protected void setClassEnabled(boolean isEnabled)
    {
        if (!isEnabled) {classNameText.setText("");}
        classNameButton.setEnabled(isEnabled);
        classNameText.setEnabled(isEnabled);
    }
 
    private void setSharedLocationButton(Button button) {
        sharedLocationButton = button;
    }

    public void setSharedLocationLabel(Label label) {
        sharedLocationLabel = label;
    }
    
    public Label getSharedLocationLabel() {
        return sharedLocationLabel ;
    }

    private Button getSharedLocationButton() {
        return sharedLocationButton;
    }
    
    public void setSharedLocationText(Text text) {
        sharedLocationText = text;
    }
    
    public Text getSharedLocationText() {
        return sharedLocationText;
    }
    

    /**
     * Simple accessors 
     */
    private void setclassNameButton(Button button) {
        classNameButton = button;
    }
    private Button getclassNameButton() {
        return classNameButton;
    }
    public void setclassNameLabel(Label label) {
        classNameLabel = label;
    }
    public Label getclassNameLabel() {
        return classNameLabel ;
    }
    public void setclassNameText(Text text) {
        classNameText = text;
    }
    public Text getclassNameText() { 
        return classNameText;
    }
    private Text getOperationNameText() {   return operationNameText;
    }

	/**
	 * (CommontTab) Convenience method for getting the workspace root.
	 */
	private IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
	
	/**
	 * (CommontTab) Convenience method for getting the member resource 
	 * of the workspace root
	 */
	private IContainer getContainer(String path) {
		Path containerPath = new Path(path);
		return (IContainer) getWorkspaceRoot().findMember(containerPath);
	}
}
