/**
 * <copyright>
 * </copyright>
 *
 * $Id: EModelElementImpl.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package ecore.impl;

import ecore.EAnnotation;
import ecore.EModelElement;
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
 * An implementation of the model object '<em><b>EModel Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EModelElementImpl#getEAnnotations <em>EAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EModelElementImpl extends EObjectImpl implements
		EModelElement {
	/**
	 * The cached value of the '{@link #getEAnnotations() <em>EAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> eAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EMODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getEAnnotations() {
		if (eAnnotations == null) {
			eAnnotations = new EObjectContainmentWithInverseEList.Resolving<EAnnotation>(
					EAnnotation.class, this,
					EcorePackage.EMODEL_ELEMENT__EANNOTATIONS,
					EcorePackage.EANNOTATION__EMODEL_ELEMENT);
		}
		return eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEAnnotation(String source) {

		ecore.EAnnotation result = null;

		result = null;
		//Beginning of the Inlining of the function type: detect

		ecore.EAnnotation result_ft190 = null;

		ecore.EAnnotation elem_ft190 = null;

		result_ft190 = null;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft190 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							this.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_837 = false;
			while (!idLoopCond_837) {
				idLoopCond_837 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft190.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft190, null));
				if (idLoopCond_837) {
				} else {

					elem_ft190 = it_ft190.next();

					java.lang.Boolean idIfCond_838 = false;
					//Beginning of the Inlining of the lambda expression: detector
					ecore.EAnnotation a = elem_ft190;

					idIfCond_838 = kermeta.standard.helper.StringWrapper
							.equals(a.getSource(), source);
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_838) {

						result_ft190 = elem_ft190;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
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
		case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS:
			return ((InternalEList<?>) getEAnnotations()).basicRemove(otherEnd,
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
		case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS:
			return getEAnnotations();
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
		case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS:
			getEAnnotations().clear();
			getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
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
		case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS:
			getEAnnotations().clear();
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
		case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS:
			return eAnnotations != null && !eAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EModelElementImpl
