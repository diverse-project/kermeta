/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.kermeta.Docbook.AbstractType;
import org.kermeta.Docbook.AddressType;
import org.kermeta.Docbook.AuthorType;
import org.kermeta.Docbook.BookType;
import org.kermeta.Docbook.BookinfoType;
import org.kermeta.Docbook.ChapterType;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.ConfgroupType;
import org.kermeta.Docbook.DocbookFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocbookPackageImpl extends EPackageImpl implements DocbookPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookinfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chapterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colspecTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footnoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagedataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageobjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informaltableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemizedlistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listitemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaobjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedlistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otheraddrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phraseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programlistingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulinkTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.kermeta.Docbook.DocbookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocbookPackageImpl() {
		super(eNS_URI, DocbookFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocbookPackage init() {
		if (isInited) return (DocbookPackage)EPackage.Registry.INSTANCE.getEPackage(DocbookPackage.eNS_URI);

		// Obtain or create and register package
		DocbookPackageImpl theDocbookPackage = (DocbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DocbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DocbookPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocbookPackage.createPackageContents();

		// Initialize created meta-data
		theDocbookPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocbookPackage.freeze();

		return theDocbookPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractType() {
		return abstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractType_Para() {
		return (EReference)abstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_State() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_Otheraddr() {
		return (EReference)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Format() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorType() {
		return authorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorType_Firstname() {
		return (EAttribute)authorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookinfoType() {
		return bookinfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookinfoType_Pubdate() {
		return (EAttribute)bookinfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookinfoType_Author() {
		return (EReference)bookinfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookinfoType_Title() {
		return (EReference)bookinfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookinfoType_Group() {
		return (EAttribute)bookinfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookinfoType_Bibliomisc() {
		return (EAttribute)bookinfoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookinfoType_Date() {
		return (EAttribute)bookinfoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookinfoType_Keywordset() {
		return (EReference)bookinfoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookinfoType_Subtitle() {
		return (EAttribute)bookinfoTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookinfoType_Abstract() {
		return (EReference)bookinfoTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookinfoType_Publisher() {
		return (EReference)bookinfoTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookinfoType_Confgroup() {
		return (EReference)bookinfoTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookType() {
		return bookTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Bookinfo() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Preface() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Chapter() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Lang() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChapterType() {
		return chapterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Title() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Para() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Note() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Section() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColspecType() {
		return colspecTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColspecType_Colname() {
		return (EAttribute)colspecTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColspecType_Colwidth() {
		return (EAttribute)colspecTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfgroupType() {
		return confgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfgroupType_Conftitle() {
		return (EAttribute)confgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfgroupType_Confnum() {
		return (EAttribute)confgroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfgroupType_Confsponsor() {
		return (EAttribute)confgroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Abstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Author() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Bibliomisc() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Book() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bookinfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Caution() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Chapter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Colspec() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Confgroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Confnum() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Confsponsor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Conftitle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Date() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Emphasis() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Figure() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Firstname() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Footnote() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Imagedata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Imageobject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Important() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Informaltable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Itemizedlist() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Keyword() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Keywordset() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Link() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Listitem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Literal() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mediaobject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Note() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Orderedlist() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Otheraddr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Para() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Phrase() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Preface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Programlisting() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Pubdate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Publisher() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Publishername() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Row() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Section() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_State() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Subtitle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Superscript() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Table() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tbody() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tgroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Thead() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tip() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ulink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Warning() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmphasisType() {
		return emphasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasisType_Mixed() {
		return (EAttribute)emphasisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmphasisType_Emphasis() {
		return (EReference)emphasisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasisType_Role() {
		return (EAttribute)emphasisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Programlisting() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Mediaobject() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Para() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Align() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Morerows() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Nameend() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Namest() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Valign() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureType() {
		return figureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigureType_Title() {
		return (EReference)figureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigureType_Mediaobject() {
		return (EReference)figureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureType_Float() {
		return (EAttribute)figureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureType_Id() {
		return (EAttribute)figureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFootnoteType() {
		return footnoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFootnoteType_Para() {
		return (EReference)footnoteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteType_Id() {
		return (EAttribute)footnoteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagedataType() {
		return imagedataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Depth() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Fileref() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Width() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageobjectType() {
		return imageobjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageobjectType_Imagedata() {
		return (EReference)imageobjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportantType() {
		return importantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportantType_Mixed() {
		return (EAttribute)importantTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportantType_Group() {
		return (EAttribute)importantTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportantType_Emphasis() {
		return (EReference)importantTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportantType_Ulink() {
		return (EReference)importantTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformaltableType() {
		return informaltableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformaltableType_Tgroup() {
		return (EReference)informaltableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemizedlistType() {
		return itemizedlistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemizedlistType_Listitem() {
		return (EReference)itemizedlistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordsetType() {
		return keywordsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordsetType_Keyword() {
		return (EAttribute)keywordsetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Value() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Linkend() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListitemType() {
		return listitemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListitemType_Itemizedlist() {
		return (EReference)listitemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListitemType_Para() {
		return (EReference)listitemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralType() {
		return literalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralType_Value() {
		return (EAttribute)literalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralType_Moreinfo() {
		return (EAttribute)literalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaobjectType() {
		return mediaobjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaobjectType_Imageobject() {
		return (EReference)mediaobjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Mixed() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Group() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_Literal() {
		return (EReference)noteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_Ulink() {
		return (EReference)noteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedlistType() {
		return orderedlistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedlistType_Continuation() {
		return (EAttribute)orderedlistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedlistType_Inheritnum() {
		return (EAttribute)orderedlistTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtheraddrType() {
		return otheraddrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtheraddrType_Ulink() {
		return (EReference)otheraddrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParaType() {
		return paraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Mixed() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Group() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Emphasis() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Literal() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Ulink() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Footnote() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Link() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Role() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhraseType() {
		return phraseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhraseType_Id() {
		return (EAttribute)phraseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefaceType() {
		return prefaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Title() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Para() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Important() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Tip() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramlistingType() {
		return programlistingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Mixed() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Group() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramlistingType_Emphasis() {
		return (EReference)programlistingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramlistingType_Phrase() {
		return (EReference)programlistingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Superscript() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Format() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisherType() {
		return publisherTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisherType_Publishername() {
		return (EAttribute)publisherTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisherType_Address() {
		return (EReference)publisherTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowType() {
		return rowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowType_Entry() {
		return (EReference)rowTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionType() {
		return sectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Group() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Itemizedlist() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Mediaobject() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Note() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Para() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Programlisting() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Section() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Title() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Figure() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Informaltable() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Orderedlist() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Table() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Warning() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Tip() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Caution() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Title() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Tgroup() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Id() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTbodyType() {
		return tbodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTbodyType_Row() {
		return (EReference)tbodyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTgroupType() {
		return tgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTgroupType_Colspec() {
		return (EReference)tgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTgroupType_Thead() {
		return (EReference)tgroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTgroupType_Tbody() {
		return (EReference)tgroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTgroupType_Cols() {
		return (EAttribute)tgroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheadType() {
		return theadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheadType_Row() {
		return (EReference)theadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipType() {
		return tipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipType_Mixed() {
		return (EAttribute)tipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTipType_Ulink() {
		return (EReference)tipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleType() {
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Mixed() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Group() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleType_Emphasis() {
		return (EReference)titleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleType_Phrase() {
		return (EReference)titleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUlinkType() {
		return ulinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlinkType_Mixed() {
		return (EAttribute)ulinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUlinkType_Emphasis() {
		return (EReference)ulinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlinkType_Type() {
		return (EAttribute)ulinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlinkType_Url() {
		return (EAttribute)ulinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookFactory getDocbookFactory() {
		return (DocbookFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTypeEClass = createEClass(ABSTRACT_TYPE);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__PARA);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__STATE);
		createEReference(addressTypeEClass, ADDRESS_TYPE__OTHERADDR);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__FORMAT);

		authorTypeEClass = createEClass(AUTHOR_TYPE);
		createEAttribute(authorTypeEClass, AUTHOR_TYPE__FIRSTNAME);

		bookinfoTypeEClass = createEClass(BOOKINFO_TYPE);
		createEAttribute(bookinfoTypeEClass, BOOKINFO_TYPE__PUBDATE);
		createEReference(bookinfoTypeEClass, BOOKINFO_TYPE__AUTHOR);
		createEReference(bookinfoTypeEClass, BOOKINFO_TYPE__TITLE);
		createEAttribute(bookinfoTypeEClass, BOOKINFO_TYPE__GROUP);
		createEAttribute(bookinfoTypeEClass, BOOKINFO_TYPE__BIBLIOMISC);
		createEAttribute(bookinfoTypeEClass, BOOKINFO_TYPE__DATE);
		createEReference(bookinfoTypeEClass, BOOKINFO_TYPE__KEYWORDSET);
		createEAttribute(bookinfoTypeEClass, BOOKINFO_TYPE__SUBTITLE);
		createEReference(bookinfoTypeEClass, BOOKINFO_TYPE__ABSTRACT);
		createEReference(bookinfoTypeEClass, BOOKINFO_TYPE__PUBLISHER);
		createEReference(bookinfoTypeEClass, BOOKINFO_TYPE__CONFGROUP);

		bookTypeEClass = createEClass(BOOK_TYPE);
		createEReference(bookTypeEClass, BOOK_TYPE__BOOKINFO);
		createEReference(bookTypeEClass, BOOK_TYPE__PREFACE);
		createEReference(bookTypeEClass, BOOK_TYPE__CHAPTER);
		createEAttribute(bookTypeEClass, BOOK_TYPE__LANG);

		chapterTypeEClass = createEClass(CHAPTER_TYPE);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__TITLE);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__PARA);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__NOTE);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__SECTION);

		colspecTypeEClass = createEClass(COLSPEC_TYPE);
		createEAttribute(colspecTypeEClass, COLSPEC_TYPE__COLNAME);
		createEAttribute(colspecTypeEClass, COLSPEC_TYPE__COLWIDTH);

		confgroupTypeEClass = createEClass(CONFGROUP_TYPE);
		createEAttribute(confgroupTypeEClass, CONFGROUP_TYPE__CONFTITLE);
		createEAttribute(confgroupTypeEClass, CONFGROUP_TYPE__CONFNUM);
		createEAttribute(confgroupTypeEClass, CONFGROUP_TYPE__CONFSPONSOR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BIBLIOMISC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOKINFO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CAUTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHAPTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLSPEC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFGROUP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFNUM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFSPONSOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFTITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMPHASIS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FIGURE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FIRSTNAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOOTNOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMAGEDATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMAGEOBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORTANT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INFORMALTABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ITEMIZEDLIST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEYWORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEYWORDSET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LISTITEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LITERAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEDIAOBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORDEREDLIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OTHERADDR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PHRASE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PREFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROGRAMLISTING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PUBDATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLISHER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PUBLISHERNAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROW);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUBTITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUPERSCRIPT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TBODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TGROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__THEAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ULINK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WARNING);

		emphasisTypeEClass = createEClass(EMPHASIS_TYPE);
		createEAttribute(emphasisTypeEClass, EMPHASIS_TYPE__MIXED);
		createEReference(emphasisTypeEClass, EMPHASIS_TYPE__EMPHASIS);
		createEAttribute(emphasisTypeEClass, EMPHASIS_TYPE__ROLE);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEReference(entryTypeEClass, ENTRY_TYPE__PROGRAMLISTING);
		createEReference(entryTypeEClass, ENTRY_TYPE__MEDIAOBJECT);
		createEReference(entryTypeEClass, ENTRY_TYPE__PARA);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__ALIGN);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__MOREROWS);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__NAMEEND);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__NAMEST);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__VALIGN);

		figureTypeEClass = createEClass(FIGURE_TYPE);
		createEReference(figureTypeEClass, FIGURE_TYPE__TITLE);
		createEReference(figureTypeEClass, FIGURE_TYPE__MEDIAOBJECT);
		createEAttribute(figureTypeEClass, FIGURE_TYPE__FLOAT);
		createEAttribute(figureTypeEClass, FIGURE_TYPE__ID);

		footnoteTypeEClass = createEClass(FOOTNOTE_TYPE);
		createEReference(footnoteTypeEClass, FOOTNOTE_TYPE__PARA);
		createEAttribute(footnoteTypeEClass, FOOTNOTE_TYPE__ID);

		imagedataTypeEClass = createEClass(IMAGEDATA_TYPE);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__DEPTH);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__FILEREF);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__WIDTH);

		imageobjectTypeEClass = createEClass(IMAGEOBJECT_TYPE);
		createEReference(imageobjectTypeEClass, IMAGEOBJECT_TYPE__IMAGEDATA);

		importantTypeEClass = createEClass(IMPORTANT_TYPE);
		createEAttribute(importantTypeEClass, IMPORTANT_TYPE__MIXED);
		createEAttribute(importantTypeEClass, IMPORTANT_TYPE__GROUP);
		createEReference(importantTypeEClass, IMPORTANT_TYPE__EMPHASIS);
		createEReference(importantTypeEClass, IMPORTANT_TYPE__ULINK);

		informaltableTypeEClass = createEClass(INFORMALTABLE_TYPE);
		createEReference(informaltableTypeEClass, INFORMALTABLE_TYPE__TGROUP);

		itemizedlistTypeEClass = createEClass(ITEMIZEDLIST_TYPE);
		createEReference(itemizedlistTypeEClass, ITEMIZEDLIST_TYPE__LISTITEM);

		keywordsetTypeEClass = createEClass(KEYWORDSET_TYPE);
		createEAttribute(keywordsetTypeEClass, KEYWORDSET_TYPE__KEYWORD);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__VALUE);
		createEAttribute(linkTypeEClass, LINK_TYPE__LINKEND);

		listitemTypeEClass = createEClass(LISTITEM_TYPE);
		createEReference(listitemTypeEClass, LISTITEM_TYPE__ITEMIZEDLIST);
		createEReference(listitemTypeEClass, LISTITEM_TYPE__PARA);

		literalTypeEClass = createEClass(LITERAL_TYPE);
		createEAttribute(literalTypeEClass, LITERAL_TYPE__VALUE);
		createEAttribute(literalTypeEClass, LITERAL_TYPE__MOREINFO);

		mediaobjectTypeEClass = createEClass(MEDIAOBJECT_TYPE);
		createEReference(mediaobjectTypeEClass, MEDIAOBJECT_TYPE__IMAGEOBJECT);

		noteTypeEClass = createEClass(NOTE_TYPE);
		createEAttribute(noteTypeEClass, NOTE_TYPE__MIXED);
		createEAttribute(noteTypeEClass, NOTE_TYPE__GROUP);
		createEReference(noteTypeEClass, NOTE_TYPE__LITERAL);
		createEReference(noteTypeEClass, NOTE_TYPE__ULINK);

		orderedlistTypeEClass = createEClass(ORDEREDLIST_TYPE);
		createEAttribute(orderedlistTypeEClass, ORDEREDLIST_TYPE__CONTINUATION);
		createEAttribute(orderedlistTypeEClass, ORDEREDLIST_TYPE__INHERITNUM);

		otheraddrTypeEClass = createEClass(OTHERADDR_TYPE);
		createEReference(otheraddrTypeEClass, OTHERADDR_TYPE__ULINK);

		paraTypeEClass = createEClass(PARA_TYPE);
		createEAttribute(paraTypeEClass, PARA_TYPE__MIXED);
		createEAttribute(paraTypeEClass, PARA_TYPE__GROUP);
		createEReference(paraTypeEClass, PARA_TYPE__EMPHASIS);
		createEReference(paraTypeEClass, PARA_TYPE__LITERAL);
		createEReference(paraTypeEClass, PARA_TYPE__ULINK);
		createEReference(paraTypeEClass, PARA_TYPE__FOOTNOTE);
		createEReference(paraTypeEClass, PARA_TYPE__LINK);
		createEAttribute(paraTypeEClass, PARA_TYPE__ROLE);

		phraseTypeEClass = createEClass(PHRASE_TYPE);
		createEAttribute(phraseTypeEClass, PHRASE_TYPE__ID);

		prefaceTypeEClass = createEClass(PREFACE_TYPE);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__TITLE);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__PARA);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__IMPORTANT);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__TIP);

		programlistingTypeEClass = createEClass(PROGRAMLISTING_TYPE);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__MIXED);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__GROUP);
		createEReference(programlistingTypeEClass, PROGRAMLISTING_TYPE__EMPHASIS);
		createEReference(programlistingTypeEClass, PROGRAMLISTING_TYPE__PHRASE);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__SUPERSCRIPT);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__FORMAT);

		publisherTypeEClass = createEClass(PUBLISHER_TYPE);
		createEAttribute(publisherTypeEClass, PUBLISHER_TYPE__PUBLISHERNAME);
		createEReference(publisherTypeEClass, PUBLISHER_TYPE__ADDRESS);

		rowTypeEClass = createEClass(ROW_TYPE);
		createEReference(rowTypeEClass, ROW_TYPE__ENTRY);

		sectionTypeEClass = createEClass(SECTION_TYPE);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__GROUP);
		createEReference(sectionTypeEClass, SECTION_TYPE__ITEMIZEDLIST);
		createEReference(sectionTypeEClass, SECTION_TYPE__MEDIAOBJECT);
		createEReference(sectionTypeEClass, SECTION_TYPE__NOTE);
		createEReference(sectionTypeEClass, SECTION_TYPE__PARA);
		createEReference(sectionTypeEClass, SECTION_TYPE__PROGRAMLISTING);
		createEReference(sectionTypeEClass, SECTION_TYPE__SECTION);
		createEReference(sectionTypeEClass, SECTION_TYPE__TITLE);
		createEReference(sectionTypeEClass, SECTION_TYPE__FIGURE);
		createEReference(sectionTypeEClass, SECTION_TYPE__INFORMALTABLE);
		createEReference(sectionTypeEClass, SECTION_TYPE__ORDEREDLIST);
		createEReference(sectionTypeEClass, SECTION_TYPE__TABLE);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__WARNING);
		createEReference(sectionTypeEClass, SECTION_TYPE__TIP);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__CAUTION);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__TITLE);
		createEReference(tableTypeEClass, TABLE_TYPE__TGROUP);
		createEAttribute(tableTypeEClass, TABLE_TYPE__ID);

		tbodyTypeEClass = createEClass(TBODY_TYPE);
		createEReference(tbodyTypeEClass, TBODY_TYPE__ROW);

		tgroupTypeEClass = createEClass(TGROUP_TYPE);
		createEReference(tgroupTypeEClass, TGROUP_TYPE__COLSPEC);
		createEReference(tgroupTypeEClass, TGROUP_TYPE__THEAD);
		createEReference(tgroupTypeEClass, TGROUP_TYPE__TBODY);
		createEAttribute(tgroupTypeEClass, TGROUP_TYPE__COLS);

		theadTypeEClass = createEClass(THEAD_TYPE);
		createEReference(theadTypeEClass, THEAD_TYPE__ROW);

		tipTypeEClass = createEClass(TIP_TYPE);
		createEAttribute(tipTypeEClass, TIP_TYPE__MIXED);
		createEReference(tipTypeEClass, TIP_TYPE__ULINK);

		titleTypeEClass = createEClass(TITLE_TYPE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__MIXED);
		createEAttribute(titleTypeEClass, TITLE_TYPE__GROUP);
		createEReference(titleTypeEClass, TITLE_TYPE__EMPHASIS);
		createEReference(titleTypeEClass, TITLE_TYPE__PHRASE);

		ulinkTypeEClass = createEClass(ULINK_TYPE);
		createEAttribute(ulinkTypeEClass, ULINK_TYPE__MIXED);
		createEReference(ulinkTypeEClass, ULINK_TYPE__EMPHASIS);
		createEAttribute(ulinkTypeEClass, ULINK_TYPE__TYPE);
		createEAttribute(ulinkTypeEClass, ULINK_TYPE__URL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractType_Para(), this.getParaType(), null, "para", null, 1, 1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_State(), theXMLTypePackage.getNCName(), "state", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressType_Otheraddr(), this.getOtheraddrType(), null, "otheraddr", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Format(), theXMLTypePackage.getNCName(), "format", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorTypeEClass, AuthorType.class, "AuthorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorType_Firstname(), theXMLTypePackage.getString(), "firstname", null, 1, -1, AuthorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookinfoTypeEClass, BookinfoType.class, "BookinfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookinfoType_Pubdate(), theXMLTypePackage.getString(), "pubdate", null, 1, 1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookinfoType_Author(), this.getAuthorType(), null, "author", null, 1, 1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookinfoType_Title(), this.getTitleType(), null, "title", null, 1, 1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookinfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookinfoType_Bibliomisc(), theXMLTypePackage.getString(), "bibliomisc", null, 0, -1, BookinfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookinfoType_Date(), theXMLTypePackage.getString(), "date", null, 0, -1, BookinfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBookinfoType_Keywordset(), this.getKeywordsetType(), null, "keywordset", null, 0, -1, BookinfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookinfoType_Subtitle(), theXMLTypePackage.getString(), "subtitle", null, 0, -1, BookinfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBookinfoType_Abstract(), this.getAbstractType(), null, "abstract", null, 1, 1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookinfoType_Publisher(), this.getPublisherType(), null, "publisher", null, 1, 1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookinfoType_Confgroup(), this.getConfgroupType(), null, "confgroup", null, 1, 1, BookinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookTypeEClass, BookType.class, "BookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookType_Bookinfo(), this.getBookinfoType(), null, "bookinfo", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Preface(), this.getPrefaceType(), null, "preface", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Chapter(), this.getChapterType(), null, "chapter", null, 1, -1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Lang(), theXMLTypePackage.getNCName(), "lang", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chapterTypeEClass, ChapterType.class, "ChapterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChapterType_Title(), this.getTitleType(), null, "title", null, 1, 1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChapterType_Para(), this.getParaType(), null, "para", null, 0, -1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChapterType_Note(), this.getNoteType(), null, "note", null, 0, 1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChapterType_Section(), this.getSectionType(), null, "section", null, 0, -1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colspecTypeEClass, ColspecType.class, "ColspecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColspecType_Colname(), theXMLTypePackage.getNCName(), "colname", null, 1, 1, ColspecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColspecType_Colwidth(), theXMLTypePackage.getNMTOKEN(), "colwidth", null, 1, 1, ColspecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confgroupTypeEClass, ConfgroupType.class, "ConfgroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfgroupType_Conftitle(), theXMLTypePackage.getNCName(), "conftitle", null, 1, 1, ConfgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfgroupType_Confnum(), theXMLTypePackage.getNCName(), "confnum", null, 1, 1, ConfgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfgroupType_Confsponsor(), theXMLTypePackage.getNCName(), "confsponsor", null, 1, 1, ConfgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Abstract(), this.getAbstractType(), null, "abstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Author(), this.getAuthorType(), null, "author", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Bibliomisc(), theXMLTypePackage.getString(), "bibliomisc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Book(), this.getBookType(), null, "book", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bookinfo(), this.getBookinfoType(), null, "bookinfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Caution(), theXMLTypePackage.getString(), "caution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Chapter(), this.getChapterType(), null, "chapter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Colspec(), this.getColspecType(), null, "colspec", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Confgroup(), this.getConfgroupType(), null, "confgroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Confnum(), theXMLTypePackage.getNCName(), "confnum", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Confsponsor(), theXMLTypePackage.getNCName(), "confsponsor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Conftitle(), theXMLTypePackage.getNCName(), "conftitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Date(), theXMLTypePackage.getString(), "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Entry(), this.getEntryType(), null, "entry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Figure(), this.getFigureType(), null, "figure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Firstname(), theXMLTypePackage.getString(), "firstname", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Footnote(), this.getFootnoteType(), null, "footnote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Imagedata(), this.getImagedataType(), null, "imagedata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Imageobject(), this.getImageobjectType(), null, "imageobject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Important(), this.getImportantType(), null, "important", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Informaltable(), this.getInformaltableType(), null, "informaltable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Keyword(), theXMLTypePackage.getNCName(), "keyword", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Keywordset(), this.getKeywordsetType(), null, "keywordset", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Link(), this.getLinkType(), null, "link", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Listitem(), this.getListitemType(), null, "listitem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Literal(), this.getLiteralType(), null, "literal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Note(), this.getNoteType(), null, "note", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Orderedlist(), this.getOrderedlistType(), null, "orderedlist", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Otheraddr(), this.getOtheraddrType(), null, "otheraddr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Para(), this.getParaType(), null, "para", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Preface(), this.getPrefaceType(), null, "preface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Pubdate(), theXMLTypePackage.getString(), "pubdate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Publisher(), this.getPublisherType(), null, "publisher", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Publishername(), theXMLTypePackage.getNCName(), "publishername", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Row(), this.getRowType(), null, "row", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Section(), this.getSectionType(), null, "section", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_State(), theXMLTypePackage.getNCName(), "state", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Subtitle(), theXMLTypePackage.getString(), "subtitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Superscript(), theXMLTypePackage.getNCName(), "superscript", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Table(), this.getTableType(), null, "table", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tbody(), this.getTbodyType(), null, "tbody", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tgroup(), this.getTgroupType(), null, "tgroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Thead(), this.getTheadType(), null, "thead", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tip(), this.getTipType(), null, "tip", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getTitleType(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Warning(), theXMLTypePackage.getString(), "warning", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emphasisTypeEClass, EmphasisType.class, "EmphasisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmphasisType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EmphasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmphasisType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, EmphasisType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasisType_Role(), theXMLTypePackage.getNCName(), "role", null, 0, 1, EmphasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Para(), this.getParaType(), null, "para", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Align(), theXMLTypePackage.getNCName(), "align", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Morerows(), theXMLTypePackage.getInteger(), "morerows", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Nameend(), theXMLTypePackage.getNCName(), "nameend", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Namest(), theXMLTypePackage.getNCName(), "namest", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Valign(), theXMLTypePackage.getNCName(), "valign", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figureTypeEClass, FigureType.class, "FigureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFigureType_Title(), this.getTitleType(), null, "title", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigureType_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigureType_Float(), theXMLTypePackage.getInteger(), "float", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigureType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footnoteTypeEClass, FootnoteType.class, "FootnoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFootnoteType_Para(), this.getParaType(), null, "para", null, 1, 1, FootnoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFootnoteType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, FootnoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagedataTypeEClass, ImagedataType.class, "ImagedataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagedataType_Depth(), theXMLTypePackage.getNMTOKEN(), "depth", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagedataType_Fileref(), theXMLTypePackage.getAnySimpleType(), "fileref", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagedataType_Width(), theXMLTypePackage.getNMTOKEN(), "width", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageobjectTypeEClass, ImageobjectType.class, "ImageobjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageobjectType_Imagedata(), this.getImagedataType(), null, "imagedata", null, 1, 1, ImageobjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importantTypeEClass, ImportantType.class, "ImportantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportantType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ImportantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportantType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ImportantType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImportantType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, ImportantType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImportantType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, ImportantType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(informaltableTypeEClass, InformaltableType.class, "InformaltableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformaltableType_Tgroup(), this.getTgroupType(), null, "tgroup", null, 1, 1, InformaltableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemizedlistTypeEClass, ItemizedlistType.class, "ItemizedlistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemizedlistType_Listitem(), this.getListitemType(), null, "listitem", null, 0, -1, ItemizedlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordsetTypeEClass, KeywordsetType.class, "KeywordsetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywordsetType_Keyword(), theXMLTypePackage.getNCName(), "keyword", null, 1, -1, KeywordsetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkType_Value(), theXMLTypePackage.getNMTOKEN(), "value", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Linkend(), theXMLTypePackage.getNMTOKEN(), "linkend", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listitemTypeEClass, ListitemType.class, "ListitemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListitemType_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, 1, ListitemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListitemType_Para(), this.getParaType(), null, "para", null, 0, -1, ListitemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalTypeEClass, LiteralType.class, "LiteralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, LiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralType_Moreinfo(), theXMLTypePackage.getNCName(), "moreinfo", null, 1, 1, LiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaobjectTypeEClass, MediaobjectType.class, "MediaobjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaobjectType_Imageobject(), this.getImageobjectType(), null, "imageobject", null, 0, 1, MediaobjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteTypeEClass, NoteType.class, "NoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, NoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, NoteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNoteType_Literal(), this.getLiteralType(), null, "literal", null, 0, -1, NoteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNoteType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, NoteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderedlistTypeEClass, OrderedlistType.class, "OrderedlistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderedlistType_Continuation(), theXMLTypePackage.getNCName(), "continuation", null, 1, 1, OrderedlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderedlistType_Inheritnum(), theXMLTypePackage.getNCName(), "inheritnum", null, 1, 1, OrderedlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otheraddrTypeEClass, OtheraddrType.class, "OtheraddrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtheraddrType_Ulink(), this.getUlinkType(), null, "ulink", null, 1, 1, OtheraddrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paraTypeEClass, ParaType.class, "ParaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParaType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Literal(), this.getLiteralType(), null, "literal", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Footnote(), this.getFootnoteType(), null, "footnote", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Link(), this.getLinkType(), null, "link", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_Role(), theXMLTypePackage.getNCName(), "role", null, 0, 1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phraseTypeEClass, PhraseType.class, "PhraseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhraseType_Id(), theXMLTypePackage.getNMTOKEN(), "id", null, 1, 1, PhraseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefaceTypeEClass, PrefaceType.class, "PrefaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrefaceType_Title(), this.getTitleType(), null, "title", null, 1, 1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefaceType_Para(), this.getParaType(), null, "para", null, 1, -1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefaceType_Important(), this.getImportantType(), null, "important", null, 1, 1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefaceType_Tip(), this.getTipType(), null, "tip", null, 1, 1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programlistingTypeEClass, ProgramlistingType.class, "ProgramlistingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramlistingType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ProgramlistingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgramlistingType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgramlistingType_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Superscript(), theXMLTypePackage.getNCName(), "superscript", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Format(), theXMLTypePackage.getNCName(), "format", null, 1, 1, ProgramlistingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publisherTypeEClass, PublisherType.class, "PublisherType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisherType_Publishername(), theXMLTypePackage.getNCName(), "publishername", null, 1, 1, PublisherType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublisherType_Address(), this.getAddressType(), null, "address", null, 1, 1, PublisherType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowTypeEClass, RowType.class, "RowType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowType_Entry(), this.getEntryType(), null, "entry", null, 1, -1, RowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionTypeEClass, SectionType.class, "SectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSectionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Note(), this.getNoteType(), null, "note", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Para(), this.getParaType(), null, "para", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Section(), this.getSectionType(), null, "section", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Title(), this.getTitleType(), null, "title", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Figure(), this.getFigureType(), null, "figure", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Informaltable(), this.getInformaltableType(), null, "informaltable", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Orderedlist(), this.getOrderedlistType(), null, "orderedlist", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Table(), this.getTableType(), null, "table", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionType_Warning(), theXMLTypePackage.getString(), "warning", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Tip(), this.getTipType(), null, "tip", null, 0, 1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionType_Caution(), theXMLTypePackage.getString(), "caution", null, 0, 1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Title(), this.getTitleType(), null, "title", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tgroup(), this.getTgroupType(), null, "tgroup", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tbodyTypeEClass, TbodyType.class, "TbodyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTbodyType_Row(), this.getRowType(), null, "row", null, 1, -1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tgroupTypeEClass, TgroupType.class, "TgroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTgroupType_Colspec(), this.getColspecType(), null, "colspec", null, 1, -1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTgroupType_Thead(), this.getTheadType(), null, "thead", null, 0, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTgroupType_Tbody(), this.getTbodyType(), null, "tbody", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTgroupType_Cols(), theXMLTypePackage.getInteger(), "cols", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theadTypeEClass, TheadType.class, "TheadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheadType_Row(), this.getRowType(), null, "row", null, 1, -1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipTypeEClass, TipType.class, "TipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTipType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, TipType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(titleTypeEClass, TitleType.class, "TitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTitleType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTitleType_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ulinkTypeEClass, UlinkType.class, "UlinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUlinkType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, UlinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUlinkType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, UlinkType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlinkType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, UlinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlinkType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 1, 1, UlinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (abstractTypeEClass, 
		   source, 
		   new String[] {
			 "name", "abstract_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (addressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "address_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressType_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_Otheraddr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otheraddr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (authorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "author_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthorType_Firstname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (bookinfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bookinfo_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBookinfoType_Pubdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pubdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookinfoType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookinfoType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookinfoType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });		
		addAnnotation
		  (getBookinfoType_Bibliomisc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bibliomisc",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getBookinfoType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getBookinfoType_Keywordset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywordset",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getBookinfoType_Subtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subtitle",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getBookinfoType_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookinfoType_Publisher(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookinfoType_Confgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (bookTypeEClass, 
		   source, 
		   new String[] {
			 "name", "book_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBookType_Bookinfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bookinfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Preface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Chapter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chapter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (chapterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "chapter_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChapterType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChapterType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChapterType_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChapterType_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (colspecTypeEClass, 
		   source, 
		   new String[] {
			 "name", "colspec_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getColspecType_Colname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getColspecType_Colwidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colwidth",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (confgroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "confgroup_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfgroupType_Conftitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conftitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfgroupType_Confnum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfgroupType_Confsponsor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confsponsor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Bibliomisc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bibliomisc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Book(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "book",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Bookinfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bookinfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Caution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Chapter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chapter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Colspec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colspec",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Confgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Confnum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Confsponsor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confsponsor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Conftitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conftitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Figure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "figure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Firstname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Footnote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "footnote",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Imagedata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imagedata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Imageobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Important(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "important",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Informaltable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "informaltable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Keyword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyword",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Keywordset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywordset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Listitem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listitem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Literal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Orderedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orderedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Otheraddr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otheraddr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Preface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Pubdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pubdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Publisher(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Publishername(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishername",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Subtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subtitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Superscript(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "superscript",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tbody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tbody",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Thead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Warning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warning",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (emphasisTypeEClass, 
		   source, 
		   new String[] {
			 "name", "emphasis_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getEmphasisType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getEmphasisType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmphasisType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (entryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "entry_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntryType_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Morerows(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "morerows",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Nameend(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameend",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Namest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (figureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "figure_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFigureType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFigureType_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFigureType_Float(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "float",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFigureType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (footnoteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "footnote_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFootnoteType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFootnoteType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (imagedataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "imagedata_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getImagedataType_Depth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "depth",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImagedataType_Fileref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fileref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImagedataType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (imageobjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "imageobject_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImageobjectType_Imagedata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imagedata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (importantTypeEClass, 
		   source, 
		   new String[] {
			 "name", "important_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getImportantType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getImportantType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getImportantType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getImportantType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (informaltableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "informaltable_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInformaltableType_Tgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itemizedlistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "itemizedlist_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItemizedlistType_Listitem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listitem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (keywordsetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "keywordset_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKeywordsetType_Keyword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyword",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (linkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "link_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLinkType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLinkType_Linkend(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkend",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (listitemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "listitem_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListitemType_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListitemType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (literalTypeEClass, 
		   source, 
		   new String[] {
			 "name", "literal_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLiteralType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLiteralType_Moreinfo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "moreinfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (mediaobjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mediaobject_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMediaobjectType_Imageobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (noteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "note_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getNoteType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getNoteType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getNoteType_Literal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getNoteType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (orderedlistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "orderedlist_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOrderedlistType_Continuation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "continuation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrderedlistType_Inheritnum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inheritnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (otheraddrTypeEClass, 
		   source, 
		   new String[] {
			 "name", "otheraddr_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOtheraddrType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (paraTypeEClass, 
		   source, 
		   new String[] {
			 "name", "para_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getParaType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getParaType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getParaType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Literal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Footnote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "footnote",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (phraseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "phrase_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPhraseType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (prefaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "preface_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPrefaceType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPrefaceType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPrefaceType_Important(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "important",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPrefaceType_Tip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (programlistingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "programlisting_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getProgramlistingType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getProgramlistingType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Superscript(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "superscript",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (publisherTypeEClass, 
		   source, 
		   new String[] {
			 "name", "publisher_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPublisherType_Publishername(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishername",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublisherType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (rowTypeEClass, 
		   source, 
		   new String[] {
			 "name", "row_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRowType_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "section_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSectionType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Figure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "figure",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Informaltable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "informaltable",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Orderedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orderedlist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Warning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warning",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Tip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSectionType_Caution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "table_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTableType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Tgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tbodyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tbody_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTbodyType_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tgroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tgroup_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTgroupType_Colspec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colspec",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Thead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Tbody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tbody",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Cols(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cols",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (theadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "thead_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTheadType_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tip_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTipType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTipType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (titleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "title_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTitleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getTitleType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getTitleType_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (ulinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ulink_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getUlinkType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getUlinkType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUlinkType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUlinkType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });
	}

} //DocbookPackageImpl
