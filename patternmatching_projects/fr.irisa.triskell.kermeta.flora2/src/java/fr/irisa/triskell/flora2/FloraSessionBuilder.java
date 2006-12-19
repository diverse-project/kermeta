package fr.irisa.triskell.flora2;

import java.io.IOException;
import java.net.URL;
import java.io.File;

import net.sourceforge.flora.javaAPI.src.FloraSession;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform; 
import org.osgi.framework.Bundle;

import java.util.Properties;
 
public class FloraSessionBuilder {
    
	
    private static FloraSession session;
    
    private static void initializeFloraProperties(){
	   try { 
		   //get Bundle of this Plugin
	 	   Bundle bundle = Platform.getBundle(PluginConstants.PluginID);

	 	   // get flora2.properties 
		   Path propertiesPath = new Path(PluginConstants.PROPERTY_FILE);
		   URL fileURL = FileLocator.find(bundle, propertiesPath, null);
		   Properties flora2pro = new Properties();
		   flora2pro.load(fileURL.openStream());
		   
		   boolean useAbsPath = Boolean.getBoolean( flora2pro.getProperty(PluginConstants.USE_ABS_PATH));
		   String xsbPath = flora2pro.getProperty(PluginConstants.XSB_PATH); 
		   String flora2Path = flora2pro.getProperty(PluginConstants.FLORA2_PATH);
		   
		   java.io.File fil = new java.io.File ("c:\\temp\\rodrigoteste.txt");
		   java.io.PrintWriter pq = new java.io.PrintWriter(fil); 
           pq.println("XSB: "+xsbPath); 
           pq.println("FLORA2: "+flora2Path);          
           pq.flush();
		   if ( !useAbsPath){
			   xsbPath = getResolvedPath(bundle, xsbPath);			   
			   flora2Path= getResolvedPath(bundle, flora2Path);
		   } 
		   // Because of restrictions in the XSB Engine, the Flora must be formated using the a linux file separator  
		   flora2Path = flora2Path.replace('\\', '/');
		   // The XSBPath will e used for calling a process in the command line
		   // So, we guarantee that the correct File.separator is used
		   // Obs.: URL usually uses '/', which is not accetable in windows 
		   xsbPath = getXSBConfig(xsbPath).replace('/', File.separatorChar);
		   
		   pq.println("XSB: "+xsbPath);
		   pq.println("FLORA2: "+flora2Path);
           pq.flush();
           pq.close();  
           
           //workaround to permit a Flora2 instalation independent of 
           // the location
           String flora2Patch =
        	   flora2Path+"')). "+
        	   "import flora_configuration/2 from flrregistry. "+
        	   "assert(flora_configuration(standalone,yes)). "+
        	   "assert(flora_configuration(installdir,'"+flora2Path;
        	    
	 	   // initialize properties required for the Flora2 Session		   
		   System.setProperty("FLORADIR", flora2Patch);
           System.setProperty("PROLOGDIR", xsbPath);
           System.setProperty("ENGINE", "Subprocess");
           java.lang.String javaLibPath = System.getProperty("java.library.path");           
           System.setProperty("java.library.path", javaLibPath +";"+xsbPath);		   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
    }
    
    private static String getResolvedPath(Bundle bundle, String path) throws IOException{
			URL utlPath =  FileLocator.find(bundle, new Path(path), null);   
			utlPath = FileLocator.resolve(utlPath);
			String str = utlPath.getPath();
			// According to the URL Api :
			// If the spec's path component begins with a slash character "/" then the path is treated as absolute 
			//For a more detailed description of URL parsing, refer to RFC2396.
			// So, we remove this first character ("/")			
			return str.substring(1, str.length());
    }
     
    private static String getXSBConfig(String path) throws IOException{    
    	String arch = System.getProperty("os.arch");
        String completeOSName = System.getProperty("os.name");
        // In order to avoid os.name like "Windows XP", the next lines transforms these cases in windows
        int index = completeOSName.indexOf(" ");
        index = (index != -1)? index : completeOSName.length();
        String osName = completeOSName.substring(0, index).toLowerCase();
        // Return a path in the form "<XSB_DIR>/config/x86-pc-windows/bin      
        return path+File.separator+"config"+File.separator+arch+"-pc-"+osName+File.separator+"bin";
    }
    
    public static FloraSession getSession() {
        
        if (session == null ){ 
        	initializeFloraProperties();
      /*      java.lang.String slash = java.io.File.separator;        
            Platform.getInstallLocation();
            
            //  java.lang.String eclipseHome = System.getProperty("osgi.syspath")+slash+"..";               
            //java.lang.String prologDir = eclipseHome+slash+"thirdpart"+slash+"XSB";
            java.lang.String prologDir = "c:"+java.io.File.separator+"XSB";
            java.lang.String configBin = prologDir+slash+"config"+slash+"x86-pc-windows"+slash+"bin";   
            java.lang.String floraDir = prologDir+slash+"packages"+slash+"flora2";
            java.lang.String javaLibPath = System.getProperty("java.library.path");
        */
       /* 	
   		   System.setProperty("FLORADIR", "C:/eclipse/eclipse_3.1.2/pluginWorkpace/fr.irisa.triskell.kermeta.flora2/thirdparty/XSB/packages/flora2"); 
           System.setProperty("PROLOGDIR", "C:\\eclipse\\eclipse_3.1.2\\pluginWorkpace\\fr.irisa.triskell.kermeta.flora2\\thirdparty\\XSB\\config\\x86-pc-windows\\bin");
           System.setProperty("ENGINE", "Subprocess");
           java.lang.String javaLibPath = System.getProperty("java.library.path");           
           System.setProperty("java.library.path", javaLibPath +";"+"C:\\eclipse\\eclipse_3.1.2\\pluginWorkpace\\fr.irisa.triskell.kermeta.flora2\\thirdparty\\XSB\\config\\x86-pc-windows\\bin");
        */
           
            session = new FloraSession();             
        }    
        return session;
    }
}
