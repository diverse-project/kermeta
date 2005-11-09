package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IWatchExpressionDelegate;
import org.eclipse.debug.core.model.IWatchExpressionListener;
import org.eclipse.debug.core.model.IWatchExpressionResult;

public class KermetaWatchExpressionDelegate implements IWatchExpressionDelegate, IWatchExpressionResult
{

	public void evaluateExpression(String expression, IDebugElement context,
			IWatchExpressionListener listener) {
		// TODO Auto-generated method stub
		System.err.println("Evaluate the expression!");

	}

	public IValue getValue() {
		System.err.println("getValue");
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasErrors() {
		System.err.println("hasErrors");
		// TODO Auto-generated method stub
		return false;
	}

	public String[] getErrorMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getExpressionText() {
		System.err.println("getExpressionText");
		// TODO Auto-generated method stub
		return null;
	}

	public DebugException getException() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
