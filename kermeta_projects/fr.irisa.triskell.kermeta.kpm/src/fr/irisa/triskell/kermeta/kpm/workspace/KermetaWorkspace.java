package fr.irisa.triskell.kermeta.kpm.workspace;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.builder.KermetaChangeListener;
import fr.irisa.triskell.kermeta.kpm.helpers.*;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaUnitInterest;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KermetaWorkspace {

	/**
	 * KPM object is the key part of the system. It contains dependencies between files.
	 */
	private KPM kpm;
	
	/**
	 * This attribute is the location of the Kermeta Project Manager's save.
	 */
	static final private String relativeKpmFileName = "/kpm.xmi";
	
	/**
	 * This table keeps a trace of Object interested in a KermetaUnit of a File.
	 * The thing is the following : if there is one or more interests for a file, the workspace keep in memory the
	 * KermetaUnit of the file and notifies the interested objects if the unit changes. If there is not any more
	 * interested objects in a file, the KermetaUnit is unloaded / destroyed in order to free memory.
	 */
	private Hashtable <KermetaUnitInterest, File> interestedObjects = new Hashtable <KermetaUnitInterest, File> ();
	
	/**
	 * The table is linked to the attribute interestedObjects. It allows an easy Kermeta Unit retrieving.
	 */
	private Hashtable <File, KermetaUnit> units = new Hashtable <File, KermetaUnit> ();
	
	private ArrayList <KermetaUnit> unitList = new ArrayList<KermetaUnit> ();
	//////////////////////////
	//////////////////////////
	//		Constructor		//
	//////////////////////////
	//////////////////////////
	private KermetaWorkspace() {
		super();
	}
	
	/**
	 * Kermeta Workspace is a singleton. 
	 */
	static private KermetaWorkspace instance = null;
	
	static public KermetaWorkspace getInstance() {
		if ( instance == null ) {
			instance = new KermetaWorkspace();
			instance.initialize();
			//instance.typeCheckNecessaryFiles();
		}
		return instance;
	}
	
	private void initialize() {
		try {
			initializeKpm();
			//initializeChangeListener();
			initializeProjects();
		} catch (CoreException exception) {
			System.out.println("Exception during initialization of KermetaWorkspace : ");
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
			kpm = KpmFactory.eINSTANCE.createKPM();
		} else {
			load();
		}
	}
	
	/**
	 * 
	 * @throws CoreException
	 */
	private void initializeChangeListener() throws CoreException {
		//IResourceHelper.workspace.addResourceChangeListener( new KermetaChangeListener(kpm) );
		IResourceHelper.touchWorkspace();
	}
	
	/**
	 * Creates KermetaProjects object. It lists the project of the
	 * Eclipse workspace, check if their nature is a Kermeta nature.
	 * If yes, create a KermetaProject.
	 *
	 */
	private void initializeProjects() throws CoreException {
		IProject[] projects = IResourceHelper.getProjects();
		for ( int index = 0; index < projects.length; index++ ) {
			if ( IResourceHelper.isNatureKermeta(projects[index]) )
				IResourceHelper.attachDefaultBuilderToKermetaProject(projects[index]);
		}
	}
	
	/**
	 * 
	 *
	 */
	private void typeCheckNecessaryFiles() {
		Runnable r = new Runnable () {
			
			public void run() {
				Iterator <Unit> itOnUnits = kpm.getUnits().iterator();
				while ( itOnUnits.hasNext() ) {
					Unit unit = itOnUnits.next();
					if ( unit.isFile() )
						unit.receiveEvent( "safe_typecheck" );
				}
				KermetaWorkspace.getInstance().save();
			
				try {
					IResourceHelper.refreshWorkspace();
				} catch (CoreException exception) {
					exception.printStackTrace();
				}
			}
			
			
		};
		
		Thread thread = new Thread(r);
		thread.setPriority(3);
		thread.start();
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
	 * @return
	 */
	public KPM getKpm() {
		return kpm;
	}
	
	/**
	 * This method calculates the number of objects interested in the given file.
	 * @param file
	 * @return
	 */
	private int numberOfObjectsInterestedInFile( File file ) {
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
	public KermetaUnit getKermetaUnit( File file ) {
		KermetaUnit unit = findKermetaUnit(file);
		if ( unit == null )
			unit = KermetaUnitHelper.typeCheckFile(file);
		return unit;
	}
	
	private KermetaUnit findKermetaUnit (File file) {
		KermetaUnit unit = units.get(file);
		if ( unit == null ) {
			Iterator <KermetaUnit> itOnUnits = unitList.iterator();
			while ( (unit == null) && itOnUnits.hasNext() ) {
				KermetaUnit currentUnit = itOnUnits.next();
				String relativeFileName = StringHelper.getRelativeName(currentUnit.getUri());
				if ( relativeFileName.equals (file.getRelativeName()) )
					unit = currentUnit;
			}
		}
		return unit;
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
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
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
		} catch (java.io.IOException exception) {
			System.out.println(exception.getMessage());
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
	 * This method handles an interest formulated by an object implementing
	 * KermetaUnitInterest interface. First the object is registered as an interested object 
	 * for the given file. Then the KermetaUnit is calculated and finally the interested object
	 * is notified about the Kermeta Unit.
	 * @param o The object which is interested in the the given file.
	 * @param file The interesting file.
	 */
	public boolean declareInterest( KermetaUnitInterest o, File file ) {
		if ( file != null ) {
			interestedObjects.put(o, file);
			// calculate the KermetaUnit if necessary
			if ( units.get(file) == null ) {
				file.receiveEvent( "simple_typecheck" );
				//KermetaUnit unit =  units.get(file);  // getKermetaUnit(file);
				//units.put(file, unit);
			}
			notifyInterestedObject(o, file);
			return true;
		} else
			return false;
	}
	
	private void addUnits( KermetaUnit unit ) {
		unitList.add(unit);
		for (KermetaUnit currentUnit : unit.importedUnits) {
			
			addUnits(currentUnit);
			unitList.add(currentUnit);
			
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
		File file = interestedObjects.get(o);
		interestedObjects.remove(o);
		if ( numberOfObjectsInterestedInFile(file) == 0 ) {
			units.remove(file);
			KermetaUnitHelper.unloadKermetaUnit( null );
		}
	}
	
	/**
	 * This method is used to notify a specific object that the 
	 * Kermeta Unit it is interested in has changed. 
	 * @param o
	 * @param file
	 */
	private void notifyInterestedObject( KermetaUnitInterest o, File file ) {
		o.updateKermetaUnit( findKermetaUnit(file) );
	}
	
	/**
	 * This method is used to notify all objects that their
	 * Kermeta Unit should be updated. 
	 * @param file
	 */
	private void notifyInterestedObjects(File file) {
		for (KermetaUnitInterest o : interestedObjects.keySet() ) {
			if ( interestedObjects.get(o) == file )
				o.updateKermetaUnit(units.get(file));
		}
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public boolean isAnObjectInterestedInFile (File file) {
		return interestedObjects.contains(file);
	}
	
	public void updateKermetaUnit(File file, KermetaUnit unit) {
		
		if ( units.size() == 0 ) {
			units.put(file, unit);
			addUnits(unit);
			return;
		}
		
		units.put(file, unit);
		notifyInterestedObjects(file);
		//		notifyInterestedObject(o, file)
		
		ArrayList <File> files = new ArrayList <File> ();
		for ( File f : units.keySet() ) {
			
			if ( units.get(f).getUri().equals( unit.getUri() ) )
				files.add(f);
		}
		
		for ( File f : files ) {
		
			ArrayList <KermetaUnitInterest> objectsToNotify = new ArrayList<KermetaUnitInterest> ();
			for ( KermetaUnitInterest o : interestedObjects.keySet() ) {
			
				if ( interestedObjects.get(o) == f )
					objectsToNotify.add(o);
			}
		
			for ( KermetaUnitInterest o : objectsToNotify ) {
				units.put(f, unit);
				notifyInterestedObject(o, f);
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
	//		Extern Accessors		//
	//////////////////////////////////
	//////////////////////////////////
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
	 * From an absolute name ("/udd/me/workspace/project/example.kmt"), this method searches
	 * for a corresponding file in the Kermeta Project Manager.
	 * @param absoluteName
	 * @return Returns the found file or null if none.
	 */
	/*public File getAbsoluteFile(String absoluteName) {
		File file = null;
		String[] splits = absoluteName.split( workspace.getRoot().getLocation().toString() );
		//String[] splits = absoluteName.split( kpm.findProject(splits[1]).getAbsolutePath());
		if ( splits.length == 2 ) {
			file = kpm.findFile(splits[1]);
		}
		return file;
	}*/
	
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
	
	
	/**
	 * 
	 * @return
	 */
	public IWorkspace workspace() {
		return IResourceHelper.workspace;
	}
	
	/**
	 * 
	 * @return
	 */
	public IWorkspaceRoot workspaceRoot() {
		return IResourceHelper.root;
	}
	//////////////////////////////////////
	//////////////////////////////////////
	//		End of Extern Accessors		//
	//////////////////////////////////////
	//////////////////////////////////////

}
