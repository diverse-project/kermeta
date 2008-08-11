/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.3 2008-08-11 14:19:27 edaubert Exp $
 */
package jar.impl;

import jar.JarPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends BundleEntryImpl implements jar.Class {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JarPackage.Literals.CLASS;
	}

} // ClassImpl
