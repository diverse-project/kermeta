package org.kermeta.trek.ui.wizards.kusecase;

import java.awt.TextArea;
import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.KUseLevel;

public class KusecaseMainPage extends WizardPage implements Listener {

	Text name;
	Text summary;
	Text shortSummary;
	Combo level;
	
	
	KUseCase refinesParent;
	
	IWorkbench workbench;
	IStructuredSelection selection;
	
	IStatus nameStatus;
	
	protected KusecaseMainPage(IWorkbench workbench, IStructuredSelection selection) {
		super("Page1");
		setTitle("New KUseCase");
		setDescription("Create a new Kermeta Use Case");
		this.workbench = workbench;
		this.selection = selection;
		this.nameStatus=new Status(IStatus.OK, "not_used", 0, "", null);
	}

	@Override
	public void handleEvent(Event event) {
		 Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		 if (event.widget==this.name){
			 if(this.name.getText().equals("")||this.name.getText().matches("^( )*$")){
			      status = new Status(IStatus.ERROR, "not_used", 0, 
			                "Name cannot be empty", null);  
			 }
			 this.nameStatus=status;
		 }
		 this.applyToStatusLine(status);
		 getWizard().getContainer().updateButtons();
	}

	@Override
	public void createControl(Composite parent) {
		GridData gd;
		Composite composite =  new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout();
		int ncol = 4;
		gl.numColumns = ncol;
		composite.setLayout(gl);
		
		new Label (composite, SWT.NONE).setText("Level:");
		level = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		level.setLayout(gl);
		ArrayList<String> levelNames=new ArrayList<String>();
		
		for(KUseLevel tlevel:KUseLevel.values()){
			levelNames.add(tlevel.getName());
		}
		level.setItems(levelNames.toArray(new String[0]));
		
		
		createLine(composite, ncol);
		
		// name
		new Label (composite, SWT.NONE).setText("Name:");
		name=new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		name.setLayoutData(gd);
		
		
		//shortSummary
		new Label (composite, SWT.NONE).setText("Short Summary:");
		shortSummary=new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		shortSummary.setLayoutData(gd);
		shortSummary.setText("default abstracts");
		
		//summary
		new Label (composite, SWT.NONE).setText("Summary:");
		summary=new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		summary.setText("default summary");
		summary.setLayoutData(gd);
		setControl(composite);
		addListeners();
	}
	
	private void addListeners()
	{
		name.addListener(SWT.Selection, this);
		level.addListener(SWT.KeyUp, this);
		shortSummary.addListener(SWT.Selection, this);
		summary.addListener(SWT.Selection, this);
	}
	private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}	
	private void applyToStatusLine(IStatus status) {
		String message= status.getMessage();
		if (message.length() == 0) message= null;
		switch (status.getSeverity()) {
			case IStatus.OK:
				setErrorMessage(null);
				setMessage(message);
				break;
			case IStatus.WARNING:
				setErrorMessage(null);
				setMessage(message, WizardPage.WARNING);
				break;				
			case IStatus.INFO:
				setErrorMessage(null);
				setMessage(message, WizardPage.INFORMATION);
				break;			
			default:
				setErrorMessage(message);
				setMessage(null);
				break;		
		}
	}	
	
	public boolean canFlipToNextPage()
	{
		if (getErrorMessage() != null) return false;
		return true;
	}
}
