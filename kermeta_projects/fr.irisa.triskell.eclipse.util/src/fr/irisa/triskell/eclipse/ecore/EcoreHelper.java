

/*$Id: EcoreHelper.java,v 1.2 2007-06-20 13:03:28 dtouzet Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EcoreHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 mai 07
* Authors : paco
*/

package fr.irisa.triskell.eclipse.ecore;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

public class EcoreHelper {

	static private String QUALIFIED_SEPARATOR = "::";
	
	/**
	 * The eContainer of the element is always a ENamedElement object.
	 * @param element
	 * @return
	 */
	static public String getQualifiedName(ENamedElement element) {
		assert( element != null );
		
		if ( (element.eContainer() !=null) 
			&& (element.eContainer() instanceof ENamedElement) ) 
			return getQualifiedName( (ENamedElement) element.eContainer()) + QUALIFIED_SEPARATOR + element.getName();
		else 
			return element.getName();
	}
	
	
	/**
	 * @param emfRes - EMF resource of the model for which the metamodel uri is searched 
	 * @return       - String containing the metamodel uri for the input EMF Resource,
	 *                 "null" when the uri cannot be found
	 */
	static public String getMetaModelUriFromResource(Resource emfRes) {
		// Default return value for metamodel URI
		String mmURI = "";
		
		if(! emfRes.isLoaded()) {
			try {
	    		emfRes.load(null);
	    	}
	    	catch(Exception e) {
	    		// TODO auto generated catch block
	    		e.printStackTrace();
	    	}
		}

    	EObject eObj = null;
    	if(! emfRes.getContents().isEmpty()) {
    		eObj = (EObject) emfRes.getContents().get(0);
    	
    		if(eObj != null) {
    			// Find root package of the metamodel
    			EPackage pack = (EPackage) eObj.eClass().eContainer();
    			while(pack.eContainer() != null) pack = (EPackage) pack.eContainer();
    			mmURI = pack.getNsURI();
    		}
    	}
    	
    	return mmURI;
	}
	
}


