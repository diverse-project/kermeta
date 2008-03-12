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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;

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
	OrBAC2XACMLUtils.builtXACMLFile(rules,fileName, "LMS System policy");
	 
	}
	
	/**
	 * produces and creates an XACML file for LMS
	 * 
	 */ 
	public static void createLMSPolicy() {
		
		String[][] rules = {
								
			{"R1","Permission", "Borrower",	"BorrowerActivity",	"Book",	"WorkingDays"},
			{"R2","Permission", "Student",	"BorrowerActivity",	"Book",	"WorkingDays"},
			{"R3","Permission", "Teacher",	"BorrowerActivity",	"Book",	"WorkingDays"},
			{"R4","Permission", "Borrower",	"BorrowBook",	"Book",	"WorkingDays"},
			{"R5","Permission", "Borrower",	"ReserveBook",	"Book",	"WorkingDays"},
			{"R6","Permission", "Borrower",	"GiveBackBook",	"Book",	"WorkingDays"},
			{"R7","Permission", "Student",	"BorrowBook",	"Book",	"WorkingDays"},
			{"R8","Permission", "Student",	"ReserveBook",	"Book",	"WorkingDays"},
			{"R9","Permission", "Student",	"GiveBackBook",	"Book",	"WorkingDays"},
			{"R10","Permission", "Teacher",	"BorrowBook",	"Book",	"WorkingDays"},
			{"R11","Permission", "Teacher",	"ReserveBook",	"Book",	"WorkingDays"},
			{"R12","Permission", "Teacher",	"GiveBackBook",	"Book",	"WorkingDays"},
			
			{"R13","Prohibition",	"Borrower",	"BorrowerActivity",	"Book",	"Holidays"},
			{"R14","Prohibition", "Student",	"BorrowerActivity",	"Book",	"Holidays"},
			{"R15","Prohibition", "Teacher",	"BorrowerActivity",	"Book",	"Holidays"},
			{"R16","Prohibition", "Borrower",	"BorrowBook",	"Book",	"Holidays"},
			{"R17","Prohibition", "Borrower",	"ReserveBook",	"Book",	"Holidays"},
			{"R18","Prohibition", "Borrower",	"GiveBackBook",	"Book",	"Holidays"},
			{"R19","Prohibition", "Student",	"BorrowBook",	"Book",	"Holidays"},
			{"R20","Prohibition", "Student",	"ReserveBook",	"Book",	"Holidays"},
			{"R21","Prohibition", "Student",	"GiveBackBook",	"Book",	"Holidays"},
			{"R22","Prohibition", "Teacher",	"BorrowBook",	"Book",	"Holidays"},
			{"R23","Prohibition", "Teacher",	"ReserveBook",	"Book",	"Holidays"},
			{"R24","Prohibition", "Teacher",	"GiveBackBook",	"Book",	"Holidays"},
			
			{"R25","Permission",	"Administrator",	"ManageAccess",	"PersonnelAccount",	"default"},
			{"R26","Permission",	"Administrator",	"CreateAccount",	"BorrowerAccount",	"default"},
			{"R27","Permission",	"Administrator",	"ModifyAccount",	"BorrowerAccount",	"default"},
			{"R28","Permission",	"Administrator",	"ConsultBorrowerAccount",	"BorrowerAccount",	"default"},
			{"R29","Permission",	"Administrator",	"FixBook",	"Book",	"MaintenanceDay"},
			{"R30","Permission",	"Administrator",	"DeliverBook",	"Book",	"MaintenanceDay"},
			{"R31","Prohibition",	"Secretary",	"ManageAccess",	"PersonnelAccount",	"default"},
			{"R32","Prohibition",	"Secretary",	"CreateAccount",	"BorrowerAccount",	"default"},
			{"R33","Prohibition",	"Secretary",	"ModifyAccount",	"BorrowerAccount",	"default"},
			{"R34","Permission",	"Secretary",	"ConsultBorrowerAccount",	"BorrowerAccount",	"default"},
			{"R35","Permission",	"Secretary",	"FixBook",	"Book",	"MaintenanceDay"},
			{"R36","Permission",	"Secretary",	"DeliverBook",	"Book",	"MaintenanceDay"},
			{"R37","Permission",	"Director",	"ConsultBorrowerAccount",	"BorrowerAccount",	"default"},
			{"R38","Prohibition",	"Director",	"ManageAccess",	"PersonnelAccount",	"default"},
			{"R39","Prohibition",	"Director",	"CreateAccount",	"BorrowerAccount",	"default"},
			{"R40","Prohibition",	"Director",	"ModifyAccount",	"BorrowerAccount",	"default"},
			{"R41","Permission",	"Director",	"FixBook",	"Book",	"MaintenanceDay"},
			{"R42","Permission",	"Director",	"DeliverBook",	"Book",	"MaintenanceDay"}
		};
		
		
		
		// export to the LMS XACML policy file
		OrBAC2XACMLUtils.builtXACMLFile(rules,"lms.xml", "LMS System Policy");
		
	}
	
	
    /**
     * Create policies from a hashMap contains a policy by entry
     * @param policies the set of policies to export to XACML files
     */
    public static void createPolicies(Map<String,String[][]> policies) {

        String policyDescription;
        String[][] rules;
        int i = 0;


        for (Iterator iterator = policies.keySet().iterator(); iterator.hasNext();i++) {

        policyDescription = (String) iterator.next();
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


        // init
        colPolicies = new HashMap<String, String[][]>();


        try {

            // read the file and store the policies
            br = new BufferedReader(new FileReader(fileName));
            line = br.readLine();

            while(line != null) {


                if(line.startsWith("POLICY")) {

                    // get the block of policy and extracts rules
                   policyInfo = line;
                  
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

            // get the name
            rulesTmp[i][0] = rule.substring(2, rule.indexOf(" -> "));

            // the status
            rulesTmp[i][1] = rule.substring(rule.indexOf(" -> ") + 4,rule.indexOf("( "));

            // role if after the organisation
            org  = rule.substring(rule.indexOf(" ",rule.indexOf(" ",rule.indexOf("( "))) + 1,
                    rule.indexOf(" ",rule.indexOf("( ") + 2));

            // the role
            bIndex = rule.indexOf(" ",rule.indexOf(org)) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][2] = rule.substring(bIndex, eIndex);

            // activity
            bIndex = rule.indexOf(" ",rule.indexOf(rulesTmp[i][2])) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][3] = rule.substring(bIndex, eIndex);

            // view
            bIndex = rule.indexOf(" ",rule.indexOf(rulesTmp[i][3])) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][4] = rule.substring(bIndex, eIndex);

            // context
             bIndex = rule.indexOf(" ",rule.indexOf(rulesTmp[i][4])) + 1;
            eIndex = rule.indexOf(" ", bIndex);
            rulesTmp[i][5] = rule.substring(bIndex, eIndex);

        }


        return rulesTmp;

    }


    public static void main(String[] args) {
		
		
    	Map<String,String[][]> policies = readPoliciesFromFile("Mutants.txt");
		createPolicies(policies);
		
		/*
		// load the policy
		Policy policy = loadPolicyFromXMIFile("model/LibraryOrBAC.xmi");
		
		// export it to XACML
		exportPolicyToXACML(policy, "library.xml");
		System.out.println("Policy name : " + policy.getName());
		*/

	}
}
