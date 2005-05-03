/* $Id: RuntimeObjectFactory.java,v 1.7 2005-05-03 18:30:28 zdrey Exp $
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

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;

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
	protected Hashtable classdef_table = new Hashtable();
	
	/**
	 * A cache of class already used.
	 * To avoid creating a class for each object created.
	 * Indexed by the class qualified name
	 */
	protected Hashtable class_table = new Hashtable();
	
	/**
	 * The constructor
	 */
	public RuntimeObjectFactory() {
		super();
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
	public void setClassClass(FClassDefinition classdef) {
		class_class = new RuntimeObject(this, null);
		class_class.setMetaclass(class_class);
		class_class.setData(new Hashtable());
		class_class.getData().put("kcoreObject",classdef);
	}
	
	
	public RuntimeObject getClassClass() {
		return class_class;
	}
	
	
	/**
	 * create the Runtime Object of class Class which is the meta class of all 
	 * the classDefinitions
	 * @param class_def the class definition from which we create the class Class RO
	 * @return the RuntimeObject of class Class linked to the given classDefinition
	 * History :
	 * (3/5/2005) feed the RuntimeObject "getData" representing the class Class
	 */
	public RuntimeObject createClassFromClassDefinition(RuntimeObject class_def) {
		RuntimeObject metaclass = new RuntimeObject(this, class_class);
		metaclass.setData(new Hashtable());
		metaclass.getData().put("kcoreObject", class_def.getData().get("kcoreObject"));
		metaclass.getProperties().put("classDefinition", class_def);
		if (class_def.getProperties().containsKey("typeParameter")) {
			//parametric class creation : add a typeParameterBinding collection to recoed parametric type bindings.
			metaclass.getProperties().put("typeParameterBinding",Collection.createCollection((RuntimeObject)this.getClassDefTable().get("kermeta::language::structure::TypeVariableBinding")));
		}
		return metaclass;
	}
	 
	/**
	 * Create a new RuntimeObject given its meta_class.
	 * @param meta_class the RuntimeObject repr. of the meta class to instanciate
	 * @return a RuntimeObject which is an "instance" of meta_class.
	 */
	public RuntimeObject createRuntimeObject(RuntimeObject meta_class) {
		RuntimeObject result = new RuntimeObject(this, meta_class);
//		TODO : take care of default values here ?
		result.setData(new Hashtable());
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
		RuntimeObject metaclass = (RuntimeObject)this.getClassDefTable().get(class_name);
		if (metaclass == null) {
			System.err.println("SHOULD NEVER OCCUR...");
/*			metaclass = createClassFromClassDefinition((RuntimeObject)classdef_table.get(class_name));
			class_table.put(class_name, metaclass);*/
		}
		RuntimeObject result = createRuntimeObject(metaclass);
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

}
