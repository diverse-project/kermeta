/* $Id: TypeVirtualizer.java,v 1.8 2008-04-28 11:50:11 ftanguy Exp $
* Project : Kermeta io
* File : TypeVirtualizer.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 Nov. 2006
* Authors : 
*		Jim Steel
*/ 
/**
 * 
 */
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author jsteel
 * Given a type (importantly including composites like function types), virtualize
 * it with respect to a given virtual type.
 */
public class TypeVirtualizer extends KermetaOptimizedVisitor {

	private ModelTypeVariable modeltype_context;
	protected StructureFactory struct_factory;
	
	/**
	 * Default constructor
	 */
	public TypeVirtualizer(ModelTypeVariable mtc) {
		super();
		modeltype_context = mtc;
		struct_factory = StructurePackageImpl.init().getStructureFactory();
	}

	public static Type virtualizeOperationType(CallableOperation op, VirtualType vt) {
		TypeVirtualizer visitor = new TypeVirtualizer(vt.getModelType());
		return new SimpleType((fr.irisa.triskell.kermeta.language.structure.Type) visitor.accept(op.getType().getFType()));
	}
	
	public static Type virtualizePropertyType(CallableProperty prop, VirtualType vt) {
		TypeVirtualizer visitor = new TypeVirtualizer(vt.getModelType());
		return new SimpleType((fr.irisa.triskell.kermeta.language.structure.Type) visitor.accept(prop.getType().getFType()));
	}
	
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class cls) {
		//Find the virtualType corresponding to the class definition
		//For the moment, ignore its type vars. If there is no classdef in the
		//modeltypedef, then leave it as a class
		fr.irisa.triskell.kermeta.language.structure.Type res = null;
		ClassDefinition cdef = (ClassDefinition) cls.getTypeDefinition();
		Iterator<VirtualType> iterVT = modeltype_context.getVirtualType().iterator();
		while (iterVT.hasNext()) {
			VirtualType virt = iterVT.next();
			if (virt.getClassDefinition().equals(cdef)) {
				res = virt;
			}
		}
		if (res == null) {
			ModelType mtdef = null;
			// There is not yet a virtual type. Does there need to be?
			if (modeltype_context instanceof ModelTypeVariable) {
				mtdef = (ModelType) ((ModelTypeVariable) modeltype_context).getSupertype();
			} else if (modeltype_context instanceof ModelType) {
				mtdef = (ModelType) modeltype_context;
			}
			if (mtdef.getIncludedTypeDefinition().contains(cdef)) {
				//Need to create a virtual type
				VirtualType newVirt = struct_factory.createVirtualType();
				newVirt.setName(cdef.getName());
				newVirt.setClassDefinition(cdef);
				modeltype_context.getVirtualType().add(newVirt);
				//parameterized virtual types
				Iterator<TypeVariableBinding> iter = cls.getTypeParamBinding().iterator();
				while (iter.hasNext()) {
					TypeVariableBinding old_tvb = iter.next();
					TypeVariableBinding new_tvb = struct_factory.createTypeVariableBinding();
					new_tvb.setVariable(old_tvb.getVariable());
					new_tvb.setType((fr.irisa.triskell.kermeta.language.structure.Type) this.accept(old_tvb.getType()));
					newVirt.getTypeParamBinding().add(new_tvb);
				}
				res = newVirt;
			} else {
				// If the class isn't in the model type, leave it, and its unparameterized, leave it
				if (cls.getTypeParamBinding().size() == 0) {
					res = cls;
				} else {
					//We may need to fix up the type parameters
					// e.g. Set<Class> -> Set<VirtualType>
					fr.irisa.triskell.kermeta.language.structure.Class newcls = struct_factory.createClass();
					newcls.setTypeDefinition(cls.getTypeDefinition());
					Iterator<TypeVariableBinding> iter = cls.getTypeParamBinding().iterator();
					while (iter.hasNext()) {
						TypeVariableBinding old_tvb = iter.next();
						TypeVariableBinding new_tvb = struct_factory.createTypeVariableBinding();
						new_tvb.setVariable(old_tvb.getVariable());
						new_tvb.setType((fr.irisa.triskell.kermeta.language.structure.Type) this.accept(old_tvb.getType()));
						newcls.getTypeParamBinding().add(new_tvb);
					}
					res = newcls;
				}
			}
		}
		return res;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFunctionType(fr.irisa.triskell.kermeta.language.structure.FunctionType)
	 */
	@Override
	public Object visitFunctionType(FunctionType node) {
		// TODO Auto-generated method stub
		FunctionType new_ft = struct_factory.createFunctionType();
		new_ft.setLeft((fr.irisa.triskell.kermeta.language.structure.Type) this.accept(node.getLeft()));
		new_ft.setRight((fr.irisa.triskell.kermeta.language.structure.Type) this.accept(node.getRight()));
		return new_ft;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitModelType(fr.irisa.triskell.kermeta.language.structure.ModelType)
	 */
	@Override
	public Object visitModelType(ModelType node) {
		// TODO This should never happen, right?
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitModelTypeVariable(fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable)
	 */
	
	public Object visitModelTypeVariable(ModelTypeVariable node) {
		// TODO Auto-generated method stub
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitObjectTypeVariable(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable)
	 */
	
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		// TODO Auto-generated method stub
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPrimitiveType(fr.irisa.triskell.kermeta.language.structure.PrimitiveType)
	 */
	@Override
	public Object visitPrimitiveType(PrimitiveType node) {
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProductType(fr.irisa.triskell.kermeta.language.structure.ProductType)
	 */
	@Override
	public Object visitProductType(ProductType node) {
		ProductType new_pt = struct_factory.createProductType();
		Iterator<fr.irisa.triskell.kermeta.language.structure.Type> iter = node.getType().iterator();
		while (iter.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Type arg = iter.next();
			new_pt.getType().add((fr.irisa.triskell.kermeta.language.structure.Type) this.accept(arg));
		}
		return new_pt;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitVirtualType(fr.irisa.triskell.kermeta.language.structure.VirtualType)
	 */
	
	public Object visitVirtualType(VirtualType node) {
		// TODO Can we leave this to be resolved by the inferrer?
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitVoidType(fr.irisa.triskell.kermeta.language.structure.VoidType)
	 */
	@Override
	public Object visitVoidType(VoidType node) {
		return node;
	}
	

}
