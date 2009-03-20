package fr.irisa.triskell.kermeta.runtime.loader.java5files;

import java.util.ArrayList;
import java.util.List;

import spoonemf.popup.actions.Java2XMIHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class Java52RuntimeResource {


	public static void RegisterNewTypes(RuntimeObject self){

	}
	
	public static void main( java.lang.String[] args) {
	       java.lang.String xmi_uri = "/home/barais/test3.xmi";
	      java.lang.String xmi_javaFolder = "/home/barais/workspaces/runtime-New_configuration(1)/Test/src/a/";
	      List<java.lang.String> folders = new ArrayList<java.lang.String>();
	      folders.add(xmi_javaFolder);
	      Java2XMIHelper.eInstance.processJavaFolder(folders,xmi_uri);
			
		}
	
	public static void createResourcesFromJavaFolder(RuntimeObject self, RuntimeObject folderToParse, RuntimeObject outputXMIFiles){
		List<java.lang.String> folders = new ArrayList<java.lang.String>();
	      folders.add(String.getValue(folderToParse));
	      Java2XMIHelper.eInstance.processJavaFolder(folders,String.getValue(outputXMIFiles));
		
	
	}
	
	public static void LoadResourcesFromJavaXMI(RuntimeObject self, RuntimeObject  outputSpoonFolder , RuntimeObject inputXMIFiles){
//		XMI2Java.eInstance.processXMIFiles(String.getValue(outputSpoonFolder),String.getValue(inputXMIFiles));
	}

	
}
