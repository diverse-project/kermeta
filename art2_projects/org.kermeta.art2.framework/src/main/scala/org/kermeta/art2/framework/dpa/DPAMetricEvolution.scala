/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.dpa

import org.kermeta.art2.Metric
import scala.reflect.BeanProperty

trait DPAMetricEvolution {

  @BeanProperty
  var metric : Metric

  @BeanProperty
  var newval : String

}
