/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import java.io.File
import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.adaptation.deploy.osgi.command.generator.AddComponentInstanceGenerator
import org.kermeta.art2.adaptation.deploy.osgi.command.generator.AddComponentInstanceWrapperGenerator
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import org.kermeta.art2.framework.FileHelper._

case class AddComponentInstanceCommand(c : ComponentInstance, ctx : Art2DeployManager) extends PrimitiveCommand {

  var executedBundles : List[org.osgi.framework.Bundle] = List()

  def execute() : Boolean= {

    /* create bundle cache structure */
    var directory = ctx.bundle.getBundleContext.getDataFile("dyanmicBundle_"+c.getName)
    directory.mkdir

    var METAINFDIR = new File(directory.getAbsolutePath+"/"+"META-INF")
    METAINFDIR.mkdir

    var directoryWrapper = ctx.bundle.getBundleContext.getDataFile("dyanmicBundle_"+c.getName+"Wrapper")
    directoryWrapper.mkdir

    var METAINFDIRWRAPPER = new File(directoryWrapper.getAbsolutePath+"/"+"META-INF")
    METAINFDIRWRAPPER.mkdir


    //FOUND CT SYMBOLIC NAME
    var mappingFound =  ctx.bundleMapping.find({bundle => bundle.obj.equals(c.getComponentType)}) match {
      case Some(bundle)=> bundle
      case None => println("ComponentType Not Found"); return false; null;
    }

    //var OSGIINFDIR = new File(directory.getAbsolutePath+"/"+"OSGI-INF"+"/"+"blueprint")
    //OSGIINFDIR.mkdirs


    /* STEP GENERATE COMPONENT INSTANCE BUNDLE */
    /* Generate File */
    var MANIFEST = new File(METAINFDIR+"/"+"MANIFEST.MF")
    MANIFEST.write(List("Manifest-Version: 1.0",
                        "Bundle-SymbolicName: "+c.getName+";blueprint.wait-for-dependencies:=true",
                        "Bundle-Version: 1",
                        "DynamicImport-Package: *",
                        "Bundle-ManifestVersion: 2",
                        "Bundle-Blueprint: component.xml",
                        "Require-Bundle: "+mappingFound.bundle.getSymbolicName
      ))


    var MANIFESTWRAPPER = new File(METAINFDIRWRAPPER+"/"+"MANIFEST.MF")
    MANIFESTWRAPPER.write(List("Manifest-Version: 1.0",
                        "Bundle-SymbolicName: "+c.getName+"Wrapper;blueprint.wait-for-dependencies:=true",
                        "Bundle-Version: 1",
                        "DynamicImport-Package: *",
                        "Bundle-ManifestVersion: 2",
                        "Bundle-Blueprint: componentWrapper.xml",
                        "Require-Bundle: "+mappingFound.bundle.getSymbolicName
      ))



    var BLUEPRINTBASE = new File(directory+"/"+"component.xml")
    BLUEPRINTBASE.write(AddComponentInstanceGenerator.generate(c))


    var BLUEPRINTWRAPPER = new File(directoryWrapper+"/"+"componentWrapper.xml")
    BLUEPRINTWRAPPER.write(AddComponentInstanceWrapperGenerator.generate(c))

    // println(AddComponentInstanceGenerator.generate(c));
    println("CI-DIRECTORY"+directory.getAbsolutePath)
    println("CI-DIRECTORY"+directoryWrapper.getAbsolutePath)
    try{
      var bundle= ctx.bundleContext.installBundle("assembly:"+directory.getAbsolutePath);
      var bundleWrapper= ctx.bundleContext.installBundle("assembly:"+directoryWrapper.getAbsolutePath);
      executedBundles = List(bundle,bundleWrapper)

      ctx.bundleMapping.append(Art2OSGiBundle(c,c.getName,c.getClass,bundle))
      ctx.bundleMapping.append(Art2OSGiBundle(c,c.getName,c.getClass,bundleWrapper))

      lastExecutionBundle = Some(bundle)

      bundle.start
      bundleWrapper.start

      true
    } catch {
      case _ @ e => e.printStackTrace;false
    }
  }

  def undo() = {
    executedBundles.foreach{b=>
      try{
        b.stop;b.uninstall
      }catch{
        case _ @ e => e.printStackTrace
      }

    }
    /* TODO CALL refreshPackage */
  }

//  var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None

}
