/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.PortType
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.MethodDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.framework.Art2Utility
import scala.collection.JavaConversions._

class ComponentTypeVisitor(env : AnnotationProcessorEnvironment,root : ContainerRoot) extends SimpleDeclarationVisitor with TypeDefinitionVisitor {

  var componentType : ComponentType = _
  def getComponentType : ComponentType = {
    return componentType;
  }

  override def visitClassDeclaration(classdef : ClassDeclaration) = {

    componentType = Art2Factory.eINSTANCE.createComponentType();
    var ctname = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ComponentType]).name
    if(ctname.equals("empty")){
      ctname = classdef.getSimpleName
    }
    componentType.setName(ctname)
    componentType.setBean(classdef.getQualifiedName)
    componentType.setFactoryBean(classdef.getQualifiedName+"Factory")

    //COMMON TYPE PROPERTY
    processType(componentType,classdef,env,root)


    /* CREATE COMPONENT TYPE DEPLOY UNIT IF NEEDED */
    var unitName = env.getOptions.find({op => op._1.contains("art2.lib.id")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
    var groupName = env.getOptions.find({op => op._1.contains("art2.lib.group")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
    var version = env.getOptions.find({op => op._1.contains("art2.lib.version")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
    var ctdeployunit = root.getDeployUnits.find({du => du.getUnitName == unitName && du.getGroupName == groupName && du.getVersion == version }) match {
      case None => {
          var newdeploy = Art2Factory.eINSTANCE.createDeployUnit
          newdeploy.setUnitName(unitName)
          newdeploy.setGroupName(groupName)
          newdeploy.setVersion(version)
          root.getDeployUnits.add(newdeploy)
          newdeploy
        }
      case Some(fdu)=> fdu
    }
    componentType.setDeployUnit(ctdeployunit)

    /* CREATE FACTORY IF NEEDED */
    var ctLibName = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ComponentType]).libName
    root.getLibraries.find({lib=>lib.getName.equals(ctLibName)}) match {
      case Some(lib)=> lib.getSubTypes.add(componentType)
      case None => {
          var newlib = Art2Factory.eINSTANCE.createTypeLibrary
          newlib.setName(ctLibName)
          newlib.getSubTypes.add(componentType)
          root.getLibraries.add(newlib)
        }
    }

    /* CHECK THIRDPARTIES */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ThirdParties]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ThirdParties]).value.foreach{tp=>

        root.getDeployUnits.find({etp => etp.getName == tp.name}) match {
          case Some(e) => {
              componentType.getRequiredLibs.add(e)
            }
          case None => {
              var newThirdParty = Art2Factory.eINSTANCE.createDeployUnit
              newThirdParty.setName(tp.name)
              newThirdParty.setUrl(tp.url)
              root.getDeployUnits.add(newThirdParty)
              componentType.getRequiredLibs.add(newThirdParty)
            }
        }




      }
    }


    /* CHECK PROVIDED PORTS */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Provides]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Provides]).value.foreach{req=>

        var ptreqREF = Art2Factory.eINSTANCE.createPortTypeRef
        ptreqREF.setName(req.name)

        ptreqREF.setRef(Art2Utility.getOraddPortType(req.`type` match {
              case org.kermeta.art2.annotation.PortType.SERVICE => {
                  var tv = new ServicePortTypeVisitor
                  try { req.className
                  } catch {case e : com.sun.mirror.`type`.MirroredTypeException => e.getTypeMirror.accept(tv)}
                  tv.dataType
                }
              case org.kermeta.art2.annotation.PortType.MESSAGE => {
                  var mpt = Art2Factory.eINSTANCE.createMessagePortType
                  mpt.setName("org.kermeta.art2.framework.MessagePort")
                  req.filter.foreach{ndts=>
                    var ndt = Art2Factory.eINSTANCE.createTypedElement
                    ndt.setName(ndts)
                    mpt.getFilters.add(Art2Utility.getOraddDataType(ndt))
                  }
                  mpt
                }
              case _ => null
            }))

        componentType.getProvided.add(ptreqREF)

      }
    }
    /* CHECK REQUIRED PORTS */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Requires]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.Requires]).value.foreach{req=>

        var ptreqREF = Art2Factory.eINSTANCE.createPortTypeRef
        ptreqREF.setName(req.name)

        ptreqREF.setRef(Art2Utility.getOraddPortType(req.`type` match {
              case org.kermeta.art2.annotation.PortType.SERVICE => {
                  var tv = new ServicePortTypeVisitor
                  try { req.className
                  } catch {case e : com.sun.mirror.`type`.MirroredTypeException => e.getTypeMirror.accept(tv)}
                  tv.dataType
                }
              case org.kermeta.art2.annotation.PortType.MESSAGE => {
                  var mpt = Art2Factory.eINSTANCE.createMessagePortType
                  mpt.setName("org.kermeta.art2.framework.MessagePort")
                  req.filter.foreach{ndts=>
                    var ndt = Art2Factory.eINSTANCE.createTypedElement
                    ndt.setName(ndts)
                    mpt.getFilters.add(Art2Utility.getOraddDataType(ndt))
                  }
                  mpt
                }
              case _ => null
            }))
        componentType.getRequired.add(ptreqREF)
      }
    }

    //PROCESS SUB METHOD
    classdef.getMethods().foreach{method => method.accept(this) }

    root.getTypeDefinitions.add(componentType)

  }

  override def visitMethodDeclaration(methoddef : MethodDeclaration) = {

    /* STEP 0 : PROCESS PORTS & PORT ANNOTATION */
    var portAnnotations : List[org.kermeta.art2.annotation.Port] = Nil

    var annotationPort = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Port])
    if(annotationPort != null){ portAnnotations = portAnnotations ++ List(annotationPort) }

    var annotationPorts = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Ports])
    if(annotationPorts != null){ portAnnotations = portAnnotations ++ annotationPorts.value.toList }

    portAnnotations.foreach{annot=>
      componentType.getProvided.find({provided=> provided.getName.equals(annot.name) }) match {
        case Some(ptref) => {
            var ptREFmapping = Art2Factory.eINSTANCE.createPortTypeMapping
            ptREFmapping.setBeanMethodName(methoddef.getSimpleName)

            ptref.getRef match {
              case mpt : MessagePortType => {
                  ptREFmapping.setServiceMethodName("process")
              }
              case spt : ServicePortType => {
                  ptREFmapping.setServiceMethodName(annot.method)
              }

            }

            
            ptref.getMappings.add(ptREFmapping)

            //TODO GENERATED AND CHECK OPERATION

          }
        case None => env.getMessager.printError("ProvidedPort not found "+annot.name);System.exit(1)
      }
    }

    /* STEP 1 : PROCESS START & STOP METHOD */
    var startAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Start])
    var stopAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Stop])
    if(startAnnot != null){ componentType.setStartMethod(methoddef.getSimpleName)} 
    if(stopAnnot != null){ componentType.setStopMethod(methoddef.getSimpleName)}

    
  }
}