/*******************************************************************************
 * Copyright (c) 2006 ANYWARE TECHNOLOGIES. All rights reserved. 
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose Alfredo Serrano (Anyware Technologies) - initial API
 ******************************************************************************/

package org.kermeta.prototyper.editor.composite;

import java.math.BigInteger;

import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;
import org.kermeta.prototyper.editor.composite.TableViewerComposite;

/**
 * This class implements an ICellModifier An ICellModifier is called when the user modifes a cell in the tableViewer
 */

public class CellModifier implements ICellModifier
{

    private TableViewerComposite tableViewer;

    /**
     * Constructor
     * 
     * @param TableViewerExample an instance of a TableViewerExample
     */
    public CellModifier(TableViewerComposite tableViewer)
    {
        this.tableViewer = tableViewer;
    }

    /**
     * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
     */
    public boolean canModify(Object element, String property)
    {
        return true;
    }

    /**
     * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
     */
    public Object getValue(Object element, String property)
    {
        if (element instanceof String)
        {
            return element;
        }
        else if (element instanceof Integer)
        {
            return ((Integer) element).toString();
        }
        else if (element instanceof BigInteger)
        {
            return ((BigInteger) element).toString();
        }
        else if (element instanceof AbstractEnumerator)
        {
            String stringValue = ((AbstractEnumerator) element).getLiteral();
            String[] choices = tableViewer.getObjectManager().getEnumLiterals();
            int i = choices.length - 1;
            while (!stringValue.equals(choices[i]) && i > 0)
            {
                --i;
            }
            return new Integer(i);
        }
        return element;
    }

    /**
     * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
     */
    public void modify(Object element, String property, Object value)
    {
        // Find the index of the column
        TableItem item = (TableItem) element;
        Object oldValue = item.getData();
        Object newValue = null;

        if (oldValue instanceof String)
        {
            String string = (String) value;
            newValue = string.trim();
            item.setText((String) newValue);
            item.setData(newValue);
        }
        else if (oldValue instanceof Integer)
        {
            int i = Integer.parseInt((String) value);
            newValue = new Integer(i);
            item.setText(i + "");
            item.setData(newValue);
        }
        else if (oldValue instanceof BigInteger)
        {
            newValue = new BigInteger((String) value);
            item.setText(newValue.toString());
            item.setData(newValue);
        }
        else if (oldValue instanceof Double)
        {
            newValue = new Double((String) value);
            item.setText(newValue.toString());
            item.setData(newValue);
        }
        else if (oldValue instanceof Boolean)
        {
            newValue = value; // Boolean has not real interest
        }
        else
        {
            newValue = tableViewer.getObjectManager().createEnum(((Integer) value).intValue());
            // TODO something with enums. This is not going to work because we have to create an instance of the
            // enumeration
        }
        tableViewer.getObjectManager().elementChanged(oldValue, newValue);
    }
}
