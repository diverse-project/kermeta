package ecoreWithAspectAndInherithance

trait implicit2 {
 	 
   //génération des feuiiles au noeuds
    implicit def richa(xs: AAspect) = xs match { 
    	case (ys : BAspect) => ys.asInstanceOf[RichB];
    	case (ys : AAspect) => ys.asInstanceOf[RichA];
    } 
   //génération des feuiiles au noeuds
    implicit def richa(xs:ecorewithaspectandInherithance.A) = xs match { 
    	case (ys : ecorewithaspectandInherithance.B) => ys.asInstanceOf[RichB];
    	case (ys : ecorewithaspectandInherithance.A) => ys.asInstanceOf[RichA];
    } 
   
    implicit def richa(xs: BAspect) = xs.asInstanceOf[RichB];
    implicit def richb(xs: ecorewithaspectandInherithance.B) = xs.asInstanceOf[RichB]
} 
 

class RichFactory() extends ecorewithaspectandInherithance.impl.EcorewithaspectandInherithanceFactoryImpl{
	override def createA():ecorewithaspectandInherithance.A = {
		return  new RichA();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	override def createB():ecorewithaspectandInherithance.B = {
		return  new RichB();
	}
}

object Test41 extends implicit2{
  def main(args : Array[String]) : Unit = {
	  ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage.eINSTANCE.setEFactoryInstance(new RichFactory());
	  var v : helper.EmfResource[ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage] = new helper.EmfResource[ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage](ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage.eINSTANCE);
	  var b : ecorewithaspectandInherithance.B = v.getResourceContents("src/ecoreWithAspectAndInherithance/B.xmi").get(0).asInstanceOf[ecorewithaspectandInherithance.B];
	  b.baraspect = 3
	  println(b.fooaspect)
	  b.test()
  }
}

trait AAspect {
	var fooaspect : String="";
}


trait BAspect extends implicit2{
	var baraspect : Int=4;
	def test()  ={
		this.fooaspect = "fooaspect"
		this.baraspect = 2
		println(this.fooaspect +  " " + this.getFoo() + " "+ this.baraspect.toString + " " + this.getBar().toString) 
	}
}

class RichA extends ecorewithaspectandInherithance.impl.AImpl with AAspect{}
class RichB extends ecorewithaspectandInherithance.impl.BImpl with BAspect with  AAspect{}

