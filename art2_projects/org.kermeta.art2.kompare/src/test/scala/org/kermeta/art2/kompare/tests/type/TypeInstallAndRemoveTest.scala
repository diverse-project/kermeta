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


class TypeInstallAndRemoveTest extends KompareSuite {

  var component : ModelKompareService = null

  @Before def initialize() {
    component = new Art2KompareBean
  }

  @Test def testNoTypeInstall()={
    var kompareModel = component.kompare(emptyModel, model("test_type/noTypeInstall.art2"), "duke")
    kompareModel verifySize 0
  }

  @Test def testOnlyOneDeployUnitInstall_INITNODE()={
    var kompareModel = component.kompare(emptyModel, model("test_type/onlyOneDeployUnitInstall.art2"), "duke")
    kompareModel shouldContainSize(classOf[AddDeployUnit],1)
  }

  @Test def testOnlyOneDeployUnitInstall_UPDATENODE()={
    var kompareModel = component.kompare(model("test_type/noTypeInstall.art2"), model("test_type/onlyOneDeployUnitInstall.art2"), "duke")
    kompareModel shouldContainSize(classOf[AddDeployUnit],1)
    kompareModel shouldContain(classOf[AddType],"ComponentPrimitiveTypeService")
    kompareModel shouldContain(classOf[AddType],"ComponentB")
    kompareModel shouldContain(classOf[AddInstance],"ComponentB--10313997")
    kompareModel shouldContain(classOf[AddInstance],"ComponentPrimitiveTypeService--791402174")
  }

  @Test def testnoTypeInstall_UPDATENODE()={
    var kompareModel = component.kompare(model("test_type/onlyOneDeployUnitInstall.art2"), model("test_type/onlyOneDeployUnitInstall.art2"), "duke")
    kompareModel verifySize 0
  }

  @Test def testnoTypeDeployUnitUninstall_UPDATENODE()={
    var kompareModel = component.kompare(model("test_type/onlyOneDeployUnitInstall.art2"), model("test_type/noTypeDeployUnitUninstall.art2"), "duke")
    kompareModel shouldContainSize(classOf[RemoveDeployUnit],0)
  }


  @Test def testOnlyOneDeployUnitUninstall_UPDATENODE()={
    var kompareModel = component.kompare(model("test_type/onlyOneDeployUnitInstall.art2"), model("test_type/onlyOneDeployUnitUninstall.art2"), "duke")
    kompareModel shouldContainSize(classOf[RemoveDeployUnit],1)
    kompareModel shouldContain(classOf[RemoveType],"ComponentPrimitiveTypeService")
    kompareModel shouldContain(classOf[RemoveType],"ComponentB")
    kompareModel shouldContain(classOf[RemoveInstance],"ComponentB--10313997")
    kompareModel shouldContain(classOf[RemoveInstance],"ComponentPrimitiveTypeService--791402174")
  }

  @Test def testOnlyOneDeployUnitUninstall_STOPNODE()={
    var kompareModel = component.kompare(model("test_type/onlyOneDeployUnitInstall.art2"),emptyModel, "duke")
    kompareModel shouldContainSize(classOf[RemoveDeployUnit],1)
  }

  @Test def testuninstall_STOPNODE()={
    var kompareModel = component.kompare(model("test_type/onlyOneDeployUnitInstall.art2"),emptyModel, "duke")
    kompareModel shouldContainSize(classOf[RemoveDeployUnit],1)
    kompareModel shouldContain(classOf[RemoveType],"ComponentPrimitiveTypeService")
    kompareModel shouldContain(classOf[RemoveType],"ComponentB")
    kompareModel shouldContain(classOf[RemoveInstance],"ComponentB--10313997")
    kompareModel shouldContain(classOf[RemoveInstance],"ComponentPrimitiveTypeService--791402174")
  }

}

