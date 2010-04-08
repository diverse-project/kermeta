 SYNTAXDEF kmhutn
FOR <http://www.kermeta.org/kermeta/1_2_0//kermeta>
START fr.irisa.triskell.kermeta.language.structure.ModelingUnit

IMPORTS{
	fr.irisa.triskell.kermeta.language:<http://www.kermeta.org/kermeta/1_2_0//kermeta/language>
	fr.irisa.triskell.kermeta.language.behavior:<http://www.kermeta.org/kermeta/1_2_0//kermeta/language/behavior>
	fr.irisa.triskell.kermeta.language.structure:<http://www.kermeta.org/kermeta/1_2_0//kermeta/language/structure>
}
TOKENS{
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}

TOKENSTYLES{
	"Assignment" COLOR #7F0055, BOLD;
	"tag" COLOR #7F0055, BOLD;
	"ownedTags" COLOR #7F0055, BOLD;
	"containedType" COLOR #7F0055, BOLD;
	"staticType" COLOR #7F0055, BOLD;
	"target" COLOR #7F0055, BOLD;
	"value" COLOR #7F0055, BOLD;
	"Block" COLOR #7F0055, BOLD;
	"statement" COLOR #7F0055, BOLD;
	"rescueBlock" COLOR #7F0055, BOLD;
	"CallVariable" COLOR #7F0055, BOLD;
	"parameters" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"staticTypeVariableBindings" COLOR #7F0055, BOLD;
	"CallFeature" COLOR #7F0055, BOLD;
	"staticProperty" COLOR #7F0055, BOLD;
	"staticOperation" COLOR #7F0055, BOLD;
	"staticEnumLiteral" COLOR #7F0055, BOLD;
	"CallSuperOperation" COLOR #7F0055, BOLD;
	"CallResult" COLOR #7F0055, BOLD;
	"CallValue" COLOR #7F0055, BOLD;
	"Conditional" COLOR #7F0055, BOLD;
	"thenBody" COLOR #7F0055, BOLD;
	"elseBody" COLOR #7F0055, BOLD;
	"condition" COLOR #7F0055, BOLD;
	"Raise" COLOR #7F0055, BOLD;
	"expression" COLOR #7F0055, BOLD;
	"Rescue" COLOR #7F0055, BOLD;
	"body" COLOR #7F0055, BOLD;
	"exceptionType" COLOR #7F0055, BOLD;
	"exceptionName" COLOR #7F0055, BOLD;
	"TypeReference" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"lower" COLOR #7F0055, BOLD;
	"upper" COLOR #7F0055, BOLD;
	"EmptyExpression" COLOR #7F0055, BOLD;
	"JavaStaticCall" COLOR #7F0055, BOLD;
	"jclass" COLOR #7F0055, BOLD;
	"jmethod" COLOR #7F0055, BOLD;
	"LambdaExpression" COLOR #7F0055, BOLD;
	"LambdaParameter" COLOR #7F0055, BOLD;
	"IntegerLiteral" COLOR #7F0055, BOLD;
	"StringLiteral" COLOR #7F0055, BOLD;
	"BooleanLiteral" COLOR #7F0055, BOLD;
	"TypeLiteral" COLOR #7F0055, BOLD;
	"typeref" COLOR #7F0055, BOLD;
	"VoidLiteral" COLOR #7F0055, BOLD;
	"Loop" COLOR #7F0055, BOLD;
	"initialization" COLOR #7F0055, BOLD;
	"stopCondition" COLOR #7F0055, BOLD;
	"SelfExpression" COLOR #7F0055, BOLD;
	"VariableDecl" COLOR #7F0055, BOLD;
	"identifier" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	"typeContainer" COLOR #7F0055, BOLD;
	"virtualTypeBinding" COLOR #7F0055, BOLD;
	"typeParamBinding" COLOR #7F0055, BOLD;
	"typeDefinition" COLOR #7F0055, BOLD;
	"ownedAttribute" COLOR #7F0055, BOLD;
	"ownedOperation" COLOR #7F0055, BOLD;
	"superClass" COLOR #7F0055, BOLD;
	"Object" COLOR #7F0055, BOLD;
	"Model" COLOR #7F0055, BOLD;
	"contents" COLOR #7F0055, BOLD;
	"ModelType" COLOR #7F0055, BOLD;
	"includedTypeDefinition" COLOR #7F0055, BOLD;
	"Operation" COLOR #7F0055, BOLD;
	"raisedException" COLOR #7F0055, BOLD;
	"ownedParameter" COLOR #7F0055, BOLD;
	"pre" COLOR #7F0055, BOLD;
	"post" COLOR #7F0055, BOLD;
	"superOperation" COLOR #7F0055, BOLD;
	"owningClass" COLOR #7F0055, BOLD;
	"typeParameter" COLOR #7F0055, BOLD;
	"Property" COLOR #7F0055, BOLD;
	"opposite" COLOR #7F0055, BOLD;
	"default" COLOR #7F0055, BOLD;
	"getterBody" COLOR #7F0055, BOLD;
	"setterBody" COLOR #7F0055, BOLD;
	"Type" COLOR #7F0055, BOLD;
	"EnumerationLiteral" COLOR #7F0055, BOLD;
	"enumeration" COLOR #7F0055, BOLD;
	"TypeVariableBinding" COLOR #7F0055, BOLD;
	"variable" COLOR #7F0055, BOLD;
	"MultiplicityElement" COLOR #7F0055, BOLD;
	"TypeDefinition" COLOR #7F0055, BOLD;
	"Enumeration" COLOR #7F0055, BOLD;
	"ownedLiteral" COLOR #7F0055, BOLD;
	"Package" COLOR #7F0055, BOLD;
	"ownedTypeDefinition" COLOR #7F0055, BOLD;
	"nestedPackage" COLOR #7F0055, BOLD;
	"nestingPackage" COLOR #7F0055, BOLD;
	"uri" COLOR #7F0055, BOLD;
	"Parameter" COLOR #7F0055, BOLD;
	"operation" COLOR #7F0055, BOLD;
	"PrimitiveType" COLOR #7F0055, BOLD;
	"instanceType" COLOR #7F0055, BOLD;
	"Tag" COLOR #7F0055, BOLD;
	"object" COLOR #7F0055, BOLD;
	"Constraint" COLOR #7F0055, BOLD;
	"stereotype" COLOR #7F0055, BOLD;
	"language" COLOR #7F0055, BOLD;
	"invOwner" COLOR #7F0055, BOLD;
	"preOwner" COLOR #7F0055, BOLD;
	"postOwner" COLOR #7F0055, BOLD;
	"ClassDefinition" COLOR #7F0055, BOLD;
	"inv" COLOR #7F0055, BOLD;
	"superType" COLOR #7F0055, BOLD;
	"ModelingUnit" COLOR #7F0055, BOLD;
	"packages" COLOR #7F0055, BOLD;
	"requires" COLOR #7F0055, BOLD;
	"usings" COLOR #7F0055, BOLD;
	"referencedModelingUnits" COLOR #7F0055, BOLD;
	"includeFilters" COLOR #7F0055, BOLD;
	"excludeFilters" COLOR #7F0055, BOLD;
	"Require" COLOR #7F0055, BOLD;
	"Using" COLOR #7F0055, BOLD;
	"qualifiedName" COLOR #7F0055, BOLD;
	"Filter" COLOR #7F0055, BOLD;
	"ObjectTypeVariable" COLOR #7F0055, BOLD;
	"supertype" COLOR #7F0055, BOLD;
	"ModelTypeVariable" COLOR #7F0055, BOLD;
	"virtualType" COLOR #7F0055, BOLD;
	"VirtualType" COLOR #7F0055, BOLD;
	"classDefinition" COLOR #7F0055, BOLD;
	"modelType" COLOR #7F0055, BOLD;
	"ProductType" COLOR #7F0055, BOLD;
	"FunctionType" COLOR #7F0055, BOLD;
	"left" COLOR #7F0055, BOLD;
	"right" COLOR #7F0055, BOLD;
	"VoidType" COLOR #7F0055, BOLD;
}

