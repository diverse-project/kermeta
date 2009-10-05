/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.policies;

import org.eclipse.emf.ecore.EObject;
import org.openembedd.logo.csm.logoCSM.Block;

/**
 * @generated
 */
public class RepeatLayoutEditPolicy extends org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy
{
	/**
	 * Default contructor.
	 * 
	 * @generated
	 */
	public RepeatLayoutEditPolicy()
	{
		super();
	}

	/**
	 * @see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#isValid(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	protected boolean isValid(EObject child, EObject parent)
	{
		if (child instanceof Block)
		{
			return true;
		}
		return false;
	}

}
