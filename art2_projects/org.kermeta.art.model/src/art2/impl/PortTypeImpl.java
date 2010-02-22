/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.AbstractDataType;
import art2.AbstractPortImpl;
import art2.Art2Package;
import art2.PortType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.PortTypeImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link art2.impl.PortTypeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link art2.impl.PortTypeImpl#isSynchrone <em>Synchrone</em>}</li>
 *   <li>{@link art2.impl.PortTypeImpl#getBean <em>Bean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTypeImpl extends NamedElementImpl implements PortType {
	/**
	 * The cached value of the '{@link #getImpl() <em>Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected AbstractPortImpl impl;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected AbstractDataType interface_;

	/**
	 * The default value of the '{@link #isSynchrone() <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchrone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchrone() <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchrone()
	 * @generated
	 * @ordered
	 */
	protected boolean synchrone = SYNCHRONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected String bean = BEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPortImpl getImpl() {
		if (impl != null && impl.eIsProxy()) {
			InternalEObject oldImpl = (InternalEObject)impl;
			impl = (AbstractPortImpl)eResolveProxy(oldImpl);
			if (impl != oldImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.PORT_TYPE__IMPL, oldImpl, impl));
			}
		}
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPortImpl basicGetImpl() {
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpl(AbstractPortImpl newImpl) {
		AbstractPortImpl oldImpl = impl;
		impl = newImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.PORT_TYPE__IMPL, oldImpl, impl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDataType getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(AbstractDataType newInterface, NotificationChain msgs) {
		AbstractDataType oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2Package.PORT_TYPE__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(AbstractDataType newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2Package.PORT_TYPE__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2Package.PORT_TYPE__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.PORT_TYPE__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchrone() {
		return synchrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchrone(boolean newSynchrone) {
		boolean oldSynchrone = synchrone;
		synchrone = newSynchrone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.PORT_TYPE__SYNCHRONE, oldSynchrone, synchrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBean() {
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(String newBean) {
		String oldBean = bean;
		bean = newBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.PORT_TYPE__BEAN, oldBean, bean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.PORT_TYPE__INTERFACE:
				return basicSetInterface(null, msgs);
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
			case Art2Package.PORT_TYPE__IMPL:
				if (resolve) return getImpl();
				return basicGetImpl();
			case Art2Package.PORT_TYPE__INTERFACE:
				return getInterface();
			case Art2Package.PORT_TYPE__SYNCHRONE:
				return isSynchrone();
			case Art2Package.PORT_TYPE__BEAN:
				return getBean();
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
			case Art2Package.PORT_TYPE__IMPL:
				setImpl((AbstractPortImpl)newValue);
				return;
			case Art2Package.PORT_TYPE__INTERFACE:
				setInterface((AbstractDataType)newValue);
				return;
			case Art2Package.PORT_TYPE__SYNCHRONE:
				setSynchrone((Boolean)newValue);
				return;
			case Art2Package.PORT_TYPE__BEAN:
				setBean((String)newValue);
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
			case Art2Package.PORT_TYPE__IMPL:
				setImpl((AbstractPortImpl)null);
				return;
			case Art2Package.PORT_TYPE__INTERFACE:
				setInterface((AbstractDataType)null);
				return;
			case Art2Package.PORT_TYPE__SYNCHRONE:
				setSynchrone(SYNCHRONE_EDEFAULT);
				return;
			case Art2Package.PORT_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
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
			case Art2Package.PORT_TYPE__IMPL:
				return impl != null;
			case Art2Package.PORT_TYPE__INTERFACE:
				return interface_ != null;
			case Art2Package.PORT_TYPE__SYNCHRONE:
				return synchrone != SYNCHRONE_EDEFAULT;
			case Art2Package.PORT_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
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
		result.append(" (synchrone: ");
		result.append(synchrone);
		result.append(", bean: ");
		result.append(bean);
		result.append(')');
		return result.toString();
	}

} //PortTypeImpl
