/* $Id: JunitTestSuite.java,v 1.2 2006-02-14 10:15:04 zdrey Exp $
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
import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.ecore.ECore2Kermeta;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {


	public JunitTestSuite(String arg0) {
		super(arg0);
		
		 // SET THE STD LIB
	    KermetaUnit.STD_LIB_URI = "lib/framework.km";
	    // INIT TYPE CHECKER
	  //  TypeCheckerContext.initializeTypeChecker(KermetaUnit.getStdLib());
		
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

public void testkmt_001_Simple() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","001_Simple.main.kmt" );
}

public void testkmt_002_RequireEcore() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","002_RequireEcore.main.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment



	/**
	 * Transforms the ecore file given by file into an kmt file, and reversely
	 * 
	 */
	public void testecoreFile(String dir, String file) throws Exception {
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();
	    String ecore_input_file = dir + "/" + file;
	    // LOAD THE UNIT (this call the EcoreUnit method loader)
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(ecore_input_file);
		try {
		builder.load();
		} catch(Exception e ) {if (!builder.messages.hasError()) throw e;};
		
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
		}
		// Enable quick fixer
		ECore2Kermeta.isQuickFixEnabled = true;
		
		// Create ecore2km visitor -- output_file
		String output_file = dir + "/output/" + file.replaceAll("\\.ecore", ".kmt");
		// Save the kmt generated file
		
		output_file = new URIConverterImpl().normalize(URI.createURI(output_file)).toFileString();
		//output_file = "platform:/resource/fr.irisa.triskell.kermeta.io/"+ output_file;
		
		System.out.println("Write kmt output : "+ output_file);
		writeUnit(builder, output_file);
		System.out.println("output written");
		// Reload the output kmt
		
		// Regenerate the ecore from the kmt
		String ecore_output_file = output_file.replaceAll("\\.kmt", ".ecore");
		System.out.println("Write ecore output :" + ecore_output_file +", from generated ecore : "+ output_file);
		writeEcore(output_file,  ecore_output_file);
		System.out.println("ecore output written");
		
		// Test the equality
		assertEcoreFilesEquality(ecore_input_file, ecore_output_file);
	}
	/**
	 * Transforms the kmt file given by file into an ecore file, and reversely
	 * TODO implement this method !
	 */
	public void testkmtFile(String dir, String file) throws Exception {
	}
	/**
	 * PrettyPrint the given KermetaUnit to the file
	 * overwrites the default behavior of UnitExporterWizard.
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, String file) throws Exception  {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(new File(file)));
/*		URI u = URI.createURI(file);
		OutputStream out = new URIConverterImpl().createOutputStream(u);
		*/
		String pkg_name = "package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage) {
				
				if (iu instanceof KMTUnit || iu instanceof KMUnit)
					w.write("require \"" + iu.getUri() + "\"\n");
				else {
					String f = file.replaceAll(".kmt", iu.rootPackage.getFName() + ".kmt");
					writeUnit(iu, f);
					w.write("require \"" + f + "\"\n");
				}
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
	}
	
	/**
	 * Write eacore : launches the KM2Ecore exporter and save it in "file"
	 * @param dir
	 * @param file
	 */
	public void writeEcore(String input_file, String file) throws Exception
	{   
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(input_file);
		try {
		    builder.load();
		} catch(Exception e ) {if (!builder.messages.hasError()) throw e;};
		
/*		if (builder.getAllErrors().size() > 0) {
		    System.err.println("Messages d'erreur!") ;
		    assertTrue(builder.getAllMessagesAsString(), false);
		}*/
	    //	  create Ecore structure
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    URI u = URI.createURI(file);
    	KermetaUnit.internalLog.info("URI created for model to save : "+u);
    	URIConverter c = new URIConverterImpl();
    	u = c.normalize(u);
	    Resource resource = resource_set.createResource(u);
	    
	    // KMT2ECORE
	    KM2Ecore exporter;
	    exporter = new KM2Ecore(resource, builder);
		exporter.exportPackage(builder.rootPackage);
	    // Save Ecore structure	
		try {
			resource.save(null);
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: "+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource (" + file + "), due to Exception: ", e);
		}
	}
	
	/**
	 * Assertion is true if input_file content equals output_file content
	 * @param input_file
	 * @param output_file
	 * @throws IOException
	 */
	public void assertEcoreFilesEquality(String input_file, String output_file) throws IOException
	{
	    // load the ecore input
	    // load the ecore output
	    //	  create Ecore structure
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    URI u = URI.createURI(input_file);
    	KermetaUnit.internalLog.info("URI created for model to load : "+u);
    	URIConverter c = new URIConverterImpl();
    	u = c.normalize(u);
	    Resource i_resource = resource_set.createResource(u);
	    
	    i_resource.load(null);
	    
	    URI ou = URI.createURI(output_file);
    	KermetaUnit.internalLog.info("URI created for model to load : "+ou);
    	ou = c.normalize(ou);
	    Resource o_resource = resource_set.createResource(ou);
	    o_resource.load(null);
	    
	    TreeIterator it = i_resource.getAllContents();
	    while (it.hasNext())
	    {
	        EObject next = (EObject)it.next();
	        String frag = EcoreUtil.getURI(next).fragment();
	        if (o_resource.getEObject(frag)==null) System.err.println("EObject not found in output model:"+ frag);
	        assertTrue(o_resource.getEObject(EcoreUtil.getURI(next).fragment())!=null);
	    }
	    
	}
	
}
