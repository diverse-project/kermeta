 package p1;

//import org;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
 
import java.io.File;
import java.util.Collection
 import scala.collection.jcl._;
 import scala.collection.jcl.Conversions;
import fr.irisa.triskell.kermeta.language.structure._;

  

trait collectionTraits{
  implicit def convertSet[T](set : java.util.Set[T]) = Set(set)
  implicit def convertList[T](set : java.util.List[T]) = Buffer(set)
  implicit def convertSortedSet[T](set : java.util.SortedSet[T]) = SortedSet(set)
  implicit def convertMap[T,E](set : java.util.Map[T,E]) = Map(set)
  implicit def convertSortedMap[T,E](set : java.util.SortedMap[T,E]) = SortedMap(set)
  
  implicit def unconvertSet[T](set : SetWrapper[T]) = set.underlying
  implicit def unconvertCollection[T](set : CollectionWrapper[T]) = set.underlying
  implicit def unconvertList[T](set : BufferWrapper[T]) = set.underlying
  implicit def unconvertSortedSet[T](set : SortedSetWrapper[T]) = set.underlying  
  implicit def unconvertMap[T,E](set : MapWrapper[T,E]) = set.underlying
  implicit def unconvertSortedMap[T,E](set : SortedMapWrapper[T,E]) = set.underlying
  
}

class Compilo extends implicit1{
    def run()={
	var t: p2.LoadModelHelper = new p2.LoadModelHelper()  ;
  	var v : ModelingUnit = t.loadKM("FlatShort.km");  
    println(v.generateVisitor("\n"));
    
   
  }
  
}

object LoadKM {
  
     
  def main(args : Array[String]) : Unit = {
   //v.toArray.foreach(e => println(e.toString()));
    new Compilo().run();
  }
}
 