import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import acm.AcmFactory;
import acm.AcmPackage;
import acm.Policy;
import acm.impl.AcmPackageImpl;

public class LoadModel {

	public static void main(String[] args) {
		
		AcmPackageImpl.init();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		ResourceSet rset = new ResourceSetImpl();
		URI u = URI.createURI("model/LibraryRBAC.xmi");
		//u = new URIConverterImpl().normalize(u);
		Resource resource = rset.getResource(u, true);
		
		Policy p = (Policy)resource.getContents().get(0);
		
		System.out.println("Policy name : " + p.getName());
		

	}
}
