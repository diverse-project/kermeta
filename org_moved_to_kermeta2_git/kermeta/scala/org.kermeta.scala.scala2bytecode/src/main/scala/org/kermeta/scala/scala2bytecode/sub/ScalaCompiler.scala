/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.scala2bytecode.sub

import scala.collection.JavaConversions._

class ScalaCompiler {

  def compile(src:String,target:String,classpath :java.util.List[String])={

      var javaClasspath = EmbeddedScalaCompiler.getActualClasspath

    javaClasspath = classpath.toList ++ javaClasspath



      //  java.util.List<String> useClassPath = new java.util.ArrayList<String>();
      //  useClassPath.addAll(classpath);
       // useClassPath.addAll(javaClasspath);


      //  if (additionalClassPath != null)
       //   classpath = additionalClassPath ++ classpath
        //  classpath = classpath ++ List("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo/target/kermeta.compilo.scala-0.0.1-SNAPSHOT.jar")

        var compilationResult = EmbeddedScalaCompiler.compile(src, target,true,javaClasspath,false);

  }

}
