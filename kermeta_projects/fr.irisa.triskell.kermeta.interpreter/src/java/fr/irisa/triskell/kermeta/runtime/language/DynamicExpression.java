/* $Id: DynamicExpression.java,v 1.2 2005-09-06 10:48:05 zdrey Exp $
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
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Map;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FType;

/*
 * Implementation  of kermeta::language::DynamicExpression 
 *
 */

public class DynamicExpression {
	
    
    // result ?= extern fr::irisa::triskell::kermeta::runtime::language::DynamicExpression.parse(self, expression)
	public static RuntimeObject parse(RuntimeObject self, RuntimeObject expression) {
	    
	    java.lang.String exp = String.getValue(expression);
	    RuntimeObject ro_params = (RuntimeObject)self.getProperties().get("formalParameters");
	    Hashtable params = Map.getHashtable(ro_params);
	    
	    Hashtable ftype_params = new Hashtable();
	    
	    Enumeration e = params.keys();
	    while (e.hasMoreElements()) {
	        RuntimeObject ro_name = (RuntimeObject)e.nextElement();
	        RuntimeObject ro_type =  (RuntimeObject)params.get(ro_name);
	        
	        java.lang.String name = String.getValue(ro_name);
	        FType type = (FType)ro_type.getData().get("kcoreObject");
	        
	        ftype_params.put(name , type);
	    }
	    
	    FClassDefinition cdef = (FClassDefinition)((RuntimeObject)self.getProperties().get("selfClass")).getData().get("kcoreObject");
	    
	    // the provided object should have an associated ecore object
	    // otherwise the ecore object should be created.
	    if (cdef == null) throw new Error("NOT IMPLEMENTED");
	    
	    DynamicExpressionUnit deu = new DynamicExpressionUnit(self.getFactory().getMemory().getUnit().packages);
	    
	    self.getData().put("DynamicExpressionUnit", deu);
	    
	    deu.parse(exp, cdef, ftype_params);
	   
	    if (deu.getError().size() == 0) deu.typeCheck(null);
	    
	    if (deu.getError().size() == 0) {
	        RuntimeObject parsed_expression = self.getFactory().getMemory().getRuntimeObjectForFObject(deu.getExpression());
	        self.getProperties().put("expression", parsed_expression);
	        return self.getFactory().getMemory().trueINSTANCE;
	    }
	    // FIXME: add errors to self runtime objets
	    System.err.println("NOT IMPLEMENTED : add errors to self runtime objets");
	    System.err.println(deu.getAllMessagesAsString());
	    return self.getFactory().getMemory().falseINSTANCE;
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
