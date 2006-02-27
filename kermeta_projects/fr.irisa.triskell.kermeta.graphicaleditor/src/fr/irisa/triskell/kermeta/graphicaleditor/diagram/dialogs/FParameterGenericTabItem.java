/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : FParameterGenericTabItem.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs;

import java.util.Collection;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.FOperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.ParameterObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FType;

public class FParameterGenericTabItem {
	
	protected TabFolder _parent;
	protected FOperation _operation;
	private List<FType> _types;
	private List<String> _typeNames;
	protected FOperationParameterViewer viewer;
	protected FOperationDataStructure _dataStructure;
	protected String _paramType;
	protected Collection<ParameterObject> _paramObjects;
	protected String _tabName;

	public FParameterGenericTabItem(TabFolder parent, FOperation operation, FOperationDataStructure dataStructure, List<FType> types, List<String> typenames,
			String tabname, String paramtype) {
		super();
		_operation = operation;
		_types = types;
		_typeNames = typenames;
		_tabName = tabname;
		_parent = parent;
		_paramType = paramtype;
		_dataStructure = dataStructure;
		if (_paramType.equals(FOperationDataStructure.FOPERATION_type_parameter))
			_paramObjects = _dataStructure.getDataTypeParameters();
		else 
			_paramObjects = _dataStructure.getDataOwnedParameters();
		createTabItem();
	}
	
	public FOperationParameterViewer getViewer()
	{
		return viewer;
	}
	
	public void createTabItem()
	{
		
		// Create tab item and add it composite that fills it
		TabItem thirdItem = new TabItem(_parent, SWT.NONE);
		thirdItem.setText(_tabName);
		Composite composite = new Composite(_parent, SWT.NONE);
		thirdItem.setControl(composite);
		
		// Add layout on composite
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label label = new Label(composite, SWT.NONE);
		label.setText(_tabName);
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// REV Define the layout and the layout data here and not in the called
		// class
		viewer = new FOperationParameterViewer(composite, _dataStructure, _paramObjects, _types,
				_typeNames.toArray(new String[] {}));
		
		Button add = new Button(composite, SWT.PUSH);
		add.setText("Add");
		
		GridData gd = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END);
		gd.widthHint = 80;
		add.setLayoutData(gd);
		add.addSelectionListener(new SelectionAdapter()
				{
			public void widgetSelected(SelectionEvent e)
			{
				viewer.addParameter();
			}
				});
		
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		gd = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING);
		gd.widthHint = 80;
		delete.setLayoutData(gd);
		
		delete.addSelectionListener(new SelectionAdapter()
				{
			public void widgetSelected(SelectionEvent e)
			{
				viewer.removeParameter();
			}
				});
	}
}
