/***********************************************************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 **********************************************************************************************************************/
package org.openembedd.logo.csm.diagram.block.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.openembedd.logo.csm.diagram.block.LogoCSMActionConstants;
import org.openembedd.logo.csm.diagram.block.LogoCSMRequestConstants;
import org.openembedd.logo.csm.diagram.block.dialogs.EditExpressionDialog;
import org.openembedd.logo.csm.logoCSM.Back;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.Forward;
import org.openembedd.logo.csm.logoCSM.Left;
import org.openembedd.logo.csm.logoCSM.Primitive;
import org.openembedd.logo.csm.logoCSM.Repeat;
import org.openembedd.logo.csm.logoCSM.Right;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.utils.Utils;

/**
 * Created 25 oct. 06
 * 
 */
public class EditCommentAction extends WorkbenchPartAction implements ISelectionChangedListener
{
	/**
	 * The selected EditPart object
	 */
	private AbstractGraphicalEditPart	template;

	/**
	 * @param part
	 */
	public EditCommentAction(IWorkbenchPart part)
	{
		super(part);
	}

	/**
	 * Edit the expression on Logo Instruction
	 * 
	 * @see org.eclipse.jface.action.IAction#run()
	 */
	public void run()
	{
		GraphElement graphElement = (GraphElement) template.getModel();
		EObject ins = Utils.getElement(graphElement);

		EditExpressionDialog editDialog;

		if (ins instanceof Forward)
			editDialog = new EditExpressionDialog(((Forward) ins).getSteps(), new Shell(),
				"Edit the distance for the turtle to go forward :");
		else if (ins instanceof Back)
			editDialog = new EditExpressionDialog(((Back) ins).getSteps(), new Shell(),
				"Edit the distance for the turtle to go backward :");
		else if (ins instanceof Left)
			editDialog = new EditExpressionDialog(((Left) ins).getAngle(), new Shell(),
				"Edit the angle turned on the left by the turtle :");
		else if (ins instanceof Right)
			editDialog = new EditExpressionDialog(((Right) ins).getAngle(), new Shell(),
				"Edit the angle turned on the right by the turtle :");
		else if (ins instanceof Repeat)
			editDialog = new EditExpressionDialog(((Repeat) ins).getCondition(), new Shell(),
				"Edit the number of repetition :");
		else
		{
			editDialog = null;
		}

		if (editDialog != null && editDialog.open() == Window.OK)
		{
			// construct the EditCommentRequest
			Request request = new Request(LogoCSMRequestConstants.REQ_EDIT_EXPRESSION);
			Map<String, Expression> params = new HashMap<String, Expression>();
			params.put(LogoCSMRequestConstants.REQ_EDIT_EXPRESSION, editDialog.getNewExpressionValue());
			request.setExtendedData(params);

			// get the Command
			Command actionCommand = template.getCommand(request);

			// execute the command
			getCommandStack().execute(actionCommand);
		}
	}

	/**
	 * Determine if the action must appear in the context menu
	 * 
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled()
	{
		if (template == null)
			return false;

		EObject ins = Utils.getElement((GraphElement) template.getModel());

		if (!((ins instanceof Primitive) || (ins instanceof Repeat)))
			return false;

		Request request = new Request(LogoCSMRequestConstants.REQ_EDIT_EXPRESSION);

		return template.understandsRequest(request);
	}

	/**
	 * Initializes the edit comment action
	 * 
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#init()
	 */
	protected void init()
	{
		setId(LogoCSMActionConstants.EDIT_EXPRESSION);
		setText("Edit Expression");
	}

	/**
	 * Sets the selected EditPart and refreshes the enabled state of this action.
	 * 
	 * @param event
	 * 
	 * @see ISelectionChangedListener#selectionChanged(SelectionChangedEvent)
	 */
	public void selectionChanged(SelectionChangedEvent event)
	{
		ISelection s = event.getSelection();
		if (!(s instanceof IStructuredSelection))
			return;
		IStructuredSelection selection = (IStructuredSelection) s;
		template = null;

		if (selection != null && selection.size() == 1)
		{
			Object obj = selection.getFirstElement();
			if (obj instanceof AbstractGraphicalEditPart)
				template = (AbstractGraphicalEditPart) obj;
		}
		refresh();
	}

}
