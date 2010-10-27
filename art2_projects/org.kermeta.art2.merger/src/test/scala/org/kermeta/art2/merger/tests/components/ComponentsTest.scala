/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests.components

import org.junit._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.merger.Art2MergerComponent
import org.kermeta.art2.merger.tests.MergerTestSuiteHelper
import org.kermeta.art2.api.service.core.merger.MergerService

class ComponentsTest extends MergerTestSuiteHelper  {

   var component : MergerService = null

  @Before def initialize() {
    component = new Art2MergerComponent
  }

  @Test def verifyComponentTypeAdded() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyComponentTypeRemoved() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

  @Test def verifyComponentTypeRenamed() {
     //var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    //mergedModel testSave ("simple","simpleEntimidLibMerged.art2")
    error("NOT IMPLEMENTED YET");
  }

}
