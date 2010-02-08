/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.implem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pattern.art.implem.FractalComponent;
import pattern.art.implem.ImplemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fractal Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pattern.art.implem.impl.FractalComponentImpl#getControllerDesc <em>Controller Desc</em>}</li>
 *   <li>{@link pattern.art.implem.impl.FractalComponentImpl#getContentDesc <em>Content Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FractalComponentImpl extends ComponentImplementationImpl implements FractalComponent {
	/**
	 * The default value of the '{@link #getControllerDesc() <em>Controller Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerDesc() <em>Controller Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerDesc()
	 * @generated
	 * @ordered
	 */
	protected String controllerDesc = CONTROLLER_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentDesc() <em>Content Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentDesc() <em>Content Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDesc()
	 * @generated
	 * @ordered
	 */
	protected String contentDesc = CONTENT_DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FractalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplemPackage.Literals.FRACTAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllerDesc() {
		return controllerDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerDesc(String newControllerDesc) {
		String oldControllerDesc = controllerDesc;
		controllerDesc = newControllerDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC, oldControllerDesc, controllerDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentDesc() {
		return contentDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentDesc(String newContentDesc) {
		String oldContentDesc = contentDesc;
		contentDesc = newContentDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC, oldContentDesc, contentDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC:
				return getControllerDesc();
			case ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC:
				return getContentDesc();
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
			case ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC:
				setControllerDesc((String)newValue);
				return;
			case ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC:
				setContentDesc((String)newValue);
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
			case ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC:
				setControllerDesc(CONTROLLER_DESC_EDEFAULT);
				return;
			case ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC:
				setContentDesc(CONTENT_DESC_EDEFAULT);
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
			case ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC:
				return CONTROLLER_DESC_EDEFAULT == null ? controllerDesc != null : !CONTROLLER_DESC_EDEFAULT.equals(controllerDesc);
			case ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC:
				return CONTENT_DESC_EDEFAULT == null ? contentDesc != null : !CONTENT_DESC_EDEFAULT.equals(contentDesc);
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
		result.append(" (controllerDesc: ");
		result.append(controllerDesc);
		result.append(", contentDesc: ");
		result.append(contentDesc);
		result.append(')');
		return result.toString();
	}

} //FractalComponentImpl
