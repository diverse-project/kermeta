package test1;

 
trait implicit1 {
    implicit def richa(xs: AAspect) = xs.asInstanceOf[RichA];
    implicit def richb(xs: A) = xs.asInstanceOf[RichA]

} 
 
trait AAspect  extends implicit1 {
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



object Main extends implicit1{
 
	def main(args : Array[String]) : Unit = { 
		test1.Test1Package.eINSTANCE.setEFactoryInstance(new RichFactory())
		  var v : helper.EmfResource[test1.Test1Package] = new helper.EmfResource[test1.Test1Package](test1.Test1Package.eINSTANCE);
		  v.getResourceContents("src/test1/A.xmi").get(0).asInstanceOf[A].test();
 	   
  }
}

 
