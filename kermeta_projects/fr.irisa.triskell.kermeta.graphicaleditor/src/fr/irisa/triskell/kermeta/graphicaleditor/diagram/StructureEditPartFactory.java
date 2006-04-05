package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.edit.EListEditPart;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.GraphNodeEditPart;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.ClassDefinitionEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.InheritanceEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.NamedElementEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.OperationEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PackageEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PrimitiveTypeEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PropertyAsNodeEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PropertyEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PropertyEditPartNode;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.StructureDiagramEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.TagEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.TagLinkEditPart;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureEditPartFactory implements EditPartFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new StructureDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			return createEditPartForNode(context, (GraphNode)model);
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				Object editPart = new StructureSwitch() {
					public Object caseProperty(Property object) {
						return new PropertyEditPart(edge);
					}

					public Object defaultCase(EObject object) {
						return new EMFGraphEdgeEditPart(edge);
					}
				}.doSwitch(element);

				return (EditPart) editPart;
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				if (((SimpleSemanticModelElement) edge.getSemanticModel())
						.getTypeInfo()
						.equals(
								StructureEditPolicyConstants.INHERITANCE_EDITPOLICY))
					return new InheritanceEditPart(edge);
				if (((SimpleSemanticModelElement) edge.getSemanticModel())
						.getTypeInfo()
						.equals(StructureEditPolicyConstants.TAGLINK_EDITPOLICY))
					return new TagLinkEditPart(edge);
			}

			return new GraphEdgeEditPart((GraphEdge) model);
		}

		throw new IllegalStateException(
				"No edit part matches with the '"
						+ model.getClass().getName()
						+ "' model element. Check StructureEditPartFactory#createEditPart(EditPart,Object) class");
	}

	/** 
	 * This method is a small adaptation of createEditPart, dedicated to the GraphNode edition.
	 * Important Developer note : this method is called by createEditPart but since
	 * we want createEditPart to be re-generated if necessary, developper has to follow
	 * these instructions : 
	 * - let the "generated" tag on createEditPart method comment
	 * - after having checked (and cut) the part of the new code that you may need inside
	 * createEditPart method, remove in createEditPart the whole block under the conditional :
	 * 			<code>else if (model instanceof GraphNode)</code>
	 * - replace it by <code>return createEditPartForNode(..)</code> method, adapted if needed by the generated
	 * code in createEditPart :} except for the code that is commented (read it!), mainly:
	 * 
	 *   - handling of Property (here, it is handled as a node -- in the generated part 
	 *   that you don't have to modify it is handled  as an edge.) 
	 * 
	 */
	public EditPart createEditPartForNode(EditPart context, GraphNode model) {
		EObject element = Utils.getElement(model);
		final GraphNode node = model; // anonymous class requirement
		
		if (element != null) {
			Object editPart = new StructureSwitch() {
				public Object casePackage(Package object) {
					return new PackageEditPart(node);
				}

				public Object caseNamedElement(NamedElement object) {
					return new NamedElementEditPart(node);
				}

				public Object caseClassDefinition(ClassDefinition object) {
					String feature = DIUtils.getPropertyValue(node,
							ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID);
					if (!"".equals(feature)) {
						int featureID = Integer.parseInt(feature);
						return new EListEditPart(node, object.eClass()
								.getEStructuralFeature(featureID));
					} else {
						return new ClassDefinitionEditPart(node);
					}
				}

				public Object caseProperty(Property object) {
					return new PropertyEditPartNode(node);
				}

				public Object caseOperation(Operation object) {
					return new OperationEditPart(node);
				}

				public Object caseTag(Tag object) {
					return new TagEditPart(node);
				}

				public Object defaultCase(EObject object) {
					return new EMFGraphNodeEditPart(node);
				}
			}.doSwitch(element);

			return (EditPart) editPart;
		}

		if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
			System.err.println("Get semantic model");
			if (((SimpleSemanticModelElement) node.getSemanticModel())
					.getTypeInfo()
					.equals(
							StructureEditPolicyConstants.PROPERTYASNODE_EDITPOLICY))
				return new PropertyAsNodeEditPart(node);
		}
		return new GraphNodeEditPart(node);
	}

}