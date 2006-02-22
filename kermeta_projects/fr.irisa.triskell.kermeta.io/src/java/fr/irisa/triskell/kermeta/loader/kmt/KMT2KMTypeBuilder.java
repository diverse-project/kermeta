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
import fr.irisa.triskell.kermeta.ast.Type;
import fr.irisa.triskell.kermeta.ast.Typelst;
import fr.irisa.triskell.kermeta.ast.VoidType;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FModelType;
import fr.irisa.triskell.kermeta.structure.FModelTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
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
		int nb_err = builder.messages.getErrors().size();
		node.accept(visitor);
		if (visitor.result == null && builder.messages.getErrors().size() == nb_err) {
			builder.messages.addMessage(new KMTUnitLoadError("Cannot resolve type '" + node.getText() + "'.",node));
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
				builder.messages.addMessage(new KMTUnitLoadError("Unexpected type parameters for type variable '" + qname + "'.",basictype));
				return false;
			}
			
			// If result is null here, then the type is unresolved
			
			if(result == null) {
				builder.messages.addMessage(new KMTUnitLoadError("Unresolved type '" + qname + "'.",basictype));
				return false;
			}
			
		}
		else if (def instanceof FEnumeration || def instanceof FPrimitiveType) {
			result = (FType)def;
			if (basictype.getParams() != null) {
				builder.messages.addMessage(new KMTUnitLoadError("Unexpected type parameters for enumeration or primitive type'" + qname + "'.",basictype));
				return false;
			}
		}
		else if (def instanceof FClassDefinition) { // it is a class
			FClassDefinition classdef = (FClassDefinition)def;
			FClass res = builder.struct_factory.createFClass();
			builder.storeTrace(res, basictype);
			result = res;
			res.setFTypeDefinition(classdef);
			//res.setFName(classdef.getFName());
			FType[] actual_params = getTypeFromLst(basictype.getParams());
			if (actual_params.length != classdef.getFTypeParameter().size()) {
				builder.messages.addMessage(new KMTUnitLoadError("Wrong number of type parameters for class '" + qname + "'.",basictype));
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
		} else if (def instanceof FModelTypeDefinition){ //it is a model type
			// For the moment, this is identical to the code for class
			FModelTypeDefinition mtypedef = (FModelTypeDefinition) def;
			FModelType res = builder.struct_factory.createFModelType();
			builder.storeTrace(res, basictype);
			result  = res;
			res.setFTypeDefinition(mtypedef);
			FType[] actual_params = getTypeFromLst(basictype.getParams());
			if (actual_params.length != mtypedef.getFTypeParameter().size()) {
				builder.messages.addMessage(new KMTUnitLoadError("Wrong number of type parameters for model type '" + qname + "'.",basictype));
			} else {
				for(int i=0; i<actual_params.length; i++) {
					FTypeVariableBinding bind = builder.struct_factory.createFTypeVariableBinding();
					bind.setFVariable((FTypeVariable) mtypedef.getFTypeParameter().get(i));
					bind.setFType(actual_params[i]);
					res.getFTypeParamBinding().add(bind);
				}
			}
		} else {
			//Its something unknown
			builder.messages.addMessage(new KMTUnitLoadError("Unrecognized type definition: '" + qname + "'",basictype));
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
		
		// BUG : The same type cannot be added twice in res.getFType().... no idea why...
		if(lst.length != res.getFType().size()) {
		    throw new Error("THIS IS A BUG OF THE ECORE MODEL OF KERMETA PROGRAM (see class KMT2KMTypeBuilder)");
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
	
}
