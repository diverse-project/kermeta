/* $Id: RuntimeMemory.java,v 1.1 2005-05-12 08:19:45 zdrey Exp $
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

import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;

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
	public RuntimeObject metametaClass=null;
	/** self, void, in, out are singletons */
	public RuntimeObject selfINSTANCE=null;
	public RuntimeObject voidINSTANCE=null;
	public RuntimeObject stdioINSTANCE=null;
	/** To be deprecated..*/
	public FClass stdioFClass=null;
	/** the RuntimeObject of the Interpreter */
	public Interpreter theInterpreter=null;
	/** The runtime object corresponding to the instance of the Interpreter */
	public RuntimeObject interpreterInstance=null;

	/**
	 * The correspondance table from where we get IntegerLiterals, 
	 * StringLiterals, and RealLiterals.
	 * - key type is FObject
	 * - value type is the corresponding RuntimeObject
	 */
	private Hashtable correspondanceTable;
	
	
    public RuntimeMemory() {
        roFactory = new RuntimeObjectFactory();
        correspondanceTable = new Hashtable();
    }
    
    /**
     * Construct the singletons that will be used throughout the whole
     * execution. This method will be replaced later by the implementation
     * of the "once" construction, inspired from Eiffel.
     * This method must be executed after the classDefTable is filled!! (by the KMMetaBuilder)
     * 
	 * @param interpreterbuilder The kermeta unit of the interpreter.kmt file
     */
    public void createSingletons(KermetaUnit interpreterbuilder)
    {
	    //initialize TRUE and FALSE
		fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.initInstances(roFactory);
	    // Create the void Instance (should be a singleton)
	    RuntimeObject roVoidType = (RuntimeObject)roFactory.getClassDefTable().get("kermeta::reflection::VoidType");
	    voidINSTANCE=roFactory.createRuntimeObject(roVoidType);
	    
	    // Create the self Instance (should be a singleton)
	    RuntimeObject roSelfType = (RuntimeObject)roFactory.getClassDefTable().get("kermeta::reflection::SelfType");
	    selfINSTANCE=roFactory.createRuntimeObject(roSelfType);
	    
	    RuntimeObject stdIOmetaClass=(RuntimeObject)roFactory.getClassDefTable().get("kermeta::io::StdIO");
	    stdioINSTANCE=roFactory.createRuntimeObject(stdIOmetaClass);
	    stdioFClass=interpreterbuilder.struct_factory.createFClass();
	    stdioFClass.setFClassDefinition(((FClass)stdIOmetaClass.getData().get("kcoreObject")).getFClassDefinition());
	    
    }
    
    /**
     * 
     * @return the runtime object factory
     */
    public RuntimeObjectFactory getROFactory() {
        return this.roFactory;    }

    public Hashtable getCorrespondanceTable() {
        return this.correspondanceTable;
    }
    
}
