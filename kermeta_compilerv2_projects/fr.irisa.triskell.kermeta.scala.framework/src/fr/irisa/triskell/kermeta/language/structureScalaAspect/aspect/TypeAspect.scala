package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

trait TypeAspect {

	def isInstance(o:ObjectAspect):Boolean={
		//o.isInstanceOf[Class]
		return true;
	}
        def deepClone(objectToClone: fr.irisa.triskell.kermeta.language.structure.Object): fr.irisa.triskell.kermeta.language.structure.Object={
		return null;
	}


}
