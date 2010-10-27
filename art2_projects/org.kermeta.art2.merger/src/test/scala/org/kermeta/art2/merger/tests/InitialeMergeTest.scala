/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests

import org.kermeta.art2.api.service.core.merger.MergerService
import org.junit._
import org.kermeta.art2.merger.Art2MergerComponent

class InitialeMergeTest extends MergerTestSuiteHelper {

  var component : MergerService = null

  @Before def initialize() {
    component = new Art2MergerComponent
  }

  
  @Test def verifySimpleMerge1() {
    var mergedModel = component.merge(emptyModel, model("simple/simpleEntimidLib.art2"))
    //mergedModel testSave
    mergedModel testSave ("simple","simpleEntimidLibMerged.art2")


  }

   @Test def verifyArtFragmentBaseMerge() {
    var mergedModel = component.merge(emptyModel, model("artFragments/lib4test-base.art2"))
    //mergedModel testSave
    mergedModel testSave ("artFragments","lib4test-base-MERGED.art2")


  }

}
