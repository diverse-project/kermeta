/* $Id: ActivableDestFileWizardPage.java,v 1.2 2005-07-27 14:52:41 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : TraceFileWizardPage.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *         
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * Page for dealing with trace file. It adds a globale enable/disable checkbox
 */
public class ActivableDestFileWizardPage extends DestFileWizardPage{

	protected Button enableFileDestinationButton;
	
	protected String enableLabelstring="Generate file ";
	protected Composite fileDestinationComposite;
	/**
	 * @param pageName
	 * @param selection
	 */
	public ActivableDestFileWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}
	public ActivableDestFileWizardPage(String pageName, IStructuredSelection selection, String newEnableLabelstring) {
		super(pageName, selection);
		enableLabelstring = newEnableLabelstring;
	}

	/**
	 * @param parent
	 */
	protected void createPreControls(Composite parent) {
        // Advanced group
        fileDestinationComposite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2,false);
        fileDestinationComposite.setLayout(layout);
        fileDestinationComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));        

		Label label = new Label(fileDestinationComposite, SWT.NULL);
		label.setText(enableLabelstring);
		enableFileDestinationButton = new Button(fileDestinationComposite, SWT.CHECK);
		enableFileDestinationButton.setSelection(false);
		enableFileDestinationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleEnableDestinationButtonSelect();
			}
		});
		
		
	}
	
	public void createControl(Composite parent)
	{
		super.createControl(parent);
		handleEnableDestinationButtonSelect();
	}

	/**
	 * 
	 */
	protected void handleEnableDestinationButtonSelect() {		
		if(!enableFileDestinationButton.getSelection())
		{
			// disable other widgets
			// disable every children except our composite
			recursiveSetEnabledExcept(topLevel.getChildren(), fileDestinationComposite, false);
			
			// page is valid
			setErrorMessage(null);
			setMessage(null);
			setPageComplete(true);
		}
		else
		{
			// enable other widgets
			recursiveSetEnabledExcept(topLevel.getChildren(), fileDestinationComposite, true);
		}
		// check page content
		setPageComplete(validatePage());
	}
	protected boolean validatePage() {
		if(!enableFileDestinationButton.getSelection())
			return true;
		else
			return super.validatePage();
	}
	
	private void recursiveSetEnabledExcept(Control[] controls, Control exceptionControl, boolean value)
	{
		
		for(int i=0; i < controls.length; i++)
		{
			if (controls[i]!= exceptionControl)
			{
				controls[i].setEnabled(value);
				if(controls[i] instanceof Composite)
				{
					Composite c = (Composite)controls[i];
					recursiveSetEnabledExcept(c.getChildren(),exceptionControl, value);
				}
			}
		}
	}
}
