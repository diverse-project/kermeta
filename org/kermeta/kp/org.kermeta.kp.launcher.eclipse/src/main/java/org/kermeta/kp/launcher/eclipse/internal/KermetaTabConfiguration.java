package org.kermeta.kp.launcher.eclipse.internal;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.texteditor.eclipse.nature.Activator;

public class KermetaTabConfiguration extends AbstractLaunchConfigurationTab {
	 
    public IProject selectedProject = null;
    public IFile selectedKP = null;
    public int GRID_DEFAULT_WIDTH = 200;
    public IAdaptable selectedResource = null;  
    
    /** Basic modify listener stolen from CommonTab source*/
    private ModifyListener fBasicModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();			
		}
    };
    
    /** Listener for class Name modification */
    private ModifyListener fClassModifyListener = new ModifyListener() {
    	public void modifyText(ModifyEvent evt) {
    		canSave();
    		updateLaunchConfigurationDialog();
    		if (mainClassText!=null && mainClassText.getText().length()>0) {
    			setOperationEnabled(true);
    			setArgumentsEnabled(true);
    			presetMainOperationField();
    		}
    		else {
    			setOperationEnabled(false);
    			setArgumentsEnabled(false);
    		}
    	}
    };
    
    /** Listener for file nape modification */
    private ModifyListener fKpFileModifyListener = new ModifyListener() {
    	public void modifyText(ModifyEvent evt) {
    		updateLaunchConfigurationDialog();
    		if (kpFileLocationText!=null && kpFileLocationText.getText().length()>0) {
    			setClassEnabled(true);
    			presetMainClassField();
    		}
    		else {
    			setClassEnabled(false);
    			setOperationEnabled(false);
    			setArgumentsEnabled(false);
    		}
    	}
    };
    
    /** Listener for project modification */
    private ModifyListener fProjectModifyListener = new ModifyListener() {
    	public void modifyText(ModifyEvent evt) {
    		updateLaunchConfigurationDialog();
    		if (projectLocationText!=null && projectLocationText.getText().length()>0) {
    			setKpFileEnabled(true);
    			presetKPFileField();
    		} else {
    			setKpFileEnabled(false);
    			setClassEnabled(false);
    			setOperationEnabled(false);
    			setArgumentsEnabled(false);
    		}
    	}
    };
   
    private Label kpFileLocationLabel;
    private Text kpFileLocationText;
    private Button kpFileLocationButton;
    
    private Label mainClassLabel;
    private Text mainClassText;
    private Button mainClassButton;
    
    private Text mainOperationText;
    private Button mainOperationButton;
    
    private Text projectLocationText;
    private Text argumentsText;
    
    public KermetaTabConfiguration() {
        super();
    }

    @Override
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
		paramArea.setText("Run parameters :");
		paramArea.setLayout(new FillLayout());
		
		// Create the area for the filename to get
		createKPFileLayout(paramArea, null);
		
		// Create the area for the classQualifiedName
		createClassNameLayout(paramArea, null);
		
		// Set the field for the operation choice
		createOperationNameLayout(paramArea, null);
		
		createArgumentsLayout(paramArea, null);

		Composite checkconstraintArea = new Composite(area, SWT.SINGLE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		checkconstraintArea.setLayout( layout );
		
        setKpFileEnabled(false);
        setClassEnabled(false);
        setOperationEnabled(false);
        setArgumentsEnabled(false);

    }

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

    }

    @Override
    public void initializeFrom(ILaunchConfiguration configuration)
    {	  
        String currentProjectPath = "";

		try
		{

		    getProjectLocationText().setText(configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PROJECT,currentProjectPath));
		    if (getProjectLocationText().getText().length() == 0) {
		    	IResource selectedResource = DebugUITools.getSelectedResource();
		    	if (!(selectedResource instanceof IProject)) {
		    		selectedResource = selectedResource.getProject();
		    	}
		    	if (selectedResource instanceof IProject) {
		    		if (((IProject) selectedResource).hasNature(Activator.NATURE_ID)) {
		    			selectedProject = (IProject) selectedResource;
			    		getProjectLocationText().setText(selectedResource.getName());
		    		}
		    	}
		    } else {
		    	ArrayList<IProject> projects = getWorkspaceProject(getProjectLocationText().getText());
		    	if (projects.size() > 0) {
		    		selectedProject = projects.get(0);
		    		//To provoque the autofill of others fileds
		    		getProjectLocationText().setText(getProjectLocationText().getText());
		    	}
		    }
		    getArgumentsText().setText(configuration.getAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PARAMETERS, ""));
		    canSave();
		}
		catch (CoreException e)
		{
		    e.printStackTrace();
		}
		catch (Throwable e)
		{
		    String errorMsg = "";
		    setKpFileEnabled(false);
	        setClassEnabled(false);
	        setOperationEnabled(false);
	        setArgumentsEnabled(false);
	        if (!errorMsg.equals(""))
	            MessageDialog.openInformation(
					new Shell(),
					"Kermeta parse error, ",
					errorMsg+":\n"+e.getMessage());
				e.printStackTrace();
	        
		}

    }

    
    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_KP_FILE, KermetaBuilder.getDefault().generateIdentifier(selectedKP));
		configuration.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_MAIN_CLASS, mainClassText.getText());
		configuration.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_MAIN_OPERATION, mainOperationText.getText());
		configuration.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PARAMETERS, argumentsText.getText());
		configuration.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PROJECT, projectLocationText.getText());
   }
    
    

	@Override
    public String getName() {
		return "Kermeta launcher configuration";
	}
    
	@Override
    public Image getImage() {
        return ImageDescriptor.createFromFile(KermetaTabConfiguration.class, "/icons/kermeta.gif").createImage();
    }
    
    
    /***
     * Create the Field where user enters file to execute
     * @param parent
     * @param font
     * @return
     */
    public Composite createProjectLayout(Composite parent, Font font)
    {
        createInputTextLayout(parent, "Kermeta project");
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        //gd.horizontalSpan = 1;
        gd.widthHint = GRID_DEFAULT_WIDTH;
        // Create the project selector button
        
        // Project location text
        projectLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        projectLocationText.setLayoutData(gd);
        projectLocationText.setFont(font);
        projectLocationText.addModifyListener(fBasicModifyListener);
        projectLocationText.addModifyListener(fProjectModifyListener);
        Button projectLocationButton = createPushButton(parent, "Browse", null);
        projectLocationButton.addSelectionListener(new SelectionAdapter() 
                {
                	public void widgetSelected(SelectionEvent evt)
                	{
                		handleProjectLocationButtonSelected();
                	}
                });
        return parent;
    }
    
    /**
     * Browse the current workspace so that user can select the source file that
     * he wants to execute.
     */
    protected void handleProjectLocationButtonSelected()
    {   
		handleBrowseProjects();
		updateLaunchConfigurationDialog();
    }
    
    /**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private void handleBrowseProjects() {
	    JavaElementLabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
	    
	    // Get the open projects (KermetaProject)
	    ArrayList<IProject> projects = getWorkspaceProject("");

		ElementListSelectionDialog dialog =
			new ElementListSelectionDialog(getShell(), labelProvider);

		dialog.setTitle("Choose kermeta project");
		dialog.setElements(projects.toArray());
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
			selectedProject = result;
			projectLocationText.setText(result.getName());
		}
		else
		{
		    selectedProject = null;
		    projectLocationText.setText("");
		}
		
	}

	private ArrayList<IProject> getWorkspaceProject(String name) {
		ArrayList<IProject> projects = new ArrayList<IProject>();
	    for (IProject aProject : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
	    	try {
		    	if (aProject.hasNature(Activator.NATURE_ID)) {
		    		if (name.equals("") || aProject.getName().equals(name)) {
		    			projects.add(aProject);
		    		}
		    	}
	    	}
		    catch(CoreException e){}
	    }
		return projects;
	}
	
	private void presetKPFileField() {
		try {
			if (projectLocationText.getText().length() > 0) {
				if (selectedProject != null) {
					ArrayList<IFile> identifiedKp = new ArrayList<IFile>();
					KermetaBuilder.getDefault().findKPinProject(selectedProject, identifiedKp);
					if (identifiedKp.size() > 0) {
						selectedKP = identifiedKp.get(0);
						kpFileLocationText.setText(identifiedKp.get(0).getName());
					}
				}
			}
		} catch(CoreException e){}
	}
	
	private void presetMainClassField() {
		if (kpFileLocationText.getText().length() > 0) {
			if (selectedKP != null) {
				mainClassText.setText(KermetaBuilder.getDefault().getDefaultMainClass(selectedKP));
			}
		}
	}
	
	private void presetMainOperationField() {
		if (kpFileLocationText.getText().length() > 0) {
			if (selectedKP != null) {
				mainOperationText.setText(KermetaBuilder.getDefault().getDefaultMainOperation(selectedKP));
			}
		}
	}
    
    /***
     * Create the Field where user enters file to execute
     * @param parent
     * @param font
     * @return
     */
    public Composite createKPFileLayout(Composite parent, Font font)
    {
        createInputTextLayout(parent, "KP file to use ");
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        
        setKpFileLocationText(new Text(parent, SWT.SINGLE | SWT.BORDER));
        getKPFileLocationText().setLayoutData(gd);
        getKPFileLocationText().setFont(font);
        getKPFileLocationText().addModifyListener(fKpFileModifyListener);
        setKPFileLocationButton(createPushButton(parent, "Browse", null));	 //$NON-NLS-1$
        getKpFileLocationButton().addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent evt) {
            	handleKPFileLocationButtonSelected();
            }
        });	
        return parent;
    }
 
    
    protected void handleKPFileLocationButtonSelected()
    {   
		handleBrowseKPFiles();
		updateLaunchConfigurationDialog();
    }

	private void handleBrowseKPFiles() {
	    JavaElementLabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
	    
	    // Get the open projects (KermetaProject)
	    ArrayList<IFile> kpFiles = new ArrayList<IFile>();
	    try {
			KermetaBuilder.getDefault().findKPinProject(selectedProject, kpFiles);
		} catch (CoreException e) {}

		ElementListSelectionDialog dialog =
			new ElementListSelectionDialog(getShell(), labelProvider);

		dialog.setTitle("Choose kp file");
		dialog.setElements(kpFiles.toArray());
		// Set the default selection to currently selected resource
		ISelection sresource = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (sresource instanceof IStructuredSelection)
		{ 
		    if (((IStructuredSelection)sresource).getFirstElement() instanceof IProject)
			{ dialog.setInitialSelections(new Object[] {((IStructuredSelection)sresource).getFirstElement()});}
		}

		if (dialog.open() == Window.OK)
		{		
			IFile result = (IFile) dialog.getFirstResult();
			selectedKP = result;
			kpFileLocationText.setText(result.getName());
		}
		else
		{
			selectedKP = null;
			kpFileLocationText.setText("");
		}
		
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
        createInputTextLayout(parent, "Main class");
        
        mainClassText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        mainClassText.setLayoutData(gd);
        //classNameText().setFont(font);
        mainClassText.addModifyListener(fClassModifyListener);
        
        mainClassButton = createPushButton(parent, "Search...", null);	 //$NON-NLS-1$
        mainClassButton.addSelectionListener(
                new SelectionAdapter() {
        			public void widgetSelected(SelectionEvent evt) {
        					//TODO not implemented : Search all main classes
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
        
        mainOperationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        mainOperationText.setLayoutData(gd);
        //operationNameText().setFont(font);
        mainOperationText.addModifyListener(fBasicModifyListener);
        
        mainOperationButton = createPushButton(parent, "Search...", null);	 //$NON-NLS-1$
        mainOperationButton.addSelectionListener(
                new SelectionAdapter() {
        			public void widgetSelected(SelectionEvent evt) {
        		    	
        				}
                }
        );
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
    }      
   
    protected void setOperationEnabled(boolean isEnabled) {
        if (!isEnabled) {
        	mainOperationText.setText("");
        }
        mainOperationButton.setEnabled(isEnabled);
        mainOperationText.setEnabled(isEnabled);
    }

    protected void setClassEnabled(boolean isEnabled) {
        if (!isEnabled) {
        	mainClassText.setText("");
        }
        mainClassButton.setEnabled(isEnabled);
        mainClassText.setEnabled(isEnabled);
    }
    
    protected void setKpFileEnabled(boolean isEnabled) {
        if (!isEnabled) {
        	kpFileLocationText.setText("");
        }
        kpFileLocationButton.setEnabled(isEnabled);
        kpFileLocationText.setEnabled(isEnabled);
    }
    
    protected void setArgumentsEnabled(boolean isEnabled) {
    	if (!isEnabled) {
    		argumentsText.setText("");
    	}
    	argumentsText.setEnabled(isEnabled);
    }
 
    
    /**
     * Simple accessors 
     */
    public void setMainClassNameLabel(Label label) {mainClassLabel = label;}
    public Label getMainClassNameLabel() {return mainClassLabel ;}
    
    private Text getProjectLocationText() {return projectLocationText;}
    
    public Text  getKPFileLocationText() {return kpFileLocationText;}
    private void setKPFileLocationButton(Button button) {kpFileLocationButton = button;}
    
    public void setMainClassNameText(Text text) {mainClassText = text;}
    public Text getMainClassNameText() {return mainClassText;}
    private Text getOperationNameText() {return mainOperationText;}
    public Text getArgumentsText() { return argumentsText;}

	public void setKpFileLocationLabel(Label label) {kpFileLocationLabel = label;}
    public Label getKpFileLocationLabel() {return kpFileLocationLabel ;}
    private Button getKpFileLocationButton() {return kpFileLocationButton;}
    public void setKpFileLocationText(Text text) {kpFileLocationText = text;}
       
}
