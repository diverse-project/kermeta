

/*$Id: ModelcheckingPropertyPage.java,v 1.2 2008-02-14 07:13:43 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	ModelcheckingPropertyPage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 déc. 07
* Authors : paco
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
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;
import org.kermeta.texteditor.ModelcheckingStrategy;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class ModelcheckingPropertyPage extends PropertyPage implements
		IWorkbenchPropertyPage {
	
	private int selection = -1;
	
	public ModelcheckingPropertyPage() {
	}

	@Override
	protected Control createContents(Composite parent) {
		
		selection = TexteditorPlugin.getDefault().getModelCheckingStrategy();
				
		Group group = new Group(parent, SWT.NONE);
		group.setText("Modelchecking Strategy");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		group.setLayout( layout );
		
		Button savingTime = new Button(group, SWT.RADIO);
		savingTime.setText("At saving time");
		savingTime.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					selection = ModelcheckingStrategy.SAVING_TIME;
				}
			} 
		);
		if ( selection == ModelcheckingStrategy.SAVING_TIME )
			savingTime.setSelection(true);

		
		Button editorChangedTime = new Button(group, SWT.RADIO);
		editorChangedTime.setText("When editor input changed and at saving time");
		editorChangedTime.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					selection = ModelcheckingStrategy.INPUT_CHANGED;
				}
			} 
		);		
		if ( selection == ModelcheckingStrategy.INPUT_CHANGED )
			editorChangedTime.setSelection(true);

		Button editorNever = new Button(group, SWT.RADIO);
		editorNever.setText("Never checks files. I prefer to use the dedicated button manually.");
		editorNever.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					selection = ModelcheckingStrategy.NEVER;
				}
			} 
		);		
		if ( selection == ModelcheckingStrategy.NEVER )
			editorNever.setSelection(true);

		
		return parent;
	}

	@Override
	protected void performApply() {
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
	}

}


