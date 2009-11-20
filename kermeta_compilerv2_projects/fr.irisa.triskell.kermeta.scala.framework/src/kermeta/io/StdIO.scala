package kermeta.io

object stdio extends StdIO

class StdIO {
	
	def write(obj : AnyRef) : Unit = {
		Console.print(obj)
	}
	
	def errorln(obj : AnyRef) : Unit = {
		Console.println(obj) //TODO PRINT TO ERR CONSOLE
	}
	
	def error(obj : AnyRef) : Unit = {
		Console.print(obj)
	}
	
	def writeln(obj : AnyRef) : Unit = {
		Console.println(obj)
	}
	
	def read(prompt : String) : String = {
		if (prompt != null){
			println(prompt);
		}
		var ligne_lue:String =null;
    	var lecteur: java.io.InputStreamReader =new java.io.InputStreamReader(System.in);
    	var entree:java.io.BufferedReader =new java.io.BufferedReader(lecteur);
    	ligne_lue=entree.readLine();
    	return ligne_lue;
 
	
	}

}
