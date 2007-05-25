

/*$Id: EcoreHelper.java,v 1.1 2007-05-25 15:08:51 ftanguy Exp $
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
	
}


