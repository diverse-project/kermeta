package fr.irisa.triskell.kermeta.runtime.io;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import java.io.*;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;




public class SimpleFileIO {
	
	public static RuntimeObject fileExists(RuntimeObject filename)
    {
		java.lang.String fname = String.getValue(filename);
		File file = new File(fname);
		if (file.exists()) return filename.getFactory().getMemory().trueINSTANCE;
		else return filename.getFactory().getMemory().falseINSTANCE;
    }
	
	public static RuntimeObject fileIsDirectory(RuntimeObject filename)
    {
		java.lang.String fname = String.getValue(filename);
		File file = new File(fname);
		if (file.isDirectory()) return filename.getFactory().getMemory().trueINSTANCE;
		else return filename.getFactory().getMemory().falseINSTANCE;
    }
	
	
	public static RuntimeObject writeTextFile(RuntimeObject filename, RuntimeObject text)
    {
        try
        {
            FileWriter fw = new FileWriter(String.getValue(filename));
            fw.write(String.getValue(text));
            fw.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        return filename.getFactory().getMemory().voidINSTANCE;
    }

    public static RuntimeObject readTextFile(RuntimeObject filename)
    {
        BufferedReader br = null;
        StringBuilder builder = new StringBuilder();
        java.lang.String ligne;
       	try {
			br = new BufferedReader(new FileReader(String.getValue(filename)));
			while((ligne = br.readLine()) != null) builder.append(ligne);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        RuntimeObject result = String.create(builder.toString(), filename.getFactory());
        return result;
    }
    
    /**
     * 
     * @param foldername
     * @return path of the current folder of the file calling this operation
     */
    public static RuntimeObject getAbsolutePathFolder(RuntimeObject foldername)
    {   	
    	IFile fileKermeta = ResourceHelper.getIFile(foldername.getFactory().getMemory().getUnit().getUri());
    	RuntimeObject result = null;

    	if (fileKermeta.exists()){
    		java.lang.String pathFile = fileKermeta.getLocation().toString();
        	java.lang.String pathFolder = pathFile.substring(0,pathFile.lastIndexOf("/")+1) + String.getValue(foldername);
   		 	
   		 	
   		 	File folder = new File(pathFolder);
   		 	if (folder.exists()){
   		 		result = String.create(pathFolder, foldername.getFactory());
   		 	}else{
   		 		result = String.create("Cannot find path.", foldername.getFactory());
   		 	}
    	}else{
    		result = String.create("Cannot find path.", foldername.getFactory());
    	}
    	
		return result;
    }
}
