/* $Id: DynamicExpressionUnit.java,v 1.5 2006-03-03 15:22:18 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitMessageManager;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
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
    
    public void resetMessages() {
    	messages = new KMUnitMessageManager(this);
    }
    
    
    public void parse(String body, ClassDefinition context, Hashtable formalParams) {
        
        this.context = context;
        variables = new ArrayList();
        
        this.current_class = context;
        //this.pushContext();
        
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
        
        KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(body)));
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_exp = parser.asingleExpression().getFExpression();
			
		} catch (RecognitionException e1) {
		    this.messages.addMessage(new KMUnitError("Expression Parse error : " + e1, null, ast_exp));
			 throw new Error(e1);
		} catch (TokenStreamException e1) {
		    this.messages.addMessage(new KMUnitError("Expression Parse error : " + e1, null, ast_exp));
			 throw new Error(e1);
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
}
