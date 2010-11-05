/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.model2code.tests

import java.io.File
import org.junit._
import org.kermeta.art2.api.service.core.generator.m2c.M2CGenerator
import org.kermeta.art2.framework.generator.m2c.Art2M2CComponent


class InitialComponentTypeGeneratorTest extends M2CGeneratorTestSuiteHelper {

  var component : M2CGenerator = null

  @Before def initialize() {
    component = new Art2M2CComponent
  }

  @Test def verifySimpleComponentTygeGen() {
    component.generate(model("artFragments/lib4test-base.art2"),true, "../org.entimid.generated")
  }

}
