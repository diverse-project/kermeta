/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMImpl.java,v 1.8 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getDependencyTypes <em>Dependency Types</em>}</li>
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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList dependencies = null;

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
	 * The cached value of the '{@link #getDependencyTypes() <em>Dependency Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList dependencyTypes = null;

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
	public EList getDependencyTypes() {
		if (dependencyTypes == null) {
			dependencyTypes = new EObjectContainmentEList(DependencyType.class, this, KpmPackage.KPM__DEPENDENCY_TYPES);
		}
		return dependencyTypes;
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
	public DependencyType findDependencyType(String name) {
		Iterator <DependencyType> iterator = getDependencyTypes().iterator();
		while ( iterator.hasNext() ) {
			DependencyType currentType = iterator.next();
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
	public DependencyType getDependencyType(String name) {
		DependencyType type = findDependencyType(name);
		if ( type == null ) {
			type = KpmFactory.eINSTANCE.createDependencyType();
			type.setName(name);
			getDependencyTypes().add(type);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dependency findDependency(String name) {
		Iterator <Dependency> iterator = getDependencies().iterator();
		while ( iterator.hasNext() ) {
			Dependency currentDependency = iterator.next();
			if ( currentDependency.getName().equals(name) ) 
				return currentDependency;
		}
		return null;
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
			case KpmPackage.KPM__DEPENDENCIES:
				return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__EVENTS:
				return ((InternalEList)getEvents()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__UNITS:
				return ((InternalEList)getUnits()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__DEPENDENCY_TYPES:
				return ((InternalEList)getDependencyTypes()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.KPM__DEPENDENCIES:
				return getDependencies();
			case KpmPackage.KPM__EVENTS:
				return getEvents();
			case KpmPackage.KPM__UNITS:
				return getUnits();
			case KpmPackage.KPM__DEPENDENCY_TYPES:
				return getDependencyTypes();
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
			case KpmPackage.KPM__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection)newValue);
				return;
			case KpmPackage.KPM__DEPENDENCY_TYPES:
				getDependencyTypes().clear();
				getDependencyTypes().addAll((Collection)newValue);
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
			case KpmPackage.KPM__DEPENDENCIES:
				getDependencies().clear();
				return;
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				return;
			case KpmPackage.KPM__DEPENDENCY_TYPES:
				getDependencyTypes().clear();
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
			case KpmPackage.KPM__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case KpmPackage.KPM__EVENTS:
				return events != null && !events.isEmpty();
			case KpmPackage.KPM__UNITS:
				return units != null && !units.isEmpty();
			case KpmPackage.KPM__DEPENDENCY_TYPES:
				return dependencyTypes != null && !dependencyTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public EList getTypes() {
		// TODO Auto-generated method stub
		return null;
	}

} //KPMImpl