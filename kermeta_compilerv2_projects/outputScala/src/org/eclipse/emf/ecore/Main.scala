package org.eclipse.emf.ecore
trait MainAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.Object with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{

   def main() = {
var p : EPackage =  new EcoreUtil().loadModel("../metamodel/metamodel.ecore")
var c : EClass = _
c=p.getEClassifiers().select(c=>{
c.isKindOf(ecore.kmEClass)
}
).one().asInstanceOf[EClass]
stdio.writeln(c.getName())
c.testGetReflection()
c.testSetReflection()
 new EcoreUtil().saveModel(p, "../metamodel/metamodel_modified.ecore")
stdio.writeln(c.getName())
}
}

