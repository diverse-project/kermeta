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
      case Some(existPT) => {

          //CONSISTENCY CHECK
          existPT match {
            case spt : ServicePortType => {
                if(portType.isInstanceOf[ServicePortType]){
                  //CLEAR OLD METHOD , NEW DEFINITION WILL REPLACE OTHER

                  spt.getOperations.clear
                  var remoteOps = portType.asInstanceOf[ServicePortType].getOperations.toList ++ List()
                  remoteOps.foreach{op=>
                    op.setReturnType(mergeDataType(actualModel,op.getReturnType))
                    op.getParameters.foreach{para=>para.setType(mergeDataType(actualModel,para.getType))}
                    spt.getOperations.add(op)
                  }

                } else {
                  println("New service Port Type can't replace and message port type !!!")
                }
              }
            case _ => // TODO MESSAGE PORT
          }


          existPT.asInstanceOf[PortType]
        }
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
    actualModel.getDataTypes.find({dt=>dt.isModelEquals(datatype)}) match {
      case Some(existDT) => existDT
      case None => {
          var dts =  actualModel.getDataTypes.add(datatype)

          var generics = datatype.getGenericTypes.toList ++ List()
          datatype.getGenericTypes.clear
          generics.foreach{dt=>
            datatype.getGenericTypes.add(mergeDataType(actualModel,dt))
          }

          datatype
        }
    }
  }


}
