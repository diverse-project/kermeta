package org.kermeta.compilo.scala.visitor.impl
import org.kermeta.compilo.scala.Util
import org.kermeta.compilo.scala.GlobalConfiguration

object UtilObjectGenerator {

  def genetateUtilObject() = {
    var template = new StringBuilder
    template.append("package scalaUtil\n object Util {\n")
    template.append("    def getMetaClass(t:String):org.kermeta.language.structure.Class={\n")
    template.append("       var cd : _root_.org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass(t);\n")
    template.append("       if (cd !=null){\n")
    template.append("            var cl = " + org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix + ".org.kermeta.language.structure. " + GlobalConfiguration.factoryName + ".createClass\n")
    template.append("            cl.setTypeDefinition(cd)\n")
    template.append("            return cl\n")
    template.append("       } else\n")
    template.append("            return null;\n")
    template.append("    }\n")
    template.append("    def clone(t:org.kermeta.language.structure.Class, o:Any):Any={return null;}\n")
    template.append("}\n")

    Util.generateFile("scalaUtil", "Util", template.toString)

  }
}