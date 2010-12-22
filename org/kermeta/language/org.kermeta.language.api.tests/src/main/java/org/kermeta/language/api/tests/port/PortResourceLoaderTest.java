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
import java.lang.reflect.InvocationTargetException;
import junit.framework.TestCase;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.port.PortResourceLoader.URIType;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.structure.ModelingUnit;

/**
 * Test class for the PortResourceLoader
 */
public class PortResourceLoaderTest extends TestCase {

    public File file;
    public Boolean valid;
    public PortResourceLoader parser = null;

    public PortResourceLoaderTest(File file, Boolean _valid, PortAbstractFactory portResourceLoaderFactory) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.file = file;
        this.valid = _valid;
        //parser = (PortResourceLoader) parserclass.getConstructors()[0].newInstance();
        parser = portResourceLoaderFactory.create();
    }

    public void test() {

        System.out.println("Test File => " + file.getAbsolutePath());
        ModelingUnit result = parser.load(file.getAbsolutePath(), URIType.FILE, "");

        System.out.println(this.valid);

        if (result == null) {
            assertFalse(this.valid);
        } else {
            assertTrue(this.valid);
        }
    }

    @Override
    public String getName() {
        return file.getName().substring(0, file.getName().indexOf(".kmt_"));


    }

    @Override
    public void runTest() {
        test();


    }

    @Override
    protected void tearDown() throws Exception {
        file.delete();

    }
}
