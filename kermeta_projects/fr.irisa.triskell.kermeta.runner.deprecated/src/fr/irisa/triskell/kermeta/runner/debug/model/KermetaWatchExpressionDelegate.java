package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IWatchExpressionDelegate;
import org.eclipse.debug.core.model.IWatchExpressionListener;

public class KermetaWatchExpressionDelegate implements IWatchExpressionDelegate {

	public void evaluateExpression(String expression, IDebugElement context,
			IWatchExpressionListener listener) {
		// TODO Auto-generated method stub
		System.err.println("Evaluate the expression!");

	}

}
