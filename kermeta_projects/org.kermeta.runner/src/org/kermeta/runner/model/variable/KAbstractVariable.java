

/*$Id: KAbstractVariable.java,v 1.1 2008-04-01 15:10:15 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KVariable.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mars 08
* Authors : paco
*/

package org.kermeta.runner.model.variable;

import java.util.Stack;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.kermeta.runner.model.KDebugElement;
import org.kermeta.runner.model.KDebugTarget;
import org.kermeta.runner.model.KStackFrame;

public class KAbstractVariable extends KDebugElement implements IVariable {

	// name & stack frame
	private String fName;
	private KStackFrame fFrame;
	
	private KAbstractVariable _parent;
	
	/**
	 * Constructs a variable contained in the given stack frame
	 * with the given name.
	 * 
	 * @param frame owning stack frame
	 * @param name variable name
	 */
	public KAbstractVariable(KStackFrame frame, String name) {
		super((KDebugTarget) frame.getDebugTarget());
		fFrame = frame;
		fName = name;
	}
	
	public KAbstractVariable(KAbstractVariable parent, String name) {
		this(parent.getStackFrame(), name);
		_parent = parent;
	}
	
	public String getValueRequest() {
		String request = "";
		if ( _parent == null )
			request = "var " + fFrame.getIdentifier() + " " + fName;
		else {
			try {
				Stack<KAbstractVariable> variables = new Stack<KAbstractVariable>();
				KAbstractVariable current = this;
				while ( current.parent() != null ) {
					variables.push(current);
					current = current.parent();
				}
				request = "var " + current.getStackFrame().getIdentifier() + " " + current.getName();
				while ( ! variables.isEmpty() ) {
					current = variables.pop();
					request += "|" + current.getName();
				}
			} catch (DebugException e) {
			}
		}
		return request;
	}
	
	public KAbstractVariable parent() {
		return _parent;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getValue()
	 */
	public IValue getValue() throws DebugException {
		return ((KDebugTarget)getDebugTarget()).getVariableValue(this);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getName()
	 */
	public String getName() throws DebugException {
		return fName;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getReferenceTypeName()
	 */
	public String getReferenceTypeName() throws DebugException {
		// TODO Auto-generated method stub
		return "Thing";
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#hasValueChanged()
	 */
	public boolean hasValueChanged() throws DebugException {
		// TODO Auto-generated method stub
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#setValue(java.lang.String)
	 */
	public void setValue(String expression) throws DebugException {
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#setValue(org.eclipse.debug.core.model.IValue)
	 */
	public void setValue(IValue value) throws DebugException {
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#supportsValueModification()
	 */
	public boolean supportsValueModification() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#verifyValue(java.lang.String)
	 */
	public boolean verifyValue(String expression) throws DebugException {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#verifyValue(org.eclipse.debug.core.model.IValue)
	 */
	public boolean verifyValue(IValue value) throws DebugException {
		return false;
	}
	
	/**
	 * Returns the stack frame owning this variable.
	 * 
	 * @return the stack frame owning this variable
	 */
	public KStackFrame getStackFrame() {
		return fFrame;
	}

}


