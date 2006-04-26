/* $Id: JarUnit.java,v 1.1 2006-04-26 16:49:12 dvojtise Exp $
* Project : Kermeta.io
* File : EcoreUnit.java
* License : EPL
* Copyright : INRIA / IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 / 04 / 2006
* Authors : 	
* 	Didier Vojtisek <dvojtise@irisa.fr>
* Notes:
* 	I wrote this using the information from http://java.sun.com/docs/books/tutorial/deployment/jar/apiindex.html
*/ 

package fr.irisa.triskell.kermeta.loader.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;

/**
 * KermetaUnit dedicated to handle java a Jar as a Unit
 */
public class JarUnit extends KermetaUnit {

	protected URLClassLoader cl=null;
	protected URI platformURI;
	protected URI localURI;    // localized version of the URI	
	
    /**
     * @param uri
     * @param packages
     */
    public JarUnit(String uri, Hashtable packages) {
        super(uri, packages);
    }    

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
     */
    public void preLoad() {

    	platformURI = URI.createURI(this.uri);
    	localURI = CommonPlugin.asLocalURI(platformURI);    // localized version of the URI	
    	URIConverter converter = new URIConverterImpl();		
		try{
	    	
			URL url = new URL(localURI.toString());
	    	
			URL[] urls = new URL[1];
	    	urls[0] = url; //new URL(nuri.toFileString());
	    	
	    	cl = new URLClassLoader(urls);
	    	
	    	//com.sun.jdi.ClassLoaderReference clref = com.sun.jdi.ReferenceType.classLoader();
	    	//List clist = clref.definedClasses();
	    	
	    		    	//voir http://java.sun.com/docs/books/tutorial/deployment/jar/jarclassloader.html
	    	
	    } catch (MalformedURLException e) {
	    	messages.addError( "Cannot load jar file. The URL "
							+ localURI.toString()
							+ " is malformed", null);
	    	internalLog.error("Cannot load jar file. The URL "
							+ localURI.toString()
							+ " is malformed", e);
		} 
    	
    }
    
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadImportedUnits()
     */
    public void loadImportedUnits() {
        // Nothing to do, a Jar cannot define imported units
    	// eventually we may use the information in the jar manifest in order to know which other jar
    	// are needed by this one, but I think we cannot rely on this information to build the kermeta
    	// view on the jar.
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
     */
    public void loadTypeDefinitions() {
    	
    	/// read the jar entries/files	
    	URIConverter converter = new URIConverterImpl();				
    	try
    	{
	    	//converter.
    		InputStream stream = converter.createInputStream(platformURI);
    				
	    	//JarInputStream jis = new JarInputStream(urls[0].openStream());
	    	JarInputStream jis = new JarInputStream(stream);
			JarEntry jentry = jis.getNextJarEntry();
	    	while(jentry !=null){
	    		if(jentry.isDirectory()){
	    			//internalLog.debug("JAR : directory "+jentry.getName());
	    		}
	    		else {
	    			String fileName = jentry.getName();
	    			if(fileName.endsWith(".class")){
	    				internalLog.debug("JAR : file "+jentry.getName());
	    				String pqname = getPackageQualifiedName(jentry);
	    				String cname = getClassName(jentry);
	    				String qname = pqname + "::" + cname; 
	    				if (this.typeDefinitionLookup(qname) != null) {
	    					// This is an error : the type already exists
	    					this.messages.addMessage(new KMTUnitLoadError("A type definition for '" + qname + "' already exists.",null));
	    					break;
	    				}
	    				else {
	    					Package theEnclosingPackage = getOrCreatePackage(pqname);
		    				ClassDefinition c = this.struct_factory.createClassDefinition();
		    				//this.storeTrace(c, node);
		    				c.setName(getClassName(jentry));
		    				theEnclosingPackage.getOwnedTypeDefinition().add(c);
		    				this.typeDefs.put(qname, c);
	    				}
	
	    				//Class c = cl.loadClass(fileName);
	    				//c.getDeclaredMethods()
	    			}
	    		}
	    		jentry = jis.getNextJarEntry();
	    	}
	    	stream.close();
    	} catch (IOException e) {
			internalLog.error("IOException reading jar file "+platformURI.toFileString() ,e);
			this.messages.addMessage(new KMTUnitLoadError("IOException reading jar file "+platformURI.toFileString(),null));
			
		}
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
     */
    public void loadStructuralFeatures() {
    	if (cl==null) return;	// load has failed : do nothing
    	Enumeration<String> typeQualifiedNames = typeDefs.keys();
    	while(typeQualifiedNames.hasMoreElements()){
    		String typeQualifiedName = typeQualifiedNames.nextElement();
    		String javaQualifiedName = typeQualifiedName.replaceAll("::",".");
    		ClassDefinition currentClassDef = (ClassDefinition)typeDefs.get(typeQualifiedName);
    		try {
				Class c = cl.loadClass(javaQualifiedName);
				Class theSuperClass = c.getSuperclass();
				if (theSuperClass != null){
					TypeDefinition parentTypeDef = typeDefs.get(getQualifiedName(theSuperClass));
					if(parentTypeDef != null){
						currentClassDef.getSuperType().add(parentTypeDef);
					}
				}
				//c.getDeclaredMethods()
			} catch (ClassNotFoundException e) {
				internalLog.error("ClassNotFound in jar "+platformURI.toFileString() +" looking for "+javaQualifiedName ,e);
				
			}    		
    	}
    	

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadOppositeProperties()
     */
    public void loadOppositeProperties() {
        // we currently don't know how to reverse java attribute in order to build opposite properties
    	// Maybe we will be able to do that from generated EMF classes 
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadBodies()
     */
    public void loadBodies() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {
        // TODO Auto-generated method stub

    }

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
    
    
    public String getQualifiedName(Class c){    	
    	return c.getCanonicalName().replaceAll(".","::");
    }
    
	protected fr.irisa.triskell.kermeta.language.structure.Package getOrCreatePackage(String qualified_name) {
		fr.irisa.triskell.kermeta.language.structure.Package result = this.packageLookup(qualified_name);
		if (result != null) return result;
		if (qualified_name.indexOf("::")>=0) {
			String name = qualified_name.substring(qualified_name.lastIndexOf("::") + 2);
			String parent_name = qualified_name.substring(0, qualified_name.lastIndexOf("::"));
			Package parent = getOrCreatePackage(parent_name);
			result = this.struct_factory.createPackage();
			//this.storeTrace(result, node);
			result.setName(name);
			parent.getNestedPackage().add(result);
		}
		else {
			// this is a new root package
			result = this.struct_factory.createPackage();
			result.setName(qualified_name);
			//TODO: result.setFUri(). What to put here ?
		}
		this.packages.put(this.getQualifiedName(result), result);
		return result;
	}
    
}
