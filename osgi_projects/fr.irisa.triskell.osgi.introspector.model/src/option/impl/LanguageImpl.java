/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanguageImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import option.ISOCodeLanguage;
import option.Language;
import option.OptionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.LanguageImpl#getIsoCode <em>Iso Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageImpl extends NativeCodeDirectiveImpl implements Language {
	/**
	 * The default value of the '{@link #getIsoCode() <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIsoCode()
	 * @generated
	 * @ordered
	 */
	protected static final ISOCodeLanguage ISO_CODE_EDEFAULT = ISOCodeLanguage.FR;

	/**
	 * The cached value of the '{@link #getIsoCode() <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIsoCode()
	 * @generated
	 * @ordered
	 */
	protected ISOCodeLanguage isoCode = ISO_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected LanguageImpl() {
		super();
		this.setToken(Constants.BUNDLE_NATIVECODE_LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ISOCodeLanguage getIsoCode() {
		return isoCode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsoCode(ISOCodeLanguage newIsoCode) {
		ISOCodeLanguage oldIsoCode = isoCode;
		isoCode = newIsoCode == null ? ISO_CODE_EDEFAULT : newIsoCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionPackage.LANGUAGE__ISO_CODE, oldIsoCode, isoCode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionPackage.LANGUAGE__ISO_CODE:
				return getIsoCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptionPackage.LANGUAGE__ISO_CODE:
				setIsoCode((ISOCodeLanguage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OptionPackage.LANGUAGE__ISO_CODE:
				setIsoCode(ISO_CODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OptionPackage.LANGUAGE__ISO_CODE:
				return isoCode != ISO_CODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isoCode: ");
		result.append(isoCode);
		result.append(')');
		return result.toString();
	}

} // LanguageImpl
