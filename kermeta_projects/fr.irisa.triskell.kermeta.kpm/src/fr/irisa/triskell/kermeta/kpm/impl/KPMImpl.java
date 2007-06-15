/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMImpl.java,v 1.11 2007-06-15 14:45:34 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.Type;

import fr.irisa.triskell.kermeta.kpm.Unit;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getRuleTypes <em>Rule Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPMImpl extends EObjectImpl implements KPM {
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
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList rules = null;

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
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList units = null;

	/**
	 * The cached value of the '{@link #getRuleTypes() <em>Rule Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList ruleTypes = null;

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
	public EList getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList(Event.class, this, KpmPackage.KPM__EVENTS);
		}
		return events;
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
	public EList getRuleTypes() {
		if (ruleTypes == null) {
			ruleTypes = new EObjectContainmentEList(RuleType.class, this, KpmPackage.KPM__RULE_TYPES);
		}
		return ruleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Action createAction(String extensionPoint) {
		Action action = KpmFactory.eINSTANCE.createAction();
		action.setExtensionPoint(extensionPoint);
		getActions().add(action);
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Action findAction(String extensionPoint) {
		Action action = null;
		Iterator <Action> iterator = getActions().iterator();
		while ( (action == null) && iterator.hasNext() ) {
			Action currentAction = iterator.next();
			if ( currentAction.getExtensionPoint().equals(extensionPoint) )
				action = currentAction;
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Event findEvent(String name) {
		Event event = null;
		Iterator <Event> iterator = getEvents().iterator();
		while ( (event == null) && iterator.hasNext() ) {
			Event currentEvent = iterator.next();
			if ( currentEvent.getName().equals(name) )
				event = currentEvent;
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NameFilter createNameFilter(String regex) {
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegex(regex);
		getFilters().add(filter);
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NameFilter findNameFilter(String regex) {
		NameFilter filter = null;
		Iterator <Filter> iterator = getFilters().iterator();
		while ( (filter == null) && iterator.hasNext() ) {
			Filter currentFilter = iterator.next();
			if ( currentFilter instanceof NameFilter ) {
				if ( ((NameFilter) currentFilter).getRegex().equals(regex) )
					filter = (NameFilter) currentFilter;
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExistFilter getExistFilter() {
		Iterator <Filter> iterator = getFilters().iterator();
		while ( iterator.hasNext() ) {
			Filter currentFilter = iterator.next();
			if ( currentFilter instanceof ExistFilter ) 
				return (ExistFilter) currentFilter;
		}
		ExistFilter newFilter = KpmFactory.eINSTANCE.createExistFilter();
		getFilters().add(newFilter);
		return newFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RuleType findRuleType(String name) {
		Iterator <RuleType> iterator = getRuleTypes().iterator();
		while ( iterator.hasNext() ) {
			RuleType currentType = iterator.next();
			if ( currentType.getName().equals(name) ) 
				return currentType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule findRule(String name) {
		Iterator <Rule> iterator = getRules().iterator();
		while ( iterator.hasNext() ) {
			Rule currentRule = iterator.next();
			if ( currentRule.getName().equals(name) ) 
				return currentRule;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeUnit(String name) {
		Unit unitToRemove = null;
		Iterator <Unit> iterator = getUnits().iterator();
		while ( iterator.hasNext() && (unitToRemove == null) ) {
			
			Unit unit = iterator.next();
			if ( unit.getValue().equals(name) )
				unitToRemove = unit;
				
		}
		
		if ( unitToRemove != null )
			getUnits().remove( unitToRemove );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RuleType getRuleType(String name) {
		RuleType type = findRuleType(name);
		if ( type == null ) {
			type = KpmFactory.eINSTANCE.createRuleType();
			type.setName(name);
			getRuleTypes().add(type);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Event getEvent(String name) {
		Event event = findEvent(name);
		if ( event == null ) {
			event = KpmFactory.eINSTANCE.createEvent();
			event.setName(name);
			getEvents().add(event);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Unit findUnit(String name) {
		Iterator<Unit> iterator = getUnits().iterator();
		while ( iterator.hasNext() ) {
			Unit currentUnit = iterator.next();
			if ( currentUnit.getValue().equals(name) )
				return currentUnit;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.KPM__ACTIONS:
				return ((InternalEList)getActions()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__FILTERS:
				return ((InternalEList)getFilters()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__TYPES:
				return ((InternalEList)getTypes()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__RULES:
				return ((InternalEList)getRules()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__EVENTS:
				return ((InternalEList)getEvents()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__UNITS:
				return ((InternalEList)getUnits()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__RULE_TYPES:
				return ((InternalEList)getRuleTypes()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.KPM__ACTIONS:
				return getActions();
			case KpmPackage.KPM__FILTERS:
				return getFilters();
			case KpmPackage.KPM__TYPES:
				return getTypes();
			case KpmPackage.KPM__RULES:
				return getRules();
			case KpmPackage.KPM__EVENTS:
				return getEvents();
			case KpmPackage.KPM__UNITS:
				return getUnits();
			case KpmPackage.KPM__RULE_TYPES:
				return getRuleTypes();
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
			case KpmPackage.KPM__RULES:
				getRules().clear();
				getRules().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__RULE_TYPES:
				getRuleTypes().clear();
				getRuleTypes().addAll((Collection)newValue);
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
			case KpmPackage.KPM__ACTIONS:
				getActions().clear();
				return;
			case KpmPackage.KPM__FILTERS:
				getFilters().clear();
				return;
			case KpmPackage.KPM__TYPES:
				getTypes().clear();
				return;
			case KpmPackage.KPM__RULES:
				getRules().clear();
				return;
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				return;
			case KpmPackage.KPM__RULE_TYPES:
				getRuleTypes().clear();
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
			case KpmPackage.KPM__ACTIONS:
				return actions != null && !actions.isEmpty();
			case KpmPackage.KPM__FILTERS:
				return filters != null && !filters.isEmpty();
			case KpmPackage.KPM__TYPES:
				return types != null && !types.isEmpty();
			case KpmPackage.KPM__RULES:
				return rules != null && !rules.isEmpty();
			case KpmPackage.KPM__EVENTS:
				return events != null && !events.isEmpty();
			case KpmPackage.KPM__UNITS:
				return units != null && !units.isEmpty();
			case KpmPackage.KPM__RULE_TYPES:
				return ruleTypes != null && !ruleTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList(Type.class, this, KpmPackage.KPM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList(Rule.class, this, KpmPackage.KPM__RULES);
		}
		return rules;
	}

} //KPMImpl