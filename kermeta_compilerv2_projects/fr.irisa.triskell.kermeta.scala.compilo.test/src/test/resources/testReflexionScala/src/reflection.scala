import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._
import scala.collection.JavaConversions._
import org.eclipse.emf.common.util._
import scala._

/* Defintion des riches Classes */
class RichEClassImpl extends EClassImpl with EClassAspect

/* Definition des implicites des classes �tendus */
trait implicitAspect {
    implicit def richEclassAspect(xs: EClass) = xs.asInstanceOf[RichEClassImpl]
    implicit def richEclassAspect(xs: EClassAspect) = xs.asInstanceOf[RichEClassImpl]
    implicit def richEclassAspect(xs: EClassKermetaMapping) = xs.asInstanceOf[RichEClassImpl]
} 



/* Definition de la factory etendu */
class RichFactory extends EcoreFactoryImpl{

	override def createEClass():EClass = {
		return  new RichEClassImpl();
	}
}

/* Trait pour le mapping implicite des fonctions Kermeta */
trait EClassKermetaMapping extends implicitAspect {
	def getMetaClass = this.eClass()
	def classDefinition = this
	def allAttribute = this.getEAllAttributes()
}


trait KermetaImplicit {
	implicit def richEList[A](implicit xs: List[A])  = new RichCollection[A](xs)
}

class RichCollection[A](xs: List[A]){
	def select(A : AnyRef => Boolean) = { }
}




object TestReflectionScala extends implicitAspect {
  def main(args : Array[String]) : Unit = {
	  var s: RichFactory = new RichFactory()
	   
	  org.eclipse.emf.ecore.EcorePackage.eINSTANCE.setEFactoryInstance(s);
	  var v : helper.EmfResource[EcorePackage] = new helper.EmfResource[org.eclipse.emf.ecore.EcorePackage](org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	  var b : EPackage = v.getResourceContents("/Users/ffouquet/Documents/DEV/workspaces/scala-sandbox/testReflection/metamodel/metamodel.ecore").get(0).asInstanceOf[EPackage];
	  var e  = b.getEClassifiers.filter{e=> e.eClass().getName().equals("EClass")}
	  var firstEClass = e.first.asInstanceOf[EClass]
	 //  Console.println(firstEClass.getName())
	  firstEClass.testGetReflection
	  firstEClass.testSetReflection
	  //Console.println(firstEClass.getName())
  }
}


trait EClassAspect extends implicitAspect with EClassKermetaMapping with KermetaImplicit {
	//this:EClass => 
	def testGetReflection {
		this.eClass().getEAllAttributes().select{e=>  (!e.isDerived()) }.map{e => println("get on "+e.getName()+" : "+this.eGet(e))}  
	}
	
	def testSetReflection {
		this.eClass().getEAllAttributes().filter({e=> !e.isDerived()}).filter({e=> e.getName=="name"}).map{
			e => 
				Console.println("set on "+e.getName())
				this.eSet(e, "Classe")
		}
	
	}
	
	
}