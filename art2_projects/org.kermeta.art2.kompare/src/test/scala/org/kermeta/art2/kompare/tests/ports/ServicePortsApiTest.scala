/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests.ports

import org.junit._
import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.kompare._
import org.kermeta.art2adaptation._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.kompare.tests._

class ServicePortsApiTest extends AssertionsForJUnit with KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }

  @Test def verifyProvidedServiceMethodAdded() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodRemoved() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterAdded() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterTypeChanged() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterRemoved() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodReturnTypeChanged() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

}
