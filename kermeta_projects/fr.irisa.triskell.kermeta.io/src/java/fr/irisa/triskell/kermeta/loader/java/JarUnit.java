/* $Id: JarUnit.java,v 1.2 2006-04-26 21:48:39 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.loader.emfatic.ECore2KMPass;
import fr.irisa.triskell.kermeta.loader.emfatic.ECore2KMPass1;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;

/**
 * KermetaUnit dedicated to handle java a Jar as a Unit
 */
public class JarUnit extends KermetaUnit {

	public URLClassLoader cl=null;
	public URI platformURI;
	public URI localURI;    // localized version of the URI	
	
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
        // Nothing special to do, a Jar cannot define imported units
    	// eventually we may use the information in the jar manifest in order to know which other jar
    	// are needed by this one, but I think we cannot rely on this information to build the kermeta
    	// view on the jar.
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
     */
    public void loadTypeDefinitions() {
    	Jar2KMPass pass = new Jar2KMPass2(this);
		pass.process();
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
     */
    public void loadStructuralFeatures() {
    	Jar2KMPass pass = new Jar2KMPass3(this);
		pass.process();
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


    
	
    
}
