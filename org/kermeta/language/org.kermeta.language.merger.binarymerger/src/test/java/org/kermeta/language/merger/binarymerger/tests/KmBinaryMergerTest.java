/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.merger.binarymerger.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.helper.tests.utils.EMFCompareModelHelper;
import org.kermeta.language.helper.tests.utils.ModelingUnitUtil;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.reference.ModelReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
//import org.kermeta.language.api.tests.ModelingUnitUtil;


/**
 *
 */
public class KmBinaryMergerTest extends TestCase {

    public String primaryFilePath;
    public String aspectFilePath;
    public String outputFilePath;
    public String expectedOutputFilePath;
    public String baseName;
    
    public ResourceSet resourceSet;
    
    
    public Boolean valid;
    public org.kermeta.language.merger.binarymerger.api.KmBinaryMerger merger = null;

    public KmBinaryMergerTest(String baseName, String primaryFilePath, String aspectFilePath, String outputFilePath, String expectedOutputfilePath, Boolean _valid, org.kermeta.language.merger.binarymerger.api.KmBinaryMerger merger) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println(" creating test ");
        System.out.println("                 basename " + baseName);
        System.out.println("          primaryFilePath " + primaryFilePath);
        System.out.println("           aspectFilePath " + aspectFilePath);
        System.out.println("           outputFilePath " + outputFilePath);
        System.out.println("   expectedOutputfilePath " + expectedOutputfilePath);
        this.primaryFilePath = primaryFilePath;
        this.aspectFilePath = aspectFilePath;
        this.outputFilePath = outputFilePath;
        this.baseName = baseName;
        this.expectedOutputFilePath = expectedOutputfilePath;
        this.valid = _valid;
        this.merger = merger;
        resourceSet = new ResourceSetImpl();
	Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
	Map<String,Object> m = f.getExtensionToFactoryMap();
	m.put("km",new XMIResourceFactoryImpl());
	//resourceSet.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    }

    public void test() throws IOException, URISyntaxException  {

        System.out.println("Test merging " + primaryFilePath);
        System.out.println("        with " + aspectFilePath);
        
        ModelingUnit primaryModel = ModelingUnitUtil.loadModelingUnit(primaryFilePath);
        ModelingUnit aspectModel = ModelingUnitUtil.loadModelingUnit(aspectFilePath);
        ErrorProneResult<ModelingUnit> result = merger.merge(primaryModel, aspectModel);

        if(primaryFilePath.endsWith(".kmt")){
        	String intermediateResultPath = outputFilePath.replaceAll(".km", "") + "_intermediate_primary.xmi";
        	System.out.println("   saving intermediate result in " + intermediateResultPath);
            ModelingUnitUtil.saveModelingUnit(intermediateResultPath, primaryModel);
        }
        if(aspectFilePath.endsWith(".kmt")){
        	String intermediateResultPath = outputFilePath.replaceAll(".km", "") + "_intermediate_aspect.xmi";
        	System.out.println("   saving intermediate result in " + intermediateResultPath);
            ModelingUnitUtil.saveModelingUnit(intermediateResultPath, aspectModel);
        }

        System.out.println("   saving merge result in " + outputFilePath);
        ModelingUnitUtil.saveModelingUnit(outputFilePath, result.getResult());
        
       // EcoreUtil.EqualityHelper eQH = new EcoreUtil.EqualityHelper();
        
        ModelingUnit expectedResult = ModelingUnitUtil.loadModelingUnit(expectedOutputFilePath);
        
        if (this.valid) {
        	// the merge is supposed to be valid
        	assertTrue("result model not equals to expected output", EMFCompareModelHelper.isSimilarAndSaveDiff((result.getResult()), expectedResult, outputFilePath+".diff"));
        	
        	//assertTrue("result model not equals to expected output", EMFCompareModelHelper.isSimilar(result.getModelingUnit(), expectedResult));
        	//assertTrue("result model not equals to expected output", eQH.equals(result.getModelingUnit(), expectedResult)); 
        	String msg ="";
        	if(result.hasSevereProblems()){
        		msg= result.getProblems().get(0).getMessage();
        	}
            assertFalse("Merger has reported error but expecting none. (first message = "+msg+")",result.hasSevereProblems());
        } else {
        	// the merge is supposed to be invalid
            assertTrue("Merger hasn't reported error but expecting some",result.hasSevereProblems());
            System.out.println("   succesfully detected a merge error : "+result.getProblems().get(0).getMessage());
        }
    }


    
    @Override
    public String getName() {
        return baseName;
    }

    @Override
    public void runTest() throws Throwable  {
        test();


    }

    @Override
    protected void tearDown() throws Exception {
        

    }
}
