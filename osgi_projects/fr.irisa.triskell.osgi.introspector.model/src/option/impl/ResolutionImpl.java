/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResolutionImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package option.impl;

import option.OptionPackage;
import option.Resolution;
import option.ResolutionEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link option.impl.ResolutionImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResolutionImpl extends ImportPackageDirectiveImpl implements
		Resolution {
	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final ResolutionEnum RESOLUTION_EDEFAULT = ResolutionEnum.MANDATORY;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected ResolutionEnum resolution = RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ResolutionImpl() {
		super();
		this.setToken(Constants.RESOLUTION_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolutionEnum getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolution(ResolutionEnum newResolution) {
		ResolutionEnum oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT
				: newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OptionPackage.RESOLUTION__RESOLUTION, oldResolution,
					resolution));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptionPackage.RESOLUTION__RESOLUTION:
			return getResolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OptionPackage.RESOLUTION__RESOLUTION:
			setResolution((ResolutionEnum) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OptionPackage.RESOLUTION__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OptionPackage.RESOLUTION__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} // ResolutionImpl
