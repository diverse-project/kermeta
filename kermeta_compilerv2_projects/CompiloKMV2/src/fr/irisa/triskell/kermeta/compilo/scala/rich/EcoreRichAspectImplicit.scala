package fr.irisa.triskell.kermeta.compilo.scala.rich

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
  
trait EcoreRichAspectImplicit {
	
	implicit def rich (xs : Assignment) = xs.asInstanceOf[AssignementView]
    //implicit def rich (xs : AssignmentAspect) = xs.asInstanceOf[Assignment]
    implicit def rich (xs : ModelingUnit) = xs.asInstanceOf[ModelingUnitView]
    //implicit def rich (xs : ModelingUnitAspect) = xs.asInstanceOf[ModelingUnit]
    implicit def rich (xs : Package) = xs.asInstanceOf[PackageView]
    //implicit def rich (xs : PackageAspect) = xs.asInstanceOf[Package]
    implicit def rich (xs : fr.irisa.triskell.kermeta.language.structure.Class) = xs.asInstanceOf[ClassView] 
    //implicit def rich (xs : ClassAspect) = xs.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]
    implicit def rich (xs : ClassDefinition) = xs.asInstanceOf[ClassDefinitionView]
    //implicit def rich (xs : ClassDefinitionAspect) = xs.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ClassDefinition]
    implicit def rich (xs : Block) = (xs.asInstanceOf[BlockView]) 
    //implicit def rich (xs : BlockAspect) = (xs.asInstanceOf[Block])  
    //implicit def rich (xs : VirtualType) = xs.asInstanceOf[VirtualType]
    implicit def rich (xs : PrimitiveType) = xs.asInstanceOf[PrimitiveTypeView]
    //implicit def rich (xs : PrimitiveTypeAspect) = xs.asInstanceOf[PrimitiveType]
     
    implicit def rich (xs : CallResult) = xs.asInstanceOf[CallResultView]
    //implicit def rich (xs : CallResultAspect) = xs.asInstanceOf[CallResult] 
    //implicit def rich (xs : ModelTypeVariable) = xs.asInstanceOf[ModelTypeVariable]
    
    implicit def rich (xs : ObjectTypeVariable) = xs.asInstanceOf[ObjectTypeVariableView]
    //implicit def rich (xs : ObjectTypeVariableAspect) = xs.asInstanceOf[ObjectTypeVariable]
    
    //implicit def rich (xs : Parameter) = xs.asInstanceOf[ParameterAspect]
    //implicit def rich (xs : ParameterAspect) = xs.asInstanceOf[Parameter]
    
    implicit def rich (xs : Enumeration) = xs.asInstanceOf[EnumerationView]
    //implicit def rich (xs : EnumerationAspect) = xs.asInstanceOf[Enumeration]
     
    implicit def rich (xs : Property) = xs.asInstanceOf[PropertyView]
    //implicit def rich (xs : PropertyAspect) = xs.asInstanceOf[Property]
    implicit def rich (xs : fr.irisa.triskell.kermeta.language.behavior.TypeReference) = xs.asInstanceOf[TypeReferenceView]
    //implicit def rich (xs : TypeReferenceAspect) = xs.asInstanceOf[TypeReference]
   
    implicit def rich (xs : Operation) = xs.asInstanceOf[OperationView]
    //implicit def rich (xs : OperationAspect) = xs.asInstanceOf[Operation]
    
    implicit def rich (xs : TypeLiteral) = xs.asInstanceOf[TypeLiteralView]
    //implicit def rich (xs : TypeLiteralAspect) = xs.asInstanceOf[TypeLiteral]
    
    implicit def rich (xs : BooleanLiteral) = xs.asInstanceOf[BooleanLiteralView]
    //implicit def rich (xs : BooleanLiteralAspect) = xs.asInstanceOf[BooleanLiteral]
    
    implicit def rich (xs : CallValue) = xs.asInstanceOf[CallValueView]
    //implicit def rich (xs : CallValueAspect) = xs.asInstanceOf[CallValue]
   
    
    implicit def rich (xs : StringLiteral) = xs.asInstanceOf[StringLiteralView]
    //implicit def rich (xs : StringLiteralAspect) = xs.asInstanceOf[StringLiteral]
     
    
    implicit def rich (xs : VoidLiteral) = (xs.asInstanceOf[VoidLiteralView])
    //implicit def rich (xs : VoidLiteralAspect) = (xs.asInstanceOf[VoidLiteral])

    //implicit def rich (xs : MultiplicityElement) = (xs.asInstanceOf[MultiplicityElement])
    //implicit def rich (xs : TypeVariable) = (xs.asInstanceOf[TypeVariable])
    
    implicit def rich (xs : CallSuperOperation) = xs.asInstanceOf[CallSuperOperationView]
    //implicit def rich (xs : CallSuperOperationAspect) = xs.asInstanceOf[CallSuperOperation]
    
    implicit def rich (xs : CallVariable) = xs.asInstanceOf[CallVariableView]
    //implicit def rich (xs : CallVariableAspect) = xs.asInstanceOf[CallVariable]

    implicit def rich (xs : CallFeature) = xs.asInstanceOf[CallFeatureView]
    //implicit def rich (xs : CallFeatureAspect) = xs.asInstanceOf[CallFeature]
    
    
    implicit def rich (xs : IntegerLiteral) = xs.asInstanceOf[IntegerLiteralView]
    //implicit def rich (xs : IntegerLiteralAspect) = xs.asInstanceOf[IntegerLiteral]
   
    
    //implicit def rich (xs : ModelType) = (xs.asInstanceOf[ModelType])
    
