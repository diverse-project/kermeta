package org.kermeta.io.util2;

import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;




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
	
	
	private KermetaUnitStorer storer = null;
	
	public KermetaUnitHelper(KermetaUnitStorer storer) {
		this.storer = storer;
	}
	
	
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
	private class LoadingThread extends Thread {
		public KermetaUnit unit;
		
		protected String absoluteFileName;
		protected String content;
		public IProgressMonitor monitor;
		
		public LoadingThread(String absoluteFileName, String content, IProgressMonitor monitor) {
			this.absoluteFileName = absoluteFileName;
			this.content = content;
			this.monitor = monitor;
		}
		
		public void run() {
			try {
				unit = __loadFile(absoluteFileName, content, monitor);
			} catch (KermetaIOFileNotFoundException e) {
				e.printStackTrace();
			}		
		}
	}
	
	/**
	 * As the class uses synchronization, it needs to be done via an instance.
	 */
//	static private KermetaUnitHelper instance = new KermetaUnitHelper();

	
	/**
	 * A table to be able to check if a typechecking process is running.
	 */
	private Hashtable <String, LoadingThread> loadingThreads = new Hashtable <String, LoadingThread> ();
	
	/**
	 * 
	 * @param absoluteFileName
	 * @param content
	 * @return
	 */
	private KermetaUnit internLoadFile(String absoluteFileName, String content, IProgressMonitor monitor) {
		
		//if ( Runtime.getRuntime().freeMemory() < 1000000 ) {
		//	KermetaUnit.internalLog.info("Unloading all Kermeta Unit but the framework.km.");
			//unloadAllKermetaUnit();
		//}
		
		KermetaUnit result = null;
		try {
			LoadingThread thread;
			synchronized (loadingThreads) {
				thread = loadingThreads.get(absoluteFileName);
				if ( thread == null ) {
					thread = new LoadingThread(absoluteFileName, content, monitor);
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
	
	
	/**
	 * That is the method called by the thread.
	 * @param absoluteFileName
	 * @param content
	 * @return
	 * @throws KermetaIOFileNotFoundException 
	 */
	private KermetaUnit __loadFile (String absoluteFileName, String content, IProgressMonitor monitor) throws KermetaIOFileNotFoundException {
		KermetaUnit unit = null;
		try {
			unit = IOPlugin.getDefault().getKermetaUnit(absoluteFileName);
			storer.load(absoluteFileName, content);
		} catch (URIMalformedException e) {
			e.printStackTrace();
		}
		return unit;
	}

	public KermetaUnit loadFile(IFile file) {
		return loadFile(file, null, null);
	}
	
	public KermetaUnit loadFile(IFile file, String content) {
		return loadFile(file, content, null);
	}
	
	public KermetaUnit loadFile(IFile file, String content, IProgressMonitor monitor) {
		if ( file.getLocation() == null )
			return null;
		if ( monitor == null )
			monitor = new NullProgressMonitor();
		return loadFile("platform:/resource" + file.getFullPath().toString(), content, monitor);
	}
	
	public KermetaUnit loadFile(String absoluteFileName, String content) {
		return internLoadFile(absoluteFileName, content, null);
		//return __typecheckKMTFile(absoluteFileName, content);
	}

	public KermetaUnit loadFile(String absoluteFileName, String content, IProgressMonitor monitor) {
		if ( monitor == null )
			monitor = new NullProgressMonitor();
		return internLoadFile(absoluteFileName, content, monitor);
		//return __typecheckKMTFile(absoluteFileName, content);
	}
	
	public void abortLoading(String absoluteFileName) {
		LoadingThread thread = loadingThreads.get(absoluteFileName);
		if ( thread != null )
			loadingThreads.remove(absoluteFileName);
	}
	
	public void abortLoading(IFile file) {
		abortLoading(file.getLocation().toString());
	}
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//		End of Typechecking Mechanism		//
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	

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
/*	static public KermetaUnit typecheckFile(IFile file) {
		return typecheckFile(file, null);
	}*/
	
	/**
	 * This method typechecks the given file. This file can be either be a kmt file,
	 * or a km file. The method delegates to a specialized method.
	 * The type checking make the given file marked or unmarked depending of errors found.
	 * @param kpmFile
	 * @param content If specified, this content will be used for parsing otherwise content will be read from the file. Typechecking process is faster when content is providing (for instance the content of an editor's page).
	 * @return The method returns the Kermeta unit used.
	 */
	/*static public KermetaUnit typecheckFile(IFile file, String content) {

		KermetaUnit unit = null;
		
		String extension = file.getFileExtension();
		
		if ( extension.equals("kmt") ) {
			unit = typecheckKMTFile(file, content);
		} else if ( extension.equals("km") ) {
			//URI fileURI = URI.createFileURI(file.getLocation().toString());
			//unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			//unit.load();
		}
		return unit;
	}*/
	
	/*static public KermetaUnit typecheckFile(IFile file, String content, IProgressMonitor monitor) {

		KermetaUnit unit = null;
		
		String extension = file.getFileExtension();
		
		if ( extension.equals("kmt") ) {
			unit = typecheckKMTFile(file, content, monitor);
		} else if ( extension.equals("km") ) {
			unit = typecheckKMTFile(file, content, monitor);
			URI fileURI = URI.createFileURI(file.getLocation().toString());
			unit = (KermetaUnit) KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			unit.load();
		} else if (extension.equals("ecore") ) {
			URI fileURI = URI.createFileURI(file.getLocation().toString());
			
			Ecore2KM.isQuickFixEnabled = true;
	        Ecore2KM.isMethodPropertyNameOverlapSafe = true;
	        Ecore2KM.isMethodNameOverlapSafe = true;
	        			
			unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(fileURI.toString());
			unit.load();
		}
		return unit;
	}*/
	
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
	
	/*static public void unloadAllKermetaUnit() {
		KermetaUnitFactory.getDefaultLoader().unloadAll();
	}*/
	
	/*static private void unloadKermetaUnitAndFreeMemory( KermetaUnit unit ) {
		unloadKermetaUnit(unit);
		garbageCollect();
	}*/

	
}
