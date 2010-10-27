/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests.components

import org.junit._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.merger.Art2MergerComponent
import org.kermeta.art2.merger.tests.MergerTestSuiteHelper
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.api.service.core.merger.MergerService

class ComponentsTest extends MergerTestSuiteHelper  {

   var component : MergerService = null

  @Before def initialize() {
    component = new Art2MergerComponent
  }

  @Test def verifyComponentTypeAdded() {
     var mergedModel = component.merge(model("artFragments/lib4test-ComponentRemoved.art2"), model("artFragments/lib4test-base.art2"))
    mergedModel testSave ("artFragments","lib4test-ComponentAddedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.find(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName.equals("ComponentB")
    ) match {
      case None => fail("ComponentB have not been properly added.")
      case Some(component) =>
    }
  }

  @Test def verifyComponentTypeRemoved() {
      var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ComponentRemoved.art2"))
    mergedModel testSave ("artFragments","lib4test-ComponentRemovedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.find(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName.equals("ComponentB")
    ) match {
      case None =>
      case Some(component) => fail("ComponentB have not been properly removed.")
    }
  }

  @Test def verifyComponentTypeRenamed() {
      var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ComponentRenamed.art2"))
    mergedModel testSave ("artFragments","lib4test-ComponentRenamedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.find(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName.equals("ComponentB")
    ) match {
      case None =>
      case Some(component) => fail("ComponentB have not been properly renamed.")
    }

    mergedModel.getTypeDefinitions.toArray.find(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName.equals("ComponentC")
    ) match {
      case None => fail("ComponentC is not present. ComponentB have not been correctly renamed.")
      case Some(component) => 
    }

  }

}
