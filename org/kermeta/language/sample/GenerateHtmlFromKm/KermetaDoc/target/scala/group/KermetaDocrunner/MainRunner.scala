package group.KermetaDocrunner 
import java.io.PrintStream
import ScalaImplicit.group.KermetaDoc.ImplicitConversion._
object MainRunner  {
	def init() : Unit = {
		k2.persistence.EcorePackages.workspaceURI = "null"
		k2.persistence.EcorePackages.pluginURI = "null";

		{
			var pack : org.OrgPackage = org.impl.OrgPackageImpl.init
			org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.OrgPackage.`eNS_URI`, pack)
			k2.persistence.EcorePackages.getPacks().put(org.OrgPackage.`eNS_URI`, pack)
			pack.setEFactoryInstance(group.KermetaDoc.org.KerRichFactory)
		}


		{
			var pack : org.kermeta.KmPackage = org.kermeta.impl.KmPackageImpl.init
			org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.KmPackage.`eNS_URI`, pack)
			k2.persistence.EcorePackages.getPacks().put(org.kermeta.KmPackage.`eNS_URI`, pack)
			pack.setEFactoryInstance(group.KermetaDoc.org.kermeta.KerRichFactory)
		}


		{
			var pack : org.kermeta.language.LanguagePackage = org.kermeta.language.impl.LanguagePackageImpl.init
			org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
			k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
			pack.setEFactoryInstance(group.KermetaDoc.org.kermeta.language.KerRichFactory)
		}


		{
			var pack : org.kermeta.language.behavior.BehaviorPackage = org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
			org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
			k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
			pack.setEFactoryInstance(group.KermetaDoc.org.kermeta.language.behavior.KerRichFactory)
		}


		{
			var pack : org.kermeta.language.structure.StructurePackage = org.kermeta.language.structure.impl.StructurePackageImpl.init
			org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
			k2.persistence.EcorePackages.getPacks().put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
			pack.setEFactoryInstance(group.KermetaDoc.org.kermeta.language.structure.KerRichFactory)
		}


		 _root_.k2.utils.ReflexivityLoader.pref("group.KermetaDoc")

		 _root_.k2.utils.UTilScala.setScalaAspectPrefix("group.KermetaDoc")
	}
	def init4eclipse() : Unit = {
			org.impl.OrgPackageImpl.init().setEFactoryInstance(group.KermetaDoc.org.KerRichFactory)
		org.kermeta.impl.KmPackageImpl.init().setEFactoryInstance(group.KermetaDoc.org.kermeta.KerRichFactory)
		org.kermeta.language.impl.LanguagePackageImpl.init().setEFactoryInstance(group.KermetaDoc.org.kermeta.language.KerRichFactory)
		org.kermeta.language.behavior.impl.BehaviorPackageImpl.init().setEFactoryInstance(group.KermetaDoc.org.kermeta.language.behavior.KerRichFactory)
		org.kermeta.language.structure.impl.StructurePackageImpl.init().setEFactoryInstance(group.KermetaDoc.org.kermeta.language.structure.KerRichFactory)

	 _root_.k2.utils.ReflexivityLoader.pref("group.KermetaDoc")

	 _root_.k2.utils.UTilScala.setScalaAspectPrefix("group.KermetaDoc")
	}
	def main(args : Array[String]) : Unit = {
		//read system.property for an optional urimap file that need to be loaded
		val urimapFileLocation = sys.props.get("urimap.file.location")
		urimapFileLocation match {
			case Some(location) => println("urimap.file.location=" + location)
				val fis = new java.io.FileInputStream(location)
				val props = new java.util.Properties().load(fis)
				fis.close
				//TODO send map entries to the URIMap
			case None => 
		}
		init() 
		try {
			_root_.mainpackage.KerRichFactory.createMainClass.mainOperation()
		} catch {
			 case e :_root_.k2.exceptions.Exception => println("Exception caught "+e+" "+e.message) 
				 if(e.getCause != null) {e.getCause.printStackTrace()} else {e.printStackTrace()}
			 case e => println("Exception caught "+e)
				 e.printStackTrace()
		}
	}
}
