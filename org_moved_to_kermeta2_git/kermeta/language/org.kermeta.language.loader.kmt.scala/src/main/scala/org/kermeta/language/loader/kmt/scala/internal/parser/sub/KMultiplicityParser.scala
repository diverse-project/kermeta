/* $Id: ParserUtil.scala 11790 2010-07-19 09:21:17Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2011
 * Authors :
 * 		Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.loader.kmt.scala.internal.parser.KmBuildHelper
import org.kermeta.language.structure.MultiplicityElement
import org.kermeta.language.structure.Type


/**
 *  parser dedicated to create AbstractMultiplicityElement
 *  These elements can then be used to populate a concrete MultiplicityElement
 */
trait KMultiplicityParser  extends KAbstractParser with KGenericTypeParser {

  def collectionModifierKeyword = ("set" | "seq" | "oset" |"bag")

  def multiplicityType : Parser[AbstractMultiplicityElement] = opt(collectionModifierKeyword) ~ genericQualifiedType  ~ opt(attributeBounds) ^^ { case collectionModifier ~ qType ~ bounds  =>
    // init case class with default and qType
    var newo = AbstractMultiplicityElement(0,1,true,false,qType)

    collectionModifier match{
        case None =>       newo.isOrdered=true;   newo.isUnique=true
        case Some(cMod) => cMod match{
            case "set"  => newo.isOrdered=false;   newo.isUnique=true
            case "oset" => newo.isOrdered=true;    newo.isUnique=true
            case "seq"  => newo.isOrdered=true;    newo.isUnique=false
            case "bag"  => newo.isOrdered=false;   newo.isUnique=false
        }
    }
    bounds match {
        case None => newo.lower=0;        newo.upper=1
        case Some(bb)=> newo.lower=bb._1; newo.upper=bb._2
    }
    newo
  }

  /**
   * class dedicated to capture the abstract part of a MultiplicityElement
   */
  case class AbstractMultiplicityElement (var lower : Int,
                                     var upper: Int,
                                     var isUnique : Boolean,
                                     var isOrdered : Boolean,
                                     var mtype : Type){

    /**
     * Helper for copying data form this Abstract temp MultiplicityElement to the concrete MultiplicityElement passed as parameter
     */
    def copyToKElem(me : MultiplicityElement){
      val newqType = KmBuildHelper.selectType(me,mtype)
      me.getContainedType.add(newqType)
      me.setType(newqType)

      me.setIsOrdered(isOrdered)
      me.setIsUnique(isUnique)

      me.setLower(lower)
      me.setUpper(upper)
    }

  }
}

