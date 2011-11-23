package group.km2html.org.kermeta.language.structure
import ScalaImplicit.group.km2html.ImplicitConversion._
object KerRichFactory extends org.kermeta.language.structure.impl.StructureFactoryImpl{
 override def createModelingUnit() : org.kermeta.language.structure.ModelingUnit = { new group.km2html.org.kermeta.language.structure.RichModelingUnit }
 override def createKermetaModelElement() : org.kermeta.language.structure.KermetaModelElement = { new group.km2html.org.kermeta.language.structure.RichKermetaModelElement }
 override def createOperation() : org.kermeta.language.structure.Operation = { new group.km2html.org.kermeta.language.structure.RichOperation }
 override def createProperty() : org.kermeta.language.structure.Property = { new group.km2html.org.kermeta.language.structure.RichProperty }
 override def createEnumerationLiteral() : org.kermeta.language.structure.EnumerationLiteral = { new group.km2html.org.kermeta.language.structure.RichEnumerationLiteral }
 override def createTypeVariableBinding() : org.kermeta.language.structure.TypeVariableBinding = { new group.km2html.org.kermeta.language.structure.RichTypeVariableBinding }
 override def createMultiplicityElement() : org.kermeta.language.structure.MultiplicityElement = { new group.km2html.org.kermeta.language.structure.RichMultiplicityElement }
 override def createTypeDefinition() : org.kermeta.language.structure.TypeDefinition = { new group.km2html.org.kermeta.language.structure.RichTypeDefinition }
 override def createEnumeration() : org.kermeta.language.structure.Enumeration = { new group.km2html.org.kermeta.language.structure.RichEnumeration }
 override def createPackage() : org.kermeta.language.structure.Package = { new group.km2html.org.kermeta.language.structure.RichPackage }
 override def createParameter() : org.kermeta.language.structure.Parameter = { new group.km2html.org.kermeta.language.structure.RichParameter }
 override def createPrimitiveType() : org.kermeta.language.structure.PrimitiveType = { new group.km2html.org.kermeta.language.structure.RichPrimitiveType }
 override def createTag() : org.kermeta.language.structure.Tag = { new group.km2html.org.kermeta.language.structure.RichTag }
 override def createConstraint() : org.kermeta.language.structure.Constraint = { new group.km2html.org.kermeta.language.structure.RichConstraint }
 override def createClassDefinition() : org.kermeta.language.structure.ClassDefinition = { new group.km2html.org.kermeta.language.structure.RichClassDefinition }
 override def createTypeDefinitionContainer() : org.kermeta.language.structure.TypeDefinitionContainer = { new group.km2html.org.kermeta.language.structure.RichTypeDefinitionContainer }
 override def createRequire() : org.kermeta.language.structure.Require = { new group.km2html.org.kermeta.language.structure.RichRequire }
 override def createObjectTypeVariable() : org.kermeta.language.structure.ObjectTypeVariable = { new group.km2html.org.kermeta.language.structure.RichObjectTypeVariable }
 override def createModelType() : org.kermeta.language.structure.ModelType = { new group.km2html.org.kermeta.language.structure.RichModelType }
 override def createModelTypeVariable() : org.kermeta.language.structure.ModelTypeVariable = { new group.km2html.org.kermeta.language.structure.RichModelTypeVariable }
 override def createVirtualType() : org.kermeta.language.structure.VirtualType = { new group.km2html.org.kermeta.language.structure.RichVirtualType }
 override def createModel() : org.kermeta.language.structure.Model = { new group.km2html.org.kermeta.language.structure.RichModel }
 override def createUnresolvedType() : org.kermeta.language.structure.UnresolvedType = { new group.km2html.org.kermeta.language.structure.RichUnresolvedType }
 override def createUnresolvedProperty() : org.kermeta.language.structure.UnresolvedProperty = { new group.km2html.org.kermeta.language.structure.RichUnresolvedProperty }
 override def createUnresolvedOperation() : org.kermeta.language.structure.UnresolvedOperation = { new group.km2html.org.kermeta.language.structure.RichUnresolvedOperation }
 override def createUsing() : org.kermeta.language.structure.Using = { new group.km2html.org.kermeta.language.structure.RichUsing }
 override def createProductType() : org.kermeta.language.structure.ProductType = { new group.km2html.org.kermeta.language.structure.RichProductType }
 override def createFunctionType() : org.kermeta.language.structure.FunctionType = { new group.km2html.org.kermeta.language.structure.RichFunctionType }
 override def createVoidType() : org.kermeta.language.structure.VoidType = { new group.km2html.org.kermeta.language.structure.RichVoidType }
 override def createTypeMapping() : org.kermeta.language.structure.TypeMapping = { new group.km2html.org.kermeta.language.structure.RichTypeMapping }
 override def createUnresolvedInferredType() : org.kermeta.language.structure.UnresolvedInferredType = { new group.km2html.org.kermeta.language.structure.RichUnresolvedInferredType }
}

