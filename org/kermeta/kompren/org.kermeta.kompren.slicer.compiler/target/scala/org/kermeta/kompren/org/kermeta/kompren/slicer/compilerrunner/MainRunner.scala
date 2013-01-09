package org.kermeta.kompren.org.kermeta.kompren.slicer.compilerrunner 
import java.io.PrintStream
import ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
object MainRunner  {
def init() : Unit = {
	k2.persistence.EcorePackages.workspaceURI = "null"
k2.persistence.EcorePackages.pluginURI = "null";

{
	var pack : org.eclipse.emf.ecore.EcorePackage =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.KerRichFactory)
 	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	f.setAccessible(true)
	f.set(pack, org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.KerRichFactory)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	k2.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	org.eclipse.emf.ecore.impl.EcorePackageImpl.init
}

{
	var pack : org2.kermeta.kompren.slicer.SlicerPackage = org2.kermeta.kompren.slicer.impl.SlicerPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org2.kermeta.kompren.slicer.SlicerPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org2.kermeta.kompren.slicer.SlicerPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory)
}


{
	var pack : org.OrgPackage = org.impl.OrgPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.OrgPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.OrgPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.KerRichFactory)
}


{
	var pack : org.kermeta.KmPackage = org.kermeta.impl.KmPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.KmPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.KmPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.KerRichFactory)
}


{
	var pack : org.kermeta.language.LanguagePackage = org.kermeta.language.impl.LanguagePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.KerRichFactory)
}


{
	var pack : org.kermeta.language.behavior.BehaviorPackage = org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior.KerRichFactory)
}


{
	var pack : org.kermeta.language.structure.StructurePackage = org.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory)
}


	 k2.utils.ReflexivityLoader.pref("org.kermeta.kompren.org.kermeta.kompren.slicer.compiler")

	 k2.utils.UTilScala.setScalaAspectPrefix("org.kermeta.kompren.org.kermeta.kompren.slicer.compiler")
}
def init4eclipse() : Unit = {
	org.eclipse.emf.ecore.impl.EcorePackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.KerRichFactory)
org2.kermeta.kompren.slicer.impl.SlicerPackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory)
org.impl.OrgPackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.KerRichFactory)
org.kermeta.impl.KmPackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.KerRichFactory)
org.kermeta.language.impl.LanguagePackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.KerRichFactory)
org.kermeta.language.behavior.impl.BehaviorPackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior.KerRichFactory)
org.kermeta.language.structure.impl.StructurePackageImpl.init().setEFactoryInstance(org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory)

	 k2.utils.ReflexivityLoader.pref("org.kermeta.kompren.org.kermeta.kompren.slicer.compiler")

	 k2.utils.UTilScala.setScalaAspectPrefix("org.kermeta.kompren.org.kermeta.kompren.slicer.compiler")
}
def main(args : Array[String]) : Unit = {
	 init() 
		org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)
	_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createKomprenCompiler.compile(args(0))
}
}
