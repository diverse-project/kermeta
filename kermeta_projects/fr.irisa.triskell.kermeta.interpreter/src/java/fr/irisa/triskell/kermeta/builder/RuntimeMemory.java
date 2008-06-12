/* $Id: RuntimeMemory.java,v 1.19 2008-06-12 07:17:55 ftanguy Exp $
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

import org.kermeta.interpreter.InterpreterPlugin;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.launcher.AbstractKInterpreter;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

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
	
	protected KermetaUnit unit;

	private RuntimeMemoryLoader memoryLoader;
	
	private AbstractKInterpreter _interpreter;
	
	public AbstractKInterpreter getInterpreter() {
		return _interpreter;
	}
	
    public RuntimeMemory(KermetaUnit unit, AbstractKInterpreter interpreter) {
        roFactory = new RuntimeObjectFactory(this);
        this.unit = unit;
        memoryLoader = new RuntimeMemoryLoader(unit,this);
        memoryLoader.init();
        _interpreter = interpreter;
    }
    
    protected void finalize() throws Throwable {
        super.finalize();
        InterpreterPlugin.internalLog.debug("FINALIZE RuntimeMemory ...");
    }
    /**
     * remove as much ref as possible for helping garbage collector
     */
    public void freeJavaMemory() {
    	roFactory = null;
    	unit = null;
    	memoryLoader = null;
    	trueINSTANCE = null;
    	falseINSTANCE = null;
    	voidINSTANCE = null;
    	stdioINSTANCE = null;
    	_interpreter = null;
    }
    
    public void loadKCoreRuntimeObject(KCoreRuntimeObject obj) {
        memoryLoader.loadKCoreRuntimeObject(obj);
	}
    
    public RuntimeObject getRuntimeObjectForFObject(Object object) {
        return memoryLoader.getRuntimeObjectForFObject(object);
    }
    
    public RuntimeObject getRuntimeObjectByOID(long oid) {
    	for ( RuntimeObject next : getRuntimeObjects().values() ) {
    		if ( next.getOId() == oid ) 
    			return next;
    	}
    	return null;
    }
    
    public int getNumberOfObjectCached() {
        return memoryLoader.getNumberOfObjectCached();
    }
    
    /** 
     * @return the hashtable of runtime objects available in memory 
     */
    public Hashtable<Object, RuntimeObject> getRuntimeObjects() {
        return memoryLoader.getRuntimeObjects();
    }
    
    public void clearFObjectFromCache(Object object) {
        memoryLoader.clearFObjectFromCache(object);
    }
    
    public RuntimeObject getTypeDefinitionAsRuntimeObject(String qname)  {
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
    protected void createSingletons(KermetaUnit interpreterbuilder) {
	    //initialize TRUE and FALSE
        trueINSTANCE = new RuntimeObjectImpl(roFactory, null);
        falseINSTANCE =  new RuntimeObjectImpl(roFactory, null);      

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
        return this.roFactory;    
    }
    
    public KermetaUnit getUnit() {
        return unit;
    }

}
