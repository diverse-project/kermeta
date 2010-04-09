package fr.irisa.triskell.kermeta.compilo.scala.rich

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import fr.irisa.triskell.kermeta.language.behavior.impl._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 

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

	override def createCallFeature() : CallFeature =  {
		new CallFeatureView
	}
	

	//TODO
	override def createEmptyExpression() : EmptyExpression = {
		new EmptyExpressionImpl() with ObjectAspect
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

	override def createTypeLiteral() : TypeLiteral = {
		new TypeLiteralImpl() with TypeLiteralAspect 
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
