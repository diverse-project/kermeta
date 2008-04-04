package org.kermeta.prototyper.editor.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.kermeta.prototyper.adapters.KermetaAdapter;
import org.kermeta.prototyper.editor.composite.TableViewerComposite;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.provider.StructureItemProviderAdapterFactory;

import org.topcased.tabbedproperties.AbstractTabbedPropertySheetPage;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;
import org.kermeta.prototyper.editor.properties.sections.AbstractTabbedPropertySection;

/**
 * A section featuring a combo box with a seach button. This section<br>
 * displays single references.
 *
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated NOT
 */
public class EObjectSection extends AbstractTabbedPropertySection {
	
	/**
     * The list control for the section
     */
    private TableViewerComposite table;
	
    /**
     * The group Details
     */
    private Group groupDetails;
    
    /**
     * The group Details
     */
    private Group groupResult;
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#getLabelText()
	 * @generated NOT
	 */
	protected String getLabelText() {
		return "Kermeta operations";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#getFeature()
	 * @generated NOT
	 */
	protected EStructuralFeature getFeature() {
		return StructurePackage.eINSTANCE.getClassDefinition_OwnedOperation();
	}


	/*******************************************************************/
	/*******************************************************************/
	/*******************************************************************/
	/*******************************************************************/
	/*******************************************************************/
	
    /**
     * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
     */
    public void createControls(Composite parent, AbstractTabbedPropertySheetPage aTabbedPropertySheetPage)
    {
        super.createControls(parent, aTabbedPropertySheetPage);
    }

    /**
     * Create the TableViewer composite
     */
    protected void createWidgets(Composite composite)
    {
    	table = new TableViewerComposite(composite, new String[] {getLabelText()}, getWidgetFactory())
        {
            public void updateSelectedItem(Object data)
            {
                updateSelection(data);
            }
        };
        table.setLabelProvider(getLabelProvider());

        if (getFeature() != null)
        {
            table.setEnabled(getFeature().isChangeable());
        }
        
        groupDetails = getWidgetFactory().createGroup(composite, "Input parameters");
        groupDetails.setLayout(new GridLayout());
        createGroupContents(groupDetails);
        
        /*groupResult = getWidgetFactory().createGroup(composite, "Result");
        groupResult.setLayout(new GridLayout());
        createGroupContents(getResultControl(groupResult));*/
    }

    private IBaseLabelProvider getLabelProvider() {
    	return new TabbedPropertiesLabelProvider(new StructureItemProviderAdapterFactory());
	}

	/**
     * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#setSectionData(org.eclipse.swt.widgets.Composite)
     */
    protected void setSectionData(Composite composite)
    {
        FormData data;
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, 0);
        table.setLayoutData(data);
    
        FormData dataGroupDetails = new FormData();
        dataGroupDetails.left = new FormAttachment(0, 0);
        dataGroupDetails.right = new FormAttachment(100, 0);
        dataGroupDetails.top = new FormAttachment(getTable(), ITabbedPropertyConstants.VSPACE);
        groupDetails.setLayoutData(dataGroupDetails);
        
        /*FormData dataGroupResult = new FormData();
        dataGroupResult.left = new FormAttachment(0, 0);
        dataGroupResult.right = new FormAttachment(100, 0);
        dataGroupResult.top = new FormAttachment(groupDetails, ITabbedPropertyConstants.VSPACE);
        groupResult.setLayoutData(dataGroupResult);*/
        
    }
    
    private Control[] getParametersControl(Composite parent) {
    	
    	Control[] controlToAdd = null;
    	
    	TabbedPropertySheetWidgetFactory widgetFactory = getWidgetFactory();
	    Composite composite = widgetFactory.createComposite(parent);
	    composite.setLayout(new GridLayout(2, false));
	    composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
        widgetFactory.createLabel(composite, "Parameter 1: ");
        parameter1 = widgetFactory.createText(composite, "", SWT.BORDER);
        controlToAdd[0] = parameter1;
        
        widgetFactory.createLabel(composite, "Parameter 2: ");
        parameter2 = widgetFactory.createText(composite, "", SWT.BORDER);
        controlToAdd[1] = parameter2;
        
        return controlToAdd;
    }
    
