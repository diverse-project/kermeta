/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.kermeta.trek.graphicaleditor.diag;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.kermeta.trek.graphicaleditor.diag.edit.KTestCaseEditPart;
import org.kermeta.trek.graphicaleditor.diag.edit.KUseCaseEditPart;
import org.kermeta.trek.graphicaleditor.diag.edit.TrekDiagramEditPart;
import org.kermeta.trek.graphicaleditor.diag.edit.UseKaseModelEditPart;
import org.kermeta.trek.util.TrekSwitch;
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

/**
 * Part Factory : associates a model object to its controller. <br>
 *
 * @generated
 */
public class TrekEditPartFactory implements EditPartFactory {
	/**
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new TrekDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				if ("http://www.kermeta.org/trek".equals(element.eClass()
						.getEPackage().getNsURI())) {
					return (EditPart) new NodeTrekSwitch(node)
							.doSwitch(element);
				}

				return new EMFGraphNodeEditPart(node);
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
			}
			return new GraphNodeEditPart(node);
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				if ("http://www.kermeta.org/trek".equals(element.eClass()
						.getEPackage().getNsURI())) {
					return (EditPart) new EdgeTrekSwitch(edge)
							.doSwitch(element);
				}

				return new EMFGraphEdgeEditPart(edge);
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object                    
			}

			return new GraphEdgeEditPart(edge);
		}

		throw new IllegalStateException(
				"No edit part matches with the '"
						+ model.getClass().getName()
						+ "' model element. Check TrekEditPartFactory#createEditPart(EditPart,Object) class");
	}

	/**
	 * @generated
	 */
	private class NodeTrekSwitch extends TrekSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeTrekSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#caseUseKaseModel(org.kermeta.trek.UseKaseModel)
		 * @generated
		 */
		public Object caseUseKaseModel(org.kermeta.trek.UseKaseModel object) {
			return new UseKaseModelEditPart(node);
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#caseKUseCase(org.kermeta.trek.KUseCase)
		 * @generated
		 */
		public Object caseKUseCase(org.kermeta.trek.KUseCase object) {
			String feature = DIUtils.getPropertyValue(node,
					ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID);
			if (!"".equals(feature)) {
				int featureID = Integer.parseInt(feature);
				return new EListEditPart(node, object.eClass()
						.getEStructuralFeature(featureID));
			} else {
				return new KUseCaseEditPart(node);
			}
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#caseKTestCase(org.kermeta.trek.KTestCase)
		 * @generated
		 */
		public Object caseKTestCase(org.kermeta.trek.KTestCase object) {
			String feature = DIUtils.getPropertyValue(node,
					ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID);
			if (!"".equals(feature)) {
				int featureID = Integer.parseInt(feature);
				return new EListEditPart(node, object.eClass()
						.getEStructuralFeature(featureID));
			} else {
				return new KTestCaseEditPart(node);
			}
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeTrekSwitch extends TrekSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeTrekSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}