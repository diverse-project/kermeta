/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.handlers

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.editor.component.creator.Kernel
import org.kermeta.art2.editor.component.creator.model.LibraryModelElement
import scala.collection.JavaConversions._

trait AddLibraryHandler {

  def addLibrary(root:ContainerRoot,kernel:Kernel) : LibraryModelElement = {

    var name : String = "lib-" + root.getLibraries.size

    var newLib = org.kermeta.art2.Art2Factory.eINSTANCE.createTypeLibrary();
    //CREATE NEW NAME
    newLib.setName(name);
    root.getLibraries.add(newLib)

    var elem = new LibraryModelElement(kernel,name);
    kernel.getModelMapper.put(elem,newLib)

    elem
  }

}
