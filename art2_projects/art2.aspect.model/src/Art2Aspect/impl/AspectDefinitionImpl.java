/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.Art2AspectPackage;
import Art2Aspect.AspectDefinition;
import Art2Aspect.BindingPattern;
import Art2Aspect.PointcutDefinition;

import art2.ContainerRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Art2Aspect.impl.AspectDefinitionImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link Art2Aspect.impl.AspectDefinitionImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link Art2Aspect.impl.AspectDefinitionImpl#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectDefinitionImpl extends EObjectImpl implements AspectDefinition {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList bindings;

	/**
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected PointcutDefinition pointcut;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected ContainerRoot advice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Art2AspectPackage.Literals.ASPECT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList(BindingPattern.class, this, Art2AspectPackage.ASPECT_DEFINITION__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointcutDefinition getPointcut() {
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointcut(PointcutDefinition newPointcut, NotificationChain msgs) {
		PointcutDefinition oldPointcut = pointcut;
		pointcut = newPointcut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2AspectPackage.ASPECT_DEFINITION__POINTCUT, oldPointcut, newPointcut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcut(PointcutDefinition newPointcut) {
		if (newPointcut != pointcut) {
			NotificationChain msgs = null;
			if (pointcut != null)
				msgs = ((InternalEObject)pointcut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2AspectPackage.ASPECT_DEFINITION__POINTCUT, null, msgs);
			if (newPointcut != null)
				msgs = ((InternalEObject)newPointcut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2AspectPackage.ASPECT_DEFINITION__POINTCUT, null, msgs);
			msgs = basicSetPointcut(newPointcut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2AspectPackage.ASPECT_DEFINITION__POINTCUT, newPointcut, newPointcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRoot getAdvice() {
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdvice(ContainerRoot newAdvice, NotificationChain msgs) {
		ContainerRoot oldAdvice = advice;
		advice = newAdvice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2AspectPackage.ASPECT_DEFINITION__ADVICE, oldAdvice, newAdvice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvice(ContainerRoot newAdvice) {
		if (newAdvice != advice) {
			NotificationChain msgs = null;
			if (advice != null)
				msgs = ((InternalEObject)advice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2AspectPackage.ASPECT_DEFINITION__ADVICE, null, msgs);
			if (newAdvice != null)
				msgs = ((InternalEObject)newAdvice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2AspectPackage.ASPECT_DEFINITION__ADVICE, null, msgs);
			msgs = basicSetAdvice(newAdvice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2AspectPackage.ASPECT_DEFINITION__ADVICE, newAdvice, newAdvice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2AspectPackage.ASPECT_DEFINITION__BINDINGS:
				return ((InternalEList)getBindings()).basicRemove(otherEnd, msgs);
			case Art2AspectPackage.ASPECT_DEFINITION__POINTCUT:
				return basicSetPointcut(null, msgs);
			case Art2AspectPackage.ASPECT_DEFINITION__ADVICE:
				return basicSetAdvice(null, msgs);
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
			case Art2AspectPackage.ASPECT_DEFINITION__BINDINGS:
				return getBindings();
			case Art2AspectPackage.ASPECT_DEFINITION__POINTCUT:
				return getPointcut();
			case Art2AspectPackage.ASPECT_DEFINITION__ADVICE:
				return getAdvice();
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
			case Art2AspectPackage.ASPECT_DEFINITION__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection)newValue);
				return;
			case Art2AspectPackage.ASPECT_DEFINITION__POINTCUT:
				setPointcut((PointcutDefinition)newValue);
				return;
			case Art2AspectPackage.ASPECT_DEFINITION__ADVICE:
				setAdvice((ContainerRoot)newValue);
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
			case Art2AspectPackage.ASPECT_DEFINITION__BINDINGS:
				getBindings().clear();
				return;
			case Art2AspectPackage.ASPECT_DEFINITION__POINTCUT:
				setPointcut((PointcutDefinition)null);
				return;
			case Art2AspectPackage.ASPECT_DEFINITION__ADVICE:
				setAdvice((ContainerRoot)null);
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
			case Art2AspectPackage.ASPECT_DEFINITION__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case Art2AspectPackage.ASPECT_DEFINITION__POINTCUT:
				return pointcut != null;
			case Art2AspectPackage.ASPECT_DEFINITION__ADVICE:
				return advice != null;
		}
		return super.eIsSet(featureID);
	}

} //AspectDefinitionImpl
