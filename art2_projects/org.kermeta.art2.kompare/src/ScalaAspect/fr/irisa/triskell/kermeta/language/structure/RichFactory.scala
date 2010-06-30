package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory extends fr.irisa.triskell.kermeta.language.structure.impl.StructureFactoryImpl{
 def createPropertyConstraint : ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichPropertyConstraint }
 override def createProperty : fr.irisa.triskell.kermeta.language.structure.Property = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichProperty }
 override def createClassDefinition : fr.irisa.triskell.kermeta.language.structure.ClassDefinition = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichClassDefinition }
 override def createObject : fr.irisa.triskell.kermeta.language.structure.Object = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichObject }
 override def createOperation : fr.irisa.triskell.kermeta.language.structure.Operation = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichOperation }
 override def createType : fr.irisa.triskell.kermeta.language.structure.Type = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichType }
 override def createEnumerationLiteral : fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichEnumerationLiteral }
 override def createTypeVariableBinding : fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichTypeVariableBinding }
 override def createMultiplicityElement : fr.irisa.triskell.kermeta.language.structure.MultiplicityElement = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichMultiplicityElement }
 override def createTypeDefinition : fr.irisa.triskell.kermeta.language.structure.TypeDefinition = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichTypeDefinition }
 override def createClass : fr.irisa.triskell.kermeta.language.structure.Class = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichClass }
 override def createEnumeration : fr.irisa.triskell.kermeta.language.structure.Enumeration = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichEnumeration }
 override def createPackage : fr.irisa.triskell.kermeta.language.structure.Package = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichPackage }
 override def createParameter : fr.irisa.triskell.kermeta.language.structure.Parameter = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichParameter }
 override def createPrimitiveType : fr.irisa.triskell.kermeta.language.structure.PrimitiveType = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichPrimitiveType }
 override def createTag : fr.irisa.triskell.kermeta.language.structure.Tag = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichTag }
 override def createConstraint : fr.irisa.triskell.kermeta.language.structure.Constraint = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichConstraint }
 override def createObjectTypeVariable : fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichObjectTypeVariable }
 override def createModelType : fr.irisa.triskell.kermeta.language.structure.ModelType = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichModelType }
 override def createModelTypeVariable : fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichModelTypeVariable }
 override def createVirtualType : fr.irisa.triskell.kermeta.language.structure.VirtualType = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichVirtualType }
 override def createModel : fr.irisa.triskell.kermeta.language.structure.Model = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichModel }
 override def createModelingUnit : fr.irisa.triskell.kermeta.language.structure.ModelingUnit = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichModelingUnit }
 override def createRequire : fr.irisa.triskell.kermeta.language.structure.Require = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichRequire }
 override def createUsing : fr.irisa.triskell.kermeta.language.structure.Using = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichUsing }
 override def createFilter : fr.irisa.triskell.kermeta.language.structure.Filter = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFilter }
 override def createProductType : fr.irisa.triskell.kermeta.language.structure.ProductType = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichProductType }
 override def createFunctionType : fr.irisa.triskell.kermeta.language.structure.FunctionType = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFunctionType }
 override def createVoidType : fr.irisa.triskell.kermeta.language.structure.VoidType = { new ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichVoidType }
}

