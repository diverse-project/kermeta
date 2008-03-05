/* $Id: SimpleType.java,v 1.22 2008-03-05 08:18:10 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : SimpleType.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 avr. 2005
* Author : Franck Fleurey
* Description :
*     describe here file content
* TODO :
*  A simple type is a type that direcly corresponds to
*  a Kermeta Type.
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.language.structure.impl.PrimitiveTypeImpl;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class SimpleType extends Type {

	/**
	 * The corresponding fr.irisa.triskell.kermeta.language.structure.Type
	 */
	protected fr.irisa.triskell.kermeta.language.structure.Type type;
	
	/**
	 * Constructor
	 */
	public SimpleType(fr.irisa.triskell.kermeta.language.structure.Type type) {
		super();	
		// Maybe the type is an alias. If it is the case, the real type is instanceType object from type object.
		// FIXME This may not be the place to check. But it works.
		if ( (type instanceof PrimitiveTypeImpl) 
				&&	( ((PrimitiveTypeImpl) type).getInstanceType() instanceof ClassImpl ) )
			this.type = ((PrimitiveTypeImpl) type).getInstanceType();
		else
			this.type = type;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#isSubTypeOf(fr.irisa.triskell.kermeta.language.structure.Type)
	 */
	public boolean isSubTypeOf(Type type) {
		if (type instanceof SimpleType) {
			fr.irisa.triskell.kermeta.language.structure.Type required = ((SimpleType)type).getType();
			return TypeConformanceChecker.conforms(required, getType());
		}
		else {
			Iterator it = ((UnionType)type).types.iterator();
			while(it.hasNext()) {
				if (!this.isSubTypeOf((Type)it.next())) {
					return false;
				}
			}
			return true;
		}
	}
	
	public boolean equals(Object  type) {
	    if (this == type) return true;
		if (type instanceof SimpleType) {
			fr.irisa.triskell.kermeta.language.structure.Type required = ((SimpleType)type).getType();
			return TypeEqualityChecker.equals(required, getType());
		}
		else {
			//TODO: This might be a litle restrictive 
			return false;
		}
	}
	
	public List<CallableOperation> callableOperations(KermetaUnit source) {
		List<CallableOperation> operations = CallableFeaturesCache.getInstance().getCallableOperations(type);
		if ( operations == null ) {
			
			// Try to get a FClass
			fr.irisa.triskell.kermeta.language.structure.Type resolved = type;
			if ( type instanceof PrimitiveType )
				resolved = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) type);
			
			if (resolved instanceof VirtualType) {
	//			Temporary class just for the purposes of inheritance searching
				//TODO This is a nasty, evil, dirty hack, and probably a memory leak
				VirtualType virt = (VirtualType) resolved;
				StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
				fr.irisa.triskell.kermeta.language.structure.Class tmp_cls = struct_factory.createClass();
				tmp_cls.setTypeDefinition(virt.getClassDefinition());
				for ( TypeVariableBinding old_tvb : virt.getTypeParamBinding() ) {
					TypeVariableBinding tvb = struct_factory.createTypeVariableBinding();
					tvb.setVariable(old_tvb.getVariable());
					tvb.setType(old_tvb.getType());
					tmp_cls.getTypeParamBinding().add(tvb);
				}
				resolved = tmp_cls;
			} else {
				resolved = TypeVariableUtility.getLeastDerivedAdmissibleType(resolved);
			}
			
			if (resolved instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
				Class c = (Class) resolved;
				operations = InheritanceSearch.callableOperations(c, source);
			} else if (resolved instanceof ModelType) {
				fr.irisa.triskell.kermeta.language.structure.Class model = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ModelType).type;
				operations = InheritanceSearch.callableOperations(model, source);
			}
			else if(resolved instanceof FunctionType) {
				operations = InheritanceSearch.callableOperations((fr.irisa.triskell.kermeta.language.structure.FunctionType)resolved);
			} else {
				operations = new ArrayList<CallableOperation>();
			}
			
			CallableFeaturesCache.getInstance().addCallableOperations(type, operations);
			
		}
		return operations;
	}
	public List<CallableProperty> callableProperties() {
		List<CallableProperty> properties = CallableFeaturesCache.getInstance().getCallableProperties(type);
		if ( properties == null ) {
			// Try to get a FClass
			fr.irisa.triskell.kermeta.language.structure.Type resolved = type;
			if ( type instanceof PrimitiveType )
				resolved = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) type);

			if (resolved instanceof VirtualType) {
	//			Temporary class just for the purposes of inheritance searching
				//TODO This is a nasty, evil, dirty hack, and probably a memory leak
				VirtualType virt = (VirtualType) resolved;
				StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
				Class tmp_cls = struct_factory.createClass();
				tmp_cls.setTypeDefinition(virt.getClassDefinition());
				for ( TypeVariableBinding old_tvb : virt.getTypeParamBinding() ) {
					TypeVariableBinding tvb = struct_factory.createTypeVariableBinding();
					tvb.setVariable(old_tvb.getVariable());
					tvb.setType(old_tvb.getType());
					tmp_cls.getTypeParamBinding().add(tvb);
				}
				resolved = tmp_cls;
			} else {
				resolved = TypeVariableUtility.getLeastDerivedAdmissibleType(resolved);
			}
			if (resolved instanceof Class) {			
				properties = InheritanceSearch.callableProperties((Class) resolved);
			} else if (resolved instanceof ModelType) {
				Class model = (Class)((SimpleType)TypeCheckerContext.ModelType).type;
				properties = InheritanceSearch.callableProperties(model);
			}
			else {
				properties = new ArrayList<CallableProperty>();
			}
			
			CallableFeaturesCache.getInstance().addCallableProperties(type, properties);
			
		}
		return properties;
	}
	
	public Type getFunctionTypeLeft() {
		Type result = TypeCheckerContext.VoidType;
		if (type instanceof FunctionType) {
			FunctionType t = (FunctionType)type;
			result = new SimpleType(t.getLeft());
		}
		return result;
	}
	
	public Type getFunctionTypeRight() {
		Type result = TypeCheckerContext.VoidType;
		if (type instanceof FunctionType) {
			FunctionType t = (FunctionType)type;
			result = new SimpleType(t.getRight());
		}
		return result;
	}
	
	public Type[] getProductType() {
		Type[] result;
		if (type instanceof ProductType) {
			ProductType t = (ProductType)type;
			result = new Type[t.getType().size()];
			for(int i=0;i<t.getType().size(); i++) {
				result[i] = new SimpleType((fr.irisa.triskell.kermeta.language.structure.Type)t.getType().get(i));
			}
		}
		else {
			result = new Type[1];
			result[0] = this;
		}
		return result;
	}
	
	
	
	
	/**
	 * infer the actual type of the type variable of the generic type
	 * according to this type.
	 * @param generic 
	 * @return null if this type does not match the generic type
	 */
	public Hashtable inferTypeVariableBinding(Type generic) {
	    if (generic instanceof SimpleType) {
	        fr.irisa.triskell.kermeta.language.structure.Type g = ((SimpleType)generic).type;
	        try {
                return TypeVariableInferer.inferTypeVariableTypes(g, type);
            } catch (TypeDoesNotMatchError e) {
                return null;
            }
	    }
	    else {
	        return null;
	    }
	}
	
    protected void inferTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.Type generic, Hashtable binding) {
        TypeVariableInferer.inferTypeVariableTypes(generic, type, binding);
    }
    
	public String toString() {
		return (String)FTypePrettyPrinter.getInstance().accept(type);
	}
		
	/**
	 * Return the type definition of the type if it has one, null otherwise
	 * @return
	 */
	public TypeDefinition getTypeDefinition() {
	    if (type instanceof TypeDefinition) return (TypeDefinition)type;
	    else if (type instanceof ParameterizedType) {
	        return ((ParameterizedType)type).getTypeDefinition();
	    }
	    return null;
	}

	public fr.irisa.triskell.kermeta.language.structure.Type getFType() {
		return type;
	}
	
	public fr.irisa.triskell.kermeta.language.structure.Type getType() {
		return type;
	}
	
	public void setType(fr.irisa.triskell.kermeta.language.structure.Type type) {
		this.type = type;
	}
}
