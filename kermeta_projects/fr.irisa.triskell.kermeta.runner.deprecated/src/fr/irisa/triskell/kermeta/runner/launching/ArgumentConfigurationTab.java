/* $Id: ArgumentConfigurationTab.java,v 1.1 2005-05-20 17:06:49 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: ArgumentConfigurationTab.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 20, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationsMessages;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.FileSelectionDialog;

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;
/**
 * 
 */
public class ArgumentConfigurationTab extends AbstractLaunchConfigurationTab {

    /**
     * The elements that compose this Tab window
     *
     */
    protected Text sourceFileText;
    protected String filenameString = "No file given";
    protected Text classQualifiedNameText;
    protected String classQualifiedNameString = "No class given";
    protected Text defaultOperationText;
    protected String defaultOperationString = "No operation given";
    
    public KermetaUnit selectedUnit;
    
    /**
     * The labels to move in a .properties file
     *
     */
    public String SOURCEFILE="File";
    /** Stolen from CommonTab source*/
    private ModifyListener fBasicModifyListener = new ModifyListener() {
		public void modifyText(ModifyEvent evt) {
			updateLaunchConfigurationDialog();
		}
};;
    private Label sharedLocationLabel;
    private Text sharedLocationText;
    private Button sharedLocationButton;
    private Button classNameButton;
    private Label classNameLabel;
    private Text classNameText;
    private String selectedPath;
    
    /**
     * 
     */
    public ArgumentConfigurationTab() {
        super();
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
		


    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeFrom(ILaunchConfiguration configuration) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() {
        
        return "Argument configuration";
    }

    
    public Composite createFileLayout(Composite locationComp, Font font)
    {
        GridLayout locationLayout = new GridLayout();
        locationLayout.numColumns = 2;
        locationLayout.marginHeight = 0;
        locationLayout.marginWidth = 0;
        locationComp.setLayout(locationLayout);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        locationComp.setLayoutData(gd);
        locationComp.setFont(font);
        
        setSharedLocationLabel(new Label(locationComp, SWT.NONE));
        getSharedLocationLabel().setText("Location of Kermeta"); //$NON-NLS-1$
        gd = new GridData();
        gd.horizontalSpan = 2;
        getSharedLocationLabel().setLayoutData(gd);
        getSharedLocationLabel().setFont(font);
        
        setSharedLocationText(new Text(locationComp, SWT.SINGLE | SWT.BORDER));
        gd = new GridData(GridData.FILL_HORIZONTAL);
        getSharedLocationText().setLayoutData(gd);
        getSharedLocationText().setFont(font);
        getSharedLocationText().addModifyListener(fBasicModifyListener);
        
        setSharedLocationButton(createPushButton(locationComp, "Browse", null));	 //$NON-NLS-1$
        getSharedLocationButton().addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent evt) {
                handleSharedLocationButtonSelected();
            }
        });	
        return locationComp;
    }
 
    
    

    public void createClassNameLayout(Composite locationComp, Font font)
    {
        GridLayout locationLayout = new GridLayout();
        locationLayout.numColumns = 2;
        locationLayout.marginHeight = 0;
        locationLayout.marginWidth = 0;
        locationComp.setLayout(locationLayout);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        locationComp.setLayoutData(gd);
        locationComp.setFont(font);
        
        setclassNameLabel(new Label(locationComp, SWT.NONE));
        getclassNameLabel().setText("Class qualified name"); //$NON-NLS-1$
        gd = new GridData();
        gd.horizontalSpan = 2;
        getclassNameLabel().setLayoutData(gd);
        getclassNameLabel().setFont(font);
        
        setclassNameText(new Text(locationComp, SWT.SINGLE | SWT.BORDER));
        gd = new GridData(GridData.FILL_HORIZONTAL);
        getclassNameText().setLayoutData(gd);
        getclassNameText().setFont(font);
        getclassNameText().addModifyListener(fBasicModifyListener);
        
        setclassNameButton(createPushButton(locationComp, "Search...", null));	 //$NON-NLS-1$
        getclassNameButton().addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent evt) {
                handleclassNameButtonSelected();
            }
        });	
    }
    

    /**
     * Browse the current workspace so that user can select the source file that
     * he wants to execute.
     */
    protected void handleSharedLocationButtonSelected()
    {
        
		FileDialog dialog = new FileDialog(getShell());
		IPath path = null;
		
		String currentContainerString = getSharedLocationText().getText();
		IContainer currentContainer = getContainer(currentContainerString);
		if (currentContainer != null) {
			path = currentContainer.getFullPath();
		}
		
		dialog.open();
		String[] results = dialog.getFileNames();
		
		if ((results != null)
		        && (results.length > 0)) {
			selectedPath = results[0];
			System.out.println("Path : "+dialog.getFilterPath()+":"+selectedPath);
			getSharedLocationText().setText(selectedPath);
		}		
        
		// Parse the selected file
		if (selectedPath!=null)
		{
		    selectedUnit = parse(dialog.getFilterPath()+selectedPath);
		    //System.out.println("toto:"+selectedUnit.get_ROOT_TYPE_ClassDefinition());
		}
		
    }
    
    /***
     * Clicking on this button gets the list of available classes in the
     * given source file
     */
    private void handleclassNameButtonSelected() {
        // 
        
    }

    /**
     * @param button
     */
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
     * @param button
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
    
	
	/**
	 * FIXME : move it to another class (also used in RunPopupDialog!!)
	 * Parse the given file and return its KermetaUnit
	 * @param file
	 * @return KermetaUnit the compilation unit for the given file
	 */
    public KermetaUnit parse(String filename)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta.runner/lib/framework.km";

    	StructurePackageImpl.init();
    	BehaviorPackageImpl.init();
    	String uri = "platform:/resource/" + filename;
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.load();
	        
	        result.typeCheck();
	        
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error ", e);
        	if (result == null) {
        		e.printStackTrace();
        		return null;
        	}
        	else if (result.error.size() == 0)
        		result.error.add(new KMUnitError("INTERNAL ERROR : " + e, null));
        }
        return result;
    }
	
}
