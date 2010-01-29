package runner 
import java.io.PrintStream
object MainRunner  extends fr.irisa.triskell.scala.generated.fw.ImplicitConversion{
def main(args : Array[String]) : Unit = {
	System.setOut(new PrintStream("outputStream"));
kermeta.persistence.EcorePackages.workspaceURI = "/home/barais/workspaces/kermetaCompilerRuntime2/"
kermeta.persistence.EcorePackages.pluginURI = "/local/hudson_kermeta/jobs/KermetaCompilerV2_TestCase/workspace/";

{
	var c : java.lang.reflect.Constructor[_] = classOf[org.eclipse.emf.ecore.impl.EcorePackageImpl].getDeclaredConstructors.first
	c.setAccessible(true);
	var pack : org.eclipse.emf.ecore.impl.EcorePackageImpl =  c.newInstance().asInstanceOf[org.eclipse.emf.ecore.impl.EcorePackageImpl]
 	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	f.setAccessible(true)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
}

{ 
	var pack : fr.irisa.triskell.kermeta.language.LanguagePackage = fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl.init
	//pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.structureScalaAspect.RichFactory)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.LanguagePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.LanguagePackage.eNS_URI, pack)
	pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.structureScalaAspect.RichFactory)
}


{ 
	var pack : fr.irisa.triskell.kermeta.language.structure.StructurePackage = fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl.init
	//pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.structureScalaAspect.RichFactory)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.eNS_URI, pack)
	pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.structureScalaAspect.RichFactory)
}
{
	var pack : fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage = fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	//pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichFactory)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.eNS_URI, pack)
	pack.setEFactoryInstance(fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichFactory)

	
}

{	
	var c : java.lang.reflect.Constructor[_] = classOf[fr.irisa.triskell.kermeta.impl.KmPackageImpl].getDeclaredConstructors.first
	c.setAccessible(true);
	var pack : fr.irisa.triskell.kermeta.impl.KmPackageImpl =  c.newInstance().asInstanceOf[fr.irisa.triskell.kermeta.impl.KmPackageImpl]
	pack.setEFactoryInstance(fr.irisa.triskell.kermetaScalaAspect.RichFactory)
 	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	f.setAccessible(true)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.KmPackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.KmPackage.eNS_URI, pack)
	fr.irisa.triskell.kermeta.impl.KmPackageImpl.init
}

{	
	var c : java.lang.reflect.Constructor[_] = classOf[fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl].getDeclaredConstructors.first
	c.setAccessible(true);
	var pack : fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl =  c.newInstance().asInstanceOf[fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl]
	pack.setEFactoryInstance(fr.irisa.triskell.kermeta.languageScalaAspect.RichFactory)
 	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	f.setAccessible(true)
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.LanguagePackage.eNS_URI, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.LanguagePackage.eNS_URI, pack)
	fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl.init
}

test.resource.testCases.LoadSaveKm.RichFactory.createLoadKm.LoadKmTest

}

}