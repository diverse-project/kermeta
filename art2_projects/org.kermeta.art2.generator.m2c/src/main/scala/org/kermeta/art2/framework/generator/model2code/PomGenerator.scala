/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.model2code

import java.io.File
import java.io.FileWriter
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import scala.collection.JavaConversions._

trait PomGenerator {

  def generatePom(root:ContainerRoot, location:String, du:DeployUnit) = {
    var f = new File(location + "/pom.xml")
    if(!f.exists) {
      f.createNewFile
    }

    var writer = new FileWriter(f)

    writer.append(generateProject(du))
    writer.flush
    writer.close
  }

  private def generateProject(du:DeployUnit) = {
    var buffer = new StringBuffer
    
    buffer.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" " 
                  + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
                  + "xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 "
                  + "http://maven.apache.org/maven-v4_0_0.xsd\">\n")
    buffer.append("\n")
    buffer.append(generateMainInfo(du))
    buffer.append("\n")
    buffer.append(generateParent)
    buffer.append("\n")
    buffer.append(generateDependencies)
    buffer.append("\n")
    buffer.append(generateBuild)
    buffer.append("\n")
    buffer.append("</project>")
    
    buffer.toString
  }

  private def generateMainInfo(du:DeployUnit) = {
    var buffer = new StringBuffer

    buffer.append("    <modelVersion>4.0.0</modelVersion>\n")
    buffer.append("    <name>"+ {if(du.getName==null){du.getGroupName + "_" + du.getUnitName}else{du.getName}} + "</name>\n")
    buffer.append("    <groupId>"+du.getGroupName+"</groupId>\n")
    buffer.append("    <artifactId>"+du.getUnitName+"</artifactId>\n")
    buffer.append("    <version>"+du.getVersion+"</version>\n")

    buffer.toString
  }

  private def generateParent = {
    var buffer = new StringBuffer

    buffer.append("    <parent>\n")
    buffer.append("        <groupId>org.kermeta.art2</groupId>\n")
    buffer.append("        <artifactId>art2.artcomponent.root</artifactId>\n")
    buffer.append("        <version>2.2.1-SNAPSHOT</version>\n")
    buffer.append("    </parent>\n")

    buffer.toString
  }

  private def generateDependencies ={
    var buffer = new StringBuffer

    buffer.toString
  }

  private def generateBuild = {
    var buffer = new StringBuffer

    buffer.toString
  }


}
