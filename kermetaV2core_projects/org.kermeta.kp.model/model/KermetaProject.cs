 SYNTAXDEF kpt
FOR <http://www.kermeta.org/kp/1.0.0>
START KermetaProject,NamedElement

TOKENS{
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}

TOKENSTYLES{
	"KermetaProject" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"dependencies" COLOR #7F0055, BOLD;
	"sources" COLOR #7F0055, BOLD;
	"weaveDirectives" COLOR #7F0055, BOLD;
	"options" COLOR #7F0055, BOLD;
	"version" COLOR #7F0055, BOLD;
	"group" COLOR #7F0055, BOLD;
	"Dependency" COLOR #7F0055, BOLD;
	"project" COLOR #7F0055, BOLD;
	"NamedElement" COLOR #7F0055, BOLD;
	"SourceFolder" COLOR #7F0055, BOLD;
	"SourceFile" COLOR #7F0055, BOLD;
	"SourceNSURI" COLOR #7F0055, BOLD;
	"from" COLOR #7F0055, BOLD;
	"SourceQuery" COLOR #7F0055, BOLD;
	"WeaveDirective" COLOR #7F0055, BOLD;
	"mix" COLOR #7F0055, BOLD;
	"target" COLOR #7F0055, BOLD;
	"Option" COLOR #7F0055, BOLD;
	"value" COLOR #7F0055, BOLD;
	"Expression" COLOR #7F0055, BOLD;
	"StringExpression" COLOR #7F0055, BOLD;
	"MixExpression" COLOR #7F0055, BOLD;
	"left" COLOR #7F0055, BOLD;
	"right" COLOR #7F0055, BOLD;
}

RULES{
	
	KermetaProject::= "KermetaProject"  "{" ( "name"  ":" name['"','"'] | "dependencies"  ":" dependencies | "sources"  ":" sources | "weaveDirectives"  ":" weaveDirectives | "options"  ":" options | "version"  ":" version['"','"'] | "group"  ":" group['"','"']  )* "}"  ;
	
	Dependency::= "Dependency"  "{" ( "name"  ":" name['"','"'] | "project"  ":" project[] )* "}"  ;
	
	NamedElement::= "NamedElement"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
	
	SourceFolder::= "SourceFolder"  "{"  "}"  ;
	
	SourceFile::= "SourceFile"  "{"  "}"  ;
	
	SourceNSURI::= "SourceNSURI"  "{" ( "from"  ":" from[] )* "}"  ;
	
	SourceQuery::= "SourceQuery"  "{" ( "from"  ":" from[] )* "}"  ;
	
	WeaveDirective::= "WeaveDirective"  "{" ( "name"  ":" name['"','"'] | "mix"  ":" mix | "target"  ":" target  )* "}"  ;
	
	Option::= "Option"  "{" ( "name"  ":" name['"','"'] | "value"  ":" value['"','"']  )* "}"  ;
	
	Expression::= "Expression"  "{"  "}"  ;
	
	StringExpression::= "StringExpression"  "{" ( "value"  ":" value['"','"']  )* "}"  ;
	
	MixExpression::= "MixExpression"  "{" ( "left"  ":" left | "right"  ":" right  )* "}"  ;
	
}