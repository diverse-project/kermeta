

/*$Id: DiffHelper.java,v 1.1 2008-02-07 09:09:00 dvojtise Exp $
* Project : org.kermeta.compiler.tests
* File : 	DiffHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 1 févr. 08
* Authors : paco
*/

package org.kermeta.uml2.profiles.tests.helper;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.UpdateAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class DiffHelper {

	
	static public boolean interpreteDiff(String diffFileName) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		URI uri = URI.createURI(diffFileName);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		DiffModel diffModel = (DiffModel) resource.getContents().get(0);
		TreeIterator<EObject> iterator = diffModel.eAllContents();
		while ( iterator.hasNext() ) {
			EObject current = iterator.next();
			if ( ! (current instanceof DiffGroup) ) {
				boolean shouldContinue = false;
				if ( current instanceof UpdateAttribute ) {
					UpdateAttribute update = (UpdateAttribute) current;
					/*
					 * The java transfo generates a uri even if it has not been set in kermeta.
					 * So we just want to ignore this fact. 
					 */
					if ( update.getAttribute().getName().equals("nsURI") ) {
						if ( ( ((EPackage) update.getRightElement()).getNsURI() == null) )
							// They really are different.
							shouldContinue = true;
					}
					/*
					 * The java transfo generates a nsPrefix even if it has not been set in kermeta.
					 * So we just want to ignore this fact. 
					 */
					if ( update.getAttribute().getName().equals("nsPrefix") ) {
						if ( ( ((EPackage) update.getRightElement()).getNsPrefix() == null) )
							// They really are different.
							shouldContinue = true;
					}
				}
				
				if ( ! shouldContinue )
					return false;
				
			}
		}
		return false;
	}
	
	
}


