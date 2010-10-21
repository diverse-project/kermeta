/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.TypeDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.TypeDefinition
import scala.collection.JavaConversions._


/* Common Sub process to deal with ThirdParty definition */

trait ThirdPartyProcessor {

  def processThirdParty(componentType : TypeDefinition,classdef : TypeDeclaration)={
    var root : ContainerRoot = componentType.eContainer.asInstanceOf[ContainerRoot]

     var thirdPartyAnnotations : List[org.kermeta.art2.annotation.ThirdParty] = Nil

    var annotationThirdParty = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ThirdParty])
    if(annotationThirdParty != null){ thirdPartyAnnotations = thirdPartyAnnotations ++ List(annotationThirdParty) }

    var annotationThirdParties = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ThirdParties])
    if(annotationThirdParties != null){ thirdPartyAnnotations = thirdPartyAnnotations ++ annotationThirdParties.value.toList }



    /* CHECK THIRDPARTIES */
    thirdPartyAnnotations.foreach{tp=>
      
        root.getDeployUnits.find({etp => etp.getName == tp.name}) match {
          case Some(e) => {
              componentType.getRequiredLibs.add(e)
            }
          case None => {
              var newThirdParty = Art2Factory.eINSTANCE.createDeployUnit
              newThirdParty.setName(tp.name)
              newThirdParty.setUrl(tp.url)
              root.getDeployUnits.add(newThirdParty)
              componentType.getRequiredLibs.add(newThirdParty)
            }
        }
    }
  }
}
