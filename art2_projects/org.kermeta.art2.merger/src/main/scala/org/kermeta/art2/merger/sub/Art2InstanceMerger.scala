/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.sub

import org.kermeta.art2.Channel
import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerNode
import org.kermeta.art2.ContainerRoot
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait Art2InstanceMerger {

  /* Expect TYPE DEFINITION MERGE BEFORE */
  def mergeComponentInstance(actualModel : ContainerRoot,c : ComponentInstance)={

    //FIND CT
    var ctOpt = actualModel.getTypeDefinitions.find(p=> p.isModelEquals(c.getTypeDefinition)  )
    ctOpt match {
      case Some(cti) => {
          var ct = cti.asInstanceOf[ComponentType]
          c.setTypeDefinition(ct)
          //MERGE PORT
          var providedPort = c.getProvided.toList ++ List()
          providedPort.foreach{pport=>
            ct.getProvided.find(p=> p.getName == pport.getPortTypeRef.getName) match {
              case None => pport.removeAndUnbind; println("Warning => Port deleted")
              case Some(ptref)=> pport.setPortTypeRef(ptref)
            }
          }
          var requiredPort = c.getRequired.toList ++ List()
          requiredPort.foreach{rport=>
            ct.getRequired.find(p=> p.getName == rport.getPortTypeRef.getName) match {
              case None => rport.removeAndUnbind; println("Warning => Port deleted")
              case Some(ptref)=> rport.setPortTypeRef(ptref)
            }
          }
        }
      case None => {
          println("Warning => TypeDefinition not found");
        }
    }
  }


  def mergeAllChannelInstance(actualModel : ContainerRoot,c : Channel)={

    actualModel.getHubs.find(ec=> ec.isModelEquals(c)) match {
      case None => {

      }
      case Some(ec)=>
    }
    
  }
  


}
