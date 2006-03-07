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

import fr.irisa.triskell.kermeta.language.behavior.provider.KermetaEditPlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * ClassDefinition restore connection command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class ClassDefinitionRestoreConnectionCommand extends
		NamedElementRestoreConnectionCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public ClassDefinitionRestoreConnectionCommand(EditPart part) {
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

		if (nodeObject instanceof ClassDefinition) {
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

					if (nodeObject2 instanceof ClassDefinition) {
						if (autoRef) {
							createPropertyFromClassDefinitionToClassDefinition(
									node, node);
						} else {
							// if the node is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createPropertyFromClassDefinitionToClassDefinition(
									node, node2);
							// if node is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createPropertyFromClassDefinitionToClassDefinition(
									node2, node);
						}
					}

					if (nodeObject2 instanceof ClassDefinition) {
						if (autoRef) {
							// autoRef not allowed
						} else {
							// if the node is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createInheritanceFromClassDefinitionToClassDefinition(
									node, node2);
							// if node is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createInheritanceFromClassDefinitionToClassDefinition(
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
	private void createPropertyFromClassDefinitionToClassDefinition(
			GraphNode srcNode, GraphNode targetNode) {
		extendedCreatePropertyFromClassDefinitionToClassDefinition(srcNode, targetNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createInheritanceFromClassDefinitionToClassDefinition(
			GraphNode srcNode, GraphNode targetNode) {
		System.err.println("TOTO --- : we do not enter here ");
		extendedCreateInheritanceFromClassDefinitionToClassDefinition(srcNode, targetNode);
	}
	
    public void extendedCreateInheritanceFromClassDefinitionToClassDefinition(GraphNode srcNode, GraphNode targetNode)
    {
        ClassDefinition srcClassDefinition = (ClassDefinition) Utils.getElement(srcNode);
        ClassDefinition targetClassDefinition = (ClassDefinition) Utils.getElement(targetNode);
        System.err.println("create inheritance edge");
        // Is there is an inheritance relation between src class and target class, than, create it!
        if (KermetaUtils.getDefault().isContainedSuperTypeInClassDefinition(srcClassDefinition, targetClassDefinition)
        		
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
	 * Create a GraphNode representing the Property of a class definition, when
	 * this Property type is a DataType 
	 * What you have to do after the generation process is done :
	 * - adapt this code, so, if necessary, take generated code of createPropertyFromClassDefinitionToClassDefinition
	 * and change things that you need to change, then, add this method 
	 * (extendedCreatePropertyFromClassDefinitionToClassDefinition) call in the generated method
	 * (createPropertyFromClassDefinitionToClassDefinition) instead of the big code.
	 * Usefullness of this stuff is that if you need some parts of the generated code, without
	 * overwriting your adaptation, it will be a little bit easier...
	 * @param srcNode The graph node representing the concerned class definition.
	 */
	private void extendedCreatePropertyFromClassDefinitionToClassDefinition(
			GraphNode srcNode, GraphNode targetNode) {
		ClassDefinition sourceObject = (ClassDefinition) Utils
				.getElement(srcNode);
		ClassDefinition targetObject = (ClassDefinition) Utils
				.getElement(targetNode);

		EList edgeObjectList = sourceObject.getOwnedAttribute();
		for (Iterator<Property> it = edgeObjectList.iterator(); it.hasNext();) {
			Property obj = it.next();
			// 2nd condition -> a constraint 
			// TODO Think about how to make this conditional be generated later.
			// FIXME obj can be null!!! check why
			System.err.println("The type of the property is : " + obj);
			System.err.println("The type of the property is : "
					+ obj.getType());
			if (obj.getType() != null
					&& !KermetaUtils.getDefault()
							.isStandardType(obj.getType())
					&& !KermetaUtils.getDefault().isPrimitiveType(
							obj.getType())) {

				System.err.println("Splotch :"
						+ ((fr.irisa.triskell.kermeta.language.structure.Class) obj.getType()).getTypeDefinition());
				Property edgeObject = (Property) obj;
				if (targetObject.equals(edgeObject.getOwningClass())
						&& sourceObject.getOwnedAttribute().contains(
								edgeObject)) {
					// check if the relation does not exists yet
					List existing = getExistingEdges(srcNode, targetNode,
							Property.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							PropertyEdgeCreationCommand cmd = new PropertyEdgeCreationCommand(
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