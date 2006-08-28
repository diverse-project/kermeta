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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.swt.graphics.Color;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.FsmEditPolicyConstants;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.commands.StateRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures.StateFigure;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.policies.TransitionEdgeCreationEditPolicy;

/**
 * The State object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj the graph node
	 * @generated
	 */
	public StateEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(FsmEditPolicyConstants.TRANSITION_EDITPOLICY,
				new TransitionEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new StateRestoreConnectionCommand(getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new StateFigure();
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected Color getDefaultBackgroundColor() {
		Color theColor = super.getDefaultBackgroundColor();

		if (isInitial()) {
			// the new color for the initial state
			theColor = new Color(null, 240, 240, 180);
		}
		if (isFinal()) {
			// the new color for the final states
			theColor = new Color(null, 0, 0, 0);
		}
		return theColor;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected Color getDefaultForegroundColor() {
		Color theColor = super.getDefaultForegroundColor();

		if (isInitial()) {
			// the new color for the initial state
			theColor = new Color(null, 0, 0, 0);
		}
		if (isFinal()) {
			// the new color for the final states
			theColor = new Color(null, 255, 255, 255);
		}
		return theColor;
	}

	/**
	 * Check if the state is initial @return boolean - true if the state is
	 * initial, false if the state is not initial
	 * @generated NOT
	 */
	private boolean isInitial() {
		fr.irisa.triskell.kermeta.samples.fsm.State theState = (fr.irisa.triskell.kermeta.samples.fsm.State) this
				.getEObject();
		if (theState.getOwningFSM() != null
				&& theState.getOwningFSM().getInitialState() != null
				&& theState.getOwningFSM().getInitialState().equals(theState)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Check if the state is final @return boolean - true if the state is final,
	 * false if the state is not final
	 * @generated NOT
	 */
	private boolean isFinal() {
		fr.irisa.triskell.kermeta.samples.fsm.State theState = (fr.irisa.triskell.kermeta.samples.fsm.State) this
				.getEObject();

		org.eclipse.emf.common.util.EList finalState = null;
		if (theState.getOwningFSM() != null) {
			finalState = theState.getOwningFSM().getFinalState();
		}

		if (finalState != null) {
			for (java.util.Iterator aIt = finalState.iterator(); aIt.hasNext();) {
				fr.irisa.triskell.kermeta.samples.fsm.State aState = (fr.irisa.triskell.kermeta.samples.fsm.State) aIt
						.next();
				if (aState.equals(theState)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
	}
}