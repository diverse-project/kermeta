package kermeta.standard;

import java.io.FileNotFoundException;
import java.io.IOException;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class File {
	   public static RuntimeObject generateFile(RuntimeObject _repName, RuntimeObject _fileName, RuntimeObject _content, RuntimeObject _outputFolder) {
	       	java.lang.String content  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(_content); 
	       	java.lang.String fileName  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(_fileName); 
	       	java.lang.String repName  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(_repName); 
	       	java.lang.String outputFolder = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(_outputFolder);
	       	RuntimeObject result = _content.getFactory().createObjectFromClassName("kermeta::standard::Boolean");
			try {
	       	
	       	java.io.File f = new java.io.File(outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) );
		   	if(!f.exists()) f.mkdirs();
			java.io.File f1 = new java.io.File(outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) + java.io.File.separator + fileName + ".scala");
			java.io.FileOutputStream output;
				output = new java.io.FileOutputStream(f1);
	  		java.io.PrintWriter writer = new java.io.PrintWriter(output);
		   	writer.println(content); 
	    	writer.flush();
	    	writer.close();
	    	output.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
		       	fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.setValue(result, false);
		      	return result; 
			} catch (IOException e) {
		       	fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.setValue(result, false);
				e.printStackTrace();
		      	return result; 
			}
	       	
	       	
	       	fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.setValue(result, true);
	      	return result; 
	  
	}

	   public static RuntimeObject cleanFolder(RuntimeObject _repName) {
	       	java.lang.String repName  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(_repName); 
	       	RuntimeObject result = _repName.getFactory().createObjectFromClassName("kermeta::standard::Boolean");
			java.io.File f = new java.io.File(repName);
	       	fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.setValue(result, cleanFolder(f));
	      	return result; 
	}

	   
	   public static boolean cleanFolder(java.io.File f){
			if(f.exists()){
				
				for (java.lang.String sub : f.list()){
					java.io.File subF = new java.io.File(f+java.io.File.separator+sub);
					if(subF.isDirectory()){
						cleanFolder(subF);
					} else {
						subF.delete();
					}
				}
				f.delete();
			} else {
				return false;
			}
			return true;

	   }
	   
}
