package playWithPrimitiveType

class Test3 {
}

object Test3 {
 
	def main(args : Array[String]) : Unit = { 
		var i : java.lang.Integer =2;
		var j : Int = i.intValue();
		var k : java.lang.Integer =j
		var tt : int = k.intValue()
		println(" "+ i +" "+ j +" "+ k +" "+ tt)
	}
}