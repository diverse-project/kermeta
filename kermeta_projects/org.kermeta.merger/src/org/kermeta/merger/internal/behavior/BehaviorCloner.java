

/*$Id: BehaviorCloner.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	BehaviorCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import org.kermeta.io.KermetaUnit;

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


public class BehaviorCloner extends AbstractBehaviorCloner {

	public BehaviorCloner(KermetaUnit kermetaUnit) {
		super(kermetaUnit);
	}
		
	@Override
	public Object visitAssignment(Assignment node) {
		return AssignmentCloner.clone(node, this);
	}
		
	@Override
	public Object visitCallFeature(CallFeature node) {
		return CallFeatureCloner.clone(node, this);
	}
		
	@Override
	public Object visitCallVariable(CallVariable node) {
		return CallVariableCloner.clone(node, this);
	}
		
	@Override
	public Object visitCallResult(CallResult node) {
		return CallResultCloner.clone(node, this);
	}
		
	@Override
	public Object visitCallSuperOperation(CallSuperOperation node) {
		return CallSuperOperationCloner.clone(node, this);
	}
		
	@Override
	public Object visitCallValue(CallValue node) {
		return CallValueCloner.clone(node);
	}
		
	@Override
	public Object visitBlock(Block node) {
		return BlockCloner.clone(node, this);
	}
		
	@Override
	public Object visitRescue(Rescue node) {
		return RescueCloner.clone(node, this);
	}
		
	@Override
	public Object visitConditional(Conditional node) {
		return ConditionalCloner.clone(node, this);
	}
		
	@Override
	public Object visitRaise(Raise node) {
		return RaiseCloner.clone(node, this);
	}
		
	@Override
	public Object visitVoidLiteral(VoidLiteral node) {
		return VoidLiteralCloner.visitVoidLiteral(node);
	}
		
	@Override
	public Object visitTypeLiteral(TypeLiteral node) {
		return TypeLiteralCloner.clone(node, this);
	}
		
	@Override
	public Object visitIntegerLiteral(IntegerLiteral node) {
		return IntegerLiteralCloner.clone(node);
	}
		
	@Override
	public Object visitStringLiteral(StringLiteral node) {
		return StringLiteralCloner.clone(node);
	}
		
	@Override
	public Object visitBooleanLiteral(BooleanLiteral node) {
		return BooleanLiteralCloner.clone(node);
	}
		
	@Override
	public Object visitEmptyExpression(EmptyExpression node) {
		// TODO Auto-generated method stub
		return super.visitEmptyExpression(node);
	}
		
	@Override
	public Object visitJavaStaticCall(JavaStaticCall node) {
		return JavaStaticCallCloner.clone(node, this);
	}
		
	@Override
	public Object visitLoop(Loop node) {
		return LoopCloner.clone(node, this);
	}
		
	@Override
	public Object visitLambdaExpression(LambdaExpression node) {
		return LambdaExpressionCloner.clone(node, this);
	}
		
	@Override
	public Object visitLambdaParameter(LambdaParameter node) {
		return LambdaParameterCloner.clone(node, this);
	}
		
	@Override
	public Object visitSelfExpression(SelfExpression node) {
		return SelfExpressionCloner.clone(node);
	}
		
	@Override
	public Object visitVariableDecl(VariableDecl node) {
		return VariableDeclCloner.clone(node, this);
	}
		
	@Override
	public Object visitTypeReference(TypeReference node) {
		return TypeReferenceCloner.clone(node, this);
	}	
	
}


