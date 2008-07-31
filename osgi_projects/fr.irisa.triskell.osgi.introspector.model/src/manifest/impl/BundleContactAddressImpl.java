/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleContactAddressImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleContactAddress;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Contact Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleContactAddressImpl extends SimpleMANIFESTEntryImpl implements
		BundleContactAddress {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleContactAddressImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_CONTACTADDRESS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_CONTACT_ADDRESS;
	}

} // BundleContactAddressImpl
