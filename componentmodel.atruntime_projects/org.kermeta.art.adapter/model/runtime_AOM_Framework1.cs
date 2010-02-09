SYNTAXDEF core
FOR <http://SmartAdapters4ART/smartadapters/core>
START Adapter,org.smartadapters.core.adaptations.SetruntimeSystem,org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance,org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance,org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance,org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding,pattern.art.NamedElement,pattern.art.ModelElement,pattern.art.TypedElement,pattern.art.CardinalityElement,pattern.art.instance.Binding,pattern.art.type.ComponentType,pattern.art.type.PrimitiveType,pattern.art.type.CompositeType,pattern.art.type.Service,pattern.art.type.FunctionalService,pattern.art.type.ControlService,pattern.art.implem.ComponentImplementation,pattern.art.implem.FractalComponent,pattern.art.implem.OSGiComponent,pattern.art.implem.TypeImplementation,pattern.art.implem.OSGiType,pattern.art.group.Group,pattern.art.group.TypeGroup,pattern.art.group.InstanceGroup,patternframework.ModelPattern,patternframework.PObject

IMPORTS{
	org.smartadapters.core.adaptations:<http://SmartAdapters4ART/smartadapters/core/adaptations>
	pattern.art:<http://art/pattern/art>
	pattern.art.instance:<http://art/pattern/art/instance>
	pattern.art.type:<http://art/pattern/art/type>
	pattern.art.implem:<http://art/pattern/art/implem>
	pattern.art.group:<http://art/pattern/art/group>
	patternframework:<platform:/resource/fr.irisa.triskell.kermeta.patternmatching/src/kermeta/pattern/metamodel/PatternFramework.ecore>
}
OPTIONS {
	memoize = "true";
	tokenspace = "0";
	usePredefinedTokens = "false";
}

