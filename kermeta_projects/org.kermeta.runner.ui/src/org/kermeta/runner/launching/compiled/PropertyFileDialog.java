/* $RCSfile: PropertyFileDialog.java,v $
 * Created on 22.09.2002, 01:53:47 by Oliver David
 * $Source: /cvsroot/eclpropfileedit/eclpropfileedit/src/org/sourceforge/eclpropfileedit/editor/PropertyFileDialog.java,v $
 * $Id: PropertyFileDialog.java,v 1.2 2002/11/18 21:31:42 davoli Exp $
 * Copyright (c) 2000-2002 Oliver David. All rights reserved. */
package org.kermeta.runner.launching.compiled;

import java.util.Iterator;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.kermeta.runner.compiler.propertieseditor.core.PropertyFileUtil;
import org.kermeta.runner.compiler.propertieseditor.core.PropertyLineWrapper;


/** 
 * @author  Oliver David
 * @version $Revision: 1.2 $
 */
public class PropertyFileDialog extends Dialog
{

    private Label i_commentLabel;
    private Label i_keyLabel;
    private Label i_valueLabel;
    private Text i_commentText;
    private Text i_keyText;
    private Text i_valueText;
    
    private String i_selectedKey;
    
    private boolean i_isCommentedProperty;       


    private PropertyFileEditorTab i_propertiesFilesEditor;
    
    private boolean i_isNew;

    /**
     * Constructor for PropertyFileDialog.
     * @param parent
     */
    public PropertyFileDialog(Shell parent, PropertyFileEditorTab propertiesFilesEditor)
    {
        super(parent);
        i_propertiesFilesEditor = propertiesFilesEditor;
    }

    /**
     * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(Composite)
     */
    protected Control createDialogArea(Composite parent)
    {
        GridLayout gridLayout = new GridLayout ();
        gridLayout.marginHeight = 10;
        gridLayout.verticalSpacing = 10;
        gridLayout.marginWidth = 10;
        gridLayout.numColumns = 2;
        parent.setLayout (gridLayout);

        i_keyLabel = new Label(parent, SWT.NONE);
        i_keyLabel.setText("Key:");
        GridData data = new GridData ();
        data.verticalAlignment = GridData.BEGINNING;
        i_keyLabel.setLayoutData (data);
        
        
        i_keyText = new Text(parent, SWT.BORDER/* | SWT.WRAP | SWT.V_SCROLL*/);
        data = new GridData();
//        data.heightHint = 26;
        data.widthHint = 450;
        data.horizontalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        i_keyText.setLayoutData(data);


        i_valueLabel = new Label(parent, SWT.NONE);
        i_valueLabel.setText("Value:");
        data = new GridData ();
        data.verticalAlignment = GridData.BEGINNING;
        i_valueLabel.setLayoutData (data);
        
        
        i_valueText = new Text(parent, SWT.BORDER/* | SWT.WRAP | SWT.V_SCROLL*/);
        data = new GridData();
//        data.heightHint = 26;
        data.widthHint = 450;
        data.horizontalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        i_valueText.setLayoutData(data);

        i_commentLabel = new Label(parent, SWT.NONE);
        i_commentLabel.setText("Comment:");
        data = new GridData ();
        data.verticalAlignment = GridData.BEGINNING;
        i_commentLabel.setLayoutData (data);
        
        
        i_commentText = new Text(parent, SWT.BORDER/* | SWT.WRAP | SWT.V_SCROLL*/);
        data = new GridData();
//        data.heightHint = 26;
        data.widthHint = 450;
        data.horizontalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        i_commentText.setLayoutData(data);

        // create the top level composite for the dialog area
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.marginHeight = 10;
        layout.marginWidth = 10;
        layout.verticalSpacing = 10;
        composite.setLayout(layout);

        data = new GridData(GridData.FILL_BOTH);

        composite.setLayoutData(data);
        composite.setFont(parent.getFont());

        return composite;
    }

