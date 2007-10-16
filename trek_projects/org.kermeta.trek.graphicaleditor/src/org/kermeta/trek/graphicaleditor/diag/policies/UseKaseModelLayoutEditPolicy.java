/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.kermeta.trek.graphicaleditor.diag.policies;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;

/**
 * @generated
 */
public class UseKaseModelLayoutEditPolicy extends
		org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy {
	/**
	 * Default contructor.
	 *
	 * @generated
	 */
	public UseKaseModelLayoutEditPolicy() {
		super();
	}

	/**
	 * @see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#isValid(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	protected boolean isValid(EObject child, EObject parent) {
		if (child instanceof KUseCase) {
			return true;
		}
		if (child instanceof KTestCase) {
			return true;
		}
		return false;
	}

}