/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.PrefaceType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.PrefaceType#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.PrefaceType#getImportant <em>Important</em>}</li>
 *   <li>{@link org.kermeta.Docbook.PrefaceType#getTip <em>Tip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getPrefaceType()
 * @model extendedMetaData="name='preface_._type' kind='elementOnly'"
 * @generated
 */
public interface PrefaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.kermeta.Docbook.DocbookPackage#getPrefaceType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PrefaceType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getPrefaceType_Para()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParaType> getPara();

	/**
	 * Returns the value of the '<em><b>Important</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Important</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important</em>' containment reference.
	 * @see #setImportant(ImportantType)
	 * @see org.kermeta.Docbook.DocbookPackage#getPrefaceType_Important()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportantType getImportant();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PrefaceType#getImportant <em>Important</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Important</em>' containment reference.
	 * @see #getImportant()
	 * @generated
	 */
	void setImportant(ImportantType value);

	/**
	 * Returns the value of the '<em><b>Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip</em>' containment reference.
	 * @see #setTip(TipType)
	 * @see org.kermeta.Docbook.DocbookPackage#getPrefaceType_Tip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace'"
	 * @generated
	 */
	TipType getTip();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PrefaceType#getTip <em>Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tip</em>' containment reference.
	 * @see #getTip()
	 * @generated
	 */
	void setTip(TipType value);

} // PrefaceType
