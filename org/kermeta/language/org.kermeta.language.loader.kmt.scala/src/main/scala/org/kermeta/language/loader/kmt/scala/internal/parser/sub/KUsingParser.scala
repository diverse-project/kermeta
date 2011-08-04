/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Using

trait KUsingParser extends KAbstractParser {

    /* PROCESS USING  */
  def usingStmt : Parser[Using] = "using" ~ usingStatment ^^ { case _ ~ stmts =>
      //LocalUsing(id+"::"+q.prefixe,q.typeName)
      var newo =StructureFactory.eINSTANCE.createUsing
      newo.setFromQName(if(stmts._1 != "") { stmts._1 } else { stmts._2 }     )
      newo.setToName(stmts._2)
      newo
  }

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


  def usingIdent : Parser[String] = "::" ~> ident
  def usingWildcard : Parser[String] = "::" ~> "*"
  def usingRename : Parser[Tuple2[String,String]] = "::" ~ "{" ~ ident ~ "=>" ~ ident ~ "}" ^^{ case _ ~ old ~ _ ~ newname ~_ => Tuple2(old,newname) }

  /*  END PROCESS USING */

}
