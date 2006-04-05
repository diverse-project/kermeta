/* $Id: OperationEditDialog.java,v 1.2 2006-04-05 18:58:52 zdrey Exp $
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
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ExtendedModifyEvent;
import org.eclipse.swt.custom.ExtendedModifyListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.editors.text.TextEditor;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.OperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.EditorConfiguration;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.EditorReconcilingStrategy;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.EditorStyleListener;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.SyntaxManager;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.standalone.editor.EditorPanel;
import fr.irisa.triskell.kermeta.standalone.editor.jedit.SyntaxDocument;

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
	
	/**
	 * the list of available types for the return type of the operation.
	 * Note : for the moment we only handle "Single types" (types that are not ProductTypes
	 * or FunctionTypes) 
	 */
	private Combo _returnTypeComboBox;
	
	
	private Text _operationNameText;
	private Text _operationTypeParamsText;
	private Combo _operationSuperOperationComboBox;
	// The widget for the body operation edition
	private StyledText styledText;
	
	// The names of the available types
	private List<String> _typeNames;
	private List<Type> _types;
	
	// The names of the available superclasses
	private List<String> _superTypeNames;	
	private List<Type> _supertypes;
	
	private Map<String, Object> _data;
	
	// Constants
	public static final String Operation_NAME = "Operation name";
	
	public static final String Operation_RETURN_TYPE = "Operation return type";
	
	public static final String Operation_INPUTS = "Operation inputs";
	
	public static final String Operation_TYPE_PARAMS = "Operation type params";
	
	public static final String Operation_SUPER_OPERATION = "Super operation";
	
	// extracted from a func.
	public OperationDataStructure dataStructure;

	private static final String VOID_TYPE = "Void";
	
	// Get the tab item to update its label when errors appear or not
	protected TabItem errorItem;
	protected StyledText errorView ;
	
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
		initializeTypes();
		initializeSuperTypes();
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
	 */
	private void initializeTypes()
	{
		// get the types available in the package owning the class of the given operation.
		_types = KermetaUtils.getDefault().getOwnedTypes(_operation.getOwningClass());
		_typeNames = new ArrayList<String>(_types.size());
		
		for (Iterator<Type> iterator = _types.iterator(); iterator.hasNext();)
		{
			Type next = iterator.next();
			// Display a proper name
			String name = KermetaUtils.getDefault().getLabelForType(next);
			name = (name==null)?"<unset type>":name;
			_typeNames.add(name);
		}
	}
	
	private void initializeSuperTypes()
	{
		// get the types available in the package owning the class of the given operation.
		_supertypes = KermetaUtils.getDefault().getAllSuperTypes(_operation.getOwningClass());
		_superTypeNames = new ArrayList<String>(_supertypes.size());
		
		for (Iterator<Type> iterator = _supertypes.iterator(); iterator.hasNext();)
		{
			Type next = iterator.next();
			// Display a proper name
			String name = KermetaUtils.getDefault().getLabelForType(next);
			name = (name==null)?"":name;
			_superTypeNames.add(name);
		}
	}
	
	/**
	 * Create first tab item (Main Data, i.e Name, return type, and optional super class of the operation)
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
		
		new Label(composite, SWT.NONE).setText("From ");
		_operationSuperOperationComboBox = new Combo(composite, SWT.READ_ONLY);
		_operationSuperOperationComboBox.setItems(_superTypeNames.toArray(new String[] {}));
		_operationSuperOperationComboBox.add("", 0);
		_operationSuperOperationComboBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
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
		// Set the super operation field
		if (_operation.getSuperOperation()!=null)
		{
			String classdef_name = _operation.getSuperOperation().getOwningClass().getName();
			_operationSuperOperationComboBox.select(
				_superTypeNames.indexOf(classdef_name) + 1);
		}
		
	}
	
	/**
	 * Create second tab item, so that the user can specify here the parameters
	 * for the operation
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
	
	/**
	 * Create the third tab item, where the user can specify the type parameters
	 * of the operation.
	 * @param parent
	 */
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
	
	/** Create the text component where user will write its code */
	private Text createEditorText(Composite composite) {
        int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | 
        SWT.FULL_SELECTION | SWT.HIDE_SELECTION;
        
        Text textcode = new Text(composite,style);
        textcode.setText("Ecris ton code là");
        
        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalSpan = 2;
        textcode.setLayoutData(gridData);   
		gridData.minimumHeight = 100;
        return textcode;
    }
	
	/**
	 * Create the fourth tab item, dedicated to the edition of the operation body.
	 */
	private void createFourthTabItem(TabFolder _parent)
	{
		// Create tab item and add it composite that fills it
		TabItem fourthItem = new TabItem(_parent, SWT.NONE);
		fourthItem.setText("Code");
		Composite composite = new Composite(_parent, SWT.NONE);
		fourthItem.setControl(composite);
		
		// Add layout on composite
		//
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite bodyComposite = new Composite(composite, SWT.NONE);
		bodyComposite.setLayout(new FillLayout());
		bodyComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		// Create the mini-editor
		createBodyEditor(bodyComposite);
		createInjectButton(composite);
	}
	
	/**
	 * Create the tab item dedicated to the Error display
	 */
	private void createFifthTabItem(TabFolder _parent)
	{
		// Create tab item and add it composite that fills it
		errorItem = new TabItem(_parent, SWT.NONE);
		errorItem.setText("");
		errorItem.setImage(StructureImageRegistry
				.getImage("NOERROR"));
		Composite composite = new Composite(_parent, SWT.NONE);
		errorItem.setControl(composite);
		
		// Add layout on composite
		//
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite bodyComposite = new Composite(composite, SWT.NONE);
		bodyComposite.setLayout(new FillLayout());
		bodyComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		// Create the mini-editor
		createErrorView(bodyComposite);
		//createInjectButton(composite);
	}
	
	/**
	 * Create the syntactially colored kermeta source code viewer
	 * @param composite
	 */
	public void createErrorView(Composite composite)
	{
		// Color for the StyleRanges
		final Color red = Display.getDefault().getSystemColor(SWT.COLOR_RED);
		
		int styles = SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;
		
		/*_codeViewer = new SourceViewer(composite, null, styles);
		_codeViewer.setEditable(true);
		IDocument doc = new Document();
	    _codeViewer.setDocument(doc);
	    SyntaxDocument doc = new SyntaxDocument();
	    doc.setTokenMarker(new KermetaTokenMarker());*/
		
	    errorView = new StyledText(composite, styles);
	    

	    // Add the syntax coloring handler
	    errorView.addLineStyleListener(
	    	new EditorStyleListener(SyntaxManager.getSyntaxData(SyntaxManager.KERMETA_SYNTAX_DATA)));
	    
	    // Not editable 
	    errorView.setEditable(false);
	 }
	
	/**
	 * Create the syntactially colored kermeta source code viewer
	 * @param composite
	 */
	public void createBodyEditor(Composite composite)
	{
		// Color for the StyleRanges
		final Color red = Display.getDefault().getSystemColor(SWT.COLOR_RED);
		
		int styles = SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;
		
		/*_codeViewer = new SourceViewer(composite, null, styles);
		_codeViewer.setEditable(true);
		IDocument doc = new Document();
	    _codeViewer.setDocument(doc);
	    SyntaxDocument doc = new SyntaxDocument();
	    doc.setTokenMarker(new KermetaTokenMarker());*/
		
	    styledText = new StyledText(composite, styles);

	    // Add the syntax coloring handler
	    styledText.addLineStyleListener(
	    	new EditorStyleListener(SyntaxManager.getSyntaxData(SyntaxManager.KERMETA_SYNTAX_DATA)));
	    
	    // set the operation pretty print 
	    styledText.setTabs(4);
	    styledText.setText((String)KermetaUtils.getDefault().getPrettyPrinter().accept(_operation));
	    styledText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				System.err.println("Be carefull!! a text has been modified!!" + styledText.getText());
			}	    	
	    });
	    // To add a special modif : do it through the commented method, below
		/*
	    styledText.addExtendedModifyListener(new ExtendedModifyListener() {
	    	public void modifyText(ExtendedModifyEvent event) {} }
	    });*/
	    
	    
	    
	}

	/**
	 * Create the inject button. When user clicks on it, it inserts the operation
	 * body in the edited model.
	 */
	protected void createInjectButton(Composite composite)
	{
		Button inject = new Button(composite, SWT.PUSH);
		inject.setText("Check"); // was "inject"..
	    GridData gd = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END);
		gd.widthHint = 80;
		inject.setLayoutData(gd);
		inject.addSelectionListener(new SelectionAdapter()
		{
			public void widgetSelected(SelectionEvent e)
			{
				// translate and inject
				String textError = "";
				System.err.println("Parsing now the operation : " + _operation.eResource().getURI().toString());
				KermetaUnit unit = EditorReconcilingStrategy.parse(_operation.eResource().getURI().toString());
				
				// TODO : add a try/catch exception so that the user cannot save an invalid body?
				
				try
				{	// reset the errorView
					errorItem.setImage(StructureImageRegistry.getImage("NOERROR"));
					errorView.setText("");
					_operation.setBody(ExpressionParser.parse_operation2body(unit, styledText.getText()));
				}
				catch (Error error)
				{
					// Display the errors to the user!! in a popup dialog? below the operation text field? in a fifth Tab
					errorItem.setImage(StructureImageRegistry.getImage("ERROR"));
					textError += "Error when parsing '" +  
							_operation.getName() +" ': \n " + 
							error.getMessage() + 
							"\n" + error.getCause();
					//System.err.println("Take a look at the tab Error Parse error in the body : " + error + "\n\n" + error.getMessage());
				}
				// Reparse (not very optimal..) the whole unit to check the operation consistency according to its context
				unit = EditorReconcilingStrategy.parse(_operation.eResource().getURI().toString());
				unit.messages.getAllErrors().clear();
				if (unit.messages.getAllErrors()!=null && unit.messages.getAllErrors().size()>0)
				{
					System.err.println("Ertrorrs!");
					errorItem.setImage(StructureImageRegistry.getImage("ERROR"));
					textError += "\n" + unit.messages.getAllMessagesAsString();
					errorView.setText(textError);
				}
			}
		});
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
		createFourthTabItem(tabFolder);
		createFifthTabItem(tabFolder);
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
		if (_operationSuperOperationComboBox.getSelectionIndex() != 0)
		{
			_data.put(Operation_SUPER_OPERATION, _supertypes.get(_operationSuperOperationComboBox.getSelectionIndex() -1));
		}
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