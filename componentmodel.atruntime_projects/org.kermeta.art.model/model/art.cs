 SYNTAXDEF art
FOR <http://art>
START System

TOKENS{
		DEFINE COMMENT$'//'(~('\n'|'\r'))*$;
		DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
		DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
		
}

RULES{
		
		System::= "System"  "{" ( "name"  ":" name['"','"'] | "root"  ":" root | "services"  ":" services | "types"  ":" types | "dataTypes"  ":" dataTypes | "groups"  ":" groups  )* "}"  ;
		
		DataType::= "DataType"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
		
		PrimitiveInstance::= "PrimitiveInstance"  "{" ( "name"  ":" name['"','"'] | "type"  ":" type[]| "state"  ":" state['"','"'] | "superComponent"  ":" superComponent[]| "attribute"  ":" attribute | "binding"  ":" binding | "implem"  ":" implem | "groups"  ":" groups[] )* "}"  ;
		
		CompositeInstance::= "CompositeInstance"  "{" ( "name"  ":" name['"','"'] | "type"  ":" type[]| "state"  ":" state['"','"'] | "superComponent"  ":" superComponent[]| "attribute"  ":" attribute | "binding"  ":" binding | "implem"  ":" implem | "groups"  ":" groups[]| "subComponent"  ":" subComponent | "delegation"  ":" delegation  )* "}"  ;
		
		TransmissionBinding::= "TransmissionBinding"  "{" ( "serverInstance"  ":" serverInstance[]| "id"  ":" id['"','"'] | "client"  ":" client[]| "server"  ":" server[] )* "}"  ;
		
		DelegationBinding::= "DelegationBinding"  "{" ( "serverInstance"  ":" serverInstance[]| "id"  ":" id['"','"'] | "source"  ":" source[]| "exported"  ":" exported[] )* "}"  ;
		
		ValuedAttribute::= "ValuedAttribute"  "{" ( "value"  ":" value['"','"'] | "attribute"  ":" attribute[] )* "}"  ;
		
		DictionaryValuedAttribute::= "DictionaryValuedAttribute"  "{" ( "entries"  ":" entries | "attribute"  ":" attribute[] )* "}"  ;
		
		DefaultEntry::= "DefaultEntry"  "{" ( "value"  ":" value['"','"'] | "key"  ":" key[] )* "}"  ;
		
		OtherEntry::= "OtherEntry"  "{" ( "value"  ":" value['"','"'] | "key"  ":" key['"','"']  )* "}"  ;
		
		PrimitiveType::= "PrimitiveType"  "{" ( "name"  ":" name['"','"'] | "port"  ":" port | "attribute"  ":" attribute | "groups"  ":" groups[]| "implem"  ":" implem  )* "}"  ;
		
		CompositeType::= "CompositeType"  "{" ( "name"  ":" name['"','"'] | "port"  ":" port | "attribute"  ":" attribute | "groups"  ":" groups[]| "implem"  ":" implem  )* "}"  ;
		
		Operation::= "Operation"  "{" ( "name"  ":" name['"','"'] | "input"  ":" input | "output"  ":" output  )* "}"  ;
		
		Parameter::= "Parameter"  "{" ( "name"  ":" name['"','"'] | "type"  ":" type[] )* "}"  ;
		
		FunctionalService::= "FunctionalService"  "{" ( "name"  ":" name['"','"'] | "operation"  ":" operation  )* "}"  ;
		
		ControlService::= "ControlService"  "{" ( "name"  ":" name['"','"'] | "operation"  ":" operation  )* "}"  ;
		
		Port::= "Port"  "{" ( "name"  ":" name['"','"'] | "lower"  ":" lower[]| "upper"  ":" upper[]| "isOptional"  ":" isOptional[]| "service"  ":" service[]| "role"  ":" role['"','"'] | "implem"  ":" implem  )* "}"  ;
		
		FractalComponent::= "FractalComponent"  "{" ( "controllerDesc"  ":" controllerDesc['"','"'] | "contentDesc"  ":" contentDesc['"','"']  )* "}"  ;
		
		OSGiComponent::= "OSGiComponent"  "{" ( "implementingClass"  ":" implementingClass['"','"']  )* "}"  ;
		
		PortImplementation::= "PortImplementation"  "{"  "}"  ;
		
		OSGiPort::= "OSGiPort"  "{" ( "serviceId"  ":" serviceId['"','"']  )* "}"  ;
		
		TypeGroup::= "TypeGroup"  "{" ( "name"  ":" name['"','"'] | "types"  ":" types[]| "subGroups"  ":" subGroups  )* "}"  ;
		
		InstanceGroup::= "InstanceGroup"  "{" ( "name"  ":" name['"','"'] | "instances"  ":" instances[]| "subGroups"  ":" subGroups  )* "}"  ;
		
		OSGiType::= "OSGiType"  "{" ( "generateInstanceBundle"  ":" generateInstanceBundle[] )* "}"  ;
		
		BasicAttribute::= "BasicAttribute"  "{" ( "name"  ":" name['"','"'] | "type"  ":" type[]| "defaultValue"  ":" defaultValue['"','"']  )* "}"  ;
		
		Dictionary::= "Dictionary"  "{" ( "name"  ":" name['"','"'] | "type"  ":" type[]| "valueType"  ":" valueType[]| "keys"  ":" keys  )* "}"  ;
		
		DictionaryDefaultValue::= "DictionaryDefaultValue"  "{" ( "key"  ":" key['"','"'] | "value"  ":" value['"','"']  )* "}"  ;
		
}