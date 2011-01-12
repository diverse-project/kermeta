/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z cbouhour $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : December 2010
 * Authors :
 *			Cédric Bouhours <cedric.bouhours@inria.fr>
 */
package org.kermeta.language.api.tests.port;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortKmResolver;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.api.tests.ModelingUnitUtil;
import org.kermeta.language.api.tests.comparison.EMFCompareModelHelper;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.structure.ModelingUnit;

/**
 *
 */
public class PortKmResolverTest extends TestCase {

	 public ResourceSet resourceSet;
	 public String kmtPath;
	 public String output;
	 public String currentTest;
	 public List<String> outputFiles;
	 public PortKmResolver resolver = null;
	
    public PortKmResolverTest(String filePath, List<String> outputFiles, String outputFolder, String currentTestName, PortAbstractFactory<PortKmResolver> factory) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
    	System.out.println("PortKmResolverTest created for file : "+filePath);
    	kmtPath = filePath;
    	resolver = factory.create();
        resourceSet = new ResourceSetImpl();
        output = outputFolder;
        currentTest = currentTestName;
        this.outputFiles = outputFiles;
        Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
        Map<String,Object> m = f.getExtensionToFactoryMap();
        m.put("km",new XMIResourceFactoryImpl());
    }

    public void test() throws IOException  {
    	System.out.println("PortKmResolverTest launched");
    	ModelingUnitResult muResolved = null;
    	try {
    		muResolved = resolver.resolve(ModelingUnitUtil.loadModelingUnit(kmtPath));
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	assertFalse(muResolved == null);
    	if (muResolved != null) {
    		String outputFile = currentTest.substring(0, currentTest.lastIndexOf(".")) + "Resolved" + currentTest.substring(currentTest.lastIndexOf(".")); 
            System.out.println("Saving resolve result in " + output + "/" + outputFile);
            ModelingUnitUtil.saveModelingUnit(output + "/" + outputFile, muResolved.getModelingUnit());
            for (String elem : outputFiles) {
            	if (elem.endsWith(outputFile)) {
                    System.out.println("Loading expected result : "+elem);
                    ModelingUnit expectedResult = ModelingUnitUtil.loadModelingUnit(elem);
                    assertTrue("Result model not equals to expected output", EMFCompareModelHelper.isSimilarAndSaveDiff(muResolved.getModelingUnit(), expectedResult, output + "/" + outputFile +".diff"));
                	String msg ="";
                	if(muResolved.hasSevereProblems()){
                		msg= muResolved.getProblems().get(0).getMessage();
                	}
                    assertFalse("Resolver has reported error but expecting none. (first message = "+msg+")",muResolved.hasSevereProblems());
            	}
            }
    	}
    	assertTrue(true);
    }

    @Override
    public void runTest() throws Throwable  {
        test();


    }

    @Override
    protected void tearDown() throws Exception {
        

    }
}
