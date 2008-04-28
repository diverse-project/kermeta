

package org.kermeta.interpreter.internal;

import java.util.List;

import org.kermeta.interpreter.InterpreterPlugin;
import org.kermeta.interpreter.exceptions.KExceptionFactory;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

public class CallFeatureInterpreter {

	static public RuntimeObject doIt(CallFeature node, ExpressionInterpreter interpreter) {
		if (node!=null) 
			interpreter.setParent(node);
	    // Handle call to enumeration literals :
	    if (node.getStaticEnumLiteral() != null) {
	        return interpreter.memory.getRuntimeObjectForFObject(node.getStaticEnumLiteral());
	    }
	    
	    
	    // It is a real operation / property call    
	    Class t_target = null; // Type of the "callee"
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    
	    // Get the target of the call
	    if (node.getTarget() == null) {
	        // Self if nothing is specified
	        ro_target = interpreter.getInterpreterContext().peekCallFrame().getSelf();
	    }
	    else {
	        ro_target = (RuntimeObject)interpreter.accept(node.getTarget());
	    }
	    KM2KMTPrettyPrinter pp  = new KM2KMTPrettyPrinter();
	    
	    if (ro_target == null) {
	    	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : Call on a null target");
	    	interpreter.accept(node.getTarget());
	        throw new Error("INTERPRETER INTERNAL ERROR : Call on a null target while executing : " + pp.accept(node) );
	    }
	    
	    // Get The type of the Object
	    t_target =(Class)((RuntimeObject)ro_target.getMetaclass()).getKCoreObject();
	    
	    // This is just a test for debbuging the interpreter. It should never occur
	    if (t_target == null) {
	    	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	    }

		// Get the feature
	    SimpleType target_type = new SimpleType(t_target);
	    //	  if this is a java object proxy some more initialization are needed
	    boolean isJarProxy = ro_target.isJarProxy();
	    /*if(RuntimeHelper.isJarProxy(target_type.getTypeDefinition())){
	    	// this is a proxy to a jar must invoke it
	    	throw new Error("don't know how to invoke " + node.getName()+ " on jar proxy for " + target_type);
	    }*/
	    if (node.getStaticOperation() == null && node.getStaticProperty() == null) {
	    	node.getStaticOperation();
	    	node.getStaticProperty();
	    	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
	        throw new Error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
	    }
	    
	    
	    if (node.getStaticOperation() != null) {
	        // It is an operation call --> 
	        //CallableOperation operation = target_type.getOperationByName(node.getFName());
	    	CallableOperation operation = interpreter.getInterpreterContext().typeCache.getOperationByName(target_type, node.getName());
	        
//			 Check that target is not void
		    if (operation == null && ro_target == interpreter.memory.voidINSTANCE) {
		    	String additionalMsg = "";
		    	if(node.getStaticProperty() != null)
		    		if(node.getStaticProperty().isIsDerived())
		    			additionalMsg = "Warning, target was a Derived Property";
		    	InterpreterPlugin.internalLog.info(" >> INTERPRETER REPORTS Call on a void target: " + node.getName() +"; Operation: " +node.getStaticOperation());
		        if(!additionalMsg.equals(""))
		        	InterpreterPlugin.internalLog.info(additionalMsg);
		        KExceptionFactory.raiseCallOnVoidTarget(node, additionalMsg, interpreter);		        
		    }
		    
//		  This should never happen if the type checker has checked the program
			if (operation == null) {
			    String msg = "INTERPRETER INTERNAL ERROR : unable to find a feature : "
				    + "\noperation : '"+node.getName()+"' not found for an object of kind : "+ target_type;
			    InterpreterPlugin.internalLog.error(msg);
		        throw new Error(msg);
			}
	        
//			 Get the parameters of this operation
			List<RuntimeObject> parameters = interpreter.visitList(node.getParameters());
			// Create a context for this operation call, setting self object to ro_target
			interpreter.getInterpreterContext().pushOperationCallFrame(ro_target, operation, parameters, node);
			try {
				if(isJarProxy){
					// invoke the java operation
					result = interpreter.invokeOperationOnProxy(operation.getOperation(), parameters);
				}
				else{ // normal interpeter call
					// Resolve this operation call
					result = (RuntimeObject)interpreter.accept(operation.getOperation());
					// After operation has been evaluated, pop its context
				}
			} finally {
			    interpreter.getInterpreterContext().popCallFrame();
			}
	    }
	    else {
	        // It is a property call
	        CallableProperty property =  target_type.getPropertyByName(node.getName());
	    	//CallableProperty property =  this.interpreterContext.typeCache.getPropertyByName(target_type, node.getFName());
	        
//			 Check that target is not void
		    if (property == null && ro_target == interpreter.memory.voidINSTANCE) {
		    	InterpreterPlugin.internalLog.debug(" >> INTERPRETER REPORTS Call of '"+ node.getName() +"' property on a void target. Exception raised. ");
		        //KM2KMTPrettyPrinter pp  = new KM2KMTPrettyPrinter(); 
		    	InterpreterPlugin.internalLog.debug(" >>    node prettyprint: "+ pp.accept(node));
		    	InterpreterPlugin.internalLog.debug(" >>    container prettyprint: "+ pp.accept(node.eContainer()));
		    	KExceptionFactory.raiseCallOnVoidTarget(node,"", interpreter);
		    }
		     
//		  This should never happen is the type checker has checked the program
			if (property == null) {
				String err = "INTERPRETER INTERNAL ERROR : unable to find a feature : '" + node.getName() + "' in type : " + target_type;
			    err += "\n( May be the code was not successfully typechecked; If the typechecker has no error, please contact kermeta developers )";
		        throw new Error(err);
			}
			
//			 Get the runtime object corresponding to the property
		    RuntimeObject ro_property = interpreter.getRuntimeObjectForProperty(t_target, property.getProperty().getName());
		    
		    // This is just a debbuging check. It should never occur
		    if (ro_property == null) {
			    String err = "INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property '" + property.getName() + "'";
			    err += "\n( May be the code was not successfully typechecked ? If the typechecker has no error, please contact kermeta developers )";
			    throw new Error(err);
			}
		    
		    if (!property.getProperty().isIsDerived())
		    {
		    	if(isJarProxy){
					// invoke the java operation
					result = interpreter.getPropertyOnProxy(ro_target, ro_property, property.getProperty());
				}
				else{ // normal interpeter call
					//					 Get the value of the property
			        result = fr.irisa.triskell.kermeta.runtime.language.Object.get(ro_target, ro_property);
				}
		        
		    }
		    else
		    {
		        result = interpreter.getterDerivedProperty(property, ro_target, node);
		    }
	        
	    }
		
		return result;
	}

}


