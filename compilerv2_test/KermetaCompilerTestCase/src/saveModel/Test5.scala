package saveModel

import test1._
import test1.impl._

trait implicit1 {
    implicit def richa(xs: test1.A) = new RichA(xs)
} 
 
class RichA (value: test1.A) extends implicit1 {
	var toto : String="";
	 
	def test()  = { 
		this.toto = "toto";
		println(value.getName() +  " "+ this.toto.toString() ) ;
	}

}


object Test5 {
	implicit def richa(xs: test1.A) = new RichA(xs)
  def main(args : Array[String]) : Unit = {
	var a : A = Test1FactoryImpl.init().createA();
	a.setName("titi");
	a.toto = "essaie"
    var v : helper.EmfResource[test1.Test1Package] = new helper.EmfResource[test1.Test1Package](test1.Test1Package.eINSTANCE);
	var res : org.eclipse.emf.ecore.resource.Resource = v.createResource("src/saveModel/ASave.xmi");
	res.getContents().add(a);
	v.save(); 
	
		
		
	
	  
	  
	  
  }
}
