/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.ClassDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.annotation.Constants
import scala.collection.JavaConversions._

trait TypeDefinitionVisitor {

  def processType(typeModel : TypeDefinition,classdef : ClassDeclaration,env : AnnotationProcessorEnvironment,root : ContainerRoot)= {

    /* CHECK THIRDPARTIES */
    if(classdef.getAnnotation(classOf[org.kermeta.art2.annotation.DictionaryType]) != null){
      classdef.getAnnotation(classOf[org.kermeta.art2.annotation.DictionaryType]).value.foreach{dictionaryAtt=>

        //CASE NO DICTIONARY
        if(typeModel.getDictionaryType == null){
          var newdictionary = Art2Factory.eINSTANCE.createDictionaryType
          typeModel.setDictionaryType(newdictionary)
        }

        //CASE NO ATT ALREADY CREATED WITH NAME
        var processDictionaryAtt = typeModel.getDictionaryType.getAttributes.find(eAtt=> eAtt.getName == dictionaryAtt.name ) match {
          case None => {
              var newAtt = Art2Factory.eINSTANCE.createDictionaryAttribute
              newAtt.setName(dictionaryAtt.name)
              typeModel.getDictionaryType.getAttributes.add(newAtt)
              newAtt
          }
          case Some(att)=> att
        }

        //INIT DEFAULT VALUE
        processDictionaryAtt.setOptional(dictionaryAtt.optional)

        //INIT DEF VALUE
        //TODO ALLOW MORE TYPE THAN STRING
        if(dictionaryAtt.defaultValue != Constants.getDefaultStringValue){
          typeModel.getDictionaryType.getDefaultValues.find(defV => defV.getAttribute == processDictionaryAtt) match {
            case None => {
                var newVal = Art2Factory.eINSTANCE.createDictionaryValue
                newVal.setAttribute(processDictionaryAtt)
                newVal.setValue(dictionaryAtt.defaultValue)
                typeModel.getDictionaryType.getDefaultValues.add(newVal)
            }
          case Some(edefV)=> edefV.setValue(dictionaryAtt.defaultValue.toString)
          }

        }

        processDictionaryAtt



      }
    }


  }




}
