/* $Id: SelectionListDialog.java,v 1.1 2008-04-01 15:10:55 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: SelectionListDialog.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 23, 2005
 * Authors: zdrey
 */
package org.kermeta.runner.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

/**
 * 
 */
public class SelectionListDialog extends Dialog
//TwoPaneElementSelector
//
{
    /*
     * ATTRIBUTES
     */
    // The list to display in the dialog
    protected java.util.List selectionList = null;
    protected Object[] arrayList = new Object[0];
    // The event that will be associated to the OK button of this dialog
    protected SelectionAdapter selectionAdapter = null;
    private String selectedItem;
    private Composite parent;
    /**
     * @param parent
     */
    public SelectionListDialog(Shell shell) {
        super(shell);
        // TODO Auto-generated constructor stub
    }

    
    /***
     * Set it after having created it
     *
     */
    public Control createDialogArea(Composite parent)
    {
        Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new FillLayout(SWT.VERTICAL));
		// Set the field for the chosen file
		{
			final Group group = new Group(area, SWT.NONE);
			group.setText("File:");
			group.setLayout(new FillLayout(SWT.VERTICAL));
			{
				List displayList = createDisplayList(group);
				displayList.update();
			}
		}
        return area;
        
    }
    
    /**
     * Create the "List" component and put it in this dialog window
     * TODO : mono selection (do not authorize multi selection)
     * @param parent
     */
    public List createDisplayList(Composite parent)
    {   
        final List list = new List(parent, SWT.V_SCROLL);
        for (int i = 0; i < selectionList.size(); i++) 
        {
            list.add((String)selectionList.get(i));
        }
        list.addSelectionListener(
                new SelectionAdapter()
                {
                    public void widgetSelected(SelectionEvent e)
                    {
                        List list = (List) e.getSource();
                        String[] str = list.getSelection();
                        for (int i = 0; i < str.length; i++)
                        {
                            selectedItem = str[i];
                        }
                    }
                }
        );
        return list;
        
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.jface.dialogs.Dialog#okPressed()
     */
    protected void okPressed() {
        super.okPressed();
    }
    /**
     * Set the field "list" and create the list widget
     * @param list
     */
    public void setList(java.util.List list)    {
        selectionList = list;
    }
    
	/**
	 * @see org.eclipse.jface.window.Window#configureShell(Shell)
	 */
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		//WorkbenchHelp.setHelp(newShell, new Object[] { IJavaHelpContextIds.MAINTYPE_SELECTION_DIALOG });
	}
    
    /**
     * @param pSelectionAdapter the event caused by Okpress
     */
    public void setSelectionAdapter(SelectionAdapter pSelectionAdapter)    {
        selectionAdapter = pSelectionAdapter;
    }

    public SelectionAdapter getSelectionAdapter() { return selectionAdapter; }
    public java.util.List getList() { return selectionList; }
    public Object[] getArrayList() {return arrayList;}
    public String getSelectedItem() { return selectedItem; }
    
}
