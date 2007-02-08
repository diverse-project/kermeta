package fr.irisa.triskell.kermeta.kpm.workspace;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.helpers.*;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.resources.KermetaNature;

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
	//private KPM kpm;
	
	/**
	 * This attribute is the location of the Kermeta Project Manager's save.
	 */
	static final private String relativeKpmFileName = "/.metadata/.plugins/kpm.xmi";
	
	
	private Hashtable <IProject, KermetaProject> projects = new Hashtable <IProject, KermetaProject> ();
	
	/**
	 * The table is linked to the attribute interestedObjects. It allows an easy Kermeta Unit retrieving.
	 */
	private Hashtable <KermetaUnitInterest, KermetaUnit> units = new Hashtable <KermetaUnitInterest, KermetaUnit> ();

	
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
			try {
				instance.save();
			} catch (CoreException exception) {
				exception.printStackTrace();
			}
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
			initializeProjects();
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Creates KermetaProjects object. It lists the project of the
	 * Eclipse workspace, check if their nature is a Kermeta nature.
	 * If yes, create a KermetaProject.
	 *
	 */
	private void initializeProjects() throws CoreException {
		IProject[] iprojects = IResourceHelper.getProjects();
		for ( int index = 0; index < iprojects.length; index++ ) {
			if ( NatureHelper.doesProjectHaveNature( iprojects[index], KermetaNature.ID ) ) {
				if ( iprojects[index].exists() ) {
					KermetaProject project = new KermetaProject(iprojects[index]);
					projects.put(iprojects[index], project);
					IResourceHelper.attachDefaultBuilderToKermetaProject(project);
				}
			}
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
	public KermetaProject addKermetaProject(IProject value) throws CoreException {
		KermetaProject project = new KermetaProject(value);
		projects.put(value, project);
		IResourceHelper.attachDefaultBuilderToKermetaProject(project);
		return project;
	}
	
	public KermetaProject[] geProjects() {
		return (KermetaProject[]) projects.values().toArray();
	}
	
	public KermetaProject getKermetaProject(IProject value) {
		return projects.get(value);
	}
	/**
	 * @return This method returns the path of the Kermeta Project Manager file.
	 */
	public String getAbsoluteKPMFileName() {	
		return ResourceHelper.root.getLocation().toString() + relativeKpmFileName;
	}
	
	public IFile getKpmFile() {
		return ResourceHelper.getIFile( relativeKpmFileName );
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
	private KermetaUnit findKermetaUnit (KermetaUnitInterest o) {
		KermetaUnit unit = units.get(o);
		if ( unit == null )
			unit = findKermetaUnit(o.getFile().getLocationURI().toString());
		return unit;
	}

	private KermetaUnit findKermetaUnit (IFile file) {
		
		for (KermetaUnitInterest o : units.keySet() ) {
			if ( o.getFile().equals(file) )
				return units.get(o);
		}
		
		return null;
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
	public void save() throws CoreException {
		for ( KermetaProject project : projects.values() )
			project.save();
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
	/*public void declareInterestThreading( final KermetaUnitInterest o, final IProgressMonitor monitor ) {
		
		if ( kermetaUnitCalculation != null )
			kermetaUnitCalculation = null;
		
		IRunnableWithProgress r = new IRunnableWithProgress() {
			
			public void run(IProgressMonitor monitor) {
				declareInterest(o, monitor);
			}
			
		};
		
		kermetaUnitCalculation = new Thread(r);
		kermetaUnitCalculation.start();
		
	}*/
	
	/**
	 * This method handles an interest formulated by an object implementing
	 * KermetaUnitInterest interface. First the object is registered as an interested object 
	 * for the given file. Then the KermetaUnit is calculated and finally the interested object
	 * is notified about the Kermeta Unit.
	 * @param o The object which is interested in the the given file.
	 * @param file The interesting file.
	 */
	public void declareInterest( KermetaUnitInterest o ) {
		
		if ( o != null ) {
			//interestedObjects.put(o, file);
			// calculate the KermetaUnit if necessary
			if ( units.get(o) == null ) {
				
				IFile ifile = o.getFile();
				KermetaProject project = getKermetaProject( ifile.getProject() );
				
				if ( project == null )
					declareInterestExtern(o);
				else
					declareInterestIntern(o, project);		
			}
		}
	}


	private void declareInterestIntern(KermetaUnitInterest o, KermetaProject project) {
		File file = project.getFile( o.getFile() );
		if ( file == null ) {
			file = KpmHelper.addFileWithOpenDependency(o.getFile(), project.getKpm());
		}

		final Hashtable params = new Hashtable();
		params.put("changer", o);
		final File realFile = file;
		
		Job job = new Job("Declaring Interest") {
			
			public IStatus run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Waiting for the outline", 2);
					realFile.receiveEvent("open", params, monitor );	
					monitor.worked(1);
				} finally {
					monitor.done();
				}			
				return Status.OK_STATUS;
			}
			
		};
		
		job.schedule();
	}
	
	private void declareInterestExtern(final KermetaUnitInterest o) {
		Runnable r = new Runnable() {
			public void run() {
				updateFile(o);
			}
		};
		Thread t = new Thread(r);
		t.start();
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
		if ( units.containsKey(o) )
			units.remove(o);
	}

	/**
	 * This method is used to notify a specific object that the 
	 * Kermeta Unit it is interested in has changed. 
	 * @param o
	 * @param file
	 */
	private void notifyInterestedObject( KermetaUnitInterest o ) {
		o.updateKermetaUnit( findKermetaUnit(o) );
	}
	
	/**
	 * 
	 * @param file
	 */
	public void updateFile(final KermetaUnitInterest o) {
		KermetaUnit unit = null;
		String content = o.getFileContent();
		if ( content == null )
			unit = KermetaUnitHelper.typeCheckFile( o.getFile() );
		else 
			unit = KermetaUnitHelper.typeCheckFile( o.getFile(), content );
		updateKermetaUnit(o, unit);				
	}	
	
	/**
	 * Updating a Kermeta Unit for a file means notifying objects interested in the given file.
	 * @param file
	 * @param unit
	 */
	public void updateKermetaUnit(KermetaUnitInterest changer, KermetaUnit unit) {
		
		changer.updateKermetaUnit(unit);
		
		for ( KermetaUnitInterest o : units.keySet() ) {
			if ( o.getFile().equals(changer.getFile()) )
				units.put(o, unit);
		}
		
		/*if ( units.size() == 0 ) {
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
			
		}*/
		

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

	
	
	private KermetaUnitInterest changer = null;
	
	public void changer(KermetaUnitInterest o) {
		changer = o;
	}

	public KermetaUnitInterest changer() {
		return changer;
	}
}
