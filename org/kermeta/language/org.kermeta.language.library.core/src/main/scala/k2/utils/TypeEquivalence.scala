package k2.utils


object TypeEquivalence {
	
	 
	 
  var packageEquivelence :  java.util.HashMap[String,String] ={
    var pack1 : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
    pack1.put("kermeta.standard","k2.standard");
    pack1.put("kermeta.io","k2.io");
    pack1.put("kermeta.exceptions","k2.exceptions");
    pack1.put("kermeta.persistence","k2.persistence");
    pack1.put("kermeta.emfpersistence","k2.persistence");
    pack1.put("kermeta.utils","k2.utils");
    pack1.put("kermeta","org.kermeta")
    pack1.put("kermeta.language","org.kermeta.language")				
    pack1.put("kermeta.language.structure","org.kermeta.language.structure")
    pack1.put("kermeta.language.behavior", "org.kermeta.language.behavior")
    
    pack1.put("ecore","org.eclipse.emf.ecore");
//    pack1.put("trace","fr.inria.aoste.trace");
/*    pack1.put("uml","org.eclipse.uml2.uml");
    //pack1.put("org.k2.language.structure","org.k2.language.structure")
    pack1.put("kermeta","org.kermeta")
    pack1.put("kermeta.language","org.kermeta.language")
				
    pack1.put("kermeta.language.structure","org.kermeta.language.structure")
    //pack1.put("language.structure","org.k2.language.structure")
    pack1.put("kermeta.language.behavior", "org.kermeta.language.behavior")

    //ObeoFlow    
    pack1.put("flow", "fr.obeo.dsl.designer.sample.flow")
    //Thales M2
    pack1.put("emde", "com.thalesgroup.mde.emde")
    pack1.put("cs", "com.thalesgroup.mde.melody.data.cs")
    pack1.put("ctx", "com.thalesgroup.mde.melody.data.ctx")
    pack1.put("epbs", "com.thalesgroup.mde.melody.data.epbs")
    pack1.put("fa", "com.thalesgroup.mde.melody.data.fa")
    pack1.put("information", "com.thalesgroup.mde.melody.data.information")
    pack1.put("information.communication", "com.thalesgroup.mde.melody.data.information.communication")
    pack1.put("information.datatype", "com.thalesgroup.mde.melody.data.information.datatype")
    pack1.put("information.datavalue", "com.thalesgroup.mde.melody.data.information.datavalue")
    pack1.put("interaction", "com.thalesgroup.mde.melody.data.interaction")
    pack1.put("la", "com.thalesgroup.mde.melody.data.la")
    pack1.put("melodycommon", "com.thalesgroup.mde.melody.data.melodycommon")
    pack1.put("melodycore", "com.thalesgroup.mde.melody.data.melodycore")
    pack1.put("melodymodeller", "com.thalesgroup.mde.melody.data.melodymodeller")
    pack1.put("oa", "com.thalesgroup.mde.melody.data.oa")
    pack1.put("pa", "com.thalesgroup.mde.melody.data.pa")
    pack1.put("pa.deployment", "com.thalesgroup.mde.melody.data.pa.deployment")
    pack1.put("requirement", "com.thalesgroup.mde.melody.data.requirement")
    pack1.put("sharedmodel", "com.thalesgroup.mde.melody.data.sharedmodel")
    pack1.put("activity", "com.thalesgroup.mde.shared.data.activity")
    pack1.put("behavior", "com.thalesgroup.mde.shared.data.behavior")
    pack1.put("modellingcore", "com.thalesgroup.mde.shared.data.modellingcore")
    pack1.put("statemachine", "com.thalesgroup.mde.shared.data.statemachine")
    pack1.put("patterns", "com.thalesgroup.mde.shared.patterns.gen.patterns")
    pack1.put("CVLVariability", "CVLMetamodelMaster.CVLVariability")
*/
        
//pack1.put("k2.kunit","junit.framework")
    pack1;
  }
	
