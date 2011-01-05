/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.android.mavenizer

object JarMavenizer {

  def mavenize(jarPath : String,groupId:String,deploymentUrl:String,deployId:String) = {

    var jarAnalyser = new JarAnalyzer(jarPath.substring(jarPath.lastIndexOf("/")+1))
    var command = List("mvn","deploy:deploy-file")
    command= command ++ List("-Dfile=" + jarPath);
    command= command ++ List("-DgroupId=" + groupId);
    command= command ++ List("-DartifactId=" + jarAnalyser.getArtifactId());
    command= command ++ List("-Dversion=" + jarAnalyser.getVersion());
    //command= command ++ List("-DrepositoryId=" + deployId);
    command= command ++ List("-Dpackaging=jar");
    command= command ++ List("-DgeneratePom=true");
    command= command ++ List("-Durl="+deploymentUrl);

    SystemCommand.exec(command)



  }

}
