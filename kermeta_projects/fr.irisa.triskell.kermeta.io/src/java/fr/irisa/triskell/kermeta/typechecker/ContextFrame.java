/* $Id: ContextFrame.java,v 1.2 2005-04-20 15:21:04 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : ContextFrame.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 avr. 2005
* Author : Franck Fleurey
* Description :
*     This class is the context of a block for the type-checker
* TODO :
*    
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ContextFrame {

	// the symbols defined in the context
	protected Hashtable symbols;
	protected Hashtable types;
	
	/**
	 * Constructors
	 */
	public ContextFrame() {
		super();
		symbols = new Hashtable();
		types = new Hashtable();
	}
	
	public void addSymbol(KMSymbol symbol, Type type) {
		symbols.put(symbol.getIdentifier(), symbol);
		types.put(symbol.getIdentifier(), type);
	}
	
	public KMSymbol getSymbol(String id) {
		return (KMSymbol)symbols.get(id);
	}
	
	public Type getTypeOfSymbol(String id) {
		return (Type)types.get(id);
	}

}
