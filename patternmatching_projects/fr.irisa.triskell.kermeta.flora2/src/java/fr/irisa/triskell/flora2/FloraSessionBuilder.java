package fr.irisa.triskell.flora2;

import net.sourceforge.flora.javaAPI.src.FloraSession;
import org.eclipse.core.runtime.Platform; 
public class FloraSessionBuilder {

    private static FloraSession session;
    
    public static FloraSession getSession() {
        
        if (session == null ){            
            java.lang.String slash = java.io.File.separator;        
            Platform.getInstallLocation();
            
            java.lang.String eclipseHome = System.getProperty("osgi.syspath")+slash+"..";      
            java.lang.String prologDir = eclipseHome+slash+"thirdpart"+slash+"XSB";         
            java.lang.String configBin = prologDir+slash+"config"+slash+"x86-pc-windows"+slash+"bin";   
            java.lang.String floraDir = prologDir+slash+"packages"+slash+"flora2";
            java.lang.String javaLibPath = System.getProperty("java.library.path");
            
            floraDir = floraDir.replace('\\', '/');

            
            // Common procedure to create a new Flora2 Session using the 
            // Flora2 Java API
            System.setProperty("FLORADIR", floraDir);
            System.setProperty("PROLOGDIR", configBin);
            System.setProperty("ENGINE", "Subprocess");
            System.setProperty("java.library.path", javaLibPath +";"+configBin);                           
            session = new FloraSession();             
        }    
        return session;
    }
}
