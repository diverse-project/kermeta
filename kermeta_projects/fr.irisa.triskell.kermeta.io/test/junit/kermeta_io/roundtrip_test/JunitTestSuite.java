/* $Id: JunitTestSuite.java,v 1.13 2007-04-19 14:29:16 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : JunitTestSuite.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 *        	Franck FLEUREY (ffleurey@irisa.fr)
 * Description : 
 *        	Kermeta TestSuite for io project
 * 			this file is partially generated using GenerateJUnitTestSuite. 
 * 			Do not manually modify the generated part. 
 */
package kermeta_io.roundtrip_test; 

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KM;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.utils.URIMapUtil;
import fr.irisa.triskell.kermeta.utils.UserDirURI;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {


	public JunitTestSuite(String arg0) {
		super(arg0);
		
		 // SET THE STD LIB
		StdLibKermetaUnitHelper.STD_LIB_URI = "../fr.irisa.triskell.kermeta/lib/framework.km";
		printer = new KM2KMTPrettyPrinter();
	    // INIT TYPE CHECKER
	  //  TypeCheckerContext.initializeTypeChecker(KermetaUnit.getStdLib());
		
		File file = new File("uri.map");
		if (file.exists())
		{
			// if this file exists, load its content as a uri.map, this map is used by EMF while loading indirect files
			URIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
			URI u = URI.createURI(file.getName());
	    	if (u.isRelative()) {
	    		URIConverter c = new URIConverterImpl();
	    		u = u.resolve(c.normalize(URI.createURI(file.getName())));    			
	    	}
			System.out.println("Loading URI_MAP from file: " + u.toFileString());
		}
		
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}


	protected void tearDown() throws Exception {
		super.tearDown();
	}
	// do not modify this comment

/*** BEGIN GENERATED TESTS ***/
public void testecore_001_puzzle() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","001_puzzle.main.ecore" );
}

public void testecore_002_Simple() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","002_Simple.main.ecore" );
}

public void testecore_003_UML2() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","003_UML2.main.ecore" );
}

public void testecore_004_Enum() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","004_Enum.main.ecore" );
}

public void testecore_005_Property() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","005_Property.main.ecore" );
}

public void testecore_006_PropertyWithEcoreTypes() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","006_PropertyWithEcoreTypes.main.ecore" );
}

public void testecore_007_PropertyWithDataTypes() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","007_PropertyWithDataTypes.main.ecore" );
}

public void testecore_009_Operation() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","009_Operation.main.ecore" );
}

public void testecore_010_twopackages() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","010_twopackages.main.ecore" );
}

public void testkmt_001_Simple() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","001_Simple.main.kmt" );
}

public void testkmt_002_RequireEcore() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","002_RequireEcore.main.kmt" );
}

public void testkmt_003_ComplexTest_rdl() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","003_ComplexTest_rdl.main.kmt" );
}

public void testkmt_004_OperationBody() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","004_OperationBody.main.kmt" );
}

public void testkmt_005_DerivedPropertyBody() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","005_DerivedPropertyBody.main.kmt" );
}

public void testkmt_006_PropertyWithEcoreTypes() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","006_PropertyWithEcoreTypes.main.kmt" );
}

public void testkmt_007_testAlias() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","007_testAlias.main.kmt" );
}

public void testkmt_008_testAlias() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","008_testAlias.main.kmt" );
}

public void testkmt_009_testRequireFramework() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","009_testRequireFramework.main.kmt" );
}

public void testkmt_010_testAliasInOperationBody() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","010_testAliasInOperationBody.main.kmt" );
}

public void testkmt_011_testPropertyConversionInEcore() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","011_testPropertyConversionInEcore.main.kmt" );
}

public void testkmt_011_testRequireFramework() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","011_testRequireFramework.main.kmt" );
}

public void testkmt_012_testCommentAnnotations() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","012_testCommentAnnotations.main.kmt" );
}

public void testkmt_013_testRedefinedOperations() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","013_testRedefinedOperations.main.kmt" );
}

public void testkmt_014_testParameterizedClass() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","014_testParameterizedClass.main.kmt" );
}

