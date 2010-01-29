package org.kermeta.ki.task.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class TaskPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTasks1Group());
		paletteRoot.add(createOperations2Group());
	}

	/**
	 * Creates "Tasks" palette tool group
	 * @generated
	 */
	private PaletteContainer createTasks1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Tasks1Group_title);
		paletteContainer.setId("createTasks1Group"); //$NON-NLS-1$
		paletteContainer.add(createAbstract1CreationTool());
		paletteContainer.add(createUser2CreationTool());
		paletteContainer.add(createInteraction3CreationTool());
		paletteContainer.add(createApplication4CreationTool());
		paletteContainer.add(createSubtask5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Operations" palette tool group
	 * @generated
	 */
	private PaletteContainer createOperations2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Operations2Group_title);
		paletteContainer.setId("createOperations2Group"); //$NON-NLS-1$
		paletteContainer.add(createInterleaving1CreationTool());
		paletteContainer.add(createSynchronisation2CreationTool());
		paletteContainer.add(createEnabling3CreationTool());
		paletteContainer.add(createEnablingWithInfo4CreationTool());
		paletteContainer.add(createDesactivation5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAbstract1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Abstract_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Abstract1CreationTool_title,
				Messages.Abstract1CreationTool_desc, types);
		entry.setId("createAbstract1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/cloud16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/cloud32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUser2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.User_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.User2CreationTool_title,
				Messages.User2CreationTool_desc, types);
		entry.setId("createUser2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/user16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/user32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInteraction3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Interaction_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Interaction3CreationTool_title,
				Messages.Interaction3CreationTool_desc, types);
		entry.setId("createInteraction3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/interaction16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/interaction32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplication4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Application_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Application4CreationTool_title,
				Messages.Application4CreationTool_desc, types);
		entry.setId("createApplication4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/computer16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/computer32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubtask5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.TaskSubtasks_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Subtask5CreationTool_title,
				Messages.Subtask5CreationTool_desc, types);
		entry.setId("createSubtask5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/sub16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/sub32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterleaving1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Interleaving_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Interleaving1CreationTool_title, null, types);
		entry.setId("createInterleaving1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/interleaving16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/interleaving32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSynchronisation2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Synchronization_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Synchronisation2CreationTool_title, null, types);
		entry.setId("createSynchronisation2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/synchro16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/synchro32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnabling3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Enabling_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Enabling3CreationTool_title, null, types);
		entry.setId("createEnabling3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/enabling16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/enabling32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnablingWithInfo4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.EnablingWithInformation_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EnablingWithInfo4CreationTool_title, null, types);
		entry.setId("createEnablingWithInfo4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/enablingInfo16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/enablingInfo32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesactivation5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaskElementTypes.Desactivation_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Desactivation5CreationTool_title, null, types);
		entry.setId("createDesactivation5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/desactiv16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaskDiagramEditorPlugin
						.findImageDescriptor("/org.kermeta.ki.task/resources/desactiv32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
