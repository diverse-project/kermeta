/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.AbstractType;
import org.kermeta.Docbook.AddressType;
import org.kermeta.Docbook.AuthorType;
import org.kermeta.Docbook.BookType;
import org.kermeta.Docbook.BookinfoType;
import org.kermeta.Docbook.ChapterType;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.ConfgroupType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.DocumentRoot;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.FigureType;
import org.kermeta.Docbook.FootnoteType;
import org.kermeta.Docbook.ImagedataType;
import org.kermeta.Docbook.ImageobjectType;
import org.kermeta.Docbook.ImportantType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.ItemizedlistType;
import org.kermeta.Docbook.KeywordsetType;
import org.kermeta.Docbook.LinkType;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.LiteralType;
import org.kermeta.Docbook.MediaobjectType;
import org.kermeta.Docbook.NoteType;
import org.kermeta.Docbook.OrderedlistType;
import org.kermeta.Docbook.OtheraddrType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.PhraseType;
import org.kermeta.Docbook.PrefaceType;
import org.kermeta.Docbook.ProgramlistingType;
import org.kermeta.Docbook.PublisherType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TableType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;
import org.kermeta.Docbook.TipType;
import org.kermeta.Docbook.TitleType;
import org.kermeta.Docbook.UlinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getBook <em>Book</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getBookinfo <em>Bookinfo</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getColspec <em>Colspec</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getConfnum <em>Confnum</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getConfsponsor <em>Confsponsor</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getConftitle <em>Conftitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getImagedata <em>Imagedata</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getImageobject <em>Imageobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getListitem <em>Listitem</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getOtheraddr <em>Otheraddr</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getPreface <em>Preface</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getTgroup <em>Tgroup</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getUlink <em>Ulink</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.DocumentRootImpl#getWarning <em>Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getBibliomisc() <em>Bibliomisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliomisc()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOMISC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCaution() <em>Caution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaution()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConfnum() <em>Confnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfnum()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFNUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConfsponsor() <em>Confsponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfsponsor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFSPONSOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConftitle() <em>Conftitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConftitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFTITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBDATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublishername() <em>Publishername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishername()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHERNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSuperscript() <em>Superscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperscript()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPERSCRIPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected static final String WARNING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getAbstract() {
		return (AbstractType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractType newAbstract) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getAddress() {
		return (AddressType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressType newAddress) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorType getAuthor() {
		return (AuthorType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AuthorType newAuthor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__AUTHOR, newAuthor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(AuthorType newAuthor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBibliomisc() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__BIBLIOMISC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliomisc(String newBibliomisc) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__BIBLIOMISC, newBibliomisc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookType getBook() {
		return (BookType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__BOOK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBook(BookType newBook, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__BOOK, newBook, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBook(BookType newBook) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__BOOK, newBook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookinfoType getBookinfo() {
		return (BookinfoType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__BOOKINFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookinfo(BookinfoType newBookinfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__BOOKINFO, newBookinfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookinfo(BookinfoType newBookinfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__BOOKINFO, newBookinfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaution() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__CAUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaution(String newCaution) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__CAUTION, newCaution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChapterType getChapter() {
		return (ChapterType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__CHAPTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChapter(ChapterType newChapter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__CHAPTER, newChapter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChapter(ChapterType newChapter) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__CHAPTER, newChapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColspecType getColspec() {
		return (ColspecType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__COLSPEC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColspec(ColspecType newColspec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__COLSPEC, newColspec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspec(ColspecType newColspec) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__COLSPEC, newColspec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfgroupType getConfgroup() {
		return (ConfgroupType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__CONFGROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfgroup(ConfgroupType newConfgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__CONFGROUP, newConfgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfgroup(ConfgroupType newConfgroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__CONFGROUP, newConfgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfnum() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__CONFNUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfnum(String newConfnum) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__CONFNUM, newConfnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfsponsor() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__CONFSPONSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfsponsor(String newConfsponsor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__CONFSPONSOR, newConfsponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConftitle() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__CONFTITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConftitle(String newConftitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__CONFTITLE, newConftitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisType getEmphasis() {
		return (EmphasisType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__EMPHASIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmphasis(EmphasisType newEmphasis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__EMPHASIS, newEmphasis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmphasis(EmphasisType newEmphasis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__EMPHASIS, newEmphasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType getEntry() {
		return (EntryType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(EntryType newEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ENTRY, newEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(EntryType newEntry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ENTRY, newEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureType getFigure() {
		return (FigureType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__FIGURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigure(FigureType newFigure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__FIGURE, newFigure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigure(FigureType newFigure) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__FIGURE, newFigure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__FIRSTNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__FIRSTNAME, newFirstname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnoteType getFootnote() {
		return (FootnoteType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__FOOTNOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootnote(FootnoteType newFootnote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__FOOTNOTE, newFootnote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootnote(FootnoteType newFootnote) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__FOOTNOTE, newFootnote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagedataType getImagedata() {
		return (ImagedataType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__IMAGEDATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagedata(ImagedataType newImagedata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__IMAGEDATA, newImagedata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagedata(ImagedataType newImagedata) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__IMAGEDATA, newImagedata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageobjectType getImageobject() {
		return (ImageobjectType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__IMAGEOBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageobject(ImageobjectType newImageobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__IMAGEOBJECT, newImageobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageobject(ImageobjectType newImageobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__IMAGEOBJECT, newImageobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportantType getImportant() {
		return (ImportantType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__IMPORTANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportant(ImportantType newImportant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__IMPORTANT, newImportant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportant(ImportantType newImportant) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__IMPORTANT, newImportant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformaltableType getInformaltable() {
		return (InformaltableType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__INFORMALTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformaltable(InformaltableType newInformaltable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__INFORMALTABLE, newInformaltable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformaltable(InformaltableType newInformaltable) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__INFORMALTABLE, newInformaltable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemizedlistType getItemizedlist() {
		return (ItemizedlistType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ITEMIZEDLIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemizedlist(ItemizedlistType newItemizedlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ITEMIZEDLIST, newItemizedlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemizedlist(ItemizedlistType newItemizedlist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ITEMIZEDLIST, newItemizedlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__KEYWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__KEYWORD, newKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsetType getKeywordset() {
		return (KeywordsetType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__KEYWORDSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordset(KeywordsetType newKeywordset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__KEYWORDSET, newKeywordset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywordset(KeywordsetType newKeywordset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__KEYWORDSET, newKeywordset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLink() {
		return (LinkType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__LINK, newLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(LinkType newLink) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListitemType getListitem() {
		return (ListitemType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__LISTITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListitem(ListitemType newListitem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__LISTITEM, newListitem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListitem(ListitemType newListitem) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__LISTITEM, newListitem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralType getLiteral() {
		return (LiteralType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__LITERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(LiteralType newLiteral, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__LITERAL, newLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(LiteralType newLiteral) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__LITERAL, newLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaobjectType getMediaobject() {
		return (MediaobjectType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__MEDIAOBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediaobject(MediaobjectType newMediaobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__MEDIAOBJECT, newMediaobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaobject(MediaobjectType newMediaobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__MEDIAOBJECT, newMediaobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType getNote() {
		return (NoteType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__NOTE, newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedlistType getOrderedlist() {
		return (OrderedlistType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ORDEREDLIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedlist(OrderedlistType newOrderedlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ORDEREDLIST, newOrderedlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedlist(OrderedlistType newOrderedlist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ORDEREDLIST, newOrderedlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtheraddrType getOtheraddr() {
		return (OtheraddrType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__OTHERADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtheraddr(OtheraddrType newOtheraddr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__OTHERADDR, newOtheraddr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtheraddr(OtheraddrType newOtheraddr) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__OTHERADDR, newOtheraddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParaType getPara() {
		return (ParaType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PARA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPara(ParaType newPara, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__PARA, newPara, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPara(ParaType newPara) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PARA, newPara);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhraseType getPhrase() {
		return (PhraseType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PHRASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhrase(PhraseType newPhrase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__PHRASE, newPhrase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhrase(PhraseType newPhrase) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PHRASE, newPhrase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefaceType getPreface() {
		return (PrefaceType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PREFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreface(PrefaceType newPreface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__PREFACE, newPreface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreface(PrefaceType newPreface) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PREFACE, newPreface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramlistingType getProgramlisting() {
		return (ProgramlistingType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PROGRAMLISTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramlisting(ProgramlistingType newProgramlisting, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__PROGRAMLISTING, newProgramlisting, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramlisting(ProgramlistingType newProgramlisting) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PROGRAMLISTING, newProgramlisting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPubdate() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PUBDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubdate(String newPubdate) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PUBDATE, newPubdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType getPublisher() {
		return (PublisherType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PUBLISHER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(PublisherType newPublisher) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishername() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__PUBLISHERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishername(String newPublishername) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__PUBLISHERNAME, newPublishername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowType getRow() {
		return (RowType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ROW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(RowType newRow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ROW, newRow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(RowType newRow) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ROW, newRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionType getSection() {
		return (SectionType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__SECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSection(SectionType newSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__SECTION, newSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(SectionType newSection) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__SECTION, newSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtitle() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__SUBTITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(String newSubtitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__SUBTITLE, newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuperscript() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__SUPERSCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperscript(String newSuperscript) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__SUPERSCRIPT, newSuperscript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType getTable() {
		return (TableType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__TABLE, newTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(TableType newTable) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__TABLE, newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TbodyType getTbody() {
		return (TbodyType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__TBODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbody(TbodyType newTbody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__TBODY, newTbody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbody(TbodyType newTbody) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__TBODY, newTbody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TgroupType getTgroup() {
		return (TgroupType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__TGROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgroup(TgroupType newTgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__TGROUP, newTgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgroup(TgroupType newTgroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__TGROUP, newTgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheadType getThead() {
		return (TheadType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__THEAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__THEAD, newThead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThead(TheadType newThead) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__THEAD, newThead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipType getTip() {
		return (TipType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__TIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTip(TipType newTip, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__TIP, newTip, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTip(TipType newTip) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__TIP, newTip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return (TitleType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UlinkType getUlink() {
		return (UlinkType)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__ULINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUlink(UlinkType newUlink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.Literals.DOCUMENT_ROOT__ULINK, newUlink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUlink(UlinkType newUlink) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__ULINK, newUlink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarning() {
		return (String)getMixed().get(DocbookPackage.Literals.DOCUMENT_ROOT__WARNING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(String newWarning) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.Literals.DOCUMENT_ROOT__WARNING, newWarning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				return basicSetBook(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BOOKINFO:
				return basicSetBookinfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				return basicSetChapter(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				return basicSetColspec(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				return basicSetConfgroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				return basicSetEmphasis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				return basicSetEntry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				return basicSetFigure(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				return basicSetFootnote(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				return basicSetImagedata(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				return basicSetImageobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				return basicSetImportant(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				return basicSetInformaltable(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				return basicSetItemizedlist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				return basicSetKeywordset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				return basicSetLink(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				return basicSetListitem(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				return basicSetLiteral(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				return basicSetMediaobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				return basicSetNote(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				return basicSetOrderedlist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				return basicSetOtheraddr(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				return basicSetPara(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				return basicSetPhrase(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				return basicSetPreface(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				return basicSetProgramlisting(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				return basicSetRow(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				return basicSetSection(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				return basicSetTable(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				return basicSetTbody(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				return basicSetTgroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				return basicSetThead(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				return basicSetTip(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ULINK:
				return basicSetUlink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				return getBook();
			case DocbookPackage.DOCUMENT_ROOT__BOOKINFO:
				return getBookinfo();
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				return getCaution();
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				return getChapter();
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				return getColspec();
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				return getConfgroup();
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				return getConfnum();
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				return getConfsponsor();
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				return getConftitle();
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				return getEntry();
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				return getFigure();
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				return getFirstname();
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				return getImagedata();
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				return getImageobject();
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				return getImportant();
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword();
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				return getLink();
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				return getListitem();
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral();
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				return getNote();
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				return getOtheraddr();
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				return getPara();
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				return getPhrase();
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				return getPreface();
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				return getPubdate();
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				return getPublishername();
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				return getRow();
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				return getSection();
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				return getState();
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				return getTable();
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				return getTbody();
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				return getTgroup();
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				return getThead();
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				return getTip();
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case DocbookPackage.DOCUMENT_ROOT__ULINK:
				return getUlink();
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				return getWarning();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((AuthorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				setBibliomisc((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				setBook((BookType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BOOKINFO:
				setBookinfo((BookinfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				setCaution((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				setChapter((ChapterType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				setColspec((ColspecType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				setConfgroup((ConfgroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				setConfnum((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				setConfsponsor((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				setConftitle((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				setDate((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				setEmphasis((EmphasisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				setEntry((EntryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				setFigure((FigureType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				setFootnote((FootnoteType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				setImagedata((ImagedataType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				setImageobject((ImageobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				setImportant((ImportantType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				setInformaltable((InformaltableType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				setItemizedlist((ItemizedlistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				setKeywordset((KeywordsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				setListitem((ListitemType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				setMediaobject((MediaobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				setOrderedlist((OrderedlistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				setOtheraddr((OtheraddrType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				setPara((ParaType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				setPhrase((PhraseType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				setPreface((PrefaceType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				setProgramlisting((ProgramlistingType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				setPubdate((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				setPublishername((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				setRow((RowType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				setSection((SectionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				setState((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				setSuperscript((String)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				setTgroup((TgroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				setTip((TipType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ULINK:
				setUlink((UlinkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				setWarning((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((AuthorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				setBibliomisc(BIBLIOMISC_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				setBook((BookType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BOOKINFO:
				setBookinfo((BookinfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				setCaution(CAUTION_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				setChapter((ChapterType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				setColspec((ColspecType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				setConfgroup((ConfgroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				setConfnum(CONFNUM_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				setConfsponsor(CONFSPONSOR_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				setConftitle(CONFTITLE_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				setEmphasis((EmphasisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				setEntry((EntryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				setFigure((FigureType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				setFootnote((FootnoteType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				setImagedata((ImagedataType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				setImageobject((ImageobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				setImportant((ImportantType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				setInformaltable((InformaltableType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				setItemizedlist((ItemizedlistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				setKeywordset((KeywordsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				setListitem((ListitemType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				setMediaobject((MediaobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				setOrderedlist((OrderedlistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				setOtheraddr((OtheraddrType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				setPara((ParaType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				setPhrase((PhraseType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				setPreface((PrefaceType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				setProgramlisting((ProgramlistingType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				setPubdate(PUBDATE_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				setPublishername(PUBLISHERNAME_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				setRow((RowType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				setSection((SectionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				setSuperscript(SUPERSCRIPT_EDEFAULT);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				setTgroup((TgroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				setTip((TipType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ULINK:
				setUlink((UlinkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				setWarning(WARNING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract() != null;
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				return BIBLIOMISC_EDEFAULT == null ? getBibliomisc() != null : !BIBLIOMISC_EDEFAULT.equals(getBibliomisc());
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				return getBook() != null;
			case DocbookPackage.DOCUMENT_ROOT__BOOKINFO:
				return getBookinfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				return CAUTION_EDEFAULT == null ? getCaution() != null : !CAUTION_EDEFAULT.equals(getCaution());
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				return getChapter() != null;
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				return getColspec() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				return getConfgroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				return CONFNUM_EDEFAULT == null ? getConfnum() != null : !CONFNUM_EDEFAULT.equals(getConfnum());
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				return CONFSPONSOR_EDEFAULT == null ? getConfsponsor() != null : !CONFSPONSOR_EDEFAULT.equals(getConfsponsor());
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				return CONFTITLE_EDEFAULT == null ? getConftitle() != null : !CONFTITLE_EDEFAULT.equals(getConftitle());
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				return getEmphasis() != null;
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				return getEntry() != null;
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				return getFigure() != null;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? getFirstname() != null : !FIRSTNAME_EDEFAULT.equals(getFirstname());
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				return getFootnote() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				return getImagedata() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				return getImageobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				return getImportant() != null;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				return getInformaltable() != null;
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				return getItemizedlist() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				return KEYWORD_EDEFAULT == null ? getKeyword() != null : !KEYWORD_EDEFAULT.equals(getKeyword());
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				return getKeywordset() != null;
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				return getLink() != null;
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				return getListitem() != null;
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral() != null;
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				return getMediaobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				return getNote() != null;
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				return getOrderedlist() != null;
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				return getOtheraddr() != null;
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				return getPara() != null;
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				return getPhrase() != null;
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				return getPreface() != null;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				return getProgramlisting() != null;
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				return PUBDATE_EDEFAULT == null ? getPubdate() != null : !PUBDATE_EDEFAULT.equals(getPubdate());
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				return PUBLISHERNAME_EDEFAULT == null ? getPublishername() != null : !PUBLISHERNAME_EDEFAULT.equals(getPublishername());
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				return getRow() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				return getSection() != null;
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? getSubtitle() != null : !SUBTITLE_EDEFAULT.equals(getSubtitle());
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				return SUPERSCRIPT_EDEFAULT == null ? getSuperscript() != null : !SUPERSCRIPT_EDEFAULT.equals(getSuperscript());
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				return getTable() != null;
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				return getTbody() != null;
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				return getTgroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				return getThead() != null;
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				return getTip() != null;
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__ULINK:
				return getUlink() != null;
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				return WARNING_EDEFAULT == null ? getWarning() != null : !WARNING_EDEFAULT.equals(getWarning());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
