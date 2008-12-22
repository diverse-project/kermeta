

/*$Id: BehaviorClonerWithTraces.java,v 1.4 2008-12-22 09:33:55 cfaucher Exp $
* Project : org.kermeta.merger
* File : 	BehaviorClonerWithTraces.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import org.kermeta.io.KermetaUnit;
import org.kermeta.merger.internal.util.ExpressionTracer;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Tag;

public class BehaviorClonerWithTraces extends AbstractBehaviorCloner {
	
	private ExpressionTracer tracer;
	
	public BehaviorClonerWithTraces(KermetaUnit kermetaUnit) {
		super(kermetaUnit);
		this.tracer = new ExpressionTracer( kermetaUnit );
	}
		
	@Override
	public Object visitAssignment(Assignment node) {
		Object result = AssignmentCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitCallFeature(CallFeature node) {
		Object result = CallFeatureCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitCallVariable(CallVariable node) {
		Object result = CallVariableCloner.clone(node, this);		
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitCallResult(CallResult node) {
		Object result = CallResultCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitCallSuperOperation(CallSuperOperation node) {
		Object result = CallSuperOperationCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitCallValue(CallValue node) {
		Object result = CallValueCloner.clone(node);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitBlock(Block node) {
		Object result = BlockCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitRescue(Rescue node) {
		Object result = RescueCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitConditional(Conditional node) {
		Object result = ConditionalCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitRaise(Raise node) {
		Object result = RaiseCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitVoidLiteral(VoidLiteral node) {
		Object result = VoidLiteralCloner.visitVoidLiteral(node);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitTypeLiteral(TypeLiteral node) {
		Object result = TypeLiteralCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitIntegerLiteral(IntegerLiteral node) {
		Object result = IntegerLiteralCloner.clone(node);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitStringLiteral(StringLiteral node) {
		Object result = StringLiteralCloner.clone(node);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitBooleanLiteral(BooleanLiteral node) {
		Object result = BooleanLiteralCloner.clone(node);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitEmptyExpression(EmptyExpression node) {
		// TODO Auto-generated method stub
		return (Object) super.visitEmptyExpression(node);
	}
		
	@Override
	public Object visitJavaStaticCall(JavaStaticCall node) {
		Object result = JavaStaticCallCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitLoop(Loop node) {
		Object result = LoopCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitLambdaExpression(LambdaExpression node) {
		Object result = LambdaExpressionCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitLambdaParameter(LambdaParameter node) {
		Object result = LambdaParameterCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitSelfExpression(SelfExpression node) {
		Object result = SelfExpressionCloner.clone(node);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitVariableDecl(VariableDecl node) {
		Object result = VariableDeclCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
		
	@Override
	public Object visitTypeReference(TypeReference node) {
		Object result = TypeReferenceCloner.clone(node, this);
		cloneTags(node, result);
		tracer.tryToTrace(result, node);
		return result;
	}
	
	private void cloneTags(Object sourceObject, Object targetObject) {
		for ( Tag sourceTag : sourceObject.getOwnedTags() ) {
			Tag targetTag = KermetaModelHelper.Tag.create(sourceTag.getName(), sourceTag.getValue());
			
			// Set the object as container of the Tag
			targetObject.getOwnedTags().add(targetTag);
			// This object is tagged by targetTag
			targetObject.getTag().add(targetTag);
		}
	}

}


