package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * FClassDefinition restore connection command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class FClassDefinitionRestoreConnectionCommand extends
		FNamedElementRestoreConnectionCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public FClassDefinitionRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		super.initializeCommands();

		GraphNode node = (GraphNode) getGraphElement();
		EObject nodeObject = Utils.getElement(node);

		if (nodeObject instanceof FClassDefinition) {
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
					boolean autoRef = obj.equals(node);
					GraphNode node2 = (GraphNode) obj;
					EObject nodeObject2 = Utils.getElement(node2);

					if (nodeObject2 instanceof FClassDefinition) {
						if (autoRef) {
							createFPropertyFromFClassDefinitionToFClassDefinition(
									node, node);
						} else {
							// if the node is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createFPropertyFromFClassDefinitionToFClassDefinition(
									node, node2);
							// if node is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createFPropertyFromFClassDefinitionToFClassDefinition(
									node2, node);
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
	private void createFPropertyFromFClassDefinitionToFClassDefinition(
			GraphNode srcNode, GraphNode targetNode) {
		extendedCreateFPropertyFromFClassDefinitionToFClassDefinition(srcNode, targetNode);
/*		FClassDefinition sourceObject = (FClassDefinition) Utils
				.getElement(srcNode);
		FClassDefinition targetObject = (FClassDefinition) Utils
				.getElement(targetNode);

		EList edgeObjectList = sourceObject.getFOwnedAttributes();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof FProperty) {
				FProperty edgeObject = (FProperty) obj;
				if (targetObject.equals(edgeObject.getFOwningClass())
						&& sourceObject.getFOwnedAttributes().contains(
								edgeObject)) {
					// check if the relation does not exists yet
					List existing = getExistingEdges(srcNode, targetNode,
							FProperty.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							FPropertyEdgeCreationCommand cmd = new FPropertyEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcNode,
									false);
							cmd.setTarget(targetNode);
							add(cmd);
						}
					}
				}
			}
		}*/
		
	}
	
	/** Non generated method 
	 * 
	 * Create a GraphNode representing the FProperty of a class definition, when
	 * this FProperty type is a DataType 
	 * @param srcNode The graph node representing the concerned class definition.
	 */
	private void extendedCreateFPropertyFromFClassDefinitionToFClassDefinition(
			GraphNode srcNode, GraphNode targetNode) {
		FClassDefinition sourceObject = (FClassDefinition) Utils
				.getElement(srcNode);
		FClassDefinition targetObject = (FClassDefinition) Utils
				.getElement(targetNode);

		EList edgeObjectList = sourceObject.getFOwnedAttributes();
		for (Iterator<FProperty> it = edgeObjectList.iterator(); it.hasNext();) {
			FProperty obj = it.next();
			// 2nd condition -> a constraint 
			// TODO Think about how to make this conditional be generated later.
			// FIXME obj can be null!!! check why
			System.err.println("The type of the property is : " + obj);
			System.err.println("The type of the property is : " + obj.getFType());
			if (obj.getFType()!=null && !KermetaUtils.getDefault().isStandardType(obj.getFType())
				&& !KermetaUtils.getDefault().isPrimitiveType(obj.getFType()))
			{

				System.err.println("Splotch :" + ((FClass)obj.getFType()).getFTypeDefinition());
				FProperty edgeObject = (FProperty) obj;
				if (targetObject.equals(edgeObject.getFOwningClass())
						&& sourceObject.getFOwnedAttributes().contains(
								edgeObject)) {
					// check if the relation does not exists yet
					List existing = getExistingEdges(srcNode, targetNode,
							FProperty.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							FPropertyEdgeCreationCommand cmd = new FPropertyEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcNode,
									false);
							cmd.setTarget(targetNode);
							add(cmd);
						}
					}
				}
			}
		}
	}

}