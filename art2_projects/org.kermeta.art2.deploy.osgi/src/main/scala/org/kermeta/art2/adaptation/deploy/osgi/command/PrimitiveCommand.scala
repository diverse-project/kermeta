/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

trait PrimitiveCommand {

  def execute() : Boolean

  def undo(): Unit

  var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None

  def getLastExecutionBundle = lastExecutionBundle

  var mustBeStarted = false

}
