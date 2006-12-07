/* $Id: ConstraintInterpreter.java,v 1.5 2006-12-07 09:55:46 dvojtise Exp $
 * Project   : kermeta interpreter
 * File      : Extern2CmdCompiler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 2006
 * Authors       : 
 *     Jean-Marie Mottu
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

public class ConstraintInterpreter extends ExpressionInterpreter {
	AtPreVisitor atpreV;
	
	public ConstraintInterpreter(RuntimeMemory pMemory) {
		super(pMemory);
		atpreV = new AtPreVisitor(pMemory , this , interpreterContext);
	}
	
	
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a CallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		RuntimeObject result = memory.voidINSTANCE;
		// push expression context
		interpreterContext.peekCallFrame().pushExpressionContext();
		interpreterContext.peekCallFrame().peekExpressionContext().setStatement(node.getBody());
		
		Operation superOp = node.getSuperOperation();
		try {
			// Memorise the value of the @pre variables
			for (Object next : node.getPost())
				atpreV.accept((Constraint)next);
			
			if (superOp != null){
				for (Object next : superOp.getPost())
					atpreV.accept((Constraint)next);
				
				// Check the pre conditions
				for (Object next : superOp.getPre())
					this.accept((Constraint)next);
			}
		
			//TODO : check that parentPre implies Pre			
			for (Object next : node.getPre())
				this.accept((Constraint)next);
			
			// Interpret body
			this.accept(node.getBody());
			
			// Check the post conditions
			for (Object next : node.getPost())
				this.accept((Constraint)next);

			//TODO : check that post implies parentPost
			if (superOp != null) {
				for (Object next : superOp.getPost())
					this.accept((Constraint)next);
			}
			// Set the result
			result = interpreterContext.peekCallFrame().getOperationResult();
		}
		finally {
			// Pop the expressionContext
			interpreterContext.peekCallFrame().popExpressionContext();
		}
		return result;
	}
	
	/**
	 * 
	 */
	public Object visitConstraint(Constraint node)
	{
		
		// The result returned by the visit
		RuntimeObject result = null;
		// Stops the interpretation if asked by user.
		shouldTerminate();
		
		Expression constraintBody = node.getBody();
		
		// Set "cond" as the current statement that will be evaluated in the
		// current expressionContext
		getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(constraintBody);
		
		// Object should be a Boolean
		RuntimeObject cond_result = (RuntimeObject)this.accept(constraintBody);
		boolean cond_value=true;
		
		// Get boolean value
		if (cond_result.getData().containsKey("BooleanValue"))
			cond_value = ((Boolean)cond_result.getData().get("BooleanValue")).booleanValue();
		else
		{
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
					"cannot evaluate the constraint",
					this,
					memory,
					constraintBody,
					null);
		}
		
		if (cond_value == false)
		{   
			String message = node.getStereotype().getName()+ " " + node.getName() 
			+ " of operation " + ((Operation)node.eContainer()).getName()
			+ " of class "+ ((Operation)node.eContainer()).getOwningClass().getName()
			+ " violated";
			if(node.getStereotype()==ConstraintType.PRE_LITERAL)
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ConstraintViolatedPre",
						message,
						this,
						memory,
						constraintBody,
						null);
			else
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ConstraintViolatedPost",
						message,
						this,
						memory,
						constraintBody,
						null);        	
		}
		
		return result;
	}
	
