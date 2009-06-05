/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.Docbook.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocbookFactoryImpl extends EFactoryImpl implements DocbookFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocbookFactory init() {
		try {
			DocbookFactory theDocbookFactory = (DocbookFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.kermeta.docbook/model/xsd/docbook.xsd"); 
			if (theDocbookFactory != null) {
				return theDocbookFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocbookFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocbookPackage.ABSTRACT_TYPE: return createAbstractType();
			case DocbookPackage.ADDRESS_TYPE: return createAddressType();
			case DocbookPackage.AUTHOR_TYPE: return createAuthorType();
			case DocbookPackage.BOOKINFO_TYPE: return createBookinfoType();
			case DocbookPackage.BOOK_TYPE: return createBookType();
			case DocbookPackage.CHAPTER_TYPE: return createChapterType();
			case DocbookPackage.COLSPEC_TYPE: return createColspecType();
			case DocbookPackage.CONFGROUP_TYPE: return createConfgroupType();
			case DocbookPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DocbookPackage.EMPHASIS_TYPE: return createEmphasisType();
			case DocbookPackage.ENTRY_TYPE: return createEntryType();
			case DocbookPackage.FIGURE_TYPE: return createFigureType();
			case DocbookPackage.FOOTNOTE_TYPE: return createFootnoteType();
			case DocbookPackage.IMAGEDATA_TYPE: return createImagedataType();
			case DocbookPackage.IMAGEOBJECT_TYPE: return createImageobjectType();
			case DocbookPackage.IMPORTANT_TYPE: return createImportantType();
			case DocbookPackage.INFORMALTABLE_TYPE: return createInformaltableType();
			case DocbookPackage.ITEMIZEDLIST_TYPE: return createItemizedlistType();
			case DocbookPackage.KEYWORDSET_TYPE: return createKeywordsetType();
			case DocbookPackage.LINK_TYPE: return createLinkType();
			case DocbookPackage.LISTITEM_TYPE: return createListitemType();
			case DocbookPackage.LITERAL_TYPE: return createLiteralType();
			case DocbookPackage.MEDIAOBJECT_TYPE: return createMediaobjectType();
			case DocbookPackage.NOTE_TYPE: return createNoteType();
			case DocbookPackage.ORDEREDLIST_TYPE: return createOrderedlistType();
			case DocbookPackage.OTHERADDR_TYPE: return createOtheraddrType();
			case DocbookPackage.PARA_TYPE: return createParaType();
			case DocbookPackage.PHRASE_TYPE: return createPhraseType();
			case DocbookPackage.PREFACE_TYPE: return createPrefaceType();
			case DocbookPackage.PROGRAMLISTING_TYPE: return createProgramlistingType();
			case DocbookPackage.PUBLISHER_TYPE: return createPublisherType();
			case DocbookPackage.ROW_TYPE: return createRowType();
			case DocbookPackage.SECTION_TYPE: return createSectionType();
			case DocbookPackage.TABLE_TYPE: return createTableType();
			case DocbookPackage.TBODY_TYPE: return createTbodyType();
			case DocbookPackage.TGROUP_TYPE: return createTgroupType();
			case DocbookPackage.THEAD_TYPE: return createTheadType();
			case DocbookPackage.TIP_TYPE: return createTipType();
			case DocbookPackage.TITLE_TYPE: return createTitleType();
			case DocbookPackage.ULINK_TYPE: return createUlinkType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType createAbstractType() {
		AbstractTypeImpl abstractType = new AbstractTypeImpl();
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorType createAuthorType() {
		AuthorTypeImpl authorType = new AuthorTypeImpl();
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookinfoType createBookinfoType() {
		BookinfoTypeImpl bookinfoType = new BookinfoTypeImpl();
		return bookinfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookType createBookType() {
		BookTypeImpl bookType = new BookTypeImpl();
		return bookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChapterType createChapterType() {
		ChapterTypeImpl chapterType = new ChapterTypeImpl();
		return chapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColspecType createColspecType() {
		ColspecTypeImpl colspecType = new ColspecTypeImpl();
		return colspecType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfgroupType createConfgroupType() {
		ConfgroupTypeImpl confgroupType = new ConfgroupTypeImpl();
		return confgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisType createEmphasisType() {
		EmphasisTypeImpl emphasisType = new EmphasisTypeImpl();
		return emphasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureType createFigureType() {
		FigureTypeImpl figureType = new FigureTypeImpl();
		return figureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnoteType createFootnoteType() {
		FootnoteTypeImpl footnoteType = new FootnoteTypeImpl();
		return footnoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagedataType createImagedataType() {
		ImagedataTypeImpl imagedataType = new ImagedataTypeImpl();
		return imagedataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageobjectType createImageobjectType() {
		ImageobjectTypeImpl imageobjectType = new ImageobjectTypeImpl();
		return imageobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportantType createImportantType() {
		ImportantTypeImpl importantType = new ImportantTypeImpl();
		return importantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformaltableType createInformaltableType() {
		InformaltableTypeImpl informaltableType = new InformaltableTypeImpl();
		return informaltableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemizedlistType createItemizedlistType() {
		ItemizedlistTypeImpl itemizedlistType = new ItemizedlistTypeImpl();
		return itemizedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsetType createKeywordsetType() {
		KeywordsetTypeImpl keywordsetType = new KeywordsetTypeImpl();
		return keywordsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListitemType createListitemType() {
		ListitemTypeImpl listitemType = new ListitemTypeImpl();
		return listitemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralType createLiteralType() {
		LiteralTypeImpl literalType = new LiteralTypeImpl();
		return literalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaobjectType createMediaobjectType() {
		MediaobjectTypeImpl mediaobjectType = new MediaobjectTypeImpl();
		return mediaobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedlistType createOrderedlistType() {
		OrderedlistTypeImpl orderedlistType = new OrderedlistTypeImpl();
		return orderedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtheraddrType createOtheraddrType() {
		OtheraddrTypeImpl otheraddrType = new OtheraddrTypeImpl();
		return otheraddrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParaType createParaType() {
		ParaTypeImpl paraType = new ParaTypeImpl();
		return paraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhraseType createPhraseType() {
		PhraseTypeImpl phraseType = new PhraseTypeImpl();
		return phraseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefaceType createPrefaceType() {
		PrefaceTypeImpl prefaceType = new PrefaceTypeImpl();
		return prefaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramlistingType createProgramlistingType() {
		ProgramlistingTypeImpl programlistingType = new ProgramlistingTypeImpl();
		return programlistingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType createPublisherType() {
		PublisherTypeImpl publisherType = new PublisherTypeImpl();
		return publisherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowType createRowType() {
		RowTypeImpl rowType = new RowTypeImpl();
		return rowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionType createSectionType() {
		SectionTypeImpl sectionType = new SectionTypeImpl();
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TbodyType createTbodyType() {
		TbodyTypeImpl tbodyType = new TbodyTypeImpl();
		return tbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TgroupType createTgroupType() {
		TgroupTypeImpl tgroupType = new TgroupTypeImpl();
		return tgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheadType createTheadType() {
		TheadTypeImpl theadType = new TheadTypeImpl();
		return theadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipType createTipType() {
		TipTypeImpl tipType = new TipTypeImpl();
		return tipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UlinkType createUlinkType() {
		UlinkTypeImpl ulinkType = new UlinkTypeImpl();
		return ulinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookPackage getDocbookPackage() {
		return (DocbookPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocbookPackage getPackage() {
		return DocbookPackage.eINSTANCE;
	}

} //DocbookFactoryImpl
