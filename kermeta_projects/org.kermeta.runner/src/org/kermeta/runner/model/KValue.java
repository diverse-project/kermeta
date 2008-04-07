

/*$Id: KValue.java,v 1.3 2008-04-07 14:54:21 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KValue.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mars 08
* Authors : paco
*/

package org.kermeta.runner.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.kermeta.runner.model.variable.KAbstractVariable;
import org.kermeta.runner.util.KVariableFactory;

public class KValue extends KDebugElement implements IValue {

	private String fValue;
		
	private KAbstractVariable _variable;
	
	private List<IVariable> _members = new ArrayList<IVariable>();
	
	public KValue(KDebugTarget target, KAbstractVariable variable, String data) {
		super(target);
		_variable = variable;
		initializeFromData(data);
	}
	
	private void initializeFromData(String data) {
		if ( data != null ) {
			String[] strings = data.split("\\|");
			fValue = strings[0];
			for ( int i = 1; i < strings.length; i++ ) {
				IVariable variable = KVariableFactory.createVariable(_variable, strings[i]);
				_members.add(variable);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getReferenceTypeName()
	 */
	public String getReferenceTypeName() throws DebugException {
		try {
			Integer.parseInt(fValue);
		} catch (NumberFormatException e) {
			return "text";
		}
		return "integer";
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getValueString()
	 */
	public String getValueString() throws DebugException {
		return fValue;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#isAllocated()
	 */
	public boolean isAllocated() throws DebugException {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getVariables()
	 */
	public IVariable[] getVariables() throws DebugException {
		return _members.toArray( new IVariable[_members.size()] );
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#hasVariables()
	 */
	public boolean hasVariables() throws DebugException {
		return _members.size() > 0;
	}

}


