package fr.irisa.triskell.kermeta.compilo.scala.rich

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import fr.irisa.triskell.kermeta.language.behavior.impl._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 

class RichBehaviorFactoryImpl extends BehaviorFactoryImpl {
 
	override def createConditional() : Conditional =  {
			new ConditionalImpl() with ConditionalAspect
	}

	override def createLambdaExpression() : LambdaExpression = {
		new LambdaExpressionImpl() with LambdaExpressionAspect
	} 

	override def createLambdaParameter() : LambdaParameter = {
		new LambdaParameterImpl() with LambdaParameterAspect
	}

	override def createTypeReference() : TypeReference = {
		new TypeReferenceImpl() with TypeReferenceAspect
	}

	override def createCallFeature() : CallFeature =  {
		new CallFeatureImpl() with CallFeatureAspect
	}

	//TODO
	override def createEmptyExpression() : EmptyExpression = {
		new EmptyExpressionImpl() with ObjectAspect
	}

	override def createRaise() : Raise = {
		new RaiseImpl() with RaiseAspect
	}

	//TODO
	override def createRescue() : Rescue = {
		new RescueImpl() with ObjectAspect
	}

	override def createBlock() : Block = {
		new BlockImpl() with BlockAspect
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

	override def createTypeLiteral() : TypeLiteral = {
		new TypeLiteralImpl() with TypeLiteralAspect
	}

	override def createVoidLiteral() :VoidLiteral = {
		new VoidLiteralImpl() with ObjectAspect
	}

	override def createAssignment() :Assignment = {
		new AssignmentImpl() with AssignmentAspect
	}

	override def createJavaStaticCall() : JavaStaticCall = {
		new JavaStaticCallImpl() with ObjectAspect
	}

	override def createVariableDecl() : VariableDecl = {
		new VariableDeclImpl() with VariableDeclAspect
	}

	override def createLoop() : Loop = {
		new LoopImpl() with LoopAspect
	}

	override def createSelfExpression() : SelfExpression = {
		new SelfExpressionImpl() with SelfExpressionAspect
	}

	
}
