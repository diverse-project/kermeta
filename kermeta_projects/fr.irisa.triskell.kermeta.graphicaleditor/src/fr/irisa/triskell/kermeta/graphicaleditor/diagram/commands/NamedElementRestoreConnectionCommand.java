package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import java.util.Iterator;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Tag;

/**
 * NamedElement restore connection command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class NamedElementRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public NamedElementRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement node = getGraphElement();
		EObject nodeObject = Utils.getElement(node);

		if (nodeObject instanceof NamedElement) {
			Iterator itDiagContents = getModeler().getActiveDiagram()
					.eAllContents();
			while (itDiagContents.hasNext()) {
				Object obj = itDiagContents.next();
				// FIXME Change the way to handle EList GraphNodes
				if (obj instanceof GraphElement
						&& DIUtils
								.getProperty(
										(GraphElement) obj,
										ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID) == null) {
					boolean autoRef = obj.equals(node);
					GraphElement node2 = (GraphElement) obj;
					EObject nodeObject2 = Utils.getElement(node2);
					if (nodeObject2 instanceof Tag) {
						if (autoRef) {
							// autoRef not allowed
						} else {
							// if node is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createTagLinkFromTagToNamedElement(node2, node);
						}
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param srcNode the source node
	 * @param targetNode the target node
	 * @generated
	 */
	private void createTagLinkFromTagToNamedElement(GraphElement srcNode,
			GraphElement targetNode) {
		Tag sourceObject = (Tag) Utils.getElement(srcNode);
		NamedElement targetObject = (NamedElement) Utils.getElement(targetNode);

		if (sourceObject.getObject().contains(targetObject)
				&& targetObject.getTag().contains(sourceObject)) {
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