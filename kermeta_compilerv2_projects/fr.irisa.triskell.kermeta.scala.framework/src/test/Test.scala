package test

import kermeta.standard.JavaConversions._
import java.util._
//import scala.collection.JavaConversions._
      
class Test{}
  
object Test {
  def main(args : Array[String]) : Unit = {
	  
	  var s : List[String] = new java.util.ArrayList[String];
		var t : List[Int]= new java.util.ArrayList[Int]() 
		t.add(1);
		t.add(2)
		t.add(3)
		t.add(4)
		t.add(5)
		t.size
		 
//		t.filter{e=>  e < 3 }.map{e => println(e)}  	  
		//t.asInstanceOf[JListWrapper[Int]].reject{e=> e>3}.map{e => println(e)}  	 
		t.reject{e=> e>3}.map{e => println(e)}
	  	
  }
  
}
