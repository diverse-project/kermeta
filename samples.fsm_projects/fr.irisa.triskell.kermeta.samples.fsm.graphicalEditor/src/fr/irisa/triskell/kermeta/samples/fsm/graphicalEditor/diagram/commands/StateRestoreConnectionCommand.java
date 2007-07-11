/*******************************************************************************
 * $Id$
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
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
 * State restore connection command
 * 
 * @generated
 */
public class StateRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public StateRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement elt = getGraphElement();
		EObject eltObject = Utils.getElement(elt);

		if (eltObject instanceof State) {
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
					boolean autoRef = obj.equals(elt);
					GraphElement elt2 = (GraphElement) obj;
					EObject eltObject2 = Utils.getElement(elt2);

					if (eltObject2 instanceof State) {
						if (autoRef) {
							createTransitionFromStateToState_IncomingTransition(
									elt, elt);
						} else {
							// if the elt is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createTransitionFromStateToState_IncomingTransition(
									elt, elt2);
							// if elt is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createTransitionFromStateToState_IncomingTransition(
									elt2, elt);
						}
					}

				}
			}
		}
	}

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @generated
	 */
	private void createTransitionFromStateToState_IncomingTransition(
			GraphElement srcElt, GraphElement targetElt) {
		State sourceObject = (State) Utils.getElement(srcElt);
		State targetObject = (State) Utils.getElement(targetElt);

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
					List existing = getExistingEdges(srcElt, targetElt,
							Transition.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							TransitionEdgeCreationCommand cmd = new TransitionEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcElt,
									false);
							cmd.setTarget(targetElt);
							add(cmd);
						}
					}
				}
			}
		}
	}

}