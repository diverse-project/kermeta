package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait MainAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.scala.framework.language.structure.Object with KunitImplicitConversion{

   def main():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
stdio.writeln("test")
}
 return result
}
}

