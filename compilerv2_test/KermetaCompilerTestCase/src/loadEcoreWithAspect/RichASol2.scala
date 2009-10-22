package loadEcoreWithAspect;

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._
 
trait implicit2 {
    implicit def richa(xs: EClassAspect) = xs.asInstanceOf[RichEClass];
    implicit def richb(xs: EClass) = xs.asInstanceOf[RichEClass]

}  
 
trait EClassAspect  extends implicit2 {
	var toto : String=""; 
	 
	def test()  = { 
		this.toto = "toto";
		println(this.getName() +  " "+ this.toto.toString() ) ;
	}

}
  
class RichEClass extends EClassImpl with EClassAspect{}

class RichFactory() extends EcoreFactoryImpl{
	override def createEClass():EClass = {
		return  new RichEClass();
	}
}
 


object Main extends implicit2{
 
	def main(args : Array[String]) : Unit = { 
		test1.Test1Package.eINSTANCE.setEFactoryInstance(new RichFactory())
		  var v : helper.EmfResource[EcorePackage] = new helper.EmfResource[EcorePackage](EcorePackage.eINSTANCE);
		  println(v.getResourceContents("src/test1/A.ecore").get(0).asInstanceOf[EPackage].getName());
 	   
   }
}

 