    implicit def rich (xs : DataType) = xs.asInstanceOf[DataTypeView]
    //implicit def rich (xs : DataTypeAspect) = xs.asInstanceOf[DataType]
    

    
    implicit def rich (xs : SelfExpression) = xs.asInstanceOf[SelfExpressionView]
    //implicit def rich (xs : SelfExpressionAspect) = xs.asInstanceOf[SelfExpression]
    
    implicit def rich (xs : VariableDecl) = xs.asInstanceOf[VariableDeclView]
    //implicit def rich (xs : VariableDeclAspect) = xs.asInstanceOf[VariableDecl]
    
    implicit def rich (xs : CallExpression) = {xs.asInstanceOf[CallExpressionView]}
    //implicit def rich (xs : CallExpressionAspect) = xs.asInstanceOf[CallExpression]
    
    //implicit def rich (xs : EmptyExpression) = (xs.asInstanceOf[EmptyExpression])
   
    
    implicit def rich (xs : LambdaExpression) = xs.asInstanceOf[LambdaExpressionView]
    //implicit def rich (xs : LambdaExpressionAspect) = xs.asInstanceOf[LambdaExpression]
    
    //implicit def rich (xs : GenericTypeDefinition) = (xs.asInstanceOf[GenericTypeDefinition])
    //implicit def rich (xs : ProductType) = (xs.asInstanceOf[ProductType])
    //implicit def rich (xs : TypedElement) = (xs.asInstanceOf[TypedElement])
    
    
    //implicit def rich (xs : JavaStaticCall) = (xs.asInstanceOf[JavaStaticCall])
    
    implicit def rich (xs : Raise) = xs.asInstanceOf[RaiseView]
    //implicit def rich (xs : RaiseAspect) = xs.asInstanceOf[Raise]
    
    
    //implicit def rich (xs : Literal) = (xs.asInstanceOf[Literal])
    //implicit def rich (xs : FunctionType) = (xs.asInstanceOf[FunctionType])
    
    implicit def rich (xs : Loop) = xs.asInstanceOf[LoopView]
    //implicit def rich (xs : LoopAspect) = xs.asInstanceOf[Loop]
    
    implicit def rich (xs : Conditional) = xs.asInstanceOf[ConditionalView]
    //implicit def rich (xs : ConditionalAspect) = xs.asInstanceOf[Conditional]
    
    
    //implicit def rich (xs : ObjectAspect) = xs.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Object]
 
    implicit def rich (xs : EnumerationLiteral) = xs.asInstanceOf[EnumerationLiteralView]
    //implicit def rich (xs : EnumerationLiteralAspect) = xs.asInstanceOf[EnumerationLiteral]
      
    //implicit def rich (xs : Constraint) = (xs.asInstanceOf[Constraint])
    //implicit def rich (xs : TypeDefinitionContainer) = (xs.asInstanceOf[TypeDefinitionContainer])
    //implicit def rich (xs : ParameterizedType) = (xs.asInstanceOf[ParameterizedType])
    implicit def rich (xs : VoidType) = (xs.asInstanceOf[VoidTypeView])
    //implicit def rich (xs : VoidTypeAspect) = (xs.asInstanceOf[VoidType])

    //implicit def rich (xs : TypeDefinition) = (xs.asInstanceOf[TypeDefinition])
    //implicit def rich (xs : fr.irisa.triskell.kermeta.language.behavior.Expression) = (xs.asInstanceOf[ExpressionView])
    
    implicit def rich (xs : TypeVariableBinding) = xs.asInstanceOf[TypeVariableBindingView]
    
    //implicit def rich (xs : TypeVariableBindingAspect) = xs.asInstanceOf[TypeVariableBinding]
    
    //implicit def rich (xs : Type) = (xs.asInstanceOf[TypeView]) 
    //implicit def rich (xs : NamedElement) = (xs.asInstanceOf[NamedElement])
    //implicit def rich (xs : Rescue) = (xs.asInstanceOf[Rescue])
    //implicit def rich (xs : Require) = (xs.asInstanceOf[Require])
    
    implicit def rich (xs : Using) = xs.asInstanceOf[UsingView]
    //implicit def rich (xs : UsingAspect) = xs.asInstanceOf[Using]
    
    //implicit def rich (xs : Filter) = (xs.asInstanceOf[Filter])
    //implicit def rich (xs : TypeContainer) = (xs.asInstanceOf[TypeContainer])
    //implicit def rich (xs : Tag) = (xs.asInstanceOf[Tag])
    
    implicit def rich (xs : LambdaParameter) = xs.asInstanceOf[LambdaParameterView]
    //implicit def rich (xs : LambdaParameterAspect) = xs.asInstanceOf[LambdaParameter]
    
    
    
    implicit def rich (xs : PackageAspect) = xs.asInstanceOf[PackageView]
    implicit def rich (xs : ModelingUnitAspect) = xs.asInstanceOf[ModelingUnitView]
    implicit def rich (xs : ClassDefinitionAspect) = xs.asInstanceOf[ClassDefinitionView]
    implicit def rich (xs : fr.irisa.triskell.kermeta.language.structure.Object) = xs.asInstanceOf[ObjectView]
}
