/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnitImpl.java,v 1.21 2008-04-28 11:49:59 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getLastTimeModified <em>Last Time Modified</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getDependents <em>Dependents</em>}</li>
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
	protected Type type;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * The cached value of the '{@link #getDependents() <em>Dependents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependents;

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
	@Override
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
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectResolvingEList<Rule>(Rule.class, this, KpmPackage.UNIT__RULES);
		}
		return rules;
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
	public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, KpmPackage.UNIT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependents() {
		if (dependents == null) {
			dependents = new EObjectResolvingEList<Dependency>(Dependency.class, this, KpmPackage.UNIT__DEPENDENTS);
		}
		return dependents;
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
	public void receiveEvent(String event, boolean synchrone, Map<String, Object> args, IProgressMonitor monitor) {
		IFile file = ResourceHelper.getIFile( getValue() );
		KermetaUnit kermetaUnit = null;
		if ( file != null )
			kermetaUnit = IOPlugin.getDefault().findKermetaUnit(file);
			if ( kermetaUnit != null )
				kermetaUnit.setLocked(true);
			
		for ( Rule currentRule : (List <Rule>) getRules() ) {
			Event currentEvent = currentRule.getEvent();
			if ( currentEvent.equals(event) )
				currentRule.process(this, synchrone, args, monitor);
		}
			
		if ( kermetaUnit != null )
			kermetaUnit.setLocked(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasRuleNamed(String name) {
		Iterator <Rule> iterator = getRules().iterator();
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
	public void beDependentOf(Unit unit, RuleType type) {
		Dependency dependency = KpmFactory.eINSTANCE.createDependency();
		dependency.setFrom(this);
		dependency.setTo(unit);
		dependency.setType(type);
		getDependencies().add(dependency);
		unit.getDependents().add(dependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void getFree(RuleType type, Unit unit) {
		Dependency dependency = unit.findDependentUnit(type, this);
		if ( dependency != null ) {
			unit.getDependents().remove(dependency);
			getDependencies().remove(dependency);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findUnitIDependOn(RuleType type, Unit unit) {
		Dependency dependency = null;
		Iterator <Dependency> iterator = getDependencies().iterator();
		List<Dependency> ghostDependencies = new ArrayList<Dependency> ();
		while ( (dependency == null) && (iterator.hasNext()) ) {
			Dependency currentDependency = iterator.next();
			if ( currentDependency.getTo() != null ) {
				if ( currentDependency.getType().equals(type) && currentDependency.getTo().equals(unit) )
					dependency = currentDependency;
			} else
				ghostDependencies.add(currentDependency);
		}
		if ( ! ghostDependencies.isEmpty() )
			getDependencies().removeAll( ghostDependencies );
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findUnitIDependOn(String type, Unit unit) {
		return findUnitIDependOn(
				((KPM) eContainer()).findRuleType(type),
				unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findDependentUnit(String type, Unit unit) {
		return findDependentUnit(
				((KPM) eContainer()).findRuleType(type),
				unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveSynchroneEvent(String event, Map<String, Object> args, IProgressMonitor monitor) {
		synchronized( this ) {
			if ( args == null )
				args = new HashMap<String, Object>();
			receiveEvent(event, true, args, monitor);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveAsynchroneEvent(String event, Map<String, Object> args, IProgressMonitor monitor) {
		receiveEvent(event, false, args, monitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule findRule(String name) {
		Iterator<Rule> iterator = getRules().iterator();
		while ( iterator.hasNext() ) {
			Rule current = iterator.next();
			if ( current.getName().equals(name) )
				return current;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(Object value) {
		if ( value instanceof Unit )
			return getValue().equals( ((Unit) value).getValue() );
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule findDependency(String name) {
		Iterator<Rule> iterator = getRules().iterator();
		while ( iterator.hasNext() ) {
			Rule currentRule = iterator.next();
			if ( currentRule.getEvent().equals(name) )
				return currentRule;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beDependentOf(Unit unit, Rule rule) {
		beDependentOf(unit, rule.getType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findDependentUnit(RuleType type, Unit unit) {
		Dependency dependency = null;
		Iterator <Dependency> iterator = getDependents().iterator();
		while ( (dependency == null) && (iterator.hasNext()) ) {
			Dependency currentDependency = iterator.next();
			if ( currentDependency.getType().equals(type) && currentDependency.getFrom().equals(unit) )
				dependency = currentDependency;
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.UNIT__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.UNIT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case KpmPackage.UNIT__RULES:
				return getRules();
			case KpmPackage.UNIT__NAME:
				return getName();
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return getLastTimeModified();
			case KpmPackage.UNIT__VALUE:
				return getValue();
			case KpmPackage.UNIT__DEPENDENCIES:
				return getDependencies();
			case KpmPackage.UNIT__DEPENDENTS:
				return getDependents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KpmPackage.UNIT__TYPE:
				setType((Type)newValue);
				return;
			case KpmPackage.UNIT__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case KpmPackage.UNIT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case KpmPackage.UNIT__DEPENDENTS:
				getDependents().clear();
				getDependents().addAll((Collection<? extends Dependency>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KpmPackage.UNIT__TYPE:
				setType((Type)null);
				return;
			case KpmPackage.UNIT__RULES:
				getRules().clear();
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
			case KpmPackage.UNIT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case KpmPackage.UNIT__DEPENDENTS:
				getDependents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KpmPackage.UNIT__TYPE:
				return type != null;
			case KpmPackage.UNIT__RULES:
				return rules != null && !rules.isEmpty();
			case KpmPackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return LAST_TIME_MODIFIED_EDEFAULT == null ? lastTimeModified != null : !LAST_TIME_MODIFIED_EDEFAULT.equals(lastTimeModified);
			case KpmPackage.UNIT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case KpmPackage.UNIT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case KpmPackage.UNIT__DEPENDENTS:
				return dependents != null && !dependents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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