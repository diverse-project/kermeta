/**
 * <copyright>
 * </copyright>
 *
 * $Id: KM2EcoreContextImpl.java,v 1.7 2008-10-29 08:29:18 cfaucher Exp $
 */
package km2ecore.impl;

import java.util.Collection;

import kermeta.language.behavior.LambdaExpression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.ProductType;
import kermeta.language.structure.Type;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.persistence.EMFRepository;

import kermeta.utils.Hashtable;
import kermeta.utils.Stack;

import km2ecore.CompilingMode;
import km2ecore.KM2EcoreContext;
import km2ecore.Km2ecorePackage;

import km2ecore.common.JavaKeyWordList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import simk.SIMKModel;

import traceability.TraceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KM2 Ecore Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getJavaKeyWordList <em>Java Key Word List</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getTraceModel <em>Trace Model</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getTYPE_SEPARATOR <em>TYPE SEPARATOR</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getNOT_EVALUATED_MESSAGE <em>NOT EVALUATED MESSAGE</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getSEPARATOR_STATEMENT_FT <em>SEPARATOR STATEMENT FT</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getInputRepository <em>Input Repository</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getOutputRepository <em>Output Repository</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getResultLastStatementStack <em>Result Last Statement Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFrameworkOperations <em>Framework Operations</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getCOLLECTION_UTIL_CLASS <em>COLLECTION UTIL CLASS</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getCompiledJavaExtern <em>Compiled Java Extern</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getCurrent_valueType <em>Current value Type</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtSuffix <em>Ft Suffix</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getInc_condStack <em>Inc cond Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getBeforeFunctionTypeResult <em>Before Function Type Result</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getJAVA_SEPARATOR <em>JAVA SEPARATOR</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtMapTypeStack <em>Ft Map Type Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getSimkModel <em>Simk Model</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtProductTypeStack <em>Ft Product Type Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getCurrent_param_ft <em>Current param ft</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getPREVIOUS_STATEMENT_FT <em>PREVIOUS STATEMENT FT</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtContextualSelf <em>Ft Contextual Self</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getJAVA_CLASS_EXECUTION_CONTEXT <em>JAVA CLASS EXECUTION CONTEXT</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtReturnType <em>Ft Return Type</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getVARIABLE_EXCEPTION_SWITCHER <em>VARIABLE EXCEPTION SWITCHER</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtSuffixActivation <em>Ft Suffix Activation</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getKRErrorStack <em>KR Error Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getRETURN_EXPRESSION_TO_REPLACE_SPECIAL <em>RETURN EXPRESSION TO REPLACE SPECIAL</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getInc_resultLastStatementStack <em>Inc result Last Statement Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getRETURN_EXPRESSION_TO_REPLACE <em>RETURN EXPRESSION TO REPLACE</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getValueTypeMapping <em>Value Type Mapping</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getStaticOperationMode <em>Static Operation Mode</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getKmInput <em>Km Input</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFtStack <em>Ft Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getCondStack <em>Cond Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getEcoreOutputs <em>Ecore Outputs</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getSimkOutput <em>Simk Output</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getJAVA_CLASS_EXCEPTION_SWITCHER <em>JAVA CLASS EXCEPTION SWITCHER</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getAfterLbdExpActivation <em>After Lbd Exp Activation</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getInc_kRErrorStack <em>Inc kR Error Stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getFUNCTION_TYPE_COMPILATION_TASK <em>FUNCTION TYPE COMPILATION TASK</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getTraceabilityInput <em>Traceability Input</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getTasks_stack <em>Tasks stack</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getSELF_EXPRESSION_TO_REPLACE <em>SELF EXPRESSION TO REPLACE</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getKERMETA_SEPARATOR <em>KERMETA SEPARATOR</em>}</li>
 *   <li>{@link km2ecore.impl.KM2EcoreContextImpl#getInc_ftSuffix <em>Inc ft Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KM2EcoreContextImpl extends ObjectImpl implements KM2EcoreContext {
	/**
	 * The cached value of the '{@link #getJavaKeyWordList() <em>Java Key Word List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaKeyWordList()
	 * @generated
	 * @ordered
	 */
	protected JavaKeyWordList javaKeyWordList;

	/**
	 * The cached value of the '{@link #getTraceModel() <em>Trace Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceModel()
	 * @generated
	 * @ordered
	 */
	protected TraceModel traceModel;

	/**
	 * The default value of the '{@link #getTYPE_SEPARATOR() <em>TYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTYPE_SEPARATOR() <em>TYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String typE_SEPARATOR = TYPE_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNOT_EVALUATED_MESSAGE() <em>NOT EVALUATED MESSAGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOT_EVALUATED_MESSAGE()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_EVALUATED_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNOT_EVALUATED_MESSAGE() <em>NOT EVALUATED MESSAGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOT_EVALUATED_MESSAGE()
	 * @generated
	 * @ordered
	 */
	protected String noT_EVALUATED_MESSAGE = NOT_EVALUATED_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSEPARATOR_STATEMENT_FT() <em>SEPARATOR STATEMENT FT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEPARATOR_STATEMENT_FT()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_STATEMENT_FT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSEPARATOR_STATEMENT_FT() <em>SEPARATOR STATEMENT FT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEPARATOR_STATEMENT_FT()
	 * @generated
	 * @ordered
	 */
	protected String separatoR_STATEMENT_FT = SEPARATOR_STATEMENT_FT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputRepository() <em>Input Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRepository()
	 * @generated
	 * @ordered
	 */
	protected EMFRepository inputRepository;

	/**
	 * The cached value of the '{@link #getOutputRepository() <em>Output Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRepository()
	 * @generated
	 * @ordered
	 */
	protected EMFRepository outputRepository;

	/**
	 * The cached value of the '{@link #getResultLastStatementStack() <em>Result Last Statement Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultLastStatementStack()
	 * @generated
	 * @ordered
	 */
	protected Stack<String> resultLastStatementStack;

	/**
	 * The cached value of the '{@link #getFrameworkOperations() <em>Framework Operations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> frameworkOperations;

	/**
	 * The default value of the '{@link #getCOLLECTION_UTIL_CLASS() <em>COLLECTION UTIL CLASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOLLECTION_UTIL_CLASS()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_UTIL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOLLECTION_UTIL_CLASS() <em>COLLECTION UTIL CLASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOLLECTION_UTIL_CLASS()
	 * @generated
	 * @ordered
	 */
	protected String collectioN_UTIL_CLASS = COLLECTION_UTIL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompiledJavaExtern() <em>Compiled Java Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiledJavaExtern()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPILED_JAVA_EXTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompiledJavaExtern() <em>Compiled Java Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiledJavaExtern()
	 * @generated
	 * @ordered
	 */
	protected String compiledJavaExtern = COMPILED_JAVA_EXTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrent_valueType() <em>Current value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_valueType()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition current_valueType;

	/**
	 * The cached value of the '{@link #getFtSuffix() <em>Ft Suffix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtSuffix()
	 * @generated
	 * @ordered
	 */
	protected Stack<String> ftSuffix;

	/**
	 * The default value of the '{@link #getInc_condStack() <em>Inc cond Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_condStack()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INC_COND_STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInc_condStack() <em>Inc cond Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_condStack()
	 * @generated
	 * @ordered
	 */
	protected Integer inc_condStack = INC_COND_STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeFunctionTypeResult() <em>Before Function Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFunctionTypeResult()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_FUNCTION_TYPE_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeforeFunctionTypeResult() <em>Before Function Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFunctionTypeResult()
	 * @generated
	 * @ordered
	 */
	protected String beforeFunctionTypeResult = BEFORE_FUNCTION_TYPE_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJAVA_SEPARATOR() <em>JAVA SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAVA_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJAVA_SEPARATOR() <em>JAVA SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAVA_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String javA_SEPARATOR = JAVA_SEPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFtMapTypeStack() <em>Ft Map Type Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtMapTypeStack()
	 * @generated
	 * @ordered
	 */
	protected Stack<Hashtable<Type, Type>> ftMapTypeStack;

	/**
	 * The cached value of the '{@link #getSimkModel() <em>Simk Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimkModel()
	 * @generated
	 * @ordered
	 */
	protected SIMKModel simkModel;

	/**
	 * The cached value of the '{@link #getFtProductTypeStack() <em>Ft Product Type Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtProductTypeStack()
	 * @generated
	 * @ordered
	 */
	protected Stack<ProductType> ftProductTypeStack;

	/**
	 * The cached value of the '{@link #getCurrent_param_ft() <em>Current param ft</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_param_ft()
	 * @generated
	 * @ordered
	 */
	protected Stack<String> current_param_ft;

	/**
	 * The default value of the '{@link #getPREVIOUS_STATEMENT_FT() <em>PREVIOUS STATEMENT FT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPREVIOUS_STATEMENT_FT()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_STATEMENT_FT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPREVIOUS_STATEMENT_FT() <em>PREVIOUS STATEMENT FT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPREVIOUS_STATEMENT_FT()
	 * @generated
	 * @ordered
	 */
	protected String previouS_STATEMENT_FT = PREVIOUS_STATEMENT_FT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtContextualSelf() <em>Ft Contextual Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtContextualSelf()
	 * @generated
	 * @ordered
	 */
	protected static final String FT_CONTEXTUAL_SELF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtContextualSelf() <em>Ft Contextual Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtContextualSelf()
	 * @generated
	 * @ordered
	 */
	protected String ftContextualSelf = FT_CONTEXTUAL_SELF_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeLambdaExpressionResult() <em>Before Lambda Expression Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeLambdaExpressionResult()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeforeLambdaExpressionResult() <em>Before Lambda Expression Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeLambdaExpressionResult()
	 * @generated
	 * @ordered
	 */
	protected String beforeLambdaExpressionResult = BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJAVA_CLASS_EXECUTION_CONTEXT() <em>JAVA CLASS EXECUTION CONTEXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAVA_CLASS_EXECUTION_CONTEXT()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_EXECUTION_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJAVA_CLASS_EXECUTION_CONTEXT() <em>JAVA CLASS EXECUTION CONTEXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAVA_CLASS_EXECUTION_CONTEXT()
	 * @generated
	 * @ordered
	 */
	protected String javA_CLASS_EXECUTION_CONTEXT = JAVA_CLASS_EXECUTION_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtReturnType() <em>Ft Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String FT_RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtReturnType() <em>Ft Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtReturnType()
	 * @generated
	 * @ordered
	 */
	protected String ftReturnType = FT_RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVARIABLE_EXCEPTION_SWITCHER() <em>VARIABLE EXCEPTION SWITCHER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARIABLE_EXCEPTION_SWITCHER()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EXCEPTION_SWITCHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVARIABLE_EXCEPTION_SWITCHER() <em>VARIABLE EXCEPTION SWITCHER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARIABLE_EXCEPTION_SWITCHER()
	 * @generated
	 * @ordered
	 */
	protected String variablE_EXCEPTION_SWITCHER = VARIABLE_EXCEPTION_SWITCHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtSuffixActivation() <em>Ft Suffix Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtSuffixActivation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FT_SUFFIX_ACTIVATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFtSuffixActivation() <em>Ft Suffix Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtSuffixActivation()
	 * @generated
	 * @ordered
	 */
	protected Boolean ftSuffixActivation = FT_SUFFIX_ACTIVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKRErrorStack() <em>KR Error Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKRErrorStack()
	 * @generated
	 * @ordered
	 */
	protected Stack<String> kRErrorStack;

	/**
	 * The default value of the '{@link #getRETURN_EXPRESSION_TO_REPLACE_SPECIAL() <em>RETURN EXPRESSION TO REPLACE SPECIAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_EXPRESSION_TO_REPLACE_SPECIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRETURN_EXPRESSION_TO_REPLACE_SPECIAL() <em>RETURN EXPRESSION TO REPLACE SPECIAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()
	 * @generated
	 * @ordered
	 */
	protected String returN_EXPRESSION_TO_REPLACE_SPECIAL = RETURN_EXPRESSION_TO_REPLACE_SPECIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInc_resultLastStatementStack() <em>Inc result Last Statement Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_resultLastStatementStack()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INC_RESULT_LAST_STATEMENT_STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInc_resultLastStatementStack() <em>Inc result Last Statement Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_resultLastStatementStack()
	 * @generated
	 * @ordered
	 */
	protected Integer inc_resultLastStatementStack = INC_RESULT_LAST_STATEMENT_STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRETURN_EXPRESSION_TO_REPLACE() <em>RETURN EXPRESSION TO REPLACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRETURN_EXPRESSION_TO_REPLACE()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_EXPRESSION_TO_REPLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRETURN_EXPRESSION_TO_REPLACE() <em>RETURN EXPRESSION TO REPLACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRETURN_EXPRESSION_TO_REPLACE()
	 * @generated
	 * @ordered
	 */
	protected String returN_EXPRESSION_TO_REPLACE = RETURN_EXPRESSION_TO_REPLACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueTypeMapping() <em>Value Type Mapping</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<String> valueTypeMapping;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final CompilingMode MODE_EDEFAULT = CompilingMode.ONLY_ECORE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected CompilingMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticOperationMode() <em>Static Operation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticOperationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_OPERATION_MODE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getStaticOperationMode() <em>Static Operation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticOperationMode()
	 * @generated
	 * @ordered
	 */
	protected Boolean staticOperationMode = STATIC_OPERATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKmInput() <em>Km Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmInput()
	 * @generated
	 * @ordered
	 */
	protected static final String KM_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKmInput() <em>Km Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmInput()
	 * @generated
	 * @ordered
	 */
	protected String kmInput = KM_INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFtStack() <em>Ft Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtStack()
	 * @generated
	 * @ordered
	 */
	protected Stack<LambdaExpression> ftStack;

	/**
	 * The cached value of the '{@link #getCondStack() <em>Cond Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondStack()
	 * @generated
	 * @ordered
	 */
	protected Stack<String> condStack;

	/**
	 * The cached value of the '{@link #getEcoreOutputs() <em>Ecore Outputs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ecoreOutputs;

	/**
	 * The default value of the '{@link #getSimkOutput() <em>Simk Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimkOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMK_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimkOutput() <em>Simk Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimkOutput()
	 * @generated
	 * @ordered
	 */
	protected String simkOutput = SIMK_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJAVA_CLASS_EXCEPTION_SWITCHER() <em>JAVA CLASS EXCEPTION SWITCHER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAVA_CLASS_EXCEPTION_SWITCHER()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_EXCEPTION_SWITCHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJAVA_CLASS_EXCEPTION_SWITCHER() <em>JAVA CLASS EXCEPTION SWITCHER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAVA_CLASS_EXCEPTION_SWITCHER()
	 * @generated
	 * @ordered
	 */
	protected String javA_CLASS_EXCEPTION_SWITCHER = JAVA_CLASS_EXCEPTION_SWITCHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterLbdExpActivation() <em>After Lbd Exp Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterLbdExpActivation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AFTER_LBD_EXP_ACTIVATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAfterLbdExpActivation() <em>After Lbd Exp Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterLbdExpActivation()
	 * @generated
	 * @ordered
	 */
	protected Boolean afterLbdExpActivation = AFTER_LBD_EXP_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInc_kRErrorStack() <em>Inc kR Error Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_kRErrorStack()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INC_KR_ERROR_STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInc_kRErrorStack() <em>Inc kR Error Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_kRErrorStack()
	 * @generated
	 * @ordered
	 */
	protected Integer inc_kRErrorStack = INC_KR_ERROR_STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFUNCTION_TYPE_COMPILATION_TASK() <em>FUNCTION TYPE COMPILATION TASK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFUNCTION_TYPE_COMPILATION_TASK()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_TYPE_COMPILATION_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFUNCTION_TYPE_COMPILATION_TASK() <em>FUNCTION TYPE COMPILATION TASK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFUNCTION_TYPE_COMPILATION_TASK()
	 * @generated
	 * @ordered
	 */
	protected String functioN_TYPE_COMPILATION_TASK = FUNCTION_TYPE_COMPILATION_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceabilityInput() <em>Traceability Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityInput()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACEABILITY_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceabilityInput() <em>Traceability Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityInput()
	 * @generated
	 * @ordered
	 */
	protected String traceabilityInput = TRACEABILITY_INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks_stack() <em>Tasks stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks_stack()
	 * @generated
	 * @ordered
	 */
	protected Stack<String> tasks_stack;

	/**
	 * The cached value of the '{@link #getMu() <em>Mu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected ModelingUnit mu;

	/**
	 * The default value of the '{@link #getSELF_EXPRESSION_TO_REPLACE() <em>SELF EXPRESSION TO REPLACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSELF_EXPRESSION_TO_REPLACE()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_EXPRESSION_TO_REPLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSELF_EXPRESSION_TO_REPLACE() <em>SELF EXPRESSION TO REPLACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSELF_EXPRESSION_TO_REPLACE()
	 * @generated
	 * @ordered
	 */
	protected String selF_EXPRESSION_TO_REPLACE = SELF_EXPRESSION_TO_REPLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKERMETA_SEPARATOR() <em>KERMETA SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKERMETA_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String KERMETA_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKERMETA_SEPARATOR() <em>KERMETA SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKERMETA_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String kermetA_SEPARATOR = KERMETA_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInc_ftSuffix() <em>Inc ft Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_ftSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INC_FT_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInc_ftSuffix() <em>Inc ft Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc_ftSuffix()
	 * @generated
	 * @ordered
	 */
	protected Integer inc_ftSuffix = INC_FT_SUFFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KM2EcoreContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Km2ecorePackage.Literals.KM2_ECORE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaKeyWordList getJavaKeyWordList() {
		if (javaKeyWordList != null && javaKeyWordList.eIsProxy()) {
			InternalEObject oldJavaKeyWordList = (InternalEObject) javaKeyWordList;
			javaKeyWordList = (JavaKeyWordList) eResolveProxy(oldJavaKeyWordList);
			if (javaKeyWordList != oldJavaKeyWordList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST,
							oldJavaKeyWordList, javaKeyWordList));
			}
		}
		return javaKeyWordList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaKeyWordList basicGetJavaKeyWordList() {
		return javaKeyWordList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaKeyWordList(JavaKeyWordList newJavaKeyWordList) {
		JavaKeyWordList oldJavaKeyWordList = javaKeyWordList;
		javaKeyWordList = newJavaKeyWordList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST,
					oldJavaKeyWordList, javaKeyWordList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel getTraceModel() {
		if (traceModel != null && traceModel.eIsProxy()) {
			InternalEObject oldTraceModel = (InternalEObject) traceModel;
			traceModel = (TraceModel) eResolveProxy(oldTraceModel);
			if (traceModel != oldTraceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__TRACE_MODEL,
							oldTraceModel, traceModel));
			}
		}
		return traceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel basicGetTraceModel() {
		return traceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceModel(TraceModel newTraceModel) {
		TraceModel oldTraceModel = traceModel;
		traceModel = newTraceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__TRACE_MODEL,
					oldTraceModel, traceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTYPE_SEPARATOR() {
		return typE_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTYPE_SEPARATOR(String newTYPE_SEPARATOR) {
		String oldTYPE_SEPARATOR = typE_SEPARATOR;
		typE_SEPARATOR = newTYPE_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__TYPE_SEPARATOR,
					oldTYPE_SEPARATOR, typE_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNOT_EVALUATED_MESSAGE() {
		return noT_EVALUATED_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNOT_EVALUATED_MESSAGE(String newNOT_EVALUATED_MESSAGE) {
		String oldNOT_EVALUATED_MESSAGE = noT_EVALUATED_MESSAGE;
		noT_EVALUATED_MESSAGE = newNOT_EVALUATED_MESSAGE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE,
					oldNOT_EVALUATED_MESSAGE, noT_EVALUATED_MESSAGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSEPARATOR_STATEMENT_FT() {
		return separatoR_STATEMENT_FT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSEPARATOR_STATEMENT_FT(String newSEPARATOR_STATEMENT_FT) {
		String oldSEPARATOR_STATEMENT_FT = separatoR_STATEMENT_FT;
		separatoR_STATEMENT_FT = newSEPARATOR_STATEMENT_FT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT,
					oldSEPARATOR_STATEMENT_FT, separatoR_STATEMENT_FT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFRepository getInputRepository() {
		if (inputRepository != null && inputRepository.eIsProxy()) {
			InternalEObject oldInputRepository = (InternalEObject) inputRepository;
			inputRepository = (EMFRepository) eResolveProxy(oldInputRepository);
			if (inputRepository != oldInputRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__INPUT_REPOSITORY,
							oldInputRepository, inputRepository));
			}
		}
		return inputRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFRepository basicGetInputRepository() {
		return inputRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRepository(EMFRepository newInputRepository) {
		EMFRepository oldInputRepository = inputRepository;
		inputRepository = newInputRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__INPUT_REPOSITORY,
					oldInputRepository, inputRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFRepository getOutputRepository() {
		if (outputRepository != null && outputRepository.eIsProxy()) {
			InternalEObject oldOutputRepository = (InternalEObject) outputRepository;
			outputRepository = (EMFRepository) eResolveProxy(oldOutputRepository);
			if (outputRepository != oldOutputRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY,
							oldOutputRepository, outputRepository));
			}
		}
		return outputRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFRepository basicGetOutputRepository() {
		return outputRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputRepository(EMFRepository newOutputRepository) {
		EMFRepository oldOutputRepository = outputRepository;
		outputRepository = newOutputRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY,
					oldOutputRepository, outputRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<String> getResultLastStatementStack() {
		if (resultLastStatementStack != null
				&& resultLastStatementStack.eIsProxy()) {
			InternalEObject oldResultLastStatementStack = (InternalEObject) resultLastStatementStack;
			resultLastStatementStack = (Stack<String>) eResolveProxy(oldResultLastStatementStack);
			if (resultLastStatementStack != oldResultLastStatementStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK,
							oldResultLastStatementStack,
							resultLastStatementStack));
			}
		}
		return resultLastStatementStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<String> basicGetResultLastStatementStack() {
		return resultLastStatementStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultLastStatementStack(
			Stack<String> newResultLastStatementStack) {
		Stack<String> oldResultLastStatementStack = resultLastStatementStack;
		resultLastStatementStack = newResultLastStatementStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK,
					oldResultLastStatementStack, resultLastStatementStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFrameworkOperations() {
		if (frameworkOperations == null) {
			frameworkOperations = new EDataTypeUniqueEList<String>(
					String.class, this,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS);
		}
		return frameworkOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCOLLECTION_UTIL_CLASS() {
		return collectioN_UTIL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOLLECTION_UTIL_CLASS(String newCOLLECTION_UTIL_CLASS) {
		String oldCOLLECTION_UTIL_CLASS = collectioN_UTIL_CLASS;
		collectioN_UTIL_CLASS = newCOLLECTION_UTIL_CLASS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS,
					oldCOLLECTION_UTIL_CLASS, collectioN_UTIL_CLASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompiledJavaExtern() {
		return compiledJavaExtern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiledJavaExtern(String newCompiledJavaExtern) {
		String oldCompiledJavaExtern = compiledJavaExtern;
		compiledJavaExtern = newCompiledJavaExtern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN,
					oldCompiledJavaExtern, compiledJavaExtern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getCurrent_valueType() {
		if (current_valueType != null && current_valueType.eIsProxy()) {
			InternalEObject oldCurrent_valueType = (InternalEObject) current_valueType;
			current_valueType = (ClassDefinition) eResolveProxy(oldCurrent_valueType);
			if (current_valueType != oldCurrent_valueType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE,
							oldCurrent_valueType, current_valueType));
			}
		}
		return current_valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetCurrent_valueType() {
		return current_valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_valueType(ClassDefinition newCurrent_valueType) {
		ClassDefinition oldCurrent_valueType = current_valueType;
		current_valueType = newCurrent_valueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE,
					oldCurrent_valueType, current_valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<String> getFtSuffix() {
		if (ftSuffix != null && ftSuffix.eIsProxy()) {
			InternalEObject oldFtSuffix = (InternalEObject) ftSuffix;
			ftSuffix = (Stack<String>) eResolveProxy(oldFtSuffix);
			if (ftSuffix != oldFtSuffix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX,
							oldFtSuffix, ftSuffix));
			}
		}
		return ftSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<String> basicGetFtSuffix() {
		return ftSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtSuffix(Stack<String> newFtSuffix) {
		Stack<String> oldFtSuffix = ftSuffix;
		ftSuffix = newFtSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX, oldFtSuffix,
					ftSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInc_condStack() {
		return inc_condStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInc_condStack(Integer newInc_condStack) {
		Integer oldInc_condStack = inc_condStack;
		inc_condStack = newInc_condStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__INC_COND_STACK,
					oldInc_condStack, inc_condStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFunctionTypeResult() {
		return beforeFunctionTypeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFunctionTypeResult(String newBeforeFunctionTypeResult) {
		String oldBeforeFunctionTypeResult = beforeFunctionTypeResult;
		beforeFunctionTypeResult = newBeforeFunctionTypeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT,
					oldBeforeFunctionTypeResult, beforeFunctionTypeResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJAVA_SEPARATOR() {
		return javA_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJAVA_SEPARATOR(String newJAVA_SEPARATOR) {
		String oldJAVA_SEPARATOR = javA_SEPARATOR;
		javA_SEPARATOR = newJAVA_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_SEPARATOR,
					oldJAVA_SEPARATOR, javA_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<Hashtable<Type, Type>> getFtMapTypeStack() {
		if (ftMapTypeStack != null && ftMapTypeStack.eIsProxy()) {
			InternalEObject oldFtMapTypeStack = (InternalEObject) ftMapTypeStack;
			ftMapTypeStack = (Stack<Hashtable<Type, Type>>) eResolveProxy(oldFtMapTypeStack);
			if (ftMapTypeStack != oldFtMapTypeStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK,
							oldFtMapTypeStack, ftMapTypeStack));
			}
		}
		return ftMapTypeStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<Hashtable<Type, Type>> basicGetFtMapTypeStack() {
		return ftMapTypeStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtMapTypeStack(Stack<Hashtable<Type, Type>> newFtMapTypeStack) {
		Stack<Hashtable<Type, Type>> oldFtMapTypeStack = ftMapTypeStack;
		ftMapTypeStack = newFtMapTypeStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK,
					oldFtMapTypeStack, ftMapTypeStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIMKModel getSimkModel() {
		if (simkModel != null && simkModel.eIsProxy()) {
			InternalEObject oldSimkModel = (InternalEObject) simkModel;
			simkModel = (SIMKModel) eResolveProxy(oldSimkModel);
			if (simkModel != oldSimkModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_MODEL,
							oldSimkModel, simkModel));
			}
		}
		return simkModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIMKModel basicGetSimkModel() {
		return simkModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimkModel(SIMKModel newSimkModel) {
		SIMKModel oldSimkModel = simkModel;
		simkModel = newSimkModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_MODEL,
					oldSimkModel, simkModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<ProductType> getFtProductTypeStack() {
		if (ftProductTypeStack != null && ftProductTypeStack.eIsProxy()) {
			InternalEObject oldFtProductTypeStack = (InternalEObject) ftProductTypeStack;
			ftProductTypeStack = (Stack<ProductType>) eResolveProxy(oldFtProductTypeStack);
			if (ftProductTypeStack != oldFtProductTypeStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK,
							oldFtProductTypeStack, ftProductTypeStack));
			}
		}
		return ftProductTypeStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<ProductType> basicGetFtProductTypeStack() {
		return ftProductTypeStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtProductTypeStack(Stack<ProductType> newFtProductTypeStack) {
		Stack<ProductType> oldFtProductTypeStack = ftProductTypeStack;
		ftProductTypeStack = newFtProductTypeStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK,
					oldFtProductTypeStack, ftProductTypeStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<String> getCurrent_param_ft() {
		if (current_param_ft != null && current_param_ft.eIsProxy()) {
			InternalEObject oldCurrent_param_ft = (InternalEObject) current_param_ft;
			current_param_ft = (Stack<String>) eResolveProxy(oldCurrent_param_ft);
			if (current_param_ft != oldCurrent_param_ft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_PARAM_FT,
							oldCurrent_param_ft, current_param_ft));
			}
		}
		return current_param_ft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<String> basicGetCurrent_param_ft() {
		return current_param_ft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_param_ft(Stack<String> newCurrent_param_ft) {
		Stack<String> oldCurrent_param_ft = current_param_ft;
		current_param_ft = newCurrent_param_ft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_PARAM_FT,
					oldCurrent_param_ft, current_param_ft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPREVIOUS_STATEMENT_FT() {
		return previouS_STATEMENT_FT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPREVIOUS_STATEMENT_FT(String newPREVIOUS_STATEMENT_FT) {
		String oldPREVIOUS_STATEMENT_FT = previouS_STATEMENT_FT;
		previouS_STATEMENT_FT = newPREVIOUS_STATEMENT_FT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT,
					oldPREVIOUS_STATEMENT_FT, previouS_STATEMENT_FT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFtContextualSelf() {
		return ftContextualSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtContextualSelf(String newFtContextualSelf) {
		String oldFtContextualSelf = ftContextualSelf;
		ftContextualSelf = newFtContextualSelf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF,
					oldFtContextualSelf, ftContextualSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeLambdaExpressionResult() {
		return beforeLambdaExpressionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeLambdaExpressionResult(
			String newBeforeLambdaExpressionResult) {
		String oldBeforeLambdaExpressionResult = beforeLambdaExpressionResult;
		beforeLambdaExpressionResult = newBeforeLambdaExpressionResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT,
					oldBeforeLambdaExpressionResult,
					beforeLambdaExpressionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJAVA_CLASS_EXECUTION_CONTEXT() {
		return javA_CLASS_EXECUTION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJAVA_CLASS_EXECUTION_CONTEXT(
			String newJAVA_CLASS_EXECUTION_CONTEXT) {
		String oldJAVA_CLASS_EXECUTION_CONTEXT = javA_CLASS_EXECUTION_CONTEXT;
		javA_CLASS_EXECUTION_CONTEXT = newJAVA_CLASS_EXECUTION_CONTEXT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXECUTION_CONTEXT,
					oldJAVA_CLASS_EXECUTION_CONTEXT,
					javA_CLASS_EXECUTION_CONTEXT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFtReturnType() {
		return ftReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtReturnType(String newFtReturnType) {
		String oldFtReturnType = ftReturnType;
		ftReturnType = newFtReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_RETURN_TYPE,
					oldFtReturnType, ftReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVARIABLE_EXCEPTION_SWITCHER() {
		return variablE_EXCEPTION_SWITCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVARIABLE_EXCEPTION_SWITCHER(
			String newVARIABLE_EXCEPTION_SWITCHER) {
		String oldVARIABLE_EXCEPTION_SWITCHER = variablE_EXCEPTION_SWITCHER;
		variablE_EXCEPTION_SWITCHER = newVARIABLE_EXCEPTION_SWITCHER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER,
					oldVARIABLE_EXCEPTION_SWITCHER, variablE_EXCEPTION_SWITCHER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFtSuffixActivation() {
		return ftSuffixActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtSuffixActivation(Boolean newFtSuffixActivation) {
		Boolean oldFtSuffixActivation = ftSuffixActivation;
		ftSuffixActivation = newFtSuffixActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION,
					oldFtSuffixActivation, ftSuffixActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<String> getKRErrorStack() {
		if (kRErrorStack != null && kRErrorStack.eIsProxy()) {
			InternalEObject oldKRErrorStack = (InternalEObject) kRErrorStack;
			kRErrorStack = (Stack<String>) eResolveProxy(oldKRErrorStack);
			if (kRErrorStack != oldKRErrorStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__KR_ERROR_STACK,
							oldKRErrorStack, kRErrorStack));
			}
		}
		return kRErrorStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<String> basicGetKRErrorStack() {
		return kRErrorStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKRErrorStack(Stack<String> newKRErrorStack) {
		Stack<String> oldKRErrorStack = kRErrorStack;
		kRErrorStack = newKRErrorStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__KR_ERROR_STACK,
					oldKRErrorStack, kRErrorStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRETURN_EXPRESSION_TO_REPLACE_SPECIAL() {
		return returN_EXPRESSION_TO_REPLACE_SPECIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRETURN_EXPRESSION_TO_REPLACE_SPECIAL(
			String newRETURN_EXPRESSION_TO_REPLACE_SPECIAL) {
		String oldRETURN_EXPRESSION_TO_REPLACE_SPECIAL = returN_EXPRESSION_TO_REPLACE_SPECIAL;
		returN_EXPRESSION_TO_REPLACE_SPECIAL = newRETURN_EXPRESSION_TO_REPLACE_SPECIAL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE_SPECIAL,
					oldRETURN_EXPRESSION_TO_REPLACE_SPECIAL,
					returN_EXPRESSION_TO_REPLACE_SPECIAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInc_resultLastStatementStack() {
		return inc_resultLastStatementStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInc_resultLastStatementStack(
			Integer newInc_resultLastStatementStack) {
		Integer oldInc_resultLastStatementStack = inc_resultLastStatementStack;
		inc_resultLastStatementStack = newInc_resultLastStatementStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK,
					oldInc_resultLastStatementStack,
					inc_resultLastStatementStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRETURN_EXPRESSION_TO_REPLACE() {
		return returN_EXPRESSION_TO_REPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRETURN_EXPRESSION_TO_REPLACE(
			String newRETURN_EXPRESSION_TO_REPLACE) {
		String oldRETURN_EXPRESSION_TO_REPLACE = returN_EXPRESSION_TO_REPLACE;
		returN_EXPRESSION_TO_REPLACE = newRETURN_EXPRESSION_TO_REPLACE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE,
					oldRETURN_EXPRESSION_TO_REPLACE,
					returN_EXPRESSION_TO_REPLACE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValueTypeMapping() {
		if (valueTypeMapping == null) {
			valueTypeMapping = new EDataTypeUniqueEList<String>(String.class,
					this, Km2ecorePackage.KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING);
		}
		return valueTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilingMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(CompilingMode newMode) {
		CompilingMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStaticOperationMode() {
		return staticOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticOperationMode(Boolean newStaticOperationMode) {
		Boolean oldStaticOperationMode = staticOperationMode;
		staticOperationMode = newStaticOperationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE,
					oldStaticOperationMode, staticOperationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKmInput() {
		return kmInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKmInput(String newKmInput) {
		String oldKmInput = kmInput;
		kmInput = newKmInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__KM_INPUT, oldKmInput,
					kmInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<LambdaExpression> getFtStack() {
		if (ftStack != null && ftStack.eIsProxy()) {
			InternalEObject oldFtStack = (InternalEObject) ftStack;
			ftStack = (Stack<LambdaExpression>) eResolveProxy(oldFtStack);
			if (ftStack != oldFtStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__FT_STACK,
							oldFtStack, ftStack));
			}
		}
		return ftStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<LambdaExpression> basicGetFtStack() {
		return ftStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtStack(Stack<LambdaExpression> newFtStack) {
		Stack<LambdaExpression> oldFtStack = ftStack;
		ftStack = newFtStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FT_STACK, oldFtStack,
					ftStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<String> getCondStack() {
		if (condStack != null && condStack.eIsProxy()) {
			InternalEObject oldCondStack = (InternalEObject) condStack;
			condStack = (Stack<String>) eResolveProxy(oldCondStack);
			if (condStack != oldCondStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__COND_STACK,
							oldCondStack, condStack));
			}
		}
		return condStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<String> basicGetCondStack() {
		return condStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondStack(Stack<String> newCondStack) {
		Stack<String> oldCondStack = condStack;
		condStack = newCondStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__COND_STACK,
					oldCondStack, condStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEcoreOutputs() {
		if (ecoreOutputs == null) {
			ecoreOutputs = new EDataTypeUniqueEList<String>(String.class, this,
					Km2ecorePackage.KM2_ECORE_CONTEXT__ECORE_OUTPUTS);
		}
		return ecoreOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimkOutput() {
		return simkOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimkOutput(String newSimkOutput) {
		String oldSimkOutput = simkOutput;
		simkOutput = newSimkOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_OUTPUT,
					oldSimkOutput, simkOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJAVA_CLASS_EXCEPTION_SWITCHER() {
		return javA_CLASS_EXCEPTION_SWITCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJAVA_CLASS_EXCEPTION_SWITCHER(
			String newJAVA_CLASS_EXCEPTION_SWITCHER) {
		String oldJAVA_CLASS_EXCEPTION_SWITCHER = javA_CLASS_EXCEPTION_SWITCHER;
		javA_CLASS_EXCEPTION_SWITCHER = newJAVA_CLASS_EXCEPTION_SWITCHER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER,
					oldJAVA_CLASS_EXCEPTION_SWITCHER,
					javA_CLASS_EXCEPTION_SWITCHER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAfterLbdExpActivation() {
		return afterLbdExpActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterLbdExpActivation(Boolean newAfterLbdExpActivation) {
		Boolean oldAfterLbdExpActivation = afterLbdExpActivation;
		afterLbdExpActivation = newAfterLbdExpActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION,
					oldAfterLbdExpActivation, afterLbdExpActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInc_kRErrorStack() {
		return inc_kRErrorStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInc_kRErrorStack(Integer newInc_kRErrorStack) {
		Integer oldInc_kRErrorStack = inc_kRErrorStack;
		inc_kRErrorStack = newInc_kRErrorStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK,
					oldInc_kRErrorStack, inc_kRErrorStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFUNCTION_TYPE_COMPILATION_TASK() {
		return functioN_TYPE_COMPILATION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFUNCTION_TYPE_COMPILATION_TASK(
			String newFUNCTION_TYPE_COMPILATION_TASK) {
		String oldFUNCTION_TYPE_COMPILATION_TASK = functioN_TYPE_COMPILATION_TASK;
		functioN_TYPE_COMPILATION_TASK = newFUNCTION_TYPE_COMPILATION_TASK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK,
					oldFUNCTION_TYPE_COMPILATION_TASK,
					functioN_TYPE_COMPILATION_TASK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceabilityInput() {
		return traceabilityInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceabilityInput(String newTraceabilityInput) {
		String oldTraceabilityInput = traceabilityInput;
		traceabilityInput = newTraceabilityInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__TRACEABILITY_INPUT,
					oldTraceabilityInput, traceabilityInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Stack<String> getTasks_stack() {
		if (tasks_stack != null && tasks_stack.eIsProxy()) {
			InternalEObject oldTasks_stack = (InternalEObject) tasks_stack;
			tasks_stack = (Stack<String>) eResolveProxy(oldTasks_stack);
			if (tasks_stack != oldTasks_stack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__TASKS_STACK,
							oldTasks_stack, tasks_stack));
			}
		}
		return tasks_stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack<String> basicGetTasks_stack() {
		return tasks_stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasks_stack(Stack<String> newTasks_stack) {
		Stack<String> oldTasks_stack = tasks_stack;
		tasks_stack = newTasks_stack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__TASKS_STACK,
					oldTasks_stack, tasks_stack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnit getMu() {
		if (mu != null && mu.eIsProxy()) {
			InternalEObject oldMu = (InternalEObject) mu;
			mu = (ModelingUnit) eResolveProxy(oldMu);
			if (mu != oldMu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Km2ecorePackage.KM2_ECORE_CONTEXT__MU, oldMu, mu));
			}
		}
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnit basicGetMu() {
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMu(ModelingUnit newMu) {
		ModelingUnit oldMu = mu;
		mu = newMu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__MU, oldMu, mu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSELF_EXPRESSION_TO_REPLACE() {
		return selF_EXPRESSION_TO_REPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSELF_EXPRESSION_TO_REPLACE(
			String newSELF_EXPRESSION_TO_REPLACE) {
		String oldSELF_EXPRESSION_TO_REPLACE = selF_EXPRESSION_TO_REPLACE;
		selF_EXPRESSION_TO_REPLACE = newSELF_EXPRESSION_TO_REPLACE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE,
					oldSELF_EXPRESSION_TO_REPLACE, selF_EXPRESSION_TO_REPLACE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKERMETA_SEPARATOR() {
		return kermetA_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKERMETA_SEPARATOR(String newKERMETA_SEPARATOR) {
		String oldKERMETA_SEPARATOR = kermetA_SEPARATOR;
		kermetA_SEPARATOR = newKERMETA_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__KERMETA_SEPARATOR,
					oldKERMETA_SEPARATOR, kermetA_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInc_ftSuffix() {
		return inc_ftSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInc_ftSuffix(Integer newInc_ftSuffix) {
		Integer oldInc_ftSuffix = inc_ftSuffix;
		inc_ftSuffix = newInc_ftSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Km2ecorePackage.KM2_ECORE_CONTEXT__INC_FT_SUFFIX,
					oldInc_ftSuffix, inc_ftSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoopConditionId() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus("idLoopCond_", this
				.getCondStack().peek());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {

		this.setSimkOutput(kermeta.standard.helper.StringWrapper
				.replaceExtension(this.getKmInput(), "simk"));

		kermeta.persistence.Resource simkResource = this.getOutputRepository()
				.createResource(this.getSimkOutput(),
						"http://www.kermeta.org/simk");

		simkResource.add(this.getSimkModel());

		simkResource.save();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfConditionId() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus("idIfCond_", this
				.getCondStack().peek());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pushKRErrorStack() {

		this.setInc_kRErrorStack(kermeta.standard.helper.IntegerWrapper.plus(
				this.getInc_kRErrorStack(), 1));

		this.getKRErrorStack().push(
				kermeta.standard.helper.IntegerWrapper.toString(this
						.getInc_kRErrorStack()));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String printLbdExpSuffix() {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1040 = false;
		idIfCond_1040 = kermeta.standard.helper.BooleanWrapper.and(this
				.getFtSuffixActivation(),
				kermeta.standard.helper.IntegerWrapper.isGreater(this
						.getFtSuffix().size(), 0));

		if (idIfCond_1040) {

			result = kermeta.standard.helper.StringWrapper.plus("_lbdExp", this
					.getFtSuffix().peek());
		} else {

			result = "";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultLastStatementType() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_1041 = false;
		idIfCond_1041 = kermeta.standard.helper.IntegerWrapper.isGreater(this
				.getResultLastStatementStack().size(), 0);

		if (idIfCond_1041) {

			kermeta.standard.OrderedSet<java.lang.String> str_set = kermeta.standard.helper.StringWrapper
					.split(this.getResultLastStatementStack().peek(), this
							.getTYPE_SEPARATOR());

			result = str_set.last();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeConstants() {

		this
				.setJAVA_CLASS_EXCEPTION_SWITCHER("org.kermeta.compil.runtime.helper.error.KRuntimeError");

		this.setVARIABLE_EXCEPTION_SWITCHER("ex_switcher");

		this
				.setCOLLECTION_UTIL_CLASS("org.kermeta.compil.runtime.helper.basetypes.CollectionUtil");

		this
				.setJAVA_CLASS_EXECUTION_CONTEXT("org.kermeta.compil.runtime.ExecutionContext");

		this
				.setNOT_EVALUATED_MESSAGE("//FIXME This statement cannot be evaluated without an assignment: ");

		this.setSELF_EXPRESSION_TO_REPLACE("SELF_EXPRESSION_TO_REPLACE_STR");

		this
				.setRETURN_EXPRESSION_TO_REPLACE("RETURN_EXPRESSION_TO_REPLACE_STR");

		this
				.setRETURN_EXPRESSION_TO_REPLACE_SPECIAL("RETURN_EXPRESSION_TO_REPLACE_SPECIAL_STR");

		this.setSEPARATOR_STATEMENT_FT("SEPARATOR_STATEMENT_FT_STR");

		this.setPREVIOUS_STATEMENT_FT("PREVIOUS_STATEMENT_FT_STR");

		this.setTYPE_SEPARATOR("TYPE_SEPARATOR");

		this.setFUNCTION_TYPE_COMPILATION_TASK("FunctionType_Compilation");

		this.setKERMETA_SEPARATOR("::");

		this.setJAVA_SEPARATOR(".");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pushFtSuffix() {

		this.setInc_ftSuffix(kermeta.standard.helper.IntegerWrapper.plus(this
				.getInc_ftSuffix(), 1));

		this.getFtSuffix().push(
				kermeta.standard.helper.IntegerWrapper.toString(this
						.getInc_ftSuffix()));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void popResultLastStatementStack() {

		java.lang.Boolean idIfCond_1042 = false;
		idIfCond_1042 = kermeta.standard.helper.IntegerWrapper.isGreater(this
				.getResultLastStatementStack().size(), 0);

		if (idIfCond_1042) {

			this.setInc_resultLastStatementStack(this
					.getInc_resultLastStatementStack());

			this.getResultLastStatementStack().pop();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeFrameworkOperations() {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("getMetaClass");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("container");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("checkInvariants");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations())
				.add("checkAllInvariants");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("equals");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isNotEqual");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isKindOf");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("get");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("set");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isSet");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("unset");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("oid");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("toString");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isFrozen");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isVoid");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("hashcode");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("freeze");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("asType");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isInstanceOf");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations())
				.add("containingResource");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("clone");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("deepClone");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isInstance");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isSuperTypeOf");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getFrameworkOperations()).add("isSubTypeOf");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String printFtSuffix() {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1043 = false;
		idIfCond_1043 = kermeta.standard.helper.BooleanWrapper.and(this
				.getFtSuffixActivation(),
				kermeta.standard.helper.IntegerWrapper.isGreater(this
						.getFtSuffix().size(), 0));

		if (idIfCond_1043) {

			result = kermeta.standard.helper.StringWrapper.plus("_ft", this
					.getFtSuffix().peek());
		} else {

			result = "";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pushCondStack() {

		this.setInc_condStack(kermeta.standard.helper.IntegerWrapper.plus(this
				.getInc_condStack(), 1));

		this.getCondStack().push(
				kermeta.standard.helper.IntegerWrapper.toString(this
						.getInc_condStack()));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize(String modelInput, String traceInput) {

		this.setKmInput(modelInput);

		this.setTraceabilityInput(traceInput);

		this
				.setTasks_stack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<java.lang.String>")));

		this.getTasks_stack().push("Start");

		this
				.setCondStack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<java.lang.String>")));

		this.setInc_condStack(0);

		this
				.setKRErrorStack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<java.lang.String>")));

		this.setInc_kRErrorStack(0);

		this.initializeConstants();

		this.setCompiledJavaExtern("");

		this.setCurrent_valueType(null);

		this
				.setFtStack(((kermeta.utils.Stack<kermeta.language.behavior.LambdaExpression>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<kermeta.language.behavior.LambdaExpression>")));

		this
				.setCurrent_param_ft(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<java.lang.String>")));

		this.getCurrent_param_ft().push("");

		this
				.setFtSuffix(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<java.lang.String>")));

		this.setInc_ftSuffix(0);

		this.setFtSuffixActivation(false);

		this.setAfterLbdExpActivation(false);

		this.setFtContextualSelf("");

		this.setFtReturnType("");

		this.setBeforeLambdaExpressionResult("");

		this
				.setFtProductTypeStack(((kermeta.utils.Stack<kermeta.language.structure.ProductType>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<kermeta.language.structure.ProductType>")));

		this
				.setFtMapTypeStack(((kermeta.utils.Stack<kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>>")));

		this
				.setResultLastStatementStack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Stack<java.lang.String>")));

		this.setInc_resultLastStatementStack(0);

		this
				.setJavaKeyWordList(((km2ecore.common.JavaKeyWordList) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.common.JavaKeyWordList")));

		this.getJavaKeyWordList().initialize();

		this.initializeFrameworkOperations();

		this.setStaticOperationMode(false);

		this
				.setInputRepository(((kermeta.persistence.EMFRepository) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.persistence.EMFRepository")));

		kermeta.persistence.Resource modelResource = this.getInputRepository()
				.createResource(modelInput,
						"http://www.kermeta.org/kermeta/1_2_0//kermeta");

		modelResource.load();

		this
				.setMu(((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								modelResource.instances().one(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ModelingUnit"))));

		java.lang.Boolean idIfCond_1044 = false;
		idIfCond_1044 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(traceInput)),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(traceInput, ""));

		if (idIfCond_1044) {

			kermeta.persistence.Resource traceResource = this
					.getInputRepository().createResource(traceInput,
							"http://www.kermeta.org/Traceability");

			traceResource.load();

			this
					.setTraceModel(((traceability.TraceModel) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(traceResource.instances().one(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"traceability.TraceModel"))));

			((km2ecore.SourceTracer) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.SourceTracer"))
					.addSourceInformation(this);
		}

		this
				.setOutputRepository(((kermeta.persistence.EMFRepository) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.persistence.EMFRepository")));

		this
				.setSimkModel(((simk.SIMKModel) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("simk.SIMKModel")));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultLastStatementId() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_1045 = false;
		idIfCond_1045 = kermeta.standard.helper.IntegerWrapper.isGreater(this
				.getResultLastStatementStack().size(), 0);

		if (idIfCond_1045) {

			kermeta.standard.OrderedSet<java.lang.String> str_set = kermeta.standard.helper.StringWrapper
					.split(this.getResultLastStatementStack().peek(), this
							.getTYPE_SEPARATOR());

			result = str_set.first();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST:
			if (resolve)
				return getJavaKeyWordList();
			return basicGetJavaKeyWordList();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACE_MODEL:
			if (resolve)
				return getTraceModel();
			return basicGetTraceModel();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TYPE_SEPARATOR:
			return getTYPE_SEPARATOR();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE:
			return getNOT_EVALUATED_MESSAGE();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT:
			return getSEPARATOR_STATEMENT_FT();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INPUT_REPOSITORY:
			if (resolve)
				return getInputRepository();
			return basicGetInputRepository();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY:
			if (resolve)
				return getOutputRepository();
			return basicGetOutputRepository();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK:
			if (resolve)
				return getResultLastStatementStack();
			return basicGetResultLastStatementStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS:
			return getFrameworkOperations();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS:
			return getCOLLECTION_UTIL_CLASS();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN:
			return getCompiledJavaExtern();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE:
			if (resolve)
				return getCurrent_valueType();
			return basicGetCurrent_valueType();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX:
			if (resolve)
				return getFtSuffix();
			return basicGetFtSuffix();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_COND_STACK:
			return getInc_condStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT:
			return getBeforeFunctionTypeResult();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_SEPARATOR:
			return getJAVA_SEPARATOR();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK:
			if (resolve)
				return getFtMapTypeStack();
			return basicGetFtMapTypeStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_MODEL:
			if (resolve)
				return getSimkModel();
			return basicGetSimkModel();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK:
			if (resolve)
				return getFtProductTypeStack();
			return basicGetFtProductTypeStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_PARAM_FT:
			if (resolve)
				return getCurrent_param_ft();
			return basicGetCurrent_param_ft();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT:
			return getPREVIOUS_STATEMENT_FT();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF:
			return getFtContextualSelf();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT:
			return getBeforeLambdaExpressionResult();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXECUTION_CONTEXT:
			return getJAVA_CLASS_EXECUTION_CONTEXT();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_RETURN_TYPE:
			return getFtReturnType();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER:
			return getVARIABLE_EXCEPTION_SWITCHER();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION:
			return getFtSuffixActivation();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KR_ERROR_STACK:
			if (resolve)
				return getKRErrorStack();
			return basicGetKRErrorStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE_SPECIAL:
			return getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK:
			return getInc_resultLastStatementStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE:
			return getRETURN_EXPRESSION_TO_REPLACE();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING:
			return getValueTypeMapping();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MODE:
			return getMode();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE:
			return getStaticOperationMode();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KM_INPUT:
			return getKmInput();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_STACK:
			if (resolve)
				return getFtStack();
			return basicGetFtStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COND_STACK:
			if (resolve)
				return getCondStack();
			return basicGetCondStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__ECORE_OUTPUTS:
			return getEcoreOutputs();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_OUTPUT:
			return getSimkOutput();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER:
			return getJAVA_CLASS_EXCEPTION_SWITCHER();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION:
			return getAfterLbdExpActivation();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK:
			return getInc_kRErrorStack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK:
			return getFUNCTION_TYPE_COMPILATION_TASK();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACEABILITY_INPUT:
			return getTraceabilityInput();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TASKS_STACK:
			if (resolve)
				return getTasks_stack();
			return basicGetTasks_stack();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MU:
			if (resolve)
				return getMu();
			return basicGetMu();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE:
			return getSELF_EXPRESSION_TO_REPLACE();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KERMETA_SEPARATOR:
			return getKERMETA_SEPARATOR();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_FT_SUFFIX:
			return getInc_ftSuffix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST:
			setJavaKeyWordList((JavaKeyWordList) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACE_MODEL:
			setTraceModel((TraceModel) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TYPE_SEPARATOR:
			setTYPE_SEPARATOR((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE:
			setNOT_EVALUATED_MESSAGE((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT:
			setSEPARATOR_STATEMENT_FT((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INPUT_REPOSITORY:
			setInputRepository((EMFRepository) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY:
			setOutputRepository((EMFRepository) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK:
			setResultLastStatementStack((Stack<String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS:
			getFrameworkOperations().clear();
			getFrameworkOperations().addAll(
					(Collection<? extends String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS:
			setCOLLECTION_UTIL_CLASS((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN:
			setCompiledJavaExtern((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE:
			setCurrent_valueType((ClassDefinition) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX:
			setFtSuffix((Stack<String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_COND_STACK:
			setInc_condStack((Integer) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT:
			setBeforeFunctionTypeResult((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_SEPARATOR:
			setJAVA_SEPARATOR((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK:
			setFtMapTypeStack((Stack<Hashtable<Type, Type>>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_MODEL:
			setSimkModel((SIMKModel) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK:
			setFtProductTypeStack((Stack<ProductType>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_PARAM_FT:
			setCurrent_param_ft((Stack<String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT:
			setPREVIOUS_STATEMENT_FT((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF:
			setFtContextualSelf((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT:
			setBeforeLambdaExpressionResult((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXECUTION_CONTEXT:
			setJAVA_CLASS_EXECUTION_CONTEXT((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_RETURN_TYPE:
			setFtReturnType((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER:
			setVARIABLE_EXCEPTION_SWITCHER((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION:
			setFtSuffixActivation((Boolean) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KR_ERROR_STACK:
			setKRErrorStack((Stack<String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE_SPECIAL:
			setRETURN_EXPRESSION_TO_REPLACE_SPECIAL((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK:
			setInc_resultLastStatementStack((Integer) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE:
			setRETURN_EXPRESSION_TO_REPLACE((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING:
			getValueTypeMapping().clear();
			getValueTypeMapping().addAll(
					(Collection<? extends String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MODE:
			setMode((CompilingMode) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE:
			setStaticOperationMode((Boolean) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KM_INPUT:
			setKmInput((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_STACK:
			setFtStack((Stack<LambdaExpression>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COND_STACK:
			setCondStack((Stack<String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__ECORE_OUTPUTS:
			getEcoreOutputs().clear();
			getEcoreOutputs().addAll((Collection<? extends String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_OUTPUT:
			setSimkOutput((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER:
			setJAVA_CLASS_EXCEPTION_SWITCHER((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION:
			setAfterLbdExpActivation((Boolean) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK:
			setInc_kRErrorStack((Integer) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK:
			setFUNCTION_TYPE_COMPILATION_TASK((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACEABILITY_INPUT:
			setTraceabilityInput((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TASKS_STACK:
			setTasks_stack((Stack<String>) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MU:
			setMu((ModelingUnit) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE:
			setSELF_EXPRESSION_TO_REPLACE((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KERMETA_SEPARATOR:
			setKERMETA_SEPARATOR((String) newValue);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_FT_SUFFIX:
			setInc_ftSuffix((Integer) newValue);
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
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST:
			setJavaKeyWordList((JavaKeyWordList) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACE_MODEL:
			setTraceModel((TraceModel) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TYPE_SEPARATOR:
			setTYPE_SEPARATOR(TYPE_SEPARATOR_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE:
			setNOT_EVALUATED_MESSAGE(NOT_EVALUATED_MESSAGE_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT:
			setSEPARATOR_STATEMENT_FT(SEPARATOR_STATEMENT_FT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INPUT_REPOSITORY:
			setInputRepository((EMFRepository) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY:
			setOutputRepository((EMFRepository) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK:
			setResultLastStatementStack((Stack<String>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS:
			getFrameworkOperations().clear();
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS:
			setCOLLECTION_UTIL_CLASS(COLLECTION_UTIL_CLASS_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN:
			setCompiledJavaExtern(COMPILED_JAVA_EXTERN_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE:
			setCurrent_valueType((ClassDefinition) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX:
			setFtSuffix((Stack<String>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_COND_STACK:
			setInc_condStack(INC_COND_STACK_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT:
			setBeforeFunctionTypeResult(BEFORE_FUNCTION_TYPE_RESULT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_SEPARATOR:
			setJAVA_SEPARATOR(JAVA_SEPARATOR_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK:
			setFtMapTypeStack((Stack<Hashtable<Type, Type>>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_MODEL:
			setSimkModel((SIMKModel) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK:
			setFtProductTypeStack((Stack<ProductType>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_PARAM_FT:
			setCurrent_param_ft((Stack<String>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT:
			setPREVIOUS_STATEMENT_FT(PREVIOUS_STATEMENT_FT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF:
			setFtContextualSelf(FT_CONTEXTUAL_SELF_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT:
			setBeforeLambdaExpressionResult(BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXECUTION_CONTEXT:
			setJAVA_CLASS_EXECUTION_CONTEXT(JAVA_CLASS_EXECUTION_CONTEXT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_RETURN_TYPE:
			setFtReturnType(FT_RETURN_TYPE_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER:
			setVARIABLE_EXCEPTION_SWITCHER(VARIABLE_EXCEPTION_SWITCHER_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION:
			setFtSuffixActivation(FT_SUFFIX_ACTIVATION_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KR_ERROR_STACK:
			setKRErrorStack((Stack<String>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE_SPECIAL:
			setRETURN_EXPRESSION_TO_REPLACE_SPECIAL(RETURN_EXPRESSION_TO_REPLACE_SPECIAL_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK:
			setInc_resultLastStatementStack(INC_RESULT_LAST_STATEMENT_STACK_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE:
			setRETURN_EXPRESSION_TO_REPLACE(RETURN_EXPRESSION_TO_REPLACE_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING:
			getValueTypeMapping().clear();
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE:
			setStaticOperationMode(STATIC_OPERATION_MODE_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KM_INPUT:
			setKmInput(KM_INPUT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_STACK:
			setFtStack((Stack<LambdaExpression>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COND_STACK:
			setCondStack((Stack<String>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__ECORE_OUTPUTS:
			getEcoreOutputs().clear();
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_OUTPUT:
			setSimkOutput(SIMK_OUTPUT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER:
			setJAVA_CLASS_EXCEPTION_SWITCHER(JAVA_CLASS_EXCEPTION_SWITCHER_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION:
			setAfterLbdExpActivation(AFTER_LBD_EXP_ACTIVATION_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK:
			setInc_kRErrorStack(INC_KR_ERROR_STACK_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK:
			setFUNCTION_TYPE_COMPILATION_TASK(FUNCTION_TYPE_COMPILATION_TASK_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACEABILITY_INPUT:
			setTraceabilityInput(TRACEABILITY_INPUT_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TASKS_STACK:
			setTasks_stack((Stack<String>) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MU:
			setMu((ModelingUnit) null);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE:
			setSELF_EXPRESSION_TO_REPLACE(SELF_EXPRESSION_TO_REPLACE_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KERMETA_SEPARATOR:
			setKERMETA_SEPARATOR(KERMETA_SEPARATOR_EDEFAULT);
			return;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_FT_SUFFIX:
			setInc_ftSuffix(INC_FT_SUFFIX_EDEFAULT);
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
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST:
			return javaKeyWordList != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACE_MODEL:
			return traceModel != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TYPE_SEPARATOR:
			return TYPE_SEPARATOR_EDEFAULT == null ? typE_SEPARATOR != null
					: !TYPE_SEPARATOR_EDEFAULT.equals(typE_SEPARATOR);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE:
			return NOT_EVALUATED_MESSAGE_EDEFAULT == null ? noT_EVALUATED_MESSAGE != null
					: !NOT_EVALUATED_MESSAGE_EDEFAULT
							.equals(noT_EVALUATED_MESSAGE);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT:
			return SEPARATOR_STATEMENT_FT_EDEFAULT == null ? separatoR_STATEMENT_FT != null
					: !SEPARATOR_STATEMENT_FT_EDEFAULT
							.equals(separatoR_STATEMENT_FT);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INPUT_REPOSITORY:
			return inputRepository != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY:
			return outputRepository != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK:
			return resultLastStatementStack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS:
			return frameworkOperations != null
					&& !frameworkOperations.isEmpty();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS:
			return COLLECTION_UTIL_CLASS_EDEFAULT == null ? collectioN_UTIL_CLASS != null
					: !COLLECTION_UTIL_CLASS_EDEFAULT
							.equals(collectioN_UTIL_CLASS);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN:
			return COMPILED_JAVA_EXTERN_EDEFAULT == null ? compiledJavaExtern != null
					: !COMPILED_JAVA_EXTERN_EDEFAULT.equals(compiledJavaExtern);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE:
			return current_valueType != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX:
			return ftSuffix != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_COND_STACK:
			return INC_COND_STACK_EDEFAULT == null ? inc_condStack != null
					: !INC_COND_STACK_EDEFAULT.equals(inc_condStack);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT:
			return BEFORE_FUNCTION_TYPE_RESULT_EDEFAULT == null ? beforeFunctionTypeResult != null
					: !BEFORE_FUNCTION_TYPE_RESULT_EDEFAULT
							.equals(beforeFunctionTypeResult);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_SEPARATOR:
			return JAVA_SEPARATOR_EDEFAULT == null ? javA_SEPARATOR != null
					: !JAVA_SEPARATOR_EDEFAULT.equals(javA_SEPARATOR);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK:
			return ftMapTypeStack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_MODEL:
			return simkModel != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK:
			return ftProductTypeStack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__CURRENT_PARAM_FT:
			return current_param_ft != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT:
			return PREVIOUS_STATEMENT_FT_EDEFAULT == null ? previouS_STATEMENT_FT != null
					: !PREVIOUS_STATEMENT_FT_EDEFAULT
							.equals(previouS_STATEMENT_FT);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF:
			return FT_CONTEXTUAL_SELF_EDEFAULT == null ? ftContextualSelf != null
					: !FT_CONTEXTUAL_SELF_EDEFAULT.equals(ftContextualSelf);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT:
			return BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT == null ? beforeLambdaExpressionResult != null
					: !BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT
							.equals(beforeLambdaExpressionResult);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXECUTION_CONTEXT:
			return JAVA_CLASS_EXECUTION_CONTEXT_EDEFAULT == null ? javA_CLASS_EXECUTION_CONTEXT != null
					: !JAVA_CLASS_EXECUTION_CONTEXT_EDEFAULT
							.equals(javA_CLASS_EXECUTION_CONTEXT);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_RETURN_TYPE:
			return FT_RETURN_TYPE_EDEFAULT == null ? ftReturnType != null
					: !FT_RETURN_TYPE_EDEFAULT.equals(ftReturnType);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER:
			return VARIABLE_EXCEPTION_SWITCHER_EDEFAULT == null ? variablE_EXCEPTION_SWITCHER != null
					: !VARIABLE_EXCEPTION_SWITCHER_EDEFAULT
							.equals(variablE_EXCEPTION_SWITCHER);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION:
			return FT_SUFFIX_ACTIVATION_EDEFAULT == null ? ftSuffixActivation != null
					: !FT_SUFFIX_ACTIVATION_EDEFAULT.equals(ftSuffixActivation);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KR_ERROR_STACK:
			return kRErrorStack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE_SPECIAL:
			return RETURN_EXPRESSION_TO_REPLACE_SPECIAL_EDEFAULT == null ? returN_EXPRESSION_TO_REPLACE_SPECIAL != null
					: !RETURN_EXPRESSION_TO_REPLACE_SPECIAL_EDEFAULT
							.equals(returN_EXPRESSION_TO_REPLACE_SPECIAL);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK:
			return INC_RESULT_LAST_STATEMENT_STACK_EDEFAULT == null ? inc_resultLastStatementStack != null
					: !INC_RESULT_LAST_STATEMENT_STACK_EDEFAULT
							.equals(inc_resultLastStatementStack);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE:
			return RETURN_EXPRESSION_TO_REPLACE_EDEFAULT == null ? returN_EXPRESSION_TO_REPLACE != null
					: !RETURN_EXPRESSION_TO_REPLACE_EDEFAULT
							.equals(returN_EXPRESSION_TO_REPLACE);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__VALUE_TYPE_MAPPING:
			return valueTypeMapping != null && !valueTypeMapping.isEmpty();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MODE:
			return mode != MODE_EDEFAULT;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE:
			return STATIC_OPERATION_MODE_EDEFAULT == null ? staticOperationMode != null
					: !STATIC_OPERATION_MODE_EDEFAULT
							.equals(staticOperationMode);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KM_INPUT:
			return KM_INPUT_EDEFAULT == null ? kmInput != null
					: !KM_INPUT_EDEFAULT.equals(kmInput);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FT_STACK:
			return ftStack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__COND_STACK:
			return condStack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__ECORE_OUTPUTS:
			return ecoreOutputs != null && !ecoreOutputs.isEmpty();
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SIMK_OUTPUT:
			return SIMK_OUTPUT_EDEFAULT == null ? simkOutput != null
					: !SIMK_OUTPUT_EDEFAULT.equals(simkOutput);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER:
			return JAVA_CLASS_EXCEPTION_SWITCHER_EDEFAULT == null ? javA_CLASS_EXCEPTION_SWITCHER != null
					: !JAVA_CLASS_EXCEPTION_SWITCHER_EDEFAULT
							.equals(javA_CLASS_EXCEPTION_SWITCHER);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__AFTER_LBD_EXP_ACTIVATION:
			return AFTER_LBD_EXP_ACTIVATION_EDEFAULT == null ? afterLbdExpActivation != null
					: !AFTER_LBD_EXP_ACTIVATION_EDEFAULT
							.equals(afterLbdExpActivation);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK:
			return INC_KR_ERROR_STACK_EDEFAULT == null ? inc_kRErrorStack != null
					: !INC_KR_ERROR_STACK_EDEFAULT.equals(inc_kRErrorStack);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__FUNCTION_TYPE_COMPILATION_TASK:
			return FUNCTION_TYPE_COMPILATION_TASK_EDEFAULT == null ? functioN_TYPE_COMPILATION_TASK != null
					: !FUNCTION_TYPE_COMPILATION_TASK_EDEFAULT
							.equals(functioN_TYPE_COMPILATION_TASK);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TRACEABILITY_INPUT:
			return TRACEABILITY_INPUT_EDEFAULT == null ? traceabilityInput != null
					: !TRACEABILITY_INPUT_EDEFAULT.equals(traceabilityInput);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__TASKS_STACK:
			return tasks_stack != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__MU:
			return mu != null;
		case Km2ecorePackage.KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE:
			return SELF_EXPRESSION_TO_REPLACE_EDEFAULT == null ? selF_EXPRESSION_TO_REPLACE != null
					: !SELF_EXPRESSION_TO_REPLACE_EDEFAULT
							.equals(selF_EXPRESSION_TO_REPLACE);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__KERMETA_SEPARATOR:
			return KERMETA_SEPARATOR_EDEFAULT == null ? kermetA_SEPARATOR != null
					: !KERMETA_SEPARATOR_EDEFAULT.equals(kermetA_SEPARATOR);
		case Km2ecorePackage.KM2_ECORE_CONTEXT__INC_FT_SUFFIX:
			return INC_FT_SUFFIX_EDEFAULT == null ? inc_ftSuffix != null
					: !INC_FT_SUFFIX_EDEFAULT.equals(inc_ftSuffix);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (TYPE_SEPARATOR: ");
		result.append(typE_SEPARATOR);
		result.append(", NOT_EVALUATED_MESSAGE: ");
		result.append(noT_EVALUATED_MESSAGE);
		result.append(", SEPARATOR_STATEMENT_FT: ");
		result.append(separatoR_STATEMENT_FT);
		result.append(", frameworkOperations: ");
		result.append(frameworkOperations);
		result.append(", COLLECTION_UTIL_CLASS: ");
		result.append(collectioN_UTIL_CLASS);
		result.append(", compiledJavaExtern: ");
		result.append(compiledJavaExtern);
		result.append(", inc_condStack: ");
		result.append(inc_condStack);
		result.append(", beforeFunctionTypeResult: ");
		result.append(beforeFunctionTypeResult);
		result.append(", JAVA_SEPARATOR: ");
		result.append(javA_SEPARATOR);
		result.append(", PREVIOUS_STATEMENT_FT: ");
		result.append(previouS_STATEMENT_FT);
		result.append(", ftContextualSelf: ");
		result.append(ftContextualSelf);
		result.append(", beforeLambdaExpressionResult: ");
		result.append(beforeLambdaExpressionResult);
		result.append(", JAVA_CLASS_EXECUTION_CONTEXT: ");
		result.append(javA_CLASS_EXECUTION_CONTEXT);
		result.append(", ftReturnType: ");
		result.append(ftReturnType);
		result.append(", VARIABLE_EXCEPTION_SWITCHER: ");
		result.append(variablE_EXCEPTION_SWITCHER);
		result.append(", ftSuffixActivation: ");
		result.append(ftSuffixActivation);
		result.append(", RETURN_EXPRESSION_TO_REPLACE_SPECIAL: ");
		result.append(returN_EXPRESSION_TO_REPLACE_SPECIAL);
		result.append(", inc_resultLastStatementStack: ");
		result.append(inc_resultLastStatementStack);
		result.append(", RETURN_EXPRESSION_TO_REPLACE: ");
		result.append(returN_EXPRESSION_TO_REPLACE);
		result.append(", valueTypeMapping: ");
		result.append(valueTypeMapping);
		result.append(", mode: ");
		result.append(mode);
		result.append(", staticOperationMode: ");
		result.append(staticOperationMode);
		result.append(", kmInput: ");
		result.append(kmInput);
		result.append(", ecoreOutputs: ");
		result.append(ecoreOutputs);
		result.append(", simkOutput: ");
		result.append(simkOutput);
		result.append(", JAVA_CLASS_EXCEPTION_SWITCHER: ");
		result.append(javA_CLASS_EXCEPTION_SWITCHER);
		result.append(", afterLbdExpActivation: ");
		result.append(afterLbdExpActivation);
		result.append(", inc_kRErrorStack: ");
		result.append(inc_kRErrorStack);
		result.append(", FUNCTION_TYPE_COMPILATION_TASK: ");
		result.append(functioN_TYPE_COMPILATION_TASK);
		result.append(", traceabilityInput: ");
		result.append(traceabilityInput);
		result.append(", SELF_EXPRESSION_TO_REPLACE: ");
		result.append(selF_EXPRESSION_TO_REPLACE);
		result.append(", KERMETA_SEPARATOR: ");
		result.append(kermetA_SEPARATOR);
		result.append(", inc_ftSuffix: ");
		result.append(inc_ftSuffix);
		result.append(')');
		return result.toString();
	}

} //KM2EcoreContextImpl
