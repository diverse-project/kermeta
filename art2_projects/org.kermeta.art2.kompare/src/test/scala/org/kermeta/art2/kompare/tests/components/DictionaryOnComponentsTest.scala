/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests.components

import org.junit._
import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.kompare.Art2KompareBean
import org.kermeta.art2adaptation._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.kompare.tests._

class DictionaryOnComponentsTest extends AssertionsForJUnit with KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }

  @Test def verifyUpdateValue() {
    var kompareModel = component.kompare(model("tests_dictionary/dictionary_1"), model("tests_dictionary/dictionary_2"), "node-0")
    kompareModel verifySize 1
    kompareModel shouldContain(classOf[UpdateDictionaryInstance],"FakeSimpleLight--398723264")
  }

  @Test def verifyNotUpdateValue() {
    var kompareModel = component.kompare(model("tests_dictionary/dictionary_1"), model("tests_dictionary/dictionary_1"), "node-0")
    kompareModel.shouldNotContain(classOf[UpdateDictionaryInstance])
    kompareModel verifySize 0
  }

}
