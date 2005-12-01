/* $Id: KermetaValue.java,v 1.3 2005-12-01 18:29:06 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaValue.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;


/**
 * The KermetaValue corresponds to the displayed value of a variable (repr. as
 * KermetaVariable in the debug view). It could be merged with KermetaVariable as
 * PyDev did, since there is a total dependency between the two classes. (indeed,
 * the value concept as no sense without a variable)
 */
public class KermetaValue extends DebugElement implements IValue {

    /** The debug target */
    KermetaDebugTarget debugTarget;
    String valueString;
    
    /**
     * 
     */
    public KermetaValue(KermetaDebugTarget target, String value)
    {
    	super(target);
        debugTarget = target;
        valueString = value;
        	
    }

    /**
     * @see org.eclipse.debug.core.model.IValue#getReferenceTypeName()
     */
    public String getReferenceTypeName() throws DebugException {
    	
        return "pas d'type, pas d'chocolat";
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
     * @see org.eclipse.debug.core.model.IValue#getVariables()
     */
    public IVariable[] getVariables() throws DebugException {
        //return debugTarget.getMainThread().getTopStackFrame().getVariables();
    	return null;
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
}
