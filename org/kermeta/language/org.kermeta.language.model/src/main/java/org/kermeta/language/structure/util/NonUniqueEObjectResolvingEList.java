/* $Id: NonUniqueEObjectResolvingEList.java,v 1.2 2007-08-02 12:08:15 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.model
 * File       : NonUniqueEObjectResolvingEList.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 5 sep. 2006
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        
 */
package org.kermeta.language.structure.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.language.structure.Type;

/**
 * This class is used to help to workaround bug #108 which is related to 
 * EMF bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=89325
 * It overwrite then isUnique method to return false in order to allow duplicates in a list ...
 * 
 *
 */
public class NonUniqueEObjectResolvingEList extends EObjectResolvingEList<Type> {

	/**
	 * added so Eclipse doesn't complain ...
	 */
	private static final long serialVersionUID = 1L;

	public NonUniqueEObjectResolvingEList(Class<?> dataClass, InternalEObject owner, int featureID)
	{
		super(dataClass, owner, featureID);
	}
	
	protected boolean isUnique()
	{
		  return false;
	}
}
