/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnumImpl.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package ecore.impl;

import ecore.EEnum;
import ecore.EEnumLiteral;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EEnumImpl#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEnumImpl extends EDataTypeImpl implements EEnum {
	/**
	 * The cached value of the '{@link #getELiterals() <em>ELiterals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EEnumLiteral> eLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEnumLiteral> getELiterals() {
		if (eLiterals == null) {
			eLiterals = new EObjectContainmentWithInverseEList.Resolving<EEnumLiteral>(
					EEnumLiteral.class, this, EcorePackage.EENUM__ELITERALS,
					EcorePackage.EENUM_LITERAL__EENUM);
		}
		return eLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEEnumLiteral2(int value) {

		ecore.EEnumLiteral result = null;

		result = null;
		//Beginning of the Inlining of the function type: detect

		ecore.EEnumLiteral result_ft189 = null;

		ecore.EEnumLiteral elem_ft189 = null;

		result_ft189 = null;

		{

			kermeta.standard.Iterator<ecore.EEnumLiteral> it_ft189 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EEnumLiteral> convertAsOrderedSet(
							this.getELiterals()).iterator();
			java.lang.Boolean idLoopCond_835 = false;
			while (!idLoopCond_835) {
				idLoopCond_835 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft189.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft189, null));
				if (idLoopCond_835) {
				} else {

					elem_ft189 = it_ft189.next();

					java.lang.Boolean idIfCond_836 = false;
					//Beginning of the Inlining of the lambda expression: detector
					ecore.EEnumLiteral e = elem_ft189;

					idIfCond_836 = kermeta.standard.helper.IntegerWrapper
							.equals(e.getValue(), value);
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_836) {

						result_ft189 = elem_ft189;
					}

				}
			}
		}

		//End of the Inlining of the function type: detect

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral op_getEEnumLiteral(String name) {
		ecore.EEnumLiteral result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEEnumLiteral(int value) {
		ecore.EEnumLiteral result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEEnumLiteralByLiteral(String literal) {
		ecore.EEnumLiteral result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.EENUM__ELITERALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getELiterals())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.EENUM__ELITERALS:
			return ((InternalEList<?>) getELiterals()).basicRemove(otherEnd,
					msgs);
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
		case EcorePackage.EENUM__ELITERALS:
			return getELiterals();
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
		case EcorePackage.EENUM__ELITERALS:
			getELiterals().clear();
			getELiterals()
					.addAll((Collection<? extends EEnumLiteral>) newValue);
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
		case EcorePackage.EENUM__ELITERALS:
			getELiterals().clear();
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
		case EcorePackage.EENUM__ELITERALS:
			return eLiterals != null && !eLiterals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EEnumImpl
