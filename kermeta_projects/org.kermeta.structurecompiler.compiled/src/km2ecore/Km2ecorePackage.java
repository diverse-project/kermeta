/**
 * <copyright>
 * </copyright>
 *
 * $Id: Km2ecorePackage.java,v 1.3 2008-09-22 14:48:57 cfaucher Exp $
 */
package km2ecore;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see km2ecore.Km2ecoreFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/km2ecore'"
 * @generated
 */
public interface Km2ecorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "km2ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/km2ecore/kermeta_temp_uri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Km2ecorePackage eINSTANCE = km2ecore.impl.Km2ecorePackageImpl.init();

	/**
	 * The meta object id for the '{@link km2ecore.impl.SourceTracerImpl <em>Source Tracer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.impl.SourceTracerImpl
	 * @see km2ecore.impl.Km2ecorePackageImpl#getSourceTracer()
	 * @generated
	 */
	int SOURCE_TRACER = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Source Tracer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TRACER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.impl.KM2EcoreContextImpl <em>KM2 Ecore Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.impl.KM2EcoreContextImpl
	 * @see km2ecore.impl.Km2ecorePackageImpl#getKM2EcoreContext()
	 * @generated
	 */
	int KM2_ECORE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Java Key Word List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trace Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__TRACE_MODEL = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VARIABLE EXCEPTION SWITCHER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Of Last Ft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__RESULT_OF_LAST_FT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ft Suffix Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION = StructurePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>KR Error Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__KR_ERROR_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__TYPE_SEPARATOR = StructurePackage.OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inc result Last Statement Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value Type Mapping</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING = StructurePackage.OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RETURN EXPRESSION TO REPLACE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE = StructurePackage.OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__MODE = StructurePackage.OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>NOT EVALUATED MESSAGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE = StructurePackage.OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Static Operation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE = StructurePackage.OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Km Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__KM_INPUT = StructurePackage.OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ecore Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__ECORE_OUTPUTS = StructurePackage.OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Input Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__INPUT_REPOSITORY = StructurePackage.OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cond Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__COND_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ft Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Output Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY = StructurePackage.OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>SEPARATOR STATEMENT FT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT = StructurePackage.OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Last Statement Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__LAST_STATEMENT_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Simk Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__SIMK_OUTPUT = StructurePackage.OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Result Last Statement Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Framework Operations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS = StructurePackage.OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>JAVA CLASS EXCEPTION SWITCHER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER = StructurePackage.OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>COLLECTION UTIL CLASS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS = StructurePackage.OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>After Lbd Exp Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION = StructurePackage.OBJECT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Inc kR Error Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Compiled Java Extern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN = StructurePackage.OBJECT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>FUNCTION TYPE COMPILATION TASK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK = StructurePackage.OBJECT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Traceability Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__TRACEABILITY_INPUT = StructurePackage.OBJECT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Current value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Ft Suffix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_SUFFIX = StructurePackage.OBJECT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Before Function Type Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT = StructurePackage.OBJECT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Tasks stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__TASKS_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inc cond Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__INC_COND_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__MU = StructurePackage.OBJECT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Simk Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__SIMK_MODEL = StructurePackage.OBJECT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Ft Map Type Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Ft Product Type Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK = StructurePackage.OBJECT_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Current param ft</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__CURRENT_PARAM_FT = StructurePackage.OBJECT_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Ft Contextual Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF = StructurePackage.OBJECT_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>PREVIOUS STATEMENT FT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT = StructurePackage.OBJECT_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>SELF EXPRESSION TO REPLACE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE = StructurePackage.OBJECT_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Before Lambda Expression Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT = StructurePackage.OBJECT_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Ft Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__FT_RETURN_TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Inc ft Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT__INC_FT_SUFFIX = StructurePackage.OBJECT_FEATURE_COUNT + 46;

	/**
	 * The number of structural features of the '<em>KM2 Ecore Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM2_ECORE_CONTEXT_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 47;

	/**
	 * The meta object id for the '{@link km2ecore.CompilingMode <em>Compiling Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.CompilingMode
	 * @see km2ecore.impl.Km2ecorePackageImpl#getCompilingMode()
	 * @generated
	 */
	int COMPILING_MODE = 2;

	/**
	 * Returns the meta object for class '{@link km2ecore.SourceTracer <em>Source Tracer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Tracer</em>'.
	 * @see km2ecore.SourceTracer
	 * @generated
	 */
	EClass getSourceTracer();

	/**
	 * Returns the meta object for class '{@link km2ecore.KM2EcoreContext <em>KM2 Ecore Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KM2 Ecore Context</em>'.
	 * @see km2ecore.KM2EcoreContext
	 * @generated
	 */
	EClass getKM2EcoreContext();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getJavaKeyWordList <em>Java Key Word List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Key Word List</em>'.
	 * @see km2ecore.KM2EcoreContext#getJavaKeyWordList()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_JavaKeyWordList();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace Model</em>'.
	 * @see km2ecore.KM2EcoreContext#getTraceModel()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_TraceModel();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getVARIABLE_EXCEPTION_SWITCHER <em>VARIABLE EXCEPTION SWITCHER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VARIABLE EXCEPTION SWITCHER</em>'.
	 * @see km2ecore.KM2EcoreContext#getVARIABLE_EXCEPTION_SWITCHER()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_VARIABLE_EXCEPTION_SWITCHER();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getResultOfLastFt <em>Result Of Last Ft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Of Last Ft</em>'.
	 * @see km2ecore.KM2EcoreContext#getResultOfLastFt()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_ResultOfLastFt();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getFtSuffixActivation <em>Ft Suffix Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ft Suffix Activation</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtSuffixActivation()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_FtSuffixActivation();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getKRErrorStack <em>KR Error Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>KR Error Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getKRErrorStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_KRErrorStack();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getTYPE_SEPARATOR <em>TYPE SEPARATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TYPE SEPARATOR</em>'.
	 * @see km2ecore.KM2EcoreContext#getTYPE_SEPARATOR()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_TYPE_SEPARATOR();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getInc_resultLastStatementStack <em>Inc result Last Statement Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc result Last Statement Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getInc_resultLastStatementStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_Inc_resultLastStatementStack();

	/**
	 * Returns the meta object for the attribute list '{@link km2ecore.KM2EcoreContext#getValueTypeMapping <em>Value Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Type Mapping</em>'.
	 * @see km2ecore.KM2EcoreContext#getValueTypeMapping()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_ValueTypeMapping();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getRETURN_EXPRESSION_TO_REPLACE <em>RETURN EXPRESSION TO REPLACE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RETURN EXPRESSION TO REPLACE</em>'.
	 * @see km2ecore.KM2EcoreContext#getRETURN_EXPRESSION_TO_REPLACE()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_RETURN_EXPRESSION_TO_REPLACE();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see km2ecore.KM2EcoreContext#getMode()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_Mode();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getNOT_EVALUATED_MESSAGE <em>NOT EVALUATED MESSAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOT EVALUATED MESSAGE</em>'.
	 * @see km2ecore.KM2EcoreContext#getNOT_EVALUATED_MESSAGE()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_NOT_EVALUATED_MESSAGE();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getStaticOperationMode <em>Static Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Operation Mode</em>'.
	 * @see km2ecore.KM2EcoreContext#getStaticOperationMode()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_StaticOperationMode();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getKmInput <em>Km Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Km Input</em>'.
	 * @see km2ecore.KM2EcoreContext#getKmInput()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_KmInput();

	/**
	 * Returns the meta object for the attribute list '{@link km2ecore.KM2EcoreContext#getEcoreOutputs <em>Ecore Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ecore Outputs</em>'.
	 * @see km2ecore.KM2EcoreContext#getEcoreOutputs()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_EcoreOutputs();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getInputRepository <em>Input Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Repository</em>'.
	 * @see km2ecore.KM2EcoreContext#getInputRepository()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_InputRepository();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getCondStack <em>Cond Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cond Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getCondStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_CondStack();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getFtStack <em>Ft Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ft Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_FtStack();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getOutputRepository <em>Output Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Repository</em>'.
	 * @see km2ecore.KM2EcoreContext#getOutputRepository()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_OutputRepository();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getSEPARATOR_STATEMENT_FT <em>SEPARATOR STATEMENT FT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SEPARATOR STATEMENT FT</em>'.
	 * @see km2ecore.KM2EcoreContext#getSEPARATOR_STATEMENT_FT()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_SEPARATOR_STATEMENT_FT();

	/**
	 * Returns the meta object for the containment reference '{@link km2ecore.KM2EcoreContext#getLastStatementStack <em>Last Statement Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Statement Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getLastStatementStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_LastStatementStack();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getSimkOutput <em>Simk Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simk Output</em>'.
	 * @see km2ecore.KM2EcoreContext#getSimkOutput()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_SimkOutput();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getResultLastStatementStack <em>Result Last Statement Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Last Statement Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getResultLastStatementStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_ResultLastStatementStack();

	/**
	 * Returns the meta object for the attribute list '{@link km2ecore.KM2EcoreContext#getFrameworkOperations <em>Framework Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Framework Operations</em>'.
	 * @see km2ecore.KM2EcoreContext#getFrameworkOperations()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_FrameworkOperations();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getJAVA_CLASS_EXCEPTION_SWITCHER <em>JAVA CLASS EXCEPTION SWITCHER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JAVA CLASS EXCEPTION SWITCHER</em>'.
	 * @see km2ecore.KM2EcoreContext#getJAVA_CLASS_EXCEPTION_SWITCHER()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_JAVA_CLASS_EXCEPTION_SWITCHER();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getCOLLECTION_UTIL_CLASS <em>COLLECTION UTIL CLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COLLECTION UTIL CLASS</em>'.
	 * @see km2ecore.KM2EcoreContext#getCOLLECTION_UTIL_CLASS()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_COLLECTION_UTIL_CLASS();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getAfterLbdExpActivation <em>After Lbd Exp Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Lbd Exp Activation</em>'.
	 * @see km2ecore.KM2EcoreContext#getAfterLbdExpActivation()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_AfterLbdExpActivation();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getInc_kRErrorStack <em>Inc kR Error Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc kR Error Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getInc_kRErrorStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_Inc_kRErrorStack();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getCompiledJavaExtern <em>Compiled Java Extern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compiled Java Extern</em>'.
	 * @see km2ecore.KM2EcoreContext#getCompiledJavaExtern()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_CompiledJavaExtern();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getFUNCTION_TYPE_COMPILATION_TASK <em>FUNCTION TYPE COMPILATION TASK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FUNCTION TYPE COMPILATION TASK</em>'.
	 * @see km2ecore.KM2EcoreContext#getFUNCTION_TYPE_COMPILATION_TASK()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_FUNCTION_TYPE_COMPILATION_TASK();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getTraceabilityInput <em>Traceability Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Input</em>'.
	 * @see km2ecore.KM2EcoreContext#getTraceabilityInput()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_TraceabilityInput();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getCurrent_valueType <em>Current value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current value Type</em>'.
	 * @see km2ecore.KM2EcoreContext#getCurrent_valueType()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_Current_valueType();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getFtSuffix <em>Ft Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ft Suffix</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtSuffix()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_FtSuffix();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getBeforeFunctionTypeResult <em>Before Function Type Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Function Type Result</em>'.
	 * @see km2ecore.KM2EcoreContext#getBeforeFunctionTypeResult()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_BeforeFunctionTypeResult();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getTasks_stack <em>Tasks stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tasks stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getTasks_stack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_Tasks_stack();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getInc_condStack <em>Inc cond Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc cond Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getInc_condStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_Inc_condStack();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mu</em>'.
	 * @see km2ecore.KM2EcoreContext#getMu()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_Mu();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getSimkModel <em>Simk Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simk Model</em>'.
	 * @see km2ecore.KM2EcoreContext#getSimkModel()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_SimkModel();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getFtMapTypeStack <em>Ft Map Type Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ft Map Type Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtMapTypeStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_FtMapTypeStack();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getFtProductTypeStack <em>Ft Product Type Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ft Product Type Stack</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtProductTypeStack()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_FtProductTypeStack();

	/**
	 * Returns the meta object for the reference '{@link km2ecore.KM2EcoreContext#getCurrent_param_ft <em>Current param ft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current param ft</em>'.
	 * @see km2ecore.KM2EcoreContext#getCurrent_param_ft()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EReference getKM2EcoreContext_Current_param_ft();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getFtContextualSelf <em>Ft Contextual Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ft Contextual Self</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtContextualSelf()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_FtContextualSelf();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getPREVIOUS_STATEMENT_FT <em>PREVIOUS STATEMENT FT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PREVIOUS STATEMENT FT</em>'.
	 * @see km2ecore.KM2EcoreContext#getPREVIOUS_STATEMENT_FT()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_PREVIOUS_STATEMENT_FT();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getSELF_EXPRESSION_TO_REPLACE <em>SELF EXPRESSION TO REPLACE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SELF EXPRESSION TO REPLACE</em>'.
	 * @see km2ecore.KM2EcoreContext#getSELF_EXPRESSION_TO_REPLACE()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_SELF_EXPRESSION_TO_REPLACE();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Lambda Expression Result</em>'.
	 * @see km2ecore.KM2EcoreContext#getBeforeLambdaExpressionResult()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_BeforeLambdaExpressionResult();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getFtReturnType <em>Ft Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ft Return Type</em>'.
	 * @see km2ecore.KM2EcoreContext#getFtReturnType()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_FtReturnType();

	/**
	 * Returns the meta object for the attribute '{@link km2ecore.KM2EcoreContext#getInc_ftSuffix <em>Inc ft Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc ft Suffix</em>'.
	 * @see km2ecore.KM2EcoreContext#getInc_ftSuffix()
	 * @see #getKM2EcoreContext()
	 * @generated
	 */
	EAttribute getKM2EcoreContext_Inc_ftSuffix();

	/**
	 * Returns the meta object for enum '{@link km2ecore.CompilingMode <em>Compiling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compiling Mode</em>'.
	 * @see km2ecore.CompilingMode
	 * @generated
	 */
	EEnum getCompilingMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Km2ecoreFactory getKm2ecoreFactory();

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
		 * The meta object literal for the '{@link km2ecore.impl.SourceTracerImpl <em>Source Tracer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.impl.SourceTracerImpl
		 * @see km2ecore.impl.Km2ecorePackageImpl#getSourceTracer()
		 * @generated
		 */
		EClass SOURCE_TRACER = eINSTANCE.getSourceTracer();

		/**
		 * The meta object literal for the '{@link km2ecore.impl.KM2EcoreContextImpl <em>KM2 Ecore Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.impl.KM2EcoreContextImpl
		 * @see km2ecore.impl.Km2ecorePackageImpl#getKM2EcoreContext()
		 * @generated
		 */
		EClass KM2_ECORE_CONTEXT = eINSTANCE.getKM2EcoreContext();

		/**
		 * The meta object literal for the '<em><b>Java Key Word List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST = eINSTANCE
				.getKM2EcoreContext_JavaKeyWordList();

		/**
		 * The meta object literal for the '<em><b>Trace Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__TRACE_MODEL = eINSTANCE
				.getKM2EcoreContext_TraceModel();

		/**
		 * The meta object literal for the '<em><b>VARIABLE EXCEPTION SWITCHER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER = eINSTANCE
				.getKM2EcoreContext_VARIABLE_EXCEPTION_SWITCHER();

		/**
		 * The meta object literal for the '<em><b>Result Of Last Ft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__RESULT_OF_LAST_FT = eINSTANCE
				.getKM2EcoreContext_ResultOfLastFt();

		/**
		 * The meta object literal for the '<em><b>Ft Suffix Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION = eINSTANCE
				.getKM2EcoreContext_FtSuffixActivation();

		/**
		 * The meta object literal for the '<em><b>KR Error Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__KR_ERROR_STACK = eINSTANCE
				.getKM2EcoreContext_KRErrorStack();

		/**
		 * The meta object literal for the '<em><b>TYPE SEPARATOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__TYPE_SEPARATOR = eINSTANCE
				.getKM2EcoreContext_TYPE_SEPARATOR();

		/**
		 * The meta object literal for the '<em><b>Inc result Last Statement Stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK = eINSTANCE
				.getKM2EcoreContext_Inc_resultLastStatementStack();

		/**
		 * The meta object literal for the '<em><b>Value Type Mapping</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING = eINSTANCE
				.getKM2EcoreContext_ValueTypeMapping();

		/**
		 * The meta object literal for the '<em><b>RETURN EXPRESSION TO REPLACE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE = eINSTANCE
				.getKM2EcoreContext_RETURN_EXPRESSION_TO_REPLACE();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__MODE = eINSTANCE
				.getKM2EcoreContext_Mode();

		/**
		 * The meta object literal for the '<em><b>NOT EVALUATED MESSAGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE = eINSTANCE
				.getKM2EcoreContext_NOT_EVALUATED_MESSAGE();

		/**
		 * The meta object literal for the '<em><b>Static Operation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE = eINSTANCE
				.getKM2EcoreContext_StaticOperationMode();

		/**
		 * The meta object literal for the '<em><b>Km Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__KM_INPUT = eINSTANCE
				.getKM2EcoreContext_KmInput();

		/**
		 * The meta object literal for the '<em><b>Ecore Outputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__ECORE_OUTPUTS = eINSTANCE
				.getKM2EcoreContext_EcoreOutputs();

		/**
		 * The meta object literal for the '<em><b>Input Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__INPUT_REPOSITORY = eINSTANCE
				.getKM2EcoreContext_InputRepository();

		/**
		 * The meta object literal for the '<em><b>Cond Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__COND_STACK = eINSTANCE
				.getKM2EcoreContext_CondStack();

		/**
		 * The meta object literal for the '<em><b>Ft Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__FT_STACK = eINSTANCE
				.getKM2EcoreContext_FtStack();

		/**
		 * The meta object literal for the '<em><b>Output Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY = eINSTANCE
				.getKM2EcoreContext_OutputRepository();

		/**
		 * The meta object literal for the '<em><b>SEPARATOR STATEMENT FT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT = eINSTANCE
				.getKM2EcoreContext_SEPARATOR_STATEMENT_FT();

		/**
		 * The meta object literal for the '<em><b>Last Statement Stack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__LAST_STATEMENT_STACK = eINSTANCE
				.getKM2EcoreContext_LastStatementStack();

		/**
		 * The meta object literal for the '<em><b>Simk Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__SIMK_OUTPUT = eINSTANCE
				.getKM2EcoreContext_SimkOutput();

		/**
		 * The meta object literal for the '<em><b>Result Last Statement Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK = eINSTANCE
				.getKM2EcoreContext_ResultLastStatementStack();

		/**
		 * The meta object literal for the '<em><b>Framework Operations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS = eINSTANCE
				.getKM2EcoreContext_FrameworkOperations();

		/**
		 * The meta object literal for the '<em><b>JAVA CLASS EXCEPTION SWITCHER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER = eINSTANCE
				.getKM2EcoreContext_JAVA_CLASS_EXCEPTION_SWITCHER();

		/**
		 * The meta object literal for the '<em><b>COLLECTION UTIL CLASS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS = eINSTANCE
				.getKM2EcoreContext_COLLECTION_UTIL_CLASS();

		/**
		 * The meta object literal for the '<em><b>After Lbd Exp Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION = eINSTANCE
				.getKM2EcoreContext_AfterLbdExpActivation();

		/**
		 * The meta object literal for the '<em><b>Inc kR Error Stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK = eINSTANCE
				.getKM2EcoreContext_Inc_kRErrorStack();

		/**
		 * The meta object literal for the '<em><b>Compiled Java Extern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN = eINSTANCE
				.getKM2EcoreContext_CompiledJavaExtern();

		/**
		 * The meta object literal for the '<em><b>FUNCTION TYPE COMPILATION TASK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK = eINSTANCE
				.getKM2EcoreContext_FUNCTION_TYPE_COMPILATION_TASK();

		/**
		 * The meta object literal for the '<em><b>Traceability Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__TRACEABILITY_INPUT = eINSTANCE
				.getKM2EcoreContext_TraceabilityInput();

		/**
		 * The meta object literal for the '<em><b>Current value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE = eINSTANCE
				.getKM2EcoreContext_Current_valueType();

		/**
		 * The meta object literal for the '<em><b>Ft Suffix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__FT_SUFFIX = eINSTANCE
				.getKM2EcoreContext_FtSuffix();

		/**
		 * The meta object literal for the '<em><b>Before Function Type Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT = eINSTANCE
				.getKM2EcoreContext_BeforeFunctionTypeResult();

		/**
		 * The meta object literal for the '<em><b>Tasks stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__TASKS_STACK = eINSTANCE
				.getKM2EcoreContext_Tasks_stack();

		/**
		 * The meta object literal for the '<em><b>Inc cond Stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__INC_COND_STACK = eINSTANCE
				.getKM2EcoreContext_Inc_condStack();

		/**
		 * The meta object literal for the '<em><b>Mu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__MU = eINSTANCE.getKM2EcoreContext_Mu();

		/**
		 * The meta object literal for the '<em><b>Simk Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__SIMK_MODEL = eINSTANCE
				.getKM2EcoreContext_SimkModel();

		/**
		 * The meta object literal for the '<em><b>Ft Map Type Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK = eINSTANCE
				.getKM2EcoreContext_FtMapTypeStack();

		/**
		 * The meta object literal for the '<em><b>Ft Product Type Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK = eINSTANCE
				.getKM2EcoreContext_FtProductTypeStack();

		/**
		 * The meta object literal for the '<em><b>Current param ft</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KM2_ECORE_CONTEXT__CURRENT_PARAM_FT = eINSTANCE
				.getKM2EcoreContext_Current_param_ft();

		/**
		 * The meta object literal for the '<em><b>Ft Contextual Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF = eINSTANCE
				.getKM2EcoreContext_FtContextualSelf();

		/**
		 * The meta object literal for the '<em><b>PREVIOUS STATEMENT FT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT = eINSTANCE
				.getKM2EcoreContext_PREVIOUS_STATEMENT_FT();

		/**
		 * The meta object literal for the '<em><b>SELF EXPRESSION TO REPLACE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE = eINSTANCE
				.getKM2EcoreContext_SELF_EXPRESSION_TO_REPLACE();

		/**
		 * The meta object literal for the '<em><b>Before Lambda Expression Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT = eINSTANCE
				.getKM2EcoreContext_BeforeLambdaExpressionResult();

		/**
		 * The meta object literal for the '<em><b>Ft Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__FT_RETURN_TYPE = eINSTANCE
				.getKM2EcoreContext_FtReturnType();

		/**
		 * The meta object literal for the '<em><b>Inc ft Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM2_ECORE_CONTEXT__INC_FT_SUFFIX = eINSTANCE
				.getKM2EcoreContext_Inc_ftSuffix();

		/**
		 * The meta object literal for the '{@link km2ecore.CompilingMode <em>Compiling Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.CompilingMode
		 * @see km2ecore.impl.Km2ecorePackageImpl#getCompilingMode()
		 * @generated
		 */
		EEnum COMPILING_MODE = eINSTANCE.getCompilingMode();

	}

} //Km2ecorePackage