    private Control[] getResultControl(Composite parent) {
    	
    	Control[] controlToAdd = null;
    	
    	TabbedPropertySheetWidgetFactory widgetFactory = getWidgetFactory();
	    Composite composite = widgetFactory.createComposite(parent);
	    composite.setLayout(new GridLayout(1, false));
	    composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
        widgetFactory.createLabel(composite, "Result: ");
        resultField = widgetFactory.createText(composite, "", SWT.BORDER);
        controlToAdd[0] = resultField;
        
        return controlToAdd;
    }

    private Text parameter1;
    private Text parameter2;
    private Text resultField;
    
    /**
	 * Create the group contents
	 * 
	 * @param parent the parent Composite
	 */
	protected void createGroupContents(Composite parent)
	{   
		TabbedPropertySheetWidgetFactory widgetFactory = getWidgetFactory();
	    Composite composite = widgetFactory.createComposite(parent);
	    composite.setLayout(new GridLayout(2, false));
	    composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
        widgetFactory.createLabel(composite, "Parameter 1: ");
        parameter1 = widgetFactory.createText(composite, "", SWT.BORDER);
        parameter1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        widgetFactory.createLabel(composite, "Parameter 2: ");
        parameter2 = widgetFactory.createText(composite, "", SWT.BORDER);
        parameter2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}
    
	/**
	 * Create the group contents
	 * 
	 * @param parent the parent Composite
	 */
	protected void createGroupContentsOld(Control[] controlToAdd)
	{   
	    for(int i=0; i<controlToAdd.length; i++) {
	    	controlToAdd[i].setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    }
	}


    /**
     * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#hookListeners()
     */
    protected void hookListeners()
    {
        table.setAddListener(new SelectionAdapter()
        {
            public void widgetSelected(SelectionEvent event)
            {
                addElement();
            }
        });
        

  /*      // Add the Listener for the eparameter name
        TextChangeHelper parameterNameListener = new TextChangeHelper()
        {
            public void textChanged(Control control)
            {
                String newText = parameter1.getText();
                EParameter parameter = (EParameter) getTable().getSelectionItem();
                if (parameter != null && !newText.equals(parameter.getName()))
                {
                    getEditingDomain().getCommandStack().execute(SetCommand.create(getEditingDomain(), parameter, EcorePackage.eINSTANCE.getENamedElement_Name(), newText));
                }
                refresh();
            }
        };
        parameterNameListener.startListeningTo(parameterNameTxt);
        parameterNameListener.startListeningForEnter(parameterNameTxt);
*/
    }

    /**
     * This method may be overrided if client want to implement their own add treatment
     * 
     */
    protected void addElement()
    {
    	table.addElement();
    }

    /**
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#refresh()
     */
    public void refresh()
    {
    	table.setInput(getEObject(), getFeature());
    	table.setEditingDomain(getEditingDomain());
    	table.refresh();
    	
    	parameter1.setText("");
    }

    /**
     * @return the table
     */
    public TableViewerComposite getTable()
    {
        return table;
    }

    /**
     * Set the table
     * 
     * @param table
     */
    protected void setTable(TableViewerComposite table)
    {
        this.table = table;
    }

    /**
     * This method may be overrided if client desire to listen the table selection
     * 
     * @param data the selected data from the listened table.
     */
    public void updateSelection(Object data)
    {
    	parameter1.setText("");
    }

    /**
     * Returns the feature which is multiple
     * 
     * @return Object This object is an instance of a java.util.List
     */
    protected Object getListValues() {
		List<Operation> callableOperations = new ArrayList<Operation>();
		// FIXME CF ugly patch, it should never be null !!!
	    if(getEObjectFromXmiModel() != null) {
			callableOperations = new KermetaAdapter().getOperationsAdapter(getEObjectFromXmiModel());
	    }
		return callableOperations;
    }
    
    /**
     * This method has been overrided in order to 
     * set the eobject attribute to its Kermeta adapter:
     * simulating of a Kermeta Class Definition instead of an EObject
     */
    @Override
	protected EObject getEObject() {
    	EObject eObj = null;
    	// FIXME CF ugly patch, it should never be null !!!
    	if(getEObjectFromXmiModel() != null) {
    		eObj = new KermetaAdapter().getClassDefinitionAdapter(getEObjectFromXmiModel());
    	}
    	return eObj;
	}
    
    /**
     * Get the selected eobject into the reflective or graphical editor
     * @return
     */
    private EObject getEObjectFromXmiModel() {
    	return super.getEObject();
    }

}
