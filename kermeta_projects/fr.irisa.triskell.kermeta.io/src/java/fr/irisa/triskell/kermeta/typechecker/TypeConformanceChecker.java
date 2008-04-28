/* $Id: TypeConformanceChecker.java,v 1.25 2008-04-28 11:50:11 ftanguy Exp $
* Project : Kermeta (io
* File : TypeConformanceChecker.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 avr. 2005
* Authors : 
* 		Franck Fleurey
* 		Jim Steel
* Description :
*  This class implements type conformance for kermeta types
*/ 
package fr.irisa.triskell.kermeta.typechecker;


import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * This class implements type conformance for kermeta types
 */
public class TypeConformanceChecker  extends KermetaOptimizedVisitor {

	
	public static boolean conforms(fr.irisa.triskell.kermeta.language.structure.Type required, fr.irisa.triskell.kermeta.language.structure.Type provided) {
		// resolve primitive types
	    provided = TypeCheckerContext.getCanonicalType(provided);
	    required = TypeCheckerContext.getCanonicalType(required);
	    
		// The type void is a sub-type of everything		
    	if (provided instanceof VoidType || 
   			( (provided instanceof Class) && ((Class) provided).getTypeDefinition() == ((Class) ((SimpleType)TypeCheckerContext.VoidType).type).getTypeDefinition()) ) 
			return true;
		
    	// RETURN TRUE IF THE REQUIRED TYPE IS OBJECT OR ANY OF IT SUPERTYPE
		Class cobject = (Class)((SimpleType)TypeCheckerContext.ObjectType).getType();
		if ( TypeEqualityChecker.equals(cobject, required) ) 
			return true;
    	
		//Return true if the required type is Model and the provided type is a modeltype
		if (provided instanceof ModelType) {
			fr.irisa.triskell.kermeta.language.structure.Class mobject = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ModelType).getType();
			
			if (TypeEqualityChecker.equals(mobject, required) && (provided instanceof ModelType)) {
				return true;
			}
			//Or any of its supertypes
			Iterator<fr.irisa.triskell.kermeta.language.structure.Type> it = ((ClassDefinition) mobject.getTypeDefinition()).getSuperType().iterator();
			while(it.hasNext()) {
				fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
			    if (TypeEqualityChecker.equals(c, required)) return true;
			}
		}
		
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
		Boolean result = false;
		if (provided instanceof FunctionType) {
			FunctionType p = (FunctionType)provided;
			if (TypeConformanceChecker.conforms(p.getLeft(), arg0.getLeft()) &&
					TypeConformanceChecker.conforms(arg0.getRight(), p.getRight()) ) {
				result = true;
			}
		}
		return result;
		
	}
	
	public Object visitClass(Class arg0) {
		boolean result = false;
		if ((arg0 == TypeCheckerContext.ObjectType) && (provided instanceof VirtualType)) {
			result = true;
		} else if (provided instanceof Class) {
			ClassConformanceChecker checker = new ClassConformanceChecker( (Class)  provided );
			result = checker.conforms( arg0 );
		}
		return result;
	}
	
	public Object visitEnumeration(Enumeration arg0) {
		return provided == arg0;
	}
	
	public Object visitPrimitiveType(PrimitiveType arg0) {
		throw new Error("Type-Checker error : the required type should not be a primitive type");
	}
	
	public Object visitProductType(ProductType arg0) {
		// all types must be sub-types
		Boolean result = true;
		if (provided instanceof ProductType) {
			ProductType p = (ProductType)provided;
			if(arg0.getType().size() == p.getType().size()) {
				for(int i=0; i< p.getType().size(); i++) {
					fr.irisa.triskell.kermeta.language.structure.Type t_provided = (fr.irisa.triskell.kermeta.language.structure.Type)p.getType().get(i);
					fr.irisa.triskell.kermeta.language.structure.Type t_required = (fr.irisa.triskell.kermeta.language.structure.Type)arg0.getType().get(i);
					if ( ! TypeConformanceChecker.conforms(t_required, t_provided) ) {
						result = false;
						break;
					}
				}
			}
		}
		return result;
	}
	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		// FIXME: This is probably too restrictive
	    fr.irisa.triskell.kermeta.language.structure.Type r = TypeVariableUtility.getLeastDerivedAdmissibleType(arg0);
	    if (provided instanceof ObjectTypeVariable) {
	        fr.irisa.triskell.kermeta.language.structure.Type p = TypeVariableUtility.getLeastDerivedAdmissibleType(provided);
	        return TypeConformanceChecker.conforms(r, p);
	    } else {
	        return false;
	    }
	}

	public Object visitVirtualType(VirtualType arg0) {
		return TypeEqualityChecker.equals(arg0, provided);
	}
	
	public Object visitModelTypeVariable(ModelTypeVariable arg0) {
		return TypeEqualityChecker.equals(arg0, provided);
	}
	
	public Object visitVoidType(VoidType arg0) {
		return provided instanceof VoidType;
	}
	
	public Object visitModelType(ModelType arg0) {
		return TypeEqualityChecker.equals(arg0, provided);
	}
	
	public Object visitDataType(DataType arg0){
		throw new Error("Type checker error: Model type conformance is not yet implemented for DataType! (incidentally " + arg0 + ")");
	}
}
