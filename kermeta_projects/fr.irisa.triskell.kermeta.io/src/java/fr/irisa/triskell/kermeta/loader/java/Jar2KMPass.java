/* $Id: Jar2KMPass.java,v 1.5 2006-08-18 09:21:18 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.io
 * File : Jar2KMPass.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 avr. 2006
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.loader.java;

import java.util.Hashtable;
import java.util.jar.JarEntry;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


/**
 * This class contains the basis to navigate a jar and then to be refined for 
 * the various passes needed to build a KermetaUnit (more precisely a JarUnit) from it
 *
 */
public abstract class Jar2KMPass {
	protected JarUnit builder;
	final static public Logger internalLog = LogConfigurationHelper.getLogger("Jar2KM");
	
	final static public String JARUNIT_TAG_NAME = "IsProxyForJar";
	final static public String INITOPERATION_TAG_NAME = "IsInitOperation";
	final static public String JAVAOPERATION_TAG_NAME = "IsJavaOperation";
	
	
	/** the constructor */
	public Jar2KMPass(JarUnit builder) {
		this.builder = builder;
	}
	/** entry point for processing this pass */
	public abstract void process();
	
	/* --------------------------------------------- */
	/* Useful methods for running the various passes */
	
    /**
     * @param jentry
     * @return the class name for the given JavaEntry, return null if the entry is not a class
     */
    public String getClassName(JarEntry jentry){
    	String fileName = jentry.getName();
		if(fileName.endsWith(".class")){
			fileName = fileName.substring(0, fileName.length()-6);
			// the current name use an OS format
			fileName = fileName.substring(fileName.lastIndexOf("/")+1);
			return fileName;
		}
		else return null;
    }
    /**
     * @param jentry
     * @return the package qualified name for the given JavaEntry class, return null if the entry is not a class
     */
    public String getPackageQualifiedName(JarEntry jentry){
    	String fileName = jentry.getName();
		if(fileName.endsWith(".class")){
			// strip extension
			fileName = fileName.substring(0, fileName.length()-6);
			// get the package name in operating system format
			fileName = fileName.substring(0,fileName.lastIndexOf("/"));
			// now in kermeta
			fileName = fileName.replaceAll("/","::");
			return fileName;
		}
		else return null;
    }
    
    /** returns the kermeta qualified name of a given java Class */
    public String getQualifiedName(Class c){ 
    	String cname = c.getCanonicalName();
    	if(cname == null) {
    		internalLog.error("not able to retreive canonical name for class " +c.toString());
    		c.getCanonicalName();
    	}
    	return cname.replaceAll("\\.","::");
    }
    
    protected Type getTypeByID(String name) {
	    boolean isUnknwonJavaObject = false;
		if (name.equals("void")) {
			return builder.struct_factory.createVoidType();
		}
		if (primitive_types_mapping.containsKey(name)) {
        	name = (String)primitive_types_mapping.get(name);
        }
        //TypeDefinition type = builder.typeDefinitionLookup(name);
        
	    TypeDefinition typeDef = builder.getTypeDefinitionByName(name);
	    if (typeDef == null) {
	        typeDef = builder.getTypeDefinitionByName("kermeta::standard::UnknownJavaObject");
	        if(typeDef != null){
	        	builder.messages.addWarning("Cannot resolve type '"+name+"', replaced by kermeta::standard::UnknownJavaObject" ,null);
	        	isUnknwonJavaObject = true;
	        }
	        else{
	        	builder.messages.addError("Cannot resolve type '"+name+"' nor type kermeta::standard::UnknownJavaObject; is the framework uptodate ?" ,null);
	        	return null;
	        }
	    }
	    if (typeDef instanceof Type) return (Type)typeDef;
	    else {
	        ClassDefinition cd = (ClassDefinition)typeDef;
	        fr.irisa.triskell.kermeta.language.structure.Class result = builder.struct_factory.createClass();
	        //result.setFName(cd.getFName());
	        if (isUnknwonJavaObject){
	        	// add a tag so we can retrieve the original object type name
	        	// question : maybe it would be better to have a real type UnknownJavaObject instead of a simple alias ?
	        	Tag tag = builder.struct_factory.createTag();
	        	tag.setName("UnknownJavaObject");
	        	tag.setValue(name);
	        	result.getTag().add(tag);
	        }
	        result.setTypeDefinition(cd);
	        return result;
	    }
	}
    
    public static Hashtable<String,String> primitive_types_mapping;
	
	static {
		primitive_types_mapping = new Hashtable<String,String>();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("long", 				"kermeta::standard::Integer");
		primitive_types_mapping.put("byte", 				"kermeta::standard::Integer");
		primitive_types_mapping.put("java::lang::Integer", 	"kermeta::standard::Integer");
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java::lang::Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java::lang::String", 	"kermeta::standard::String");
		primitive_types_mapping.put("char", 				"kermeta::standard::Character");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
	}
}
