/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests.`type`

import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.kompare.Art2KompareBean
import org.kermeta.art2.kompare.tests.KompareSuite
import org.junit._
import org.kermeta.art2adaptation.AddDeployUnit
import org.kermeta.art2adaptation._

class TypeAndInstanceUpdateTest extends KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }

  @Test def testNoTypeInstall()={
    var kompareModel = component.kompare(model("test_type/updateBaseModel.art2"), model("test_type/update2ComponentOneBindingRemove.art2"), "duke")
    kompareModel shouldContainSize(classOf[UpdateDeployUnit],1)
    kompareModel shouldContain(classOf[UpdateType],"ComponentPrimitiveTypeService")
    kompareModel shouldContain(classOf[UpdateType],"ComponentA")

    kompareModel shouldContain(classOf[UpdateInstance],"ComponentPrimitiveTypeService-193784848")
    kompareModel shouldContain(classOf[UpdateInstance],"ComponentA-1649555745")
    kompareModel shouldContainSize(classOf[UpdateBinding],2)
    kompareModel shouldContainSize(classOf[RemoveBinding],1)

    kompareModel.verifySize(8)

  }

}
