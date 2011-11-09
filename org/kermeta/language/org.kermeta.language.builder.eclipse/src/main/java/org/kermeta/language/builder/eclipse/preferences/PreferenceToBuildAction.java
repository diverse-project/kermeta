package org.kermeta.language.builder.eclipse.preferences;

public class PreferenceToBuildAction {
	
	public static final String NONE = "none";
	public static final String GENERATE_KM = "GenerateKM";
	public static final String GENERATE_BYTECODE = "GenerateBytecode";
	
	
	
	public static boolean musGenerateKM(String action){
		if( action.equals(GENERATE_KM) || action.equals(GENERATE_BYTECODE)) return true;
		else return false;
	}
	
	public static boolean musGenerateBytecode(String action){
		if(action.equals(GENERATE_BYTECODE) ) return true;
		else return false;
	}

}
