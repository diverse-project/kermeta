/* $Id: Jar2KMPass2.java,v 1.3 2006-08-18 09:21:18 dvojtise Exp $
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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;

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
	    				String pqname = getPackageQualifiedName(jentry);
	    				String cname = getClassName(jentry);
	    				if(!cname.contains("$")){ // ignore inner class
		    				String qname = pqname + "::" + cname;
		    				// apply exclusion /inclusion rules
		    				if(builder.excludeFilters.size()==0){
		    					if(builder.includeFilters.size() == 0){
		    						// no filter
				    				internalLog.debug("JAR : file "+jentry.getName());
		    						addClass(jentry, pqname, qname);
		    					}
		    					else {
		    						// select only those in the include filter
		    						if(isInFilter(pqname, builder.includeFilters)) {
					    				internalLog.debug("JAR : file "+jentry.getName());
		    							addClass(jentry, pqname, qname);
		    						}
		    					}
		    				}
		    				else {
		    					//	select only those not in the exclude filter
	    						if(! isInFilter(pqname, builder.excludeFilters)) {
				    				internalLog.debug("JAR : file "+jentry.getName());
	    							addClass(jentry, pqname, qname);
	    						}
	    						else if(builder.includeFilters.size() != 0){
		    						// if it is in the include filter it may rescued and added
		    						if(isInFilter(pqname, builder.includeFilters)) {
					    				internalLog.debug("JAR : file "+jentry.getName());
		    							addClass(jentry, pqname, qname);
		    						}
		    					}
		    				}
		    					
	    				}
	    				//else internalLog.debug("JAR : ignored inner class "+jentry.getName() );
	    			}
	    		}
	    		jentry = jis.getNextJarEntry();
	    	}
	    	stream.close();
    	} catch (FileNotFoundException fe) {
			internalLog.error("File not found "+builder.platformURI.toFileString() ,fe);
			builder.messages.addMessage(new KMTUnitLoadError("File not found "+fe.getMessage(),null));
					
    	} catch (IOException e) {
			internalLog.error("IOException reading jar file "+builder.platformURI.toFileString() ,e);
			builder.messages.addMessage(new KMTUnitLoadError("IOException reading jar file "+builder.platformURI.toFileString() + " " + e.getMessage(),null));
			
		}

	}

	/**
	 * look for the given name in the filter,
	 * @param pqname
	 * @param includeFilters
	 * @return true if if one on the filter values in a substring of the given name
	 */
	private boolean isInFilter(String pqname, ArrayList<String> includeFilters) {		
		Iterator<String> it = includeFilters.iterator();
		while(it.hasNext()){
			if(pqname.startsWith(it.next())) return true;
		}
		return false;
	}

	private void addClass(JarEntry jentry, String packageqname, String classqname) {
		if (builder.typeDefinitionLookup(classqname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("A type definition for '" + classqname + "' already exists.",null));
			
		}
		else {
			Package theEnclosingPackage = getOrCreatePackage(packageqname);
			ClassDefinition c = builder.struct_factory.createClassDefinition();
			//this.storeTrace(c, node);
			c.setName(getClassName(jentry));
			theEnclosingPackage.getOwnedTypeDefinition().add(c);
			builder.typeDefs.put(classqname, c);
			
			// this is a java definition add a tag so the interpreter can recognize it and work with it
			Tag tag = builder.struct_factory.createTag();
			tag.setName(JARUNIT_TAG_NAME);
			tag.setValue(builder.getUri());
			c.getTag().add(tag);
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
