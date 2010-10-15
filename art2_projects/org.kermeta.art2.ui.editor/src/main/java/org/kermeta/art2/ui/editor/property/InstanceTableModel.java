/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.property;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.DictionaryValue;
import org.kermeta.art2.Instance;

/**
 *
 * @author ffouquet
 */
public class InstanceTableModel implements TableModel {

    private Instance instance;

    public InstanceTableModel(Instance inst) {
        instance = inst;
    }

    @Override
    public int getRowCount() {
        return instance.getTypeDefinition().getDictionaryType().getAttributes().size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "key";
            case 1:
                return "value";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        org.kermeta.art2.DictionaryAttribute att = instance.getTypeDefinition().getDictionaryType().getAttributes().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return att.getName();
            case 1:
                DictionaryValue value = null;
                if(instance.getDictionary() == null){
                    instance.setDictionary(Art2Factory.eINSTANCE.createDictionary());
                }
                for (DictionaryValue v : instance.getDictionary().getValues()) {
                    if (v.getAttribute().equals(att)) {
                        return v.getValue();
                    }
                }
                for (DictionaryValue v : instance.getTypeDefinition().getDictionaryType().getDefaultValues()) {
                    if (v.getAttribute().equals(att)) {
                        return v.getValue();
                    }
                }
                break;
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 1) {
            org.kermeta.art2.DictionaryAttribute att = instance.getTypeDefinition().getDictionaryType().getAttributes().get(rowIndex);
            DictionaryValue value = null;
            for (DictionaryValue v : instance.getDictionary().getValues()) {
                if (v.getAttribute().equals(att)) {
                    value = v;
                }
            }
            if(value == null){
                value = Art2Factory.eINSTANCE.createDictionaryValue();
                value.setAttribute(att);
                instance.getDictionary().getValues().add(value);
            }
            value.setValue(aValue.toString());
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
}
