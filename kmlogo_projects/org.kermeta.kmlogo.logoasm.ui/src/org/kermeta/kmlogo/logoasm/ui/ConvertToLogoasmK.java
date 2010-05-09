/*$Id : ConvertToLogoasmK.java v 1.3 May 8, 2010 9:43:14 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.ui
* File : 	ConvertToLogoasmK.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import java.io.IOException;

import fr.irisa.triskell.eclipse.console.IOConsole;

public class ConvertToLogoasmK {
	
	public static void run(String file_uri, IOConsole console){
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resourceA = resourceSet.createResource(URI.createURI(file_uri));
		String newUri = resourceA.getURI().trimFileExtension().appendFileExtension("logoasm").toFileString();
		Resource resourceB = resourceSet.createResource(URI.createFileURI(newUri));
		try {
			resourceA.load(null);
			resourceB.getContents().addAll(resourceA.getContents());
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(resourceB);
			resourceB.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
