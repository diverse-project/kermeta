
package org.kermeta.art2.runtime.impl

import org.kermeta.art2.runtime.ArtRuntimeService
import java.util.Properties
import org.kermeta.artKomparator.LauncherAspect

class ArtRuntimeServiceBean extends ArtRuntimeService {
	
	var actualLaunch : org.kermeta.artKomparator.LauncherAspect = null
	
	var dictionary : Properties = null
	def setDictionary(prop : Properties) = dictionary = prop
	def getDictionary : Properties = dictionary
	
	def update(url : String) = {
		actualLaunch.launchFromURL(url)
	}
	
	
	def init() = {		
		var testtemp = classOf[org.eclipse.emf.ecore.impl.EObjectImpl]
		var testtemp2 = classOf[org.kermeta.artKomparator.RichLauncher]
		println(testtemp)
		println(testtemp2)
		
	{
	//println(classOf[org.eclipse.emf.ecore.impl.EcorePackageImpl].getDeclaredConstructors.size)
		
	var ctab  = classOf[org.eclipse.emf.ecore.impl.EcorePackageImpl].getDeclaredConstructors
	var c = ctab(0)
	c.setAccessible(true);
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

/*
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
*/
		actualLaunch = org.kermeta.artKomparator.RichFactory.createLauncher.asInstanceOf[LauncherAspect]
		actualLaunch.KersetNodeName(dictionary.getProperty("node.name"))
		actualLaunch.KersetHotdeployPATH(dictionary.getProperty("deploy.path"))//"/Users/ffouquet/Servers/apache-felix-karaf-1.2.0/deploy")
		
		println("INIT ART RUNTIME")
		println("deploy path "+dictionary.getProperty("deploy.path"))
		println("node name "+dictionary.getProperty("node.name"))

	}//fin init
	

}