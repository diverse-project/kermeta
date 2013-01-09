package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
object KerRichFactory extends org.kermeta.language.structure.impl.StructureFactoryImpl{
 override def createOperation() : org.kermeta.language.structure.Operation = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichOperation }
 override def createProperty() : org.kermeta.language.structure.Property = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichProperty }
 override def createEnumerationLiteral() : org.kermeta.language.structure.EnumerationLiteral = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichEnumerationLiteral }
 override def createTypeVariableBinding() : org.kermeta.language.structure.TypeVariableBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichTypeVariableBinding }
 override def createMultiplicityElement() : org.kermeta.language.structure.MultiplicityElement = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichMultiplicityElement }
 override def createTypeDefinition() : org.kermeta.language.structure.TypeDefinition = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichTypeDefinition }
 override def createClass() : org.kermeta.language.structure.Class = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichClass }
 override def createEnumeration() : org.kermeta.language.structure.Enumeration = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichEnumeration }
 override def createPackage() : org.kermeta.language.structure.Package = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichPackage }
 override def createParameter() : org.kermeta.language.structure.Parameter = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichParameter }
 override def createPrimitiveType() : org.kermeta.language.structure.PrimitiveType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichPrimitiveType }
 override def createTag() : org.kermeta.language.structure.Tag = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichTag }
 override def createConstraint() : org.kermeta.language.structure.Constraint = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichConstraint }
 override def createClassDefinition() : org.kermeta.language.structure.ClassDefinition = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichClassDefinition }
 override def createModelingUnit() : org.kermeta.language.structure.ModelingUnit = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichModelingUnit }
 override def createTypeDefinitionContainer() : org.kermeta.language.structure.TypeDefinitionContainer = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichTypeDefinitionContainer }
 override def createRequire() : org.kermeta.language.structure.Require = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichRequire }
 override def createObjectTypeVariable() : org.kermeta.language.structure.ObjectTypeVariable = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichObjectTypeVariable }
 override def createModelType() : org.kermeta.language.structure.ModelType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichModelType }
 override def createModelTypeVariable() : org.kermeta.language.structure.ModelTypeVariable = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichModelTypeVariable }
 override def createVirtualType() : org.kermeta.language.structure.VirtualType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichVirtualType }
 override def createModel() : org.kermeta.language.structure.Model = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichModel }
 override def createUnresolvedType() : org.kermeta.language.structure.UnresolvedType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUnresolvedType }
 override def createUnresolvedProperty() : org.kermeta.language.structure.UnresolvedProperty = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUnresolvedProperty }
 override def createUnresolvedOperation() : org.kermeta.language.structure.UnresolvedOperation = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUnresolvedOperation }
 override def createUsing() : org.kermeta.language.structure.Using = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUsing }
 override def createProductType() : org.kermeta.language.structure.ProductType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichProductType }
 override def createFunctionType() : org.kermeta.language.structure.FunctionType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichFunctionType }
 override def createVoidType() : org.kermeta.language.structure.VoidType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichVoidType }
 override def createUnresolvedInferredType() : org.kermeta.language.structure.UnresolvedInferredType = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUnresolvedInferredType }
 override def createUnresolvedTypeVariable() : org.kermeta.language.structure.UnresolvedTypeVariable = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUnresolvedTypeVariable }
 override def createSimpleBinding() : org.kermeta.language.structure.SimpleBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichSimpleBinding }
 override def createAdaptationBinding() : org.kermeta.language.structure.AdaptationBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichAdaptationBinding }
 override def createSimpleClassDefinitionBinding() : org.kermeta.language.structure.SimpleClassDefinitionBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichSimpleClassDefinitionBinding }
 override def createComplexClassDefinitionBinding() : org.kermeta.language.structure.ComplexClassDefinitionBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichComplexClassDefinitionBinding }
 override def createSimpleEnumerationBinding() : org.kermeta.language.structure.SimpleEnumerationBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichSimpleEnumerationBinding }
 override def createComplexEnumerationBinding() : org.kermeta.language.structure.ComplexEnumerationBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichComplexEnumerationBinding }
 override def createSimplePropertyBinding() : org.kermeta.language.structure.SimplePropertyBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichSimplePropertyBinding }
 override def createComplexPropertyBinding() : org.kermeta.language.structure.ComplexPropertyBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichComplexPropertyBinding }
 override def createSimpleOperationBinding() : org.kermeta.language.structure.SimpleOperationBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichSimpleOperationBinding }
 override def createComplexOperationBinding() : org.kermeta.language.structure.ComplexOperationBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichComplexOperationBinding }
 override def createSimpleParameterBinding() : org.kermeta.language.structure.SimpleParameterBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichSimpleParameterBinding }
 override def createComplexParameterBinding() : org.kermeta.language.structure.ComplexParameterBinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichComplexParameterBinding }
 override def createEnumLiteralbinding() : org.kermeta.language.structure.EnumLiteralbinding = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichEnumLiteralbinding }
 override def createAdaptationOperator() : org.kermeta.language.structure.AdaptationOperator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichAdaptationOperator }
 override def createUseAdaptationOperator() : org.kermeta.language.structure.UseAdaptationOperator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUseAdaptationOperator }
 override def createPropertyAdaptationOperator() : org.kermeta.language.structure.PropertyAdaptationOperator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichPropertyAdaptationOperator }
 override def createUnresolvedAdaptationOperator() : org.kermeta.language.structure.UnresolvedAdaptationOperator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichUnresolvedAdaptationOperator }
 override def createAdaptationParameter() : org.kermeta.language.structure.AdaptationParameter = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichAdaptationParameter }
 override def createOperationAdaptationOperator() : org.kermeta.language.structure.OperationAdaptationOperator = { new org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.RichOperationAdaptationOperator }
}

