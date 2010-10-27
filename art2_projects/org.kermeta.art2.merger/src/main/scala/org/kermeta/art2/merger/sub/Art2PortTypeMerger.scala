/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.sub

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.PortType
import org.kermeta.art2.ServicePortType
import scala.collection.JavaConversions._
import org.kermeta.art2.TypedElement
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait Art2PortTypeMerger {

    //PORT TYPE DEFINITION MERGER
  def mergePortType(actualModel : ContainerRoot,portType : PortType) : PortType = {
    actualModel.getTypeDefinitions.filter({td => td.isInstanceOf[PortType]}).find({pt=>pt.getName == portType.getName}) match {
      case Some(existPT) => existPT.asInstanceOf[PortType]
      case None => {
          actualModel.getTypeDefinitions.add(portType)
          portType match {
            case spt : ServicePortType => {
                spt.getOperations.foreach{op=>
                  op.setReturnType(mergeDataType(actualModel,op.getReturnType))
                  op.getParameters.foreach{para=>para.setType(mergeDataType(actualModel,para.getType))}
                }
              }
            case mpt : MessagePortType => {
                mpt.getFilters.foreach{dt=>mergeDataType(actualModel,dt)}
              }
            case _ @ msg => println("Error uncatch type")
          }
          portType
        }
    }
  }

    //MERGE SIMPLE DATA TYPE
  private def mergeDataType(actualModel : ContainerRoot,datatype : TypedElement) : TypedElement = {
    actualModel.getDataTypes.find({dt=>dt.getName == datatype.getName }) match {
      case Some(existDT) => existDT
      case None => {
          var dts =  actualModel.getDataTypes
          dts.add(datatype)
          datatype
        }
    }
  }


}
