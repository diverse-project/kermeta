/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependencyImpl.java,v 1.2 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.AbstractExpression;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEvent;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;

import fr.irisa.triskell.kermeta.kpm.Unit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl#getIn <em>In</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl#getOuts <em>Outs</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends EObjectImpl implements Dependency {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DependencyType type = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected DependencyEvent event = null;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList actions = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected Expression in = null;

	/**
	 * The cached value of the '{@link #getOuts() <em>Outs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuts()
	 * @generated
	 * @ordered
	 */
	protected EList outs = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DependencyType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.DEPENDENCY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DependencyType newType) {
		DependencyType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.DEPENDENCY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (DependencyEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.DEPENDENCY__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(DependencyEvent newEvent) {
		DependencyEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.DEPENDENCY__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList(Action.class, this, KpmPackage.DEPENDENCY__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIn() {
		if (in != null && in.eIsProxy()) {
			InternalEObject oldIn = (InternalEObject)in;
			in = (Expression)eResolveProxy(oldIn);
			if (in != oldIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.DEPENDENCY__IN, oldIn, in));
			}
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(Expression newIn) {
		Expression oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.DEPENDENCY__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOuts() {
		if (outs == null) {
			outs = new EObjectResolvingEList(Expression.class, this, KpmPackage.DEPENDENCY__OUTS);
		}
		return outs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.DEPENDENCY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void process(Unit unit) {

		if ( isExecutable(unit) ) {
			ArrayList <Unit> dependents = getDependents(unit);
			Iterator <Action> itOnActions = getActions().iterator();
			while ( itOnActions.hasNext() ) 
				itOnActions.next().execute(unit, dependents);
		}
	}

	public ArrayList getDependents(Unit unit) {
		
		ArrayList <String> l = new ArrayList <String> ();
		
		Iterator <AbstractExpression> itOnExpressions = getOuts().iterator();
		while ( itOnExpressions.hasNext() ) {
			
			AbstractExpression currentExpression = itOnExpressions.next();
			String dependent = currentExpression.getDependentFrom(unit);
			if ( ! dependent.equals("") )
				l.add(dependent);
			
		}
		
		return l;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isExecutable(Unit unit) {
		AbstractExpression expression = getIn();
		if ( ! expression.evaluate(unit) )
			return false;
		
		/*Iterator <Unit> itOnUnits = getOuts().iterator();
		Iterator <AbstractExpression> itOnExpressions = getOuts().iterator();
		
		while ( itOnUnits.hasNext() && itOnExpressions.hasNext() ) {
			
			AbstractExpression currentExpression = itOnExpressions.next();
			Unit currentUnit = itOnUnits.next();
			
			if ( currentExpression.evaluate(currentUnit) )
				return false;
			
		}*/
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean couldBeExecutable(Unit unit) {
		AbstractExpression expression = getIn();
		if ( ! expression.evaluate(unit) )
			return false;
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.DEPENDENCY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case KpmPackage.DEPENDENCY__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case KpmPackage.DEPENDENCY__ACTIONS:
				return getActions();
			case KpmPackage.DEPENDENCY__IN:
				if (resolve) return getIn();
				return basicGetIn();
			case KpmPackage.DEPENDENCY__OUTS:
				return getOuts();
			case KpmPackage.DEPENDENCY__NAME:
				return getName();
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
			case KpmPackage.DEPENDENCY__TYPE:
				setType((DependencyType)newValue);
				return;
			case KpmPackage.DEPENDENCY__EVENT:
				setEvent((DependencyEvent)newValue);
				return;
			case KpmPackage.DEPENDENCY__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection)newValue);
				return;
			case KpmPackage.DEPENDENCY__IN:
				setIn((Expression)newValue);
				return;
			case KpmPackage.DEPENDENCY__OUTS:
				getOuts().clear();
				getOuts().addAll((Collection)newValue);
				return;
			case KpmPackage.DEPENDENCY__NAME:
				setName((String)newValue);
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
			case KpmPackage.DEPENDENCY__TYPE:
				setType((DependencyType)null);
				return;
			case KpmPackage.DEPENDENCY__EVENT:
				setEvent((DependencyEvent)null);
				return;
			case KpmPackage.DEPENDENCY__ACTIONS:
				getActions().clear();
				return;
			case KpmPackage.DEPENDENCY__IN:
				setIn((Expression)null);
				return;
			case KpmPackage.DEPENDENCY__OUTS:
				getOuts().clear();
				return;
			case KpmPackage.DEPENDENCY__NAME:
				setName(NAME_EDEFAULT);
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
			case KpmPackage.DEPENDENCY__TYPE:
				return type != null;
			case KpmPackage.DEPENDENCY__EVENT:
				return event != null;
			case KpmPackage.DEPENDENCY__ACTIONS:
				return actions != null && !actions.isEmpty();
			case KpmPackage.DEPENDENCY__IN:
				return in != null;
			case KpmPackage.DEPENDENCY__OUTS:
				return outs != null && !outs.isEmpty();
			case KpmPackage.DEPENDENCY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //DependencyImpl