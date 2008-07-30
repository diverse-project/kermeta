/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleDocURLImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleDocURL;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Doc URL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BundleDocURLImpl extends URLMANIFESTEntryImpl implements
		BundleDocURL {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleDocURLImpl() {
		super();
		setEntryName(Constants.BUNDLE_DOCURL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_DOC_URL;
	}

} // BundleDocURLImpl