public void testkmt_015_testEnumerationAsProperty() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","015_testEnumerationAsProperty.main.kmt" );
}

public void testkmt_016_testTypeVariableTypes() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","016_testTypeVariableTypes.main.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment

	public KM2KMTPrettyPrinter printer;

	/**
	 * Transforms the ecore file given by file into an kmt file, and reversely
	 * 
	 */
	public void testecoreFile(String dir, String file) throws Exception {
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();
	    String ecore_input_file = dir + "/" + file;
	    UserDirURI.createDirFromName(dir+"/output/");
	    // LOAD THE UNIT (this calls the EcoreUnit method loader)
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(ecore_input_file);
		try {
		builder.load();
		} catch(Exception e ) {/*if (!builder.messages.hasError())*/ throw e;};
		
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
		}
		System.err.println("Messages for ecore conv. :" + builder.messages.getAllMessagesAsString());
		
		// Enable quick fixer
		Ecore2KM.isQuickFixEnabled = true;
		
		// Create ecore2km visitor -- output_file
		String output_file = dir + "/output/" + file.replaceAll("\\.ecore", ".kmt");
		// Save the kmt generated file
		
		output_file = new URIConverterImpl().normalize(URI.createURI(output_file)).toFileString();
		//output_file = "platform:/resource/fr.irisa.triskell.kermeta.io/"+ output_file;		
		
		System.out.println("Write kmt output : "+ output_file);
		//printer.ppPackage(output_file)
		writeKMTUnit(builder, output_file);
		System.out.println("output written");
		
		// Regenerate the ecore from the kmt
		String ecore_output_file = output_file.replaceAll("\\.kmt", ".ecore");
		System.out.println("Write ecore output :" + ecore_output_file +", from generated ecore : "+ output_file);
		writeEcore(output_file,  ecore_output_file);
		System.out.println("ecore output written");
		
		// Test the equality
		/* windows specific patch */
		String eifile ;
		if(ecore_input_file.contains("\\")) 
			eifile = "file:/" + ecore_input_file.replaceAll("\\\\","/");
		else
			eifile = ecore_input_file;
		String eofile ;
		if(ecore_output_file.contains("\\")) 
			eofile = "file:/" + ecore_output_file.replaceAll("\\\\","/");
		else
			eofile = ecore_output_file;
		assertEcoreFilesEquality(eifile, eofile);
	}
	
	/**
	 * Converts the input file (a .km or a .kmt file) into ecore and reversely.
	 * This method is used by both testkmFile and testkmtFile.
	 * 
	 * @param dir
	 * @param input_file
	 * @param km_ext the file extension of the initial kermeta file
	 * @return the kermeta unit of the ecore output file. It will then be used
	 * to convert back this ecore file into kermeta.
	 * @throws Exception
	 */
	protected KermetaUnit testkermetaFile(String dir, String input_file, String km_ext) throws Exception
	{
		KermetaUnitFactory.getDefaultLoader().unloadAll();
	    String kermeta_input_file = dir + "/" + input_file;
	    UserDirURI.createDirFromName(dir+"/output/");
		
	    // LOAD THE UNIT (this call the KMUnit method loader)
	    String kmext = kermeta_input_file.substring(kermeta_input_file.lastIndexOf(".")+1);
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(kermeta_input_file);
		try {builder.load();} catch (Exception e) { throw e; }
		
		// Check that there are not internal errors related to KermetaUnit building. 
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
		}
		
		String ecore_output_file = dir + "/output/" + input_file.replaceAll("\\."+ kmext, ".ecore");
		// Save the generated ecore from the kmt
		ecore_output_file = new URIConverterImpl().normalize(URI.createURI(ecore_output_file)).toFileString();
		/* windows specific patch */
		String eofileURI;
		if(ecore_output_file.contains("\\")) 
			eofileURI = "file:/" + ecore_output_file.replaceAll("\\\\","/");
		else eofileURI = ecore_output_file;
		
		System.out.println("Write ecore output :" + ecore_output_file +", from kmt : "+ kermeta_input_file);
		writeEcore(kermeta_input_file,  eofileURI);
		System.out.println("ecore output written");
		
		// Create ecore2km visitor -- output_file
		String kermeta_output_file = ecore_output_file.replaceAll("\\.ecore", "." + kmext);
		System.out.println("Write km output : "+ kermeta_output_file);
		// Load the EcoreUnit from output_file
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(eofileURI);
		try {builder.load();} catch (Exception e) { throw e;}
		
		assert (km_ext.equals("km")||km_ext.equals("kmt"));
		
		assertTrue (builder.rootPackage != null);
		System.err.println("Packages : " + builder.getAllPackages().size() + " -  root : " + builder.rootPackage);
		
		// Save the ecore unit into a km/kmt file.
		System.err.println("Save in : " + kermeta_output_file);
		if (km_ext.equals("km")) 
			writeKMUnit(builder, kermeta_output_file);
		else
			writeKMTUnit(builder, kermeta_output_file);
		
		// Test the equality of all the elements (we use the km2kmt pretty printer :}) 
		String kofileURI;
		if(kermeta_output_file.contains("\\")) 
			kofileURI = "file:/" + kermeta_output_file.replaceAll("\\\\","/");
		else kofileURI = kermeta_output_file;
		assertKMFilesEquality(kermeta_input_file, kofileURI);
		
		return builder;
	}
	
	/**
	 * Transforms the km file given by input_file into an ecore file, and reversely
	 * @param kmext Kermeta extension
	 */
	public void testkmFile(String dir, String input_file) throws Exception {
		testkermetaFile(dir, input_file, "km");
	}
	
	/**
	 * Transforms the kmt file given by input_file into an ecore file, and reversely
	 * @param kmext Kermeta extension
	 */
	public void testkmtFile(String dir, String input_file) throws Exception {
		testkermetaFile(dir, input_file, "kmt");	
	}
	
	/** This method is like KermetaUnit.saveAsXMI but does not test if the object to save has already
	 *  a resource or not (this is what does saveAsXMI...), except for elements that
	 *  are defined in framework.km */
	public void writeKMUnit(KermetaUnit builder, String kermeta_output_file) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());
	    ArrayList resource_tags = new ArrayList();
	    Resource resource = new ResourceSetImpl().createResource(URI.createFileURI(kermeta_output_file));
	    Iterator it = builder.packages.values().iterator();
	    while(it.hasNext()) {
	        Package p = (Package)it.next();
	        KermetaUnit.fixTypeContainement(p);
	        // We don't want to add framework.km elements.
	        if (p.eResource()==null || !p.eResource().getURI().toString().endsWith("framework.km") )
	        {
	        	resource.getContents().add(p);
			    resource_tags = KermetaUnit.fixPackageTags(p, resource_tags);
	        }
	    }
	    // Add the tags registered in tags list to the resource
	    KermetaUnit.addFTagsToResource(resource, resource_tags);
	    try { resource.save(null); } catch (IOException e) { e.printStackTrace(); }
	}

	
	/**
	 * PrettyPrint the given KermetaUnit to the file
	 * overwrites the default behavior of UnitExporterWizard.
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public String writeKMTUnit(KermetaUnit builder, String file) throws Exception  {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(new File(file)));
		String pkg_name = "package " + NamedElementHelper.getQualifiedName(builder.rootPackage) + ";\n\n";
		System.out.println("PACKAGE\n\n\n\n" + pkg_name);
		w.write("package " + NamedElementHelper.getQualifiedName(builder.rootPackage) + ";\n\n");
		//w.write("require kermeta\n");
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			
			System.err.println("WRITE KERMETA UNIT : " + iu.getUri());
			
			if (iu.rootPackage != builder.rootPackage)
			// Do this if you don't want to convert the depending units in kmt
	/*			w.write("require \"" + iu.getUri() + "\"\n");*/
			// Do this otherwise
		/*	else */{
					String f = file.replace(".kmt", iu.rootPackage.getName() + ".kmt");
					writeKMTUnit(iu, f);

					/* windows specific patch */
					if(f.contains("\\")) 
						f = "file:/" + f.replaceAll("\\\\","/");
					w.write("require \"" + f + "\"\n");
					
			}
		}
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
		return str_kmt;
	}
	
	/**
	 * Write eacore : launches the KM2Ecore exporter on the given
	 * input_file (a kermeta file) and save it in ouput_file (an ecore file)
	 * @param input_file
	 * @param output_file
	 */
	public void writeEcore(String input_file, String output_file) throws Exception
	{   // Looad the EcoreUnit for the given file
		KermetaUnitFactory.getDefaultLoader().unloadAll();

		/* windows specific patch */
		String ifile ;
		if(input_file.contains("\\")) 
			ifile = "file:/" + input_file.replaceAll("\\\\","/");
		else
			ifile = input_file;
		String ofile ;
		if(output_file.contains("\\")) 
			ofile = "file:/" + output_file.replaceAll("\\\\","/");
		else
			ofile = output_file;
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(ifile);
		try {builder.load();} catch (Exception e) { throw e;}
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
		}
	    // Create Ecore structure
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
    	URI u = new URIConverterImpl().normalize(URI.createURI(ofile));
	    Resource resource = resource_set.createResource(u);
	    // KMT2ECORE
	    KM2Ecore exporter;
	    exporter = new KM2Ecore(resource, builder,ofile.substring(0, ofile.lastIndexOf("/"))+"/dep/",null);
	    exporter.setEcoreGenDirectory(ofile.substring(0, ofile.lastIndexOf("/"))+"/dep/");
		exporter.exportPackage(builder.rootPackage);
	    // Save Ecore structure	
		try {
			resource.save(null);
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: "+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource (" + output_file + "), due to Exception: ", e);
		}
	}
	
	/**
	 * Assertion is true if input_file content equals output_file content
	 * TODO : this method reliability MUST be checked.
	 * @param input_file
	 * @param output_file
	 * @throws IOException
	 */
	public void assertEcoreFilesEquality(String input_file, String output_file) throws Exception
	{
	    assertKMFilesEquality(input_file, output_file);
	}
	
	/** Compare each object of input file with each object of output file.
	 * The comparison is made through the pretty printed representations of 
	 * input and output , since they are more reliable than testing through the 
	 * objects URIs.
	 * TODO : we don't check the equality of the input and output file dependencies.
	 * So this verification is only partly reliable.
	 * */
	public void assertKMFilesEquality(String input_file, String output_file) throws Exception
	{
		// IMPORTANT : do not forget to reinitialize the KermetaUnitFactory before! (done with unloadAll)
		
	    // Load and pretty print the input unit
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		KermetaUnit i_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(input_file);
	    try {i_unit.load();} catch (Exception e) { throw e; }
	    String i_repr = printer.ppPackage(i_unit.rootPackage);
	    
	    // Load and pretty print the output unit
	    KermetaUnitFactory.getDefaultLoader().unloadAll();
	    KermetaUnit o_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(output_file);
	    try{o_unit.load();} catch (Exception e) { throw e; }
	    //o_unit.saveAsXMIModel(output_file.substring(0, output_file.lastIndexOf("/"))+"/dep/" 
	    //		+ output_file.substring(output_file.lastIndexOf("/")) +  ".d.km");
	    String o_repr = printer.ppPackage(o_unit.rootPackage);
	    System.out.println("INPUT : ");
	    System.out.println(i_repr);
	    System.out.println("------------------------ OUTPUT : ------------------ ");
	    System.out.println(o_repr);
	    // Check if the 2 pretty printed representations are equals
	    // This is not totally reliable -> example : see test 001_Simple.main.kmt 
	    assertTrue(i_repr.equals(o_repr));
	}
	
	/** Create and load a resource for the given input_file, and return it. */
	public Resource createAndLoadResource(ResourceSet resource_set, String input_file) throws IOException
	{
		URI u = URI.createURI(input_file);
    	System.err.println("URI created for model to load : "+u);
    	URIConverter c = new URIConverterImpl();
    	u = c.normalize(u);
	    Resource i_resource = resource_set.createResource(u);
	    i_resource.load(null);
	    return i_resource;
	}
}
