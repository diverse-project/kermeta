/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleCopyrightImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleCopyright;
import manifest.ManifestPackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Copyright</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleCopyrightImpl extends SimpleMANIFESTEntryImpl implements
		BundleCopyright {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleCopyrightImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_COPYRIGHT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_COPYRIGHT;
	}

} // BundleCopyrightImpl
