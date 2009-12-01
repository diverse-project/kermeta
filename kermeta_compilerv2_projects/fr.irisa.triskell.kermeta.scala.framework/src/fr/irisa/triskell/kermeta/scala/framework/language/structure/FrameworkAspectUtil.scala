package fr.irisa.triskell.kermeta.scala.framework.language.structure

object FrameworkAspectUtil {
	
	var frameworkDefaultAspect :  java.util.HashMap[String,String] ={
		var hashtable : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		hashtable.put("ClassDefinition","ClassDefinitionAspect");

		hashtable
	}
	def getDefaultAspect(key:String):String={
		var res :String = frameworkDefaultAspect.get(key)
		if (res ==null) 
			res = "ObjectAspect"
		return res 
	}	

}
