/* $Id: KQualifiedNameParser.scala 11792 2010-07-19 09:51:09Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse qualified name in KMT textual syntax  
 */
trait KQualifiedNameParser extends KAbstractParser {

  def packageName : Parser[String] = ident ~ metamodelQualifiedName ^^ { case id ~ q => id+q  }
  
  def metamodelQualifiedName : Parser[String] = opt("#" ~> ident) ~ packageQualifiedName ^^ { case id ~ q =>
    id match {
      case Some(ident) => "#"+ident+q
      case None => q
    }
  }
  
  def packageQualifiedName : Parser[String] =  (( "::" ~ ident )*) ^^ { case lId =>
      (for(idp <- lId) yield idp match {case _ ~ ident => "::"+ident.toString}).mkString
  }


}