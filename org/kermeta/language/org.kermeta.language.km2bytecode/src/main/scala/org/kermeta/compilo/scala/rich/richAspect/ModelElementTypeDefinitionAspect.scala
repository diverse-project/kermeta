package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.language.structure.ModelElementTypeDefinition
import org.kermeta.language.structure.ModelTypeDefinition
import org.kermeta.language.structure.GenericTypeDefinition
import org.kermeta.language.structure.VirtualType
import scala.collection.JavaConversions._
import org.kermeta.language.structure.ModelType
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.Class
import org.kermeta.compilo.scala.Util
import org.kermeta.compilo.scala.visitor.impl.UtilModelTypeDefinition

//MODELTYPE ADDITION
trait ModelElementTypeDefinitionAspect extends ObjectVisitor with OperationAspect with PropertyAspect {

  def visitVirtualType(thi: VirtualType, res: StringBuilder) = {
    res.append(getModelTypeInterfaceQualifiedName(thi.getTypeDefinition()))
    if (thi.getTypeParamBinding.size() > 0) {
      var i: Int = 1
      res.append("[")
      thi.getTypeParamBinding.foreach(e => {
        var res1: StringBuilder = new StringBuilder
        visit(e, res1)
        if (false && res1.toString.contains(classOf[org.kermeta.language.structure.KermetaModelElement].getCanonicalName))
          res.append("_ <: _root_.java.lang.Object")
        else
          res.append(res1.toString)
        if (i < thi.getTypeParamBinding.size()) {
          res.append(", ")
        }
        i = i + 1;
      })
      res.append("]")
    }
  }

  def generateModelTypeInterface(cd: ClassDefinition, mtd: ModelTypeDefinition) = {
    var res: StringBuilder = new StringBuilder
    var genpackageName: StringBuilder = new StringBuilder
    genpackageName.append(k2.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNameCompilo(cd.eContainer)))

    res.append("package " + Util.protectScalaKeyword(genpackageName.toString) + "\n")

    res.append("trait ")
    res.append(Util.getModelTypeInterfaceName(cd))
    res.append(" ")

    var first = true;
    cd.getSuperType.foreach(superC => {
      if (first) {
        res.append(" extends ")
        first = false
      } else {
        res.append(" with ")
      }
      if (superC.asInstanceOf[Class].getTypeDefinition.getName() == "Object") {
        res.append("_root_.k2.standard.KermetaObject")
      } else {
        res.append("_root_." + getModelTypeInterfaceQualifiedName(superC.asInstanceOf[Class].getTypeDefinition))
      }
    })

    res.append(" {\n")
    if (Util.needToAddFixedTypeMembers(cd, mtd)) {
      res.append(UtilModelTypeDefinition.getBoundedTypeMembers(mtd))
    }
    cd.getOwnedAttribute().foreach(a => {
      generatePropertySignatures(a, res, true)
    })
    cd.getOwnedOperation().foreach(o => {
      generateSignature(o, res, getCompilerConfiguration().modelTypeOperationsPrefix)
    })
    res.append("}\n")

    Util.generateFile(Util.getQualifiedPathWithMetamodel(cd), Util.getModelTypeInterfaceName(cd), res.toString())
  }

  /*
   * Utils
   */
  //Implementation of ObjectVisitor.getQualifiedModelTypeInterfaceName
  def getModelTypeInterfaceQualifiedName(td: ModelElementTypeDefinition): String = {    
    return getQualifiedPathWithMetamodel(td) + "." + getModelTypeInterfaceName(td)
  }
  //Implementation of ObjectVisitor.getTypeMemberName
  def getTypeMemberName(td: ModelElementTypeDefinition): String = {
    return "mt_" + td.getName()
  }
  //Implementation of ObjectVisitor.getModelTypeInterfaceName
  def getModelTypeInterfaceName(td: ModelElementTypeDefinition): String = {
    return "T" + td.getName()
  }

}