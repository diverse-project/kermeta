/* $Id: TypeEqualityChecker.java,v 1.3 2005-08-31 14:12:58 ffleurey Exp $
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


import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeEqualityChecker  extends KermetaOptimizedVisitor {

	
	public static boolean equals(FType required, FType provided) {
		// resolve primitive types
		required = PrimitiveTypeResolver.getResolvedType(required);
		provided = PrimitiveTypeResolver.getResolvedType(provided);
		TypeEqualityChecker visitor = new TypeEqualityChecker(provided);
		return ((Boolean)visitor.accept(required)).booleanValue();
	}
	
	/**
	 * The type provided
	 */
	protected FType provided;
	
	/**
	 * 
	 */
	public TypeEqualityChecker(FType provided) {
		super();
		this.provided = provided;
	}
	
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visitFFunctionType(FFunctionType arg0) {
		Boolean result = new Boolean(false);
		if (provided instanceof FFunctionType) {
			FFunctionType p = (FFunctionType)provided;
			if (TypeEqualityChecker.equals(arg0.getFLeft(), p.getFLeft()) &&
					TypeEqualityChecker.equals(arg0.getFRight(), p.getFRight()) ) {
				result = new Boolean(true);
			}
		}
		return result;
	}
	
	public Object visitFClass(FClass arg0) {
		Boolean result = new Boolean(false);
		if (provided instanceof FClass) {
			FClass p = (FClass)provided;
			if (p.getFClassDefinition() == arg0.getFClassDefinition()) {
				result = new Boolean(true);
				for(int i=0; i<arg0.getFTypeParamBinding().size(); i++) {
					FType t1 = ((FTypeVariableBinding)arg0.getFTypeParamBinding().get(0)).getFType();
					FType t2 = ((FTypeVariableBinding)p.getFTypeParamBinding().get(0)).getFType();
					if (!TypeEqualityChecker.equals(t1, t2)) {
						result = new Boolean(false);
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
		Boolean result = new Boolean(false);
		if (provided instanceof FProductType) {
			FProductType p = (FProductType)provided;
			if(arg0.getFType().size() == p.getFType().size()) {
				for(int i=0; i< p.getFType().size(); i++) {
					FType t1 = (FType)p.getFType().get(0);
					FType t2 = (FType)arg0.getFType().get(0);
					if (!TypeEqualityChecker.equals(t1, t2)) {
						result = new Boolean(false);
						break;
					}
				}
			}
		}
		return result;
	}

	
	public Object visitFTypeVariable(FTypeVariable arg0) {
		return new Boolean(provided == arg0);
	}
	
	public Object visitFVoidType(FVoidType arg0) {
		return new Boolean(provided instanceof FVoidType);
	}

}
