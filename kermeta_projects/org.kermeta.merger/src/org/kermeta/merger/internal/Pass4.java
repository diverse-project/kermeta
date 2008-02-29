/*$Id: Pass4.java,v 1.6 2008-02-29 16:23:38 dvojtise Exp $
* Project : org.kermeta.merger
* File : 	Pass4.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.io.StringReader;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.merger.MergerPlugin;
import org.kermeta.model.KermetaModelHelper;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolProperty;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaParser;

/**
 * 
 * 
 * Adding the behavior for operations and derived properties.
 * 
 * 
 * @author paco
 *
 */
public class Pass4 extends MergePass {

	public Pass4(KermetaUnit kermetaUnit, MergeContext context) {
		super(kermetaUnit, context);
	}

	@Override
	public void process() {
		for ( TypeDefinition td : KermetaUnitHelper.getTypeDefinitions(kermetaUnit) ) {
			
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) td;
				setOperationsBody( cd );
			}
			
		}	
	}

	private FExpression getNodeExpression(Expression expression) {
		KM2KMTPrettyPrinter printer = new KM2KMTPrettyPrinter(true);
		String operationAsString  = (String) printer.accept( expression );
		StringReader reader = new StringReader(operationAsString);
		KermetaLexer lexer = new KermetaLexer(reader);
		KermetaParser parser = new KermetaParser(lexer);
		FExpression node = null;
		try {
			node = parser.fExpression();
		} catch (RecognitionException e) {
			MergerPlugin.logErrorMessage("Pb parsing expression " + operationAsString, e);
			String operationAsString2  = (String) printer.accept( expression );
		} catch (TokenStreamException e) {
			MergerPlugin.logErrorMessage("Pb parsing expression " + operationAsString, e);
			String operationAsString2  = (String) printer.accept( expression );
		}	
		return node;
	}
	
	private void setOperationsBody(ClassDefinition newDefinition) {
		context.pushContext();			
		for ( TypeVariable tv : newDefinition.getTypeParameter() )
			context.addTypeVar( tv );
		
		context.pushContext();
		for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(newDefinition) )
			context.addSymbol( new KMSymbolProperty(p) );
		
		context.pushContext();
		for ( Operation o : KermetaModelHelper.ClassDefinition.getAllOperations(newDefinition) )
			context.addSymbol( new KMSymbolOperation(o) );
		
		/*
		 * 
		 * Setting the body of the invariants.
		 * 
		 */
		for ( Constraint newConstraint : newDefinition.getInv() ) {
			Constraint baseConstraint = context.getBaseConstraint(newConstraint);
			FExpression node = getNodeExpression( baseConstraint.getBody() );
			setBody(newConstraint, node);
		}
		
		for ( Operation newOperation : newDefinition.getOwnedOperation() ) {
			Operation o = context.getBaseOperation(newOperation);
			KermetaUnit owner = KermetaUnitHelper.getKermetaUnitFromObject(o);
			fr.irisa.triskell.kermeta.parser.gen.ast.Operation nodeOperation = (fr.irisa.triskell.kermeta.parser.gen.ast.Operation) owner.getNodeByModelElement(o);
			FExpression node = null;
			if ( (nodeOperation == null) && (! o.isIsAbstract()) )
				node = getNodeExpression( o.getBody() );
			else if ( ! o.isIsAbstract() )
				node = ((OperationExpressionBody) nodeOperation.getOperationBody()).getFExpression();
			setBody(newOperation, node);
		}	
		
		for ( Property newProperty : newDefinition.getOwnedAttribute() ) {
			if ( newProperty.isIsDerived() ) {
				//Property p = context.getBaseProperty(newProperty);
				setBodies(newProperty, newDefinition);
			}
				
		}
		
		context.popContext();
		context.popContext();
		context.popContext();
		
	}
	
	
	private void setBody(Operation newOperation, FExpression node) {
		context.pushContext();
		for ( Parameter p : newOperation.getOwnedParameter() )
			context.addSymbol( new KMSymbolParameter(p) );
		
		for ( TypeVariable tv : newOperation.getTypeParameter() )
			context.addTypeVar( tv );
		
		/*
		 * 
		 * Setting the pre conditions.
		 * 
		 */
		for ( Constraint newConstraint : newOperation.getPre() ) {
			Constraint baseConstraint = context.getBaseConstraint(newConstraint);
			FExpression nodeConstraint = getNodeExpression( baseConstraint.getBody() );
			setBody(newConstraint, nodeConstraint);
		}
		
		/*
		 * 
		 * Setting the body.
		 * 
		 */
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newOperation.setBody( expression );
		
		/*
		 * 
		 * Setting the post conditions.
		 * 
		 */
		for ( Constraint newConstraint : newOperation.getPost() ) {
			Constraint baseConstraint = context.getBaseConstraint(newConstraint);
			FExpression nodeConstraint = getNodeExpression( baseConstraint.getBody() );
			setBody(newConstraint, nodeConstraint);
		}
		
		context.popContext();
	}
	
	private void setBodies(Property newProperty, ClassDefinition definition) {
		List<Property> properties = context.getProperties(definition, newProperty.getName());
		for ( Property p : properties ) {
			if ( p.getGetterBody() != null ) {
				FExpression node = getNodeExpression( p.getGetterBody() );
				setGetterBody(newProperty, node);
			}
			if ( p.getSetterBody() != null ) {
				FExpression node = getNodeExpression( p.getSetterBody() );
				setSetterBody(newProperty, node);
			}
		}
	}
	
	/*private void setBodies(Property newProperty, Property baseProperty) {
		if ( baseProperty.getGetterBody() != null ) {
			FExpression node = getNodeExpression( baseProperty.getGetterBody() );
			setGetterBody(newProperty, node);
		}
		if ( ! newProperty.isIsReadOnly() && baseProperty.getSetterBody() != null ) {
			FExpression node = getNodeExpression( baseProperty.getSetterBody() );
			setSetterBody(newProperty, node);
		}
	}*/
	
	private void setGetterBody(Property newProperty, FExpression node) {
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newProperty.setGetterBody( expression );
	}
	
	private void setSetterBody(Property newProperty, FExpression node) {
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newProperty.setSetterBody( expression );
	}
	
	private void setBody(Constraint newConstraint, FExpression node) {		
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newConstraint.setBody( expression );
	}
	
}


