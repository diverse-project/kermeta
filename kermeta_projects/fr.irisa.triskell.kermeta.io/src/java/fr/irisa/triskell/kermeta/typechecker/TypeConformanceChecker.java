/* $Id: TypeConformanceChecker.java,v 1.10 2006-03-03 15:22:18 dvojtise Exp $
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

//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeConformanceChecker  extends KermetaOptimizedVisitor {

	
	public static boolean conforms(fr.irisa.triskell.kermeta.language.structure.Type required, fr.irisa.triskell.kermeta.language.structure.Type provided) {
		// resolve primitive types
	    provided = TypeCheckerContext.getCanonicalType(provided);
	    required = TypeCheckerContext.getCanonicalType(required);
		// The type void is a sub-type of everything
		
		if (provided instanceof VoidType || provided == ((SimpleType)TypeCheckerContext.VoidType).type) return true;
		
		
		// RETURN TRUE IF THE REQUIRED TYPE IS OBJECT OR ANY OF IT SUPERTYPE
		fr.irisa.triskell.kermeta.language.structure.Class cobject = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).getType();
		 if (TypeEqualityChecker.equals(cobject, required)) return true;
		 Iterator it = ((ClassDefinition) cobject.getTypeDefinition()).getSuperType().iterator();
		 while (it.hasNext()) {
			 fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
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
	protected fr.irisa.triskell.kermeta.language.structure.Type provided;
	
	/**
	 * 
	 */
	public TypeConformanceChecker(fr.irisa.triskell.kermeta.language.structure.Type provided) {
		super();
		this.provided = provided;
	}
	
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visitFunctionType(FunctionType arg0) {
		// Covariant for return type and contra-variant for parameters
		Boolean result = new Boolean(false);
		if (provided instanceof FunctionType) {
			FunctionType p = (FunctionType)provided;
			if (TypeConformanceChecker.conforms(p.getLeft(), arg0.getLeft()) &&
					TypeConformanceChecker.conforms(arg0.getRight(), p.getRight()) ) {
				result = new Boolean(true);
			}
		}
		return result;
		
	}
	
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
		Boolean result = new Boolean(false);
		if (TypeEqualityChecker.equals(arg0, provided)) {
			result = new Boolean(true);
		}
		else {
			if (provided instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
				fr.irisa.triskell.kermeta.language.structure.Class p = (fr.irisa.triskell.kermeta.language.structure.Class)provided;
				java.util.Iterator it = ((ClassDefinition) p.getTypeDefinition()).getSuperType().iterator();
				while(it.hasNext()) {
					// get the super type
					fr.irisa.triskell.kermeta.language.structure.Class t_provided = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
					// propagate type variables
					t_provided = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(t_provided, TypeVariableEnforcer.getTypeVariableBinding(p));
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
	
	public Object visitEnumeration(Enumeration arg0) {
		return new Boolean(provided == arg0);
	}
	
	public Object visitPrimitiveType(PrimitiveType arg0) {
		throw new Error("Type-Checker error : the required type should not be a primitive type");
	}
	
	public Object visitProductType(ProductType arg0) {
		// all types must be sub-types
		Boolean result = new Boolean(true);
		if (provided instanceof ProductType) {
			ProductType p = (ProductType)provided;
			if(arg0.getType().size() == p.getType().size()) {
				for(int i=0; i< p.getType().size(); i++) {
					fr.irisa.triskell.kermeta.language.structure.Type t_provided = (fr.irisa.triskell.kermeta.language.structure.Type)p.getType().get(0);
					fr.irisa.triskell.kermeta.language.structure.Type t_required = (fr.irisa.triskell.kermeta.language.structure.Type)arg0.getType().get(0);
					if (!TypeConformanceChecker.conforms(t_required, t_provided)) {
						result = new Boolean(false);
						break;
					}
				}
			}
		}
		return result;
	}
	
	public Object visitTypeVariable(TypeVariable arg0) {
		// FIXME: This is probably too restrictive
	    fr.irisa.triskell.kermeta.language.structure.Type r = TypeVariableUtility.getLeastDerivedAdmissibleType(arg0);
	    if (provided instanceof TypeVariable) {
	        fr.irisa.triskell.kermeta.language.structure.Type p = TypeVariableUtility.getLeastDerivedAdmissibleType(provided);
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

	public Object visitVoidType(VoidType arg0) {
		return new Boolean(provided instanceof VoidType);
	}
}
