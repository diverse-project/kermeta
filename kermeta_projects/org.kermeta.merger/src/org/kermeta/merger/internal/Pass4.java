 

/*$Id: Pass4.java,v 1.7 2008-04-28 11:51:07 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	Pass4.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.merger.internal.behavior.AbstractBehaviorCloner;
import org.kermeta.merger.internal.behavior.BehaviorCloner;
import org.kermeta.merger.internal.behavior.BehaviorClonerWithTraces;

import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

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

	private Expression cloneBehavior(Expression expression) {
		AbstractBehaviorCloner cloner = null;
		if ( context.isTrace() )
			cloner = new BehaviorClonerWithTraces(kermetaUnit);
		else
			cloner = new BehaviorCloner(kermetaUnit);
		return (Expression) cloner.accept(expression);
	}
	
	/*private FExpression getNodeExpression(Expression expression) {
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
		} catch (TokenStreamException e) {
			MergerPlugin.logErrorMessage("Pb parsing expression " + operationAsString, e);
		}	
		return node;
	}*/
	
	private void setOperationsBody(ClassDefinition newDefinition) {
		
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject( context.getBaseTypeDefinition(newDefinition) );
		if ( unit.getUri().endsWith(".kmt") )
			// Need to activate the trace system
			// We only do that when the source is a kmt file because tracing km object does not mean anything.
			kermetaUnit.setNeedASTTraces(true);
		
		/*context.pushContext();			
		for ( TypeVariable tv : newDefinition.getTypeParameter() )
			context.addTypeVar( tv );
		
		context.pushContext();
		for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(newDefinition) )
			context.addSymbol( new KMSymbolProperty(p) );
		
		context.pushContext();
		for ( Operation o : KermetaModelHelper.ClassDefinition.getAllOperations(newDefinition) )
			context.addSymbol( new KMSymbolOperation(o) );*/
		
		/*
		 * 
		 * Setting the body of the invariants.
		 * 
		 */
		for ( Constraint newConstraint : newDefinition.getInv() ) {
			Constraint baseConstraint = context.getBaseConstraint(newConstraint);
			newConstraint.setBody( cloneBehavior(baseConstraint.getBody()) );
		}
		
		for ( Operation newOperation : newDefinition.getOwnedOperation() ) {
			Operation baseOperation = context.getBaseOperation(newOperation);
			setBody(newOperation, baseOperation);
		}	
		
		for ( Property newProperty : newDefinition.getOwnedAttribute() ) {
			if ( newProperty.isIsDerived() )
				setBodies(newProperty, newDefinition);			
		}
		
		//context.popContext();
		//context.popContext();
		//context.popContext();
		
		// Desactivating the traces
		kermetaUnit.setNeedASTTraces(false);
	}
	
	
	private void setBody(Operation newOperation, Operation baseOperation) {
		/*context.pushContext();
		for ( Parameter p : newOperation.getOwnedParameter() )
			context.addSymbol( new KMSymbolParameter(p) );
		
		for ( TypeVariable tv : newOperation.getTypeParameter() )
			context.addTypeVar( tv );*/
		
		/*
		 * 
		 * Setting the pre conditions.
		 * 
		 */
		for ( Constraint newConstraint : newOperation.getPre() ) {
			Constraint baseConstraint = context.getBaseConstraint(newConstraint);
			newConstraint.setBody( cloneBehavior(baseConstraint.getBody()) );
		}
		
		/*
		 * 
		 * Setting the body.
		 * 
		 */
		if ( baseOperation.getBody() != null )
			newOperation.setBody( cloneBehavior(baseOperation.getBody()) );

		/*
		 * 
		 * Setting the post conditions.
		 * 
		 */
		for ( Constraint newConstraint : newOperation.getPost() ) {
			Constraint baseConstraint = context.getBaseConstraint(newConstraint);
			newConstraint.setBody( cloneBehavior(baseConstraint.getBody()) );
		}
		
		//context.popContext();
	}
	
	private void setBodies(Property newProperty, ClassDefinition definition) {
		List<Property> properties = context.getProperties(definition, newProperty.getName());
		for ( Property p : properties ) {
			if ( p.getGetterBody() != null )
				newProperty.setGetterBody( cloneBehavior(p.getGetterBody()) );
			if ( p.getSetterBody() != null )
				newProperty.setSetterBody( cloneBehavior(p.getSetterBody()) );
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
	
	/*private void setGetterBody(Property newProperty, FExpression node) {
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newProperty.setGetterBody( expression );
	}
	
	private void setSetterBody(Property newProperty, FExpression node) {
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newProperty.setSetterBody( expression );
	}*/
	
	/*private void setBody(Constraint newConstraint, FExpression node) {		
		Expression expression = KMT2KMExperessionBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		newConstraint.setBody( expression );
	}*/
	
}


