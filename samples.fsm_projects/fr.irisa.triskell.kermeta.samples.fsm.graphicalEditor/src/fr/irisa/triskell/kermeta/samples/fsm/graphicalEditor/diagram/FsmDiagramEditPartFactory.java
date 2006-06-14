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

import fr.irisa.triskell.kermeta.samples.fsm.FSM;
import fr.irisa.triskell.kermeta.samples.fsm.State;
import fr.irisa.triskell.kermeta.samples.fsm.Transition;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.FSMEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.FsmDiagramDiagramEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.StateEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit.TransitionEditPart;
import fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmDiagramEditPartFactory implements EditPartFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new FsmDiagramDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				Object editPart = new FsmSwitch() {
					public Object caseFSM(FSM object) {
						return new FSMEditPart(node);
					}

					public Object caseState(State object) {
						return new StateEditPart(node);
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
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				Object editPart = new FsmSwitch() {
					public Object caseTransition(Transition object) {
						return new TransitionEditPart(edge);
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
						+ "' model element. Check FsmDiagramEditPartFactory#createEditPart(EditPart,Object) class");
	}

}