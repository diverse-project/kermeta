/* $Id: KermetaValue.java,v 1.4 2005-12-06 18:53:15 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaValue.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.rmi.RemoteException;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableValue;


/**
 * The KermetaValue corresponds to the displayed value of a variable (repr. as
 * KermetaVariable in the debug view). It could be merged with KermetaVariable as
 * PyDev did, since there is a total dependency between the two classes. (indeed,
 * the value concept as no sense without a variable)
 */
public class KermetaValue extends DebugElement implements IValue {

    /** The debug target */
    KermetaDebugTarget debugTarget;
    
    SerializableValue refValue;
    
    String valueString;
    String valueType;
    long runtimeOID;
    
    /**
     * 
     */
    public KermetaValue(KermetaDebugTarget target, String value, String type, long oid)
    {
    	super(target);
        debugTarget = target;
        valueString = value;
        valueType   = type;
        runtimeOID = oid;
    }

    public KermetaValue(KermetaDebugTarget target, SerializableValue value) {
    	super(target);
        debugTarget = target;
        refValue = value;
        valueString = value.valueString;
        valueType   = value.refTypeName;
        runtimeOID = value.runtimeOID;
	}

	/**
     * @see org.eclipse.debug.core.model.IValue#getReferenceTypeName()
     */
    public String getReferenceTypeName() throws DebugException {
        return valueType;
    }

    /** @see org.eclipse.debug.core.model.IValue#getValueString() */
    public String getValueString() throws DebugException {
        return valueString;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValue#isAllocated()
     */
    public boolean isAllocated() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @Note : this method should not return null otherwise a NullPointerException
     * appears in the debug framework (in DeferredVariable class...)
     * @see org.eclipse.debug.core.model.IValue#getVariables()
     */
    public IVariable[] getVariables() throws DebugException {
        //return debugTarget.getMainThread().getTopStackFrame().getVariables();
    	// Find the object linked to the value
    	IVariable[] ivars = null;
    	if (!valueType.equals(RunnerConstants.IVALUE_PRIMITIVE))
    	{
    		ivars = debugTarget.getRemoteDebugUI().createKermetaVariablesForSerializableValue(this.refValue);
    	}
		if (ivars == null) return new IVariable[0];
    	return ivars;
    }

    /**
     * @return true if the value is associated to a variable, false otherwise.
     * @see org.eclipse.debug.core.model.IValue#hasVariables()
     */
    public boolean hasVariables() throws DebugException {
        return (getVariables() != null && getVariables().length > 0);
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
    public String getModelIdentifier() {
        return getDebugTarget().getModelIdentifier();
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget() */
    public IDebugTarget getDebugTarget() {
        return debugTarget;
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getLaunch() */
    public ILaunch getLaunch() {
        return getDebugTarget().getLaunch();
    }

    public void setValueString(String valueString) {
    	this.valueString = valueString; 
    }

	/**
	 * @return Returns the runtimeOid.
	 */
	public long getRuntimeOid() {
		return runtimeOID;
	}
    
    
}
