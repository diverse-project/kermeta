import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import acm.Policy;
import acm.Rule;
import acm.impl.AcmPackageImpl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;

public class OrBAC2XACMLExport {
	
	
	public static final String initialPolicyInfo = "initial policy";
	
	
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
				 orRules.get(i).getParameters().get(1).getName(),
				 orRules.get(i).getParameters().get(2).getName(),
				 orRules.get(i).getParameters().get(3).getName(),
				 orRules.get(i).getParameters().get(4).getName()};
			 
		// for debug -- print the added rules
		//System.out.println(orRules.get(i).getName() + " " +
		//		 rStatus + " " +
		//		 orRules.get(i).getParameters().get(1).getName() + " " +
		//		 orRules.get(i).getParameters().get(2).getName() + " " +
		//		 orRules.get(i).getParameters().get(3).getName() + " " +
		//		 orRules.get(i).getParameters().get(4).getName()); 
		 
	 }
	
	// export to the generated file
	OrBAC2XACMLUtils.builtXACMLFile(rules,fileName, "LMS System policy");
	 
	}
			
    /**
     * Create policies from a hashMap contains a policy by entry
     * @param policies the set of policies to export to XACML files
     */
    public static void createPolicies(Map<String,String[][]> policies) {

        String policyDescription;
        String[][] rules;
        int i = 1;

        // firstly create the initial policy
        OrBAC2XACMLUtils.builtXACMLFile(policies.get(initialPolicyInfo),"xacml/lms-" + 0 + ".xml", initialPolicyInfo);
        
        // remove the initial policy and write the other mutants
        policies.remove(initialPolicyInfo);
        

        for (Iterator<String> iterator = policies.keySet().iterator(); iterator.hasNext();i++) {

        policyDescription = iterator.next();
        rules = policies.get(policyDescription);

        // export to the LMS XACML policy file
		OrBAC2XACMLUtils.builtXACMLFile(rules,"xacml/lms-" + i + ".xml", policyDescription); 
        }

    }
	
	 /**
     * Return a collections of policies with a name (a mall description and  
     * each policy contains the rules with each row the list of the parameters of the rule beginnig
     * with its name
     * @param fileName the name of the text file
     * @return The collection of policies
     */
    private static Map<String,String[][]> readPoliciesFromFile(String fileName) {

        Map<String,String[][]> colPolicies;

        BufferedReader br;
        ArrayList<String> rulesText;
        String line,policyInfo;
        boolean firstPolicy;


        // init
        colPolicies = new HashMap<String, String[][]>();


        try {

            // read the file and store the policies
            br = new BufferedReader(new FileReader(fileName));
            line = br.readLine();
            firstPolicy = true;

            while(line != null) {


                if(line.startsWith("POLICY")) {

                	// the first policy is the initial policy
                	if(firstPolicy) {
                		
                		policyInfo = initialPolicyInfo;
                		firstPolicy = false;
                	}
                	else {
                    // get the block of policy and extracts rules
                   policyInfo = line;
                   
                	}
                  
                   rulesText = new ArrayList<String>();

                   while(!line.equals("")){
                        line = br.readLine();
                        if(!line.equals("")) rulesText.add(line);

                    }

                    colPolicies.put(policyInfo,extractRules(rulesText));
                    

                }


                line = br.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return colPolicies;
    }

    /**
     *
     * @param rulesText the list containing the rules written in plain text
     * @return and array containing the rules
     */
    private static String[][] extractRules(ArrayList<String> rulesText) {

        String[][] rulesTmp;
        String rule;
        String org;
        int i,bIndex,eIndex;


        rulesTmp = new String[rulesText.size()][6];

        // extracting rules
        i = 0;
        for (Iterator<String> iterator = rulesText.iterator(); iterator.hasNext();i++) {
            rule = iterator.next();
            // System.out.println("i => " + i + " " + rule);

            // get the name
            rulesTmp[i][0] = rule.substring(2, rule.indexOf(" -> "));

            // the status
            rulesTmp[i][1] = rule.substring(rule.indexOf(" -> ") + 4,rule.indexOf("( "));

            // role if after the organization
            org  = rule.substring(rule.indexOf(" ",rule.indexOf(" ",rule.indexOf("( "))) + 1,
                    rule.indexOf(" ",rule.indexOf("( ") + 2));

            // the role
            bIndex = rule.indexOf(" ",rule.indexOf(org)) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][2] = rule.substring(bIndex, eIndex);
            
            // activity
            bIndex = rule.indexOf(" ",rule.indexOf(" " + rulesTmp[i][2]) + 1) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][3] = rule.substring(bIndex, eIndex);

            // view
            bIndex = rule.indexOf(" ",rule.indexOf(" " + rulesTmp[i][3]) + 1) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][4] = rule.substring(bIndex, eIndex);

            // context
             bIndex = rule.indexOf(" ",rule.indexOf(" " + rulesTmp[i][4]) + 1 ) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][5] = rule.substring(bIndex, eIndex);

        }

        return rulesTmp;

    }


    public static void main(String[] args) {
		
		System.out.println("Generating policies files...");
    	Map<String,String[][]> policies = readPoliciesFromFile("Mutants.txt");
		createPolicies(policies);
		System.out.println("Done");
		
		/*
		// load the policy
		Policy policy = loadPolicyFromXMIFile("model/LibraryOrBAC.xmi");
		
		// export it to XACML
		exportPolicyToXACML(policy, "library.xml");
		System.out.println("Policy name : " + policy.getName());
		*/

	}
}
