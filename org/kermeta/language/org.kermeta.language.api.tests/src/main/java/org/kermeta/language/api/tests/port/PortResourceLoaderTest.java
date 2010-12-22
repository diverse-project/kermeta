/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *                  Francois Fouquet <ffouquet@irisa.fr>
 *                  Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import junit.framework.TestCase;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.port.PortResourceLoader.URIType;
import org.kermeta.language.api.tests.ModelingUnitUtil;
import org.kermeta.language.api.tests.comparison.EMFCompareModelHelper;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.structure.ModelingUnit;

/**
 * Test class for the PortResourceLoader
 */
public class PortResourceLoaderTest extends TestCase {

    public File file;
    public String outputFilePath;
    public Boolean valid;
    public String expectedOutputURI;
    public PortResourceLoader parser = null;

    public ResourceSet resourceSet;

    public PortResourceLoaderTest(File file, String outputFilePath, Boolean _valid, PortAbstractFactory<PortResourceLoader> portResourceLoaderFactory, String expectedOutputURI) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.file = file;
        this.valid = _valid;
        this.expectedOutputURI = expectedOutputURI;
        this.outputFilePath = outputFilePath;
        //parser = (PortResourceLoader) parserclass.getConstructors()[0].newInstance();
        parser = portResourceLoaderFactory.create();
        resourceSet = new ResourceSetImpl();
	Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
	Map<String,Object> m = f.getExtensionToFactoryMap();
	m.put("km",new XMIResourceFactoryImpl());
    }

    public void test() throws IOException {

        System.out.println("Test File => " + file.getAbsolutePath());
        ModelingUnit result = parser.load(file.getAbsolutePath(), URIType.FILE, "");

        System.out.println(this.valid);

        if (result == null) {
            assertFalse(this.valid);
        } else {
            System.out.println("Saving result in "+outputFilePath);
            ModelingUnitUtil.registerEMFextensionToFactoryMap(outputFilePath);
            ModelingUnitUtil.saveModelingUnit(outputFilePath, result);
            assertTrue(this.valid);
        }

        // check against potential expected_output
        if(expectedOutputURI != null && !expectedOutputURI.isEmpty()){
            ModelingUnit expectedResult = ModelingUnitUtil.loadModelingUnitFromKm(expectedOutputURI);
            assertTrue("result model not equals to expected output", EMFCompareModelHelper.isSimilarAndSaveDiff(result, expectedResult, outputFilePath+".diff"));
        }
    }

    @Override
    public String getName() {
        return file.getName().substring(0, file.getName().indexOf(".kmt_"));


    }

    @Override
    public void runTest() throws IOException {
        test();


    }

    @Override
    protected void tearDown() throws Exception {
        file.delete();

    }
}
