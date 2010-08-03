/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import java.io.File
import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.adaptation.deploy.osgi.command.generator.AddComponentInstanceGenerator
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import org.kermeta.art2.framework.FileHelper._

case class AddComponentInstanceCommand(c : ComponentInstance, ctx : Art2DeployManager) extends PrimitiveCommand {

  def execute() : Boolean= {

    /* create bundle cache structure */
    var directory = ctx.bundle.getBundleContext.getDataFile("dyanmicBundle_"+c.getName)
    directory.mkdir

    var METAINFDIR = new File(directory.getAbsolutePath+"/"+"META-INF")
    METAINFDIR.mkdir

    //var OSGIINFDIR = new File(directory.getAbsolutePath+"/"+"OSGI-INF"+"/"+"blueprint")
    //OSGIINFDIR.mkdirs

    /* Generate File */

    
    var MANIFEST = new File(METAINFDIR+"/"+"MANIFEST.MF")
    MANIFEST.write(List("Manifest-Version: 1.0",
                        "Bundle-SymbolicName: "+c.getName,
                        "Bundle-Version: 1",
                        "DynamicImport-Package: *",
                        "Bundle-ManifestVersion: 2",
                        "Bundle-Blueprint: component.xml"
      ))
     

    var BLUEPRINTBASE = new File(directory+"/"+"component.xml")
    BLUEPRINTBASE.write(AddComponentInstanceGenerator.generate(c))
    
    // println(AddComponentInstanceGenerator.generate(c));
    println("CI-DIRECTORY"+directory.getAbsolutePath)
    try{
      lastExecutionBundle = Some(ctx.bundleContext.installBundle("assembly:"+directory.getAbsolutePath));
      ctx.bundleMapping.append(Art2OSGiBundle(c,c.getName,c.getClass,lastExecutionBundle.get))
      lastExecutionBundle.get.start
      true
    } catch {
      case _ @ e => e.printStackTrace;false
    }
  }

  def undo() = {
    lastExecutionBundle match {
      case Some(bundle)=> bundle.stop;bundle.uninstall
      case None=> //NOTHING CAN BE DOING HERE
    }
    /* TODO CALL refreshPackage */
  }

  var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None

}
