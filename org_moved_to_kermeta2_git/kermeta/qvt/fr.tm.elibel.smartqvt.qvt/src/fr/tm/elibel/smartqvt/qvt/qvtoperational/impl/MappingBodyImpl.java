/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.impl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingBodyImpl#getEndSection <em>End Section</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingBodyImpl#getInitSection <em>Init Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingBodyImpl extends OperationBodyImpl implements MappingBody {
	/**
	 * The cached value of the '{@link #getEndSection() <em>End Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSection()
	 * @generated
	 * @ordered
	 */
	protected EList endSection;

	/**
	 * The cached value of the '{@link #getInitSection() <em>Init Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitSection()
	 * @generated
	 * @ordered
	 */
	protected EList initSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEndSection() {
		if (endSection == null) {
			endSection = new EObjectContainmentEList(OclExpression.class, this, QvtoperationalPackage.MAPPING_BODY__END_SECTION);
		}
		return endSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitSection() {
		if (initSection == null) {
			initSection = new EObjectContainmentEList(OclExpression.class, this, QvtoperationalPackage.MAPPING_BODY__INIT_SECTION);
		}
		return initSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				return ((InternalEList)getEndSection()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				return ((InternalEList)getInitSection()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				return getEndSection();
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				return getInitSection();
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				getEndSection().clear();
				getEndSection().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				getInitSection().clear();
				getInitSection().addAll((Collection)newValue);
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				getEndSection().clear();
				return;
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				getInitSection().clear();
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				return endSection != null && !endSection.isEmpty();
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				return initSection != null && !initSection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingBodyImpl
