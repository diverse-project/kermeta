/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleUpdateLocationImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleUpdateLocation;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Update Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BundleUpdateLocationImpl extends URLMANIFESTEntryImpl implements
		BundleUpdateLocation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleUpdateLocationImpl() {
		super();
		setEntryName(Constants.BUNDLE_UPDATELOCATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_UPDATE_LOCATION;
	}

} // BundleUpdateLocationImpl
