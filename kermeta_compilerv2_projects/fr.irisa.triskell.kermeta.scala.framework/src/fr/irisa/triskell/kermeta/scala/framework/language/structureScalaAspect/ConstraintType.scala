package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaObject
import kermeta.io._
import kermeta.standard._
import kermeta.standard.JavaConversions._
object ConstraintType extends Enumeration {
type ConstraintType = Value
val inv,pre,post = Value
}
