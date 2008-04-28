/* $Id: ParameterizedTypeChecker.java,v 1.11 2008-04-28 11:50:10 ftanguy Exp $
 * Project : Kermeta io
 * File : ParametrizedTypeChecker.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 Oct. 2006
 * Authors : 
 * 		Jim Steel
 */ 
package fr.irisa.triskell.kermeta.typechecker;


import java.util.Hashtable;
import java.util.Iterator;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.modelhelper.ModelTypeVariableHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
/**
 * This module checks whether the actual types passed as type parameters are legitimate with respect to the
 * requirements made by the supertype constraint on the type variable being bound. For object type variables,
 * this means subtyping; for model types it means type matching.
 * @author jsteel
 *
 */
public class ParameterizedTypeChecker extends KermetaOptimizedVisitor {
	
	/**
	 * 
	 * @param t
	 * @param unit
	 * @param context
	 * @param codeContext
	 */
	public static void checkType(fr.irisa.triskell.kermeta.language.structure.Type t, KermetaUnit unit, TypeCheckerContext context, fr.irisa.triskell.kermeta.language.structure.Object codeContext) {
		ParameterizedTypeChecker checker = new ParameterizedTypeChecker(unit, context, codeContext);
		checker.accept(t);
	}
	
	/*public static void checkType(fr.irisa.triskell.kermeta.language.structure.Type t, KermetaUnit unit, TypeCheckerContext context, fr.irisa.triskell.kermeta.language.structure.Object codeContext, IProgressMonitor monitor) {
		if ( monitor.isCanceled() )
			return;
		ParameterizedTypeChecker checker = new ParameterizedTypeChecker(unit, context, codeContext);
		checker.accept(t);
	}*/
	
	private KermetaUnit unit;

	private fr.irisa.triskell.kermeta.language.structure.Object codeContext; // this one is usefull in order to retreive the expression that use this type. allows to report the error at the right place
	
	public ParameterizedTypeChecker(KermetaUnit unit, TypeCheckerContext context, fr.irisa.triskell.kermeta.language.structure.Object codeContext) {
		super();
		this.unit = unit;
		this.codeContext = codeContext;
	}

	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
		if (arg0.getTypeParamBinding().isEmpty()) {
			return new Boolean(false);
		}
		Iterator<TypeVariableBinding> tvb_iter = arg0.getTypeParamBinding().iterator();
		while (tvb_iter.hasNext()) {
			TypeVariableBinding current_tvb = (TypeVariableBinding) tvb_iter.next();
			fr.irisa.triskell.kermeta.language.structure.Type provided = current_tvb.getType();
			//First descend into the actual type parameters to see whether they might have any problems
			this.accept(provided);
			//Check whether actual type params conform to any supertype constraints on the type variable declaration
			TypeVariable var = current_tvb.getVariable();
			fr.irisa.triskell.kermeta.language.structure.Type required = var.getSupertype();
			if (null != required) {
				//This smells like a hack. Need to initialize the type checker context
				//TypeCheckerContext.initializeTypeChecker(StdLibKermetaUnitHelper.getKermetaUnit());
				if (var instanceof ObjectTypeVariable) {
					if (!TypeConformanceChecker.conforms(required, provided)) {
						unit.error("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".", codeContext);
					}
				} else if (var instanceof ModelTypeVariable) {
					if (provided instanceof ModelType) {
						TypeMatchChecker matcher = new TypeMatchChecker((ModelType) required, (ModelType) provided);
						boolean match = matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
						if (!match) {
							matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
							String msg = "Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".";
							if(matcher.getErrors().size() > 0){
								msg += "\n   " + matcher.getErrors().get(0).getMessage();
							}
							unit.error(msg, codeContext);
						} else {
							//TODO Populate static bindings somehow to bind each required::virtual to its match
							for (fr.irisa.triskell.kermeta.language.structure.Class e : matcher.getResultMatch().keySet()) {
								//Find (or more probably create) the virtual type corresponding to the class
								VirtualType vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) var, (ClassDefinition) e.getTypeDefinition());
								//Now create a binding
								TypeVariableBinding new_tvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
								new_tvb.setVariable(vt);
								new_tvb.setType(matcher.getResultMatch().get(e));
								arg0.getVirtualTypeBinding().add(new_tvb);
							}
						}
					} else if (provided instanceof ModelTypeVariable) {
						TypeMatchChecker matcher = new TypeMatchChecker((ModelType) required, (ModelType) ((ModelTypeVariable) provided).getSupertype());
						//match = TypeMatchChecker.match((ModelType) required, (ModelType) ((ModelTypeVariable) provided).getSupertype(), new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
						boolean match = matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
						if (!match) {
							String msg = "Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".";
							if(matcher.getErrors().size() > 0){
								msg += "\n   " + matcher.getErrors().get(0).getMessage();
							}
							unit.error(msg, codeContext);
						} else {
							//TODO Populate static bindings somehow to bind each required::virtual to its match
							for (fr.irisa.triskell.kermeta.language.structure.Class e : matcher.getResultMatch().keySet()) {
								//Find (or more probably create) the virtual type corresponding to the class
								VirtualType vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) var, (ClassDefinition) e.getTypeDefinition());
								//The provided is also an MTV, so we need to convert its classes back to Virtual Types, too
								VirtualType target_vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) provided, (ClassDefinition) matcher.getResultMatch().get(e).getTypeDefinition());
								//Now create a binding
								TypeVariableBinding new_tvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
								new_tvb.setVariable(vt);
								new_tvb.setType(target_vt);
								arg0.getVirtualTypeBinding().add(new_tvb);
							}
						}
					} else {
						unit.error("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".", codeContext);
					}
				}
			}
		}
		return new Boolean(false);
	}
	
