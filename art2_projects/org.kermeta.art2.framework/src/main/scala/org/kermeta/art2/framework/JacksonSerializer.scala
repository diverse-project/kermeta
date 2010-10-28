/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

//implicit def objTOJSON(o : Any) : String = {

//}

import java.io.StringWriter
import org.codehaus.jackson.map.ObjectMapper
import org.codehaus.jackson.map.SerializationConfig
import scala.runtime.BoxedUnit


case class RichJSONObject(obj : Any) {
  def toJSON : String = {
  //  println("toMap=>"+obj)
    if(obj.isInstanceOf[Unit] || obj.isInstanceOf[BoxedUnit] ){
      return "<void>"
    }
    JacksonSerializer.mapper.writeValueAsString(obj)
  }
}

case class RichString(s : String) {
  def fromJSON[A](c : Class[A]) : A = {

    s match {
      case "<void>" => return null.asInstanceOf[A]
      case _ => JacksonSerializer.mapper.readValue(s, c).asInstanceOf[A]
    }

    
  }
}


object JacksonSerializer {
  var mapper = new ObjectMapper();
  //mapper.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, true)
  implicit def convToJSON(obj : Any) = RichJSONObject(obj)
  implicit def convFromJSON(c : String) = RichString(c)
}

