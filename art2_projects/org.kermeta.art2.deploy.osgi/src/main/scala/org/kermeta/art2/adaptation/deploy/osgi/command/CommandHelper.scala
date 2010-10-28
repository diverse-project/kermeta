/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.DeployUnit

object CommandHelper {

  def buildKEY(du : DeployUnit) : String = {
    du.getName+"/"+buildQuery(du)
  }

  def buildQuery(du : DeployUnit) : String = {
    var query = new StringBuilder
    query.append("mvn:")
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
