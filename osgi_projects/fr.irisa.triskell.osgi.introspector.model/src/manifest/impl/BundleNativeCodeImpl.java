/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleNativeCodeImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import jar.File;

import java.util.Collection;

import manifest.BundleNativeCode;
import manifest.ManifestPackage;
import option.NativeCodeDirective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Native Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.BundleNativeCodeImpl#isOptional <em>Optional</em>}</li>
 * <li>{@link manifest.impl.BundleNativeCodeImpl#getDirectives <em>Directives</em>}</li>
 * <li>{@link manifest.impl.BundleNativeCodeImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BundleNativeCodeImpl extends MANIFESTEntryImpl implements
		BundleNativeCode {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<NativeCodeDirective> directives;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleNativeCodeImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_NATIVECODE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_NATIVE_CODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<NativeCodeDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<NativeCodeDirective>(
					NativeCodeDirective.class, this,
					ManifestPackage.BUNDLE_NATIVE_CODE__DIRECTIVES);
		}
		return directives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<File> getFile() {
		if (file == null) {
			file = new EObjectResolvingEList<File>(File.class, this,
					ManifestPackage.BUNDLE_NATIVE_CODE__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.BUNDLE_NATIVE_CODE__OPTIONAL, oldOptional,
					optional));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ManifestPackage.BUNDLE_NATIVE_CODE__DIRECTIVES:
			return ((InternalEList<?>) getDirectives()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.BUNDLE_NATIVE_CODE__OPTIONAL:
			return isOptional() ? Boolean.TRUE : Boolean.FALSE;
		case ManifestPackage.BUNDLE_NATIVE_CODE__DIRECTIVES:
			return getDirectives();
		case ManifestPackage.BUNDLE_NATIVE_CODE__FILE:
			return getFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ManifestPackage.BUNDLE_NATIVE_CODE__OPTIONAL:
			setOptional(((Boolean) newValue).booleanValue());
			return;
		case ManifestPackage.BUNDLE_NATIVE_CODE__DIRECTIVES:
			getDirectives().clear();
			getDirectives().addAll(
					(Collection<? extends NativeCodeDirective>) newValue);
			return;
		case ManifestPackage.BUNDLE_NATIVE_CODE__FILE:
			getFile().clear();
			getFile().addAll((Collection<? extends File>) newValue);
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
		case ManifestPackage.BUNDLE_NATIVE_CODE__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
			return;
		case ManifestPackage.BUNDLE_NATIVE_CODE__DIRECTIVES:
			getDirectives().clear();
			return;
		case ManifestPackage.BUNDLE_NATIVE_CODE__FILE:
			getFile().clear();
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
		case ManifestPackage.BUNDLE_NATIVE_CODE__OPTIONAL:
			return optional != OPTIONAL_EDEFAULT;
		case ManifestPackage.BUNDLE_NATIVE_CODE__DIRECTIVES:
			return directives != null && !directives.isEmpty();
		case ManifestPackage.BUNDLE_NATIVE_CODE__FILE:
			return file != null && !file.isEmpty();
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
		result.append(" (optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

	public void addDirective(NativeCodeDirective directive) {
		getDirectives().add(directive);
	}

	public void addFile(File file) {
		getFile().add(file);

	}
} // BundleNativeCodeImpl
