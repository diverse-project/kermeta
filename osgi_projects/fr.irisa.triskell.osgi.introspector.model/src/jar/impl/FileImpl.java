/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileImpl.java,v 1.3 2008-08-11 14:19:27 edaubert Exp $
 */
package jar.impl;

import jar.File;
import jar.JarPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FileImpl extends SystemEntryImpl implements File {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JarPackage.Literals.FILE;
	}

} // FileImpl
