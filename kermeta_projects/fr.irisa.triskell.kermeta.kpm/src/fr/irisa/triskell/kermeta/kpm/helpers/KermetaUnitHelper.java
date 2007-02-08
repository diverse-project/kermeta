package fr.irisa.triskell.kermeta.kpm.helpers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

public class KermetaUnitHelper {
	
	/**
	 * Unload properly a KermetaUnit and call the garbage collector to free memory.
	 * @param unit
	 */
	static public void unloadKermetaUnit( KermetaUnit unit ) {
		KermetaUnitFactory.getDefaultLoader().unloadAll();
	}
	
	static public void unloadKermetaUnitAndFreeMemory( KermetaUnit unit ) {
		unloadKermetaUnit(unit);
		garbageCollect();
	}
	
	static private void garbageCollect() {
		Runtime r = Runtime.getRuntime();
		long freeMem = r.freeMemory();
		System.out.println("free memory before running gc(): " + freeMem);
		r.gc();
		freeMem = r.freeMemory();
		System.out.println("free memory after running gc(): " + freeMem);
	}
	
	//////////////////////////////////////
	//////////////////////////////////////
	//		Typechecking Mechanism		//
	//////////////////////////////////////
	//////////////////////////////////////
	static public KMTUnit typeCheckKMTFile(IFile file, String content) {
		return typeCheckKMTFile(file.getLocation().toString(), content);
	}
	
	/**
	 * 
	 * Intelligent typechecking operation. There are three steps :
	 * 1) parsing
	 * 2) loading
	 * 3) typechecking
	 * 
	 *  If one of the step fails, the following steps are not processed. 
	 * 
	 * @param absoluteFileName
	 * @param content
	 * @return
	 */
	static private KMTUnit typeCheckKMTFile (String absoluteFileName, String content ) {
		unloadKermetaUnit( null );
		
		URI fileURI = URI.createFileURI(absoluteFileName);
		KMTUnit unit = (KMTUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
		if ( unit.isType_checked() )
			return unit;

		if ( unit != null ) {
			if ( content != null )	
				unit.parseString(content);
			//else if ( KermetaWorkspace.getInstance().getContent(unit.getUri()) != null )
				//unit.parseString( KermetaWorkspace.getInstance().getContent(unit.getUri()) );
			else
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
		
		garbageCollect();
		
		return unit;
	}
	
	/**
	 * This method typechecks the given file. This file can be either be a kmt file,
	 * or a km file. The method delegates to a specialized method.
	 * The type checking make the given file marked or unmarked depending of errors found.
	 * @param kpmFile
	 * @return The method returns the Kermeta unit used.
	 */
	static public KermetaUnit typeCheckFile(IFile file, String content) {
	
		System.out.println();
		System.out.println();
		System.out.println("TYPECHECKING " + file.getLocation().toString() );
		System.out.println();
		System.out.println();
	
		
		KermetaUnit unit = null;
		
		String extension = StringHelper.getExtension( file.getName() );
		
		if ( extension.equals(".kmt") ) {
			unit = typeCheckKMTFile(file, content);
		} else if ( extension.equals(".km") ) {
			URI fileURI = URI.createFileURI(file.getLocation().toString());
			unit = (KMUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			unit.load();
		}
		
		return unit;
	}
	
	static public KermetaUnit typeCheckFile(IFile file) {
		return typeCheckFile(file, null);
	}
	
	static public KermetaUnit typeCheckFile(File file) {
		return typeCheckFile( IResourceHelper.getIFile(file) );
	}
	
	/**
	 * This method typechecks a kmt file. It starts with a KermetaUnit creation, then parsing, loading and finally
	 * typechecking.
	 * The method always returns a KermetaUnit even if something went wrong during the typechecking process.
	 * @param file
	 * @return The method returns the Kermeta unit used.
	 */
	/*static private KMTUnit typeCheckKMTFile ( IFile file, String content ) {
		return typeCheckKMTFile(file.getAbsoluteName(), content);
	}*/
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//		End of Typechecking Mechanism		//
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	
}
