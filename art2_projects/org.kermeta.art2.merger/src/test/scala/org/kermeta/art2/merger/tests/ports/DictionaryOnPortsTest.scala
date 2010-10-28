/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests.ports

import org.junit._
import org.kermeta.art2.api.service.core.merger.MergerService
import org.kermeta.art2.merger.Art2MergerComponent
import org.kermeta.art2.merger.tests.MergerTestSuiteHelper
import org.kermeta.art2adaptation._
import org.scalatest.junit.AssertionsForJUnit
import scala.collection.JavaConversions._

class DictionaryOnPortsTest extends MergerTestSuiteHelper  {

   var component : MergerService = null

  @Before def initialize() {
    component = new Art2MergerComponent
  }


  @Test def verifyDictionnaryAddedOnMessagePort() {

/*    var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-PlusServiceDictionaries.art2"))
    mergedModel testSave ("artFragments","lib4test-PlusServiceDictionariesMerged.art2")
*/
    error("NOT IMPLEMENTED YET")

  }

  @Test def verifyDictionnaryAddedOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAddedOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryRemovedOnMessagePort() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryRemovedOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryRemovedOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }

    @Test def verifyDictionnaryAttributeRemovedOnMessagePort() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeRemovedOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeRemovedOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeAddedOnMessagePort() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeAddedOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeAddedOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }

    @Test def verifyDictionnaryAttributeRenamedOnMessagePort() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeRenamedOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeRenamedOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }

    @Test def verifyDictionnaryAttributeMandatoryUpdateOnMessagePort() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeMandatoryUpdateOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeMandatoryUpdateOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }

      @Test def verifyDictionnaryAttributeDefaultValueUpdateOnMessagePort() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeDefaultValueUpdateOnServicePortMethodFromApi() {
    error("NOT IMPLEMENTED YET")
  }

  @Test def verifyDictionnaryAttributeDefaultValueUpdateOnServicePortMethodFromImpl() {
    error("NOT IMPLEMENTED YET")
  }
}
