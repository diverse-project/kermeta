package fr.irisa.triskell.kermeta.interpreter;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;

public class TraceInterpreter extends ExpressionInterpreter {

	public TraceInterpreter(RuntimeMemory memory) {
		super(memory);
	}

	@Override
	public Object visitCallFeature(CallFeature node) {
		traceExecution( node );
		Object result = super.visitCallFeature(node);
		return result;
	}
	
	private void traceExecution(Expression expression) {
		System.err.println( expression.toString() );
	}
	
}
