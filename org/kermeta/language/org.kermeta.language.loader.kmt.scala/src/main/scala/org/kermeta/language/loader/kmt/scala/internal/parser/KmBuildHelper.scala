/* $Id: KExpressionParser.scala 13377 2010-11-09 10:47:22Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.TypeContainer
import org.kermeta.language.structure.UnresolvedType
import org.kermeta.language.structure.Type
import scala.collection.JavaConversions._

/**
 * Helper operation for building Km model element
 */
object KmBuildHelper {

  /**
   * retreive existing or create an UnresolvedType
   */
  def getOrCreateUnresolvedType(typeContainer : TypeContainer, typeIdentifier : String) : UnresolvedType = {

    var newUnresolvedType : UnresolvedType = null
    // find existing

    typeContainer.getContainedType.filter(p=> p.isInstanceOf[UnresolvedType]).foreach{ut =>
      var containedType = ut.asInstanceOf[UnresolvedType]
      containedType.getTypeIdentifier match {
        case typeIdentifier => newUnresolvedType = containedType
      }
    }

    // create new
    if(newUnresolvedType == null){
      newUnresolvedType =StructureFactory.eINSTANCE.createUnresolvedType
      newUnresolvedType.setTypeIdentifier(typeIdentifier)
      typeContainer.getContainedType.add(newUnresolvedType)
    }
    // return the UnresolvedType
    newUnresolvedType
  }

  /* *
   * retreive existing equivalent UnresolveType in the TypeContainer or return the one that is passed as parameter
   * if a normal (not unresolved) is passed, simply return it
   */
  def selectType(typeContainer : TypeContainer, searchedType : org.kermeta.language.structure.Type) : org.kermeta.language.structure.Type = {

    
    var returnedType : Type = searchedType

    // find existing
    searchedType match {
      case searchedUnresolvedType : UnresolvedType => {
          typeContainer.getContainedType.filter(p=> p.isInstanceOf[UnresolvedType]).foreach{ut =>
            var containedType = ut.asInstanceOf[UnresolvedType]
            if(unresolvedTypeMatch(containedType,searchedUnresolvedType )){
              // we have a match, return that one instead of the one passed as parameter
              returnedType = containedType
            }
          }
        }
    }
   
    // return the UnresolvedType
    returnedType
  }

  /**
   * indicates if a UnResolvedType is similar to another one
   * (recursively drill into the UnresolvedType in Generic for the check)
   */
  def unresolvedTypeMatch( aUnresolvedType : UnresolvedType, bUnresolvedType : UnresolvedType) : Boolean = {
    aUnresolvedType.getTypeIdentifier.equals(bUnresolvedType.getTypeIdentifier) &&
    aUnresolvedType.getGenerics.corresponds(bUnresolvedType.getGenerics){(aSubType, bSubType) =>
      unresolvedTypeMatch(aSubType.asInstanceOf[UnresolvedType], bSubType.asInstanceOf[UnresolvedType])}
  }
}
