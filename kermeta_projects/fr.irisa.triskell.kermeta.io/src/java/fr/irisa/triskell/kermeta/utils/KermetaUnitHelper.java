package fr.irisa.triskell.kermeta.utils;

import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;



/**
 * 
 * This class provides user friendly function to typecheck a file.
 * The entry point is a static method "typecheckFile" which responsibility is to dispatch
 * the work to the correct typecher (KMT or KM).
 * 
 * An important point : 
 * In Kermeta there are shared resources problems. When two typechecking on the same file are processed at the same time,
 * it badly crash and make the text editor or interpreter becoming crazy.
 * This class takes care of such a thing. For more detail see the intern class TypecheckerThread and the method internTypecheckFile.
 * 
 * @author paco
 *
 */
public class KermetaUnitHelper {
	
	
	//////////////////////////////////////
	//////////////////////////////////////
	//		Typechecking Mechanism		//
	//////////////////////////////////////
	//////////////////////////////////////////////////////
	//													//
	// The mechanism is entirely hidden from the user.  //
	//													//
	//////////////////////////////////////////////////////
	
	
	/**
	 * 
	 * A simple class that just calls a specific typechecking method.
	 * As it is a thread, it can easily be controlled by an other object.
	 * 
	 * @author paco
	 *
	 */
	private class TypecheckerThread extends Thread {
		public KMTUnit unit;
		
		protected String absoluteFileName;
		protected String content;
		public IProgressMonitor monitor;
		
		public TypecheckerThread(String absoluteFileName, String content, IProgressMonitor monitor) {
			this.absoluteFileName = absoluteFileName;
			this.content = content;
			this.monitor = monitor;
		}
		
		public void run() {
			unit = __typecheckKMTFile(absoluteFileName, content, monitor);		
		}
	}
	
	/**
	 * As the class uses synchronization, it needs to be done via an instance.
	 */
	static private KermetaUnitHelper instance = new KermetaUnitHelper();

	
	/**
	 * A table to be able to check if a typechecking process is running.
	 */
	private Hashtable <String, TypecheckerThread> typecheckingThreads = new Hashtable <String, TypecheckerThread> ();
	
