/*$Id: ModelcheckingPreferencePage.java,v 1.1 2008-09-22 12:17:34 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	ModelcheckingPreferencePage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 dec. 07
* Authors : 
* 		Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.texteditor.preferences;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.jface.preference.PreferencePage;
import org.kermeta.texteditor.ModelcheckingStrategy;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class ModelcheckingPreferencePage extends PreferencePage implements
	IWorkbenchPreferencePage  {
	
	private int selection = -1;
	Button savingTimeButton;
	Button editorChangedTimeButton;
	Button editorNeverButton;
	public ModelcheckingPreferencePage() {
	}
	
	@Override
	protected Control createContents(Composite parent) {
		
		selection = TexteditorPlugin.getDefault().getModelCheckingStrategy();
				
		Group group = new Group(parent, SWT.NONE);
		group.setText("Modelchecking Strategy");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		group.setLayout( layout );
		
		savingTimeButton = new Button(group, SWT.RADIO);
		savingTimeButton.setText("At saving time");
		savingTimeButton.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					selection = ModelcheckingStrategy.SAVING_TIME;
				}
			} 
		);
		if ( selection == ModelcheckingStrategy.SAVING_TIME )
			savingTimeButton.setSelection(true);

		
		editorChangedTimeButton = new Button(group, SWT.RADIO);
		editorChangedTimeButton.setText("When editor input changed and at saving time");
		editorChangedTimeButton.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					selection = ModelcheckingStrategy.INPUT_CHANGED;
				}
			} 
		);		
		if ( selection == ModelcheckingStrategy.INPUT_CHANGED )
			editorChangedTimeButton.setSelection(true);

		editorNeverButton = new Button(group, SWT.RADIO);
		editorNeverButton.setText("Never checks files. I prefer to use the dedicated button manually.");
		editorNeverButton.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					selection = ModelcheckingStrategy.NEVER;
				}
			} 
		);		
		if ( selection == ModelcheckingStrategy.NEVER )
			editorNeverButton.setSelection(true);

		
		return parent;
	}

	@Override
	public boolean performOk() {
		switch (selection) {
		case ModelcheckingStrategy.SAVING_TIME :
			TexteditorPlugin.getDefault().setModelCheckingStrategy( ModelcheckingStrategy.SAVING_TIME );
			break;
			
		case ModelcheckingStrategy.INPUT_CHANGED :
			TexteditorPlugin.getDefault().setModelCheckingStrategy( ModelcheckingStrategy.INPUT_CHANGED );
			break;
			
		case ModelcheckingStrategy.NEVER :
			TexteditorPlugin.getDefault().setModelCheckingStrategy( ModelcheckingStrategy.NEVER );
			break;
			
		default:
			break;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		selection = TexteditorPlugin.getDefault().getPreferenceStore().getDefaultInt(ModelcheckingStrategy.MODE_KEY);
		switch (selection) {
		case ModelcheckingStrategy.SAVING_TIME :

			savingTimeButton.setSelection(true);
			editorChangedTimeButton.setSelection(false);
			editorNeverButton.setSelection(false);
			break;
			
		case ModelcheckingStrategy.INPUT_CHANGED :
			savingTimeButton.setSelection(false);
			editorChangedTimeButton.setSelection(true);
			editorNeverButton.setSelection(false);
			break;
			
		case ModelcheckingStrategy.NEVER :
			savingTimeButton.setSelection(false);
			editorChangedTimeButton.setSelection(false);
			editorNeverButton.setSelection(true);
			break;
			
		default:
			break;
		}		
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}


