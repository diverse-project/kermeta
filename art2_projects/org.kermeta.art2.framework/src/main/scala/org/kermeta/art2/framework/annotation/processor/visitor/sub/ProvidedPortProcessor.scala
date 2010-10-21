/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.declaration.TypeDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ComponentType
import org.kermeta.art2.framework.Art2Utility
import org.kermeta.art2.framework.annotation.processor.visitor.ServicePortTypeVisitor
import scala.collection.JavaConversions._

trait ProvidedPortProcessor {

  def processProvidedPort(componentType : ComponentType,classdef : TypeDeclaration)={
    /* CHECK PROVIDED PORTS */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Provides]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Provides]).value.foreach{req=>

        var portAll = componentType.getRequired ++ componentType.getProvided
        portAll.find(alR=> alR.getName == req.name) match {
          case None => {
              var ptreqREF = Art2Factory.eINSTANCE.createPortTypeRef
              ptreqREF.setName(req.name)

              ptreqREF.setRef(Art2Utility.getOraddPortType(req.`type` match {
                    case org.kermeta.art2.annotation.PortType.SERVICE => {
                        var tv = new ServicePortTypeVisitor
                        try { req.className
                        } catch {case e : com.sun.mirror.`type`.MirroredTypeException => e.getTypeMirror.accept(tv)}
                        tv.getDataType
                      }
                    case org.kermeta.art2.annotation.PortType.MESSAGE => {
                        var mpt = Art2Factory.eINSTANCE.createMessagePortType
                        mpt.setName("org.kermeta.art2.framework.MessagePort")
                        req.filter.foreach{ndts=>
                          var ndt = Art2Factory.eINSTANCE.createTypedElement
                          ndt.setName(ndts)
                          mpt.getFilters.add(Art2Utility.getOraddDataType(ndt))
                        }
                        mpt
                      }
                    case _ => null
                  }))

              componentType.getProvided.add(ptreqREF)
            }
          case Some(e)=> {
              println("Port name duplicated in Component Scope => "+req.name); System.exit(1)
            }
        }



      }
    }
  }

}
