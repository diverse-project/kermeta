/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ChannelType
import org.kermeta.art2.ContainerRoot
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DeployUnitProcessor
import org.kermeta.art2.framework.annotation.processor.visitor.sub.DictionaryProcessor
import scala.collection.JavaConversions._

case class ChannelTypeFragmentVisitor(channelType : ChannelType,env : AnnotationProcessorEnvironment)
extends SimpleDeclarationVisitor 
   with DeployUnitProcessor
   with DictionaryProcessor{

  override def visitClassDeclaration(classdef : ClassDeclaration) = {
    //SUB PROCESSOR
    processDictionary(channelType,classdef)
    processDeployUnit(channelType,classdef,env)

  }

}
