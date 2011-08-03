/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.resolver.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.resolver.KmResolverImpl;
import org.kermeta.language.resolver.KmResolverImpl4Eclipse;
import org.kermeta.language.resolver.api.KmResolver;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;


import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;

import java.io.File;


public class KmResolverTest extends TestCase {
	String kmFile;



    public KmResolverTest(String kmFile) {
		super();
		this.kmFile = kmFile;

	}



	public void test() throws IOException  {
        System.out.println("Test resolving " + kmFile);

        
        // Phase 1 : compiles without crashing
        MessagingSystem ms=new StdioSimpleMessagingSystem();
        KmResolver resolver = new KmResolverImpl(ms);
        ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);
		Resource.Factory.Registry f = resourceSet
				.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("km", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(kmFile));
		ModelingUnit beforeResolving;
		resource.load(m);
		beforeResolving= (ModelingUnit) resource.getContents().get(0);
                
		ErrorProneResult<ModelingUnit> epr=	resolver.resolve(beforeResolving);
		
		
		assertTrue("Failed to resolve !", !epr.hasSevereProblems());
    }
    
    @Override
    public String getName() {
        return kmFile;
    }

    @Override
    public void runTest() throws Throwable  {
        test();
    }

    @Override
    protected void tearDown() throws Exception {
        //
    }
}
