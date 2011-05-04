package org.kermeta.language.ecore2km.internal 

import ScalaImplicit.org.kermeta.language.language.ecore2km.ImplicitConversion._
object Init4Eclipse  {
  def init() : Unit = {
    kermeta.persistence.EcorePackages.workspaceURI = "null"
    kermeta.persistence.EcorePackages.pluginURI = "null";

    {
      var pack : org.eclipse.emf.ecore.impl.EcorePackageImpl =  new org.eclipse.emf.ecore.impl.EcorePackageImpl with org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.EPackageAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation
      org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)
      pack.setEFactoryInstance(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory)
      var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
      f.setAccessible(true)
      f.set(pack, org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory)
      org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
      kermeta.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
      //org.eclipse.emf.ecore.impl.EcorePackageImpl.init
    }
  }
}