/* $Id: Jar2KMPass.java,v 1.16 2008-05-27 12:59:49 dvojtise Exp $
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

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Hashtable;
import java.util.jar.JarEntry;

import org.apache.log4j.Logger;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

import org.kermeta.log4j.util.LogConfigurationHelper;


/**
 * This class contains the basis to navigate a jar and then to be refined for 
 * the various passes needed to build a KermetaUnit (more precisely a JarUnit) from it
 *
 */
public abstract class Jar2KMPass {
	protected KermetaUnit builder;
	final static public Logger internalLog = LogConfigurationHelper.getLogger("Jar2KM");
	
	final static public String JARUNIT_TAG_NAME = "IsProxyForJar";
	final static public String INITOPERATION_TAG_NAME = "IsInitOperation";
	final static public String JAVAOPERATION_TAG_NAME = "IsJavaOperation";
	final static public String JAVAMETHODINDEX_TAG_NAME = "JavaMethodIndex";
	final static public String JAVACONSTRUCTORINDEX_TAG_NAME = "JavaConstructorIndex";
	final static public String IS_PROXY_FOR_JAVA_TYPE = "IsProxyForJavaType";
	
	public int processedJavaClasses = 0; // used to get user feedback in case of OutOfMemory crash ...
	
	/** the constructor */
	public Jar2KMPass(KermetaUnit builder) {
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
    
    public String getQualifiedName(java.lang.reflect.Type t){
    	if(t instanceof Class) return getQualifiedName((Class) t);
    	else if(t instanceof GenericArrayType){
			GenericArrayType gatType = (GenericArrayType)t;
			// type :		
			return getQualifiedName(gatType.getGenericComponentType());
		}
	/*	else if(t instanceof ParameterizedType){
			ParameterizedType ptType = (ParameterizedType)t;
			ptType.
		}*/
		else if(t instanceof TypeVariable){
			TypeVariable tvType = (TypeVariable)t;
			// tvType.getName(); we should use that when we will be able to get parametrized classe 

			return "kermeta::standard::Object";
		}
		else if(t instanceof WildcardType){
			WildcardType wtType = (WildcardType)t;
			return "kermeta::standard::Object";
		}
    	return "<unknown>";
    }
    
    protected Type getTypeByID(String name) {
	    boolean isUnknownJavaObject = false;
		if (name.equals("void")) {
			return StructureFactory.eINSTANCE.createVoidType();
		}
		if (primitive_types_mapping.containsKey(name)) {
        	name = (String)primitive_types_mapping.get(name);
        }
        //TypeDefinition type = builder.typeDefinitionLookup(name);
        
	    TypeDefinition typeDef = builder.getTypeDefinitionByName(name);
	    if (typeDef == null) {
	        typeDef = builder.getTypeDefinitionByName("kermeta::standard::UnknownJavaObject");
	        if(typeDef != null){
	        	builder.warning("Cannot resolve type '"+name+"', replaced by kermeta::standard::UnknownJavaObject" ,null);
	        	isUnknownJavaObject = true;
	        }
	        else{
	        	builder.error("Cannot resolve type '"+name+"' nor type kermeta::standard::UnknownJavaObject; is the framework uptodate ?" ,null);
	        	return null;
	        }
	    }
	    if (typeDef instanceof Type) return (Type)typeDef;
	    else {
	        ClassDefinition cd = (ClassDefinition)typeDef;
	        fr.irisa.triskell.kermeta.language.structure.Class result = StructureFactory.eINSTANCE.createClass();
	        //result.setFName(cd.getFName());
	        if (isUnknownJavaObject){
	        	// add a tag so we can retrieve the original object type name
	        	// question : maybe it would be better to have a real type UnknownJavaObject instead of a simple alias ?
	        	Tag tag = StructureFactory.eINSTANCE.createTag();
	        	tag.setName(IS_PROXY_FOR_JAVA_TYPE);
	        	tag.setValue(name);
	        	result.getOwnedTags().add(tag); // owned by this object
	        	result.getTag().add(tag); // this object is tagged
	        }
	        result.setTypeDefinition(cd);
	        return result;
	    }
	}
    
    public static Hashtable<String,String> primitive_types_mapping;
	
	static {
		primitive_types_mapping = new Hashtable<String,String>();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("java::lang::Integer", 	"kermeta::standard::Integer");
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java::lang::Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java::lang::String", 	"kermeta::standard::String");
		primitive_types_mapping.put("char", 				"kermeta::standard::Character");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
		primitive_types_mapping.put("java::lang::Object", 	"kermeta::standard::Object");
	}
}
