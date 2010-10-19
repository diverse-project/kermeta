/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.MethodDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DeployUnitProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DictionaryProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.PortMappingProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.ProvidedPortProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.RequiredPortProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.ThirdPartyProcessor
import scala.collection.JavaConversions._

class ComponentTypeVisitor(componentType : ComponentType,env : AnnotationProcessorEnvironment,root : ContainerRoot)
extends SimpleDeclarationVisitor
   with ThirdPartyProcessor
   with ProvidedPortProcessor
   with RequiredPortProcessor
   with DeployUnitProcessor
   with DictionaryProcessor
   with PortMappingProcessor{


  override def visitClassDeclaration(classdef : ClassDeclaration) = {
    var ctname = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ComponentType]).name
    if(ctname.equals("empty")){
      ctname = classdef.getSimpleName
    }
    componentType.setName(ctname)
    componentType.setBean(classdef.getQualifiedName)
    componentType.setFactoryBean(classdef.getQualifiedName+"Factory")
    root.getTypeDefinitions.add(componentType)

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

    //classdef..accept(ComponentFragmentVisitor(componentType,env))


    processDictionary(componentType,classdef)
    processDeployUnit(componentType,classdef,env)
    processThirdParty(componentType,classdef)
    processProvidedPort(componentType,classdef)
    processRequiredPort(componentType,classdef)


    //PROCESS SUB METHOD
    classdef.getMethods().foreach{method => method.accept(this) }

    //PROCESS PARENT ANNOTATION
    classdef.getSuperclass.accept(ComponentFragmentVisitor(componentType,env))

  }

  override def visitMethodDeclaration(methoddef : MethodDeclaration) = {
    processPortMapping(componentType,methoddef,env)
  }
}*/