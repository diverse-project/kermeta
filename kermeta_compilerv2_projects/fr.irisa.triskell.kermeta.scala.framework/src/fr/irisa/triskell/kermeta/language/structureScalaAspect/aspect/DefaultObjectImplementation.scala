package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

trait DefaultObjectImplementation extends fr.irisa.triskell.kermeta.language.structure.Object{
	
	
	var ownedTags : org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag] = new org.eclipse.emf.common.util.BasicEList[fr.irisa.triskell.kermeta.language.structure.Tag]
	var tags : org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag] = new org.eclipse.emf.common.util.BasicEList[fr.irisa.triskell.kermeta.language.structure.Tag]
	
	def getOwnedTags():org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag]=ownedTags;
	def getTag():org.eclipse.emf.common.util.EList[fr.irisa.triskell.kermeta.language.structure.Tag]=tags;
}
 