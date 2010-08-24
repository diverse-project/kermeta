/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.PortType
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.TypedElement
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.{ComponentType => art2CT}
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ComponentTypeLibrary
import scala.collection.JavaConversions._

class Art2Handler {

  //TODO LOCK OBJECT

  private var actualModel : ContainerRoot = Art2Factory.eINSTANCE.createContainerRoot

  def merge(modelToMerge : ContainerRoot) : Unit = {
    if(modelToMerge!= null){
      /* STEP 0 MERGE PARTY */
      var tps : List[DeployUnit] = List()++modelToMerge.getThirdParties.toList
      tps.foreach{tp=>
        actualModel.getThirdParties.find({atp=> atp.getName == tp.getName}) match {
          case Some(ftp)=> {
              //CHECK CONSISTENCY, IF NOT JUST ADD
              if(tp.getUrl != ftp.getUrl){
                actualModel.getThirdParties.add(tp)
              }
          }
          case None => {
              actualModel.getThirdParties.add(tp)
          }
        }
      }

      /* STEP 0 MERGE ComponentType */
      var cts : List[art2CT] = List()++modelToMerge.getComponentTypes.toList
      cts.foreach{dt=>
        actualModel.getComponentTypes.find({ct=>ct.getName.equals(dt.getName)}) match {
          case Some(fct)=> mergeComponentType(fct,dt)
          case None => {
              actualModel.getComponentTypes.add(dt)
              dt.getProvided.foreach{ptref=>ptref.setRef(mergePortType(ptref.getRef))}
              dt.getRequired.foreach{ptref=>ptref.setRef(mergePortType(ptref.getRef))}
            }
        }
      }
      /* STEP 1 Merge ComponentType Lib */
      var ctLib : List[ComponentTypeLibrary] = List()++modelToMerge.getLibraries.toList
      ctLib.foreach{libtomerge=>
        actualModel.getLibraries.find({elib=> elib.getName.equals(libtomerge.getName) }) match {
          case Some(elib) => {
              libtomerge.getSubComponentTypes.foreach{libCTtomerge=>
                elib.getSubComponentTypes.find({esublib=>esublib.getName.equals(libCTtomerge.getName)}) match {
                  case Some(subct)=> //TODO CHECK CONSISTENCY
                  case None => elib.getSubComponentTypes.add(libCTtomerge)
                }
              }
          }
          case None => actualModel.getLibraries.add(libtomerge)
        }
      }
      
    }
  }

  private def mergeComponentType(actualComponentType : org.kermeta.art2.ComponentType,newComponentType : org.kermeta.art2.ComponentType) = {
    //SEARCH FORALL REFERENCED MODEL ELEMENT
    

  }
  
  private def mergePortType(portType : PortType) : PortType = {
    actualModel.getPortTypes.find({pt=>pt.getName.equals(portType.getName)}) match {
      case Some(existPT) => existPT
      case None => {
          actualModel.getPortTypes.add(portType)
          portType match {
            case spt : ServicePortType => {
                spt.getOperations.foreach{op=>
                  op.setReturnType(mergeDataType(op.getReturnType))
                  op.getParameters.foreach{para=>para.setType(mergeDataType(para.getType))}
                }
              }
            case _ =>
          }
          portType
        }
    }
  }

  private def mergeDataType(datatype : TypedElement) : TypedElement = {
    actualModel.getDataTypes.find({dt=>dt.getName.equals(datatype.getName)}) match {
      case Some(existDT) => existDT
      case None => actualModel.getDataTypes.add(datatype);datatype
    }
  }

  /* ACESSOR TO MODEL */
  def getActualModel : ContainerRoot = {actualModel}

  def setActualModel(c : ContainerRoot) = {
    actualModel = c
  }
}
