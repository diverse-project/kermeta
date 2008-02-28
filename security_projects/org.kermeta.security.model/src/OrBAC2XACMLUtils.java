import com.sun.xacml.*;
import com.sun.xacml.attr.AttributeDesignator;
import com.sun.xacml.attr.AttributeValue;
import com.sun.xacml.attr.StringAttribute;
import com.sun.xacml.combine.*;
import com.sun.xacml.cond.Apply;
import com.sun.xacml.cond.Function;
import com.sun.xacml.cond.FunctionFactory;
import com.sun.xacml.ctx.*;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * User: tej
 * Date: 25 févr. 2008
 * Time: 09:25:19
 */
public class OrBAC2XACMLUtils {

// ---------------------------------------------- Policy builder

    /**
     * Simple helper routine that creates a TargetMatch instance.
     *
     * @param type       the type of match
     * @param functionId the matching function identifier
     * @param designator the AttributeDesignator used in this match
     * @param value      the AttributeValue used in this match
     * @return the matching element
     */
    private static TargetMatch createTargetMatch(int type, String functionId,
                                                AttributeDesignator designator,
                                                AttributeValue value) {

            FunctionFactory factory;
            Function function = null;

        try {
            // get the factory that handles Target functions and get an
            // instance of the right function

            factory = FunctionFactory.getTargetInstance();
            function = factory.createFunction(functionId);


        } catch (Exception e) {
           e.printStackTrace();
        }

         return new TargetMatch(type, function, designator, value);
    }


    /**
     * Creates the Targetused in the Condition. This Target specifies that
     *
     * @return the target the rule target
     * @throws URISyntaxException if there is a problem with any of the URIs
     * @param role the subject Role
     * @param activity the given activity
     * @param view the given view
     */
    private static Target createRuleTarget(String role, String activity, String view) throws URISyntaxException {

        List subjects = new ArrayList();
        List resources = new ArrayList();
        List actions = new ArrayList();

        // creates the subject section
        List subject = new ArrayList();

        String subjectMatchId =
                "urn:oasis:names:tc:xacml:1.0:function:string-equal";

        URI subjectDesignatorType =
                new URI("http://www.w3.org/2001/XMLSchema#string");
        URI subjectDesignatorId =
                new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id");
        AttributeDesignator subjectDesignator =
                new AttributeDesignator(AttributeDesignator.SUBJECT_TARGET,
                        subjectDesignatorType,
                        subjectDesignatorId, false);

        StringAttribute subjectValue = new StringAttribute(role);

        subject.add(createTargetMatch(TargetMatch.SUBJECT, subjectMatchId,
                subjectDesignator, subjectValue));
        subjects.add(subject);

        // creates the Resource section
        List resource = new ArrayList();

        String resourceMatchId =
                "urn:oasis:names:tc:xacml:1.0:function:string-equal";

        URI resourceDesignatorType =
                new URI("http://www.w3.org/2001/XMLSchema#string");
        URI resourceDesignatorId =
                new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id");
        AttributeDesignator resourceDesignator =
                new AttributeDesignator(AttributeDesignator.RESOURCE_TARGET,
                        resourceDesignatorType,
                        resourceDesignatorId, false);

        StringAttribute resourceValue = new StringAttribute(view);

        resource.add(createTargetMatch(TargetMatch.RESOURCE, resourceMatchId,
                resourceDesignator, resourceValue));
        resources.add(resource);

        // create the Action section
        List action = new ArrayList();

        String actionMatchId =
                "urn:oasis:names:tc:xacml:1.0:function:string-equal";

        URI actionDesignatorType =
                new URI("http://www.w3.org/2001/XMLSchema#string");
        URI actionDesignatorId =
                new URI("urn:oasis:names:tc:xacml:1.0:action:action-id");
        AttributeDesignator actionDesignator =
                new AttributeDesignator(AttributeDesignator.ACTION_TARGET,
                        actionDesignatorType,
                        actionDesignatorId, false);

        StringAttribute actionValue = new StringAttribute(activity);

        action.add(createTargetMatch(TargetMatch.ACTION, actionMatchId,
                actionDesignator, actionValue));

        // put the Action section in the Actions list
        actions.add(action);

        // create & return the new Target
        return new Target(subjects, resources, actions);
    }

