/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMImpl.java,v 1.13 2008-05-28 09:26:14 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPMImpl extends EObjectImpl implements KPM {
	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

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
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.KPM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, KpmPackage.KPM__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, KpmPackage.KPM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Unit>(Unit.class, this, KpmPackage.KPM__UNITS);
		}
		return units;
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
	public boolean removeUnit(String name) {
		Unit unitToRemove = getUnit(name);
		if ( unitToRemove != null ) {
			// First remove all dependencies of that unit from the kpm model.
			for ( Usage d : unitToRemove.getUsedUsages() )
				d.getUsedUnit().getUsedBy().remove(d);
			for ( Usage d : unitToRemove.getUsedBy() )
				d.getUserUnit().getUsedUsages().remove(d);
			// Finally remove the unit from the kpm model.
			getUnits().remove( unitToRemove );
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Unit getUnit(String name) {
		for ( Unit u : getUnits() )
			if ( u.getName().equals(name) )
				return u;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOt
	 */
	public Rule getRule(String name) {
		for ( Rule r : getRules() )
			if ( r.getName().equals(name) )
				return r;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Event getEvent(String name) {
		for ( Event e : getEvents() )
			if ( e.getName().equals(name) )
				return e;
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
			case KpmPackage.KPM__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case KpmPackage.KPM__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.KPM__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case KpmPackage.KPM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case KpmPackage.KPM__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case KpmPackage.KPM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case KpmPackage.KPM__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, KpmPackage.KPM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, KpmPackage.KPM__RULES);
		}
		return rules;
	}

} //KPMImpl