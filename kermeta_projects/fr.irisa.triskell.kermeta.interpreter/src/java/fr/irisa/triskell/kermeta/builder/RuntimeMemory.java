/* $Id: RuntimeMemory.java,v 1.21 2008-06-18 11:18:50 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.launcher.AbstractKInterpreter;
import fr.irisa.triskell.kermeta.runtime.KCoreRuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

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
	
	/**
	 * Convenient cache for often used type
	 * this avoid to recreate them too often  
	 * NOTE : Maybe we can generalize this with other classdefinition and use a nicer hashtable cache ?
	 */
	protected fr.irisa.triskell.kermeta.language.structure.Class collectionOfObjectCacheClass;
	public fr.irisa.triskell.kermeta.language.structure.Class getCollectionOfObjectClass(){
		if (collectionOfObjectCacheClass == null){
			// Type collection of object
			Class coll_class = StructureFactory.eINSTANCE.createClass();    
		    coll_class.setTypeDefinition((ClassDefinition)getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Collection"));
		    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
		    binding.setVariable((TypeVariable)coll_class.getTypeDefinition().getTypeParameter().get(0));
		    
		    Class object_class = StructureFactory.eINSTANCE.createClass();   
		    object_class.setTypeDefinition((ClassDefinition)getUnit().getTypeDefinitionByQualifiedName("kermeta::language::structure::Object"));
	
		    
		    // Set the param binding type
		    binding.setType(object_class);
		    // Add to type param bindings the binding
		    coll_class.getTypeParamBinding().add(binding);
		    collectionOfObjectCacheClass = coll_class;
		}
	    return collectionOfObjectCacheClass;

	}
	
	protected KermetaUnit unit;
    protected long time = System.currentTimeMillis();

	private RuntimeMemoryLoader memoryLoader;
	
	private AbstractKInterpreter _interpreter;
	
	public AbstractKInterpreter getInterpreter() {
		return _interpreter;
	}
	
	protected TypeCheckerContext _typecheckerContext;
	/** connexion to the typechecker that created this memory: used for creating new types
	 * 
	 * @return
	 */
	public TypeCheckerContext getTypeCheckerContext(){
		return _typecheckerContext;
	}
	
	/** list of EPackage that have been used to load or save model	
	 * the key is the NSURI, (used to avoid reloading a resource with the save NSURI)
	 * this helps to deal with the problem of classcast exception when saving instances created from various version in memory of the same MM
	 */
	//public Hashtable<String,EPackage> mmEPackages = new Hashtable<String,EPackage>();
	public Registry interpreterEPackageRegistry = new EPackageRegistryImpl();
	
    public RuntimeMemory(KermetaUnit unit, AbstractKInterpreter interpreter, TypeCheckerContext typecheckerContext) {
        roFactory = new RuntimeObjectFactory(this);
        this.unit = unit;
        this._typecheckerContext = typecheckerContext;
        memoryLoader = new RuntimeMemoryLoader(unit,this);
        memoryLoader.init();
        _interpreter = interpreter;
    }
    
    protected void finalize() throws Throwable {
        super.finalize();
        InterpreterPlugin.internalLog.debug("FINALIZE RuntimeMemory ...");
        time = System.currentTimeMillis() - time;
		InterpreterPlugin.internalLog.debug("    RuntimeMerory up time (ms) : " + time);
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
    	if(memoryLoader != null)
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
