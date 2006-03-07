package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Tag;

/**
 * Tag restore connection command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class TagRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public TagRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphNode node = (GraphNode) getGraphElement();
		EObject nodeObject = Utils.getElement(node);

		if (nodeObject instanceof Tag) {
			Iterator itDiagContents = getModeler().getActiveDiagram()
					.eAllContents();
			while (itDiagContents.hasNext()) {
				Object obj = itDiagContents.next();
				// FIXME Change the way to handle EList GraphNodes
				if (obj instanceof GraphNode
						&& DIUtils
								.getProperty(
										(GraphElement) obj,
										ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID) == null) {
					Boolean autoRef = obj.equals(node);
					GraphNode node2 = (GraphNode) obj;
					EObject nodeObject2 = Utils.getElement(node2);
					if (nodeObject2 instanceof NamedElement) {
						if (autoRef) {
							// autoRef not allowed
						} else {
							// if the node is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createTagLinkFromTagToNamedElement(node, node2);
						}
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createTagLinkFromTagToNamedElement(GraphNode srcNode,
			GraphNode targetNode) {
		Tag sourceObject = (Tag) Utils.getElement(srcNode);
		NamedElement targetObject = (NamedElement) Utils
				.getElement(targetNode);

		if (false) {
			// check if the relation does not exists yet
			if (getExistingEdges(srcNode, targetNode,
					StructureEditPolicyConstants.TAGLINK_EDITPOLICY).size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(StructureEditPolicyConstants.TAGLINK_EDITPOLICY);
				TagLinkEdgeCreationCommand cmd = new TagLinkEdgeCreationCommand(
						null, edge, srcNode, false);
				cmd.setTarget(targetNode);
				add(cmd);
			}
		}
	}

}