RULES{
	
	fr.irisa.triskell.kermeta.language.behavior.Assignment::=isCast[]? "Assignment"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "target"  ":" target | "value"  ":" value  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.Block::= "Block"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "statement"  ":" statement | "rescueBlock"  ":" rescueBlock  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.CallVariable::=isAtpre[]? "CallVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name['"','"'] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.CallFeature::=isAtpre[]? "CallFeature"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name['"','"'] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[]| "target"  ":" target | "staticProperty"  ":" staticProperty[]| "staticOperation"  ":" staticOperation[]| "staticEnumLiteral"  ":" staticEnumLiteral[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation::= "CallSuperOperation"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name['"','"'] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.CallResult::=isAtpre[]? "CallResult"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name['"','"'] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.CallValue::= "CallValue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "name"  ":" name['"','"'] | "staticTypeVariableBindings"  ":" staticTypeVariableBindings[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.Conditional::= "Conditional"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "thenBody"  ":" thenBody | "elseBody"  ":" elseBody | "condition"  ":" condition  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.Raise::= "Raise"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "expression"  ":" expression  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.Rescue::= "Rescue"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "body"  ":" body | "exceptionType"  ":" exceptionType | "exceptionName"  ":" exceptionName['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.TypeReference::=isOrdered[]?isUnique[]? "TypeReference"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.EmptyExpression::= "EmptyExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall::= "JavaStaticCall"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "jclass"  ":" jclass['"','"'] | "jmethod"  ":" jmethod['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.LambdaExpression::= "LambdaExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "parameters"  ":" parameters | "body"  ":" body  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.LambdaParameter::= "LambdaParameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "type"  ":" type  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral::= "IntegerLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "value"  ":" value[INTEGER] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.StringLiteral::= "StringLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "value"  ":" value['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral::=value[]? "BooleanLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.TypeLiteral::= "TypeLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "typeref"  ":" typeref  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.VoidLiteral::= "VoidLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.Loop::= "Loop"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "initialization"  ":" initialization | "body"  ":" body | "stopCondition"  ":" stopCondition  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.SelfExpression::= "SelfExpression"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.behavior.VariableDecl::= "VariableDecl"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "staticType"  ":" staticType[]| "initialization"  ":" initialization | "identifier"  ":" identifier['"','"'] | "type"  ":" type  )* "}"  ;
	
	//fr.irisa.triskell.kermeta.language.structure.Class::=isAbstract[]? "Class"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "virtualTypeBinding"  ":" virtualTypeBinding | "typeParamBinding"  ":" typeParamBinding | "typeDefinition"  ":" typeDefinition[]| "ownedAttribute"  ":" ownedAttribute[]| "ownedOperation"  ":" ownedOperation[]| "superClass"  ":" superClass[]| "name"  ":" name['"','"']  )* "}"  ;
	fr.irisa.triskell.kermeta.language.structure.Class::=isAbstract[]? "Class"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "virtualTypeBinding"  ":" virtualTypeBinding | "typeParamBinding"  ":" typeParamBinding | "typeDefinition"  ":" typeDefinition[]| "name"  ":" name['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Object::= "Object"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
	
	//fr.irisa.triskell.kermeta.language.structure.Model::= "Model"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "contents"  ":" contents[] )* "}"  ;
	fr.irisa.triskell.kermeta.language.structure.Model::= "Model"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.ModelType::=isAspect[]? "ModelType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "includedTypeDefinition"  ":" includedTypeDefinition[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Operation::=isOrdered[]?isUnique[]?isAbstract[]? "Operation"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER]| "raisedException"  ":" raisedException[]| "ownedParameter"  ":" ownedParameter | "pre"  ":" pre | "post"  ":" post | "body"  ":" body | "superOperation"  ":" superOperation[]| "owningClass"  ":" owningClass[]| "typeParameter"  ":" typeParameter[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Property::=isOrdered[]?isUnique[]?isReadOnly[]?isComposite[]?isDerived[]?isID[]?isGetterAbstract[]?isSetterAbstract[]? "Property"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER]| "opposite"  ":" opposite[]| "default"  ":" default['"','"'] | "getterBody"  ":" getterBody | "setterBody"  ":" setterBody | "owningClass"  ":" owningClass[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Type::= "Type"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral::= "EnumerationLiteral"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "enumeration"  ":" enumeration[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding::= "TypeVariableBinding"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "variable"  ":" variable[]| "type"  ":" type[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.MultiplicityElement::=isOrdered[]?isUnique[]? "MultiplicityElement"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.TypeDefinition::=isAspect[]? "TypeDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Enumeration::=isAspect[]? "Enumeration"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "ownedLiteral"  ":" ownedLiteral  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Package::= "Package"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "ownedTypeDefinition"  ":" ownedTypeDefinition | "nestedPackage"  ":" nestedPackage | "nestingPackage"  ":" nestingPackage[]| "uri"  ":" uri['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Parameter::=isOrdered[]?isUnique[]? "Parameter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "name"  ":" name['"','"'] | "type"  ":" type[]| "lower"  ":" lower[INTEGER]| "upper"  ":" upper[INTEGER]| "operation"  ":" operation[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.PrimitiveType::=isAspect[]? "PrimitiveType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "containedType"  ":" containedType | "instanceType"  ":" instanceType[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Tag::= "Tag"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "value"  ":" value['"','"'] | "object"  ":" object[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Constraint::= "Constraint"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "body"  ":" body | "stereotype"  ":" stereotype[]| "language"  ":" language[]| "invOwner"  ":" invOwner[]| "preOwner"  ":" preOwner[]| "postOwner"  ":" postOwner[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.ClassDefinition::=isAspect[]?isAbstract[]? "ClassDefinition"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "name"  ":" name['"','"'] | "typeParameter"  ":" typeParameter | "containedType"  ":" containedType | "inv"  ":" inv | "ownedAttribute"  ":" ownedAttribute | "ownedOperation"  ":" ownedOperation | "superType"  ":" superType[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.ModelingUnit::= "ModelingUnit"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "packages"  ":" packages | "requires"  ":" requires | "usings"  ":" usings | "referencedModelingUnits"  ":" referencedModelingUnits[]| "includeFilters"  ":" includeFilters | "excludeFilters"  ":" excludeFilters  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Require::= "Require"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "uri"  ":" uri['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Using::= "Using"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "qualifiedName"  ":" qualifiedName['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.Filter::= "Filter"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "qualifiedName"  ":" qualifiedName['"','"']  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable::= "ObjectTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable::= "ModelTypeVariable"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[]| "virtualType"  ":" virtualType  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.VirtualType::= "VirtualType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "name"  ":" name['"','"'] | "supertype"  ":" supertype[]| "classDefinition"  ":" classDefinition[]| "modelType"  ":" modelType[]| "typeParamBinding"  ":" typeParamBinding  )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.ProductType::= "ProductType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "type"  ":" type[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.FunctionType::= "FunctionType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "containedType"  ":" containedType | "typeContainer"  ":" typeContainer[]| "left"  ":" left[]| "right"  ":" right[] )* "}"  ;
	
	fr.irisa.triskell.kermeta.language.structure.VoidType::= "VoidType"  "{" ( "tag"  ":" tag[]| "ownedTags"  ":" ownedTags | "typeContainer"  ":" typeContainer[] )* "}"  ;
	
}