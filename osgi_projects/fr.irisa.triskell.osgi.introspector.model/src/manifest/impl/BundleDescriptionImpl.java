/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleDescriptionImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleDescription;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleDescriptionImpl extends SimpleMANIFESTEntryImpl implements
		BundleDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleDescriptionImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_DESCRIPTION;
	}

} // BundleDescriptionImpl
