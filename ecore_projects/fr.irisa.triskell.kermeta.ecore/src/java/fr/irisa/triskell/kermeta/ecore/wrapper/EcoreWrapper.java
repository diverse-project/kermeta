/* $Id: EcoreWrapper.java,v 1.7 2008-04-25 14:10:23 dvojtise Exp $
 * Project   : fr.irisa.triskell.kermeta.ecore (First iteration)
 * File      : EcoreWrapper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 6, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.ecore.wrapper;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;

/**
 * This "static" class contains a set of helper methods, that are aimed at easing the
 * communication between EMF (Java execution) world and Runtime 
 * (Kermeta execution) world. Many methods here duplicate the ones of Runtime2EMF and/or
 * EMF2Runtime classes (see project fr.irisa.triskell.kermeta.interpreter)
 * */
public class EcoreWrapper {
	
	
	
	/**
	 * Get or create (if it does not exist) the RuntimeObject for the given EClass, and put it 
	 * in the runtime unit. The class is found in the unit typedef_cache or put in it if it was not
	 * found in it. We use it to define instances of metaclass type.
	 * @param metaclass The EClass to "convert" in a RuntimeObject
	 * @param unit The runtime unit we are working with
	 * @return the RuntimeObject embedding the Kermeta FClass equivalent to the given EClass
	 */
	public static RuntimeObject getRuntimeObjectForMetaClass(EClass metaclass, RuntimeMemory memory)
	{
	    RuntimeObject result = null;
	    
	    String metaclass_name = getEQualifiedName(metaclass);
	    // Create the RuntimeObject encaspulating the FClass corresponding to the EClass given by its name :
	    // Reconstruct from FClass -> FClassDefinition (meta meta levels) -> Our EClass
	    Type ftype = getMetaClassByName(metaclass_name, memory);
	    if (ftype == null)
	    {
	    	KermetaUnit kunit = memory.getUnit();
	    	String errmsg = "EMF Loading error : could not find a class (" +
	    	metaclass_name + ") in loaded libraries. Please check your require statements";
	    	System.err.println(errmsg);
	    	kunit.error(errmsg, null );
	    	ftype = null;
	    	// stop after the first error: throw a Kermeta Exception ...
	    	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();        	
	    	throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
	    			errmsg,
	    			interpreter,
	    			memory,
	    			null);
	    }
	    else {
	    	fr.irisa.triskell.kermeta.language.structure.Class fclass = (	fr.irisa.triskell.kermeta.language.structure.Class)ftype;
	    	result = memory.getROFactory().createMetaClass(fclass);
	    }
	    return result;
	}
	
	
	/**
	 * (Helper)
	 * Get the qualified name of the given ENamedElement in a Kermeta representation.
	 * This is a recursive method,
	 * that parses the successive containers of an element and return their qualified names.
	 * @param obj
	 * @return the qualified name of the given object
	 */
	public static String getEQualifiedName(ENamedElement obj) {
	    String result = obj.getName();
	    EObject cont = obj.eContainer();
	    if (cont != null &&cont instanceof ENamedElement) {
	        result = getEQualifiedName((ENamedElement)cont) + "::" + result;
	    }
	    return result;
	}
	
	/**
	 * Return the FClass corresponding to the given name. Looks inside the loaded
	 * ecore metamodel if it was not found in the main kermeta unit. 
	 * @param name
	 */
	protected static Type getMetaClassByName(String name, RuntimeMemory memory)
	{
	    TypeDefinition etype_cdef;
	    Type ftype = null;
	    etype_cdef = memory.getUnit().getTypeDefinitionByName(name);
/*        if (etype_cdef == null) {
        	// Try to find in kermeta package...
        	etype_cdef = memory.getUnit().getTypeDefinitionByName("kermeta::" +name);
        }*/
	    if (etype_cdef!= null)
	    {
	    	// pseudo object to get its type?
	    	if (ClassDefinition.class.isInstance(etype_cdef))
	    	{
		    	ftype = InheritanceSearch.getFClassForClassDefinition((ClassDefinition)etype_cdef);
	    	}
	    	// Is it a primitive type?
	    	else if (PrimitiveType.class.isInstance(etype_cdef))
	    	{
	    	    ftype = ((PrimitiveType)etype_cdef).getInstanceType();
	    	}
	    }
	    else
	    {
	    	System.err.println("Problem : could not find <" + name + "> class");
	    }
        return ftype; 
	}
	
	/**
	 * Define the runtimeObject corresponding to this object
	 * - get the runtimeobject of the meta class it refers to 
	 * -
	 */
	protected static RuntimeObject setRuntimeObjectForEObject(EObject eObject, RuntimeMemory memory)
	{
	    RuntimeObject result = null;
	    // Define the RO-metaclass of the given EObject
	    RuntimeObject ro_metaclass = getRuntimeObjectForMetaClass(eObject.eClass(), memory);
	    // Define the RO-instance of the given EObject :
	    // - create a RO
	    // - fill its properties hashtable
	    // runtime_objects_mapping unavailable here... proper to EMF2Runtime
	    
	    result = new RuntimeObjectImpl(memory.getROFactory(), ro_metaclass);
        result.setEmfObject(eObject);
        return result;
        
	}
	// bleuarg
/*	public static RuntimeObject findRuntimeObjectForEObject(EObject eObject, RuntimeMemory memory)
	{
		RuntimeObject result = null;
		Hashtable<FObject, RuntimeObject> objects = memory.getRuntimeObjects();
		List vals = new ArrayList(); vals.addAll(objects.values());
		Iterator<RuntimeObject> it = vals.iterator();
		while (it.hasNext())
		{
			RuntimeObject ro = it.next();
			if (ro.getData().containsKey("emfObject"))
			{
				if (ro.getData().get("emfObject") == eObject)
				{
					result = ro;
				}
			}
		}
		// If runtimeobject for eObject was not found in memory, create one.
		if (result == null) result = setRuntimeObjectForEObject(eObject, memory);
		return result;
	}*/
}
