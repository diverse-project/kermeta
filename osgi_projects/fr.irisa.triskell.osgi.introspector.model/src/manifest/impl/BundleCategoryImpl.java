/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleCategoryImpl.java,v 1.3 2008-08-22 12:43:32 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleCategory;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleCategoryImpl extends SimpleManifestEntryManyValuesImpl
		implements BundleCategory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleCategoryImpl() {
		super();
		setEntryName(Constants.BUNDLE_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_CATEGORY;
	}

} // BundleCategoryImpl
