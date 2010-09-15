/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.sub

import org.kermeta.art2._
import org.kermeta.art2adaptation._
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait StopNodeKompare {

  def getStopNodeAdaptationModel(node:ContainerNode):AdaptationModel={
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    println("STOP NODE "+node.getName)

    var root = node.eContainer.asInstanceOf[ContainerRoot]

    /* remove mbinding */
    root.getMBindings.foreach{b=>
      if(b.getPort.eContainer.eContainer == node){
        var addcmd = Art2adaptationFactory.eINSTANCE.createAddBinding
        addcmd.setRef(b)
        adaptationModel.getAdaptations.add(addcmd)
      }
    }

    /* add component */
    node.getInstances.foreach({c =>
        var cmd = Art2adaptationFactory.eINSTANCE.createRemoveInstance
        cmd.setRef(c)
        adaptationModel.getAdaptations.add(cmd)
      })


    /* remove type */
    node.getUsedTypeDefinition.foreach{ct=>
      var rmctcmd = Art2adaptationFactory.eINSTANCE.createRemoveType
      rmctcmd.setRef(ct)
      adaptationModel.getAdaptations.add(rmctcmd)

      /* remove all reLib */
      //TODO
    }

    adaptationModel
  }

}
