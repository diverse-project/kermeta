/**
 * <copyright>
 * </copyright>
 *
 * $Id: SystemEntryImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package jar.impl;

import jar.JarPackage;
import jar.SystemEntry;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>System Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public abstract class SystemEntryImpl extends BundleEntryImpl implements
		SystemEntry {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SystemEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JarPackage.Literals.SYSTEM_ENTRY;
	}

} // SystemEntryImpl
