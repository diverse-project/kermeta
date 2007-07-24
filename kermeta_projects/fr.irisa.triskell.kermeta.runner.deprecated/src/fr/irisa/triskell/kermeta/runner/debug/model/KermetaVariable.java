/* $Id: KermetaVariable.java,v 1.6 2007-07-24 13:47:19 ftanguy Exp $
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
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableVariable;

/**
 * A kermeta variable so that the Variable display window can be set.
 * TODO : for the moment kermetaVariables are re-created each time we
 * access the callframe that contains them. Next time we should only modify the values
 * (with setValue)
 */
public class KermetaVariable extends DebugElement implements IVariable {

	protected KermetaDebugTarget debugTarget;
	
	protected SerializableVariable refVariable;
	
	protected String name;
	protected String type;
	protected IValue value;
	 
	protected boolean hasChanged;
	
	public KermetaVariable(KermetaDebugTarget target, SerializableVariable v)
	{
		super(target);
		this.debugTarget = target;
		this.refVariable = v;
		this.name = v.name;
        this.type = v.type;
        this.value = new KermetaValue(target, v.value);
	}
	
    /**
     * @param target the debug target
     * @param name the name of the variable (accessed by getName)
     * @param type the type of the variable (accessed by getReferenceTypeName)
     * @param value the value linked to the variable (accessed by getValue)
     */
    public KermetaVariable(KermetaDebugTarget target, String name, String type, IValue value) {
    	super(target);
        debugTarget = target;
        this.name = name;
        this.type = type;
        this.value = value;
        this.hasChanged = true;
    }
    
    
    /** @see org.eclipse.debug.core.model.IVariable#getValue() */
    public IValue getValue() throws DebugException
    { 
    	this.hasChanged = false;
    	return value;
    }

    /** @see org.eclipse.debug.core.model.IVariable#getName() */
    public String getName() throws DebugException { return name; }

    /** @see org.eclipse.debug.core.model.IVariable#getReferenceTypeName() */
    public String getReferenceTypeName() throws DebugException { 
    	return type; }

    /** @see org.eclipse.debug.core.model.IVariable#hasValueChanged() */
    public boolean hasValueChanged() throws DebugException {
    	return false; }

    /** @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier() */
    public String getModelIdentifier() {
        return getDebugTarget().getModelIdentifier();
    }

    /** @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget() */
    public IDebugTarget getDebugTarget() { return debugTarget; }

    /** @see org.eclipse.debug.core.model.IDebugElement#getLaunch() */
    public ILaunch getLaunch() { return getDebugTarget().getLaunch(); }

    /** @see org.eclipse.debug.core.model.IValueModification#setValue(java.lang.String) */
    public void setValue(String expression) throws DebugException {
    	System.err.println("set Value (IVariable) : " + expression);
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
        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#verifyValue(java.lang.String)
     */
    public boolean verifyValue(String expression) throws DebugException {
    	System.err.println("verify Value (IVariable)");
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IValueModification#verifyValue(org.eclipse.debug.core.model.IValue)
     */
    public boolean verifyValue(IValue value) throws DebugException {
    	System.err.println("verify Value 2(IVariable)");
        return false;
    }
    
	//PyDev Only create one instance of an empty array to be returned
	private static final IVariable[] EMPTY_IVARIABLE_ARRAY = new IVariable[0]; 

	
}
