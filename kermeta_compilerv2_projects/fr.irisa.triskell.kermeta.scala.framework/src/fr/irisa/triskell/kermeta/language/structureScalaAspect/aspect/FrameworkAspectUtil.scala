package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

object FrameworkAspectUtil {
	
	var frameworkDefaultAspect :  java.util.HashMap[String,String] ={
		var hashtable : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		hashtable.put("ClassDefinition","ClassDefinitionAspect");
		hashtable.put("fr.irisa.triskell.kermeta.language.structure.Type","fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.TypeAspect");
				
		hashtable
	}
	def getDefaultAspect(key:String):String={
		var res :String = frameworkDefaultAspect.get(key)
		//println("titi " + key)
		if (res ==null) 
			res = "fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect"
		return res 
	}	

}
