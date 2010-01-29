package org.kermeta.ki.task.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.kermeta.ki.task.diagram.edit.commands.DesactivationCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.DesactivationReorientCommand;
import org.kermeta.ki.task.diagram.edit.commands.EnablingCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.EnablingReorientCommand;
import org.kermeta.ki.task.diagram.edit.commands.EnablingWithInformationCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.EnablingWithInformationReorientCommand;
import org.kermeta.ki.task.diagram.edit.commands.Interleaving2CreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.Interleaving2ReorientCommand;
import org.kermeta.ki.task.diagram.edit.commands.InterleavingCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.InterleavingReorientCommand;
import org.kermeta.ki.task.diagram.edit.commands.TaskSubtasksCreateCommand;
import org.kermeta.ki.task.diagram.edit.commands.TaskSubtasksReorientCommand;
import org.kermeta.ki.task.diagram.edit.parts.DesactivationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingWithInformationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.Interleaving2EditPart;
import org.kermeta.ki.task.diagram.edit.parts.InterleavingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.TaskSubtasksEditPart;
import org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class InteractionItemSemanticEditPolicy extends
		TaskBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InteractionItemSemanticEditPolicy() {
		super(TaskElementTypes.Interaction_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == EnablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == EnablingWithInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == Interleaving2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == InterleavingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == DesactivationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == TaskSubtasksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == EnablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == EnablingWithInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == Interleaving2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == InterleavingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == DesactivationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == TaskSubtasksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TaskElementTypes.Enabling_4001 == req.getElementType()) {
			return getGEFWrapper(new EnablingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.EnablingWithInformation_4002 == req
				.getElementType()) {
			return getGEFWrapper(new EnablingWithInformationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.Interleaving_4003 == req.getElementType()) {
			return getGEFWrapper(new Interleaving2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.Synchronization_4004 == req.getElementType()) {
			return getGEFWrapper(new InterleavingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.Desactivation_4005 == req.getElementType()) {
			return getGEFWrapper(new DesactivationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.TaskSubtasks_4006 == req.getElementType()) {
			return getGEFWrapper(new TaskSubtasksCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TaskElementTypes.Enabling_4001 == req.getElementType()) {
			return getGEFWrapper(new EnablingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.EnablingWithInformation_4002 == req
				.getElementType()) {
			return getGEFWrapper(new EnablingWithInformationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.Interleaving_4003 == req.getElementType()) {
			return getGEFWrapper(new Interleaving2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.Synchronization_4004 == req.getElementType()) {
			return getGEFWrapper(new InterleavingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.Desactivation_4005 == req.getElementType()) {
			return getGEFWrapper(new DesactivationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.TaskSubtasks_4006 == req.getElementType()) {
			return getGEFWrapper(new TaskSubtasksCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EnablingEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingReorientCommand(req));
		case EnablingWithInformationEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWithInformationReorientCommand(req));
		case Interleaving2EditPart.VISUAL_ID:
			return getGEFWrapper(new Interleaving2ReorientCommand(req));
		case InterleavingEditPart.VISUAL_ID:
			return getGEFWrapper(new InterleavingReorientCommand(req));
		case DesactivationEditPart.VISUAL_ID:
			return getGEFWrapper(new DesactivationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case TaskSubtasksEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskSubtasksReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
