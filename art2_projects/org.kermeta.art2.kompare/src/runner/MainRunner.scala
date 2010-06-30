package runner 
import java.io.PrintStream
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object MainRunner  {
def init() : Unit = {
	kermeta.persistence.EcorePackages.workspaceURI = ""
kermeta.persistence.EcorePackages.pluginURI = "";

{
	var c : java.lang.reflect.Constructor[_] = classOf[org.eclipse.emf.ecore.impl.EcorePackageImpl].getDeclaredConstructors.first
	c.setAccessible(true);
	var pack : org.eclipse.emf.ecore.impl.EcorePackageImpl =  c.newInstance().asInstanceOf[org.eclipse.emf.ecore.impl.EcorePackageImpl]
	pack.setEFactoryInstance(ScalaAspect.org.eclipse.emf.ecore.RichFactory)
 	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	f.setAccessible(true)
	f.set(pack, ScalaAspect.org.eclipse.emf.ecore.RichFactory)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	org.eclipse.emf.ecore.impl.EcorePackageImpl.init
}

{
	var pack : art2.Art2Package = art2.impl.Art2PackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(art2.Art2Package.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(art2.Art2Package.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.art2.RichFactory)
}


{
	var pack : fr.irisa.triskell.kermeta.KmPackage = fr.irisa.triskell.kermeta.impl.KmPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.KmPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.KmPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.RichFactory)
}


{
	var pack : fr.irisa.triskell.kermeta.language.LanguagePackage = fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.RichFactory)
}


{
	var pack : fr.irisa.triskell.kermeta.language.structure.StructurePackage = fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory)
}


{
	var pack : fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage = fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichFactory)
}

}
 def main(args : Array[String]) : Unit = {
	 init() 
	org.kermeta.artKomparator.RichFactory.createLauncher.launchFromURL(args(0))
}
}
