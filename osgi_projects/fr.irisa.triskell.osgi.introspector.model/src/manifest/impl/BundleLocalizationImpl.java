/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleLocalizationImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleLocalization;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Localization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleLocalizationImpl extends SimpleMANIFESTEntryImpl implements
		BundleLocalization {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleLocalizationImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_LOCALIZATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_LOCALIZATION;
	}

} // BundleLocalizationImpl
