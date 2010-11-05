SYNTAXDEF smARText
FOR <http://SmartAdapters4ART> 
START Aspect 

IMPORTS{
	org.smartadapters.core.adaptations:<http://SmartAdapters4ART/adaptations>
	pattern.art:<http://art_relaxed>
	pattern.art.instance:<http://art/instance_relaxed>
	pattern.art.type:<http://art/type_relaxed>
	pattern.art.implem:<http://art/implem_relaxed>
	pattern.art.group:<http://art/group_relaxed>
	pattern.art.distrib:<http://art/distrib_relaxed>
	//patternframework:<platform:/resource/fr.irisa.triskell.kermeta.patternmatching/src/kermeta/pattern/metamodel/PatternFramework.ecore>
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
		
		
		DEFINE T_INSTANCE_STATE $'#ON'|'#OFF'$;
		DEFINE T_PORT_KIND $'provided'|'required'$;
		
		DEFINE T_IMPLEM $'bundle'|'memory'$;
		
		DEFINE T_OPTIONAL $'optional'$;
		
		//DEFINE QUALIFIED_NAME $('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'-'|'0'..'9')*('.'('A'..'Z'|'a'..'z'|'_'|'-'|'0'..'9')+)*$;

		
		
		DEFINE MULTIPLICITY $( ('*') | (('0'..'9')+) )$;
		
		//DEFINE TEXT $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+$;
		
		DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"'$;
		
		//DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7'))*'"'$;
	
		DEFINE WHITESPACE $(' '|'\t'|'\f')$;
		DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;	
		
		DEFINE TXTID $'<'('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*'>'$;
		
		DEFINE TEXT $('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*$;
}

TOKENSTYLES {

	"TEXT" COLOR #444444;

	"SL_COMMENT"  COLOR #666666;
	"ML_COMMENT"  COLOR #666666;
	
	"STRING_LITERAL" COLOR #0055bb;
	
	
	"system" COLOR #444444, BOLD;
	
	"TXTID"  COLOR #444444, BOLD;
	
	"root" COLOR #007F55, BOLD;
	"primitive" COLOR #007F55, BOLD;
	"composite" COLOR #007F55, BOLD;
	"component" COLOR #007F55, BOLD;
	"binding" COLOR #007F55, BOLD;
	"server" COLOR #007F55, BOLD;
	"requiredPort" COLOR #007F55, BOLD;
	"providedPort" COLOR #007F55, BOLD;
	"instance" COLOR #007F55, BOLD;
	 
	"T_INSTANCE_STATE" COLOR #007F55, BOLD; 
	
	":" COLOR #444444, BOLD;
	"?" COLOR #444444, BOLD;
	"=" COLOR #444444, BOLD;
	"+=" COLOR #444444, BOLD;
	
	"bind" COLOR #007F55, BOLD;
	"delegate" COLOR #007F55, BOLD;
	"to" COLOR #007F55, BOLD;
	"id" COLOR #007F55, BOLD;
	
	"functional" COLOR #CC8000, BOLD;
	"control" COLOR #CC8000, BOLD;
	
	"service" COLOR #CC8000, BOLD;
	"services" COLOR #CC8000, BOLD;
	"operation" COLOR #CC8000, BOLD;
	"in" COLOR #CC8000, BOLD;
	"out" COLOR #CC8000, BOLD;
	
	 
	"implementation" COLOR #0055bb , BOLD;
	"T_IMPLEM" COLOR #0055bb , BOLD;
	"OSGiComponent" COLOR #0055bb;
	"implementingClass" COLOR #0055bb, ITALIC;
	"OSGiType" COLOR #0055bb;
	"generateInstanceBundle" COLOR #0055bb , ITALIC;
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
	
//	Adapter::= "Adapter" #1 name[] ";" !0 !0 aspect !0 "protocol" !0 "{" (!1 adapt)* !0 "}" ;
	
	Aspect::= "pointcut" !0 "{"  pointcut !0 "}" !0 "advice"  !0 "{" (!1 advice) !0 "}"  !0 "protocol" !0 "{" (!1 adapt)* !0 "}"; //( !0 "unique elements"  ":" persistent[] ("," #1 persistent[])* )?
	
	PointcutModel ::= (content !0)*;
	
	AdviceModel ::= (content !0)*;
	
	//makeUnique::= "makeUnique"  "{" ( "adapter"  ":" adapter[]| "element"  ":" element[] )* "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeSystem::= "set" #1 "system" #1 SystemToSet[] !0 "{"  ( 
					!1 "root" #1 "=" #1 refroot[] | 
					!1 "services" #1 "+=" #1 refservices[] ("," #1 refservices[])* | 
					!1 "types" #1 "+=" #1  reftypes[] ("," #1 reftypes[])* | 
					!1 "datatypes" #1 "+=" #1 refdataTypes[] ("," #1 refdataTypes[])*
				)* !0 "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance::= "set" #1 "instance" #1 ComponentInstanceToSet[] !0 "{" ( 
					!1 "type"  #1 "=" #1 reftype[] | 
					!1 "state"  #1 "=" #1 refstate[STRING_LITERAL] | 
					!1 "super"  #1 "=" #1 refsuperComponent[] | 
					!1 "attribute"  #1 "+=" #1 refattribute[] ("," #1 refattribute[])* | 
					!1 "binding"  #1 "+=" #1 refbinding[] ("," #1 refbinding[])* | 
					!1 "name"  #1 "=" #1 refname[STRING_LITERAL]  
				)* !0 "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance::= "set" #1 "primitive" #1 "component" #1 PrimitiveInstanceToSet[] !0 "{" ( 
					!1 "type"  #1 "=" #1 reftype[]| 
					!1 "state"  #1 "=" #1 refstate[STRING_LITERAL] | 
					!1 "super"  #1 "=" #1 refsuperComponent[] | 
					!1 "attribute"  #1 "+=" #1 refattribute[]  ("," #1 refattribute[])* | 
					!1 "binding"  #1 "+=" #1 refbinding[] ("," #1 refbinding[])* | 
					!1 "name"  #1 "=" #1 refname[STRING_LITERAL]  
				)* !0 "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance::= "set" #1 "composite" #1 "component" #1 CompositeInstanceToSet[] !0 "{" ( 
					!1 "component"  #1 "+=" #1 refsubComponent[] ("," #1 refsubComponent[])* | 
					!1 "delegation"  #1 "+=" #1 refdelegation[] ("," #1 refdelegation[])* | 
					!1 "state"  #1 "=" #1 refstate[STRING_LITERAL] | 
					!1 "super"  #1 "=" #1 refsuperComponent[] | 
					!1 "attribute"  #1 "+=" #1 refattribute[] ("," #1 refattribute[])* | 
					!1 "binding"  #1 "+=" #1 refbinding[] ("," #1 refbinding[])* | 
					!1 "name" #1 "=" #1 refname[STRING_LITERAL]  
				)* !0 "}"  ;
	
	org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding::= "set" #1 "binding" #1 TransmissionBindingToSet[] !0 "{" ( 
					!1 "requiredPort"  #1 "=" #1 refclient[]| 
					!1 "providedPort"  #1 "=" #1 refserver[]| 
					!1 "server"  #1 "=" #1 refserverInstance[]| 
					!1 "id"  #1 "=" #1 refId[STRING_LITERAL]  
				)* "}"  ;
				
	org.smartadapters.core.adaptations.SetruntimeNode::= "set" #1 "node" #1 nodeToSet[] !0 "{" ( 
					!1 "components"  #1 "=" #1 components[]
				)* "}"  ;
	
	pattern.art.System::= ("system" (#1 name[])? ( #1 pid[TXTID])? ";" )? !0 ( !0 ( nodes | services | types | dataTypes | groups) )* ;
	
	pattern.art.DataType::= "datatype" (#1 name[])? ( #1 pid[TXTID])?  ";"  ;
	
	pattern.art.distrib.Node ::= "node" (#1 name[])? ( #1 pid[TXTID])? ("uri" #1 "=" #1 uri[STRING_LITERAL])? "{" !1 components*  !0 "}" ;
	
	pattern.art.instance.PrimitiveInstance::= "primitive" #1 "instance"  (#1 name[])? ( #1 pid[TXTID])? #1 ":" #1 (type[] | "?") (#1 state[T_INSTANCE_STATE])? #1 (!1 "implementation"  #1 implem)? !0 "{" ( !1 (attribute | binding) )* !0 "}"  ;
	
	pattern.art.instance.CompositeInstance::= "composite" #1 "instance"  (#1 name[])? ( #1 pid[TXTID])? #1 ":" #1 (type[] | "?") (#1 state[T_INSTANCE_STATE])? #1 (!1 "implementation"  #1 implem)? !0 "{" ( !1 (attribute | binding | subComponent | delegation) )* !0 "}"  ;
	
	pattern.art.instance.TransmissionBinding::= "bind" #1 ( client[] | "?" ) #1  "to" #1 ( serverInstance[] "::" server[] | "?" ) ( #1 pid[TXTID])?  ( #1 "(" "id" #1 "=" #1 id[STRING_LITERAL] ")"  )? ;
	
	pattern.art.instance.DelegationBinding::= "delegate" #1 ( source[] | "?" ) #1 "to" #1 ( serverInstance[] "::" exported[] | "?" ) ( #1 pid[TXTID])?  ( #1 "(" "id" #1 "=" #1 id[STRING_LITERAL] ")"  )? ; 
	
	pattern.art.instance.ValuedAttribute::=  attribute[] #1 ":=" #1 value[STRING_LITERAL] ( #1 pid[TXTID])? ;
	
	pattern.art.instance.DictionaryValuedAttribute::= attribute[] #1 ":=" #1 ( entries ("," #1 entries)* )? ( #1 pid[TXTID])?;
	
	pattern.art.instance.DefaultEntry::= "[" #1 key[] #1 "->" #1 value[STRING_LITERAL] #1 "]" ( #1 pid[TXTID])? ;
	
	pattern.art.instance.OtherEntry::=   "[" #1 key[STRING_LITERAL] #1 "->" #1 value[STRING_LITERAL] #1 "]" ( #1 pid[TXTID])? ;
	
	pattern.art.type.PrimitiveType::= "type" (#1 name[])? ( #1 pid[TXTID])? #1 (!1 "implementation"  #1 implem)? !0 "{" ( port | attribute )* !0 "}"  ;
	
	pattern.art.type.CompositeType::= "compositetype" (#1 name[])? ( #1 pid[TXTID])? #1 (!1 "implementation"  #1 implem)? !0 "{" ( port | attribute )* !0 "}"  ;
	
	//Type.Operation::= !1 "operation" #1 name[] "(" ("in" #1 input | "out" #1 output)? ( "," #1 ("in" #1 input | "out" #1 output) )* ")"  ;
	
	pattern.art.type.Operation::= !1 "operation" #1 (#1 name[])? ( #1 pid[TXTID])? "(" (input)? ( "," #1 input )* ")" (":" output)? ( "," #1 output )* ;
	
	pattern.art.type.Parameter::= (type[] | "?") (#1 name[])? ( #1 pid[TXTID])?;
	
	pattern.art.type.FunctionalService::= "functional" #1 "service" (#1 name[])? ( #1 pid[TXTID])? #1 "{" ( operation )* !0 "}"  ;
	
	pattern.art.type.ControlService::= "control" #1 "service" (#1 name[])? ( #1 pid[TXTID])? #1 "{" ( operation )* !0 "}"  ;
	
	pattern.art.type.Port::= !1 role[T_PORT_KIND] #1 "port" (#1 name[])? ( #1 pid[TXTID])? #1 ":" #1 ( service[] | "?" )? #1 ("[" lower[MULTIPLICITY] ".." upper[MULTIPLICITY] "]")? ;
	
	pattern.art.implem.FractalComponent::= "FractalComponent" #1 "<" "controllerDesc" #1 ":" #1 controllerDesc[STRING_LITERAL] #1 "contentDesc" #1 ":" #1 contentDesc[STRING_LITERAL]  ">"  ;
	
	pattern.art.implem.OSGiComponent::= "OSGiComponent" ( #1 pid[TXTID] )? #1 ":" #1 implementingClass[STRING_LITERAL] ;
		
	pattern.art.implem.OSGiType::= generateInstanceBundle[T_IMPLEM]  ;
	
	pattern.art.type.BasicAttribute::= !1 "attribute" (#1 name[])? ( #1 pid[TXTID])? #1 ":" #1 (type[] | "?") ( #1 "default"  #1 defaultValue[STRING_LITERAL] )? ;
	
	pattern.art.type.Dictionary::= !1 "attribute" (#1 name[])? ( #1 pid[TXTID])? #1 ":" "[" (type[] | "?") #1 "->" #1 (valueType[] | "?") "]"  ( #1 "default" #1 "{" keys* !0 "}" )?  ;
	
	pattern.art.type.DictionaryDefaultValue::= !1 "[" #1 key[STRING_LITERAL] #1 ("->" #1 value[STRING_LITERAL] )? #1 ( #1 pid[TXTID])? "]" ;
	
	pattern.art.type.PortId ::= name[];
	
	pattern.art.type.PortCollection::= !1 role[T_PORT_KIND] #1 "port" (#1 name[])? ( #1 pid[TXTID])? #1 ":" #1 ( service[] | "?") #1 "{" ids ("," #1 ids)* "}" ;
	
	pattern.art.group.TypeGroup::= "typegroup" (#1 name[])? ( #1 pid[TXTID])? #1 "{" ( !1 "types" #1 ":" #1 types[] ("," #1 types[])* )?  ( !1 subGroups)* !0 "}"  ;
		
	pattern.art.group.InstanceGroup::= "instancegroup" (#1 name[])? ( #1 pid[TXTID])? #1 "{" ( !1 "instances" #1 ":" #1 instances[] ("," #1 instances[])* )?  (!1 subGroups)* !0 "}"  ;
	
	
	//patternframework.ModelPattern::= (!1 constraints)? (!1 "featureID" #1 ":" #1 featureIdentifier[STRING_LITERAL])? !1 pattern  ( !1 "negative" #1 "pattern" #1 ":" falsepositivepatterns  )*  ;
	
	//patternframework.PModel::= "model" !0 "{" (!1 content) !0 "}" !1 ("roles" #1 ":" #1 roles ("," #1 roles)* ";")? ;
	//patternframework.PModel::=  content ( !0 "roles" #1 ":" #1 roles ("," #1 roles)* ";")? ;
		
	//patternframework.PConstraint::= "constraint" #1 "(" #1 language[] #1 ")" #1 ":" #1 expression[STRING_LITERAL] ";"  ;
	
	//patternframework.PRole::= name[] #1 ":" #1 player[] "}"  ;

}