    /**
     * Creates the Condition used in the Rule. Note that a Condition is just a
     * special kind of Apply.
     *
     * @param context the rule's context
     *
     * @return the condition
     * @throws URISyntaxException if there is a problem with any of the URIs
     */
    private static Apply createRuleCondition(String context) throws URISyntaxException {
        List conditionArgs = new ArrayList();

        // get the function that the condition uses
        FunctionFactory factory = FunctionFactory.getConditionInstance();
        Function conditionFunction;
        try {
            conditionFunction =
                    factory.createFunction("urn:oasis:names:tc:xacml:1.0:function:"
                            + "string-equal");
        } catch (Exception e) {
            // see comment in createTargetMatch()
            return null;
        }

        // now create the apply section that gets the designator value
        List applyArgs = new ArrayList();

        factory = FunctionFactory.getGeneralInstance();
        Function applyFunction = null;
        try {
            applyFunction =
                    factory.createFunction("urn:oasis:names:tc:xacml:1.0:function:"
                            + "string-one-and-only");
        } catch (Exception e) {
            e.printStackTrace();
        }

        URI designatorType =
                new URI("http://www.w3.org/2001/XMLSchema#string");
        URI designatorId =
                new URI("current-context");
        URI designatorIssuer =
                new URI("admin");
        AttributeDesignator designator =
                new AttributeDesignator(AttributeDesignator.ENVIRONMENT_TARGET, // <-----------------------------------------
                        designatorType, designatorId, false,
                        designatorIssuer);
        applyArgs.add(designator);

        Apply apply = new Apply(applyFunction, applyArgs, false);

        // add the new apply element to the list of inputs to the condition
        conditionArgs.add(apply);

        // create an AttributeValue and add it to the input list
        StringAttribute value = new StringAttribute(context);
        conditionArgs.add(value);

        // finally, create & return our Condition
        return new Apply(conditionFunction, conditionArgs, true);
    }

    /**
     * Creates the Rule used in the Policy.
     *
     * @return the rule with given parameters
     * @throws URISyntaxException if there is a problem with any of the URIs
     * @param ruleIdentifier the name give nt to the rule
     * @param status whether a permission or a prohibition
     * @param role the rule's role
     * @param activity the activity to use
     * @param view the view to use
     * @param context the context to use
     */
    private static Rule createRule(String ruleIdentifier, String status, String role, String activity, String view, String context) throws URISyntaxException {
        // define the identifier for the rule
        URI ruleId = new URI(ruleIdentifier);

        // define the effect for the Rule
        int effect = Result.DECISION_PERMIT;

        if (status.equalsIgnoreCase("prohibition"))
            effect = Result.DECISION_DENY;

        // get the Target for the rule
        Target target = createRuleTarget(role, activity, view);

        // get the Condition for the rule
        Apply condition = createRuleCondition(context);

        return new Rule(ruleId, effect, null, target, condition);
    }


    private static PolicySet createPolicySet(List rules) throws URISyntaxException, UnknownIdentifierException {

        PolicySet policySet;

        // define the identifier for the policy
        URI policyId = new URI("LMSPolicy");

        // get the combining algorithm for the policy
        URI combiningAlgId = new URI(OrderedPermitOverridesRuleAlg.algId);
        CombiningAlgFactory factory = CombiningAlgFactory.getInstance();
        RuleCombiningAlgorithm combiningAlg =
                (RuleCombiningAlgorithm) (factory.createAlgorithm(combiningAlgId));

        // add a description for the policy
        String description =
                "This policy applies to the LMS system ";

        // create the target for the policy (applies to all subject, resources and actions
        Target policyTarget = new Target(null, null, null);

        // create the policy
        Policy policy = new Policy(policyId, combiningAlg, description,
                policyTarget, rules);

        // policySet
        List pols = new ArrayList();
        pols.add(policy);

        URI combiningAlgIdPol = new URI(OrderedPermitOverridesPolicyAlg.algId);

        PolicyCombiningAlgorithm combiningAlgP =
                (PolicyCombiningAlgorithm) (factory.createAlgorithm(combiningAlgIdPol));
        policySet = new PolicySet(new URI("LMSPolicySet"), combiningAlgP, policyTarget, pols);


        return policySet;
    }

    // ---------------------------------------------- PDP builder


    private static PDP createPDP(String configFile) throws ParsingException, UnknownIdentifierException {

        // load the configuration
        ConfigurationStore store = new ConfigurationStore(new File(configFile));

        // use the default factories from the configuration
        store.useDefaultFactories();

        // get the PDP configuration's and setup the PDP
        return new PDP(store.getDefaultPDPConfig());

    }

