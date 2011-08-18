/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.embedded

import org.kermeta.compilo.scala.GlobalConfiguration
import org.apache.maven.model._
import org.apache.maven.project._
import org.codehaus.plexus.util.xml.Xpp3Dom
import scala.collection.JavaConversions._

object POMGeneratorHelper {

    def createLocalDependency( gid : String, aid : String, version : String,localpath:String) : Dependency =  {
        var dependency : Dependency  = new Dependency
        dependency.setGroupId(gid)
        dependency.setArtifactId(aid)
        dependency.setVersion(version)
        dependency.setType("jar")
        dependency.setScope("system")
        dependency.setSystemPath(localpath)
        return dependency
    }

    def createDependency( gid:String,  aid:String,  version:String) : Dependency = {
        var dependency = new Dependency()
        dependency.setGroupId(gid)
        dependency.setArtifactId(aid)
        dependency.setVersion(version)
        dependency.setType("jar")
        dependency.setScope("compile")
        return dependency
    }

    def initProject(standalone : Boolean,additionalClasspath : List[String]) : MavenProject =  {
        var project : MavenProject  = new MavenProject()

        project.setGroupId(GlobalConfiguration.props.getProperty("project.group.id"))
        project.setArtifactId(GlobalConfiguration.props.getProperty("project.artefact.id"))
        project.setVersion("0.0.1-SNAPSHOT")
        project.setModelVersion("4.0.0")
        project.setPackaging("jar");
        project.setName("Kermeta Compiled output")

        project.getProperties().put("project.build.sourceEncoding", "UTF-8")
        project.getProperties().put("project.reporting.outputEncoding", "UTF-8")
        project.getProperties().put("scala.version", "2.8.0")



        /* INIT Project Repository */
//        var triskellNexus = new Repository
//        triskellNexus.setId("triskellNexus")
//        triskellNexus.setUrl("http://tipimouss.irisa.fr:8081/nexus/content/groups/public/")
    
    
  //      var triskellInternal2 = new Repository
  //      triskellInternal2.setId("triskellInternal1")
  //      triskellInternal2.setUrl("http://kermeta.org/maven2private/")
        
//        var triskellInternal2S = new Repository
//        triskellInternal2S.setId("triskellInternal2")
//        triskellInternal2S.setUrl("http://kermeta.org/maven2private-snapshots/")
    
    
  //      var triskellInternal = new Repository
  //      triskellInternal.setId("triskellInternal3")
  //      triskellInternal.setUrl("http://kermeta.org/maven2/")

  //      var triskellInternalSnapshot = new Repository
  //      triskellInternalSnapshot.setId("triskellInternalSnapshot")
  //      triskellInternalSnapshot.setUrl("http://tipimouss.irisa.fr/maven2-snapshots/")

        var triskellPublic = new Repository
        triskellPublic.setId("triskellPublic")
        triskellPublic.setUrl("http://maven.irisa.fr/artifactory/public-release/")

        var triskellPublicSnapshot = new Repository
        triskellPublicSnapshot.setId("triskellPublicSnapshot")
        triskellPublicSnapshot.setUrl("http://maven.irisa.fr/artifactory/public-snapshot/")

        var scalaRepo = new Repository()
        scalaRepo.setId("Scala-tools Maven2 Repository")
        scalaRepo.setUrl("http://scala-tools.org/repo-releases")

        /* INIT PLUGIN REPOSITORY */
        var scalaPluginRepo = new Repository()
        scalaPluginRepo.setId("scala-tools.org")
        scalaPluginRepo.setUrl("http://maven.irisa.fr/artifactory/public-release/")
        //project.getModel().getPluginRepositories().add(scalaPluginRepo)

        project.getModel.setPluginRepositories(project.getModel().getPluginRepositories()++List(scalaPluginRepo))
//        project.getModel.setRepositories(project.getModel.getRepositories++List(triskellInternal))
//        project.getModel.setRepositories(project.getModel.getRepositories++List(triskellInternalSnapshot))
        project.getModel.setRepositories(project.getModel.getRepositories++List(triskellPublic))
        project.getModel.setRepositories(project.getModel.getRepositories++List(triskellPublicSnapshot))
        project.getModel.setRepositories(project.getModel.getRepositories++List(scalaRepo))
    
//        project.getModel.setRepositories(project.getModel.getRepositories++List(triskellInternal2))
 //       project.getModel.setRepositories(project.getModel.getRepositories++List(triskellInternal2S))
//        project.getModel.setRepositories(project.getModel.getRepositories++List(triskellNexus))
    

        /* INIT PROJECT BUILD */
        var build = new Build()
        //build.setDirectory(projectDirectory.getAbsolutePath());
        build.setSourceDirectory(GlobalConfiguration.outputFolder);
        var res :java.util.List[Resource] = new java.util.ArrayList[Resource]()

        var re:Resource = new Resource();
        re.setDirectory(new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + ".."+ java.io.File.separator + "resources").getCanonicalPath)
        res.add(re)
        build.setResources(res)
        //build.setOutputDirectory("target");
        build.setModelEncoding("UTF8");

