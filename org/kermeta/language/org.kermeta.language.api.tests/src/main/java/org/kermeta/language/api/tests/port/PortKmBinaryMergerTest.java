/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
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
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.port.PortResourceLoader.URIType;
import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
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
        
        
        ModelingUnit result = merger.merge(loadModelingUnit(primaryFilePath), loadModelingUnit(aspectFilePath));
        
        EcoreUtil.EqualityHelper eQH = new EcoreUtil.EqualityHelper();
        
        ModelingUnit expectedResult = loadModelingUnit(expectedOutputFilePath);
        assertTrue("result model not equals to expected output", eQH.equals(result, expectedResult));
        
        System.out.println(this.valid);

        if (result == null) {
            assertFalse(this.valid);
        } else {
            assertTrue(this.valid);
        }
        System.out.println("   saving merge result in " + outputFilePath);
        saveModelingUnit(outputFilePath, result);
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
