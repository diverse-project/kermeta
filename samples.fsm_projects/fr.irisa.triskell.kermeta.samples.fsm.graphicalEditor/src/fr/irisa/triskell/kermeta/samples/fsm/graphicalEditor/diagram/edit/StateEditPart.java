/*******************************************************************************
 * $Id$
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

import fr.irisa.triskell.kermeta.samples.fsm.State;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmImageRegistry;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.FsmEditPolicyConstants;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.commands.StateRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures.StateFigure;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.policies.TransitionEdgeCreationEditPolicy;

/**
 * The State object controller
 *
 * @generated
 */
public class StateEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public StateEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
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
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new StateFigure();
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
	protected void refreshHeaderLabel() {
		// TODO Auto-generated method stub
		super.refreshHeaderLabel();

		String imageLabel = "NOTHING_STATE";
		if (isInitial()) {
			imageLabel = "INITIAL_STATE";
		}
		if (isFinal()) {
			imageLabel = "FINAL_STATE";
		}

		StateFigure fig = (StateFigure) getFigure();
		EditableLabel lbl = (EditableLabel) fig.getLabel();

		lbl.setIcon(FsmImageRegistry.getImage(imageLabel));
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
	}

	/**
	 * @return the model object
	 * @generated NOT
	 */
	public State getState() {
		return (State) getEObject();
	}
}