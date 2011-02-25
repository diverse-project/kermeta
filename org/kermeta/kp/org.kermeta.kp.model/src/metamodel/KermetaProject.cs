

SYNTAXDEF kpt
FOR <http://www.kermeta.org/kp/1.0.0>
START KermetaProject
OPTIONS { 
    basePackage="org.kermeta.kp.editor"; 
    uiBasePackage = "org.kermeta.kp.editor.ui";
    srcFolder = "src/main/java";
    srcGenFolder = "src/main/java-gen";
    generateCodeFromGeneratorModel = "true";
}

TOKENS{
    DEFINE SL_COMMENT$'//'(~('\n'|'\r'))*$;
    DEFINE ML_COMMENT $'/*'.*'*/'$ ;
    DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
    DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
    DEFINE NSURI$('A'..'Z')(('_')?('A'..'Z'))*$;
    DEFINE MVNURI$'"''mvn:'.*'"'$;
  
}

TOKENSTYLES{
    "dependency" COLOR #A22000, BOLD;
    "weaver-directive" COLOR #007F55, BOLD;
    "merger-option" COLOR #CC8000, BOLD;
    "SL_COMMENT" COLOR #348017;
    "ML_COMMENT" COLOR #348017;
    "MVNURI" COLOR #2554C7, BOLD;
    "NSURI" COLOR #2554C7, BOLD;
}

RULES{
    
    KermetaProject::= 
    "KermetaProject" ":" name['"','"'] !0
    "version" ": " version['"','"'] !0
    "group"  ":" group['"','"'] !0
    "{"
        (!1sources!0 | !1dependencies!0 |  !1options!0 | !1weaveDirectives )*!0
    "}"!0
    "ref" "{" (!1ref)*!0 "}" 
    ;
    
    SourceFolder::=  
    "srcDir" "=" folderName['"','"']   
    ;
    
    SourceFile::= 
    "srcFile" "=" uri['"','"'] 
    ;
    
    SourceNSURI::=  
    "srcNSURI" "=" uri[NSURI]  "from" from['"','"']  
    ;
    
    SourceQuery::=  
    "srcQuery" "=" query['"','"'] "from" from['"','"']  
    ;
    
    Dependency::=  
    "dependency" name['"','"'] "=" (uri[MVNURI] | depRef['"','"']) | "dependency" depRef['"','"']
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
    
    NamedElement ::= 
    name[] 
    ;
    
    KermetaProjectRef ::= 
    group['"','"']  ":" name['"','"'] uri[MVNURI]? ("[" version['"','"'] "]")?
    ;
    
}