/* $Id: OperationTypeVariableChecker.java,v 1.1 2008-04-14 09:49:59 dvojtise Exp $
 * Project : Kermeta io
 * File : OperationTypeVariableChecker.java
 * License : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : 10 Apr 2008
 * Authors : 
 * 		Didier Vojtisek
 */ 
package fr.irisa.triskell.kermeta.typechecker;


import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
/**
 * This module checks whether the type variable declared on an operation are legitimate and usable
 * the visitor part of this class, check whether the passed Type is a candidate to identify the checkedTypeVariable
 */
public class OperationTypeVariableChecker extends KermetaOptimizedVisitor {
	
	/**
	 * 
	 * @param t
	 * @param unit
	 * @param context
	 * @param codeContext
	 */
	public static void checkOperationTypeVariables(KermetaUnit unit, Operation op) {
		for(TypeVariable tv : op.getTypeParameter()){
			OperationTypeVariableChecker checker = new OperationTypeVariableChecker( tv);
			boolean canBeBound = false; 
			fr.irisa.triskell.kermeta.language.structure.Type t = (fr.irisa.triskell.kermeta.language.structure.Type) op.getType();
	    	if((Boolean) checker.accept(t)){
	    		canBeBound = true; 
	    	}
	    	for(Parameter param : op.getOwnedParameter()){
	    		if((Boolean) checker.accept(param.getType() )){
	        		canBeBound = true;
	        	}	    		
	    	}
	    	ClassDefinition cd = (ClassDefinition)op.eContainer();
	    	for(TypeVariable classTV :cd.getTypeParameter()){
	    		if(classTV.getName().equals(tv.getName())){
	    			// can be bound but seem redundant
	    			canBeBound = true;
	    			unit.warning("TYPE-CHECKER : The TypeVariable "+ tv.getName()+" is already defined at the class level", tv);
	    		}
	    	}
	    	if(! canBeBound) {
	    		unit.error("TYPE-CHECKER : The TypeVariable "+ tv.getName()+" cannot be bound, you must either use it in a parameter or as return type of the operation " + op.getName(), tv);
	    	}
			
		}
		
	}
		
	protected TypeVariable checkedTypeVariable;

	
	public OperationTypeVariableChecker( fr.irisa.triskell.kermeta.language.structure.TypeVariable typeVariable) {
		super();
		this.checkedTypeVariable = typeVariable;
	}
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
		Boolean result = new Boolean(false);
		if(checkedTypeVariable == arg0) result = new Boolean(true);
		// maybe this is a parametrized class
		for(TypeVariableBinding tvBinding : arg0.getTypeParamBinding()){
			result = result || (Boolean)this.accept((fr.irisa.triskell.kermeta.language.structure.Type) tvBinding.getType());
		}
		return result;
	}
	public Object visitType(ParameterizedType arg0){
		Boolean result = new Boolean(false);
		if(checkedTypeVariable == arg0) result = new Boolean(true);
		return result;
	}
	public Object visitType(DataType arg0){
		Boolean result = new Boolean(false);
		if(checkedTypeVariable == arg0) result = new Boolean(true);
		return result;
	}
	
	public Object visitVoidType(VoidType arg0){
		Boolean result = new Boolean(false);
		if(checkedTypeVariable instanceof VoidType) result = new Boolean(true);
		return result;
	}
	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0){
		Boolean result = new Boolean(false);
		if(checkedTypeVariable == arg0) result = new Boolean(true);
		return result;
	}
	
	public Object visitFunctionType(FunctionType arg0) {
		Boolean result = new Boolean(false);
		
		result = result || (Boolean)this.accept(arg0.getLeft());
		result = result || (Boolean)this.accept(arg0.getRight());
		return result;
	}
	
	public Object visitProductType(ProductType arg0) {
		Boolean result = new Boolean(false);
		for (Object t : arg0.getType()) {
			result = result || (Boolean)this.accept((fr.irisa.triskell.kermeta.language.structure.Type) t);
		}
		return result;
	}
	
	public Object visitTypeReference(TypeReference arg0) {
		Boolean result = (Boolean)this.accept(arg0.getType());
		
		return result;
	}
	
}
