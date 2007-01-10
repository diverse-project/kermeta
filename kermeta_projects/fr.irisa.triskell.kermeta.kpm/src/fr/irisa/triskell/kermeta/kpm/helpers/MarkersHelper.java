package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.core.markers.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.message.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.message.KMUnitWarning;

public class MarkersHelper {

    
    public static void clearMarkers(File file) {
    	IFile f = KermetaWorkspace.getInstance().getIFile(file);
    	KermetaMarkersHelper.clearMarkers(f);
    }

    public static void createMarker(File file, String message) {
    	IFile f = KermetaWorkspace.getInstance().getIFile( file );
    	KermetaMarkersHelper.createMarker(f, message);   	
    }
    
    static public void createMarkers( File file, KermetaUnit unit ) {
    	if ( unit instanceof KMTUnit ) {
    		createMarkersForKMTFile(file, (KMTUnit) unit);
    	} else if ( unit instanceof KMUnit ) {
    		createMarkersForKMFile(file, (KMUnit) unit);
    	}
    }
    
    
    /**
     *  Create markers for showing to the user the elements that are errored, or
     *  that are subjects to warnings.
     */
    private static void createMarkersForKMTFile( File kmtFile, KMTUnit unit )
    {
    	IFile file = KermetaWorkspace.getInstance().getIFile( kmtFile );
    	for (Object next : unit.messages.getErrors()) KermetaMarkersHelper.createMarkerForKMTFile(file, (KMUnitMessage)next, unit);
    	for (Object next : unit.messages.getWarnings()) KermetaMarkersHelper.createMarkerForKMTFile(file, (KMUnitMessage)next, unit);
    }
    
    private static void createMarkersForKMFile ( File kmFile, KMUnit unit ) {
    	IFile file = KermetaWorkspace.getInstance().getIFile( kmFile );
    	for (Object next : unit.messages.getErrors()) KermetaMarkersHelper.createMarkerForKMFile(file, (KMUnitMessage)next, unit);
    	for (Object next : unit.messages.getWarnings()) KermetaMarkersHelper.createMarkerForKMFile(file, (KMUnitMessage)next, unit);
    	
    }
    
}