        /* INIT SCALA PLUGIN */
        var pluginScala = new Plugin();
        pluginScala.setGroupId("org.scala-tools");
        pluginScala.setArtifactId("maven-scala-plugin");
        pluginScala.setVersion("2.12");
        var pluginScalaExecution = new PluginExecution();
        // pluginScalaExecution.setPhase("process-resources");
        //pluginScalaExecution.addGoal("add-source");
        pluginScalaExecution.addGoal("compile");
        //pluginScalaExecution.addGoal("testCompile");
        pluginScala.addExecution(pluginScalaExecution);
        /* CONFIGURATION */
        var pluginScalaConfiguration = new Xpp3Dom("configuration");

        var pluginScalaConfigurationLaunchers = new Xpp3Dom("launchers");
        var pluginScalaConfigurationLauncher = new Xpp3Dom("launcher");
        var pluginScalaConfigurationId = new Xpp3Dom("id");
        pluginScalaConfigurationId.setValue("runner.MainRunner");
        var pluginScalaConfigurationMain = new Xpp3Dom("mainClass");
        pluginScalaConfigurationMain.setValue(GlobalConfiguration.scalaAspectPrefix + "runner.MainRunner");
        pluginScalaConfigurationLauncher.addChild(pluginScalaConfigurationId);
        pluginScalaConfigurationLauncher.addChild(pluginScalaConfigurationMain);
        pluginScalaConfigurationLaunchers.addChild(pluginScalaConfigurationLauncher);
        pluginScalaConfiguration.addChild(pluginScalaConfigurationLaunchers);


        var pluginScalaConfigurationJVMArgs = new Xpp3Dom("jvmArgs");
        var pluginScalaConfigurationJVMArg = new Xpp3Dom("jvmArg");
        pluginScalaConfigurationJVMArg.setValue("-Xmx1024m");
        pluginScalaConfigurationJVMArgs.addChild(pluginScalaConfigurationJVMArg);
        pluginScalaConfiguration.addChild(pluginScalaConfigurationJVMArgs);
        pluginScala.setConfiguration(pluginScalaConfiguration);

        
        /* INIT java compile PLUGIN */
        /*
    
               <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-compiler-plugin</artifactId>
               <version>2.3.2</version>
               <configuration>
                   <source>1.6</source>
                   <target>1.6</target>
                   <encoding>${project.build.sourceEncoding}</encoding>
               </configuration>
           </plugin>
      <plugin>
         **/
        var pluginJava = new Plugin();
        pluginJava.setGroupId("org.apache.maven.plugins");
        pluginJava.setArtifactId("maven-compiler-plugin");
        pluginJava.setVersion("2.3.2")
        var pluginJavaConfiguration = new Xpp3Dom("configuration");
        var pluginJavaSource = new Xpp3Dom("source");
        pluginJavaSource.setValue("1.6")
                                  
        var pluginJavaTarget = new Xpp3Dom("target");
        pluginJavaTarget.setValue("1.6")
        pluginJavaConfiguration.addChild(pluginJavaSource)
        pluginJavaConfiguration.addChild(pluginJavaTarget)
        pluginJava.setConfiguration(pluginJavaConfiguration)
        
        
        
        
        
        /* INIT FELIX OSGI PLUGIN */
        var pluginFelix = new Plugin();
        pluginFelix.setGroupId("org.apache.felix");
        pluginFelix.setArtifactId("maven-bundle-plugin");
        pluginFelix.setExtensions(true);
        /* CONFIGURATION */
    
        var importPackage = ""
        var privatePackage = ""
        var exportPackage = ""
        if(standalone){
            importPackage = ""
            privatePackage = "*"
            exportPackage = "*"
        } else {
            importPackage = "*"
            privatePackage = ""
            exportPackage = "*"
        }

