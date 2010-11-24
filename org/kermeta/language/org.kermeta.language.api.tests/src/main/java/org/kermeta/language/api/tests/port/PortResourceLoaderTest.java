/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.api.tests.port;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import junit.framework.TestCase;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.port.PortResourceLoader.URIType;
import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public class PortResourceLoaderTest extends TestCase {

    public File file;
    public Boolean valid;
    public org.kermeta.language.api.port.PortResourceLoader parser = null;

    public PortResourceLoaderTest(File file, Boolean _valid, Class parserclass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.file = file;
        this.valid = _valid;
        parser = (PortResourceLoader) parserclass.getConstructors()[0].newInstance();
    }

    public void test() {

        System.out.println("Test File => " + file.getAbsolutePath());
        ModelingUnit result = parser.load(file.getAbsolutePath(), URIType.FILE,"");

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
