package ecoreWithAspectAndInherithance


 
trait implicit1 {
	
     implicit def richa(xs: ecorewithaspectandInherithance.A) = xs match { 
   //génération des feuiiles au noeuds
    	case (ys : ecorewithaspectandInherithance.B) => new RichB(ys.asInstanceOf[ecorewithaspectandInherithance.B]);
    	case (ys : ecorewithaspectandInherithance.A) => new RichA(ys.asInstanceOf[ecorewithaspectandInherithance.A]);
    } 
    implicit def richb(xs: ecorewithaspectandInherithance.B) = new RichB(xs)
} 
class RichA (value: ecorewithaspectandInherithance.A) extends implicit1 {
	var fooaspect : String="";
	
	 

}

class RichB (value: ecorewithaspectandInherithance.B) extends RichA(value: ecorewithaspectandInherithance.A ) with implicit1 {
	var baraspect : Int=4;
	def test()  ={
		this.fooaspect = "fooaspect"
		this.baraspect = 2
		
		println(this.fooaspect + " " + value.getFoo() + " "+ this.baraspect.toString + " " + value.getBar().toString) 
	}
	 

}


object Test4 extends implicit1{
    
	def main(args : Array[String]) : Unit = { 
		 var v : helper.EmfResource[ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage] = new helper.EmfResource[ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage](ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage.eINSTANCE);
		 var b : ecorewithaspectandInherithance.B = v.getResourceContents("src/ecoreWithAspectAndInherithance/B.xmi").get(0).asInstanceOf[ecorewithaspectandInherithance.B];
		 b.baraspect = 3
 		 println(b.fooaspect)
 		 b.test()
 	   
  }
}
