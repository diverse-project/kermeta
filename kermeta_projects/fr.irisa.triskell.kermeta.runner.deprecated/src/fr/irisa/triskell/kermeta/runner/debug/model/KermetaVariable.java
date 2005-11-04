/* $Id: KermetaVariable.java,v 1.1 2005-11-04 17:01:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaVariable.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

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

    /**
     * 
     */
    public KermetaVariable() {
        super();
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IVariable#getValue()
     */
    public IValue getValue() throws DebugException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IVariable#getName()
     */
    public String getName() throws DebugException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IVariable#getReferenceTypeName()
     */
    public String getReferenceTypeName() throws DebugException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IVariable#hasValueChanged()
     */
    public boolean hasValueChanged() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
     */
    public String getModelIdentifier() {
        // TODO Auto-generated method stub
        return RunnerPlugin.getUniqueIdentifier();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
     */
    public IDebugTarget getDebugTarget() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
     */
    public ILaunch getLaunch() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#setValue(java.lang.String)
     */
    public void setValue(String expression) throws DebugException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#setValue(org.eclipse.debug.core.model.IValue)
     */
    public void setValue(IValue value) throws DebugException {
        // TODO Auto-generated method stub

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
