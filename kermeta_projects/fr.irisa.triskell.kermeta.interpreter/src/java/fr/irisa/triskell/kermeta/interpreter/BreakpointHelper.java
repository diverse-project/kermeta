package fr.irisa.triskell.kermeta.interpreter;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.Tracer;

public class BreakpointHelper {
	
	/**
	 * Getting a breakpoint on the first statement on a block.
	 * @param block 
	 * @param interpreter The interpreter containing the trace model.
	 * @return A FakeBreakpoint on the first statement of the given block or null if there is no textual reference to it.
	 */
	static private FakeBreakpoint getBreakpointFromBlock(Block block, DebugInterpreter interpreter) {
		FakeBreakpoint result = null;
		// Getting the tracer
    	Tracer tracer = interpreter.getKermetaUnit().getTracer();
    	if ( tracer != null ) {
			if ( block != null ) {
				try {
					// Find the text reference of the first statement of the body.
					TextReference reference = tracer.getFirstTextReference( block.getStatement().get(0) );
					if ( reference != null ) {
						return FakeBreakpoint.create(reference.getLineBeginAt(), reference.getFileURI());
					}
				} catch(IndexOutOfBoundsException e) {}
			}
    	}
    	return result;
	}
	
	static public FakeBreakpoint getNextStepIntoBreakpoint(Expression expression, DebugInterpreter interpreter) {
    	FakeBreakpoint b = null;
		if ( expression instanceof CallFeature ) {
    		CallFeature call = (CallFeature) expression;
    		// We can enter into an operation.
    		if ( call.getStaticOperation() != null ) {
    			b = getBreakpointFromBlock( (Block) call.getStaticOperation().getBody(), interpreter );
    		// Or we can enter into a derived property.
    		} if ( call.getStaticProperty() != null && call.getStaticProperty().isIsDerived() ) {
    			// What to call ? The getter or the setter ?
    			// If the setter, then the call feature must be the target of an assignement.
    			boolean setter = false;
    			if ( call.eContainer() instanceof Assignment ) {
    				Assignment a = (Assignment) call.eContainer();
    				if ( a.getTarget().equals(call) )
    					setter = true;
    			}
    			if ( setter )
    				b = getBreakpointFromBlock( (Block) call.getStaticProperty().getSetterBody(), interpreter );
    			else
    				b = getBreakpointFromBlock( (Block) call.getStaticProperty().getGetterBody(), interpreter );	
    		}
    	} else
    		System.out.println();
    	return b;
	}
	
	static public FakeBreakpoint getNextStepBreakpoint(Expression expression, DebugInterpreter interpreter) {
		Block block = DebuggerHelper.getBlock(expression);
		Expression current = expression;
		int index = -1;
		
		try  {
			while ( index == -1 ) {
				index = block.getStatement().indexOf( current );
				if ( index == -1 ) {
					current = (Expression) current.eContainer();
				}
			}
		} catch (ClassCastException e) {
			return null;
		}
		
		try {
			Expression nextExpression = block.getStatement().get( index + 1 );
		   	// Getting the tracer
		   	Tracer tracer = interpreter.getKermetaUnit().getTracer();
		   	if ( tracer != null ) {
				// Getting a text reference on the target if any
				TextReference reference = tracer.getFirstTextReference( nextExpression );
				if ( reference != null )
					return FakeBreakpoint.create(reference.getLineBeginAt(), reference.getFileURI());
		   	}		
		} catch (IndexOutOfBoundsException e) {}
		return null;
	}
	
	
	/**
	 * Look for a textual reference to the target expression.
	 * @param expression The target expression.
	 * @param interpreter The interpreter containing the trace model.
	 * @return A FakeBreakpoint if traces references the given expression or null otherwise.
	 */
	static public FakeBreakpoint getBreakpoint(Expression expression, DebugInterpreter interpreter) {
    	// Getting the tracer
    	Tracer tracer = interpreter.getKermetaUnit().getTracer();
    	if ( tracer != null ) {
			// Getting a text reference on the target if any
			TextReference reference = tracer.getFirstTextReference( expression );
			if ( reference != null )
				return FakeBreakpoint.create(reference.getLineBeginAt(), reference.getFileURI());
    	}		
		return null;		
	}
	
}
