package fr.irisa.triskell.kermeta.kpm.workspace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.helpers.*;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * 
 * Kermeta Workspace is a singleton object which aim is to provide powerfull interfile dependencies mechanisms. 
 * 
 * 
 * @author François Tanguy
 *
 */
public class KermetaWorkspace {

	
	static private Thread kermetaUnitCalculation = null;
	
	
	/**
	 * KPM object is the key part of the system. It contains dependencies between files.
	 */
	private KPM kpm;
	
	/**
	 * This attribute is the location of the Kermeta Project Manager's save.
	 */
	static final private String relativeKpmFileName = "/.metadata/.plugins/kpm.xmi";
	
	/**
	 * This table keeps a trace of Object interested in a KermetaUnit of a File.
	 * The thing is the following : if there is one or more interests for a file, the workspace keep in memory the
	 * KermetaUnit of the file and notifies the interested objects if the unit changes. If there is not any more
	 * interested objects in a file, the KermetaUnit is unloaded / destroyed in order to free memory.
	 */
	private Hashtable <KermetaUnitInterest, IFile> interestedObjects = new Hashtable <KermetaUnitInterest, IFile> ();
	
	/**
	 * The table is linked to the attribute interestedObjects. It allows an easy Kermeta Unit retrieving.
	 */
	private Hashtable <IFile, KermetaUnit> units = new Hashtable <IFile, KermetaUnit> ();
	
	/**
	 * When working with textual editor, it is more efficient to get the file content directly from the Eclipse editor
	 * instead of opening the file and reading its content. Then to improve performances, we keep in memory 
	 * the content of kmt file. It parses much faster.
	 */
	private Hashtable <String, String> kmtUnitsContent = new Hashtable <String, String> ();
	
	/**
	 * Retrieve the content for the given file.
	 * @param unitURI
	 * @return The string content or null if there is none.
	 */
	public String getContent(String unitURI) {
		return kmtUnitsContent.get(unitURI);
	}
	
	/**
	 * Set the string content for the given file. 
	 * @param unitURI
	 * @param content
	 */
	public void setContent(String unitURI, String content) {
		kmtUnitsContent.put(unitURI, content);
	}
	
	/**
	 * Remove the string content for the given file.
	 * @param unitURI
	 */
	public void removeContent(String unitURI) {
		kmtUnitsContent.remove(unitURI);
	}
	
	//////////////////////////
	//////////////////////////
	//		Constructor		//
	////////////////////////////////////////////////////////////////////////////////////
	// This code section contains the constructor and all the initialization methods. //
	////////////////////////////////////////////////////////////////////////////////////
	private KermetaWorkspace() {
		super();
	}
	
	/**
	 * Kermeta Workspace is a singleton. 
	 */
	static private KermetaWorkspace instance = null;
	
	/**
	 * Get the only Kermeta Workspace instance.
	 * @return
	 */
	static public KermetaWorkspace getInstance() {
		if ( instance == null ) {
			instance = new KermetaWorkspace();
			instance.initialize();
			instance.save();
		}
		return instance;
	}
	
