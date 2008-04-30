/* $Id: CallableElement.java,v 1.5 2008-04-30 13:57:40 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : CallableItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2005
* Author : Franck Fleurey
* Description :
*  This class is a super class for callable elements :
* operation, property, variable, ...
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import fr.irisa.triskell.kermeta.language.behavior.Expression;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public abstract class CallableElement {
	
	/**
	 * Get the type of the callable element
	 * @return
	 */
	public abstract Type getType(Expression expression);
	
	/**
	 * Get the name of the callable element
	 * @return
	 */
	public abstract String getName();

}
