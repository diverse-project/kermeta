package ScalaImplicit.group.KermetaDoc
object ImplicitConversion {
implicit def richAspect(o : _root_.java.lang.Object)  =  o match {
  case s:String => new k2.standard.RichString(s)
   case s : java.lang.Boolean => new k2.standard.RichJavaBoolean(s)
   case s : java.lang.Integer =>
 new k2.standard.RichInteger(s.intValue)
   case s : java.util.List[_] => new k2.standard.JavaConversions.RichKermetaList(s)
   case s:  group.KermetaDoc.org.kermeta.language.structure.KermetaModelElementAspect => s
   case _ =>  if (o!=null)
     new k2.standard.RichEnum(o)
    else
       null.asInstanceOf[k2.standard.EObjectImplForPrimitive]
 }
 implicit def richAspect(v : mainpackage.MainClass) = v.asInstanceOf[mainpackage.MainClassAspect]
 implicit def richAspect(v : mainpackage.MainClassAspect) = v.asInstanceOf[mainpackage.MainClass]
 implicit def richAspect(v : org.DummyClass) = v.asInstanceOf[group.KermetaDoc.org.DummyClassAspect]
 implicit def richAspect(v : group.KermetaDoc.org.DummyClassAspect) = v.asInstanceOf[org.DummyClass]
 implicit def richAspect(v : org.kermeta.DummyClass) = v.asInstanceOf[group.KermetaDoc.org.kermeta.DummyClassAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.DummyClassAspect) = v.asInstanceOf[org.kermeta.DummyClass]
 implicit def richAspect(v : org.kermeta.language.DummyClass) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.DummyClassAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.DummyClassAspect) = v.asInstanceOf[org.kermeta.language.DummyClass]
 implicit def richAspect(v : org.kermeta.language.behavior.Assignment) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.AssignmentAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.AssignmentAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.AssignmentImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.Expression) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.ExpressionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.ExpressionAspect) = v.asInstanceOf[org.kermeta.language.behavior.Expression]
 implicit def richAspect(v : org.kermeta.language.behavior.CallExpression) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallExpressionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallExpressionAspect) = v.asInstanceOf[org.kermeta.language.behavior.CallExpression]
 implicit def richAspect(v : org.kermeta.language.behavior.Block) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.BlockAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.BlockAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.BlockImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallVariable) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallVariableAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallVariableAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallVariableImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallFeature) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallFeatureAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallFeatureAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallFeatureImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallSuperOperation) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallSuperOperationAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallSuperOperationAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallSuperOperationImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallResult) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallResultAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallResultAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallResultImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallValue) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallValueAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallValueAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallValueImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.Conditional) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.ConditionalAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.ConditionalAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.ConditionalImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.Raise) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.RaiseAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.RaiseAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.RaiseImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.Rescue) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.RescueAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.RescueAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.RescueImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.TypeReference) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.TypeReferenceAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.TypeReferenceAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.TypeReferenceImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.Literal) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.LiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.LiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.Literal]
 implicit def richAspect(v : org.kermeta.language.behavior.EmptyExpression) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.EmptyExpressionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.EmptyExpressionAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.EmptyExpressionImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.JavaStaticCall) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.JavaStaticCallAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.JavaStaticCallAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.JavaStaticCallImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.LambdaExpression) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.LambdaExpressionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.LambdaExpressionAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.LambdaExpressionImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.LambdaParameter) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.LambdaParameterAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.LambdaParameterAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.LambdaParameterImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.IntegerLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.IntegerLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.IntegerLiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.IntegerLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.StringLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.StringLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.StringLiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.StringLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.BooleanLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.BooleanLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.BooleanLiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.BooleanLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallTypeLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallTypeLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallTypeLiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallTypeLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.VoidLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.VoidLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.VoidLiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.VoidLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.Loop) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.LoopAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.LoopAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.LoopImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.SelfExpression) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.SelfExpressionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.SelfExpressionAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.SelfExpressionImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.VariableDecl) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.VariableDeclAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.VariableDeclAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.VariableDeclImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.UnresolvedCall) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.UnresolvedCallAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.UnresolvedCallAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.UnresolvedCallImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallOperation) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallOperationAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallOperationAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallOperationImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallProperty) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallPropertyAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallPropertyAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallPropertyImpl]
 implicit def richAspect(v : org.kermeta.language.behavior.CallEnumLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.behavior.CallEnumLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.behavior.CallEnumLiteralAspect) = v.asInstanceOf[org.kermeta.language.behavior.impl.CallEnumLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.structure.KermetaModelElement) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.KermetaModelElementAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.KermetaModelElementAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.KermetaModelElementImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Operation) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.OperationAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.OperationAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.OperationImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Property) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.PropertyAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.PropertyAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.PropertyImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Type) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeAspect) = v.asInstanceOf[org.kermeta.language.structure.Type]
 implicit def richAspect(v : org.kermeta.language.structure.TypeContainer) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeContainerAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeContainerAspect) = v.asInstanceOf[org.kermeta.language.structure.TypeContainer]
 implicit def richAspect(v : org.kermeta.language.structure.EnumerationLiteral) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.EnumerationLiteralAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.EnumerationLiteralAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.EnumerationLiteralImpl]
 implicit def richAspect(v : org.kermeta.language.structure.TypeVariableBinding) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeVariableBindingAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeVariableBindingAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.TypeVariableBindingImpl]
 implicit def richAspect(v : org.kermeta.language.structure.MultiplicityElement) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.MultiplicityElementAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.MultiplicityElementAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.MultiplicityElementImpl]
 implicit def richAspect(v : org.kermeta.language.structure.TypeDefinition) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeDefinitionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeDefinitionAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.TypeDefinitionImpl]
 implicit def richAspect(v : org.kermeta.language.structure.DataType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.DataTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.DataTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.DataType]
 implicit def richAspect(v : org.kermeta.language.structure.Enumeration) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.EnumerationAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.EnumerationAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.EnumerationImpl]
 implicit def richAspect(v : org.kermeta.language.structure.NamedElement) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.NamedElementAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.NamedElementAspect) = v.asInstanceOf[org.kermeta.language.structure.NamedElement]
 implicit def richAspect(v : org.kermeta.language.structure.Package) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.PackageAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.PackageAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.PackageImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Parameter) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ParameterAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ParameterAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ParameterImpl]
 implicit def richAspect(v : org.kermeta.language.structure.PrimitiveType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.PrimitiveTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.PrimitiveTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.PrimitiveTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.TypedElement) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypedElementAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypedElementAspect) = v.asInstanceOf[org.kermeta.language.structure.TypedElement]
 implicit def richAspect(v : org.kermeta.language.structure.Tag) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TagAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TagAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.TagImpl]
 implicit def richAspect(v : org.kermeta.language.structure.AbstractProperty) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.AbstractPropertyAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.AbstractPropertyAspect) = v.asInstanceOf[org.kermeta.language.structure.AbstractProperty]
 implicit def richAspect(v : org.kermeta.language.structure.Constraint) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ConstraintAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ConstraintAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ConstraintImpl]
 implicit def richAspect(v : org.kermeta.language.structure.ClassDefinition) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ClassDefinitionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ClassDefinitionAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ClassDefinitionImpl]
 implicit def richAspect(v : org.kermeta.language.structure.ModelingUnit) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ModelingUnitAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ModelingUnitAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ModelingUnitImpl]
 implicit def richAspect(v : org.kermeta.language.structure.TypeDefinitionContainer) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeDefinitionContainerAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeDefinitionContainerAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.TypeDefinitionContainerImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Require) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.RequireAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.RequireAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.RequireImpl]
 implicit def richAspect(v : org.kermeta.language.structure.GenericTypeDefinition) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.GenericTypeDefinitionAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.GenericTypeDefinitionAspect) = v.asInstanceOf[org.kermeta.language.structure.GenericTypeDefinition]
 implicit def richAspect(v : org.kermeta.language.structure.ParameterizedType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ParameterizedTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ParameterizedTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.ParameterizedType]
 implicit def richAspect(v : org.kermeta.language.structure.TypeVariable) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeVariableAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeVariableAspect) = v.asInstanceOf[org.kermeta.language.structure.TypeVariable]
 implicit def richAspect(v : org.kermeta.language.structure.ObjectTypeVariable) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ObjectTypeVariableAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ObjectTypeVariableAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ObjectTypeVariableImpl]
 implicit def richAspect(v : org.kermeta.language.structure.ModelType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ModelTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ModelTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ModelTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.ModelTypeVariable) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ModelTypeVariableAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ModelTypeVariableAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ModelTypeVariableImpl]
 implicit def richAspect(v : org.kermeta.language.structure.VirtualType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.VirtualTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.VirtualTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.VirtualTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Model) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ModelAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ModelAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ModelImpl]
 implicit def richAspect(v : org.kermeta.language.structure.AbstractOperation) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.AbstractOperationAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.AbstractOperationAspect) = v.asInstanceOf[org.kermeta.language.structure.AbstractOperation]
 implicit def richAspect(v : org.kermeta.language.structure.UnresolvedType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.UnresolvedTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.UnresolvedTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.UnresolvedTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Unresolved) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.UnresolvedAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.UnresolvedAspect) = v.asInstanceOf[org.kermeta.language.structure.Unresolved]
 implicit def richAspect(v : org.kermeta.language.structure.UnresolvedProperty) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.UnresolvedPropertyAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.UnresolvedPropertyAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.UnresolvedPropertyImpl]
 implicit def richAspect(v : org.kermeta.language.structure.UnresolvedOperation) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.UnresolvedOperationAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.UnresolvedOperationAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.UnresolvedOperationImpl]
 implicit def richAspect(v : org.kermeta.language.structure.Using) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.UsingAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.UsingAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.UsingImpl]
 implicit def richAspect(v : org.kermeta.language.structure.ProductType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.ProductTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.ProductTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.ProductTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.FunctionType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.FunctionTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.FunctionTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.FunctionTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.VoidType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.VoidTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.VoidTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.VoidTypeImpl]
 implicit def richAspect(v : org.kermeta.language.structure.TypeMapping) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.TypeMappingAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.TypeMappingAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.TypeMappingImpl]
 implicit def richAspect(v : org.kermeta.language.structure.UnresolvedInferredType) = v.asInstanceOf[group.KermetaDoc.org.kermeta.language.structure.UnresolvedInferredTypeAspect]
 implicit def richAspect(v : group.KermetaDoc.org.kermeta.language.structure.UnresolvedInferredTypeAspect) = v.asInstanceOf[org.kermeta.language.structure.impl.UnresolvedInferredTypeImpl]
}

