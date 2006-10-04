/* $Id: TypeEqualityChecker.java,v 1.6 2006-10-04 08:35:26 dvojtise Exp $
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


//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeEqualityChecker  extends KermetaOptimizedVisitor {

	
	public static boolean equals(fr.irisa.triskell.kermeta.language.structure.Type required, fr.irisa.triskell.kermeta.language.structure.Type provided) {
		// resolve primitive types
		required = PrimitiveTypeResolver.getResolvedType(required);
		provided = PrimitiveTypeResolver.getResolvedType(provided);
		TypeEqualityChecker visitor = new TypeEqualityChecker(provided);
		return ((Boolean)visitor.accept(required)).booleanValue();
	}
	
	/**
	 * The type provided
	 */
	protected fr.irisa.triskell.kermeta.language.structure.Type provided;
	
	/**
	 * 
	 */
	public TypeEqualityChecker(fr.irisa.triskell.kermeta.language.structure.Type provided) {
		super();
		this.provided = provided;
	}
	
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visitFunctionType(FunctionType arg0) {
		Boolean result = new Boolean(false);
		if (provided instanceof FunctionType) {
			FunctionType p = (FunctionType)provided;
			if (TypeEqualityChecker.equals(arg0.getLeft(), p.getLeft()) &&
					TypeEqualityChecker.equals(arg0.getRight(), p.getRight()) ) {
				result = new Boolean(true);
			}
		}
		return result;
	}
	
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
		Boolean result = new Boolean(false);
		if (provided instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
			fr.irisa.triskell.kermeta.language.structure.Class p = (fr.irisa.triskell.kermeta.language.structure.Class)provided;
			if (p.getTypeDefinition() == arg0.getTypeDefinition()) {
				result = new Boolean(true);
				for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
					fr.irisa.triskell.kermeta.language.structure.Type t1 = ((TypeVariableBinding)arg0.getTypeParamBinding().get(0)).getType();
					fr.irisa.triskell.kermeta.language.structure.Type t2 = ((TypeVariableBinding)p.getTypeParamBinding().get(0)).getType();
					if (!TypeEqualityChecker.equals(t1, t2)) {
						result = new Boolean(false);
						break;
					}
					
				}
			
				// special case of UnknownJavaObject, we need to check the real underlying type 
				// which is stored in a tag 
				//String t1JavaTypeName = JarUnit.getUnderlyingJavaTypeName(p);
				//String t2JavaTypeName = JarUnit.getUnderlyingJavaTypeName(arg0);
				//if(!t1JavaTypeName.equals(t2JavaTypeName)) 
				//	result = new Boolean(false);
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
		Boolean result = new Boolean(false);
		if (provided instanceof ProductType) {
			ProductType p = (ProductType)provided;
			if(arg0.getType().size() == p.getType().size()) {
				for(int i=0; i< p.getType().size(); i++) {
					fr.irisa.triskell.kermeta.language.structure.Type t1 = (fr.irisa.triskell.kermeta.language.structure.Type)p.getType().get(0);
					fr.irisa.triskell.kermeta.language.structure.Type t2 = (fr.irisa.triskell.kermeta.language.structure.Type)arg0.getType().get(0);
					if (!TypeEqualityChecker.equals(t1, t2)) {
						result = new Boolean(false);
						break;
					}
				}
			}
		}
		return result;
	}

	
	public Object visitTypeVariable(TypeVariable arg0) {
		return new Boolean(provided == arg0);
	}
	
	public Object visitVoidType(VoidType arg0) {
		return new Boolean(provided instanceof VoidType);
	}

}
