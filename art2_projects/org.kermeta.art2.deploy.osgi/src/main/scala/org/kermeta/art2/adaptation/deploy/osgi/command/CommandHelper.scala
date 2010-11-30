/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import scala.collection.JavaConversions._

object CommandHelper {

  def buildKEY(du : DeployUnit) : String = {
    du.getName+"/"+buildQuery(du,None)
  }

  def buildAllQuery(du : DeployUnit) : List[String] = {
    var res : List[String] = List()
    var root = du.eContainer.asInstanceOf[ContainerRoot]
    root.getRepositories.foreach{repo=>
      if(repo.getUnits.exists(p=>p == du)){
        res = res ++ List(buildQuery(du,Some(repo.getUrl)))
      }
    }
    res match {
      case List()=> println("Add default location"); res = res ++ List(buildQuery(du,None))
      case _ =>
    }
    res
  }

  def buildQuery(du : DeployUnit,repoUrl:Option[String]) : String = {
    var query = new StringBuilder
    query.append("mvn:")
    repoUrl match {
      case Some(r)=> query.append(r);query.append("!")
      case None =>
    }
    query.append(du.getGroupName)
    query.append("/")
    query.append(du.getUnitName)
    du.getVersion match {
      case "default"=>
      case ""=>
      case _ => query.append("/");query.append(du.getVersion)
    }
    query.toString
  }

}
