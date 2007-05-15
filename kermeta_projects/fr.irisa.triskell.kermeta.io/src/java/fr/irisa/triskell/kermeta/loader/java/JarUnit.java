/* $Id: JarUnit.java,v 1.9 2007-05-15 09:10:36 dvojtise Exp $
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

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

/**
 * KermetaUnit dedicated to handle java a Jar as a Unit
 * most of this work was done using the information from these sites :
 * http://java.sun.com/docs/books/tutorial/deployment/jar/jarclassloader.html
 * http://java.sun.com/docs/books/tutorial/reflect/index.html
 */
public class JarUnit extends KermetaUnit {

	public URLClassLoader cl=null;
	public URI platformURI;
	public URI localURI;    // localized version of the URI	
	
	// structure used to optimize the retreival of java methods from a kermeta operation
	public Hashtable<Operation,Method> cachedJavaMethods = new Hashtable<Operation,Method>();
	// structure used to optimize the retreival of java methods from a kermeta operation
	public Hashtable<Operation,Constructor> cachedJavaConstructors =  new Hashtable<Operation,Constructor>();
	// structure used to optimize the retreival of java fields from a kermeta property
	public Hashtable<Property,Field> cachedJavaFields =  new Hashtable<Property,Field>();
	
    /**
     * @param uri
     * @param packages
     */
    public JarUnit(String uri, Hashtable packages) {
        super(uri, packages);
        // a jarUnit depends on Kermeta
        // Actually, it depends only on some types : NotImplementedException
        // TODO split kermeta standard in order to not have to require it completely
       // importedUnits.add(StdLibKermetaUnitHelper.getKermetaUnit());
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
	    	
	    	// add the kermeta runtime lib for an eventual use of RuntimeObject
	    	
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
    	Jar2KMPass pass3 = new Jar2KMPass3(this);
		pass3.process();
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


    /** retrieves the underlying java type name 
	 * 
	 * @param p
	 * @return
	 */
	public static String getUnderlyingJavaTypeName(Class p) {
		Iterator it = p.getTag().iterator();
		while(it.hasNext()){
			Tag tag = (Tag)it.next();
			if (tag.getName().equals(Jar2KMPass.IS_PROXY_FOR_JAVA_TYPE)) return tag.getValue();
		}
		return "";
	}

	@Override
	public void postLoad() {
		// nothing to do
	}
	
    
}
