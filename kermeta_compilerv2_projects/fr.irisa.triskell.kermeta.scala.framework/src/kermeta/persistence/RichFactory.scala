package kermeta.persistence
object RichFactory {
 def createEMFRepository : kermeta.persistence.EMFRepository = { new kermeta.persistence.EMFRepository }
}

 