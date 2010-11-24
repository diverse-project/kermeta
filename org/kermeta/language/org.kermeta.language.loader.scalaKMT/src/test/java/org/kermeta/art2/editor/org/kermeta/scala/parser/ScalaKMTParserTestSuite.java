/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.org.kermeta.scala.parser;

import java.util.Enumeration;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.tests.port.PortResourceLoaderTestSuite;
import org.kermeta.scala.parser.art2.impl.Art2ComponentKMTLoader;

/**
 *
 * @author ffouquet
 */
public class ScalaKMTParserTestSuite extends TestSuite {

   // @Override
    public static Test suite() {
        PortResourceLoaderTestSuite.loaderClass = Art2ComponentKMTLoader.class;
        return PortResourceLoaderTestSuite.suite();
    }


    
}
