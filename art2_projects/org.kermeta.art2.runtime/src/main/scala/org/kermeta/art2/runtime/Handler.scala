
package org.kermeta.art2.runtime

import org.osgi.framework.BundleContext

object handler{
	
	var actualContext : BundleContext = null
	var actualLaunch : org.kermeta.artKomparator.LauncherAspect = null
	
	def init() = {
	{
	var c : java.lang.reflect.Constructor[_] = classOf[org.eclipse.emf.ecore.impl.EcorePackageImpl].getDeclaredConstructors.first
	c.setAccessible(true)
	var pack : org.eclipse.emf.ecore.impl.EcorePackageImpl =  c.newInstance().asInstanceOf[org.eclipse.emf.ecore.impl.EcorePackageImpl]
	pack.setEFactoryInstance(org.eclipse.emf.ecoreScalaAspect.RichFactory)
 	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	f.setAccessible(true)
	f.set(pack, org.eclipse.emf.ecoreScalaAspect.RichFactory)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	org.eclipse.emf.ecore.impl.EcorePackageImpl.init
	}
	{
	var pack : art2.Art2Package = art2.impl.Art2PackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(art2.Art2Package.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(art2.Art2Package.eNS_URI, pack)
	pack.setEFactoryInstance(art2ScalaAspect.RichFactory)
	}
	{
	var pack : fr.irisa.triskell.kermeta.language.structure.StructurePackage = fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.eNS_URI, pack)
	pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.structureScalaAspect.RichFactory)
	}
	{
	var pack : fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage = fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.eNS_URI, pack)
	pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichFactory)
		}			
	}//fin init
	

}