/* .scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package org.kermeta.compilo.scala.rich

import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.richAspect._
  
object RichAspectImplicit {
	
  implicit def rich (xs : Assignment) = xs.asInstanceOf[AssignmentAspect]
  implicit def rich (xs : ModelingUnit) = xs.asInstanceOf[ModelingUnitAspect]
  implicit def rich (xs : Package) = xs.asInstanceOf[PackageAspect]
  implicit def rich (xs : org.kermeta.language.structure.Class) = xs.asInstanceOf[ClassAspect]
  implicit def rich (xs : ClassDefinition) = xs.asInstanceOf[ClassDefinitionAspect]
  implicit def rich (xs : Block) = (xs.asInstanceOf[BlockAspect])
  implicit def rich (xs : PrimitiveType) = xs.asInstanceOf[PrimitiveTypeAspect]
  implicit def rich (xs : CallResult) = xs.asInstanceOf[CallResultAspect]
  implicit def rich (xs : ObjectTypeVariable) = xs.asInstanceOf[KermetaModelElementTypeVariableAspect]
  implicit def rich (xs : Enumeration) = xs.asInstanceOf[EnumerationAspect]
  implicit def rich (xs : Property) = xs.asInstanceOf[PropertyAspect]
  implicit def rich (xs : org.kermeta.language.behavior.TypeReference) = xs.asInstanceOf[TypeReferenceAspect]
  implicit def rich (xs : Operation) = xs.asInstanceOf[OperationAspect]
  implicit def rich (xs : CallTypeLiteral) = xs.asInstanceOf[CallTypeLiteralAspect]
  implicit def rich (xs : BooleanLiteral) = xs.asInstanceOf[BooleanLiteralAspect]
  implicit def rich (xs : CallValue) = xs.asInstanceOf[CallValueAspect]
  implicit def rich (xs : StringLiteral) = xs.asInstanceOf[StringLiteralAspect]
  implicit def rich (xs : VoidLiteral) = (xs.asInstanceOf[VoidLiteralAspect])
  implicit def rich (xs : CallSuperOperation) = xs.asInstanceOf[CallSuperOperationAspect]
  implicit def rich (xs : CallVariable) = xs.asInstanceOf[CallVariableAspect]
  implicit def rich (xs : CallOperation) = xs.asInstanceOf[CallOperationAspect]
  implicit def rich (xs : CallEnumLiteral) = xs.asInstanceOf[CallEnumLiteralAspect]
  implicit def rich (xs : CallProperty) = xs.asInstanceOf[CallPropertyAspect]
  implicit def rich (xs : CallExpression) = xs.asInstanceOf[CallExpressionAspect]
  implicit def rich (xs : IntegerLiteral) = xs.asInstanceOf[IntegerLiteralAspect]
  implicit def rich (xs : DataType) = xs.asInstanceOf[DataTypeAspect]
  implicit def rich (xs : SelfExpression) = xs.asInstanceOf[SelfExpressionAspect]
  implicit def rich (xs : VariableDecl) = xs.asInstanceOf[VariableDeclAspect]
  implicit def rich (xs : LambdaExpression) = xs.asInstanceOf[LambdaExpressionAspect]
  implicit def rich (xs : Raise) = xs.asInstanceOf[RaiseAspect]
  implicit def rich (xs : Loop) = xs.asInstanceOf[LoopAspect]
  implicit def rich (xs : Conditional) = xs.asInstanceOf[ConditionalAspect]
  implicit def rich (xs : EnumerationLiteral) = xs.asInstanceOf[EnumerationLiteralAspect]
  implicit def rich (xs : VoidType) = (xs.asInstanceOf[VoidTypeAspect])
  implicit def rich (xs : TypeVariableBinding) = xs.asInstanceOf[TypeVariableBindingAspect]
  implicit def rich (xs : Using) = xs.asInstanceOf[UsingAspect]
  implicit def rich (xs : LambdaParameter) = xs.asInstanceOf[LambdaParameterAspect]
  implicit def rich (xs : org.kermeta.language.structure.KermetaModelElement) = xs.asInstanceOf[KermetaModelElementAspect]
  implicit def rich (xs : FunctionType) = xs.asInstanceOf[FunctionTypeAspect]
  implicit def rich (xs : ProductType) = xs.asInstanceOf[ProductTypeAspect]
  implicit def rich (xs : Constraint) = xs.asInstanceOf[ConstraintAspect]
  implicit def rich (xs : Rescue) = xs.asInstanceOf[RescueAspect]

  implicit def rich (xs : JavaStaticCall) = xs.asInstanceOf[JavaStaticCallAspect]
  implicit def rich (xs : JavaStaticCallAspect) = xs.asInstanceOf[JavaStaticCall]
	
	
  implicit def rich (xs : PackageAspect) = xs.asInstanceOf[Package]
  implicit def rich (xs : ModelingUnitAspect) = xs.asInstanceOf[ModelingUnit]
  implicit def rich (xs : ClassDefinitionAspect) = xs.asInstanceOf[ClassDefinition]
  implicit def rich (xs : AssignmentAspect) = xs.asInstanceOf[Assignment]
  implicit def rich (xs : BlockAspect) = xs.asInstanceOf[Block]
  implicit def rich (xs : BooleanLiteralAspect) = xs.asInstanceOf[BooleanLiteral]
  implicit def rich (xs : CallExpressionAspect) = xs.asInstanceOf[CallExpression]
  implicit def rich (xs : CallOperationAspect) = xs.asInstanceOf[CallOperation]
    implicit def rich (xs : CallPropertyAspect) = xs.asInstanceOf[CallProperty]
  implicit def rich (xs : CallSuperOperationAspect) = xs.asInstanceOf[CallSuperOperation]

  implicit def rich (xs : CallValueAspect) = xs.asInstanceOf[CallValue]
  implicit def rich (xs : CallVariableAspect) = xs.asInstanceOf[CallVariable]
  implicit def rich (xs : ClassAspect) = xs.asInstanceOf[Class]
  implicit def rich (xs : ConditionalAspect) = xs.asInstanceOf[Conditional]
  implicit def rich (xs : DataTypeAspect) = xs.asInstanceOf[DataType]
  implicit def rich (xs : EnumerationAspect) = xs.asInstanceOf[org.kermeta.language.structure.Enumeration]
  implicit def rich (xs : EnumerationLiteralAspect) = xs.asInstanceOf[EnumerationLiteral]
  implicit def rich (xs : CallEnumLiteralAspect) = xs.asInstanceOf[CallEnumLiteral]
  implicit def rich (xs : IntegerLiteralAspect) = xs.asInstanceOf[IntegerLiteral]
  implicit def rich (xs : VariableDeclAspect) = xs.asInstanceOf[VariableDecl]
  implicit def rich (xs : UsingAspect) = xs.asInstanceOf[Using]
  implicit def rich (xs : TypeVariableBindingAspect) = xs.asInstanceOf[TypeVariableBinding]
  implicit def rich (xs : StringLiteralAspect) = xs.asInstanceOf[StringLiteral]
  implicit def rich (xs : PropertyAspect) = xs.asInstanceOf[Property]
  implicit def rich (xs : FunctionTypeAspect) = xs.asInstanceOf[FunctionType]
  implicit def rich (xs : ProductTypeAspect) = xs.asInstanceOf[ProductType]
  implicit def rich (xs : LambdaExpressionAspect) = xs.asInstanceOf[LambdaExpression]
  implicit def rich (xs : ConstraintAspect) = xs.asInstanceOf[Constraint]
  implicit def rich (xs : RescueAspect) = xs.asInstanceOf[Rescue]
  implicit def rich (xs : LoopAspect) = xs.asInstanceOf[Loop]
  implicit def rich (xs : RaiseAspect) = xs.asInstanceOf[Raise]
  implicit def rich (xs : CallTypeLiteralAspect) = xs.asInstanceOf[CallTypeLiteral]
  implicit def rich (xs : KermetaModelElementTypeVariableAspect) = xs.asInstanceOf[ObjectTypeVariable]
  implicit def rich (xs : TypeReferenceAspect) = xs.asInstanceOf[TypeReference]
}
