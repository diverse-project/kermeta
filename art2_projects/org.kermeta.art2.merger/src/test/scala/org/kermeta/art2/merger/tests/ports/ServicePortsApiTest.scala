/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests.ports

import org.junit._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.merger.Art2MergerComponent
import org.kermeta.art2.merger.tests.MergerTestSuiteHelper
import org.kermeta.art2.api.service.core.merger.MergerService

class ServicePortsApiTest extends MergerTestSuiteHelper  {

   var component : MergerService = null

  @Before def initialize() {
    component = new Art2MergerComponent
  }

  @Test def verifyProvidedServiceMethodAdded() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodRemoved() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodRenamed() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterAdded() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterRenamed() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterTypeChanged() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodParameterRemoved() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyProvidedServiceMethodReturnTypeChanged() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

}
