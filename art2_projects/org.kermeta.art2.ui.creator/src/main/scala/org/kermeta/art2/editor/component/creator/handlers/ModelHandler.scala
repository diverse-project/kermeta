/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.handlers

import org.kermeta.art2.ContainerRoot
import org.eclipse.emf.common.util.URI
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.editor.component.creator.Kernel
import org.kermeta.art2.editor.component.creator.model.ComponentModelElement
import org.kermeta.art2.editor.component.creator.model.LibraryModelElement
import org.kermeta.art2.framework.Art2XmiHelper
import scala.collection.JavaConversions._

class ModelHandler(kernel:Kernel)
extends AddLibraryHandler
with AddComponentHandler
{

  private var actualModel : ContainerRoot = Art2Factory.eINSTANCE.createContainerRoot
  private var unsavedChanges : Boolean = false

  /* ACESSOR TO MODEL */
  def getActualModel : ContainerRoot = {actualModel}

  def setActualModel(c : ContainerRoot) = {
    actualModel = c
  }

  def containsUnsavedChanges = {unsavedChanges}

  def saveActualModel(location:String) = {
    Art2XmiHelper.save(URI.createFileURI(location).toString(),actualModel)
    unsavedChanges = false
  }

  def loadModel(location:String) = {
    actualModel = Art2XmiHelper.load(URI.createFileURI(location).toString());
    unsavedChanges = false
  }

  def newModel() = {
    actualModel = Art2Factory.eINSTANCE.createContainerRoot
    unsavedChanges = false
  }

  def addLibrary() : LibraryModelElement = {
    unsavedChanges = true
    addLibrary(actualModel, kernel)
  }

  def addComponent(library:Object) : ComponentModelElement = {
    unsavedChanges = true
    addComponent(actualModel,kernel,library)
  }

}
