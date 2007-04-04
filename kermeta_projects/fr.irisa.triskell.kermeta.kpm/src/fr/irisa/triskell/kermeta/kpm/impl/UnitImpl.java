/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnitImpl.java,v 1.11 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEntry;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getLastTimeModified <em>Last Time Modified</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getDependsOnUnits <em>Depends On Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getDependentUnits <em>Dependent Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitImpl extends EObjectImpl implements Unit {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = null;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList dependencies = null;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependsOnUnits() <em>Depends On Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnUnits()
	 * @generated
	 * @ordered
	 */
	protected EList dependsOnUnits = null;

	/**
	 * The cached value of the '{@link #getDependentUnits() <em>Dependent Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentUnits()
	 * @generated
	 * @ordered
	 */
	protected EList dependentUnits = null;

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
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.UNIT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList(Dependency.class, this, KpmPackage.UNIT__DEPENDENCIES);
		}
		return dependencies;
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
	 * @generated NOT
	 */
	public Date getLastTimeModified() {
		if ( lastTimeModified == null )
			lastTimeModified = new Date(0);
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
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependsOnUnits() {
		if (dependsOnUnits == null) {
			dependsOnUnits = new EObjectContainmentEList(DependencyEntry.class, this, KpmPackage.UNIT__DEPENDS_ON_UNITS);
		}
		return dependsOnUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependentUnits() {
		if (dependentUnits == null) {
			dependentUnits = new EObjectContainmentEList(DependencyEntry.class, this, KpmPackage.UNIT__DEPENDENT_UNITS);
		}
		return dependentUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changed() {
		receiveEvent("update", true, null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveEvent(String event, boolean synchrone, Map args, IProgressMonitor monitor) {
		for ( Dependency currentDependency : (List <Dependency>) getDependencies() ) {
			if ( currentDependency.getEvent().equals(event) )
				currentDependency.process(this, synchrone, args, monitor);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasDependencyNamed(String name) {
		Iterator <Dependency> iterator = getDependencies().iterator();
		while ( iterator.hasNext() )
			if ( iterator.next().getName().equals(name) )
				return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveSynchroneEvent(String event, Map args) {
		receiveEvent(event, true, args, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveAsynchroneEvent(String event, Map args) {
		receiveEvent(event, false, args, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beDependentOf(Unit unit, DependencyType type) {
		DependencyEntry dependOn = KpmFactory.eINSTANCE.createDependencyEntry();
		dependOn.setUnit(unit);
		dependOn.setType(type);
		DependencyEntry dependentUnit = KpmFactory.eINSTANCE.createDependencyEntry();
		dependentUnit.setUnit(this);
		dependentUnit.setType(type);
		getDependsOnUnits().add(dependOn);
		unit.getDependentUnits().add(dependentUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void getFree(DependencyType type, Unit unit) {
		DependencyEntry entry = unit.findDependentUnit(type, this);
		if ( entry != null ) {
			unit.getDependentUnits().remove(entry);
			entry = findUnitIDependOn(type, unit);
			getDependsOnUnits().remove(entry);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DependencyEntry findUnitIDependOn(DependencyType type, Unit unit) {
		DependencyEntry foundEntry = null;
		Iterator <DependencyEntry> iterator = getDependsOnUnits().iterator();
		while ( (foundEntry == null) && (iterator.hasNext()) ) {
			DependencyEntry currentEntry = iterator.next();
			if ( currentEntry.getType().equals(type) && currentEntry.getUnit().equals(unit) )
				foundEntry = currentEntry;
		}
		return foundEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DependencyEntry findUnitIDependOn(String type, Unit unit) {
		return findUnitIDependOn(
				((KPM) eContainer()).findDependencyType(type),
				unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DependencyEntry findDependentUnit(String type, Unit unit) {
		return findDependentUnit(
				((KPM) eContainer()).findDependencyType(type),
				unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveSynchroneEvent(String event, Map args, IProgressMonitor monitor) {
		receiveEvent(event, true, args, monitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findDependency(String name) {
		Iterator<Dependency> iterator = getDependencies().iterator();
		while ( iterator.hasNext() ) {
			Dependency currentDependency = iterator.next();
			if ( currentDependency.getEvent().equals(name) )
				return currentDependency;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beDependentOf(Unit unit, Dependency dependency) {
		DependencyEntry dependOn = KpmFactory.eINSTANCE.createDependencyEntry();
		dependOn.setUnit(unit);
		dependOn.setType(dependency.getType());
		DependencyEntry dependentUnit = KpmFactory.eINSTANCE.createDependencyEntry();
		dependentUnit.setUnit(this);
		dependentUnit.setType(dependency.getType());
		getDependsOnUnits().add(dependOn);
		unit.getDependentUnits().add(dependentUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DependencyEntry findDependentUnit(DependencyType type, Unit unit) {
		DependencyEntry foundEntry = null;
		Iterator <DependencyEntry> iterator = getDependentUnits().iterator();
		while ( (foundEntry == null) && (iterator.hasNext()) ) {
			DependencyEntry currentEntry = iterator.next();
			if ( currentEntry.getType().equals(type) && currentEntry.getUnit().equals(unit) )
				foundEntry = currentEntry;
		}
		return foundEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.UNIT__DEPENDS_ON_UNITS:
				return ((InternalEList)getDependsOnUnits()).basicRemove(otherEnd, msgs);
			case KpmPackage.UNIT__DEPENDENT_UNITS:
				return ((InternalEList)getDependentUnits()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.UNIT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case KpmPackage.UNIT__DEPENDENCIES:
				return getDependencies();
			case KpmPackage.UNIT__NAME:
				return getName();
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return getLastTimeModified();
			case KpmPackage.UNIT__VALUE:
				return getValue();
			case KpmPackage.UNIT__DEPENDS_ON_UNITS:
				return getDependsOnUnits();
			case KpmPackage.UNIT__DEPENDENT_UNITS:
				return getDependentUnits();
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
			case KpmPackage.UNIT__TYPE:
				setType((Type)newValue);
				return;
			case KpmPackage.UNIT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case KpmPackage.UNIT__NAME:
				setName((String)newValue);
				return;
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				setLastTimeModified((Date)newValue);
				return;
			case KpmPackage.UNIT__VALUE:
				setValue((String)newValue);
				return;
			case KpmPackage.UNIT__DEPENDS_ON_UNITS:
				getDependsOnUnits().clear();
				getDependsOnUnits().addAll((Collection)newValue);
				return;
			case KpmPackage.UNIT__DEPENDENT_UNITS:
				getDependentUnits().clear();
				getDependentUnits().addAll((Collection)newValue);
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
			case KpmPackage.UNIT__TYPE:
				setType((Type)null);
				return;
			case KpmPackage.UNIT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case KpmPackage.UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				setLastTimeModified(LAST_TIME_MODIFIED_EDEFAULT);
				return;
			case KpmPackage.UNIT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case KpmPackage.UNIT__DEPENDS_ON_UNITS:
				getDependsOnUnits().clear();
				return;
			case KpmPackage.UNIT__DEPENDENT_UNITS:
				getDependentUnits().clear();
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
			case KpmPackage.UNIT__TYPE:
				return type != null;
			case KpmPackage.UNIT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case KpmPackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return LAST_TIME_MODIFIED_EDEFAULT == null ? lastTimeModified != null : !LAST_TIME_MODIFIED_EDEFAULT.equals(lastTimeModified);
			case KpmPackage.UNIT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case KpmPackage.UNIT__DEPENDS_ON_UNITS:
				return dependsOnUnits != null && !dependsOnUnits.isEmpty();
			case KpmPackage.UNIT__DEPENDENT_UNITS:
				return dependentUnits != null && !dependentUnits.isEmpty();
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
		result.append(", lastTimeModified: ");
		result.append(lastTimeModified);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //UnitImpl