public Object visitCallFeature(CallFeature node) {
	    
	    // Handle call to enumeration literals :
	    if (node.getStaticEnumLiteral() != null) {
	        return memory.getRuntimeObjectForFObject(node.getStaticEnumLiteral());
	    }
	    
	    // It is a real operation / property call
	    
	    fr.irisa.triskell.kermeta.language.structure.Class t_target = null; // Type of the "callee"
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    
	    // Get the target of the call
	    if (node.getTarget() == null) {
	        // Self if nothing is specified
	        ro_target = interpreterContext.peekCallFrame().getSelf();
	    }
	    else {
	        ro_target = (RuntimeObject)this.accept(node.getTarget());
	    }
	    
	    
	    if (ro_target == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : Call on a null target");
	        throw new Error("INTERPRETER INTERNAL ERROR : Call on a null target");
	    }
	    
	    // Get The type of the Object
	    t_target =(fr.irisa.triskell.kermeta.language.structure.Class)((RuntimeObject)ro_target.getMetaclass()).getData().get("kcoreObject");
	    
	    // This is just a test for debbuging the interpreter. It should never occur
	    if (t_target == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	    }

		// Get the feature
	    SimpleType target_type = new SimpleType(t_target);
	    
	    if (node.getStaticOperation() == null && node.getStaticProperty() == null) {
	    	node.getStaticOperation();
	    	node.getStaticProperty();
	        internalLog.error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
	        throw new Error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
	    }
	    
	    
	    if (node.getStaticOperation() != null) {
	        // It is an operation call --> 
	        //CallableOperation operation = target_type.getOperationByName(node.getFName());
	    	CallableOperation operation = this.interpreterContext.typeCache.getOperationByName(target_type, node.getName());
	        
//			 Check that target is not void
		    if (operation == null && ro_target == memory.voidINSTANCE) {
		    	String additionalMsg = "";
		    	if(node.getStaticProperty() != null)
		    		if(node.getStaticProperty().isIsDerived())
		    			additionalMsg = "Warning, target was a Derived Property";
		        internalLog.info(" >> INTERPRETER REPORTS Call on a void target: " + node.getName() +"; Operation: " +node.getStaticOperation());
		        if(!additionalMsg.equals(""))
		        	internalLog.info(additionalMsg);
		        raiseCallOnVoidTargetException(node, additionalMsg);		        
		    }
		    
//		  This should never happend is the type checker has checked the program
			if (operation == null) {
			    String msg = "INTERPRETER INTERNAL ERROR : unable to find a feature : "
				    + "\noperation : '"+node.getName()+"' not found for an object of kind : "+ target_type;
			    internalLog.error(msg);
		        throw new Error(msg);
			}
	        
//			 Get the parameters of this operation
			ArrayList parameters = visitList(node.getParameters());
			// Create a context for this operation call, setting self object to ro_target
			interpreterContext.pushOperationCallFrame(ro_target, operation, parameters, node);
			try {
				// Resolve this operation call
				result = (RuntimeObject)this.accept(operation.getOperation());
				// After operation has been evaluated, pop its context
			} finally {
			    interpreterContext.popCallFrame();
			}
	    }
	    else {
	        // It is a property call
	        CallableProperty property =  target_type.getPropertyByName(node.getName());
	    	//CallableProperty property =  this.interpreterContext.typeCache.getPropertyByName(target_type, node.getFName());
	        
//			 Check that target is not void
		    if (property == null && ro_target == memory.voidINSTANCE) {
		        internalLog.debug(" >> INTERPRETER REPORTS Call of '"+ node.getName() +"' property on a void target. Exception raised.");
		        raiseCallOnVoidTargetException(node,"");
		    }
		    
//		  This should never happen is the type checker has checked the program
			if (property == null) {
			    internalLog.error("INTERPRETER INTERNAL ERROR : unable to find a feature : " + node.getName() + "in type : " + target_type);
			    internalLog.error("May be the code was not successfully typechecked ? If the typechecker has no error, please contact kermeta developers");		        
		        throw new Error("INTERPRETER INTERNAL ERROR : unable to find a feature : " + node.getName());
			}
			
//			 Get the runtime object corresponding to the property
		    RuntimeObject ro_property = getRuntimeObjectForProperty(t_target, property.getProperty().getName());
		    
		    // This is just a debbuging check. It should never occur
		    if (ro_property == null) {
			    internalLog.error("INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property " + property.getName());
			    internalLog.error("May be the code was not successfully typechecked ? If the typechecker has no error, please contact kermeta developers");
		        throw new Error("INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property " + property.getName());
			}
		    
		    if(node.isIsAtpre()){
		    	int index = atpreV.getListCallFeatureAtPre().indexOf(node);
		    	result = (RuntimeObject)atpreV.getListCallFeatureAtPre().get(index + 1);
		    }else{
		    	if (!property.getProperty().isIsDerived())
		    		
		    	{
		    		// Get the value of the property
		    		result = fr.irisa.triskell.kermeta.runtime.language.Object.get(ro_target, ro_property);
		    	}
		    	else
		    	{
		    		result = this.getterDerivedProperty(property, ro_target, node);
		    	}
		    }
	    }
		
		return result;
	}
}