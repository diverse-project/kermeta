/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.merger

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.Channel
import org.kermeta.art2.ChannelType
import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.Instance
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.PortType
import org.kermeta.art2.PortTypeRef
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.TypedElement
import org.kermeta.art2.{ComponentType => art2CT}
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait Art2TypeDefinitionMerger extends Art2Merger with Art2DictionaryMerger {

  //TYPE DEFINITION MERGER ENTRYPOINT
  def mergeTypeDefinition(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    var cts : List[TypeDefinition] = List()++modelToMerge.getTypeDefinitions.toList
    cts.foreach{toMergeTypeDef=>
      actualModel.getTypeDefinitions.find({actualTypeDef=>actualTypeDef.isModelEquals(toMergeTypeDef)}) match {
        case Some(found_type_definition)=> {
            if(found_type_definition.isUpdated(toMergeTypeDef)){
              updateTypeDefinition(found_type_definition,toMergeTypeDef)
            }
          }
          //SIMPLE CASE ? JUST MERGE THE NEW TYPE DEFINITION
        case None => mergeNewTypeDefinition(actualModel,toMergeTypeDef)
      }
    }
  }

  //PORT TYPE DEFINITION MERGER
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


  /* This method try to update */
  private def updateTypeDefinition(actuelTypeDefinition:TypeDefinition, newTypeDefinition:TypeDefinition) = {

    var root = actuelTypeDefinition.eContainer.asInstanceOf[ContainerRoot]

    //REMOVE OLD AND ADD NEW TYPE
    root.getTypeDefinitions.remove(actuelTypeDefinition)
    root.getTypeDefinitions.add(newTypeDefinition)


    //UPDATE LIBRARIES
    root.getLibraries.filter(p=> p.getSubTypes.contains(actuelTypeDefinition) ).foreach{lib=>
      lib.getSubTypes.remove(actuelTypeDefinition);lib.getSubTypes.add(newTypeDefinition)
    }

    //PROCESS INSTANCE
    var listInstance = root.eAllContents.filter(p=>{
        p match {
          case i : Instance => i.getTypeDefinition == actuelTypeDefinition
          case _ => false
        }
      }).toList ++ List()
    listInstance.foreach{instance=>

      var art2instance = instance.asInstanceOf[Instance]
      art2instance.setTypeDefinition(newTypeDefinition)

      //MERGE DICTIONARY
      mergeDictionary(art2instance.getDictionary,newTypeDefinition.getDictionaryType)

      //SPECIFIC PROCESS
      art2instance match {
        case c : ComponentInstance => {
            var ct = newTypeDefinition.asInstanceOf[ComponentType]
            //RECURSIVE MERGE FOR TYPE
            ct.getProvided.foreach{ptref=>ptref.setRef(mergePortType(root,ptref.getRef))}
            ct.getRequired.foreach{ptref=>ptref.setRef(mergePortType(root,ptref.getRef))}


            //MERGE PORT
            var providedPort = c.getProvided.toList ++ List()
            providedPort.foreach{pport=>
              ct.getProvided.find(p=> p.getName == pport.getPortTypeRef.getName) match {
                case None => pport.removeAndUnbind
                case Some(ptref)=> pport.setPortTypeRef(ptref)
              }
            }
            var requiredPort = c.getRequired.toList ++ List()
            requiredPort.foreach{rport=>
              ct.getRequired.find(p=> p.getName == rport.getPortTypeRef.getName) match {
                case None => rport.removeAndUnbind
                case Some(ptref)=> rport.setPortTypeRef(ptref)
              }
            }

            //CREATE NEW PORT
            ct.getProvided.foreach{newpt=> 
              c.getProvided.find(p=>p.getPortTypeRef == newpt) match {
                case None => {
                    var newport = Art2Factory.eINSTANCE.createPort();
                    newport.setPortTypeRef(newpt)
                    c.getProvided.add(newport)
                  }
                case Some(p)=> //OK PORT ALREADY EXIST
              }
            }
            ct.getRequired.foreach{newpt=>
              c.getRequired.find(p=>{p.getPortTypeRef == newpt}) match {
                case None => {
                    var newport = Art2Factory.eINSTANCE.createPort();
                    newport.setPortTypeRef(newpt)
                    c.getRequired.add(newport)
                  }
                case Some(p)=> //OK PORT ALREADY EXIST
              }
            }

          }
        case _ => //NO SPECIFIC PROCESS FOR OTHER INSTANCE
      }

    }

  }

  /* MERGE A SIMPLE NEW TYPE DEFINITION */
  private def mergeNewTypeDefinition(actualModel : ContainerRoot, newTypeDefinition:TypeDefinition) = {

    //MERGE TYPE REQUIRED LIB
    var etp : List[DeployUnit] = List() ++ newTypeDefinition.getRequiredLibs
    newTypeDefinition.getRequiredLibs.clear
    etp.foreach{loopTP=>
      newTypeDefinition.getRequiredLibs.add(Art2DeployUnitMerger.merge(actualModel,loopTP))
    }
    //MERGE TYPE DEPLOY UNIT
    if(newTypeDefinition.getDeployUnit != null){
      newTypeDefinition.setDeployUnit(Art2DeployUnitMerger.merge(actualModel,newTypeDefinition.getDeployUnit))
    }

    //ADD RECUSIVE DEFINITON TO ROOT
    newTypeDefinition match {
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
