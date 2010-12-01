/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.TypeDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.TypeDefinition
import scala.collection.JavaConversions._

trait DeployUnitProcessor {

  def processDeployUnit(typeDef : TypeDefinition,classdef : TypeDeclaration,env : AnnotationProcessorEnvironment)={
    var root : ContainerRoot = typeDef.eContainer.asInstanceOf[ContainerRoot]

    /* CREATE COMPONENT TYPE DEPLOY UNIT IF NEEDED */
    var unitName = env.getOptions.find({op => op._1.contains("art2.lib.id")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
    var groupName = env.getOptions.find({op => op._1.contains("art2.lib.group")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
    var version = env.getOptions.find({op => op._1.contains("art2.lib.version")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
    var tag = env.getOptions.find({op => op._1.contains("tag")}).getOrElse{("key=","")}._1.split('=').toList.get(1)

    var repositories = env.getOptions.find({op => op._1.contains("repositories")}).getOrElse{("key=","")}._1.split('=').toList.get(1)

    var repositoriesList : List[String] = repositories.split(";").toList

    var ctdeployunit = root.getDeployUnits.find({du => du.getUnitName == unitName && du.getGroupName == groupName && du.getVersion == version }) match {
      case None => {
          var newdeploy = Art2Factory.eINSTANCE.createDeployUnit
          newdeploy.setUnitName(unitName)
          newdeploy.setGroupName(groupName)
          newdeploy.setVersion(version)
          newdeploy.setHashcode(tag)
          root.getDeployUnits.add(newdeploy)
          newdeploy
        }
      case Some(fdu)=> fdu.setHashcode(tag);fdu
    }
    typeDef.setDeployUnit(ctdeployunit)

    /* ADD DEPLOY UNIT to RepositoryList */
    repositoriesList.foreach{repoUrl=>
      if(repoUrl != ""){
        var repo = root.getRepositories.find(r => r.getUrl == repoUrl) match {
          case None => {
              var newrepo = Art2Factory.eINSTANCE.createRepository
              newrepo.setUrl(repoUrl)
              root.getRepositories.add(newrepo)
              newrepo
          }
          case Some(e)=> e
        }
        repo.getUnits.add(ctdeployunit)
      }
    }


  }



}
