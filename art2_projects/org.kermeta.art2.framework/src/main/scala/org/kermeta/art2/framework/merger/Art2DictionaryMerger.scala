/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.merger

import org.kermeta.art2.Dictionary
import org.kermeta.art2.DictionaryType
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait Art2DictionaryMerger {

  def mergeDictionary(dictionary : Dictionary,newtype : DictionaryType) : Unit = {
    if(dictionary != null){
      var values = dictionary.getValues ++ List()
      values.foreach{v=>

        var newAttribute = newtype.getAttributes.find(att=> att.getName == v.getAttribute.getName)
        newAttribute match {
          case None => {
              println("ART2 Merger remove unavailable Dictionary Value => "+v.getValue +" for old key => "+v.getAttribute.getName)
              dictionary.getValues.remove(v)
            } //REMOVE DICTIONARY INSTANCE , NO AVAILABLE IN NEW TYPE
          case Some(found)=> v.setAttribute(found) //TODO CHECK TYPE // ACTUALLY ONLY STRING
        }

      }
    }
  }

}
