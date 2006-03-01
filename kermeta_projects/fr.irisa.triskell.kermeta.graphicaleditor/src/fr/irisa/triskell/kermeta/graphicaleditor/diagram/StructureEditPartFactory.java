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

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FClassDefinitionEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FNamedElementEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FOperationEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FPackageEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FPropertyEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FPropertyEditPartNode;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FTagEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.StructureDiagramEditPart;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.util.StructureSwitch;

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
		}  
		else if (model instanceof GraphNode) {
			return createEditPartForNode(context, (GraphNode)model);
		}
		else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				Object editPart = new StructureSwitch() {
					public Object caseFProperty(FProperty object) {
						return new FPropertyEditPart(edge);
					}

					public Object defaultCase(EObject object) {
						return new EMFGraphEdgeEditPart(edge);
					}
				}.doSwitch(element);

				return (EditPart) editPart;
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
			}

			return new GraphEdgeEditPart((GraphEdge) model);
		}

		throw new IllegalStateException(
				"No edit part matches with the '"
						+ model.getClass().getName()
						+ "' model element. Check StructureEditPartFactory#createEditPart(EditPart,Object) class");
	}
	
	/** 
	 * This method is called by createEditPart but since
	 * we want createEditPart to be re-generated if necessary, developper has to follow
	 * these instructions : 
	 * - let the "generated" tag on createEditPart method comment
	 * - after having checked (and cut) the part of the new code that you may need 
	 * remove in createEditPart the whole block under the conditional :
	 * 			<code>else if (model instanceof GraphNode)</code>
	 * - replace it by createEditPartForNode method, adapted if needed by the generated
	 * code in createEditPart :} except for the code that is commented (read it!), mainly:
	 * 
	 *   - handling of FProperty (here, it is handled as a node -- in the generated part 
	 *   that you don't have to modify it is handled  as an edge.) 
	 * 
	 */
	public EditPart createEditPartForNode(EditPart context, GraphNode model) 
	{
		EObject element = Utils.getElement(model);
		final GraphNode node = model; // anonymous class requirement
		if (element != null) {
			Object editPart = new StructureSwitch() {
				public Object caseFPackage(FPackage object) {
					return new FPackageEditPart(node);
				}
				
				public Object caseFNamedElement(FNamedElement object) {
					return new FNamedElementEditPart(node);
				}
				
				public Object caseFClassDefinition(FClassDefinition object) {
					String feature = DIUtils
					.getPropertyValue(
							node,
							ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID);
					if (!"".equals(feature)) {
						int featureID = Integer.parseInt(feature);
						return new EListEditPart(node, object.eClass()
								.getEStructuralFeature(featureID));
					} else {
						return new FClassDefinitionEditPart(node);
					}
				}
				
				public Object caseFProperty(FProperty object) {
					return new FPropertyEditPartNode(node);
				}
				
				public Object caseFOperation(FOperation object) {
					return new FOperationEditPart(node);
				}
				
				public Object caseFTag(FTag object) {
					return new FTagEditPart(node);
				}
				
				public Object defaultCase(EObject object) {
					return new EMFGraphNodeEditPart(node);
				}
			}.doSwitch(element);
			
			return (EditPart) editPart;
		}
		
		if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
		}
		return new GraphNodeEditPart(node);
	}

}