package org.kermeta.trek.ui.wizards.kusecase;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.TrekFactory;

public class KusecaseWizard extends Wizard implements INewWizard {

	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	protected KUseCase usecase;
	
	protected KusecaseMainPage mainpage;
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean canFinish(){
		// cannot completr the wizard from the first page
		if (this.getContainer().getCurrentPage()==this.mainpage){
			return true;
		}
		return true;
	}
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		this.workbench = workbench;
		this.selection = selection;
		this.usecase=TrekFactory.eINSTANCE.createKUseCase();
		this.mainpage=new KusecaseMainPage(workbench,selection);
		this.addPage(mainpage);
	}

}
