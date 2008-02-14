/**
 * <copyright>
 * </copyright>
 *
 * $Id: ILoadingDatas.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
 */
package org.kermeta.io.loader;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILoading Datas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.ILoadingDatas#getKermetaUnit <em>Kermeta Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.loader.LoaderPackage#getILoadingDatas()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ILoadingDatas extends EObject {

	/**
	 * Returns the value of the '<em><b>Kermeta Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Unit</em>' reference.
	 * @see #setKermetaUnit(KermetaUnit)
	 * @see org.kermeta.io.loader.LoaderPackage#getILoadingDatas_KermetaUnit()
	 * @model
	 * @generated
	 */
	KermetaUnit getKermetaUnit();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.ILoadingDatas#getKermetaUnit <em>Kermeta Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kermeta Unit</em>' reference.
	 * @see #getKermetaUnit()
	 * @generated
	 */
	void setKermetaUnit(KermetaUnit value);
} // ILoadingDatas
