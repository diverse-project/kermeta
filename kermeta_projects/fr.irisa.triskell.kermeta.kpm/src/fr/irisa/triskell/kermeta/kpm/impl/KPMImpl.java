/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMImpl.java,v 1.6 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.AbstractExpression;
import fr.irisa.triskell.kermeta.kpm.AbstractUnit;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEvent;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;

import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;

import java.util.Collection;
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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPMImpl extends EObjectImpl implements KPM {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList events = null;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList actions = null;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList filters = null;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList types = null;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList expressions = null;

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
			units = new EObjectContainmentWithInverseEList(Unit.class, this, KpmPackage.KPM__UNITS, KpmPackage.UNIT__KPM);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NameFilter getNameFilter(String regex) {
		Iterator <Filter> itOnFilters = getFilters().iterator();
		NameFilter found = null;
		while ( (found == null) && (itOnFilters.hasNext()) ) {
			
			Filter currentFilter = itOnFilters.next();
			
			if ( (currentFilter instanceof NameFilter)
					&& ((NameFilter) currentFilter).getRegexIn().equals(regex) ) 
				found = (NameFilter) currentFilter;
		}
		return found;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExistFilter getExistFilter() {
		Iterator <Filter> itOnFilters = getFilters().iterator();
		ExistFilter found = null;
		while ( (found == null) && (itOnFilters.hasNext()) ) {
			
			Filter currentFilter = itOnFilters.next();
			
			if (currentFilter instanceof ExistFilter)	 
				found = (ExistFilter) currentFilter;
		}
		return found;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Action getAction(String name) {		
		Iterator <Action> itOnActions = getActions().iterator();
		Action found = null;
		while ( (found == null) && (itOnActions.hasNext()) ) {
		
			Action currentAction = itOnActions.next();
		
			if ( currentAction.getName().equals(name) ) 
				found = currentAction;
		}
		return found;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DependencyEvent getEvent(String name) {
		Iterator <DependencyEvent> itOnEvents = getEvents().iterator();
		DependencyEvent found = null;
		while ( (found == null) && (itOnEvents.hasNext()) ) {
		
			DependencyEvent currentEvent = itOnEvents.next();
		
			if ( currentEvent.getName().equals(name) ) 
				found = currentEvent;
		}
		return found;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpression(String name) {
		Iterator <AbstractExpression> itOnExpressions = getExpressions().iterator();
		Expression found = null;
		while ( (found == null) && (itOnExpressions.hasNext()) ) {
		
			AbstractExpression currentExpression = itOnExpressions.next();
		
			if ( currentExpression.getId().equals(name) ) 
				found = (Expression) currentExpression;
		}
		return found;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency getDependency(String name) {
		Iterator <Dependency> itOnDependencies = getDependencies().iterator();
		Dependency found = null;
		while ( (found == null) && (itOnDependencies.hasNext()) ) {
		
			Dependency currentDependency = itOnDependencies.next();
		
			if ( currentDependency.getName().equals(name) ) 
				found = currentDependency;
		}
		return found;
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
	public File findFile(IFile iFile) {
		//String[] nameAndPath = StringHelper.getNameAndPath( iFile.getFullPath() );
		return findFile(iFile.getName(), iFile.getFullPath().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory findDirectory(String directoryRelativeName) {
		String[] nameAndPath = StringHelper.getNameAndPath(directoryRelativeName);
		return findDirectory(nameAndPath[0], directoryRelativeName);
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
	public Directory findDirectory(IFolder iFolder) {
		return findDirectory(iFolder.getName(), iFolder.getFullPath().toString() );
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
	 * @generated
	 */
	public Project findProject(String name, String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated NOT
	 */
	public void removeFile(File unit) {
		getUnits().remove(unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDirectory(Directory unit) {
		
		Iterator <File> itOnFiles = unit.getContents().iterator();
		while ( itOnFiles.hasNext() )
			removeFile(itOnFiles.next());
		
		getUnits().remove(unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeProject(Project unit) {
		getUnits().remove(unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFile(IFile unit) {
		File file = findFile(unit);
		if ( file != null )
			removeFile(file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDirectory(IFolder unit) {
		Directory directory = findDirectory(unit);
		if ( directory != null )
			removeDirectory(directory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeProject(IProject unit) {
		Project project = findProject(unit);
		if ( project != null )
			removeProject(project);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Directory createDirectory(IFolder ifolder) {
		Directory directory = KpmFactory.eINSTANCE.createDirectory();
		directory.setKpm(this);
		directory.setName(ifolder.getName());
		directory.setPath(ifolder.getFullPath().toString());
		getUnits().add(directory);
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DependencyType getType(String name) {
		Iterator <DependencyType> itOnTypes = getTypes().iterator();
		DependencyType found = null;
		while ( (found == null) && (itOnTypes.hasNext()) ) {
		
			DependencyType currentType = itOnTypes.next();
		
			if ( currentType.getName().equals(name) ) 
				found = currentType;
		}
		return found;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.KPM__UNITS:
				return ((InternalEList)getUnits()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList(DependencyEvent.class, this, KpmPackage.KPM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList(Dependency.class, this, KpmPackage.KPM__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList(Action.class, this, KpmPackage.KPM__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList(Filter.class, this, KpmPackage.KPM__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList(DependencyType.class, this, KpmPackage.KPM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList(Expression.class, this, KpmPackage.KPM__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.KPM__EVENTS:
				return ((InternalEList)getEvents()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__DEPENDENCIES:
				return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__ACTIONS:
				return ((InternalEList)getActions()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__FILTERS:
				return ((InternalEList)getFilters()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__TYPES:
				return ((InternalEList)getTypes()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__EXPRESSIONS:
				return ((InternalEList)getExpressions()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__UNITS:
				return ((InternalEList)getUnits()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.KPM__EVENTS:
				return getEvents();
			case KpmPackage.KPM__DEPENDENCIES:
				return getDependencies();
			case KpmPackage.KPM__ACTIONS:
				return getActions();
			case KpmPackage.KPM__FILTERS:
				return getFilters();
			case KpmPackage.KPM__TYPES:
				return getTypes();
			case KpmPackage.KPM__EXPRESSIONS:
				return getExpressions();
			case KpmPackage.KPM__UNITS:
				return getUnits();
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
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection)newValue);
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
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				return;
			case KpmPackage.KPM__DEPENDENCIES:
				getDependencies().clear();
				return;
			case KpmPackage.KPM__ACTIONS:
				getActions().clear();
				return;
			case KpmPackage.KPM__FILTERS:
				getFilters().clear();
				return;
			case KpmPackage.KPM__TYPES:
				getTypes().clear();
				return;
			case KpmPackage.KPM__EXPRESSIONS:
				getExpressions().clear();
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
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
			case KpmPackage.KPM__EVENTS:
				return events != null && !events.isEmpty();
			case KpmPackage.KPM__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case KpmPackage.KPM__ACTIONS:
				return actions != null && !actions.isEmpty();
			case KpmPackage.KPM__FILTERS:
				return filters != null && !filters.isEmpty();
			case KpmPackage.KPM__TYPES:
				return types != null && !types.isEmpty();
			case KpmPackage.KPM__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case KpmPackage.KPM__UNITS:
				return units != null && !units.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KPMImpl