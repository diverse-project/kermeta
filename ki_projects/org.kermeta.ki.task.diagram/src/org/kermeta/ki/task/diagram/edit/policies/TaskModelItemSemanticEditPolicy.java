package org.kermeta.ki.task.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.kermeta.ki.task.diagram.edit.commands.AbstractCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.ApplicationCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.InteractionCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.UserCreateCommand;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class TaskModelItemSemanticEditPolicy extends
		TaskBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskModelItemSemanticEditPolicy() {
		super(TaskElementTypes.TaskModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TaskElementTypes.User_2001 == req.getElementType()) {
			return getGEFWrapper(new UserCreateCommand(req));
		}
		if (TaskElementTypes.Interaction_2002 == req.getElementType()) {
			return getGEFWrapper(new InteractionCreateCommand(req));
		}
		if (TaskElementTypes.Application_2003 == req.getElementType()) {
			return getGEFWrapper(new ApplicationCreateCommand(req));
		}
		if (TaskElementTypes.Abstract_2004 == req.getElementType()) {
			return getGEFWrapper(new AbstractCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
