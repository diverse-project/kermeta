package org.kermeta.compilo.scala.rich

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.kermeta.language.behavior.impl._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich.richAspect._
import org.kermeta.language._
import org.kermeta.language.structure._

class RichBehaviorFactoryImpl extends BehaviorFactoryImpl {
   
	override def createConditional() : Conditional =  {
		new ConditionalView
	}
 
	override def createLambdaExpression() : LambdaExpression = {
		new LambdaExpressionView
	} 

	override def createLambdaParameter() : LambdaParameter = {
		new LambdaParameterView
	}

	override def createTypeReference() : TypeReference = {
		new TypeReferenceView
	}

	override def createCallOperation() : CallOperation =  {
		new CallOperationView
	}
  	override def createCallEnumLiteral() : CallEnumLiteral =  {
		new CallEnumLiteralView
	}

  	override def createCallProperty() : CallProperty =  {
		new CallPropertyView
	}
	

	//TODO
	override def createEmptyExpression() : EmptyExpression = {
		new EmptyExpressionImpl() with KermetaModelElementAspect
	}

	override def createRaise() : Raise = {
		new RaiseView
	} 

	//TODO
	override def createRescue() : Rescue = {
		new RescueView
	}
	

	override def createBlock() : Block = {
		new BlockView
	}
 
	override def createCallVariable() : CallVariable = {
		new CallVariableImpl() with CallExpressionAspect with CallVariableAspect
	}

	override def createCallSuperOperation() : CallSuperOperation = {
		new CallSuperOperationImpl() with CallSuperOperationAspect
	}

	override def createCallResult() : CallResult = {
		new CallResultImpl() with CallExpressionAspect with CallResultAspect
	}

	override def createCallValue() : CallValue = {
		new CallValueImpl() with CallExpressionAspect with CallValueAspect
	}

	override def createIntegerLiteral() : IntegerLiteral = {
		new IntegerLiteralImpl() with IntegerLiteralAspect
	}

	override def createStringLiteral() : StringLiteral = {
		new StringLiteralImpl() with StringLiteralAspect
	}

	override def createBooleanLiteral() : BooleanLiteral = {
		new BooleanLiteralImpl() with BooleanLiteralAspect
	}

	override def createCallTypeLiteral() : CallTypeLiteral = {
		new CallTypeLiteralImpl() with CallTypeLiteralAspect
	}

	override def createVoidLiteral() :VoidLiteral = {
		new VoidLiteralImpl() with VoidLiteralAspect
	}

	override def createAssignment() :Assignment = {
		new AssignmentImpl() with AssignmentAspect
	}

	override def createJavaStaticCall() : JavaStaticCall = {
		new JavaStaticCallView
	}

	override def createVariableDecl() : VariableDecl = {
		new VariableDeclImpl() with VariableDeclAspect
	}

	override def createLoop() : Loop = {
		new LoopView
	}

	override def createSelfExpression() : SelfExpression = {
		new SelfExpressionView
	}

	
}
