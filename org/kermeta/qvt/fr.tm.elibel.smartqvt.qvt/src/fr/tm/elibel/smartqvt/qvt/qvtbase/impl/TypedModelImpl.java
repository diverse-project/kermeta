/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase.impl;

import fr.tm.elibel.smartqvt.qvt.emof.impl.NamedElementImpl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation;
import fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.TypedModelImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.TypedModelImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.TypedModelImpl#getUsedPackage <em>Used Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedModelImpl extends NamedElementImpl implements TypedModel {
	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList dependsOn;

	/**
	 * The cached value of the '{@link #getUsedPackage() <em>Used Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList usedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtbasePackage.Literals.TYPED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList(TypedModel.class, this, QvtbasePackage.TYPED_MODEL__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (eContainerFeatureID != QvtbasePackage.TYPED_MODEL__TRANSFORMATION) return null;
		return (Transformation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransformation, QvtbasePackage.TYPED_MODEL__TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		if (newTransformation != eInternalContainer() || (eContainerFeatureID != QvtbasePackage.TYPED_MODEL__TRANSFORMATION && newTransformation != null)) {
			if (EcoreUtil.isAncestor(this, newTransformation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, QvtbasePackage.TRANSFORMATION__MODEL_PARAMETER, Transformation.class, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.TYPED_MODEL__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedPackage() {
		if (usedPackage == null) {
			usedPackage = new EObjectResolvingEList(fr.tm.elibel.smartqvt.qvt.emof.Package.class, this, QvtbasePackage.TYPED_MODEL__USED_PACKAGE);
		}
		return usedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransformation((Transformation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				return eInternalContainer().eInverseRemove(this, QvtbasePackage.TRANSFORMATION__MODEL_PARAMETER, Transformation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtbasePackage.TYPED_MODEL__DEPENDS_ON:
				return getDependsOn();
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				return getTransformation();
			case QvtbasePackage.TYPED_MODEL__USED_PACKAGE:
				return getUsedPackage();
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
			case QvtbasePackage.TYPED_MODEL__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection)newValue);
				return;
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case QvtbasePackage.TYPED_MODEL__USED_PACKAGE:
				getUsedPackage().clear();
				getUsedPackage().addAll((Collection)newValue);
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
			case QvtbasePackage.TYPED_MODEL__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case QvtbasePackage.TYPED_MODEL__USED_PACKAGE:
				getUsedPackage().clear();
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
			case QvtbasePackage.TYPED_MODEL__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case QvtbasePackage.TYPED_MODEL__TRANSFORMATION:
				return getTransformation() != null;
			case QvtbasePackage.TYPED_MODEL__USED_PACKAGE:
				return usedPackage != null && !usedPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedModelImpl
