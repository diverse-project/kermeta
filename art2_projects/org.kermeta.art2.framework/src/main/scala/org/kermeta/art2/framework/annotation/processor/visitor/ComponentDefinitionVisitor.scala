/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.ComponentType
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.InterfaceDeclaration
import com.sun.mirror.declaration.MethodDeclaration
import com.sun.mirror.declaration.TypeDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DeployUnitProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DictionaryProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.LibraryProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.LifeCycleMethodProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.PortMappingProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.ProvidedPortProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.RequiredPortProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.ThirdPartyProcessor
import scala.collection.JavaConversions._

case class ComponentDefinitionVisitor(componentType : ComponentType,env : AnnotationProcessorEnvironment)
extends SimpleDeclarationVisitor
   with ProvidedPortProcessor
   with RequiredPortProcessor
   with ThirdPartyProcessor
   with DeployUnitProcessor
   with DictionaryProcessor
   with PortMappingProcessor
   with LibraryProcessor
   with LifeCycleMethodProcessor
{

  override def visitClassDeclaration(classdef : ClassDeclaration) = {
    if(classdef.getSuperclass != null){
      var annotFragment = classdef.getSuperclass.getDeclaration.getAnnotation(classOf[org.kermeta.art2.annotation.ComponentFragment])
      if(annotFragment != null){
        classdef.getSuperclass.getDeclaration.accept(this)
      }
    }
    commonProcess(classdef)
  }

  override def visitInterfaceDeclaration(interfaceDecl : InterfaceDeclaration) = {
    commonProcess(interfaceDecl)
  }


  def commonProcess(typeDecl : TypeDeclaration) = {
    typeDecl.getSuperinterfaces.foreach{it=>
      var annotFragment = it.getDeclaration.getAnnotation(classOf[org.kermeta.art2.annotation.ComponentFragment])
      it.getDeclaration.accept(this)
    }
    processLibrary(componentType,typeDecl)
    processDictionary(componentType,typeDecl)
    processDeployUnit(componentType,typeDecl,env)
    processThirdParty(componentType,typeDecl)
    processProvidedPort(componentType,typeDecl)
    processRequiredPort(componentType,typeDecl)

    typeDecl.getMethods().foreach{method => method.accept(this) }

  }

  override def visitMethodDeclaration(methoddef : MethodDeclaration) = {
    processPortMapping(componentType,methoddef,env)
    processLifeCycleMethod(componentType,methoddef)
  }




}
