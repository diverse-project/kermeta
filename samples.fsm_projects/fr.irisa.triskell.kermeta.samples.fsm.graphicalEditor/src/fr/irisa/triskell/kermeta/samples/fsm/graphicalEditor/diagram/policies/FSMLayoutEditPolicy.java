/*******************************************************************************
 * $Id: FSMLayoutEditPolicy.java,v 1.3 2007-07-11 16:13:16 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.policies;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.samples.fsm.State;

/**
 * @generated
 */
public class FSMLayoutEditPolicy extends
		org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy {
	/**
	 * Default contructor.
	 *
	 * @generated
	 */
	public FSMLayoutEditPolicy() {
		super();
	}

	/**
	 * @see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#isValid(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	protected boolean isValid(EObject child, EObject parent) {
		if (child instanceof State) {
			return true;
		}
		return false;
	}

}