  def getPackageEquivalence(key:String):String={
    var res :String = packageEquivelence.get(key)
    
    if (res ==null){
      res = key
    }
    if (key.startsWith("CHESS"))
        res=res.replace("CHESS","chess.CHESS")
    return res
  }
	
	
  var typeEquivelence :  java.util.HashMap[String,String] = {typeEquivelence = new java.util.HashMap[String,String]()
		  		 
				 typeEquivelence.put("boolean", 				"java.lang.Boolean");
				 typeEquivelence.put("double", 					"java.lang.Double");
				 typeEquivelence.put("float", 					"scala.Float");
  				 typeEquivelence.put("int", 					"java.lang.Integer");
				 typeEquivelence.put("java.lang.Class",			"java.lang.Class[_]")
				 typeEquivelence.put("k2.persistence.ResourceSet","org.eclipse.emf.ecore.resource.ResourceSet")
				 typeEquivelence.put("k2.persistence.Resource",	"org.eclipse.emf.ecore.resource.Resource")
				 typeEquivelence.put("k2.standard.Collection", 	"k2.standard.KermetaCol");
				 typeEquivelence.put("k2.standard.Bag", 		"k2.standard.KermetaBag");
				 typeEquivelence.put("k2.standard.Boolean", 	"java.lang.Boolean");
				 typeEquivelence.put("k2.standard.Character", 	"java.lang.Character");
				 typeEquivelence.put("k2.standard.Date", 		"java.util.Date");
				 typeEquivelence.put("k2.standard.Random", 		"java.util.Random");
				 typeEquivelence.put("k2.standard.Double", 		"java.lang.Double");
				 typeEquivelence.put("k2.standard.Float", 		"java.lang.Float");
				 typeEquivelence.put("k2.standard.Integer", 	"java.lang.Integer");
				 typeEquivelence.put("k2.standard.Iterator", 	"java.util.Iterator");
				 typeEquivelence.put("k2.standard.Long", 		"java.lang.Long");
				 typeEquivelence.put("k2.standard.Object", 		"k2.standard.KermetaObject");
				 typeEquivelence.put("k2.standard.OrderedCollection","k2.standard.KermetaOrderedCol");
				 typeEquivelence.put("k2.standard.OrderedSet", 	"k2.standard.KermetaOrderedSet");
				 typeEquivelence.put("k2.standard.Real", 		"java.lang.Double");
				 typeEquivelence.put("k2.standard.Set", 		"k2.standard.KermetaSet");
				 typeEquivelence.put("k2.standard.Sequence", 	"k2.standard.KermetaSequence");
				 typeEquivelence.put("k2.standard.Short", 		"java.lang.Short");
				 typeEquivelence.put("k2.standard.String", 		"java.lang.String");
				 typeEquivelence.put("k2.standard.StringBuffer","java.lang.StringBuilder");
				 typeEquivelence.put("k2.standard.Void", 		"scala.Unit");
				 typeEquivelence.put("k2.utils.Stack", 			"java.util.Stack");
				 typeEquivelence.put("k2.utils.Hashtable", 		"java.util.HashMap");
				 //typeEquivelence.put(" org.k2.language.structure.String", "java.lang.String");
				 typeEquivelence.put("long", 					"java.lang.Long");
				 typeEquivelence.put( k2.utils.UTilScala.scalaAspectPrefix + ".org.kermeta.language.ReflectiveSequence", "java.util.List")
				 typeEquivelence.put("org.k2.language.ReflectiveSequence", "java.util.List")
				 typeEquivelence.put("org.eclipse.emf.ecore.EStringToStringMapEntry","java.util.Map.Entry[String,String]")
				 
//               typeEquivelence.put("org.k2.language.structure.Object","java.lang.Object")
                 typeEquivelence;
  };
	
    /**
     * Give the java type equivalent to the "key" kermeta type
     */
	def getTypeEquivalence(key:String):String={

    
    
                var res :String = typeEquivelence.get(key)



		if (res ==null) 
			res = key
		return res 
	}
	
	/**
	 * Returns the kermeta type equivalent to the "value" java type
	 */
	def getTypeEquivalenceReverse(value:String):String={
	  // TODO : use a real equivalence list to improve performance
		import scala.collection.JavaConversions._
		typeEquivelence.foreach( (t2) => 
			if((t2._1.startsWith("k2") || t2._1.startsWith("org")) && t2._2==value){
			  return t2._1.replaceFirst("k2.persistence","kermeta.emfpersistence").replaceFirst("k2","kermeta")
			}
		)

		return value
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
		methodEquivalence.put("_root_.org.kermeta.scala.framework.language.structure.ClassDefinition", ClassDefinition);
		
   		//methodEquivalence
		val str = new java.util.HashMap[String,String]
		str.put("size", "ksize");
        str.put("split", "ksplit");
		str.put("toDouble", "ktoDouble");
		methodEquivalence.put("_root_.k2.standard.String", str);
		methodEquivalence.put("_root_.String", str);
		methodEquivalence.put("java.lang.String", str);
		methodEquivalence.put("_root_.java.lang.String", str);
		
		/*val intMethodEquivalence = new java.util.HashMap[String,String]
		intMethodEquivalence.put("compareTo", "kcompareTo");
		intMethodEquivalence.put("shortValue", "kshortValue");
		intMethodEquivalence.put("intValue", "kintValue");
		intMethodEquivalence.put("longValue", "klongValue");
		intMethodEquivalence.put("floatValue", "kfloatValue");
		intMethodEquivalence.put("doubleValue", "kdoubleValue");
		methodEquivalence.put("java.lang.Integer", intMethodEquivalence);
		methodEquivalence.put("_root_.java.lang.Integer", intMethodEquivalence);
		*/
		val resource = new java.util.HashMap[String,String]
		resource.put("getContents", "kgetContents");
		methodEquivalence.put("_root_.k2.persistence.Resource", resource);
		methodEquivalence.put("_root_.org.eclipse.emf.ecore.resource.Resource", resource);
		
        methodEquivalence
  };


  def getMethodEquivalence(classN:String,methodName:String):String={
    var className :String = classN
    if (methodName.contains("split")){
       println("getMethodEquivalence " + className + " " + methodName )
    }
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
