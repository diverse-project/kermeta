/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.android.mavenizer

object JarUploader {

  def upload(adb : String,jar : String,remotePath : String) = {
    SystemCommand.exec(List(adb,"push",jar,remotePath))
  }

}
