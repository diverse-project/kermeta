/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.merger

import org.kermeta.art2.ContainerRoot
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

object Art2PlatformMerger extends Art2Merger {

  var logger = LoggerFactory.getLogger(this.getClass)

  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {

    var listNN = List() ++ modelToMerge.getNodeNetworks.toList
    listNN.foreach{nn=>
      //MERGE NODE NETWORK
      actualModel.getNodeNetworks.find(ann=> ann.getInitBy.getName == nn.getInitBy.getName && ann.getTarget.getName == nn.getTarget.getName  ) match {
        case None => actualModel.getNodeNetworks.add(nn)
        case Some(nnfound) => {

            var listNL = nn.getLink ++ List()
            listNL.foreach{nl=>
              nnfound.getLink.find(anl=> anl.getNetworkType == nl.getNetworkType && anl.getEstimatedRate == nl.getEstimatedRate  ) match {
                case None => nnfound.getLink.add(nl)
                case Some(nlfound)=> {
                    var NLP = nl.getNetworkProperties ++ List()
                    NLP.foreach{np=>
                      nlfound.getNetworkProperties.find(lnp=> lnp.getName == np.getName) match {
                        case None => nl.getNetworkProperties.add(np)
                        case Some(fnp) => {
                            //OVERRIDE
                            try{
                              var foundLastCheck = java.lang.Long.parseLong(fnp.getLastCheck)
                              var toMergeLastCheck = java.lang.Long.parseLong(np.getLastCheck)
                              if(toMergeLastCheck > foundLastCheck){
                                fnp.setValue(np.getValue)
                              }
                            } catch {
                              case _ @ e => logger.error("Error processing last check on model node link property",e)
                            }

                        }
                      }
                    }
                  }
              }
            }
          }
      }
    }
  }
}
