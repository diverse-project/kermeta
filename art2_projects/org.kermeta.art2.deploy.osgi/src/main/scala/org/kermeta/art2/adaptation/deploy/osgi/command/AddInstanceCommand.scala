/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import java.io.File
import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.FileHelper._
import scala.collection.JavaConversions._

case class AddInstanceCommand(c : Instance, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  def execute() : Boolean= {

    /* create bundle cache structure */
    var directory = ctx.bundle.getBundleContext.getDataFile("dyanmicBundle_"+c.getName)
    directory.mkdir

    var METAINFDIR = new File(directory.getAbsolutePath+"/"+"META-INF")
    METAINFDIR.mkdir

    // var directoryWrapper = ctx.bundle.getBundleContext.getDataFile("dyanmicBundle_"+c.getName+"Wrapper")
    // directoryWrapper.mkdir

    //var METAINFDIRWRAPPER = new File(directoryWrapper.getAbsolutePath+"/"+"META-INF")
    // METAINFDIRWRAPPER.mkdir


    //FOUND CT SYMBOLIC NAME
    var mappingFound =  ctx.bundleMapping.find({bundle =>bundle.name==c.getTypeDefinition.getName && bundle.objClassName==c.getTypeDefinition.getClass.getName}) match {
      case Some(bundle)=> bundle
      case None => println("Type Not Found"); return false; null;
    }

    /* STEP GENERATE COMPONENT INSTANCE BUNDLE */
    /* Generate File */
    var MANIFEST = new File(METAINFDIR+"/"+"MANIFEST.MF")

    var activatorPackage = c.getTypeDefinition.getFactoryBean().substring(0, c.getTypeDefinition.getFactoryBean().lastIndexOf("."))
    var activatorName = c.getTypeDefinition.getName()+"Activator"
    MANIFEST.write(List("Manifest-Version: 1.0",
                        "Bundle-SymbolicName: "+c.getName,
                        "Bundle-Version: 1",
                        "DynamicImport-Package: *",
                        "Bundle-ManifestVersion: 2",
                        "Bundle-Activator: "+activatorPackage+"."+activatorName,
                        Constants.ART2_INSTANCE_NAME_HEADER+": "+c.getName,
                        Constants.ART2_NODE_NAME_HEADER+": "+nodeName,
                        //   "Bundle-Blueprint: component.xml",
                        "Require-Bundle: "+mappingFound.bundle.getSymbolicName
      ))

    /*
     var MANIFESTWRAPPER = new File(METAINFDIRWRAPPER+"/"+"MANIFEST.MF")
     MANIFESTWRAPPER.write(List("Manifest-Version: 1.0",
     "Bundle-SymbolicName: "+c.getName+"Wrapper;blueprint.wait-for-dependencies:=true",
     "Bundle-Version: 1",
     "DynamicImport-Package: *",
     "Bundle-ManifestVersion: 2",
     "Bundle-Blueprint: componentWrapper.xml",
     "Require-Bundle: "+mappingFound.bundle.getSymbolicName
     ))
     */


    // var BLUEPRINTBASE = new File(directory+"/"+"component.xml")
    // BLUEPRINTBASE.write(AddComponentInstanceGenerator.generate(c))


    // var BLUEPRINTWRAPPER = new File(directoryWrapper+"/"+"componentWrapper.xml")
    //  BLUEPRINTWRAPPER.write(AddComponentInstanceWrapperGenerator.generate(c))

    // println(AddComponentInstanceGenerator.generate(c));
    println("Instance-DIRECTORY"+directory.getAbsolutePath)
    //  println("CI-DIRECTORY"+directoryWrapper.getAbsolutePath)
    try{
      var bundle= ctx.bundleContext.installBundle("assembly:"+directory.getAbsolutePath);
      // var bundleWrapper= ctx.bundleContext.installBundle("assembly:"+directoryWrapper.getAbsolutePath);
      //    executedBundles = List(bundle,bundleWrapper)

      ctx.bundleMapping.add(Art2OSGiBundle(c.getName,c.getClass.getName,bundle))
      // ctx.bundleMapping.append(Art2OSGiBundle(c,c.getName,c.getClass,bundleWrapper))

      lastExecutionBundle = Some(bundle)

      bundle.start
      //   bundleWrapper.start
      mustBeStarted = true
      true
    } catch {
      case _ @ e => e.printStackTrace;false
    }
  }

  def undo() = {
    lastExecutionBundle match {
      case None =>
      case Some(b)=>{
          try{
            b.stop;b.uninstall
          }catch{
            case _ @ e => e.printStackTrace
          }
        }
    }


    /* TODO CALL refreshPackage */
  }

//  var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None

}
