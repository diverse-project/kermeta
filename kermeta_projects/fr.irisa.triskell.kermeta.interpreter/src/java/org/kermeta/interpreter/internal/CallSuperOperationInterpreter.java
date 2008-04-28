

package org.kermeta.interpreter.internal;

import java.util.List;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;

public class CallSuperOperationInterpreter {

	static public RuntimeObject doIt(CallSuperOperation node, ExpressionInterpreter interpreter) {
    	if (node!=null) 
    		interpreter.setParent(node);
        RuntimeObject result = interpreter.getMemory().voidINSTANCE;
        // Current call frame is uniquely a LambdaCallFrame, or an OperationCallFrame. Other types are forbidden!
        Operation current_op = interpreter.getInterpreterContext().peekCallFrame().getOperation();
        RuntimeObject ro_target = interpreter.getInterpreterContext().peekCallFrame().getSelf();
        //ClassDefinition foclass = current_op.getOwningClass();
        //internalLog.info("Visiting a super operation of : "+current_op.getFName());
        
        fr.irisa.triskell.kermeta.language.structure.Class self_type = (fr.irisa.triskell.kermeta.language.structure.Class)interpreter.getInterpreterContext().peekCallFrame().getSelf().getMetaclass().getKCoreObject();
        
        // Get the parameters of this operation
		List<RuntimeObject> parameters = interpreter.visitList(node.getParameters());
		// Create a context for this operation call, setting self object to ro_target
		interpreter.getInterpreterContext().pushOperationCallFrame(ro_target, InheritanceSearch.getSuperOperation(self_type, current_op), parameters, node);
		
		try {
		    result = (RuntimeObject) interpreter.accept(current_op.getSuperOperation());
		} finally {
		    // Pop the context!
		    interpreter.getInterpreterContext().popCallFrame();
		}
        // TODO : raise exception if super operation not found // TypeChecker
        return result;
	}

}


