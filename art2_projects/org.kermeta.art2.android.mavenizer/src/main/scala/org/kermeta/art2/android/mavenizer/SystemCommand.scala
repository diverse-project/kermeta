/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.android.mavenizer

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.lang.ProcessBuilder
import scala.collection.JavaConversions._

object SystemCommand {

  var executionPath : String = ""

  def exec(args : List[String])={

    try{
      println(args.mkString(" "))

      val processBuilder = new ProcessBuilder(args)
      processBuilder.directory(new File(executionPath))
      processBuilder.redirectErrorStream(true)
      val process = processBuilder.start()

      var r1 = new BufferedReader(new InputStreamReader(process.getInputStream()));
      var x : String = ""
      x = r1.readLine
      while (x != null) {
        println(x);
        x = r1.readLine
      }
      r1.close

      process.waitFor()

    } catch {
      case _ @ e => e.printStackTrace
    }

    /*
     println("Process cmd ="+cmd)

     var p = Runtime.getRuntime.exec(cmd)
     var r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
     var x : String = ""
     while ((x = r1.readLine()) != null) {
     println(x);
     }
     r1.close
     p.waitFor*/
  }

}
