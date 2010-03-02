/* GlobalConfiguration.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala

import java.util.ResourceBundle
import scala.tools.nsc.io.File
import scala.collection.JavaConversions._

object GlobalConfiguration extends LogAspect{
  
  def load(_props : ResourceBundle) : Boolean = {
    var loadResult = true
    props = _props
    //FIRST STEP CHECK VALUES
    loadResult = loadResult && props.containsKey("use.default.aspect.uml")
    loadResult = loadResult && props.containsKey("use.default.aspect.ecore")
    loadResult = loadResult && props.containsKey("use.default.aspect.km")
    loadResult = loadResult && props.containsKey("project.group.id")
    loadResult = loadResult && props.containsKey("project.artefact.id")
    if(loadResult){
      frameworkGeneratedPackageName = "ScalaImplicit."+props.getString("project.group.id")+"."+props.getString("project.artefact.id")
      outputProject = if(props.containsKey("output.target.folder") && !props.getString("output.target.folder").isEmpty){ props.getString("output.target.folder") } else { 
        var result = Util.createTempDirectory.getAbsolutePath
        log.info("No output folder specified, temp created : "+result)
        result
      }
      outputFolder = outputProject+"/src"
      outputBinFolder = outputProject+"/bin"
      workspaceURI = if(props.containsKey("workspace.platform.uri")) { props.getString("workspace.platform.uri") } else { null }
      pluginURI = if(props.containsKey("workspace.plugin.uri")) { props.getString("workspace.plugin.uri") } else { null }
    }
    return loadResult
  }

  var props : ResourceBundle = null
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
 