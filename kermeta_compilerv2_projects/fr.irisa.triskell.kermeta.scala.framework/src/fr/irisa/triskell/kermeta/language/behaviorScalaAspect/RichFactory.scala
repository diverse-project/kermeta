package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
object RichFactory extends fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorFactoryImpl with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{
 override def createCallVariable : fr.irisa.triskell.kermeta.language.behavior.CallVariable = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichCallVariable }
 override def createCallFeature : fr.irisa.triskell.kermeta.language.behavior.CallFeature = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichCallFeature }
 override def createCallSuperOperation : fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichCallSuperOperation }
 override def createCallResult : fr.irisa.triskell.kermeta.language.behavior.CallResult = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichCallResult }
 override def createCallValue : fr.irisa.triskell.kermeta.language.behavior.CallValue = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichCallValue }
 override def createAssignment : fr.irisa.triskell.kermeta.language.behavior.Assignment = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichAssignment }
 override def createBlock : fr.irisa.triskell.kermeta.language.behavior.Block = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichBlock }
 override def createConditional : fr.irisa.triskell.kermeta.language.behavior.Conditional = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichConditional }
 override def createRaise : fr.irisa.triskell.kermeta.language.behavior.Raise = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichRaise }
 override def createRescue : fr.irisa.triskell.kermeta.language.behavior.Rescue = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichRescue }
 override def createTypeReference : fr.irisa.triskell.kermeta.language.behavior.TypeReference = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichTypeReference }
 override def createEmptyExpression : fr.irisa.triskell.kermeta.language.behavior.EmptyExpression = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichEmptyExpression }
 override def createJavaStaticCall : fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichJavaStaticCall }
 override def createLambdaExpression : fr.irisa.triskell.kermeta.language.behavior.LambdaExpression = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichLambdaExpression }
 override def createLambdaParameter : fr.irisa.triskell.kermeta.language.behavior.LambdaParameter = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichLambdaParameter }
 override def createIntegerLiteral : fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichIntegerLiteral }
 override def createStringLiteral : fr.irisa.triskell.kermeta.language.behavior.StringLiteral = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichStringLiteral }
 override def createBooleanLiteral : fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichBooleanLiteral }
 override def createTypeLiteral : fr.irisa.triskell.kermeta.language.behavior.TypeLiteral = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichTypeLiteral }
 override def createVoidLiteral : fr.irisa.triskell.kermeta.language.behavior.VoidLiteral = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichVoidLiteral }
 override def createLoop : fr.irisa.triskell.kermeta.language.behavior.Loop = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichLoop }
 override def createSelfExpression : fr.irisa.triskell.kermeta.language.behavior.SelfExpression = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichSelfExpression }
 override def createVariableDecl : fr.irisa.triskell.kermeta.language.behavior.VariableDecl = { new fr.irisa.triskell.kermeta.language.behaviorScalaAspect.RichVariableDecl }
}

