package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory extends fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorFactoryImpl{
 override def createCallVariable : fr.irisa.triskell.kermeta.language.behavior.CallVariable = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichCallVariable }
 override def createCallFeature : fr.irisa.triskell.kermeta.language.behavior.CallFeature = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichCallFeature }
 override def createCallSuperOperation : fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichCallSuperOperation }
 override def createCallResult : fr.irisa.triskell.kermeta.language.behavior.CallResult = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichCallResult }
 override def createCallValue : fr.irisa.triskell.kermeta.language.behavior.CallValue = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichCallValue }
 override def createAssignment : fr.irisa.triskell.kermeta.language.behavior.Assignment = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichAssignment }
 override def createBlock : fr.irisa.triskell.kermeta.language.behavior.Block = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichBlock }
 override def createConditional : fr.irisa.triskell.kermeta.language.behavior.Conditional = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichConditional }
 override def createRaise : fr.irisa.triskell.kermeta.language.behavior.Raise = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichRaise }
 override def createRescue : fr.irisa.triskell.kermeta.language.behavior.Rescue = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichRescue }
 override def createTypeReference : fr.irisa.triskell.kermeta.language.behavior.TypeReference = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichTypeReference }
 override def createEmptyExpression : fr.irisa.triskell.kermeta.language.behavior.EmptyExpression = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichEmptyExpression }
 override def createJavaStaticCall : fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichJavaStaticCall }
 override def createLambdaExpression : fr.irisa.triskell.kermeta.language.behavior.LambdaExpression = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichLambdaExpression }
 override def createLambdaParameter : fr.irisa.triskell.kermeta.language.behavior.LambdaParameter = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichLambdaParameter }
 override def createIntegerLiteral : fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichIntegerLiteral }
 override def createStringLiteral : fr.irisa.triskell.kermeta.language.behavior.StringLiteral = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichStringLiteral }
 override def createBooleanLiteral : fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichBooleanLiteral }
 override def createTypeLiteral : fr.irisa.triskell.kermeta.language.behavior.TypeLiteral = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichTypeLiteral }
 override def createVoidLiteral : fr.irisa.triskell.kermeta.language.behavior.VoidLiteral = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichVoidLiteral }
 override def createLoop : fr.irisa.triskell.kermeta.language.behavior.Loop = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichLoop }
 override def createSelfExpression : fr.irisa.triskell.kermeta.language.behavior.SelfExpression = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichSelfExpression }
 override def createVariableDecl : fr.irisa.triskell.kermeta.language.behavior.VariableDecl = { new ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichVariableDecl }
}

