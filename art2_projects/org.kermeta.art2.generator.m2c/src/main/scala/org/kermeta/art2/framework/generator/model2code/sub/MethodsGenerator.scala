/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.model2code.sub

import org.kermeta.art2.MessagePortType
import org.kermeta.art2.Operation
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.{ComponentType => ART2ComponentType }
import scala.collection.JavaConversions._

trait MethodsGenerator {
  
  def generateMethods(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()

    buffer.append(generateUtilityMethods(lct))
    buffer.append(generateProvidedServicePortsMethods(lct))
    buffer.append(generateProvidedMessagePortsMethods(lct))


    buffer.toString
  }


  private def generateUtilityMethods(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()
    buffer.append("\n")
    buffer.append("\n")
    buffer.append("\n")
    buffer.append("    /**********  Component lifecycle management methods *********************/\n")

    buffer.append("\n")
    buffer.append("    @Start\n")
    buffer.append("    public void "+lct.getStartMethod +"() {\n")
    buffer.append("        //TODO: Complete the method\n")
    buffer.append("        throw new UnsupportedOperationException(\"Not implemented yet !\");\n")
    buffer.append("    }\n")

    buffer.append("\n")
    buffer.append("    @Stop\n")
    buffer.append("    public void "+lct.getStopMethod +"() {\n")
    buffer.append("        //TODO: Complete the method\n")
    buffer.append("        throw new UnsupportedOperationException(\"Not implemented yet !\");\n")
    buffer.append("    }\n")

    buffer.toString
  }

  private def generateProvidedServicePortsMethods(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()

    buffer.append("\n")
    buffer.append("\n")
    buffer.append("\n")
    buffer.append("    /**********  Provided Service Ports methods *********************/\n")
    buffer.append("\n")

    var providedServices = lct.getProvided.find(portTypeRef => portTypeRef.getRef.isInstanceOf[ServicePortType])
    providedServices.foreach{portTypeRef =>
      buffer.append("\n")
      buffer.append("    /**********  " + portTypeRef.getName + " methods *********************/\n")
      portTypeRef.getMappings.foreach{ mapping =>
        portTypeRef.getRef.asInstanceOf[ServicePortType].getOperations.find(op => op.getName.equals(mapping.getServiceMethodName)) match{
          case Some(op : Operation) => {
              buffer.append("\n")
              buffer.append("    @Port(name=\""+portTypeRef.getName+"\", method=\""+mapping.getServiceMethodName+"\")\n")
              buffer.append("    public " + convertType(op.getReturnType.getName))
              buffer.append(" " + op.getName + "(")
              var params : String = ""
              op.getParameters.foreach{param =>
                if(!params.equals("")){params += ", "}
                params += convertType(param.getType.getName) + " " + param.getName
              }
              buffer.append(params)
              buffer.append(") {\n")
              buffer.append("        //TODO: Complete the method\n")
              buffer.append("        throw new UnsupportedOperationException(\"Not implemented yet !\");\n")
              buffer.append("    }\n")
            }
          case None =>
        }

      }

    }

    buffer.toString
  }

  private def generateProvidedMessagePortsMethods(lct:ART2ComponentType) = {
    var buffer = new StringBuffer()

    buffer.append("\n")
    buffer.append("\n")
    buffer.append("\n")
    buffer.append("    /**********  Provided Message Ports methods *********************/\n")
    buffer.append("\n")
    var providedMessages = lct.getProvided.find(portTypeRef => portTypeRef.getRef.isInstanceOf[MessagePortType])
    providedMessages.foreach{portTypeRef =>
      buffer.append("\n")
      buffer.append("    /**********  " + portTypeRef.getName + " methods *********************/\n")
      portTypeRef.getMappings.foreach{ mapping =>
        buffer.append("\n")
        buffer.append("    @Port(name=\""+portTypeRef.getName+"\")\n")
        buffer.append("    public void " + mapping.getBeanMethodName + "(Object message) {\n")
        buffer.append("        //TODO: Complete the method\n")
        buffer.append("        throw new UnsupportedOperationException(\"Not implemented yet !\");\n")
        buffer.append("    }\n")
      }
    }
    buffer.toString
  }

  def convertType(rt:String) = {
    rt match {
      case "scala.Double" => "double"
      case "scala.Int" => "int"
      case "scala.Boolean" => "boolean"
      case "scala.Long" => "long"
      case "scala.Float" => "float"
      case "scala.Char" => "char"
      case "scala.Short" => "short"
      case "scala.Byte" => "byte"
      case _ => {
          printf("Unhandled type ComponentTypeGenerator::ConvertReturnType::" + rt + "\n")
          rt
        }
    }
  }

}
