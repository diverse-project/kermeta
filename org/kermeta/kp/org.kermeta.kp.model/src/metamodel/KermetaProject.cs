

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
    "KermetaProject" #1  eclipseName['"','"']  
    	(!1"defaultMainClass"  defaultMainClass['"','"']  )?
	    (!1"defaultMainOperation"  defaultMainOperation['"','"']  )?
	    (!1"javaBasePackage"  javaBasePackage['"','"']  )?
	     
	    (  	(metamodels) |
		   	(importedProjectJars) |
		   	(importedProjectSources) |
		   	(importedBytecodeJars) |
		   	reusableResources
	    )*
    ;
    
    
    PackageEquivalence::=
   	!3"packageEquivalence" ecorePackage['"','"']  ("=")  javaPackage['"','"'] 
    ;
        
    Metamodel::=
    !1metamodelName[TEXT] ("extends" (extends[](","extends[])*))? "{"
    	(
    	importedFiles 
    	)* 
    !1"}"
    ;
    
    ImportFile::=
    	!2"importFile" url['"','"'] ("withBytecodeFrom" bytecodeFrom[] (packageEquivalences)*)?
    ;
   	ImportProjectJar ::=
   		!1 "importProjectJar"  url['"','"'] 
   	;
   	ImportProjectSources ::=
   		!1"importProjectSource" url['"','"']
   	;
   	ImportBytecodeJar ::=
   		!1"importBytecodeJar" url['"','"']
   	;
   	
    ReusableResource ::=
    	!1reusableResourceName[] "=" url['"','"'] (!2"alternative" alternateUrls['"','"']("," alternateUrls['"','"'])* )?
    ;
}