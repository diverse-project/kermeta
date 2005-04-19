/* $Id: CallableElement.java,v 1.1 2005-04-19 08:55:19 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : CallableItem.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2005
* Author : Franck Fleurey
* Description :
*  This class is a super class for callable elements :
* operation, property, variable, ...
*/ 
package fr.irisa.triskell.kermeta.typechecker;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public abstract class CallableElement {
	
	/**
	 * Get the type of the callable element
	 * @return
	 */
	public abstract Type getType();
	
	/**
	 * Get the name of the callable element
	 * @return
	 */
	public abstract String getName();

}