	/**
	 * Initialize the Kermeta workspace. Load or create the Kermeta Project Manager object,
	 * and checks if new Kermeta Project have been added.
	 *
	 */
	private void initialize() {
		try {
			initializeKpm();
			initializeProjects();
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * This method initializes the attribute named kpm.
	 * The KPM object is the key part of the Kermeta Project Manager.
	 *
	 */
	private void initializeKpm() throws CoreException {
		if ( ! doIHaveAKPMFile() ) {
			kpm = KpmHelper.createKpm();
		} else {
			load();
		}
	}
	
	/**
	 * Creates KermetaProjects object. It lists the project of the
	 * Eclipse workspace, check if their nature is a Kermeta nature.
	 * If yes, create a KermetaProject.
	 *
	 */
	// TODO check if projects already have a KermetaBuilder
	private void initializeProjects() throws CoreException {
		IProject[] projects = IResourceHelper.getProjects();
		for ( int index = 0; index < projects.length; index++ ) {
			if ( IResourceHelper.isNatureKermeta(projects[index]) )
				IResourceHelper.attachDefaultBuilderToKermetaProject(projects[index]);
		}
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Constructor		//
	//////////////////////////////////
	//////////////////////////////////
	
	
	//////////////////////
	//////////////////////
	//		Testing		//
	//////////////////////
	//////////////////////
	/**
	 * Does the project have a file containing its Kermeta description ?
	 * @result True or False depending the existency of the Kermeta Project Manager file.
	 */
	private boolean doIHaveAKPMFile() {
		return new java.io.File( getAbsoluteKPMFileName() ).exists();
	}
	
	private boolean doesKermetaUnitCorrespondToFile(KermetaUnit unit, String fileURI) {
		return unit.getUri().equals(fileURI);
	}
	//////////////////////////////
	//////////////////////////////
	//		End of testing		//
	//////////////////////////////
	//////////////////////////////
	
	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	/**
	 * @return This method returns the path of the Kermeta Project Manager file.
	 */
	private String getAbsoluteKPMFileName() {	
		return IResourceHelper.root.getLocation().toString() + relativeKpmFileName;
	}
	
	/**
	 * 
	 * @return the Kermeta Project Manager object.
	 */
	public KPM getKpm() {
		return kpm;
	}
	
	/**
	 * This method calculates the number of objects interested in the given file.
	 * @param file
	 * @return
	 */
	private int numberOfObjectsInterestedInFile( IFile file ) {
		int counter = 0;
		for ( KermetaUnitInterest o : interestedObjects.keySet() ) {
			if ( interestedObjects.get(o) == file )
				counter ++;
		}
		return counter;
	}
	
	/**
	 * This method calculates the Kermeta Unit for the given file.
	 * Pay attention, the calculated unit is not stored in the workspace.
	 * If you want to store a Kermeta Unit in the workspace, you must use the
	 * interest mechanism.
	 * This method guarantees that the value returned is a KermetaUnit object if and only if
	 * the file is well known format from Kermeta.
	 * @param file
	 */
	public KermetaUnit getKermetaUnit( IFile file ) {
		KermetaUnit unit = findKermetaUnit(file);
		if ( unit == null ) {
			if ( IResourceHelper.couldFileBeTypechecked(file) )
				unit = KermetaUnitHelper.typeCheckFile( file );
		}
		return unit;
	}
	
	/**
	 * Finds a Kermeta Unit for the given file.
	 * @param file
	 * @return the corresponding Kermeta Unit if found or null otherwise.
	 */
	private KermetaUnit findKermetaUnit (IFile file) {
		KermetaUnit unit = units.get(file);
		if ( unit == null )
			unit = findKermetaUnit(file.getLocationURI().toString());
		return unit;
	}
	
	/**
	 * Search for the KermetaUnit corresponding to the given file.
	 * @param fileURI
	 * @return Returns null if no Kermeta Unit has been found for the given file or the corresponding Kermeta Unit.
	 */
	public KermetaUnit findKermetaUnit(String fileURI) {
		// loop through all the units
		for (KermetaUnit currentUnit : units.values()) {
			if ( doesKermetaUnitCorrespondToFile(currentUnit, fileURI) )
				return currentUnit;
			KermetaUnit u = findKermetaUnit(currentUnit, fileURI);
			if ( u != null )
				return u;
		}
		return null;
	}
	
	/**
	 * Given a Kermeta Unit, this method searches in the imported units if one of them
	 * corresponds to the given file URI.
	 * @param root
	 * @param unitToFind
	 * @return It returns the Kermeta Unit if an imported unit corresponds to the given file or null if not.
	 */
	private KermetaUnit findKermetaUnit(KermetaUnit root, String fileURI) {
		for ( KermetaUnit currentUnit : root.importedUnits ) {
			if ( doesKermetaUnitCorrespondToFile(currentUnit, fileURI) )
				return currentUnit;
		}
		return null;
	}
	
	//////////////////////////////////
	//////////////////////////////////
	//		End of Accessors		//
	//////////////////////////////////
	//////////////////////////////////
	
	
	//////////////////////////////
	//////////////////////////////
	//		Saving / Loading	//
	//////////////////////////////
	//////////////////////////////
	/**
	 * Save the KPM object into an xmi file.
	 * Create the file if it does not exist.
	 */
	public void save() {
		try {
			XMIHelper.save(getAbsoluteKPMFileName(), kpm);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Load the kpm file for the current project.
	 * The file existency must have been checked before calling this method.
	 *
	 */
	private void load() {
		try {
			kpm = (KPM) XMIHelper.load(getAbsoluteKPMFileName());
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	//////////////////////////////////
	//////////////////////////////////
	//	End of Saving / Loading		//
	//////////////////////////////////
	//////////////////////////////////	




	//////////////////////////////////
	//////////////////////////////////
	//		Interest Mechanism		//
	//////////////////////////////////
	//////////////////////////////////
	/**
	 * Declare an interest for a file by launching a thread to improve performances.
	 */
	/* This may be a hack.
	 * 
	 * For the moment it is used when two editors are opened in a closed time. As a Kermeta Unit takes a 
	 * huge amount of memory space, only the last interest (the displayed one) is important. The others are cut down.
	 * 
	 */
	public void declareInterestThreading( final KermetaUnitInterest o, final IFile file ) {
		
		if ( kermetaUnitCalculation != null )
			kermetaUnitCalculation = null;
		
		Runnable r = new Runnable() {
			
			public void run() {
				
				declareInterest(o, file);
				
			}
			
		};
		
		kermetaUnitCalculation = new Thread(r);
		kermetaUnitCalculation.start();
		
	}
	
	/**
	 * This method handles an interest formulated by an object implementing
	 * KermetaUnitInterest interface. First the object is registered as an interested object 
	 * for the given file. Then the KermetaUnit is calculated and finally the interested object
	 * is notified about the Kermeta Unit.
	 * @param o The object which is interested in the the given file.
	 * @param file The interesting file.
	 */
	public void declareInterest( KermetaUnitInterest o, IFile file ) {
		if ( file != null ) {
			interestedObjects.put(o, file);
			// calculate the KermetaUnit if necessary
			if ( units.get(file) == null ) {
				KermetaUnit unit = getKermetaUnit(file);
				units.put(file, unit);
			}
			notifyInterestedObject(o, file);
		}
	}
	
	/**
	 * This method is called when an object implementing KermetaUnitInterest interface is not interested
	 * anymore in the given file. First the object is unregistered. Then the method takes a look at the number 
	 * of interest for the file. If the number is greater than 0 no action is performed, otherwise the KermetaUnit
	 * associated to the file is destroyed.
	 * @param o
	 * @param file
	 */
	public void undeclareInterest ( KermetaUnitInterest o ) {
		IFile file = interestedObjects.get(o);
		interestedObjects.remove(o);
		if ( numberOfObjectsInterestedInFile(file) == 0 ) {
			units.remove(file);
			KermetaUnitHelper.unloadKermetaUnitAndFreeMemory( null );
		}
	}

	/**
	 * This method is used to notify a specific object that the 
	 * Kermeta Unit it is interested in has changed. 
	 * @param o
	 * @param file
	 */
	private void notifyInterestedObject( KermetaUnitInterest o, IFile file ) {
		o.updateKermetaUnit( findKermetaUnit(file) );
	}
	
	/**
	 * This method is used to notify all objects that their
	 * Kermeta Unit should be updated. 
	 * @param file
	 */
	/*private void notifyInterestedObjects(File file) {
		for (KermetaUnitInterest o : interestedObjects.keySet() ) {
			if ( interestedObjects.get(o) == file )
				o.updateKermetaUnit(units.get(file));
		}
	}*/
	
	/**
	 * 
	 * @param file
	 * @return true or false wether an object is interested in the given file.
	 */
	public boolean isAnObjectInterestedInFile (File file) {
		return isAnObjectInterestedInFile( getIFile(file) );
	}
	
	/**
	 * 
	 * @param file
	 * @return true or false wether an object is interested in the given file.
	 */
	public boolean isAnObjectInterestedInFile (IFile file) {
		return interestedObjects.contains(file);
	}
	
	/**
	 * 
	 * @param file
	 */
	public void updateFile(final IFile file) {
		String content = kmtUnitsContent.get( units.get(file).getUri() );
		KermetaUnit unit = KermetaUnitHelper.typeCheckFile( file, content );
		updateKermetaUnit(file, unit);				
	}	
	
	/**
	 * 
	 * @param file
	 */
	public void updateFile(File file) {
		updateFile( getIFile(file) );
	}
	
	/**
	 * 
	 * @param file
	 * @param unit
	 */
	public void updateKermetaUnit(File file, KermetaUnit unit) {
		updateKermetaUnit( getIFile(file), unit);
	}
	
	/**
	 * Updating a Kermeta Unit for a file means notifying objects interested in the given file.
	 * @param file
	 * @param unit
	 */
	public void updateKermetaUnit(IFile file, KermetaUnit unit) {
		
		if ( units.size() == 0 ) {
			units.put(file, unit);
			//addUnits(unit);
			return;
		}
		
		units.put(file, unit);
		
		ArrayList <IFile> files = new ArrayList <IFile> ();
		for ( IFile f : units.keySet() ) {	
			if ( units.get(f).getUri().equals( unit.getUri() ) )
				files.add(f);
		}
		
		for ( IFile f : files ) {
		
			// Getting the notification list
			ArrayList <KermetaUnitInterest> objectsToNotify = new ArrayList<KermetaUnitInterest> ();
			for ( KermetaUnitInterest o : interestedObjects.keySet() ) {
				if ( interestedObjects.get(o).equals(f) )
					objectsToNotify.add(o);
			}
		
			// Notify
			for ( KermetaUnitInterest o : objectsToNotify ) {
				units.put(f, unit);
				notifyInterestedObject(o, f );
			}
			
		}
		

	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Interest Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////


	//////////////////////////////////
	//////////////////////////////////
	//		Basics Accessors		//
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Kermeta Workspace also provides some nice and usefull accessors to easily retrieve IResource or unit . //
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 
	 * @param fileName
	 * @param filePath
	 * @return
	 */
	public File getFile(String fileName, String filePath) {
		return kpm.findFile(fileName, filePath);
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public File getFile(IFile file) {
		return kpm.findFile(file);
	}
	
	/**
	 * 
	 * @param absoluteFileName
	 * @return
	 */
	public File getFile(String relativeFileName) {
		return kpm.findFile(relativeFileName);
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public IFile getIFile(File file) {
		return IResourceHelper.getIFile( file );
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public IFolder getIFolder(Directory directory) {
		return IResourceHelper.getIFolder(directory);
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public IProject getIProject(Project project) {
		return IResourceHelper.getIProject( project );
	}
	
	/**
	 * 
	 * @param directoryName
	 * @param directoryPath
	 * @return
	 */
	public Directory getDirectory(String directoryName, String directoryPath) {
		return kpm.findDirectory(directoryName, directoryPath);
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	public Directory getDirectory(IFolder folder) {
		return kpm.findDirectory(folder);
	}
	
	/**
	 * 
	 * @param absoluteDirectoryName
	 * @return
	 */
	public Directory getDirectory(String relativeDirectoryName) {
		return kpm.findDirectory(relativeDirectoryName);
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	public Project getProject(IProject project) {
		return kpm.findProject(project);
	}
	
	/**
	 * 
	 * @param absoluteDirectoryName
	 * @return
	 */
	public Project getProject(String projectName) {
		return kpm.findProject(projectName);
	}
	//////////////////////////////////////
	//////////////////////////////////////
	//		End of Basics Accessors		//
	//////////////////////////////////////
	//////////////////////////////////////

}
