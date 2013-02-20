package org.kermeta.language.builder.eclipse.preferences;

public class PreferenceToBuildAction {
	
	public static final String NONE = "none";
	public static final String PARSE_KMT = "ParseKMT";
	public static final String UNCHECKED_GENERATE_KM = "UncheckedGenerateKM";
	public static final String GENERATE_KM = "GenerateKM";
	public static final String GENERATE_BYTECODE = "GenerateBytecode";
	
	
	
	public static boolean mustGenerateKM(String action){
		if( action.equals(UNCHECKED_GENERATE_KM) ||action.equals(GENERATE_KM) || action.equals(GENERATE_BYTECODE)) return true;
		else return false;
	}
	
	public static boolean mustCheck(String action){
		if( action.equals(GENERATE_KM) || action.equals(GENERATE_BYTECODE)) return true;
		else return false;
	}
	
	public static boolean mustGenerateBytecode(String action){
		if(action.equals(GENERATE_BYTECODE) ) return true;
		else return false;
	}
	public static boolean mustParse(String action){
		if(! action.equals(NONE) ) return true;
		else return false;
	}

}
