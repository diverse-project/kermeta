///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package org.kermeta.art2.framework.aspects
//
//import org.kermeta.art2._
//import scala.collection.JavaConversions._
//import Art2Aspects._
//
//case class BindingAspect(b : Binding) {
//
//  def isModelEquals(ct : Binding) : Boolean = {
//    b.getPorts.forall({p=>
//        ct.getPorts.exists({p2 => p2.isModelEquals(p) })
//    })
//  }
//
//  def isUsingPort(p : Port) : Boolean = { b.getPorts.exists({bp=>bp==p  }) }
//
//  def opositePort(p : Port) : Option[Port] = {
//    if(isUsingPort(p)){
//      b.getPorts.find(op=> !(op == p) )
//    } else {
//      None
//    }
//  }
//
//
//}