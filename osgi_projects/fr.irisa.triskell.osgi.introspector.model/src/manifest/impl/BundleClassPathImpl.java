/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPathImpl.java,v 1.5 2008-08-22 12:43:33 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.BundleClassPath;
import manifest.ClassPath;
import manifest.ManifestPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Class Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.BundleClassPathImpl#getClassPaths <em>Class Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleClassPathImpl extends MANIFESTEntryImpl implements
		BundleClassPath {
	/**
	 * The cached value of the '{@link #getClassPaths() <em>Class Paths</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClassPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassPath> classPaths;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleClassPathImpl() {
		super();
		setEntryName(Constants.BUNDLE_CLASSPATH);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_CLASS_PATH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassPath> getClassPaths() {
		if (classPaths == null) {
			classPaths = new EObjectContainmentEList<ClassPath>(ClassPath.class, this, ManifestPackage.BUNDLE_CLASS_PATH__CLASS_PATHS);
		}
		return classPaths;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.BUNDLE_CLASS_PATH__CLASS_PATHS:
				return ((InternalEList<?>)getClassPaths()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.BUNDLE_CLASS_PATH__CLASS_PATHS:
				return getClassPaths();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManifestPackage.BUNDLE_CLASS_PATH__CLASS_PATHS:
				getClassPaths().clear();
				getClassPaths().addAll((Collection<? extends ClassPath>)newValue);
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
			case ManifestPackage.BUNDLE_CLASS_PATH__CLASS_PATHS:
				getClassPaths().clear();
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
			case ManifestPackage.BUNDLE_CLASS_PATH__CLASS_PATHS:
				return classPaths != null && !classPaths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addClassPath(ClassPath classPath) {
		if (classPath != null && classPath.getReference() != null) {
			boolean exist = false;
			for (ClassPath tmp : getClassPaths()) {
				if (tmp.getReference().equals(classPath.getReference())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getClassPaths().add(classPath);
			}
		}
	}

} // BundleClassPathImpl
