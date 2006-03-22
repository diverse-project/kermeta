/* $Id: ValidationDelegateClientSelector.java,v 1.1 2006-03-22 16:24:59 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ValidationDelegateClientSelector.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 14, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation;

import org.eclipse.emf.validation.model.IClientSelector;

/**
 * EMF Tutorial comments : 
 * // NOTE: This is _NOT_ a recommended approach to writing a client selector.
//       Suggested approaches:
//           -Check the resource of the EObject either by identity or by URI
//            as long as this resource is somehow unique to this application
//           -Check the identity of the resource set to ensure that it is some
//            private object
//           -Check the identity of the EObject itself to see if it belongs to
//            some private collection
//           -Check the EClass of the EObject but only if the metamodel is private
//            to this application and will not be used by other contexts
 */
public class ValidationDelegateClientSelector implements IClientSelector {


	
	public static boolean running = false;

	public ValidationDelegateClientSelector()
	{
		System.err.println("POlop");
	}
	
	/**
	 * @see org.eclipse.emf.validation.model.IClientSelector#selects(java.lang.Object)
	 */
	public boolean selects(Object object) {
		return running;
	}

}
