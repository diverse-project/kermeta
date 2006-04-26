/* $Id: Jar2KMPass.java,v 1.1 2006-04-26 21:48:39 dvojtise Exp $
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

import java.util.jar.JarEntry;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
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
    	return c.getCanonicalName().replaceAll("\\.","::");
    }
    
    protected Type getTypeByID(String name) {
	    
		if (name.equals("void")) {
			return builder.struct_factory.createVoidType();
		}
			
	    TypeDefinition typeDef = builder.getTypeDefinitionByName(name);
	    if (typeDef == null) {
	        builder.messages.addError("Cannot resolve type '"+name+"'" ,null);
			return null;
	    }
	    if (typeDef instanceof Type) return (Type)typeDef;
	    else {
	        ClassDefinition cd = (ClassDefinition)typeDef;
	        fr.irisa.triskell.kermeta.language.structure.Class result = builder.struct_factory.createClass();
	        //result.setFName(cd.getFName());
	        result.setTypeDefinition(cd);
	        return result;
	    }
	}
}
