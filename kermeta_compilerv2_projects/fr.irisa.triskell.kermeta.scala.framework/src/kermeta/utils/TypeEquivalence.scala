package kermeta.utils

object TypeEquivalence {
	
	
	 
	var packageEquivelence :  java.util.HashMap[String,String] ={
		var pack1 : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		pack1.put("ecore","org.eclipse.emf.ecore");
		pack1.put("uml","org.eclipse.uml2.uml");
		//pack1.put("fr.irisa.triskell.kermeta.language.structure","fr.irisa.triskell.kermeta.language.structure")
		pack1.put("kermeta","fr.irisa.triskell.kermeta")
		pack1.put("kermeta.language","fr.irisa.triskell.kermeta.language")
				
		pack1.put("kermeta.language.structure","fr.irisa.triskell.kermeta.language.structure")
		//pack1.put("language.structure","fr.irisa.triskell.kermeta.language.structure")
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
		typeEquivelence.put("kermeta.utils.StringBuffer", "scala.StringBuilder");
		typeEquivelence.put("kermeta.utils.Hashtable", "java.util.HashMap");
		typeEquivelence.put("kermeta.standard.Iterator", "java.util.Iterator");
		typeEquivelence.put("kermeta.standard.Collection", "java.util.List");
		typeEquivelence.put("kermeta.standard.Set", "java.util.List");
		typeEquivelence.put("kermeta.standard.OrderedSet", "java.util.List");
		typeEquivelence.put("kermeta.standard.Sequence", "java.util.List");
		typeEquivelence.put("kermeta.standard.Bag", "java.util.List");
		typeEquivelence.put("kermeta.standard.String", "java.lang.String");
		//typeEquivelence.put(" fr.irisa.triskell.kermeta.language.structure.String", "java.lang.String");
		typeEquivelence.put("kermeta.standard.Integer", "Int");
		typeEquivelence.put("kermeta.standard.Real", "java.lang.Double");
		typeEquivelence.put("kermeta.standard.Character", "java.lang.Character");
		typeEquivelence.put("int", "Int");
                typeEquivelence.put("java.lang.Integer", "Int");

                typeEquivelence.put("double", "Double");
		typeEquivelence.put("boolean", "java.lang.Boolean");
		typeEquivelence.put("kermeta.standard.Boolean", "java.lang.Boolean");
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
		Hashtable.put("keys", "keySet");
		//Hashtable.put("getValue", "get");
		methodEquivalence.put("_root_.java.util.HashMap", Hashtable);
		
		var Stack : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Stack.put("peek", "peek");
		methodEquivalence.put("_root_.kermeta.utils.Stack", Stack);
		
		var Collection : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Collection.put("count", "countElement");
		methodEquivalence.put("_root_.kermeta.standard.Collection", Collection);

   /*             Collection  = new java.util.HashMap[String,String]
		Collection.put("add", "addUnique");
		Collection.put("addAll", "addAllUnique");
		methodEquivalence.put("java.util.List", Collection);*/
		var ClassDefinition : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		ClassDefinition.put("allAttribute", "eAllAttributes")
		methodEquivalence.put("_root_.fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition", ClassDefinition);
		
		
   		//methodEquivalence
		var Str : java.util.HashMap[String,String] = new java.util.HashMap[String,String]
		Str.put("size", "ksize");
		methodEquivalence.put("_root_.kermeta.standard.String", Str);
		methodEquivalence.put("_root_.String", Str);
		methodEquivalence.put("java.lang.String", Str);
		methodEquivalence.put("_root_.java.lang.String", Str);
		
		
		methodEquivalence 

	};
	 
	def getMethodEquivalence(classN:String,methodName:String):String={
		var className :String = classN
		//if (methodName.equals("add"))
                 //   println("getMethodEquivalence " + className + " " + methodName )
		var res :String = null
		if (className.contains("["))
			 className = className.substring(0,className.indexOf("["))
		var map :java.util.HashMap[String,String] = methodEquivalence.get(className)
		if (map !=null) 
			res =  map.get(methodName)
		if (res ==null) 
			res =methodName		
		return res 
	}
	
	
}
