/* $Id: ArgumentConfigurationTab.java,v 1.2 2008-04-04 09:29:32 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: ArgumentConfigurationTab.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 20, 2005
 * Authors: zdrey
 * 
 * ----------------------------------------------------------------------------
 * Note :
 *   - Always call "layout()" method on widgets to display them
 */
package org.kermeta.runner.launching;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.DebugPluginImages;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.runner.dialogs.SelectionListDialog;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.KermetaMessages;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
/**
 * 
 */
public class ArgumentConfigurationTab extends AbstractLaunchConfigurationTab //implements ModifyListener
{

    /**
     * The elements that compose this Tab window
     */
    protected String filenameString = "<No file given>";
    protected Text classQualifiedNameText;
    protected String classQualifiedNameString = "<No class given>";
    protected Text defaultOperationText;
    protected String defaultOperationString = "<No operation given>";
   
    public IProject selectedProject;
    public int GRID_DEFAULT_WIDTH = 200;
    public IAdaptable selectedResource = null;
    
    protected KermetaUnit kunit = null;
    
    
    /** Basic modify listener stolen from CommonTab source*/
    private ModifyListener fBasicModifyListener = new ModifyListener() {
		public void modifyText(ModifyEvent evt) {
		    
			updateLaunchConfigurationDialog();
		}
    };
    /** Listener for class Name modification */
    private ModifyListener fClassModifyListener = new ModifyListener() {
    	public void modifyText(ModifyEvent evt) {
    		canSave();
    		updateLaunchConfigurationDialog();
    		if (classNameText!=null && classNameText.getText().length()>0)
    			setOperationEnabled(true);
    		else setOperationEnabled(false);
    	}
    };
    /** Listener for file nape modification */
    private ModifyListener fFileModifyListener = new ModifyListener() {
    	public void modifyText(ModifyEvent evt) {
    		updateLaunchConfigurationDialog();
    		if (fileLocationText!=null && fileLocationText.getText().length()>0)
    			setClassEnabled(true);
    		else
    		{	setClassEnabled(false); setOperationEnabled(false); }
    	}
    };

    private Label fileLocationLabel;
    private Text fileLocationText;
    private Button fileLocationButton;
    private Button classNameButton;
    private Label classNameLabel;
    /** The text widget for the selection of a Kermeta class from a given file */
    private Text classNameText;
    private Text projectLocationText;
    private Button _constraintExecutionButton;

    /** The class qualified name chosen by the user */
    private String selectedClassString = null;
    /** The text widget for the selection of a Kermeta operation */
    private Text operationNameText;
    /** The button to click on in order to select an operation*/
    private Button operationNameButton;
    /** The text widget for the choice of arguments */
    private Text argumentsText;
    
    // NOTE : pas mis en cause dans le OUTOFMEMORY
    public ArgumentConfigurationTab() {
        super();
        filenameString = ResourceHelper.root.getLocation().toString();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent)
    {
        
        Composite area = new Composite(parent, SWT.NULL);
        GridLayout gl = new GridLayout(1, false);
        gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);		
		
		Composite projectArea = new Composite(area, SWT.SINGLE);
		projectArea.setLayout(new RowLayout());
		// Create the area for the project to get
		createProjectLayout(projectArea, null);
		
		Group paramArea = new Group(area, SWT.NULL);
		paramArea.setText(KermetaMessages.getString("ArgTab.FILEPARAM"));
		paramArea.setLayout(new FillLayout());
		
		// Create the area for the filename to get
		createFileLayout(paramArea, null);
		
		// Create the area for the classQualifiedName
		createClassNameLayout(paramArea, null);
		
		// Set the field for the operation choice
		createOperationNameLayout(paramArea, null);
		
		createArgumentsLayout(paramArea, null);

