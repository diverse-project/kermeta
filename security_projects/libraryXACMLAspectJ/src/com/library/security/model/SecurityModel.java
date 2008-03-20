package com.library.security.model;

import com.library.security.model.context.Context;
import com.library.security.util.XACMLUtils;
import com.sun.xacml.PDP;
import com.sun.xacml.ParsingException;
import com.sun.xacml.UnknownIdentifierException;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.ResponseCtx;
import com.sun.xacml.ctx.Result;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.net.URISyntaxException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 10:44:03
 */
public abstract class SecurityModel implements SecurityModelInterface {

    protected static final int DEFAULT_SECURITY_POLICY_ID = 0;
    private int idSecurityPolicy;

    public static String connectionString = "jdbc:mysql://localhost:3306/library",
            rulesTable = "ORBAC_SECURITY_POLICY", infoTable = "mutant_info";

    public Map<Class, String> roles;
    public Map<Method[], String> activities;
    public Map<Class, String> views;
    public Map<Context, String> contexts;

    // map between activities and services
    public Map<Method[], Class> activitiesServices;


    private Connection connectionDB;
    private String MYSQL_DRIVER = "com.mysql.jdbc.Driver";


    protected Collection<Authorization> authorizations;

    protected PDP pdp;


    public String mutantInfo;
    public boolean isMutantWithConflicts;


    public SecurityModel() {
        this(DEFAULT_SECURITY_POLICY_ID);
    }


    /**
     * Initialize policy from an XACML file
     * @param xacmlConfFile the XACMl file
     */
    public SecurityModel(String xacmlConfFile,String xacmlPolicyFile) {

    	// init pdp
        try {
            pdp = XACMLUtils.createPDP(xacmlConfFile);
            
            
        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (UnknownIdentifierException e) {
            e.printStackTrace();
        }
        
        // init info
        mutantInfo = readPolicyInfo(xacmlPolicyFile);

    }


    public String evaluateQueryAndGetResult(String role, String activity, String view, String context) {

        RequestCtx req = null;
        try {
            req = XACMLUtils.createRequest(role, activity, view, context);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // get the response
        ResponseCtx response = pdp.evaluate(req);
        
        Result res = (Result) response.getResults().iterator().next();

        String result = null;

        if((res.getDecision() == Result.DECISION_PERMIT))
            result = "Permission";
        else if((res.getDecision() == Result.DECISION_DENY))
            result = "Prohibition";
        else
            result = "Undefined";

        return result;

    }

    public SecurityModel(int secId) {

        idSecurityPolicy = secId;

        // init connection
        initDBConnection();

        // load rules
        loadSecurityRules();

    }

    public void loadSecurityRules() {

        Statement statement;
        String query;
        ResultSet resultSet;
        Authorization auth;


        try {

            // default value if false
            // prepares the query
            query = "SELECT * FROM " + rulesTable + " WHERE ID_MUTANT = " + idSecurityPolicy;

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);


            authorizations = new ArrayList<Authorization>();

            // tell that  mutant contains conflicts  that were fixed using priorities
            isMutantWithConflicts = false;

            while (resultSet.next()) {
                auth = createAuthFromRS(resultSet);

                // store the auth
                authorizations.add(auth);

                // check if policy contains conflicts  that were fixed using priorities
                if(auth.isPrioritized())
                isMutantWithConflicts = true;
            }

            // load info about the security policy
            query = "SELECT info FROM " + infoTable + " WHERE MUTANT_ID = " + idSecurityPolicy;

            // run it and get results
            resultSet = statement.executeQuery(query);

            if (resultSet.next())
                mutantInfo = resultSet.getString("info");
            else
                mutantInfo = "";

            // closing
            statement.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private Authorization createAuthFromRS(ResultSet rs) throws SQLException {
        return new Authorization(rs.getString("AUTH_TYPE"),
                rs.getString("ORGANISATION"),
                rs.getString("ROLE"),
                rs.getString("ACTIVITY"),
                rs.getString("VIEW"),
                rs.getString("CONTEXT"),
                rs.getString("PRIORITY").equals("1")
        );

    }

    private void initDBConnection() {


        try {

            String password;
            // read from pass file
            BufferedReader br = new BufferedReader(new FileReader("pass"));
            password = br.readLine();
            br.close();

            //Register the JDBC driver for Database.
            Class.forName(MYSQL_DRIVER);

            // init conncetion
            connectionDB = DriverManager.getConnection(connectionString, "root", password);

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public abstract void defineSecurityModelMapping();

    public abstract void initMapping();


    public Collection<Authorization> getAuthorisations() {
        return authorizations;
    }


    public int getIdSecurityPolicy() {
        return idSecurityPolicy;
    }

    public void setIdSecurityPolicy(int idSecurityPolicy) {
        this.idSecurityPolicy = idSecurityPolicy;
    }
    
    
    /**
     * Reads the description from the policy file
     * @param xacmlPolicyFile
     * @return
     */
    private String readPolicyInfo(String xacmlPolicyFile) {

        Document doc;
        String description = null;
    

    	
		try {
	        
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			doc = docBuilder.parse (new File(xacmlPolicyFile));
			
			 // normalize text representation
	        doc.getDocumentElement ().normalize ();
	                   
	        description = doc.getElementsByTagName("Description").item(0).getTextContent();

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

       return description;
    	
    }
    
    
}
