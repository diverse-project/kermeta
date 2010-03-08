/* $Id: ContextFrame.java,v 1.6 2008-04-28 11:50:10 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : ContextFrame.java
* License : EPL
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

import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol;



/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class ContextFrame {

	// the symbols defined in the context
	protected Hashtable<String, KMSymbol> symbols;
	protected Hashtable<String, Type> types;
	
	/**
	 * Constructors
	 */
	public ContextFrame() {
		super();
		symbols = new Hashtable<String, KMSymbol>();
		types = new Hashtable<String, Type>();
	}
	
	public void addSymbol(KMSymbol symbol, Type type) {
		symbols.put(symbol.getIdentifier(), symbol);
		types.put(symbol.getIdentifier(), type);
	}
	
	public KMSymbol getSymbol(String id) {
		return symbols.get(id);
	}
	
	public Type getTypeOfSymbol(String id) {
		return types.get(id);
	}

}
