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
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
//import fr.irisa.triskell.kermeta.language.structure.FFunctionType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
//import fr.irisa.triskell.kermeta.language.structure.FProductType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
//import fr.irisa.triskell.kermeta.language.structure.FVoidType;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMT2KMTypeBuilder extends KMT2KMPass {
	
	public static fr.irisa.triskell.kermeta.language.structure.Type process(Type node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMTypeBuilder visitor = new KMT2KMTypeBuilder(builder);
		int nb_err = builder.messages.getErrors().size();
		node.accept(visitor);
		if (visitor.result == null && builder.messages.getErrors().size() == nb_err) {
			builder.messages.addMessage(new KMTUnitLoadError("Cannot resolve type '" + node.getText() + "'.",node));
		}
		return visitor.result;
	}
	
	protected fr.irisa.triskell.kermeta.language.structure.Type result;
	
	/**
	 * @param builder
	 */
	public KMT2KMTypeBuilder(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	
	

	public fr.irisa.triskell.kermeta.language.structure.Type[] getTypeFromLst(Typelst node) {
		if (node == null) return new fr.irisa.triskell.kermeta.language.structure.Type[0];
		ArrayList result = new ArrayList();
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof Type && children[i] != null) {
				result.add(KMT2KMTypeBuilder.process((Type)children[i], builder));
			}
		}
		fr.irisa.triskell.kermeta.language.structure.Type[] res = new fr.irisa.triskell.kermeta.language.structure.Type[result.size()];
		result.toArray(res);
		return res;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Basictype)
	 */
	public boolean beginVisit(Basictype basictype) {
		String qname = qualifiedIDAsString(basictype.getName());
		// this can be a class, and enum or a type variable.
		TypeDefinition def = builder.getTypeDefinitionByName(qname);
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
		else if (def instanceof Enumeration || def instanceof PrimitiveType) {
			result = (fr.irisa.triskell.kermeta.language.structure.Type)def;
			if (basictype.getParams() != null) {
				builder.messages.addMessage(new KMTUnitLoadError("Unexpected type parameters for enumeration or primitive type'" + qname + "'.",basictype));
				return false;
			}
		}
		else if (def instanceof ClassDefinition){ // it is a class
			ClassDefinition classdef = (ClassDefinition)def;
			fr.irisa.triskell.kermeta.language.structure.Class res = builder.struct_factory.createClass();
			builder.storeTrace(res, basictype);
			result = res;
			res.setTypeDefinition(classdef);
			//res.setFName(classdef.getFName());
			fr.irisa.triskell.kermeta.language.structure.Type[] actual_params = getTypeFromLst(basictype.getParams());
			if (actual_params.length != classdef.getTypeParameter().size()) {
				builder.messages.addMessage(new KMTUnitLoadError("Wrong number of type parameters for class '" + qname + "'.",basictype));
			}
			else {
				for(int i=0; i<actual_params.length; i++) {
					TypeVariableBinding bind = builder.struct_factory.createTypeVariableBinding();
					//builder.trace.put(bind, basictype); IT SHOULD BE basictype.getParams().chils[xxx] ...
					bind.setVariable((TypeVariable)classdef.getTypeParameter().get(i));
					bind.setType(actual_params[i]);
					res.getTypeParamBinding().add(bind);
				}
			}
		} else if (def instanceof ModelTypeDefinition){ //it is a model type
			// For the moment, this is identical to the code for class
			ModelTypeDefinition mtypedef = (ModelTypeDefinition) def;
			ModelType res = builder.struct_factory.createModelType();
			builder.storeTrace(res, basictype);
			result  = res;
			res.setTypeDefinition(mtypedef);
			fr.irisa.triskell.kermeta.language.structure.Type[] actual_params = getTypeFromLst(basictype.getParams());
			if (actual_params.length != mtypedef.getTypeParameter().size()) {
				builder.messages.addMessage(new KMTUnitLoadError("Wrong number of type parameters for model type '" + qname + "'.",basictype));
			} else {
				for(int i=0; i<actual_params.length; i++) {
					TypeVariableBinding bind = builder.struct_factory.createTypeVariableBinding();
					bind.setVariable((TypeVariable) mtypedef.getTypeParameter().get(i));
					bind.setType(actual_params[i]);
					res.getTypeParamBinding().add(bind);
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
		fr.irisa.triskell.kermeta.language.structure.FunctionType res = builder.struct_factory.createFunctionType();
		builder.storeTrace(res, functype);
		res.setLeft(KMT2KMTypeBuilder.process(functype.getLeft(), builder));
		res.setRight(KMT2KMTypeBuilder.process(functype.getRight(), builder));
		if (res.getLeft() == null || res.getRight() == null) return false;
		result = res;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Prodtype)
	 */
	public boolean beginVisit(Prodtype prodtype) {
		fr.irisa.triskell.kermeta.language.structure.ProductType res = builder.struct_factory.createProductType();
		builder.storeTrace(res, prodtype);
		fr.irisa.triskell.kermeta.language.structure.Type[] lst = getTypeFromLst(prodtype.getTypelst());
		for(int i=0; i<lst.length; i++) {
			if (lst[i] == null) return false;
			res.getType().add(lst[i]);
		}
		
		// BUG : The same type cannot be added twice in res.getFType().... no idea why...
		if(lst.length != res.getType().size()) {
		    throw new Error("THIS IS A BUG OF THE ECORE MODEL OF KERMETA PROGRAM (see class KMT2KMTypeBuilder)");
		}
		result = res;
		return false;
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.VoidType)
	 */
	public boolean beginVisit(VoidType voidType) {
		fr.irisa.triskell.kermeta.language.structure.VoidType res = builder.struct_factory.createVoidType();
		builder.storeTrace(res, voidType);
		result = res;
		return false;
	}
	
}
