/* $Id: KermetaVariable.java,v 1.3 2005-11-23 16:18:59 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaVariable.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * A kermeta variable so that the Variable display window can be set.
 */
public class KermetaVariable implements IVariable {

	protected KermetaDebugTarget debugTarget;
	protected String name;
	protected String type;
	protected IValue value;
	
    /**
     * @param target the debug target
     * @param name the name of the variable (accessed by getName)
     * @param type the type of the variable (accessed by getReferenceTypeName)
     * @param value the value linked to the variable (accessed by getValue)
     */
    public KermetaVariable(KermetaDebugTarget target, String name, String type, IValue value) {
        super();
        debugTarget = target;
        this.name = name;
        this.type = type;
        this.value = value;
        
    }

    /** @see org.eclipse.debug.core.model.IVariable#getValue() */
    public IValue getValue() throws DebugException { return value; }

    /** @see org.eclipse.debug.core.model.IVariable#getName() */
    public String getName() throws DebugException { return name; }

    /** @see org.eclipse.debug.core.model.IVariable#getReferenceTypeName() */
    public String getReferenceTypeName() throws DebugException { return type; }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IVariable#hasValueChanged()
     */
    public boolean hasValueChanged() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
    public String getModelIdentifier() {
        return getDebugTarget().getModelIdentifier();
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget() */
    public IDebugTarget getDebugTarget() {  return debugTarget; }

    /** @see org.eclipse.debug.core.model.IDebugElement#getLaunch() */
    public ILaunch getLaunch() { return getDebugTarget().getLaunch(); }

    /** @see org.eclipse.debug.core.model.IValueModification#setValue(java.lang.String) */
    public void setValue(String expression) throws DebugException {
    	// We should only manipulate KermetaValue instances
    	if (value instanceof KermetaValue)
    		((KermetaValue)value).setValueString(expression);
    	else // FIXME : DebugException shoudl have a non null IStatus argument!
    		RunnerPlugin.getDefault().logError("type of GUI Value should be KermetaValue",
    				new DebugException(null));
    }

    /**
     * @see org.eclipse.debug.core.model.IValueModification#setValue(org.eclipse.debug.core.model.IValue)
     */
    public void setValue(IValue value) throws DebugException {
        this.value = value;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#supportsValueModification()
     */
    public boolean supportsValueModification() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#verifyValue(java.lang.String)
     */
    public boolean verifyValue(String expression) throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#verifyValue(org.eclipse.debug.core.model.IValue)
     */
    public boolean verifyValue(IValue value) throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public KermetaStackFrame getStackFrame()
    {
        return null;
    }

}
