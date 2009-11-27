package kermeta.utils

object TypeEquivalence {
	
	
	 
	var packageEquivelence :  java.util.HashMap[String,String] ={
		var pack1 : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		pack1.put("ecore","org.eclipse.emf.ecore");
		pack1.put("language.structure","fr.irisa.triskell.kermeta.scala.framework.language.structure")
		pack1.put("kermeta.language.structure","fr.irisa.triskell.kermeta.language.structure")
		pack1.put("language.structure","fr.irisa.triskell.kermeta.scala.framework.language.structure")
		pack1.put("kermeta.language.behavior", "fr.irisa.triskell.kermeta.language.behavior")
		//pack1.put("kermeta.kunit","junit.framework")
		pack1;
	}
	
	def getPackageEquivalence(key:String):String={
		var res :String = packageEquivelence.get(key)
		if (res ==null) 
			res = key
		return res 
	}
	
	var typeEquivelence :  java.util.HashMap[String,String] = {typeEquivelence = new java.util.HashMap[String,String]()
		typeEquivelence.put("kermeta.utils.Hashtable", "java.util.HashMap");
		typeEquivelence.put("org.eclipse.emf.ecore.EStringToStringMapEntry","java.util.Map.Entry[String,String]")
		typeEquivelence.put("kermeta.utils.Stack", " java.util.Stack");
		typeEquivelence.put("kermeta.standard.Collection", "java.util.List");
		typeEquivelence.put("kermeta.standard.Set", "java.util.List");
		typeEquivelence.put("kermeta.standard.String", "java.lang.String");
		typeEquivelence.put("kermeta.standard.Integer", "Int");
		typeEquivelence.put("kermeta.standard.Real", "java.lang.Double");
		typeEquivelence.put("kermeta.standard.Character", "java.lang.Character");
		typeEquivelence.put("int", "Int");
		typeEquivelence.put("boolean", "Boolean");
		typeEquivelence.put("java.lang.Class","java.lang.Class[_]")
		typeEquivelence;
		};
		
	def getTypeEquivalence(key:String):String={
		var res :String = typeEquivelence.get(key)
		if (res ==null) 
			res = key
		return res 
	}
	var methodEquivalence :  java.util.HashMap[String,java.util.HashMap[String,String]] = {methodEquivalence = new java.util.HashMap[String,java.util.HashMap[String,String]]()
			var Hashtable : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
			                                                                         Hashtable.put("getValue", "get");
//		Hashtable.put("getValue", "get");
		methodEquivalence.put("kermeta.utils.Hashtable", Hashtable);
		
		var Stack : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Stack.put("peek", "peek");
		methodEquivalence.put("kermeta.utils.Stack", Stack);
		
		var Collection : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Collection.put("count", "countElement");
		methodEquivalence.put("kermeta.standard.Collection", Collection);
		
		var ClassDefinition : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		ClassDefinition.put("allAttribute", "eAllAttributes")
		methodEquivalence.put("fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition", ClassDefinition);
		
		
		methodEquivalence 
		//var Str : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		//Str.put("plus", "+");
		//methodEquivalence.put("String", Str);
		//methodEquivalence 

	};
	 
	def getMethodEquivalence(className:String,methodName:String):String={
		var res :String = null
		var map :java.util.HashMap[String,String] = methodEquivalence.get(className)
		if (map !=null) 
			res =  map.get(methodName)
		if (res ==null) 
			res =methodName		
		return res 
	}
	
	
}
