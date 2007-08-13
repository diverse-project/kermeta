package fr.irisa.triskell.kermeta.ocl;

import java.awt.List;
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
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.ocl.console.DevOCLConsole;
import fr.irisa.triskell.kermeta.ocl.kmtactions.GenerateOCL;


public class GenerateKMT {

	public static String workbench_path = "/home/mskipper/runtime-EclipseApplication/";
	private static String project_path = workbench_path + "fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/";
	
	private static String frameworkkm = "/opt/eclipse/plugins/fr.irisa.triskell.kermeta_0.4.1/lib/framework.km";
	private static String ecore_ecore =  project_path + "Ecore.ecore";
	private static String oclcst_ecore =  project_path + "OCLCST.ecore";
	private static String kmtprinter = project_path + "OCLKMTPrinter.kmt";
	
	public void generate(String ecorepath, String inputOclFile, String outputKMTFileName){
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		String xmiOutputFileName = inputOclFile + ".xmi";
		System.out.println("Processing: " + inputOclFile + " --> " + xmiOutputFileName  );
		try {
				TestOCLParser.run(inputOclFile, xmiOutputFileName);
		} catch (ParserException e) {
				System.err.println(e.getMessage());
				return;
		}
		String URIxmiOutputFileName = "file:///" + xmiOutputFileName;
		registerPackages(EcorePackage.eINSTANCE);
		setUpURIMappings();
		Resource res = rs.getResource(URI.createFileURI(oclcst_ecore), true);
		EPackage ePack = (EPackage) res.getContents().get(0);
		registerPackages(ePack); 
		StdLibKermetaUnitHelper.STD_LIB_URI= frameworkkm;
		GenerateOCL.run(URIxmiOutputFileName,ecorepath,  outputKMTFileName, new DevOCLConsole(),kmtprinter );
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
	public static void setUpURIMappings() {
		URIConverter.URI_MAP.put(URI.createURI("http://www.eclipse.org/emf/2002/Ecore"), URI.createURI(ecore_ecore));
		String plugin = "platform:/plugin/";
		String resource =  "platform:/resource/"	;
	}
	
}
