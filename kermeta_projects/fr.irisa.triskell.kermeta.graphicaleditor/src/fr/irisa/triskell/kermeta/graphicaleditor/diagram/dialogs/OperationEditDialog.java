/* $Id: OperationEditDialog.java,v 1.1 2006-03-07 17:30:32 zdrey Exp $
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
 * This is an adapted copy of OperationEditPartDialog in Topcased ecore editor
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

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.OperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * Popup dialog associated to the Operation graphical object, used for the 
 * update of operation parameters.
 */
public class OperationEditDialog extends Dialog
{
	/** Current edited operation */
	private Operation _operation;
	
	// SWT Objects
	private Composite _dialogComposite;
	
	private OperationParameterViewer _inputParameters;
	private OperationParameterViewer _inputTypeParameters;
	
	/** For the moment we only handle "Single types" (types that are not ProductTypes
	 * or FunctionTypes) */
	private Combo _returnTypeComboBox;
	
	private Text _operationNameText;
	private Text _operationTypeParamsText;
	
	// UML2 types data
	private List<String> _typeNames;
	
	private List<Type> _types;
	// Initialize available type definitions
	/** */
	private List<TypeDefinition> _typedefs;
	
	private Map<String, Object> _data;
	
	// Constants
	public static final String Operation_NAME = "Operation name";
	
	public static final String Operation_RETURN_TYPE = "Operation return type";
	
	public static final String Operation_INPUTS = "Operation inputs";
	
	public static final String Operation_TYPE_PARAMS = "Operation type params";
	
	// extracted from a func.
	public OperationDataStructure dataStructure;

	private static final String VOID_TYPE = "Void";
	
	/**
	 * Create the dialog for a given operation
	 * 
	 * @param operation
	 * @param parentShell
	 */
	public OperationEditDialog(Operation operation, Shell parentShell)
	{
		super(parentShell);
		setBlockOnOpen(true);
		_operation = operation;
		dataStructure = new OperationDataStructure(_operation);
		//operation.getF1
		initializeTypes();
		setShellStyle(getShellStyle() | SWT.RESIZE);
	}
	
	/**
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	protected void configureShell(Shell newShell)
	{
		newShell.setText("Operation " + _operation.getName());
		super.configureShell(newShell);
	}
	
	/**
	 * Initialize attributes about types that model currently contains
	 * 
	 */
	private void initializeTypes()
	{
		int index = 0;
		// get the types available in the package owning the class of the given operation.
		_typedefs = KermetaUtils.getDefault().getOwnedTypeDefinitions(_operation.getOwningClass());
		_types = KermetaUtils.getDefault().getOwnedTypes(_operation.getOwningClass());
		_typeNames = new ArrayList<String>(_types.size());
		
		for (Iterator<Type> iterator = _types.iterator(); iterator.hasNext();)
		{
			Type next = iterator.next();
			// Display a proper name
			String name = KermetaUtils.getDefault().getLabelForType(next);
			name = (name==null)?"<unset type>":name;
			//_typeNames[index] = name;
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
		_operationNameText = new Text(composite, SWT.BORDER);
		_operationNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		new Label(composite, SWT.NONE).setText("Return Type");
		
		_returnTypeComboBox = new Combo(composite, SWT.READ_ONLY);
		_returnTypeComboBox.setItems(_typeNames.toArray(new String[] {}));
		_returnTypeComboBox.add(VOID_TYPE, 0);
		_returnTypeComboBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
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
		_operationNameText.setText(_operation.getName() == null ? "" : _operation.getName());
		// Set the type params field
		if (_operation.getType() != null)
		{
			// Items are Strings -> this was 
			// _returnTypeComboBox.select(_types.indexOf(_operation.getType()) + 1);
			// If it is a simple type
			String type_name = KermetaUtils.getDefault().getLabelForType(_operation.getType());
			_returnTypeComboBox.select(_typeNames.indexOf(type_name) + 1);
		}
		else
		{
			_returnTypeComboBox.select(0);
		}
		
	}
	
	/**
	 * Create second tab item
	 * 
	 * @param parent
	 */
	private void createSecondTabItem(TabFolder parent)
	{
		ParameterGenericTabItem tab = new ParameterGenericTabItem(
				parent,
				_operation, 
				dataStructure,
				_types, 
				_typeNames, 
				"Parameters",
				OperationDataStructure.FOPERATION_owned_parameter); 
		_inputParameters = tab.getViewer();
	}
	
	private void createThirdTabItem(TabFolder parent)
	{
		ParameterGenericTabItem tab = new ParameterGenericTabItem(
				parent,
				_operation, 
				dataStructure,
				_types, 
				_typeNames, 
				"Type Parameters",
				OperationDataStructure.FOPERATION_type_parameter); 
		_inputTypeParameters = tab.getViewer();
	}
	
	/**
	 * Creates the group
	 * 
	 * @param parent the parent Composite
	 */
	protected void createOperationGroup(Composite parent)
	{
		TabFolder tabFolder = new TabFolder(parent, SWT.TOP);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		// Setting the operation name and return type
		createFirstTabItem(tabFolder);
		// Setting the operation parameters
		createSecondTabItem(tabFolder);
		createThirdTabItem(tabFolder);
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
		createOperationGroup(_dialogComposite);
		
		return _dialogComposite;
	}
	
	/**
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed()
	{
		_data = new HashMap<String, Object>();
		_data.put(Operation_NAME, _operationNameText.getText());
		if (_returnTypeComboBox.getSelectionIndex() != 0)
		{
			_data.put(Operation_RETURN_TYPE, _types.get(_returnTypeComboBox.getSelectionIndex() - 1));
		}
		_data.put(Operation_INPUTS, _inputParameters.getData());
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