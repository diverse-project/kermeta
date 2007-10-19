package org.kermeta.trek.ui.views.nav.operations;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.kermeta.trek.ui.views.nav.KustomAction;
import org.kermeta.trek.ui.wizards.kusecase.KusecaseWizard;

public class CreateKUsecase extends KustomAction {
	public CreateKUsecase(){
		super.setText("new KUse Case");
	}
	public void run(){
		System.out.println("create use case");
		KusecaseWizard wizard=new KusecaseWizard();
		wizard.init( PlatformUI.getWorkbench(), null);	
		WizardDialog dialog = new WizardDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.create();
		dialog.open();
	}
}
