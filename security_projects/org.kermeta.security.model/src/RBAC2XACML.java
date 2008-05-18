import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;


public class RBAC2XACML {
	
public static final String initialPolicyInfo = "initial policy";
	
    /**
     * Create policies from a hashMap contains a policy by entry
     * @param policies the set of policies to export to XACML files
     */
    public static void createPolicies(Map<String,String[][]> policies) {

        String policyDescription;
        String[][] rules;
        int i = 1;

        // firstly create the initial policy
        RBAC2XACMLUtils.builtXACMLFile(policies.get(initialPolicyInfo),"xacml/lms-" + 0 + ".xml", initialPolicyInfo);
        
        // remove the initial policy and write the other mutants
        policies.remove(initialPolicyInfo);
        

        for (Iterator<String> iterator = policies.keySet().iterator(); iterator.hasNext();i++) {

        policyDescription = iterator.next();
        rules = policies.get(policyDescription);

        // export to the LMS XACML policy file
		RBAC2XACMLUtils.builtXACMLFile(rules,"xacml/lms-" + i + ".xml", policyDescription); 
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

        int i;
        StringTokenizer st;


        rulesTmp = new String[rulesText.size()][6];

        // extracting rules
        i = 0;
        for (Iterator<String> iterator = rulesText.iterator(); iterator.hasNext();i++) {
            rule = iterator.next();
            
            st = new StringTokenizer(rule," ");
            
            // the rule name
            rulesTmp[i][0] = st.nextToken();
            
            st.nextToken();
            st.nextToken();
            
            // role
            rulesTmp[i][1] = st.nextToken();
            
            // permission
            rulesTmp[i][2] = st.nextToken();
            
            // context
            rulesTmp[i][3] = st.nextToken();
            
            // Debug
            // System.out.println(rulesTmp[i][0] + " : RP( " +  rulesTmp[i][1] + " , " + rulesTmp[i][2] + " , " + rulesTmp[i][3] + ")");
          }

        return rulesTmp;

    }


    public static void main(String[] args) {
		
		System.out.println("Generating policies files...");
    	Map<String,String[][]> policies = readPoliciesFromFile("Mutants_LMSinRBAC.txt");
		createPolicies(policies);
		System.out.println("Done");
		
	}

}
