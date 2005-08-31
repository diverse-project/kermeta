/* $Id: TypeConformanceChecker.java,v 1.8 2005-08-31 14:12:58 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : TypeConformanceChecker.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 avr. 2005
* Author : Franck Fleurey
* Description :
*  This class implements type conformance for kermeta types
*/ 
package fr.irisa.triskell.kermeta.typechecker;


import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeConformanceChecker  extends KermetaOptimizedVisitor {

	
	public static boolean conforms(FType required, FType provided) {
		// resolve primitive types
	    provided = TypeCheckerContext.getCanonicalType(provided);
	    required = TypeCheckerContext.getCanonicalType(required);
		// The type void is a sub-type of everything
		
		if (provided instanceof FVoidType || provided == ((SimpleType)TypeCheckerContext.VoidType).type) return true;
		
		
		// RETURN TRUE IF THE REQUIRED TYPE IS OBJECT OR ANY OF IT SUPERTYPE
		 FClass cobject = (FClass)((SimpleType)TypeCheckerContext.ObjectType).getType();
		 if (TypeEqualityChecker.equals(cobject, required)) return true;
		 Iterator it = cobject.getFClassDefinition().getFSuperType().iterator();
		 while (it.hasNext()) {
		     FClass c = (FClass)it.next();
		     if (TypeEqualityChecker.equals(c, required)) return true;
		 }
		
		// Transformation if provided is a type variable to the least derived type admissible
		// for the variable.
		
		 //provided = TypeVariableUtility.getLeastDerivedAdmissibleType(provided);
		
		TypeConformanceChecker visitor = new TypeConformanceChecker(provided);
		return ((Boolean)visitor.accept(required)).booleanValue();
	}
	
	
	/**
	 * The type provided
	 */
	protected FType provided;
	
	/**
	 * 
	 */
	public TypeConformanceChecker(FType provided) {
		super();
		this.provided = provided;
	}
	
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visitFFunctionType(FFunctionType arg0) {
		// Covariant for return type and contra-variant for parameters
		Boolean result = new Boolean(false);
		if (provided instanceof FFunctionType) {
			FFunctionType p = (FFunctionType)provided;
			if (TypeConformanceChecker.conforms(p.getFLeft(), arg0.getFLeft()) &&
					TypeConformanceChecker.conforms(arg0.getFRight(), p.getFRight()) ) {
				result = new Boolean(true);
			}
		}
		return result;
		
	}
	
	public Object visitFClass(FClass arg0) {
		Boolean result = new Boolean(false);
		if (TypeEqualityChecker.equals(arg0, provided)) {
			result = new Boolean(true);
		}
		else {
			if (provided instanceof FClass) {
				FClass p = (FClass)provided;
				java.util.Iterator it = p.getFClassDefinition().getFSuperType().iterator();
				while(it.hasNext()) {
					// get the super type
					FClass t_provided = (FClass)it.next();
					// propagate type variables
					t_provided = (FClass)TypeVariableEnforcer.getBoundType(t_provided, TypeVariableEnforcer.getTypeVariableBinding(p));
					// check conformance of super type
					if (TypeConformanceChecker.conforms(arg0, t_provided)) {
						result = new Boolean(true);
						break;
					}
				}
				
			}
		}
		return result;
	}
	
	public Object visitFEnumeration(FEnumeration arg0) {
		return new Boolean(provided == arg0);
	}
	
	public Object visitFPrimitiveType(FPrimitiveType arg0) {
		throw new Error("Type-Checker error : the required type should not be a primitive type");
	}
	
	public Object visitFProductType(FProductType arg0) {
		// all types must be sub-types
		Boolean result = new Boolean(true);
		if (provided instanceof FProductType) {
			FProductType p = (FProductType)provided;
			if(arg0.getFType().size() == p.getFType().size()) {
				for(int i=0; i< p.getFType().size(); i++) {
					FType t_provided = (FType)p.getFType().get(0);
					FType t_required = (FType)arg0.getFType().get(0);
					if (!TypeConformanceChecker.conforms(t_required, t_provided)) {
						result = new Boolean(false);
						break;
					}
				}
			}
		}
		return result;
	}
	
	public Object visitFTypeVariable(FTypeVariable arg0) {
		// FIXME: This is probably too restrictive
	    FType r = TypeVariableUtility.getLeastDerivedAdmissibleType(arg0);
	    if (provided instanceof FTypeVariable) {
	        FType p = TypeVariableUtility.getLeastDerivedAdmissibleType(provided);
	        return new Boolean(TypeConformanceChecker.conforms(r, p));
	    }
	    /*
	    else if (provided instanceof FClass) {
	        return new Boolean(TypeConformanceChecker.conforms(r, provided));
	    }
	    */
	    else {
	        return new Boolean(false);
	    }
	}

	public Object visitFVoidType(FVoidType arg0) {
		return new Boolean(provided instanceof FVoidType);
	}
}
