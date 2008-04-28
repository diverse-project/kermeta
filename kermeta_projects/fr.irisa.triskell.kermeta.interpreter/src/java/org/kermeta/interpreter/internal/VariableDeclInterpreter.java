

package org.kermeta.interpreter.internal;

import org.kermeta.interpreter.InterpreterPlugin;

import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class VariableDeclInterpreter {

	static public RuntimeObject doIt(VariableDecl node, ExpressionInterpreter interpreter) {
		if (node!=null) 
			interpreter.setParent(node);
		RuntimeObject ro_init = interpreter.memory.voidINSTANCE;
		// is it a classic case?
		// TODO : compare qualified names otherwise this test could be sometimes false
		if (FunctionType.class.isInstance(node.getType().getType())) {
		   InterpreterPlugin.internalLog.info("Type of variable declaration : "+node.getType().getName());
		}
		if (node.getInitialization()!=null)
		   ro_init = (RuntimeObject) interpreter.accept(node.getInitialization());
		
		interpreter.getInterpreterContext().peekCallFrame().peekExpressionContext().defineVariable(
	             node.getIdentifier(), ro_init);
		return ro_init;
	}

}


