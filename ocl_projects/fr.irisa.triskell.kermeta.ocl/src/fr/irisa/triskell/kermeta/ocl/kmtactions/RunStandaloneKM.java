/* $Id: RunStandaloneKM.java,v 1.7 2008-04-30 14:38:01 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.ocl
* File : 	RunStandaloneKM.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : 
* 	Olivier Barais
* 	Mark Skipper
* 	Didier Vojtisek
*/
package fr.irisa.triskell.kermeta.ocl.kmtactions;


import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.ParserException;

import fr.irisa.triskell.eclipse.console.LocalIOConsole;
import fr.irisa.triskell.kermeta.ocl.TestOCLParser;

public class RunStandaloneKM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				  "ecore", new EcoreResourceFactoryImpl());


		
		ResourceSet rs = new ResourceSetImpl();
		rs.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		//String strURI = "platform:/plugin/fr.irisa.triskell.kermeta.ocl/mmodel/OCLCST.ecore"; 
		//mmURI = URI.createURI(strURI);
		String baseDir1 = "/udd/barais/workspace2/fr.irisa.triskell.kermeta.ocl/";
		
		
		
			String fn = "70";
			String ecoreFileNameFileName = baseDir1 +"ocl/sample.ecore";
			
			String oclSourceFileName = baseDir1 + "ocl/" + fn + ".ocl";
			String xmiOutputFileName = baseDir1 +"ocl/" + fn + ".xmi";
			String outputKMTFileName = baseDir1 +"ocl/" + fn + ".kmt";
			
			System.out.println("Processing: " + oclSourceFileName + " --> " + xmiOutputFileName  );
			try {
				TestOCLParser.run(oclSourceFileName, xmiOutputFileName);
			} catch (ParserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Resource res1 = rs.getResource(URI.createFileURI("kermeta/transformations-dev/Ecore.ecore"), true);
			//EPackage ePack1 = (EPackage) res1.getContents().get(0);
			//registerPackages(ePack1);
			registerPackages(EcorePackage.eINSTANCE);
			//URIConverter.URI_MAP.
			//URIConverter.URI_MAP.put(URI.createURI("http://www.eclipse.org/emf/2002/Ecore"), URI.createURI("file:///udd/barais/Ecore.ecore"));
			URIConverter.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI("file:///udd/barais/workspace2/"));
			
			Resource res = rs.getResource(URI.createFileURI("kermeta/transformations-dev/OCLCST.ecore"), true);
			EPackage ePack = (EPackage) res.getContents().get(0);
			registerPackages(ePack);
			
			//StdLibKermetaUnitHelper.STD_LIB_URI= "/udd/barais/workspace2/fr.irisa.triskell.kermeta/lib/framework.km";
			//GenerateOCL.run(xmiOutputFileName,ecoreFileNameFileName,  outputKMTFileName, new LocalIOConsole());

			
		
	}
	
	private static void registerPackages(EPackage pack) {
		Registry.INSTANCE.put(pack.getNsURI(), pack);
		
		EList l = pack.getESubpackages();
		
		if(l != null) {
			Iterator it = l.iterator();
			while(it.hasNext()) {
				registerPackages((EPackage) it.next());
			}
		}
	}

}
