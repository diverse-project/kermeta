/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bookinfo Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.kermeta.Docbook.BookinfoType#getConfgroup <em>Confgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType()
 * @model extendedMetaData="name='bookinfo_._type' kind='elementOnly'"
 * @generated
 */
public interface BookinfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pubdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubdate</em>' attribute.
	 * @see #setPubdate(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Pubdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='pubdate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPubdate();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookinfoType#getPubdate <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubdate</em>' attribute.
	 * @see #getPubdate()
	 * @generated
	 */
	void setPubdate(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(AuthorType)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorType getAuthor();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookinfoType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AuthorType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookinfoType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Bibliomisc</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliomisc</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomisc</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Bibliomisc()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomisc' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<String> getBibliomisc();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<String> getDate();

	/**
	 * Returns the value of the '<em><b>Keywordset</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.KeywordsetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywordset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywordset</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Keywordset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywordset' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<KeywordsetType> getKeywordset();

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Subtitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<String> getSubtitle();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(AbstractType)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Abstract()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractType getAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookinfoType#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(PublisherType)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Publisher()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookinfoType#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(PublisherType value);

	/**
	 * Returns the value of the '<em><b>Confgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confgroup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confgroup</em>' containment reference.
	 * @see #setConfgroup(ConfgroupType)
	 * @see org.kermeta.Docbook.DocbookPackage#getBookinfoType_Confgroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='confgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfgroupType getConfgroup();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.BookinfoType#getConfgroup <em>Confgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confgroup</em>' containment reference.
	 * @see #getConfgroup()
	 * @generated
	 */
	void setConfgroup(ConfgroupType value);

} // BookinfoType
