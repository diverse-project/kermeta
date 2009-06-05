/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getBook <em>Book</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getBookinfo <em>Bookinfo</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getColspec <em>Colspec</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getConfnum <em>Confnum</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getConfsponsor <em>Confsponsor</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getConftitle <em>Conftitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getImagedata <em>Imagedata</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getImageobject <em>Imageobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getImportant <em>Important</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getLink <em>Link</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getListitem <em>Listitem</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getNote <em>Note</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getOtheraddr <em>Otheraddr</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getPreface <em>Preface</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getRow <em>Row</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getSection <em>Section</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getState <em>State</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getTgroup <em>Tgroup</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getThead <em>Thead</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getTip <em>Tip</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getUlink <em>Ulink</em>}</li>
 *   <li>{@link org.kermeta.Docbook.DocumentRoot#getWarning <em>Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Abstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractType getAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Author()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorType getAuthor();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AuthorType value);

	/**
	 * Returns the value of the '<em><b>Bibliomisc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliomisc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomisc</em>' attribute.
	 * @see #setBibliomisc(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Bibliomisc()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomisc' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBibliomisc();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getBibliomisc <em>Bibliomisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliomisc</em>' attribute.
	 * @see #getBibliomisc()
	 * @generated
	 */
	void setBibliomisc(String value);

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' containment reference.
	 * @see #setBook(BookType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Book()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
	 * @generated
	 */
	BookType getBook();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getBook <em>Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' containment reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(BookType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Bookinfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bookinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	BookinfoType getBookinfo();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getBookinfo <em>Bookinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookinfo</em>' containment reference.
	 * @see #getBookinfo()
	 * @generated
	 */
	void setBookinfo(BookinfoType value);

	/**
	 * Returns the value of the '<em><b>Caution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution</em>' attribute.
	 * @see #setCaution(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Caution()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaution();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getCaution <em>Caution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caution</em>' attribute.
	 * @see #getCaution()
	 * @generated
	 */
	void setCaution(String value);

	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' containment reference.
	 * @see #setChapter(ChapterType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Chapter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace'"
	 * @generated
	 */
	ChapterType getChapter();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getChapter <em>Chapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapter</em>' containment reference.
	 * @see #getChapter()
	 * @generated
	 */
	void setChapter(ChapterType value);

	/**
	 * Returns the value of the '<em><b>Colspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspec</em>' containment reference.
	 * @see #setColspec(ColspecType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Colspec()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colspec' namespace='##targetNamespace'"
	 * @generated
	 */
	ColspecType getColspec();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getColspec <em>Colspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspec</em>' containment reference.
	 * @see #getColspec()
	 * @generated
	 */
	void setColspec(ColspecType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Confgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfgroupType getConfgroup();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getConfgroup <em>Confgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confgroup</em>' containment reference.
	 * @see #getConfgroup()
	 * @generated
	 */
	void setConfgroup(ConfgroupType value);

	/**
	 * Returns the value of the '<em><b>Confnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confnum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confnum</em>' attribute.
	 * @see #setConfnum(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Confnum()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confnum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConfnum();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getConfnum <em>Confnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confnum</em>' attribute.
	 * @see #getConfnum()
	 * @generated
	 */
	void setConfnum(String value);

	/**
	 * Returns the value of the '<em><b>Confsponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confsponsor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confsponsor</em>' attribute.
	 * @see #setConfsponsor(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Confsponsor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confsponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConfsponsor();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getConfsponsor <em>Confsponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confsponsor</em>' attribute.
	 * @see #getConfsponsor()
	 * @generated
	 */
	void setConfsponsor(String value);

	/**
	 * Returns the value of the '<em><b>Conftitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conftitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conftitle</em>' attribute.
	 * @see #setConftitle(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Conftitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conftitle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConftitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getConftitle <em>Conftitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conftitle</em>' attribute.
	 * @see #getConftitle()
	 * @generated
	 */
	void setConftitle(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emphasis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference.
	 * @see #setEmphasis(EmphasisType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Emphasis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emphasis' namespace='##targetNamespace'"
	 * @generated
	 */
	EmphasisType getEmphasis();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getEmphasis <em>Emphasis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emphasis</em>' containment reference.
	 * @see #getEmphasis()
	 * @generated
	 */
	void setEmphasis(EmphasisType value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(EntryType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Entry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryType getEntry();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(EntryType value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(FigureType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Figure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace'"
	 * @generated
	 */
	FigureType getFigure();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(FigureType value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Firstname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Footnote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footnote</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnote</em>' containment reference.
	 * @see #setFootnote(FootnoteType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Footnote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footnote' namespace='##targetNamespace'"
	 * @generated
	 */
	FootnoteType getFootnote();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getFootnote <em>Footnote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnote</em>' containment reference.
	 * @see #getFootnote()
	 * @generated
	 */
	void setFootnote(FootnoteType value);

	/**
	 * Returns the value of the '<em><b>Imagedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagedata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagedata</em>' containment reference.
	 * @see #setImagedata(ImagedataType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Imagedata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imagedata' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagedataType getImagedata();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getImagedata <em>Imagedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagedata</em>' containment reference.
	 * @see #getImagedata()
	 * @generated
	 */
	void setImagedata(ImagedataType value);

	/**
	 * Returns the value of the '<em><b>Imageobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imageobject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageobject</em>' containment reference.
	 * @see #setImageobject(ImageobjectType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Imageobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageobject' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageobjectType getImageobject();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getImageobject <em>Imageobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageobject</em>' containment reference.
	 * @see #getImageobject()
	 * @generated
	 */
	void setImageobject(ImageobjectType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Important()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportantType getImportant();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getImportant <em>Important</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Important</em>' containment reference.
	 * @see #getImportant()
	 * @generated
	 */
	void setImportant(ImportantType value);

	/**
	 * Returns the value of the '<em><b>Informaltable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informaltable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable</em>' containment reference.
	 * @see #setInformaltable(InformaltableType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Informaltable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace'"
	 * @generated
	 */
	InformaltableType getInformaltable();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getInformaltable <em>Informaltable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informaltable</em>' containment reference.
	 * @see #getInformaltable()
	 * @generated
	 */
	void setInformaltable(InformaltableType value);

	/**
	 * Returns the value of the '<em><b>Itemizedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemizedlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist</em>' containment reference.
	 * @see #setItemizedlist(ItemizedlistType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Itemizedlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemizedlistType getItemizedlist();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getItemizedlist <em>Itemizedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemizedlist</em>' containment reference.
	 * @see #getItemizedlist()
	 * @generated
	 */
	void setItemizedlist(ItemizedlistType value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Keyword()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Keywordset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywordset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywordset</em>' containment reference.
	 * @see #setKeywordset(KeywordsetType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Keywordset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywordset' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordsetType getKeywordset();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getKeywordset <em>Keywordset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywordset</em>' containment reference.
	 * @see #getKeywordset()
	 * @generated
	 */
	void setKeywordset(KeywordsetType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Link()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Listitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listitem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitem</em>' containment reference.
	 * @see #setListitem(ListitemType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Listitem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listitem' namespace='##targetNamespace'"
	 * @generated
	 */
	ListitemType getListitem();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getListitem <em>Listitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listitem</em>' containment reference.
	 * @see #getListitem()
	 * @generated
	 */
	void setListitem(ListitemType value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(LiteralType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Literal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace'"
	 * @generated
	 */
	LiteralType getLiteral();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(LiteralType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Mediaobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace'"
	 * @generated
	 */
	MediaobjectType getMediaobject();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getMediaobject <em>Mediaobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediaobject</em>' containment reference.
	 * @see #getMediaobject()
	 * @generated
	 */
	void setMediaobject(MediaobjectType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Note()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Orderedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderedlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist</em>' containment reference.
	 * @see #setOrderedlist(OrderedlistType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Orderedlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderedlistType getOrderedlist();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getOrderedlist <em>Orderedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderedlist</em>' containment reference.
	 * @see #getOrderedlist()
	 * @generated
	 */
	void setOrderedlist(OrderedlistType value);

	/**
	 * Returns the value of the '<em><b>Otheraddr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otheraddr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otheraddr</em>' containment reference.
	 * @see #setOtheraddr(OtheraddrType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Otheraddr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otheraddr' namespace='##targetNamespace'"
	 * @generated
	 */
	OtheraddrType getOtheraddr();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getOtheraddr <em>Otheraddr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otheraddr</em>' containment reference.
	 * @see #getOtheraddr()
	 * @generated
	 */
	void setOtheraddr(OtheraddrType value);

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference.
	 * @see #setPara(ParaType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Para()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	ParaType getPara();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getPara <em>Para</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Para</em>' containment reference.
	 * @see #getPara()
	 * @generated
	 */
	void setPara(ParaType value);

	/**
	 * Returns the value of the '<em><b>Phrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phrase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase</em>' containment reference.
	 * @see #setPhrase(PhraseType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Phrase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phrase' namespace='##targetNamespace'"
	 * @generated
	 */
	PhraseType getPhrase();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getPhrase <em>Phrase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phrase</em>' containment reference.
	 * @see #getPhrase()
	 * @generated
	 */
	void setPhrase(PhraseType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Preface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preface' namespace='##targetNamespace'"
	 * @generated
	 */
	PrefaceType getPreface();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getPreface <em>Preface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preface</em>' containment reference.
	 * @see #getPreface()
	 * @generated
	 */
	void setPreface(PrefaceType value);

	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programlisting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference.
	 * @see #setProgramlisting(ProgramlistingType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Programlisting()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramlistingType getProgramlisting();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getProgramlisting <em>Programlisting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programlisting</em>' containment reference.
	 * @see #getProgramlisting()
	 * @generated
	 */
	void setProgramlisting(ProgramlistingType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Pubdate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pubdate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPubdate();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getPubdate <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubdate</em>' attribute.
	 * @see #getPubdate()
	 * @generated
	 */
	void setPubdate(String value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(PublisherType value);

	/**
	 * Returns the value of the '<em><b>Publishername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishername</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishername</em>' attribute.
	 * @see #setPublishername(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Publishername()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishername' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublishername();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getPublishername <em>Publishername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishername</em>' attribute.
	 * @see #getPublishername()
	 * @generated
	 */
	void setPublishername(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference.
	 * @see #setRow(RowType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Row()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	RowType getRow();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getRow <em>Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' containment reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(RowType value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference.
	 * @see #setSection(SectionType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Section()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	SectionType getSection();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getSection <em>Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' containment reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(SectionType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_State()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Subtitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superscript</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscript</em>' attribute.
	 * @see #setSuperscript(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Superscript()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='superscript' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSuperscript();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getSuperscript <em>Superscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superscript</em>' attribute.
	 * @see #getSuperscript()
	 * @generated
	 */
	void setSuperscript(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Table()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference.
	 * @see #setTbody(TbodyType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Tbody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	TbodyType getTbody();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getTbody <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbody</em>' containment reference.
	 * @see #getTbody()
	 * @generated
	 */
	void setTbody(TbodyType value);

	/**
	 * Returns the value of the '<em><b>Tgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgroup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgroup</em>' containment reference.
	 * @see #setTgroup(TgroupType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Tgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	TgroupType getTgroup();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getTgroup <em>Tgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgroup</em>' containment reference.
	 * @see #getTgroup()
	 * @generated
	 */
	void setTgroup(TgroupType value);

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Thead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Tip()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace'"
	 * @generated
	 */
	TipType getTip();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getTip <em>Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tip</em>' containment reference.
	 * @see #getTip()
	 * @generated
	 */
	void setTip(TipType value);

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
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Ulink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ulink</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ulink</em>' containment reference.
	 * @see #setUlink(UlinkType)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Ulink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ulink' namespace='##targetNamespace'"
	 * @generated
	 */
	UlinkType getUlink();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getUlink <em>Ulink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ulink</em>' containment reference.
	 * @see #getUlink()
	 * @generated
	 */
	void setUlink(UlinkType value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' attribute.
	 * @see #setWarning(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getDocumentRoot_Warning()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWarning();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.DocumentRoot#getWarning <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' attribute.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(String value);

} // DocumentRoot
