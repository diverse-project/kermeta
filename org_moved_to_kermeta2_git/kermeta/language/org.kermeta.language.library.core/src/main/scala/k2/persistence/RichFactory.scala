package k2.persistence
object KerRichFactory {
  //def createResourceSet : org.eclipse.emf.ecore.resource.ResourceSet = { new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl }
  def createResourceSet : org.eclipse.emf.ecore.resource.ResourceSet = {
    val rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
    // by default knows about xmi
    rs.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*",new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl())
    rs
  }
}

 