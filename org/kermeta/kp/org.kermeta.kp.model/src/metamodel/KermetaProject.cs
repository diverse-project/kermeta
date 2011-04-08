

SYNTAXDEF kp
FOR <http://www.kermeta.org/kp/1.0.0>
START KermetaProject
OPTIONS { 
    basePackage="org.kermeta.kp.editor"; 
    uiBasePackage = "org.kermeta.kp.editor.ui";
    srcFolder = "src/main/java";
    srcGenFolder = "src/main/java-gen";
    generateCodeFromGeneratorModel = "true";
    tokenspace="0";
    
}

TOKENS{
    DEFINE SL_COMMENT$'//'(~('\n'|'\r'))*$;
    DEFINE ML_COMMENT $'/*'.*'*/'$ ;
    DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
    DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;  
}

TOKENSTYLES{
    "dependency" COLOR #A22000, BOLD;
    "weaver-directive" COLOR #007F55, BOLD;
    "merger-option" COLOR #CC8000, BOLD;
    "SL_COMMENT" COLOR #348017;
    "ML_COMMENT" COLOR #348017;
}

RULES{
    
    KermetaProject::= 
   // "KermetaProject" _[WHITESPACE]* ":" _[WHITESPACE]* name['"','"'] _[WHITESPACE]* !0
    "KermetaProject" ":"  name['"','"']  !0
    (
    	(
	    	("version"  ":"  version['"','"']  ) |
	    	("group"  ":"   group['"','"']  ) |
	    	("defaultMainClass"  ":"   defaultMainClass['"','"']  ) |
	    	("defaultMainOperation"  ":"  defaultMainOperation['"','"']  )
	    ) !0
    )*
    "{"
        (!1sources!0 | !1dependencies!0 |  !1options!0 | !1weaveDirectives )*!0
    "}"!0
    ("ref" "{" (!1ref)*!0 "}")? 
    ;
    
    Source::=
    "source"  "=" url['"','"']
    ;
    
    SourceFolder::=  
    "srcDir" "=" (folderName['"','"'] | url['"','"'] )  
    ;
    
    SourceFile::= 
    "srcFile" "=" (fileName['"','"'] | url['"','"'] ) 
    ;
    
    SourceNSURI::=  
    "srcNSURI" "=" url['"','"']  ("from" from['"','"'])?  
    ;
    
    SourceQuery::=  
    "srcQuery" "=" query['"','"'] ("from" from['"','"'] ("URL" "=" url['"','"'])?)?  
    ;
    
    Dependency::=  
    "dependency" name['"','"'] "URL" "=" url['"','"'] |
    "dependency" name['"','"'] "=" depRef['"','"'] group['"','"']? version['"','"']?
    ;
    
    WeaveDirective::= 
    "weaver-directive" name['"','"']? "="  mix target   
    ;
    
    Option::= 
    "merger-option" name['"','"']? "=" value['"','"'] 
    ;
    
    StringExpression::= 
    value['"','"']
    ;
     
    MixExpression::= 
    "(" left  right ")" 
    ;
    
    KermetaProjectRef ::= 
    group['"','"']  ":" name['"','"'] ("URL" "=" url['"','"'])? ("[" version['"','"'] "]")?
    ;
    
}