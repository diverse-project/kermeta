

/*$Id: LoadingContext.java,v 1.6 2008-04-28 11:50:17 ftanguy Exp $
* Project : io
* File : 	KMTLoadingContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 juin 07
* Authors : paco
*/

package org.kermeta.loader;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolInterpreterVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolProperty;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;

public class LoadingContext {
	//////////////////////////////////
	//////////////////////////////////
	//		Context Mechanism		//
	//////////////////////////////////
	//////////////////////////////////

	public LoadingContext() {
		interpreterSymbols.put("stdio", new KMSymbolInterpreterVariable("stdio") );
	}
	
	/**
	 * This is a symbol table. It is a stack of hashtable.
	 * it contains 
	 *    - the attributes and methods of the current class and its superclasses.
	 * 	  - the parameters of the operation that is being defined.
	 * 	  - the local variables of the current block.
	 * 	  - the parameters of the current lambda expression.
	 * Each hashtable contains a mapping
	 * symbol : { String : MCSymbol }
	 */
	protected Stack<Hashtable<String, KMSymbol>> symbols = new Stack<Hashtable<String, KMSymbol>>();
	
	/**
	 * This is a the same principle ast the symbol table
	 * but for type variables.
	 */
	protected Stack<Hashtable<String, TypeVariable>> typeVars = new Stack<Hashtable<String, TypeVariable>>();

	/**
	 * This is a the same principle ast the symbol table
	 * but for type variables.
	 */
	protected Hashtable<String, KMSymbol> interpreterSymbols = new Hashtable<String, KMSymbol>();

	public void pushContext(ClassDefinition cd) {
		/*
		 * 
		 * Pushing Context
		 * 
		 */
		pushContext();
		// add type variable
		for ( TypeVariable tv : cd.getTypeParameter() )
			addTypeVar( tv );
		// add attributes and operations
		for ( fr.irisa.triskell.kermeta.language.structure.Operation op : KermetaModelHelper.ClassDefinition.getAllOperations(cd) )
			addSymbol( new KMSymbolOperation(op) );
		
		for ( fr.irisa.triskell.kermeta.language.structure.Property prop : KermetaModelHelper.ClassDefinition.getAllProperties(cd) )
			addSymbol( new KMSymbolProperty(prop) );
	}
	
	public void pushContext(Operation operation) {
		/*
		 * 
		 * Pushing Context
		 * 
		 */
		pushContext();
		// add type variable
		Iterator<TypeVariable> tvs = operation.getTypeParameter().iterator();
		while( tvs.hasNext() ) 
			addTypeVar( tvs.next() );
		// add parameters
		Iterator<Parameter> params = operation.getOwnedParameter().iterator();
		while( params.hasNext() ) 
			addSymbol(new KMSymbolParameter( params.next() ) );
	}
	
	public void pushContext() {
		symbols.push(new Hashtable<String, KMSymbol>());
		typeVars.push(new Hashtable<String, TypeVariable>());
	}
	
	public void popContext() {
		symbols.pop();
		typeVars.pop();
	}
	
	public void addSymbol(KMSymbol s) {
		symbols.peek().put(s.getIdentifier(), s);
	}
	
	public void addTypeVar(TypeVariable var){
		typeVars.peek().put(var.getName(), var);
	}
	
	/**
	 * Find a symbol in the symbol tables
	 * It starts from the top of the stack.
	 * returns null if the symbol was not found
	 */
	public KMSymbol symbolLookup(String symbol) {
		KMSymbol result = null;
		for (int i=symbols.size()-1; i >-1; i--) {
			Hashtable<String, KMSymbol> table = symbols.get(i);
			result = (KMSymbol)table.get(symbol);
			if (result != null) break;
		}
		// search in the interpreter variables :
		if (result == null) {
			result = interpreterSymbols.get(symbol);
		}
		return result;
	}
	
	public Hashtable <String, KMSymbol> peekSymbols() {
		return symbols.peek();
	}
	
	/**
	 * Find a type variable in the context.
	 * returns null if the variable was not found
	 */
	public TypeVariable typeVariableLookup(String name) {
		TypeVariable result = null;
		for (int i=typeVars.size()-1; i >-1; i--) {
			Hashtable<String, TypeVariable> table = typeVars.get(i);
			result = (TypeVariable)table.get(name);
			if (result != null) break;
		}
		return result;
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Context Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////


	public Enumeration current_enum = null;

	public ModelType current_modeltype = null;

	public ClassDefinition current_class = null;

	public Package current_package = null;
	
	public fr.irisa.triskell.kermeta.language.structure.Operation current_operation;

	public fr.irisa.triskell.kermeta.language.structure.Property current_property;
	
}


