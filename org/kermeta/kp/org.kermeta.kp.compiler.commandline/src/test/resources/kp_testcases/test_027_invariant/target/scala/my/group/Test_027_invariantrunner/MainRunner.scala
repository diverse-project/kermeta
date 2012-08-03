package my.group.Test_027_invariantrunner 
import java.io.PrintStream
import ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
object MainRunner  {
def init() : Unit = {
	k2.persistence.EcorePackages.workspaceURI = "null"
k2.persistence.EcorePackages.pluginURI = "null";

{
	var pack : org.OrgPackage = org.impl.OrgPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.OrgPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.OrgPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(my.group.`Test_027_invariant`.org.KerRichFactory)
}


{
	var pack : org.kermeta.KmPackage = org.kermeta.impl.KmPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.KmPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.KmPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.KerRichFactory)
}


{
	var pack : org.kermeta.language.LanguagePackage = org.kermeta.language.impl.LanguagePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.language.KerRichFactory)
}


{
	var pack : org.kermeta.language.behavior.BehaviorPackage = org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.language.behavior.KerRichFactory)
}


{
	var pack : org.kermeta.language.structure.StructurePackage = org.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.language.structure.KerRichFactory)
}


	 k2.utils.ReflexivityLoader.pref("my.group.Test_027_invariant")

	 k2.utils.UTilScala.setScalaAspectPrefix("my.group.Test_027_invariant")
}
def init4eclipse() : Unit = {
	org.impl.OrgPackageImpl.init().setEFactoryInstance(my.group.`Test_027_invariant`.org.KerRichFactory)
org.kermeta.impl.KmPackageImpl.init().setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.KerRichFactory)
org.kermeta.language.impl.LanguagePackageImpl.init().setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.language.KerRichFactory)
org.kermeta.language.behavior.impl.BehaviorPackageImpl.init().setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.language.behavior.KerRichFactory)
org.kermeta.language.structure.impl.StructurePackageImpl.init().setEFactoryInstance(my.group.`Test_027_invariant`.org.kermeta.language.structure.KerRichFactory)

	 k2.utils.ReflexivityLoader.pref("my.group.Test_027_invariant")

	 k2.utils.UTilScala.setScalaAspectPrefix("my.group.Test_027_invariant")
}
def main(args : Array[String]) : Unit = {
	 init() 
		org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
	_root_.mainPackage.KerRichFactory.createMainClass.mainOperation()
}
}
