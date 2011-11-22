

SYNTAXDEF kp
FOR <http://www.kermeta.org/kp/1.0.0>
START KermetaProject
OPTIONS { 
    basePackage="org.kermeta.kp.editor"; 
    uiBasePackage = "org.kermeta.kp.editor.ui";
    srcFolder = "src/main/java";
    srcGenFolder = "src/main/java-gen";
    generateCodeFromGeneratorModel = "true";
    //tokenspace="0";	
    disableLaunchSupport = "true";
	disableDebugSupport = "true";
    
}

TOKENS{
    DEFINE SL_COMMENT$'//'(~('\n'|'\r'))*$;
    DEFINE ML_COMMENT $'/*'.*'*/'$ ;
    //DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
    DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
    //DEFINE SOURCE_VARIABLE${'.*'}'$;
    // DEFINE SOURCE_URL $'"'.*'"'$ ;
}

TOKENSTYLES{
	//"source" COLOR #A22000, BOLD;
	//"require" COLOR #A22000, BOLD;
    //"dependency" COLOR #A22000, BOLD;
    //"weaver-directive" COLOR #007F55, BOLD;
    "byteCodeFromADependency" COLOR #CC8000, BOLD;
    "ignoreByteCode" COLOR #CC8000, BOLD;
    "sourceOnly" COLOR #CC8000, BOLD;
    "SL_COMMENT" COLOR #348017;
    "ML_COMMENT" COLOR #348017;
}

RULES{
    
    KermetaProject::= 
   // "KermetaProject" _[WHITESPACE]* ":" _[WHITESPACE]* name['"','"'] _[WHITESPACE]* !0
    "KermetaProject" #1  name['"','"']  !1    
    (
    	(
	    	("groupId"  "="  group['"','"']  ) |
	    	("defaultMainClass"  "="   defaultMainClass['"','"']  ) |
	    	("defaultMainOperation"  "="  defaultMainOperation['"','"']  ) |
	    	("dependencies"  "=" "{" (dependencies)* !1 "}" ) |
	    	("sources"  "=" "{" (sources)* !1 "}" ) |
	    	("options"  "=" "{" (options)* !1 "}" ) |
	    	("weaveDirectives"  "=" "{" (weaveDirectives)* !1 "}" )
	    ) !1
    )*
    ;
    
    Source::=
    !2( "require" | "source")   url['"','"'] byteCodeFromADependency["byteCodeFromADependency":""]
    ;
    
    
   
    
    Dependency::=  
    !2"dependency" name['"','"']  (("=")|("URLs" "="))  url['"','"']("," url['"','"'])*  
    (ignoreByteCode["ignoreByteCode":""] | sourceOnly["sourceOnly":""] | byteCodeOnly["byteCodeOnly":""])?
    ;
    
    WeaveDirective::= 
    !2"weaver-directive" name['"','"'] "="  mix target   
    ;
    
    Option::= 
    !2"option" name['"','"'] (!2"value")? "=" value['"','"'] 
    ;
    
    StringExpression::= 
    value['"','"']
    ;
     
    MixExpression::= 
    "(" left  right ")" 
    ;
    
    
    
}