/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *                  Francois Fouquet <ffouquet@irisa.fr>
 *                  Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.loader.kmt.scala.internal.parser;

import java.lang.reflect.InvocationTargetException;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;
import org.kermeta.language.api.tests.port.PortResourceLoaderTestSuite;
import org.kermeta.scala.parser.art2.impl.Art2ComponentKMTLoader;


public class ScalaKMTParserTestSuite extends TestSuite {

   // @Override
    public static Test suite() {
        PortResourceLoaderTestSuite.portResourceLoaderFactory = new PortAbstractFactory<PortResourceLoader>(){

            @Override
            public PortResourceLoader create() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
                Art2ComponentKMTLoader resourceLoader = new Art2ComponentKMTLoader();
                resourceLoader.simulatedStart(resourceLoader.getClass().getCanonicalName());
                return resourceLoader;
            }
        };
        return PortResourceLoaderTestSuite.suite();
    }


    
}
