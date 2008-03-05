

/*$Id: LoadBodiesAndSetOpposites.java,v 1.3 2008-03-05 07:54:52 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	LoadBodiesAndSetOpposites.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.kmt;

import java.util.Map;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.IKMTLoadingAction;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.loader.datas.KMTLoadingDatas;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.Invariant;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.Operation;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.parser.gen.ast.Postcondition;
import fr.irisa.triskell.kermeta.parser.gen.ast.Precondition;
import fr.irisa.triskell.kermeta.parser.gen.ast.Property;

public class LoadBodiesAndSetOpposites extends KermetaASTNodeVisitor implements ILoadingAction, IKMTLoadingAction {

	private KermetaUnit kermetaUnit;
	
	private LoadingContext context;
	
	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		performAction( (KMTLoadingDatas) datas, options );
	}

	public void performAction(KMTLoadingDatas datas, Map<?, ?> options) {
		kermetaUnit = datas.getKermetaUnit();
		context = datas.context;
		datas.ast.accept(this);
	}
	
	@Override
	public boolean beginVisit(ClassDecl classDecl) {
		ClassDefinition classDefinition = (ClassDefinition) kermetaUnit.getModelElementByNode(classDecl);
		context.pushContext(classDefinition);
		
		/*
		 * 
		 * Visiting Properties and Operations
		 * 
		 */
		classDecl.getClassMemberDecls().accept(this);
		
		context.popContext();
		
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Property property) {
		fr.irisa.triskell.kermeta.language.structure.Property p = (fr.irisa.triskell.kermeta.language.structure.Property) kermetaUnit.getModelElementByNode(property);
		/*
		 * 
		 * Setting opposite
		 * 
		 */
		if ( property.getOppositeName() != null ) {
			String name = KermetaASTHelper.getTextForID(property.getOppositeName());
			Type type = p.getType();
			if ( type instanceof Class ) {
				ClassDefinition oppositeClassDefinition = (ClassDefinition) ((Class) type).getTypeDefinition();
				fr.irisa.triskell.kermeta.language.structure.Property oppositeProperty = KermetaModelHelper.ClassDefinition.getPropertyByName(oppositeClassDefinition, name);
				if ( oppositeProperty != null )
					p.setOpposite( oppositeProperty );
			}
		}
		/*
		 * 
		 * Setting the Getter
		 * 
		 */
		if ( property.getGetterBody() != null ) {
			FExpression astExpression = property.getGetterBody().getGetterbody();
			Expression expression = KMT2KMExperessionBuilder.process(context, astExpression, kermetaUnit, null);
			p.setGetterBody(expression);
		}
		/*
		 * 
		 * Setting the Setter
		 * 
		 */
		if ( property.getSetterBody() != null ) {
			FExpression astExpression = property.getSetterBody().getSetterbody();
			Expression expression = KMT2KMExperessionBuilder.process(context, astExpression, kermetaUnit, null);
			p.setSetterBody(expression);
		}
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Operation operation) {
		fr.irisa.triskell.kermeta.language.structure.Operation o = (fr.irisa.triskell.kermeta.language.structure.Operation) kermetaUnit.getModelElementByNode(operation);
		context.pushContext(o);
		/*
		 * 
		 * Pre Conditions and Post Conditions
		 * 
		 */
		operation.getAssertions().accept(this);
		/*
		 * 
		 * Body
		 * 
		 */
		if ( operation.getOperationBody() instanceof OperationExpressionBody ) {
			FExpression astExpression = ((OperationExpressionBody) operation.getOperationBody()).getFExpression();
			Expression expression = KMT2KMExperessionBuilder.process(context, astExpression, kermetaUnit, null);
			o.setBody( expression );
		} else
			o.setIsAbstract(true);
		
		context.popContext();
		
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Precondition precondition) {
		Constraint constraint = (Constraint) kermetaUnit.getModelElementByNode(precondition);
		Expression expression = KMT2KMExperessionBuilder.process(context, precondition.getBody(), kermetaUnit, null);
		constraint.setBody( expression );
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Postcondition postcondition) {
		Constraint constraint = (Constraint) kermetaUnit.getModelElementByNode(postcondition);
		Expression expression = KMT2KMExperessionBuilder.process(context, postcondition.getBody(), kermetaUnit, null);
		constraint.setBody( expression );
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(Invariant invariant) {
		Constraint constraint = (Constraint) kermetaUnit.getModelElementByNode(invariant);
		Expression expression = KMT2KMExperessionBuilder.process(context, invariant.getBody(), kermetaUnit, null);
		constraint.setBody( expression );
		// No needs to go on
		return false;
	}
}


