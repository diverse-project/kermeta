/* $Id: ArgumentConfigurationTab.java,v 1.19 2005-08-26 16:01:16 zdrey Exp $
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
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.dialogs.SelectionListDialog;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;

import fr.irisa.triskell.kermeta.KermetaMessages;
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
};;
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
    /** The path selected by the user through the "Browse" action*/
    private String selectedPath = "";
    /** The class qualified name chosen by the user */
    private String selectedClassString = null;
    /** The text widget for the selection of a Kermeta operation */
    private Text operationNameText;
    /** The button to click on in order to select an operation*/
    private Button operationNameButton;
    
    // NOTE : pas mis en cause dans le OUTOFMEMORY
    public ArgumentConfigurationTab() {
        super();
        filenameString = getWorkspaceRoot().getLocation().toString();
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
        String currentProjectPath = "";
        String storedPath = "";
        IFile selectedFile = null;
       // KermetaUnit lselectedUnit = null;
        
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
		    storedPath = configuration.getAttribute(KermetaLaunchConfiguration.KM_FILENAME,
            "");
		    selectedFile = getIFileFromString(storedPath);
		    
		    // Create the Unit corresponding to the chosen Kermeta file
		    // (either the SelectedResource one, or the path of current configuration)*
		  //  if (selectedFile != null)
		  //  {
		  //      lselectedUnit = KermetaRunHelper.parse(selectedFile);
		  //  }
		    // selectedUnit can be null : if selected file is not valid
		  //  if (lselectedUnit != null)
		  //  {
		  //      ArrayList point = KermetaRunHelper.findEntryPoint(lselectedUnit);
		  //      selectedClassString = (String)point.get(0);
		  //      selectedOperationString = (String)point.get(1);
		        
		        getProjectLocationText().setText(configuration.getAttribute(KermetaLaunchConfiguration.KM_PROJECTNAME,
		                currentProjectPath));
		        
		        getFileLocationText().setText(configuration.getAttribute(KermetaLaunchConfiguration.KM_FILENAME,
		                storedPath));
		        
		        getclassNameText().setText(
		                configuration.getAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME,
		                        ""));
		        if (getclassNameText().getText().compareTo("")==0 )
		        {
		        	getclassNameText().setText(getDefaultClass(selectedFile));
		        }
		        getOperationNameText().setText(
		                configuration.getAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME,
		                        ""));
		        if (getOperationNameText().getText().compareTo("")==0 )
		        {
		        	getOperationNameText().setText(getDefaultOperation(selectedFile));
		        }
		        
		   // }
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
    protected String getDefaultClass(IFile selectedFile)
    {
    	String defaultClassName = "";
    	if(kunit == null && selectedFile != null)
    	{
    		kunit = KermetaRunHelper.parse(selectedFile);
    	}
    	if (kunit != null)
  		{
    		ArrayList point = KermetaRunHelper.findEntryPoint(kunit);
  		    defaultClassName = (String)point.get(0);
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
    		kunit = KermetaRunHelper.parse(selectedFile);
    	}
    	if (kunit != null)
  		{
    		ArrayList point = KermetaRunHelper.findEntryPoint(kunit);
  		    defaultOperationName = (String)point.get(1);
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
        //updateConfigFromLocalShared(configuration); nullpointerexception->works when config stored in afile
        
		configuration.setAttribute(KermetaLaunchConfiguration.KM_FILENAME, fileLocationText.getText());
		configuration.setAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME, classNameText.getText());
		configuration.setAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME, operationNameText.getText());
		configuration.setAttribute(KermetaLaunchConfiguration.KM_PROJECTNAME, projectLocationText.getText());
		
    }
    
    
    
    /***
     * Update configuration
     * @param config
     */
	private void updateConfigFromLocalShared(ILaunchConfigurationWorkingCopy config) {
		String containerPathString = getFileLocationText().getText();
		IContainer container = getContainer(containerPathString);
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
     * Action that is done when user clicked on the selection button of 
     * Operation name input Text.
     * TODO : (to check) enable it if, and only if, selectedClassString is assigned
     */
    protected void handleOperationNameButtonSelected()
    {
        IFile selectedFile = getIFileFromString(fileLocationText.getText());
        // Recompile kermeta source code
        KermetaUnit selectedUnit = KermetaRunHelper.parse(selectedFile);
        
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
    protected void handleFileLocationButtonSelected()
    {   
		String selectedPath = handleBrowse(getFileLocationText());
		// Parse the selected file
		if (selectedPath!=null)
		{   // update the className and the operationName
		    parseFileAndUpdateFields(selectedPath);
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
     */
    protected void parseFileAndUpdateFields(String currentPath)
    {
        IFile file = getIFileFromString(currentPath);
        KermetaUnit selectedUnit = KermetaRunHelper.parse(file);
	    ArrayList point = KermetaRunHelper.findEntryPoint(selectedUnit);
	    selectedClassString = (String)point.get(0);
	    String selectedOperationString = (String)point.get(1);
	    
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
	    String resultPath = null;
	    //LabelProvider labelProvider = new KermetaLabelProvider();
	    JavaElementLabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
	    
	    // Get the open projects (KermetaProject)
	    IProject[] projects = getWorkspaceRoot().getProjects();
		ElementListSelectionDialog dialog =
			new ElementListSelectionDialog(getShell(), labelProvider);

		dialog.setTitle(KermetaMessages.getString("ArgTab.PROJECTSELECT"));
		dialog.setElements(projects);
		// Set the default selection to currently selected resource
		ISelection sresource = RunnerPlugin.getActiveWorkbenchWindow().getSelectionService().getSelection();
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

        // Reparse the selected file
        IFile selectedFile = getIFileFromString(fileLocationText.getText());
        KermetaUnit selectedUnit = KermetaRunHelper.parse(selectedFile);
        
        // Get classes of root package, and recursively of child packages
        ArrayList typedefs = new ArrayList();

        KermetaRunHelper.getRecursivePackageTypeDefs(selectedUnit.rootPackage, typedefs);
        
        
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

    public void setFileLocationLabel(Label label) {fileLocationLabel = label;}
    public Label getFileLocationLabel() {return fileLocationLabel ;}
    private Button getFileLocationButton() {return fileLocationButton;}
    public void setFileLocationText(Text text) {fileLocationText = text;}
    

    
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
	
	protected IFile getIFileFromString(String filepath)
	{
	    IFile selectedFile = null;
	    IResource iresource = getWorkspaceRoot().findMember(filepath);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    return selectedFile;
	}

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
        /*if (selectedUnit == null)
        {
            setErrorMessage(KermetaMessages.getString("ArgTab.COULDNOTLOADUNITERROR"));
        	return false;
        }*/
    	/*try
		{*/
    		IFile selectedFile = getIFileFromString(fileLocationText.getText());		
    		if (selectedFile == null)
    		{
    			setErrorMessage(KermetaMessages.getString("ArgTab.INVALIDFILEERROR"));    			
    			return false;
    		}/*
		}
    	catch (Exception e)
		{
    		setErrorMessage(KermetaMessages.getString("ArgTab.INVALIDFILEERROR"));
			return false;
		}*/
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
