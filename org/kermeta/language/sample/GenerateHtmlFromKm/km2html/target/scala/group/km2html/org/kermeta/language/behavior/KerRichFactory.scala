package group.km2html.org.kermeta.language.behavior
import ScalaImplicit.group.km2html.ImplicitConversion._
object KerRichFactory extends org.kermeta.language.behavior.impl.BehaviorFactoryImpl{
 override def createAssignment() : org.kermeta.language.behavior.Assignment = { new group.km2html.org.kermeta.language.behavior.RichAssignment }
 override def createBlock() : org.kermeta.language.behavior.Block = { new group.km2html.org.kermeta.language.behavior.RichBlock }
 override def createCallVariable() : org.kermeta.language.behavior.CallVariable = { new group.km2html.org.kermeta.language.behavior.RichCallVariable }
 override def createCallFeature() : org.kermeta.language.behavior.CallFeature = { new group.km2html.org.kermeta.language.behavior.RichCallFeature }
 override def createCallSuperOperation() : org.kermeta.language.behavior.CallSuperOperation = { new group.km2html.org.kermeta.language.behavior.RichCallSuperOperation }
 override def createCallResult() : org.kermeta.language.behavior.CallResult = { new group.km2html.org.kermeta.language.behavior.RichCallResult }
 override def createCallValue() : org.kermeta.language.behavior.CallValue = { new group.km2html.org.kermeta.language.behavior.RichCallValue }
 override def createConditional() : org.kermeta.language.behavior.Conditional = { new group.km2html.org.kermeta.language.behavior.RichConditional }
 override def createRaise() : org.kermeta.language.behavior.Raise = { new group.km2html.org.kermeta.language.behavior.RichRaise }
 override def createRescue() : org.kermeta.language.behavior.Rescue = { new group.km2html.org.kermeta.language.behavior.RichRescue }
 override def createTypeReference() : org.kermeta.language.behavior.TypeReference = { new group.km2html.org.kermeta.language.behavior.RichTypeReference }
 override def createEmptyExpression() : org.kermeta.language.behavior.EmptyExpression = { new group.km2html.org.kermeta.language.behavior.RichEmptyExpression }
 override def createJavaStaticCall() : org.kermeta.language.behavior.JavaStaticCall = { new group.km2html.org.kermeta.language.behavior.RichJavaStaticCall }
 override def createLambdaExpression() : org.kermeta.language.behavior.LambdaExpression = { new group.km2html.org.kermeta.language.behavior.RichLambdaExpression }
 override def createLambdaParameter() : org.kermeta.language.behavior.LambdaParameter = { new group.km2html.org.kermeta.language.behavior.RichLambdaParameter }
 override def createIntegerLiteral() : org.kermeta.language.behavior.IntegerLiteral = { new group.km2html.org.kermeta.language.behavior.RichIntegerLiteral }
 override def createStringLiteral() : org.kermeta.language.behavior.StringLiteral = { new group.km2html.org.kermeta.language.behavior.RichStringLiteral }
 override def createBooleanLiteral() : org.kermeta.language.behavior.BooleanLiteral = { new group.km2html.org.kermeta.language.behavior.RichBooleanLiteral }
 override def createCallTypeLiteral() : org.kermeta.language.behavior.CallTypeLiteral = { new group.km2html.org.kermeta.language.behavior.RichCallTypeLiteral }
 override def createVoidLiteral() : org.kermeta.language.behavior.VoidLiteral = { new group.km2html.org.kermeta.language.behavior.RichVoidLiteral }
 override def createLoop() : org.kermeta.language.behavior.Loop = { new group.km2html.org.kermeta.language.behavior.RichLoop }
 override def createSelfExpression() : org.kermeta.language.behavior.SelfExpression = { new group.km2html.org.kermeta.language.behavior.RichSelfExpression }
 override def createVariableDecl() : org.kermeta.language.behavior.VariableDecl = { new group.km2html.org.kermeta.language.behavior.RichVariableDecl }
 override def createUnresolvedCall() : org.kermeta.language.behavior.UnresolvedCall = { new group.km2html.org.kermeta.language.behavior.RichUnresolvedCall }
 override def createCallOperation() : org.kermeta.language.behavior.CallOperation = { new group.km2html.org.kermeta.language.behavior.RichCallOperation }
 override def createCallProperty() : org.kermeta.language.behavior.CallProperty = { new group.km2html.org.kermeta.language.behavior.RichCallProperty }
 override def createCallEnumLiteral() : org.kermeta.language.behavior.CallEnumLiteral = { new group.km2html.org.kermeta.language.behavior.RichCallEnumLiteral }
}