		Composite checkconstraintArea = new Composite(area, SWT.SINGLE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		checkconstraintArea.setLayout( layout );
		// Create the area for the constraint check button
		createCheckConstraintButtonLayout(checkconstraintArea, null);

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
        String currentProjectPath = "";
        String storedPath = "";
        IFile selectedFile = null;
      /*  if (DebugUITools.getSelectedResource()!=null)
        {      
           IResource selr = DebugUITools.getSelectedResource();
           if (selr instanceof IFile)
               selectedPath = selr.getFullPath().toOSString();//.getLocation().toOSString();
           else if (selr instanceof IProject)
               currentProjectPath = selr.getFullPath().toOSString();;
        }
        */
		try
		{
		    storedPath = configuration.getAttribute(KConstants.KM_FILENAME,
            "");
		    selectedFile = ResourceHelper.getIFile(storedPath);
		    
		    getProjectLocationText().setText(configuration.getAttribute(KConstants.KM_PROJECTNAME,
		    		currentProjectPath));
		    
		    getFileLocationText().setText(configuration.getAttribute(KConstants.KM_FILENAME,
		    		storedPath));
		    
		    getclassNameText().setText(
		    		configuration.getAttribute(KConstants.KM_CLASSQNAME,
		    		""));
		    if (getclassNameText().getText().compareTo("")==0 )
		    {
		    	getclassNameText().setText(getDefaultClass(selectedFile));
		    }
		    selectedClassString = getclassNameText().getText();
		    getOperationNameText().setText(
		    		configuration.getAttribute(KConstants.KM_OPERATIONNAME,
		    		""));
		    getArgumentsText().setText(
		    		configuration.getAttribute(KConstants.KM_ARGUMENTS,
		    		""));
		    if (getOperationNameText().getText().compareTo("")==0 )
		    	getOperationNameText().setText(getDefaultOperation(selectedFile));

		    canSave();
		}
		catch (CoreException e)
		{
		    e.printStackTrace();
		}
		catch (Throwable e)
		{
		    String errorMsg = "";
		   /* if (lselectedUnit != null)
	            errorMsg = KermetaMessages.getString("ArgTab.WRONGLOADUNITERROR") ;*/
	        setClassEnabled(false);
	        setOperationEnabled(false);
	        if (!errorMsg.equals(""))
	            MessageDialog.openInformation(
					new Shell(),
					"Kermeta parse error, ",
					errorMsg+":\n"+e.getMessage());
				e.printStackTrace();
	        
		}

    }

