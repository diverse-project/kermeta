/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests.components

import org.junit._
import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.kompare._
import org.kermeta.art2adaptation._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.kompare.tests._

class ComponentsTest extends AssertionsForJUnit with KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }

  @Test def verifyComponentTypeAdded() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyComponentTypeRemoved() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyComponentTypeRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

}
