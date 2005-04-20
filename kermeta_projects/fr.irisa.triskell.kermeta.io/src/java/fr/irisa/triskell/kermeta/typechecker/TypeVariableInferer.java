/* $Id: TypeVariableInferer.java,v 1.2 2005-04-20 15:21:05 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : TypeVariableInferer.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 avr. 2005
* Author : Franck Fleurey
* Description :
*  This visitor infers the actual types binded to the type variables of a generic type
*  acording to a provided type.
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FSelfType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeVariableInferer extends KermetaVisitor {

    /**
	 * Tries to bind type variable of generic type according to a provided type
	 * @param generic A type that contains type variable
	 * @param provided A type that conforms to the generic type and from which actual type are extracted
	 * @param unit The conpilation unit
	 * @return A hashtable <Variable : FTypeVariable, ActualType : FType> or null if the provided does not match the generic type
	 */
	public static Hashtable inferTypeVariableTypes(FType generic, FType provided) {
		Hashtable result = new Hashtable();
		
		if (provided instanceof FVoidType || provided == ((SimpleType)TypeCheckerContext.VoidType).type) return result;
		
		try {
			TypeVariableInferer visitor = new TypeVariableInferer(provided, result);
			result = (Hashtable)visitor.accept(generic);
		}
		catch(TypeDoesNotMatchError e) {
			result = null;
		}
		return result;
	}
	
	public static void inferTypeVariableTypes(FType generic, FType provided, Hashtable result) {
		TypeVariableInferer visitor = new TypeVariableInferer(provided, result);
		result = (Hashtable)visitor.accept(generic);
	}
	
	
	/**
	 * The type provided
	 */
	protected FType provided;
	
	protected Hashtable result;
	
	/**
	 * Constructor
	 */
	public TypeVariableInferer(FType provided, Hashtable result) {
		super();
		this.provided = provided;
		this.result = result;
	}
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visit(FFunctionType arg0) {
		if (! (provided instanceof FFunctionType) ) throw new TypeDoesNotMatchError();
		TypeVariableInferer.inferTypeVariableTypes(arg0.getFLeft(), ((FFunctionType)provided).getFLeft(), result);
		TypeVariableInferer.inferTypeVariableTypes(arg0.getFRight(), ((FFunctionType)provided).getFRight(), result);
		return null;
	}
	
	public Object visit(FClass arg0) {
		if (! (provided instanceof FClass) ) throw new TypeDoesNotMatchError();
		// the provided type is suposed to be a conformant class  
		for(int i=0; i<arg0.getFTypeParamBinding().size(); i++) {
			FType g = ((FTypeVariableBinding)arg0.getFTypeParamBinding().get(i)).getFType();
			FType p = ((FTypeVariableBinding)((FClass)provided).getFTypeParamBinding().get(i)).getFType();
			TypeVariableInferer.inferTypeVariableTypes(g, p, result);
		}
		return null;
	}
	
	public Object visit(FEnumeration arg0) {
		// FIXME: some checking might be added here...
		return null;
	}
	
	public Object visit(FPrimitiveType arg0) {
		// FIXME: some checking might be added here...
		return null;
	}
	
	public Object visit(FProductType arg0) {
		// the provided type is suposed to be a conformant product type 
		for(int i=0; i<arg0.getFType().size(); i++) {
			FType g = (FType)arg0.getFType().get(i);
			FType p = (FType)((FProductType)provided).getFType().get(i);
			TypeVariableInferer.inferTypeVariableTypes(g, p, result);
		}
		return null;
	}
	
	public Object visit(FSelfType arg0) {
		// FIXME: Not sure...
		return null;
	}
	
	public Object visit(FTypeVariable arg0) {
		// check that this binding is OK
		FType req = TypeVariableUtility.getLeastDerivedAdmissibleType(arg0);
		if (!TypeConformanceChecker.conforms(req, provided)) {
			throw new TypeDoesNotMatchError();
		}
		// If there is already a binding :
		if (result.get(arg0) != null) {
		    FType provided2 = (FType)result.get(arg0);
		    if (TypeConformanceChecker.conforms(provided2, provided)) {
		        // provided2 remains the appropriate binding
		    }
		    else if (TypeConformanceChecker.conforms(provided, provided2)) {
		        // provided becomes the appropriate binding
		        result.put(arg0, provided);
		    }
		    else {
		        throw new TypeDoesNotMatchError();
		    }
		}
		return null;
	}

}
