/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMContextImpl.java,v 1.2 2008-09-11 12:34:39 cfaucher Exp $
 */
package simk.impl;

import java.util.Collection;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simk.SMClass;
import simk.SMContext;
import simk.SimkPackage;
import simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.SMContextImpl#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}</li>
 *   <li>{@link simk.impl.SMContextImpl#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link simk.impl.SMContextImpl#getStaticMethods <em>Static Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMContextImpl extends ObjectImpl implements SMContext {
	/**
	 * The default value of the '{@link #getQualifiedNameFinalPackage() <em>Qualified Name Final Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedNameFinalPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_FINAL_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedNameFinalPackage() <em>Qualified Name Final Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedNameFinalPackage()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedNameFinalPackage = QUALIFIED_NAME_FINAL_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSMClass() <em>SM Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMClass()
	 * @generated
	 * @ordered
	 */
	protected SMClass sMClass;

	/**
	 * The cached value of the '{@link #getStaticMethods() <em>Static Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticMethod> staticMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SM_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedNameFinalPackage() {
		return qualifiedNameFinalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedNameFinalPackage(String newQualifiedNameFinalPackage) {
		String oldQualifiedNameFinalPackage = qualifiedNameFinalPackage;
		qualifiedNameFinalPackage = newQualifiedNameFinalPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE,
					oldQualifiedNameFinalPackage, qualifiedNameFinalPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMClass getSMClass() {
		if (sMClass != null && sMClass.eIsProxy()) {
			InternalEObject oldSMClass = (InternalEObject) sMClass;
			sMClass = (SMClass) eResolveProxy(oldSMClass);
			if (sMClass != oldSMClass) {
				InternalEObject newSMClass = (InternalEObject) sMClass;
				NotificationChain msgs = oldSMClass.eInverseRemove(this,
						SimkPackage.SM_CLASS__CONTEXT, SMClass.class, null);
				if (newSMClass.eInternalContainer() == null) {
					msgs = newSMClass.eInverseAdd(this,
							SimkPackage.SM_CLASS__CONTEXT, SMClass.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimkPackage.SM_CONTEXT__SM_CLASS, oldSMClass,
							sMClass));
			}
		}
		return sMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMClass basicGetSMClass() {
		return sMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSMClass(SMClass newSMClass,
			NotificationChain msgs) {
		SMClass oldSMClass = sMClass;
		sMClass = newSMClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, SimkPackage.SM_CONTEXT__SM_CLASS,
					oldSMClass, newSMClass);
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
	public void setSMClass(SMClass newSMClass) {
		if (newSMClass != sMClass) {
			NotificationChain msgs = null;
			if (sMClass != null)
				msgs = ((InternalEObject) sMClass).eInverseRemove(this,
						SimkPackage.SM_CLASS__CONTEXT, SMClass.class, msgs);
			if (newSMClass != null)
				msgs = ((InternalEObject) newSMClass).eInverseAdd(this,
						SimkPackage.SM_CLASS__CONTEXT, SMClass.class, msgs);
			msgs = basicSetSMClass(newSMClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_CONTEXT__SM_CLASS, newSMClass, newSMClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticMethod> getStaticMethods() {
		if (staticMethods == null) {
			staticMethods = new EObjectWithInverseResolvingEList<StaticMethod>(
					StaticMethod.class, this,
					SimkPackage.SM_CONTEXT__STATIC_METHODS,
					SimkPackage.STATIC_METHOD__SM_CONTEXT);
		}
		return staticMethods;
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
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			if (sMClass != null)
				msgs = ((InternalEObject) sMClass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- SimkPackage.SM_CONTEXT__SM_CLASS, null, msgs);
			return basicSetSMClass((SMClass) otherEnd, msgs);
		case SimkPackage.SM_CONTEXT__STATIC_METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStaticMethods())
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
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			return basicSetSMClass(null, msgs);
		case SimkPackage.SM_CONTEXT__STATIC_METHODS:
			return ((InternalEList<?>) getStaticMethods()).basicRemove(
					otherEnd, msgs);
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
		case SimkPackage.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE:
			return getQualifiedNameFinalPackage();
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			if (resolve)
				return getSMClass();
			return basicGetSMClass();
		case SimkPackage.SM_CONTEXT__STATIC_METHODS:
			return getStaticMethods();
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
		case SimkPackage.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE:
			setQualifiedNameFinalPackage((String) newValue);
			return;
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			setSMClass((SMClass) newValue);
			return;
		case SimkPackage.SM_CONTEXT__STATIC_METHODS:
			getStaticMethods().clear();
			getStaticMethods().addAll(
					(Collection<? extends StaticMethod>) newValue);
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
		case SimkPackage.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE:
			setQualifiedNameFinalPackage(QUALIFIED_NAME_FINAL_PACKAGE_EDEFAULT);
			return;
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			setSMClass((SMClass) null);
			return;
		case SimkPackage.SM_CONTEXT__STATIC_METHODS:
			getStaticMethods().clear();
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
		case SimkPackage.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE:
			return QUALIFIED_NAME_FINAL_PACKAGE_EDEFAULT == null ? qualifiedNameFinalPackage != null
					: !QUALIFIED_NAME_FINAL_PACKAGE_EDEFAULT
							.equals(qualifiedNameFinalPackage);
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			return sMClass != null;
		case SimkPackage.SM_CONTEXT__STATIC_METHODS:
			return staticMethods != null && !staticMethods.isEmpty();
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
		result.append(" (qualifiedNameFinalPackage: ");
		result.append(qualifiedNameFinalPackage);
		result.append(')');
		return result.toString();
	}

} //SMContextImpl
