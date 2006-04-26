/* $Id: Jar2KMPass2.java,v 1.1 2006-04-26 21:48:39 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.io
 * File : Jar2KMPass2.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 avr. 2006
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.loader.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 *  Jar2KM PASS 2 : creates packages and collects types
 */
public class Jar2KMPass2 extends Jar2KMPass {

	
	public Jar2KMPass2(JarUnit builder) {
		super(builder);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.java.Jar2KMPass#run()
	 */
	@Override
	public void process() {
//		/ read the jar entries/files	
    	URIConverter converter = new URIConverterImpl();				
    	try
    	{
	    	//converter.
    		InputStream stream = converter.createInputStream(builder.platformURI);
    				
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
	    				if (builder.typeDefinitionLookup(qname) != null) {
	    					// This is an error : the type already exists
	    					builder.messages.addMessage(new KMTUnitLoadError("A type definition for '" + qname + "' already exists.",null));
	    					break;
	    				}
	    				else {
	    					Package theEnclosingPackage = getOrCreatePackage(pqname);
		    				ClassDefinition c = builder.struct_factory.createClassDefinition();
		    				//this.storeTrace(c, node);
		    				c.setName(getClassName(jentry));
		    				theEnclosingPackage.getOwnedTypeDefinition().add(c);
		    				builder.typeDefs.put(qname, c);
	    				}
	
	    				//Class c = cl.loadClass(fileName);
	    				//c.getDeclaredMethods()
	    			}
	    		}
	    		jentry = jis.getNextJarEntry();
	    	}
	    	stream.close();
    	} catch (IOException e) {
			internalLog.error("IOException reading jar file "+builder.platformURI.toFileString() ,e);
			builder.messages.addMessage(new KMTUnitLoadError("IOException reading jar file "+builder.platformURI.toFileString(),null));
			
		}

	}
	
	protected fr.irisa.triskell.kermeta.language.structure.Package getOrCreatePackage(String qualified_name) {
		fr.irisa.triskell.kermeta.language.structure.Package result = builder.packageLookup(qualified_name);
		if (result != null) return result;
		if (qualified_name.indexOf("::")>=0) {
			String name = qualified_name.substring(qualified_name.lastIndexOf("::") + 2);
			String parent_name = qualified_name.substring(0, qualified_name.lastIndexOf("::"));
			Package parent = getOrCreatePackage(parent_name);
			result = builder.struct_factory.createPackage();
			//this.storeTrace(result, node);
			result.setName(name);
			parent.getNestedPackage().add(result);
		}
		else {
			// this is a new root package
			result = builder.struct_factory.createPackage();
			result.setName(qualified_name);
			result.setUri(builder.getUri()+"/"+qualified_name);
		}
		builder.packages.put(builder.getQualifiedName(result), result);
		return result;
	}

}
