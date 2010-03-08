/* $Id: TypeVariableInferer.java,v 1.21 2008-04-28 11:50:10 ftanguy Exp $
* Project : Kermeta io
* File : TypeVariableInferer.java
* License : EPL
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
import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class TypeVariableInferer extends KermetaOptimizedVisitor {

    

    
    /**
	 * Tries to bind type variable of generic type according to a provided type
	 * @param generic A type that contains type variable
	 * @param provided A type that conforms to the generic type and from which actual type are extracted
	 * @param unit The conpilation unit
	 * @return A hashtable <Variable : ObjectTypeVariable, ActualType : fr.irisa.triskell.kermeta.language.structure.Type> or null if the provided does not match the generic type
	 */
	public static Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> 
				  inferTypeVariableTypes(fr.irisa.triskell.kermeta.language.structure.Type generic, fr.irisa.triskell.kermeta.language.structure.Type provided,
							TypeCheckerContext typecheckercontext) {
		Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> result = new Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type>();
		
		// Get rid of primitive types
		provided = TypeCheckerContext.getCanonicalType(provided);
		generic = TypeCheckerContext.getCanonicalType(generic);
		
		if (provided instanceof VoidType || TypeEqualityChecker.equals(provided, ((SimpleType)typecheckercontext.VoidType).type)) return result;
		
		try {
			TypeVariableInferer visitor = new TypeVariableInferer(provided, result, typecheckercontext);
			visitor.accept(generic);
		}
		catch(TypeDoesNotMatchError e) {
			result = null;
		}
		return result;
	}
	
	public static void inferTypeVariableTypes(fr.irisa.triskell.kermeta.language.structure.Type generic, 
			fr.irisa.triskell.kermeta.language.structure.Type provided, 
			Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> result,
			TypeCheckerContext typecheckercontext) {
	    provided = TypeCheckerContext.getCanonicalType(provided);
		generic = TypeCheckerContext.getCanonicalType(generic);
		TypeVariableInferer visitor = new TypeVariableInferer(provided, result, typecheckercontext);
		result = (Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type>)visitor.accept(generic);
	}
	
	
	/**
	 * The type provided
	 */
	protected fr.irisa.triskell.kermeta.language.structure.Type provided;
	
	protected Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> result;
	
	protected TypeCheckerContext typecheckercontext;
	protected TypeVariableUtility typeVariableUtility;
	
	/**
	 * Constructor
	 */
	public TypeVariableInferer(fr.irisa.triskell.kermeta.language.structure.Type provided, 
			Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> result,
			TypeCheckerContext typecheckercontext ) {
		super();
		this.provided = provided;
		this.result = result;
		this.typecheckercontext = typecheckercontext;
		typeVariableUtility = new TypeVariableUtility(typecheckercontext);
	}
	
	/**
	 * IMPLEMENTATION OF THE VISITOR
	 */
	public Object visitFunctionType(FunctionType arg0) {
		if (! (provided instanceof FunctionType) ) throw new TypeDoesNotMatchError();
		TypeVariableInferer.inferTypeVariableTypes(arg0.getLeft(), ((FunctionType)provided).getLeft(), result, typecheckercontext);
		TypeVariableInferer.inferTypeVariableTypes(arg0.getRight(), ((FunctionType)provided).getRight(), result, typecheckercontext);
		return null;
	}
	
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
	    
	    // Handle type variables
	    if (provided instanceof ObjectTypeVariable) {
	        provided = new TypeVariableUtility(typecheckercontext).getLeastDerivedAdmissibleType(provided);
	    }
	    
	    if (provided instanceof VoidType) return null;
	    
	    if ( (provided instanceof Enumeration) && TypeConformanceChecker.conforms(typecheckercontext.ObjectType.getFType(), arg0, typecheckercontext))
	    	return null;
	    
	    if (provided instanceof ModelType) {
	    	if (TypeConformanceChecker.conforms(typecheckercontext.ModelType.getFType(), arg0, typecheckercontext)) {
	    		return null;
	    	}
	    	Iterator<fr.irisa.triskell.kermeta.language.structure.Type> msupers =  InheritanceSearch.allSuperTypes((fr.irisa.triskell.kermeta.language.structure.Class) typecheckercontext.ModelType.getFType(), typecheckercontext).iterator();
	    	while (msupers.hasNext()) {
	    		fr.irisa.triskell.kermeta.language.structure.Type msuper = msupers.next();
	    		if (TypeConformanceChecker.conforms(msuper, arg0, typecheckercontext)) 
	    		{
	    			return null;
	    		}
	    	}
	    }
	    
		if (! (provided instanceof fr.irisa.triskell.kermeta.language.structure.Class) ) 
			throw new TypeDoesNotMatchError();
		
		Iterator<fr.irisa.triskell.kermeta.language.structure.Type> it = InheritanceSearch.allSuperTypes((fr.irisa.triskell.kermeta.language.structure.Class)provided, typecheckercontext).iterator();		
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Class sp = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
		    if (arg0.getTypeDefinition() == sp.getTypeDefinition()) {
		        for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
					try {
						fr.irisa.triskell.kermeta.language.structure.Type g = ((TypeVariableBinding)arg0.getTypeParamBinding().get(i)).getType();
						fr.irisa.triskell.kermeta.language.structure.Type p = ((TypeVariableBinding)sp.getTypeParamBinding().get(i)).getType();
						TypeVariableInferer.inferTypeVariableTypes(g, p, result, typecheckercontext);
					} catch (Exception e) {
						System.out.println();
					}
		        }
		        return null;
		    }
		}
		//throw new TypeDoesNotMatchError();
		return null;
	}
	
	public Object visitEnumeration(Enumeration arg0) {
		// FIXME: some checking might be added here...
		return null;
	}
	
	public Object visitPrimitiveType(PrimitiveType arg0) {
		// FIXME: some checking might be added here...
		return null;
	}
	
	public Object visitProductType(ProductType arg0) {
		// the provided type is supposed to be a conformant product type 
		for(int i=0; i<arg0.getType().size(); i++) {
			fr.irisa.triskell.kermeta.language.structure.Type g = (fr.irisa.triskell.kermeta.language.structure.Type)arg0.getType().get(i);
			fr.irisa.triskell.kermeta.language.structure.Type p = (fr.irisa.triskell.kermeta.language.structure.Type)((ProductType)provided).getType().get(i);
			TypeVariableInferer.inferTypeVariableTypes(g, p, result, typecheckercontext);
		}
		return null;
	}
	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		// check that this binding is OK
	    if (!TypeConformanceChecker.conforms(typeVariableUtility.getLeastDerivedAdmissibleType(arg0),typeVariableUtility.getLeastDerivedAdmissibleType(provided), typecheckercontext)) {
			throw new TypeDoesNotMatchError();
		}
		// If there is already a binding :
		if (result.get(arg0) != null) {
			fr.irisa.triskell.kermeta.language.structure.Type provided2 = (fr.irisa.triskell.kermeta.language.structure.Type)result.get(arg0);
		    if (TypeConformanceChecker.conforms(provided2, provided, typecheckercontext)) {
		        // provided2 remains the appropriate binding
		    }
		    else if (TypeConformanceChecker.conforms(provided, provided2, typecheckercontext)) {
		        // provided becomes the appropriate binding
		        result.put(arg0, provided);
		    }
		    else {
		        throw new TypeDoesNotMatchError();
		    }
		}
		else {
		    result.put(arg0, provided);
		}
		return null;
	}
	
	public Object visitModelTypeVariable(ModelTypeVariable arg0) {
		//TODO implement me
		return null;
	}
	
	public Object visitVirtualType(VirtualType arg0) {
		//TODO implement me
		return null;
	}
	
}
