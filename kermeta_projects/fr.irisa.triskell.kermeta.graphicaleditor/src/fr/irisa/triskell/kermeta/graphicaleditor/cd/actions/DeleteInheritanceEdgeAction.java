/*******************************************************************************
 * $Id: DeleteInheritanceEdgeAction.java,v 1.5 2007-04-18 16:02:13 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.actions;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.topcased.modeler.di.model.GraphElement;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.InheritanceEdgeDeleteCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.InheritanceEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.KmEditor;

/**
 * 
 * @generated NOT
 */
public class DeleteInheritanceEdgeAction implements IEditorActionDelegate {

	/**
     * The model/figure object
     * @generated NOT
     */
    private Object template;
    
    /**
     * The EditPart object
     * @generated NOT
     */
    private IEditorPart targetEditor;
    
    /**
     * The WorkbenchPart object
     * @generated NOT
     */
    private IWorkbenchPart targetPart;

	/**
	 * Constructor for DeleteInheritanceEdgeAction
	 * @generated NOT
	 */
	public DeleteInheritanceEdgeAction() {
		super();
	}
	
	/**
	 * @generated NOT
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.targetEditor = targetEditor;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 * @generated NOT
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 * @generated NOT
	 */
	public void run(IAction action) {
		if(this.template != null) {
			InheritanceEdgeDeleteCommand cmd = new InheritanceEdgeDeleteCommand();
			cmd.setPartToBeDeleted(this.template);
			if(targetEditor instanceof KmEditor) {
				KmEditor myKmEditor = (KmEditor) targetEditor;
				((CommandStack) myKmEditor.getAdapter(CommandStack.class)).execute(cmd);
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 * @generated NOT
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
