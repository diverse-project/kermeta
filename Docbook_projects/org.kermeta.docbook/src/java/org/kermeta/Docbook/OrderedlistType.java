/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orderedlist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.OrderedlistType#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.kermeta.Docbook.OrderedlistType#getInheritnum <em>Inheritnum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getOrderedlistType()
 * @model extendedMetaData="name='orderedlist_._type' kind='empty'"
 * @generated
 */
public interface OrderedlistType extends EObject {
	/**
	 * Returns the value of the '<em><b>Continuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation</em>' attribute.
	 * @see #setContinuation(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getOrderedlistType_Continuation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='continuation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContinuation();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.OrderedlistType#getContinuation <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation</em>' attribute.
	 * @see #getContinuation()
	 * @generated
	 */
	void setContinuation(String value);

	/**
	 * Returns the value of the '<em><b>Inheritnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritnum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritnum</em>' attribute.
	 * @see #setInheritnum(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getOrderedlistType_Inheritnum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='inheritnum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInheritnum();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.OrderedlistType#getInheritnum <em>Inheritnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritnum</em>' attribute.
	 * @see #getInheritnum()
	 * @generated
	 */
	void setInheritnum(String value);

} // OrderedlistType
