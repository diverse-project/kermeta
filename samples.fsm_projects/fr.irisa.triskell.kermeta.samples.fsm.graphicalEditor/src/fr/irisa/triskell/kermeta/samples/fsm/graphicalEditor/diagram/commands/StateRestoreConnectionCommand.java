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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.samples.fsm.State;
import fr.irisa.triskell.kermeta.samples.fsm.Transition;

/**
 * State restore connection command<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class StateRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public StateRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement node = getGraphElement();
		EObject nodeObject = Utils.getElement(node);

		if (nodeObject instanceof State) {
			Iterator itDiagContents = getModeler().getActiveDiagram()
					.eAllContents();
			while (itDiagContents.hasNext()) {
				Object obj = itDiagContents.next();
				// FIXME Change the way to handle EList GraphNodes
				if (obj instanceof GraphElement
						&& DIUtils
								.getProperty(
										(GraphElement) obj,
										ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID) == null) {
					boolean autoRef = obj.equals(node);
					GraphElement node2 = (GraphElement) obj;
					EObject nodeObject2 = Utils.getElement(node2);

					if (nodeObject2 instanceof State) {
						if (autoRef) {
							createTransitionFromStateToState(node, node);
						} else {
							// if the node is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createTransitionFromStateToState(node, node2);
							// if node is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createTransitionFromStateToState(node2, node);
						}
					}

				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param srcNode the source node
	 * @param targetNode the target node
	 * @generated
	 */
	private void createTransitionFromStateToState(GraphElement srcNode,
			GraphElement targetNode) {
		State sourceObject = (State) Utils.getElement(srcNode);
		State targetObject = (State) Utils.getElement(targetNode);

		EList edgeObjectList = sourceObject.getOutgoingTransition();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Transition) {
				Transition edgeObject = (Transition) obj;
				if (targetObject.equals(edgeObject.getTarget())
						&& sourceObject.equals(edgeObject.getSource())
						&& sourceObject.getOutgoingTransition().contains(
								edgeObject)
						&& targetObject.getIncomingTransition().contains(
								edgeObject)) {
					// check if the relation does not exists yet
					List existing = getExistingEdges(srcNode, targetNode,
							Transition.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							TransitionEdgeCreationCommand cmd = new TransitionEdgeCreationCommand(
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