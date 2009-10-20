package saveModel

import test1._
import test1.impl._

trait implicit2 { 
    implicit def richa(xs: AAspect) = xs.asInstanceOf[RichA];
    implicit def richb(xs: A) = xs.asInstanceOf[RichA]
} 


trait AAspect extends implicit2 {
	var toto : String="";	 
	def test()  = { 
		this.toto = "toto";
		println(this.getName() +  " "+ this.toto.toString() ) ;
	}
}
class RichA extends test1.impl.AImpl with AAspect{}

class RichFactory() extends test1.impl.Test1FactoryImpl{
	override def createA():test1.A = {
		return  new RichA();
	}
}



object Test5 extends implicit2{
  def main(args : Array[String]) : Unit = {
	Test1Package.eINSTANCE.setEFactoryInstance(new RichFactory());
	var a : A = Test1Package.eINSTANCE.getEFactoryInstance().asInstanceOf[Test1FactoryImpl].createA();
	a.setName("titi");
	a.toto = "essaie"
    var v : helper.EmfResource[test1.Test1Package] = new helper.EmfResource[test1.Test1Package](test1.Test1Package.eINSTANCE);
	var res : org.eclipse.emf.ecore.resource.Resource = v.createResource("src/saveModel/ASave.xmi");
	res.getContents().add(a);
	v.save(); 
	
		
		
	
	  
	  
	  
  }
}
