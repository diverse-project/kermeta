package org.kermeta.language.compiler

object FrameworkAspectUtil {
	
	var frameworkDefaultAspect :  java.util.HashMap[String,String] ={
		var hashtable : java.util.HashMap[String,String]= new java.util.HashMap[String,String]();
		hashtable.put("ClassDefinition","ClassDefinitionAspect");
		hashtable.put("org.kermeta.language.structure.Type","org.kermeta.language.structureScalaAspect.aspect.TypeAspect");
		hashtable.put("org.kermeta.language.structure.Class","org.kermeta.language.structureScalaAspect.aspect.TypeAspect");
		hashtable.put("org.eclipse.emf.ecore.EClass","org.kermeta.language.structureScalaAspect.aspect.ClassDefinition");

		hashtable
	}
	def getDefaultAspect(key:String):String={
		var res :String = frameworkDefaultAspect.get(key)
		//println("titi " + key)
		if (res ==null) 
			res = "org.kermeta.language.structureScalaAspect.aspect.ObjectAspect"
		return res 
	}	

}
