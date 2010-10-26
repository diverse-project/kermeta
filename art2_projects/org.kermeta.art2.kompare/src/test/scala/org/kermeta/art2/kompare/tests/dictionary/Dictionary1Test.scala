/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests.dictionary

import org.junit._
import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.kompare.Art2KompareBean
import org.kermeta.art2adaptation._
import org.scalatest.junit.AssertionsForJUnit

class Dictionary1Test extends AssertionsForJUnit with KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }

  @Test def verifyUpdateValue() {
    var kompareModel = component.kompare(model("tests_dictionary/dictionary_1"), model("tests_dictionary/dictionary_2"), "node-0")
    kompareModel shouldContains(classOf[UpdateDictionaryInstance],"FakeSimpleLight--398723264")
    kompareModel.shouldNotContains(classOf[RemoveBinding])
  }

  @Test def verifyNotUpdateValue() {
    var kompareModel = component.kompare(model("tests_dictionary/dictionary_1"), model("tests_dictionary/dictionary_1"), "node-0")
    kompareModel.shouldNotContains(classOf[UpdateDictionaryInstance])
  }

}
