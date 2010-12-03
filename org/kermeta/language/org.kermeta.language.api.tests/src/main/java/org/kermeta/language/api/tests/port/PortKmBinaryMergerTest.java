/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.tests.port;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.structure.ModelingUnit;

/**
 *
 */
public class PortKmBinaryMergerTest extends TestCase {

    public String primaryFilePath;
    public String aspectFilePath;
    public String outputFilePath;
    public String expectedOutputFilePath;
    public String baseName;
    
    public ResourceSet resourceSet;
    
    
    public Boolean valid;
    public org.kermeta.language.api.port.PortKmBinaryMerger merger = null;

    public PortKmBinaryMergerTest(String baseName, String primaryFilePath, String aspectFilePath, String outputFilePath, String expectedOutputfilePath, Boolean _valid, Class mergerclass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
        merger = (PortKmBinaryMerger) mergerclass.getConstructors()[0].newInstance();
        resourceSet = new ResourceSetImpl();
	Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
	Map<String,Object> m = f.getExtensionToFactoryMap();
	m.put("km",new XMIResourceFactoryImpl());
	//resourceSet.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    }

    public void test() throws IOException  {

        System.out.println("Test merging " + primaryFilePath);
        System.out.println("        with " + aspectFilePath);
        
        
        ModelingUnitResult result = merger.merge(loadModelingUnit(primaryFilePath), loadModelingUnit(aspectFilePath));
        
        EcoreUtil.EqualityHelper eQH = new EcoreUtil.EqualityHelper();
        
        ModelingUnit expectedResult = loadModelingUnit(expectedOutputFilePath);
        
        if (this.valid) {
        	// the merge is supposed to be valid
        	assertTrue("result model not equals to expected output", eQH.equals(result.getModelingUnit(), expectedResult));            
            assertFalse("Merger has reported error but expecting none",result.hasSevereProblems());
        } else {
        	// the merge is supposed to be invalid
            assertTrue("Merger hasn't reported error but expecting some",result.hasSevereProblems());
        }
        System.out.println("   saving merge result in " + outputFilePath);
        saveModelingUnit(outputFilePath, result.getModelingUnit());
    }

    protected ModelingUnit loadModelingUnit(String modelFilePath){
    	URI uri = URI.createURI( modelFilePath );
		/*
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path. 
		 */
		URIConverter converter = new ExtensibleURIConverterImpl();
		uri = converter.normalize(uri);
		Resource resource = resourceSet.getResource(uri, true);
		for(EObject o : resource.getContents()){
			if( o instanceof ModelingUnit){
				return (ModelingUnit) o;
			}				
		}
		return null;
    }
    
    protected void saveModelingUnit(String modelFilePath, ModelingUnit modelingUnit) throws IOException {
    	URI uri = URI.createURI( modelFilePath );
		/*
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path. 
		 */
		URIConverter converter = new ExtensibleURIConverterImpl();
		uri = converter.normalize(uri);
	/*	XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot(); 
		XMLNamespacePackage.eINSTANCE.getEFactoryInstance(); */
		Resource resource = resourceSet.createResource(uri);
     /*   ((XMIResource)resource).getDefaultLoadOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");
        ((XMIResource)resource).getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");  */
		resource.getContents().add(modelingUnit);
		resource.save(null);		
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
