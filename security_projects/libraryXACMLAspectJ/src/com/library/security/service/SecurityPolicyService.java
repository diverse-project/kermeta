/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 10:43:05
 */
package com.library.security.service;

import com.library.security.impl.LibrarySecurityModel;
import com.library.security.model.Authorization;
import com.library.security.model.SecurityModel;
import com.library.security.model.context.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.io.*
;

public class SecurityPolicyService implements SecurityPolicyServiceInterface {

    public SecurityModel securityModel;

    
    public static final String PERMISSION_AUTH = "Permission",
    PROHIBITION_AUTH = "Prohibition", OBLIGATION_AUTH = "Obligation" , UNDEFINED_AUTH = "Undefined";
      

    // used for test
    public ArrayList<Integer> colTestedRule = null;


    // number of tested rules
    public int nbRulesTestedPerm = 0;
    public int nbRulesTestedProhibit = 0;

    public int nbHighLevelRules = 7;


    public SecurityPolicyService(SecurityModel securityModel) {
        this.securityModel = securityModel;
        colTestedRule = new ArrayList<Integer>();

    }

    public String checkSecurityPolicy(Class role, Object activity, Class view, Context context) {

        Collection<Authorization> col = securityModel.getAuthorisations();
        Authorization authorization;

        String result;

        String[] authParams = new String[4];

        // get the parameters using the mapping
        authParams[0] = securityModel.roles.get(role);
        authParams[1] = securityModel.activities.get(activity);
        authParams[2] = securityModel.views.get(view);


        for (Iterator<Context> iterator = securityModel.contexts.keySet().iterator(); iterator.hasNext();) {
            Context context1 = iterator.next();

            if (context1.equals(context))
                context = context1;

        }

        authParams[3] = securityModel.contexts.get(context);

        result = securityModel.evaluateQueryAndGetResult(authParams[0],authParams[1],authParams[2],authParams[3]);

        // return XACML policy for inItial policy
        // if(securityModel.getIdSecurityPolicy() == 0)
         
        
        return result;
        // System.out.println("Rule -> " + authParams[0] + "," + authParams[1] + "," + authParams[2] + "," + authParams[3]);
        // System.out.println("\tResultat XACML -> " + resultXACML);

       /*
        for (int i = 0; i < authParams.length; i++)
            if (authParams[i] == null)
                throw new IllegalArgumentException("Wrong parameters cannot find its security model twins for " +
                        role + "," + activity + "," + view + "," + context);

        // look for rules with priority
        // search the rule
        for (Iterator<Authorization> iterAuth = col.iterator(); iterAuth.hasNext();) {
            authorization = iterAuth.next();
            if (authorization.isPrioritized() &&  compareAuthParameter(authorization, authParams)) {

                // result
                result = authorization.getAuthType();


                // for test infos
                if (!colTestedRule.contains(((ArrayList) col).indexOf(authorization))) {
                    colTestedRule.add(((ArrayList) col).indexOf(authorization));
                    if (result.equals("Permission"))
                        nbRulesTestedPerm++;
                    else
                        nbRulesTestedProhibit++;
                }


                // System.out.println("\tResult DB -> " + result);
                return result;
            }

        }

        // search the rule
        for (Authorization aCol : col) {
            authorization = aCol;
            if (compareAuthParameter(authorization, authParams)) {

                // result
                result = authorization.getAuthType();

                // for test infos
                if (!colTestedRule.contains(((ArrayList) col).indexOf(authorization))) {
                    colTestedRule.add(((ArrayList) col).indexOf(authorization));
                    if (result.equals("Permission"))
                        nbRulesTestedPerm++;
                    else
                        nbRulesTestedProhibit++;


                }

                // System.out.println("\tResult DB -> " + result);
                return result;


            }

        }


        // System.out.println("\tResult DB -> " + UNDEFINED_AUTH);        
        return UNDEFINED_AUTH;
        
        */
    }

    private boolean containsConflicts(Collection<Authorization> col, String[] authParams)  {

        Authorization authorization;
        int nb=0;

        for (Iterator<Authorization> iterator = col.iterator(); iterator.hasNext();) {
                  authorization = iterator.next();

                  if (compareAuthParameter(authorization, authParams)) {
                      nb++;
                  }
        }

         return nb > 1;
    }
    
    
    


    /**
     * Check if the parameters of aut are equal to those in authParams
     *
     * @param aut        the authorization
     * @param authParams list of params to check
     * @return true if it parameters matches
     */
    private boolean compareAuthParameter(Authorization aut, String[] authParams) {

        return aut.getRole().equalsIgnoreCase(authParams[0]) &&
                aut.getActivity().equalsIgnoreCase(authParams[1]) &&
                aut.getView().equalsIgnoreCase(authParams[2]) &&
                aut.getContext().equalsIgnoreCase(authParams[3]);

    }

    private String checkIfSuperRuleDefined(String[] authParams, Collection<Authorization> col) {

        Authorization authorization;
        String superActivity;

        superActivity = findSuperActivity(authParams[1]);

        if (superActivity == null)
            return null;

        authParams[1] = superActivity;


        for (Iterator<Authorization> iterator = col.iterator(); iterator.hasNext();) {
            authorization = iterator.next();

            if (compareAuthParameter(authorization, authParams)) {
                return authorization.getAuthType();
            }
        }


        return null;

    }

    
    
    /**
     * Modifies the XACMl configuration file by putting a new value for the policy file 
     * 
     * 
     * @param policyFile The the XACML policy file to put in the configuration file 
     * @param xacmlConfFile
     */
    public void switchXACMLPolicyFile(String policyFile , String xacmlConfFile) {
    	
    	String content, line;
    	
    	
    	
    	// load the policy configuration file
    	try {
			BufferedReader br = new BufferedReader(new FileReader(xacmlConfFile));
			
		
			// the content of the file read replace what needed
			content = "";
			line = br.readLine();
			while(line != null) {
				
				if(line.contains("<string>")) {
					
					line = "\t<string>" + policyFile + "</string>";
					
				}
				
				content += line + "\n";
				
				
				line = br.readLine();				
			}
			
			br.close();
			
			
			// writing the file
			PrintWriter pw = new PrintWriter(new FileWriter(xacmlConfFile));
			pw.println(content);
			
			pw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    	
    }

    private String findSuperActivity(String activity) {
        if (activity.equals(LibrarySecurityModel.BORROWBOOK) ||
                activity.equals(LibrarySecurityModel.GIVEBACKBOOK) ||
                activity.equals(LibrarySecurityModel.RESERVEBOOK))
            return LibrarySecurityModel.BORROWERACTIVITY;

        if (activity.equals(LibrarySecurityModel.FIXBOOK) ||
                activity.equals(LibrarySecurityModel.DELIVERBOOK))
            return LibrarySecurityModel.PERSONNELACTIVITY;

        return null;

    }
    
    
    public static void main(String[] args) {
    	
    	// SecurityPolicyService service = new SecurityPolicyService(new LibrarySecurityModel("xacml_configuration.xml"));
    	
    	// testing
    	// service.switchXACMLPolicyFile("xacml/lms-12.xml", "xacml_configuration.xml");
    	
    }


}
