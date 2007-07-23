package fr.irisa.triskell.kermeta.ocl;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.ocl.console.DevOCLConsole;
import fr.irisa.triskell.kermeta.ocl.kmtactions.GenerateOCL;
public class GenerateKMT {


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
		String baseDir1 = "C:/Documents and Settings/barais.COREFF/workspace/fr.irisa.triskell.kermeta.ocl/";
		
		
		
			String fn = "70";
			String ecoreFileName = baseDir1 +"ocl/sample.ecore";
			
			String oclSourceFileName = baseDir1 + "ocl/" + fn + ".ocl";
			String xmiOutputFileName = baseDir1 +"ocl/" + fn + ".xmi";
			String outputKMTFileName = baseDir1 +"ocl/" + fn + ".kmt";
			
			System.out.println("Processing: " + oclSourceFileName + " --> " + xmiOutputFileName  );
			TestOCLParser.run(oclSourceFileName, xmiOutputFileName);
			String URIxmiOutputFileName = "file:///" + xmiOutputFileName;
			
			
			//Resource res1 = rs.getResource(URI.createFileURI("kermeta/transformations-dev/Ecore.ecore"), true);
			//EPackage ePack1 = (EPackage) res1.getContents().get(0);
			//registerPackages(ePack1);
			//registerPackages(EcorePackage.eINSTANCE);
			//URIConverter.URI_MAP.
			URIConverter.URI_MAP.put(URI.createURI("http://www.eclipse.org/emf/2002/Ecore"), URI.createURI("file:///C:/Documents and Settings/barais.COREFF/workspace/fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/Ecore.ecore"));
			
			Resource res = rs.getResource(URI.createFileURI("kermeta/transformations-dev/OCLCST.ecore"), true);
			EPackage ePack = (EPackage) res.getContents().get(0);
			registerPackages(ePack); 
			
			StdLibKermetaUnitHelper.STD_LIB_URI= "file:///c:/Documents and Settings/barais.COREFF/Bureau/eclipse_kermeta_0.4.1_windows/plugins/fr.irisa.triskell.kermeta_0.4.1/lib/framework.km";
			GenerateOCL.run(URIxmiOutputFileName,ecoreFileName,  outputKMTFileName, new DevOCLConsole(), "./kermeta/transformations-dev/OCLKMTPrinter.kmt");

			
		
	}
	
	private static void registerPackages(EPackage pack) {
		System.err.println(pack.getNsURI());
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
