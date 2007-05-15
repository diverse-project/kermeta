/* $Id: DynamicExpressionUnit.java,v 1.9 2007-05-15 09:10:36 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : DynamicExpressionUnit.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 juin 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.loader.expression;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessageManager;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * @author Franck Fleurey
 */
public class DynamicExpressionUnit extends KermetaUnit {

    
    Expression expression;
    ClassDefinition context;
    ArrayList variables;
    
    /**
     * @param uri
     * @param packages
     */
    public DynamicExpressionUnit(Hashtable packages) {
        super("", packages);
        this.pushContext();
    }
    
    public DynamicExpressionUnit(Hashtable packages, Expression expression, ClassDefinition context) {
        super("", packages);
        this.pushContext();
        this.expression = expression;
        this.context = context;
    }
    
    public void resetMessages() {
    	messages = new KMUnitMessageManager(this);
    }
    
    
    // A private method just to check if the string is correct
    /* 
     * FIXME The parser does not correctly parse expression. If an expression is not correct but its beginning matches 
     * a rule, then it is accepted. Of course it should not be. If the parser found a matched rule, it skips the other charachters.
     */
    private fr.irisa.triskell.kermeta.ast.FExpression parseString(String expression) throws Exception {
    	
    	KermetaLexer lexer = new KermetaLexer(new StringReader(expression));
    	KermetaParser parser = new KermetaParser(lexer);
    	
    	fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = parser.asingleExpression().getFExpression();

    	return ast_exp;
    }
    
    
    public void parse(String stringExpression, ClassDefinition context, Hashtable formalParams) throws Exception {
        
   		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = parseString(stringExpression);

   		this.context = context;
        variables = new ArrayList();
        
        this.current_class = context;
        this.pushContext();
        
        Enumeration e = formalParams.keys();
        while(e.hasMoreElements()) {
            String var_name = (String)e.nextElement();
            Type var_type = (Type)formalParams.get(var_name);
            VariableDecl var = this.behav_factory.createVariableDecl();
            var.setIdentifier(var_name);
            
            TypeReference tref = this.behav_factory.createTypeReference();
            tref.setType(var_type);
            tref.setUpper(1);
            
            var.setType(tref);
            variables.add(var);
            this.addSymbol(new KMSymbolVariable(var));
        }
		
		if (ast_exp != null)
		    expression = KMT2KMExperessionBuilder.process(ast_exp, this);
		else {
			this.messages.addMessage(new KMUnitError("Expression Parse error.", null, ast_exp));
		}
    }
    
    public KermetaTypeChecker typeCheck(KermetaTypeChecker checker) {
       if (expression == null || messages.unitHasError)
           throw new Error("Internal error : cannot type check the expression to eval");
       if (checker == null) {
           checker = new KermetaTypeChecker(this);
       }
       checker.getContext().init(this);
       
       Hashtable symbs = (Hashtable)this.symbols.peek();
       KMSymbolVariable var;
       Iterator it = symbs.values().iterator();
       
       while(it.hasNext()){
       		var = (KMSymbolVariable)it.next();
       		if (var.getVariable().getStaticType() == null) continue;
       		checker.getContext().addSymbol(var, new SimpleType(var.getVariable().getStaticType()));
       	
       }
	   
	   checker.checkExpression(expression);
       return checker;
    }
    /*
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
     */
    public void preLoad() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadImportedUnits()
     */
    public void loadImportedUnits() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
     */
    public void loadTypeDefinitions() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
     */
    public void loadStructuralFeatures() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadOppositeProperties()
     */
    public void loadOppositeProperties() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadBodies()
     */
    public void loadBodies() {
        // TODO Auto-generated method stub

    }

    public ClassDefinition getContext() {
        return context;
    }
    public Expression getExpression() {
        return expression;
    }
 
    public ArrayList getVariables() {
        return variables;
    }

	@Override
	public void postLoad() {
		
	}
}
