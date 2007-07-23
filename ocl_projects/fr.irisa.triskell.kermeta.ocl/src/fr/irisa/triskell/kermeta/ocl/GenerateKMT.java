package fr.irisa.triskell.kermeta.ocl;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.ocl.console.DevOCLConsole;
import fr.irisa.triskell.kermeta.ocl.kmtactions.GenerateOCL;
import fr.irisa.triskell.kermeta.loader.*;
public class GenerateKMT {

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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String baseDir = "/udd/barais/runtime-New_configuration/fr.irisa.triskell.kermeta.ocl/";
		//String baseDir = "/home/barais/workspaces/workspace_demo_kermeta/fr.irisa.triskell.kermeta.ocl/";
		ResourceSet rs = new ResourceSetImpl();
		
		//String strURI = "platform:/plugin/fr.irisa.triskell.kermeta.ocl/mmodel/OCLCST.ecore"; 
		//mmURI = URI.createURI(strURI);
		String baseDir1 = "/home/mskipper/runtime-EclipseApplication/speedsImplementation/hrc/";
		
		
		Resource res = rs.getResource(URI.createFileURI("oclcst.ecore"), true);
		EPackage ePack = (EPackage) res.getContents().get(0);
		registerPackages(ePack);
		
		for (String fn: TestOCLParser.filenames){
			String ecoreFileNameFileName = baseDir1 +"ecore/speedsL1.ecore";
			
			String oclSourceFileName = baseDir1 + "constraints/ocl/" + fn + ".ocl";
			String xmiOutputFileName = baseDir1 +"constraints/ocl/" + fn + ".xmi";
			String outputKMTFileName = baseDir1 +"constraints/ocl/" + fn + ".kmt";
			
			System.out.println("Processing: " + oclSourceFileName + " --> " + xmiOutputFileName  );
			TestOCLParser.run(oclSourceFileName, xmiOutputFileName);
			StdLibKermetaUnitHelper.STD_LIB_URI= "/opt/eclipse/plugins/fr.irisa.triskell.kermeta_0.4.1/lib/framework.km";
			GenerateOCL.run(xmiOutputFileName,ecoreFileNameFileName,  outputKMTFileName, new DevOCLConsole(), "./kermeta/transformations-dev/OCLKMTPrinter.kmt");

			
		}
		
	}

}
