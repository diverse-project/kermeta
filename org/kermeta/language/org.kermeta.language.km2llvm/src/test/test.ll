@"s0" = private unnamed_addr constant [8 x i8] c"kermeta\00"
@"s1" = private unnamed_addr constant [4 x i8] c"ocl\00"
@"s2" = private unnamed_addr constant [4 x i8] c"inv\00"
@"s3" = private unnamed_addr constant [4 x i8] c"pre\00"
@"s4" = private unnamed_addr constant [5 x i8] c"post\00"
%"org::kermeta::language::behavior_Assignment" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_CallExpression"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::behavior_Expression" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::behavior_Assignment"*, %"org::kermeta::language::behavior_CallExpression"*, %"org::kermeta::language::behavior_Block"*, %"org::kermeta::language::behavior_Conditional"*, %"org::kermeta::language::behavior_Raise"*, %"org::kermeta::language::behavior_Literal"*, %"org::kermeta::language::behavior_EmptyExpression"*, %"org::kermeta::language::behavior_JavaStaticCall"*, %"org::kermeta::language::behavior_LambdaExpression"*, %"org::kermeta::language::behavior_Loop"*, %"org::kermeta::language::behavior_SelfExpression"*, %"org::kermeta::language::behavior_VariableDecl"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::behavior_CallExpression" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_CallVariable"*, %"org::kermeta::language::behavior_CallFeature"*, %"org::kermeta::language::behavior_CallValue"*, %"org::kermeta::language::behavior_UnresolvedCall"*, %"org::kermeta::language::behavior_CallEnumLiteral"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_String"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::behavior_Block" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Rescue"*}
%"org::kermeta::language::behavior_CallVariable" = type {%"org::kermeta::language::behavior_CallExpression"*, %"org::kermeta::language::behavior_CallResult"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::behavior_CallFeature" = type {%"org::kermeta::language::behavior_CallExpression"*, %"org::kermeta::language::behavior_CallOperation"*, %"org::kermeta::language::behavior_CallProperty"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::behavior_CallSuperOperation" = type {%"org::kermeta::language::behavior_CallOperation"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::behavior_CallResult" = type {%"org::kermeta::language::behavior_CallVariable"*}
%"org::kermeta::language::behavior_CallValue" = type {%"org::kermeta::language::behavior_CallExpression"*}
%"org::kermeta::language::behavior_Conditional" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*}
%"org::kermeta::language::behavior_Raise" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*}
%"org::kermeta::language::behavior_Rescue" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_TypeReference"*, %"kermeta::standard_String"*}
%"org::kermeta::language::behavior_TypeReference" = type {%"org::kermeta::language::structure_MultiplicityElement"*}
%"org::kermeta::language::behavior_Literal" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_IntegerLiteral"*, %"org::kermeta::language::behavior_StringLiteral"*, %"org::kermeta::language::behavior_BooleanLiteral"*, %"org::kermeta::language::behavior_CallTypeLiteral"*, %"org::kermeta::language::behavior_VoidLiteral"*}
%"org::kermeta::language::behavior_EmptyExpression" = type {%"org::kermeta::language::behavior_Expression"*}
%"org::kermeta::language::behavior_JavaStaticCall" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_String"*, %"kermeta::standard_String"*}
%"org::kermeta::language::behavior_LambdaExpression" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_LambdaParameter"*, %"org::kermeta::language::behavior_Expression"*}
%"org::kermeta::language::behavior_LambdaParameter" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"kermeta::standard_String"*, %"org::kermeta::language::behavior_TypeReference"*}
%"org::kermeta::language::behavior_IntegerLiteral" = type {%"org::kermeta::language::behavior_Literal"*, %"kermeta::standard_Integer"*}
%"org::kermeta::language::behavior_StringLiteral" = type {%"org::kermeta::language::behavior_Literal"*, %"kermeta::standard_String"*}
%"org::kermeta::language::behavior_BooleanLiteral" = type {%"org::kermeta::language::behavior_Literal"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::behavior_CallTypeLiteral" = type {%"org::kermeta::language::behavior_Literal"*, %"org::kermeta::language::behavior_TypeReference"*}
%"org::kermeta::language::behavior_VoidLiteral" = type {%"org::kermeta::language::behavior_Literal"*}
%"org::kermeta::language::behavior_Loop" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*}
%"org::kermeta::language::behavior_SelfExpression" = type {%"org::kermeta::language::behavior_Expression"*}
%"org::kermeta::language::behavior_VariableDecl" = type {%"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_String"*, %"org::kermeta::language::behavior_TypeReference"*}
%"org::kermeta::language::behavior_UnresolvedCall" = type {%"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::behavior_CallExpression"*, %"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_Using"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_Boolean"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Type"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::behavior_CallOperation" = type {%"org::kermeta::language::behavior_CallFeature"*, %"org::kermeta::language::behavior_CallSuperOperation"*, %"org::kermeta::language::structure_Operation"*}
%"org::kermeta::language::behavior_CallProperty" = type {%"org::kermeta::language::behavior_CallFeature"*, %"org::kermeta::language::structure_Property"*}
%"org::kermeta::language::behavior_CallEnumLiteral" = type {%"org::kermeta::language::behavior_CallExpression"*, %"org::kermeta::language::structure_EnumerationLiteral"*}
%"org::kermeta::language::structure_KermetaModelElement" = type {%"kermeta::standard_Object"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Rescue"*, %"org::kermeta::language::behavior_LambdaParameter"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_TypeVariableBinding"*, %"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_Tag"*, %"org::kermeta::language::structure_AbstractProperty"*, %"org::kermeta::language::structure_Metamodel"*, %"org::kermeta::language::structure_Model"*, %"org::kermeta::language::structure_AbstractOperation"*, %"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::structure_Using"*, %"org::kermeta::language::structure_MetamodelBinding"*, %"org::kermeta::language::structure_ClassDefinitionBinding"*, %"org::kermeta::language::structure_EnumerationBinding"*, %"org::kermeta::language::structure_PropertyBinding"*, %"org::kermeta::language::structure_OperationBinding"*, %"org::kermeta::language::structure_UseAdaptationOperator"*, %"org::kermeta::language::structure_FilteredMetamodelReference"*, %"org::kermeta::language::structure_Tag"*, %"org::kermeta::language::structure_Tag"*}
%"org::kermeta::language::structure_Operation" = type {%"org::kermeta::language::structure_MultiplicityElement"*, %"org::kermeta::language::structure_AbstractOperation"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Parameter"*, %"org::kermeta::language::structure_Constraint"*, %"org::kermeta::language::structure_Constraint"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::structure_UnresolvedOperation"*, %"org::kermeta::language::structure_ClassDefinition"*, %"org::kermeta::language::structure_TypeVariable"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_Property" = type {%"org::kermeta::language::structure_MultiplicityElement"*, %"org::kermeta::language::structure_AbstractProperty"*, %"org::kermeta::language::structure_AbstractProperty"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_String"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Boolean"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_Expression"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Boolean"*, %"org::kermeta::language::structure_UnresolvedProperty"*, %"org::kermeta::language::structure_ClassDefinition"*}
%"org::kermeta::language::structure_Type" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_DataType"*, %"org::kermeta::language::structure_ParameterizedType"*, %"org::kermeta::language::structure_TypeVariable"*, %"org::kermeta::language::structure_UnresolvedType"*, %"org::kermeta::language::structure_ProductType"*, %"org::kermeta::language::structure_FunctionType"*, %"org::kermeta::language::structure_VoidType"*, %"org::kermeta::language::structure_UnresolvedInferredType"*, %"org::kermeta::language::structure_ModelType"*, %"org::kermeta::language::structure_TypeContainer"*}
%"org::kermeta::language::structure_TypeContainer" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::behavior_UnresolvedCall"*, %"org::kermeta::language::structure_TypeVariableBinding"*, %"org::kermeta::language::structure_TypeDefinition"*, %"org::kermeta::language::structure_TypedElement"*, %"org::kermeta::language::structure_TypeVariable"*, %"org::kermeta::language::structure_UnresolvedType"*, %"org::kermeta::language::structure_UnresolvedOperation"*, %"org::kermeta::language::structure_ProductType"*, %"org::kermeta::language::structure_FunctionType"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_EnumerationLiteral" = type {%"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_Enumeration"*}
%"org::kermeta::language::structure_TypeVariableBinding" = type {%"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_TypeVariable"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_MultiplicityElement" = type {%"org::kermeta::language::structure_TypedElement"*, %"org::kermeta::language::behavior_TypeReference"*, %"org::kermeta::language::structure_Operation"*, %"org::kermeta::language::structure_Property"*, %"org::kermeta::language::structure_Parameter"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Integer"*, %"kermeta::standard_Integer"*}
%"org::kermeta::language::structure_TypeDefinition" = type {%"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_Metamodel"*, %"org::kermeta::language::structure_ModelElementTypeDefinition"*, %"org::kermeta::language::structure_Type"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::structure_Class" = type {%"org::kermeta::language::structure_ParameterizedType"*, %"org::kermeta::language::structure_Property"*, %"org::kermeta::language::structure_Operation"*, %"org::kermeta::language::structure_Class"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_DataType" = type {%"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_ModelElementTypeDefinition"*, %"org::kermeta::language::structure_Enumeration"*, %"org::kermeta::language::structure_PrimitiveType"*}
%"org::kermeta::language::structure_Enumeration" = type {%"org::kermeta::language::structure_DataType"*, %"org::kermeta::language::structure_EnumerationLiteral"*}
%"org::kermeta::language::structure_NamedElement" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_EnumerationLiteral"*, %"org::kermeta::language::structure_TypeDefinition"*, %"org::kermeta::language::structure_Package"*, %"org::kermeta::language::structure_TypedElement"*, %"org::kermeta::language::structure_Constraint"*, %"org::kermeta::language::structure_Metamodel"*, %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"*, %"org::kermeta::language::structure_TypeVariable"*, %"org::kermeta::language::structure_AdaptationOperator"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_Package" = type {%"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"*, %"org::kermeta::language::structure_Package"*, %"org::kermeta::language::structure_Package"*, %"kermeta::standard_String"*, %"org::kermeta::language::structure_AdaptationOperator"*}
%"org::kermeta::language::structure_Parameter" = type {%"org::kermeta::language::structure_MultiplicityElement"*, %"org::kermeta::language::structure_Operation"*}
%"org::kermeta::language::structure_PrimitiveType" = type {%"org::kermeta::language::structure_DataType"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_TypedElement" = type {%"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_MultiplicityElement"*, %"org::kermeta::language::structure_AdaptationParameter"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_Tag" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"kermeta::standard_String"*, %"kermeta::standard_String"*, %"org::kermeta::language::structure_KermetaModelElement"*}
%"org::kermeta::language::structure_AbstractProperty" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Property"*, %"org::kermeta::language::structure_UnresolvedProperty"*}
%"org::kermeta::language::structure_Constraint" = type {%"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::behavior_Expression"*, %"org::kermeta::language::structure_ConstraintType"*, %"org::kermeta::language::structure_ConstraintLanguage"*, %"org::kermeta::language::structure_ClassDefinition"*, %"org::kermeta::language::structure_Operation"*, %"org::kermeta::language::structure_Operation"*}
%"org::kermeta::language::structure_ConstraintLanguage" = type {i8*}
@"org::kermeta::language::structure_ConstraintLanguage#kermeta" = constant %"org::kermeta::language::structure_ConstraintLanguage"{i8* getelementptr([8 x i8]* @"s0",i32 0,i32 0)}
@"org::kermeta::language::structure_ConstraintLanguage#ocl" = constant %"org::kermeta::language::structure_ConstraintLanguage"{i8* getelementptr([4 x i8]* @"s1",i32 0,i32 0)}
%"org::kermeta::language::structure_ClassDefinition" = type {%"org::kermeta::language::structure_GenericTypeDefinition"*, %"org::kermeta::language::structure_Constraint"*, %"kermeta::standard_Boolean"*, %"org::kermeta::language::structure_Property"*, %"org::kermeta::language::structure_Operation"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::structure_ConstraintType" = type {i8*}
@"org::kermeta::language::structure_ConstraintType#inv" = constant %"org::kermeta::language::structure_ConstraintType"{i8* getelementptr([4 x i8]* @"s2",i32 0,i32 0)}
@"org::kermeta::language::structure_ConstraintType#pre" = constant %"org::kermeta::language::structure_ConstraintType"{i8* getelementptr([4 x i8]* @"s3",i32 0,i32 0)}
@"org::kermeta::language::structure_ConstraintType#post" = constant %"org::kermeta::language::structure_ConstraintType"{i8* getelementptr([5 x i8]* @"s4",i32 0,i32 0)}
%"org::kermeta::language::structure_Metamodel" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_TypeDefinition"*, %"org::kermeta::language::structure_Package"*, %"kermeta::standard_String"*, %"org::kermeta::language::structure_FilteredMetamodelReference"*, %"kermeta::standard_Boolean"*}
%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer" = type {%"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_Package"*, %"org::kermeta::language::structure_ModelElementTypeDefinition"*}
%"org::kermeta::language::structure_GenericTypeDefinition" = type {%"org::kermeta::language::structure_ModelElementTypeDefinition"*, %"org::kermeta::language::structure_ClassDefinition"*, %"org::kermeta::language::structure_TypeVariable"*}
%"org::kermeta::language::structure_ParameterizedType" = type {%"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Class"*, %"org::kermeta::language::structure_TypeVariableBinding"*, %"org::kermeta::language::structure_TypeVariableBinding"*, %"org::kermeta::language::structure_GenericTypeDefinition"*}
%"org::kermeta::language::structure_TypeVariable" = type {%"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_ObjectTypeVariable"*, %"org::kermeta::language::structure_ModelTypeVariable"*, %"org::kermeta::language::structure_UnresolvedTypeVariable"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_ObjectTypeVariable" = type {%"org::kermeta::language::structure_TypeVariable"*, %"org::kermeta::language::structure_VirtualType"*}
%"org::kermeta::language::structure_ModelTypeVariable" = type {%"org::kermeta::language::structure_TypeVariable"*, %"org::kermeta::language::structure_VirtualType"*}
%"org::kermeta::language::structure_VirtualType" = type {%"org::kermeta::language::structure_ObjectTypeVariable"*, %"org::kermeta::language::structure_ClassDefinition"*, %"org::kermeta::language::structure_ModelTypeVariable"*, %"org::kermeta::language::structure_TypeVariableBinding"*}
%"org::kermeta::language::structure_Model" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_KermetaModelElement"*}
%"org::kermeta::language::structure_AbstractOperation" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Operation"*, %"org::kermeta::language::structure_UnresolvedOperation"*}
%"org::kermeta::language::structure_UnresolvedType" = type {%"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_Using"*, %"org::kermeta::language::structure_Type"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_UnresolvedReference" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::behavior_UnresolvedCall"*, %"org::kermeta::language::structure_UnresolvedType"*, %"org::kermeta::language::structure_UnresolvedProperty"*, %"org::kermeta::language::structure_UnresolvedOperation"*, %"org::kermeta::language::structure_UnresolvedInferredType"*, %"org::kermeta::language::structure_UnresolvedTypeVariable"*, %"org::kermeta::language::structure_UnresolvedAdaptationOperator"*}
%"org::kermeta::language::structure_UnresolvedProperty" = type {%"org::kermeta::language::structure_AbstractProperty"*, %"org::kermeta::language::structure_UnresolvedReference"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_UnresolvedOperation" = type {%"org::kermeta::language::structure_AbstractOperation"*, %"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::structure_TypeContainer"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_Using" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"kermeta::standard_String"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_ProductType" = type {%"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_FunctionType" = type {%"org::kermeta::language::structure_TypeContainer"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_VoidType" = type {%"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_UnresolvedInferredType" = type {%"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::structure_Type"*}
%"org::kermeta::language::structure_UnresolvedTypeVariable" = type {%"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::structure_TypeVariable"*}
%"org::kermeta::language::structure_MetamodelBinding" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Metamodel"*, %"org::kermeta::language::structure_ClassDefinitionBinding"*, %"org::kermeta::language::structure_UseAdaptationOperator"*, %"org::kermeta::language::structure_EnumerationBinding"*}
%"org::kermeta::language::structure_ClassDefinitionBinding" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_PropertyBinding"*, %"org::kermeta::language::structure_OperationBinding"*, %"org::kermeta::language::structure_ClassDefinition"*, %"org::kermeta::language::structure_ClassDefinition"*}
%"org::kermeta::language::structure_EnumerationBinding" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Enumeration"*, %"org::kermeta::language::structure_Enumeration"*}
%"org::kermeta::language::structure_PropertyBinding" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Property"*, %"org::kermeta::language::structure_Property"*}
%"org::kermeta::language::structure_OperationBinding" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Operation"*, %"org::kermeta::language::structure_Operation"*}
%"org::kermeta::language::structure_AdaptationOperator" = type {%"org::kermeta::language::structure_NamedElement"*, %"org::kermeta::language::structure_PropertyAdaptationOperator"*, %"org::kermeta::language::structure_UnresolvedAdaptationOperator"*, %"org::kermeta::language::structure_OperationAdaptationOperator"*, %"org::kermeta::language::structure_AdaptationParameter"*}
%"org::kermeta::language::structure_UseAdaptationOperator" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_UnresolvedReference"*, %"org::kermeta::language::structure_AdaptationOperator"*}
%"org::kermeta::language::structure_PropertyAdaptationOperator" = type {%"org::kermeta::language::structure_AdaptationOperator"*, %"org::kermeta::language::structure_Property"*, %"kermeta::standard_String"*, %"kermeta::standard_String"*, %"kermeta::standard_String"*, %"kermeta::standard_String"*}
%"org::kermeta::language::structure_UnresolvedAdaptationOperator" = type {%"org::kermeta::language::structure_AdaptationOperator"*, %"org::kermeta::language::structure_UnresolvedReference"*}
%"org::kermeta::language::structure_AdaptationParameter" = type {%"org::kermeta::language::structure_TypedElement"*}
%"org::kermeta::language::structure_OperationAdaptationOperator" = type {%"org::kermeta::language::structure_AdaptationOperator"*, %"kermeta::standard_String"*, %"org::kermeta::language::structure_Operation"*}
%"org::kermeta::language::structure_ModelElementTypeDefinition" = type {%"org::kermeta::language::structure_TypeDefinition"*, %"org::kermeta::language::structure_DataType"*, %"org::kermeta::language::structure_GenericTypeDefinition"*}
%"org::kermeta::language::structure_ModelType" = type {%"org::kermeta::language::structure_Type"*, %"org::kermeta::language::structure_Metamodel"*}
%"org::kermeta::language::structure_FilteredMetamodelReference" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"org::kermeta::language::structure_Metamodel"*}
%"kermeta::standard_Void" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Model" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Object" = type {%"org::kermeta::language::structure_KermetaModelElement"*, %"kermeta::standard_Void"*, %"kermeta::standard_Model"*, %"kermeta::standard_String"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Random"*, %"kermeta::standard_StringBuffer"*, %"kermeta::standard_Character"*, %"kermeta::standard_Summable"*, %"kermeta::standard_Comparable"*, %"kermeta::standard_URI"*, %"kermeta::standard_Map"*, %"kermeta::standard_Collection"*, %"kermeta::standard_Iterator"*, %"kermeta::standard_EachContext"*, %"kermeta::emfpersistence_Resource"*, %"kermeta::emfpersistence_ResourceSet"*, %"kermeta::exceptions_Exception"*, %"kermeta::exceptions_ConstraintsDiagnostic"*, %"kermeta::io_FileIO"*, %"kermeta::io_StdIO"*, %"kermeta::utils_Hashtable"*, %"root_package_ArabicNumber"*, %"root_package_Digit"*, %"root_package_RomanNumber"*, %"root_package_Letter"*, %"root_package_Main"*}
%"kermeta::standard_String" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Integer" = type {%"kermeta::standard_Numeric"*}
%"kermeta::standard_Boolean" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Random" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Date" = type {%"kermeta::standard_Comparable"*}
%"kermeta::standard_Short" = type {%"kermeta::standard_Numeric"*}
%"kermeta::standard_Long" = type {%"kermeta::standard_Numeric"*}
%"kermeta::standard_Double" = type {%"kermeta::standard_Numeric"*}
%"kermeta::standard_Float" = type {%"kermeta::standard_Numeric"*}
%"kermeta::standard_StringBuffer" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Character" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Summable" = type {%"kermeta::standard_Object"*, %"kermeta::standard_Numeric"*}
%"kermeta::standard_Comparable" = type {%"kermeta::standard_Object"*, %"kermeta::standard_Date"*, %"kermeta::standard_Numeric"*}
%"kermeta::standard_Numeric" = type {%"kermeta::standard_Summable"*, %"kermeta::standard_Comparable"*, %"kermeta::standard_Integer"*, %"kermeta::standard_Short"*, %"kermeta::standard_Long"*, %"kermeta::standard_Double"*, %"kermeta::standard_Float"*}
%"kermeta::standard_URI" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Map" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_Collection" = type {%"kermeta::standard_Object"*, %"kermeta::standard_Set"*, %"kermeta::standard_Bag"*, %"kermeta::standard_OrderedCollection"*}
%"kermeta::standard_Set" = type {%"kermeta::standard_Collection"*, %"kermeta::standard_OrderedSet"*}
%"kermeta::standard_Bag" = type {%"kermeta::standard_Collection"*, %"kermeta::standard_Sequence"*}
%"kermeta::standard_OrderedCollection" = type {%"kermeta::standard_Collection"*, %"kermeta::standard_OrderedSet"*, %"kermeta::standard_Sequence"*}
%"kermeta::standard_OrderedSet" = type {%"kermeta::standard_Set"*, %"kermeta::standard_OrderedCollection"*}
%"kermeta::standard_Sequence" = type {%"kermeta::standard_Bag"*, %"kermeta::standard_OrderedCollection"*}
%"kermeta::standard_Iterator" = type {%"kermeta::standard_Object"*}
%"kermeta::standard_EachContext" = type {%"kermeta::standard_Object"*, %"kermeta::standard_Integer"*, %"kermeta::standard_Boolean"*, %"kermeta::standard_Boolean"*}
%"kermeta::emfpersistence_Resource" = type {%"kermeta::standard_Object"*}
%"kermeta::emfpersistence_ResourceSet" = type {%"kermeta::standard_Object"*}
%"kermeta::exceptions_Exception" = type {%"kermeta::standard_Object"*, %"kermeta::exceptions_RuntimeError"*, %"kermeta::exceptions_DivisionByZero"*, %"kermeta::exceptions_OverflowError"*, %"kermeta::exceptions_VoidOperandError"*, %"kermeta::exceptions_StringIndexOutOfBound"*, %"kermeta::exceptions_StringFormatException"*, %"kermeta::exceptions_IndexOutOfBound"*, %"kermeta::exceptions_EmptyCollection"*, %"kermeta::exceptions_IteratorIsOff"*, %"kermeta::exceptions_IOException"*, %"kermeta::exceptions_ConstraintViolatedException"*, %"kermeta::exceptions_ResourceLoadException"*, %"kermeta::exceptions_ResourceSaveException"*, %"kermeta::standard_String"*, %"kermeta::exceptions_Exception"*, %"kermeta::standard_String"*}
%"kermeta::exceptions_RuntimeError" = type {%"kermeta::exceptions_Exception"*, %"kermeta::exceptions_CallOnVoidTarget"*, %"kermeta::exceptions_TypeCastError"*, %"kermeta::exceptions_NotImplementedException"*, %"kermeta::exceptions_UpperBoundReachedError"*, %"kermeta::exceptions_AbstractClassInstantiationError"*, %"kermeta::exceptions_IncompatibleTypeError"*, %"org::kermeta::language::behavior_Expression"*}
%"kermeta::exceptions_CallOnVoidTarget" = type {%"kermeta::exceptions_RuntimeError"*}
%"kermeta::exceptions_TypeCastError" = type {%"kermeta::exceptions_RuntimeError"*}
%"kermeta::exceptions_NotImplementedException" = type {%"kermeta::exceptions_RuntimeError"*}
%"kermeta::exceptions_UpperBoundReachedError" = type {%"kermeta::exceptions_RuntimeError"*}
%"kermeta::exceptions_AbstractClassInstantiationError" = type {%"kermeta::exceptions_RuntimeError"*}
%"kermeta::exceptions_IncompatibleTypeError" = type {%"kermeta::exceptions_RuntimeError"*}
%"kermeta::exceptions_DivisionByZero" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_OverflowError" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_VoidOperandError" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_StringIndexOutOfBound" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_StringFormatException" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_IndexOutOfBound" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_EmptyCollection" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_IteratorIsOff" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_IOException" = type {%"kermeta::exceptions_Exception"*, %"kermeta::exceptions_FileNotFoundException"*}
%"kermeta::exceptions_FileNotFoundException" = type {%"kermeta::exceptions_IOException"*}
%"kermeta::exceptions_ConstraintViolatedException" = type {%"kermeta::exceptions_Exception"*, %"kermeta::exceptions_ConstraintViolatedPre"*, %"kermeta::exceptions_ConstraintViolatedPost"*, %"kermeta::exceptions_ConstraintViolatedInv"*}
%"kermeta::exceptions_ConstraintViolatedPre" = type {%"kermeta::exceptions_ConstraintViolatedException"*}
%"kermeta::exceptions_ConstraintViolatedPost" = type {%"kermeta::exceptions_ConstraintViolatedException"*}
%"kermeta::exceptions_ConstraintViolatedInv" = type {%"kermeta::exceptions_ConstraintViolatedException"*}
%"kermeta::exceptions_ResourceLoadException" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_ResourceSaveException" = type {%"kermeta::exceptions_Exception"*}
%"kermeta::exceptions_ConstraintsDiagnostic" = type {%"kermeta::standard_Object"*, %"kermeta::standard_Bag"*}
%"kermeta::io_FileIO" = type {%"kermeta::standard_Object"*}
%"kermeta::io_StdIO" = type {%"kermeta::standard_Object"*}
%"kermeta::utils_Hashtable" = type {%"kermeta::standard_Object"*}
%"root_package_ArabicNumber" = type {%"kermeta::standard_Object"*, %"root_package_Digit"*}
%"root_package_Digit" = type {%"kermeta::standard_Object"*, %"kermeta::standard_Integer"*}
%"root_package_RomanNumber" = type {%"kermeta::standard_Object"*, %"root_package_Letter"*}
%"root_package_Letter" = type {%"kermeta::standard_Object"*, %"kermeta::standard_String"*}
%"root_package_Main" = type {%"kermeta::standard_Object"*}
define internal %"org::kermeta::language::behavior_Assignment"* @"create_org::kermeta::language::behavior_Assignment"(){
%r = alloca %"org::kermeta::language::behavior_Assignment"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_Assignment"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_Assignment"* %r
}
define internal %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"(){
%r = alloca %"org::kermeta::language::behavior_Expression"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::behavior_Expression"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
%"1" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"11" = getelementptr %"org::kermeta::language::behavior_Expression"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_TypeContainer"* %"1",%"org::kermeta::language::structure_TypeContainer"** %"11"
ret %"org::kermeta::language::behavior_Expression"* %r
}
define internal %"org::kermeta::language::behavior_CallExpression"* @"create_org::kermeta::language::behavior_CallExpression"(){
%r = alloca %"org::kermeta::language::behavior_CallExpression"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_CallExpression"* %r
}
define internal %"org::kermeta::language::behavior_Block"* @"create_org::kermeta::language::behavior_Block"(){
%r = alloca %"org::kermeta::language::behavior_Block"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_Block"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_Block"* %r
}
define internal %"org::kermeta::language::behavior_CallVariable"* @"create_org::kermeta::language::behavior_CallVariable"(){
%r = alloca %"org::kermeta::language::behavior_CallVariable"
%"0" = call %"org::kermeta::language::behavior_CallExpression"* @"create_org::kermeta::language::behavior_CallExpression"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallVariable"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallExpression"* %"0",%"org::kermeta::language::behavior_CallExpression"** %"00"
ret %"org::kermeta::language::behavior_CallVariable"* %r
}
define internal %"org::kermeta::language::behavior_CallFeature"* @"create_org::kermeta::language::behavior_CallFeature"(){
%r = alloca %"org::kermeta::language::behavior_CallFeature"
%"0" = call %"org::kermeta::language::behavior_CallExpression"* @"create_org::kermeta::language::behavior_CallExpression"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallFeature"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallExpression"* %"0",%"org::kermeta::language::behavior_CallExpression"** %"00"
ret %"org::kermeta::language::behavior_CallFeature"* %r
}
define internal %"org::kermeta::language::behavior_CallSuperOperation"* @"create_org::kermeta::language::behavior_CallSuperOperation"(){
%r = alloca %"org::kermeta::language::behavior_CallSuperOperation"
%"0" = call %"org::kermeta::language::behavior_CallOperation"* @"create_org::kermeta::language::behavior_CallOperation"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallSuperOperation"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallOperation"* %"0",%"org::kermeta::language::behavior_CallOperation"** %"00"
ret %"org::kermeta::language::behavior_CallSuperOperation"* %r
}
define internal %"org::kermeta::language::behavior_CallResult"* @"create_org::kermeta::language::behavior_CallResult"(){
%r = alloca %"org::kermeta::language::behavior_CallResult"
%"0" = call %"org::kermeta::language::behavior_CallVariable"* @"create_org::kermeta::language::behavior_CallVariable"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallResult"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallVariable"* %"0",%"org::kermeta::language::behavior_CallVariable"** %"00"
ret %"org::kermeta::language::behavior_CallResult"* %r
}
define internal %"org::kermeta::language::behavior_CallValue"* @"create_org::kermeta::language::behavior_CallValue"(){
%r = alloca %"org::kermeta::language::behavior_CallValue"
%"0" = call %"org::kermeta::language::behavior_CallExpression"* @"create_org::kermeta::language::behavior_CallExpression"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallValue"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallExpression"* %"0",%"org::kermeta::language::behavior_CallExpression"** %"00"
ret %"org::kermeta::language::behavior_CallValue"* %r
}
define internal %"org::kermeta::language::behavior_Conditional"* @"create_org::kermeta::language::behavior_Conditional"(){
%r = alloca %"org::kermeta::language::behavior_Conditional"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_Conditional"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_Conditional"* %r
}
define internal %"org::kermeta::language::behavior_Raise"* @"create_org::kermeta::language::behavior_Raise"(){
%r = alloca %"org::kermeta::language::behavior_Raise"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_Raise"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_Raise"* %r
}
define internal %"org::kermeta::language::behavior_Rescue"* @"create_org::kermeta::language::behavior_Rescue"(){
%r = alloca %"org::kermeta::language::behavior_Rescue"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::behavior_Rescue"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::behavior_Rescue"* %r
}
define internal %"org::kermeta::language::behavior_TypeReference"* @"create_org::kermeta::language::behavior_TypeReference"(){
%r = alloca %"org::kermeta::language::behavior_TypeReference"
%"0" = call %"org::kermeta::language::structure_MultiplicityElement"* @"create_org::kermeta::language::structure_MultiplicityElement"()
%"00" = getelementptr %"org::kermeta::language::behavior_TypeReference"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_MultiplicityElement"* %"0",%"org::kermeta::language::structure_MultiplicityElement"** %"00"
ret %"org::kermeta::language::behavior_TypeReference"* %r
}
define internal %"org::kermeta::language::behavior_Literal"* @"create_org::kermeta::language::behavior_Literal"(){
%r = alloca %"org::kermeta::language::behavior_Literal"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_Literal"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_Literal"* %r
}
define internal %"org::kermeta::language::behavior_EmptyExpression"* @"create_org::kermeta::language::behavior_EmptyExpression"(){
%r = alloca %"org::kermeta::language::behavior_EmptyExpression"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_EmptyExpression"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_EmptyExpression"* %r
}
define internal %"org::kermeta::language::behavior_JavaStaticCall"* @"create_org::kermeta::language::behavior_JavaStaticCall"(){
%r = alloca %"org::kermeta::language::behavior_JavaStaticCall"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_JavaStaticCall"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_JavaStaticCall"* %r
}
define internal %"org::kermeta::language::behavior_LambdaExpression"* @"create_org::kermeta::language::behavior_LambdaExpression"(){
%r = alloca %"org::kermeta::language::behavior_LambdaExpression"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_LambdaExpression"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_LambdaExpression"* %r
}
define internal %"org::kermeta::language::behavior_LambdaParameter"* @"create_org::kermeta::language::behavior_LambdaParameter"(){
%r = alloca %"org::kermeta::language::behavior_LambdaParameter"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::behavior_LambdaParameter"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::behavior_LambdaParameter"* %r
}
define internal %"org::kermeta::language::behavior_IntegerLiteral"* @"create_org::kermeta::language::behavior_IntegerLiteral"(){
%r = alloca %"org::kermeta::language::behavior_IntegerLiteral"
%"0" = call %"org::kermeta::language::behavior_Literal"* @"create_org::kermeta::language::behavior_Literal"()
%"00" = getelementptr %"org::kermeta::language::behavior_IntegerLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Literal"* %"0",%"org::kermeta::language::behavior_Literal"** %"00"
ret %"org::kermeta::language::behavior_IntegerLiteral"* %r
}
define internal %"org::kermeta::language::behavior_StringLiteral"* @"create_org::kermeta::language::behavior_StringLiteral"(){
%r = alloca %"org::kermeta::language::behavior_StringLiteral"
%"0" = call %"org::kermeta::language::behavior_Literal"* @"create_org::kermeta::language::behavior_Literal"()
%"00" = getelementptr %"org::kermeta::language::behavior_StringLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Literal"* %"0",%"org::kermeta::language::behavior_Literal"** %"00"
ret %"org::kermeta::language::behavior_StringLiteral"* %r
}
define internal %"org::kermeta::language::behavior_BooleanLiteral"* @"create_org::kermeta::language::behavior_BooleanLiteral"(){
%r = alloca %"org::kermeta::language::behavior_BooleanLiteral"
%"0" = call %"org::kermeta::language::behavior_Literal"* @"create_org::kermeta::language::behavior_Literal"()
%"00" = getelementptr %"org::kermeta::language::behavior_BooleanLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Literal"* %"0",%"org::kermeta::language::behavior_Literal"** %"00"
ret %"org::kermeta::language::behavior_BooleanLiteral"* %r
}
define internal %"org::kermeta::language::behavior_CallTypeLiteral"* @"create_org::kermeta::language::behavior_CallTypeLiteral"(){
%r = alloca %"org::kermeta::language::behavior_CallTypeLiteral"
%"0" = call %"org::kermeta::language::behavior_Literal"* @"create_org::kermeta::language::behavior_Literal"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallTypeLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Literal"* %"0",%"org::kermeta::language::behavior_Literal"** %"00"
ret %"org::kermeta::language::behavior_CallTypeLiteral"* %r
}
define internal %"org::kermeta::language::behavior_VoidLiteral"* @"create_org::kermeta::language::behavior_VoidLiteral"(){
%r = alloca %"org::kermeta::language::behavior_VoidLiteral"
%"0" = call %"org::kermeta::language::behavior_Literal"* @"create_org::kermeta::language::behavior_Literal"()
%"00" = getelementptr %"org::kermeta::language::behavior_VoidLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Literal"* %"0",%"org::kermeta::language::behavior_Literal"** %"00"
ret %"org::kermeta::language::behavior_VoidLiteral"* %r
}
define internal %"org::kermeta::language::behavior_Loop"* @"create_org::kermeta::language::behavior_Loop"(){
%r = alloca %"org::kermeta::language::behavior_Loop"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_Loop"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_Loop"* %r
}
define internal %"org::kermeta::language::behavior_SelfExpression"* @"create_org::kermeta::language::behavior_SelfExpression"(){
%r = alloca %"org::kermeta::language::behavior_SelfExpression"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_SelfExpression"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_SelfExpression"* %r
}
define internal %"org::kermeta::language::behavior_VariableDecl"* @"create_org::kermeta::language::behavior_VariableDecl"(){
%r = alloca %"org::kermeta::language::behavior_VariableDecl"
%"0" = call %"org::kermeta::language::behavior_Expression"* @"create_org::kermeta::language::behavior_Expression"()
%"00" = getelementptr %"org::kermeta::language::behavior_VariableDecl"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_Expression"* %"0",%"org::kermeta::language::behavior_Expression"** %"00"
ret %"org::kermeta::language::behavior_VariableDecl"* %r
}
define internal %"org::kermeta::language::behavior_UnresolvedCall"* @"create_org::kermeta::language::behavior_UnresolvedCall"(){
%r = alloca %"org::kermeta::language::behavior_UnresolvedCall"
%"0" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"00" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_UnresolvedReference"* %"0",%"org::kermeta::language::structure_UnresolvedReference"** %"00"
%"1" = call %"org::kermeta::language::behavior_CallExpression"* @"create_org::kermeta::language::behavior_CallExpression"()
%"11" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %r,i32 0,i32 1
store %"org::kermeta::language::behavior_CallExpression"* %"1",%"org::kermeta::language::behavior_CallExpression"** %"11"
%"2" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"22" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %r,i32 0,i32 2
store %"org::kermeta::language::structure_TypeContainer"* %"2",%"org::kermeta::language::structure_TypeContainer"** %"22"
ret %"org::kermeta::language::behavior_UnresolvedCall"* %r
}
define internal %"org::kermeta::language::behavior_CallOperation"* @"create_org::kermeta::language::behavior_CallOperation"(){
%r = alloca %"org::kermeta::language::behavior_CallOperation"
%"0" = call %"org::kermeta::language::behavior_CallFeature"* @"create_org::kermeta::language::behavior_CallFeature"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallOperation"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallFeature"* %"0",%"org::kermeta::language::behavior_CallFeature"** %"00"
ret %"org::kermeta::language::behavior_CallOperation"* %r
}
define internal %"org::kermeta::language::behavior_CallProperty"* @"create_org::kermeta::language::behavior_CallProperty"(){
%r = alloca %"org::kermeta::language::behavior_CallProperty"
%"0" = call %"org::kermeta::language::behavior_CallFeature"* @"create_org::kermeta::language::behavior_CallFeature"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallProperty"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallFeature"* %"0",%"org::kermeta::language::behavior_CallFeature"** %"00"
ret %"org::kermeta::language::behavior_CallProperty"* %r
}
define internal %"org::kermeta::language::behavior_CallEnumLiteral"* @"create_org::kermeta::language::behavior_CallEnumLiteral"(){
%r = alloca %"org::kermeta::language::behavior_CallEnumLiteral"
%"0" = call %"org::kermeta::language::behavior_CallExpression"* @"create_org::kermeta::language::behavior_CallExpression"()
%"00" = getelementptr %"org::kermeta::language::behavior_CallEnumLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::behavior_CallExpression"* %"0",%"org::kermeta::language::behavior_CallExpression"** %"00"
ret %"org::kermeta::language::behavior_CallEnumLiteral"* %r
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"(){
%r = alloca %"org::kermeta::language::structure_KermetaModelElement"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"org::kermeta::language::structure_KermetaModelElement"* %r
}
define internal %"org::kermeta::language::structure_Operation"* @"create_org::kermeta::language::structure_Operation"(){
%r = alloca %"org::kermeta::language::structure_Operation"
%"0" = call %"org::kermeta::language::structure_MultiplicityElement"* @"create_org::kermeta::language::structure_MultiplicityElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Operation"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_MultiplicityElement"* %"0",%"org::kermeta::language::structure_MultiplicityElement"** %"00"
%"1" = call %"org::kermeta::language::structure_AbstractOperation"* @"create_org::kermeta::language::structure_AbstractOperation"()
%"11" = getelementptr %"org::kermeta::language::structure_Operation"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_AbstractOperation"* %"1",%"org::kermeta::language::structure_AbstractOperation"** %"11"
ret %"org::kermeta::language::structure_Operation"* %r
}
define internal %"org::kermeta::language::structure_Property"* @"create_org::kermeta::language::structure_Property"(){
%r = alloca %"org::kermeta::language::structure_Property"
%"0" = call %"org::kermeta::language::structure_MultiplicityElement"* @"create_org::kermeta::language::structure_MultiplicityElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Property"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_MultiplicityElement"* %"0",%"org::kermeta::language::structure_MultiplicityElement"** %"00"
%"1" = call %"org::kermeta::language::structure_AbstractProperty"* @"create_org::kermeta::language::structure_AbstractProperty"()
%"11" = getelementptr %"org::kermeta::language::structure_Property"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_AbstractProperty"* %"1",%"org::kermeta::language::structure_AbstractProperty"** %"11"
ret %"org::kermeta::language::structure_Property"* %r
}
define internal %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"(){
%r = alloca %"org::kermeta::language::structure_Type"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Type"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_Type"* %r
}
define internal %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"(){
%r = alloca %"org::kermeta::language::structure_TypeContainer"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_TypeContainer"* %r
}
define internal %"org::kermeta::language::structure_EnumerationLiteral"* @"create_org::kermeta::language::structure_EnumerationLiteral"(){
%r = alloca %"org::kermeta::language::structure_EnumerationLiteral"
%"0" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_EnumerationLiteral"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_NamedElement"* %"0",%"org::kermeta::language::structure_NamedElement"** %"00"
ret %"org::kermeta::language::structure_EnumerationLiteral"* %r
}
define internal %"org::kermeta::language::structure_TypeVariableBinding"* @"create_org::kermeta::language::structure_TypeVariableBinding"(){
%r = alloca %"org::kermeta::language::structure_TypeVariableBinding"
%"0" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"00" = getelementptr %"org::kermeta::language::structure_TypeVariableBinding"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeContainer"* %"0",%"org::kermeta::language::structure_TypeContainer"** %"00"
%"1" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"11" = getelementptr %"org::kermeta::language::structure_TypeVariableBinding"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_KermetaModelElement"* %"1",%"org::kermeta::language::structure_KermetaModelElement"** %"11"
ret %"org::kermeta::language::structure_TypeVariableBinding"* %r
}
define internal %"org::kermeta::language::structure_MultiplicityElement"* @"create_org::kermeta::language::structure_MultiplicityElement"(){
%r = alloca %"org::kermeta::language::structure_MultiplicityElement"
%"0" = call %"org::kermeta::language::structure_TypedElement"* @"create_org::kermeta::language::structure_TypedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypedElement"* %"0",%"org::kermeta::language::structure_TypedElement"** %"00"
ret %"org::kermeta::language::structure_MultiplicityElement"* %r
}
define internal %"org::kermeta::language::structure_TypeDefinition"* @"create_org::kermeta::language::structure_TypeDefinition"(){
%r = alloca %"org::kermeta::language::structure_TypeDefinition"
%"0" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_NamedElement"* %"0",%"org::kermeta::language::structure_NamedElement"** %"00"
%"1" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"11" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_TypeContainer"* %"1",%"org::kermeta::language::structure_TypeContainer"** %"11"
ret %"org::kermeta::language::structure_TypeDefinition"* %r
}
define internal %"org::kermeta::language::structure_Class"* @"create_org::kermeta::language::structure_Class"(){
%r = alloca %"org::kermeta::language::structure_Class"
%"0" = call %"org::kermeta::language::structure_ParameterizedType"* @"create_org::kermeta::language::structure_ParameterizedType"()
%"00" = getelementptr %"org::kermeta::language::structure_Class"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_ParameterizedType"* %"0",%"org::kermeta::language::structure_ParameterizedType"** %"00"
ret %"org::kermeta::language::structure_Class"* %r
}
define internal %"org::kermeta::language::structure_DataType"* @"create_org::kermeta::language::structure_DataType"(){
%r = alloca %"org::kermeta::language::structure_DataType"
%"0" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"00" = getelementptr %"org::kermeta::language::structure_DataType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_Type"* %"0",%"org::kermeta::language::structure_Type"** %"00"
%"1" = call %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"create_org::kermeta::language::structure_ModelElementTypeDefinition"()
%"11" = getelementptr %"org::kermeta::language::structure_DataType"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"1",%"org::kermeta::language::structure_ModelElementTypeDefinition"** %"11"
ret %"org::kermeta::language::structure_DataType"* %r
}
define internal %"org::kermeta::language::structure_Enumeration"* @"create_org::kermeta::language::structure_Enumeration"(){
%r = alloca %"org::kermeta::language::structure_Enumeration"
%"0" = call %"org::kermeta::language::structure_DataType"* @"create_org::kermeta::language::structure_DataType"()
%"00" = getelementptr %"org::kermeta::language::structure_Enumeration"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_DataType"* %"0",%"org::kermeta::language::structure_DataType"** %"00"
ret %"org::kermeta::language::structure_Enumeration"* %r
}
define internal %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"(){
%r = alloca %"org::kermeta::language::structure_NamedElement"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_NamedElement"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_NamedElement"* %r
}
define internal %"org::kermeta::language::structure_Package"* @"create_org::kermeta::language::structure_Package"(){
%r = alloca %"org::kermeta::language::structure_Package"
%"0" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Package"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_NamedElement"* %"0",%"org::kermeta::language::structure_NamedElement"** %"00"
%"1" = call %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* @"create_org::kermeta::language::structure_ModelElementTypeDefinitionContainer"()
%"11" = getelementptr %"org::kermeta::language::structure_Package"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"1",%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"** %"11"
ret %"org::kermeta::language::structure_Package"* %r
}
define internal %"org::kermeta::language::structure_Parameter"* @"create_org::kermeta::language::structure_Parameter"(){
%r = alloca %"org::kermeta::language::structure_Parameter"
%"0" = call %"org::kermeta::language::structure_MultiplicityElement"* @"create_org::kermeta::language::structure_MultiplicityElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Parameter"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_MultiplicityElement"* %"0",%"org::kermeta::language::structure_MultiplicityElement"** %"00"
ret %"org::kermeta::language::structure_Parameter"* %r
}
define internal %"org::kermeta::language::structure_PrimitiveType"* @"create_org::kermeta::language::structure_PrimitiveType"(){
%r = alloca %"org::kermeta::language::structure_PrimitiveType"
%"0" = call %"org::kermeta::language::structure_DataType"* @"create_org::kermeta::language::structure_DataType"()
%"00" = getelementptr %"org::kermeta::language::structure_PrimitiveType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_DataType"* %"0",%"org::kermeta::language::structure_DataType"** %"00"
ret %"org::kermeta::language::structure_PrimitiveType"* %r
}
define internal %"org::kermeta::language::structure_TypedElement"* @"create_org::kermeta::language::structure_TypedElement"(){
%r = alloca %"org::kermeta::language::structure_TypedElement"
%"0" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"00" = getelementptr %"org::kermeta::language::structure_TypedElement"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeContainer"* %"0",%"org::kermeta::language::structure_TypeContainer"** %"00"
%"1" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"11" = getelementptr %"org::kermeta::language::structure_TypedElement"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_NamedElement"* %"1",%"org::kermeta::language::structure_NamedElement"** %"11"
ret %"org::kermeta::language::structure_TypedElement"* %r
}
define internal %"org::kermeta::language::structure_Tag"* @"create_org::kermeta::language::structure_Tag"(){
%r = alloca %"org::kermeta::language::structure_Tag"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Tag"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_Tag"* %r
}
define internal %"org::kermeta::language::structure_AbstractProperty"* @"create_org::kermeta::language::structure_AbstractProperty"(){
%r = alloca %"org::kermeta::language::structure_AbstractProperty"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_AbstractProperty"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_AbstractProperty"* %r
}
define internal %"org::kermeta::language::structure_Constraint"* @"create_org::kermeta::language::structure_Constraint"(){
%r = alloca %"org::kermeta::language::structure_Constraint"
%"0" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Constraint"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_NamedElement"* %"0",%"org::kermeta::language::structure_NamedElement"** %"00"
ret %"org::kermeta::language::structure_Constraint"* %r
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"create_org::kermeta::language::structure_ClassDefinition"(){
%r = alloca %"org::kermeta::language::structure_ClassDefinition"
%"0" = call %"org::kermeta::language::structure_GenericTypeDefinition"* @"create_org::kermeta::language::structure_GenericTypeDefinition"()
%"00" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_GenericTypeDefinition"* %"0",%"org::kermeta::language::structure_GenericTypeDefinition"** %"00"
ret %"org::kermeta::language::structure_ClassDefinition"* %r
}
define internal %"org::kermeta::language::structure_Metamodel"* @"create_org::kermeta::language::structure_Metamodel"(){
%r = alloca %"org::kermeta::language::structure_Metamodel"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Metamodel"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
%"1" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"11" = getelementptr %"org::kermeta::language::structure_Metamodel"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_NamedElement"* %"1",%"org::kermeta::language::structure_NamedElement"** %"11"
%"2" = call %"org::kermeta::language::structure_TypeDefinition"* @"create_org::kermeta::language::structure_TypeDefinition"()
%"22" = getelementptr %"org::kermeta::language::structure_Metamodel"* %r,i32 0,i32 2
store %"org::kermeta::language::structure_TypeDefinition"* %"2",%"org::kermeta::language::structure_TypeDefinition"** %"22"
ret %"org::kermeta::language::structure_Metamodel"* %r
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* @"create_org::kermeta::language::structure_ModelElementTypeDefinitionContainer"(){
%r = alloca %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"
%"0" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_NamedElement"* %"0",%"org::kermeta::language::structure_NamedElement"** %"00"
ret %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %r
}
define internal %"org::kermeta::language::structure_GenericTypeDefinition"* @"create_org::kermeta::language::structure_GenericTypeDefinition"(){
%r = alloca %"org::kermeta::language::structure_GenericTypeDefinition"
%"0" = call %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"create_org::kermeta::language::structure_ModelElementTypeDefinition"()
%"00" = getelementptr %"org::kermeta::language::structure_GenericTypeDefinition"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"0",%"org::kermeta::language::structure_ModelElementTypeDefinition"** %"00"
ret %"org::kermeta::language::structure_GenericTypeDefinition"* %r
}
define internal %"org::kermeta::language::structure_ParameterizedType"* @"create_org::kermeta::language::structure_ParameterizedType"(){
%r = alloca %"org::kermeta::language::structure_ParameterizedType"
%"0" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"00" = getelementptr %"org::kermeta::language::structure_ParameterizedType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_Type"* %"0",%"org::kermeta::language::structure_Type"** %"00"
ret %"org::kermeta::language::structure_ParameterizedType"* %r
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"create_org::kermeta::language::structure_TypeVariable"(){
%r = alloca %"org::kermeta::language::structure_TypeVariable"
%"0" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"00" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeContainer"* %"0",%"org::kermeta::language::structure_TypeContainer"** %"00"
%"1" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"11" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_Type"* %"1",%"org::kermeta::language::structure_Type"** %"11"
%"2" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"22" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %r,i32 0,i32 2
store %"org::kermeta::language::structure_NamedElement"* %"2",%"org::kermeta::language::structure_NamedElement"** %"22"
ret %"org::kermeta::language::structure_TypeVariable"* %r
}
define internal %"org::kermeta::language::structure_ObjectTypeVariable"* @"create_org::kermeta::language::structure_ObjectTypeVariable"(){
%r = alloca %"org::kermeta::language::structure_ObjectTypeVariable"
%"0" = call %"org::kermeta::language::structure_TypeVariable"* @"create_org::kermeta::language::structure_TypeVariable"()
%"00" = getelementptr %"org::kermeta::language::structure_ObjectTypeVariable"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeVariable"* %"0",%"org::kermeta::language::structure_TypeVariable"** %"00"
ret %"org::kermeta::language::structure_ObjectTypeVariable"* %r
}
define internal %"org::kermeta::language::structure_ModelTypeVariable"* @"create_org::kermeta::language::structure_ModelTypeVariable"(){
%r = alloca %"org::kermeta::language::structure_ModelTypeVariable"
%"0" = call %"org::kermeta::language::structure_TypeVariable"* @"create_org::kermeta::language::structure_TypeVariable"()
%"00" = getelementptr %"org::kermeta::language::structure_ModelTypeVariable"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeVariable"* %"0",%"org::kermeta::language::structure_TypeVariable"** %"00"
ret %"org::kermeta::language::structure_ModelTypeVariable"* %r
}
define internal %"org::kermeta::language::structure_VirtualType"* @"create_org::kermeta::language::structure_VirtualType"(){
%r = alloca %"org::kermeta::language::structure_VirtualType"
%"0" = call %"org::kermeta::language::structure_ObjectTypeVariable"* @"create_org::kermeta::language::structure_ObjectTypeVariable"()
%"00" = getelementptr %"org::kermeta::language::structure_VirtualType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_ObjectTypeVariable"* %"0",%"org::kermeta::language::structure_ObjectTypeVariable"** %"00"
ret %"org::kermeta::language::structure_VirtualType"* %r
}
define internal %"org::kermeta::language::structure_Model"* @"create_org::kermeta::language::structure_Model"(){
%r = alloca %"org::kermeta::language::structure_Model"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Model"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_Model"* %r
}
define internal %"org::kermeta::language::structure_AbstractOperation"* @"create_org::kermeta::language::structure_AbstractOperation"(){
%r = alloca %"org::kermeta::language::structure_AbstractOperation"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_AbstractOperation"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_AbstractOperation"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedType"* @"create_org::kermeta::language::structure_UnresolvedType"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedType"
%"0" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_Type"* %"0",%"org::kermeta::language::structure_Type"** %"00"
%"1" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"11" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_UnresolvedReference"* %"1",%"org::kermeta::language::structure_UnresolvedReference"** %"11"
%"2" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"22" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %r,i32 0,i32 2
store %"org::kermeta::language::structure_TypeContainer"* %"2",%"org::kermeta::language::structure_TypeContainer"** %"22"
ret %"org::kermeta::language::structure_UnresolvedType"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedReference"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_UnresolvedReference"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedProperty"* @"create_org::kermeta::language::structure_UnresolvedProperty"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedProperty"
%"0" = call %"org::kermeta::language::structure_AbstractProperty"* @"create_org::kermeta::language::structure_AbstractProperty"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedProperty"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_AbstractProperty"* %"0",%"org::kermeta::language::structure_AbstractProperty"** %"00"
%"1" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"11" = getelementptr %"org::kermeta::language::structure_UnresolvedProperty"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_UnresolvedReference"* %"1",%"org::kermeta::language::structure_UnresolvedReference"** %"11"
ret %"org::kermeta::language::structure_UnresolvedProperty"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedOperation"* @"create_org::kermeta::language::structure_UnresolvedOperation"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedOperation"
%"0" = call %"org::kermeta::language::structure_AbstractOperation"* @"create_org::kermeta::language::structure_AbstractOperation"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_AbstractOperation"* %"0",%"org::kermeta::language::structure_AbstractOperation"** %"00"
%"1" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"11" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_UnresolvedReference"* %"1",%"org::kermeta::language::structure_UnresolvedReference"** %"11"
%"2" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"22" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %r,i32 0,i32 2
store %"org::kermeta::language::structure_TypeContainer"* %"2",%"org::kermeta::language::structure_TypeContainer"** %"22"
ret %"org::kermeta::language::structure_UnresolvedOperation"* %r
}
define internal %"org::kermeta::language::structure_Using"* @"create_org::kermeta::language::structure_Using"(){
%r = alloca %"org::kermeta::language::structure_Using"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_Using"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_Using"* %r
}
define internal %"org::kermeta::language::structure_ProductType"* @"create_org::kermeta::language::structure_ProductType"(){
%r = alloca %"org::kermeta::language::structure_ProductType"
%"0" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"00" = getelementptr %"org::kermeta::language::structure_ProductType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeContainer"* %"0",%"org::kermeta::language::structure_TypeContainer"** %"00"
%"1" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"11" = getelementptr %"org::kermeta::language::structure_ProductType"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_Type"* %"1",%"org::kermeta::language::structure_Type"** %"11"
ret %"org::kermeta::language::structure_ProductType"* %r
}
define internal %"org::kermeta::language::structure_FunctionType"* @"create_org::kermeta::language::structure_FunctionType"(){
%r = alloca %"org::kermeta::language::structure_FunctionType"
%"0" = call %"org::kermeta::language::structure_TypeContainer"* @"create_org::kermeta::language::structure_TypeContainer"()
%"00" = getelementptr %"org::kermeta::language::structure_FunctionType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeContainer"* %"0",%"org::kermeta::language::structure_TypeContainer"** %"00"
%"1" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"11" = getelementptr %"org::kermeta::language::structure_FunctionType"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_Type"* %"1",%"org::kermeta::language::structure_Type"** %"11"
ret %"org::kermeta::language::structure_FunctionType"* %r
}
define internal %"org::kermeta::language::structure_VoidType"* @"create_org::kermeta::language::structure_VoidType"(){
%r = alloca %"org::kermeta::language::structure_VoidType"
%"0" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"00" = getelementptr %"org::kermeta::language::structure_VoidType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_Type"* %"0",%"org::kermeta::language::structure_Type"** %"00"
ret %"org::kermeta::language::structure_VoidType"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedInferredType"* @"create_org::kermeta::language::structure_UnresolvedInferredType"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedInferredType"
%"0" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedInferredType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_UnresolvedReference"* %"0",%"org::kermeta::language::structure_UnresolvedReference"** %"00"
%"1" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"11" = getelementptr %"org::kermeta::language::structure_UnresolvedInferredType"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_Type"* %"1",%"org::kermeta::language::structure_Type"** %"11"
ret %"org::kermeta::language::structure_UnresolvedInferredType"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedTypeVariable"* @"create_org::kermeta::language::structure_UnresolvedTypeVariable"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedTypeVariable"
%"0" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedTypeVariable"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_UnresolvedReference"* %"0",%"org::kermeta::language::structure_UnresolvedReference"** %"00"
%"1" = call %"org::kermeta::language::structure_TypeVariable"* @"create_org::kermeta::language::structure_TypeVariable"()
%"11" = getelementptr %"org::kermeta::language::structure_UnresolvedTypeVariable"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_TypeVariable"* %"1",%"org::kermeta::language::structure_TypeVariable"** %"11"
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %r
}
define internal %"org::kermeta::language::structure_MetamodelBinding"* @"create_org::kermeta::language::structure_MetamodelBinding"(){
%r = alloca %"org::kermeta::language::structure_MetamodelBinding"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_MetamodelBinding"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_MetamodelBinding"* %r
}
define internal %"org::kermeta::language::structure_ClassDefinitionBinding"* @"create_org::kermeta::language::structure_ClassDefinitionBinding"(){
%r = alloca %"org::kermeta::language::structure_ClassDefinitionBinding"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_ClassDefinitionBinding"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_ClassDefinitionBinding"* %r
}
define internal %"org::kermeta::language::structure_EnumerationBinding"* @"create_org::kermeta::language::structure_EnumerationBinding"(){
%r = alloca %"org::kermeta::language::structure_EnumerationBinding"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_EnumerationBinding"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_EnumerationBinding"* %r
}
define internal %"org::kermeta::language::structure_PropertyBinding"* @"create_org::kermeta::language::structure_PropertyBinding"(){
%r = alloca %"org::kermeta::language::structure_PropertyBinding"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_PropertyBinding"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_PropertyBinding"* %r
}
define internal %"org::kermeta::language::structure_OperationBinding"* @"create_org::kermeta::language::structure_OperationBinding"(){
%r = alloca %"org::kermeta::language::structure_OperationBinding"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_OperationBinding"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_OperationBinding"* %r
}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"create_org::kermeta::language::structure_AdaptationOperator"(){
%r = alloca %"org::kermeta::language::structure_AdaptationOperator"
%"0" = call %"org::kermeta::language::structure_NamedElement"* @"create_org::kermeta::language::structure_NamedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_AdaptationOperator"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_NamedElement"* %"0",%"org::kermeta::language::structure_NamedElement"** %"00"
ret %"org::kermeta::language::structure_AdaptationOperator"* %r
}
define internal %"org::kermeta::language::structure_UseAdaptationOperator"* @"create_org::kermeta::language::structure_UseAdaptationOperator"(){
%r = alloca %"org::kermeta::language::structure_UseAdaptationOperator"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_UseAdaptationOperator"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_UseAdaptationOperator"* %r
}
define internal %"org::kermeta::language::structure_PropertyAdaptationOperator"* @"create_org::kermeta::language::structure_PropertyAdaptationOperator"(){
%r = alloca %"org::kermeta::language::structure_PropertyAdaptationOperator"
%"0" = call %"org::kermeta::language::structure_AdaptationOperator"* @"create_org::kermeta::language::structure_AdaptationOperator"()
%"00" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_AdaptationOperator"* %"0",%"org::kermeta::language::structure_AdaptationOperator"** %"00"
ret %"org::kermeta::language::structure_PropertyAdaptationOperator"* %r
}
define internal %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* @"create_org::kermeta::language::structure_UnresolvedAdaptationOperator"(){
%r = alloca %"org::kermeta::language::structure_UnresolvedAdaptationOperator"
%"0" = call %"org::kermeta::language::structure_AdaptationOperator"* @"create_org::kermeta::language::structure_AdaptationOperator"()
%"00" = getelementptr %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_AdaptationOperator"* %"0",%"org::kermeta::language::structure_AdaptationOperator"** %"00"
%"1" = call %"org::kermeta::language::structure_UnresolvedReference"* @"create_org::kermeta::language::structure_UnresolvedReference"()
%"11" = getelementptr %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %r,i32 0,i32 1
store %"org::kermeta::language::structure_UnresolvedReference"* %"1",%"org::kermeta::language::structure_UnresolvedReference"** %"11"
ret %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %r
}
define internal %"org::kermeta::language::structure_AdaptationParameter"* @"create_org::kermeta::language::structure_AdaptationParameter"(){
%r = alloca %"org::kermeta::language::structure_AdaptationParameter"
%"0" = call %"org::kermeta::language::structure_TypedElement"* @"create_org::kermeta::language::structure_TypedElement"()
%"00" = getelementptr %"org::kermeta::language::structure_AdaptationParameter"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypedElement"* %"0",%"org::kermeta::language::structure_TypedElement"** %"00"
ret %"org::kermeta::language::structure_AdaptationParameter"* %r
}
define internal %"org::kermeta::language::structure_OperationAdaptationOperator"* @"create_org::kermeta::language::structure_OperationAdaptationOperator"(){
%r = alloca %"org::kermeta::language::structure_OperationAdaptationOperator"
%"0" = call %"org::kermeta::language::structure_AdaptationOperator"* @"create_org::kermeta::language::structure_AdaptationOperator"()
%"00" = getelementptr %"org::kermeta::language::structure_OperationAdaptationOperator"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_AdaptationOperator"* %"0",%"org::kermeta::language::structure_AdaptationOperator"** %"00"
ret %"org::kermeta::language::structure_OperationAdaptationOperator"* %r
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"create_org::kermeta::language::structure_ModelElementTypeDefinition"(){
%r = alloca %"org::kermeta::language::structure_ModelElementTypeDefinition"
%"0" = call %"org::kermeta::language::structure_TypeDefinition"* @"create_org::kermeta::language::structure_TypeDefinition"()
%"00" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinition"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_TypeDefinition"* %"0",%"org::kermeta::language::structure_TypeDefinition"** %"00"
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %r
}
define internal %"org::kermeta::language::structure_ModelType"* @"create_org::kermeta::language::structure_ModelType"(){
%r = alloca %"org::kermeta::language::structure_ModelType"
%"0" = call %"org::kermeta::language::structure_Type"* @"create_org::kermeta::language::structure_Type"()
%"00" = getelementptr %"org::kermeta::language::structure_ModelType"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_Type"* %"0",%"org::kermeta::language::structure_Type"** %"00"
ret %"org::kermeta::language::structure_ModelType"* %r
}
define internal %"org::kermeta::language::structure_FilteredMetamodelReference"* @"create_org::kermeta::language::structure_FilteredMetamodelReference"(){
%r = alloca %"org::kermeta::language::structure_FilteredMetamodelReference"
%"0" = call %"org::kermeta::language::structure_KermetaModelElement"* @"create_org::kermeta::language::structure_KermetaModelElement"()
%"00" = getelementptr %"org::kermeta::language::structure_FilteredMetamodelReference"* %r,i32 0,i32 0
store %"org::kermeta::language::structure_KermetaModelElement"* %"0",%"org::kermeta::language::structure_KermetaModelElement"** %"00"
ret %"org::kermeta::language::structure_FilteredMetamodelReference"* %r
}
define internal %"kermeta::standard_Void"* @"create_kermeta::standard_Void"(){
%r = alloca %"kermeta::standard_Void"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Void"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Void"* %r
}
define internal %"kermeta::standard_Model"* @"create_kermeta::standard_Model"(){
%r = alloca %"kermeta::standard_Model"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Model"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Model"* %r
}
define internal %"kermeta::standard_Object"* @"create_kermeta::standard_Object"(){
%r = alloca %"kermeta::standard_Object"
ret %"kermeta::standard_Object"* %r
}
define internal %"kermeta::standard_String"* @"create_kermeta::standard_String"(){
%r = alloca %"kermeta::standard_String"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_String"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_String"* %r
}
define internal %"kermeta::standard_Integer"* @"create_kermeta::standard_Integer"(){
%r = alloca %"kermeta::standard_Integer"
%"0" = call %"kermeta::standard_Numeric"* @"create_kermeta::standard_Numeric"()
%"00" = getelementptr %"kermeta::standard_Integer"* %r,i32 0,i32 0
store %"kermeta::standard_Numeric"* %"0",%"kermeta::standard_Numeric"** %"00"
ret %"kermeta::standard_Integer"* %r
}
define internal %"kermeta::standard_Boolean"* @"create_kermeta::standard_Boolean"(){
%r = alloca %"kermeta::standard_Boolean"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Boolean"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Boolean"* %r
}
define internal %"kermeta::standard_Random"* @"create_kermeta::standard_Random"(){
%r = alloca %"kermeta::standard_Random"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Random"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Random"* %r
}
define internal %"kermeta::standard_Date"* @"create_kermeta::standard_Date"(){
%r = alloca %"kermeta::standard_Date"
%"0" = call %"kermeta::standard_Comparable"* @"create_kermeta::standard_Comparable"()
%"00" = getelementptr %"kermeta::standard_Date"* %r,i32 0,i32 0
store %"kermeta::standard_Comparable"* %"0",%"kermeta::standard_Comparable"** %"00"
ret %"kermeta::standard_Date"* %r
}
define internal %"kermeta::standard_Short"* @"create_kermeta::standard_Short"(){
%r = alloca %"kermeta::standard_Short"
%"0" = call %"kermeta::standard_Numeric"* @"create_kermeta::standard_Numeric"()
%"00" = getelementptr %"kermeta::standard_Short"* %r,i32 0,i32 0
store %"kermeta::standard_Numeric"* %"0",%"kermeta::standard_Numeric"** %"00"
ret %"kermeta::standard_Short"* %r
}
define internal %"kermeta::standard_Long"* @"create_kermeta::standard_Long"(){
%r = alloca %"kermeta::standard_Long"
%"0" = call %"kermeta::standard_Numeric"* @"create_kermeta::standard_Numeric"()
%"00" = getelementptr %"kermeta::standard_Long"* %r,i32 0,i32 0
store %"kermeta::standard_Numeric"* %"0",%"kermeta::standard_Numeric"** %"00"
ret %"kermeta::standard_Long"* %r
}
define internal %"kermeta::standard_Double"* @"create_kermeta::standard_Double"(){
%r = alloca %"kermeta::standard_Double"
%"0" = call %"kermeta::standard_Numeric"* @"create_kermeta::standard_Numeric"()
%"00" = getelementptr %"kermeta::standard_Double"* %r,i32 0,i32 0
store %"kermeta::standard_Numeric"* %"0",%"kermeta::standard_Numeric"** %"00"
ret %"kermeta::standard_Double"* %r
}
define internal %"kermeta::standard_Float"* @"create_kermeta::standard_Float"(){
%r = alloca %"kermeta::standard_Float"
%"0" = call %"kermeta::standard_Numeric"* @"create_kermeta::standard_Numeric"()
%"00" = getelementptr %"kermeta::standard_Float"* %r,i32 0,i32 0
store %"kermeta::standard_Numeric"* %"0",%"kermeta::standard_Numeric"** %"00"
ret %"kermeta::standard_Float"* %r
}
define internal %"kermeta::standard_StringBuffer"* @"create_kermeta::standard_StringBuffer"(){
%r = alloca %"kermeta::standard_StringBuffer"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_StringBuffer"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_StringBuffer"* %r
}
define internal %"kermeta::standard_Character"* @"create_kermeta::standard_Character"(){
%r = alloca %"kermeta::standard_Character"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Character"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Character"* %r
}
define internal %"kermeta::standard_Summable"* @"create_kermeta::standard_Summable"(){
%r = alloca %"kermeta::standard_Summable"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Summable"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Summable"* %r
}
define internal %"kermeta::standard_Comparable"* @"create_kermeta::standard_Comparable"(){
%r = alloca %"kermeta::standard_Comparable"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Comparable"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Comparable"* %r
}
define internal %"kermeta::standard_Numeric"* @"create_kermeta::standard_Numeric"(){
%r = alloca %"kermeta::standard_Numeric"
%"0" = call %"kermeta::standard_Summable"* @"create_kermeta::standard_Summable"()
%"00" = getelementptr %"kermeta::standard_Numeric"* %r,i32 0,i32 0
store %"kermeta::standard_Summable"* %"0",%"kermeta::standard_Summable"** %"00"
%"1" = call %"kermeta::standard_Comparable"* @"create_kermeta::standard_Comparable"()
%"11" = getelementptr %"kermeta::standard_Numeric"* %r,i32 0,i32 1
store %"kermeta::standard_Comparable"* %"1",%"kermeta::standard_Comparable"** %"11"
ret %"kermeta::standard_Numeric"* %r
}
define internal %"kermeta::standard_URI"* @"create_kermeta::standard_URI"(){
%r = alloca %"kermeta::standard_URI"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_URI"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_URI"* %r
}
define internal %"kermeta::standard_Map"* @"create_kermeta::standard_Map"(){
%r = alloca %"kermeta::standard_Map"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Map"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Map"* %r
}
define internal %"kermeta::standard_Collection"* @"create_kermeta::standard_Collection"(){
%r = alloca %"kermeta::standard_Collection"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Collection"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Collection"* %r
}
define internal %"kermeta::standard_Set"* @"create_kermeta::standard_Set"(){
%r = alloca %"kermeta::standard_Set"
%"0" = call %"kermeta::standard_Collection"* @"create_kermeta::standard_Collection"()
%"00" = getelementptr %"kermeta::standard_Set"* %r,i32 0,i32 0
store %"kermeta::standard_Collection"* %"0",%"kermeta::standard_Collection"** %"00"
ret %"kermeta::standard_Set"* %r
}
define internal %"kermeta::standard_Bag"* @"create_kermeta::standard_Bag"(){
%r = alloca %"kermeta::standard_Bag"
%"0" = call %"kermeta::standard_Collection"* @"create_kermeta::standard_Collection"()
%"00" = getelementptr %"kermeta::standard_Bag"* %r,i32 0,i32 0
store %"kermeta::standard_Collection"* %"0",%"kermeta::standard_Collection"** %"00"
ret %"kermeta::standard_Bag"* %r
}
define internal %"kermeta::standard_OrderedCollection"* @"create_kermeta::standard_OrderedCollection"(){
%r = alloca %"kermeta::standard_OrderedCollection"
%"0" = call %"kermeta::standard_Collection"* @"create_kermeta::standard_Collection"()
%"00" = getelementptr %"kermeta::standard_OrderedCollection"* %r,i32 0,i32 0
store %"kermeta::standard_Collection"* %"0",%"kermeta::standard_Collection"** %"00"
ret %"kermeta::standard_OrderedCollection"* %r
}
define internal %"kermeta::standard_OrderedSet"* @"create_kermeta::standard_OrderedSet"(){
%r = alloca %"kermeta::standard_OrderedSet"
%"0" = call %"kermeta::standard_Set"* @"create_kermeta::standard_Set"()
%"00" = getelementptr %"kermeta::standard_OrderedSet"* %r,i32 0,i32 0
store %"kermeta::standard_Set"* %"0",%"kermeta::standard_Set"** %"00"
%"1" = call %"kermeta::standard_OrderedCollection"* @"create_kermeta::standard_OrderedCollection"()
%"11" = getelementptr %"kermeta::standard_OrderedSet"* %r,i32 0,i32 1
store %"kermeta::standard_OrderedCollection"* %"1",%"kermeta::standard_OrderedCollection"** %"11"
ret %"kermeta::standard_OrderedSet"* %r
}
define internal %"kermeta::standard_Sequence"* @"create_kermeta::standard_Sequence"(){
%r = alloca %"kermeta::standard_Sequence"
%"0" = call %"kermeta::standard_Bag"* @"create_kermeta::standard_Bag"()
%"00" = getelementptr %"kermeta::standard_Sequence"* %r,i32 0,i32 0
store %"kermeta::standard_Bag"* %"0",%"kermeta::standard_Bag"** %"00"
%"1" = call %"kermeta::standard_OrderedCollection"* @"create_kermeta::standard_OrderedCollection"()
%"11" = getelementptr %"kermeta::standard_Sequence"* %r,i32 0,i32 1
store %"kermeta::standard_OrderedCollection"* %"1",%"kermeta::standard_OrderedCollection"** %"11"
ret %"kermeta::standard_Sequence"* %r
}
define internal %"kermeta::standard_Iterator"* @"create_kermeta::standard_Iterator"(){
%r = alloca %"kermeta::standard_Iterator"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_Iterator"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_Iterator"* %r
}
define internal %"kermeta::standard_EachContext"* @"create_kermeta::standard_EachContext"(){
%r = alloca %"kermeta::standard_EachContext"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::standard_EachContext"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::standard_EachContext"* %r
}
define internal %"kermeta::emfpersistence_Resource"* @"create_kermeta::emfpersistence_Resource"(){
%r = alloca %"kermeta::emfpersistence_Resource"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::emfpersistence_Resource"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::emfpersistence_Resource"* %r
}
define internal %"kermeta::emfpersistence_ResourceSet"* @"create_kermeta::emfpersistence_ResourceSet"(){
%r = alloca %"kermeta::emfpersistence_ResourceSet"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::emfpersistence_ResourceSet"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::emfpersistence_ResourceSet"* %r
}
define internal %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"(){
%r = alloca %"kermeta::exceptions_Exception"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::exceptions_Exception"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::exceptions_Exception"* %r
}
define internal %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"(){
%r = alloca %"kermeta::exceptions_RuntimeError"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_RuntimeError"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_RuntimeError"* %r
}
define internal %"kermeta::exceptions_CallOnVoidTarget"* @"create_kermeta::exceptions_CallOnVoidTarget"(){
%r = alloca %"kermeta::exceptions_CallOnVoidTarget"
%"0" = call %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"()
%"00" = getelementptr %"kermeta::exceptions_CallOnVoidTarget"* %r,i32 0,i32 0
store %"kermeta::exceptions_RuntimeError"* %"0",%"kermeta::exceptions_RuntimeError"** %"00"
ret %"kermeta::exceptions_CallOnVoidTarget"* %r
}
define internal %"kermeta::exceptions_TypeCastError"* @"create_kermeta::exceptions_TypeCastError"(){
%r = alloca %"kermeta::exceptions_TypeCastError"
%"0" = call %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"()
%"00" = getelementptr %"kermeta::exceptions_TypeCastError"* %r,i32 0,i32 0
store %"kermeta::exceptions_RuntimeError"* %"0",%"kermeta::exceptions_RuntimeError"** %"00"
ret %"kermeta::exceptions_TypeCastError"* %r
}
define internal %"kermeta::exceptions_NotImplementedException"* @"create_kermeta::exceptions_NotImplementedException"(){
%r = alloca %"kermeta::exceptions_NotImplementedException"
%"0" = call %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"()
%"00" = getelementptr %"kermeta::exceptions_NotImplementedException"* %r,i32 0,i32 0
store %"kermeta::exceptions_RuntimeError"* %"0",%"kermeta::exceptions_RuntimeError"** %"00"
ret %"kermeta::exceptions_NotImplementedException"* %r
}
define internal %"kermeta::exceptions_UpperBoundReachedError"* @"create_kermeta::exceptions_UpperBoundReachedError"(){
%r = alloca %"kermeta::exceptions_UpperBoundReachedError"
%"0" = call %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"()
%"00" = getelementptr %"kermeta::exceptions_UpperBoundReachedError"* %r,i32 0,i32 0
store %"kermeta::exceptions_RuntimeError"* %"0",%"kermeta::exceptions_RuntimeError"** %"00"
ret %"kermeta::exceptions_UpperBoundReachedError"* %r
}
define internal %"kermeta::exceptions_AbstractClassInstantiationError"* @"create_kermeta::exceptions_AbstractClassInstantiationError"(){
%r = alloca %"kermeta::exceptions_AbstractClassInstantiationError"
%"0" = call %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"()
%"00" = getelementptr %"kermeta::exceptions_AbstractClassInstantiationError"* %r,i32 0,i32 0
store %"kermeta::exceptions_RuntimeError"* %"0",%"kermeta::exceptions_RuntimeError"** %"00"
ret %"kermeta::exceptions_AbstractClassInstantiationError"* %r
}
define internal %"kermeta::exceptions_IncompatibleTypeError"* @"create_kermeta::exceptions_IncompatibleTypeError"(){
%r = alloca %"kermeta::exceptions_IncompatibleTypeError"
%"0" = call %"kermeta::exceptions_RuntimeError"* @"create_kermeta::exceptions_RuntimeError"()
%"00" = getelementptr %"kermeta::exceptions_IncompatibleTypeError"* %r,i32 0,i32 0
store %"kermeta::exceptions_RuntimeError"* %"0",%"kermeta::exceptions_RuntimeError"** %"00"
ret %"kermeta::exceptions_IncompatibleTypeError"* %r
}
define internal %"kermeta::exceptions_DivisionByZero"* @"create_kermeta::exceptions_DivisionByZero"(){
%r = alloca %"kermeta::exceptions_DivisionByZero"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_DivisionByZero"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_DivisionByZero"* %r
}
define internal %"kermeta::exceptions_OverflowError"* @"create_kermeta::exceptions_OverflowError"(){
%r = alloca %"kermeta::exceptions_OverflowError"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_OverflowError"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_OverflowError"* %r
}
define internal %"kermeta::exceptions_VoidOperandError"* @"create_kermeta::exceptions_VoidOperandError"(){
%r = alloca %"kermeta::exceptions_VoidOperandError"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_VoidOperandError"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_VoidOperandError"* %r
}
define internal %"kermeta::exceptions_StringIndexOutOfBound"* @"create_kermeta::exceptions_StringIndexOutOfBound"(){
%r = alloca %"kermeta::exceptions_StringIndexOutOfBound"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_StringIndexOutOfBound"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_StringIndexOutOfBound"* %r
}
define internal %"kermeta::exceptions_StringFormatException"* @"create_kermeta::exceptions_StringFormatException"(){
%r = alloca %"kermeta::exceptions_StringFormatException"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_StringFormatException"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_StringFormatException"* %r
}
define internal %"kermeta::exceptions_IndexOutOfBound"* @"create_kermeta::exceptions_IndexOutOfBound"(){
%r = alloca %"kermeta::exceptions_IndexOutOfBound"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_IndexOutOfBound"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_IndexOutOfBound"* %r
}
define internal %"kermeta::exceptions_EmptyCollection"* @"create_kermeta::exceptions_EmptyCollection"(){
%r = alloca %"kermeta::exceptions_EmptyCollection"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_EmptyCollection"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_EmptyCollection"* %r
}
define internal %"kermeta::exceptions_IteratorIsOff"* @"create_kermeta::exceptions_IteratorIsOff"(){
%r = alloca %"kermeta::exceptions_IteratorIsOff"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_IteratorIsOff"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_IteratorIsOff"* %r
}
define internal %"kermeta::exceptions_IOException"* @"create_kermeta::exceptions_IOException"(){
%r = alloca %"kermeta::exceptions_IOException"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_IOException"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_IOException"* %r
}
define internal %"kermeta::exceptions_FileNotFoundException"* @"create_kermeta::exceptions_FileNotFoundException"(){
%r = alloca %"kermeta::exceptions_FileNotFoundException"
%"0" = call %"kermeta::exceptions_IOException"* @"create_kermeta::exceptions_IOException"()
%"00" = getelementptr %"kermeta::exceptions_FileNotFoundException"* %r,i32 0,i32 0
store %"kermeta::exceptions_IOException"* %"0",%"kermeta::exceptions_IOException"** %"00"
ret %"kermeta::exceptions_FileNotFoundException"* %r
}
define internal %"kermeta::exceptions_ConstraintViolatedException"* @"create_kermeta::exceptions_ConstraintViolatedException"(){
%r = alloca %"kermeta::exceptions_ConstraintViolatedException"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_ConstraintViolatedException"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_ConstraintViolatedException"* %r
}
define internal %"kermeta::exceptions_ConstraintViolatedPre"* @"create_kermeta::exceptions_ConstraintViolatedPre"(){
%r = alloca %"kermeta::exceptions_ConstraintViolatedPre"
%"0" = call %"kermeta::exceptions_ConstraintViolatedException"* @"create_kermeta::exceptions_ConstraintViolatedException"()
%"00" = getelementptr %"kermeta::exceptions_ConstraintViolatedPre"* %r,i32 0,i32 0
store %"kermeta::exceptions_ConstraintViolatedException"* %"0",%"kermeta::exceptions_ConstraintViolatedException"** %"00"
ret %"kermeta::exceptions_ConstraintViolatedPre"* %r
}
define internal %"kermeta::exceptions_ConstraintViolatedPost"* @"create_kermeta::exceptions_ConstraintViolatedPost"(){
%r = alloca %"kermeta::exceptions_ConstraintViolatedPost"
%"0" = call %"kermeta::exceptions_ConstraintViolatedException"* @"create_kermeta::exceptions_ConstraintViolatedException"()
%"00" = getelementptr %"kermeta::exceptions_ConstraintViolatedPost"* %r,i32 0,i32 0
store %"kermeta::exceptions_ConstraintViolatedException"* %"0",%"kermeta::exceptions_ConstraintViolatedException"** %"00"
ret %"kermeta::exceptions_ConstraintViolatedPost"* %r
}
define internal %"kermeta::exceptions_ConstraintViolatedInv"* @"create_kermeta::exceptions_ConstraintViolatedInv"(){
%r = alloca %"kermeta::exceptions_ConstraintViolatedInv"
%"0" = call %"kermeta::exceptions_ConstraintViolatedException"* @"create_kermeta::exceptions_ConstraintViolatedException"()
%"00" = getelementptr %"kermeta::exceptions_ConstraintViolatedInv"* %r,i32 0,i32 0
store %"kermeta::exceptions_ConstraintViolatedException"* %"0",%"kermeta::exceptions_ConstraintViolatedException"** %"00"
ret %"kermeta::exceptions_ConstraintViolatedInv"* %r
}
define internal %"kermeta::exceptions_ResourceLoadException"* @"create_kermeta::exceptions_ResourceLoadException"(){
%r = alloca %"kermeta::exceptions_ResourceLoadException"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_ResourceLoadException"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_ResourceLoadException"* %r
}
define internal %"kermeta::exceptions_ResourceSaveException"* @"create_kermeta::exceptions_ResourceSaveException"(){
%r = alloca %"kermeta::exceptions_ResourceSaveException"
%"0" = call %"kermeta::exceptions_Exception"* @"create_kermeta::exceptions_Exception"()
%"00" = getelementptr %"kermeta::exceptions_ResourceSaveException"* %r,i32 0,i32 0
store %"kermeta::exceptions_Exception"* %"0",%"kermeta::exceptions_Exception"** %"00"
ret %"kermeta::exceptions_ResourceSaveException"* %r
}
define internal %"kermeta::exceptions_ConstraintsDiagnostic"* @"create_kermeta::exceptions_ConstraintsDiagnostic"(){
%r = alloca %"kermeta::exceptions_ConstraintsDiagnostic"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::exceptions_ConstraintsDiagnostic"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::exceptions_ConstraintsDiagnostic"* %r
}
define internal %"kermeta::io_FileIO"* @"create_kermeta::io_FileIO"(){
%r = alloca %"kermeta::io_FileIO"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::io_FileIO"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::io_FileIO"* %r
}
define internal %"kermeta::io_StdIO"* @"create_kermeta::io_StdIO"(){
%r = alloca %"kermeta::io_StdIO"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::io_StdIO"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::io_StdIO"* %r
}
define internal %"kermeta::utils_Hashtable"* @"create_kermeta::utils_Hashtable"(){
%r = alloca %"kermeta::utils_Hashtable"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"kermeta::utils_Hashtable"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"kermeta::utils_Hashtable"* %r
}
define internal %"root_package_ArabicNumber"* @"create_root_package_ArabicNumber"(){
%r = alloca %"root_package_ArabicNumber"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"root_package_ArabicNumber"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"root_package_ArabicNumber"* %r
}
define internal %"root_package_Digit"* @"create_root_package_Digit"(){
%r = alloca %"root_package_Digit"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"root_package_Digit"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"root_package_Digit"* %r
}
define internal %"root_package_RomanNumber"* @"create_root_package_RomanNumber"(){
%r = alloca %"root_package_RomanNumber"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"root_package_RomanNumber"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"root_package_RomanNumber"* %r
}
define internal %"root_package_Letter"* @"create_root_package_Letter"(){
%r = alloca %"root_package_Letter"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"root_package_Letter"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"root_package_Letter"* %r
}
define internal %"root_package_Main"* @"create_root_package_Main"(){
%r = alloca %"root_package_Main"
%"0" = call %"kermeta::standard_Object"* @"create_kermeta::standard_Object"()
%"00" = getelementptr %"root_package_Main"* %r,i32 0,i32 0
store %"kermeta::standard_Object"* %"0",%"kermeta::standard_Object"** %"00"
ret %"root_package_Main"* %r
}
define internal %"org::kermeta::language::behavior_CallExpression"* @"org::kermeta::language::behavior_Assignment.#target"(%"org::kermeta::language::behavior_Assignment"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Assignment"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_CallExpression"** %"t"
ret %"org::kermeta::language::behavior_CallExpression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Assignment.#value"(%"org::kermeta::language::behavior_Assignment"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Assignment"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::behavior_Assignment.#isCast"(%"org::kermeta::language::behavior_Assignment"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Assignment"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::behavior_Expression.#staticType"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 14
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_CallExpression.#parameters"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 6
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_CallExpression.#name"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 7
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::behavior_CallExpression.#staticTypeVariableBindings"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 8
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Block.#statement"(%"org::kermeta::language::behavior_Block"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Block"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Rescue"* @"org::kermeta::language::behavior_Block.#rescueBlock"(%"org::kermeta::language::behavior_Block"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Block"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_Rescue"** %"t"
ret %"org::kermeta::language::behavior_Rescue"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::behavior_CallVariable.#isAtpre"(%"org::kermeta::language::behavior_CallVariable"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallVariable"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_CallFeature.#target"(%"org::kermeta::language::behavior_CallFeature"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallFeature"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::behavior_CallFeature.#isAtpre"(%"org::kermeta::language::behavior_CallFeature"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallFeature"* %"self",i32 0,i32 4
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::behavior_CallSuperOperation.#superType"(%"org::kermeta::language::behavior_CallSuperOperation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallSuperOperation"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Conditional.#thenBody"(%"org::kermeta::language::behavior_Conditional"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Conditional"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Conditional.#elseBody"(%"org::kermeta::language::behavior_Conditional"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Conditional"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Conditional.#condition"(%"org::kermeta::language::behavior_Conditional"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Conditional"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Raise.#expression"(%"org::kermeta::language::behavior_Raise"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Raise"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Rescue.#body"(%"org::kermeta::language::behavior_Rescue"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Rescue"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_TypeReference"* @"org::kermeta::language::behavior_Rescue.#exceptionType"(%"org::kermeta::language::behavior_Rescue"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Rescue"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_TypeReference"** %"t"
ret %"org::kermeta::language::behavior_TypeReference"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_Rescue.#exceptionName"(%"org::kermeta::language::behavior_Rescue"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Rescue"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_JavaStaticCall.#parameters"(%"org::kermeta::language::behavior_JavaStaticCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_JavaStaticCall"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_JavaStaticCall.#jclass"(%"org::kermeta::language::behavior_JavaStaticCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_JavaStaticCall"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_JavaStaticCall.#jmethod"(%"org::kermeta::language::behavior_JavaStaticCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_JavaStaticCall"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::behavior_LambdaParameter"* @"org::kermeta::language::behavior_LambdaExpression.#parameters"(%"org::kermeta::language::behavior_LambdaExpression"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_LambdaExpression"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_LambdaParameter"** %"t"
ret %"org::kermeta::language::behavior_LambdaParameter"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_LambdaExpression.#body"(%"org::kermeta::language::behavior_LambdaExpression"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_LambdaExpression"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_LambdaParameter.#name"(%"org::kermeta::language::behavior_LambdaParameter"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_LambdaParameter"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::behavior_TypeReference"* @"org::kermeta::language::behavior_LambdaParameter.#type"(%"org::kermeta::language::behavior_LambdaParameter"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_LambdaParameter"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_TypeReference"** %"t"
ret %"org::kermeta::language::behavior_TypeReference"* %"r"
}
define internal %"kermeta::standard_Integer"* @"org::kermeta::language::behavior_IntegerLiteral.#value"(%"org::kermeta::language::behavior_IntegerLiteral"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_IntegerLiteral"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_Integer"** %"t"
ret %"kermeta::standard_Integer"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_StringLiteral.#value"(%"org::kermeta::language::behavior_StringLiteral"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_StringLiteral"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::behavior_BooleanLiteral.#value"(%"org::kermeta::language::behavior_BooleanLiteral"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_BooleanLiteral"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::behavior_TypeReference"* @"org::kermeta::language::behavior_CallTypeLiteral.#typeref"(%"org::kermeta::language::behavior_CallTypeLiteral"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallTypeLiteral"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_TypeReference"** %"t"
ret %"org::kermeta::language::behavior_TypeReference"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Loop.#initialization"(%"org::kermeta::language::behavior_Loop"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Loop"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Loop.#body"(%"org::kermeta::language::behavior_Loop"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Loop"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_Loop.#stopCondition"(%"org::kermeta::language::behavior_Loop"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_Loop"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_VariableDecl.#initialization"(%"org::kermeta::language::behavior_VariableDecl"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_VariableDecl"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::behavior_VariableDecl.#identifier"(%"org::kermeta::language::behavior_VariableDecl"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_VariableDecl"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::behavior_TypeReference"* @"org::kermeta::language::behavior_VariableDecl.#type"(%"org::kermeta::language::behavior_VariableDecl"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_VariableDecl"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::behavior_TypeReference"** %"t"
ret %"org::kermeta::language::behavior_TypeReference"* %"r"
}
define internal %"org::kermeta::language::structure_Using"* @"org::kermeta::language::behavior_UnresolvedCall.#usings"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Using"** %"t"
ret %"org::kermeta::language::structure_Using"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::behavior_UnresolvedCall.#target"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::behavior_UnresolvedCall.#isAtpre"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::behavior_UnresolvedCall.#targetParent"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 6
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::behavior_UnresolvedCall.#generics"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 7
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::behavior_UnresolvedCall.#isCalledWithParenthesis"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 8
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::behavior_CallOperation.#staticOperation"(%"org::kermeta::language::behavior_CallOperation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallOperation"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Property"* @"org::kermeta::language::behavior_CallProperty.#staticProperty"(%"org::kermeta::language::behavior_CallProperty"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallProperty"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Property"** %"t"
ret %"org::kermeta::language::structure_Property"* %"r"
}
define internal %"org::kermeta::language::structure_EnumerationLiteral"* @"org::kermeta::language::behavior_CallEnumLiteral.#staticEnumLiteral"(%"org::kermeta::language::behavior_CallEnumLiteral"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::behavior_CallEnumLiteral"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_EnumerationLiteral"** %"t"
ret %"org::kermeta::language::structure_EnumerationLiteral"* %"r"
}
define internal %"org::kermeta::language::structure_Tag"* @"org::kermeta::language::structure_KermetaModelElement.#kTag"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 22
%"r" = load %"org::kermeta::language::structure_Tag"** %"t"
ret %"org::kermeta::language::structure_Tag"* %"r"
}
define internal %"org::kermeta::language::structure_Tag"* @"org::kermeta::language::structure_KermetaModelElement.#kOwnedTags"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 23
%"r" = load %"org::kermeta::language::structure_Tag"** %"t"
ret %"org::kermeta::language::structure_Tag"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_Operation.#raisedException"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Parameter"* @"org::kermeta::language::structure_Operation.#ownedParameter"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Parameter"** %"t"
ret %"org::kermeta::language::structure_Parameter"* %"r"
}
define internal %"org::kermeta::language::structure_Constraint"* @"org::kermeta::language::structure_Operation.#pre"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_Constraint"** %"t"
ret %"org::kermeta::language::structure_Constraint"* %"r"
}
define internal %"org::kermeta::language::structure_Constraint"* @"org::kermeta::language::structure_Operation.#post"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 5
%"r" = load %"org::kermeta::language::structure_Constraint"** %"t"
ret %"org::kermeta::language::structure_Constraint"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::structure_Operation.#body"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 6
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::structure_UnresolvedOperation"* @"org::kermeta::language::structure_Operation.#ownedUnresolvedOperations"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 7
%"r" = load %"org::kermeta::language::structure_UnresolvedOperation"** %"t"
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"org::kermeta::language::structure_Operation.#owningClass"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 8
%"r" = load %"org::kermeta::language::structure_ClassDefinition"** %"t"
ret %"org::kermeta::language::structure_ClassDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"org::kermeta::language::structure_Operation.#typeParameter"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 9
%"r" = load %"org::kermeta::language::structure_TypeVariable"** %"t"
ret %"org::kermeta::language::structure_TypeVariable"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Operation.#isAbstract"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 10
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Operation.#uniqueName"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 11
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_AbstractProperty"* @"org::kermeta::language::structure_Property.#opposite"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_AbstractProperty"** %"t"
ret %"org::kermeta::language::structure_AbstractProperty"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Property.#isReadOnly"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Property.#default"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 4
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Property.#isComposite"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Property.#isDerived"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 6
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Property.#isID"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 7
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::structure_Property.#getterBody"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 8
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::structure_Property.#setterBody"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 9
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Property.#isGetterAbstract"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 10
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Property.#isSetterAbstract"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 11
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_UnresolvedProperty"* @"org::kermeta::language::structure_Property.#ownedUnresolvedProperties"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 12
%"r" = load %"org::kermeta::language::structure_UnresolvedProperty"** %"t"
ret %"org::kermeta::language::structure_UnresolvedProperty"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"org::kermeta::language::structure_Property.#owningClass"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 13
%"r" = load %"org::kermeta::language::structure_ClassDefinition"** %"t"
ret %"org::kermeta::language::structure_ClassDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_TypeContainer"* @"org::kermeta::language::structure_Type.#typeContainer"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 10
%"r" = load %"org::kermeta::language::structure_TypeContainer"** %"t"
ret %"org::kermeta::language::structure_TypeContainer"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_TypeContainer.#containedType"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 11
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Enumeration"* @"org::kermeta::language::structure_EnumerationLiteral.#enumeration"(%"org::kermeta::language::structure_EnumerationLiteral"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_EnumerationLiteral"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Enumeration"** %"t"
ret %"org::kermeta::language::structure_Enumeration"* %"r"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"org::kermeta::language::structure_TypeVariableBinding.#variable"(%"org::kermeta::language::structure_TypeVariableBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypeVariableBinding"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_TypeVariable"** %"t"
ret %"org::kermeta::language::structure_TypeVariable"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_TypeVariableBinding.#type"(%"org::kermeta::language::structure_TypeVariableBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypeVariableBinding"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_MultiplicityElement.#isOrdered"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_MultiplicityElement.#isUnique"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 6
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Integer"* @"org::kermeta::language::structure_MultiplicityElement.#lower"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 7
%"r" = load %"kermeta::standard_Integer"** %"t"
ret %"kermeta::standard_Integer"* %"r"
}
define internal %"kermeta::standard_Integer"* @"org::kermeta::language::structure_MultiplicityElement.#upper"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 8
%"r" = load %"kermeta::standard_Integer"** %"t"
ret %"kermeta::standard_Integer"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_TypeDefinition.#superType"(%"org::kermeta::language::structure_TypeDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_TypeDefinition.#isAspect"(%"org::kermeta::language::structure_TypeDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Property"* @"org::kermeta::language::structure_Class.#ownedAttribute"(%"org::kermeta::language::structure_Class"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Class"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Property"** %"t"
ret %"org::kermeta::language::structure_Property"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_Class.#ownedOperation"(%"org::kermeta::language::structure_Class"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Class"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Class"* @"org::kermeta::language::structure_Class.#superClass"(%"org::kermeta::language::structure_Class"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Class"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Class"** %"t"
ret %"org::kermeta::language::structure_Class"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Class.#isAbstract"(%"org::kermeta::language::structure_Class"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Class"* %"self",i32 0,i32 4
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Class.#name"(%"org::kermeta::language::structure_Class"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Class"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_EnumerationLiteral"* @"org::kermeta::language::structure_Enumeration.#ownedLiteral"(%"org::kermeta::language::structure_Enumeration"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Enumeration"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_EnumerationLiteral"** %"t"
ret %"org::kermeta::language::structure_EnumerationLiteral"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_NamedElement.#name"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 10
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_Package"* @"org::kermeta::language::structure_Package.#nestedPackage"(%"org::kermeta::language::structure_Package"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Package"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Package"** %"t"
ret %"org::kermeta::language::structure_Package"* %"r"
}
define internal %"org::kermeta::language::structure_Package"* @"org::kermeta::language::structure_Package.#nestingPackage"(%"org::kermeta::language::structure_Package"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Package"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Package"** %"t"
ret %"org::kermeta::language::structure_Package"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Package.#uri"(%"org::kermeta::language::structure_Package"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Package"* %"self",i32 0,i32 4
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"org::kermeta::language::structure_Package.#ownedAdaptationOperators"(%"org::kermeta::language::structure_Package"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Package"* %"self",i32 0,i32 5
%"r" = load %"org::kermeta::language::structure_AdaptationOperator"** %"t"
ret %"org::kermeta::language::structure_AdaptationOperator"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_Parameter.#operation"(%"org::kermeta::language::structure_Parameter"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Parameter"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_PrimitiveType.#instanceType"(%"org::kermeta::language::structure_PrimitiveType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PrimitiveType"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_TypedElement.#type"(%"org::kermeta::language::structure_TypedElement"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypedElement"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Tag.#name"(%"org::kermeta::language::structure_Tag"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Tag"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Tag.#value"(%"org::kermeta::language::structure_Tag"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Tag"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"org::kermeta::language::structure_Tag.#object"(%"org::kermeta::language::structure_Tag"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Tag"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_KermetaModelElement"** %"t"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"org::kermeta::language::structure_Constraint.#body"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"org::kermeta::language::structure_ConstraintType"* @"org::kermeta::language::structure_Constraint.#stereotype"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_ConstraintType"** %"t"
ret %"org::kermeta::language::structure_ConstraintType"* %"r"
}
define internal %"org::kermeta::language::structure_ConstraintLanguage"* @"org::kermeta::language::structure_Constraint.#language"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_ConstraintLanguage"** %"t"
ret %"org::kermeta::language::structure_ConstraintLanguage"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"org::kermeta::language::structure_Constraint.#invOwner"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_ClassDefinition"** %"t"
ret %"org::kermeta::language::structure_ClassDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_Constraint.#preOwner"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 5
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_Constraint.#postOwner"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 6
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Constraint"* @"org::kermeta::language::structure_ClassDefinition.#inv"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Constraint"** %"t"
ret %"org::kermeta::language::structure_Constraint"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_ClassDefinition.#isAbstract"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Property"* @"org::kermeta::language::structure_ClassDefinition.#ownedAttribute"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Property"** %"t"
ret %"org::kermeta::language::structure_Property"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_ClassDefinition.#ownedOperation"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_ClassDefinition.#isSingleton"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_ClassDefinition.#isFinal"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 6
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_Package"* @"org::kermeta::language::structure_Metamodel.#packages"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Package"** %"t"
ret %"org::kermeta::language::structure_Package"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Metamodel.#uri"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 4
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_FilteredMetamodelReference"* @"org::kermeta::language::structure_Metamodel.#referencedMetamodels"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 5
%"r" = load %"org::kermeta::language::structure_FilteredMetamodelReference"** %"t"
ret %"org::kermeta::language::structure_FilteredMetamodelReference"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"org::kermeta::language::structure_Metamodel.#isResolved"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 6
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"org::kermeta::language::structure_ModelElementTypeDefinitionContainer.#ownedTypeDefinition"(%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_ModelElementTypeDefinition"** %"t"
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"org::kermeta::language::structure_GenericTypeDefinition.#typeParameter"(%"org::kermeta::language::structure_GenericTypeDefinition"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_GenericTypeDefinition"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_TypeVariable"** %"t"
ret %"org::kermeta::language::structure_TypeVariable"* %"r"
}
define internal %"org::kermeta::language::structure_TypeVariableBinding"* @"org::kermeta::language::structure_ParameterizedType.#virtualTypeBinding"(%"org::kermeta::language::structure_ParameterizedType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ParameterizedType"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_TypeVariableBinding"** %"t"
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"r"
}
define internal %"org::kermeta::language::structure_TypeVariableBinding"* @"org::kermeta::language::structure_ParameterizedType.#typeParamBinding"(%"org::kermeta::language::structure_ParameterizedType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ParameterizedType"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_TypeVariableBinding"** %"t"
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"r"
}
define internal %"org::kermeta::language::structure_GenericTypeDefinition"* @"org::kermeta::language::structure_ParameterizedType.#typeDefinition"(%"org::kermeta::language::structure_ParameterizedType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ParameterizedType"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_GenericTypeDefinition"** %"t"
ret %"org::kermeta::language::structure_GenericTypeDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_TypeVariable.#supertype"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 6
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_VirtualType"* @"org::kermeta::language::structure_ModelTypeVariable.#virtualType"(%"org::kermeta::language::structure_ModelTypeVariable"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ModelTypeVariable"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_VirtualType"** %"t"
ret %"org::kermeta::language::structure_VirtualType"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"org::kermeta::language::structure_VirtualType.#classDefinition"(%"org::kermeta::language::structure_VirtualType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_VirtualType"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_ClassDefinition"** %"t"
ret %"org::kermeta::language::structure_ClassDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_ModelTypeVariable"* @"org::kermeta::language::structure_VirtualType.#metamodelVariable"(%"org::kermeta::language::structure_VirtualType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_VirtualType"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_ModelTypeVariable"** %"t"
ret %"org::kermeta::language::structure_ModelTypeVariable"* %"r"
}
define internal %"org::kermeta::language::structure_TypeVariableBinding"* @"org::kermeta::language::structure_VirtualType.#typeParamBinding"(%"org::kermeta::language::structure_VirtualType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_VirtualType"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_TypeVariableBinding"** %"t"
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"r"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"org::kermeta::language::structure_Model.#contents"(%"org::kermeta::language::structure_Model"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Model"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_KermetaModelElement"** %"t"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"r"
}
define internal %"org::kermeta::language::structure_Using"* @"org::kermeta::language::structure_UnresolvedType.#usings"(%"org::kermeta::language::structure_UnresolvedType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Using"** %"t"
ret %"org::kermeta::language::structure_Using"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_UnresolvedType.#generics"(%"org::kermeta::language::structure_UnresolvedType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_UnresolvedType.#typeIdentifier"(%"org::kermeta::language::structure_UnresolvedType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_UnresolvedProperty.#propertyIdentifier"(%"org::kermeta::language::structure_UnresolvedProperty"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UnresolvedProperty"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_UnresolvedOperation.#operationIdentifier"(%"org::kermeta::language::structure_UnresolvedOperation"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Using.#fromQName"(%"org::kermeta::language::structure_Using"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Using"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_Using.#toName"(%"org::kermeta::language::structure_Using"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_Using"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_ProductType.#type"(%"org::kermeta::language::structure_ProductType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ProductType"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_FunctionType.#left"(%"org::kermeta::language::structure_FunctionType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_FunctionType"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Type"* @"org::kermeta::language::structure_FunctionType.#right"(%"org::kermeta::language::structure_FunctionType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_FunctionType"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_Type"** %"t"
ret %"org::kermeta::language::structure_Type"* %"r"
}
define internal %"org::kermeta::language::structure_Metamodel"* @"org::kermeta::language::structure_MetamodelBinding.#boundMetamodel"(%"org::kermeta::language::structure_MetamodelBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MetamodelBinding"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Metamodel"** %"t"
ret %"org::kermeta::language::structure_Metamodel"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinitionBinding"* @"org::kermeta::language::structure_MetamodelBinding.#ownedClassDefinitionBindings"(%"org::kermeta::language::structure_MetamodelBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MetamodelBinding"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_ClassDefinitionBinding"** %"t"
ret %"org::kermeta::language::structure_ClassDefinitionBinding"* %"r"
}
define internal %"org::kermeta::language::structure_UseAdaptationOperator"* @"org::kermeta::language::structure_MetamodelBinding.#usedAdaptationOperators"(%"org::kermeta::language::structure_MetamodelBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MetamodelBinding"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_UseAdaptationOperator"** %"t"
ret %"org::kermeta::language::structure_UseAdaptationOperator"* %"r"
}
define internal %"org::kermeta::language::structure_EnumerationBinding"* @"org::kermeta::language::structure_MetamodelBinding.#ownedEnumerationBindings"(%"org::kermeta::language::structure_MetamodelBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_MetamodelBinding"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_EnumerationBinding"** %"t"
ret %"org::kermeta::language::structure_EnumerationBinding"* %"r"
}
define internal %"org::kermeta::language::structure_PropertyBinding"* @"org::kermeta::language::structure_ClassDefinitionBinding.#ownedPropertyBindings"(%"org::kermeta::language::structure_ClassDefinitionBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinitionBinding"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_PropertyBinding"** %"t"
ret %"org::kermeta::language::structure_PropertyBinding"* %"r"
}
define internal %"org::kermeta::language::structure_OperationBinding"* @"org::kermeta::language::structure_ClassDefinitionBinding.#ownedOperationBindings"(%"org::kermeta::language::structure_ClassDefinitionBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinitionBinding"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_OperationBinding"** %"t"
ret %"org::kermeta::language::structure_OperationBinding"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"org::kermeta::language::structure_ClassDefinitionBinding.#source"(%"org::kermeta::language::structure_ClassDefinitionBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinitionBinding"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_ClassDefinition"** %"t"
ret %"org::kermeta::language::structure_ClassDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"org::kermeta::language::structure_ClassDefinitionBinding.#target"(%"org::kermeta::language::structure_ClassDefinitionBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ClassDefinitionBinding"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_ClassDefinition"** %"t"
ret %"org::kermeta::language::structure_ClassDefinition"* %"r"
}
define internal %"org::kermeta::language::structure_Enumeration"* @"org::kermeta::language::structure_EnumerationBinding.#source"(%"org::kermeta::language::structure_EnumerationBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_EnumerationBinding"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Enumeration"** %"t"
ret %"org::kermeta::language::structure_Enumeration"* %"r"
}
define internal %"org::kermeta::language::structure_Enumeration"* @"org::kermeta::language::structure_EnumerationBinding.#target"(%"org::kermeta::language::structure_EnumerationBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_EnumerationBinding"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Enumeration"** %"t"
ret %"org::kermeta::language::structure_Enumeration"* %"r"
}
define internal %"org::kermeta::language::structure_Property"* @"org::kermeta::language::structure_PropertyBinding.#source"(%"org::kermeta::language::structure_PropertyBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyBinding"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Property"** %"t"
ret %"org::kermeta::language::structure_Property"* %"r"
}
define internal %"org::kermeta::language::structure_Property"* @"org::kermeta::language::structure_PropertyBinding.#target"(%"org::kermeta::language::structure_PropertyBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyBinding"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Property"** %"t"
ret %"org::kermeta::language::structure_Property"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_OperationBinding.#source"(%"org::kermeta::language::structure_OperationBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_OperationBinding"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_OperationBinding.#target"(%"org::kermeta::language::structure_OperationBinding"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_OperationBinding"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_AdaptationParameter"* @"org::kermeta::language::structure_AdaptationOperator.#parameters"(%"org::kermeta::language::structure_AdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_AdaptationOperator"* %"self",i32 0,i32 4
%"r" = load %"org::kermeta::language::structure_AdaptationParameter"** %"t"
ret %"org::kermeta::language::structure_AdaptationParameter"* %"r"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"org::kermeta::language::structure_UseAdaptationOperator.#parameters"(%"org::kermeta::language::structure_UseAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UseAdaptationOperator"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_KermetaModelElement"** %"t"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"r"
}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"org::kermeta::language::structure_UseAdaptationOperator.#ownedUnresolved"(%"org::kermeta::language::structure_UseAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UseAdaptationOperator"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_UnresolvedReference"** %"t"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"r"
}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"org::kermeta::language::structure_UseAdaptationOperator.#usedOperator"(%"org::kermeta::language::structure_UseAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_UseAdaptationOperator"* %"self",i32 0,i32 3
%"r" = load %"org::kermeta::language::structure_AdaptationOperator"** %"t"
ret %"org::kermeta::language::structure_AdaptationOperator"* %"r"
}
define internal %"org::kermeta::language::structure_Property"* @"org::kermeta::language::structure_PropertyAdaptationOperator.#target"(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Property"** %"t"
ret %"org::kermeta::language::structure_Property"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_PropertyAdaptationOperator.#getter"(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_PropertyAdaptationOperator.#setter"(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_PropertyAdaptationOperator.#adder"(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self",i32 0,i32 4
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_PropertyAdaptationOperator.#remover"(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self",i32 0,i32 5
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::standard_String"* @"org::kermeta::language::structure_OperationAdaptationOperator.#body"(%"org::kermeta::language::structure_OperationAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_OperationAdaptationOperator"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::structure_Operation"* @"org::kermeta::language::structure_OperationAdaptationOperator.#target"(%"org::kermeta::language::structure_OperationAdaptationOperator"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_OperationAdaptationOperator"* %"self",i32 0,i32 2
%"r" = load %"org::kermeta::language::structure_Operation"** %"t"
ret %"org::kermeta::language::structure_Operation"* %"r"
}
define internal %"org::kermeta::language::structure_Metamodel"* @"org::kermeta::language::structure_ModelType.#typeDefinition"(%"org::kermeta::language::structure_ModelType"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_ModelType"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Metamodel"** %"t"
ret %"org::kermeta::language::structure_Metamodel"* %"r"
}
define internal %"org::kermeta::language::structure_Metamodel"* @"org::kermeta::language::structure_FilteredMetamodelReference.#metamodel"(%"org::kermeta::language::structure_FilteredMetamodelReference"* %"self") readonly inlinehint{
%"t" = getelementptr %"org::kermeta::language::structure_FilteredMetamodelReference"* %"self",i32 0,i32 1
%"r" = load %"org::kermeta::language::structure_Metamodel"** %"t"
ret %"org::kermeta::language::structure_Metamodel"* %"r"
}
define internal %"kermeta::standard_Integer"* @"kermeta::standard_EachContext.#index"(%"kermeta::standard_EachContext"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::standard_EachContext"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_Integer"** %"t"
ret %"kermeta::standard_Integer"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"kermeta::standard_EachContext.#isFirst"(%"kermeta::standard_EachContext"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::standard_EachContext"* %"self",i32 0,i32 2
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_Boolean"* @"kermeta::standard_EachContext.#isLast"(%"kermeta::standard_EachContext"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::standard_EachContext"* %"self",i32 0,i32 3
%"r" = load %"kermeta::standard_Boolean"** %"t"
ret %"kermeta::standard_Boolean"* %"r"
}
define internal %"kermeta::standard_String"* @"kermeta::exceptions_Exception.#message"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 14
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"kermeta::exceptions_Exception"* @"kermeta::exceptions_Exception.#nestedException"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 15
%"r" = load %"kermeta::exceptions_Exception"** %"t"
ret %"kermeta::exceptions_Exception"* %"r"
}
define internal %"kermeta::standard_String"* @"kermeta::exceptions_Exception.#stackTrace"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 16
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"kermeta::exceptions_RuntimeError.#expression"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 7
%"r" = load %"org::kermeta::language::behavior_Expression"** %"t"
ret %"org::kermeta::language::behavior_Expression"* %"r"
}
define internal %"kermeta::standard_Bag"* @"kermeta::exceptions_ConstraintsDiagnostic.#setConstraints"(%"kermeta::exceptions_ConstraintsDiagnostic"* %"self") readonly inlinehint{
%"t" = getelementptr %"kermeta::exceptions_ConstraintsDiagnostic"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_Bag"** %"t"
ret %"kermeta::standard_Bag"* %"r"
}
define internal %"root_package_Digit"* @"root_package_ArabicNumber.#content"(%"root_package_ArabicNumber"* %"self") readonly inlinehint{
%"t" = getelementptr %"root_package_ArabicNumber"* %"self",i32 0,i32 1
%"r" = load %"root_package_Digit"** %"t"
ret %"root_package_Digit"* %"r"
}
define internal %"kermeta::standard_Integer"* @"root_package_Digit.#value"(%"root_package_Digit"* %"self") readonly inlinehint{
%"t" = getelementptr %"root_package_Digit"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_Integer"** %"t"
ret %"kermeta::standard_Integer"* %"r"
}
define internal %"root_package_Letter"* @"root_package_RomanNumber.#content"(%"root_package_RomanNumber"* %"self") readonly inlinehint{
%"t" = getelementptr %"root_package_RomanNumber"* %"self",i32 0,i32 1
%"r" = load %"root_package_Letter"** %"t"
ret %"root_package_Letter"* %"r"
}
define internal %"kermeta::standard_String"* @"root_package_Letter.#value"(%"root_package_Letter"* %"self") readonly inlinehint{
%"t" = getelementptr %"root_package_Letter"* %"self",i32 0,i32 1
%"r" = load %"kermeta::standard_String"** %"t"
ret %"kermeta::standard_String"* %"r"
}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_Assignment_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_Assignment"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Assignment"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Assignment_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Assignment"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Assignment %"org::kermeta::language::behavior_Assignment"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Assignment"*)
%"v0" = call cast_org::kermeta::language::behavior_Assignment_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Assignment"* %"v0")
ret %"org::kermeta::language::behavior_Assignment"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_Assignment_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_Assignment"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Assignment %"org::kermeta::language::behavior_Assignment"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_Assignment"*)
%"v0" = call cast_org::kermeta::language::behavior_Assignment_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_Assignment"* %"v0")
ret %"org::kermeta::language::behavior_Assignment"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::behavior_Expression_kermeta::standard_Object(%"org::kermeta::language::behavior_Expression"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"kermeta::standard_Object"* %"org::kermeta::language::behavior_Expression"*)
%"v0" = call cast_org::kermeta::language::behavior_Expression_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::behavior_Expression"* %"v0")
ret %"org::kermeta::language::behavior_Expression"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Expression_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Expression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Expression"*)
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Expression"* %"v0")
ret %"org::kermeta::language::behavior_Expression"* %"v0"}
define internal %"org::kermeta::language::behavior_Assignment"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_Assignment"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::behavior_Assignment"** %"0"
ret %"org::kermeta::language::behavior_Assignment"* %"1"
}
define internal %"org::kermeta::language::behavior_CallExpression"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_CallExpression"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::behavior_CallExpression"** %"0"
ret %"org::kermeta::language::behavior_CallExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Block"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_Block"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::behavior_Block"** %"0"
ret %"org::kermeta::language::behavior_Block"* %"1"
}
define internal %"org::kermeta::language::behavior_Conditional"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_Conditional"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::behavior_Conditional"** %"0"
ret %"org::kermeta::language::behavior_Conditional"* %"1"
}
define internal %"org::kermeta::language::behavior_Raise"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_Raise"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 6
%"1" = load %"org::kermeta::language::behavior_Raise"** %"0"
ret %"org::kermeta::language::behavior_Raise"* %"1"
}
define internal %"org::kermeta::language::behavior_Literal"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_Literal"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 7
%"1" = load %"org::kermeta::language::behavior_Literal"** %"0"
ret %"org::kermeta::language::behavior_Literal"* %"1"
}
define internal %"org::kermeta::language::behavior_EmptyExpression"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_EmptyExpression"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 8
%"1" = load %"org::kermeta::language::behavior_EmptyExpression"** %"0"
ret %"org::kermeta::language::behavior_EmptyExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_JavaStaticCall"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_JavaStaticCall"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 9
%"1" = load %"org::kermeta::language::behavior_JavaStaticCall"** %"0"
ret %"org::kermeta::language::behavior_JavaStaticCall"* %"1"
}
define internal %"org::kermeta::language::behavior_LambdaExpression"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_LambdaExpression"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 10
%"1" = load %"org::kermeta::language::behavior_LambdaExpression"** %"0"
ret %"org::kermeta::language::behavior_LambdaExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Loop"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_Loop"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 11
%"1" = load %"org::kermeta::language::behavior_Loop"** %"0"
ret %"org::kermeta::language::behavior_Loop"* %"1"
}
define internal %"org::kermeta::language::behavior_SelfExpression"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_SelfExpression"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 12
%"1" = load %"org::kermeta::language::behavior_SelfExpression"** %"0"
ret %"org::kermeta::language::behavior_SelfExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_VariableDecl"* @"cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_VariableDecl"(%"org::kermeta::language::behavior_Expression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Expression"* %"self",i32 0,i32 13
%"1" = load %"org::kermeta::language::behavior_VariableDecl"** %"0"
ret %"org::kermeta::language::behavior_VariableDecl"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_CallExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_CallExpression %"org::kermeta::language::behavior_CallExpression"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_CallExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_CallExpression"* %"v0")
ret %"org::kermeta::language::behavior_CallExpression"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_CallExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_CallExpression %"org::kermeta::language::behavior_CallExpression"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_CallExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_CallExpression"* %"v0")
ret %"org::kermeta::language::behavior_CallExpression"* %"v0"}
define internal %"org::kermeta::language::behavior_CallVariable"* @"cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallVariable"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_CallVariable"** %"0"
ret %"org::kermeta::language::behavior_CallVariable"* %"1"
}
define internal %"org::kermeta::language::behavior_CallFeature"* @"cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallFeature"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::behavior_CallFeature"** %"0"
ret %"org::kermeta::language::behavior_CallFeature"* %"1"
}
define internal %"org::kermeta::language::behavior_CallValue"* @"cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallValue"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::behavior_CallValue"** %"0"
ret %"org::kermeta::language::behavior_CallValue"* %"1"
}
define internal %"org::kermeta::language::behavior_UnresolvedCall"* @"cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_UnresolvedCall"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::behavior_UnresolvedCall"** %"0"
ret %"org::kermeta::language::behavior_UnresolvedCall"* %"1"
}
define internal %"org::kermeta::language::behavior_CallEnumLiteral"* @"cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallEnumLiteral"(%"org::kermeta::language::behavior_CallExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallExpression"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::behavior_CallEnumLiteral"** %"0"
ret %"org::kermeta::language::behavior_CallEnumLiteral"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_Block_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_Block"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Block"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Block_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Block"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Block %"org::kermeta::language::behavior_Block"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Block"*)
%"v0" = call cast_org::kermeta::language::behavior_Block_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Block"* %"v0")
ret %"org::kermeta::language::behavior_Block"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_Block_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_Block"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Block %"org::kermeta::language::behavior_Block"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_Block"*)
%"v0" = call cast_org::kermeta::language::behavior_Block_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_Block"* %"v0")
ret %"org::kermeta::language::behavior_Block"* %"v0"}
define internal %"org::kermeta::language::behavior_CallExpression"* @"cast_org::kermeta::language::behavior_CallVariable_org::kermeta::language::behavior_CallExpression"(%"org::kermeta::language::behavior_CallVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallVariable"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallExpression"** %"0"
ret %"org::kermeta::language::behavior_CallExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_CallVariable_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_CallVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_CallVariable %"org::kermeta::language::behavior_CallVariable"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_CallVariable"*)
%"v0" = call cast_org::kermeta::language::behavior_CallVariable_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_CallVariable"* %"v0")
ret %"org::kermeta::language::behavior_CallVariable"* %"v0"}
define internal %"org::kermeta::language::behavior_CallResult"* @"cast_org::kermeta::language::behavior_CallVariable_org::kermeta::language::behavior_CallResult"(%"org::kermeta::language::behavior_CallVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallVariable"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_CallResult"** %"0"
ret %"org::kermeta::language::behavior_CallResult"* %"1"
}
define internal %"org::kermeta::language::behavior_CallExpression"* @"cast_org::kermeta::language::behavior_CallFeature_org::kermeta::language::behavior_CallExpression"(%"org::kermeta::language::behavior_CallFeature"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallFeature"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallExpression"** %"0"
ret %"org::kermeta::language::behavior_CallExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_CallFeature_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_CallFeature"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_CallFeature %"org::kermeta::language::behavior_CallFeature"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_CallFeature"*)
%"v0" = call cast_org::kermeta::language::behavior_CallFeature_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_CallFeature"* %"v0")
ret %"org::kermeta::language::behavior_CallFeature"* %"v0"}
define internal %"org::kermeta::language::behavior_CallOperation"* @"cast_org::kermeta::language::behavior_CallFeature_org::kermeta::language::behavior_CallOperation"(%"org::kermeta::language::behavior_CallFeature"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallFeature"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_CallOperation"** %"0"
ret %"org::kermeta::language::behavior_CallOperation"* %"1"
}
define internal %"org::kermeta::language::behavior_CallProperty"* @"cast_org::kermeta::language::behavior_CallFeature_org::kermeta::language::behavior_CallProperty"(%"org::kermeta::language::behavior_CallFeature"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallFeature"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::behavior_CallProperty"** %"0"
ret %"org::kermeta::language::behavior_CallProperty"* %"1"
}
define internal %"org::kermeta::language::behavior_CallOperation"* @"cast_org::kermeta::language::behavior_CallSuperOperation_org::kermeta::language::behavior_CallOperation"(%"org::kermeta::language::behavior_CallSuperOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallSuperOperation"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallOperation"** %"0"
ret %"org::kermeta::language::behavior_CallOperation"* %"1"
}
define internal %"org::kermeta::language::behavior_CallFeature"* cast_org::kermeta::language::behavior_CallSuperOperation_org::kermeta::language::behavior_CallFeature(%"org::kermeta::language::behavior_CallSuperOperation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_CallFeature_org::kermeta::language::behavior_CallSuperOperation %"org::kermeta::language::behavior_CallSuperOperation"*(%"org::kermeta::language::behavior_CallFeature"* %"org::kermeta::language::behavior_CallSuperOperation"*)
%"v0" = call cast_org::kermeta::language::behavior_CallSuperOperation_org::kermeta::language::behavior_CallFeature %"org::kermeta::language::behavior_CallFeature"*(%"org::kermeta::language::behavior_CallSuperOperation"* %"v0")
ret %"org::kermeta::language::behavior_CallSuperOperation"* %"v0"}
define internal %"org::kermeta::language::behavior_CallVariable"* @"cast_org::kermeta::language::behavior_CallResult_org::kermeta::language::behavior_CallVariable"(%"org::kermeta::language::behavior_CallResult"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallResult"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallVariable"** %"0"
ret %"org::kermeta::language::behavior_CallVariable"* %"1"
}
define internal %"org::kermeta::language::behavior_CallExpression"* cast_org::kermeta::language::behavior_CallResult_org::kermeta::language::behavior_CallExpression(%"org::kermeta::language::behavior_CallResult"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallResult %"org::kermeta::language::behavior_CallResult"*(%"org::kermeta::language::behavior_CallExpression"* %"org::kermeta::language::behavior_CallResult"*)
%"v0" = call cast_org::kermeta::language::behavior_CallResult_org::kermeta::language::behavior_CallExpression %"org::kermeta::language::behavior_CallExpression"*(%"org::kermeta::language::behavior_CallResult"* %"v0")
ret %"org::kermeta::language::behavior_CallResult"* %"v0"}
define internal %"org::kermeta::language::behavior_CallExpression"* @"cast_org::kermeta::language::behavior_CallValue_org::kermeta::language::behavior_CallExpression"(%"org::kermeta::language::behavior_CallValue"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallValue"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallExpression"** %"0"
ret %"org::kermeta::language::behavior_CallExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_CallValue_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_CallValue"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_CallValue %"org::kermeta::language::behavior_CallValue"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_CallValue"*)
%"v0" = call cast_org::kermeta::language::behavior_CallValue_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_CallValue"* %"v0")
ret %"org::kermeta::language::behavior_CallValue"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_Conditional_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_Conditional"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Conditional"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Conditional_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Conditional"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Conditional %"org::kermeta::language::behavior_Conditional"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Conditional"*)
%"v0" = call cast_org::kermeta::language::behavior_Conditional_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Conditional"* %"v0")
ret %"org::kermeta::language::behavior_Conditional"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_Conditional_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_Conditional"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Conditional %"org::kermeta::language::behavior_Conditional"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_Conditional"*)
%"v0" = call cast_org::kermeta::language::behavior_Conditional_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_Conditional"* %"v0")
ret %"org::kermeta::language::behavior_Conditional"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_Raise_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_Raise"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Raise"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Raise_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Raise"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Raise %"org::kermeta::language::behavior_Raise"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Raise"*)
%"v0" = call cast_org::kermeta::language::behavior_Raise_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Raise"* %"v0")
ret %"org::kermeta::language::behavior_Raise"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_Raise_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_Raise"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Raise %"org::kermeta::language::behavior_Raise"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_Raise"*)
%"v0" = call cast_org::kermeta::language::behavior_Raise_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_Raise"* %"v0")
ret %"org::kermeta::language::behavior_Raise"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::behavior_Rescue_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::behavior_Rescue"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Rescue"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::behavior_Rescue_kermeta::standard_Object(%"org::kermeta::language::behavior_Rescue"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::behavior_Rescue %"org::kermeta::language::behavior_Rescue"*(%"kermeta::standard_Object"* %"org::kermeta::language::behavior_Rescue"*)
%"v0" = call cast_org::kermeta::language::behavior_Rescue_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::behavior_Rescue"* %"v0")
ret %"org::kermeta::language::behavior_Rescue"* %"v0"}
define internal %"org::kermeta::language::structure_MultiplicityElement"* @"cast_org::kermeta::language::behavior_TypeReference_org::kermeta::language::structure_MultiplicityElement"(%"org::kermeta::language::behavior_TypeReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_TypeReference"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_MultiplicityElement"** %"0"
ret %"org::kermeta::language::structure_MultiplicityElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypedElement"* cast_org::kermeta::language::behavior_TypeReference_org::kermeta::language::structure_TypedElement(%"org::kermeta::language::behavior_TypeReference"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::behavior_TypeReference %"org::kermeta::language::behavior_TypeReference"*(%"org::kermeta::language::structure_TypedElement"* %"org::kermeta::language::behavior_TypeReference"*)
%"v0" = call cast_org::kermeta::language::behavior_TypeReference_org::kermeta::language::structure_TypedElement %"org::kermeta::language::structure_TypedElement"*(%"org::kermeta::language::behavior_TypeReference"* %"v0")
ret %"org::kermeta::language::behavior_TypeReference"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_Literal_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_Literal"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Literal"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Literal_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Literal"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Literal %"org::kermeta::language::behavior_Literal"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Literal"*)
%"v0" = call cast_org::kermeta::language::behavior_Literal_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Literal"* %"v0")
ret %"org::kermeta::language::behavior_Literal"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_Literal_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_Literal"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Literal %"org::kermeta::language::behavior_Literal"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_Literal"*)
%"v0" = call cast_org::kermeta::language::behavior_Literal_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_Literal"* %"v0")
ret %"org::kermeta::language::behavior_Literal"* %"v0"}
define internal %"org::kermeta::language::behavior_IntegerLiteral"* @"cast_org::kermeta::language::behavior_Literal_org::kermeta::language::behavior_IntegerLiteral"(%"org::kermeta::language::behavior_Literal"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Literal"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_IntegerLiteral"** %"0"
ret %"org::kermeta::language::behavior_IntegerLiteral"* %"1"
}
define internal %"org::kermeta::language::behavior_StringLiteral"* @"cast_org::kermeta::language::behavior_Literal_org::kermeta::language::behavior_StringLiteral"(%"org::kermeta::language::behavior_Literal"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Literal"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::behavior_StringLiteral"** %"0"
ret %"org::kermeta::language::behavior_StringLiteral"* %"1"
}
define internal %"org::kermeta::language::behavior_BooleanLiteral"* @"cast_org::kermeta::language::behavior_Literal_org::kermeta::language::behavior_BooleanLiteral"(%"org::kermeta::language::behavior_Literal"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Literal"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::behavior_BooleanLiteral"** %"0"
ret %"org::kermeta::language::behavior_BooleanLiteral"* %"1"
}
define internal %"org::kermeta::language::behavior_CallTypeLiteral"* @"cast_org::kermeta::language::behavior_Literal_org::kermeta::language::behavior_CallTypeLiteral"(%"org::kermeta::language::behavior_Literal"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Literal"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::behavior_CallTypeLiteral"** %"0"
ret %"org::kermeta::language::behavior_CallTypeLiteral"* %"1"
}
define internal %"org::kermeta::language::behavior_VoidLiteral"* @"cast_org::kermeta::language::behavior_Literal_org::kermeta::language::behavior_VoidLiteral"(%"org::kermeta::language::behavior_Literal"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Literal"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::behavior_VoidLiteral"** %"0"
ret %"org::kermeta::language::behavior_VoidLiteral"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_EmptyExpression_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_EmptyExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_EmptyExpression"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_EmptyExpression_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_EmptyExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_EmptyExpression %"org::kermeta::language::behavior_EmptyExpression"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_EmptyExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_EmptyExpression_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_EmptyExpression"* %"v0")
ret %"org::kermeta::language::behavior_EmptyExpression"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_EmptyExpression_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_EmptyExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_EmptyExpression %"org::kermeta::language::behavior_EmptyExpression"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_EmptyExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_EmptyExpression_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_EmptyExpression"* %"v0")
ret %"org::kermeta::language::behavior_EmptyExpression"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_JavaStaticCall_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_JavaStaticCall"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_JavaStaticCall"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_JavaStaticCall_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_JavaStaticCall"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_JavaStaticCall %"org::kermeta::language::behavior_JavaStaticCall"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_JavaStaticCall"*)
%"v0" = call cast_org::kermeta::language::behavior_JavaStaticCall_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_JavaStaticCall"* %"v0")
ret %"org::kermeta::language::behavior_JavaStaticCall"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_JavaStaticCall_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_JavaStaticCall"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_JavaStaticCall %"org::kermeta::language::behavior_JavaStaticCall"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_JavaStaticCall"*)
%"v0" = call cast_org::kermeta::language::behavior_JavaStaticCall_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_JavaStaticCall"* %"v0")
ret %"org::kermeta::language::behavior_JavaStaticCall"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_LambdaExpression_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_LambdaExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_LambdaExpression"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_LambdaExpression_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_LambdaExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_LambdaExpression %"org::kermeta::language::behavior_LambdaExpression"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_LambdaExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_LambdaExpression_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_LambdaExpression"* %"v0")
ret %"org::kermeta::language::behavior_LambdaExpression"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_LambdaExpression_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_LambdaExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_LambdaExpression %"org::kermeta::language::behavior_LambdaExpression"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_LambdaExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_LambdaExpression_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_LambdaExpression"* %"v0")
ret %"org::kermeta::language::behavior_LambdaExpression"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::behavior_LambdaParameter_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::behavior_LambdaParameter"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_LambdaParameter"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::behavior_LambdaParameter_kermeta::standard_Object(%"org::kermeta::language::behavior_LambdaParameter"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::behavior_LambdaParameter %"org::kermeta::language::behavior_LambdaParameter"*(%"kermeta::standard_Object"* %"org::kermeta::language::behavior_LambdaParameter"*)
%"v0" = call cast_org::kermeta::language::behavior_LambdaParameter_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::behavior_LambdaParameter"* %"v0")
ret %"org::kermeta::language::behavior_LambdaParameter"* %"v0"}
define internal %"org::kermeta::language::behavior_Literal"* @"cast_org::kermeta::language::behavior_IntegerLiteral_org::kermeta::language::behavior_Literal"(%"org::kermeta::language::behavior_IntegerLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_IntegerLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Literal"** %"0"
ret %"org::kermeta::language::behavior_Literal"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_IntegerLiteral_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_IntegerLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_IntegerLiteral %"org::kermeta::language::behavior_IntegerLiteral"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_IntegerLiteral"*)
%"v0" = call cast_org::kermeta::language::behavior_IntegerLiteral_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_IntegerLiteral"* %"v0")
ret %"org::kermeta::language::behavior_IntegerLiteral"* %"v0"}
define internal %"org::kermeta::language::behavior_Literal"* @"cast_org::kermeta::language::behavior_StringLiteral_org::kermeta::language::behavior_Literal"(%"org::kermeta::language::behavior_StringLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_StringLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Literal"** %"0"
ret %"org::kermeta::language::behavior_Literal"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_StringLiteral_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_StringLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_StringLiteral %"org::kermeta::language::behavior_StringLiteral"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_StringLiteral"*)
%"v0" = call cast_org::kermeta::language::behavior_StringLiteral_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_StringLiteral"* %"v0")
ret %"org::kermeta::language::behavior_StringLiteral"* %"v0"}
define internal %"org::kermeta::language::behavior_Literal"* @"cast_org::kermeta::language::behavior_BooleanLiteral_org::kermeta::language::behavior_Literal"(%"org::kermeta::language::behavior_BooleanLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_BooleanLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Literal"** %"0"
ret %"org::kermeta::language::behavior_Literal"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_BooleanLiteral_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_BooleanLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_BooleanLiteral %"org::kermeta::language::behavior_BooleanLiteral"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_BooleanLiteral"*)
%"v0" = call cast_org::kermeta::language::behavior_BooleanLiteral_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_BooleanLiteral"* %"v0")
ret %"org::kermeta::language::behavior_BooleanLiteral"* %"v0"}
define internal %"org::kermeta::language::behavior_Literal"* @"cast_org::kermeta::language::behavior_CallTypeLiteral_org::kermeta::language::behavior_Literal"(%"org::kermeta::language::behavior_CallTypeLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallTypeLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Literal"** %"0"
ret %"org::kermeta::language::behavior_Literal"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_CallTypeLiteral_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_CallTypeLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_CallTypeLiteral %"org::kermeta::language::behavior_CallTypeLiteral"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_CallTypeLiteral"*)
%"v0" = call cast_org::kermeta::language::behavior_CallTypeLiteral_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_CallTypeLiteral"* %"v0")
ret %"org::kermeta::language::behavior_CallTypeLiteral"* %"v0"}
define internal %"org::kermeta::language::behavior_Literal"* @"cast_org::kermeta::language::behavior_VoidLiteral_org::kermeta::language::behavior_Literal"(%"org::kermeta::language::behavior_VoidLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_VoidLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Literal"** %"0"
ret %"org::kermeta::language::behavior_Literal"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_VoidLiteral_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_VoidLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_VoidLiteral %"org::kermeta::language::behavior_VoidLiteral"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_VoidLiteral"*)
%"v0" = call cast_org::kermeta::language::behavior_VoidLiteral_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_VoidLiteral"* %"v0")
ret %"org::kermeta::language::behavior_VoidLiteral"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_Loop_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_Loop"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_Loop"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_Loop_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_Loop"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Loop %"org::kermeta::language::behavior_Loop"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_Loop"*)
%"v0" = call cast_org::kermeta::language::behavior_Loop_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_Loop"* %"v0")
ret %"org::kermeta::language::behavior_Loop"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_Loop_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_Loop"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Loop %"org::kermeta::language::behavior_Loop"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_Loop"*)
%"v0" = call cast_org::kermeta::language::behavior_Loop_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_Loop"* %"v0")
ret %"org::kermeta::language::behavior_Loop"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_SelfExpression_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_SelfExpression"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_SelfExpression"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_SelfExpression_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_SelfExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_SelfExpression %"org::kermeta::language::behavior_SelfExpression"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_SelfExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_SelfExpression_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_SelfExpression"* %"v0")
ret %"org::kermeta::language::behavior_SelfExpression"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_SelfExpression_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_SelfExpression"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_SelfExpression %"org::kermeta::language::behavior_SelfExpression"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_SelfExpression"*)
%"v0" = call cast_org::kermeta::language::behavior_SelfExpression_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_SelfExpression"* %"v0")
ret %"org::kermeta::language::behavior_SelfExpression"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::behavior_VariableDecl_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::behavior_VariableDecl"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_VariableDecl"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_VariableDecl_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_VariableDecl"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_VariableDecl %"org::kermeta::language::behavior_VariableDecl"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_VariableDecl"*)
%"v0" = call cast_org::kermeta::language::behavior_VariableDecl_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_VariableDecl"* %"v0")
ret %"org::kermeta::language::behavior_VariableDecl"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::behavior_VariableDecl_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::behavior_VariableDecl"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_VariableDecl %"org::kermeta::language::behavior_VariableDecl"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::behavior_VariableDecl"*)
%"v0" = call cast_org::kermeta::language::behavior_VariableDecl_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::behavior_VariableDecl"* %"v0")
ret %"org::kermeta::language::behavior_VariableDecl"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_UnresolvedCall"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_UnresolvedCall %"org::kermeta::language::behavior_UnresolvedCall"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_UnresolvedCall"*)
%"v0" = call cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_UnresolvedCall"* %"v0")
ret %"org::kermeta::language::behavior_UnresolvedCall"* %"v0"}
define internal %"org::kermeta::language::behavior_CallExpression"* @"cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::behavior_CallExpression"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_CallExpression"** %"0"
ret %"org::kermeta::language::behavior_CallExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_UnresolvedCall"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_UnresolvedCall %"org::kermeta::language::behavior_UnresolvedCall"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_UnresolvedCall"*)
%"v0" = call cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_UnresolvedCall"* %"v0")
ret %"org::kermeta::language::behavior_UnresolvedCall"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::behavior_UnresolvedCall"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_UnresolvedCall"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::behavior_UnresolvedCall"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_UnresolvedCall %"org::kermeta::language::behavior_UnresolvedCall"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::behavior_UnresolvedCall"*)
%"v0" = call cast_org::kermeta::language::behavior_UnresolvedCall_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::behavior_UnresolvedCall"* %"v0")
ret %"org::kermeta::language::behavior_UnresolvedCall"* %"v0"}
define internal %"org::kermeta::language::behavior_CallFeature"* @"cast_org::kermeta::language::behavior_CallOperation_org::kermeta::language::behavior_CallFeature"(%"org::kermeta::language::behavior_CallOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallOperation"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallFeature"** %"0"
ret %"org::kermeta::language::behavior_CallFeature"* %"1"
}
define internal %"org::kermeta::language::behavior_CallExpression"* cast_org::kermeta::language::behavior_CallOperation_org::kermeta::language::behavior_CallExpression(%"org::kermeta::language::behavior_CallOperation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallOperation %"org::kermeta::language::behavior_CallOperation"*(%"org::kermeta::language::behavior_CallExpression"* %"org::kermeta::language::behavior_CallOperation"*)
%"v0" = call cast_org::kermeta::language::behavior_CallOperation_org::kermeta::language::behavior_CallExpression %"org::kermeta::language::behavior_CallExpression"*(%"org::kermeta::language::behavior_CallOperation"* %"v0")
ret %"org::kermeta::language::behavior_CallOperation"* %"v0"}
define internal %"org::kermeta::language::behavior_CallSuperOperation"* @"cast_org::kermeta::language::behavior_CallOperation_org::kermeta::language::behavior_CallSuperOperation"(%"org::kermeta::language::behavior_CallOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallOperation"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_CallSuperOperation"** %"0"
ret %"org::kermeta::language::behavior_CallSuperOperation"* %"1"
}
define internal %"org::kermeta::language::behavior_CallFeature"* @"cast_org::kermeta::language::behavior_CallProperty_org::kermeta::language::behavior_CallFeature"(%"org::kermeta::language::behavior_CallProperty"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallProperty"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallFeature"** %"0"
ret %"org::kermeta::language::behavior_CallFeature"* %"1"
}
define internal %"org::kermeta::language::behavior_CallExpression"* cast_org::kermeta::language::behavior_CallProperty_org::kermeta::language::behavior_CallExpression(%"org::kermeta::language::behavior_CallProperty"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_CallExpression_org::kermeta::language::behavior_CallProperty %"org::kermeta::language::behavior_CallProperty"*(%"org::kermeta::language::behavior_CallExpression"* %"org::kermeta::language::behavior_CallProperty"*)
%"v0" = call cast_org::kermeta::language::behavior_CallProperty_org::kermeta::language::behavior_CallExpression %"org::kermeta::language::behavior_CallExpression"*(%"org::kermeta::language::behavior_CallProperty"* %"v0")
ret %"org::kermeta::language::behavior_CallProperty"* %"v0"}
define internal %"org::kermeta::language::behavior_CallExpression"* @"cast_org::kermeta::language::behavior_CallEnumLiteral_org::kermeta::language::behavior_CallExpression"(%"org::kermeta::language::behavior_CallEnumLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::behavior_CallEnumLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::behavior_CallExpression"** %"0"
ret %"org::kermeta::language::behavior_CallExpression"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* cast_org::kermeta::language::behavior_CallEnumLiteral_org::kermeta::language::behavior_Expression(%"org::kermeta::language::behavior_CallEnumLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::behavior_Expression_org::kermeta::language::behavior_CallEnumLiteral %"org::kermeta::language::behavior_CallEnumLiteral"*(%"org::kermeta::language::behavior_Expression"* %"org::kermeta::language::behavior_CallEnumLiteral"*)
%"v0" = call cast_org::kermeta::language::behavior_CallEnumLiteral_org::kermeta::language::behavior_Expression %"org::kermeta::language::behavior_Expression"*(%"org::kermeta::language::behavior_CallEnumLiteral"* %"v0")
ret %"org::kermeta::language::behavior_CallEnumLiteral"* %"v0"}
define internal %"kermeta::standard_Object"* @"cast_org::kermeta::language::structure_KermetaModelElement_kermeta::standard_Object"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::behavior_Rescue"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_Rescue"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::behavior_Rescue"** %"0"
ret %"org::kermeta::language::behavior_Rescue"* %"1"
}
define internal %"org::kermeta::language::behavior_LambdaParameter"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::behavior_LambdaParameter"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::behavior_LambdaParameter"** %"0"
ret %"org::kermeta::language::behavior_LambdaParameter"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariableBinding"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeVariableBinding"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 6
%"1" = load %"org::kermeta::language::structure_TypeVariableBinding"** %"0"
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 7
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_Tag"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Tag"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 8
%"1" = load %"org::kermeta::language::structure_Tag"** %"0"
ret %"org::kermeta::language::structure_Tag"* %"1"
}
define internal %"org::kermeta::language::structure_AbstractProperty"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_AbstractProperty"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 9
%"1" = load %"org::kermeta::language::structure_AbstractProperty"** %"0"
ret %"org::kermeta::language::structure_AbstractProperty"* %"1"
}
define internal %"org::kermeta::language::structure_Metamodel"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Metamodel"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 10
%"1" = load %"org::kermeta::language::structure_Metamodel"** %"0"
ret %"org::kermeta::language::structure_Metamodel"* %"1"
}
define internal %"org::kermeta::language::structure_Model"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Model"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 11
%"1" = load %"org::kermeta::language::structure_Model"** %"0"
ret %"org::kermeta::language::structure_Model"* %"1"
}
define internal %"org::kermeta::language::structure_AbstractOperation"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_AbstractOperation"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 12
%"1" = load %"org::kermeta::language::structure_AbstractOperation"** %"0"
ret %"org::kermeta::language::structure_AbstractOperation"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 13
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_Using"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Using"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 14
%"1" = load %"org::kermeta::language::structure_Using"** %"0"
ret %"org::kermeta::language::structure_Using"* %"1"
}
define internal %"org::kermeta::language::structure_MetamodelBinding"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_MetamodelBinding"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 15
%"1" = load %"org::kermeta::language::structure_MetamodelBinding"** %"0"
ret %"org::kermeta::language::structure_MetamodelBinding"* %"1"
}
define internal %"org::kermeta::language::structure_ClassDefinitionBinding"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_ClassDefinitionBinding"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 16
%"1" = load %"org::kermeta::language::structure_ClassDefinitionBinding"** %"0"
ret %"org::kermeta::language::structure_ClassDefinitionBinding"* %"1"
}
define internal %"org::kermeta::language::structure_EnumerationBinding"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_EnumerationBinding"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 17
%"1" = load %"org::kermeta::language::structure_EnumerationBinding"** %"0"
ret %"org::kermeta::language::structure_EnumerationBinding"* %"1"
}
define internal %"org::kermeta::language::structure_PropertyBinding"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_PropertyBinding"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 18
%"1" = load %"org::kermeta::language::structure_PropertyBinding"** %"0"
ret %"org::kermeta::language::structure_PropertyBinding"* %"1"
}
define internal %"org::kermeta::language::structure_OperationBinding"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_OperationBinding"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 19
%"1" = load %"org::kermeta::language::structure_OperationBinding"** %"0"
ret %"org::kermeta::language::structure_OperationBinding"* %"1"
}
define internal %"org::kermeta::language::structure_UseAdaptationOperator"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UseAdaptationOperator"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 20
%"1" = load %"org::kermeta::language::structure_UseAdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_UseAdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_FilteredMetamodelReference"* @"cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_FilteredMetamodelReference"(%"org::kermeta::language::structure_KermetaModelElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_KermetaModelElement"* %"self",i32 0,i32 21
%"1" = load %"org::kermeta::language::structure_FilteredMetamodelReference"** %"0"
ret %"org::kermeta::language::structure_FilteredMetamodelReference"* %"1"
}
define internal %"org::kermeta::language::structure_MultiplicityElement"* @"cast_org::kermeta::language::structure_Operation_org::kermeta::language::structure_MultiplicityElement"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_MultiplicityElement"** %"0"
ret %"org::kermeta::language::structure_MultiplicityElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypedElement"* cast_org::kermeta::language::structure_Operation_org::kermeta::language::structure_TypedElement(%"org::kermeta::language::structure_Operation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_Operation %"org::kermeta::language::structure_Operation"*(%"org::kermeta::language::structure_TypedElement"* %"org::kermeta::language::structure_Operation"*)
%"v0" = call cast_org::kermeta::language::structure_Operation_org::kermeta::language::structure_TypedElement %"org::kermeta::language::structure_TypedElement"*(%"org::kermeta::language::structure_Operation"* %"v0")
ret %"org::kermeta::language::structure_Operation"* %"v0"}
define internal %"org::kermeta::language::structure_AbstractOperation"* @"cast_org::kermeta::language::structure_Operation_org::kermeta::language::structure_AbstractOperation"(%"org::kermeta::language::structure_Operation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Operation"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_AbstractOperation"** %"0"
ret %"org::kermeta::language::structure_AbstractOperation"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_Operation_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_Operation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Operation %"org::kermeta::language::structure_Operation"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_Operation"*)
%"v0" = call cast_org::kermeta::language::structure_Operation_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_Operation"* %"v0")
ret %"org::kermeta::language::structure_Operation"* %"v0"}
define internal %"org::kermeta::language::structure_MultiplicityElement"* @"cast_org::kermeta::language::structure_Property_org::kermeta::language::structure_MultiplicityElement"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_MultiplicityElement"** %"0"
ret %"org::kermeta::language::structure_MultiplicityElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypedElement"* cast_org::kermeta::language::structure_Property_org::kermeta::language::structure_TypedElement(%"org::kermeta::language::structure_Property"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_Property %"org::kermeta::language::structure_Property"*(%"org::kermeta::language::structure_TypedElement"* %"org::kermeta::language::structure_Property"*)
%"v0" = call cast_org::kermeta::language::structure_Property_org::kermeta::language::structure_TypedElement %"org::kermeta::language::structure_TypedElement"*(%"org::kermeta::language::structure_Property"* %"v0")
ret %"org::kermeta::language::structure_Property"* %"v0"}
define internal %"org::kermeta::language::structure_AbstractProperty"* @"cast_org::kermeta::language::structure_Property_org::kermeta::language::structure_AbstractProperty"(%"org::kermeta::language::structure_Property"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Property"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_AbstractProperty"** %"0"
ret %"org::kermeta::language::structure_AbstractProperty"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_Property_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_Property"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Property %"org::kermeta::language::structure_Property"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_Property"*)
%"v0" = call cast_org::kermeta::language::structure_Property_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_Property"* %"v0")
ret %"org::kermeta::language::structure_Property"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_Type_kermeta::standard_Object(%"org::kermeta::language::structure_Type"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_Type"*)
%"v0" = call cast_org::kermeta::language::structure_Type_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_Type"* %"v0")
ret %"org::kermeta::language::structure_Type"* %"v0"}
define internal %"org::kermeta::language::structure_DataType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_DataType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_DataType"** %"0"
ret %"org::kermeta::language::structure_DataType"* %"1"
}
define internal %"org::kermeta::language::structure_ParameterizedType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_ParameterizedType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_ParameterizedType"** %"0"
ret %"org::kermeta::language::structure_ParameterizedType"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_TypeVariable"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_TypeVariable"** %"0"
ret %"org::kermeta::language::structure_TypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_UnresolvedType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_UnresolvedType"** %"0"
ret %"org::kermeta::language::structure_UnresolvedType"* %"1"
}
define internal %"org::kermeta::language::structure_ProductType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_ProductType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::structure_ProductType"** %"0"
ret %"org::kermeta::language::structure_ProductType"* %"1"
}
define internal %"org::kermeta::language::structure_FunctionType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_FunctionType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 6
%"1" = load %"org::kermeta::language::structure_FunctionType"** %"0"
ret %"org::kermeta::language::structure_FunctionType"* %"1"
}
define internal %"org::kermeta::language::structure_VoidType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_VoidType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 7
%"1" = load %"org::kermeta::language::structure_VoidType"** %"0"
ret %"org::kermeta::language::structure_VoidType"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedInferredType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_UnresolvedInferredType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 8
%"1" = load %"org::kermeta::language::structure_UnresolvedInferredType"** %"0"
ret %"org::kermeta::language::structure_UnresolvedInferredType"* %"1"
}
define internal %"org::kermeta::language::structure_ModelType"* @"cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_ModelType"(%"org::kermeta::language::structure_Type"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Type"* %"self",i32 0,i32 9
%"1" = load %"org::kermeta::language::structure_ModelType"** %"0"
ret %"org::kermeta::language::structure_ModelType"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_TypeContainer_kermeta::standard_Object(%"org::kermeta::language::structure_TypeContainer"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_TypeContainer"*)
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_TypeContainer"* %"v0")
ret %"org::kermeta::language::structure_TypeContainer"* %"v0"}
define internal %"org::kermeta::language::behavior_Expression"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_Expression"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_Expression"** %"0"
ret %"org::kermeta::language::behavior_Expression"* %"1"
}
define internal %"org::kermeta::language::behavior_UnresolvedCall"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::behavior_UnresolvedCall"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::behavior_UnresolvedCall"** %"0"
ret %"org::kermeta::language::behavior_UnresolvedCall"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariableBinding"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_TypeVariableBinding"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_TypeVariableBinding"** %"0"
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"1"
}
define internal %"org::kermeta::language::structure_TypeDefinition"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_TypeDefinition"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_TypeDefinition"** %"0"
ret %"org::kermeta::language::structure_TypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_TypedElement"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_TypedElement"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::structure_TypedElement"** %"0"
ret %"org::kermeta::language::structure_TypedElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_TypeVariable"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 6
%"1" = load %"org::kermeta::language::structure_TypeVariable"** %"0"
ret %"org::kermeta::language::structure_TypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedType"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_UnresolvedType"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 7
%"1" = load %"org::kermeta::language::structure_UnresolvedType"** %"0"
ret %"org::kermeta::language::structure_UnresolvedType"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedOperation"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_UnresolvedOperation"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 8
%"1" = load %"org::kermeta::language::structure_UnresolvedOperation"** %"0"
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"1"
}
define internal %"org::kermeta::language::structure_ProductType"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_ProductType"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 9
%"1" = load %"org::kermeta::language::structure_ProductType"** %"0"
ret %"org::kermeta::language::structure_ProductType"* %"1"
}
define internal %"org::kermeta::language::structure_FunctionType"* @"cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_FunctionType"(%"org::kermeta::language::structure_TypeContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeContainer"* %"self",i32 0,i32 10
%"1" = load %"org::kermeta::language::structure_FunctionType"** %"0"
ret %"org::kermeta::language::structure_FunctionType"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_EnumerationLiteral_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_EnumerationLiteral"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_EnumerationLiteral"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_EnumerationLiteral_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_EnumerationLiteral"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_EnumerationLiteral %"org::kermeta::language::structure_EnumerationLiteral"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_EnumerationLiteral"*)
%"v0" = call cast_org::kermeta::language::structure_EnumerationLiteral_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_EnumerationLiteral"* %"v0")
ret %"org::kermeta::language::structure_EnumerationLiteral"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_TypeVariableBinding_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_TypeVariableBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariableBinding"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypeVariableBinding_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypeVariableBinding"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeVariableBinding %"org::kermeta::language::structure_TypeVariableBinding"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypeVariableBinding"*)
%"v0" = call cast_org::kermeta::language::structure_TypeVariableBinding_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypeVariableBinding"* %"v0")
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_TypeVariableBinding_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_TypeVariableBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariableBinding"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_TypeVariableBinding_kermeta::standard_Object(%"org::kermeta::language::structure_TypeVariableBinding"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_TypeVariableBinding %"org::kermeta::language::structure_TypeVariableBinding"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_TypeVariableBinding"*)
%"v0" = call cast_org::kermeta::language::structure_TypeVariableBinding_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_TypeVariableBinding"* %"v0")
ret %"org::kermeta::language::structure_TypeVariableBinding"* %"v0"}
define internal %"org::kermeta::language::structure_TypedElement"* @"cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_TypedElement"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypedElement"** %"0"
ret %"org::kermeta::language::structure_TypedElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_MultiplicityElement"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_MultiplicityElement %"org::kermeta::language::structure_MultiplicityElement"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_MultiplicityElement"*)
%"v0" = call cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_MultiplicityElement"* %"v0")
ret %"org::kermeta::language::structure_MultiplicityElement"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_MultiplicityElement"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_MultiplicityElement %"org::kermeta::language::structure_MultiplicityElement"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_MultiplicityElement"*)
%"v0" = call cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_MultiplicityElement"* %"v0")
ret %"org::kermeta::language::structure_MultiplicityElement"* %"v0"}
define internal %"org::kermeta::language::behavior_TypeReference"* @"cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::behavior_TypeReference"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_TypeReference"** %"0"
ret %"org::kermeta::language::behavior_TypeReference"* %"1"
}
define internal %"org::kermeta::language::structure_Operation"* @"cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_Operation"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_Operation"** %"0"
ret %"org::kermeta::language::structure_Operation"* %"1"
}
define internal %"org::kermeta::language::structure_Property"* @"cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_Property"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_Property"** %"0"
ret %"org::kermeta::language::structure_Property"* %"1"
}
define internal %"org::kermeta::language::structure_Parameter"* @"cast_org::kermeta::language::structure_MultiplicityElement_org::kermeta::language::structure_Parameter"(%"org::kermeta::language::structure_MultiplicityElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_MultiplicityElement"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_Parameter"** %"0"
ret %"org::kermeta::language::structure_Parameter"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_TypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypeDefinition"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeDefinition %"org::kermeta::language::structure_TypeDefinition"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypeDefinition"*)
%"v0" = call cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypeDefinition"* %"v0")
ret %"org::kermeta::language::structure_TypeDefinition"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_TypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypeDefinition"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeDefinition %"org::kermeta::language::structure_TypeDefinition"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypeDefinition"*)
%"v0" = call cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypeDefinition"* %"v0")
ret %"org::kermeta::language::structure_TypeDefinition"* %"v0"}
define internal %"org::kermeta::language::structure_Metamodel"* @"cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_Metamodel"(%"org::kermeta::language::structure_TypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_Metamodel"** %"0"
ret %"org::kermeta::language::structure_Metamodel"* %"1"
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_ModelElementTypeDefinition"(%"org::kermeta::language::structure_TypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeDefinition"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_ModelElementTypeDefinition"** %"0"
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_ParameterizedType"* @"cast_org::kermeta::language::structure_Class_org::kermeta::language::structure_ParameterizedType"(%"org::kermeta::language::structure_Class"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Class"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_ParameterizedType"** %"0"
ret %"org::kermeta::language::structure_ParameterizedType"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* cast_org::kermeta::language::structure_Class_org::kermeta::language::structure_Type(%"org::kermeta::language::structure_Class"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_Class %"org::kermeta::language::structure_Class"*(%"org::kermeta::language::structure_Type"* %"org::kermeta::language::structure_Class"*)
%"v0" = call cast_org::kermeta::language::structure_Class_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"org::kermeta::language::structure_Class"* %"v0")
ret %"org::kermeta::language::structure_Class"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_DataType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_DataType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_DataType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_DataType %"org::kermeta::language::structure_DataType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_DataType"*)
%"v0" = call cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_DataType"* %"v0")
ret %"org::kermeta::language::structure_DataType"* %"v0"}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_ModelElementTypeDefinition"(%"org::kermeta::language::structure_DataType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_DataType"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_ModelElementTypeDefinition"** %"0"
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_TypeDefinition"* cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_TypeDefinition(%"org::kermeta::language::structure_DataType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_DataType %"org::kermeta::language::structure_DataType"*(%"org::kermeta::language::structure_TypeDefinition"* %"org::kermeta::language::structure_DataType"*)
%"v0" = call cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_TypeDefinition %"org::kermeta::language::structure_TypeDefinition"*(%"org::kermeta::language::structure_DataType"* %"v0")
ret %"org::kermeta::language::structure_DataType"* %"v0"}
define internal %"org::kermeta::language::structure_Enumeration"* @"cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_Enumeration"(%"org::kermeta::language::structure_DataType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_DataType"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_Enumeration"** %"0"
ret %"org::kermeta::language::structure_Enumeration"* %"1"
}
define internal %"org::kermeta::language::structure_PrimitiveType"* @"cast_org::kermeta::language::structure_DataType_org::kermeta::language::structure_PrimitiveType"(%"org::kermeta::language::structure_DataType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_DataType"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_PrimitiveType"** %"0"
ret %"org::kermeta::language::structure_PrimitiveType"* %"1"
}
define internal %"org::kermeta::language::structure_DataType"* @"cast_org::kermeta::language::structure_Enumeration_org::kermeta::language::structure_DataType"(%"org::kermeta::language::structure_Enumeration"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Enumeration"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_DataType"** %"0"
ret %"org::kermeta::language::structure_DataType"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* cast_org::kermeta::language::structure_Enumeration_org::kermeta::language::structure_Type(%"org::kermeta::language::structure_Enumeration"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_Enumeration %"org::kermeta::language::structure_Enumeration"*(%"org::kermeta::language::structure_Type"* %"org::kermeta::language::structure_Enumeration"*)
%"v0" = call cast_org::kermeta::language::structure_Enumeration_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"org::kermeta::language::structure_Enumeration"* %"v0")
ret %"org::kermeta::language::structure_Enumeration"* %"v0"}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* cast_org::kermeta::language::structure_Enumeration_org::kermeta::language::structure_ModelElementTypeDefinition(%"org::kermeta::language::structure_Enumeration"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_Enumeration %"org::kermeta::language::structure_Enumeration"*(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"org::kermeta::language::structure_Enumeration"*)
%"v0" = call cast_org::kermeta::language::structure_Enumeration_org::kermeta::language::structure_ModelElementTypeDefinition %"org::kermeta::language::structure_ModelElementTypeDefinition"*(%"org::kermeta::language::structure_Enumeration"* %"v0")
ret %"org::kermeta::language::structure_Enumeration"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_NamedElement_kermeta::standard_Object(%"org::kermeta::language::structure_NamedElement"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_NamedElement"*)
%"v0" = call cast_org::kermeta::language::structure_NamedElement_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_NamedElement"* %"v0")
ret %"org::kermeta::language::structure_NamedElement"* %"v0"}
define internal %"org::kermeta::language::structure_EnumerationLiteral"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_EnumerationLiteral"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_EnumerationLiteral"** %"0"
ret %"org::kermeta::language::structure_EnumerationLiteral"* %"1"
}
define internal %"org::kermeta::language::structure_TypeDefinition"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_TypeDefinition"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_TypeDefinition"** %"0"
ret %"org::kermeta::language::structure_TypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_Package"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_Package"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_Package"** %"0"
ret %"org::kermeta::language::structure_Package"* %"1"
}
define internal %"org::kermeta::language::structure_TypedElement"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_TypedElement"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_TypedElement"** %"0"
ret %"org::kermeta::language::structure_TypedElement"* %"1"
}
define internal %"org::kermeta::language::structure_Constraint"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_Constraint"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::structure_Constraint"** %"0"
ret %"org::kermeta::language::structure_Constraint"* %"1"
}
define internal %"org::kermeta::language::structure_Metamodel"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_Metamodel"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 6
%"1" = load %"org::kermeta::language::structure_Metamodel"** %"0"
ret %"org::kermeta::language::structure_Metamodel"* %"1"
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_ModelElementTypeDefinitionContainer"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 7
%"1" = load %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"** %"0"
ret %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_TypeVariable"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 8
%"1" = load %"org::kermeta::language::structure_TypeVariable"** %"0"
ret %"org::kermeta::language::structure_TypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_AdaptationOperator"(%"org::kermeta::language::structure_NamedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_NamedElement"* %"self",i32 0,i32 9
%"1" = load %"org::kermeta::language::structure_AdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_AdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_Package_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_Package"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Package"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_Package_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_Package"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Package %"org::kermeta::language::structure_Package"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_Package"*)
%"v0" = call cast_org::kermeta::language::structure_Package_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_Package"* %"v0")
ret %"org::kermeta::language::structure_Package"* %"v0"}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* @"cast_org::kermeta::language::structure_Package_org::kermeta::language::structure_ModelElementTypeDefinitionContainer"(%"org::kermeta::language::structure_Package"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Package"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"** %"0"
ret %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_Package_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_Package"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_Package %"org::kermeta::language::structure_Package"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_Package"*)
%"v0" = call cast_org::kermeta::language::structure_Package_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_Package"* %"v0")
ret %"org::kermeta::language::structure_Package"* %"v0"}
define internal %"org::kermeta::language::structure_MultiplicityElement"* @"cast_org::kermeta::language::structure_Parameter_org::kermeta::language::structure_MultiplicityElement"(%"org::kermeta::language::structure_Parameter"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Parameter"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_MultiplicityElement"** %"0"
ret %"org::kermeta::language::structure_MultiplicityElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypedElement"* cast_org::kermeta::language::structure_Parameter_org::kermeta::language::structure_TypedElement(%"org::kermeta::language::structure_Parameter"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_Parameter %"org::kermeta::language::structure_Parameter"*(%"org::kermeta::language::structure_TypedElement"* %"org::kermeta::language::structure_Parameter"*)
%"v0" = call cast_org::kermeta::language::structure_Parameter_org::kermeta::language::structure_TypedElement %"org::kermeta::language::structure_TypedElement"*(%"org::kermeta::language::structure_Parameter"* %"v0")
ret %"org::kermeta::language::structure_Parameter"* %"v0"}
define internal %"org::kermeta::language::structure_DataType"* @"cast_org::kermeta::language::structure_PrimitiveType_org::kermeta::language::structure_DataType"(%"org::kermeta::language::structure_PrimitiveType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_PrimitiveType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_DataType"** %"0"
ret %"org::kermeta::language::structure_DataType"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* cast_org::kermeta::language::structure_PrimitiveType_org::kermeta::language::structure_Type(%"org::kermeta::language::structure_PrimitiveType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_PrimitiveType %"org::kermeta::language::structure_PrimitiveType"*(%"org::kermeta::language::structure_Type"* %"org::kermeta::language::structure_PrimitiveType"*)
%"v0" = call cast_org::kermeta::language::structure_PrimitiveType_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"org::kermeta::language::structure_PrimitiveType"* %"v0")
ret %"org::kermeta::language::structure_PrimitiveType"* %"v0"}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* cast_org::kermeta::language::structure_PrimitiveType_org::kermeta::language::structure_ModelElementTypeDefinition(%"org::kermeta::language::structure_PrimitiveType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_PrimitiveType %"org::kermeta::language::structure_PrimitiveType"*(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"org::kermeta::language::structure_PrimitiveType"*)
%"v0" = call cast_org::kermeta::language::structure_PrimitiveType_org::kermeta::language::structure_ModelElementTypeDefinition %"org::kermeta::language::structure_ModelElementTypeDefinition"*(%"org::kermeta::language::structure_PrimitiveType"* %"v0")
ret %"org::kermeta::language::structure_PrimitiveType"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_TypedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypedElement"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypedElement"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypedElement %"org::kermeta::language::structure_TypedElement"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypedElement"*)
%"v0" = call cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypedElement"* %"v0")
ret %"org::kermeta::language::structure_TypedElement"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_TypedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypedElement"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypedElement"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypedElement %"org::kermeta::language::structure_TypedElement"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypedElement"*)
%"v0" = call cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypedElement"* %"v0")
ret %"org::kermeta::language::structure_TypedElement"* %"v0"}
define internal %"org::kermeta::language::structure_MultiplicityElement"* @"cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_MultiplicityElement"(%"org::kermeta::language::structure_TypedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypedElement"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_MultiplicityElement"** %"0"
ret %"org::kermeta::language::structure_MultiplicityElement"* %"1"
}
define internal %"org::kermeta::language::structure_AdaptationParameter"* @"cast_org::kermeta::language::structure_TypedElement_org::kermeta::language::structure_AdaptationParameter"(%"org::kermeta::language::structure_TypedElement"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypedElement"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_AdaptationParameter"** %"0"
ret %"org::kermeta::language::structure_AdaptationParameter"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_Tag_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_Tag"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Tag"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_Tag_kermeta::standard_Object(%"org::kermeta::language::structure_Tag"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_Tag %"org::kermeta::language::structure_Tag"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_Tag"*)
%"v0" = call cast_org::kermeta::language::structure_Tag_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_Tag"* %"v0")
ret %"org::kermeta::language::structure_Tag"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_AbstractProperty_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_AbstractProperty"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AbstractProperty"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_AbstractProperty_kermeta::standard_Object(%"org::kermeta::language::structure_AbstractProperty"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_AbstractProperty %"org::kermeta::language::structure_AbstractProperty"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_AbstractProperty"*)
%"v0" = call cast_org::kermeta::language::structure_AbstractProperty_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_AbstractProperty"* %"v0")
ret %"org::kermeta::language::structure_AbstractProperty"* %"v0"}
define internal %"org::kermeta::language::structure_Property"* @"cast_org::kermeta::language::structure_AbstractProperty_org::kermeta::language::structure_Property"(%"org::kermeta::language::structure_AbstractProperty"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AbstractProperty"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Property"** %"0"
ret %"org::kermeta::language::structure_Property"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedProperty"* @"cast_org::kermeta::language::structure_AbstractProperty_org::kermeta::language::structure_UnresolvedProperty"(%"org::kermeta::language::structure_AbstractProperty"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AbstractProperty"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_UnresolvedProperty"** %"0"
ret %"org::kermeta::language::structure_UnresolvedProperty"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_Constraint_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_Constraint"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Constraint"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_Constraint_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_Constraint"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Constraint %"org::kermeta::language::structure_Constraint"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_Constraint"*)
%"v0" = call cast_org::kermeta::language::structure_Constraint_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_Constraint"* %"v0")
ret %"org::kermeta::language::structure_Constraint"* %"v0"}
define internal %"org::kermeta::language::structure_GenericTypeDefinition"* @"cast_org::kermeta::language::structure_ClassDefinition_org::kermeta::language::structure_GenericTypeDefinition"(%"org::kermeta::language::structure_ClassDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ClassDefinition"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_GenericTypeDefinition"** %"0"
ret %"org::kermeta::language::structure_GenericTypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* cast_org::kermeta::language::structure_ClassDefinition_org::kermeta::language::structure_ModelElementTypeDefinition(%"org::kermeta::language::structure_ClassDefinition"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_ClassDefinition %"org::kermeta::language::structure_ClassDefinition"*(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"org::kermeta::language::structure_ClassDefinition"*)
%"v0" = call cast_org::kermeta::language::structure_ClassDefinition_org::kermeta::language::structure_ModelElementTypeDefinition %"org::kermeta::language::structure_ModelElementTypeDefinition"*(%"org::kermeta::language::structure_ClassDefinition"* %"v0")
ret %"org::kermeta::language::structure_ClassDefinition"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_Metamodel_kermeta::standard_Object(%"org::kermeta::language::structure_Metamodel"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_Metamodel %"org::kermeta::language::structure_Metamodel"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_Metamodel"*)
%"v0" = call cast_org::kermeta::language::structure_Metamodel_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_Metamodel"* %"v0")
ret %"org::kermeta::language::structure_Metamodel"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_Metamodel"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_Metamodel %"org::kermeta::language::structure_Metamodel"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_Metamodel"*)
%"v0" = call cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_Metamodel"* %"v0")
ret %"org::kermeta::language::structure_Metamodel"* %"v0"}
define internal %"org::kermeta::language::structure_TypeDefinition"* @"cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_TypeDefinition"(%"org::kermeta::language::structure_Metamodel"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Metamodel"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_TypeDefinition"** %"0"
ret %"org::kermeta::language::structure_TypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_Metamodel"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_Metamodel %"org::kermeta::language::structure_Metamodel"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_Metamodel"*)
%"v0" = call cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_Metamodel"* %"v0")
ret %"org::kermeta::language::structure_Metamodel"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_Metamodel"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_Metamodel %"org::kermeta::language::structure_Metamodel"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_Metamodel"*)
%"v0" = call cast_org::kermeta::language::structure_Metamodel_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_Metamodel"* %"v0")
ret %"org::kermeta::language::structure_Metamodel"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_ModelElementTypeDefinitionContainer_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_ModelElementTypeDefinitionContainer_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_ModelElementTypeDefinitionContainer %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"*)
%"v0" = call cast_org::kermeta::language::structure_ModelElementTypeDefinitionContainer_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"v0")
ret %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"v0"}
define internal %"org::kermeta::language::structure_Package"* @"cast_org::kermeta::language::structure_ModelElementTypeDefinitionContainer_org::kermeta::language::structure_Package"(%"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinitionContainer"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Package"** %"0"
ret %"org::kermeta::language::structure_Package"* %"1"
}
define internal %"org::kermeta::language::structure_ModelElementTypeDefinition"* @"cast_org::kermeta::language::structure_GenericTypeDefinition_org::kermeta::language::structure_ModelElementTypeDefinition"(%"org::kermeta::language::structure_GenericTypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_GenericTypeDefinition"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_ModelElementTypeDefinition"** %"0"
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_TypeDefinition"* cast_org::kermeta::language::structure_GenericTypeDefinition_org::kermeta::language::structure_TypeDefinition(%"org::kermeta::language::structure_GenericTypeDefinition"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeDefinition_org::kermeta::language::structure_GenericTypeDefinition %"org::kermeta::language::structure_GenericTypeDefinition"*(%"org::kermeta::language::structure_TypeDefinition"* %"org::kermeta::language::structure_GenericTypeDefinition"*)
%"v0" = call cast_org::kermeta::language::structure_GenericTypeDefinition_org::kermeta::language::structure_TypeDefinition %"org::kermeta::language::structure_TypeDefinition"*(%"org::kermeta::language::structure_GenericTypeDefinition"* %"v0")
ret %"org::kermeta::language::structure_GenericTypeDefinition"* %"v0"}
define internal %"org::kermeta::language::structure_ClassDefinition"* @"cast_org::kermeta::language::structure_GenericTypeDefinition_org::kermeta::language::structure_ClassDefinition"(%"org::kermeta::language::structure_GenericTypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_GenericTypeDefinition"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_ClassDefinition"** %"0"
ret %"org::kermeta::language::structure_ClassDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_ParameterizedType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_ParameterizedType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ParameterizedType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_ParameterizedType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_ParameterizedType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_ParameterizedType %"org::kermeta::language::structure_ParameterizedType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_ParameterizedType"*)
%"v0" = call cast_org::kermeta::language::structure_ParameterizedType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_ParameterizedType"* %"v0")
ret %"org::kermeta::language::structure_ParameterizedType"* %"v0"}
define internal %"org::kermeta::language::structure_Class"* @"cast_org::kermeta::language::structure_ParameterizedType_org::kermeta::language::structure_Class"(%"org::kermeta::language::structure_ParameterizedType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ParameterizedType"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Class"** %"0"
ret %"org::kermeta::language::structure_Class"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeVariable %"org::kermeta::language::structure_TypeVariable"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypeVariable"* %"v0")
ret %"org::kermeta::language::structure_TypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeVariable %"org::kermeta::language::structure_TypeVariable"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypeVariable"* %"v0")
ret %"org::kermeta::language::structure_TypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_TypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_TypeVariable %"org::kermeta::language::structure_TypeVariable"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_TypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_TypeVariable"* %"v0")
ret %"org::kermeta::language::structure_TypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_ObjectTypeVariable"* @"cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_ObjectTypeVariable"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_ObjectTypeVariable"** %"0"
ret %"org::kermeta::language::structure_ObjectTypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_ModelTypeVariable"* @"cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_ModelTypeVariable"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_ModelTypeVariable"** %"0"
ret %"org::kermeta::language::structure_ModelTypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedTypeVariable"* @"cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_UnresolvedTypeVariable"(%"org::kermeta::language::structure_TypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_TypeVariable"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::structure_UnresolvedTypeVariable"** %"0"
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_TypeVariable"(%"org::kermeta::language::structure_ObjectTypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ObjectTypeVariable"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeVariable"** %"0"
ret %"org::kermeta::language::structure_TypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_ObjectTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_ObjectTypeVariable %"org::kermeta::language::structure_ObjectTypeVariable"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_ObjectTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_ObjectTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_ObjectTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_Type(%"org::kermeta::language::structure_ObjectTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_ObjectTypeVariable %"org::kermeta::language::structure_ObjectTypeVariable"*(%"org::kermeta::language::structure_Type"* %"org::kermeta::language::structure_ObjectTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"org::kermeta::language::structure_ObjectTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_ObjectTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_ObjectTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_ObjectTypeVariable %"org::kermeta::language::structure_ObjectTypeVariable"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_ObjectTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_ObjectTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_ObjectTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_VirtualType"* @"cast_org::kermeta::language::structure_ObjectTypeVariable_org::kermeta::language::structure_VirtualType"(%"org::kermeta::language::structure_ObjectTypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ObjectTypeVariable"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_VirtualType"** %"0"
ret %"org::kermeta::language::structure_VirtualType"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariable"* @"cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_TypeVariable"(%"org::kermeta::language::structure_ModelTypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelTypeVariable"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeVariable"** %"0"
ret %"org::kermeta::language::structure_TypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_ModelTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_ModelTypeVariable %"org::kermeta::language::structure_ModelTypeVariable"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_ModelTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_ModelTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_ModelTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_Type(%"org::kermeta::language::structure_ModelTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_ModelTypeVariable %"org::kermeta::language::structure_ModelTypeVariable"*(%"org::kermeta::language::structure_Type"* %"org::kermeta::language::structure_ModelTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"org::kermeta::language::structure_ModelTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_ModelTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_ModelTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_ModelTypeVariable %"org::kermeta::language::structure_ModelTypeVariable"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_ModelTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_ModelTypeVariable_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_ModelTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_ModelTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_ObjectTypeVariable"* @"cast_org::kermeta::language::structure_VirtualType_org::kermeta::language::structure_ObjectTypeVariable"(%"org::kermeta::language::structure_VirtualType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_VirtualType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_ObjectTypeVariable"** %"0"
ret %"org::kermeta::language::structure_ObjectTypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_TypeVariable"* cast_org::kermeta::language::structure_VirtualType_org::kermeta::language::structure_TypeVariable(%"org::kermeta::language::structure_VirtualType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeVariable_org::kermeta::language::structure_VirtualType %"org::kermeta::language::structure_VirtualType"*(%"org::kermeta::language::structure_TypeVariable"* %"org::kermeta::language::structure_VirtualType"*)
%"v0" = call cast_org::kermeta::language::structure_VirtualType_org::kermeta::language::structure_TypeVariable %"org::kermeta::language::structure_TypeVariable"*(%"org::kermeta::language::structure_VirtualType"* %"v0")
ret %"org::kermeta::language::structure_VirtualType"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_Model_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_Model"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Model"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_Model_kermeta::standard_Object(%"org::kermeta::language::structure_Model"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_Model %"org::kermeta::language::structure_Model"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_Model"*)
%"v0" = call cast_org::kermeta::language::structure_Model_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_Model"* %"v0")
ret %"org::kermeta::language::structure_Model"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_AbstractOperation_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_AbstractOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AbstractOperation"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_AbstractOperation_kermeta::standard_Object(%"org::kermeta::language::structure_AbstractOperation"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_AbstractOperation %"org::kermeta::language::structure_AbstractOperation"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_AbstractOperation"*)
%"v0" = call cast_org::kermeta::language::structure_AbstractOperation_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_AbstractOperation"* %"v0")
ret %"org::kermeta::language::structure_AbstractOperation"* %"v0"}
define internal %"org::kermeta::language::structure_Operation"* @"cast_org::kermeta::language::structure_AbstractOperation_org::kermeta::language::structure_Operation"(%"org::kermeta::language::structure_AbstractOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AbstractOperation"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Operation"** %"0"
ret %"org::kermeta::language::structure_Operation"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedOperation"* @"cast_org::kermeta::language::structure_AbstractOperation_org::kermeta::language::structure_UnresolvedOperation"(%"org::kermeta::language::structure_AbstractOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AbstractOperation"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_UnresolvedOperation"** %"0"
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_UnresolvedType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedType %"org::kermeta::language::structure_UnresolvedType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedType"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedType"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedType"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_UnresolvedType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedType %"org::kermeta::language::structure_UnresolvedType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedType"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedType"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedType"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_UnresolvedType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedType"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedType %"org::kermeta::language::structure_UnresolvedType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedType"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedType"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedType"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_UnresolvedReference_kermeta::standard_Object(%"org::kermeta::language::structure_UnresolvedReference"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_UnresolvedReference %"org::kermeta::language::structure_UnresolvedReference"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_UnresolvedReference"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedReference_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_UnresolvedReference"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedReference"* %"v0"}
define internal %"org::kermeta::language::behavior_UnresolvedCall"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::behavior_UnresolvedCall"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::behavior_UnresolvedCall"** %"0"
ret %"org::kermeta::language::behavior_UnresolvedCall"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedType"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_UnresolvedType"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_UnresolvedType"** %"0"
ret %"org::kermeta::language::structure_UnresolvedType"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedProperty"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_UnresolvedProperty"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_UnresolvedProperty"** %"0"
ret %"org::kermeta::language::structure_UnresolvedProperty"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedOperation"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_UnresolvedOperation"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 4
%"1" = load %"org::kermeta::language::structure_UnresolvedOperation"** %"0"
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedInferredType"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_UnresolvedInferredType"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 5
%"1" = load %"org::kermeta::language::structure_UnresolvedInferredType"** %"0"
ret %"org::kermeta::language::structure_UnresolvedInferredType"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedTypeVariable"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_UnresolvedTypeVariable"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 6
%"1" = load %"org::kermeta::language::structure_UnresolvedTypeVariable"** %"0"
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* @"cast_org::kermeta::language::structure_UnresolvedReference_org::kermeta::language::structure_UnresolvedAdaptationOperator"(%"org::kermeta::language::structure_UnresolvedReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedReference"* %"self",i32 0,i32 7
%"1" = load %"org::kermeta::language::structure_UnresolvedAdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_AbstractProperty"* @"cast_org::kermeta::language::structure_UnresolvedProperty_org::kermeta::language::structure_AbstractProperty"(%"org::kermeta::language::structure_UnresolvedProperty"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedProperty"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_AbstractProperty"** %"0"
ret %"org::kermeta::language::structure_AbstractProperty"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedProperty_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedProperty"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedProperty %"org::kermeta::language::structure_UnresolvedProperty"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedProperty"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedProperty_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedProperty"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedProperty"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_UnresolvedProperty_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_UnresolvedProperty"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedProperty"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedProperty_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedProperty"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedProperty %"org::kermeta::language::structure_UnresolvedProperty"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedProperty"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedProperty_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedProperty"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedProperty"* %"v0"}
define internal %"org::kermeta::language::structure_AbstractOperation"* @"cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_AbstractOperation"(%"org::kermeta::language::structure_UnresolvedOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_AbstractOperation"** %"0"
ret %"org::kermeta::language::structure_AbstractOperation"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedOperation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedOperation %"org::kermeta::language::structure_UnresolvedOperation"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedOperation"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedOperation"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_UnresolvedOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedOperation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedOperation %"org::kermeta::language::structure_UnresolvedOperation"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedOperation"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedOperation"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_UnresolvedOperation"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedOperation"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedOperation"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedOperation %"org::kermeta::language::structure_UnresolvedOperation"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedOperation"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedOperation_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedOperation"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedOperation"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_Using_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_Using"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_Using"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_Using_kermeta::standard_Object(%"org::kermeta::language::structure_Using"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_Using %"org::kermeta::language::structure_Using"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_Using"*)
%"v0" = call cast_org::kermeta::language::structure_Using_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_Using"* %"v0")
ret %"org::kermeta::language::structure_Using"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_ProductType_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_ProductType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ProductType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_ProductType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_ProductType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_ProductType %"org::kermeta::language::structure_ProductType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_ProductType"*)
%"v0" = call cast_org::kermeta::language::structure_ProductType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_ProductType"* %"v0")
ret %"org::kermeta::language::structure_ProductType"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_ProductType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_ProductType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ProductType"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_ProductType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_ProductType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_ProductType %"org::kermeta::language::structure_ProductType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_ProductType"*)
%"v0" = call cast_org::kermeta::language::structure_ProductType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_ProductType"* %"v0")
ret %"org::kermeta::language::structure_ProductType"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* @"cast_org::kermeta::language::structure_FunctionType_org::kermeta::language::structure_TypeContainer"(%"org::kermeta::language::structure_FunctionType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_FunctionType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeContainer"** %"0"
ret %"org::kermeta::language::structure_TypeContainer"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_FunctionType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_FunctionType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_FunctionType %"org::kermeta::language::structure_FunctionType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_FunctionType"*)
%"v0" = call cast_org::kermeta::language::structure_FunctionType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_FunctionType"* %"v0")
ret %"org::kermeta::language::structure_FunctionType"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_FunctionType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_FunctionType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_FunctionType"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_FunctionType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_FunctionType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_FunctionType %"org::kermeta::language::structure_FunctionType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_FunctionType"*)
%"v0" = call cast_org::kermeta::language::structure_FunctionType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_FunctionType"* %"v0")
ret %"org::kermeta::language::structure_FunctionType"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_VoidType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_VoidType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_VoidType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_VoidType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_VoidType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_VoidType %"org::kermeta::language::structure_VoidType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_VoidType"*)
%"v0" = call cast_org::kermeta::language::structure_VoidType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_VoidType"* %"v0")
ret %"org::kermeta::language::structure_VoidType"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_UnresolvedInferredType_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_UnresolvedInferredType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedInferredType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedInferredType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedInferredType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedInferredType %"org::kermeta::language::structure_UnresolvedInferredType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedInferredType"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedInferredType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedInferredType"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedInferredType"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_UnresolvedInferredType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_UnresolvedInferredType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedInferredType"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedInferredType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedInferredType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedInferredType %"org::kermeta::language::structure_UnresolvedInferredType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedInferredType"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedInferredType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedInferredType"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedInferredType"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_UnresolvedTypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedTypeVariable %"org::kermeta::language::structure_UnresolvedTypeVariable"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_TypeVariable"* @"cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_TypeVariable"(%"org::kermeta::language::structure_UnresolvedTypeVariable"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_TypeVariable"** %"0"
ret %"org::kermeta::language::structure_TypeVariable"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_UnresolvedTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_UnresolvedTypeVariable %"org::kermeta::language::structure_UnresolvedTypeVariable"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_UnresolvedTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_Type"* cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_Type(%"org::kermeta::language::structure_UnresolvedTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_Type_org::kermeta::language::structure_UnresolvedTypeVariable %"org::kermeta::language::structure_UnresolvedTypeVariable"*(%"org::kermeta::language::structure_Type"* %"org::kermeta::language::structure_UnresolvedTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_Type %"org::kermeta::language::structure_Type"*(%"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_UnresolvedTypeVariable"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_UnresolvedTypeVariable %"org::kermeta::language::structure_UnresolvedTypeVariable"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_UnresolvedTypeVariable"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedTypeVariable_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedTypeVariable"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_MetamodelBinding_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_MetamodelBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_MetamodelBinding"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_MetamodelBinding_kermeta::standard_Object(%"org::kermeta::language::structure_MetamodelBinding"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_MetamodelBinding %"org::kermeta::language::structure_MetamodelBinding"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_MetamodelBinding"*)
%"v0" = call cast_org::kermeta::language::structure_MetamodelBinding_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_MetamodelBinding"* %"v0")
ret %"org::kermeta::language::structure_MetamodelBinding"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_ClassDefinitionBinding_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_ClassDefinitionBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ClassDefinitionBinding"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_ClassDefinitionBinding_kermeta::standard_Object(%"org::kermeta::language::structure_ClassDefinitionBinding"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_ClassDefinitionBinding %"org::kermeta::language::structure_ClassDefinitionBinding"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_ClassDefinitionBinding"*)
%"v0" = call cast_org::kermeta::language::structure_ClassDefinitionBinding_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_ClassDefinitionBinding"* %"v0")
ret %"org::kermeta::language::structure_ClassDefinitionBinding"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_EnumerationBinding_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_EnumerationBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_EnumerationBinding"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_EnumerationBinding_kermeta::standard_Object(%"org::kermeta::language::structure_EnumerationBinding"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_EnumerationBinding %"org::kermeta::language::structure_EnumerationBinding"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_EnumerationBinding"*)
%"v0" = call cast_org::kermeta::language::structure_EnumerationBinding_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_EnumerationBinding"* %"v0")
ret %"org::kermeta::language::structure_EnumerationBinding"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_PropertyBinding_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_PropertyBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_PropertyBinding"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_PropertyBinding_kermeta::standard_Object(%"org::kermeta::language::structure_PropertyBinding"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_PropertyBinding %"org::kermeta::language::structure_PropertyBinding"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_PropertyBinding"*)
%"v0" = call cast_org::kermeta::language::structure_PropertyBinding_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_PropertyBinding"* %"v0")
ret %"org::kermeta::language::structure_PropertyBinding"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_OperationBinding_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_OperationBinding"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_OperationBinding"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_OperationBinding_kermeta::standard_Object(%"org::kermeta::language::structure_OperationBinding"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_OperationBinding %"org::kermeta::language::structure_OperationBinding"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_OperationBinding"*)
%"v0" = call cast_org::kermeta::language::structure_OperationBinding_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_OperationBinding"* %"v0")
ret %"org::kermeta::language::structure_OperationBinding"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* @"cast_org::kermeta::language::structure_AdaptationOperator_org::kermeta::language::structure_NamedElement"(%"org::kermeta::language::structure_AdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AdaptationOperator"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_NamedElement"** %"0"
ret %"org::kermeta::language::structure_NamedElement"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_AdaptationOperator_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_AdaptationOperator"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_AdaptationOperator %"org::kermeta::language::structure_AdaptationOperator"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_AdaptationOperator"*)
%"v0" = call cast_org::kermeta::language::structure_AdaptationOperator_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_AdaptationOperator"* %"v0")
ret %"org::kermeta::language::structure_AdaptationOperator"* %"v0"}
define internal %"org::kermeta::language::structure_PropertyAdaptationOperator"* @"cast_org::kermeta::language::structure_AdaptationOperator_org::kermeta::language::structure_PropertyAdaptationOperator"(%"org::kermeta::language::structure_AdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AdaptationOperator"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_PropertyAdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* @"cast_org::kermeta::language::structure_AdaptationOperator_org::kermeta::language::structure_UnresolvedAdaptationOperator"(%"org::kermeta::language::structure_AdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AdaptationOperator"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_UnresolvedAdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_OperationAdaptationOperator"* @"cast_org::kermeta::language::structure_AdaptationOperator_org::kermeta::language::structure_OperationAdaptationOperator"(%"org::kermeta::language::structure_AdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AdaptationOperator"* %"self",i32 0,i32 3
%"1" = load %"org::kermeta::language::structure_OperationAdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_OperationAdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_UseAdaptationOperator_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_UseAdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UseAdaptationOperator"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_UseAdaptationOperator_kermeta::standard_Object(%"org::kermeta::language::structure_UseAdaptationOperator"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_UseAdaptationOperator %"org::kermeta::language::structure_UseAdaptationOperator"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_UseAdaptationOperator"*)
%"v0" = call cast_org::kermeta::language::structure_UseAdaptationOperator_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_UseAdaptationOperator"* %"v0")
ret %"org::kermeta::language::structure_UseAdaptationOperator"* %"v0"}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"cast_org::kermeta::language::structure_PropertyAdaptationOperator_org::kermeta::language::structure_AdaptationOperator"(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_AdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_AdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_PropertyAdaptationOperator_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_PropertyAdaptationOperator"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_PropertyAdaptationOperator %"org::kermeta::language::structure_PropertyAdaptationOperator"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_PropertyAdaptationOperator"*)
%"v0" = call cast_org::kermeta::language::structure_PropertyAdaptationOperator_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_PropertyAdaptationOperator"* %"v0")
ret %"org::kermeta::language::structure_PropertyAdaptationOperator"* %"v0"}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"cast_org::kermeta::language::structure_UnresolvedAdaptationOperator_org::kermeta::language::structure_AdaptationOperator"(%"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_AdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_AdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_UnresolvedAdaptationOperator_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_UnresolvedAdaptationOperator"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_UnresolvedAdaptationOperator %"org::kermeta::language::structure_UnresolvedAdaptationOperator"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_UnresolvedAdaptationOperator"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedAdaptationOperator_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"v0"}
define internal %"org::kermeta::language::structure_UnresolvedReference"* @"cast_org::kermeta::language::structure_UnresolvedAdaptationOperator_org::kermeta::language::structure_UnresolvedReference"(%"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_UnresolvedReference"** %"0"
ret %"org::kermeta::language::structure_UnresolvedReference"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_UnresolvedAdaptationOperator_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_UnresolvedAdaptationOperator"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_UnresolvedAdaptationOperator %"org::kermeta::language::structure_UnresolvedAdaptationOperator"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_UnresolvedAdaptationOperator"*)
%"v0" = call cast_org::kermeta::language::structure_UnresolvedAdaptationOperator_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"v0")
ret %"org::kermeta::language::structure_UnresolvedAdaptationOperator"* %"v0"}
define internal %"org::kermeta::language::structure_TypedElement"* @"cast_org::kermeta::language::structure_AdaptationParameter_org::kermeta::language::structure_TypedElement"(%"org::kermeta::language::structure_AdaptationParameter"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_AdaptationParameter"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypedElement"** %"0"
ret %"org::kermeta::language::structure_TypedElement"* %"1"
}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_AdaptationParameter_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_AdaptationParameter"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_AdaptationParameter %"org::kermeta::language::structure_AdaptationParameter"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_AdaptationParameter"*)
%"v0" = call cast_org::kermeta::language::structure_AdaptationParameter_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_AdaptationParameter"* %"v0")
ret %"org::kermeta::language::structure_AdaptationParameter"* %"v0"}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_AdaptationParameter_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_AdaptationParameter"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_AdaptationParameter %"org::kermeta::language::structure_AdaptationParameter"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_AdaptationParameter"*)
%"v0" = call cast_org::kermeta::language::structure_AdaptationParameter_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_AdaptationParameter"* %"v0")
ret %"org::kermeta::language::structure_AdaptationParameter"* %"v0"}
define internal %"org::kermeta::language::structure_AdaptationOperator"* @"cast_org::kermeta::language::structure_OperationAdaptationOperator_org::kermeta::language::structure_AdaptationOperator"(%"org::kermeta::language::structure_OperationAdaptationOperator"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_OperationAdaptationOperator"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_AdaptationOperator"** %"0"
ret %"org::kermeta::language::structure_AdaptationOperator"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_OperationAdaptationOperator_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_OperationAdaptationOperator"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_OperationAdaptationOperator %"org::kermeta::language::structure_OperationAdaptationOperator"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_OperationAdaptationOperator"*)
%"v0" = call cast_org::kermeta::language::structure_OperationAdaptationOperator_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_OperationAdaptationOperator"* %"v0")
ret %"org::kermeta::language::structure_OperationAdaptationOperator"* %"v0"}
define internal %"org::kermeta::language::structure_TypeDefinition"* @"cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_TypeDefinition"(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_TypeDefinition"** %"0"
ret %"org::kermeta::language::structure_TypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_NamedElement"* cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_NamedElement(%"org::kermeta::language::structure_ModelElementTypeDefinition"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_NamedElement_org::kermeta::language::structure_ModelElementTypeDefinition %"org::kermeta::language::structure_ModelElementTypeDefinition"*(%"org::kermeta::language::structure_NamedElement"* %"org::kermeta::language::structure_ModelElementTypeDefinition"*)
%"v0" = call cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_NamedElement %"org::kermeta::language::structure_NamedElement"*(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"v0")
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"v0"}
define internal %"org::kermeta::language::structure_TypeContainer"* cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_TypeContainer(%"org::kermeta::language::structure_ModelElementTypeDefinition"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_TypeContainer_org::kermeta::language::structure_ModelElementTypeDefinition %"org::kermeta::language::structure_ModelElementTypeDefinition"*(%"org::kermeta::language::structure_TypeContainer"* %"org::kermeta::language::structure_ModelElementTypeDefinition"*)
%"v0" = call cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_TypeContainer %"org::kermeta::language::structure_TypeContainer"*(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"v0")
ret %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"v0"}
define internal %"org::kermeta::language::structure_DataType"* @"cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_DataType"(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"self",i32 0,i32 1
%"1" = load %"org::kermeta::language::structure_DataType"** %"0"
ret %"org::kermeta::language::structure_DataType"* %"1"
}
define internal %"org::kermeta::language::structure_GenericTypeDefinition"* @"cast_org::kermeta::language::structure_ModelElementTypeDefinition_org::kermeta::language::structure_GenericTypeDefinition"(%"org::kermeta::language::structure_ModelElementTypeDefinition"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelElementTypeDefinition"* %"self",i32 0,i32 2
%"1" = load %"org::kermeta::language::structure_GenericTypeDefinition"** %"0"
ret %"org::kermeta::language::structure_GenericTypeDefinition"* %"1"
}
define internal %"org::kermeta::language::structure_Type"* @"cast_org::kermeta::language::structure_ModelType_org::kermeta::language::structure_Type"(%"org::kermeta::language::structure_ModelType"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_ModelType"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_Type"** %"0"
ret %"org::kermeta::language::structure_Type"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* cast_org::kermeta::language::structure_ModelType_org::kermeta::language::structure_KermetaModelElement(%"org::kermeta::language::structure_ModelType"* self*) readonly{
%"v0" = call cast_org::kermeta::language::structure_KermetaModelElement_org::kermeta::language::structure_ModelType %"org::kermeta::language::structure_ModelType"*(%"org::kermeta::language::structure_KermetaModelElement"* %"org::kermeta::language::structure_ModelType"*)
%"v0" = call cast_org::kermeta::language::structure_ModelType_org::kermeta::language::structure_KermetaModelElement %"org::kermeta::language::structure_KermetaModelElement"*(%"org::kermeta::language::structure_ModelType"* %"v0")
ret %"org::kermeta::language::structure_ModelType"* %"v0"}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_org::kermeta::language::structure_FilteredMetamodelReference_org::kermeta::language::structure_KermetaModelElement"(%"org::kermeta::language::structure_FilteredMetamodelReference"* %"self") readonly inlinehint{
%"0" = getelementptr %"org::kermeta::language::structure_FilteredMetamodelReference"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Object"* cast_org::kermeta::language::structure_FilteredMetamodelReference_kermeta::standard_Object(%"org::kermeta::language::structure_FilteredMetamodelReference"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_org::kermeta::language::structure_FilteredMetamodelReference %"org::kermeta::language::structure_FilteredMetamodelReference"*(%"kermeta::standard_Object"* %"org::kermeta::language::structure_FilteredMetamodelReference"*)
%"v0" = call cast_org::kermeta::language::structure_FilteredMetamodelReference_kermeta::standard_Object %"kermeta::standard_Object"*(%"org::kermeta::language::structure_FilteredMetamodelReference"* %"v0")
ret %"org::kermeta::language::structure_FilteredMetamodelReference"* %"v0"}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Void_kermeta::standard_Object"(%"kermeta::standard_Void"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Void"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Model_kermeta::standard_Object"(%"kermeta::standard_Model"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Model"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"org::kermeta::language::structure_KermetaModelElement"* @"cast_kermeta::standard_Object_org::kermeta::language::structure_KermetaModelElement"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 0
%"1" = load %"org::kermeta::language::structure_KermetaModelElement"** %"0"
ret %"org::kermeta::language::structure_KermetaModelElement"* %"1"
}
define internal %"kermeta::standard_Void"* @"cast_kermeta::standard_Object_kermeta::standard_Void"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_Void"** %"0"
ret %"kermeta::standard_Void"* %"1"
}
define internal %"kermeta::standard_Model"* @"cast_kermeta::standard_Object_kermeta::standard_Model"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 2
%"1" = load %"kermeta::standard_Model"** %"0"
ret %"kermeta::standard_Model"* %"1"
}
define internal %"kermeta::standard_String"* @"cast_kermeta::standard_Object_kermeta::standard_String"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 3
%"1" = load %"kermeta::standard_String"** %"0"
ret %"kermeta::standard_String"* %"1"
}
define internal %"kermeta::standard_Boolean"* @"cast_kermeta::standard_Object_kermeta::standard_Boolean"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 4
%"1" = load %"kermeta::standard_Boolean"** %"0"
ret %"kermeta::standard_Boolean"* %"1"
}
define internal %"kermeta::standard_Random"* @"cast_kermeta::standard_Object_kermeta::standard_Random"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 5
%"1" = load %"kermeta::standard_Random"** %"0"
ret %"kermeta::standard_Random"* %"1"
}
define internal %"kermeta::standard_StringBuffer"* @"cast_kermeta::standard_Object_kermeta::standard_StringBuffer"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 6
%"1" = load %"kermeta::standard_StringBuffer"** %"0"
ret %"kermeta::standard_StringBuffer"* %"1"
}
define internal %"kermeta::standard_Character"* @"cast_kermeta::standard_Object_kermeta::standard_Character"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 7
%"1" = load %"kermeta::standard_Character"** %"0"
ret %"kermeta::standard_Character"* %"1"
}
define internal %"kermeta::standard_Summable"* @"cast_kermeta::standard_Object_kermeta::standard_Summable"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 8
%"1" = load %"kermeta::standard_Summable"** %"0"
ret %"kermeta::standard_Summable"* %"1"
}
define internal %"kermeta::standard_Comparable"* @"cast_kermeta::standard_Object_kermeta::standard_Comparable"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 9
%"1" = load %"kermeta::standard_Comparable"** %"0"
ret %"kermeta::standard_Comparable"* %"1"
}
define internal %"kermeta::standard_URI"* @"cast_kermeta::standard_Object_kermeta::standard_URI"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 10
%"1" = load %"kermeta::standard_URI"** %"0"
ret %"kermeta::standard_URI"* %"1"
}
define internal %"kermeta::standard_Map"* @"cast_kermeta::standard_Object_kermeta::standard_Map"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 11
%"1" = load %"kermeta::standard_Map"** %"0"
ret %"kermeta::standard_Map"* %"1"
}
define internal %"kermeta::standard_Collection"* @"cast_kermeta::standard_Object_kermeta::standard_Collection"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 12
%"1" = load %"kermeta::standard_Collection"** %"0"
ret %"kermeta::standard_Collection"* %"1"
}
define internal %"kermeta::standard_Iterator"* @"cast_kermeta::standard_Object_kermeta::standard_Iterator"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 13
%"1" = load %"kermeta::standard_Iterator"** %"0"
ret %"kermeta::standard_Iterator"* %"1"
}
define internal %"kermeta::standard_EachContext"* @"cast_kermeta::standard_Object_kermeta::standard_EachContext"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 14
%"1" = load %"kermeta::standard_EachContext"** %"0"
ret %"kermeta::standard_EachContext"* %"1"
}
define internal %"kermeta::emfpersistence_Resource"* @"cast_kermeta::standard_Object_kermeta::emfpersistence_Resource"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 15
%"1" = load %"kermeta::emfpersistence_Resource"** %"0"
ret %"kermeta::emfpersistence_Resource"* %"1"
}
define internal %"kermeta::emfpersistence_ResourceSet"* @"cast_kermeta::standard_Object_kermeta::emfpersistence_ResourceSet"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 16
%"1" = load %"kermeta::emfpersistence_ResourceSet"** %"0"
ret %"kermeta::emfpersistence_ResourceSet"* %"1"
}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::standard_Object_kermeta::exceptions_Exception"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 17
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::exceptions_ConstraintsDiagnostic"* @"cast_kermeta::standard_Object_kermeta::exceptions_ConstraintsDiagnostic"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 18
%"1" = load %"kermeta::exceptions_ConstraintsDiagnostic"** %"0"
ret %"kermeta::exceptions_ConstraintsDiagnostic"* %"1"
}
define internal %"kermeta::io_FileIO"* @"cast_kermeta::standard_Object_kermeta::io_FileIO"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 19
%"1" = load %"kermeta::io_FileIO"** %"0"
ret %"kermeta::io_FileIO"* %"1"
}
define internal %"kermeta::io_StdIO"* @"cast_kermeta::standard_Object_kermeta::io_StdIO"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 20
%"1" = load %"kermeta::io_StdIO"** %"0"
ret %"kermeta::io_StdIO"* %"1"
}
define internal %"kermeta::utils_Hashtable"* @"cast_kermeta::standard_Object_kermeta::utils_Hashtable"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 21
%"1" = load %"kermeta::utils_Hashtable"** %"0"
ret %"kermeta::utils_Hashtable"* %"1"
}
define internal %"root_package_ArabicNumber"* @"cast_kermeta::standard_Object_root_package_ArabicNumber"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 22
%"1" = load %"root_package_ArabicNumber"** %"0"
ret %"root_package_ArabicNumber"* %"1"
}
define internal %"root_package_Digit"* @"cast_kermeta::standard_Object_root_package_Digit"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 23
%"1" = load %"root_package_Digit"** %"0"
ret %"root_package_Digit"* %"1"
}
define internal %"root_package_RomanNumber"* @"cast_kermeta::standard_Object_root_package_RomanNumber"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 24
%"1" = load %"root_package_RomanNumber"** %"0"
ret %"root_package_RomanNumber"* %"1"
}
define internal %"root_package_Letter"* @"cast_kermeta::standard_Object_root_package_Letter"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 25
%"1" = load %"root_package_Letter"** %"0"
ret %"root_package_Letter"* %"1"
}
define internal %"root_package_Main"* @"cast_kermeta::standard_Object_root_package_Main"(%"kermeta::standard_Object"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Object"* %"self",i32 0,i32 26
%"1" = load %"root_package_Main"** %"0"
ret %"root_package_Main"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_String_kermeta::standard_Object"(%"kermeta::standard_String"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_String"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Integer_kermeta::standard_Numeric"(%"kermeta::standard_Integer"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Integer"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Summable"* cast_kermeta::standard_Integer_kermeta::standard_Summable(%"kermeta::standard_Integer"* self*) readonly{
%"v0" = call cast_kermeta::standard_Summable_kermeta::standard_Integer %"kermeta::standard_Integer"*(%"kermeta::standard_Summable"* %"kermeta::standard_Integer"*)
%"v0" = call cast_kermeta::standard_Integer_kermeta::standard_Summable %"kermeta::standard_Summable"*(%"kermeta::standard_Integer"* %"v0")
ret %"kermeta::standard_Integer"* %"v0"}
define internal %"kermeta::standard_Comparable"* cast_kermeta::standard_Integer_kermeta::standard_Comparable(%"kermeta::standard_Integer"* self*) readonly{
%"v0" = call cast_kermeta::standard_Comparable_kermeta::standard_Integer %"kermeta::standard_Integer"*(%"kermeta::standard_Comparable"* %"kermeta::standard_Integer"*)
%"v0" = call cast_kermeta::standard_Integer_kermeta::standard_Comparable %"kermeta::standard_Comparable"*(%"kermeta::standard_Integer"* %"v0")
ret %"kermeta::standard_Integer"* %"v0"}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Boolean_kermeta::standard_Object"(%"kermeta::standard_Boolean"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Boolean"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Random_kermeta::standard_Object"(%"kermeta::standard_Random"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Random"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Comparable"* @"cast_kermeta::standard_Date_kermeta::standard_Comparable"(%"kermeta::standard_Date"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Date"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Comparable"** %"0"
ret %"kermeta::standard_Comparable"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::standard_Date_kermeta::standard_Object(%"kermeta::standard_Date"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::standard_Date %"kermeta::standard_Date"*(%"kermeta::standard_Object"* %"kermeta::standard_Date"*)
%"v0" = call cast_kermeta::standard_Date_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::standard_Date"* %"v0")
ret %"kermeta::standard_Date"* %"v0"}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Short_kermeta::standard_Numeric"(%"kermeta::standard_Short"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Short"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Summable"* cast_kermeta::standard_Short_kermeta::standard_Summable(%"kermeta::standard_Short"* self*) readonly{
%"v0" = call cast_kermeta::standard_Summable_kermeta::standard_Short %"kermeta::standard_Short"*(%"kermeta::standard_Summable"* %"kermeta::standard_Short"*)
%"v0" = call cast_kermeta::standard_Short_kermeta::standard_Summable %"kermeta::standard_Summable"*(%"kermeta::standard_Short"* %"v0")
ret %"kermeta::standard_Short"* %"v0"}
define internal %"kermeta::standard_Comparable"* cast_kermeta::standard_Short_kermeta::standard_Comparable(%"kermeta::standard_Short"* self*) readonly{
%"v0" = call cast_kermeta::standard_Comparable_kermeta::standard_Short %"kermeta::standard_Short"*(%"kermeta::standard_Comparable"* %"kermeta::standard_Short"*)
%"v0" = call cast_kermeta::standard_Short_kermeta::standard_Comparable %"kermeta::standard_Comparable"*(%"kermeta::standard_Short"* %"v0")
ret %"kermeta::standard_Short"* %"v0"}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Long_kermeta::standard_Numeric"(%"kermeta::standard_Long"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Long"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Summable"* cast_kermeta::standard_Long_kermeta::standard_Summable(%"kermeta::standard_Long"* self*) readonly{
%"v0" = call cast_kermeta::standard_Summable_kermeta::standard_Long %"kermeta::standard_Long"*(%"kermeta::standard_Summable"* %"kermeta::standard_Long"*)
%"v0" = call cast_kermeta::standard_Long_kermeta::standard_Summable %"kermeta::standard_Summable"*(%"kermeta::standard_Long"* %"v0")
ret %"kermeta::standard_Long"* %"v0"}
define internal %"kermeta::standard_Comparable"* cast_kermeta::standard_Long_kermeta::standard_Comparable(%"kermeta::standard_Long"* self*) readonly{
%"v0" = call cast_kermeta::standard_Comparable_kermeta::standard_Long %"kermeta::standard_Long"*(%"kermeta::standard_Comparable"* %"kermeta::standard_Long"*)
%"v0" = call cast_kermeta::standard_Long_kermeta::standard_Comparable %"kermeta::standard_Comparable"*(%"kermeta::standard_Long"* %"v0")
ret %"kermeta::standard_Long"* %"v0"}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Double_kermeta::standard_Numeric"(%"kermeta::standard_Double"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Double"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Summable"* cast_kermeta::standard_Double_kermeta::standard_Summable(%"kermeta::standard_Double"* self*) readonly{
%"v0" = call cast_kermeta::standard_Summable_kermeta::standard_Double %"kermeta::standard_Double"*(%"kermeta::standard_Summable"* %"kermeta::standard_Double"*)
%"v0" = call cast_kermeta::standard_Double_kermeta::standard_Summable %"kermeta::standard_Summable"*(%"kermeta::standard_Double"* %"v0")
ret %"kermeta::standard_Double"* %"v0"}
define internal %"kermeta::standard_Comparable"* cast_kermeta::standard_Double_kermeta::standard_Comparable(%"kermeta::standard_Double"* self*) readonly{
%"v0" = call cast_kermeta::standard_Comparable_kermeta::standard_Double %"kermeta::standard_Double"*(%"kermeta::standard_Comparable"* %"kermeta::standard_Double"*)
%"v0" = call cast_kermeta::standard_Double_kermeta::standard_Comparable %"kermeta::standard_Comparable"*(%"kermeta::standard_Double"* %"v0")
ret %"kermeta::standard_Double"* %"v0"}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Float_kermeta::standard_Numeric"(%"kermeta::standard_Float"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Float"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Summable"* cast_kermeta::standard_Float_kermeta::standard_Summable(%"kermeta::standard_Float"* self*) readonly{
%"v0" = call cast_kermeta::standard_Summable_kermeta::standard_Float %"kermeta::standard_Float"*(%"kermeta::standard_Summable"* %"kermeta::standard_Float"*)
%"v0" = call cast_kermeta::standard_Float_kermeta::standard_Summable %"kermeta::standard_Summable"*(%"kermeta::standard_Float"* %"v0")
ret %"kermeta::standard_Float"* %"v0"}
define internal %"kermeta::standard_Comparable"* cast_kermeta::standard_Float_kermeta::standard_Comparable(%"kermeta::standard_Float"* self*) readonly{
%"v0" = call cast_kermeta::standard_Comparable_kermeta::standard_Float %"kermeta::standard_Float"*(%"kermeta::standard_Comparable"* %"kermeta::standard_Float"*)
%"v0" = call cast_kermeta::standard_Float_kermeta::standard_Comparable %"kermeta::standard_Comparable"*(%"kermeta::standard_Float"* %"v0")
ret %"kermeta::standard_Float"* %"v0"}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_StringBuffer_kermeta::standard_Object"(%"kermeta::standard_StringBuffer"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_StringBuffer"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Character_kermeta::standard_Object"(%"kermeta::standard_Character"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Character"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Summable_kermeta::standard_Object"(%"kermeta::standard_Summable"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Summable"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Summable_kermeta::standard_Numeric"(%"kermeta::standard_Summable"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Summable"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Comparable_kermeta::standard_Object"(%"kermeta::standard_Comparable"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Comparable"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Date"* @"cast_kermeta::standard_Comparable_kermeta::standard_Date"(%"kermeta::standard_Comparable"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Comparable"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_Date"** %"0"
ret %"kermeta::standard_Date"* %"1"
}
define internal %"kermeta::standard_Numeric"* @"cast_kermeta::standard_Comparable_kermeta::standard_Numeric"(%"kermeta::standard_Comparable"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Comparable"* %"self",i32 0,i32 2
%"1" = load %"kermeta::standard_Numeric"** %"0"
ret %"kermeta::standard_Numeric"* %"1"
}
define internal %"kermeta::standard_Summable"* @"cast_kermeta::standard_Numeric_kermeta::standard_Summable"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Summable"** %"0"
ret %"kermeta::standard_Summable"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::standard_Numeric_kermeta::standard_Object(%"kermeta::standard_Numeric"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::standard_Numeric %"kermeta::standard_Numeric"*(%"kermeta::standard_Object"* %"kermeta::standard_Numeric"*)
%"v0" = call cast_kermeta::standard_Numeric_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::standard_Numeric"* %"v0")
ret %"kermeta::standard_Numeric"* %"v0"}
define internal %"kermeta::standard_Comparable"* @"cast_kermeta::standard_Numeric_kermeta::standard_Comparable"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_Comparable"** %"0"
ret %"kermeta::standard_Comparable"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::standard_Numeric_kermeta::standard_Object(%"kermeta::standard_Numeric"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::standard_Numeric %"kermeta::standard_Numeric"*(%"kermeta::standard_Object"* %"kermeta::standard_Numeric"*)
%"v0" = call cast_kermeta::standard_Numeric_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::standard_Numeric"* %"v0")
ret %"kermeta::standard_Numeric"* %"v0"}
define internal %"kermeta::standard_Integer"* @"cast_kermeta::standard_Numeric_kermeta::standard_Integer"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 2
%"1" = load %"kermeta::standard_Integer"** %"0"
ret %"kermeta::standard_Integer"* %"1"
}
define internal %"kermeta::standard_Short"* @"cast_kermeta::standard_Numeric_kermeta::standard_Short"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 3
%"1" = load %"kermeta::standard_Short"** %"0"
ret %"kermeta::standard_Short"* %"1"
}
define internal %"kermeta::standard_Long"* @"cast_kermeta::standard_Numeric_kermeta::standard_Long"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 4
%"1" = load %"kermeta::standard_Long"** %"0"
ret %"kermeta::standard_Long"* %"1"
}
define internal %"kermeta::standard_Double"* @"cast_kermeta::standard_Numeric_kermeta::standard_Double"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 5
%"1" = load %"kermeta::standard_Double"** %"0"
ret %"kermeta::standard_Double"* %"1"
}
define internal %"kermeta::standard_Float"* @"cast_kermeta::standard_Numeric_kermeta::standard_Float"(%"kermeta::standard_Numeric"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Numeric"* %"self",i32 0,i32 6
%"1" = load %"kermeta::standard_Float"** %"0"
ret %"kermeta::standard_Float"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_URI_kermeta::standard_Object"(%"kermeta::standard_URI"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_URI"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Map_kermeta::standard_Object"(%"kermeta::standard_Map"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Map"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Collection_kermeta::standard_Object"(%"kermeta::standard_Collection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Collection"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Set"* @"cast_kermeta::standard_Collection_kermeta::standard_Set"(%"kermeta::standard_Collection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Collection"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_Set"** %"0"
ret %"kermeta::standard_Set"* %"1"
}
define internal %"kermeta::standard_Bag"* @"cast_kermeta::standard_Collection_kermeta::standard_Bag"(%"kermeta::standard_Collection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Collection"* %"self",i32 0,i32 2
%"1" = load %"kermeta::standard_Bag"** %"0"
ret %"kermeta::standard_Bag"* %"1"
}
define internal %"kermeta::standard_OrderedCollection"* @"cast_kermeta::standard_Collection_kermeta::standard_OrderedCollection"(%"kermeta::standard_Collection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Collection"* %"self",i32 0,i32 3
%"1" = load %"kermeta::standard_OrderedCollection"** %"0"
ret %"kermeta::standard_OrderedCollection"* %"1"
}
define internal %"kermeta::standard_Collection"* @"cast_kermeta::standard_Set_kermeta::standard_Collection"(%"kermeta::standard_Set"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Set"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Collection"** %"0"
ret %"kermeta::standard_Collection"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::standard_Set_kermeta::standard_Object(%"kermeta::standard_Set"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::standard_Set %"kermeta::standard_Set"*(%"kermeta::standard_Object"* %"kermeta::standard_Set"*)
%"v0" = call cast_kermeta::standard_Set_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::standard_Set"* %"v0")
ret %"kermeta::standard_Set"* %"v0"}
define internal %"kermeta::standard_OrderedSet"* @"cast_kermeta::standard_Set_kermeta::standard_OrderedSet"(%"kermeta::standard_Set"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Set"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_OrderedSet"** %"0"
ret %"kermeta::standard_OrderedSet"* %"1"
}
define internal %"kermeta::standard_Collection"* @"cast_kermeta::standard_Bag_kermeta::standard_Collection"(%"kermeta::standard_Bag"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Bag"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Collection"** %"0"
ret %"kermeta::standard_Collection"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::standard_Bag_kermeta::standard_Object(%"kermeta::standard_Bag"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::standard_Bag %"kermeta::standard_Bag"*(%"kermeta::standard_Object"* %"kermeta::standard_Bag"*)
%"v0" = call cast_kermeta::standard_Bag_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::standard_Bag"* %"v0")
ret %"kermeta::standard_Bag"* %"v0"}
define internal %"kermeta::standard_Sequence"* @"cast_kermeta::standard_Bag_kermeta::standard_Sequence"(%"kermeta::standard_Bag"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Bag"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_Sequence"** %"0"
ret %"kermeta::standard_Sequence"* %"1"
}
define internal %"kermeta::standard_Collection"* @"cast_kermeta::standard_OrderedCollection_kermeta::standard_Collection"(%"kermeta::standard_OrderedCollection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_OrderedCollection"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Collection"** %"0"
ret %"kermeta::standard_Collection"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::standard_OrderedCollection_kermeta::standard_Object(%"kermeta::standard_OrderedCollection"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::standard_OrderedCollection %"kermeta::standard_OrderedCollection"*(%"kermeta::standard_Object"* %"kermeta::standard_OrderedCollection"*)
%"v0" = call cast_kermeta::standard_OrderedCollection_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::standard_OrderedCollection"* %"v0")
ret %"kermeta::standard_OrderedCollection"* %"v0"}
define internal %"kermeta::standard_OrderedSet"* @"cast_kermeta::standard_OrderedCollection_kermeta::standard_OrderedSet"(%"kermeta::standard_OrderedCollection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_OrderedCollection"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_OrderedSet"** %"0"
ret %"kermeta::standard_OrderedSet"* %"1"
}
define internal %"kermeta::standard_Sequence"* @"cast_kermeta::standard_OrderedCollection_kermeta::standard_Sequence"(%"kermeta::standard_OrderedCollection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_OrderedCollection"* %"self",i32 0,i32 2
%"1" = load %"kermeta::standard_Sequence"** %"0"
ret %"kermeta::standard_Sequence"* %"1"
}
define internal %"kermeta::standard_Set"* @"cast_kermeta::standard_OrderedSet_kermeta::standard_Set"(%"kermeta::standard_OrderedSet"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_OrderedSet"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Set"** %"0"
ret %"kermeta::standard_Set"* %"1"
}
define internal %"kermeta::standard_Collection"* cast_kermeta::standard_OrderedSet_kermeta::standard_Collection(%"kermeta::standard_OrderedSet"* self*) readonly{
%"v0" = call cast_kermeta::standard_Collection_kermeta::standard_OrderedSet %"kermeta::standard_OrderedSet"*(%"kermeta::standard_Collection"* %"kermeta::standard_OrderedSet"*)
%"v0" = call cast_kermeta::standard_OrderedSet_kermeta::standard_Collection %"kermeta::standard_Collection"*(%"kermeta::standard_OrderedSet"* %"v0")
ret %"kermeta::standard_OrderedSet"* %"v0"}
define internal %"kermeta::standard_OrderedCollection"* @"cast_kermeta::standard_OrderedSet_kermeta::standard_OrderedCollection"(%"kermeta::standard_OrderedSet"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_OrderedSet"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_OrderedCollection"** %"0"
ret %"kermeta::standard_OrderedCollection"* %"1"
}
define internal %"kermeta::standard_Collection"* cast_kermeta::standard_OrderedSet_kermeta::standard_Collection(%"kermeta::standard_OrderedSet"* self*) readonly{
%"v0" = call cast_kermeta::standard_Collection_kermeta::standard_OrderedSet %"kermeta::standard_OrderedSet"*(%"kermeta::standard_Collection"* %"kermeta::standard_OrderedSet"*)
%"v0" = call cast_kermeta::standard_OrderedSet_kermeta::standard_Collection %"kermeta::standard_Collection"*(%"kermeta::standard_OrderedSet"* %"v0")
ret %"kermeta::standard_OrderedSet"* %"v0"}
define internal %"kermeta::standard_Bag"* @"cast_kermeta::standard_Sequence_kermeta::standard_Bag"(%"kermeta::standard_Sequence"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Sequence"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Bag"** %"0"
ret %"kermeta::standard_Bag"* %"1"
}
define internal %"kermeta::standard_Collection"* cast_kermeta::standard_Sequence_kermeta::standard_Collection(%"kermeta::standard_Sequence"* self*) readonly{
%"v0" = call cast_kermeta::standard_Collection_kermeta::standard_Sequence %"kermeta::standard_Sequence"*(%"kermeta::standard_Collection"* %"kermeta::standard_Sequence"*)
%"v0" = call cast_kermeta::standard_Sequence_kermeta::standard_Collection %"kermeta::standard_Collection"*(%"kermeta::standard_Sequence"* %"v0")
ret %"kermeta::standard_Sequence"* %"v0"}
define internal %"kermeta::standard_OrderedCollection"* @"cast_kermeta::standard_Sequence_kermeta::standard_OrderedCollection"(%"kermeta::standard_Sequence"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Sequence"* %"self",i32 0,i32 1
%"1" = load %"kermeta::standard_OrderedCollection"** %"0"
ret %"kermeta::standard_OrderedCollection"* %"1"
}
define internal %"kermeta::standard_Collection"* cast_kermeta::standard_Sequence_kermeta::standard_Collection(%"kermeta::standard_Sequence"* self*) readonly{
%"v0" = call cast_kermeta::standard_Collection_kermeta::standard_Sequence %"kermeta::standard_Sequence"*(%"kermeta::standard_Collection"* %"kermeta::standard_Sequence"*)
%"v0" = call cast_kermeta::standard_Sequence_kermeta::standard_Collection %"kermeta::standard_Collection"*(%"kermeta::standard_Sequence"* %"v0")
ret %"kermeta::standard_Sequence"* %"v0"}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_Iterator_kermeta::standard_Object"(%"kermeta::standard_Iterator"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_Iterator"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::standard_EachContext_kermeta::standard_Object"(%"kermeta::standard_EachContext"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::standard_EachContext"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::emfpersistence_Resource_kermeta::standard_Object"(%"kermeta::emfpersistence_Resource"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::emfpersistence_Resource"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::emfpersistence_ResourceSet_kermeta::standard_Object"(%"kermeta::emfpersistence_ResourceSet"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::emfpersistence_ResourceSet"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::exceptions_Exception_kermeta::standard_Object"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 1
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_DivisionByZero"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_DivisionByZero"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 2
%"1" = load %"kermeta::exceptions_DivisionByZero"** %"0"
ret %"kermeta::exceptions_DivisionByZero"* %"1"
}
define internal %"kermeta::exceptions_OverflowError"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_OverflowError"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 3
%"1" = load %"kermeta::exceptions_OverflowError"** %"0"
ret %"kermeta::exceptions_OverflowError"* %"1"
}
define internal %"kermeta::exceptions_VoidOperandError"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_VoidOperandError"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 4
%"1" = load %"kermeta::exceptions_VoidOperandError"** %"0"
ret %"kermeta::exceptions_VoidOperandError"* %"1"
}
define internal %"kermeta::exceptions_StringIndexOutOfBound"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_StringIndexOutOfBound"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 5
%"1" = load %"kermeta::exceptions_StringIndexOutOfBound"** %"0"
ret %"kermeta::exceptions_StringIndexOutOfBound"* %"1"
}
define internal %"kermeta::exceptions_StringFormatException"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_StringFormatException"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 6
%"1" = load %"kermeta::exceptions_StringFormatException"** %"0"
ret %"kermeta::exceptions_StringFormatException"* %"1"
}
define internal %"kermeta::exceptions_IndexOutOfBound"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_IndexOutOfBound"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 7
%"1" = load %"kermeta::exceptions_IndexOutOfBound"** %"0"
ret %"kermeta::exceptions_IndexOutOfBound"* %"1"
}
define internal %"kermeta::exceptions_EmptyCollection"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_EmptyCollection"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 8
%"1" = load %"kermeta::exceptions_EmptyCollection"** %"0"
ret %"kermeta::exceptions_EmptyCollection"* %"1"
}
define internal %"kermeta::exceptions_IteratorIsOff"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_IteratorIsOff"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 9
%"1" = load %"kermeta::exceptions_IteratorIsOff"** %"0"
ret %"kermeta::exceptions_IteratorIsOff"* %"1"
}
define internal %"kermeta::exceptions_IOException"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_IOException"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 10
%"1" = load %"kermeta::exceptions_IOException"** %"0"
ret %"kermeta::exceptions_IOException"* %"1"
}
define internal %"kermeta::exceptions_ConstraintViolatedException"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_ConstraintViolatedException"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 11
%"1" = load %"kermeta::exceptions_ConstraintViolatedException"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedException"* %"1"
}
define internal %"kermeta::exceptions_ResourceLoadException"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_ResourceLoadException"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 12
%"1" = load %"kermeta::exceptions_ResourceLoadException"** %"0"
ret %"kermeta::exceptions_ResourceLoadException"* %"1"
}
define internal %"kermeta::exceptions_ResourceSaveException"* @"cast_kermeta::exceptions_Exception_kermeta::exceptions_ResourceSaveException"(%"kermeta::exceptions_Exception"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_Exception"* %"self",i32 0,i32 13
%"1" = load %"kermeta::exceptions_ResourceSaveException"** %"0"
ret %"kermeta::exceptions_ResourceSaveException"* %"1"
}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_Exception"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_RuntimeError_kermeta::standard_Object(%"kermeta::exceptions_RuntimeError"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_RuntimeError %"kermeta::exceptions_RuntimeError"*(%"kermeta::standard_Object"* %"kermeta::exceptions_RuntimeError"*)
%"v0" = call cast_kermeta::exceptions_RuntimeError_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_RuntimeError"* %"v0")
ret %"kermeta::exceptions_RuntimeError"* %"v0"}
define internal %"kermeta::exceptions_CallOnVoidTarget"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_CallOnVoidTarget"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 1
%"1" = load %"kermeta::exceptions_CallOnVoidTarget"** %"0"
ret %"kermeta::exceptions_CallOnVoidTarget"* %"1"
}
define internal %"kermeta::exceptions_TypeCastError"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_TypeCastError"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 2
%"1" = load %"kermeta::exceptions_TypeCastError"** %"0"
ret %"kermeta::exceptions_TypeCastError"* %"1"
}
define internal %"kermeta::exceptions_NotImplementedException"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_NotImplementedException"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 3
%"1" = load %"kermeta::exceptions_NotImplementedException"** %"0"
ret %"kermeta::exceptions_NotImplementedException"* %"1"
}
define internal %"kermeta::exceptions_UpperBoundReachedError"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_UpperBoundReachedError"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 4
%"1" = load %"kermeta::exceptions_UpperBoundReachedError"** %"0"
ret %"kermeta::exceptions_UpperBoundReachedError"* %"1"
}
define internal %"kermeta::exceptions_AbstractClassInstantiationError"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_AbstractClassInstantiationError"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 5
%"1" = load %"kermeta::exceptions_AbstractClassInstantiationError"** %"0"
ret %"kermeta::exceptions_AbstractClassInstantiationError"* %"1"
}
define internal %"kermeta::exceptions_IncompatibleTypeError"* @"cast_kermeta::exceptions_RuntimeError_kermeta::exceptions_IncompatibleTypeError"(%"kermeta::exceptions_RuntimeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_RuntimeError"* %"self",i32 0,i32 6
%"1" = load %"kermeta::exceptions_IncompatibleTypeError"** %"0"
ret %"kermeta::exceptions_IncompatibleTypeError"* %"1"
}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_CallOnVoidTarget_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_CallOnVoidTarget"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_CallOnVoidTarget"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_CallOnVoidTarget_kermeta::exceptions_Exception(%"kermeta::exceptions_CallOnVoidTarget"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_CallOnVoidTarget %"kermeta::exceptions_CallOnVoidTarget"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_CallOnVoidTarget"*)
%"v0" = call cast_kermeta::exceptions_CallOnVoidTarget_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_CallOnVoidTarget"* %"v0")
ret %"kermeta::exceptions_CallOnVoidTarget"* %"v0"}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_TypeCastError_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_TypeCastError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_TypeCastError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_TypeCastError_kermeta::exceptions_Exception(%"kermeta::exceptions_TypeCastError"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_TypeCastError %"kermeta::exceptions_TypeCastError"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_TypeCastError"*)
%"v0" = call cast_kermeta::exceptions_TypeCastError_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_TypeCastError"* %"v0")
ret %"kermeta::exceptions_TypeCastError"* %"v0"}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_NotImplementedException_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_NotImplementedException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_NotImplementedException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_NotImplementedException_kermeta::exceptions_Exception(%"kermeta::exceptions_NotImplementedException"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_NotImplementedException %"kermeta::exceptions_NotImplementedException"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_NotImplementedException"*)
%"v0" = call cast_kermeta::exceptions_NotImplementedException_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_NotImplementedException"* %"v0")
ret %"kermeta::exceptions_NotImplementedException"* %"v0"}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_UpperBoundReachedError_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_UpperBoundReachedError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_UpperBoundReachedError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_UpperBoundReachedError_kermeta::exceptions_Exception(%"kermeta::exceptions_UpperBoundReachedError"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_UpperBoundReachedError %"kermeta::exceptions_UpperBoundReachedError"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_UpperBoundReachedError"*)
%"v0" = call cast_kermeta::exceptions_UpperBoundReachedError_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_UpperBoundReachedError"* %"v0")
ret %"kermeta::exceptions_UpperBoundReachedError"* %"v0"}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_AbstractClassInstantiationError_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_AbstractClassInstantiationError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_AbstractClassInstantiationError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_AbstractClassInstantiationError_kermeta::exceptions_Exception(%"kermeta::exceptions_AbstractClassInstantiationError"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_AbstractClassInstantiationError %"kermeta::exceptions_AbstractClassInstantiationError"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_AbstractClassInstantiationError"*)
%"v0" = call cast_kermeta::exceptions_AbstractClassInstantiationError_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_AbstractClassInstantiationError"* %"v0")
ret %"kermeta::exceptions_AbstractClassInstantiationError"* %"v0"}
define internal %"kermeta::exceptions_RuntimeError"* @"cast_kermeta::exceptions_IncompatibleTypeError_kermeta::exceptions_RuntimeError"(%"kermeta::exceptions_IncompatibleTypeError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_IncompatibleTypeError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_RuntimeError"** %"0"
ret %"kermeta::exceptions_RuntimeError"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_IncompatibleTypeError_kermeta::exceptions_Exception(%"kermeta::exceptions_IncompatibleTypeError"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_IncompatibleTypeError %"kermeta::exceptions_IncompatibleTypeError"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_IncompatibleTypeError"*)
%"v0" = call cast_kermeta::exceptions_IncompatibleTypeError_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_IncompatibleTypeError"* %"v0")
ret %"kermeta::exceptions_IncompatibleTypeError"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_DivisionByZero_kermeta::exceptions_Exception"(%"kermeta::exceptions_DivisionByZero"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_DivisionByZero"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_DivisionByZero_kermeta::standard_Object(%"kermeta::exceptions_DivisionByZero"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_DivisionByZero %"kermeta::exceptions_DivisionByZero"*(%"kermeta::standard_Object"* %"kermeta::exceptions_DivisionByZero"*)
%"v0" = call cast_kermeta::exceptions_DivisionByZero_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_DivisionByZero"* %"v0")
ret %"kermeta::exceptions_DivisionByZero"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_OverflowError_kermeta::exceptions_Exception"(%"kermeta::exceptions_OverflowError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_OverflowError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_OverflowError_kermeta::standard_Object(%"kermeta::exceptions_OverflowError"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_OverflowError %"kermeta::exceptions_OverflowError"*(%"kermeta::standard_Object"* %"kermeta::exceptions_OverflowError"*)
%"v0" = call cast_kermeta::exceptions_OverflowError_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_OverflowError"* %"v0")
ret %"kermeta::exceptions_OverflowError"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_VoidOperandError_kermeta::exceptions_Exception"(%"kermeta::exceptions_VoidOperandError"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_VoidOperandError"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_VoidOperandError_kermeta::standard_Object(%"kermeta::exceptions_VoidOperandError"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_VoidOperandError %"kermeta::exceptions_VoidOperandError"*(%"kermeta::standard_Object"* %"kermeta::exceptions_VoidOperandError"*)
%"v0" = call cast_kermeta::exceptions_VoidOperandError_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_VoidOperandError"* %"v0")
ret %"kermeta::exceptions_VoidOperandError"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_StringIndexOutOfBound_kermeta::exceptions_Exception"(%"kermeta::exceptions_StringIndexOutOfBound"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_StringIndexOutOfBound"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_StringIndexOutOfBound_kermeta::standard_Object(%"kermeta::exceptions_StringIndexOutOfBound"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_StringIndexOutOfBound %"kermeta::exceptions_StringIndexOutOfBound"*(%"kermeta::standard_Object"* %"kermeta::exceptions_StringIndexOutOfBound"*)
%"v0" = call cast_kermeta::exceptions_StringIndexOutOfBound_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_StringIndexOutOfBound"* %"v0")
ret %"kermeta::exceptions_StringIndexOutOfBound"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_StringFormatException_kermeta::exceptions_Exception"(%"kermeta::exceptions_StringFormatException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_StringFormatException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_StringFormatException_kermeta::standard_Object(%"kermeta::exceptions_StringFormatException"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_StringFormatException %"kermeta::exceptions_StringFormatException"*(%"kermeta::standard_Object"* %"kermeta::exceptions_StringFormatException"*)
%"v0" = call cast_kermeta::exceptions_StringFormatException_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_StringFormatException"* %"v0")
ret %"kermeta::exceptions_StringFormatException"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_IndexOutOfBound_kermeta::exceptions_Exception"(%"kermeta::exceptions_IndexOutOfBound"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_IndexOutOfBound"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_IndexOutOfBound_kermeta::standard_Object(%"kermeta::exceptions_IndexOutOfBound"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_IndexOutOfBound %"kermeta::exceptions_IndexOutOfBound"*(%"kermeta::standard_Object"* %"kermeta::exceptions_IndexOutOfBound"*)
%"v0" = call cast_kermeta::exceptions_IndexOutOfBound_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_IndexOutOfBound"* %"v0")
ret %"kermeta::exceptions_IndexOutOfBound"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_EmptyCollection_kermeta::exceptions_Exception"(%"kermeta::exceptions_EmptyCollection"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_EmptyCollection"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_EmptyCollection_kermeta::standard_Object(%"kermeta::exceptions_EmptyCollection"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_EmptyCollection %"kermeta::exceptions_EmptyCollection"*(%"kermeta::standard_Object"* %"kermeta::exceptions_EmptyCollection"*)
%"v0" = call cast_kermeta::exceptions_EmptyCollection_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_EmptyCollection"* %"v0")
ret %"kermeta::exceptions_EmptyCollection"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_IteratorIsOff_kermeta::exceptions_Exception"(%"kermeta::exceptions_IteratorIsOff"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_IteratorIsOff"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_IteratorIsOff_kermeta::standard_Object(%"kermeta::exceptions_IteratorIsOff"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_IteratorIsOff %"kermeta::exceptions_IteratorIsOff"*(%"kermeta::standard_Object"* %"kermeta::exceptions_IteratorIsOff"*)
%"v0" = call cast_kermeta::exceptions_IteratorIsOff_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_IteratorIsOff"* %"v0")
ret %"kermeta::exceptions_IteratorIsOff"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_IOException_kermeta::exceptions_Exception"(%"kermeta::exceptions_IOException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_IOException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_IOException_kermeta::standard_Object(%"kermeta::exceptions_IOException"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_IOException %"kermeta::exceptions_IOException"*(%"kermeta::standard_Object"* %"kermeta::exceptions_IOException"*)
%"v0" = call cast_kermeta::exceptions_IOException_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_IOException"* %"v0")
ret %"kermeta::exceptions_IOException"* %"v0"}
define internal %"kermeta::exceptions_FileNotFoundException"* @"cast_kermeta::exceptions_IOException_kermeta::exceptions_FileNotFoundException"(%"kermeta::exceptions_IOException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_IOException"* %"self",i32 0,i32 1
%"1" = load %"kermeta::exceptions_FileNotFoundException"** %"0"
ret %"kermeta::exceptions_FileNotFoundException"* %"1"
}
define internal %"kermeta::exceptions_IOException"* @"cast_kermeta::exceptions_FileNotFoundException_kermeta::exceptions_IOException"(%"kermeta::exceptions_FileNotFoundException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_FileNotFoundException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_IOException"** %"0"
ret %"kermeta::exceptions_IOException"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_FileNotFoundException_kermeta::exceptions_Exception(%"kermeta::exceptions_FileNotFoundException"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_FileNotFoundException %"kermeta::exceptions_FileNotFoundException"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_FileNotFoundException"*)
%"v0" = call cast_kermeta::exceptions_FileNotFoundException_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_FileNotFoundException"* %"v0")
ret %"kermeta::exceptions_FileNotFoundException"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_ConstraintViolatedException_kermeta::exceptions_Exception"(%"kermeta::exceptions_ConstraintViolatedException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_ConstraintViolatedException_kermeta::standard_Object(%"kermeta::exceptions_ConstraintViolatedException"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_ConstraintViolatedException %"kermeta::exceptions_ConstraintViolatedException"*(%"kermeta::standard_Object"* %"kermeta::exceptions_ConstraintViolatedException"*)
%"v0" = call cast_kermeta::exceptions_ConstraintViolatedException_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_ConstraintViolatedException"* %"v0")
ret %"kermeta::exceptions_ConstraintViolatedException"* %"v0"}
define internal %"kermeta::exceptions_ConstraintViolatedPre"* @"cast_kermeta::exceptions_ConstraintViolatedException_kermeta::exceptions_ConstraintViolatedPre"(%"kermeta::exceptions_ConstraintViolatedException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedException"* %"self",i32 0,i32 1
%"1" = load %"kermeta::exceptions_ConstraintViolatedPre"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedPre"* %"1"
}
define internal %"kermeta::exceptions_ConstraintViolatedPost"* @"cast_kermeta::exceptions_ConstraintViolatedException_kermeta::exceptions_ConstraintViolatedPost"(%"kermeta::exceptions_ConstraintViolatedException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedException"* %"self",i32 0,i32 2
%"1" = load %"kermeta::exceptions_ConstraintViolatedPost"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedPost"* %"1"
}
define internal %"kermeta::exceptions_ConstraintViolatedInv"* @"cast_kermeta::exceptions_ConstraintViolatedException_kermeta::exceptions_ConstraintViolatedInv"(%"kermeta::exceptions_ConstraintViolatedException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedException"* %"self",i32 0,i32 3
%"1" = load %"kermeta::exceptions_ConstraintViolatedInv"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedInv"* %"1"
}
define internal %"kermeta::exceptions_ConstraintViolatedException"* @"cast_kermeta::exceptions_ConstraintViolatedPre_kermeta::exceptions_ConstraintViolatedException"(%"kermeta::exceptions_ConstraintViolatedPre"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedPre"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_ConstraintViolatedException"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedException"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_ConstraintViolatedPre_kermeta::exceptions_Exception(%"kermeta::exceptions_ConstraintViolatedPre"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_ConstraintViolatedPre %"kermeta::exceptions_ConstraintViolatedPre"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_ConstraintViolatedPre"*)
%"v0" = call cast_kermeta::exceptions_ConstraintViolatedPre_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_ConstraintViolatedPre"* %"v0")
ret %"kermeta::exceptions_ConstraintViolatedPre"* %"v0"}
define internal %"kermeta::exceptions_ConstraintViolatedException"* @"cast_kermeta::exceptions_ConstraintViolatedPost_kermeta::exceptions_ConstraintViolatedException"(%"kermeta::exceptions_ConstraintViolatedPost"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedPost"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_ConstraintViolatedException"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedException"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_ConstraintViolatedPost_kermeta::exceptions_Exception(%"kermeta::exceptions_ConstraintViolatedPost"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_ConstraintViolatedPost %"kermeta::exceptions_ConstraintViolatedPost"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_ConstraintViolatedPost"*)
%"v0" = call cast_kermeta::exceptions_ConstraintViolatedPost_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_ConstraintViolatedPost"* %"v0")
ret %"kermeta::exceptions_ConstraintViolatedPost"* %"v0"}
define internal %"kermeta::exceptions_ConstraintViolatedException"* @"cast_kermeta::exceptions_ConstraintViolatedInv_kermeta::exceptions_ConstraintViolatedException"(%"kermeta::exceptions_ConstraintViolatedInv"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintViolatedInv"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_ConstraintViolatedException"** %"0"
ret %"kermeta::exceptions_ConstraintViolatedException"* %"1"
}
define internal %"kermeta::exceptions_Exception"* cast_kermeta::exceptions_ConstraintViolatedInv_kermeta::exceptions_Exception(%"kermeta::exceptions_ConstraintViolatedInv"* self*) readonly{
%"v0" = call cast_kermeta::exceptions_Exception_kermeta::exceptions_ConstraintViolatedInv %"kermeta::exceptions_ConstraintViolatedInv"*(%"kermeta::exceptions_Exception"* %"kermeta::exceptions_ConstraintViolatedInv"*)
%"v0" = call cast_kermeta::exceptions_ConstraintViolatedInv_kermeta::exceptions_Exception %"kermeta::exceptions_Exception"*(%"kermeta::exceptions_ConstraintViolatedInv"* %"v0")
ret %"kermeta::exceptions_ConstraintViolatedInv"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_ResourceLoadException_kermeta::exceptions_Exception"(%"kermeta::exceptions_ResourceLoadException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ResourceLoadException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_ResourceLoadException_kermeta::standard_Object(%"kermeta::exceptions_ResourceLoadException"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_ResourceLoadException %"kermeta::exceptions_ResourceLoadException"*(%"kermeta::standard_Object"* %"kermeta::exceptions_ResourceLoadException"*)
%"v0" = call cast_kermeta::exceptions_ResourceLoadException_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_ResourceLoadException"* %"v0")
ret %"kermeta::exceptions_ResourceLoadException"* %"v0"}
define internal %"kermeta::exceptions_Exception"* @"cast_kermeta::exceptions_ResourceSaveException_kermeta::exceptions_Exception"(%"kermeta::exceptions_ResourceSaveException"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ResourceSaveException"* %"self",i32 0,i32 0
%"1" = load %"kermeta::exceptions_Exception"** %"0"
ret %"kermeta::exceptions_Exception"* %"1"
}
define internal %"kermeta::standard_Object"* cast_kermeta::exceptions_ResourceSaveException_kermeta::standard_Object(%"kermeta::exceptions_ResourceSaveException"* self*) readonly{
%"v0" = call cast_kermeta::standard_Object_kermeta::exceptions_ResourceSaveException %"kermeta::exceptions_ResourceSaveException"*(%"kermeta::standard_Object"* %"kermeta::exceptions_ResourceSaveException"*)
%"v0" = call cast_kermeta::exceptions_ResourceSaveException_kermeta::standard_Object %"kermeta::standard_Object"*(%"kermeta::exceptions_ResourceSaveException"* %"v0")
ret %"kermeta::exceptions_ResourceSaveException"* %"v0"}
define internal %"kermeta::standard_Object"* @"cast_kermeta::exceptions_ConstraintsDiagnostic_kermeta::standard_Object"(%"kermeta::exceptions_ConstraintsDiagnostic"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::exceptions_ConstraintsDiagnostic"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::io_FileIO_kermeta::standard_Object"(%"kermeta::io_FileIO"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::io_FileIO"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::io_StdIO_kermeta::standard_Object"(%"kermeta::io_StdIO"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::io_StdIO"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_kermeta::utils_Hashtable_kermeta::standard_Object"(%"kermeta::utils_Hashtable"* %"self") readonly inlinehint{
%"0" = getelementptr %"kermeta::utils_Hashtable"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_root_package_ArabicNumber_kermeta::standard_Object"(%"root_package_ArabicNumber"* %"self") readonly inlinehint{
%"0" = getelementptr %"root_package_ArabicNumber"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_root_package_Digit_kermeta::standard_Object"(%"root_package_Digit"* %"self") readonly inlinehint{
%"0" = getelementptr %"root_package_Digit"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_root_package_RomanNumber_kermeta::standard_Object"(%"root_package_RomanNumber"* %"self") readonly inlinehint{
%"0" = getelementptr %"root_package_RomanNumber"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_root_package_Letter_kermeta::standard_Object"(%"root_package_Letter"* %"self") readonly inlinehint{
%"0" = getelementptr %"root_package_Letter"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal %"kermeta::standard_Object"* @"cast_root_package_Main_kermeta::standard_Object"(%"root_package_Main"* %"self") readonly inlinehint{
%"0" = getelementptr %"root_package_Main"* %"self",i32 0,i32 0
%"1" = load %"kermeta::standard_Object"** %"0"
ret %"kermeta::standard_Object"* %"1"
}
define internal void @"org::kermeta::language::structure_Class.new1"(){
ret void
}
define internal void @"kermeta::standard_Object.getMetaClass2"(){
ret void
}
define internal void @"kermeta::standard_Object.container3"(){
ret void
}
define internal void @"kermeta::standard_Object.removeFromContainer4"(){
ret void
}
define internal void @"kermeta::standard_Object.checkInvariants5"(){
ret void
}
define internal void @"kermeta::standard_Object.checkInvariants6"(%"kermeta::standard_Boolean" %"stopOnError"){
ret void
}
define internal void @"kermeta::standard_Object.checkAllInvariants7"(){
ret void
}
define internal void @"kermeta::standard_Object.checkAllInvariants8"(%"kermeta::standard_Boolean" %"stopOnError"){
ret void
}
define internal void @"kermeta::standard_Object.checkInvariant9"(%"org::kermeta::language::structure_Constraint" %"constraint"){
ret void
}
define internal void @"kermeta::standard_Object.equals10"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Object.isNotEqual11"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Object.isDirectInstanceOf12"(%"org::kermeta::language::structure_Type" %"type"){
ret void
}
define internal void @"kermeta::standard_Object.isKindOf13"(%"org::kermeta::language::structure_Type" %"type"){
ret void
}
define internal void @"kermeta::standard_Object.get14"(%"org::kermeta::language::structure_Property" %"property"){
ret void
}
define internal void @"kermeta::standard_Object.set15"(%"org::kermeta::language::structure_Property" %"property", %"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Object.isSet16"(%"org::kermeta::language::structure_Property" %"property"){
ret void
}
define internal void @"kermeta::standard_Object.unset17"(%"org::kermeta::language::structure_Property" %"property"){
ret void
}
define internal void @"kermeta::standard_Object.oid18"(){
ret void
}
define internal void @"kermeta::standard_Object.toString19"(){
ret void
}
define internal void @"kermeta::standard_Object.isVoid20"(){
ret void
}
define internal void @"kermeta::standard_Object.hashCode21"(){
ret void
}
define internal void @"kermeta::standard_Object.asType22"(%"org::kermeta::language::structure_Type" %"type"){
ret void
}
define internal void @"kermeta::standard_Object.isInstanceOf23"(%"org::kermeta::language::structure_Type" %"type"){
ret void
}
define internal void @"kermeta::standard_Object.containingResource24"(){
ret void
}
define internal void @"kermeta::standard_Object.invoke25"(%"org::kermeta::language::structure_Operation" %"op", %"kermeta::standard_OrderedCollection" %"args"){
ret void
}
define internal void @"kermeta::standard_String.plus26"(%"kermeta::standard_Object" %"other"){
ret void
}
define internal void @"kermeta::standard_String.equals27"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.toString28"(){
ret void
}
define internal void @"kermeta::standard_String.hashCode29"(){
ret void
}
define internal void @"kermeta::standard_String.compareTo30"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.indexOf31"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.charAt32"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.codePointAt33"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.codePointBefore34"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.codePointCount35"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.compareToIgnoreCase36"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.concat37"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.contentEquals38"(%"kermeta::standard_StringBuffer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.copyValueOf39"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Integer" %"arg2"){
ret void
}
define internal void @"kermeta::standard_String.copyValueOf40"(%"kermeta::standard_Collection" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.endsWith41"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.equalsIgnoreCase42"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.format43"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Collection" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.getChars44"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Collection" %"arg2", %"kermeta::standard_Integer" %"arg3"){
ret void
}
define internal void @"kermeta::standard_String.intern45"(){
ret void
}
define internal void @"kermeta::standard_String.isEmpty46"(){
ret void
}
define internal void @"kermeta::standard_String.lastIndexOf47"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.size48"(){
ret void
}
define internal void @"kermeta::standard_String.matches49"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.offsetByCodePoints50"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.regionMatches51"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_String" %"arg1", %"kermeta::standard_Integer" %"arg2", %"kermeta::standard_Integer" %"arg3"){
ret void
}
define internal void @"kermeta::standard_String.regionMatches52"(%"kermeta::standard_Boolean" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_String" %"arg2", %"kermeta::standard_Integer" %"arg3", %"kermeta::standard_Integer" %"arg4"){
ret void
}
define internal void @"kermeta::standard_String.replace53"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_String" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.replaceAll54"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_String" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.replaceFirst55"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_String" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.split56"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.split57"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.startsWith58"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.startsWith59"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.substring60"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.substring61"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.toCharArray62"(){
ret void
}
define internal void @"kermeta::standard_String.toLowerCase63"(){
ret void
}
define internal void @"kermeta::standard_String.toUpperCase64"(){
ret void
}
define internal void @"kermeta::standard_String.trim65"(){
ret void
}
define internal void @"kermeta::standard_String.wait66"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_String.wait67"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_String.wait68"(){
ret void
}
define internal void @"kermeta::standard_String.notify69"(){
ret void
}
define internal void @"kermeta::standard_String.notifyAll70"(){
ret void
}
define internal void @"kermeta::standard_String.allCharacters71"(){
ret void
}
define internal void @"kermeta::standard_String.append72"(%"kermeta::standard_String" %"other"){
ret void
}
define internal void @"kermeta::standard_String.contains73"(%"kermeta::standard_String" %"other"){
ret void
}
define internal void @"kermeta::standard_String.elementAt74"(%"kermeta::standard_Integer" %"index"){
ret void
}
define internal void @"kermeta::standard_String.toInteger75"(){
ret void
}
define internal void @"kermeta::standard_String.replaceKeyword76"(%"kermeta::standard_String" %"keyword", %"kermeta::standard_String" %"replacement"){
ret void
}
define internal void @"kermeta::standard_String.toReal77"(){
ret void
}
define internal void @"kermeta::standard_String.toDouble78"(){
ret void
}
define internal void @"kermeta::standard_String.toBoolean79"(){
ret void
}
define internal void @"kermeta::standard_String.toURI80"(){
ret void
}
define internal void @"kermeta::standard_Integer.numberOfLeadingZeros81"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.numberOfTrailingZeros82"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.bitCount83"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.equals84"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.toString85"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Integer.toString86"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.toString87"(){
ret void
}
define internal void @"kermeta::standard_Integer.hashCode88"(){
ret void
}
define internal void @"kermeta::standard_Integer.reverseBytes89"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.compareTo90"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.shortValue91"(){
ret void
}
define internal void @"kermeta::standard_Integer.intValue92"(){
ret void
}
define internal void @"kermeta::standard_Integer.longValue93"(){
ret void
}
define internal void @"kermeta::standard_Integer.floatValue94"(){
ret void
}
define internal void @"kermeta::standard_Integer.doubleValue95"(){
ret void
}
define internal void @"kermeta::standard_Integer.toHexString96"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.decode97"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.reverse98"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.parseInt99"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Integer.parseInt100"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.getInteger101"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.getInteger102"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Integer.highestOneBit103"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.lowestOneBit104"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.rotateLeft105"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Integer.rotateRight106"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Integer.signum107"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.toBinaryString108"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.toOctalString109"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.wait110"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Integer.wait111"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Integer.wait112"(){
ret void
}
define internal void @"kermeta::standard_Integer.notify113"(){
ret void
}
define internal void @"kermeta::standard_Integer.notifyAll114"(){
ret void
}
define internal void @"kermeta::standard_Integer.times115"(%"i32" %"body"){
ret void
}
define internal void @"kermeta::standard_Integer.toReal116"(){
ret void
}
define internal void @"kermeta::standard_Boolean.equals117"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Boolean.toString118"(%"kermeta::standard_Boolean" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Boolean.toString119"(){
ret void
}
define internal void @"kermeta::standard_Boolean.hashCode120"(){
ret void
}
define internal void @"kermeta::standard_Boolean.compareTo121"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Boolean.getBoolean122"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Boolean.booleanValue123"(){
ret void
}
define internal void @"kermeta::standard_Boolean.parseBoolean124"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Boolean.wait125"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Boolean.wait126"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Boolean.wait127"(){
ret void
}
define internal void @"kermeta::standard_Boolean.notify128"(){
ret void
}
define internal void @"kermeta::standard_Boolean.or129"(%"kermeta::standard_Boolean" %"other"){
ret void
}
define internal void @"kermeta::standard_Boolean.and130"(%"kermeta::standard_Boolean" %"other"){
ret void
}
define internal void @"kermeta::standard_Boolean.not131"(){
ret void
}
define internal void @"kermeta::standard_Boolean.andThen132"(%"i32" %"func"){
ret void
}
define internal void @"kermeta::standard_Boolean.orElse133"(%"i32" %"func"){
ret void
}
define internal void @"kermeta::standard_Random.equals134"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Random.toString135"(){
ret void
}
define internal void @"kermeta::standard_Random.hashCode136"(){
ret void
}
define internal void @"kermeta::standard_Random.nextBoolean137"(){
ret void
}
define internal void @"kermeta::standard_Random.nextDouble138"(){
ret void
}
define internal void @"kermeta::standard_Random.nextFloat139"(){
ret void
}
define internal void @"kermeta::standard_Random.nextGaussian140"(){
ret void
}
define internal void @"kermeta::standard_Random.nextInt141"(){
ret void
}
define internal void @"kermeta::standard_Random.nextInt142"(%"kermeta::standard_Integer" %"n"){
ret void
}
define internal void @"kermeta::standard_Random.nextLong143"(){
ret void
}
define internal void @"kermeta::standard_Random.setSeed144"(%"kermeta::standard_Long" %"s"){
ret void
}
define internal void @"kermeta::standard_Date.equals145"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.toString146"(){
ret void
}
define internal void @"kermeta::standard_Date.hashCode147"(){
ret void
}
define internal void @"kermeta::standard_Date.clone148"(){
ret void
}
define internal void @"kermeta::standard_Date.compareTo149"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.after150"(%"kermeta::standard_Date" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.before151"(%"kermeta::standard_Date" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.parse152"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.getDate153"(){
ret void
}
define internal void @"kermeta::standard_Date.getHours154"(){
ret void
}
define internal void @"kermeta::standard_Date.getMinutes155"(){
ret void
}
define internal void @"kermeta::standard_Date.getMonth156"(){
ret void
}
define internal void @"kermeta::standard_Date.getSeconds157"(){
ret void
}
define internal void @"kermeta::standard_Date.getTime158"(){
ret void
}
define internal void @"kermeta::standard_Date.getYear159"(){
ret void
}
define internal void @"kermeta::standard_Date.setTime160"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.UTC161"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Integer" %"arg2", %"kermeta::standard_Integer" %"arg3", %"kermeta::standard_Integer" %"arg4", %"kermeta::standard_Integer" %"arg5"){
ret void
}
define internal void @"kermeta::standard_Date.getDay162"(){
ret void
}
define internal void @"kermeta::standard_Date.getTimezoneOffset163"(){
ret void
}
define internal void @"kermeta::standard_Date.setDate164"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.setHours165"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.setMinutes166"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.setMonth167"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.setSeconds168"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.setYear169"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.toGMTString170"(){
ret void
}
define internal void @"kermeta::standard_Date.toLocaleString171"(){
ret void
}
define internal void @"kermeta::standard_Date.wait172"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Date.wait173"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Date.wait174"(){
ret void
}
define internal void @"kermeta::standard_Date.notify175"(){
ret void
}
define internal void @"kermeta::standard_Date.notifyAll176"(){
ret void
}
define internal void @"kermeta::standard_Short.equals177"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.toString178"(%"kermeta::standard_Short" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.toString179"(){
ret void
}
define internal void @"kermeta::standard_Short.hashCode180"(){
ret void
}
define internal void @"kermeta::standard_Short.reverseBytes181"(%"kermeta::standard_Short" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.compareTo182"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.shortValue183"(){
ret void
}
define internal void @"kermeta::standard_Short.intValue184"(){
ret void
}
define internal void @"kermeta::standard_Short.longValue185"(){
ret void
}
define internal void @"kermeta::standard_Short.floatValue186"(){
ret void
}
define internal void @"kermeta::standard_Short.doubleValue187"(){
ret void
}
define internal void @"kermeta::standard_Short.valueOf188"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Short.decode189"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.parseShort190"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.parseShort191"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Short.wait192"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Short.wait193"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Short.wait194"(){
ret void
}
define internal void @"kermeta::standard_Short.notify195"(){
ret void
}
define internal void @"kermeta::standard_Short.notifyAll196"(){
ret void
}
define internal void @"kermeta::standard_Long.equals197"(%"kermeta::standard_Object" %"obj"){
ret void
}
define internal void @"kermeta::standard_Long.hashCode198"(){
ret void
}
define internal void @"kermeta::standard_Long.toString199"(){
ret void
}
define internal void @"kermeta::standard_Long.intValue200"(){
ret void
}
define internal void @"kermeta::standard_Long.shortValue201"(){
ret void
}
define internal void @"kermeta::standard_Long.longValue202"(){
ret void
}
define internal void @"kermeta::standard_Long.floatValue203"(){
ret void
}
define internal void @"kermeta::standard_Long.doubleValue204"(){
ret void
}
define internal void @"kermeta::standard_Double.equals205"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.toString206"(%"kermeta::standard_Double" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.toString207"(){
ret void
}
define internal void @"kermeta::standard_Double.hashCode208"(){
ret void
}
define internal void @"kermeta::standard_Double.doubleToRawLongBits209"(%"kermeta::standard_Double" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.doubleToLongBits210"(%"kermeta::standard_Double" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.longBitsToDouble211"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.compareTo212"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.shortValue213"(){
ret void
}
define internal void @"kermeta::standard_Double.intValue214"(){
ret void
}
define internal void @"kermeta::standard_Double.longValue215"(){
ret void
}
define internal void @"kermeta::standard_Double.floatValue216"(){
ret void
}
define internal void @"kermeta::standard_Double.doubleValue217"(){
ret void
}
define internal void @"kermeta::standard_Double.toHexString218"(%"kermeta::standard_Double" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.compare219"(%"kermeta::standard_Double" %"arg0", %"kermeta::standard_Double" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Double.isNaN220"(%"kermeta::standard_Double" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.isNaN221"(){
ret void
}
define internal void @"kermeta::standard_Double.isInfinite222"(%"kermeta::standard_Double" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.isInfinite223"(){
ret void
}
define internal void @"kermeta::standard_Double.parseDouble224"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.wait225"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Double.wait226"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Double.wait227"(){
ret void
}
define internal void @"kermeta::standard_Double.notify228"(){
ret void
}
define internal void @"kermeta::standard_Double.notifyAll229"(){
ret void
}
define internal void @"kermeta::standard_Float.equals230"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.toString231"(%"kermeta::standard_Float" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.toString232"(){
ret void
}
define internal void @"kermeta::standard_Float.hashCode233"(){
ret void
}
define internal void @"kermeta::standard_Float.floatToRawIntBits234"(%"kermeta::standard_Float" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.floatToIntBits235"(%"kermeta::standard_Float" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.intBitsToFloat236"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.compareTo237"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.shortValue238"(){
ret void
}
define internal void @"kermeta::standard_Float.intValue239"(){
ret void
}
define internal void @"kermeta::standard_Float.longValue240"(){
ret void
}
define internal void @"kermeta::standard_Float.floatValue241"(){
ret void
}
define internal void @"kermeta::standard_Float.doubleValue242"(){
ret void
}
define internal void @"kermeta::standard_Float.toHexString243"(%"kermeta::standard_Float" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.compare244"(%"kermeta::standard_Float" %"arg0", %"kermeta::standard_Float" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Float.isNaN245"(%"kermeta::standard_Float" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.isNaN246"(){
ret void
}
define internal void @"kermeta::standard_Float.isInfinite247"(%"kermeta::standard_Float" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.isInfinite248"(){
ret void
}
define internal void @"kermeta::standard_Float.parseFloat249"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.wait250"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Float.wait251"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Float.wait252"(){
ret void
}
define internal void @"kermeta::standard_Float.notify253"(){
ret void
}
define internal void @"kermeta::standard_Float.notifyAll254"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.toString255"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.append256"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.indexOf257"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.indexOf258"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.charAt259"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.codePointAt260"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.codePointBefore261"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.codePointCount262"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.getChars263"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Collection" %"arg2", %"kermeta::standard_Integer" %"arg3"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.lastIndexOf264"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.lastIndexOf265"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.size266"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.offsetByCodePoints267"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.replace268"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_String" %"arg2"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.substring269"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.substring270"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.appendCodePoint271"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.capacity272"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.delete273"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.deleteCharAt274"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.ensureCapacity275"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.insert276"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_String" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.reverse277"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.setCharAt278"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Character" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.setLength279"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.trimToSize280"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.wait281"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.wait282"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.wait283"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.equals284"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_StringBuffer.hashCode285"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.notify286"(){
ret void
}
define internal void @"kermeta::standard_StringBuffer.notifyAll287"(){
ret void
}
define internal void @"kermeta::standard_Character.equals288"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.toString289"(){
ret void
}
define internal void @"kermeta::standard_Character.toString290"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.hashCode291"(){
ret void
}
define internal void @"kermeta::standard_Character.reverseBytes292"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.compareTo293"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.charValue294"(){
ret void
}
define internal void @"kermeta::standard_Character.valueOf295"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.charCount296"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.codePointAt297"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Character.codePointAt298"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Integer" %"arg2"){
ret void
}
define internal void @"kermeta::standard_Character.codePointBefore299"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Character.codePointBefore300"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Integer" %"arg2"){
ret void
}
define internal void @"kermeta::standard_Character.codePointCount301"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Integer" %"arg2"){
ret void
}
define internal void @"kermeta::standard_Character.offsetByCodePoints302"(%"kermeta::standard_Collection" %"arg0", %"kermeta::standard_Integer" %"arg1", %"kermeta::standard_Integer" %"arg2", %"kermeta::standard_Integer" %"arg3", %"kermeta::standard_Integer" %"arg4"){
ret void
}
define internal void @"kermeta::standard_Character.toChars303"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Sequence" %"arg1", %"kermeta::standard_Integer" %"arg2"){
ret void
}
define internal void @"kermeta::standard_Character.toChars304"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.toLowerCase305"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.toUpperCase306"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.getType307"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isHighSurrogate308"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isLowSurrogate309"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isValidCodePoint310"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.forDigit311"(%"kermeta::standard_Integer" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Character.getNumericValue312"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isDefined313"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isDigit314"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isISOControl315"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isIdentifierIgnorable316"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isJavaLetter317"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isJavaLetterOrDigit318"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isLetter319"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isLetterOrDigit320"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isLowerCase321"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isMirrored322"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isSpace323"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isSpaceChar324"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isSupplementaryCodePoint325"(%"kermeta::standard_Integer" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isSurrogatePair326"(%"kermeta::standard_Character" %"arg0", %"kermeta::standard_Character" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Character.isTitleCase327"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isUnicodeIdentifierPart328"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isUnicodeIdentifierStart329"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isUpperCase330"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.isWhitespace331"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.toCodePoint332"(%"kermeta::standard_Character" %"arg0", %"kermeta::standard_Character" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Character.toTitleCase333"(%"kermeta::standard_Character" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.wait334"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::standard_Character.wait335"(%"kermeta::standard_Long" %"arg0", %"kermeta::standard_Integer" %"arg1"){
ret void
}
define internal void @"kermeta::standard_Character.wait336"(){
ret void
}
define internal void @"kermeta::standard_Character.notify337"(){
ret void
}
define internal void @"kermeta::standard_Character.notifyAll338"(){
ret void
}
define internal void @"kermeta::standard_Summable.plus339"(%"FIXME_ObjectTypeVariable" %"other"){
ret void
}
define internal void @"kermeta::standard_Comparable.compareTo340"(%"kermeta::standard_Object" %"other"){
ret void
}
define internal void @"kermeta::standard_Comparable.isGreater341"(%"kermeta::standard_Object" %"other"){
ret void
}
define internal void @"kermeta::standard_Comparable.isLower342"(%"kermeta::standard_Object" %"other"){
ret void
}
define internal void @"kermeta::standard_Comparable.isLowerOrEqual343"(%"kermeta::standard_Object" %"other"){
ret void
}
define internal void @"kermeta::standard_Comparable.isGreaterOrEqual344"(%"kermeta::standard_Object" %"other"){
ret void
}
define internal void @"kermeta::standard_Numeric.minus345"(%"FIXME_ObjectTypeVariable" %"other"){
ret void
}
define internal void @"kermeta::standard_Numeric.mult346"(%"FIXME_ObjectTypeVariable" %"other"){
ret void
}
define internal void @"kermeta::standard_Numeric.div347"(%"FIXME_ObjectTypeVariable" %"other"){
ret void
}
define internal void @"kermeta::standard_Numeric.mod348"(%"FIXME_ObjectTypeVariable" %"other"){
ret void
}
define internal void @"kermeta::standard_Numeric.uminus349"(){
ret void
}
define internal void @"kermeta::standard_URI.toString350"(){
ret void
}
define internal void @"kermeta::standard_URI.appendSegment351"(%"kermeta::standard_String" %"pathSegment"){
ret void
}
define internal void @"kermeta::standard_URI.appendSegments352"(%"kermeta::standard_Sequence" %"pathSegments"){
ret void
}
define internal void @"kermeta::standard_Collection.add353"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.addSafe354"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.remove355"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.clear356"(){
ret void
}
define internal void @"kermeta::standard_Collection.addAll357"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Collection.contains358"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.includes359"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.containsAll360"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Collection.includesAll361"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Collection.excludes362"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.excludesAll363"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Collection.size364"(){
ret void
}
define internal void @"kermeta::standard_Collection.empty365"(){
ret void
}
define internal void @"kermeta::standard_Collection.isEmpty366"(){
ret void
}
define internal void @"kermeta::standard_Collection.isNotEmpty367"(){
ret void
}
define internal void @"kermeta::standard_Collection.iterator368"(){
ret void
}
define internal void @"kermeta::standard_Collection.one369"(){
ret void
}
define internal void @"kermeta::standard_Collection.any370"(){
ret void
}
define internal void @"kermeta::standard_Collection.each371"(%"i32" %"func"){
ret void
}
define internal void @"kermeta::standard_Collection.indexedEach372"(%"i32" %"func"){
ret void
}
define internal void @"kermeta::standard_Collection.forAll373"(%"i32" %"func"){
ret void
}
define internal void @"kermeta::standard_Collection.forAllCpl374"(%"i32" %"f"){
ret void
}
define internal void @"kermeta::standard_Collection.exists375"(%"i32" %"func"){
ret void
}
define internal void @"kermeta::standard_Collection.existsCpl376"(%"i32" %"f"){
ret void
}
define internal void @"kermeta::standard_Collection.collect377"(%"i32" %"collector"){
ret void
}
define internal void @"kermeta::standard_Collection.isUnique378"(%"i32" %"collector"){
ret void
}
define internal void @"kermeta::standard_Collection.detect379"(%"i32" %"detector"){
ret void
}
define internal void @"kermeta::standard_Collection.select380"(%"i32" %"selector"){
ret void
}
define internal void @"kermeta::standard_Collection.selectOne381"(%"i32" %"selector"){
ret void
}
define internal void @"kermeta::standard_Collection.reject382"(%"i32" %"rejector"){
ret void
}
define internal void @"kermeta::standard_Collection.count383"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Collection.sum384"(){
ret void
}
define internal void @"kermeta::standard_Collection.asBag385"(){
ret void
}
define internal void @"kermeta::standard_Collection.asSet386"(){
ret void
}
define internal void @"kermeta::standard_Collection.asSequenceType387"(){
ret void
}
define internal void @"kermeta::standard_Collection.asOrderedSet388"(){
ret void
}
define internal void @"kermeta::standard_Collection.asSequence389"(){
ret void
}
define internal void @"kermeta::standard_Set.add390"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Set.remove391"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Set.equals392"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Set.count393"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Set.union394"(%"kermeta::standard_Set" %"elements"){
ret void
}
define internal void @"kermeta::standard_Set.unionWithBag395"(%"kermeta::standard_Bag" %"elements"){
ret void
}
define internal void @"kermeta::standard_Set.intersection396"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Set.minus397"(%"kermeta::standard_Set" %"elements"){
ret void
}
define internal void @"kermeta::standard_Set.asSet398"(){
ret void
}
define internal void @"kermeta::standard_Set.asOrderedSet399"(){
ret void
}
define internal void @"kermeta::standard_Set.symmetricDifference400"(%"kermeta::standard_Set" %"s"){
ret void
}
define internal void @"kermeta::standard_Set.flatten401"(){
ret void
}
define internal void @"kermeta::standard_Set.sortedBy402"(%"i32" %"comparator"){
ret void
}
define internal void @"kermeta::standard_Bag.equals403"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Bag.union404"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Bag.intersection405"(%"kermeta::standard_Collection" %"elements"){
ret void
}
define internal void @"kermeta::standard_Bag.intersectionWithSet406"(%"kermeta::standard_Set" %"elements"){
ret void
}
define internal void @"kermeta::standard_Bag.removeFromOid407"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Bag.removeOne408"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Bag.including409"(%"FIXME_ObjectTypeVariable" %"object"){
ret void
}
define internal void @"kermeta::standard_Bag.excluding410"(%"FIXME_ObjectTypeVariable" %"object"){
ret void
}
define internal void @"kermeta::standard_Bag.flatten411"(){
ret void
}
define internal void @"kermeta::standard_Bag.sortedBy412"(%"i32" %"comparator"){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.addAt413"(%"kermeta::standard_Integer" %"index", %"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.removeAt414"(%"kermeta::standard_Integer" %"index"){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.elementAt415"(%"kermeta::standard_Integer" %"index"){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.first416"(){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.last417"(){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.equals418"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.indexOf419"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedCollection.at420"(%"kermeta::standard_Integer" %"index"){
ret void
}
define internal void @"kermeta::standard_OrderedSet.addAt421"(%"kermeta::standard_Integer" %"index", %"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedSet.equals422"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedSet.subSet423"(%"kermeta::standard_Integer" %"min", %"kermeta::standard_Integer" %"max"){
ret void
}
define internal void @"kermeta::standard_OrderedSet.append424"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedSet.prepend425"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_OrderedSet.insertAt426"(%"kermeta::standard_Integer" %"index", %"FIXME_ObjectTypeVariable" %"subject"){
ret void
}
define internal void @"kermeta::standard_Sequence.equals427"(%"kermeta::standard_Object" %"element"){
ret void
}
define internal void @"kermeta::standard_Sequence.subSequence428"(%"kermeta::standard_Integer" %"min", %"kermeta::standard_Integer" %"max"){
ret void
}
define internal void @"kermeta::standard_Sequence.insertAt429"(%"kermeta::standard_Integer" %"index", %"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Sequence.append430"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Sequence.prepend431"(%"FIXME_ObjectTypeVariable" %"element"){
ret void
}
define internal void @"kermeta::standard_Iterator.isOff432"(){
ret void
}
define internal void @"kermeta::standard_Iterator.hasNext433"(){
ret void
}
define internal void @"kermeta::standard_Iterator.next434"(){
ret void
}
define internal void @"kermeta::standard_EachContext.initialize435"(%"kermeta::standard_Integer" %"i", %"kermeta::standard_Boolean" %"first", %"kermeta::standard_Boolean" %"last"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.load436"(%"kermeta::standard_Map" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.save437"(%"kermeta::standard_Map" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.delete438"(%"kermeta::standard_Map" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.unload439"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getURI440"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.isLoaded441"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getAllContents442"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getContents443"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getEObject444"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getErrors445"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getResourceSet446"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getTimeStamp447"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getURIFragment448"(%"kermeta::standard_Object" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.getWarnings449"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.isModified450"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.isTrackingModification451"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.setModified452"(%"kermeta::standard_Boolean" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.setTimeStamp453"(%"kermeta::standard_Long" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.setTrackingModification454"(%"kermeta::standard_Boolean" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.setURI455"(%"kermeta::standard_URI" %"uri"){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.eAdapters456"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.eDeliver457"(){
ret void
}
define internal void @"kermeta::emfpersistence_Resource.eSetDeliver458"(%"kermeta::standard_Boolean" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.getResource459"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Boolean" %"arg1"){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.getResources460"(){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.getAllContents461"(){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.getEObject462"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_Boolean" %"arg1"){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.createResource463"(%"kermeta::standard_String" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.createResource464"(%"kermeta::standard_String" %"arg0", %"kermeta::standard_String" %"arg1"){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.getAdapterFactories465"(){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.getLoadOptions466"(){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.eAdapters467"(){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.eDeliver468"(){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.eSetDeliver469"(%"kermeta::standard_Boolean" %"arg0"){
ret void
}
define internal void @"kermeta::emfpersistence_ResourceSet.resolveAllProxies470"(){
ret void
}
define internal void @"kermeta::exceptions_Exception.initialize471"(%"kermeta::standard_String" %"message"){
ret void
}
define internal void @"kermeta::exceptions_Exception.fillInStackTrace472"(){
ret void
}
define internal void @"kermeta::exceptions_Exception.getCause473"(){
ret void
}
define internal void @"kermeta::exceptions_Exception.getLocalizedMessage474"(){
ret void
}
define internal void @"kermeta::exceptions_Exception.getMessage475"(){
ret void
}
define internal void @"kermeta::exceptions_Exception.initCause476"(%"kermeta::exceptions_Exception" %"cause"){
ret void
}
define internal void @"kermeta::exceptions_Exception.printStackTrace477"(){
ret void
}
define internal void @"kermeta::exceptions_Exception.printStackTrace478"(%"kermeta::standard_StringBuffer" %"buffer"){
ret void
}
define internal void @"kermeta::exceptions_Exception.setStackTrace479"(%"kermeta::standard_String" %"s"){
ret void
}
define internal void @"kermeta::exceptions_Exception.getStackTrace480"(){
ret void
}
define internal void @"kermeta::exceptions_ConstraintsDiagnostic.initialize481"(){
ret void
}
define internal void @"kermeta::exceptions_ConstraintsDiagnostic.add482"(%"kermeta::exceptions_ConstraintViolatedInv" %"cons"){
ret void
}
define internal void @"kermeta::exceptions_ConstraintsDiagnostic.prettyPrint483"(){
ret void
}
define internal void @"kermeta::io_FileIO.writeTextFile484"(%"kermeta::standard_URI" %"fileURI", %"kermeta::standard_String" %"text"){
ret void
}
define internal void @"kermeta::io_FileIO.writeTextFileWithEncoding485"(%"kermeta::standard_URI" %"fileURI", %"kermeta::standard_String" %"text", %"kermeta::standard_String" %"encoding"){
ret void
}
define internal void @"kermeta::io_FileIO.readTextFile486"(%"kermeta::standard_URI" %"fileURI"){
ret void
}
define internal void @"kermeta::io_FileIO.getCurrentDir487"(){
ret void
}
define internal void @"kermeta::io_StdIO.write488"(%"kermeta::standard_String" %"object"){
ret void
}
define internal void @"kermeta::io_StdIO.errorln489"(%"kermeta::standard_String" %"object"){
ret void
}
define internal void @"kermeta::io_StdIO.error490"(%"kermeta::standard_String" %"object"){
ret void
}
define internal void @"kermeta::io_StdIO.writeln491"(%"kermeta::standard_String" %"object"){
ret void
}
define internal void @"kermeta::io_StdIO.read492"(%"kermeta::standard_String" %"prompt"){
ret void
}
define internal void @"kermeta::utils_Hashtable.size493"(){
ret void
}
define internal void @"kermeta::utils_Hashtable.keyIterator494"(){
ret void
}
define internal void @"kermeta::utils_Hashtable.valueIterator495"(){
ret void
}
define internal void @"kermeta::utils_Hashtable.getValue496"(%"FIXME_ObjectTypeVariable" %"key"){
ret void
}
define internal void @"kermeta::utils_Hashtable.put497"(%"FIXME_ObjectTypeVariable" %"key", %"FIXME_ObjectTypeVariable" %"value"){
ret void
}
define internal void @"kermeta::utils_Hashtable.remove498"(%"FIXME_ObjectTypeVariable" %"key"){
ret void
}
define internal void @"kermeta::utils_Hashtable.clear499"(){
ret void
}
define internal void @"kermeta::utils_Hashtable.keys500"(){
ret void
}
define internal void @"kermeta::utils_Hashtable.values501"(){
ret void
}
define internal void @"kermeta::utils_Hashtable.containsKey502"(%"FIXME_ObjectTypeVariable" %"key"){
ret void
}
define internal void @"root_package_ArabicNumber.toString503"(){
ret void
}
define internal void @"root_package_ArabicNumber.getValue504"(){
ret void
}
define internal void @"root_package_ArabicNumber.setValue505"(%"kermeta::standard_Integer" %"newValue"){
ret void
}
define internal void @"root_package_RomanNumber.toString506"(){
ret void
}
define internal void @"root_package_RomanNumber.getValue507"(){
ret void
}
define internal void @"root_package_Letter.getValue508"(){
ret void
}
define internal void @"root_package_Main.roman2arab509"(%"root_package_RomanNumber" %"r"){
ret void
}
define internal void @"root_package_Main.arab2roman510"(%"root_package_ArabicNumber" %"a"){
ret void
}
define internal void @"root_package_Main.addDigit2roman511"(%"root_package_RomanNumber" %"r", %"root_package_Digit" %"d", %"kermeta::standard_String" %"unit", %"kermeta::standard_String" %"five", %"kermeta::standard_String" %"ten"){
ret void
}
define internal void @"root_package_Main.addLetters512"(%"root_package_RomanNumber" %"r", %"kermeta::standard_Integer" %"times", %"kermeta::standard_String" %"l"){
ret void
}
define i32 @main(){
call void @"root_package_Main.main513"()
ret i32 0
}
define internal void @"root_package_Main.main513"(){
ret void
}
