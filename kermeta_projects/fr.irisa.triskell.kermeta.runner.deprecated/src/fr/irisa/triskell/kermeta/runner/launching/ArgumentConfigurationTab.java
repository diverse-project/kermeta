/* $Id: ArgumentConfigurationTab.java,v 1.2 2005-05-23 13:13:43 zdrey Exp $
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
import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.InputDialog;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.runner.dialogs.SelectionListDialog;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
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
    /** The class qualified name chosen by the user */
    private String selectedClassString = null;
    private Text operationNameText;
    private Button operationNameButton;
    
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
		createOperationNameLayout(area, null);


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

    
	/**
	 * When the button "Apply" is pushed, this method is launched
	 * The configuration is saved.
	 * INPUT, OUTPUT and PATH
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
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

    
    public Composite createFileLayout(Composite parent, Font font)
    {
        GridLayout locationLayout = new GridLayout();
        locationLayout.numColumns = 2;
        locationLayout.marginHeight = 0;
        locationLayout.marginWidth = 0;
        parent.setLayout(locationLayout);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        parent.setLayoutData(gd);
        parent.setFont(font);
        
        setSharedLocationLabel(new Label(parent, SWT.NONE));
        getSharedLocationLabel().setText("Location of Kermeta"); //$NON-NLS-1$
        gd = new GridData();
        gd.horizontalSpan = 2;
        getSharedLocationLabel().setLayoutData(gd);
        getSharedLocationLabel().setFont(font);
        
        setSharedLocationText(new Text(parent, SWT.SINGLE | SWT.BORDER));
        gd = new GridData(GridData.FILL_HORIZONTAL);
        getSharedLocationText().setLayoutData(gd);
        getSharedLocationText().setFont(font);
        getSharedLocationText().addModifyListener(fBasicModifyListener);
        
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
        classNameText.addModifyListener(fBasicModifyListener);
        
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
        System.err.println("class string is '"+selectedClassString+"'"+"; unit:"+selectedUnit);
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
        
		FileDialog dialog = new FileDialog(getShell());
		IPath path = null;
		
		String currentContainerString = getSharedLocationText().getText();
		IContainer currentContainer = getContainer(currentContainerString);
		if (currentContainer != null) {
		    path = currentContainer.getFullPath();
		}
		//dialog.setFilterPath(path.toOSString());
		dialog.open();
		String[] results = dialog.getFileNames();
		
		if ((results != null)
		        && (results.length > 0)) {
		    // FIXME : Path should be adapted to the platform
			selectedPath = dialog.getFilterPath()+"/"+results[0];
			getSharedLocationText().setText(selectedPath);
		}		
        
		// Parse the selected file
		if (selectedPath!=null)
		{
		    selectedUnit = KermetaRunHelper.parse(selectedPath);
		    //selectedUnit.saveAsXMIModel(selectedPath);
		}
		else
		{
		    System.err.println("Could not find the file");
		}
		
    }
    
    /***
     * Clicking on this button gets the list of available classes in the
     * given source file
     */
    private void handleClassNameButtonSelected()
    {
        // Parse selectedUnit
        // TODO Handle null pointer exception
//        List classDefinitionList = createClassList(getShell(), selectedUnit);
        EList typedefs = selectedUnit.rootPackage.getFOwnedTypeDefinition();
        ArrayList qnameList = new ArrayList(typedefs.size());
        for (int i=0; i<typedefs.size(); i++)
        {
            qnameList.add(selectedUnit.getQualifiedName((FNamedElement)typedefs.get(i)));
        }
        
        SelectionListDialog classDialog = new SelectionListDialog(getShell());
        classDialog.setList(qnameList);
        int code = classDialog.open();
        selectedClassString = classDialog.getSelectedItem();
        // If user clicked on OK
        if (code == InputDialog.OK)
        {
            getclassNameText().setText(selectedClassString);   
        }
        
        // selectedClassString is null?
        if (selectedClassString != null)
        {
            operationNameButton.setEnabled(true);
            operationNameText.setEnabled(true);
        }
        // Else, throw an error!!
        
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
    
	public List createClassList(Composite parent, KermetaUnit unit)
    {
        EList typedefs = unit.rootPackage.getFOwnedTypeDefinition();
        
        final List list = new List(parent, SWT.V_SCROLL);
        for (int i = 0; i < typedefs.size(); i++) 
        {
            list.add(i+". "+unit.getQualifiedName((FClassDefinition)typedefs.get(i)));
        }
        list.addSelectionListener(
                new SelectionAdapter()
                {
                    public void widgetSelected(SelectionEvent e)
                    {
                        List list = (List) e.getSource();
                        String[] str = list.getSelection();
                    }
                }
    );
        return list;
    }
}
