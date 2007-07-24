/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpressionImpl.java,v 1.2 2007-07-24 13:47:10 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.FilterExpressionImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterExpressionImpl extends SimpleExpressionImpl implements FilterExpression {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.FILTER_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (Filter)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.FILTER_EXPRESSION__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(Filter newFilter) {
		Filter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.FILTER_EXPRESSION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.FILTER_EXPRESSION__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KpmPackage.FILTER_EXPRESSION__FILTER:
				setFilter((Filter)newValue);
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
			case KpmPackage.FILTER_EXPRESSION__FILTER:
				setFilter((Filter)null);
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
			case KpmPackage.FILTER_EXPRESSION__FILTER:
				return filter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluateIn(Unit unit) {
		if ( getSubExpression() != null )
			return getSubExpression().evaluateIn(unit, getFilter().matches(unit));
		return getFilter().matches(unit);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluateOut(Unit unit) {
		
		if ( getFilter() instanceof ExistFilter ) {
			IFile file = ResourceHelper.getIFile(unit.getValue());
			boolean exist = file.exists();
			if ( getSubExpression() != null )
				return getSubExpression().evaluateOut(unit, true);
			return exist;
		} else if ( getFilter() instanceof NameFilter ) {
			Unit pseudoUnit = KpmFactory.eINSTANCE.createUnit();
			String outputString = NameFilterHelper.getOutputString(unit, this);
			pseudoUnit.setValue( outputString );
			if ( getSubExpression() != null )
				return getSubExpression().evaluateOut(pseudoUnit, true);
			if ( outputString.equals("") )
				return false;
			else
				return true;
		}
		return false;
	}

} //FilterExpressionImpl