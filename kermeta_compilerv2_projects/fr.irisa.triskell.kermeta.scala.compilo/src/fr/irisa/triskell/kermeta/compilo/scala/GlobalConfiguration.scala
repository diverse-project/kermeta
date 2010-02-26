/* GlobalConfiguration.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala

import java.util.Properties
import scala.tools.nsc.io.File

object GlobalConfiguration {
  
  def loadFromProperties(_props : Properties) : Boolean = {
    var loadResult = true
    props = _props
    //FIRST STEP CHECK VALUES
    loadResult = loadResult && props.contains("use.default.aspect.uml")
    loadResult = loadResult && props.contains("use.default.aspect.ecore")
    loadResult = loadResult && props.contains("use.default.aspect.km")
    loadResult = loadResult && props.contains("project.group.id")
    loadResult = loadResult && props.contains("project.artefact.id")
    if(loadResult){
      frameworkGeneratedPackageName = "ScalaImplicit."+props.get("project.group.id")+"."+props.get("project.artefact.id")
      outputProject = if(props.contains("output.target.folder")){ props.get("output.target.folder").toString } else { Util.createTempDirectory.getAbsolutePath }
      outputFolder = outputProject+File.pathSeparator+"src"
      outputBinFolder = outputProject+File.pathSeparator+"bin"
      workspaceURI = if(props.contains("workspace.platform.uri")) { props.get("workspace.platform.uri").toString } else { null }
      pluginURI = if(props.contains("workspace.plugin.uri")) { props.get("workspace.plugin.uri").toString } else { null }
    }
    return loadResult
  }

  var props : Properties = null
  var frameworkGeneratedPackageName : String = null
  var implicitConvTraitName : String = "ImplicitConversion"
  var viewDefTraitName : String = "ViewType"
  var factoryName : String = "RichFactory"
  var outputProject : String = null
  var outputFolder : String = null
  var outputBinFolder : String = null
  var scalaPrefix : String = "Scala"
  var scalaAspectPrefix : String = "ScalaAspect"
  var workspaceURI : String = null
  var pluginURI : String = null
  var withRich : Boolean = true

} 
 