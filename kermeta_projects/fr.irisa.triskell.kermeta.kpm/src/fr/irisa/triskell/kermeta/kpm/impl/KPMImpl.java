/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMImpl.java,v 1.3 2006-12-07 13:47:21 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;
import java.util.ArrayList;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

import org.eclipse.core.resources.IFile;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPMImpl extends EObjectImpl implements KPM {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList units = null;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList dependencies = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.KPM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList(Unit.class, this, KpmPackage.KPM__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentWithInverseEList(Dependency.class, this, KpmPackage.KPM__DEPENDENCIES, KpmPackage.DEPENDENCY__KPM);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFile(String fileName, String filePath) {
		File file = KPMHelper.createFile(fileName, filePath);
		file.setKpm(this);
		
		Directory container = findDirectory(filePath);
		if ( container == null )
			container = createDirectory(filePath);
			
		file.setContainer(container);
		container.getContents().add(file);
		
		getUnits().add(file);
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFileIfNecessary(String fileName, String filePath) {
		File foundFile = findFile(fileName, filePath);
		if ( foundFile == null )
			return createFile(fileName, filePath);
		else
			return foundFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFileIfNecessary(IFile iFile) {
		File foundFile = findFile(iFile);
		if ( foundFile == null )
			return createFile(iFile);
		else
			return foundFile;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFile(String fileRelativeName) {
		String[] nameAndPath = StringHelper.getNameAndPath(fileRelativeName);
		return createFile(nameAndPath[0], nameAndPath[1]);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFile(IFile iFile) {
		String[] nameAndPath = StringHelper.getNameAndPath( iFile.getFullPath() );
		return createFile(nameAndPath[0], nameAndPath[1]);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory createDirectoryIfNecessary(String directoryName, String directoryPath) {
		Directory foundDirectory = findDirectory(directoryName, directoryPath);
		if ( foundDirectory == null )
			return createDirectory(directoryName, directoryPath);
		else
			return foundDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory findDirectory(String directoryName, String directoryPath) {
		Iterator itOnUnits = getUnits().iterator();
		Directory foundDirectory = null;
		while ( (foundDirectory == null) && (itOnUnits.hasNext()) ) {
			Unit currentUnit = (Unit) itOnUnits.next();
			if ( currentUnit.isDirectory()
				&& currentUnit.getName().equals(directoryName)
				&& currentUnit.getPath().equals(directoryPath))
				foundDirectory = (Directory) currentUnit;
		}
		return foundDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory findDirectory(String directoryRelativeName) {
		String[] nameAndPath = StringHelper.getNameAndPath(directoryRelativeName);
		return findDirectory(nameAndPath[0], nameAndPath[1]);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory findDirectory(IFolder iFolder) {
		String[] nameAndPath = StringHelper.getNameAndPath( iFolder.getFullPath() );
		return findDirectory(nameAndPath[0], nameAndPath[1] );
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Project createProjectIfNecessary(String projectName) {
		Project foundProject = findProject(projectName);
		if ( foundProject == null )
			return createProject(projectName);
		else
			return foundProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Project findProject(String projectName) {
		Iterator itOnUnits = getUnits().iterator();
		Project foundProject = null;
		while ( (foundProject == null) && (itOnUnits.hasNext()) ) {
			Unit currentUnit = (Unit) itOnUnits.next();
			if ( currentUnit.isProject()
				&& currentUnit.getName().equals(projectName))
				foundProject = (Project) currentUnit;
		}
		return foundProject;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory createDirectoryIfNecessary(IFolder iDirectory) {
		Directory foundDirectory = findDirectory(iDirectory);
		if ( foundDirectory == null )
			return createDirectory(iDirectory);
		else
			return foundDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory createDirectory(String directoryName, String directoryPath) {
		Directory directory = KPMHelper.createDirectory(directoryName, directoryPath);
		directory.setKpm(this);
		
		Directory container = findDirectory(directoryPath);
		if ( container == null )
			container = createDirectory(directoryPath);
			
		directory.setContainer(container);
		container.getContents().add(directory);
		
		getUnits().add(directory);
		
		directory.load();
		
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory createDirectory(String directoryRelativeName) {
		String[] nameAndPath = StringHelper.getNameAndPath(directoryRelativeName);
		return createDirectory(nameAndPath[0], nameAndPath[1]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory createDirectory(IFolder iDirectory) {
		String[] nameAndPath = StringHelper.getNameAndPath( iDirectory.getFullPath() );
		return createDirectory ( nameAndPath[0], nameAndPath[1] );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Project createProjectIfNecessary(IProject iProject) {
		Project foundProject = findProject(iProject);
		if ( foundProject == null )
			return createProject(iProject);
		else
			return foundProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Project createProject(String projectName) {
		Project project = KPMHelper.createProject(projectName);
		project.setKpm(this);
		getUnits().add(project);
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Project createProject(IProject iProject) {
		return createProject ( iProject.getName() );
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFile(File file) {
		if ( file != null ) {
			file.getContainer().getContents().remove(file);
			removeUnit(file);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFile(String fileName, String filePath) {
		File foundFile = findFile(fileName, filePath);
		removeFile(foundFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFile(IFile iFile) {
		String[] nameAndPath = StringHelper.getNameAndPath( iFile.getFullPath() );
		removeFile(nameAndPath[0], nameAndPath[1]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDirectory(Directory directory) {
		if ( directory != null ) {
			directory.getContainer().getContents().remove(directory);
			directory.getContents().clear();
			removeUnit(directory);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDirectory(String directoryName, String directoryPath) {
		Directory foundDirectory = findDirectory(directoryName, directoryPath);
		removeDirectory(foundDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDirectory(IFolder iDirectory) {
		String[] nameAndPath = StringHelper.getNameAndPath( iDirectory.getFullPath() );
		removeDirectory(nameAndPath[0], nameAndPath[1]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeProject(Project project) {
		if ( project != null ) {
			removeUnit(project);
			project.getContents().clear();
		}
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeProject(String projectName) {
		Project foundProject = findProject(projectName);
		removeProject(foundProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeProject(IProject iProject) {
		removeProject(iProject.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency createDependency(Unit from, Unit to, String typeName, String eventName, ArrayList actionsName) {
		Dependency dependency = KpmFactory.eINSTANCE.createDependency();

		dependency.setType( KPMHelper.createType(typeName) );
		dependency.setEvent( KPMHelper.createEvent(eventName) );
		
		for ( String actionName : (ArrayList<String>) actionsName ) {
			Action action = KpmFactory.eINSTANCE.createAction();
			action.setName(actionName);		
			dependency.getActions().add(action);
		}
		
		
		dependency.setFrom( from );
		dependency.setTo( to );
		getDependencies().add(dependency);
		from.getOwnedDependencies().add(dependency);
		dependency.setKpm(this);
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Remove every dependencies for a unit. The given unit plays the role of from. The dependency
	 * for the unit playing the role of to is also removed.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDependencies(Unit unit) {
		Dependency[] dependencies = (Dependency[]) unit.getOwnedDependencies().toArray();
		
		for ( int index = 0; index < dependencies.length; index++ ) {
			
			Dependency currentDependency = dependencies[index];
			
			currentDependency.getTo().removeDependencies(unit);
			getDependencies().remove(currentDependency);
			
		}
		
		unit.getOwnedDependencies().clear();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * A unit can only be removed if and only if no other units points to the current unit via
	 * a dependency.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeUnit(Unit unit) {
		
		removeDependencies(unit);
		
		getUnits().remove(unit);
		
		/*List <Unit> units = unit.getDependenciesUnit();
		
		boolean canIDelete = true;
		Iterator <Unit> itOnUnits = units.iterator();
		
		while ( canIDelete && itOnUnits.hasNext() ) {
		
			Unit currentUnit = itOnUnits.next();
			//unit.removeDependencies(unit);
			//removeDependencies(currentUnit);
			
			if ( currentUnit.getDependencies(unit).size() != 0 )
				canIDelete = false;
			
		}
		
		if ( canIDelete ) {
			getUnits().remove(unit);
			removeDependencies(unit);
		}
		
		unit.setLastTimeModified( new Date(0) );*/
		/*
		Iterator <Dependency> itOnDependencies = unit.getOwnedDependencies().iterator();
		while ( itOnDependencies.hasNext() )
			getDependencies().remove(itOnDependencies.next());*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findDependency(Unit from, Unit to, String typeName, String eventName) {
		return from.findDependency(to, typeName, eventName);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load() {
		Iterator <Unit> itOnUnits = getUnits().iterator();
		while ( itOnUnits.hasNext() ) {
			itOnUnits.next().load();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.KPM__DEPENDENCIES:
				return ((InternalEList)getDependencies()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File findFile(String fileName, String filePath) {
		Iterator itOnUnits = getUnits().iterator();
		File foundFile = null;
		while ( (foundFile == null) && (itOnUnits.hasNext()) ) {
			Unit currentUnit = (Unit) itOnUnits.next();
			if ( currentUnit.isFile()
				&& currentUnit.getName().equals(fileName)
				&& currentUnit.getPath().equals(filePath))
				foundFile = (File) currentUnit;
		}
		return foundFile;			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File findFile(String fileRelativeName) {
		String[] nameAndPath = StringHelper.getNameAndPath(fileRelativeName);
		return findFile(nameAndPath[0], nameAndPath[1]);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File findFile(IFile iFile) {
		String[] nameAndPath = StringHelper.getNameAndPath( iFile.getFullPath() );
		return findFile(nameAndPath[0], nameAndPath[1]);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Project findProject(IProject iProject) {
		return findProject(iProject.getName());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.KPM__UNITS:
				return ((InternalEList)getUnits()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__DEPENDENCIES:
				return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.KPM__UNITS:
				return getUnits();
			case KpmPackage.KPM__DEPENDENCIES:
				return getDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				return;
			case KpmPackage.KPM__DEPENDENCIES:
				getDependencies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KpmPackage.KPM__UNITS:
				return units != null && !units.isEmpty();
			case KpmPackage.KPM__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KPMImpl