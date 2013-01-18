package org.kermeta.compilo.scala.rich.richAspect
import org.kermeta.language.structure.ModelTypeDefinition
import scala.collection.JavaConversions._
import org.kermeta.language.structure.TypeDefinition
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.ModelTransformation
import org.kermeta.language.structure.Operation
import org.kermeta.compilo.scala.Util
import org.kermeta.compilo.scala.visitor.impl.UtilModelTypeDefinition
import org.kermeta.language.structure.ModelType

//MODELTYPE ADDITION
trait ModelTypeDefinitionAspect extends ModelTransformationAspect with ModelElementTypeDefinitionAspect {

  /**
   * Generate the trait from which sub-model type will inherit
   * Bounded type members for each TypeDefinition of mtd
   * Signature of ModelTransformations
   */
  def generateModelTypeDefinitionInterface(mtd: ModelTypeDefinition): String = {
    var res: StringBuilder = new StringBuilder
    res.append("\n")
    res.append("trait ")
    res.append(mtd.getName())
    res.append(" {\n")

    res.append(UtilModelTypeDefinition.getBoundedTypeMembers(mtd))

    mtd.getOwnedTransformations().foreach(mt => {
      res.append("\t")
      res.append(generateModelTransformationSignature(mt))
      res.append("\n")
    })
    res.append("}\n")
    return res.toString()
  }

  /**
   * Generate the trait defining the behavior of mtd
   * Fixed type members for each TypeDefinition of mtd and its super-modeltypes
   * Body of ModelTransformations
   */
  def generateModelTypeDefinitionAspect(mtd: ModelTypeDefinition): String = {
    var res: StringBuilder = new StringBuilder
    res.append("\n")
    res.append("trait ")
    res.append(mtd.getName() + "Aspect")

    var first: Boolean = true
    if (mtd.getOwnedBindings().size() != 0) {
      mtd.getOwnedBindings().foreach(b => {
        if (first) {
          res.append(" extends ")
          first = false
        } else {
          res.append(" with ")
        }
        res.append(getQualifiedNameCompilo(b.getBoundModelTypeDefinition()))
      })
    }/* else {
      res.append(" extends ")
      res.append("_root_.k2.standard.KermetaObject")
    }*/
    res.append(" {\n")

    res.append(UtilModelTypeDefinition.getFixedTypeMembers(mtd))

    mtd.getOwnedTransformations().foreach(mt => {
      res.append("\t")
      res.append(generateModelTransformation(mt))
      res.append("\n")
    })
    res.append("}\n")
    return res.toString()
  }
  
  
  def visitModelType(mt : ModelType, res : StringBuilder) = {
    res.append("_root_." + Util.getQualifiedPathWithMetamodel(mt.getTypeDefinition()) + "." + mt.getTypeDefinition().getName())
  }
}