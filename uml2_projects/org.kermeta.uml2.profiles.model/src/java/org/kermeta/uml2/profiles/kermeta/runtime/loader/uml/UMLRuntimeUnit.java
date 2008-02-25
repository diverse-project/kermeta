/* $Id: UMLRuntimeUnit.java,v 1.2 2008-02-25 16:53:36 dvojtise Exp $
 * Project   : org.kermeta.uml2.profiles
 * File      : UMLRuntimeUnit.java
 * License   : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : Feb 11, 2008
 * Authors       : 
 * 					Didier Vojtisek
 */
package org.kermeta.uml2.profiles.kermeta.runtime.loader.uml;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMF2Runtime;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnitFactory;
import fr.irisa.triskell.kermeta.runtime.loader.emf.QualifiedNamePatcher;

/**
 * Runtime unit that knows how to load UML resources
 * including resources using nested profiles
 *
 */
public class UMLRuntimeUnit extends EMFRuntimeUnit {

	public static final String ECOREUML_EANNOTATION_SOURCE = "http://www.eclipse.org/uml2/2.0.0/UML";
	
	public UMLRuntimeUnit(String uri, RuntimeObject emptyInstances,
			EMFRuntimeUnitFactory factory) {
		super(uri, emptyInstances, factory);
	}
	
	public UMLRuntimeUnit(String pUri, String pMMUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        super(pUri, pMMUri, emptyInstances, pFactory);
    }

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit#getEMF2Runtime(fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit, org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	protected EMF2Runtime getEMF2Runtime(EMFRuntimeUnit unit, Resource resource) {
		// Overwrite default EMF2Runtime by a dedicated one
		return new UML2Runtime(unit, resource);
	}
	
	
	/**
	 * overwrite the way we calculate the qualified name due to the special way UML deal with some Ecore data
	 */
	public String getEQualifiedName(ENamedElement obj) {
		String result = obj.getName();
		EAnnotation annot = obj.getEAnnotation(ECOREUML_EANNOTATION_SOURCE);
		if(annot != null){
			// we must use the associated UML object to calculate the logical Qualified Name
			for(EObject ref : annot.getReferences()){
				result = safeUMLQualifiedName(ref);
			}
		}
		else{
			// normal case go to the normal behavior
			result = super.getEQualifiedName(obj);
		}
	    
	    return result;
	}
	
	/**
	 * 
	 * @param obj
	 * @param result base qualified that must be complemented with this special object qualified name
	 * @return
	 */
	protected String specialObjectQualifiedName(EObject obj, 
			String result) {
		
		if(obj instanceof EAnnotation){
			// try to retreive UML hierarchy
			EAnnotation containingAnnotation = (EAnnotation)obj;
			if(containingAnnotation.eContainer() != null){					
				if(containingAnnotation.eContainer() instanceof org.eclipse.uml2.uml.Package){					
					result = umlPackageQualifiedName((org.eclipse.uml2.uml.Package)containingAnnotation.eContainer()) + "::" + result;				
				}
				else{
					// let's try  with an uglier version that use reflexivity
					String containerqname = safeUMLQualifiedName( containingAnnotation.eContainer());
					if(!containerqname.equals(""))
						result = containerqname;
				}
			}
		}
		return result;
	}
	
	/**
	 * calculate the qualifed name for an UML package
	 * @param umlPackage
	 * @return
	 */
	protected String umlPackageQualifiedName(org.eclipse.uml2.uml.Package umlPackage){
		String result = umlPackage.getName();
		if(umlPackage.eContainer() != null){
			if(umlPackage.eContainer() instanceof org.eclipse.uml2.uml.Package){					
				result = umlPackageQualifiedName((org.eclipse.uml2.uml.Package) umlPackage.eContainer()) + "::" + result;
			}
		}
		return result;
	}
	
	/**
	 * calculate the qualifed name for an UML package
	 * @param umlElement
	 * @return
	 */
	protected String safeUMLQualifiedName(EObject umlElement){
		String result = safeGetName(umlElement);
		if(umlElement.eContainer() != null){
			String containerqname = safeUMLQualifiedName( umlElement.eContainer());
			if(!containerqname.equals(""))
				result = containerqname + "::" + result;
		}
		return result;
	}
	
	/**
	 * call getName in a reflectiveWay so even if we have trouble with multiple class definition in memory we will just use 
	 * the one accessible on the object itself
	 * @param obj
	 * @return return "" if there is no name (either because this is not a name element or because name is empty)
	 */
	protected String safeGetName(EObject obj){
		String result = "";
		Object pname = null;
		Class[] paramtypes = new Class[0];
		Object[] paramsArray = new Object[0];
		
		Class<? extends EObject> jclass = obj.getClass();
		Method jmethod = null;
        try {
			jmethod = jclass.getMethod("getName", paramtypes);
		} catch (SecurityException e) {
			// ignore errors
		} catch (NoSuchMethodException e) {
			// ignore errors
		}
		try {
			pname = jmethod.invoke(obj, (Object[])paramsArray);
			result = (String) pname;
		} catch (IllegalArgumentException e) {
			// ignore errors
		} catch (IllegalAccessException e) {
			// ignore errors
		} catch (InvocationTargetException e) {
			// ignore errors
		}
		return result;
	}
    		   
}

