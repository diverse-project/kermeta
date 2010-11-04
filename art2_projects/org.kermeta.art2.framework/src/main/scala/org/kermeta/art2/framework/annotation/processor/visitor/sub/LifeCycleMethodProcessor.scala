/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.declaration.MethodDeclaration
import org.kermeta.art2.ChannelType
import org.kermeta.art2.ComponentType
import org.kermeta.art2.TypeDefinition

trait LifeCycleMethodProcessor {

  def processLifeCycleMethod(typeDefinition : TypeDefinition,methoddef : MethodDeclaration)={

    typeDefinition match {

      case c: ChannelType => {
          /* STEP 1 : PROCESS START & STOP METHOD */
          var startAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Start])
          var stopAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Stop])
          if(startAnnot != null){ c.setStartMethod(methoddef.getSimpleName)}
          if(stopAnnot != null){ c.setStopMethod(methoddef.getSimpleName)}
        }
      case c : ComponentType => {
          var startAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Start])
          var stopAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Stop])
          if(startAnnot != null){ c.setStartMethod(methoddef.getSimpleName)}
          if(stopAnnot != null){ c.setStopMethod(methoddef.getSimpleName)}
        }
      case _ =>

    }


  }

}
