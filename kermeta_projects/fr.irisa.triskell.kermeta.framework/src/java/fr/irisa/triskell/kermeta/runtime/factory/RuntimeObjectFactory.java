/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
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
	
	
	public RuntimeObject getTypeDefinitionByName(String qname) {
		return (RuntimeObject)classdef_table.get(qname);
	}
	
	/**
	 * The meta-class Class (bootstrap)
	 */
	private RuntimeObject class_class;
	public void setClassClass(FClassDefinition classdef) {
		class_class = new RuntimeObject(this, null);
		class_class.setMetaclass(class_class);
		class_class.setData(new Hashtable());
		class_class.getData().put("classDefinition",classdef);
		class_class.getProperties().put("classDefinition",class_class);
	}
	public RuntimeObject getClassClass() {
		return class_class;
	}
	
	
	public RuntimeObject createClassFromClassDefinition(RuntimeObject class_def) {
		RuntimeObject metaclass = new RuntimeObject(this, class_class);
		metaclass.getProperties().put("classDefinition", class_def);
		if (class_def.getProperties().containsKey("typeParameter")) {
			//parametric class creation : add a typeParameterBinding collection to recoed parametric type bindings.
			metaclass.getProperties().put("typeParameterBinding",Collection.createCollection((RuntimeObject)this.getClassDefTable().get("kermeta::language::structure::TypeVariableBinding")));
		}
		return metaclass;
	}
	 
	
	public RuntimeObject createRuntimeObject(RuntimeObject meta_class) {
		RuntimeObject result = new RuntimeObject(this, meta_class);
//		TODO : take care of default values here ?
		result.setData(new Hashtable());
		result.getProperties().put("classDefinition", meta_class);
		return result;
	}
	
	public RuntimeObject createClassDefinition(FClassDefinition classdef) {
		RuntimeObject result=new RuntimeObject(this,class_class);
		result.setData(new Hashtable());
		result.getData().put("kcoreObject",classdef);
		return result;
	}
	
	public RuntimeObject createPrimitiveType(FPrimitiveType typedef) {
		RuntimeObject result=new RuntimeObject(this,class_class);
		result.setData(new Hashtable());
		result.getData().put("FPrimitiveType",typedef);
		return result;
	}

	public RuntimeObject createTypeVariable(FTypeVariable typevar) {
		RuntimeObject result=new RuntimeObject(this,(RuntimeObject)this.getClassDefTable().get("kermeta::reflection::TypeVariable"));
		result.setData(new Hashtable());
		result.getData().put("primitiveType",typevar);
		return result;
	}
	/**
	 * Create a new instance of a class (the class should not have any type parameter)
	 * @param class_name the qualified name of the class to instanciate
	 * @return a new instance of the class
	 */
	public RuntimeObject createObjectFromClassName(String class_name) {
		RuntimeObject metaclass = (RuntimeObject)class_table.get(class_name);
		if (metaclass == null) {
			metaclass = createClassFromClassDefinition((RuntimeObject)classdef_table.get(class_name));
			class_table.put(class_name, metaclass);
		}
		RuntimeObject result = createRuntimeObject(metaclass);
		return result;
	}
	
	protected  RuntimeObject class_typeParamBinding_properety = null;
	public  RuntimeObject getClass_typeParamBinding_properety() {
		if (class_typeParamBinding_properety == null) {
			RuntimeObject class_def = (RuntimeObject)this.getClassClass().getProperties().get("classDefinition");
			Iterator it = Collection.getArrayList((RuntimeObject)class_def.getProperties().get("ownedAttributes")).iterator();
			while (it.hasNext()) {
				RuntimeObject prop = (RuntimeObject)it.next();
				if (prop.getProperties().get("name").equals("typeParamBinding")) {
					class_typeParamBinding_properety = prop;
					break;
				}
			}
		
		}
		return class_typeParamBinding_properety;
	}

}
