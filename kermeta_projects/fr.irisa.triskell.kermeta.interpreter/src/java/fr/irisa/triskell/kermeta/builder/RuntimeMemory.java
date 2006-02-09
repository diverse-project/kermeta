/* $Id: RuntimeMemory.java,v 1.12 2006-02-09 13:05:16 zdrey Exp $
 * Project: Kermeta.interpreter
 * File: RuntimeMemory.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 11, 2005
 * Authors: zdrey, ffleurey, dvojtise
 */
package fr.irisa.triskell.kermeta.builder;

import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * The runtime memory of a program that is currently executed
 */
public class RuntimeMemory {

    /*
     * ATTRIBUTES
     * 
     */
    /** The RO factory for the entities of a Kermeta program */
    protected RuntimeObjectFactory roFactory;
	/** metametaClass : is the class  "Class"*/
	//public RuntimeObject metametaClass=null;
	/** self, void, in, out are singletons */
	
	public RuntimeObject trueINSTANCE;
	public RuntimeObject falseINSTANCE;
	
	public RuntimeObject voidINSTANCE;
	public RuntimeObject stdioINSTANCE;
	/** To be deprecated..*/
	public FClass stdioFClass=null;
	
	protected KermetaUnit unit;

	private RuntimeMemoryLoader memoryLoader;
	
	private ExpressionInterpreter currentInterpreter;
	
    public RuntimeMemory(KermetaUnit unit) {
        roFactory = new RuntimeObjectFactory(this);
        this.unit = unit;
        memoryLoader = new RuntimeMemoryLoader(unit,this);
        memoryLoader.init();
    }
    
    protected void finalize() throws Throwable {
        super.finalize();
        KermetaUnit.internalLog.debug("FINALIZE RuntimeMemory ...");
    }
    /**
     * remove as much ref as possible for helping garbage collector
     */
    public void freeJavaMemory()
    {
    	roFactory = null;
    	unit = null;
    }
    
    public void loadKCoreRuntimeObject(KCoreRuntimeObject obj) {
        memoryLoader.loadKCoreRuntimeObject(obj);
	}
    
    public RuntimeObject getRuntimeObjectForFObject(FObject object)
    {
        return memoryLoader.getRuntimeObjectForFObject(object);
    }
    
    public RuntimeObject getRuntimeObjectByOID(long oid)
    {
    	Iterator it = getRuntimeObjects().values().iterator();
    	RuntimeObject result = null;
    	while (it.hasNext() && result == null)
    	{
    		RuntimeObject next = (RuntimeObject)it.next();
    		if (next.getOId() == oid) result = next;
    	}
    	return result;
    }
    
    public int getNumberOfObjectCached() {
        return memoryLoader.getNumberOfObjectCached();
    }
    
    /** @return the hashtable of runtime objects available in memory */
    public Hashtable<FObject, RuntimeObject> getRuntimeObjects()
    {
        return memoryLoader.getRuntimeObjects();
    }
    
    public void clearFObjectFromCache(FObject object)
    {
        memoryLoader.clearFObjectFromCache(object);
    }
    
    public RuntimeObject getTypeDefinitionAsRuntimeObject(String qname) 
    {
        return memoryLoader.getTypeDefinitionFromQualifiedName(qname);
    }
    
    /**
     * Construct the singletons that will be used throughout the whole
     * execution. This method will be replaced later by the implementation
     * of the "once" construction, inspired from Eiffel.
     * This method must be executed after the classDefTable is filled!! (by the KMMetaBuilder)
     * 
	 * @param interpreterbuilder The kermeta unit of the interpreter.kmt file
     */
    protected void createSingletons(KermetaUnit interpreterbuilder)
    {
	    //initialize TRUE and FALSE
        trueINSTANCE = new RuntimeObject(roFactory, null);
        falseINSTANCE =  new RuntimeObject(roFactory, null);
        
        
		Boolean.createTrue(roFactory, trueINSTANCE);
		Boolean.createFalse(roFactory, falseINSTANCE);
	    
		// Create the void Instance (should be a singleton)
	    RuntimeObject roVoidType = getTypeDefinitionAsRuntimeObject("kermeta::standard::Void");
	    voidINSTANCE=roFactory.createObjectFromClassDefinition(roVoidType);
	    
	   
	    
	    RuntimeObject stdIOmetaClass= getTypeDefinitionAsRuntimeObject("kermeta::io::StdIO");
	    stdioINSTANCE=roFactory.createObjectFromClassDefinition(stdIOmetaClass);
	    
    }
    
    public RuntimeObject getRuntimeObjectForBoolean(boolean value) {
        if (value) return trueINSTANCE;
        else return falseINSTANCE;
    }
    
    /**
     * 
     * @return the runtime object factory
     */
    public RuntimeObjectFactory getROFactory() {
        return this.roFactory;    }

    
    public KermetaUnit getUnit() {
        return unit;
    }
    public ExpressionInterpreter getCurrentInterpreter() {
        return currentInterpreter;
    }
    public void setCurrentInterpreter(ExpressionInterpreter currentInterpreter) {
        this.currentInterpreter = currentInterpreter;
    }
}
