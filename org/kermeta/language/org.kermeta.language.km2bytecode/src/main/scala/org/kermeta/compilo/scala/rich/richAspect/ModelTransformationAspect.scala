package org.kermeta.compilo.scala.rich.richAspect
import org.kermeta.language.structure.ModelTransformation
import scala.collection.JavaConversions._
import org.kermeta.language.structure.Operation
import org.kermeta.language.structure.ModelTypeVariable
import org.kermeta.compilo.scala.Util
import org.kermeta.language.structure.ModelType

trait ModelTransformationAspect extends ObjectVisitor with ParameterAspect {

  def visitModelTransformation(mt: ModelTransformation, res: StringBuilder) {

  }

  def generateModelTransformationSignature(mt: ModelTransformation): String = {
    var res: StringBuilder = new StringBuilder()

    res.append("def ")
    res.append(mt.getName())

    generateParameterTransfo(mt, res)

    res.append(" : ")
    getListorType(mt, res)

    return res.toString()
  }

  def generateModelTransformation(mt: ModelTransformation): String = {
    var res: StringBuilder = new StringBuilder()
    res.append(generateModelTransformationSignature(mt))
    res.append(" = {\n")

    res.append("var `~result` : ")
    this.getListorType(mt, res)
    res.append(" = null.asInstanceOf[")
    this.getListorType(mt, res)
    res.append("]; \n  { \n")
    if (mt.getBody != null) {
      visit(mt.getBody(), res)
    }
    res append "        }\n"

    var res1 = new StringBuilder
    this.getListorType(mt, res1)
    if ("Unit".equals(res1.toString) || "_root_.k2.standard.Void".equals(res1.toString) || "_root_.scala.Unit".equals(res1.toString)) {
      res append " \n}\n"
    } else {
      res append " return `~result`\n}\n"
    }

    return res.toString()
  }

  def generateParameterTransfo(mt: ModelTransformation, res: StringBuilder) = {
    res.append("(")
    var first: Boolean = true
    mt.getOwnedParameter().foreach(p => {
      if (first) {
        first = false
      } else {
        res.append(", ")
      }
      res.append(p.getName())
      res.append(" : ")
      getListorType(p, res)
    })
    var i: Integer = 0
    mt.getTypeParameters.foreach(param => {
      if (first) {
        first = false
      } else {
        res.append(", ")
      }
      res.append(Util.getModelTypeFactoryParameterVariableName(param))
      res.append(" : ")
      res.append(Util.getModelTypeFactoryTypeName())
    })
    res.append(")")
  }

  def getListorType(thi: ModelTransformation, res: StringBuilder) = {
    var res1: StringBuilder = new StringBuilder

    if (thi.getUpper > 1 || thi.getUpper == -1) {
      if (thi.getIsOrdered != null && thi.getIsOrdered) {
        res.append("org.eclipse.emf.common.util.EList[")
      } else {
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }
      visit(thi.getType(), res1)
      res.append(res1.toString)
      res.append("]")
    } else {
      visit(thi.getType(), res1)
      res.append(res1.toString)
    }
  }
}