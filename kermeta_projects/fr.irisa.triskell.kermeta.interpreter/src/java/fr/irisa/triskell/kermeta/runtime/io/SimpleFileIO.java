package fr.irisa.triskell.kermeta.runtime.io;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import java.io.*;

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
}
