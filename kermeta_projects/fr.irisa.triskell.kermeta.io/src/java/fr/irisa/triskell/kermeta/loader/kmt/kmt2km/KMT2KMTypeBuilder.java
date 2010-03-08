/* $Id: KMT2KMTypeBuilder.java,v 1.29 2008-04-30 13:57:29 ftanguy Exp $
 * Project : Kermeta io
 * File : KMT2KMTypeBuilder.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;



import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.modelhelper.ModelTypeHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.Basictype;
import fr.irisa.triskell.kermeta.parser.gen.ast.Functype;
import fr.irisa.triskell.kermeta.parser.gen.ast.Prodtype;
import fr.irisa.triskell.kermeta.parser.gen.ast.Type;
import fr.irisa.triskell.kermeta.parser.gen.ast.Typelst;
import fr.irisa.triskell.kermeta.parser.gen.ast.VoidType;


/**
 * @author Franck Fleurey
 */
public class KMT2KMTypeBuilder extends KMT2KMPass {
	
	public static fr.irisa.triskell.kermeta.language.structure.Type process(LoadingContext context, Type node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMTypeBuilder visitor = new KMT2KMTypeBuilder(builder, context, monitor);
		int nb_err = builder.getMessages().size();
		node.accept(visitor);
		if (visitor.result == null && builder.getMessages().size() == nb_err) {
			builder.error("Cannot resolve type '" + node.getText() + "'.");
			//builder.messages.addMessage(new KMTUnitLoadError("Cannot resolve type '" + node.getText() + "'.",node));
		}
		return visitor.result;
	}
	
	protected fr.irisa.triskell.kermeta.language.structure.Type result;
	
