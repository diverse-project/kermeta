package fr.irisa.triskell.eclipse.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MergeableDestFileWizardPage extends DestFileWizardPage {


	protected Button mergeFileExistRadio;
	
	public MergeableDestFileWizardPage(String pageName,
			IStructuredSelection selection) {
		super(pageName, selection);
		
	}

	@Override
	protected void createPostControls(Composite parent) {
		super.createPostControls(parent);
		
		// update existing controls
		Label label = new Label(fileExistsGroup, SWT.NULL);
		label.setText("Merge with existing file ");
		mergeFileExistRadio = new Button(fileExistsGroup, SWT.RADIO);
		mergeFileExistRadio.setSelection(false);
		mergeFileExistRadio.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleFileExistsButtonSelect();
			}
		});
	}

	@Override
	protected void handleFileExistsButtonSelect() {
		
		super.handleFileExistsButtonSelect();
	}
	
	public boolean mustMerge(){
		return mergeFileExistRadio.getSelection();
	}

}
