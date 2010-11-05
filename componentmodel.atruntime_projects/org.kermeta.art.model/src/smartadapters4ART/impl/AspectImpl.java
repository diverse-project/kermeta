/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.impl;

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

import smartadapters4ART.Adaptation;
import smartadapters4ART.AdviceModel;
import smartadapters4ART.Aspect;
import smartadapters4ART.InstantiationStrategy;
import smartadapters4ART.PointcutModel;
import smartadapters4ART.Smartadapters4ARTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smartadapters4ART.impl.AspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link smartadapters4ART.impl.AspectImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link smartadapters4ART.impl.AspectImpl#getAdvice <em>Advice</em>}</li>
 *   <li>{@link smartadapters4ART.impl.AspectImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link smartadapters4ART.impl.AspectImpl#getAdapt <em>Adapt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends EObjectImpl implements Aspect {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected PointcutModel pointcut;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected AdviceModel advice;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<InstantiationStrategy> strategies;

	/**
	 * The cached value of the '{@link #getAdapt() <em>Adapt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapt()
	 * @generated
	 * @ordered
	 */
	protected EList<Adaptation> adapt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smartadapters4ARTPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smartadapters4ARTPackage.ASPECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointcutModel getPointcut() {
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointcut(PointcutModel newPointcut, NotificationChain msgs) {
		PointcutModel oldPointcut = pointcut;
		pointcut = newPointcut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Smartadapters4ARTPackage.ASPECT__POINTCUT, oldPointcut, newPointcut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcut(PointcutModel newPointcut) {
		if (newPointcut != pointcut) {
			NotificationChain msgs = null;
			if (pointcut != null)
				msgs = ((InternalEObject)pointcut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Smartadapters4ARTPackage.ASPECT__POINTCUT, null, msgs);
			if (newPointcut != null)
				msgs = ((InternalEObject)newPointcut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Smartadapters4ARTPackage.ASPECT__POINTCUT, null, msgs);
			msgs = basicSetPointcut(newPointcut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smartadapters4ARTPackage.ASPECT__POINTCUT, newPointcut, newPointcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceModel getAdvice() {
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdvice(AdviceModel newAdvice, NotificationChain msgs) {
		AdviceModel oldAdvice = advice;
		advice = newAdvice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Smartadapters4ARTPackage.ASPECT__ADVICE, oldAdvice, newAdvice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvice(AdviceModel newAdvice) {
		if (newAdvice != advice) {
			NotificationChain msgs = null;
			if (advice != null)
				msgs = ((InternalEObject)advice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Smartadapters4ARTPackage.ASPECT__ADVICE, null, msgs);
			if (newAdvice != null)
				msgs = ((InternalEObject)newAdvice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Smartadapters4ARTPackage.ASPECT__ADVICE, null, msgs);
			msgs = basicSetAdvice(newAdvice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smartadapters4ARTPackage.ASPECT__ADVICE, newAdvice, newAdvice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstantiationStrategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<InstantiationStrategy>(InstantiationStrategy.class, this, Smartadapters4ARTPackage.ASPECT__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Adaptation> getAdapt() {
		if (adapt == null) {
			adapt = new EObjectContainmentEList<Adaptation>(Adaptation.class, this, Smartadapters4ARTPackage.ASPECT__ADAPT);
		}
		return adapt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Smartadapters4ARTPackage.ASPECT__POINTCUT:
				return basicSetPointcut(null, msgs);
			case Smartadapters4ARTPackage.ASPECT__ADVICE:
				return basicSetAdvice(null, msgs);
			case Smartadapters4ARTPackage.ASPECT__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case Smartadapters4ARTPackage.ASPECT__ADAPT:
				return ((InternalEList<?>)getAdapt()).basicRemove(otherEnd, msgs);
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
			case Smartadapters4ARTPackage.ASPECT__NAME:
				return getName();
			case Smartadapters4ARTPackage.ASPECT__POINTCUT:
				return getPointcut();
			case Smartadapters4ARTPackage.ASPECT__ADVICE:
				return getAdvice();
			case Smartadapters4ARTPackage.ASPECT__STRATEGIES:
				return getStrategies();
			case Smartadapters4ARTPackage.ASPECT__ADAPT:
				return getAdapt();
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
			case Smartadapters4ARTPackage.ASPECT__NAME:
				setName((String)newValue);
				return;
			case Smartadapters4ARTPackage.ASPECT__POINTCUT:
				setPointcut((PointcutModel)newValue);
				return;
			case Smartadapters4ARTPackage.ASPECT__ADVICE:
				setAdvice((AdviceModel)newValue);
				return;
			case Smartadapters4ARTPackage.ASPECT__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends InstantiationStrategy>)newValue);
				return;
			case Smartadapters4ARTPackage.ASPECT__ADAPT:
				getAdapt().clear();
				getAdapt().addAll((Collection<? extends Adaptation>)newValue);
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
			case Smartadapters4ARTPackage.ASPECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Smartadapters4ARTPackage.ASPECT__POINTCUT:
				setPointcut((PointcutModel)null);
				return;
			case Smartadapters4ARTPackage.ASPECT__ADVICE:
				setAdvice((AdviceModel)null);
				return;
			case Smartadapters4ARTPackage.ASPECT__STRATEGIES:
				getStrategies().clear();
				return;
			case Smartadapters4ARTPackage.ASPECT__ADAPT:
				getAdapt().clear();
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
			case Smartadapters4ARTPackage.ASPECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Smartadapters4ARTPackage.ASPECT__POINTCUT:
				return pointcut != null;
			case Smartadapters4ARTPackage.ASPECT__ADVICE:
				return advice != null;
			case Smartadapters4ARTPackage.ASPECT__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case Smartadapters4ARTPackage.ASPECT__ADAPT:
				return adapt != null && !adapt.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AspectImpl
