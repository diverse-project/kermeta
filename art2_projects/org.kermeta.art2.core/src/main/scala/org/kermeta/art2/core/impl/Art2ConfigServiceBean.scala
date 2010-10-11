/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.core.impl

import org.kermeta.art2.api.configuration.ConfigurationService
import java.io.File
import net.lag.configgy.Configgy
import org.kermeta.art2.api.configuration.ConfigConstants.ConfigConstant
import org.kermeta.art2.api.configuration.ConfigConstants
import org.slf4j.LoggerFactory

class Art2ConfigServiceBean extends ConfigurationService {

  var logger = LoggerFactory.getLogger(this.getClass);

  if(System.getProperty(ConfigConstants.ART2_CONFIG.getValue)!= null){
    var configF = new File(System.getProperty(ConfigConstants.ART2_CONFIG.getValue))
    if(configF.exists){
      logger.info("Configure Art2 Core with config file =>"+configF)
      Configgy.configure(configF.getAbsolutePath)
    }
  }

  def getProperty(constant : ConfigConstant)={
    if(System.getProperty(constant.getValue) != null){
      System.getProperty(constant.getValue)
    } else {
      Configgy.config.getString(constant.getValue) match {
        case Some(v) => v
        case None => constant.getDefaultValue
      }
    }
  }

}
