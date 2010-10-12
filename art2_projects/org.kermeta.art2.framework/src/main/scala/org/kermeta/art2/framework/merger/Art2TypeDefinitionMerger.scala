/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.merger

import org.kermeta.art2.ChannelType
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.PortType
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.TypedElement
import org.kermeta.art2.{ComponentType => art2CT}
import scala.collection.JavaConversions._

object Art2TypeDefinitionMerger extends Art2Merger {

  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    var cts : List[TypeDefinition] = List()++modelToMerge.getTypeDefinitions.toList
    cts.foreach{toMergeTypeDef=>
      actualModel.getTypeDefinitions.find({actualTypeDef=>actualTypeDef.getName.equals(toMergeTypeDef.getName)}) match {
        case Some(fct)=> //TODO CHECK CONSISTENCY
        case None => {
            //COMMON PROCESS
            toMergeTypeDef match {
              case typDef : org.kermeta.art2.TypeDefinition => {

                  //MERGE 1
                  var etp : List[DeployUnit] = List() ++ typDef.getRequiredLibs
                  typDef.getRequiredLibs.clear
                  etp.foreach{loopTP=>
                    typDef.getRequiredLibs.add(Art2DeployUnitMerger.merge(actualModel,loopTP))
                  }
                  if(typDef.getDeployUnit != null){
                    typDef.setDeployUnit(Art2DeployUnitMerger.merge(actualModel,typDef.getDeployUnit))
                  }

              }
              case _ =>
            }

            
            toMergeTypeDef match {
              case ct : ChannelType => { actualModel.getTypeDefinitions.add(ct) }
              case ct : ComponentType => {
                  actualModel.getTypeDefinitions.add(ct)

                  

                  ct.getProvided.foreach{ptref=>ptref.setRef(mergePortType(actualModel,ptref.getRef))}
                  ct.getRequired.foreach{ptref=>ptref.setRef(mergePortType(actualModel,ptref.getRef))}
                }
              case pt : PortType => { /* MERGE BY COMPONENT TYPE */ }
              case _ @ msg => println("Error uncatch type") // NO RECURSIVE FOR OTHER TYPE
            }
          }
      }
    }
  }

  private def mergeComponentType(actualComponentType : org.kermeta.art2.ComponentType,newComponentType : org.kermeta.art2.ComponentType) = {
    //SEARCH FORALL REFERENCED MODEL ELEMENT
  }

  private def mergePortType(actualModel : ContainerRoot,portType : PortType) : PortType = {
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


  private def mergeDataType(actualModel : ContainerRoot,datatype : TypedElement) : TypedElement = {
    actualModel.getDataTypes.find({dt=>dt.getName == datatype.getName }) match {
      case Some(existDT) => existDT
      case None => {
          println(datatype.getName)
          var dts =  actualModel.getDataTypes
          dts.add(datatype)
          datatype
        }
    }
  }
}
