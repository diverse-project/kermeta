package overrideEcoreOperation;

import test1._
 
trait implicit2 {
    implicit def richa(xs: AAspect) = xs.asInstanceOf[RichA];
    implicit def richb(xs: A) = xs.asInstanceOf[RichA]

} 
 
trait AAspect  extends implicit2 {
	var toto : String=""; 
	 
	def test()  = { 
		this.toto = "toto";
		println(this.getName() +  " "+ this.toto.toString() ) ;
	}
	
	 def getQualifiedName():String= {
		return "tito";
	}

}

class RichA extends test1.impl.AImpl with AAspect{
	override def getQualifiedName():String= {
		return super.getQualifiedName();
	}	
}

class RichFactory() extends test1.impl.Test1FactoryImpl{
	override def createA():test1.A = {
		return  new RichA();
	}
}
 


object Main extends implicit2{
 
	def main(args : Array[String]) : Unit = { 
		test1.Test1Package.eINSTANCE.setEFactoryInstance(new RichFactory())
		  var v : helper.EmfResource[test1.Test1Package] = new helper.EmfResource[test1.Test1Package](test1.Test1Package.eINSTANCE);
		 var a : A = v.getResourceContents("src/test1/A.xmi").get(0).asInstanceOf[A];  
		a.test();
		println("titi" + a.getQualifiedName());
 	   
  }
}

 
