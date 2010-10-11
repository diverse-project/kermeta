/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

//implicit def objTOJSON(o : Any) : String = {

//}

import java.io.StringWriter
import org.codehaus.jackson.map.ObjectMapper
import scala.runtime.BoxedUnit


case class RichJSONObject(obj : Any) {
  def toJSON : String = {

    if(obj.isInstanceOf[Unit] || obj.isInstanceOf[BoxedUnit]){
      return "<void>"
    }

    var out = new StringWriter
    JacksonSerializer.mapper.writeValue(out,obj)
    out.toString
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
  implicit def convToJSON(obj : Any) = RichJSONObject(obj)
  implicit def convFromJSON(c : String) = RichString(c)
}

