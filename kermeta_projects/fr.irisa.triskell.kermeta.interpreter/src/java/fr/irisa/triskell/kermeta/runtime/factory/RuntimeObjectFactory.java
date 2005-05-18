/* $Id: RuntimeObjectFactory.java,v 1.2 2005-05-18 16:37:24 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mars 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr>
 */
package fr.irisa.triskell.kermeta.runtime.factory;

import java.util.Hashtable;
import java.util.Iterator;


import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.StructurePackage;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class RuntimeObjectFactory {

	
	/**
	 * All loaded types definition.
	 * Indexed by their qualifed names
	 */
	private Hashtable classdef_table = new Hashtable();
	
	/**
	 * A cache of class already used.
	 * To avoid creating a class for each object created.
	 * Indexed by the class qualified name
	 */
	private Hashtable class_table = new Hashtable();
	
	protected RuntimeMemory memory;
	
	protected KermetaIOStream stream = null;
	
	StructureFactory struct_factory;
	
	/**
	 * The constructor
	 */
	public RuntimeObjectFactory(RuntimeMemory memory) {
	    super();
	    this.memory = memory;
	    // Set by default
	    this.stream = new SystemIOStream();
	    struct_factory = StructurePackageImpl.init().getStructureFactory();
	}
	
	public void loadtypes(KermetaUnit unit) {
		//TODO : implement that
	}
	
	public Hashtable getClassDefTable() {
		return this.classdef_table;
	}
	
	
	public RuntimeObject getTypeDefinitionByName(String qname) {
		return (RuntimeObject)classdef_table.get(qname);
	}
	
	/**
	 * The meta-class Class (bootstrap)
	 */
	private RuntimeObject class_class;
	
	/**
	 * Set the metaclass Class : it creates a new runtime object specific
	 * to the class Class
	 * @param classdef the FClassDefinition corresponding to this class
	 */
	public void setClassClassFromFClass(FClass fclass) {
		class_class = new RuntimeObject(this, null);
		class_class.setMetaclass(class_class);
		class_class.setData(new Hashtable());
		class_class.getData().put("kcoreObject",fclass);
	}
	
	
	public RuntimeObject getClassClass() {
		return class_class;
	}
	
	/**
	 * Create a new RuntimeObject given its meta_class.
	 * @param meta_class the RuntimeObject repr. of the meta class to instanciate
	 * @return a RuntimeObject which is an "instance" of meta_class.
	 */
	public RuntimeObject createRuntimeObjectFromClass(RuntimeObject meta_class) {
		RuntimeObject result = new RuntimeObject(this, meta_class);
//		TODO : take care of default values here ?
		//result.setData(new Hashtable());
		return result;
	}
	
	/**
	 * Mainly used by KMMetaBuilder
	 * @param typevar the type variable that of the type parameters of a parametric class
	 * @return a runt
	 */
	public RuntimeObject createTypeVariable(FTypeVariable typevar) {
		RuntimeObject result=new RuntimeObject(this,(RuntimeObject)this.getClassDefTable().get("kermeta::reflection::TypeVariable"));
		result.setData(new Hashtable()); 
		result.getData().put("kcoreObject",typevar);
		return result;
	}
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public RuntimeObject createObjectFromClassName(String class_name) {
	    
		RuntimeObject roclassdef = (RuntimeObject)this.getClassDefTable().get(class_name);

		RuntimeObject result = createObjectFromClassDefinition(roclassdef);

		return result;
	}
	
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public RuntimeObject createObjectFromClassDefinition(RuntimeObject roclassdef) {
	    RuntimeObject roclass = getClassForClassDefinition(roclassdef);	
		RuntimeObject result = createRuntimeObjectFromClass(roclass);
		return result;
	}
	
	/**
	 * This only work for classes that have no type parameters
	 * @param roclassdef
	 * @return
	 */
	public RuntimeObject getClassForClassDefinition(RuntimeObject roclassdef) {
	    RuntimeObject result = (RuntimeObject)class_table.get(roclassdef);
	    if (result == null) {
	        result = createRuntimeObjectFromClass(getClassClass());
	        result.getProperties().put("classDefinition", roclassdef);
	        FClass fclass = struct_factory.createFClass();
	        fclass.setFClassDefinition((FClassDefinition)roclassdef.getData().get("kcoreObject"));
	        result.getData().put("kcoreObject", fclass);
	    }
	    return result;
	}
	
	protected  RuntimeObject class_typeParamBinding_property = null;
	
	/**
	 * 
	 * @return the RuntimeObject corresponding to the property "typeParamBinding"
	 */
	public  RuntimeObject getClass_typeParamBinding_property()
	{
		if (class_typeParamBinding_property == null) {
			RuntimeObject class_def = this.getClassClass();
			System.err.println("getClass_typeParamBinding_property:"+class_def.getProperties());
			Iterator it = Collection.getArrayList((RuntimeObject)class_def.getProperties().get("ownedAttributes")).iterator();
			while (it.hasNext()) {
				RuntimeObject prop = (RuntimeObject)it.next();
				if (prop.getProperties().get("name").equals("typeParamBinding")) {
					class_typeParamBinding_property = prop;
					break;
				}
			}
		
		}
		return class_typeParamBinding_property;
	}

	public KermetaIOStream getKermetaIOStream()
	{
	    return stream;
	}
	
	public void setKermetaIOStream(KermetaIOStream pStream)
	{
	    stream = pStream;
	}
	
    public RuntimeMemory getMemory() {
        return memory;
    }
}
