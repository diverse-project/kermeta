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

class PortsTest extends AssertionsForJUnit with KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }


  @Test def verifyProvidedMessagePortRemoved() {
    var kompareModel = component.kompare(model("test_ports/base.art2"), model("test_ports/MinusProvidedMessagePort.art2"), "nodeA")

    //kompareModel.print

    /*
     * Behavior to be checked. Only one port have been removed on one component type.
     * Should all the library component's types and instances be updated ?
     */

    kompareModel verifySize 6

    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateType],"ComponentA")
    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateInstance],"ComponentA-1541906386")

    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateType],"ComponentB")
    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateInstance],"ComponentB--1886857871")

    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateType],"ComponentPrimitiveTypeService")
    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateInstance],"ComponentPrimitiveTypeService--690416444")
    
  }


  @Test def verifyProvidedMessagePortAdded() {
    var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")

    //kompareModel.print

    /*
     * Behavior to be checked. Only one port have been added on one component type.
     * Should all the library component's types and instances be updated ?
     */

    kompareModel verifySize 6

    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateType],"ComponentA")
    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateInstance],"ComponentA-1541906386")

    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateType],"ComponentB")
    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateInstance],"ComponentB--1886857871")

    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateType],"ComponentPrimitiveTypeService")
    kompareModel shouldContain(classOf[org.kermeta.art2adaptation.UpdateInstance],"ComponentPrimitiveTypeService--690416444")

  }


  @Test def verifyProvidedServicePortRemoved() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServicePortAdded() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyRequiredMessagePortRemoved() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyRequiredMessagePortAdded() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyRequiredServicePortRemoved() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyRequiredServicePortAdded() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

    @Test def verifyProvidedMessagePortRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

    @Test def verifyProvidedServicePortRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

      @Test def verifyRequiredMessagePortRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

      @Test def verifyRequiredServicePortRenamed() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

      @Test def verifyProvidedServicePortClassChanged() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

      @Test def verifyRequiredServicePortClassChanged() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }

        @Test def verifyProvidedServicePortClassChanged() {
    //var kompareModel = component.kompare(model("test_ports/MinusProvidedMessagePort.art2"), model("test_ports/base.art2"), "nodeA")
    error("NOT IMPLEMENTED YET");
  }



  @Test def verifyNoPortChange() {
    var kompareModel = component.kompare(model("test_ports/base.art2"), model("test_ports/base.art2"), "nodeA")
    kompareModel verifySize 0
  }
}
