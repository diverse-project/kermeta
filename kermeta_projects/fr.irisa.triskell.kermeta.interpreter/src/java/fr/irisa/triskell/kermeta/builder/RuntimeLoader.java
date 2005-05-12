/* $Id: RuntimeLoader.java,v 1.1 2005-05-12 08:19:45 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: RuntimeLoader.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 10, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.builder;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * The facade to load the Runtime representation of Kermeta (the whole interpreter, and 
 * the source code to be executed)
 */
public class RuntimeLoader {

    protected RuntimeMemory runtimeMemory;
    
    /**
     * 
     */
    public RuntimeLoader() {
        super();
        runtimeMemory = new RuntimeMemory();
    }
    
    /**
     * Load the singletons
     * @param unit instance used in order to work with the KermetaUnitFactories attached to it 
     */
    public void loadSingletonInstances(KermetaUnit unit)  {
        runtimeMemory.createSingletons(unit);
    }
    
    /**
     * Initializes the class definitions in the runtimeMemory. Those class definitions will
     * be stored in the hashtable called <code>classDefTable</code> of the runtime memory. 
     */
    public void loadClassDefinitions(KermetaUnit interpreterbuilder) {
        
        //  Create the KMMetaBuilder. "Implicitly" builds the memory of the 
        // interpreter execution by filling the classDefTable hashtable of the
        // (for now static) RuntimeObjectFactory
        KMMetaBuilder metaClassesBuilder = new KMMetaBuilder(interpreterbuilder, this);
        metaClassesBuilder.load();
    }
    
    /**
     * Load the Kermeta whole library.
     * The interpreter.kmt requires Standard.kmt library, which includes
     * the complete Kermeta library.
     */
    public void loadKermetaUnit(KermetaUnit interpreterbuilder)
    {
	    // Construct the RuntimeObject representation of the source code 
	    KMBuilderPass1 builderPass1 = new KMBuilderPass1(interpreterbuilder, this);
	    builderPass1.ppPackage(interpreterbuilder);
    }
    
    public void loadSource()
    {
        
    }
    
    
	/** 
	 * Build all metaclasses RuntimeObjects from the given unit and
	 * units required from it.
	 * @param node a FClassDefinition, or a FClass?
	 * @param nodeMetaClass
	 */
	public RuntimeObject createROFromClassDef(FObject node,RuntimeObject nodeMetaclass)
	{
		RuntimeObject ro_node=nodeMetaclass.getFactory().createRuntimeObject(nodeMetaclass);
		Hashtable data=new Hashtable();
		if (node instanceof FClassDefinition) {
		    // Create an 
			FClass fClass= StructurePackageImpl.init().getStructureFactory().createFClass();
			fClass.setFClassDefinition((FClassDefinition)node);
			data.put("kcoreObject",fClass);
			this.runtimeMemory.getCorrespondanceTable().put(fClass,ro_node);
		}
		else {
			data.put("kcoreObject",node);
			this.runtimeMemory.getCorrespondanceTable().put(node,ro_node);
		}
		ro_node.setData(data);
		return ro_node;
	}
	
	public RuntimeMemory getRuntimeMemory() {
	    return runtimeMemory;
	}
	
    

}
