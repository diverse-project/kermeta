/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnitImpl.java,v 1.3 2006-12-07 13:47:21 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;

import org.eclipse.core.resources.IResource;

import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getLastTimeModified <em>Last Time Modified</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getKpm <em>Kpm</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getOwnedDependencies <em>Owned Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getProject <em>Project</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitImpl extends EObjectImpl implements Unit {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastTimeModified() <em>Last Time Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTimeModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_TIME_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastTimeModified() <em>Last Time Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTimeModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastTimeModified = LAST_TIME_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKpm() <em>Kpm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpm()
	 * @generated
	 * @ordered
	 */
	protected KPM kpm = null;

	/**
	 * The cached value of the '{@link #getOwnedDependencies() <em>Owned Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList ownedDependencies = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final IResource VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected IResource value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastTimeModified() {
		return lastTimeModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastTimeModified(Date newLastTimeModified) {
		Date oldLastTimeModified = lastTimeModified;
		lastTimeModified = newLastTimeModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__LAST_TIME_MODIFIED, oldLastTimeModified, lastTimeModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPM getKpm() {
		if (kpm != null && kpm.eIsProxy()) {
			InternalEObject oldKpm = (InternalEObject)kpm;
			kpm = (KPM)eResolveProxy(oldKpm);
			if (kpm != oldKpm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.UNIT__KPM, oldKpm, kpm));
			}
		}
		return kpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPM basicGetKpm() {
		return kpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpm(KPM newKpm) {
		KPM oldKpm = kpm;
		kpm = newKpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__KPM, oldKpm, kpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedDependencies() {
		if (ownedDependencies == null) {
			ownedDependencies = new EObjectResolvingEList(Dependency.class, this, KpmPackage.UNIT__OWNED_DEPENDENCIES);
		}
		return ownedDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.UNIT__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(IResource newValue) {
		IResource oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFile() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDirectory() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changed() {
		setLastTimeModified( new Date() );
		receiveEvent("update");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isProject() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRelativeName() {
		return getPath() + "/" + getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAbsoluteName() {
		
		return IResourceHelper.getAbsolutePath() + getRelativeName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HashSet getDependencies(String type) {		
		HashSet <Dependency> dependencies = new HashSet <Dependency> ();
		Iterator <Dependency> itOnDependencies = getOwnedDependencies().iterator();
		while ( itOnDependencies.hasNext() ) {
		
			Dependency currentDependency = itOnDependencies.next();
			if ( currentDependency.getType().equals(type) )
				dependencies.add(currentDependency);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getExtension() {
		return StringHelper.getExtension( getName() );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveEvent(String name) {
		Iterator <Dependency> itOnDependencies = getOwnedDependencies().iterator();
		while ( itOnDependencies.hasNext() ) {
			Dependency dependency = itOnDependencies.next();
			if ( dependency.getEvent().equals(name) )
				dependency.process();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HashSet getDependencies(Unit unit) {
		HashSet <Dependency> dependencies = new HashSet <Dependency> ();
		Iterator <Dependency> itOnDependencies = getOwnedDependencies().iterator();
		while ( itOnDependencies.hasNext() ) {
		
			Dependency currentDependency = itOnDependencies.next();
			if ( currentDependency.getTo().equals(unit) )
				dependencies.add(currentDependency);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method removes each dependencies where the "to" attribute is the given unit.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDependencies(Unit to) {
		Dependency[] dependencies = (Dependency[]) getOwnedDependencies().toArray();
		for ( int index = 0; index < dependencies.length; index++ ) {
			Dependency currentDependency = dependencies[index];
			if ( currentDependency.getTo() == to ) {
				// remove the dependency from the unit
				getOwnedDependencies().remove(currentDependency);
				// remove the dependency from the system
				getKpm().getDependencies().remove(currentDependency);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findDependency(Unit to, String typeName, String eventName) {
		Iterator <Dependency> itOnDependencies = getOwnedDependencies().iterator();
		Dependency foundDependency = null;
		while ( (foundDependency == null) && itOnDependencies.hasNext() ) {
			
			Dependency currentDependency = itOnDependencies.next();
			if ( (currentDependency.getTo() == to)
				&& (currentDependency.getType().equals(typeName))
				&& (currentDependency.getEvent().equals(eventName)) )
				foundDependency = currentDependency;
		}
		return foundDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method calculates the set of units the current unit is linked to via dependencies.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList getDependenciesUnit() {
		Iterator <Dependency> itOnDependencies = getOwnedDependencies().iterator();
		ArrayList <Unit> units = new ArrayList <Unit> ();
		while ( itOnDependencies.hasNext() ) {
			
			Dependency currentDependency = itOnDependencies.next();
			if ( ! units.contains(currentDependency.getTo()) )
				units.add ( currentDependency.getTo() );
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HashSet getDependenciesWithEvent(String eventName) {
		HashSet <Dependency> dependencies = new HashSet <Dependency> ();
		Iterator <Dependency> itOnDependencies = getOwnedDependencies().iterator();
		while ( itOnDependencies.hasNext() ) {
		
			Dependency currentDependency = itOnDependencies.next();
			if ( currentDependency.getEvent().equals(eventName) )
				dependencies.add(currentDependency);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDependencies(Type type) {
		Dependency[] dependencies = (Dependency[]) getOwnedDependencies().toArray();
		for ( int index = 0; index < dependencies.length; index++ ) {
			Dependency currentDependency = dependencies[index];
			if ( currentDependency.getType().equals(type) ) {
				getOwnedDependencies().remove(currentDependency);		
				getKpm().getDependencies().remove(currentDependency);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void load() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.UNIT__NAME:
				return getName();
			case KpmPackage.UNIT__PATH:
				return getPath();
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return getLastTimeModified();
			case KpmPackage.UNIT__KPM:
				if (resolve) return getKpm();
				return basicGetKpm();
			case KpmPackage.UNIT__OWNED_DEPENDENCIES:
				return getOwnedDependencies();
			case KpmPackage.UNIT__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case KpmPackage.UNIT__VALUE:
				return getValue();
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
			case KpmPackage.UNIT__NAME:
				setName((String)newValue);
				return;
			case KpmPackage.UNIT__PATH:
				setPath((String)newValue);
				return;
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				setLastTimeModified((Date)newValue);
				return;
			case KpmPackage.UNIT__KPM:
				setKpm((KPM)newValue);
				return;
			case KpmPackage.UNIT__OWNED_DEPENDENCIES:
				getOwnedDependencies().clear();
				getOwnedDependencies().addAll((Collection)newValue);
				return;
			case KpmPackage.UNIT__PROJECT:
				setProject((Project)newValue);
				return;
			case KpmPackage.UNIT__VALUE:
				setValue((IResource)newValue);
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
			case KpmPackage.UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KpmPackage.UNIT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				setLastTimeModified(LAST_TIME_MODIFIED_EDEFAULT);
				return;
			case KpmPackage.UNIT__KPM:
				setKpm((KPM)null);
				return;
			case KpmPackage.UNIT__OWNED_DEPENDENCIES:
				getOwnedDependencies().clear();
				return;
			case KpmPackage.UNIT__PROJECT:
				setProject((Project)null);
				return;
			case KpmPackage.UNIT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case KpmPackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KpmPackage.UNIT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return LAST_TIME_MODIFIED_EDEFAULT == null ? lastTimeModified != null : !LAST_TIME_MODIFIED_EDEFAULT.equals(lastTimeModified);
			case KpmPackage.UNIT__KPM:
				return kpm != null;
			case KpmPackage.UNIT__OWNED_DEPENDENCIES:
				return ownedDependencies != null && !ownedDependencies.isEmpty();
			case KpmPackage.UNIT__PROJECT:
				return project != null;
			case KpmPackage.UNIT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", lastTimeModified: ");
		result.append(lastTimeModified);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //UnitImpl