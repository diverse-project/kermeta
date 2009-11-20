package p1
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
trait MainAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.scala.framework.language.structure.Object with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{

def main() = {
var b : p1.B =  p1.RichFactory.createB
var b1 : B =  p1.RichFactory.createB
b.name="hello" 
b1.name="hi"
b.name=b1.name
b1.name="hi again"
stdio.writeln("b.name : " + b.name)
}
}