    /**
     * retreive an eventual Default class name in the kermeta file
     * @param selectedFile
     * @return
     */
    protected String getDefaultClass(IFile selectedFile) {
    	String defaultClassName = "";
    	if(kunit == null && selectedFile != null)
    	{
    		try {
				kunit = KermetaUnitChecker.check(selectedFile);
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
    	}
    	if (kunit != null)
  		{
    		Tag cls = ModelingUnitHelper.getMainClass( kunit );
  		    defaultClassName = cls.getValue();
  		}
    	return defaultClassName;
    }
    
    /**
     * retreive an eventual Default operation name in the kermeta file
     * @param selectedFile
     * @return
     */
    protected String getDefaultOperation(IFile selectedFile)
    {
    	String defaultOperationName = "";
    	if(kunit == null && selectedFile != null)
    	{
    		try {
				kunit = KermetaUnitChecker.check(selectedFile);
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
    	}
    	if (kunit != null)
  		{
    		Tag operation = ModelingUnitHelper.getMainOperation( kunit );
  		    defaultOperationName = operation.getValue();
  		}
    	return defaultOperationName;
    }
    /**
	 * When the button "Apply" is pushed, this method is launched
	 * The configuration is saved.
	 * INPUT, OUTPUT and PATH
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(KConstants.KM_FILENAME, fileLocationText.getText());
		configuration.setAttribute(KConstants.KM_CLASSQNAME, classNameText.getText());
		configuration.setAttribute(KConstants.KM_OPERATIONNAME, operationNameText.getText());
		configuration.setAttribute(KConstants.KM_ARGUMENTS, argumentsText.getText());
		configuration.setAttribute(KConstants.KM_PROJECTNAME, projectLocationText.getText());
		configuration.setAttribute(KConstants.KM_CONSTRAINT, _constraintExecutionButton.getSelection() );
		configuration.setAttribute( DebugPlugin.ATTR_PROCESS_FACTORY_ID, "org.kermeta.debug.processFactory" );
   }
    
    
    
    /***
     * Update configuration
     * @param config
     */
	private void updateConfigFromLocalShared(ILaunchConfigurationWorkingCopy config) {
		String containerPathString = getFileLocationText().getText();
		IContainer container = KermetaPlugin.getContainer(containerPathString);
		config.setContainer(container);
		
	}

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() { return KermetaMessages.getString("ArgTab.NAME"); }
    
    /** (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
     */
    public Image getImage() {
        return DebugPluginImages.getImage(IDebugUIConstants.IMG_OBJS_VARIABLE);
    }
    
    
    /***
     * Create the Field where user enters file to execute
     * @param parent
     * @param font
     * @return
     */
    public Composite createProjectLayout(Composite parent, Font font)
    {
        createInputTextLayout(parent, KermetaMessages.getString("ArgTab.PROJECTLOC"));
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        //gd.horizontalSpan = 1;
        gd.widthHint = GRID_DEFAULT_WIDTH;
        // Create the project selector button
        
        // Project location text
        projectLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        projectLocationText.setLayoutData(gd);
        projectLocationText.setFont(font);
        projectLocationText.addModifyListener(fBasicModifyListener);
        Button projectLocationButton = createPushButton(parent, 
                KermetaMessages.getString("KermetaPerspective.BROWSE"),
                null);
        projectLocationButton.addSelectionListener(new SelectionAdapter() 
                {
                	public void widgetSelected(SelectionEvent evt)
                	{
                	    handleProjectLocationButtonSelected();
                	}
                });
        return parent;
    }
    
    /***
     * Create the Field where user enters file to execute
     * @param parent
     * @param font
     * @return
     */
    public Composite createCheckConstraintButtonLayout(Composite parent, Font font) {
        Label inputLabel = new Label(parent, SWT.NONE);
        inputLabel.setText(KermetaMessages.getString("ArgTab.CHECK_CONSTRAINT_BUTTON")); //$NON-NLS-1$
       
        _constraintExecutionButton = new Button(parent, SWT.CHECK);
        _constraintExecutionButton.addSelectionListener( 
        		new SelectionListener() {
        			public void widgetDefaultSelected(SelectionEvent e) {
        			}
        			public void widgetSelected(SelectionEvent e) {
        				updateLaunchConfigurationDialog();
        			}
        		}
        );
        return parent;
    }
    
    /***
     * Create the Field where user enters file to execute
     * @param parent
     * @param font
     * @return
     */
    public Composite createFileLayout(Composite parent, Font font)
    {
        createInputTextLayout(parent, KermetaMessages.getString("ArgTab.FILELOC"));
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        
        setFileLocationText(new Text(parent, SWT.SINGLE | SWT.BORDER));
        getFileLocationText().setLayoutData(gd);
        getFileLocationText().setFont(font);
        getFileLocationText().addModifyListener(fFileModifyListener);
        setFileLocationButton(createPushButton(parent, KermetaMessages.getString("KermetaPerspective.BROWSE"), null));	 //$NON-NLS-1$
        getFileLocationButton().addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent evt) {
                handleFileLocationButtonSelected();
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
        locationLayout.marginHeight = 10;
        locationLayout.marginWidth = 10;
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
     * Create the operation input zone
     * @param parent composite inside which this input zone is created
     * @param font
     */
    public void createArgumentsLayout(Composite parent, Font font)
    {
        // Create common layout basis
        createInputTextLayout(parent, "Operation arguments");
        
        argumentsText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        argumentsText.setLayoutData(gd);
        //argumentsText().setFont(font);
        argumentsText.addModifyListener(fBasicModifyListener);
        
        if (!operationNameText.isEnabled())
            argumentsText.setEnabled(false);
        else argumentsText.setEnabled(true);
        
    }
    
    /**
     * Action that is done when user clicked on the selection button of 
     * Operation name input Text.
     * TODO : (to check) enable it if, and only if, selectedClassString is assigned
     */
    protected void handleOperationNameButtonSelected()
    {
    	try{
	        IFile selectedFile = ResourceHelper.getIFile(fileLocationText.getText());
	        // Recompile kermeta source code
	        KermetaUnit selectedUnit = KermetaUnitChecker.check(selectedFile);
	        
	        if (selectedClassString == null){
	        	MessageDialog.openError(getShell(),"","Please select a class before searching for the operation ...");
	        	
	        	return;	        	
	        }
	        ClassDefinition selectedFClassDef = (ClassDefinition)selectedUnit.
	        getTypeDefinitionByName(
	                selectedClassString);
	        
	        // Get the operations of this class (super operation also?)
	        EList foperations = selectedFClassDef.getOwnedOperation();
	        ArrayList<String> opnamelist = new ArrayList<String>(foperations.size());
	        for (int i = 0; i< foperations.size(); i++)
	        {
	            opnamelist.add(((Operation)foperations.get(i)).getName());
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
    	catch (Exception e){
    		e.printStackTrace();
    	}
    }


    /**
     * Browse the current workspace so that user can select the source file that
     * he wants to execute.
     */
    protected void handleFileLocationButtonSelected()
    {   
		String selectedPath = handleBrowse(getFileLocationText());
		// Parse the selected file
		if (selectedPath!=null)
		{   // update the className and the operationName
		    try {
				parseFileAndUpdateFields(selectedPath);
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
		    //selectedUnit.saveAsXMIModel(selectedPath);
		}
		updateLaunchConfigurationDialog();
    }
    
    /**
     * Browse the current workspace so that user can select the source file that
     * he wants to execute.
     */
    protected void handleProjectLocationButtonSelected()
    {   
		selectedResource = handleBrowseProjects();
		updateLaunchConfigurationDialog();
    }
    
    
	/**
	 * Parse the file specified by current path (i.e. creates its Kermeta Unit)
	 * and update the fields of this configuration tab. The new configuration is not
	 * saved, so user must ask it explicitely (click on Apply) if he wants to. 
     * @param currentPath
	 * @throws URIMalformedException 
	 * @throws KermetaIOFileNotFoundException 
     */
    protected void parseFileAndUpdateFields(String currentPath) throws NotRegisteredURIException, URIMalformedException
    {
        IFile file = ResourceHelper.getIFile(currentPath);
        KermetaUnit selectedUnit = KermetaUnitChecker.check(file);
        Tag operation = ModelingUnitHelper.getMainOperation( selectedUnit );
	    Tag cls = ModelingUnitHelper.getMainClass( selectedUnit );

	    // maybe there is no tag
	    if(cls != null)
	    	selectedClassString = cls.getValue();
	    else
	    	selectedClassString = "";
	    String selectedOperationString = "";
	    if(operation != null)
	    	selectedOperationString = operation.getValue();
	    
        getFileLocationText().setText(currentPath);
        getclassNameText().setText(selectedClassString);
        getOperationNameText().setText(selectedOperationString);
        canSave();
    }

    /**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private IProject handleBrowseProjects() {
	    JavaElementLabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
	    
	    // Get the open projects (KermetaProject)
	    IProject[] projects = KermetaPlugin.getWorkspaceRoot().getProjects();
		ElementListSelectionDialog dialog =
			new ElementListSelectionDialog(getShell(), labelProvider);

		dialog.setTitle(KermetaMessages.getString("ArgTab.PROJECTSELECT"));
		dialog.setElements(projects);
		// Set the default selection to currently selected resource
		ISelection sresource = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (sresource instanceof IStructuredSelection)
		{ 
		    if (((IStructuredSelection)sresource).getFirstElement() instanceof IProject)
			{ dialog.setInitialSelections(new Object[] {((IStructuredSelection)sresource).getFirstElement()});}
		}

		if (dialog.open() == Window.OK)
		{		
			IProject result = (IProject) dialog.getFirstResult();
			projectLocationText.setText(result.getName());
			return result;
		}
		else
		{
		    return null;
		}
		
	}
    
    /**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private String handleBrowse(Text containerText) {
	    String resultPath = null;
	    // From which resource do we begin the selection?
	    if (selectedResource == null)
	    {
	        selectedResource = ResourcesPlugin.getWorkspace().getRoot(); 
	    }
	    
		ResourceSelectionDialog dialog =
			new ResourceSelectionDialog(getShell(),
			    selectedResource,
			    KermetaMessages.getString("ArgTab.FILESELECT")
			        );
		// Set the default selection to currently selected resource
		ISelection sresource = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
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
    	try{
	        // Reparse the selected file
	        IFile selectedFile = ResourceHelper.getIFile(fileLocationText.getText());
	        KermetaUnit selectedUnit = KermetaUnitChecker.check(selectedFile);
	        
	        // Get classes of root package, and recursively of child packages
	        Set <TypeDefinition> typedefs = KermetaUnitHelper.getTypeDefinitions( selectedUnit );
	        
	        
	        // Get all the classes defined in this Unit
	        ArrayList<String> qnameList = new ArrayList<String>(typedefs.size());
	        for ( TypeDefinition typeDefinition : typedefs )
	            qnameList.add(NamedElementHelper.getQualifiedName( typeDefinition ) );
	        
	        // if no classes found alert the user
	        if (qnameList.size() == 0) {
	        	org.eclipse.swt.widgets.MessageBox d = (new org.eclipse.swt.widgets.MessageBox(new Shell()));
	        	d.setMessage("Enabled to find any classes. The file may be incorrect. Please check for errors.");
	        	d.open();
	        } 
	        // otherwise we let the user choose the main class
	        else {
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
	    }
    	catch(Exception e)
    	{
    		System.err.print(e);
    		e.printStackTrace();
    	}
    }
    
    protected void setOperationEnabled(boolean isEnabled)
    {
        if (!isEnabled) {operationNameText.setText("");}
        operationNameButton.setEnabled(isEnabled);
        operationNameText.setEnabled(isEnabled);
        argumentsText.setEnabled(isEnabled);
        
    }

    protected void setClassEnabled(boolean isEnabled)
    {
        if (!isEnabled) {classNameText.setText("");}
        classNameButton.setEnabled(isEnabled);
        classNameText.setEnabled(isEnabled);
    }
 
    
    /**
     * Simple accessors 
     */
    
    private void setclassNameButton(Button button) {classNameButton = button;}
    private Button getclassNameButton() {return classNameButton;}
    public void setclassNameLabel(Label label) {classNameLabel = label;}
    public Label getclassNameLabel() {return classNameLabel ;}
    private Text getProjectLocationText() {return projectLocationText;}
    public Text  getFileLocationText() {return fileLocationText;}
    private void setFileLocationButton(Button button) {fileLocationButton = button;}
    
    public void setclassNameText(Text text) {classNameText = text;}
    public Text getclassNameText() {return classNameText;}
    private Text getOperationNameText() {return operationNameText;}
    public Text getArgumentsText() { return argumentsText;}

	public void setFileLocationLabel(Label label) {fileLocationLabel = label;}
    public Label getFileLocationLabel() {return fileLocationLabel ;}
    private Button getFileLocationButton() {return fileLocationButton;}
    public void setFileLocationText(Text text) {fileLocationText = text;}
    
	/**
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#canSave()
     */
    public boolean canSave() {
        return validateFileLocation();
    }

    /**
     * @return true if the selected file is a valid kermeta file, false otherwise
     * NOTE : do not put UI changes, otherwise, canSave() method will be called undefinitely
     */
    protected boolean validateFileLocation() {
    	IFile selectedFile = ResourceHelper.getIFile(fileLocationText.getText());		
    	if (selectedFile == null)
    	{
    		setErrorMessage(KermetaMessages.getString("ArgTab.INVALIDFILEERROR"));    			
    		return false;
    	}
        if (fileLocationText.getText().equals(""))
        {
            setErrorMessage(KermetaMessages.getString("ArgTab.NOFILEERROR"));
        	return false;
        }  
        if (classNameText.getText().equals("") || operationNameText.getText().equals(""))
        {
            setErrorMessage(KermetaMessages.getString("ArgTab.EMPTYFIELDSERROR"));
            return false;
        }
        setErrorMessage(null);
        return true;
    }
    
    
}
