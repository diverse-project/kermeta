package test

import kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._

import java.util._
//import scala.collection.JavaConversions._
      
class Test{
	var a :String=_
	}
  
object Test {
  def main(args : Array[String]) : Unit = {
	  
/*	  var s : List[String] = new java.util.ArrayList[String];
	   var v : Integer = 0
	   0.mult(10)
	   1.mult(3)
		var t : List[Int]= new java.util.ArrayList[Int]() 
		t.add(1);
		t.add(2)
		t.add(3)
		t.add(4)
		t.add(5)
		t.size*/
		 
//		t.filter{e=>  e < 3 }.map{e => println(e)}  	  
		//t.asInstanceOf[JListWrapper[Int]].reject{e=> e>3}.map{e => println(e)}  	 
//		t.reject{e=> e>3}.map{e => println(e)}
		   
	  var v : Boolean = true
	  v = v.andThen({(b)=> {false}})
	  println(v.toString)
	var i : Int = 0;
	 kermeta.io.stdio.writeln("loop1++=".plus((i+"")))
	 
	 {
		 {
			 
		 }
	 }
	 
  }
  
}
