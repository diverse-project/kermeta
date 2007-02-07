package fr.irisa.triskell.kermeta.graphicaleditor.cd.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

import org.topcased.modeler.di.model.GraphElement;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.InheritanceEdgeDeleteCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.InheritanceEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.KmEditor;

public class DeleteInheritanceEdgeAction implements IEditorActionDelegate {

	/**
     * The model/figure object
     */
    private Object template;
    
    /**
     * The EditPart object
     */
    private IEditorPart targetEditor;
    
    /**
     * The WorkbenchPart object
     */
    private IWorkbenchPart targetPart;

	/**
	 * Constructor for Action1.
	 */
	public DeleteInheritanceEdgeAction() {
		super();
	}
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.targetEditor = targetEditor;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if(this.template != null) {
			InheritanceEdgeDeleteCommand cmd = new InheritanceEdgeDeleteCommand();
			cmd.setPartToBeDeleted(this.template);
			if(targetEditor instanceof KmEditor) {
				KmEditor myKmEditor = (KmEditor) targetEditor;
				myKmEditor.getCommandStack().execute(cmd);
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
		if(selection instanceof IStructuredSelection)
		{
			Object first = ((IStructuredSelection) selection).getFirstElement();
			if(first instanceof InheritanceEditPart) {
				if(((InheritanceEditPart) first).getModel() instanceof GraphElement) {
					this.template = ((InheritanceEditPart) first).getModel();
					action.setEnabled(true);
				}
			}
		}
	}
}
