/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: UsingImpl.java,v 1.11 2009-02-10 17:51:45 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EAnnotation;

import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Using;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.UsingImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsingImpl extends ObjectImpl implements Using {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getUsing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.USING__QUALIFIED_NAME, oldQualifiedName,
					qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		this.createEcoreModelElement(context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEcoreModelElement(KM2EcoreContext context) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation ecoreAnnotation = ((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ModelingUnit")))
				.getEcoreModelElement();

		ecore.EStringToStringMapEntry usingEntry = null;
		//BIft:detect

		ecore.EStringToStringMapEntry result_ft153 = null;

		ecore.EStringToStringMapEntry elem_ft153 = null;

		result_ft153 = null;

		{

			kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft153 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
							ecoreAnnotation.getDetails()).iterator();
			java.lang.Boolean idLoopCond_710 = false;
			while (!idLoopCond_710) {
				idLoopCond_710 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft153.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft153, null));
				if (idLoopCond_710) {
				} else {

					elem_ft153 = it_ft153.next();

					java.lang.Boolean idIfCond_711 = false;
					//BIle:detector
					ecore.EStringToStringMapEntry d_lbdExp153 = elem_ft153;

					idIfCond_711 = kermeta.standard.helper.StringWrapper
							.equals(d_lbdExp153.getKey(), "using");
					//EIle:detector

					if (idIfCond_711) {

						result_ft153 = elem_ft153;
					}

				}
			}
		}

		//CE
		usingEntry = result_ft153;
		//EIft:detect
		;

		usingEntry.setValue(kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(usingEntry
						.getValue(), this.getQualifiedName()), "|"));

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
						ecoreAnnotation.getDetails()).add(usingEntry);

		result = ecoreAnnotation;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.USING__QUALIFIED_NAME:
			return getQualifiedName();
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
		case StructurePackage.USING__QUALIFIED_NAME:
			setQualifiedName((String) newValue);
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
		case StructurePackage.USING__QUALIFIED_NAME:
			setQualifiedName(QUALIFIED_NAME_EDEFAULT);
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
		case StructurePackage.USING__QUALIFIED_NAME:
			return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null
					: !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qualifiedName: ");
		result.append(qualifiedName);
		result.append(')');
		return result.toString();
	}

} //UsingImpl
