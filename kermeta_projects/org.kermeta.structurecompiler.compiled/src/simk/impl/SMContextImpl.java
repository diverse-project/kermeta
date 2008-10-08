/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMContextImpl.java,v 1.4 2008-10-08 14:37:33 cfaucher Exp $
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
import simk.SMMethod;
import simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.SMContextImpl#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link simk.impl.SMContextImpl#getSMMethods <em>SM Methods</em>}</li>
 *   <li>{@link simk.impl.SMContextImpl#getFinalPackageQName <em>Final Package QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMContextImpl extends ObjectImpl implements SMContext {
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
	 * The cached value of the '{@link #getSMMethods() <em>SM Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<SMMethod> sMMethods;

	/**
	 * The default value of the '{@link #getFinalPackageQName() <em>Final Package QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalPackageQName()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_PACKAGE_QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalPackageQName() <em>Final Package QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalPackageQName()
	 * @generated
	 * @ordered
	 */
	protected String finalPackageQName = FINAL_PACKAGE_QNAME_EDEFAULT;

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
	public EList<SMMethod> getSMMethods() {
		if (sMMethods == null) {
			sMMethods = new EObjectWithInverseResolvingEList<SMMethod>(
					SMMethod.class, this, SimkPackage.SM_CONTEXT__SM_METHODS,
					SimkPackage.SM_METHOD__SM_CONTEXT);
		}
		return sMMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalPackageQName() {
		return finalPackageQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalPackageQName(String newFinalPackageQName) {
		String oldFinalPackageQName = finalPackageQName;
		finalPackageQName = newFinalPackageQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_CONTEXT__FINAL_PACKAGE_QNAME,
					oldFinalPackageQName, finalPackageQName));
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
		case SimkPackage.SM_CONTEXT__SM_METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSMMethods())
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
		case SimkPackage.SM_CONTEXT__SM_METHODS:
			return ((InternalEList<?>) getSMMethods()).basicRemove(otherEnd,
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
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			if (resolve)
				return getSMClass();
			return basicGetSMClass();
		case SimkPackage.SM_CONTEXT__SM_METHODS:
			return getSMMethods();
		case SimkPackage.SM_CONTEXT__FINAL_PACKAGE_QNAME:
			return getFinalPackageQName();
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
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			setSMClass((SMClass) newValue);
			return;
		case SimkPackage.SM_CONTEXT__SM_METHODS:
			getSMMethods().clear();
			getSMMethods().addAll((Collection<? extends SMMethod>) newValue);
			return;
		case SimkPackage.SM_CONTEXT__FINAL_PACKAGE_QNAME:
			setFinalPackageQName((String) newValue);
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
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			setSMClass((SMClass) null);
			return;
		case SimkPackage.SM_CONTEXT__SM_METHODS:
			getSMMethods().clear();
			return;
		case SimkPackage.SM_CONTEXT__FINAL_PACKAGE_QNAME:
			setFinalPackageQName(FINAL_PACKAGE_QNAME_EDEFAULT);
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
		case SimkPackage.SM_CONTEXT__SM_CLASS:
			return sMClass != null;
		case SimkPackage.SM_CONTEXT__SM_METHODS:
			return sMMethods != null && !sMMethods.isEmpty();
		case SimkPackage.SM_CONTEXT__FINAL_PACKAGE_QNAME:
			return FINAL_PACKAGE_QNAME_EDEFAULT == null ? finalPackageQName != null
					: !FINAL_PACKAGE_QNAME_EDEFAULT.equals(finalPackageQName);
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
		result.append(" (finalPackageQName: ");
		result.append(finalPackageQName);
		result.append(')');
		return result.toString();
	}

} //SMContextImpl
