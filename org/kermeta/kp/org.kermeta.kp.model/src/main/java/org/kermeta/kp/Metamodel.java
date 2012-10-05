/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.Metamodel#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.kermeta.kp.Metamodel#getImportedFiles <em>Imported Files</em>}</li>
 *   <li>{@link org.kermeta.kp.Metamodel#getMetamodelName <em>Metamodel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject
{

	/**
   * Returns the value of the '<em><b>Imported Files</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.ImportFile}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Files</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getMetamodel_ImportedFiles()
   * @model containment="true"
   * @generated
   */
	EList<ImportFile> getImportedFiles();

	/**
   * Returns the value of the '<em><b>Metamodel Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Name</em>' attribute.
   * @see #setMetamodelName(String)
   * @see org.kermeta.kp.KpPackage#getMetamodel_MetamodelName()
   * @model required="true"
   * @generated
   */
	String getMetamodelName();

	/**
   * Sets the value of the '{@link org.kermeta.kp.Metamodel#getMetamodelName <em>Metamodel Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel Name</em>' attribute.
   * @see #getMetamodelName()
   * @generated
   */
	void setMetamodelName(String value);

	/**
   * Returns the value of the '<em><b>Extends</b></em>' reference list.
   * The list contents are of type {@link org.kermeta.kp.Metamodel}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference list.
   * @see org.kermeta.kp.KpPackage#getMetamodel_Extends()
   * @model
   * @generated
   */
	EList<Metamodel> getExtends();
} // Metamodel
