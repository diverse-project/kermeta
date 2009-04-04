 package p1;

//import org;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
 import org.eclipse.emf.ecore._;

import java.io.File;
import java.util.Collection
 import scala.collection.jcl._;
 import scala.collection.jcl.Conversions;

  
object LoadEcore {
  
   
 implicit def enrichEPackage(xs: EPackage) = new RichEPackage(xs)
  def main(args : Array[String]) : Unit = {
    var t: p2.LoadModelHelper = new p2.LoadModelHelper()  ;
  	var v : Collection[EObject] = t.open(new File("kermeta_java.ecore"));  
    v.toArray.foreach(e => e.asInstanceOf[EPackage].createInherithanceTree()/*generateVisitor("\t")*/); 
    //p1.Util.concreteClass.foreach(c => println(c)) 
    //p1.Util.subclasses.keySet.toArray.foreach(c1 => p1.Util.subclasses.get(c1.asInstanceOf[EClass]).foreach(c2 => println(c1.asInstanceOf[EClass].getName+ " : "+ c2.asInstanceOf[EClass].getName))) 
    // p1.Util.subclasses.get[EClass](new EClass())
    println(p1.Util.generateTraits("")) 
    v.toArray.foreach(e => println(e.asInstanceOf[EPackage].generateVisitor("\t"))); 
     
  }  
}
 
