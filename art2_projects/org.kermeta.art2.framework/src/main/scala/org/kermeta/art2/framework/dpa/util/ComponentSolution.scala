/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.dpa.util

import org.kermeta.art2.ComponentInstance

case class ComponentSolution(roleName : String, component : ComponentInstance, portSolutions : List[PortSolution])
