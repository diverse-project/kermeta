package runner 
import java.io.PrintStream
object MainRunner  extends fr.irisa.triskell.scala.generated.fw.ImplicitConversion{
def main(args : Array[String]) : Unit = {
	System.setOut(new PrintStream("outputStream"));
kermeta.persistence.EcorePackages.workspaceURI = "/home/barais/workspaces/kermetaCompilerRuntime2/"
kermeta.persistence.EcorePackages.pluginURI = "/local/hudson_kermeta/jobs/KermetaCompilerV2_TestCase/workspace/"
//kermeta.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getNsURI,org.eclipse.emf.ecore.impl.EcorePackageImpl.init())
//org.eclipse.emf.ecore.EcorePackage.eINSTANCE.setEFactoryInstance(org.eclipse.emf.ecoreScalaAspect.RichFactory)
		 var c : java.lang.reflect.Constructor[_] = classOf[org.eclipse.emf.ecore.impl.EcorePackageImpl].getDeclaredConstructors.first
		 c.setAccessible(true); // solution
     
//		org.eclipse.emf.ecore.impl.EcoreFactoryImpl 
	    var pack : org.eclipse.emf.ecore.impl.EcorePackageImpl =     c.newInstance().asInstanceOf[org.eclipse.emf.ecore.impl.EcorePackageImpl]
		pack.setEFactoryInstance(org.eclipse.emf.ecoreScalaAspect.RichFactory)	
		var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
	    f.setAccessible(true)
	    f.set(pack, org.eclipse.emf.ecoreScalaAspect.RichFactory)
		//println(pack.setEco)
	    org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI, pack)
		kermeta.persistence.EcorePackages.getPacks().put(org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)
		org.eclipse.emf.ecore.impl.EcorePackageImpl.init
		
	    //pack.createPackageContents()
	    //pack.initializePackageContents()
		// Mark meta-data to indicate it can't be changed
	//	pack.freeze()
		// Update the registry and return the package
		//	org.eclipse.emf.ecore.EcorePackage.eINSTANCE.setEFactoryInstance(org.eclipse.emf.ecoreScalaAspect.RichFactory)		

		EcoreHelpers.RichFactory.createMain.main
} 
}
