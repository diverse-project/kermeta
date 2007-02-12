package fr.irisa.triskell.kermeta.kpm.workspace;

import java.util.Date;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

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

	/**
	 * This attribute is the location of the Kermeta Project Manager's save.
	 */
	static final private String relativeKpmFileName = "/.metadata/.plugins/kpm.xmi";
	
	/**
	 * Keep trace of all projects with kermeta nature.
	 */
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
			try {
				instance.initialize();
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
	private void initialize() throws CoreException {
		initializeProjects();
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
	
	/**
	 * 
	 * @return It returns all the projects with kermeta nature.
	 */
	public KermetaProject[] geProjects() {
		return (KermetaProject[]) projects.values().toArray();
	}
	
	/**
	 * Get the kermeta project associated with the given resource.
	 * @param value
	 * @return
	 */
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
	 * Look for a kermeta unit which corresponds to the given file.
	 * Kermeta unit are visited to check if one of its imported units is the one. 
	 * @param root
	 * @param fileURI
	 * @return
	 */
	private KermetaUnit findKermetaUnitRecursively(KermetaUnit root, String fileURI) {
		
		for ( KermetaUnit currentUnit : root.importedUnits ) {
			if ( doesKermetaUnitCorrespondToFile(currentUnit, fileURI) )
				return currentUnit;
		}
		
		for ( KermetaUnit currentUnit : root.importedUnits ) {
			KermetaUnit foundUnit = findKermetaUnitRecursively(currentUnit, fileURI);
			if ( foundUnit != null )
				return foundUnit;
		}
		return null;
	}

	/**
	 * 
	 * @param fileURI
	 * @return
	 */
	private KermetaUnit findKermetaUnit(String fileURI) {
		for ( KermetaUnit currentUnit : units.values() ) {
			if ( doesKermetaUnitCorrespondToFile(currentUnit, fileURI) )
				return currentUnit;
			KermetaUnit foundUnit = findKermetaUnitRecursively(currentUnit, fileURI );
			if ( foundUnit != null )
				return foundUnit;
		}
		return null;
	}
	
	public KermetaUnit getKermetaUnit(IFile file) {
		return findKermetaUnit("file:" + file.getLocation().toString());
	}
	
	/**
	 * 
	 * @param o
	 * @return Returns null if the file cannot be typechecked. Returns the corresponding kermeta unit otherwise.
	 */
	private KermetaUnit calculateKermetaUnit(KermetaUnitInterest o) {
		if ( IResourceHelper.couldFileBeTypechecked( o.getFile() ) )
			return KermetaUnitHelper.typeCheckFile( o.getFile() );
		return null;
	}
	
	/**
	 * This method updates the kermeta unit of the interested object.
	 * The kermeta unit should have been calculated before calling this method.
	 * @param unit
	 */
	public void updateInterestedObject(KermetaUnitInterest o) {
		KermetaUnit unit = units.get(o);
		o.updateKermetaUnit(unit);
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
	 * This method handles an interest formulated by an object implementing
	 * KermetaUnitInterest interface. First the object is registered as an interested object 
	 * for the given file. Then the KermetaUnit is calculated and finally the interested object
	 * is notified about the Kermeta Unit.
	 * @param o The object which is interested in the the given file.
	 * @param file The interesting file.
	 */
	public void declareInterest( KermetaUnitInterest o ) {
		__declareInteret(o, false);
	}
	
	public void declareInterestThreading( KermetaUnitInterest o ) {
		__declareInteret(o, true);
	}
	
	/**
	 * 
	 * @param o
	 * @param threading
	 */
	public void __declareInteret( KermetaUnitInterest o, boolean threading ) {
		if ( o != null ) {
			if ( units.get(o) == null ) {
				IFile ifile = o.getFile();
				KermetaProject project = getKermetaProject( ifile.getProject() );
				if ( project == null )
					declareInterestExtern(o);
				else
					declareInterestIntern(o, project, threading);		
			}
		}
	}

	/**
	 * 
	 * @param o
	 * @param project
	 * @param threading
	 */
	private void declareInterestIntern(KermetaUnitInterest o, final KermetaProject project, boolean threading) {
		File file = project.getFile( o.getFile() );
		if ( file == null )
			file = KpmHelper.addFileWithOpenDependency(o.getFile(), project.getKpm());
		else if ( file.getDependenciesWithEvent("open").size() == 0 ) {
			KpmHelper.addOpenDependencyToFile(file, project.getKpm());
			KpmHelper.addUpdateDependencyToFile(file, project.getKpm());
		}
		
		final Hashtable params = new Hashtable();
		params.put("changer", o);
		final File realFile = file;
		
		if ( threading ) {
		
			Job job = new Job("Declaring Interest") {
				
				public IStatus run(IProgressMonitor monitor) {
					try {
						monitor.beginTask("Waiting for the outline", 2);
						realFile.receiveEvent("open", params, monitor );	
						monitor.worked(1);
					} finally {
						monitor.done();
					}	
					try {
						project.save();
					} catch (CoreException exception) {
						exception.printStackTrace();
					}
					return Status.OK_STATUS;
				}
			
			};
		
			job.schedule();
		} else 
			realFile.receiveEvent("open", params, null );
	}
	
	/**
	 * This method is used when an object interested in a resource from a non kermeta project wants to declare an interest.
	 * @param o
	 */
	private void declareInterestExtern(final KermetaUnitInterest o) {
		Runnable r = new Runnable() {
			public void run() {
				updateKermetaUnit(o);
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
	
	public void updateKermetaUnit(KermetaUnitInterest o) {
		
		IFile ifile = o.getFile();
		File file = getFile(ifile);
		
		if ( (units.get(o) == null) || (ifile.getLocalTimeStamp() > file.getLastTimeModified().getTime()) ) {
			KermetaUnit newUnit = calculateKermetaUnit(o);
			units.put(o, newUnit);
			for ( KermetaUnitInterest current : units.keySet() ) {
				KermetaUnit currentUnit = units.get(current);
				if ( doesKermetaUnitCorrespondToFile(currentUnit, o.getFile().getLocationURI().toString()) )
					units.put(current, newUnit);
			}
			file.setLastTimeModified( new Date(ifile.getLocalTimeStamp()) );
			o.updateKermetaUnit(newUnit);
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

	
	public File getFile(IFile file) {
		for ( KermetaProject p : projects.values() ) {
			File f = p.getFile(file);
			if ( f != null )
				return f;
		}
		return null;
	}
	
	
	private KermetaUnitInterest changer = null;
	
	public void changer(KermetaUnitInterest o) {
		changer = o;
		if ( changer != null ) {
			File file = getFile(o.getFile());
			if ( file == null ) {
				KermetaUnit unit = KermetaUnitHelper.typeCheckFile(o.getFile(), o.getFileContent());
				o.updateKermetaUnit(unit);
			}
		}	
	}

	public KermetaUnitInterest changer() {
		return changer;
	}
}
