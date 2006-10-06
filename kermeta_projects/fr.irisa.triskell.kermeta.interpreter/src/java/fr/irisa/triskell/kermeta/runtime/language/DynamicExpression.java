/* $Id: DynamicExpression.java,v 1.6 2006-10-06 12:19:50 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : DynamicExpression.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 juin 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.runtime.language;

import java.util.Enumeration;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.interpreter.ExpressionCallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Map;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;

/*
 * Implementation  of kermeta::language::DynamicExpression 
 *
 */

public class DynamicExpression {
	
    
		
    // result ?= extern fr::irisa::triskell::kermeta::runtime::language::DynamicExpression.parse(self, expression)
	public static RuntimeObject parse(RuntimeObject self, RuntimeObject expression) {
	    
		RuntimeObject ro_params = (RuntimeObject)self.getProperties().get("formalParameters");
	    Hashtable params = Map.getHashtable(ro_params);
	    
	    Hashtable ftype_params = new Hashtable();
	    
	    Enumeration e = params.keys();
	    while (e.hasMoreElements()) {
	        RuntimeObject ro_name = (RuntimeObject)e.nextElement();
	        RuntimeObject ro_type =  (RuntimeObject)params.get(ro_name);
	        
	        java.lang.String name = String.getValue(ro_name);
	        Type type = (Type)ro_type.getData().get("kcoreObject");
	        
	        ftype_params.put(name , type);
	    }

	    ClassDefinition cdef = (ClassDefinition)((RuntimeObject)self.getProperties().get("selfClass")).getData().get("kcoreObject");
	    // the provided object should have an associated ecore object
	    // otherwise the ecore object should be created.
	    if (cdef == null) throw new Error("NOT IMPLEMENTED");
	    
		java.lang.String stringExpression = String.getValue(expression);
		DynamicExpressionUnit dynamicExpressionUnit = new DynamicExpressionUnit(self.getFactory().getMemory().getUnit().packages);
		self.getData().put("DynamicExpressionUnit", dynamicExpressionUnit);
		
	    try {
			
			dynamicExpressionUnit.parse(stringExpression, cdef, ftype_params);
						
		} catch (Exception exception) {
			
			RuntimeObject errors = (RuntimeObject)self.getProperties().get("errors");
		    RuntimeObject pe = self.getFactory().createObjectFromClassName("kermeta::interpreter::ParseError");
		    java.lang.String errorMessage = "DynamicExpression : \"" + stringExpression + "\" has not been correctly parsed.\n The following error occured : " + exception.getMessage();
		    RuntimeObject s = String.create(errorMessage, self.getFactory());
		    pe.getProperties().put("message", s);
		    // adding found ParseError to the DynamicExpression collection
		    ReflectiveCollection.add(errors, pe);	
		    return self.getFactory().getMemory().falseINSTANCE;
		}
		
		// the try is a succes, let us continue
		RuntimeObject parsed_expression = self.getFactory().getMemory().getRuntimeObjectForFObject(dynamicExpressionUnit.getExpression());
        self.getProperties().put("expression", parsed_expression);
		
		// the expression's creation process in the parse method of DynamicExpressionUnit may have find errors
		if ( ! dynamicExpressionUnit.messages.hasError() ) dynamicExpressionUnit.typeCheck(null);

//	    if (!deu.messages.hasError()) deu.typeCheck(null);
	    
	    if ( ! dynamicExpressionUnit.messages.hasError() ) {
	       // RuntimeObject parsed_expression = self.getFactory().getMemory().getRuntimeObjectForFObject(dynamicExpressionUnit.getExpression());
	        self.getProperties().put("expression", parsed_expression);
	        return self.getFactory().getMemory().trueINSTANCE;
	    } else {
		    // add errors to self runtime objets
	    	// First : get the collection which will receive found errors
		    RuntimeObject errors = (RuntimeObject)self.getProperties().get("errors");
		    
		    for (java.util.Iterator iter = dynamicExpressionUnit.messages.getAllErrors().iterator(); iter.hasNext();) {
		    	KMUnitError er = (KMUnitError)iter.next();
		    	RuntimeObject pe = self.getFactory().createObjectFromClassName("kermeta::interpreter::ParseError");
		    	RuntimeObject s = String.create(er.getMessage(), self.getFactory());
		    	pe.getProperties().put("message", s);
		    	
		    	// adding found ParseError to the DynamicExpression collection
		    	ReflectiveCollection.add(errors, pe);
			}
		    
		    return self.getFactory().getMemory().falseINSTANCE;
	    }

	}

	//result := extern fr::irisa::triskell::kermeta::runtime::language::DynamicExpression.execute(self, selfObj, actualParams)
	public static RuntimeObject execute(RuntimeObject self, RuntimeObject selfObj, RuntimeObject actualParams) {
	    DynamicExpressionUnit deu = (DynamicExpressionUnit)self.getData().get("DynamicExpressionUnit");
	    
	    ExpressionInterpreter interp = self.getFactory().getMemory().getCurrentInterpreter();
	    
	    ExpressionCallFrame ecf = new ExpressionCallFrame(interp.getInterpreterContext(), deu, selfObj);
	    
	    Hashtable ro_act_params = Map.getHashtable(actualParams);
	    Hashtable act_params = new Hashtable();
	    
	    
	    Enumeration e = ro_act_params.keys();
	    while (e.hasMoreElements()) {
	        RuntimeObject ro_name = (RuntimeObject)e.nextElement();
	        RuntimeObject ro_parm =  (RuntimeObject)ro_act_params.get(ro_name);
	        java.lang.String name = String.getValue(ro_name);
	        act_params.put(name , ro_parm);
	    }
	    
	    ecf.bindActualParameter(act_params);
	    
	    return ecf.eval(interp);
	    
	}
	
	
}
