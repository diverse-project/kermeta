import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import acm.AcmFactory;
import acm.AcmPackage;
import acm.Policy;
import acm.Rule;
import acm.impl.AcmPackageImpl;

public class OrBAC2XACMLExport {
	
	
	
	public static Policy loadPolicyFromXMIFile(String file) {
		
		Policy policy;
		
		AcmPackageImpl.init();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		ResourceSet rset = new ResourceSetImpl();
		
		URI u = URI.createURI(file);
		//u = new URIConverterImpl().normalize(u);
		Resource resource = rset.getResource(u, true);
		
		policy = (Policy)resource.getContents().get(0);
		
		return policy;
	}
	
	/**
	 * Exports an orbac policy to XACML and generates the XACML file  
	 * @param policy
	 * @param fileName
	 */
	public static void exportPolicyToXACML(Policy policy, String fileName) {
		
		
	 EList<Rule> orRules =	policy.getRules();
	 
	 String[][] rules = new String[orRules.size()][6];
	 
	 for(int i=0; i < orRules.size(); i++) {
		
		 char status = orRules.get(i).getType().toString().charAt(orRules.get(i).getType().toString().length()-2);
			String rStatus = status == '0'? "permission":"prohibition";
		
		 rules[i] = new String[]{orRules.get(i).getName(),
				 rStatus,
				 orRules.get(i).getParameters().get(0).getName(),
				 orRules.get(i).getParameters().get(0).getName(),
				 orRules.get(i).getParameters().get(0).getName(),
				 orRules.get(i).getParameters().get(0).getName()};
			 
		// for debug -- print the added rules
		//System.out.println(orRules.get(i).getName() + " " +
		//		 rStatus + " " +
		//		 orRules.get(i).getParameters().get(1).getName() + " " +
		//		 orRules.get(i).getParameters().get(2).getName() + " " +
		//		 orRules.get(i).getParameters().get(3).getName() + " " +
		//		 orRules.get(i).getParameters().get(4).getName()); 
		 
	 }
	
	// export to the generated file
	OrBAC2XACMLUtils.builtXACMLFile(rules,fileName);
	 
	}

	public static void main(String[] args) {
		
		// load the policy
		Policy policy = loadPolicyFromXMIFile("model/LibraryOrBAC.xmi");
		
		// export it to XACML
		exportPolicyToXACML(policy, "library.xml");
		System.out.println("Policy name : " + policy.getName());
		

	}
}
