package org.kermeta.language.api.tests.port;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.result.ModelingUnitResult;

import junit.framework.TestCase;

import org.kermeta.language.api.tests.ModelingUnitUtil;
import org.kermeta.language.api.tests.comparison.EMFCompareModelHelper;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.structure.ModelingUnit;

//import org.kermeta.language.merger.multimerger.art2.impl.Art2ComponentKmMultiMergerFactory;

public class PortKmMultiMergerTest extends TestCase {

	public boolean valid = true;
	public PortKmMerger mmerger = null;
	//public PortKmBinaryMerger bmerger = null;
	
	// Resource folders
    public List<String> inputFilesPath;
    public String outputFilePath;
    public String expectedOutputFilePath;
    public String baseName;

    public ResourceSet resourceSet;
    
    public PortKmMultiMergerTest(String baseName, List<String> inputFilesPath, String outputFilePath, String expectedOutputfilePath, 
    							 Boolean _valid, PortAbstractFactory<PortKmMerger> factory)	throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
        
    	System.out.println("------------------------------\nCreating test : " + baseName);
        for (String file : inputFilesPath) {
        	System.out.println("\tInput           : " + file);
        }
        System.out.println("\tOuput           : " + outputFilePath);
        System.out.println("\tExpected output : " + expectedOutputfilePath);
        
        this.inputFilesPath = inputFilesPath;
        this.outputFilePath = outputFilePath;
        this.baseName = baseName;
        this.expectedOutputFilePath = expectedOutputfilePath;
        this.valid = _valid;

        mmerger = factory.create();
  
        resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
        Map<String,Object> m = f.getExtensionToFactoryMap();
        m.put("km",new XMIResourceFactoryImpl());
        //resourceSet.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    }
	
    public void test() throws IOException  {
    	
    	System.out.println("---------------------------------\nTest execution : " + this.baseName + "\nMerging files : ");
    	for (String file : inputFilesPath) {
    		System.out.println("\t- " + file);
    	}
        
    	List<ModelingUnit> listKm = new ArrayList<ModelingUnit>();
    	
    	for (String file : inputFilesPath) {
    		System.out.println("Loading ... " + file);
    		listKm.add(ModelingUnitUtil.loadModelingUnit(file));
    	}
        
    	
    	ModelingUnitResult result = mmerger.merge(listKm);
    	
    	// Save the result of the merge
        System.out.println("Saving merge result in " + outputFilePath);
        ModelingUnitUtil.saveModelingUnit(outputFilePath, result.getModelingUnit());

    	
    	// Compare result with expected output
        System.out.println("Compare merge result with " + expectedOutputFilePath);
        ModelingUnit expectedResult = ModelingUnitUtil.loadModelingUnit(expectedOutputFilePath);

        if (this.valid) {
        	// the merge is supposed to be valid
        	assertTrue("Result model not equals to expected output", EMFCompareModelHelper.isSimilarAndSaveDiff(result.getModelingUnit(), expectedResult, outputFilePath+".diff"));
        	String msg ="";
        	if(result.hasSevereProblems()){
        		msg= result.getProblems().get(0).getMessage();
        	}
            assertFalse("Merger has reported error but expecting none. (first message = "+msg+")",result.hasSevereProblems());
        } else {
        	// the merge is supposed to be invalid
        	System.out.println("Problems : " + result.getProblems().size());
        	for (ProblemMessage problem : result.getProblems()) {
        		System.out.println("  Msg : " + problem.getMessage());
        	}
        	
            assertTrue("Merger hasn't reported error but expecting some",result.hasSevereProblems());
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
