package fr.irisa.triskell.kermeta.runtime;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.eclipse.resources.EclipseMarkerHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;

public class MarkerHelper {

	public static void markFile(RuntimeObject uri, RuntimeObject message) {
	
		String uriFile = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(uri);
		String messageFile = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(message);
		
		
		//String realMessage = formatMessage(messageFile);
		IFile file = ResourceHelper.getIFile(uriFile);
		if(file != null){
			try {
				
				EclipseMarkerHelper.markError(file, messageFile);

			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		else{
			System.err.println("Cannot mark " + uriFile + " because not able to get the IFile");
		}

		
	}
	
	public static void cleanFile(RuntimeObject uri) {
		
		String uriFile = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(uri);
		
		// Retrieve IFile
		IFile file = ResourceHelper.getIFile(uriFile);
		
		if (file!=null) {
			EclipseMarkerHelper.clearMarkers(file);			
		} else {
			System.err.println("Cannot clean " + uriFile + " because not able to get the IFile");
		}
		
	}
	
	
}
