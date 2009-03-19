package fr.irisa.triskell.kermeta.runtime.loader.java5files;

import spoonEFM.util.XMI2Java;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class Java52RuntimeResource {


	public static void RegisterNewTypes(RuntimeObject self){

	}
	
	public static void createResourcesFromJavaFolder(RuntimeObject self, RuntimeObject folderToParse, RuntimeObject outputXMIFiles){
		XMI2Java.eInstance.processJavaFolder(String.getValue(folderToParse),String.getValue(outputXMIFiles));
		
	
	}
	
	public static void LoadResourcesFromJavaXMI(RuntimeObject self, RuntimeObject  outputSpoonFolder , RuntimeObject inputXMIFiles){
		XMI2Java.eInstance.processXMIFiles(String.getValue(outputSpoonFolder),String.getValue(inputXMIFiles));
	}

	
}
