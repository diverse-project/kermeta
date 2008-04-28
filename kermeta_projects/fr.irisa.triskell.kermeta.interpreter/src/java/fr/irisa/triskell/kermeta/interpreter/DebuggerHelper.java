package fr.irisa.triskell.kermeta.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;

public class DebuggerHelper {

	static public CallFeature getLeftCallableExpression(CallFeature call) {
		if ( call.getTarget() != null ) {
			if ( call.getTarget() instanceof CallFeature ) {
				CallFeature target = (CallFeature) call.getTarget();
				if ( target.getStaticOperation() != null || (target.getStaticProperty() != null && target.getStaticProperty().isIsDerived()) )
					return getLeftCallableExpression( (CallFeature) call.getTarget() );
			}
		}
		return call;
	}
	
	static public Expression getNextExpression(Expression e, DebugInterpreter interpreter) {
		return getNextExpression(e, interpreter.getKermetaUnit());
	}
	
	static private Expression getNextExpression(Expression e, KermetaUnit kermetaUnit) {
		Expression result = null;
			Block block = getBlock( e );
		int index = block.getStatement().indexOf( e );
		if ( index != -1 ) {
			try {
				result = block.getStatement().get( index + 1 );
			} catch (IndexOutOfBoundsException e1) {}
		}
		return result;
	}
	
	static public Block getBlock(Expression e) {
		if ( e instanceof Block )
			return (Block) e;
		EObject container = e.eContainer();
		while ( ! (container instanceof Block) )
			container = container.eContainer();
		return (Block) container;
	}
	
}
