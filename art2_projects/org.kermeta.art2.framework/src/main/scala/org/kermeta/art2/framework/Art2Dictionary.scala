/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

class Art2Dictionary {

  private var map =  new java.util.HashMap[String,AnyRef]

  def get(key:String) = map.get(key)

  def set(key:String,o:AnyRef) = map.put(key, o)

  def switchKey(previousKey:String,newKey:String) = {
    if(map.containsKey(previousKey) && !map.containsKey(newKey)  ){
      map.put(newKey, map.get(previousKey))
      map.remove(previousKey)
    } else {
      println("WTF 8! :-)")
    }
  }

}
