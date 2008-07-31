/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleVendorImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleVendor;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Vendor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleVendorImpl extends SimpleMANIFESTEntryImpl implements
		BundleVendor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleVendorImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_VENDOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_VENDOR;
	}

} // BundleVendorImpl
