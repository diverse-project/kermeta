package org.kermeta.compilo.scala.rich.richAspect
import org.kermeta.language.structure.Parameter


trait ParameterAspect extends ObjectVisitor {
  def getListorType(param: Parameter, res: StringBuilder) = {
    var res1: StringBuilder = new StringBuilder
    if (param.getUpper > 1 || param.getUpper == -1) {
      if (param.getIsOrdered != null && param.getIsOrdered) {
        res.append("org.eclipse.emf.common.util.EList[")
      } else {
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }
      visit(param.getType(), res1)
      res.append(res1.toString)
      res.append("]")
    } else {
      visit(param.getType(), res1)
      res.append(res1.toString)
    }

  }
}