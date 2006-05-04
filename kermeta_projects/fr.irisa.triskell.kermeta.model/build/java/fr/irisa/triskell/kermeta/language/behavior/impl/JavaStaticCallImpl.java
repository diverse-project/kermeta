/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaStaticCallImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;

import fr.irisa.triskell.kermeta.language.structure.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Static Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.JavaStaticCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.JavaStaticCallImpl#getJclass <em>Jclass</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.JavaStaticCallImpl#getJmethod <em>Jmethod</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaStaticCallImpl extends ExpressionImpl implements JavaStaticCall {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters = null;

	/**
	 * The default value of the '{@link #getJclass() <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected static final String JCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJclass() <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected String jclass = JCLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJmethod() <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected static final String JMETHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJmethod() <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected String jmethod = JMETHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaStaticCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getJavaStaticCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList(Expression.class, this, BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJclass() {
		return jclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJclass(String newJclass) {
		String oldJclass = jclass;
		jclass = newJclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.JAVA_STATIC_CALL__JCLASS, oldJclass, jclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJmethod() {
		return jmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmethod(String newJmethod) {
		String oldJmethod = jmethod;
		jmethod = newJmethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.JAVA_STATIC_CALL__JMETHOD, oldJmethod, jmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.JAVA_STATIC_CALL__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.JAVA_STATIC_CALL__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.JAVA_STATIC_CALL__TAG:
				return getTag();
			case BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				return getParameters();
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				return getJclass();
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				return getJmethod();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.JAVA_STATIC_CALL__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE:
				setStaticType((Type)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				setJclass((String)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				setJmethod((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.JAVA_STATIC_CALL__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE:
				setStaticType((Type)null);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				getParameters().clear();
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				setJclass(JCLASS_EDEFAULT);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				setJmethod(JMETHOD_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.JAVA_STATIC_CALL__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.JAVA_STATIC_CALL__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.JAVA_STATIC_CALL__STATIC_TYPE:
				return staticType != null;
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				return JCLASS_EDEFAULT == null ? jclass != null : !JCLASS_EDEFAULT.equals(jclass);
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				return JMETHOD_EDEFAULT == null ? jmethod != null : !JMETHOD_EDEFAULT.equals(jmethod);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jclass: ");
		result.append(jclass);
		result.append(", jmethod: ");
		result.append(jmethod);
		result.append(')');
		return result.toString();
	}

} //JavaStaticCallImpl
