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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smartadapters4ART.InstantiationStrategy;
import smartadapters4ART.Smartadapters4ARTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smartadapters4ART.impl.InstantiationStrategyImpl#getAdviceElements <em>Advice Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstantiationStrategyImpl extends EObjectImpl implements InstantiationStrategy {
	/**
	 * The cached value of the '{@link #getAdviceElements() <em>Advice Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdviceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AspectModelElement> adviceElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smartadapters4ARTPackage.Literals.INSTANTIATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AspectModelElement> getAdviceElements() {
		if (adviceElements == null) {
			adviceElements = new EObjectResolvingEList<AspectModelElement>(AspectModelElement.class, this, Smartadapters4ARTPackage.INSTANTIATION_STRATEGY__ADVICE_ELEMENTS);
		}
		return adviceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Smartadapters4ARTPackage.INSTANTIATION_STRATEGY__ADVICE_ELEMENTS:
				return getAdviceElements();
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
			case Smartadapters4ARTPackage.INSTANTIATION_STRATEGY__ADVICE_ELEMENTS:
				getAdviceElements().clear();
				getAdviceElements().addAll((Collection<? extends AspectModelElement>)newValue);
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
			case Smartadapters4ARTPackage.INSTANTIATION_STRATEGY__ADVICE_ELEMENTS:
				getAdviceElements().clear();
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
			case Smartadapters4ARTPackage.INSTANTIATION_STRATEGY__ADVICE_ELEMENTS:
				return adviceElements != null && !adviceElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstantiationStrategyImpl
