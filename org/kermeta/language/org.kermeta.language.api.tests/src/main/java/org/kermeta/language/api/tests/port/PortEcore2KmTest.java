/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.api.tests.port;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.api.tests.ModelingUnitUtil;
import org.kermeta.language.api.tests.comparison.EMFCompareModelHelper;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.structure.ModelingUnit;

public class PortEcore2KmTest extends TestCase {
//    public String fileInputPath;
//    public String fileExpectedPath;
//    public String fileOutputPath;
    public String baseName;
    public ResourceSet resourceSet;
    
    public Boolean valid;
    public org.kermeta.language.api.port.PortEcore2Km ecore2km = null;
    
    
    public PortEcore2KmTest(final String baseName, //final String fileInputPath, final String fileExpectedPath, 
    						//final String fileOutputPath, 
    						Boolean valid, PortAbstractFactory<PortEcore2Km> factory) 
    					throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println(" creating test ");
        System.out.println("\tbasename " + baseName);
//        System.out.println("           fileInputPath " + fileInputPath);
//        System.out.println("        fileExpectedPath " + fileExpectedPath);
//        System.out.println("          fileOutputPath " + fileOutputPath);
//        this.fileInputPath    = fileInputPath;
//        this.fileExpectedPath = fileExpectedPath;
//        this.fileOutputPath   = fileOutputPath;
        this.baseName 		  = baseName;
        this.valid 			  = valid;
        ecore2km 			  = factory.create();
        resourceSet 		  = new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m 		= f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());
		m.put("ecore",new XMIResourceFactoryImpl());
    }
    
    
    public static EPackage loadEcoreModel(String modelFilePath){
    	URI uri = URI.createURI(modelFilePath);
    	
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    			  Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
    	Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put(
    				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
//    	ResourceSet resourceSet = new ResourceSetImpl();
//    	URI fileURI = URI.createFileURI(modelFilePath);
//    	Resource resource = resourceSet.getResource(fileURI, true);
    	
		/*
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path. 
		 */
		URIConverter converter	= new ExtensibleURIConverterImpl();
		uri 					= converter.normalize(uri);
		Resource resource		= new ResourceSetImpl().getResource(uri, true);

		for(EObject o : resource.getContents())
			if(o instanceof EPackage)
				return (EPackage)o;
		return null;
    }  
    
    
    public void test() throws IOException  {
        System.out.println("Test ecore2km " + baseName + ".ecore");
        EPackage pkg = loadEcoreModel(baseName+".ecore");
        System.out.println("pkg="+pkg);
        ModelingUnit result = ecore2km.convertPackage(pkg, "namespace");
        System.out.println("res="+pkg);
        System.out.println("   saving merge result in " + baseName + ".km");
        ModelingUnitUtil.saveModelingUnit(baseName + ".km", result);
        ModelingUnit expectedResult = ModelingUnitUtil.loadModelingUnit(baseName + "Ref.km");
        
        if(valid) {
        	// the merge is supposed to be valid
        	assertTrue("result model not equals to expected output", 
        			EMFCompareModelHelper.isSimilarAndSaveDiff(result, expectedResult, baseName + ".diff"));
//        	String msg ="";
//        	if(result.hasSevereProblems()){
//        		msg= result.getProblems().get(0).getMessage();
//        	}
//            assertFalse("Merger has reported error but expecting none. (first message = "+msg+")",result.hasSevereProblems());
        } else {
        	// the merge is supposed to be invalid
//            assertTrue("Merger hasn't reported error but expecting some",result.hasSevereProblems());
        }
    }
    
    
    @Override
    public void runTest() throws Throwable  {
        test();
    }
}
