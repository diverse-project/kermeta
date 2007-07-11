/*******************************************************************************
 * $Id: PackageLayoutEditPolicy.java,v 1.2 2007-07-11 14:50:45 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.policies;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;

/**
 * @generated
 */
public class PackageLayoutEditPolicy extends
		org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy {
	/**
	 * Default contructor.
	 *
	 * @generated
	 */
	public PackageLayoutEditPolicy() {
		super();
	}

	/**
	 * @see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#isValid(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	protected boolean isValid(EObject child, EObject parent) {
		if (child instanceof Package) {
			return true;
		}
		if (child instanceof ClassDefinition) {
			return true;
		}
		return false;
	}

}