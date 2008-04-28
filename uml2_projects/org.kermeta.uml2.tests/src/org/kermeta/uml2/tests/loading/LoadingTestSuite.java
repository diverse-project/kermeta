/* $Id: LoadingTestSuite.java,v 1.9 2008-04-28 13:37:41 ftanguy Exp $
 * Project : Kermeta MDK UML2
 * File : LoadingTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1 
 */
package org.kermeta.uml2.tests.loading;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;

/**
 * UML2 Loading test suite.
 */
public class LoadingTestSuite extends TestSuite {
	static final String RUNTIMEPROJECTNAME = "kermeta_mdk.uml2.tests";
    
	public static Test suite() {
	    return new LoadingTestSuite();
	}    
     
	public LoadingTestSuite() {
		super();
		
		// ensure projects are created in the workbench
		IProject project =
			ResourcesPlugin.getWorkspace().getRoot().getProject(RUNTIMEPROJECTNAME);
		try{
			project.create( new NullProgressMonitor() );		
			project.open( new NullProgressMonitor() );
		} 
		catch (CoreException e) {
			e.printStackTrace();
		}

/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","001_testLoadingBankModel.main.kmt" );

		testWithFile("test/kmt_testcases","002_testLoadingImprovedVehiclesModel.main.kmt" );

		testWithFile("test/kmt_testcases","003_testLoadingGOFStatePatternModel.main.kmt" );

		testWithFile("test/kmt_testcases","004_testLoadingSimulatorDesignModel.main.kmt" );

		testWithFile("test/kmt_testcases","005_testLoadingSimpleBehavioredClassModel.main.kmt" );

		testWithFile("test/kmt_testcases","101test_AbstractClass.main.kmt" );

		testWithFile("test/kmt_testcases","102test_ClassInheritance.main.kmt" );

		testWithFile("test/kmt_testcases","102test_Composition.main.kmt" );

		testWithFile("test/kmt_testcases","103test_MultipleReference.main.kmt" );

		testWithFile("test/kmt_testcases","103test_Reference.main.kmt" );

		testWithFile("test/kmt_testcases","104test_OperationParameter.main.kmt" );

		testWithFile("test/kmt_testcases","104test_OperationReturn.main.kmt" );

		testWithFile("test/kmt_testcases","105test_ExternalInheritance.main.kmt" );

		testWithFile("test/kmt_testcases","500test_Tool_Generalization.main.kmt" );

		testWithFile("test/kmt_testcases","501test_Tool_Interface.main.kmt" );

		testWithFile("test/kmt_testcases","501test_Tool_InterfaceAbstract.main.kmt" );

		testWithFile("test/kmt_testcases","502test_Tool_Accessor.main.kmt" );

		testWithFile("test/kmt_testcases","502test_Tool_Accessor_Public.main.kmt" );

		testWithFile("test/kmt_testcases","503test_Tool_Transition.main.kmt" );

		testWithFile("test/kmt_testcases","504test_Tool_Context4States.main.kmt" );

		testWithFile("test/kmt_testcases","505test_Tool_Association.main.kmt" );

		testWithFile("test/kmt_testcases","601test_Tool_GOFStatePattern_apply.main.kmt" );

		testWithFile("test/kmt_testcases","601test_Tool_GOFStatePattern_visitors.main.kmt" );

		testWithFile("test/kmt_testcases","701test_CloneTool_Package.main.kmt" );

		testWithFile("test/kmt_testcases","702test_CloneTool_Class.main.kmt" );

		testWithFile("test/kmt_testcases","703test_CloneTool_Operation.main.kmt" );

		testWithFile("test/kmt_testcases","704test_CloneTool_Parameter.main.kmt" );

		testWithFile("test/kmt_testcases","705test_CloneTool_Property.main.kmt" );

		testWithFile("test/kmt_testcases","706test_CloneTool_ValueSpecification.main.kmt" );

		testWithFile("test/kmt_testcases","707test_CloneTool_Association.main.kmt" );

		testWithFile("test/kmt_testcases","708test_CloneTool_DataType.main.kmt" );

		testWithFile("test/kmt_testcases","750test_CloneTool_StaticDiagram.main.kmt" );

/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/org.kermeta.uml2.tests/" + dir + "/" + file;
		
		Test tests = new RunJunitFactory().addTestsForUnit(uri);
		addTest( tests );
	}
	
}
