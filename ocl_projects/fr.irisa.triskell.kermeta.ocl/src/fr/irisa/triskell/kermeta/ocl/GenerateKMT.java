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
import org.eclipse.ocl.ParserException;

import fr.irisa.triskell.kermeta.ocl.console.DevOCLConsole;
import fr.irisa.triskell.kermeta.ocl.kmtactions.GenerateOCL;
public class GenerateKMT {
	
	private static String frameworkkm = "/opt/eclipse/plugins/fr.irisa.triskell.kermeta_0.4.1/lib/framework.km";
	private static String ecore_ecore =  "/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/Ecore.ecore";
	private static String oclcst_ecore =  "/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/OCLCST.ecore";
	private static String kmtprinter = "/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/OCLKMTPrinter.kmt";
	
	public void generate(String ecorepath, String oclFile, String output){
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				  "ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
			String ecoreFileName = ecorepath;//baseDir1 +"ocl/sample.ecore";
			String oclSourceFileName = oclFile;//baseDir1 + "ocl/" + fn + ".ocl";
			String xmiOutputFileName = oclFile + ".xmi";
			String outputKMTFileName = output;
			
			System.out.println("Processing: " + oclSourceFileName + " --> " + xmiOutputFileName  );
			try {
				TestOCLParser.run(oclSourceFileName, xmiOutputFileName);
			} catch (ParserException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
				return;
			}
			String URIxmiOutputFileName = "file:///" + xmiOutputFileName;

			Resource res = rs.getResource(URI.createFileURI(oclcst_ecore), true);
			EPackage ePack = (EPackage) res.getContents().get(0);
			registerPackages(ePack); 
			
			GenerateOCL.run(URIxmiOutputFileName,ecoreFileName,  outputKMTFileName, new DevOCLConsole(),kmtprinter );
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
				new GenerateKMT().generate("/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/ocl/sample.ecore", 
						"/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/ocl/70.ocl",
						"/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/ocl/70.kmt");
		
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
