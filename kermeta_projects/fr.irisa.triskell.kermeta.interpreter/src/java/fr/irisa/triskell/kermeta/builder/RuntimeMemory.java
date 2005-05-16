/* $Id: RuntimeMemory.java,v 1.3 2005-05-16 17:39:13 ffleurey Exp $
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
	
	/**
	 * The correspondance table from where we get IntegerLiterals, 
	 * StringLiterals, and RealLiterals.
	 * - key type is FObject
	 * - value type is the corresponding RuntimeObject
	 */
	private Hashtable correspondanceTable;
	
	
    public RuntimeMemory(KermetaUnit unit) {
        roFactory = new RuntimeObjectFactory(this);
        correspondanceTable = new Hashtable();
        this.unit = unit;
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
		trueINSTANCE = Boolean.createTrue(roFactory);
		falseINSTANCE = Boolean.createFalse(roFactory);
	    // Create the void Instance (should be a singleton)
	    RuntimeObject roVoidType = (RuntimeObject)roFactory.getClassDefTable().get("kermeta::reflection::VoidType");
	    voidINSTANCE=roFactory.createObjectFromClassDefinition(roVoidType);
	    
	   
	    
	    RuntimeObject stdIOmetaClass=(RuntimeObject)roFactory.getClassDefTable().get("kermeta::io::StdIO");
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

    public Hashtable getCorrespondanceTable() {
        return this.correspondanceTable;
    }
    
    public KermetaUnit getUnit() {
        return unit;
    }
}
