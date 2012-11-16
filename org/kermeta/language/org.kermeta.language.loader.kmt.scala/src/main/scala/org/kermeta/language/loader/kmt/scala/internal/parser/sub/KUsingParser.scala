/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Using

trait KUsingParser extends KAbstractParser {

    /* PROCESS USING  */
  def usingStmt : Parser[Using] = "using" ~ usingTupleStatment ^^ { case _ ~ utuple =>
      var newo =StructureFactory.eINSTANCE.createUsing
      newo.setFromQName(  utuple._1)
      newo.setToName(  utuple._2)
      newo
  }
  def usingTupleStatment :  Parser[Tuple2[String,String]] =
    usingWildCardRenameStatment | usingDefinitionRenameStatment | usingSingleStatment

  def usingSingleStatment :  Parser[Tuple2[String,String]] =   simplifiedUsingRenameStatment | simpleUsingWildcardStatment

  // ensures that if we have wildcard, then it must be on both side
  def usingWildCardRenameStatment : Parser[Tuple2[String,String]] =
      opt(mmIdent) ~ ident ~ rep(usingIdent) ~ usingWildcard ~ "=>" ~ ident ~ rep(usingIdent) ~ usingWildcard ^^
      { case fromMM  ~ fromId ~ fromIds ~ fromWild ~ _ ~  toId ~ toIds ~ toWild =>
          // rebuild the tuple
          var resTuple : Tuple2[String,String] = (fromId,toId)
          fromIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          toIds.foreach{nid =>
            resTuple = (resTuple._1,resTuple._2+"::"+nid)
          }
          resTuple = (resTuple._1+"::*",resTuple._2+"::*")
          fromMM match {
            case None =>  
            case Some(mmName)=> resTuple = (mmName+"#"+resTuple._1,resTuple._2)
          }
          resTuple
      }
  // normal definition rename
  def usingDefinitionRenameStatment : Parser[Tuple2[String,String]] =
             opt(mmIdent) ~ ident  ~ rep(usingIdent)  ~ "=>" ~   ident ~ rep(usingIdent)  ^^
      { case fromMM ~ fromId ~ fromIds ~ _ ~ toId ~ toIds  =>
          var resTuple : Tuple2[String,String] = (fromId,toId)
          fromIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          toIds.foreach{nid =>
            resTuple = (resTuple._1,resTuple._2+"::"+nid)
          }
          fromMM match {
            case None =>  
            case Some(mmName)=> resTuple = (mmName+"#"+resTuple._1,resTuple._2)
          }
          resTuple
      }
  def simpleUsingWildcardStatment : Parser[Tuple2[String,String]] =
      opt(mmIdent) ~ ident ~ rep(usingIdent) ~ opt(usingWildcard) ^^ { case  fromMM ~ id ~ ids ~ wild  =>
          var resTuple : Tuple2[String,String] = (id,"")
          var lastNid = id
          ids.foreach{nid =>
            lastNid = nid
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          wild match {
            case None =>  resTuple = (resTuple._1,lastNid)
            case Some(w)=> resTuple = (resTuple._1+"::"+w,resTuple._2)
          }
          fromMM match {
            case None =>  
            case Some(mmName)=> resTuple = (mmName+"#"+resTuple._1,resTuple._2)
          }
          resTuple
      }

  def simplifiedUsingRenameStatment : Parser[Tuple2[String,String]] =
      opt(mmIdent) ~ ident ~ rep(usingIdent) ~ "::" ~ "{"  ~ ident ~ rep(usingIdent) ~ "}" ^^ { case  fromMM ~ startId ~ startIds  ~ _ ~ _ ~ endId ~ endIds ~ _  =>
          var resTuple : Tuple2[String,String] = (startId, endId)
          startIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid, resTuple._2)
          }
          resTuple = (resTuple._1+"::"+endId, resTuple._2)
          endIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid, resTuple._2+"::"+nid)
          }
          fromMM match {
            case None =>  
            case Some(mmName)=> resTuple = (mmName+"#"+resTuple._1,resTuple._2)
          }
          resTuple
      }

  def usingIdent : Parser[String] = "::" ~> ident
  def usingWildcard : Parser[String] = "::" ~> "*"
  def mmIdent  : Parser[String] = opt(ident) ~ "#" ^^ { case mmName ~ _ =>
     mmName match {
       case None => ""
       case Some(name) => name
     }
  }

  /*  END PROCESS USING */

}
