/* $Id: TypeVariableEnforcer.java,v 1.9 2007-07-20 15:08:03 ftanguy Exp $
* Project : Kermeta io
* File : GenericTypeSubstitution.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 avr. 2005
* Author : Franck Fleurey
* Description :
* Transforms a fr.irisa.triskell.kermeta.language.structure.Type that contains type variables into an 
* actual fr.irisa.triskell.kermeta.language.structure.Type by replacing variables by their values.
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * Transforms a fr.irisa.triskell.kermeta.language.structure.Type that contains type variables into an 
 * actual fr.irisa.triskell.kermeta.language.structure.Type by replacing variables by their values.
 */
public class TypeVariableEnforcer extends KermetaOptimizedVisitor {
	
	public static fr.irisa.triskell.kermeta.language.structure.Type getBoundType(fr.irisa.triskell.kermeta.language.structure.Type generic, Hashtable bindings) {
		TypeVariableEnforcer visitor = new TypeVariableEnforcer(bindings);
		return (fr.irisa.triskell.kermeta.language.structure.Type) visitor.accept(generic);
	}
	
	public static Hashtable getTypeVariableBinding(ParameterizedType c) {
		Hashtable result = new Hashtable();
		Iterator it = c.getTypeParamBinding().iterator();
		while(it.hasNext()) {
			TypeVariableBinding bind = (TypeVariableBinding)it.next();
			result.put(bind.getVariable(), bind.getType());
		}
		it = c.getVirtualTypeBinding().iterator();
		while (it.hasNext()) {
			TypeVariableBinding bind = (TypeVariableBinding) it.next();
			result.put(bind.getVariable(), bind.getType());
		}
		return result;
	}
	
	protected Hashtable bindings;
	protected StructureFactory struct_factory;

	
	/**
	 * Create a copy of the function type by resolving types
	 */
	public Object visitFunctionType(FunctionType arg0) {
		FunctionType result = struct_factory.createFunctionType();
		result.setLeft(getBoundType(arg0.getLeft(), bindings));
		result.setRight(getBoundType(arg0.getRight(), bindings));
		return result;
	}
	
	/**
	 * Create a copy of the FClass with resolved type parameters
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
		fr.irisa.triskell.kermeta.language.structure.Class result;
		if ( arg0.getTypeParamBinding().size() == 0) {
			result = arg0;
		}
		else {
			result = struct_factory.createClass();
			result.setTypeDefinition(arg0.getTypeDefinition());
			Iterator it = arg0.getTypeParamBinding().iterator();
			while(it.hasNext()) {
				TypeVariableBinding provided = (TypeVariableBinding)it.next();
				TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
				bind.setVariable(provided.getVariable());
				
				bind.setType(getBoundType(provided.getType(), bindings));
				result.getTypeParamBinding().add(bind);
			}
			it = arg0.getVirtualTypeBinding().iterator();
			while (it.hasNext()) {
				TypeVariableBinding provided = (TypeVariableBinding) it.next();
				TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
				bind.setVariable(provided.getVariable());
				bind.setType(getBoundType(provided.getType(), bindings));
				result.getVirtualTypeBinding().add(bind);
			}
		}
		return result;
	}
	
	public Object visitModelType(ModelType arg0) {
//		ModelType result;
//		if (arg0.getTypeParamBinding().isEmpty()) {
//			result = arg0;
//		} else {
//			result = struct_factory.createModelType();
//			result.setTypeDefinition(arg0.getTypeDefinition());
//			for (Object tpb : arg0.getTypeParamBinding()) {
//				TypeVariableBinding provided = (TypeVariableBinding) tpb;
//				TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
//				bind.setVariable(provided.getVariable());
//				bind.setType(getBoundType(provided.getType(), bindings));
//				result.getTypeParamBinding().add(bind);
//			}
//		}
//		return result;
		return arg0;
	}
	
	public Object visitFModelType(ModelType arg0) {
//		ModelType result;
//		if ( arg0.getTypeParamBinding().size() == 0) {
//			result = arg0;
//		}
//		else {
//			result = struct_factory.createModelType();
//			result.setTypeDefinition(arg0.getTypeDefinition());
//			Iterator it = arg0.getTypeParamBinding().iterator();
//			while (it.hasNext()) {
//				TypeVariableBinding provided = (TypeVariableBinding) it.next();
//				TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
//				bind.setVariable(provided.getVariable());
//				bind.setType(getBoundType(provided.getType(), bindings));
//				result.getTypeParamBinding().add(bind);
//			}
//		}
//		//FIXME: Need to descend down into the contained Classes and substitute their
//		// bound types too?
//		return result;
		return arg0;
	}
	
	public Object visitEnumeration(Enumeration arg0) {
		return arg0;
	}
	
	public Object visitPrimitiveType(PrimitiveType arg0) {
		return arg0;
	}
	
	public Object visitProductType(ProductType arg0) {
		ProductType result = struct_factory.createProductType();
		Iterator it = arg0.getType().iterator();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Type t = (fr.irisa.triskell.kermeta.language.structure.Type)it.next();
			result.getType().add(getBoundType(t, bindings));
		}
		return result;
	}
	
	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		if (bindings.containsKey(arg0)) return (fr.irisa.triskell.kermeta.language.structure.Type)bindings.get(arg0);
		else return arg0;
	}
	
	public Object visitVoidType(VoidType arg0) {
	    return arg0;
	}

	public Object visitVirtualType(VirtualType arg0) {
		if (bindings.containsKey(arg0)) return (fr.irisa.triskell.kermeta.language.structure.Type) bindings.get(arg0);
		return arg0;
	}
	
	public Object visitModelTypeVariable(ModelTypeVariable arg0) {
		if (bindings.containsKey(arg0)) return (fr.irisa.triskell.kermeta.language.structure.Type)bindings.get(arg0);
		else return arg0;
	}
	
	/**
	 * Constructor 
	 */
	public TypeVariableEnforcer(Hashtable bindings) {
		super();
		this.bindings = bindings;
		struct_factory = StructurePackageImpl.init().getStructureFactory();
	}

}
