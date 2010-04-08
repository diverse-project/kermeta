/* $Id: DynamicExpressionUnit.java,v 1.21 2008-04-28 11:50:24 ftanguy Exp $
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
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.io.impl.KermetaUnitImpl;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolProperty;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaParser;
import fr.irisa.triskell.kermeta.typechecker.ContextNotInitializedOnAFrameworkError;
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
    	getImportedKermetaUnits().add(kermetaUnit);
    	importKermetaUnit(kermetaUnit);
    	setTypeCheckerContext(kermetaUnit.getTypeCheckerContext());
    	/*setModelingUnit( kermetaUnit.getModelingUnit() );
    	getInternalPackageEntries().addAll( kermetaUnit.getInternalPackageEntries() );
    	getExternalPackageEntries().addAll( kermetaUnit.getExternalPackageEntries() );
    	setTypeDefinitionCache( IoFactory.eINSTANCE.createTypeDefinitionCache() );
    	Map<String, TypeDefinitionCacheEntry> entries = kermetaUnit.getTypeDefinitionCache().getEntries();
    	for ( TypeDefinitionCacheEntry entry : entries.values() ) {
    		TypeDefinitionCacheEntry newEntry = IoFactory.eINSTANCE.createTypeDefinitionCacheEntry();
    		newEntry.setQualifiedName( entry.getQualifiedName() );
    		newEntry.setTypeDefinition( entry.getTypeDefinition() );
    		getTypeDefinitionCache().getEntries().put(entry.getQualifiedName(), newEntry);
    	}*/
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
        
        /*
         * 
         * Adding symbols to the context.
         * 
         */
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
		
        /*
         * 
         * Attributes
         * 
         */
        
        for ( Property property : KermetaModelHelper.ClassDefinition.getAllProperties(this, context) )
        	loadingContext.addSymbol( new KMSymbolProperty(property) );
        
        /*
         * 
         * Operations
         * 
         */
        for ( Operation operation : KermetaModelHelper.ClassDefinition.getAllOperations(this, context) )
        	loadingContext.addSymbol( new KMSymbolOperation(operation) );
        
		if (ast_exp != null)
		    expression = KMT2KMExperessionBuilder.process(loadingContext, ast_exp, this, new NullProgressMonitor());
		else {
			error( "Expression Parse error." );
		}

    }
    
    public KermetaTypeChecker typeCheck(KermetaTypeChecker checker) throws ContextNotInitializedOnAFrameworkError {
       if ( expression == null || isErroneous() )
           throw new Error("Internal error : cannot type check the expression to eval");
       if (checker == null) {    	   
           checker = new KermetaTypeChecker(this, this.getTypeCheckerContext() );
       }
       checker.getContext().init(this);
       
       Hashtable<String, KMSymbol> symbs = loadingContext.peekSymbols();
       KMSymbolVariable var;
       
       for ( KMSymbol symbol : symbs.values() ) {
    	   if ( symbol instanceof KMSymbolVariable ) {
    			var = (KMSymbolVariable) symbol;
           		if (var.getVariable().getStaticType() == null) continue;
           		checker.getContext().addSymbol(var, new SimpleType(var.getVariable().getStaticType(), checker.getContext()));	   
    	   }
       }
       	   
	   checker.checkExpression(expression);
       return checker;
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