    /**
     * @see org.eclipse.jface.dialogs.Dialog#okPressed()
     */
    protected void okPressed()
    {
        String keyString = i_keyText.getText();
                
        if(keyString == null || keyString == "")
        {
            MessageDialog messageDialog =
                new MessageDialog(
                    getShell(),
                    "New Property...",
                    i_propertiesFilesEditor.getLogo(),
                    "The key string may not be empty",
                    MessageDialog.INFORMATION,
                    new String[] { "OK" },
                    0);
            messageDialog.open();
        }
        else
        {
            // iterate through the datamap and look whether this key already exists
            Iterator iter = PropertyFileUtil.getSortedIterator(i_propertiesFilesEditor.getDataMap().values());
            boolean isAlreadyExisting = false;
            while(iter.hasNext())
            {
            	PropertyLineWrapper element = (PropertyLineWrapper)iter.next();
            	if(isNew() && keyString.equals(element.getKeyString()))
                {
                    isAlreadyExisting = true;
                }
            }
            if(isAlreadyExisting)
            {
                MessageDialog messageDialog =
                    new MessageDialog(
                        getShell(),
                        "New Property...",
                        i_propertiesFilesEditor.getLogo(),
                        "A property with the key \"" + keyString + "\" already exists. Do you wish to overwrite this existing property?",
                        MessageDialog.WARNING,
                        new String[] {"Yes", "No"},
                        0);
                messageDialog.open();
                if(messageDialog.getReturnCode() == MessageDialog.OK)
                {
                    commitChange();
                }
            }
            else
            {
                commitChange();
            }
        }
        i_propertiesFilesEditor.setFocusOnRow();
    }  
    
    /**
     * Returns the commentText.
     * @return String
     */
    public String getCommentString()
    {
        return i_commentText.getText();
    }

    /**
     * Returns the keyText.
     * @return String
     */
    public String getKeyString()
    {
        return i_keyText.getText();
    }

    /**
     * Returns the valueText.
     * @return String
     */
    public String getValueString()
    {
        return i_valueText.getText();
    }

    /**
     * Sets the commentText.
     * @param commentText The commentText to set
     */
    public void setCommentString(String commentString)
    {
        i_commentText.setText(commentString);
    }

    /**
     * Sets the keyText.
     * @param keyText The keyText to set
     */
    public void setKeyString(String keyString)
    {
        i_selectedKey = keyString;
        i_keyText.setText(keyString);
    }

    /**
     * Sets the valueText.
     * @param valueText The valueText to set
     */
    public void setValueString(String valueString)
    {
        i_valueText.setText(valueString);
    }

    /**
     * Method setKeyTextEditable.
     * @param editable
     */
    public void setKeyTextEditable(boolean editable)
    {
        i_keyText.setEditable(editable);
    }
    /**
     * Returns the isCommentedProperty.
     * @return boolean
     */
    public boolean isCommentedProperty()
    {
        return i_isCommentedProperty;
    }

    /**
     * Sets the isCommentedProperty.
     * @param isCommentedProperty The isCommentedProperty to set
     */
    public void setCommentedProperty(boolean isCommentedProperty)
    {
        i_isCommentedProperty = isCommentedProperty;
    }
    
    /**
     * Method commitChange.
     */
    private void commitChange()
    {
        PropertyLineWrapper propertiesLineWrapper = new PropertyLineWrapper();
        propertiesLineWrapper.setCommentString(i_commentText.getText());
        propertiesLineWrapper.setKeyString(i_keyText.getText());
        propertiesLineWrapper.setValueString(i_valueText.getText());
        propertiesLineWrapper.setCommentedProperty(i_isCommentedProperty);
        i_propertiesFilesEditor.addNewProperty(propertiesLineWrapper, i_selectedKey);
        i_propertiesFilesEditor.update();
        super.okPressed();        
    }

    /**
     * Returns the isNew.
     * @return boolean
     */
    public boolean isNew()
    {
        return i_isNew;
    }

    /**
     * Sets the isNew.
     * @param isNew The isNew to set
     */
    public void setNew(boolean isNew)
    {
        i_isNew = isNew;
    }

    /**
     * @see org.eclipse.jface.dialogs.Dialog#cancelPressed()
     */
    protected void cancelPressed()
    {
        super.cancelPressed();
        i_propertiesFilesEditor.setFocusOnRow();
    }

}