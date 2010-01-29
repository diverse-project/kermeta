package org.kermeta.ki.task.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.kermeta.ki.task.TaskModel;
import org.kermeta.ki.task.TaskPackage;
import org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart;
import org.kermeta.ki.task.diagram.edit.parts.AbstractNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.AbstractOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.DesactivFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.DesactivationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingInfoFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingWithInformationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.Interleaving2EditPart;
import org.kermeta.ki.task.diagram.edit.parts.InterleavingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InterleavingFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.SynchroFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.TaskModelEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TaskVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.kermeta.ki.task.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TaskModelEditPart.MODEL_ID.equals(view.getType())) {
				return TaskModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TaskPackage.eINSTANCE.getTaskModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TaskModel) domainElement)) {
			return TaskModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry
				.getModelID(containerView);
		if (!TaskModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (TaskModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TaskModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TaskModelEditPart.VISUAL_ID:
			if (TaskPackage.eINSTANCE.getUser().isSuperTypeOf(
					domainElement.eClass())) {
				return UserEditPart.VISUAL_ID;
			}
			if (TaskPackage.eINSTANCE.getInteraction().isSuperTypeOf(
					domainElement.eClass())) {
				return InteractionEditPart.VISUAL_ID;
			}
			if (TaskPackage.eINSTANCE.getApplication().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplicationEditPart.VISUAL_ID;
			}
			if (TaskPackage.eINSTANCE.getAbstract().isSuperTypeOf(
					domainElement.eClass())) {
				return AbstractEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry
				.getModelID(containerView);
		if (!TaskModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (TaskModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TaskModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UserEditPart.VISUAL_ID:
			if (UserNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InteractionEditPart.VISUAL_ID:
			if (InteractionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InteractionOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationEditPart.VISUAL_ID:
			if (ApplicationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractEditPart.VISUAL_ID:
			if (AbstractNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskModelEditPart.VISUAL_ID:
			if (UserEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InteractionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingEditPart.VISUAL_ID:
			if (EnablingFigureLabelDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingWithInformationEditPart.VISUAL_ID:
			if (EnablingInfoFigureLabelDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Interleaving2EditPart.VISUAL_ID:
			if (InterleavingFigureLabelDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterleavingEditPart.VISUAL_ID:
			if (SynchroFigureLabelDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DesactivationEditPart.VISUAL_ID:
			if (DesactivFigureLabelDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TaskPackage.eINSTANCE.getEnabling().isSuperTypeOf(
				domainElement.eClass())) {
			return EnablingEditPart.VISUAL_ID;
		}
		if (TaskPackage.eINSTANCE.getEnablingWithInformation().isSuperTypeOf(
				domainElement.eClass())) {
			return EnablingWithInformationEditPart.VISUAL_ID;
		}
		if (TaskPackage.eINSTANCE.getInterleaving().isSuperTypeOf(
				domainElement.eClass())) {
			return Interleaving2EditPart.VISUAL_ID;
		}
		if (TaskPackage.eINSTANCE.getSynchronization().isSuperTypeOf(
				domainElement.eClass())) {
			return InterleavingEditPart.VISUAL_ID;
		}
		if (TaskPackage.eINSTANCE.getdesactivation().isSuperTypeOf(
				domainElement.eClass())) {
			return DesactivationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(TaskModel element) {
		return true;
	}

}
