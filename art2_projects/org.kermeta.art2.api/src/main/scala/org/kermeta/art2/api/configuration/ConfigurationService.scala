/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.api.configuration

trait ConfigurationService {

  def getProperty(contant : ConfigConstants.ConfigConstant) : String

}
