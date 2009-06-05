/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.EntryType#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getMorerows <em>Morerows</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getNameend <em>Nameend</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getNamest <em>Namest</em>}</li>
 *   <li>{@link org.kermeta.Docbook.EntryType#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getEntryType()
 * @model extendedMetaData="name='entry_._type' kind='elementOnly'"
 * @generated
 */
public interface EntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ProgramlistingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programlisting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Programlisting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProgramlistingType> getProgramlisting();

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediaobject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference.
	 * @see #setMediaobject(MediaobjectType)
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Mediaobject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace'"
	 * @generated
	 */
	MediaobjectType getMediaobject();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.EntryType#getMediaobject <em>Mediaobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediaobject</em>' containment reference.
	 * @see #getMediaobject()
	 * @generated
	 */
	void setMediaobject(MediaobjectType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Para()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParaType> getPara();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Align()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='align' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.EntryType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

	/**
	 * Returns the value of the '<em><b>Morerows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Morerows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morerows</em>' attribute.
	 * @see #setMorerows(BigInteger)
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Morerows()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='morerows' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMorerows();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.EntryType#getMorerows <em>Morerows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morerows</em>' attribute.
	 * @see #getMorerows()
	 * @generated
	 */
	void setMorerows(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Nameend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nameend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameend</em>' attribute.
	 * @see #setNameend(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Nameend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nameend' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameend();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.EntryType#getNameend <em>Nameend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameend</em>' attribute.
	 * @see #getNameend()
	 * @generated
	 */
	void setNameend(String value);

	/**
	 * Returns the value of the '<em><b>Namest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namest</em>' attribute.
	 * @see #setNamest(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Namest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='namest' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNamest();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.EntryType#getNamest <em>Namest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namest</em>' attribute.
	 * @see #getNamest()
	 * @generated
	 */
	void setNamest(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see #setValign(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getEntryType_Valign()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='valign' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValign();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.EntryType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see #getValign()
	 * @generated
	 */
	void setValign(String value);

} // EntryType