    // ---------------------------------------------- Request Builder

    /**
     * Produces a request with given parameters
    * @param role the rule's role
     * @param activity the activity to use
     * @param view the view to use
     * @param context the context to use
     * @return the RequestCtx object
     * @throws URISyntaxException if any URI exception occurs
     */
    public static RequestCtx createRequest(String role, String activity, String view, String context) throws URISyntaxException {

        // ----- subject
        HashSet attributes = new HashSet();

        // setup the id and value for the requesting subject
        URI subjectId =
                new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id");


        attributes.add(new Attribute(subjectId, null, null, new StringAttribute(role)));
        // the context
        attributes.add(new Attribute(new URI("current-context"),
                "admin", null,
                new StringAttribute(context)));

        // bundle the attributes in a Subject with the default category
        HashSet subjects = new HashSet();
        subjects.add(new Subject(attributes));

        //------ action
        HashSet action = new HashSet();

        // this is a standard URI that can optionally be used to specify
        // the action being requested
        URI actionId =
                new URI("urn:oasis:names:tc:xacml:1.0:action:action-id");

        // create the action
        action.add(new Attribute(actionId, null, null,
                new StringAttribute(activity)));

        //------ resource

        HashSet resource = new HashSet();

        // the resource being requested

        // create the resource using a standard, required identifier for
        // the resource being requested
        resource.add(new Attribute(new URI(EvaluationCtx.RESOURCE_ID),
                null, null, new StringAttribute(view)));

        // Environment

        HashSet env = new HashSet();

        env.add(new Attribute(new URI("current-context"),
                "admin", null,
                new StringAttribute(context)));


        return new RequestCtx(subjects, resource,
                action, env); 
    }

    /**
     *
     * Produces an XACML file containing OrBAC rules contained in the array
     * @param rules hte list of rules in ruleName, status, rule, act, view, context
     * @param fileName  the name of the file
     */
    public static void builtXACMLFile(String[][] rules, String fileName) {

//------ generate the policy file
        List rulesXACML = new ArrayList();
        try {


        for (int i = 0; i < rules.length; i++) {

        rulesXACML.add(createRule(rules[i][0], rules[i][1], rules[i][2], rules[i][3], rules[i][4], rules[i][5]));
        }

        // default prohibition rule Is added at the end
        Rule defaultRule = new Rule(new URI("FinalRule"), Result.DECISION_DENY,
                null, null, null);
        rulesXACML.add(defaultRule);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // create the policyset
        PolicySet policySet = createPolicySet(rulesXACML);

        // encodes it
        policySet.encode(baos, new Indenter());

        // add xmlns reference. Used for validation
        baos.flush();
        StringBuffer content = new StringBuffer(baos.toString());
        content.insert(content.indexOf("<PolicySet ") + 11, "xmlns=\"urn:oasis:names:tc:xacml:1.0:policy\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");

        System.out.println("Generated XACML file : ");
        System.out.println(content);

        // writing to xml file
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
        fos.write(content.toString().getBytes());
        fos.close();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnknownIdentifierException e) {
            e.printStackTrace();
    }
    }


    public static void main(String[] args) throws URISyntaxException, UnknownIdentifierException, IOException, ParsingException {

        //------ generate the policy file
        String[][] rules = new String[5][6];

        rules[0] = new String[]{"R1", "permission", "student", "borrow", "book", "working-days"};
        rules[1] = new String[]{"R2", "permission", "teacher", "borrow", "book", "working-days"};
        rules[2] = new String[]{"R3", "prohibition", "secretary", "borrow", "book", "default"};
        rules[3] = new String[]{"R4", "permission", "director", "modify", "account", "default"};
        rules[4] = new String[]{"R5", "permission", "director", "create", "account", "working-days"};

        builtXACMLFile(rules,"lms.xml");

        //------ load the policy file using the configuraition file

        PDP pdp = createPDP("xacml_configuration.xml");

        System.out.println("");

        //------ use the request to get the response
        RequestCtx req = createRequest("secretary", "borrow", "book", "default");

        ResponseCtx response = pdp.evaluate(req);

        Result res = (Result) response.getResults().iterator().next();

        System.out.println("Reponse = " + ((res.getDecision() == Result.DECISION_PERMIT) ? "Permission" : "Prohibition"));

    }

}