	/**
	 * @param builder
	 */
	public KMT2KMTypeBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
	}
	
	

	public fr.irisa.triskell.kermeta.language.structure.Type[] getTypeFromLst(Typelst node) {
		if (node == null) return new fr.irisa.triskell.kermeta.language.structure.Type[0];
		ArrayList result = new ArrayList();
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof Type && children[i] != null) {
				result.add(KMT2KMTypeBuilder.process(context, (Type)children[i], builder, monitor));
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
		TypeDefinition def = null;
		
		if ( context.current_class != null ) {
			String qualifiedName = NamedElementHelper.getQualifiedName( (NamedElement) context.current_class.eContainer() ) + "::" + qname;
			def = builder.getTypeDefinitionByQualifiedName(qualifiedName, monitor);
		}
		
		if ( def == null )
			def = builder.getTypeDefinitionByName(qname, monitor);
		
		// this can be a class, and enum or a type variable.
		
		if (def == null) {
			result = context.typeVariableLookup(qname);
			
			if (result != null && basictype.getParams() != null) {
				//builder.messages.addMessage(new KMTUnitLoadError("Unexpected type parameters for type variable '" + qname + "'.",basictype));
				builder.error("Unexpected type parameters for type variable '" + qname + "'.", basictype);
				return false;
			}
			
			// It might be relative to a model-type variable, in which case we need to build a virtual type
			if (qname.contains("::")) {
				String prefix = qname.substring(0, qname.lastIndexOf("::"));
				if ((prefix != null) && (context.typeVariableLookup(prefix) instanceof ModelTypeVariable)) {
					ModelTypeVariable mtv = (ModelTypeVariable) context.typeVariableLookup(prefix);
					String vtypename = qname.substring(qname.lastIndexOf("::")+2);
					ModelType mtdef = (ModelType) mtv.getSupertype();
					// If it already exists we just grab the existing one.
					Iterator vt_iter = (mtv).getVirtualType().iterator();
					while (vt_iter.hasNext()) {
						VirtualType v = (VirtualType) vt_iter.next();
						if (v.getName().equals(vtypename)) {
							result = v;
						}
					}
					// If there isn't already one, do some checks and then create one
					if (result == null) {
						//ClassDefinition vtclsdef = (ClassDefinition) builder.getTypeDefinitionByName(NamedElementHelper.getQualifiedName(mtdef) + "::" + vtypename);
						ClassDefinition vtclsdef = (ClassDefinition) ModelTypeHelper.getTypeDefinitionByName(mtdef, vtypename);
						if (null == vtclsdef) {
							//builder.messages.addMessage(new KMTUnitLoadError("Unable to find class '" + vtypename + "' in model type definition '" + NamedElementHelper.getQualifiedName(mtdef) + "'.",basictype));
							builder.error("Unable to find class '" + vtypename + "' in model type definition '" + NamedElementHelper.getQualifiedName(mtdef) + "'.");
							return false;
						}
						fr.irisa.triskell.kermeta.language.structure.Type[] actual_params = getTypeFromLst(basictype.getParams());
						if (actual_params.length > 0) {
							//builder.messages.addMessage(new KMTUnitLoadError("Parameterized virtual types not permitted: '" + basictype.getName().toString() + "'.", basictype));
							builder.error("Parameterized virtual types not permitted: '" + basictype.getName().toString() + "'.");
							return false;
						}
						VirtualType virt = StructureFactory.eINSTANCE.createVirtualType();
						virt.setName(vtypename);
						virt.setClassDefinition(vtclsdef);
						virt.setModelType(mtv);
						builder.storeTrace(virt, basictype);
						result = virt;
					}
				}
			}
			
			
			// If result is null here, then the type is unresolved
			
			if(result == null) {
				//builder.messages.addMessage(new KMTUnitLoadError("Unresolved type '" + qname + "'. (missing using ?)",basictype));
				builder.error("Unresolved type '" + qname + "'. (missing using ?)", basictype);
				return false;
			}
			
		}
		else if (def instanceof Enumeration || def instanceof PrimitiveType) {
			result = (fr.irisa.triskell.kermeta.language.structure.Type)def;
			if (basictype.getParams() != null) {
				//builder.messages.addMessage(new KMTUnitLoadError("Unexpected type parameters for enumeration or primitive type'" + qname + "'.",basictype));
				builder.error("Unexpected type parameters for enumeration or primitive type'" + NamedElementHelper.getQualifiedName(def) + "'.", basictype);
				return false;
			}
		}
		else if (def instanceof ModelType) {
			result = (fr.irisa.triskell.kermeta.language.structure.Type)def;
			if (basictype.getParams() != null) {
				//builder.messages.addMessage(new KMTUnitLoadError("Unexpected type parameters for model type'" + qname + "'.",basictype));
				builder.error("Unexpected type parameters for model type'" + qname + "'.", basictype);
				return false;
			}
		}
		else if (def instanceof GenericTypeDefinition) {
			GenericTypeDefinition gtdef = (GenericTypeDefinition) def;
			ParameterizedType res = null;
			if (gtdef instanceof ClassDefinition) {
				res = StructureFactory.eINSTANCE.createClass();
			}
			builder.storeTrace(res, basictype);
			result = res;
			res.setTypeDefinition(gtdef);
			//res.setFName(classdef.getFName());
			fr.irisa.triskell.kermeta.language.structure.Type[] actual_params = getTypeFromLst(basictype.getParams());
			if (actual_params.length != gtdef.getTypeParameter().size()) {
				//builder.messages.addMessage(new KMTUnitLoadError("Wrong number of type parameters for generic type '" + qname + "'.",basictype));
				builder.error("Wrong number of type parameters for generic type '" + qname + "'.", basictype);
			}
			else {
				for(int i=0; i<actual_params.length; i++) {

					
					/*
					//Check whether actual type params conform to any supertype constraints on the type variable declaration
					TypeVariable var = (TypeVariable) gtdef.getTypeParameter().get(i);
					fr.irisa.triskell.kermeta.language.structure.Type required = var.getSupertype();
					fr.irisa.triskell.kermeta.language.structure.Type provided = actual_params[i];
					if (null != required) {
						//This smells like a hack. Need to initialize the type checker context
						TypeCheckerContext.initializeTypeChecker(StdLibKermetaUnitHelper.getKermetaUnit());
						if (var instanceof ObjectTypeVariable) {
							if (!TypeConformanceChecker.conforms(required, provided)) {
								builder.messages.addMessage(new KMTUnitLoadError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".",basictype));
							}
						} else if (var instanceof ModelTypeVariable) {
							if (provided instanceof ModelType) {
								TypeMatchChecker matcher = new TypeMatchChecker((ModelType) required, (ModelType) provided);
								boolean match = matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
								if (!match) {
									builder.messages.addMessage(new KMTUnitLoadError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".",basictype));
									for(TypeDoesNotMatchError err : matcher.getErrors()) {
										builder.messages.addMessage(new KMTUnitLoadError(err.getMessage(),basictype));
									}
								} else {
									//TODO Populate static bindings somehow to bind each required::virtual to its match
									for (fr.irisa.triskell.kermeta.language.structure.Class e : matcher.getResultMatch().keySet()) {
										//Find (or more probably create) the virtual type corresponding to the class
										//Find (or more probably create) the virtual type corresponding to the class
										VirtualType vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) var, (ClassDefinition) e.getTypeDefinition());
										//Now create a binding
										TypeVariableBinding new_tvb = builder.struct_factory.createTypeVariableBinding();
										new_tvb.setVariable(vt);
										new_tvb.setType(matcher.getResultMatch().get(e));
										res.getVirtualTypeBinding().add(new_tvb);
									}
								}
							} else if (provided instanceof ModelTypeVariable) {
								TypeMatchChecker matcher = new TypeMatchChecker((ModelType) required, (ModelType) ((ModelTypeVariable) provided).getSupertype());
								//match = TypeMatchChecker.match((ModelType) required, (ModelType) ((ModelTypeVariable) provided).getSupertype(), new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
								boolean match = matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
								if (!match) {
									builder.messages.addMessage(new KMTUnitLoadError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".",basictype));
									for(TypeDoesNotMatchError err : matcher.getErrors()) {
										builder.messages.addMessage(new KMTUnitLoadError(err.getMessage(),basictype));
									}
								} else {
									//TODO Populate static bindings somehow to bind each required::virtual to its match
									for (fr.irisa.triskell.kermeta.language.structure.Class e : matcher.getResultMatch().keySet()) {
										//Find (or more probably create) the virtual type corresponding to the class
										VirtualType vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) var, (ClassDefinition) e.getTypeDefinition());
										//The provided is also an MTV, so we need to convert its classes back to Virtual Types, too
										VirtualType target_vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) provided, (ClassDefinition) matcher.getResultMatch().get(e).getTypeDefinition());
										//Now create a binding
										TypeVariableBinding new_tvb = builder.struct_factory.createTypeVariableBinding();
										new_tvb.setVariable(vt);
										new_tvb.setType(target_vt);
										res.getVirtualTypeBinding().add(new_tvb);
									}
								}
							} else {
								builder.messages.addMessage(new KMTUnitLoadError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".",basictype));
							}
						}
					}
					*/
										
					TypeVariableBinding bind = StructureFactory.eINSTANCE.createTypeVariableBinding();
					bind.setVariable((TypeVariable)gtdef.getTypeParameter().get(i));
					bind.setType(actual_params[i]);
					if ( actual_params[i] instanceof fr.irisa.triskell.kermeta.language.structure.Class )
						bind.getContainedType().add( actual_params[i] );
					
					res.getTypeParamBinding().add(bind);
				}
			}
		} else {
			//Its something unknown
			//builder.messages.addMessage(new KMTUnitLoadError("Unrecognized type definition: '" + qname + "'",basictype));
			builder.error("Unrecognized type definition: '" + qname + "'");
		}
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Functype)
	 */
	public boolean beginVisit(Functype functype) {
		fr.irisa.triskell.kermeta.language.structure.FunctionType res = StructureFactory.eINSTANCE.createFunctionType();
		builder.storeTrace(res, functype);
		res.setLeft(KMT2KMTypeBuilder.process(context, functype.getLeft(), builder, monitor));
		res.setRight(KMT2KMTypeBuilder.process(context, functype.getRight(), builder, monitor));
		if (res.getLeft() == null || res.getRight() == null) return false;
		result = res;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Prodtype)
	 */
	public boolean beginVisit(Prodtype prodtype) {
		fr.irisa.triskell.kermeta.language.structure.ProductType res = StructureFactory.eINSTANCE.createProductType();
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
		fr.irisa.triskell.kermeta.language.structure.VoidType res = StructureFactory.eINSTANCE.createVoidType();
		builder.storeTrace(res, voidType);
		result = res;
		return false;
	}
	
}
