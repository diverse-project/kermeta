/* $Id: PropertyEditDialog.java,v 1.2 2006-04-11 17:29:35 zdrey Exp $
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


package fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.PropertyDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

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

	
	// types data
	private List<String> _typeNames;
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
	private Map<String, Object> _data;
	
	// Constants
	public static final String Property_NAME = "Property name";
	public static final String Property_TYPE = "Property type";
	public static final String Property_MULTIPLICITY = "Property multiplicity";
	private static final String VOID_TYPE = "Void";
	
	/**
	 * Create the dialog for a given operation
	 * 
	 * @param operation
	 * @param parentShell
	 */
	public PropertyEditDialog(Property operation, Shell parentShell)
	{
		super(parentShell);
		setBlockOnOpen(true);
		_property = operation;
		// dataStructure = new PropertyDataStructure(_property);
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
		int index = 0;
		// get the types available in the package owning the class of the given operation.
		// _types = KermetaUtils.getDefault().getOwnedTypes(_property.getOwningClass());
		
		// Another option : get only types available in the standard stuff
		_types = KermetaUtils.getDefault().getStdLibTypes();
		_typeNames = new ArrayList<String>(_types.size());
		
		for (Iterator<Type> iterator = _types.iterator(); iterator.hasNext();)
		{
			Type next = iterator.next();
			// Display a proper name
			String name = KermetaUtils.getDefault().getLabelForType(next);
			name = (name==null)?"":name;
			//_typeNames[index] = name;
			if (name.length()>0) // Do not give user the possibility to set an unanmed type
				_typeNames.add(name);
			//index++;
		}
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
		
		new Label(composite, SWT.NONE).setText("Return Type");
		
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
			// Items are Strings -> this was 
			// _returnTypeComboBox.select(_types.indexOf(_operation.getType()) + 1);
			// If it is a simple type
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