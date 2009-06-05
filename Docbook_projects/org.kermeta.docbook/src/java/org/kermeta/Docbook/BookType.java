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
 * A representation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.BookType#getBookinfo <em>Bookinfo</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookType#getPreface <em>Preface</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookType#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookType#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getBookType()
 * @model extendedMetaData="name='book_._type' kind='elementOnly'"
 * @generated
 */
public interface BookType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bookinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookinfo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookinfo</em>' containment reference.
	 * @see #setBookinfo(BookinfoType)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookType_Bookinfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bookinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	BookinfoType getBookinfo();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookType#getBookinfo <em>Bookinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookinfo</em>' containment reference.
	 * @see #getBookinfo()
	 * @generated
	 */
	void setBookinfo(BookinfoType value);

	/**
	 * Returns the value of the '<em><b>Preface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preface</em>' containment reference.
	 * @see #setPreface(PrefaceType)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookType_Preface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='preface' namespace='##targetNamespace'"
	 * @generated
	 */
	PrefaceType getPreface();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookType#getPreface <em>Preface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preface</em>' containment reference.
	 * @see #getPreface()
	 * @generated
	 */
	void setPreface(PrefaceType value);

	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ChapterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getBookType_Chapter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChapterType> getChapter();

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

} // BookType
