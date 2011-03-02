/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.traceability.TraceabilityFactory
 * @model kind="package"
 *        annotation="kermeta.req platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km='platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km'"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/Traceability/2.0.0//org/kermeta/traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org_kermeta_traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = org.kermeta.traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.TracePackageImpl <em>Trace Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.TracePackageImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTracePackage()
	 * @generated
	 */
	int TRACE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__SUBPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__CONTEXTS = 2;

	/**
	 * The number of structural features of the '<em>Trace Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.TraceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Source Elem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_ELEM = 0;

	/**
	 * The feature id for the '<em><b>Target Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_ELEM = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.TraceableImpl <em>Traceable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.TraceableImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTraceable()
	 * @generated
	 */
	int TRACEABLE = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Traceable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.ReferenceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = TRACEABLE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = TRACEABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Trace Mdl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TRACE_MDL = TRACEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = TRACEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.FileReferenceImpl <em>File Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.FileReferenceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getFileReference()
	 * @generated
	 */
	int FILE_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Trace Mdl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__TRACE_MDL = REFERENCE__TRACE_MDL;

	/**
	 * The feature id for the '<em><b>File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__FILE_URI = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__TIME_STAMP = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.TextReferenceImpl <em>Text Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.TextReferenceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTextReference()
	 * @generated
	 */
	int TEXT_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__TARGET = FILE_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__SOURCE = FILE_REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Trace Mdl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__TRACE_MDL = FILE_REFERENCE__TRACE_MDL;

	/**
	 * The feature id for the '<em><b>File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__FILE_URI = FILE_REFERENCE__FILE_URI;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__TIME_STAMP = FILE_REFERENCE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Char Begin Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__CHAR_BEGIN_OFFSET = FILE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Char End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE__CHAR_END_OFFSET = FILE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REFERENCE_FEATURE_COUNT = FILE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.XMLReferenceImpl <em>XML Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.XMLReferenceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getXMLReference()
	 * @generated
	 */
	int XML_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TARGET = FILE_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__SOURCE = FILE_REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Trace Mdl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TRACE_MDL = FILE_REFERENCE__TRACE_MDL;

	/**
	 * The feature id for the '<em><b>File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__FILE_URI = FILE_REFERENCE__FILE_URI;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__TIME_STAMP = FILE_REFERENCE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>XPointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE__XPOINTER = FILE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_REFERENCE_FEATURE_COUNT = FILE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.ModelReferenceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Trace Mdl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__TRACE_MDL = REFERENCE__TRACE_MDL;

	/**
	 * The feature id for the '<em><b>Ref Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__REF_OBJECT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.traceability.impl.QualifiedNameReferenceImpl <em>Qualified Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.traceability.impl.QualifiedNameReferenceImpl
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getQualifiedNameReference()
	 * @generated
	 */
	int QUALIFIED_NAME_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_REFERENCE__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_REFERENCE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Trace Mdl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_REFERENCE__TRACE_MDL = REFERENCE__TRACE_MDL;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_REFERENCE__QUALIFIED_NAME = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualified Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 10;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 11;


	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 12;


	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.TracePackage <em>Trace Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Package</em>'.
	 * @see org.kermeta.traceability.TracePackage
	 * @generated
	 */
	EClass getTracePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.traceability.TracePackage#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.kermeta.traceability.TracePackage#getReferences()
	 * @see #getTracePackage()
	 * @generated
	 */
	EReference getTracePackage_References();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.traceability.TracePackage#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see org.kermeta.traceability.TracePackage#getSubpackage()
	 * @see #getTracePackage()
	 * @generated
	 */
	EReference getTracePackage_Subpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.traceability.TracePackage#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.kermeta.traceability.TracePackage#getContexts()
	 * @see #getTracePackage()
	 * @generated
	 */
	EReference getTracePackage_Contexts();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.kermeta.traceability.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.traceability.Trace#getSourceElem <em>Source Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Elem</em>'.
	 * @see org.kermeta.traceability.Trace#getSourceElem()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_SourceElem();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.traceability.Trace#getTargetElem <em>Target Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Elem</em>'.
	 * @see org.kermeta.traceability.Trace#getTargetElem()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_TargetElem();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.traceability.Trace#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.kermeta.traceability.Trace#getContext()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Context();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.kermeta.traceability.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Mdl</em>'.
	 * @see org.kermeta.traceability.Reference#getTraceMdl()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_TraceMdl();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.FileReference <em>File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Reference</em>'.
	 * @see org.kermeta.traceability.FileReference
	 * @generated
	 */
	EClass getFileReference();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.traceability.FileReference#getFileURI <em>File URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File URI</em>'.
	 * @see org.kermeta.traceability.FileReference#getFileURI()
	 * @see #getFileReference()
	 * @generated
	 */
	EAttribute getFileReference_FileURI();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.traceability.FileReference#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.kermeta.traceability.FileReference#getTimeStamp()
	 * @see #getFileReference()
	 * @generated
	 */
	EAttribute getFileReference_TimeStamp();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.TextReference <em>Text Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Reference</em>'.
	 * @see org.kermeta.traceability.TextReference
	 * @generated
	 */
	EClass getTextReference();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.traceability.TextReference#getCharBeginOffset <em>Char Begin Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Begin Offset</em>'.
	 * @see org.kermeta.traceability.TextReference#getCharBeginOffset()
	 * @see #getTextReference()
	 * @generated
	 */
	EAttribute getTextReference_CharBeginOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.traceability.TextReference#getCharEndOffset <em>Char End Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char End Offset</em>'.
	 * @see org.kermeta.traceability.TextReference#getCharEndOffset()
	 * @see #getTextReference()
	 * @generated
	 */
	EAttribute getTextReference_CharEndOffset();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.XMLReference <em>XML Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Reference</em>'.
	 * @see org.kermeta.traceability.XMLReference
	 * @generated
	 */
	EClass getXMLReference();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.traceability.XMLReference#getXPointer <em>XPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPointer</em>'.
	 * @see org.kermeta.traceability.XMLReference#getXPointer()
	 * @see #getXMLReference()
	 * @generated
	 */
	EAttribute getXMLReference_XPointer();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.kermeta.traceability.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.traceability.ModelReference#getRefObject <em>Ref Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Object</em>'.
	 * @see org.kermeta.traceability.ModelReference#getRefObject()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_RefObject();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.QualifiedNameReference <em>Qualified Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name Reference</em>'.
	 * @see org.kermeta.traceability.QualifiedNameReference
	 * @generated
	 */
	EClass getQualifiedNameReference();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.traceability.QualifiedNameReference#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.kermeta.traceability.QualifiedNameReference#getQualifiedName()
	 * @see #getQualifiedNameReference()
	 * @generated
	 */
	EAttribute getQualifiedNameReference_QualifiedName();

	/**
	 * Returns the meta object for class '{@link org.kermeta.traceability.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable</em>'.
	 * @see org.kermeta.traceability.Traceable
	 * @generated
	 */
	EClass getTraceable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.traceability.Traceable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.kermeta.traceability.Traceable#getTarget()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.traceability.Traceable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.kermeta.traceability.Traceable#getSource()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_Source();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.TracePackageImpl <em>Trace Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.TracePackageImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTracePackage()
		 * @generated
		 */
		EClass TRACE_PACKAGE = eINSTANCE.getTracePackage();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PACKAGE__REFERENCES = eINSTANCE.getTracePackage_References();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PACKAGE__SUBPACKAGE = eINSTANCE.getTracePackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PACKAGE__CONTEXTS = eINSTANCE.getTracePackage_Contexts();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.TraceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Source Elem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCE_ELEM = eINSTANCE.getTrace_SourceElem();

		/**
		 * The meta object literal for the '<em><b>Target Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGET_ELEM = eINSTANCE.getTrace_TargetElem();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CONTEXT = eINSTANCE.getTrace_Context();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.ReferenceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Trace Mdl</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TRACE_MDL = eINSTANCE.getReference_TraceMdl();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.FileReferenceImpl <em>File Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.FileReferenceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getFileReference()
		 * @generated
		 */
		EClass FILE_REFERENCE = eINSTANCE.getFileReference();

		/**
		 * The meta object literal for the '<em><b>File URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REFERENCE__FILE_URI = eINSTANCE.getFileReference_FileURI();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REFERENCE__TIME_STAMP = eINSTANCE.getFileReference_TimeStamp();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.TextReferenceImpl <em>Text Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.TextReferenceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTextReference()
		 * @generated
		 */
		EClass TEXT_REFERENCE = eINSTANCE.getTextReference();

		/**
		 * The meta object literal for the '<em><b>Char Begin Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_REFERENCE__CHAR_BEGIN_OFFSET = eINSTANCE.getTextReference_CharBeginOffset();

		/**
		 * The meta object literal for the '<em><b>Char End Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_REFERENCE__CHAR_END_OFFSET = eINSTANCE.getTextReference_CharEndOffset();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.XMLReferenceImpl <em>XML Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.XMLReferenceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getXMLReference()
		 * @generated
		 */
		EClass XML_REFERENCE = eINSTANCE.getXMLReference();

		/**
		 * The meta object literal for the '<em><b>XPointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_REFERENCE__XPOINTER = eINSTANCE.getXMLReference_XPointer();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.ModelReferenceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Ref Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__REF_OBJECT = eINSTANCE.getModelReference_RefObject();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.QualifiedNameReferenceImpl <em>Qualified Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.QualifiedNameReferenceImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getQualifiedNameReference()
		 * @generated
		 */
		EClass QUALIFIED_NAME_REFERENCE = eINSTANCE.getQualifiedNameReference();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME_REFERENCE__QUALIFIED_NAME = eINSTANCE.getQualifiedNameReference_QualifiedName();

		/**
		 * The meta object literal for the '{@link org.kermeta.traceability.impl.TraceableImpl <em>Traceable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.traceability.impl.TraceableImpl
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getTraceable()
		 * @generated
		 */
		EClass TRACEABLE = eINSTANCE.getTraceable();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__TARGET = eINSTANCE.getTraceable_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__SOURCE = eINSTANCE.getTraceable_Source();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.kermeta.traceability.impl.TraceabilityPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //TraceabilityPackage
