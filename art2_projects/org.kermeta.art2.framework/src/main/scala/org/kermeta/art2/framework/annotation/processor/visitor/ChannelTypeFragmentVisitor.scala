/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.ChannelType
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.MethodDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DeployUnitProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DictionaryProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.LibraryProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.LifeCycleMethodProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.ThirdPartyProcessor
import scala.collection.JavaConversions._

case class ChannelTypeFragmentVisitor(channelType : ChannelType,env : AnnotationProcessorEnvironment)
extends SimpleDeclarationVisitor 
   with DeployUnitProcessor
   with DictionaryProcessor
   with LibraryProcessor
   with ThirdPartyProcessor
   with LifeCycleMethodProcessor{

  override def visitClassDeclaration(classdef : ClassDeclaration) = {
    //SUB PROCESSOR
    processDictionary(channelType,classdef)
    processDeployUnit(channelType,classdef,env)
    processLibrary(channelType,classdef)
    processThirdParty(channelType,classdef)

    classdef.getMethods().foreach{method => method.accept(this) }
  }

  override def visitMethodDeclaration(methoddef : MethodDeclaration) = {
    processLifeCycleMethod(channelType,methoddef)
  }

}
