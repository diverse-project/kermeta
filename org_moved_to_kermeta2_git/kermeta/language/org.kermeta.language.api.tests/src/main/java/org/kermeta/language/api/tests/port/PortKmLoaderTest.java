/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.api.tests.port;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortKmLoader;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.structure.ModelingUnit;

public class PortKmLoaderTest extends TestCase {
    public String modelURI;
    public ResourceSet resourceSet;
    public Boolean valid;
    public PortKmLoader kmLoader;
    
    
    public PortKmLoaderTest(final String modelURI, final Boolean valid, final PortAbstractFactory<PortKmLoader> factory) 
							throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	super();
    	
        System.out.println(" creating test " + modelURI);
        
        this.modelURI 		  		= modelURI;
        this.valid 			  		= valid;
        kmLoader 		  			= factory.create();
        resourceSet 		  		= new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m 		= f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());
	}
    
    
    public void test()  {
        System.out.println("Test kmLoader " + modelURI);
        ModelingUnit result = kmLoader.load(modelURI);
        System.out.println("res=" + result);
        
        if(valid) {
        	assertTrue("loaded model not null", result!=null);
        } else {
        	//
        }
    }
    
    
    @Override
    public void runTest() throws Throwable  {
        test();
    }
}
