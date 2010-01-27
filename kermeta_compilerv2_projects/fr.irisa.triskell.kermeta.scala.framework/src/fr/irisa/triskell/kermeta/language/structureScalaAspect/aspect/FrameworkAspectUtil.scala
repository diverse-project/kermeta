package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

object FrameworkAspectUtil {
	
	var frameworkDefaultAspect :  java.util.HashMap[String,String] ={
		var hashtable : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		hashtable.put("ClassDefinition","ClassDefinitionAspect");

		hashtable
	}
	def getDefaultAspect(key:String):String={
		var res :String = frameworkDefaultAspect.get(key)
		if (res ==null) 
			res = "fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect"
		return res 
	}	

}
