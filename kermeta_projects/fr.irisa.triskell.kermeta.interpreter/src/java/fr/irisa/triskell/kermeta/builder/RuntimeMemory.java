/* $Id: RuntimeMemory.java,v 1.4 2005-05-20 12:54:43 ffleurey Exp $
 * Project: Kermeta (First iteration)
 * File: RuntimeMemory.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 11, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.builder;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
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
	
	
    public RuntimeMemory(KermetaUnit unit) {
        roFactory = new RuntimeObjectFactory(this);
        this.unit = unit;
        memoryLoader = new RuntimeMemoryLoader(unit,this);
        memoryLoader.init();
    }
    
    public RuntimeObject getRuntimeObjectForFObject(FObject object)
    {
        return memoryLoader.getRuntimeObjectForFObject(object);
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
	    RuntimeObject roVoidType = getTypeDefinitionAsRuntimeObject("kermeta::reflection::VoidType");
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
}
