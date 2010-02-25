package org.kermeta.kmlogo.logoasm.ui;

//import ExtResourceFactory;
//import Resource;
//import ResourceSetImpl;
//import XMIResourceFactoryImpl;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.emftext.language.your_dsl.resource.ext.ExtResourceFactory;

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
			resourceB.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
