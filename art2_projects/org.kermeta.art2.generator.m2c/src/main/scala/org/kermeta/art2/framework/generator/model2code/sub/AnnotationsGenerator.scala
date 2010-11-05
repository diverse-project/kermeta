/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.model2code.sub

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.{ComponentType => ART2ComponentType }
import scala.collection.JavaConversions._

trait AnnotationsGenerator {

  def generateModelAnnotations(lct:ART2ComponentType) = {

    var buffer = new StringBuffer()

    buffer.append(generateProvidedPortsAnnotations(lct))
    buffer.append(generateRequiredPortsAnnotations(lct))
    buffer.append(generateCtDictionaryAnnotations(lct))
    lct.eContainer.asInstanceOf[ContainerRoot].getLibraries.foreach{lib =>
      lib.getSubTypes.find(sub => sub == lct) match {
        case Some(s) => buffer.append("@Library(name=\""+lib.getName + "\")\n")
        case None =>
      }
    }
    buffer.append("@ComponentType\n")

    buffer.toString
  }

  private def generateProvidedPortsAnnotations(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()

    buffer.append("@Provides({\n")

    lct.getProvided.foreach{portTypeRef =>

      buffer.append("\t@ProvidedPort(name=\""+portTypeRef.getName+"\", type=PortType.")
      portTypeRef.getRef match {
        case msgType : MessagePortType => buffer.append("MESSAGE")
        case srvType : ServicePortType => buffer.append("SERVICE, className="+srvType.getName.substring(srvType.getName.lastIndexOf(".")+1) +".class")
        case _ => printf("PortType Not Handled\n")
      }
      buffer.append(")")
      if(lct.getProvided.indexOf(portTypeRef) != lct.getProvided.size-1){
        buffer.append(",\n")
      }


    }

    buffer.append("\n})\n")

    buffer.toString
  }

  private def generateRequiredPortsAnnotations(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()

    buffer.append("@Requires({\n")

    lct.getRequired.foreach{portTypeRef =>
      buffer.append("\t@RequiredPort(name=\""+portTypeRef.getName+"\", type=PortType.")
      portTypeRef.getRef match {
        case msgType : MessagePortType => buffer.append("MESSAGE")
        case srvType : ServicePortType => buffer.append("SERVICE, className="+srvType.getName.substring(srvType.getName.lastIndexOf(".")+1) +".class")
        case _ => printf("PortType Not Handled\n")
      }
      buffer.append(")")
      if(lct.getRequired.indexOf(portTypeRef) != lct.getRequired.size-1){
        buffer.append(",\n")
      }
    }

    buffer.append("\n})\n")

    buffer.toString
  }

  private def generateCtDictionaryAnnotations(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()

    if(lct.getDictionaryType != null) {
      buffer.append("@DictionaryType({\n")
      lct.getDictionaryType.getAttributes.foreach{attr =>
        buffer.append("    @DictionaryAttribute(name=\""+attr.getName+"\", optional=" + attr.isOptional.toString)
        lct.getDictionaryType.getDefaultValues.find(dv => dv.getAttribute.getName.equals(attr.getName)) match {
          case Some(dv) => {
              buffer.append(", defaultValue=\""+dv.getValue+"\")")
            }
          case None => buffer.append(")")
        }

        if(lct.getDictionaryType.getAttributes.indexOf(attr) != (lct.getDictionaryType.getAttributes.size - 1)){
          buffer.append(",\n")
        }
      }
      buffer.append("\n})\n")
    }

    buffer.toString
  }

}
