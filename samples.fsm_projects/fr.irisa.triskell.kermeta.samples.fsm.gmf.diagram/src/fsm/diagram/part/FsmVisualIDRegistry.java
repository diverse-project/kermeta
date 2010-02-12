package fsm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import fsm.FsmDemoPackage;
import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.StateEditPart;
import fsm.diagram.edit.parts.StateName2EditPart;
import fsm.diagram.edit.parts.StateNameEditPart;
import fsm.diagram.edit.parts.TransitionEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FsmVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "fr.irisa.triskell.kermeta.samples.fsm.gmf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FSMEditPart.MODEL_ID.equals(view.getType())) {
				return FSMEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return fsm.diagram.part.FsmVisualIDRegistry.getVisualID(view.getType());
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
				FsmDiagramEditorPlugin.getInstance().logError(
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
		if (FsmDemoPackage.eINSTANCE.getFSM().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((fsm.FSM) domainElement)) {
			return FSMEditPart.VISUAL_ID;
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
		String containerModelID = fsm.diagram.part.FsmVisualIDRegistry
				.getModelID(containerView);
		if (!FSMEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FSMEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fsm.diagram.part.FsmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FSMEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FSMEditPart.VISUAL_ID:
			if (FsmDemoPackage.eINSTANCE.getState().isSuperTypeOf(
					domainElement.eClass())) {
				return StateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = fsm.diagram.part.FsmVisualIDRegistry
				.getModelID(containerView);
		if (!FSMEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FSMEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fsm.diagram.part.FsmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FSMEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case StateEditPart.VISUAL_ID:
			if (StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FSMEditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
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
		if (FsmDemoPackage.eINSTANCE.getTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(fsm.FSM element) {
		return true;
	}

}
