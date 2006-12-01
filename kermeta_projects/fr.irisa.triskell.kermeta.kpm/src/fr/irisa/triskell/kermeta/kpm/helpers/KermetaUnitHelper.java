package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.concurrent.Semaphore;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

public class KermetaUnitHelper {

	final private static int MAX_AVAILABLE = 1;
	static private final Semaphore kermetaUnitFactoryAvailable = new Semaphore(MAX_AVAILABLE, true);
	
	/**
	 * Unload properly a KermetaUnit and call the garbage collector to free memory.
	 * @param unit
	 */
	static public void unloadKermetaUnit( KermetaUnit unit ) {
		
		
		/*try {
			kermetaUnitFactoryAvailable.acquire();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		*/
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		Runtime r = Runtime.getRuntime();
		
		long freeMem = r.freeMemory();
		System.out.println("free memory before running gc(): " + freeMem);
		r.gc();
		freeMem = r.freeMemory();
		System.out.println("free memory after running gc(): " + freeMem);
		
		//kermetaUnitFactoryAvailable.release();
		
	}
	
	
	//////////////////////////////////////
	//////////////////////////////////////
	//		Typechecking Mechanism		//
	//////////////////////////////////////
	//////////////////////////////////////
	static public KMTUnit typeCheckKMTFile(IFile file) {
		return typeCheckKMTFile(file.getLocation().toString());
	}
	
	static private KMTUnit typeCheckKMTFile (String absoluteFileName ) {
		unloadKermetaUnit( null );
		
		URI fileURI = URI.createFileURI(absoluteFileName);
		KMTUnit unit = (KMTUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
		if ( unit != null ) {
			unit.parse();
		    if ( ! unit.messages.hasError() ) {
		    	// No parsing errors, let us try to load.
		    	unit.load();
		    }
		    if ( ! unit.messages.hasError() ) {
		    	// No loading errors, let us try to type check.
		    	unit.typeCheck( null );
		    }
		}
		return unit;
	}
	
	/**
	 * This method typechecks the given file. This file can be either be a kmt file,
	 * or a km file. The method delegates to a specialized method.
	 * The type checking make the given file marked or unmarked depending of errors found.
	 * @param kpmFile
	 * @return The method returns the Kermeta unit used.
	 */
	static public KermetaUnit typeCheckFile(File file) {
	
		System.out.println();
		System.out.println();
		System.out.println("TYPECHECKING " + file.getRelativeName() );
		System.out.println();
		System.out.println();
	
		
		KermetaUnit unit = null;
		
		String extension = StringHelper.getExtension( file.getName() );
		
		if ( extension.equals(".kmt") ) {
			unit = typeCheckKMTFile(file);
		} /*else if ( extension.equals(".km") ) {
			unit = typeCheckKMFile(file);
		}*/
	    
		
		
		
		/*if ( unit != null ) {
			
	    	//MarkersHelper.clearMarkers( file );
	    	//MarkersHelper.createMarkers( file, unit);
			
			//associateKermetaUnitWithFile(unit, file);
			//notifyInterestedObjects(file);
		}*/
		return unit;
	}
	
	
	
	/*private KMUnit typeCheckKMFile( File file ) {
		KMUnit unit = (KMUnit) getNewKermetaUnitForFile(file);
		if ( unit != null ) {
			unit.load();
			if ( ! unit.messages.hasError() ) {
				unit.typeCheck( null );
			}
		}
		return unit;
	}*/
	
	/**
	 * This method typechecks a kmt file. It starts with a KermetaUnit creation, then parsing, loading and finally
	 * typechecking.
	 * The method always returns a KermetaUnit even if something went wrong during the typechecking process.
	 * @param file
	 * @return The method returns the Kermeta unit used.
	 */
	static private KMTUnit typeCheckKMTFile ( File file ) {
		return typeCheckKMTFile(file.getAbsoluteName());
	}
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//		End of Typechecking Mechanism		//
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	
}
