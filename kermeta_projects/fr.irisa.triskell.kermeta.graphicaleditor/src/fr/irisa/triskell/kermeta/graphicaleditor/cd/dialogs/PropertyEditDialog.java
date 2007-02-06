/* $Id: PropertyEditDialog.java,v 1.1 2007-02-06 17:45:46 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : ClassDefinitionEditDialog.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 17, 2006
 * Authors       : zdrey
 * Contributors : David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware
 * Technologies), Jacques Lescot (Anyware Technologies) - initial API and
 * implementation
 * This is an adapted copy of PropertyEditPartDialog in Topcased ecore editor
 * ----------------------------------------------------------------------------
 */


package fr.irisa.triskell.kermeta.graphicaleditor.cd.dialogs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * Popup dialog associated to the Operation graphical object, used for the 
 * update of operation parameters.
 * This code is duplicated (OperationEditDialog)
 * -> FIXME : create a generic EditDialog 
 * @generated NOT
 */
public class PropertyEditDialog extends Dialog
{
	/** Current edited operation */
	private Property _property;
	
	// SWT Objects
	private Composite _dialogComposite;
	private Combo _typeComboBox;
	private Text _propertyNameText;
	private Text _multiplicityText;

	
	//public PropertyDataStructure dataStructure;
	
	/**
	 * The available types for a property represented as a node.
	 * Available types are the standard types only. 
	 * TODO : For all the other types, either inside the edited model
	 * or in "additional resources", the user will have to create an edge if
	 * he wants too. [To discuss]
	 * 
	 * Note : for the moment we only handle "Single types" (types that are not ProductTypes
	 * or FunctionTypes)
	 */
	private List<Type> _types;
	private List<String> _typeNames;
	
	private Map<String, Object> _data;
	
	// Constants
	public static final String Property_NAME = "Property name";
	public static final String Property_TYPE = "Property type";
	public static final String Property_MULTIPLICITY = "Property multiplicity";
	private static final String VOID_TYPE = "Void";
	
	/** A helper that provides some useful methods to get lists of objects. */
	public EditDialogHelper _dialogHelper;
	/**
	 * Create the dialog for a given operation
	 * 
	 * @param operation
	 * @param parentShell
	 */
	public PropertyEditDialog(Property property, Shell parentShell)
	{
		super(parentShell);
		setBlockOnOpen(true);
		_property = property;
		_dialogHelper = new EditDialogHelper(property.getOwningClass());
		// dataStructure = new PropertyDataStructure(_property);
		initializeData();
		initializeTypes();
		setShellStyle(getShellStyle() | SWT.RESIZE);
	}
	
	/**
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	protected void configureShell(Shell newShell)
	{
		newShell.setText("Property " + _property.getName());
		super.configureShell(newShell);
	}
	
	
	
	/**
	 * Initialize attributes about *primitive types* (and only primitive types!)
	 * that model currently contains
	 * 
	 */
	private void initializeTypes()
	{
		_types = _dialogHelper.getSortedTypes();
		_typeNames = _dialogHelper.getSortedTypeNames();
//		 get the types available in the package owning the class of the given operation.
	}
	
	/**
	 * Initialize the data dictionary, that contains the input parameters, input type parameters,
	 * and the body of the operation (not the best place to store it in the latter case..).
	 */
	protected void initializeData()
	{
		// Initialize the hashmap..
		_data = new HashMap<String, Object>();
		_data.put(PropertyEditDialog.Property_NAME, _property.getName());
        _data.put(PropertyEditDialog.Property_TYPE, _property.getType());
	}
	
	/**
	 * Create first tab item (Main Data, i.e Name and return type of the operation
	 * @param parent
	 */
	private void createFirstTabItem(TabFolder parent)
	{
		
		// Create tab item and add it composite that fills it
		TabItem firstItem = new TabItem(parent, SWT.NONE);
		firstItem.setText("Main data");
		Composite composite = new Composite(parent, SWT.NONE);
		firstItem.setControl(composite);
		
		// Add layout on composite
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		new Label(composite, SWT.NONE).setText("Name");
		_propertyNameText = new Text(composite, SWT.BORDER);
		_propertyNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		new Label(composite, SWT.NONE).setText("Type");
		
		_typeComboBox = new Combo(composite, SWT.READ_ONLY);
		_typeComboBox.setItems(_typeNames.toArray(new String[] {}));
		_typeComboBox.add(VOID_TYPE, 0);
		_typeComboBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		new Label(composite, SWT.NONE).setText("Multiplicity ([x..y])");
		_multiplicityText = new Text(composite, SWT.BORDER);
		_multiplicityText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		/*
		new Label(composite, SWT.NONE).setText("Type Parameters");
		_operationTypeParamsText = new Text(composite, SWT.BORDER);
		_operationTypeParamsText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		*/
		fillFields();
	}
	
	/**
	 * Fill fields with current property values
	 * 
	 */
	private void fillFields()
	{
		// Set the name field
		_propertyNameText.setText(_property.getName() == null ? "" : _property.getName());
		// Set the type params field
		if (_property.getType() != null)
		{
			String type_name = KermetaUtils.getDefault().getLabelForType(_property.getType());
			_typeComboBox.select(_typeNames.indexOf(type_name) + 1);
		}
		else
		{
			_typeComboBox.select(0);
		}
		
		if (_multiplicityText.getText() == null || _multiplicityText.getText().length() == 0)
		{
			_multiplicityText.setText("[" + String.valueOf(_property.getLower()) + ".." + String.valueOf(_property.getUpper()) + "]");
		}
		
	}
	
	/**
	 * Creates the group
	 * 
	 * @param parent the parent Composite
	 */
	protected void createPropertyGroup(Composite parent)
	{
		TabFolder tabFolder = new TabFolder(parent, SWT.TOP);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		// Setting the operation name and return type
		createFirstTabItem(tabFolder);
	}
	
	/**
	 * Create the Dialog area
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent)
	{
		// Dialog
		_dialogComposite = (Composite) super.createDialogArea(parent);
		createPropertyGroup(_dialogComposite);
		
		return _dialogComposite;
	}
	
	/**
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed()
	{   
		_data = new HashMap<String, Object>();
		_data.put(Property_NAME, _propertyNameText.getText());
		if (_typeComboBox.getSelectionIndex() != 0)
		{
			_data.put(Property_TYPE, _types.get(_typeComboBox.getSelectionIndex() - 1));
		}
		_data.put(Property_MULTIPLICITY, _multiplicityText.getText());
		super.okPressed();
	}
	
	/**
	 * Return a map containing property data that may changed
	 * 
	 * @return a Map
	 */
	public Map getData()
	{
		return _data;
	}
	
}