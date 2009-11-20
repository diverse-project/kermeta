package org.eclipse.emf.ecore
trait EClassAspect extends org.eclipse.emf.ecore.EClassifierAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{

   def testSetReflection() = {
this.getMetaClass().getClassDefinition().getAllAttribute().select(p=>{
p.getIsDerived().not()
}
).select(p=>{
p.getName().equals("name")
}
).each(p=>{
stdio.writeln("set on ".plus(p.getName()))
this.set(p, "Classe")
}
)
}

   def testGetReflection() = {
this.getMetaClass().getClassDefinition().getAllAttribute().select(p=>{
p.getIsDerived().not()
}
).each(p=>{
stdio.writeln("get on ".plus(p.getName()).plus(" : ").plus(this.get(p).toString()))
}
)
}
}

