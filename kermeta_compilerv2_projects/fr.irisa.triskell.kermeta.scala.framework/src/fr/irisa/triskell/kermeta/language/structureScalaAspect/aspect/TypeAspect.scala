package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

trait TypeAspect {

	def isInstance(o:ObjectAspect):Boolean={
		//o.isInstanceOf[Class]
		return true;
	}
	
}
