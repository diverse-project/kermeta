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

import fr.irisa.triskell.kermeta.behavior.provider.KermetaEditPlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
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

					if (nodeObject2 instanceof FClassDefinition) {
						if (autoRef) {
							// autoRef not allowed
						} else {
							// if the node is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createInheritanceFromFClassDefinitionToFClassDefinition(
									node, node2);
							// if node is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createInheritanceFromFClassDefinitionToFClassDefinition(
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
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createInheritanceFromFClassDefinitionToFClassDefinition(
			GraphNode srcNode, GraphNode targetNode) {
		System.err.println("TOTO --- : we do not enter here ");
		extendedCreateInheritanceFromFClassDefinitionToFClassDefinition(srcNode, targetNode);
	}
	
    public void extendedCreateInheritanceFromFClassDefinitionToFClassDefinition(GraphNode srcNode, GraphNode targetNode)
    {
        FClassDefinition srcFClassDefinition = (FClassDefinition) Utils.getElement(srcNode);
        FClassDefinition targetFClassDefinition = (FClassDefinition) Utils.getElement(targetNode);
        System.err.println("create inheritance edge");
        // Is there is an inheritance relation between src class and target class, than, create it!
        if (KermetaUtils.getDefault().isContainedFSuperTypeInFClassDefinition(srcFClassDefinition, targetFClassDefinition)
        		
        	)
        {
        	System.err.println("If we are here, it means that an inheritance relation does not exist yet");
            // check if the relation does not exists yet
            if (getExistingEdges(srcNode, targetNode, StructureEditPolicyConstants.INHERITANCE_EDITPOLICY).size() == 0)
            {
            	System.err.println("If here, so, no existing edge were found");
                GraphEdge edge = Utils.createGraphEdge(StructureEditPolicyConstants.INHERITANCE_EDITPOLICY);
                InheritanceEdgeCreationCommand cmd = new InheritanceEdgeCreationCommand(
						null, edge, srcNode, false);
                cmd.setTarget(targetNode);
                add(cmd);
            }
            System.err.println("End of cond n°1 on graphical representation!");
        }
        System.err.println("End of cond on model");
    }


	/** Non generated method 
	 * 
	 * Create a GraphNode representing the FProperty of a class definition, when
	 * this FProperty type is a DataType 
	 * What you have to do after the generation process is done :
	 * - adapt this code, so, if necessary, take generated code of createFPropertyFromFClassDefinitionToFClassDefinition
	 * and change things that you need to change, then, add this method 
	 * (extendedCreateFPropertyFromFClassDefinitionToFClassDefinition) call in the generated method
	 * (createFPropertyFromFClassDefinitionToFClassDefinition) instead of the big code.
	 * Usefullness of this stuff is that if you need some parts of the generated code, without
	 * overwriting your adaptation, it will be a little bit easier...
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
			System.err.println("The type of the property is : "
					+ obj.getFType());
			if (obj.getFType() != null
					&& !KermetaUtils.getDefault()
							.isStandardType(obj.getFType())
					&& !KermetaUtils.getDefault().isPrimitiveType(
							obj.getFType())) {

				System.err.println("Splotch :"
						+ ((FClass) obj.getFType()).getFTypeDefinition());
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