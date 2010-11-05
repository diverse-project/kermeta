/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.impl;

import art_relaxed.AspectModelElement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smartadapters4ART.ScopedInstantiation;
import smartadapters4ART.Smartadapters4ARTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoped Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smartadapters4ART.impl.ScopedInstantiationImpl#getPointcutElements <em>Pointcut Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScopedInstantiationImpl extends InstantiationStrategyImpl implements ScopedInstantiation {
	/**
	 * The cached value of the '{@link #getPointcutElements() <em>Pointcut Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcutElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AspectModelElement> pointcutElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopedInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smartadapters4ARTPackage.Literals.SCOPED_INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AspectModelElement> getPointcutElements() {
		if (pointcutElements == null) {
			pointcutElements = new EObjectResolvingEList<AspectModelElement>(AspectModelElement.class, this, Smartadapters4ARTPackage.SCOPED_INSTANTIATION__POINTCUT_ELEMENTS);
		}
		return pointcutElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Smartadapters4ARTPackage.SCOPED_INSTANTIATION__POINTCUT_ELEMENTS:
				return getPointcutElements();
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
			case Smartadapters4ARTPackage.SCOPED_INSTANTIATION__POINTCUT_ELEMENTS:
				getPointcutElements().clear();
				getPointcutElements().addAll((Collection<? extends AspectModelElement>)newValue);
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
			case Smartadapters4ARTPackage.SCOPED_INSTANTIATION__POINTCUT_ELEMENTS:
				getPointcutElements().clear();
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
			case Smartadapters4ARTPackage.SCOPED_INSTANTIATION__POINTCUT_ELEMENTS:
				return pointcutElements != null && !pointcutElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScopedInstantiationImpl
