 SYNTAXDEF art2
FOR <http://art/2.0>
START ContainerRoot,Namespace,Wire,TypedElement,ComponentTypeLibrary,NamedElement

TOKENS{
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}

TOKENSTYLES{
	"ComponentInstance" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"componentType" COLOR #7F0055, BOLD;
	"hostedPorts" COLOR #7F0055, BOLD;
	"dictionary" COLOR #7F0055, BOLD;
	"requirePorts" COLOR #7F0055, BOLD;
	"namespace" COLOR #7F0055, BOLD;
	"ComponentType" COLOR #7F0055, BOLD;
	"hostedPortTypes" COLOR #7F0055, BOLD;
	"requirePortTypes" COLOR #7F0055, BOLD;
	"bean" COLOR #7F0055, BOLD;
	"portTypeRefs" COLOR #7F0055, BOLD;
	"ContainerNode" COLOR #7F0055, BOLD;
	"components" COLOR #7F0055, BOLD;
	"componentTypes" COLOR #7F0055, BOLD;
	"bindings" COLOR #7F0055, BOLD;
	"ContainerRoot" COLOR #7F0055, BOLD;
	"nodes" COLOR #7F0055, BOLD;
	"repositories" COLOR #7F0055, BOLD;
	"dataTypes" COLOR #7F0055, BOLD;
	"availablePortImpl" COLOR #7F0055, BOLD;
	"PortType" COLOR #7F0055, BOLD;
	"impl" COLOR #7F0055, BOLD;
	"interface" COLOR #7F0055, BOLD;
	"Port" COLOR #7F0055, BOLD;
	"portType" COLOR #7F0055, BOLD;
	"Namespace" COLOR #7F0055, BOLD;
	"childs" COLOR #7F0055, BOLD;
	"parent" COLOR #7F0055, BOLD;
	"PortServiceImpl" COLOR #7F0055, BOLD;
	"EReference0" COLOR #7F0055, BOLD;
	"PortActorImpl" COLOR #7F0055, BOLD;
	"PortMessageImpl" COLOR #7F0055, BOLD;
	"Dictionary" COLOR #7F0055, BOLD;
	"values" COLOR #7F0055, BOLD;
	"DictionaryType" COLOR #7F0055, BOLD;
	"attributes" COLOR #7F0055, BOLD;
	"defaultValues" COLOR #7F0055, BOLD;
	"DictionaryAttribute" COLOR #7F0055, BOLD;
	"datatype" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"DictionaryValue" COLOR #7F0055, BOLD;
	"attribute" COLOR #7F0055, BOLD;
	"Binding" COLOR #7F0055, BOLD;
	"ports" COLOR #7F0055, BOLD;
	"output" COLOR #7F0055, BOLD;
	"CompositeType" COLOR #7F0055, BOLD;
	"childPortTypes" COLOR #7F0055, BOLD;
	"wires" COLOR #7F0055, BOLD;
	"PortTypeRef" COLOR #7F0055, BOLD;
	"ref" COLOR #7F0055, BOLD;
	"Wire" COLOR #7F0055, BOLD;
	"ServiceDataType" COLOR #7F0055, BOLD;
	"operations" COLOR #7F0055, BOLD;
	"Operation" COLOR #7F0055, BOLD;
	"parameters" COLOR #7F0055, BOLD;
	"returnType" COLOR #7F0055, BOLD;
	"Parameter" COLOR #7F0055, BOLD;
	"TypedElement" COLOR #7F0055, BOLD;
	"MessageDataType" COLOR #7F0055, BOLD;
	"Repository" COLOR #7F0055, BOLD;
	"units" COLOR #7F0055, BOLD;
	"url" COLOR #7F0055, BOLD;
	"ComponentTypeLibrary" COLOR #7F0055, BOLD;
	"subComponentTypes" COLOR #7F0055, BOLD;
	"NamedElement" COLOR #7F0055, BOLD;
	"DataType" COLOR #7F0055, BOLD;
}

RULES{
	
	ComponentInstance::= "ComponentInstance"  "{" ( "name"  ":" name['"','"'] | "componentType"  ":" componentType[]| "hostedPorts"  ":" hostedPorts | "dictionary"  ":" dictionary | "requirePorts"  ":" requirePorts | "namespace"  ":" namespace[] )* "}"  ;
	
	ComponentType::= "ComponentType"  "{" ( "name"  ":" name['"','"'] | "hostedPortTypes"  ":" hostedPortTypes | "dictionary"  ":" dictionary | "requirePortTypes"  ":" requirePortTypes[]| "bean"  ":" bean['"','"'] | "portTypeRefs"  ":" portTypeRefs  )* "}"  ;
	
	ContainerNode::= "ContainerNode"  "{" ( "name"  ":" name['"','"'] | "components"  ":" components | "componentTypes"  ":" componentTypes[]| "bindings"  ":" bindings  )* "}"  ;
	
	ContainerRoot::= "ContainerRoot"  "{" ( "nodes"  ":" nodes | "componentTypes"  ":" componentTypes | "repositories"  ":" repositories | "dataTypes"  ":" dataTypes | "availablePortImpl"  ":" availablePortImpl  )* "}"  ;
	
	PortType::=synchrone[]? "PortType"  "{" ( "name"  ":" name['"','"'] | "impl"  ":" impl[]| "interface"  ":" interface  )* "}"  ;
	
	Port::= "Port"  "{" ( "name"  ":" name['"','"'] | "portType"  ":" portType[] )* "}"  ;
	
	Namespace::= "Namespace"  "{" ( "name"  ":" name['"','"'] | "childs"  ":" childs | "parent"  ":" parent[] )* "}"  ;
	
	PortServiceImpl::= "PortServiceImpl"  "{" ( "name"  ":" name['"','"'] | "EReference0"  ":" EReference0[] )* "}"  ;
	
	PortActorImpl::= "PortActorImpl"  "{" ( "name"  ":" name['"','"'] | "EReference0"  ":" EReference0[] )* "}"  ;
	
	PortMessageImpl::= "PortMessageImpl"  "{" ( "name"  ":" name['"','"'] | "EReference0"  ":" EReference0[] )* "}"  ;
	
	Dictionary::= "Dictionary"  "{" ( "values"  ":" values  )* "}"  ;
	
	DictionaryType::= "DictionaryType"  "{" ( "attributes"  ":" attributes | "defaultValues"  ":" defaultValues  )* "}"  ;
	
	DictionaryAttribute::=optional[]? "DictionaryAttribute"  "{" ( "name"  ":" name['"','"'] | "datatype"  ":" datatype[]| "type"  ":" type[] )* "}"  ;
	
	DictionaryValue::= "DictionaryValue"  "{" ( "attribute"  ":" attribute[] )* "}"  ;
	
	Binding::= "Binding"  "{" ( "ports"  ":" ports[]| "output"  ":" output[] )* "}"  ;
	
	CompositeType::= "CompositeType"  "{" ( "name"  ":" name['"','"'] | "hostedPortTypes"  ":" hostedPortTypes | "dictionary"  ":" dictionary | "requirePortTypes"  ":" requirePortTypes[]| "bean"  ":" bean['"','"'] | "portTypeRefs"  ":" portTypeRefs | "childs"  ":" childs | "childPortTypes"  ":" childPortTypes | "wires"  ":" wires[] )* "}"  ;
	
	PortTypeRef::= "PortTypeRef"  "{" ( "name"  ":" name['"','"'] | "ref"  ":" ref[] )* "}"  ;
	
	Wire::= "Wire"  "{" ( "ports"  ":" ports[] )* "}"  ;
	
	ServiceDataType::= "ServiceDataType"  "{" ( "name"  ":" name['"','"'] | "operations"  ":" operations  )* "}"  ;
	
	Operation::= "Operation"  "{" ( "name"  ":" name['"','"'] | "parameters"  ":" parameters | "returnType"  ":" returnType[] )* "}"  ;
	
	Parameter::= "Parameter"  "{" ( "name"  ":" name['"','"'] | "datatype"  ":" datatype[]| "type"  ":" type[] )* "}"  ;
	
	TypedElement::= "TypedElement"  "{" ( "name"  ":" name['"','"'] | "datatype"  ":" datatype[] )* "}"  ;
	
	MessageDataType::= "MessageDataType"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
	
	Repository::= "Repository"  "{" ( "name"  ":" name['"','"'] | "units"  ":" units[]| "url"  ":" url['"','"']  )* "}"  ;
	
	ComponentTypeLibrary::= "ComponentTypeLibrary"  "{" ( "name"  ":" name['"','"'] | "subComponentTypes"  ":" subComponentTypes  )* "}"  ;
	
	NamedElement::= "NamedElement"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
	
	DataType::= "DataType"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
	
}