/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.handlers

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.editor.component.creator.Kernel
import org.kermeta.art2.editor.component.creator.model.ComponentModelElement
import scala.collection.JavaConversions._

trait AddComponentHandler {

  def addComponent(root:ContainerRoot,kernel:Kernel,lib:Object) : ComponentModelElement = {

    var name : String = "Component-" + root.getTypeDefinitions.size

    var newComponent = org.kermeta.art2.Art2Factory.eINSTANCE.createComponentType();
    newComponent.setName(name)

    root.getTypeDefinitions.add(newComponent)
    root.getLibraries.find(libInMod=>libInMod==lib)match{
      case Some(l) => {
          l.getSubTypes.add(newComponent)
      }
      case None =>
    }

    var elem = new ComponentModelElement(kernel,name);
    kernel.getModelMapper.put(elem,newComponent)

    elem
  }

}
