/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeLiteralImpl.java,v 1.7 2008-10-29 08:29:14 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.TypeLiteral;
import kermeta.language.behavior.TypeReference;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.TypeLiteralImpl#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLiteralImpl extends LiteralImpl implements TypeLiteral {
	/**
	 * The cached value of the '{@link #getTyperef() <em>Typeref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyperef()
	 * @generated
	 * @ordered
	 */
	protected TypeReference typeref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.TYPE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getTyperef() {
		if (typeref != null && typeref.eIsProxy()) {
			InternalEObject oldTyperef = (InternalEObject) typeref;
			typeref = (TypeReference) eResolveProxy(oldTyperef);
			if (typeref != oldTyperef) {
				InternalEObject newTyperef = (InternalEObject) typeref;
				NotificationChain msgs = oldTyperef.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.TYPE_LITERAL__TYPEREF, null,
						null);
				if (newTyperef.eInternalContainer() == null) {
					msgs = newTyperef
							.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
									- BehaviorPackage.TYPE_LITERAL__TYPEREF,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.TYPE_LITERAL__TYPEREF, oldTyperef,
							typeref));
			}
		}
		return typeref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetTyperef() {
		return typeref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTyperef(TypeReference newTyperef,
			NotificationChain msgs) {
		TypeReference oldTyperef = typeref;
		typeref = newTyperef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.TYPE_LITERAL__TYPEREF,
					oldTyperef, newTyperef);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyperef(TypeReference newTyperef) {
		if (newTyperef != typeref) {
			NotificationChain msgs = null;
			if (typeref != null)
				msgs = ((InternalEObject) typeref).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.TYPE_LITERAL__TYPEREF, null,
						msgs);
			if (newTyperef != null)
				msgs = ((InternalEObject) newTyperef).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.TYPE_LITERAL__TYPEREF, null,
						msgs);
			msgs = basicSetTyperef(newTyperef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.TYPE_LITERAL__TYPEREF, newTyperef,
					newTyperef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = this.getTyperef().createBehaviorJava(context);

		return result;

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
		case BehaviorPackage.TYPE_LITERAL__TYPEREF:
			return basicSetTyperef(null, msgs);
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
		case BehaviorPackage.TYPE_LITERAL__TYPEREF:
			if (resolve)
				return getTyperef();
			return basicGetTyperef();
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
		case BehaviorPackage.TYPE_LITERAL__TYPEREF:
			setTyperef((TypeReference) newValue);
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
		case BehaviorPackage.TYPE_LITERAL__TYPEREF:
			setTyperef((TypeReference) null);
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
		case BehaviorPackage.TYPE_LITERAL__TYPEREF:
			return typeref != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeLiteralImpl
