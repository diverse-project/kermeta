

package org.kermeta.interpreter.internal;

import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;

public class BlockInterpreter {

	static public RuntimeObject doIt(Block node, ExpressionInterpreter interpreter) {

	    RuntimeObject result = interpreter.memory.voidINSTANCE;
		
	    // process the statements
	    try {
	        // Execute the block
	        interpreter.getInterpreterContext().peekCallFrame().pushExpressionContext();
	        try {
	    
			    List<RuntimeObject> res = interpreter.visitStatementList(node.getStatement());
			    if (res.size() > 0) 
			        result = (RuntimeObject)res.get(res.size()-1);
	        }
	        finally {
	            interpreter.getInterpreterContext().peekCallFrame().popExpressionContext();
	        }
	    }
	    catch(KermetaRaisedException ex) {
	        Iterator<Rescue> it = node.getRescueBlock().iterator();
	        Rescue resc_block = null;
	        while (it.hasNext() && resc_block == null) {
	            Rescue r = (Rescue)it.next();
	            if (r.getExceptionType() == null)
	                resc_block = r;
	            else {
	            	TypeCheckerContext tcc = interpreter.memory.getTypeCheckerContext();
	                SimpleType exprected =  new SimpleType(r.getExceptionType().getType(), tcc);
	                SimpleType provided = new SimpleType((fr.irisa.triskell.kermeta.language.structure.Class)ex.raised_object.getMetaclass().getKCoreObject(), tcc);
	                if (provided.isSubTypeOf(exprected)) {
	                    resc_block = r;
	                }
	            }
	        }
	        if (resc_block == null) throw ex;
	        
	        // Execute the rescue block
	        interpreter.getInterpreterContext().peekCallFrame().pushExpressionContext();	        
	        try {
	        
	        if (resc_block.getExceptionType() != null)
	            interpreter.getInterpreterContext().peekCallFrame().peekExpressionContext().defineVariable(resc_block.getExceptionName(), ex.raised_object);
 
	        	List<RuntimeObject> res = interpreter.visitStatementList(resc_block.getBody());
	        	if (res.size() > 0) 
			        result = (RuntimeObject)res.get(res.size()-1);
	        }
	        finally {
	            interpreter.getInterpreterContext().peekCallFrame().popExpressionContext();
	        }
	    }
	    return result;
	}

}