TOKENS{
		DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $ ;
		DEFINE ML_COMMENT $'/*'.*'*/'$ ;
		
		DEFINE ANNOTATION $'@'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+$;
		
		DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"'$;

		DEFINE T_INSTANCE_STATE $'#ON'|'#OFF'$;
		DEFINE T_PORT_KIND $'provided'|'required'$;
		
		DEFINE T_IMPLEM $'bundle'|'memory'$;
		
		DEFINE T_OPTIONAL $'optional'$;
		
		//DEFINE QUALIFIED_NAME $('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'-'|'0'..'9')*('.'('A'..'Z'|'a'..'z'|'_'|'-'|'0'..'9')+)*$;

		DEFINE WHITESPACE $(' '|'\t'|'\f')$;
		DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
		
		DEFINE MULTIPLICITY $( ('*') | (('0'..'9')+) )$;
		
		//DEFINE TEXT $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+$;
		DEFINE TEXT $('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*$;
}

TOKENSTYLES {

	"TEXT" COLOR #444444;

	"SL_COMMENT"  COLOR #666666;
	"ML_COMMENT"  COLOR #666666;
	
	"STRING_LITERAL" COLOR #0055bb;
	
	
	"system" COLOR #444444, BOLD;
	
	"root" COLOR #007F55, BOLD;
	"primitive" COLOR #007F55, BOLD;
	"composite" COLOR #007F55, BOLD;
	"instance" COLOR #007F55, BOLD;
	 
	"T_INSTANCE_STATE" COLOR #007F55, BOLD; 
	
	":" COLOR #000000;
	"::" COLOR #000000;
	":=" COLOR #000000;
	
	"bind" COLOR #007F55, BOLD;
	"delegate" COLOR #007F55, BOLD;
	"to" COLOR #007F55, BOLD;
	"id" COLOR #007F55, BOLD;
	
	"functional" COLOR #CC8000, BOLD;
	"control" COLOR #CC8000, BOLD;
	
	"service" COLOR #CC8000, BOLD;
	"operation" COLOR #CC8000, BOLD;
	"in" COLOR #CC8000, BOLD;
	"out" COLOR #CC8000, BOLD;
	
	 
	"implementation" COLOR #0055bb , BOLD;
	"T_IMPLEM" COLOR #0055bb , BOLD;
	"OSGiComponent" COLOR #0055bb;
	"implementingClass" COLOR #0055bb, ITALIC;
	"OSGiType" COLOR #0055bb;
	"generateInstanceBundle" COLOR #0055bb , ITALIC;
	"OSGiPort" COLOR #0055bb;
	"serviceId" COLOR #0055bb , ITALIC;
	
	"groups" COLOR #444444, BOLD;
	"instancegroup" COLOR #444444, BOLD;
	"typegroup" COLOR #444444, BOLD;
	"instances" COLOR #444444, BOLD;
	"types" COLOR #444444, BOLD;
	
	"type" COLOR #A22000, BOLD;
	"compositetype" COLOR #A22000, BOLD;
	"port" COLOR #A22000, BOLD;
	"T_PORT_KIND" COLOR #A22000, BOLD;
	"attribute" COLOR #A22000, BOLD;
	"default" COLOR #A22000, BOLD;
	"T_OPTIONAL" COLOR #A22000, BOLD;
	
	"datatype" COLOR #0055bb, BOLD;
	

	
	
	
	
	
}

RULES{
	
	Adapter::= "Adapter"  "{" ( "aspect"  ":" aspect | "adapt"  ":" adapt | "name"  ":" name['"','"']  )* "}"  ;
	
	Aspect::= "Aspect"  "{" ( "template"  ":" template | "structure"  ":" structure | "persistent"  ":" persistent[] )* "}"  ;
	
	makeUnique::= "makeUnique"  "{" ( "adapter"  ":" adapter[]| "element"  ":" element[] )* "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeSystem::= "SetruntimeSystem"  "{" ( "adapter"  ":" adapter[]| "SystemToSet"  ":" SystemToSet[]| "refroot"  ":" refroot[]| "refservices"  ":" refservices[]| "reftypes"  ":" reftypes[]| "refdataTypes"  ":" refdataTypes[]| "refname"  ":" refname['"','"']  )* "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance::= "SetruntimeinstanceComponentInstance"  "{" ( "adapter"  ":" adapter[]| "ComponentInstanceToSet"  ":" ComponentInstanceToSet[]| "reftype"  ":" reftype[]| "refstate"  ":" refstate['"','"'] | "refsuperComponent"  ":" refsuperComponent[]| "refattribute"  ":" refattribute[]| "refbinding"  ":" refbinding[]| "refcontrollerDesc"  ":" refcontrollerDesc['"','"'] | "refcontentDesc"  ":" refcontentDesc['"','"'] | "refname"  ":" refname['"','"']  )* "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance::= "SetruntimeinstancePrimitiveInstance"  "{" ( "adapter"  ":" adapter[]| "PrimitiveInstanceToSet"  ":" PrimitiveInstanceToSet[]| "reftype"  ":" reftype[]| "refstate"  ":" refstate['"','"'] | "refsuperComponent"  ":" refsuperComponent[]| "refattribute"  ":" refattribute[]| "refbinding"  ":" refbinding[]| "refcontrollerDesc"  ":" refcontrollerDesc['"','"'] | "refcontentDesc"  ":" refcontentDesc['"','"'] | "refname"  ":" refname['"','"']  )* "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance::= "SetruntimeinstanceCompositeInstance"  "{" ( "adapter"  ":" adapter[]| "CompositeInstanceToSet"  ":" CompositeInstanceToSet[]| "refsubComponent"  ":" refsubComponent[]| "refdelegation"  ":" refdelegation[]| "reftype"  ":" reftype[]| "refstate"  ":" refstate['"','"'] | "refsuperComponent"  ":" refsuperComponent[]| "refattribute"  ":" refattribute[]| "refbinding"  ":" refbinding[]| "refcontrollerDesc"  ":" refcontrollerDesc['"','"'] | "refcontentDesc"  ":" refcontentDesc['"','"'] | "refname"  ":" refname['"','"']  )* "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding::= "SetruntimeinstanceTransmissionBinding"  "{" ( "adapter"  ":" adapter[]| "TransmissionBindingToSet"  ":" TransmissionBindingToSet[]| "refclient"  ":" refclient[]| "refserver"  ":" refserver[]| "refserverInstance"  ":" refserverInstance[]| "refId"  ":" refId['"','"']  )* "}"  ;
	
pattern.art.DataType::= "datatype" #1 name[] ";"  ;
		
		pattern.art.Instance.PrimitiveInstance::= "primitive" #1 "instance"  #1 name[] #1 ":" #1 type[] #1 state[T_INSTANCE_STATE] #1 (!1 "implementation"  #1 implem)? !0 "{" ( !1 (attribute | binding) )* !0 "}"  ;
		
		pattern.art.Instance.CompositeInstance::= "composite" #1 "instance"  #1 name[] #1 ":" #1 type[] #1 state[T_INSTANCE_STATE] #1 (!1 "implementation"  #1 implem)? !0 "{" ( !1 (attribute | binding | subComponent | delegation) )* !0 "}"  ;
		
		pattern.art.Instance.TransmissionBinding::= "bind" #1 client[] #1 "to" #1 serverInstance[] "::" server[] ( #1 "(" "id" #1 "=" #1 id[STRING_LITERAL] ")"  )? ;
		
		pattern.art.Instance.DelegationBinding::= "delegate" #1 source[] #1 "to" #1 serverInstance[] "::" exported[] ( #1 "(" "id" #1 "=" #1 id[STRING_LITERAL] ")"  )? ; 
		
		pattern.art.Instance.ValuedAttribute::=  attribute[] #1 ":=" #1 value[STRING_LITERAL] ;
		
		pattern.art.Instance.DictionaryValuedAttribute::= attribute[] #1 ":=" #1 ( entries ("," #1 entries)* )? ;
		
		pattern.art.Instance.DefaultEntry::= "[" #1 key[] #1 "->" #1 value[STRING_LITERAL] #1 "]" ;
		
		pattern.art.Instance.OtherEntry::=   "[" #1 key[STRING_LITERAL] #1 "->" #1 value[STRING_LITERAL] #1 "]" ;
		
		pattern.art.Type.PrimitiveType::= "type" #1 name[] #1 (!1 "implementation"  #1 implem)? !0 "{" ( port | attribute )* !0 "}"  ;
		
		pattern.art.Type.CompositeType::= "compositetype" #1 name[] #1 (!1 "implementation"  #1 implem)? !0 "{" ( port | attribute )* !0 "}"  ;
		
		//Type.Operation::= !1 "operation" #1 name[] "(" ("in" #1 input | "out" #1 output)? ( "," #1 ("in" #1 input | "out" #1 output) )* ")"  ;
		
		pattern.art.Type.Operation::= !1 "operation" #1 name[] "(" (input)? ( "," #1 input )* ")" (":" output)? ( "," #1 output )* ;
		
		pattern.art.Type.Parameter::= type[] #1 name[];
		
		pattern.art.Type.FunctionalService::= "functional" #1 "service" #1 name[] #1 "{" ( operation )* !0 "}"  ;
		
		pattern.art.Type.ControlService::= "control" #1 "service" #1 name[] #1 "{" ( operation )* !0 "}"  ;
		
		pattern.art.Type.Port::= !1 role[T_PORT_KIND] (isOptional[T_OPTIONAL])? #1 "port" #1 name[] #1 ":" #1 service[] #1 "[" lower[MULTIPLICITY] ".." upper[MULTIPLICITY] "]" ;
		
		pattern.art.Implem.FractalComponent::= "FractalComponent" #1 "<" "controllerDesc" #1 ":" #1 controllerDesc[STRING_LITERAL] #1 "contentDesc" #1 ":" #1 contentDesc[STRING_LITERAL]  ">"  ;
		
		pattern.art.Implem.OSGiComponent::= "OSGiComponent" #1 ":" #1 implementingClass[STRING_LITERAL] ;
		
		//Implem.OSGiPort::= "OSGiPort" #1 ":" #1 serviceId[STRING_LITERAL] ; 
		
		pattern.art.Group.TypeGroup::= "typegroup" #1 name[] #1 "{" ( !1 "types" #1 ":" #1 types[] ("," #1 types[])* )?  ( !1 subGroups)* !0 "}"  ;
		
		pattern.art.Group.InstanceGroup::= "instancegroup" #1 name[] #1 "{" ( !1 "instances" #1 ":" #1 instances[] ("," #1 instances[])* )?  (!1 subGroups)* !0 "}"  ;
		
		pattern.art.Implem.OSGiType::= generateInstanceBundle[T_IMPLEM]  ;
		
		pattern.art.Type.BasicAttribute::= !1 "attribute" #1 name[] #1 ":" #1 type[] ( #1 "default"  #1 defaultValue[STRING_LITERAL] )? ;
		
		pattern.art.Type.Dictionary::= !1 "attribute" #1 name[] #1 ":" "[" type[] #1 "->" #1 valueType[] "]"  ( #1 "default" #1 "{" keys* !0 "}" )?  ;
		
		pattern.art.Type.DictionaryDefaultValue::= !1 "[" #1 key[STRING_LITERAL] #1 ("->" #1 value[STRING_LITERAL] )? #1 "]" ;
		
		pattern.art.Type.PortId ::= name[];
		
		pattern.art.Type.PortCollection::= !1 role[T_PORT_KIND] #1 "port" #1 name[] #1 ":" #1 service[] #1 "{" ids ("," #1 ids)* "}" ;
		
	patternframework.ModelPattern::= "ModelPattern"  "{" ( "pattern"  ":" pattern | "constraints"  ":" constraints | "featureIdentifier"  ":" featureIdentifier[]| "falsepositivepatterns"  ":" falsepositivepatterns  )* "}"  ;
	
	patternframework.PModel::= "PModel"  "{" ( "content"  ":" content[]| "roles"  ":" roles  )* "}"  ;
	
	patternframework.PObject::= "PObject"  "{"  "}"  ;
	
	patternframework.PConstraint::= "PConstraint"  "{" ( "expression"  ":" expression['"','"'] | "language"  ":" language[] )* "}"  ;
	
	patternframework.PRole::= "PRole"  "{" ( "name"  ":" name['"','"'] | "player"  ":" player[] )* "}"  ;
	
}