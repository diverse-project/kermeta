/* $Id: JunitTestSuite.java,v 1.14 2007-07-20 15:08:16 ftanguy Exp $
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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.io.printer.KMTOutputBuilder;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {
	
	private IOPlugin ioPlugin;
	
	public JunitTestSuite(String arg0) {
		super(arg0);
		initialize();	
	}

	private void initialize() {
		
		if ( ioPlugin == null ) {
			IOPlugin.LOCAL_USE = true;
			ioPlugin = IOPlugin.getDefault();
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
public void testecore_004_Enum() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","004_Enum.main.ecore" );
}

public void testecore_003_UML2() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","003_UML2.main.ecore" );
}

public void testecore_006_PropertyWithEcoreTypes() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","006_PropertyWithEcoreTypes.main.ecore" );
}

public void testecore_002_Simple() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","002_Simple.main.ecore" );
}

public void testecore_009_Operation() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","009_Operation.main.ecore" );
}

public void testecore_001_puzzle() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","001_puzzle.main.ecore" );
}

public void testecore_005_Property() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","005_Property.main.ecore" );
}

public void testecore_007_PropertyWithDataTypes() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","007_PropertyWithDataTypes.main.ecore" );
}

public void testecore_011_TagRoudTrip() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","011_TagRoudTrip.main.ecore" );
}

public void testecore_010_twopackages() throws Exception {
testecoreFile("test/roundtrip_testcases/ecore","010_twopackages.main.ecore" );
}

public void testkmt_011_testRequireFramework() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","011_testRequireFramework.main.kmt" );
}

public void testkmt_002_RequireEcore() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","002_RequireEcore.main.kmt" );
}

public void testkmt_016_testTypeVariableTypes() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","016_testTypeVariableTypes.main.kmt" );
}

public void testkmt_015_testEnumerationAsProperty() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","015_testEnumerationAsProperty.main.kmt" );
}

public void testkmt_009_testRequireFramework() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","009_testRequireFramework.main.kmt" );
}

public void testkmt_005_DerivedPropertyBody() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","005_DerivedPropertyBody.main.kmt" );
}

public void testkmt_013_testRedefinedOperations() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","013_testRedefinedOperations.main.kmt" );
}

public void testkmt_010_testAliasInOperationBody() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","010_testAliasInOperationBody.main.kmt" );
}

public void testkmt_001_Simple() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","001_Simple.main.kmt" );
}

public void testkmt_007_testAlias() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","007_testAlias.main.kmt" );
}

public void testkmt_003_ComplexTest_rdl() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","003_ComplexTest_rdl.main.kmt" );
}

public void testkmt_006_PropertyWithEcoreTypes() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","006_PropertyWithEcoreTypes.main.kmt" );
}

public void testkmt_014_testParameterizedClass() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","014_testParameterizedClass.main.kmt" );
}

public void testkmt_004_OperationBody() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","004_OperationBody.main.kmt" );
}

public void testkmt_008_testAlias() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","008_testAlias.main.kmt" );
}

public void testkmt_011_testPropertyConversionInEcore() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","011_testPropertyConversionInEcore.main.kmt" );
}

public void testkmt_012_testCommentAnnotations() throws Exception {
testkmtFile("test/roundtrip_testcases/kmt","012_testCommentAnnotations.main.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment

	/**
	 * Transforms the ecore file given by file into an kmt file, and reversely
	 * 
	 */
	public void testecoreFile(String dir, String file) throws Exception {

		dir = "platform:/plugin/fr.irisa.triskell.kermeta.io/" + dir;
		int index = file.lastIndexOf(".");
		String fileName = file.substring(0, index);
		String outputDir = dir + "/" + fileName;
		
		String ecoreBaseFile = dir + "/" + file;
		String kmtFile = outputDir + "/" + fileName + ".kmt";
		String ecoreFile = outputDir + "/" + fileName + ".ecore";
				
		
		KermetaUnit baseEcoreUnit = IOPlugin.getDefault().loadKermetaUnit( ecoreBaseFile );		
		if ( ! baseEcoreUnit.isErrored() ) {
			KermetaTypeChecker typechecker = new KermetaTypeChecker( baseEcoreUnit );
			typechecker.checkUnit();
		}
		if ( ! baseEcoreUnit.isErrored() ) {
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( baseEcoreUnit );
				constraintchecker.checkUnit();
		}
		if ( baseEcoreUnit.isErrored() )
			assertTrue( KermetaUnitHelper.getAllErrorsAsString(baseEcoreUnit), false );
		

		// Save the kmt generated file
		KMTOutputBuilder printer = new KMTOutputBuilder();
		printer.print( baseEcoreUnit, outputDir );
		printer.flush();
		
		// Regenerate the ecore from the kmt
		KermetaUnit kmtUnit = IOPlugin.getDefault().loadKermetaUnit( kmtFile );
		if ( ! kmtUnit.isErrored() ) {
			KermetaTypeChecker typechecker = new KermetaTypeChecker( kmtUnit );
			typechecker.checkUnit();
		}
		if ( ! kmtUnit.isErrored() ) {
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( kmtUnit );
				constraintchecker.checkUnit();
		}
		if ( kmtUnit.isErrored() )
			assertTrue( KermetaUnitHelper.getAllErrorsAsString(kmtUnit), false );
		
		
		EcoreExporter exporter = new EcoreExporter();
		exporter.export(kmtUnit, outputDir );
		
		KermetaUnit ecoreUnit = IOPlugin.getDefault().loadKermetaUnit( ecoreFile );
		
		assertFilesEquality(baseEcoreUnit, ecoreUnit);
		//MatchService.getInstance().doMatch(kmtUnit.getCompilationUnit(), ecoreUnit.getCompilationUnit(), new NullProgressMonitor() );
	
	}
	
	
	private void testkmtFile(String dir, String file) throws Exception {
		
		dir = "platform:/plugin/fr.irisa.triskell.kermeta.io/" + dir;
		int index = file.lastIndexOf(".");
		String fileName = file.substring(0, index);
		String outputDir = dir + "/" + fileName;
		
		String kmtBaseFile = dir + "/" + file;
		String ecoreFile = outputDir + "/" + fileName + ".ecore";
		String kmtFile = outputDir + "/" + fileName + ".kmt";
		
		KermetaUnit baseKMTUnit = IOPlugin.getDefault().loadKermetaUnit( kmtBaseFile );		
		if ( ! baseKMTUnit.isErrored() ) {
			KermetaTypeChecker typechecker = new KermetaTypeChecker( baseKMTUnit );
			typechecker.checkUnit();
		}
		if ( ! baseKMTUnit.isErrored() ) {
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( baseKMTUnit );
				constraintchecker.checkUnit();
		}
		if ( baseKMTUnit.isErrored() )
			assertTrue( KermetaUnitHelper.getAllErrorsAsString(baseKMTUnit), false );
		
		// Export to ecore
		EcoreExporter exporter = new EcoreExporter();
		exporter.export(baseKMTUnit, outputDir);
	
		// Regenerate the kmt from the previous ecore
		KermetaUnit ecoreUnit = IOPlugin.getDefault().loadKermetaUnit( ecoreFile );
		if ( ! ecoreUnit.isErrored() ) {
			KermetaTypeChecker typechecker = new KermetaTypeChecker( ecoreUnit );
			typechecker.checkUnit();
		}
		if ( ! ecoreUnit.isErrored() ) {
				KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( ecoreUnit );
				constraintchecker.checkUnit();
		}
		if ( ecoreUnit.isErrored() )
			assertTrue( KermetaUnitHelper.getAllErrorsAsString(ecoreUnit), false );
		
		KMTOutputBuilder printer = new KMTOutputBuilder();
		printer.print( ecoreUnit, outputDir );
		printer.flush();
		
		KermetaUnit kmtUnit = IOPlugin.getDefault().loadKermetaUnit( kmtFile );
		
		assertFilesEquality(baseKMTUnit, kmtUnit);
	}
	

	public void assertFilesEquality(KermetaUnit input, KermetaUnit output) throws Exception {

		KM2KMTPrettyPrinter p = new KM2KMTPrettyPrinter();
		p.ppCompilationUnit( input.getModelingUnit() );
		String inputContent = p.getContent();
		
		p = new KM2KMTPrettyPrinter();
		p.ppCompilationUnit( output.getModelingUnit() );
		String outputContent = p.getContent();
		
		File file = new File("/home/paco/workspace/kermeta/fr.irisa.triskell.kermeta.io/test/roundtrip_testcases/ecore/paco.kmt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(outputContent.getBytes());
		fos.close();
		
		System.out.println("INPUT : ");
	    System.out.println(inputContent);
	    System.out.println("------------------------ OUTPUT : ------------------ ");
	    System.out.println(outputContent);
	    // Check if the 2 pretty printed representations are equals
	    // This is not totally reliable -> example : see test 001_Simple.main.kmt 
	    assertTrue(
	    	! inputContent.equals("") 
	    	&& inputContent.equals(outputContent));
	}
	
	
}
