package org.kermeta.ki.task.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.kermeta.ki.task.TaskPackage;
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
import org.kermeta.ki.task.diagram.part.TaskDiagramEditorPlugin;

/**
 * @generated
 */
public class TaskElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private TaskElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType TaskModel_1000 = getElementType("org.kermeta.ki.task.diagram.TaskModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType User_2001 = getElementType("org.kermeta.ki.task.diagram.User_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Interaction_2002 = getElementType("org.kermeta.ki.task.diagram.Interaction_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Application_2003 = getElementType("org.kermeta.ki.task.diagram.Application_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Abstract_2004 = getElementType("org.kermeta.ki.task.diagram.Abstract_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enabling_4001 = getElementType("org.kermeta.ki.task.diagram.Enabling_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnablingWithInformation_4002 = getElementType("org.kermeta.ki.task.diagram.EnablingWithInformation_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Interleaving_4003 = getElementType("org.kermeta.ki.task.diagram.Interleaving_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Synchronization_4004 = getElementType("org.kermeta.ki.task.diagram.Synchronization_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Desactivation_4005 = getElementType("org.kermeta.ki.task.diagram.Desactivation_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskSubtasks_4006 = getElementType("org.kermeta.ki.task.diagram.TaskSubtasks_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return TaskDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(TaskModel_1000, TaskPackage.eINSTANCE.getTaskModel());

			elements.put(User_2001, TaskPackage.eINSTANCE.getUser());

			elements.put(Interaction_2002, TaskPackage.eINSTANCE
					.getInteraction());

			elements.put(Application_2003, TaskPackage.eINSTANCE
					.getApplication());

			elements.put(Abstract_2004, TaskPackage.eINSTANCE.getAbstract());

			elements.put(Enabling_4001, TaskPackage.eINSTANCE.getEnabling());

			elements.put(EnablingWithInformation_4002, TaskPackage.eINSTANCE
					.getEnablingWithInformation());

			elements.put(Interleaving_4003, TaskPackage.eINSTANCE
					.getInterleaving());

			elements.put(Synchronization_4004, TaskPackage.eINSTANCE
					.getSynchronization());

			elements.put(Desactivation_4005, TaskPackage.eINSTANCE
					.getdesactivation());

			elements.put(TaskSubtasks_4006, TaskPackage.eINSTANCE
					.getTask_Subtasks());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(TaskModel_1000);
			KNOWN_ELEMENT_TYPES.add(User_2001);
			KNOWN_ELEMENT_TYPES.add(Interaction_2002);
			KNOWN_ELEMENT_TYPES.add(Application_2003);
			KNOWN_ELEMENT_TYPES.add(Abstract_2004);
			KNOWN_ELEMENT_TYPES.add(Enabling_4001);
			KNOWN_ELEMENT_TYPES.add(EnablingWithInformation_4002);
			KNOWN_ELEMENT_TYPES.add(Interleaving_4003);
			KNOWN_ELEMENT_TYPES.add(Synchronization_4004);
			KNOWN_ELEMENT_TYPES.add(Desactivation_4005);
			KNOWN_ELEMENT_TYPES.add(TaskSubtasks_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TaskModelEditPart.VISUAL_ID:
			return TaskModel_1000;
		case UserEditPart.VISUAL_ID:
			return User_2001;
		case InteractionEditPart.VISUAL_ID:
			return Interaction_2002;
		case ApplicationEditPart.VISUAL_ID:
			return Application_2003;
		case AbstractEditPart.VISUAL_ID:
			return Abstract_2004;
		case EnablingEditPart.VISUAL_ID:
			return Enabling_4001;
		case EnablingWithInformationEditPart.VISUAL_ID:
			return EnablingWithInformation_4002;
		case Interleaving2EditPart.VISUAL_ID:
			return Interleaving_4003;
		case InterleavingEditPart.VISUAL_ID:
			return Synchronization_4004;
		case DesactivationEditPart.VISUAL_ID:
			return Desactivation_4005;
		case TaskSubtasksEditPart.VISUAL_ID:
			return TaskSubtasks_4006;
		}
		return null;
	}

}
