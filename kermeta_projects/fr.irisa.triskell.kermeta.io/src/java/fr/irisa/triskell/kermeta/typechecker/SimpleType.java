/* $Id: SimpleType.java,v 1.12 2007-03-01 10:34:01 dtouzet Exp $
* Project : Kermeta (First iteration)
* File : SimpleType.java
* License : GPL
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

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.language.structure.impl.PrimitiveTypeImpl;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class SimpleType extends Type {

	/**
	 * The corresponding fr.irisa.triskell.kermeta.language.structure.Type
	 */
	protected fr.irisa.triskell.kermeta.language.structure.Type type;
	private boolean isSemanticallyAbstract;
	
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
		
		this.setIsSemanticallyAbstract();
	}
	

	public void setIsSemanticallyAbstract()
	{
		// If type is linked to a class definition and if it is semantically abstract
		isSemanticallyAbstract = true;
		TypeDefinition typedef = getTypeDefinition();
		if (typedef!=null && typedef instanceof ClassDefinition)
			isSemanticallyAbstract = ClassDefinitionHelper.isSemanticallyAbstract((ClassDefinition)typedef);
	}
	public String getSemanticallyAbstractCause(){
		if(isSemanticallyAbstract == true){
			TypeDefinition typedef = getTypeDefinition();
			if (typedef!=null && typedef instanceof ClassDefinition)
				return ClassDefinitionHelper.getSemanticallyAbstractCause((ClassDefinition)typedef);
			else
				return "";
		}
		else return "";
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
	
	public ArrayList<CallableOperation> callableOperations() {
		// Try to get a FClass
		fr.irisa.triskell.kermeta.language.structure.Type resolved = PrimitiveTypeResolver.getResolvedType(type);
		if (resolved instanceof VirtualType) {
//			Temporary class just for the purposes of inheritance searching
			//TODO This is a nasty, evil, dirty hack, and probably a memory leak
			VirtualType virt = (VirtualType) resolved;
			StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
			fr.irisa.triskell.kermeta.language.structure.Class tmp_cls = struct_factory.createClass();
			tmp_cls.setTypeDefinition(virt.getClassDefinition());
			Iterator bindings = virt.getTypeParamBinding().iterator();
			while (bindings.hasNext()) {
				TypeVariableBinding old_tvb = (TypeVariableBinding) bindings.next();
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
			return InheritanceSearch.callableOperations((fr.irisa.triskell.kermeta.language.structure.Class)resolved);
		} else if (resolved instanceof ModelType) {
			ArrayList<CallableOperation> result = new ArrayList<CallableOperation>();
			fr.irisa.triskell.kermeta.language.structure.Class model = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ModelType).type;
			result = InheritanceSearch.callableOperations(model);
			return result;
		}
		else if(resolved instanceof fr.irisa.triskell.kermeta.language.structure.FunctionType) {
			return InheritanceSearch.callableOperations((fr.irisa.triskell.kermeta.language.structure.FunctionType)resolved);
		}
		else {
			return new ArrayList<CallableOperation>();
		}
	}
	public ArrayList<CallableProperty> callableProperties() {
		// Try to get a FClass
		fr.irisa.triskell.kermeta.language.structure.Type resolved = PrimitiveTypeResolver.getResolvedType(type);
		if (resolved instanceof VirtualType) {
//			Temporary class just for the purposes of inheritance searching
			//TODO This is a nasty, evil, dirty hack, and probably a memory leak
			VirtualType virt = (VirtualType) resolved;
			StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
			fr.irisa.triskell.kermeta.language.structure.Class tmp_cls = struct_factory.createClass();
			tmp_cls.setTypeDefinition(virt.getClassDefinition());
			Iterator bindings = virt.getTypeParamBinding().iterator();
			while (bindings.hasNext()) {
				TypeVariableBinding old_tvb = (TypeVariableBinding) bindings.next();
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
			return InheritanceSearch.callableProperties((fr.irisa.triskell.kermeta.language.structure.Class)resolved);
		} else if (resolved instanceof ModelType) {
			ArrayList<CallableProperty> result = new ArrayList<CallableProperty>();
			fr.irisa.triskell.kermeta.language.structure.Class model = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ModelType).type;
			result = InheritanceSearch.callableProperties(model);
			return result;
		}
		else {
			return new ArrayList<CallableProperty>();
		}
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
	
	public boolean isSemanticallyAbstract() {
		return isSemanticallyAbstract;
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
