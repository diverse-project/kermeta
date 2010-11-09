/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.sub

import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.TypeLibrary
import org.kermeta.art2.merger.Art2Merger
import scala.collection.JavaConversions._

trait Art2TypeLibraryMerger extends Art2Merger {

  def mergeLibrary(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    var ctLib : List[TypeLibrary] = List()++modelToMerge.getLibraries.toList
    ctLib.foreach{libtomerge=>
      actualModel.getLibraries.find({elib=> elib.getName.equals(libtomerge.getName) }) match {
        case Some(elib) => {
            libtomerge.getSubTypes.filter{st=> st.isInstanceOf[ComponentType]}.foreach{libCTtomerge=>
              elib.getSubTypes.filter{st=> st.isInstanceOf[ComponentType]}.find({esublib=>esublib.getName.equals(libCTtomerge.getName)}) match {
                case Some(subct)=> //CHECK CONSISTENCY DONE BY PREVIOUS STEP
                case None => elib.getSubTypes.add(libCTtomerge)
              }
            }
          }
        case None => actualModel.getLibraries.add(libtomerge)
      }
    }

  }

}