//	public Object visitModelType(fr.irisa.triskell.kermeta.language.structure.ModelType arg0) {
//		if (arg0.getTypeParamBinding().isEmpty()) {
//			return new Boolean(false);
//		}
//		Iterator tvb_iter = arg0.getTypeParamBinding().iterator();
//		while (tvb_iter.hasNext()) {
//			TypeVariableBinding current_tvb = (TypeVariableBinding) tvb_iter.next();
//			fr.irisa.triskell.kermeta.language.structure.Type provided = current_tvb.getType();
//			//First descend into the actual type parameters to see whether they might have any problems
//			this.accept(provided);
//			//Check whether actual type params conform to any supertype constraints on the type variable declaration
//			TypeVariable var = current_tvb.getVariable();
//			fr.irisa.triskell.kermeta.language.structure.Type required = var.getSupertype();
//			if (null != required) {
//				//This smells like a hack. Need to initialize the type checker context
//				//TypeCheckerContext.initializeTypeChecker(StdLibKermetaUnitHelper.getKermetaUnit());
//				if (var instanceof ObjectTypeVariable) {
//					if (!TypeConformanceChecker.conforms(required, provided)) {
//						unit.messages.addError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".", codeContext);
//					}
//				} else if (var instanceof ModelTypeVariable) {
//					if (provided instanceof ModelType) {
//						TypeMatchChecker matcher = new TypeMatchChecker((ModelType) required, (ModelType) provided);
//						boolean match = matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
//						if (!match) {
//							unit.messages.addError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".", codeContext);
//						} else {
//							//TODO Populate static bindings somehow to bind each required::virtual to its match
//							for (fr.irisa.triskell.kermeta.language.structure.Class e : matcher.getResultMatch().keySet()) {
//								//Find (or more probably create) the virtual type corresponding to the class
//								VirtualType vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) var, (ClassDefinition) e.getTypeDefinition());
//								//Now create a binding
//								TypeVariableBinding new_tvb = struct_factory.createTypeVariableBinding();
//								new_tvb.setVariable(vt);
//								new_tvb.setType(matcher.getResultMatch().get(e));
//								arg0.getVirtualTypeBinding().add(new_tvb);
//							}
//						}
//					} else if (provided instanceof ModelTypeVariable) {
//						TypeMatchChecker matcher = new TypeMatchChecker((ModelType) required, (ModelType) ((ModelTypeVariable) provided).getSupertype());
//						//match = TypeMatchChecker.match((ModelType) required, (ModelType) ((ModelTypeVariable) provided).getSupertype(), new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
//						boolean match = matcher.matches(new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>());
//						if (!match) {
//							unit.messages.addError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".", codeContext);
//						} else {
//							//TODO Populate static bindings somehow to bind each required::virtual to its match
//							for (fr.irisa.triskell.kermeta.language.structure.Class e : matcher.getResultMatch().keySet()) {
//								//Find (or more probably create) the virtual type corresponding to the class
//								VirtualType vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) var, (ClassDefinition) e.getTypeDefinition());
//								//The provided is also an MTV, so we need to convert its classes back to Virtual Types, too
//								VirtualType target_vt = ModelTypeVariableHelper.getVirtualTypeByClassDefinition((ModelTypeVariable) provided, (ClassDefinition) matcher.getResultMatch().get(e).getTypeDefinition());
//								//Now create a binding
//								TypeVariableBinding new_tvb = struct_factory.createTypeVariableBinding();
//								new_tvb.setVariable(vt);
//								new_tvb.setType(target_vt);
//								arg0.getVirtualTypeBinding().add(new_tvb);
//							}
//						}
//					} else {
//						unit.messages.addError("Type " + FTypePrettyPrinter.getInstance().accept(provided) + " is not a conformant type binding for the variable " + var.getName() + " : " + FTypePrettyPrinter.getInstance().accept(required) + ".", codeContext);
//					}
//				}
//			}
//		}
//		return new Boolean(false);
//	}

	
	public Object visitFunctionType(FunctionType arg0) {
		this.accept(arg0.getLeft());
		this.accept(arg0.getRight());
		return false;
	}
	
	public Object visitProductType(ProductType arg0) {
		for (Object t : arg0.getType()) {
			this.accept((fr.irisa.triskell.kermeta.language.structure.Type) t);
		}
		return false;
	}
	
	public Object visitTypeReference(TypeReference arg0) {
		this.accept(arg0.getType());
		return false;
	}
	
}
