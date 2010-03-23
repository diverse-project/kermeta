/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.embedded

import fr.irisa.triskell.kermeta.compilo.scala.GlobalConfiguration
import java.io.FileWriter
//import org.apache.maven.embedder.DefaultConfiguration
import java.io.OutputStream
import java.io.PrintStream
import org.apache.maven.artifact.repository.metadata.DefaultRepositoryMetadataManager
import org.apache.maven.embedder.DefaultConfiguration
import org.apache.maven.embedder.MavenEmbedder
import org.apache.maven.embedder.MavenEmbedderConsoleLogger
import org.apache.maven.execution.DefaultMavenExecutionRequest
import org.apache.maven.execution.MavenExecutionRequest
import scala.collection.JavaConversions._

object EmbeddedMavenHelper {

    def run(clean : Boolean, createPackage : Boolean,standalone : Boolean,exec : Boolean,additionalClasspath : List[String], outputstream : OutputStream) = {

        var goals = new scala.collection.mutable.ArrayBuffer[String]
        if (clean){
            goals.add("clean")
            goals.add("scala:compile")
        }
        if(createPackage){

            goals.add("package")
            // goals.add("install")
            //goals.add("bundle:install")
        }
        if(exec){
            goals.add("scala:run")
        }
    
        var project = POMGeneratorHelper.initProject(standalone,additionalClasspath)
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
        var rep:DefaultRepositoryMetadataManager= null
        var maven : MavenEmbedder = null;
        try {
            var configuration = new DefaultConfiguration().setClassLoader(Thread.currentThread().getContextClassLoader());
            var validationResult = MavenEmbedder.validateConfiguration(configuration);
            maven = new MavenEmbedder(configuration);
            var oldOut : OutputStream = System.out
            var oldErr : OutputStream = System.err

            if (outputstream != null){
                System.setOut(new PrintStream(outputstream))
                System.setErr(new PrintStream(outputstream))
            }
            //   maven.setLogger(new MavenEmbedderFileLogger(new java.io.File("/tmp/testoutput")));
            
            maven.setLogger(new MavenEmbedderConsoleLogger());
            //ArtifactRepository localRepository, Settings settings,
            //                                         EventDispatcher eventDispatcher, List goals, String baseDirectory,
            //                                   ProfileManager globalProfileManager, Properties executionProperties,
            //                                     boolean showErrors
            // var executionProperties : java.util.Properties = new java.util.Properties()
            // executionProperties.put("once", "true");
            // executionProperties.put("maven.test.skip", "true");

//      var request = new DefaultMavenExecutionRequest(localRepository,settings,eventDispatcher,goals,GlobalConfiguration.outputProject,globalProfileManager,executionProperties,true)//.setBaseDirectory(rootDirectory)//.setGoals(goals)
            var request = new DefaultMavenExecutionRequest().setBaseDirectory(rootDirectory).setGoals(goals)
            request.setLoggingLevel(MavenExecutionRequest.LOGGING_LEVEL_ERROR);
            request.setProperty("once", "true");
            request.setProperty("maven.test.skip", "true");
            request.setOffline(true)
            
            /*MavenProject project,
             List goals,
             EventMonitor eventMonitor,
             TransferListener transferListener,
             Properties properties,
             File executionRootDirectory */
            //var project : MavenProject = new MavenProject()

            // var monitor = new DefaultEventMonitor(null)
            //  var transferListener = new DefaultTransferListener()
            // maven.setClassLoader(Thread.currentThread().getContextClassLoader())
            //  maven.start
            //var result = maven.execute(project, goals, null,null ,executionProperties,rootDirectory);
            var result = maven.execute(request)
            if (outputstream != null){
                System.setOut(new PrintStream(oldOut))
                System.setErr(new PrintStream(oldErr))
            }
            //import scala.collection.JavaConversions._
            //println(result.getExceptions.mkString)

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
