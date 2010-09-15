/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.merger

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.PortType
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.TypedElement
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.{ComponentType => art2CT}
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.TypeLibrary
import scala.collection.JavaConversions._

object Art2TypeLibraryMerger extends Art2Merger {

  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    var ctLib : List[TypeLibrary] = List()++modelToMerge.getLibraries.toList
    ctLib.foreach{libtomerge=>
      actualModel.getLibraries.find({elib=> elib.getName.equals(libtomerge.getName) }) match {
        case Some(elib) => {
            libtomerge.getSubTypes.filter{st=> st.isInstanceOf[art2CT]}.foreach{libCTtomerge=>
              elib.getSubTypes.filter{st=> st.isInstanceOf[art2CT]}.find({esublib=>esublib.getName.equals(libCTtomerge.getName)}) match {
                case Some(subct)=> //TODO CHECK CONSISTENCY
                case None => elib.getSubTypes.add(libCTtomerge)
              }
            }
          }
        case None => actualModel.getLibraries.add(libtomerge)
      }
    }

  }

}
