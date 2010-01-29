package org.kermeta.ki.task.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.kermeta.ki.task.Abstract;
import org.kermeta.ki.task.Application;
import org.kermeta.ki.task.Enabling;
import org.kermeta.ki.task.EnablingWithInformation;
import org.kermeta.ki.task.Interaction;
import org.kermeta.ki.task.Interleaving;
import org.kermeta.ki.task.Synchronization;
import org.kermeta.ki.task.Task;
import org.kermeta.ki.task.TaskModel;
import org.kermeta.ki.task.TaskPackage;
import org.kermeta.ki.task.User;
import org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.DesactivationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingWithInformationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionEditPart;
import org.kermeta.ki.task.diagram.edit.parts.Interleaving2EditPart;
import org.kermeta.ki.task.diagram.edit.parts.InterleavingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.TaskModelEditPart;
import org.kermeta.ki.task.diagram.edit.parts.TaskSubtasksEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserEditPart;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class TaskDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case TaskModelEditPart.VISUAL_ID:
			return getTaskModel_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTaskModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TaskModel modelElement = (TaskModel) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UserEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InteractionEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ApplicationEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case TaskModelEditPart.VISUAL_ID:
			return getTaskModel_1000ContainedLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2001ContainedLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2002ContainedLinks(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2003ContainedLinks(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2004ContainedLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4001ContainedLinks(view);
		case EnablingWithInformationEditPart.VISUAL_ID:
			return getEnablingWithInformation_4002ContainedLinks(view);
		case Interleaving2EditPart.VISUAL_ID:
			return getInterleaving_4003ContainedLinks(view);
		case InterleavingEditPart.VISUAL_ID:
			return getSynchronization_4004ContainedLinks(view);
		case DesactivationEditPart.VISUAL_ID:
			return getDesactivation_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case UserEditPart.VISUAL_ID:
			return getUser_2001IncomingLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2002IncomingLinks(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2003IncomingLinks(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2004IncomingLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4001IncomingLinks(view);
		case EnablingWithInformationEditPart.VISUAL_ID:
			return getEnablingWithInformation_4002IncomingLinks(view);
		case Interleaving2EditPart.VISUAL_ID:
			return getInterleaving_4003IncomingLinks(view);
		case InterleavingEditPart.VISUAL_ID:
			return getSynchronization_4004IncomingLinks(view);
		case DesactivationEditPart.VISUAL_ID:
			return getDesactivation_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case UserEditPart.VISUAL_ID:
			return getUser_2001OutgoingLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2002OutgoingLinks(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2003OutgoingLinks(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2004OutgoingLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4001OutgoingLinks(view);
		case EnablingWithInformationEditPart.VISUAL_ID:
			return getEnablingWithInformation_4002OutgoingLinks(view);
		case Interleaving2EditPart.VISUAL_ID:
			return getInterleaving_4003OutgoingLinks(view);
		case InterleavingEditPart.VISUAL_ID:
			return getSynchronization_4004OutgoingLinks(view);
		case DesactivationEditPart.VISUAL_ID:
			return getDesactivation_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTaskModel_1000ContainedLinks(View view) {
		TaskModel modelElement = (TaskModel) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Enabling_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_EnablingWithInformation_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Interleaving_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Synchronization_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_desactivation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUser_2001ContainedLinks(View view) {
		User modelElement = (User) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2002ContainedLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getApplication_2003ContainedLinks(View view) {
		Application modelElement = (Application) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAbstract_2004ContainedLinks(View view) {
		Abstract modelElement = (Abstract) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnabling_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEnablingWithInformation_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterleaving_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSynchronization_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDesactivation_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUser_2001IncomingLinks(View view) {
		User modelElement = (User) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_EnablingWithInformation_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Interleaving_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Synchronization_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_desactivation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Subtasks_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2002IncomingLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_EnablingWithInformation_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Interleaving_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Synchronization_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_desactivation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Subtasks_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getApplication_2003IncomingLinks(View view) {
		Application modelElement = (Application) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_EnablingWithInformation_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Interleaving_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Synchronization_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_desactivation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Subtasks_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAbstract_2004IncomingLinks(View view) {
		Abstract modelElement = (Abstract) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_EnablingWithInformation_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Interleaving_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Synchronization_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_desactivation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Subtasks_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnabling_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEnablingWithInformation_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterleaving_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSynchronization_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDesactivation_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUser_2001OutgoingLinks(View view) {
		User modelElement = (User) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Enabling_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformation_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Interleaving_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Synchronization_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_desactivation_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2002OutgoingLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Enabling_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformation_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Interleaving_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Synchronization_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_desactivation_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getApplication_2003OutgoingLinks(View view) {
		Application modelElement = (Application) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Enabling_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformation_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Interleaving_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Synchronization_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_desactivation_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAbstract_2004OutgoingLinks(View view) {
		Abstract modelElement = (Abstract) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Enabling_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformation_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Interleaving_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Synchronization_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_desactivation_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnabling_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEnablingWithInformation_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterleaving_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSynchronization_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDesactivation_4005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Enabling_4001(
			TaskModel container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) linkObject;
			if (EnablingEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			result
					.add(new TaskLinkDescriptor(src, dst, link,
							TaskElementTypes.Enabling_4001,
							EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_EnablingWithInformation_4002(
			TaskModel container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWithInformation) {
				continue;
			}
			EnablingWithInformation link = (EnablingWithInformation) linkObject;
			if (EnablingWithInformationEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.EnablingWithInformation_4002,
					EnablingWithInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Interleaving_4003(
			TaskModel container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Interleaving) {
				continue;
			}
			Interleaving link = (Interleaving) linkObject;
			if (Interleaving2EditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.Interleaving_4003,
					Interleaving2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Synchronization_4004(
			TaskModel container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Synchronization) {
				continue;
			}
			Synchronization link = (Synchronization) linkObject;
			if (InterleavingEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.Synchronization_4004,
					InterleavingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_desactivation_4005(
			TaskModel container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.kermeta.ki.task.desactivation) {
				continue;
			}
			org.kermeta.ki.task.desactivation link = (org.kermeta.ki.task.desactivation) linkObject;
			if (DesactivationEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.Desactivation_4005,
					DesactivationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Enabling_4001(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TaskPackage.eINSTANCE
					.getOperator_Target()
					|| false == setting.getEObject() instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) setting.getEObject();
			if (EnablingEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSrc();
			result
					.add(new TaskLinkDescriptor(src, target, link,
							TaskElementTypes.Enabling_4001,
							EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_EnablingWithInformation_4002(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TaskPackage.eINSTANCE
					.getOperator_Target()
					|| false == setting.getEObject() instanceof EnablingWithInformation) {
				continue;
			}
			EnablingWithInformation link = (EnablingWithInformation) setting
					.getEObject();
			if (EnablingWithInformationEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.EnablingWithInformation_4002,
					EnablingWithInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Interleaving_4003(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TaskPackage.eINSTANCE
					.getOperator_Target()
					|| false == setting.getEObject() instanceof Interleaving) {
				continue;
			}
			Interleaving link = (Interleaving) setting.getEObject();
			if (Interleaving2EditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.Interleaving_4003,
					Interleaving2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Synchronization_4004(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TaskPackage.eINSTANCE
					.getOperator_Target()
					|| false == setting.getEObject() instanceof Synchronization) {
				continue;
			}
			Synchronization link = (Synchronization) setting.getEObject();
			if (InterleavingEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.Synchronization_4004,
					InterleavingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_desactivation_4005(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TaskPackage.eINSTANCE
					.getOperator_Target()
					|| false == setting.getEObject() instanceof org.kermeta.ki.task.desactivation) {
				continue;
			}
			org.kermeta.ki.task.desactivation link = (org.kermeta.ki.task.desactivation) setting
					.getEObject();
			if (DesactivationEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSrc();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.Desactivation_4005,
					DesactivationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Task_Subtasks_4006(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TaskPackage.eINSTANCE
					.getTask_Subtasks()) {
				result.add(new TaskLinkDescriptor(setting.getEObject(), target,
						TaskElementTypes.TaskSubtasks_4006,
						TaskSubtasksEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Enabling_4001(
			Task source) {
		TaskModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TaskModel) {
				container = (TaskModel) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) linkObject;
			if (EnablingEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			if (src != source) {
				continue;
			}
			result
					.add(new TaskLinkDescriptor(src, dst, link,
							TaskElementTypes.Enabling_4001,
							EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_EnablingWithInformation_4002(
			Task source) {
		TaskModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TaskModel) {
				container = (TaskModel) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWithInformation) {
				continue;
			}
			EnablingWithInformation link = (EnablingWithInformation) linkObject;
			if (EnablingWithInformationEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.EnablingWithInformation_4002,
					EnablingWithInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Interleaving_4003(
			Task source) {
		TaskModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TaskModel) {
				container = (TaskModel) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Interleaving) {
				continue;
			}
			Interleaving link = (Interleaving) linkObject;
			if (Interleaving2EditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.Interleaving_4003,
					Interleaving2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Synchronization_4004(
			Task source) {
		TaskModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TaskModel) {
				container = (TaskModel) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Synchronization) {
				continue;
			}
			Synchronization link = (Synchronization) linkObject;
			if (InterleavingEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.Synchronization_4004,
					InterleavingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_desactivation_4005(
			Task source) {
		TaskModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TaskModel) {
				container = (TaskModel) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.kermeta.ki.task.desactivation) {
				continue;
			}
			org.kermeta.ki.task.desactivation link = (org.kermeta.ki.task.desactivation) linkObject;
			if (DesactivationEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.Desactivation_4005,
					DesactivationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Task_Subtasks_4006(
			Task source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSubtasks().iterator(); destinations
				.hasNext();) {
			Task destination = (Task) destinations.next();
			result.add(new TaskLinkDescriptor(source, destination,
					TaskElementTypes.TaskSubtasks_4006,
					TaskSubtasksEditPart.VISUAL_ID));
		}
		return result;
	}

}
