///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package org.kermeta.art2.ui.editor.command
//
//import java.net.NetworkInterface
//import scala.collection.immutable.HashMap
//import javax.jmdns.JmDNS
//import org.kermeta.art2.framework.Constants
//import scala.collection.JavaConversions._
//
//object IPCache {
//
//  var cache : HashMap[String,Set[Tuple2[String,Int]]] = HashMap[String,Set[Tuple2[String,Int]]]()
//  def getNode(nodeName : String) : Option[Set[Tuple2[String,Int]]] = {
//    cache.get(nodeName) match {
//      case None => {
//          println("try update node => "+nodeName)
//          updateNode(nodeName)
//          cache.get(nodeName)
//        }
//      case Some(l)=>Some(l)
//    }
//  }
//
//  private def updateNode(destNodeName : String) = synchronized {
//    var netLink : Set[Tuple2[String,Int]] = Set()
//    //BUILD ACTUAL IP CACHE
//    NetworkInterface.getNetworkInterfaces.foreach{it =>
//      if( (!it.isLoopback) && it.isUp){
//        it.getInetAddresses.foreach{addr =>
//          var jmdnsIT = JmDNS.create(addr,"temp"+it.getName)
//          var infos = jmdnsIT.list(Constants.ART2_SERVICE,500)
//          infos.foreach{info =>
//            var nodeName = info.getPropertyString(Constants.ART2_NODE_NAME)
//            if(nodeName == destNodeName){
//              var ip = info.getHostAddress
//              var modelPort = info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT)
//              try {
//                var tuple : Tuple2[String,Int] = (ip,Integer.parseInt(modelPort))
//                netLink = netLink ++ List(tuple)
//              } catch {
//                case _ @ e => println("Bad port number =>"+modelPort)
//              }
//            }
//          }
//          jmdnsIT.close
//        }
//      }
//    }
//    //UPDATE CACHE
//    var c = cache + ((destNodeName,netLink))
//    cache = c
//  }
//
//}
