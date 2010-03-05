/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.embedded

import fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration
import java.io.FileWriter
import org.apache.maven.embedder.DefaultConfiguration
import org.apache.maven.embedder.MavenEmbedder
import org.apache.maven.embedder.MavenEmbedderConsoleLogger
import org.apache.maven.execution.DefaultMavenExecutionRequest
import org.apache.maven.execution.MavenExecutionRequest
import scala.collection.JavaConversions._

object EmbeddedMavenHelper {

  def run(createPackage : Boolean,standalone : Boolean,exec : Boolean) = {

    var goals = new scala.collection.mutable.ArrayBuffer[String]
    goals.add("clean")
    goals.add("scala:compile")
    
    if(createPackage){
      goals.add("install")
      goals.add("bundle:install")
    }
    if(exec){
      goals.add("scala:run")
    }
    
    var project = POMGeneratorHelper.initProject(standalone)
    var rootDirectory = new java.io.File(GlobalConfiguration.outputProject);
    var pomFile = new java.io.File(rootDirectory, "pom.xml");
    try {
      var fw = new FileWriter(pomFile);
      project.writeModel(fw);
      fw.flush();
      fw.close();
    } catch  {
      case e:Exception=> e.printStackTrace()
    }

    var maven : MavenEmbedder = null;
    try {
      var configuration = new DefaultConfiguration().setClassLoader(Thread.currentThread().getContextClassLoader());
      var validationResult = MavenEmbedder.validateConfiguration(configuration);
      maven = new MavenEmbedder(configuration);
      maven.setLogger(new MavenEmbedderConsoleLogger());
      var request = new DefaultMavenExecutionRequest().setBaseDirectory(rootDirectory).setGoals(goals)
      //request.setLoggingLevel(MavenExecutionRequest.LOGGING_LEVEL_ERROR);
      request.setProperty("once", "true");
      request.setProperty("maven.test.skip", "true");
      var result = maven.execute(request);
    } catch {
      case e: Exception => e.printStackTrace()
    } finally {
      if (maven != null) {
        try {
          maven.stop();
        } catch {
          case e:Exception => e.printStackTrace();
        }
      }
    }
  }

}
