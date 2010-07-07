package runner 
import java.io.PrintStream
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object MainRunner  {
def init() : Unit = {
	kermeta.persistence.EcorePackages.workspaceURI = ""
kermeta.persistence.EcorePackages.pluginURI = "";

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
	var pack : fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage = fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichFactory)
}


{
	var pack : fr.irisa.triskell.kermeta.language.structure.StructurePackage = fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory)
}

}
 def main(args : Array[String]) : Unit = {
	 init() 
	kermeta.ki.test.RichFactory.createTestFouquetsParser.main()
}
}
