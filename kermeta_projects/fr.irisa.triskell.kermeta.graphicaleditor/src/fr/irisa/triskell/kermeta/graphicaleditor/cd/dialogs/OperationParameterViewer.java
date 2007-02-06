/* $Id: OperationParameterViewer.java,v 1.1 2007-02-06 17:45:46 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : OperationParameterViewer.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey
 * Contributors:
 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *    Jacques Lescot (Anyware Technologies) - initial API and implementation
 * This class is an adapted copy of EOperationParameterViewer in the topcased 
 * ecore editor.
 * ---------------------------------------------------------------------------- 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.cd.dialogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.utils.OperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.utils.ParameterObject;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * 
 */
public class OperationParameterViewer
{
	
    private TableViewer _tableViewer;
    
    private OperationDataStructure _dataStructure;
    
    private String[] _columnNames = new String[]{"Name","Type"};
    
    private String[] _typeNames;
    private Collection<ParameterObject> _paramObjects;
    private ArrayList<Type> _types;
    
    public Collection getType() {
        return _types;
    }
    
    public int getIndex(String name) {
        return Arrays.asList(_typeNames).indexOf(name);
    }
    
    public OperationParameterViewer(Composite parent, OperationDataStructure dataStructure, Collection<ParameterObject> paramObjects, Collection<Type> types, String [] typeNames) {
        _types = (ArrayList) types;
        _typeNames = typeNames;
		_dataStructure = dataStructure;
        _paramObjects = paramObjects;//_dataStructure.getDataOwnedParameters();
        createTableViewer(parent);
    }
    
    /**
     * @param paramType TODO*/
    public void addParameter(String paramType) {
    	String paramname = (paramType==OperationDataStructure.FOPERATION_type_parameter)?"T":"arg";
   		_paramObjects.add(new ParameterObject(paramname + _paramObjects.size(), _types.get(0)));
   		_tableViewer.refresh();
    }
    
    public void removeParameter() {
		_paramObjects.remove(((IStructuredSelection)_tableViewer.getSelection()).getFirstElement());
		_tableViewer.refresh();
    }
    
    public OperationDataStructure getData() {
		return _dataStructure;
    }
    
    
    private Table createTable(Composite composite) {
        int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | 
        SWT.FULL_SELECTION | SWT.HIDE_SELECTION;
        
        Table table = new Table(composite,style);
        TableColumn tc1 = new TableColumn(table,SWT.LEFT);
        tc1.setText(_columnNames[0]);
        tc1.setWidth(150);
        
        TableColumn tc2 = new TableColumn(table,SWT.LEFT);
        tc2.setText(_columnNames[1]);
        tc2.setWidth(180);
        
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalSpan = 2;
        table.setLayoutData(gridData);   
		gridData.minimumHeight = 100;

        return table;
    }
    
    private void createTableViewer(Composite composite) {
        Table table = createTable(composite);
        _tableViewer = new TableViewer(table);
        
        _tableViewer.setUseHashlookup(true);
        _tableViewer.setColumnProperties(_columnNames);
      
        CellEditor[] editors = new CellEditor[2];

        TextCellEditor textEditor = new TextCellEditor(table);
           ((Text) textEditor.getControl()).setTextLimit(60);
           editors[0] = textEditor;

        TextCellEditor textEditor2 = new TextCellEditor(table);
        ((Text) textEditor2.getControl()).setTextLimit(60);
        editors[1] = new ComboBoxCellEditor(table, _typeNames,
                SWT.READ_ONLY);

        _tableViewer.setCellEditors(editors);
        _tableViewer.setContentProvider(new ParameterContentProvider());
        _tableViewer.setLabelProvider(new ParameterLabelProvider());
        _tableViewer.setInput(_dataStructure);
        _tableViewer.setCellModifier(new ParameterCellModifier());
      }
    
    class ParameterCellModifier implements ICellModifier {
        
        public boolean canModify(Object element, String property) {
            return true;
        }

        public Object getValue(Object element, String property) {
            Object result = null;
            int index = Arrays.asList(_columnNames).indexOf(property);
            switch (index) {
                case 0:  
                    result = _dataStructure.getDisplayName(element);
                    break;
                case 1 :
                    Type type = _dataStructure.getType(element);
                    if (type != null) {
                        String[] choices = _typeNames;
                        int i = choices.length - 1;
                        while (!type.equals(choices[i]) && i > 0)
                            --i;
                        result = new Integer(i);
                    }
                    break;
                default :
                    break;  
            }
            return result;
        }

        public void modify(Object element, String property, Object value){
            TableItem item = (TableItem)element;
            int index = Arrays.asList(_columnNames).indexOf(property);
            switch (index) {
                case 0:  
					_dataStructure.setName(item.getData(),(String)value);
                    break;
                case 1 :
					_dataStructure.setType(item.getData(),(Type)_types.get(((Integer) value).intValue()));
                    break;
                default :
                    break;  
            }
            _tableViewer.update(item.getData(),null);
        }
    }
    
    class ParameterContentProvider implements IStructuredContentProvider {

        public Object[] getElements(Object inputElement) {
            return _paramObjects.toArray();
        }

        public void dispose() {
        }
        
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput){
        }
    }
    
    class ParameterLabelProvider extends LabelProvider implements ITableLabelProvider {

        public Image getColumnImage(Object element, int columnIndex){
            return null;
        }

        public String getColumnText(Object element, int columnIndex){
            String result = "";
            switch (columnIndex) {
                case 0:  
                    result = _dataStructure.getDisplayName(element);
                    break;
                case 1 :
                    result = _dataStructure.getDisplayType(element);
                    break;
                default :
                    break;  
            }
            return result;
        }
    }
}