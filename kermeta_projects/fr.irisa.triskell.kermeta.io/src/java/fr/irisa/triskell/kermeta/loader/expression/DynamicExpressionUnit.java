/* $Id: DynamicExpressionUnit.java,v 1.13 2007-09-13 09:04:50 ftanguy Exp $
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

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.impl.KermetaUnitImpl;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.ast.FExpression;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * @author Franck Fleurey
 */
public class DynamicExpressionUnit extends KermetaUnitImpl {

    
    Expression expression;
    ClassDefinition context;
    ArrayList<VariableDecl> variables;

    private LoadingContext loadingContext = new LoadingContext();
    
    public DynamicExpressionUnit(Expression expression) {
    	this.expression = expression;
    }
    
    public DynamicExpressionUnit(KermetaUnit kermetaUnit) {
    	setModelingUnit( kermetaUnit.getModelingUnit() );
    	getInternalPackageEntries().addAll( kermetaUnit.getInternalPackageEntries() );
    	getExternalPackageEntries().addAll( kermetaUnit.getExternalPackageEntries() );
    }
    
    public void resetMessages() {
    	getMessages().clear();
    }
    
    
    // A private method just to check if the string is correct
    /* 
     * FIXME The parser does not correctly parse expression. If an expression is not correct but its beginning matches 
     * a rule, then it is accepted. Of course it should not be. If the parser found a matched rule, it skips the other charachters.
     */
    private FExpression parseString(String expression) throws Exception {
    	
    	KermetaLexer lexer = new KermetaLexer(new StringReader(expression));
    	KermetaParser parser = new KermetaParser(lexer);
    	
    	FExpression  ast_exp = parser.asingleExpression().getFExpression();

    	return ast_exp;
    }
    
    
    public void parse(String stringExpression, ClassDefinition context, Hashtable<String,Type> formalParams) throws Exception {
        
   		FExpression  ast_exp = parseString(stringExpression);

   		this.context = context;
        variables = new ArrayList<VariableDecl>();
        
        loadingContext.current_class = context;
        loadingContext.pushContext();
        
        Enumeration<String> e = formalParams.keys();
        while(e.hasMoreElements()) {
            String var_name = e.nextElement();
            Type var_type = formalParams.get(var_name);
            VariableDecl var = BehaviorFactory.eINSTANCE.createVariableDecl();
            var.setIdentifier(var_name);
            
            TypeReference tref = BehaviorFactory.eINSTANCE.createTypeReference();
            tref.setType(var_type);
            tref.setUpper(1);
            
            var.setType(tref);
            variables.add(var);
            loadingContext.addSymbol(new KMSymbolVariable(var));
        }
		
		if (ast_exp != null)
		    expression = KMT2KMExperessionBuilder.process(loadingContext, ast_exp, this, new NullProgressMonitor());
		else {
			error( "Expression Parse error." );
		}
    }
    
    public KermetaTypeChecker typeCheck(KermetaTypeChecker checker) {
       if ( expression == null || isErrored() )
           throw new Error("Internal error : cannot type check the expression to eval");
       if (checker == null) {
           checker = new KermetaTypeChecker(this, new NullProgressMonitor() );
       }
       checker.getContext().init(this);
       
       Hashtable<String, KMSymbol> symbs = loadingContext.peekSymbols();
       KMSymbolVariable var;
       Iterator<KMSymbol> it = symbs.values().iterator();
       
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
 
    public ArrayList<VariableDecl> getVariables() {
        return variables;
    }
}
