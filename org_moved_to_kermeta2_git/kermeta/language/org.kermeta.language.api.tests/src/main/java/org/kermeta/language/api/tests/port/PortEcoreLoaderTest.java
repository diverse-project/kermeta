package org.kermeta.language.api.tests.port;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortEcoreLoader;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

public class PortEcoreLoaderTest extends TestCase {
    public String modelURI;
    public ResourceSet resourceSet;
    public Boolean valid;
    public PortEcoreLoader ecoreLoader;
    
    public PortEcoreLoaderTest(final String modelURI, final Boolean valid, final PortAbstractFactory<PortEcoreLoader> factory) 
								throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	super();
    	
        System.out.println(" creating test " + modelURI);
        
        this.modelURI 		  		= modelURI;
        this.valid 			  		= valid;
        ecoreLoader 		  		= factory.create();
        resourceSet 		  		= new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m 		= f.getExtensionToFactoryMap();
		m.put("ecore",new XMIResourceFactoryImpl());
    }
    
    
    public void test()  {
        System.out.println("Test ecoreLoader " + modelURI);
        List<EPackage> result = ecoreLoader.load(modelURI);
        System.out.println("res=" + result);
        
        if(valid) {
        	assertTrue("loaded model not null", result!=null);
        	assertTrue("loaded model has package", result!=null && !result.isEmpty());
        } else {
        	//
        }
    }
    
    
    @Override
    public void runTest() throws Throwable  {
        test();
    }
}
