/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.GraphNodeEditPart;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.FSMEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.FsmDiagramEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.StateEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.TransitionEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmEditPartFactory implements EditPartFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new FsmDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				Object editPart = null;

				if ("platform:/resource/fr.irisa.triskell.kermeta.samples.fsm/src/metamodels/fsm.ecore"
						.equals(element.eClass().getEPackage().getNsURI())) {
					editPart = new NodeFsmSwitch(node).doSwitch(element);
				}

				return (EditPart) editPart;
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
			}
			return new GraphNodeEditPart(node);
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				Object editPart = null;

				if ("platform:/resource/fr.irisa.triskell.kermeta.samples.fsm/src/metamodels/fsm.ecore"
						.equals(element.eClass().getEPackage().getNsURI())) {
					editPart = new EdgeFsmSwitch(edge).doSwitch(element);
				}

				return (EditPart) editPart;
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object                    
			}

			return new GraphEdgeEditPart(edge);
		}

		throw new IllegalStateException(
				"No edit part matches with the '"
						+ model.getClass().getName()
						+ "' model element. Check FsmEditPartFactory#createEditPart(EditPart,Object) class");
	}

	/**
	 * @generated
	 */
	private class NodeFsmSwitch extends FsmSwitch {
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
		public NodeFsmSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseFSM(fr.irisa.triskell.kermeta.samples.fsm.FSM)
		 * @generated
		 */
		public Object caseFSM(fr.irisa.triskell.kermeta.samples.fsm.FSM object) {
			return new FSMEditPart(node);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseState(fr.irisa.triskell.kermeta.samples.fsm.State)
		 * @generated
		 */
		public Object caseState(
				fr.irisa.triskell.kermeta.samples.fsm.State object) {
			return new StateEditPart(node);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeFsmSwitch extends FsmSwitch {
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
		public EdgeFsmSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseTransition(fr.irisa.triskell.kermeta.samples.fsm.Transition)
		 * @generated
		 */
		public Object caseTransition(
				fr.irisa.triskell.kermeta.samples.fsm.Transition object) {
			return new TransitionEditPart(edge);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}