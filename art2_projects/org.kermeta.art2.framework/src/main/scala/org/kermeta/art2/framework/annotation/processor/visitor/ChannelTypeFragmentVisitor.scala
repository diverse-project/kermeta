/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.PortType
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import com.sun.mirror.declaration.MethodDeclaration
import com.sun.mirror.util.SimpleDeclarationVisitor
import org.kermeta.art2.framework.Art2Utility
import scala.collection.JavaConversions._

class ChannelTypeFragmentVisitor(env : AnnotationProcessorEnvironment,root : ContainerRoot) extends SimpleDeclarationVisitor {

  override def visitClassDeclaration(classdef : ClassDeclaration) = {

    var channelType = Art2Factory.eINSTANCE.createChannelType
    var ctname = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ChannelTypeFragment]).name
    if(ctname.equals("empty")){
      ctname = classdef.getSimpleName
    }
    channelType.setName(ctname)
    channelType.setBean(classdef.getQualifiedName)
    channelType.setFactoryBean(classdef.getQualifiedName+"Factory")

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
    channelType.setDeployUnit(ctdeployunit)

    /* CREATE LIBRARY IF NEEDED */
    var libName = classdef.getAnnotation(classOf[org.kermeta.art2.annotation.ChannelTypeFragment]).libName
    root.getLibraries.find({lib=>lib.getName== libName}) match {
      case Some(lib)=> lib.getSubTypes.add(channelType)
      case None => {
          var newlib = Art2Factory.eINSTANCE.createTypeLibrary
          newlib.setName(libName)
          newlib.getSubTypes.add(channelType)
          root.getLibraries.add(newlib)
        }
    }
    root.getTypeDefinitions.add(channelType)
  }

}