	/**
	 * 
	 * @param absoluteFileName
	 * @param content
	 * @return
	 */
	private KMTUnit internTypecheckKMTFile(String absoluteFileName, String content, IProgressMonitor monitor) {
		
		if ( Runtime.getRuntime().freeMemory() < 1000000 ) {
			KermetaUnit.internalLog.info("Unloading all Kermeta Unit but the framework.km.");
			unloadAllKermetaUnit();
		}
		
		KMTUnit result = null;
		try {
			TypecheckerThread thread;
			synchronized (typecheckingThreads) {
				thread = typecheckingThreads.get(absoluteFileName);
				if ( thread == null ) {
					thread = new TypecheckerThread(absoluteFileName, content, monitor);
					typecheckingThreads.put(absoluteFileName, thread);
				}
			}
			synchronized (thread) {
				if ( ! thread.isAlive() ) 
					thread.start();
			}
			try {
				while ( thread.isAlive() ) {
					thread.join();
					result = thread.unit;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			synchronized(typecheckingThreads) {
				typecheckingThreads.remove(absoluteFileName);
			}
		}
		return result;
	}
	
	
	/**
	 * That is the method called by the thread.
	 * @param absoluteFileName
	 * @param content
	 * @return
	 */
	static private KMTUnit __typecheckKMTFile (String absoluteFileName, String content, IProgressMonitor monitor) {
		
		URI fileURI = URI.createFileURI(absoluteFileName);
		KMTUnit unit = (KMTUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
		// If already parsed, do nothing
		if ( unit.isType_checked() ) {
			System.out.println("***************************** No need to typecheck " + absoluteFileName + "*********************");	
			return unit;
		}

		System.out.println("***************************** Typechecking " + absoluteFileName + "*********************");
		
		if ( unit != null ) {
			// parsing
			if ( content != null )	
				unit.parseString(content);
			//else if ( KermetaWorkspace.getInstance().getContent(unit.getUri()) != null )
				//unit.parseString( KermetaWorkspace.getInstance().getContent(unit.getUri()) );
			else
				unit.parse();
			
			if ( monitor.isCanceled() )
				return null;
				
			// loading
		    if ( ! unit.messages.hasError() ) {
		    	// No parsing errors, let us try to load.
		    	unit.load();
				if ( monitor.isCanceled() )
					return null;
		    }
		    // typechecking
		    if ( ! unit.messages.hasError() ) {
		    	// No loading errors, let us try to type check.
		    	unit.typeCheck( null );
				if ( monitor.isCanceled() )
					return null;
		    }
		}

		System.out.println("***************************** End of typechecking " + absoluteFileName + "*********************");	
		
		//garbageCollect();
		return unit;
	}
	
	static public KMTUnit typecheckKMTFile(IFile file, String content) {
		if ( file.getLocation() == null )
			return null;
		return typecheckKMTFile(file.getLocation().toString(), content, null);
	}
	
	static public KMTUnit typecheckKMTFile(IFile file, String content, IProgressMonitor monitor) {
		if ( monitor == null )
			monitor = new NullProgressMonitor();
		return typecheckKMTFile(file.getLocation().toString(), content, monitor);
	}
	
	static public KMTUnit typecheckKMTFile(String absoluteFileName, String content) {
		return instance.internTypecheckKMTFile(absoluteFileName, content, null);
		//return __typecheckKMTFile(absoluteFileName, content);
	}

	static public KMTUnit typecheckKMTFile(String absoluteFileName, String content, IProgressMonitor monitor) {
		if ( monitor == null )
			monitor = new NullProgressMonitor();
		return instance.internTypecheckKMTFile(absoluteFileName, content, monitor);
		//return __typecheckKMTFile(absoluteFileName, content);
	}
	
	static public void abortTypechecking(String absoluteFileName) {
		TypecheckerThread thread = instance.typecheckingThreads.get(absoluteFileName);
		if ( thread != null )
			instance.typecheckingThreads.remove(absoluteFileName);
	}
	
	static public void abortTypechecking(IFile file) {
		abortTypechecking(file.getLocation().toString());
	}
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//		End of Typechecking Mechanism		//
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	
	
	
	
	
	
	
	
	//////////////////////////////////
	//////////////////////////////////
	//		Loading Mechanism		//
	//////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
	//																				//
	//	The loading mechanism works the same way as the typechecking mechanism.		//
	//	Use case : when opening a kmt file in a editor, the file has already been	//
	//	typechecked before, so we do not need to typecheck it again. Just a load.	//
	//																				//
	//////////////////////////////////////////////////////////////////////////////////

/*	private class LoaderThread extends KermetaUnitThread {
		
		public LoaderThread(String absoluteFileName, String content) {
			this.absoluteFileName = absoluteFileName;
			this.content = content;
		}
		
		public void run() {
			unit = __loadKMTFile(absoluteFileName, content);		
		}
	}*/

	/**
	 * A table to be able to check if a typechecking process is running.
	 */
//	private Hashtable <String, LoaderThread> loadingThreads = new Hashtable <String, LoaderThread> ();
	
	/**
	 * That is the method called by the thread.
	 * @param absoluteFileName
	 * @param content
	 * @return
	 */
	/*static private KMTUnit __loadKMTFile (String absoluteFileName, String content ) {
		unloadKermetaUnit( null );
		
		URI fileURI = URI.createFileURI(absoluteFileName);
		KMTUnit unit = (KMTUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
		// If already parsed, do nothing
		if ( unit.isType_checked() )
			return unit;

		if ( unit != null ) {
			// parsing
			if ( content != null )	
				unit.parseString(content);
			//else if ( KermetaWorkspace.getInstance().getContent(unit.getUri()) != null )
				//unit.parseString( KermetaWorkspace.getInstance().getContent(unit.getUri()) );
			else
				unit.parse();
			// loading
		    if ( ! unit.messages.hasError() ) {
		    	// No parsing errors, let us try to load.
		    	unit.load();
		    }

		}
		
		garbageCollect();
		
		return unit;
	}	*/
	
	/**
	 * 
	 * @param absoluteFileName
	 * @param content
	 * @return
	 */
	/*private KMTUnit internLoadKMTFile(String absoluteFileName, String content) {
		KMTUnit result = null;
		try {
			LoaderThread thread;
			synchronized (loadingThreads) {
				thread = loadingThreads.get(absoluteFileName);
				if ( thread == null ) {
					thread = new LoaderThread(absoluteFileName, content);
					loadingThreads.put(absoluteFileName, thread);
				}
			}
			synchronized (thread) {
				if ( ! thread.isAlive() ) 
					thread.start();
			}
			try {
				while ( thread.isAlive() ) {
					thread.join();
					result = thread.unit;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			synchronized(loadingThreads) {
				loadingThreads.remove(absoluteFileName);
			}
		}
		return result;
	}
	
	static private KMTUnit loadKMTFile(IFile file, String content) {
		return loadKMTFile(file.getLocation().toString(), content);
	}
	
	static private KMTUnit loadKMTFile(String absoluteFileName, String content) {
		return instance.internLoadKMTFile(absoluteFileName, content);
	}*/
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Loading Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////
	
	
	
	
	
	
	
	
	//////////////////////////////////////
	//////////////////////////////////////
	//		User friendly methods		//
	//////////////////////////////////////
	//////////////////////////////////////

	/**
	 * This method typechecks the given file. This file can be either be a kmt file,
	 * or a km file. The method delegates to a specialized method.
	 * The type checking make the given file marked or unmarked depending of errors found.
	 * @param kpmFile
	 * @return The method returns the Kermeta unit used.
	 */
	static public KermetaUnit typecheckFile(IFile file) {
		return typecheckFile(file, null);
	}
	
	/*static public KermetaUnit loadFile(IFile file) {
		return loadFile(file, null);
	}*/
	
	/**
	 * This method typechecks the given file. This file can be either be a kmt file,
	 * or a km file. The method delegates to a specialized method.
	 * The type checking make the given file marked or unmarked depending of errors found.
	 * @param kpmFile
	 * @param content If specified, this content will be used for parsing otherwise content will be read from the file. Typechecking process is faster when content is providing (for instance the content of an editor's page).
	 * @return The method returns the Kermeta unit used.
	 */
	static public KermetaUnit typecheckFile(IFile file, String content) {

		KermetaUnit unit = null;
		
		String extension = file.getFileExtension();
		
		if ( extension.equals("kmt") ) {
			unit = typecheckKMTFile(file, content);
		} else if ( extension.equals("km") ) {
			URI fileURI = URI.createFileURI(file.getLocation().toString());
			unit = (KMUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			unit.load();
		}
		return unit;
	}
	
	static public KermetaUnit typecheckFile(IFile file, String content, IProgressMonitor monitor) {

		KermetaUnit unit = null;
		
		String extension = file.getFileExtension();
		
		if ( extension.equals("kmt") ) {
			unit = typecheckKMTFile(file, content, monitor);
		} else if ( extension.equals("km") ) {
			URI fileURI = URI.createFileURI(file.getLocation().toString());
			unit = (KMUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			unit.load();
		}
		return unit;
	}
	
/*	static public KermetaUnit loadFile(IFile file, String content) {

		KermetaUnit unit = null;
		
		String extension = file.getFileExtension();
		
		if ( extension.equals("kmt") ) {
			unit = loadKMTFile(file, content);
		} /*else if ( extension.equals("km") ) {
			URI fileURI = URI.createFileURI(file.getLocation().toString());
			unit = (KMUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			unit.load();
		}
		return unit;
	}*/
	
	/**
	 * Unload properly a KermetaUnit and call the garbage collector to free memory.
	 * @param unit
	 */
	/*static public void unloadKermetaUnit( KermetaUnit unit ) {
		KermetaUnitFactory.getDefaultLoader().unload(unit);
		garbageCollect();
	}*/
	
	static public void unloadAllKermetaUnit() {
		KermetaUnitFactory.getDefaultLoader().unloadAll();
	}
	
	/*static private void unloadKermetaUnitAndFreeMemory( KermetaUnit unit ) {
		unloadKermetaUnit(unit);
		garbageCollect();
	}*/

	
}
