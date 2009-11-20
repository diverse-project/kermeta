package kermeta.utils

object TypeEquivalence {
	
	
	
	var packageEquivelence :  java.util.HashMap[String,String] ={
		var pack1 : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		pack1.put("ecore","org.eclipse.emf.ecore");
		pack1;
	}
	
	var typeEquivelence :  java.util.HashMap[String,String] = {typeEquivelence = new java.util.HashMap[String,String]()
		typeEquivelence.put("kermeta.utils.Hashtable", "java.util.HashMap");
		typeEquivelence.put("kermeta.utils.Stack", " java.util.Stack");
		typeEquivelence.put("kermeta.standard.Collection", "java.util.List");
		typeEquivelence.put("kermeta.standard.String", "java.lang.String");
		typeEquivelence.put("kermeta.standard.Integer", "java.lang.Integer");
		typeEquivelence.put("kermeta.standard.Real", "java.lang.Double");
		typeEquivelence.put("kermeta.standard.Character", "java.lang.Character");
		typeEquivelence;
		};
	var methodEquivalence :  java.util.HashMap[String,java.util.HashMap[String,String]] = {methodEquivalence = new java.util.HashMap[String,java.util.HashMap[String,String]]()
			var Hashtable : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
			                                                                         Hashtable.put("getValue", "get");
//		Hashtable.put("getValue", "get");
		methodEquivalence.put("kermeta.utils.Hashtable", Hashtable);
		
		var Stack : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Stack.put("peek", "peek");
		methodEquivalence.put("kermeta.utils.Stack", Stack);
		
		var Collection : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Stack.put("count", "countElement");
		methodEquivalence.put("kermeta.standard.Collection", Collection);
		methodEquivalence
	};
	 
	
	
}
