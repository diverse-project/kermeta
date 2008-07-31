/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.BadVersionValue;
import manifest.ManifestPackage;
import manifest.Version;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.VersionImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link manifest.impl.VersionImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link manifest.impl.VersionImpl#getMicro <em>Micro</em>}</li>
 *   <li>{@link manifest.impl.VersionImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends EObjectImpl implements Version {
	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected int major = MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected int minor = MINOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMicro() <em>Micro</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMicro()
	 * @generated
	 * @ordered
	 */
	protected static final int MICRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMicro() <em>Micro</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMicro()
	 * @generated
	 * @ordered
	 */
	protected int micro = MICRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected VersionImpl() {
		super();
		setMajor(0);
		setMinor(0);
		setMicro(0);
		setQualifier("");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(int newMajor) {
		int oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinor(int newMinor) {
		int oldMinor = minor;
		minor = newMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MINOR, oldMinor, minor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMicro() {
		return micro;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicro(int newMicro) {
		int oldMicro = micro;
		micro = newMicro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MICRO, oldMicro, micro));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.VERSION__MAJOR:
				return new Integer(getMajor());
			case ManifestPackage.VERSION__MINOR:
				return new Integer(getMinor());
			case ManifestPackage.VERSION__MICRO:
				return new Integer(getMicro());
			case ManifestPackage.VERSION__QUALIFIER:
				return getQualifier();
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
			case ManifestPackage.VERSION__MAJOR:
				setMajor(((Integer)newValue).intValue());
				return;
			case ManifestPackage.VERSION__MINOR:
				setMinor(((Integer)newValue).intValue());
				return;
			case ManifestPackage.VERSION__MICRO:
				setMicro(((Integer)newValue).intValue());
				return;
			case ManifestPackage.VERSION__QUALIFIER:
				setQualifier((String)newValue);
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
			case ManifestPackage.VERSION__MAJOR:
				setMajor(MAJOR_EDEFAULT);
				return;
			case ManifestPackage.VERSION__MINOR:
				setMinor(MINOR_EDEFAULT);
				return;
			case ManifestPackage.VERSION__MICRO:
				setMicro(MICRO_EDEFAULT);
				return;
			case ManifestPackage.VERSION__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
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
			case ManifestPackage.VERSION__MAJOR:
				return major != MAJOR_EDEFAULT;
			case ManifestPackage.VERSION__MINOR:
				return minor != MINOR_EDEFAULT;
			case ManifestPackage.VERSION__MICRO:
				return micro != MICRO_EDEFAULT;
			case ManifestPackage.VERSION__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
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
		result.append(" (major: ");
		result.append(major);
		result.append(", minor: ");
		result.append(minor);
		result.append(", micro: ");
		result.append(micro);
		result.append(", qualifier: ");
		result.append(qualifier);
		result.append(')');
		return result.toString();
	}

	public boolean greaterThan(Version version, boolean notEquals) {
		if (version != null) {
			if (notEquals) {
				if (this.getMajor() > version.getMajor()) {
					return true;
				} else if (this.getMajor() == version.getMajor()) {
					if (this.getMinor() > version.getMinor()) {
						return true;
					} else if (this.getMinor() == version.getMinor()) {
						if (this.getMicro() > version.getMicro()) {
							return true;
						} else if (this.getQualifier().compareTo(
								version.getQualifier()) > 0) {
							return true;
						}
					}
				}
				return false;
			} else {
				if (this.getMajor() > version.getMajor()) {
					return true;
				} else if (this.getMajor() == version.getMajor()) {
					if (this.getMinor() > version.getMinor()) {
						return true;
					} else if (this.getMinor() == version.getMinor()) {
						if (this.getMicro() > version.getMicro()) {
							return true;
						} else if (this.getQualifier().compareTo(
								version.getQualifier()) >= 0) {
							return true;
						}
					}
				}
				return false;
			}
		} else {
			return true;
		}
	}

	public boolean lesserThan(Version version, boolean notEquals) {
		if (version != null) {
			if (notEquals) {
				if (this.getMajor() < version.getMajor()) {
					return true;
				} else if (this.getMajor() == version.getMajor()) {
					if (this.getMinor() < version.getMinor()) {
						return true;
					} else if (this.getMinor() == version.getMinor()) {
						if (this.getMicro() < version.getMicro()) {
							return true;
						} else if (this.getQualifier().compareTo(
								version.getQualifier()) < 0) {
							return true;
						}
					}
				}
				return false;
			} else {
				if (this.getMajor() < version.getMajor()) {
					return true;
				} else if (this.getMajor() == version.getMajor()) {
					if (this.getMinor() < version.getMinor()) {
						return true;
					} else if (this.getMinor() == version.getMinor()) {
						if (this.getMicro() < version.getMicro()) {
							return true;
						} else if (this.getQualifier().compareTo(
								version.getQualifier()) <= 0) {
							return true;
						}
					}
				}
				return false;
			}
		} else {
			return true;
		}
	}

	public void setVersionValue(String value) throws BadVersionValue {
		String[] versionNumber = value.split("\\.");
		if (versionNumber.length <= 4) {

			try {
				for (int i = 0; i < versionNumber.length; i++) {
					int validVersion;
					switch (i) {
					case 0:
						validVersion = Integer.parseInt(versionNumber[i]);
						this.setMajor(validVersion);
						break;
					case 1:
						validVersion = Integer.parseInt(versionNumber[i]);
						this.setMinor(validVersion);
						break;
					case 2:
						validVersion = Integer.parseInt(versionNumber[i]);
						this.setMicro(validVersion);
						break;
					case 3:
						this.setQualifier(versionNumber[i]);
						break;
					}
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				throw new BadVersionValue(
						value
								+ " is not a valid String value for a Version representation");
			}
		}
	}

	public boolean equals(Version version) {
		return this.getMajor() == version.getMajor()
				&& this.getMinor() == version.getMinor()
				&& this.getMicro() == version.getMicro()
				&& this.getQualifier().equals(version.getQualifier());
	}

} // VersionImpl
