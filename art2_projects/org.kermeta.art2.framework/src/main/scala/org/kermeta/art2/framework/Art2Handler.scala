/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import art2.ContainerRoot
import art2.PortType
import art2.ServicePortType
import art2.{ComponentType => art2CT}
import art2.ComponentTypeLibrary
import scala.collection.JavaConversions._

class Art2Handler {

  //TODO LOCK OBJECT

  private var actualModel : ContainerRoot = art2.Art2Factory.eINSTANCE.createContainerRoot

  def merge(modelToMerge : ContainerRoot) : Unit = {
    if(modelToMerge!= null){
      /* STEP 0 MERGE ComponentType */
      var cts : List[art2CT] = List()++modelToMerge.getComponentTypes.toList
      cts.foreach{dt=>
        actualModel.getComponentTypes.find({ct=>ct.getName.equals(dt.getName)}) match {
          case Some(fct)=> //TODO CHECK CONSISTENCY // CHECK UNICITY
          case None => {
              
              actualModel.getComponentTypes.add(dt)
              dt.getProvided.foreach{ptref=>ptref.setRef(mergePortType(ptref.getRef))}
              dt.getRequired.foreach{ptref=>ptref.setRef(mergePortType(ptref.getRef))}
            }
        }
      }
      /* STEP 1 Merge ComponentType Lib */
      var ctLib : List[ComponentTypeLibrary] = List()++modelToMerge.getLibrariy.toList
      ctLib.foreach{libtomerge=>
        actualModel.getLibrariy.find({elib=> elib.getName.equals(libtomerge.getName) }) match {
          case Some(elib) => {
              libtomerge.getSubComponentTypes.foreach{libCTtomerge=>
                elib.getSubComponentTypes.find({esublib=>esublib.getName.equals(libCTtomerge.getName)}) match {
                  case Some(subct)=> //TODO CHECK CONSISTENCY
                  case None => elib.getSubComponentTypes.add(libCTtomerge)
                }
              }
          }
          case None => actualModel.getLibrariy.add(libtomerge)
        }
      }
      
    }
  }
  
  private def mergePortType(portType : PortType) : art2.PortType = {
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

  private def mergeDataType(datatype : art2.TypedElement) : art2.TypedElement = {
    actualModel.getDataTypes.find({dt=>dt.getName.equals(datatype.getName)}) match {
      case Some(existDT) => existDT
      case None => actualModel.getDataTypes.add(datatype);datatype
    }
  }

  /* ACESSOR TO MODEL */
  def getActualModel : ContainerRoot = {actualModel}

}
