/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageEntry.java,v 1.3 2008-04-28 11:50:16 ftanguy Exp $
 */
package org.kermeta.io;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.PackageEntry#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.kermeta.io.PackageEntry#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getPackageEntry()
 * @model
 * @generated
 */
public interface PackageEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.kermeta.io.IoPackage#getPackageEntry_QualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.kermeta.io.PackageEntry#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(fr.irisa.triskell.kermeta.language.structure.Package)
	 * @see org.kermeta.io.IoPackage#getPackageEntry_Package()
	 * @model required="true"
	 * @generated
	 */
	fr.irisa.triskell.kermeta.language.structure.Package getPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.io.PackageEntry#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(fr.irisa.triskell.kermeta.language.structure.Package value);

} // PackageEntry