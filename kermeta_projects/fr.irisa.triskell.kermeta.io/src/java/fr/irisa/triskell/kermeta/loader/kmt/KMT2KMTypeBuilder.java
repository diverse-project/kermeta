/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.ArrayList;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.Basictype;
import fr.irisa.triskell.kermeta.ast.Functype;
import fr.irisa.triskell.kermeta.ast.Prodtype;
import fr.irisa.triskell.kermeta.ast.Selftype;
import fr.irisa.triskell.kermeta.ast.Type;
import fr.irisa.triskell.kermeta.ast.Typelst;
import fr.irisa.triskell.kermeta.ast.VoidType;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FSelfType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMT2KMTypeBuilder extends KMT2KMPass {
	
	public static FType process(Type node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMTypeBuilder visitor = new KMT2KMTypeBuilder(builder);
		int nb_err = builder.error.size();
		node.accept(visitor);
		if (visitor.result == null && builder.error.size() == nb_err) {
			builder.error.add(new KMUnitError("Cannot resolve type '" + node.getText() + "'.",node));
		}
		return visitor.result;
	}
	
	protected FType result;
	
	/**
	 * @param builder
	 */
	public KMT2KMTypeBuilder(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	
	

	public FType[] getTypeFromLst(Typelst node) {
		if (node == null) return new FType[0];
		ArrayList result = new ArrayList();
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof Type && children[i] != null) {
				result.add(KMT2KMTypeBuilder.process((Type)children[i], builder));
			}
		}
		FType[] res = new FType[result.size()];
		result.toArray(res);
		return res;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Basictype)
	 */
	public boolean beginVisit(Basictype basictype) {
		String qname = qualifiedIDAsString(basictype.getName());
		// this can be a class, and enum or a type variable.
		FTypeDefinition def = builder.getTypeDefinitionByName(qname);
		if (def == null) {
			result = builder.typeVariableLookup(qname);
			
			if (result != null && basictype.getParams() != null) {
				builder.error.add(new KMUnitError("Unexpected type parameters for type variable '" + qname + "'.",basictype));
				return false;
			}
			
			// If result is null here, then the type is unresolved
			
			if(result == null) {
				builder.error.add(new KMUnitError("Unresolved type '" + qname + "'.",basictype));
				return false;
			}
			
		}
		else if (def instanceof FEnumeration || def instanceof FPrimitiveType) {
			result = (FType)def;
			if (basictype.getParams() != null) {
				builder.error.add(new KMUnitError("Unexpected type parameters for enumeration or primitive type'" + qname + "'.",basictype));
				return false;
			}
		}
		else { // it is a class
			FClassDefinition classdef = (FClassDefinition)def;
			FClass res = builder.struct_factory.createFClass();
			builder.storeTrace(res, basictype);
			result = res;
			res.setFClassDefinition(classdef);
			res.setFName(classdef.getFName());
			FType[] actual_params = getTypeFromLst(basictype.getParams());
			if (actual_params.length != classdef.getFTypeParameter().size()) {
				builder.error.add(new KMUnitError("Wrong number of type parameter for class '" + qname + "'.",basictype));
			}
			else {
				for(int i=0; i<actual_params.length; i++) {
					FTypeVariableBinding bind = builder.struct_factory.createFTypeVariableBinding();
					//builder.trace.put(bind, basictype); IT SHOULD BE basictype.getParams().chils[xxx] ...
					bind.setFVariable((FTypeVariable)classdef.getFTypeParameter().get(i));
					bind.setFType(actual_params[i]);
					res.getFTypeParamBinding().add(bind);
				}
			}
		}
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Functype)
	 */
	public boolean beginVisit(Functype functype) {
		FFunctionType res = builder.struct_factory.createFFunctionType();
		builder.storeTrace(res, functype);
		res.setFLeft(KMT2KMTypeBuilder.process(functype.getLeft(), builder));
		res.setFRight(KMT2KMTypeBuilder.process(functype.getRight(), builder));
		if (res.getFLeft() == null || res.getFRight() == null) return false;
		result = res;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Prodtype)
	 */
	public boolean beginVisit(Prodtype prodtype) {
		FProductType res = builder.struct_factory.createFProductType();
		builder.storeTrace(res, prodtype);
		FType[] lst = getTypeFromLst(prodtype.getTypelst());
		for(int i=0; i<lst.length; i++) {
			if (lst[i] == null) return false;
			res.getFType().add(lst[i]);
		}
		result = res;
		return false;
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.VoidType)
	 */
	public boolean beginVisit(VoidType voidType) {
		FVoidType res = builder.struct_factory.createFVoidType();
		builder.storeTrace(res, voidType);
		result = res;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Selftype)
	 */
	public boolean beginVisit(Selftype selftype) {
		FSelfType res = builder.struct_factory.createFSelfType();
		builder.storeTrace(res, selftype);
		result = res;
		return false;
	}
}
