package test

import java.util._;

//import scala.collection.JavaConversions._
 
class Person() {
 // Private age variable, renamed to _age
 private var _age = 0
 var name = ""

 // Getter
 def age = _age

 
 // Setter
 def age_= (valu:Int):Unit = {_age = valu}
 
 def toto()={
	 this.age  =3
 }
 
}

class Test2{} 
 
object Test2 {
 
	def main(args : Array[String]) : Unit = { 
		var t : List[Int]= new java.util.ArrayList[Int]() 
		t.add(1) 
		t.add(2)
		t.add(3)
		t.add(4) 
		t.add(5)
		
		var mainClass : String = "p2::p3::Toto"
		 
		var packageName :String= mainClass.substring(0,mainClass.lastIndexOf("::")).replace("::", ".")
		var className :String=mainClass.substring(mainClass.lastIndexOf("::")+2).replace("::", ".")
		
		println(packageName + "  "+ className )
//		t.filter{e=>  e < 3 }.map{e => println(e)}  
  }
}
