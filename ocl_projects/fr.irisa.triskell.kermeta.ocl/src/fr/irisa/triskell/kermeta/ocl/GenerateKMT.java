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
//import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.ocl.kmtactions.GenerateOCL;


public class GenerateKMT {

	private static String workbench_path = "platform:/plugin/";
	private static String project_path = workbench_path + "fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/";
	private static String ecore_ecore =  project_path + "Ecore.ecore";
	private static String oclcst_ecore =  project_path + "OCLCST.ecore";
	
	public GenerateKMT(){
		setUpURIMappings();
	}
	
	private Resource getResource() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		return  rs.getResource(URI.createURI(oclcst_ecore), true);
//		return  rs.getResource(URI.createFileURI(oclcst_ecore), true);
	}
	
	
	public void generate(URI ecoreURI, URI inputOclFileURI, URI outputKMTFileURI){
		URI xmiTempFileURI = inputOclFileURI.trimFileExtension().appendFileExtension("xmi");
		System.out.println("Parsing: \nfrom: " + inputOclFileURI + " \nto  : " + xmiTempFileURI  );
		try {
				OCLFileParser.parseTextFileToXmiFile(inputOclFileURI, xmiTempFileURI);
		} catch (ParserException e) {
				System.err.println(e.getMessage());
				return;
		}
		runOclCstToKmtPrinter( xmiTempFileURI, ecoreURI,  outputKMTFileURI);
	}
	
	
	private void runOclCstToKmtPrinter(URI cstXmiURI, URI ecoreURI, URI outputKmtFileURI){
		System.out.println("Generating: \nfrom: " + cstXmiURI + " \nto  : " + outputKmtFileURI +"with " + ecoreURI );
		registerPackages(EcorePackage.eINSTANCE);
		EPackage ePack = (EPackage) getResource().getContents().get(0);
		registerPackages(ePack); 
		GenerateOCL.run(cstXmiURI.toString(), ecoreURI.toString(),  outputKmtFileURI.toString());
	}
	
	private static void registerPackages(EPackage pack) {
		System.out.println("registering package: " + pack.getNsURI());
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
		
	}
	
}
