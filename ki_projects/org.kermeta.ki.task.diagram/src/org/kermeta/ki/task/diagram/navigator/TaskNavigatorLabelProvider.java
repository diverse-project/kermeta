package org.kermeta.ki.task.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.kermeta.ki.task.diagram.edit.parts.AbstractEditPart;
import org.kermeta.ki.task.diagram.edit.parts.AbstractNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.DesactivFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.DesactivationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingInfoFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.EnablingWithInformationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.Interleaving2EditPart;
import org.kermeta.ki.task.diagram.edit.parts.InterleavingEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InterleavingFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.SynchroFigureLabelDescEditPart;
import org.kermeta.ki.task.diagram.edit.parts.TaskModelEditPart;
import org.kermeta.ki.task.diagram.edit.parts.TaskSubtasksEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserNameEditPart;
import org.kermeta.ki.task.diagram.part.TaskDiagramEditorPlugin;
import org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;
import org.kermeta.ki.task.diagram.providers.TaskParserProvider;

/**
 * @generated
 */
public class TaskNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TaskDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TaskDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TaskNavigatorItem
				&& !isOwnView(((TaskNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TaskNavigatorGroup) {
			TaskNavigatorGroup group = (TaskNavigatorGroup) element;
			return TaskDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof TaskNavigatorItem) {
			TaskNavigatorItem navigatorItem = (TaskNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case TaskModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://task?TaskModel", TaskElementTypes.TaskModel_1000); //$NON-NLS-1$
		case UserEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://task?User", TaskElementTypes.User_2001); //$NON-NLS-1$
		case InteractionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://task?Interaction", TaskElementTypes.Interaction_2002); //$NON-NLS-1$
		case ApplicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://task?Application", TaskElementTypes.Application_2003); //$NON-NLS-1$
		case AbstractEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://task?Abstract", TaskElementTypes.Abstract_2004); //$NON-NLS-1$
		case EnablingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://task?Enabling", TaskElementTypes.Enabling_4001); //$NON-NLS-1$
		case EnablingWithInformationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://task?EnablingWithInformation", TaskElementTypes.EnablingWithInformation_4002); //$NON-NLS-1$
		case Interleaving2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://task?Interleaving", TaskElementTypes.Interleaving_4003); //$NON-NLS-1$
		case InterleavingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://task?Synchronization", TaskElementTypes.Synchronization_4004); //$NON-NLS-1$
		case DesactivationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://task?desactivation", TaskElementTypes.Desactivation_4005); //$NON-NLS-1$
		case TaskSubtasksEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://task?Task?subtasks", TaskElementTypes.TaskSubtasks_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TaskDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TaskElementTypes.isKnownElementType(elementType)) {
			image = TaskElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof TaskNavigatorGroup) {
			TaskNavigatorGroup group = (TaskNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TaskNavigatorItem) {
			TaskNavigatorItem navigatorItem = (TaskNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case TaskModelEditPart.VISUAL_ID:
			return getTaskModel_1000Text(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2001Text(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2002Text(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2003Text(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2004Text(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4001Text(view);
		case EnablingWithInformationEditPart.VISUAL_ID:
			return getEnablingWithInformation_4002Text(view);
		case Interleaving2EditPart.VISUAL_ID:
			return getInterleaving_4003Text(view);
		case InterleavingEditPart.VISUAL_ID:
			return getSynchronization_4004Text(view);
		case DesactivationEditPart.VISUAL_ID:
			return getDesactivation_4005Text(view);
		case TaskSubtasksEditPart.VISUAL_ID:
			return getTaskSubtasks_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTaskModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUser_2001Text(View view) {
		IParser parser = TaskParserProvider.getParser(
				TaskElementTypes.User_2001, view.getElement() != null ? view
						.getElement() : view, TaskVisualIDRegistry
						.getType(UserNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInteraction_2002Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(TaskElementTypes.Interaction_2002,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(InteractionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplication_2003Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(TaskElementTypes.Application_2003,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(ApplicationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAbstract_2004Text(View view) {
		IParser parser = TaskParserProvider.getParser(
				TaskElementTypes.Abstract_2004,
				view.getElement() != null ? view.getElement() : view,
				TaskVisualIDRegistry.getType(AbstractNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnabling_4001Text(View view) {
		IParser parser = TaskParserProvider.getParser(
				TaskElementTypes.Enabling_4001,
				view.getElement() != null ? view.getElement() : view,
				TaskVisualIDRegistry
						.getType(EnablingFigureLabelDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnablingWithInformation_4002Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(
						TaskElementTypes.EnablingWithInformation_4002,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(EnablingInfoFigureLabelDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterleaving_4003Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(
						TaskElementTypes.Interleaving_4003,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(InterleavingFigureLabelDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSynchronization_4004Text(View view) {
		IParser parser = TaskParserProvider.getParser(
				TaskElementTypes.Synchronization_4004,
				view.getElement() != null ? view.getElement() : view,
				TaskVisualIDRegistry
						.getType(SynchroFigureLabelDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesactivation_4005Text(View view) {
		IParser parser = TaskParserProvider.getParser(
				TaskElementTypes.Desactivation_4005,
				view.getElement() != null ? view.getElement() : view,
				TaskVisualIDRegistry
						.getType(DesactivFigureLabelDescEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskSubtasks_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TaskModelEditPart.MODEL_ID.equals(TaskVisualIDRegistry
				.getModelID(view));
	}

}
