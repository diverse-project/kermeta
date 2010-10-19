/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.declaration.TypeDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.annotation.Constants
import scala.collection.JavaConversions._

trait DictionaryProcessor {

  def processDictionary(typeDef : TypeDefinition,classdef : TypeDeclaration)={

    /* CHECK DICTIONARY */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.DictionaryType]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.DictionaryType]).value.foreach{dictionaryAtt=>

        //CASE NO DICTIONARY
        if(typeDef.getDictionaryType == null){
          var newdictionary = Art2Factory.eINSTANCE.createDictionaryType
          typeDef.setDictionaryType(newdictionary)
        }

        //CASE NO ATT ALREADY CREATED WITH NAME
        var processDictionaryAtt = typeDef.getDictionaryType.getAttributes.find(eAtt=> eAtt.getName == dictionaryAtt.name ) match {
          case None => {
              var newAtt = Art2Factory.eINSTANCE.createDictionaryAttribute
              newAtt.setName(dictionaryAtt.name)
              typeDef.getDictionaryType.getAttributes.add(newAtt)
              newAtt
          }
          case Some(att)=> att
        }

        //INIT DEFAULT VALUE
        processDictionaryAtt.setOptional(dictionaryAtt.optional)

        //INIT DEF VALUE
        //TODO ALLOW MORE TYPE THAN STRING
        if(dictionaryAtt.defaultValue != Constants.getDefaultStringValue){
          typeDef.getDictionaryType.getDefaultValues.find(defV => defV.getAttribute == processDictionaryAtt) match {
            case None => {
                var newVal = Art2Factory.eINSTANCE.createDictionaryValue
                newVal.setAttribute(processDictionaryAtt)
                newVal.setValue(dictionaryAtt.defaultValue)
                typeDef.getDictionaryType.getDefaultValues.add(newVal)
            }
          case Some(edefV)=> edefV.setValue(dictionaryAtt.defaultValue.toString)
          }

        }
        processDictionaryAtt
      }
    }
  }

}
