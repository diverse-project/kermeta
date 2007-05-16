/*$Id: JarCache.java,v 1.1 2007-05-16 13:44:26 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	JavaLoaderCache.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 mai 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.loader.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TagHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class implements a cache for various request on the java jar
 * 
 * It uses a cache system. First access to a type will build up a structure based on hashtables
 */
public class JarCache {

	// The cache structure are there but will be filled only on request due to the memory required to keep it
	// structure used to optimize the retreival of java methods from a kermeta operation
	protected Hashtable<Operation,Method> cachedJavaMethods = new Hashtable<Operation,Method>();
	// structure used to optimize the retreival of java methods from a kermeta operation
	protected Hashtable<Operation,Constructor> cachedJavaConstructors =  new Hashtable<Operation,Constructor>();
	// structure used to optimize the retreival of java fields from a kermeta property
	protected Hashtable<Property,Field> cachedJavaFields =  new Hashtable<Property,Field>();
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("JarCache");
	
	
	protected JarUnit jarUnit = null;

	/**
	 * Constructor
	 */
	public JarCache(JarUnit jarUnit) {
		super();
		this.jarUnit = jarUnit;
	}
	
	/**
	 * Retreives the Java Method from an Operation
	 * Will find it in the cache or will recalculate it
	 * @param op the kermeta operation
	 * @return
	 */
	public Method getMethod(Operation op){
		Method result = cachedJavaMethods.get(op);
		if(result == null){
			//	try to get it from the data contained in the operation
			// retreive the class definition
			String typeQualifiedName = NamedElementHelper.getQualifiedName(op.getOwningClass());			 
    		String javaQualifiedName = typeQualifiedName.replaceAll("::",".");
    		Tag isjavaoperationtag = TagHelper.findTagFromName(op, Jar2KMPass.JAVAOPERATION_TAG_NAME);
    		if(isjavaoperationtag == null) return null; // this is not a a java operation don't need to search for it
    		Tag indextag = TagHelper.findTagFromName(op, Jar2KMPass.JAVAMETHODINDEX_TAG_NAME);
    		Integer index = new Integer(indextag.getValue());
			try{			    		
				Class currentClass = jarUnit.cl.loadClass(javaQualifiedName);
				Method[] methods = currentClass.getDeclaredMethods();
				result = methods[index];
				// put it in the cache for later use
				cachedJavaMethods.put(op, result);
			} catch (ClassNotFoundException e) {
				internalLog.error("ClassNotFound in jar "+jarUnit.platformURI.toFileString() +" looking for "+javaQualifiedName ,e);				
			} 
		}
		return result;
	}
	
	public Constructor getConstructor(Operation op){
		Constructor result = cachedJavaConstructors.get(op);
		if(result == null){
			// try to get it from the data contained in the operation
			//	retreive the class definition
			String typeQualifiedName = NamedElementHelper.getQualifiedName(op.getOwningClass());			 
    		String javaQualifiedName = typeQualifiedName.replaceAll("::",".");
    		Tag indextag = TagHelper.findTagFromName(op, Jar2KMPass.JAVACONSTRUCTORINDEX_TAG_NAME);
    		Integer index = new Integer(indextag.getValue());
			try{			    		
				Class currentClass = jarUnit.cl.loadClass(javaQualifiedName);
				Constructor[] constructors = currentClass.getConstructors();
				result = constructors[index];
				// put it in the cache for later use
				cachedJavaConstructors.put(op, result);
			} catch (ClassNotFoundException e) {
				internalLog.error("ClassNotFound in jar "+jarUnit.platformURI.toFileString() +" looking for "+javaQualifiedName ,e);				
			}
		}
		return result;
	}
	
	public Field getField(Property prop){
		Field result = cachedJavaFields.get(prop);
		if(result == null){
			// try to get it from the data contained in the operation
			// retreive the class definition
			String typeQualifiedName = NamedElementHelper.getQualifiedName(prop.getOwningClass());			 
    		String javaQualifiedName = typeQualifiedName.replaceAll("::",".");
    		
			try{			    		
				Class currentClass = jarUnit.cl.loadClass(javaQualifiedName);
				result = currentClass.getDeclaredField(prop.getName());
				// put it in the cache for later use
				cachedJavaFields.put(prop, result);
			} catch (ClassNotFoundException e) {
				internalLog.error("ClassNotFound in jar "+jarUnit.platformURI.toFileString() +" looking for "+javaQualifiedName ,e);				
			} catch (SecurityException e) {
				internalLog.error("ClassNotFound in jar "+jarUnit.platformURI.toFileString() +" looking for "+javaQualifiedName ,e);
			} catch (NoSuchFieldException e) {
				internalLog.error("Field " + prop.getName() + " not found in java class "+ javaQualifiedName +" in jar "+jarUnit.platformURI.toFileString() ,e);
			}
		}
		return result;
	}
	
	/**
	 * depending on the number of planned classes, the put method will or won't store the java object
	 * this will speed up execution of small jar and won't use too much memory on big jar
	 * typically storing all data for a big jar will use too much memory regarding the classes really used ...
	 */
	protected int plannedNbClasses = 0;
	/**
	 * Thresold above which the java Methods and Fields are not physically stored in the cache
	 */
	public int plannedNbClassesThresold = 1;  // TODO must chane the cache Thresold back to 500 
	public void setPlannedNbClasses(int i){
		plannedNbClasses = i;
	}
	
	/**
	 * 
	 * @param operation
	 * @param method
	 * @param methodIndex used to store a minimal data in operation in order to make sure toi retreive it even if the operation is renamed in kermeta
	 */
	public void putMethod(Operation operation, Method method, int methodIndex){
		if(plannedNbClasses > plannedNbClassesThresold){
			// store additional data for retreiving the correct Method
			// put the index of the method 
			TagHelper.createNonExistingTagFromNameAndValue(operation, 
					Jar2KMPass.JAVAMETHODINDEX_TAG_NAME, 
					new Integer(methodIndex).toString());
					 
		}
		else cachedJavaMethods.put(operation, method);
	}
	public void putConstructor(Operation operation, Constructor constructor, int contructorIndex){
		if(plannedNbClasses > plannedNbClassesThresold){
			// store additional data for retreiving the correct Contructor
			// put the index of the method 
			TagHelper.createNonExistingTagFromNameAndValue(operation, 
					Jar2KMPass.JAVACONSTRUCTORINDEX_TAG_NAME, 
					new Integer(contructorIndex).toString()); 
		}
		else cachedJavaConstructors.put(operation, constructor);
	}
	public void putField(Property prop, Field field, int fieldIndex){
		if(plannedNbClasses > plannedNbClassesThresold){
			// store additional data for retreiving the correct Field
			// nothing needed, the name is enough
		}
		else cachedJavaFields.put(prop, field);
	}

	
}


