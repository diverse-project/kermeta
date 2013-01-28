/* GlobalConfiguration.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package org.kermeta.compilo.scala

import java.util.Properties
import java.util.ResourceBundle
import scala.collection.JavaConversions._

object GlobalConfiguration extends LogAspect {

  var init: Boolean = false
  var isTest: Boolean = false

  def load(_props: java.util.Properties): Boolean = {
    var loadResult = true
    props = _props
    //props = new ResourceBundle
    _props
    //FIRST STEP CHECK VALUES
    loadResult = loadResult && _props.containsKey("project.group.id")
    loadResult = loadResult && _props.containsKey("project.artefact.id")
    if (loadResult) {
      frameworkGeneratedPackageName = "ScalaImplicit." + _props.getProperty("project.group.id") + "." + _props.getProperty("project.artefact.id")
      outputProject = if (_props.containsKey("output.target.folder") && !_props.getProperty("output.target.folder").isEmpty) { _props.getProperty("output.target.folder") } else {
        var result = Util.createTempDirectory.getAbsolutePath
        log.info("No output folder specified, temp created : " + result)
        result
      }
      outputFolder = outputProject + java.io.File.separator + "src"
      outputBinFolder = outputProject + java.io.File.separator + "bin"
      workspaceURI = if (_props.containsKey("workspace.platform.uri")) { _props.getProperty("workspace.platform.uri") } else { null }
      pluginURI = if (_props.containsKey("workspace.plugin.uri")) { _props.getProperty("workspace.plugin.uri") } else { null }
      additionalClassPath = if (_props.containsKey("user.additional.classpath")) { List.fromString(props.getProperty("user.additional.classpath"), ',') } else { null }
      scalaAspectPrefix = _props.getProperty("project.artefact.id").replace(".", "")
      this.init = true

      log.info("Properties loaded")
    } else {
      log.info("Ignored properties because some are missing")
    }
    return loadResult
  }

  def convertResourceBundleToProperties(resource: ResourceBundle): Properties = {
    var properties = new Properties();

    resource.getKeys().foreach(key =>
      properties.put(key, resource.getString(key)))
    return properties;

  }

  def load(props: ResourceBundle): Boolean = {

    var loadResult = true
    this.props = this.convertResourceBundleToProperties(props)
    loadResult = loadResult && props.containsKey("project.group.id")
    loadResult = loadResult && props.containsKey("project.artefact.id")
    if (loadResult) {
      frameworkGeneratedPackageName = "ScalaImplicit." + props.getString("project.group.id") + "." + props.getString("project.artefact.id")
      outputProject = if (props.containsKey("output.target.folder") && !props.getString("output.target.folder").isEmpty) { props.getString("output.target.folder") } else {
        var result = Util.createTempDirectory.getAbsolutePath
        log.info("No output folder specified, temp created : " + result)
        result
      }
      scalaAspectPrefix = props.getString("project.artefact.id").replace(".", "")
      outputFolder = outputProject + "/src"
      outputBinFolder = outputProject + "/bin"
      additionalClassPath = if (props.containsKey("user.additional.classpath")) { List.fromString(props.getString("user.additional.classpath"), ',') } else { null }
      workspaceURI = if (props.containsKey("workspace.platform.uri")) { props.getString("workspace.platform.uri") } else { null }
      pluginURI = if (props.containsKey("workspace.plugin.uri")) { props.getString("workspace.plugin.uri") } else { null }
      this.init = true
    }
    return loadResult
  }

  def createPackage(): Boolean = {

    var createpackage = props.getProperty("createPackage")
    if ("true".equals(createpackage))
      return true
    else
      return false
  }
  def standalone(): Boolean = {
    var standalone = props.getProperty("standalone")
    if ("true".equals(standalone))
      return true
    else
      return false
  }
  def clean(): Boolean = {
    var clean = props.getProperty("clean")
    if ("true".equals(clean))
      return true
    else
      return false
  }
  def exec(): Boolean = {
    var exec = props.getProperty("exec")
    if ("false".equals(exec))
      return false
    else
      return true
  }
  def useMaven(): Boolean = {
    var exec = props.getProperty("use.maven.to.compile")
    if ("true".equals(exec))
      return true
    else
      return false
  }

  //var props : ResourceBundle = null
  var props: Properties = null
  var additionalClassPath: List[String] = null

  var frameworkGeneratedPackageName: String = null
  var implicitConvTraitName: String = "ImplicitConversion"
  var viewDefTraitName: String = "ViewType"
  var factoryName: String = "KerRichFactory"
  var outputProject: String = null
  var outputFolder: String = null
  var outputBinFolder: String = null
  var scalaPrefix: String = "Scala"
  @scala.reflect.BeanProperty
  var scalaAspectPrefix: String = k2.utils.UTilScala.scalaAspectPrefix
  var workspaceURI: String = null
  var pluginURI: String = null
  var withRich: Boolean = true

  def baseClass(): String = {
    var baseClass = props.getProperty("baseClass")
    if (baseClass != null)
      return baseClass
    else
      return null
  }
  def baseOperation(): String = {
    var baseOperation = props.getProperty("baseOperation")
    if (baseOperation != null)
      return baseOperation
    else
      return null
  }
  def baseTransformation(): String = {
    var baseTransformation = props.getProperty("baseTransformation")
    if (baseTransformation != null)
      return baseTransformation
    else
      return null
  }

} 
 