        var pluginFelixConfiguration = new Xpp3Dom("configuration");
        var pluginFelixInstruction = new Xpp3Dom("instructions");
        var pluginFelixInstructionPrivatePackage = new Xpp3Dom("Private-Package");
        pluginFelixInstructionPrivatePackage.setValue(privatePackage);
        var pluginFelixInstructionImportPackage = new Xpp3Dom("Import-Package");
        pluginFelixInstructionImportPackage.setValue(importPackage);
        var pluginFelixInstructionExportPackage = new Xpp3Dom("Export-Package");
        pluginFelixInstructionExportPackage.setValue(exportPackage);
        var pluginFelixInstructionBundleClassPath = new Xpp3Dom("BundleClassPath");
        pluginFelixInstructionBundleClassPath.setValue(".");
        //pluginFelixInstruction.addChild(pluginFelixInstructionPrivatePackage);
        if(!standalone)
            pluginFelixInstruction.addChild(pluginFelixInstructionImportPackage);
        else
            pluginFelixInstruction.addChild(pluginFelixInstructionPrivatePackage);

        //pluginFelixInstruction.addChild(pluginFelixInstructionExportPackage);
        pluginFelixInstruction.addChild(pluginFelixInstructionBundleClassPath);
        pluginFelixConfiguration.addChild(pluginFelixInstruction);
        pluginFelix.setConfiguration(pluginFelixConfiguration);

        /* INIT MavenDependencies PLUGIN */
        var mavendeps = new Plugin();
        mavendeps.setArtifactId("maven-dependency-plugin");
        var mavendepsExecution = new PluginExecution();
        mavendeps.addExecution(mavendepsExecution)
        mavendepsExecution.setPhase("install")
        mavendepsExecution.addGoal("copy-dependencies")
        var conf  = new Xpp3Dom("configuration");
        mavendepsExecution.setConfiguration(conf)
//        var includeGroupIds  = new Xpp3Dom("includeGroupIds");
//        conf.addChild(includeGroupIds)
 //       includeGroupIds.setValue("org.kermeta.art2,org.kermeta.emf,org.ops4j.pax.url,org.apache.felix,com.weiglewilczek.scala-lang-osgi,ch.qos.logback,org.slf4j")
//        var excludeArtifactIds  = new Xpp3Dom("excludeArtifactIds");
//        conf.addChild(excludeArtifactIds)
//        excludeArtifactIds.setValue("art2.annotation");
        var outputDirectory  = new Xpp3Dom("outputDirectory");
        conf.addChild(outputDirectory)
        outputDirectory.setValue("${project.build.directory}/K2dependencies");
    

        /* INIT TRUEZIP PLUGIN */


        
        var pluginTruezip = new Plugin();
        pluginTruezip.setGroupId("org.codehaus.mojo");
        pluginTruezip.setArtifactId("truezip-maven-plugin");
        pluginTruezip.setVersion("1.0-beta-4")
        var pluginTrueZipExecution = new PluginExecution();
        pluginTrueZipExecution.setId("remove-a-file")
        pluginTrueZipExecution.addGoal("remove");
        pluginTrueZipExecution.setPhase("package")

        //pluginTruezip.setExtensions(true);
        var configuration  = new Xpp3Dom("configuration");
        pluginTrueZipExecution.setConfiguration(configuration)
        var fileset  = new Xpp3Dom("fileset");
        configuration.addChild(fileset)
        var directory  = new Xpp3Dom("directory");
        fileset.addChild(directory)
        directory.setValue("target/${project.artifactId}-${project.version}.jar/META-INF");

        var includes  = new Xpp3Dom("includes");
        fileset.addChild(includes)
        var include0 = new Xpp3Dom("include");
        include0.setValue("**/*.RSA");

        var include1 = new Xpp3Dom("include");
        include1.setValue("**/*.SF")
        includes.addChild(include0)
        includes.addChild(include1)


        pluginTruezip.addExecution(pluginTrueZipExecution)
        build.addPlugin(pluginScala)
        build.addPlugin(pluginJava)
        
        build.addPlugin(pluginFelix)
        build.addPlugin(mavendeps)

        build.addPlugin(pluginTruezip)

        /* INIT FIXED DEPENDENCY */
        var dependencies = new scala.collection.mutable.ArrayBuffer[Dependency]
    

        dependencies.add(this.createDependency("org.scala-lang", "scala-library", "2.9.0-1"))
        dependencies.add(createDependency("org.kermeta", "kermeta.model", "1.3.0"));
        dependencies.add(createDependency("org.kermeta.emf", "emf.lib", "2.6.0"));
        dependencies.add(createDependency("org.kermeta.language", "language.framework.scala", "0.12.10"));
        /* INIT LOCAL VARIABLE DEPENDENCY */

        var i = 0
        if (additionalClasspath!= null){
            additionalClasspath.foreach{cp =>
                dependencies.add(createLocalDependency("local" +i, "local", "1.0.0", cp))
                i= i+1
            }
        }
    
    
        //dependencies.add(creaxteDependency("org.kermeta.art2", "art2.model", "1.1.0-SNAPSHOT"));



        project.setDependencies(dependencies)
        project.setBuild(build)
        return project  }

}
