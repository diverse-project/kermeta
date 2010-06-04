/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import art2.ComponentType
import art2.ContainerRoot
import art2.PortType
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.MethodDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.framework.Art2Utility
import scala.collection.JavaConversions._

class ComponentTypeVisitor(env : AnnotationProcessorEnvironment,root : ContainerRoot) extends SimpleDeclarationVisitor {

  var componentType : ComponentType = _
  def getComponentType : ComponentType = {
    return componentType;
  }

  /*
  private def foundOrCreatePortType(qName:String,root : ContainerRoot) : PortType ={
    root.getPortTypes.find({pt=>pt.getName.equals(qName)}) match {
      case Some(pt)=> pt//TODO CHECK COSISTENCY}
      case None=> {
          var newpt = art2.Art2Factory.eINSTANCE.createServicePortType
          newpt.setName(qName)
          root.getPortTypes.add(newpt)
          newpt
        }
    }
  }
*/
  override def visitClassDeclaration(classdef : ClassDeclaration) = {

    componentType = art2.Art2Factory.eINSTANCE.createComponentType();

    var ctname = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ComponentType]).name
    if(ctname.equals("empty")){
      ctname = classdef.getSimpleName
    }
    componentType.setName(ctname)
    
    componentType.setFactoryBean(classdef.getQualifiedName+"Factory")

    

    /* CHECK PROVIDED PORTS */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Provides]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Provides]).value.foreach{types=>

        /* TODO , remove that :  CE CODE EST IGNOBLE MAIS RECOMMANDE PAR SUN !!! */
        var tv = new PortTypeVisitor
        try {
          types.className
        } catch {
          case e : com.sun.mirror.`type`.MirroredTypeException => e.getTypeMirror.accept(tv)
        }
        //root.getPortTypes.add(tv.dataType)

        var ptREF = art2.Art2Factory.eINSTANCE.createPortTypeRef
        ptREF.setName(types.name)
        ptREF.setRef(Art2Utility.getOraddPortType(tv.dataType))
        componentType.getProvided.add(ptREF)

      }
    }
    /* CHECK REQUIRED PORTS */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Requires]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Requires]).value.foreach{req=>
        var ptreqREF = art2.Art2Factory.eINSTANCE.createPortTypeRef
        ptreqREF.setName(req.name)

        var tv = new PortTypeVisitor
        try {
          req.className
        } catch {
          case e : com.sun.mirror.`type`.MirroredTypeException => e.getTypeMirror.accept(tv)
        }
        ptreqREF.setRef(Art2Utility.getOraddPortType(tv.dataType))

        componentType.getRequired.add(ptreqREF)
      }
    }

    //PROCESS SUB METHOD
    classdef.getMethods().foreach{method => method.accept(this) }

    root.getComponentTypes.add(componentType)

  }

  override def visitMethodDeclaration(methoddef : MethodDeclaration) = {
    var annotationPort = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Port])
    if(annotationPort != null){
      componentType.getProvided.find({provided=> provided.getName.equals(annotationPort.name) }) match {
        case Some(ptref) => {
            var ptREFmapping = art2.Art2Factory.eINSTANCE.createPortTypeMapping
            ptREFmapping.setBeanMethodName(methoddef.getSimpleName)
            ptREFmapping.setServiceMethodName(annotationPort.method)
            ptref.getMappings.add(ptREFmapping)

            //TODO GENERATED AND CHECK OPERATION

          }
        case None => env.getMessager.printError("ProvidedPort not found "+annotationPort.name)
      }

      /*
       root.getPortTypes.find({pt => pt.getName.equals(annotationPort.`type`)}) match {
       case Some(pt) => {




       var ptREF = art2.Art2Factory.eINSTANCE.createPortTypeRef
       ptREF.setName(annotationPort.name)
       ptREF.setRef(pt)

       var ptREFmapping = art2.Art2Factory.eINSTANCE.createPortTypeMapping
       ptREFmapping.setBeanMethodName(methoddef.getSimpleName)
       ptREFmapping.setServiceMethodName(annotationPort.name)

       ptREF.getMappings.add(ptREFmapping)


       pt match {
       case spt : ServicePortType => {
       //GENERATE OPERATION
       var newop = art2.Art2Factory.eINSTANCE.createOperation();
       newop.setName(methoddef.getSimpleName());
       var tv = new DataTypeVisitor
       methoddef.getReturnType().accept(tv);
       newop.setReturnType(tv.getDataType())
       spt.getOperations().add(newop);
       }
       case _ =>
       }




       componentType.getProvided.add(ptREF)
            
       }
       case None => println("Error, PortType not found !")
       }
       */
    }
  }
}