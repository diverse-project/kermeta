

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
    //DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
    //DEFINE SOURCE_VARIABLE${'.*'}'$;
    // DEFINE SOURCE_URL $'"'.*'"'$ ;
}

TOKENSTYLES{
	//"source" COLOR #A22000, BOLD;
    //"weaver-directive" COLOR #007F55, BOLD;
    //"extends" COLOR #CC8000, BOLD;
    "SL_COMMENT" COLOR #348017;
    "ML_COMMENT" COLOR #348017;
}

RULES{
    
    KermetaProject::=
     (  	(importedProjects) |
		   	reusableResources
	    )* 
    "project" #1  metamodelName[] ("extends" importedProjectSources("," importedProjectSources)*)? "{"
    	(!1"mainClass"  defaultMainClass['"','"']  )?
	    (!1"mainOperation"  defaultMainOperation['"','"']  )?
	    (!1"javaBasePackage"  javaBasePackage['"','"']  )? 
	    (  	importedFiles   )*
	    "}"
	   
    ;
    
    
    PackageEquivalence::=
   	!3"packageEquivalence" ecorePackage['"','"']  ("=")  javaPackage['"','"'] 
    ;
        
    
    // TODO deal with syntax for "using KMFBytecode()" and "using EMFBytecode()" (the later is equivalent to the default)
    ImportFile::=
    	!1"import" url['"','"'] ("using" "EMFBytecode" bytecodeFrom['(',')'] ("{" (packageEquivalences)* "}")? )?
    ;
   	ImportProject ::=
   		!0"importProject" projectResource[] 
   	;
   	ImportProjectSources ::=
   		projectResource[]
   	;
   	
    ReusableResource ::=
    	!0"resource" reusableResourceName[] "=" url['"','"'] (!2"alternative" alternateUrls['"','"']("," alternateUrls['"','"'])* )?
    ;
}