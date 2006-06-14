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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.samples.fsm.Transition;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.commands.TransitionEdgeCreationCommand;

/**
 * Transition edge creation <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionEdgeCreationEditPolicy extends
		AbstractEdgeCreationEditPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#createCommand(org.eclipse.gef.EditDomain, org.topcased.modeler.di.model.GraphEdge, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphElement source) {
		return new TransitionEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		return Utils.getElement(edge) instanceof Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkSource(GraphElement source) {
		EObject object = Utils.getElement(source);
		if (object instanceof fr.irisa.triskell.kermeta.samples.fsm.State) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkTargetForSource(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkTargetForSource(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.samples.fsm.State
				&& targetObject instanceof fr.irisa.triskell.kermeta.samples.fsm.State) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkCommand(org.eclipse.gef.commands.Command)
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof TransitionEdgeCreationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#getSourceTargetData(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.samples.fsm.State
				&& targetObject instanceof fr.irisa.triskell.kermeta.samples.fsm.State) {
			return new SourceTargetData(false, true, 1,
					"fr.irisa.triskell.kermeta.samples.fsm.State",
					"outgoingTransition", "source", "target",
					"outgoingTransition", null, "incomingTransition", null);
		}
		return null;
	}

}