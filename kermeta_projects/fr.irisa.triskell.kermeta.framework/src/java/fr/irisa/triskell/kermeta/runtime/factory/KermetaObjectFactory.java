/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.runtime.factory;

import java.util.ArrayList;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;

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
	 * A command to execute just after the creation of a instance a a class
	 * indexed by the class qualified name
	 */
	protected Hashtable post_creation_commands = new Hashtable();
	
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
	/**
	 * Get the creation command for a particular class
	 * returns null if there is no specific commant for the specified class
	 */
	protected CreationCommand getCommandForClass(String class_name) {
		CreationCommand result = (CreationCommand)post_creation_commands.get(class_name);
		return result;
	}
	
	/**
	 * The meta-class Class (bootstrap)
	 */
	private KermetaObject class_class;
	protected KermetaObject getClassClass() {
		if (class_class == null) {
			class_class = new KermetaObject(null);
			class_class.setMetaclass(class_class);
			class_class.getProperties().put("classDefinition", classdef_table.get("kermeta::structure::Class"));
		}
		return class_class;
	}
	
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public KermetaObject createObject(String class_name) {
		KermetaObject metaclass = (KermetaObject)class_table.get(class_name);
		if (metaclass == null) {
			metaclass = new KermetaObject(class_class);
			metaclass.getProperties().put("classDefinition", classdef_table.get(class_name));
			class_table.put(class_name, metaclass);
		}
		KermetaObject result = new KermetaObject(metaclass);
		//TODO : take care of default values here
		CreationCommand command = getCommandForClass(class_name);
		// TODO : it should call the creation commands of all superclasses
		if(command != null) command.execute(result);
		return result;
	}

}
