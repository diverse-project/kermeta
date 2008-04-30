/* $Id: GeneralConfigurationTab.java,v 1.2 2008-04-30 13:58:49 ftanguy Exp $
 * Project: org.kermeta.runner.ui
 * File: GeneralConfigurationTab.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 20, 2005
 * Authors: zdrey
 */
package org.kermeta.runner.launching;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * 
 */
public class GeneralConfigurationTab extends AbstractLaunchConfigurationTab {

    private Label log4JLocationLabel;
    private Text log4JLocationText;
    private Button log4JLocationButton;
    private ModifyListener fBasicModifyListener;

    /**
     * 
     */
    public GeneralConfigurationTab() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Creates the layout of this tab
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent)
    {
        // The default path for the STD_LIB_URI
        
        // The default path for the storage directory
        
        // The default path for the log4jConfiguration file

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeFrom(ILaunchConfiguration configuration) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub

    }

    /**
     * Returns the label of the Tab represented by this class
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() {
        return "General configuration";
    }
    
    public Composite createLog4JFileLayout(Composite parent, Font font)
    {
        GridLayout locationLayout = new GridLayout();
        locationLayout.numColumns = 2;
        locationLayout.marginHeight = 0;
        locationLayout.marginWidth = 0;
        parent.setLayout(locationLayout);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        parent.setLayoutData(gd);
        parent.setFont(font);
        
        log4JLocationLabel = new Label(parent, SWT.NONE);
        log4JLocationLabel.setText("Location of Kermeta");
        gd = new GridData();
        gd.horizontalSpan = 2;
        log4JLocationLabel.setLayoutData(gd);
        log4JLocationLabel.setFont(font);
        
        log4JLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        // Set default location
        log4JLocationText.setText("");
        
        gd = new GridData(GridData.FILL_HORIZONTAL);
        log4JLocationText.setLayoutData(gd);
        log4JLocationText.setFont(font);
        log4JLocationText.addModifyListener(fBasicModifyListener);
        
        log4JLocationButton = createPushButton(parent, "Browse", null);	
        log4JLocationButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent evt) {
                handleLog4JLocationButtonSelected();
            }
        });	
        return parent;
    }

    /**
     * 
     */
    protected void handleLog4JLocationButtonSelected() {
        // TODO Auto-generated method stub
        
    }


}
