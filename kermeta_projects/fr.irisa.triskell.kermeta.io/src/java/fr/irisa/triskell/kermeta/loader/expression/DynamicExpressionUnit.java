/* $Id: DynamicExpressionUnit.java,v 1.2 2005-09-15 12:40:33 dvojtise Exp $
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

import antlr.RecognitionException;
import antlr.TokenStreamException;

import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FTypeReference;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

/**
 * @author Franck Fleurey
 */
public class DynamicExpressionUnit extends KermetaUnit {

    
    FExpression expression;
    FClassDefinition context;
    ArrayList variables;
    
    /**
     * @param uri
     * @param packages
     */
    public DynamicExpressionUnit(Hashtable packages) {
        super("", packages);
    }
    
    
    public void parse(String body, FClassDefinition context, Hashtable formalParams) {
        
        this.context = context;
        variables = new ArrayList();
        
        this.current_class = context;
        this.pushContext();
        
        Enumeration e = formalParams.keys();
        while(e.hasMoreElements()) {
            String var_name = (String)e.nextElement();
            FType var_type = (FType)formalParams.get(var_name);
            FVariableDecl var = this.behav_factory.createFVariableDecl();
            var.setFIdentifier(var_name);
            
            FTypeReference tref = this.behav_factory.createFTypeReference();
            tref.setFType(var_type);
            tref.setFUpper(1);
            
            var.setFType(tref);
            variables.add(var);
            this.addSymbol(new KMSymbolVariable(var));
        }
        
        KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(body)));
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_exp = parser.asingleExpression().getFExpression();
			
		} catch (RecognitionException e1) {
		    this.messages.addMessage(new KMUnitError("Expression Parse error : " + e1, null));
			 throw new Error(e1);
		} catch (TokenStreamException e1) {
		    this.messages.addMessage(new KMUnitError("Expression Parse error : " + e1, null));
			 throw new Error(e1);
		}
		
		if (ast_exp != null)
		    expression = KMT2KMExperessionBuilder.process(ast_exp, this);
    }
    
    public KermetaTypeChecker typeCheck(KermetaTypeChecker checker) {
       if (expression == null || messages.unitHasError)
           throw new Error("Internal error : cannot type check the expression to eval");
       if (checker == null) {
           checker = new KermetaTypeChecker(this);
       }
       checker.getContext().init(this);
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

    public FClassDefinition getContext() {
        return context;
    }
    public FExpression getExpression() {
        return expression;
    }
 
    public ArrayList getVariables() {
        return variables;
    }
}
