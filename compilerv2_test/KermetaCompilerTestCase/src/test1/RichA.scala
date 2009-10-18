package test1;

 
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

object Main {
 
	implicit def richa(xs: test1.A) = new RichA(xs)
	def main(args : Array[String]) : Unit = { 
		  var v : helper.EmfResource[test1.Test1Package] = new helper.EmfResource[test1.Test1Package](test1.Test1Package.eINSTANCE);
		  v.getResourceContents("src/test1/A.xmi").get(0).asInstanceOf[A].test();
 	   
  }
}

 
