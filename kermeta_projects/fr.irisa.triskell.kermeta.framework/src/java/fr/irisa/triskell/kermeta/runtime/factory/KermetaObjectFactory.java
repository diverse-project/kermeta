/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.runtime.factory;

import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaObjectFactory {

	
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
	public KermetaObjectFactory() {
		super();
	}
	
	public void loadtypes(KermetaUnit unit) {
		//TODO : implement that
	}
	
	/*
	protected ArrayList getAllSuperClasses(String class_name) {
		KermetaObject cls = (KermetaObject)classdef_table.get(class_name);
		KermetaObject clsdef = (KermetaObject)cls.getProperties().get("classDefinition");
		ArrayList supercls = (ArrayList)clsdef.getProperties().get("superType");
		for(int i=0; i<supercls.size(); i++) {
			clsdef = (KermetaObject)((KermetaObject)supercls.get(i)).getProperties().get("classDefinition");
		}
	}
	*/
	
	
	public KermetaObject getTypeDefinitionByName(String qname) {
		return (KermetaObject)classdef_table.get(qname);
	}
	
	/**
	 * The meta-class Class (bootstrap)
	 */
	private KermetaObject class_class;
	public KermetaObject getClassClass() {
		if (class_class == null) {
			class_class = new KermetaObject(this, null);
			class_class.setMetaclass(class_class);
			class_class.getProperties().put("classDefinition", classdef_table.get("kermeta::language::structure::Class"));
		}
		return class_class;
	}
	
	
	public KermetaObject createClassFromClassDefinition(KermetaObject class_def) {
		KermetaObject metaclass = new KermetaObject(this, class_class);
		metaclass.getProperties().put("classDefinition", class_def);
		return metaclass;
	}
	 
	
	public KermetaObject createKermetaObject(KermetaObject meta_class) {
		KermetaObject result = new KermetaObject(this, meta_class);
//		TODO : take care of default values here ?
		return result;
	}
	
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public KermetaObject createObjectFromClassName(String class_name) {
		KermetaObject metaclass = (KermetaObject)class_table.get(class_name);
		if (metaclass == null) {
			metaclass = createClassFromClassDefinition((KermetaObject)classdef_table.get(class_name));
			class_table.put(class_name, metaclass);
		}
		KermetaObject result = createKermetaObject(metaclass);
		return result;
	}
	
	protected  KermetaObject class_typeParamBinding_properety = null;
	public  KermetaObject getClass_typeParamBinding_properety() {
		if (class_typeParamBinding_properety == null) {
			KermetaObject class_def = (KermetaObject)this.getClassClass().getProperties().get("classDefinition");
			Iterator it = Collection.getArrayList((KermetaObject)class_def.getProperties().get("ownedAttributes")).iterator();
			while (it.hasNext()) {
				KermetaObject prop = (KermetaObject)it.next();
				if (prop.getProperties().get("name").equals("typeParamBinding")) {
					class_typeParamBinding_properety = prop;
					break;
				}
			}
		
		}
		return class_typeParamBinding_properety;
	}

}
