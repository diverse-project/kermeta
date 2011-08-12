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
      ident ~ rep(usingIdent) ~ usingWildcard ~ "=>" ~ ident ~ rep(usingIdent) ~ usingWildcard ^^
      { case fromId ~ fromIds ~ fromWild ~ _ ~ toId ~ toIds ~ toWild =>
          // rebuild the tuple
          var resTuple : Tuple2[String,String] = (fromId,toId)
          fromIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          toIds.foreach{nid =>
            resTuple = (resTuple._1,resTuple._2+"::"+nid)
          }
          resTuple = (resTuple._1+"::*",resTuple._2+"::*")
          resTuple
      }
  // normal definition rename
  def usingDefinitionRenameStatment : Parser[Tuple2[String,String]] =
             ident  ~ rep(usingIdent)  ~ "=>" ~ ident ~ rep(usingIdent)  ^^
      { case fromId ~ fromIds ~ _ ~ toId ~ toIds  =>
          var resTuple : Tuple2[String,String] = (fromId,toId)
          fromIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          toIds.foreach{nid =>
            resTuple = (resTuple._1,resTuple._2+"::"+nid)
          }
          resTuple
      }
  def simpleUsingWildcardStatment : Parser[Tuple2[String,String]] =
      ident ~ rep(usingIdent) ~ opt(usingWildcard) ^^ { case  id ~ ids ~ wild  =>
          var resTuple : Tuple2[String,String] = (id,"")
          ids.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          wild match {
            case None =>
            case Some(w)=> resTuple = (resTuple._1+"::"+w,resTuple._2)
          }
          resTuple
      }

  def simplifiedUsingRenameStatment : Parser[Tuple2[String,String]] =
      ident ~ rep(usingIdent) ~ "::" ~ "{"  ~ ident ~ rep(usingIdent) ~ "}" ^^ { case  startId ~ startIds  ~ _ ~ _ ~ endId ~ endIds ~ _  =>
          var resTuple : Tuple2[String,String] = (startId,endId)
          startIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2)
          }
          endIds.foreach{nid =>
            resTuple = (resTuple._1+"::"+nid,resTuple._2+"::"+nid)
          }
          resTuple
      }
 /*def usingStmt : Parser[Using] = "using" ~ usingStatment ~ opt(usingToStatment)^^ { case _ ~ from ~ to =>
      //LocalUsing(id+"::"+q.prefixe,q.typeName)
      var newo =StructureFactory.eINSTANCE.createUsing
      newo.setFromQName(from )
      to match{
        case None =>
        case Some(toStatement) => newo.setToName(toStatement)
      }

      newo
  }

  def usingStatment : Parser[String] = ident ~ rep(usingIdent) ~ opt(usingWildcard) ^^ {  case id ~ ids ~ wild  =>
    var res : String = id
    ids.foreach{nid =>
        res = res+"::"+nid
      }
    wild match {
        case None =>
        case Some(w)=> res = res+"::*"
      }
    res
  }

  def usingToStatment : Parser[String] =  "=>" ~> usingStatment
  */
/*
  def usingStatment : Parser[Tuple2[String,String]] =
  (
    opt(usingQualifiedName) ~ usingRename ^^ { case optName ~ rename =>
    optName match {
      case None => rename
      case Some(qname) => (qname._1+"::"+qname._2+"::"+rename._1,rename._2)
    }
    }
  ) | ((usingQualifiedName ~ opt(usingWildcard)) ^^ { case qName ~ wildCard => (qName._1+"::"+qName._2,"*")   })


  def usingQualifiedName : Parser[Tuple2[String,String]] =  rep1sep(ident,"::") ^^ { case ids =>
        (ids.slice(0, ids.size-1).mkString("::"),ids.last)
    }
*/


   /*
  def usingStatment : Parser[Tuple2[String,String]] = ident ~ rep(usingIdent) ~ opt(usingWildcard) ~ opt(usingRename) ^^{ case id ~ ids ~ wild ~ rename =>
      var resTuple : Tuple2[String,String] = (id,id)
      ids.foreach{nid =>
        resTuple = (resTuple._1+"::"+nid,"")
      }
      wild match {
        case None =>
        case Some(w)=> resTuple = (resTuple._1+"::"+w,"")
      }
      rename match {
        case None =>
        case Some(r) => resTuple = (resTuple._1+"::"+r._1,r._2)
      }
      resTuple
  }

  */
  def usingIdent : Parser[String] = "::" ~> ident
  def usingWildcard : Parser[String] = "::" ~> "*"
  /*
  def usingRename : Parser[Tuple2[String,String]] = "::" ~ "{" ~ ident ~ "=>" ~ ident ~ "}" ^^{ case _ ~ old ~ _ ~ newname ~_ => Tuple2(old,newname) }
  */
  /*  END PROCESS USING */

}
