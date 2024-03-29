/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnitImpl.java,v 1.22 2008-05-28 09:26:13 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.Usage;

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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getUsedUsages <em>Used Usages</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getUsedBy <em>Used By</em>}</li>
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
	 * The cached value of the '{@link #getUsedUsages() <em>Used Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usedUsages;

	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usedBy;

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
	public EList<Usage> getUsedUsages() {
		if (usedUsages == null) {
			usedUsages = new EObjectContainmentWithInverseEList<Usage>(Usage.class, this, KpmPackage.UNIT__USED_USAGES, KpmPackage.USAGE__USER_UNIT);
		}
		return usedUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usage> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList<Usage>(Usage.class, this, KpmPackage.UNIT__USED_BY, KpmPackage.USAGE__USED_UNIT);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(Object value) {
		if ( value instanceof Unit )
			return getName().equals( ((Unit) value).getName() );
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addUsedBy(Usage d) {
		for ( Usage current : getUsedBy() ) {
			if ( current.getUsedUnit() == d.getUsedUnit() 
					&& current.getUserUnit() == d.getUserUnit() 
					&& current.getType().equals(d.getType()) )
				return;
		}
		getUsedBy().add(d);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addUsedUsage(Usage d) {
		for ( Usage current : getUsedUsages() ) {
			if ( current.getUsedUnit() == d.getUsedUnit() 
					&& current.getUserUnit() == d.getUserUnit() 
					&& current.getType().equals(d.getType()) )
				return;
		}
		getUsedUsages().add(d);
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beDependentOf(Unit master, String type) {
		assert(master != null);
		for ( Usage current : getUsedUsages() ) {
			if ( current.getUsedUnit() == master 
					&& current.getUserUnit() == this 
					&& current.getType().equals(type) )
				return;
		}
		
		Usage d = KpmFactory.eINSTANCE.createUsage();
		d.setType(type);
		d.setUserUnit(this);
		d.setUsedUnit(master);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beUsedBy(Unit dependent, String type) {
		assert(dependent != null);
		for ( Usage current : getUsedBy() ) {
			if ( current.getUsedUnit() == dependent 
					&& current.getUserUnit() == this 
					&& current.getType().equals(type) )
				return;
		}
		
		Usage d = KpmFactory.eINSTANCE.createUsage();
		d.setType(type);
		d.setUserUnit(dependent);
		d.setUsedUnit(this);	
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.UNIT__USED_USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedUsages()).basicAdd(otherEnd, msgs);
			case KpmPackage.UNIT__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.UNIT__USED_USAGES:
				return ((InternalEList<?>)getUsedUsages()).basicRemove(otherEnd, msgs);
			case KpmPackage.UNIT__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.UNIT__USED_USAGES:
				return getUsedUsages();
			case KpmPackage.UNIT__USED_BY:
				return getUsedBy();
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
			case KpmPackage.UNIT__USED_USAGES:
				getUsedUsages().clear();
				getUsedUsages().addAll((Collection<? extends Usage>)newValue);
				return;
			case KpmPackage.UNIT__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends Usage>)newValue);
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
			case KpmPackage.UNIT__USED_USAGES:
				getUsedUsages().clear();
				return;
			case KpmPackage.UNIT__USED_BY:
				getUsedBy().clear();
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
			case KpmPackage.UNIT__USED_USAGES:
				return usedUsages != null && !usedUsages.isEmpty();
			case KpmPackage.UNIT__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //UnitImpl