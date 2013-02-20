package org.kermeta.language.loader.kmt.scala.internal.parser.sub
import org.kermeta.language.structure.Type
import org.kermeta.language.structure.TypeVariable
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.ObjectTypeVariable
import org.kermeta.language.structure.ModelTypeVariable

trait KTypeVariableParser extends KAbstractParser {
  def typeVariables = typeVariablesWithChevrons | typeVariablesWithBrackets
  private def typeVariablesWithChevrons = "<" ~ rep1sep(typeVarDef, ",") ~ ">" ^^ { case _ ~ params ~ _ => params }
  private def typeVariablesWithBrackets = "[" ~ rep1sep(typeVarDef, ",") ~ "]" ^^ { case _ ~ params ~ _ => params }

  private def objectTypeVariable = ":" ~ genericQualifiedType ^^ {
    case _ ~ supertype => {
      var ovar : ObjectTypeVariable = StructureFactory.eINSTANCE.createObjectTypeVariable
      ovar.setSupertype(supertype)
      ovar.getContainedType().add(supertype)
      ovar
    }
  }
  
  private def modelTypeVariable = "^:" ~ genericQualifiedType ^^ {
    case _ ~ supertype => {
      var mtvar : ModelTypeVariable = StructureFactory.eINSTANCE.createModelTypeVariable
      mtvar.setSupertype(supertype)
      mtvar.getContainedType().add(supertype)
      mtvar
    }
  }
  
  private def typeVarDef = ident ~ opt((objectTypeVariable|modelTypeVariable)) ^^ {
    case id ~ genType => {
      var newtv : TypeVariable = null
      genType match {
        case Some(g) => {
          newtv = g
        }
        case None => {
          newtv = StructureFactory.eINSTANCE.createObjectTypeVariable
        }
      }
      newtv.setName(id)
      newtv
    }
  }
}