/* $Id: BackupHelper.java,v 1.1 2005-02-22 17:18:40 zdrey Exp $
 * Created on Feb 22, 2005
 * Author : zdrey
 * Description : describe here your class role
 * TODO : write here your TODO actions
 */
package fr.irisa.triskell.kermeta.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * This class contains sme useful methods to save files as archives.
 */
public class BackupHelper {

 	/**
	 * @param backupdir backup directory where the "backed-up" files are stored
	 * @param filepath filepath of the file that we want to backup
	 */
	public static void backupFile(String backupdir, String filepath)
	{
	    // Get the filename of file specified by filepath
	    String[] spf = filepath.split(File.separator);
	    String filename = spf[spf.length-1];
	    
	    File dir = new File(backupdir);
	    File newf = null;
	    String[] listdir = dir.list();
	    int save_i = 0;
	    // Get the number of existings archives for the given file
	    for (int i=0; i < listdir.length; i++)
	    {
	        if (listdir[i].startsWith(filename))
	        {
	            save_i += 1 ;
	        }
	    }
	    
	    String backup_filepath = backupdir+File.separator+filename; // fixme : use java facilities
	    File oldf = new File(backup_filepath);
	    
	    // Rename last version of file
	    if (oldf.exists())
	    {
	        newf = new File(backup_filepath+".bak."+save_i);
	        oldf.renameTo(newf);
	    }
	    // Copy last version of file for a first backup.
	    if (new File(filepath).exists())/*Copy old file in arch_dir*/
	    {
	        FileReader in; // to read filepath content
	        FileWriter out; // backup_filepath content
            try
            {
                in = new FileReader(new File(filepath));
                out = new FileWriter(oldf);
                int c;
                while ((c = in.read()) != -1)
                    out.write(c);
                
                in.close();
                out.close();
            }
            catch (Exception e) // IO or FileNotFound
            {
                e.printStackTrace();
            }
	    }	
	}
	


}
