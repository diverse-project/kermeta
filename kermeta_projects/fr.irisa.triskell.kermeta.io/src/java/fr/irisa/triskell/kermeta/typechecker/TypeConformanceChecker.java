/* $Id: TypeConformanceChecker.java,v 1.14 2007-07-24 13:46:45 ftanguy Exp $
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
import java.util.Set;

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
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
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
		
		if (provided instanceof VoidType || provided == ((SimpleType)TypeCheckerContext.VoidType).type) return true;
		
		
		// RETURN TRUE IF THE REQUIRED TYPE IS OBJECT OR ANY OF IT SUPERTYPE
		fr.irisa.triskell.kermeta.language.structure.Class cobject = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).getType();
		if (TypeEqualityChecker.equals(cobject, required)) return true;
		
		/*
		 * 
		 * Base classes checking.
		 * 
		 */
		if ( provided instanceof Class 
			&& required instanceof Class ) {

			Class cProvided = (Class) provided;
			Class cRequired = (Class) required;
			Set <TypeDefinition> providedBaseClasses = ClassDefinitionHelper.getAllBaseClasses( (ClassDefinition) cProvided.getTypeDefinition());
			Set <TypeDefinition> requiredAspectClasses = ClassDefinitionHelper.getAllAspectClasses( (ClassDefinition) cRequired.getTypeDefinition());
			
			for ( TypeDefinition aspectClass : requiredAspectClasses ) {
				for ( TypeDefinition baseClass : providedBaseClasses ) {
					Class p = StructureFactory.eINSTANCE.createClass();
					Class r = StructureFactory.eINSTANCE.createClass();
					p.setTypeDefinition( (ClassDefinition) baseClass);
					r.setTypeDefinition( (ClassDefinition) aspectClass );
					if ( TypeConformanceChecker.conforms(r, p) )
							return true;
				}
				
			}
		}
		
		/*
		 * 
		 * Supertype checking.
		 * 
		 */
		Iterator it = ((ClassDefinition) cobject.getTypeDefinition()).getSuperType().iterator();
		while (it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
		    if (TypeEqualityChecker.equals(c, required)) return true;
		}
		
		//Return true if the required type is Model and the provided type is a modeltype
		if (provided instanceof ModelType) {
			fr.irisa.triskell.kermeta.language.structure.Class mobject = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ModelType).getType();
			
			if (TypeEqualityChecker.equals(mobject, required) && (provided instanceof ModelType)) {
				return true;
			}
			//Or any of its supertypes
			it = ((ClassDefinition) mobject.getTypeDefinition()).getSuperType().iterator();
			while(it.hasNext()) {
				fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
			    if (TypeEqualityChecker.equals(c, required)) return true;
			}
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
		if ((arg0 == TypeCheckerContext.ObjectType) && (provided instanceof VirtualType)) {
			result = new Boolean(true);
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
	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		// FIXME: This is probably too restrictive
	    fr.irisa.triskell.kermeta.language.structure.Type r = TypeVariableUtility.getLeastDerivedAdmissibleType(arg0);
	    if (provided instanceof ObjectTypeVariable) {
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

	public Object visitVirtualType(VirtualType arg0) {
		Boolean result = new Boolean(false);
		if (TypeEqualityChecker.equals(arg0, provided)) {
			result = new Boolean(true);
		}
		//TODO Expand. Presumably MTV::X conforms to MTV::Y if X conforms to Y? Is that true? Does matching preserve pairwise subtyping?
		return result;
	}
	
	public Object visitModelTypeVariable(ModelTypeVariable arg0) {
		Boolean result = new Boolean(false);
		if (TypeEqualityChecker.equals(arg0, provided)) {
			result = new Boolean(true);
		}
		//TODO Think about this
		return result;
	}
	
	public Object visitVoidType(VoidType arg0) {
		return new Boolean(provided instanceof VoidType);
	}
	
	public Object visitModelType(ModelType arg0) {
		Boolean result = new Boolean(false);
		if (TypeEqualityChecker.equals(arg0, provided)) {
			//x conforms to x
			result = new Boolean(true);
		} else {
			// Can't match here. Model types are monomorphic.
		}
		//throw new Error("Type checker error: Model type conformance is not yet implemented! (incidentally " + result + ")");
		return result;
	}
	
	public Object visitDataType(DataType arg0){
		throw new Error("Type checker error: Model type conformance is not yet implemented for DataType! (incidentally " + arg0 + ")");
	}
}
