/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.api.tests.port;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.api.tests.comparison.EMFCompareModelHelper;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.behavior.impl.BehaviorFactoryImpl;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.impl.StructureFactoryImpl;


public class PortEcore2KmTest extends TestCase {
	private static ResourceSet resourceSet;
    private static kermeta.persistence.EMFRepository rep;
    private static URIConverter converter;
    
    public EPackage pkg;
    public String fileOutputPath;
    public String baseName;
    
    public Boolean valid;
    public org.kermeta.language.api.port.PortEcore2Km ecore2km = null;
    
    static {
		StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

    	resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);
    	Resource.Factory.Registry fac = resourceSet.getResourceFactoryRegistry();
    	Map<String,Object> m = fac.getExtensionToFactoryMap();
		m.put("ecore",new XMIResourceFactoryImpl());
		m.put("km", new XMIResourceFactoryImpl());
		m.put("*", new XMIResourceFactoryImpl());
	
		rep = kermeta.persistence.RichFactory.createEMFRepository();
		converter = new ExtensibleURIConverterImpl();
    }
    
    
    public PortEcore2KmTest(final String baseName, //final String fileInputPath, final String fileExpectedPath, 
    						final String fileOutputPath, final EPackage pkg,
    						Boolean valid, PortAbstractFactory<PortEcore2Km> factory) 
    					throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println(" creating test ");
        System.out.println("\tbasename " + baseName);
        System.out.println("\tfileOutputPath " + fileOutputPath);
        this.pkg			  = pkg;
        this.fileOutputPath   = fileOutputPath;
        this.baseName 		  = baseName;
        this.valid 			  = valid;
        ecore2km 			  = factory.create();
    }
    
    
	protected static ByteArrayOutputStream saveMu(ModelingUnit mu) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		URI	uri = URI.createURI((mu.getNamespacePrefix() + "." + mu.getName() + ".km").replaceAll("::", "."));
		Map<String, String> options = null;
		if (mu.eResource() != null) {
			uri = mu.eResource().getURI();
		} else {
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(mu);
		}
		mu.eResource().save(outputStream, options);
		return outputStream;
	}
    
	
	protected static ModelingUnit loadKM(String uri) throws IOException {
		URI ruri =  URI.createURI(uri);
		Resource resource = resourceSet.createResource(ruri);
		resource.load(null);
		return (ModelingUnit) resource.getContents().get(0);
	}
	
    
    public static EPackage loadEcoreModel(String modelFilePath){
    	URI uri = URI.createURI(modelFilePath);
		uri		= converter.normalize(uri);
    	kermeta.persistence.Resource r = rep.getResource(uri.toString()); 
        r.load();

        for(Object obj : r) {
        	System.out.println("Obj= " + obj);
        	if(obj instanceof EPackage)
        		return (EPackage) obj;
        }
		return null;
    }  
    
    
    public void test() throws IOException  {
        System.out.println("Test ecore2km " + baseName + ".ecore");
        System.out.println("pkg="+pkg);
        ModelingUnit result = ecore2km.convertPackage(pkg, "namespace");
        System.out.println("res="+result);
        System.out.println("   saving ecore2km result in " + fileOutputPath);
        Writer out = new OutputStreamWriter(new FileOutputStream(fileOutputPath));
        out.append(saveMu(result).toString());
		out.close();
        ModelingUnit expectedResult = loadKM(baseName + "Ref.km");
        System.out.println("   expectedResult " + expectedResult);
        
        if(valid)
        	assertTrue("result model not equals to expected output", EMFCompareModelHelper.isSimilarAndSaveDiff(result, expectedResult, baseName + ".diff"));
    }
    
    
    @Override
    public void runTest() throws Throwable  {
        test();
    }
}
