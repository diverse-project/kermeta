/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: KM2EcoreContext.java,v 1.12 2009-02-23 15:26:38 cfaucher Exp $
 */
package km2ecore;

import kermeta.language.behavior.LambdaExpression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.ProductType;
import kermeta.language.structure.Type;

import kermeta.persistence.EMFRepository;

import kermeta.utils.Hashtable;
import kermeta.utils.Stack;

import km2ecore.common.JavaKeyWordList;

import org.eclipse.emf.common.util.EList;

import simk.SIMKModel;

import traceability.TraceModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KM2 Ecore Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link km2ecore.KM2EcoreContext#getJAVA_INSTANCE_EXECUTION_CONTEXT <em>JAVA INSTANCE EXECUTION CONTEXT</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getJavaKeyWordList <em>Java Key Word List</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getTraceModel <em>Trace Model</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getTYPE_SEPARATOR <em>TYPE SEPARATOR</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getNOT_EVALUATED_MESSAGE <em>NOT EVALUATED MESSAGE</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getOutputRepository <em>Output Repository</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getSEPARATOR_STATEMENT_FT <em>SEPARATOR STATEMENT FT</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getInputRepository <em>Input Repository</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getResultLastStatementStack <em>Result Last Statement Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFrameworkOperations <em>Framework Operations</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getCOLLECTION_UTIL_CLASS <em>COLLECTION UTIL CLASS</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getCompiledJavaExtern <em>Compiled Java Extern</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getCurrent_valueType <em>Current value Type</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getBeforeFunctionTypeResult <em>Before Function Type Result</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getInc_condStack <em>Inc cond Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtSuffix <em>Ft Suffix</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtMapTypeStack <em>Ft Map Type Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getSimkModel <em>Simk Model</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getJAVA_SEPARATOR <em>JAVA SEPARATOR</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtProductTypeStack <em>Ft Product Type Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getCurrent_param_ft <em>Current param ft</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getPREVIOUS_STATEMENT_FT <em>PREVIOUS STATEMENT FT</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtContextualSelf <em>Ft Contextual Self</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getJAVA_CLASS_EXECUTION_CONTEXT <em>JAVA CLASS EXECUTION CONTEXT</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtReturnType <em>Ft Return Type</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getOBJECT_UTIL_CLASS <em>OBJECT UTIL CLASS</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getVARIABLE_EXCEPTION_SWITCHER <em>VARIABLE EXCEPTION SWITCHER</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtSuffixActivation <em>Ft Suffix Activation</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getKRErrorStack <em>KR Error Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getRETURN_EXPRESSION_TO_REPLACE_SPECIAL <em>RETURN EXPRESSION TO REPLACE SPECIAL</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getInc_resultLastStatementStack <em>Inc result Last Statement Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getRETURN_EXPRESSION_TO_REPLACE <em>RETURN EXPRESSION TO REPLACE</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getValueTypeMapping <em>Value Type Mapping</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getMode <em>Mode</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getStaticOperationMode <em>Static Operation Mode</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getKmInput <em>Km Input</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFtStack <em>Ft Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getCondStack <em>Cond Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getSimkOutput <em>Simk Output</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getJAVA_CLASS_EXCEPTION_SWITCHER <em>JAVA CLASS EXCEPTION SWITCHER</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getAfterLbdExpActivation <em>After Lbd Exp Activation</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getFUNCTION_TYPE_COMPILATION_TASK <em>FUNCTION TYPE COMPILATION TASK</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getInc_kRErrorStack <em>Inc kR Error Stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getTraceabilityInput <em>Traceability Input</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getTasks_stack <em>Tasks stack</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getMu <em>Mu</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getSELF_EXPRESSION_TO_REPLACE <em>SELF EXPRESSION TO REPLACE</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getKERMETA_SEPARATOR <em>KERMETA SEPARATOR</em>}</li>
 *   <li>{@link km2ecore.KM2EcoreContext#getInc_ftSuffix <em>Inc ft Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext()
 * @model
 * @generated
 */
public interface KM2EcoreContext extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>JAVA INSTANCE EXECUTION CONTEXT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JAVA INSTANCE EXECUTION CONTEXT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JAVA INSTANCE EXECUTION CONTEXT</em>' attribute.
	 * @see #setJAVA_INSTANCE_EXECUTION_CONTEXT(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_JAVA_INSTANCE_EXECUTION_CONTEXT()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getJAVA_INSTANCE_EXECUTION_CONTEXT();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getJAVA_INSTANCE_EXECUTION_CONTEXT <em>JAVA INSTANCE EXECUTION CONTEXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JAVA INSTANCE EXECUTION CONTEXT</em>' attribute.
	 * @see #getJAVA_INSTANCE_EXECUTION_CONTEXT()
	 * @generated
	 */
	void setJAVA_INSTANCE_EXECUTION_CONTEXT(String value);

	/**
	 * Returns the value of the '<em><b>Java Key Word List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Key Word List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Key Word List</em>' reference.
	 * @see #setJavaKeyWordList(JavaKeyWordList)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_JavaKeyWordList()
	 * @model annotation="kermeta documentation='/*****\052/'"
	 *        annotation="kermeta documentation='/** Unique instance of the JavaKeyWordList \052/'"
	 * @generated
	 */
	JavaKeyWordList getJavaKeyWordList();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getJavaKeyWordList <em>Java Key Word List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Key Word List</em>' reference.
	 * @see #getJavaKeyWordList()
	 * @generated
	 */
	void setJavaKeyWordList(JavaKeyWordList value);

	/**
	 * Returns the value of the '<em><b>Trace Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Model</em>' reference.
	 * @see #setTraceModel(TraceModel)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_TraceModel()
	 * @model required="true"
	 *        annotation="kermeta documentation='/**\tThe trace model dedicated to the km model (kmt2km) used for the transformation \052/'"
	 * @generated
	 */
	TraceModel getTraceModel();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getTraceModel <em>Trace Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Model</em>' reference.
	 * @see #getTraceModel()
	 * @generated
	 */
	void setTraceModel(TraceModel value);

	/**
	 * Returns the value of the '<em><b>TYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TYPE SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE SEPARATOR</em>' attribute.
	 * @see #setTYPE_SEPARATOR(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_TYPE_SEPARATOR()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getTYPE_SEPARATOR();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getTYPE_SEPARATOR <em>TYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE SEPARATOR</em>' attribute.
	 * @see #getTYPE_SEPARATOR()
	 * @generated
	 */
	void setTYPE_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>NOT EVALUATED MESSAGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NOT EVALUATED MESSAGE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOT EVALUATED MESSAGE</em>' attribute.
	 * @see #setNOT_EVALUATED_MESSAGE(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_NOT_EVALUATED_MESSAGE()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getNOT_EVALUATED_MESSAGE();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getNOT_EVALUATED_MESSAGE <em>NOT EVALUATED MESSAGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOT EVALUATED MESSAGE</em>' attribute.
	 * @see #getNOT_EVALUATED_MESSAGE()
	 * @generated
	 */
	void setNOT_EVALUATED_MESSAGE(String value);

	/**
	 * Returns the value of the '<em><b>Output Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Repository</em>' reference.
	 * @see #setOutputRepository(EMFRepository)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_OutputRepository()
	 * @model required="true"
	 *        annotation="kermeta documentation='/**  \052/'"
	 * @generated
	 */
	EMFRepository getOutputRepository();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getOutputRepository <em>Output Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Repository</em>' reference.
	 * @see #getOutputRepository()
	 * @generated
	 */
	void setOutputRepository(EMFRepository value);

	/**
	 * Returns the value of the '<em><b>SEPARATOR STATEMENT FT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SEPARATOR STATEMENT FT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SEPARATOR STATEMENT FT</em>' attribute.
	 * @see #setSEPARATOR_STATEMENT_FT(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_SEPARATOR_STATEMENT_FT()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getSEPARATOR_STATEMENT_FT();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getSEPARATOR_STATEMENT_FT <em>SEPARATOR STATEMENT FT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEPARATOR STATEMENT FT</em>' attribute.
	 * @see #getSEPARATOR_STATEMENT_FT()
	 * @generated
	 */
	void setSEPARATOR_STATEMENT_FT(String value);

	/**
	 * Returns the value of the '<em><b>Input Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Repository</em>' reference.
	 * @see #setInputRepository(EMFRepository)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_InputRepository()
	 * @model required="true"
	 *        annotation="kermeta documentation='/**  \052/'"
	 * @generated
	 */
	EMFRepository getInputRepository();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getInputRepository <em>Input Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Repository</em>' reference.
	 * @see #getInputRepository()
	 * @generated
	 */
	void setInputRepository(EMFRepository value);

	/**
	 * Returns the value of the '<em><b>Result Last Statement Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Last Statement Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Last Statement Stack</em>' reference.
	 * @see #setResultLastStatementStack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_ResultLastStatementStack()
	 * @model type="kermeta.utils.Stack<kermeta.standard.JavaString>"
	 * @generated
	 */
	Stack<String> getResultLastStatementStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getResultLastStatementStack <em>Result Last Statement Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Last Statement Stack</em>' reference.
	 * @see #getResultLastStatementStack()
	 * @generated
	 */
	void setResultLastStatementStack(Stack<String> value);

	/**
	 * Returns the value of the '<em><b>Framework Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Operations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Operations</em>' attribute list.
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FrameworkOperations()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** List of the method from the framework \052/'"
	 * @generated
	 */
	EList<String> getFrameworkOperations();

	/**
	 * Returns the value of the '<em><b>COLLECTION UTIL CLASS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COLLECTION UTIL CLASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COLLECTION UTIL CLASS</em>' attribute.
	 * @see #setCOLLECTION_UTIL_CLASS(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_COLLECTION_UTIL_CLASS()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getCOLLECTION_UTIL_CLASS();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getCOLLECTION_UTIL_CLASS <em>COLLECTION UTIL CLASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLLECTION UTIL CLASS</em>' attribute.
	 * @see #getCOLLECTION_UTIL_CLASS()
	 * @generated
	 */
	void setCOLLECTION_UTIL_CLASS(String value);

	/**
	 * Returns the value of the '<em><b>Compiled Java Extern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiled Java Extern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiled Java Extern</em>' attribute.
	 * @see #setCompiledJavaExtern(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_CompiledJavaExtern()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 *        annotation="kermeta documentation='/*******\052/'"
	 *        annotation="kermeta documentation='/**  \052/'"
	 * @generated
	 */
	String getCompiledJavaExtern();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getCompiledJavaExtern <em>Compiled Java Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiled Java Extern</em>' attribute.
	 * @see #getCompiledJavaExtern()
	 * @generated
	 */
	void setCompiledJavaExtern(String value);

	/**
	 * Returns the value of the '<em><b>Current value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current value Type</em>' reference.
	 * @see #setCurrent_valueType(ClassDefinition)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Current_valueType()
	 * @model annotation="kermeta documentation='/*******\052/'"
	 * @generated
	 */
	ClassDefinition getCurrent_valueType();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getCurrent_valueType <em>Current value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current value Type</em>' reference.
	 * @see #getCurrent_valueType()
	 * @generated
	 */
	void setCurrent_valueType(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Before Function Type Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Function Type Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Function Type Result</em>' attribute.
	 * @see #setBeforeFunctionTypeResult(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_BeforeFunctionTypeResult()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getBeforeFunctionTypeResult();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getBeforeFunctionTypeResult <em>Before Function Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Function Type Result</em>' attribute.
	 * @see #getBeforeFunctionTypeResult()
	 * @generated
	 */
	void setBeforeFunctionTypeResult(String value);

	/**
	 * Returns the value of the '<em><b>Inc cond Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc cond Stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc cond Stack</em>' attribute.
	 * @see #setInc_condStack(Integer)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Inc_condStack()
	 * @model dataType="kermeta.standard.JavaInteger"
	 * @generated
	 */
	Integer getInc_condStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getInc_condStack <em>Inc cond Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc cond Stack</em>' attribute.
	 * @see #getInc_condStack()
	 * @generated
	 */
	void setInc_condStack(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Suffix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Suffix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Suffix</em>' reference.
	 * @see #setFtSuffix(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtSuffix()
	 * @model type="kermeta.utils.Stack<kermeta.standard.JavaString>"
	 *        annotation="kermeta documentation='/*** params for FunctionType contextual compiling **\052/'"
	 * @generated
	 */
	Stack<String> getFtSuffix();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtSuffix <em>Ft Suffix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Suffix</em>' reference.
	 * @see #getFtSuffix()
	 * @generated
	 */
	void setFtSuffix(Stack<String> value);

	/**
	 * Returns the value of the '<em><b>Ft Map Type Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Map Type Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Map Type Stack</em>' reference.
	 * @see #setFtMapTypeStack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtMapTypeStack()
	 * @model
	 * @generated
	 */
	Stack<Hashtable<Type, Type>> getFtMapTypeStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtMapTypeStack <em>Ft Map Type Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Map Type Stack</em>' reference.
	 * @see #getFtMapTypeStack()
	 * @generated
	 */
	void setFtMapTypeStack(Stack<Hashtable<Type, Type>> value);

	/**
	 * Returns the value of the '<em><b>Simk Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simk Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simk Model</em>' reference.
	 * @see #setSimkModel(SIMKModel)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_SimkModel()
	 * @model required="true"
	 * @generated
	 */
	SIMKModel getSimkModel();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getSimkModel <em>Simk Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simk Model</em>' reference.
	 * @see #getSimkModel()
	 * @generated
	 */
	void setSimkModel(SIMKModel value);

	/**
	 * Returns the value of the '<em><b>JAVA SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JAVA SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JAVA SEPARATOR</em>' attribute.
	 * @see #setJAVA_SEPARATOR(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_JAVA_SEPARATOR()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getJAVA_SEPARATOR();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getJAVA_SEPARATOR <em>JAVA SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JAVA SEPARATOR</em>' attribute.
	 * @see #getJAVA_SEPARATOR()
	 * @generated
	 */
	void setJAVA_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>Ft Product Type Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Product Type Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Product Type Stack</em>' reference.
	 * @see #setFtProductTypeStack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtProductTypeStack()
	 * @model
	 * @generated
	 */
	Stack<ProductType> getFtProductTypeStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtProductTypeStack <em>Ft Product Type Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Product Type Stack</em>' reference.
	 * @see #getFtProductTypeStack()
	 * @generated
	 */
	void setFtProductTypeStack(Stack<ProductType> value);

	/**
	 * Returns the value of the '<em><b>Current param ft</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current param ft</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current param ft</em>' reference.
	 * @see #setCurrent_param_ft(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Current_param_ft()
	 * @model type="kermeta.utils.Stack<kermeta.standard.JavaString>"
	 * @generated
	 */
	Stack<String> getCurrent_param_ft();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getCurrent_param_ft <em>Current param ft</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current param ft</em>' reference.
	 * @see #getCurrent_param_ft()
	 * @generated
	 */
	void setCurrent_param_ft(Stack<String> value);

	/**
	 * Returns the value of the '<em><b>PREVIOUS STATEMENT FT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PREVIOUS STATEMENT FT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PREVIOUS STATEMENT FT</em>' attribute.
	 * @see #setPREVIOUS_STATEMENT_FT(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_PREVIOUS_STATEMENT_FT()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getPREVIOUS_STATEMENT_FT();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getPREVIOUS_STATEMENT_FT <em>PREVIOUS STATEMENT FT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PREVIOUS STATEMENT FT</em>' attribute.
	 * @see #getPREVIOUS_STATEMENT_FT()
	 * @generated
	 */
	void setPREVIOUS_STATEMENT_FT(String value);

	/**
	 * Returns the value of the '<em><b>Ft Contextual Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Contextual Self</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Contextual Self</em>' attribute.
	 * @see #setFtContextualSelf(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtContextualSelf()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getFtContextualSelf();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtContextualSelf <em>Ft Contextual Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Contextual Self</em>' attribute.
	 * @see #getFtContextualSelf()
	 * @generated
	 */
	void setFtContextualSelf(String value);

	/**
	 * Returns the value of the '<em><b>JAVA CLASS EXECUTION CONTEXT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JAVA CLASS EXECUTION CONTEXT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JAVA CLASS EXECUTION CONTEXT</em>' attribute.
	 * @see #setJAVA_CLASS_EXECUTION_CONTEXT(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_JAVA_CLASS_EXECUTION_CONTEXT()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getJAVA_CLASS_EXECUTION_CONTEXT();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getJAVA_CLASS_EXECUTION_CONTEXT <em>JAVA CLASS EXECUTION CONTEXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JAVA CLASS EXECUTION CONTEXT</em>' attribute.
	 * @see #getJAVA_CLASS_EXECUTION_CONTEXT()
	 * @generated
	 */
	void setJAVA_CLASS_EXECUTION_CONTEXT(String value);

	/**
	 * Returns the value of the '<em><b>Before Lambda Expression Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Lambda Expression Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Lambda Expression Result</em>' attribute.
	 * @see #setBeforeLambdaExpressionResult(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_BeforeLambdaExpressionResult()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getBeforeLambdaExpressionResult();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Lambda Expression Result</em>' attribute.
	 * @see #getBeforeLambdaExpressionResult()
	 * @generated
	 */
	void setBeforeLambdaExpressionResult(String value);

	/**
	 * Returns the value of the '<em><b>Ft Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Return Type</em>' attribute.
	 * @see #setFtReturnType(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtReturnType()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getFtReturnType();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtReturnType <em>Ft Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Return Type</em>' attribute.
	 * @see #getFtReturnType()
	 * @generated
	 */
	void setFtReturnType(String value);

	/**
	 * Returns the value of the '<em><b>OBJECT UTIL CLASS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OBJECT UTIL CLASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OBJECT UTIL CLASS</em>' attribute.
	 * @see #setOBJECT_UTIL_CLASS(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_OBJECT_UTIL_CLASS()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getOBJECT_UTIL_CLASS();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getOBJECT_UTIL_CLASS <em>OBJECT UTIL CLASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OBJECT UTIL CLASS</em>' attribute.
	 * @see #getOBJECT_UTIL_CLASS()
	 * @generated
	 */
	void setOBJECT_UTIL_CLASS(String value);

	/**
	 * Returns the value of the '<em><b>VARIABLE EXCEPTION SWITCHER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VARIABLE EXCEPTION SWITCHER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VARIABLE EXCEPTION SWITCHER</em>' attribute.
	 * @see #setVARIABLE_EXCEPTION_SWITCHER(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_VARIABLE_EXCEPTION_SWITCHER()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getVARIABLE_EXCEPTION_SWITCHER();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getVARIABLE_EXCEPTION_SWITCHER <em>VARIABLE EXCEPTION SWITCHER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VARIABLE EXCEPTION SWITCHER</em>' attribute.
	 * @see #getVARIABLE_EXCEPTION_SWITCHER()
	 * @generated
	 */
	void setVARIABLE_EXCEPTION_SWITCHER(String value);

	/**
	 * Returns the value of the '<em><b>Ft Suffix Activation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Suffix Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Suffix Activation</em>' attribute.
	 * @see #setFtSuffixActivation(Boolean)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtSuffixActivation()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean" required="true"
	 * @generated
	 */
	Boolean getFtSuffixActivation();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtSuffixActivation <em>Ft Suffix Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Suffix Activation</em>' attribute.
	 * @see #getFtSuffixActivation()
	 * @generated
	 */
	void setFtSuffixActivation(Boolean value);

	/**
	 * Returns the value of the '<em><b>KR Error Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KR Error Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KR Error Stack</em>' reference.
	 * @see #setKRErrorStack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_KRErrorStack()
	 * @model type="kermeta.utils.Stack<kermeta.standard.JavaString>"
	 * @generated
	 */
	Stack<String> getKRErrorStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getKRErrorStack <em>KR Error Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KR Error Stack</em>' reference.
	 * @see #getKRErrorStack()
	 * @generated
	 */
	void setKRErrorStack(Stack<String> value);

	/**
	 * Returns the value of the '<em><b>RETURN EXPRESSION TO REPLACE SPECIAL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RETURN EXPRESSION TO REPLACE SPECIAL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RETURN EXPRESSION TO REPLACE SPECIAL</em>' attribute.
	 * @see #setRETURN_EXPRESSION_TO_REPLACE_SPECIAL(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_RETURN_EXPRESSION_TO_REPLACE_SPECIAL()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getRETURN_EXPRESSION_TO_REPLACE_SPECIAL <em>RETURN EXPRESSION TO REPLACE SPECIAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RETURN EXPRESSION TO REPLACE SPECIAL</em>' attribute.
	 * @see #getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()
	 * @generated
	 */
	void setRETURN_EXPRESSION_TO_REPLACE_SPECIAL(String value);

	/**
	 * Returns the value of the '<em><b>Inc result Last Statement Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc result Last Statement Stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc result Last Statement Stack</em>' attribute.
	 * @see #setInc_resultLastStatementStack(Integer)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Inc_resultLastStatementStack()
	 * @model dataType="kermeta.standard.JavaInteger"
	 * @generated
	 */
	Integer getInc_resultLastStatementStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getInc_resultLastStatementStack <em>Inc result Last Statement Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc result Last Statement Stack</em>' attribute.
	 * @see #getInc_resultLastStatementStack()
	 * @generated
	 */
	void setInc_resultLastStatementStack(Integer value);

	/**
	 * Returns the value of the '<em><b>RETURN EXPRESSION TO REPLACE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RETURN EXPRESSION TO REPLACE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RETURN EXPRESSION TO REPLACE</em>' attribute.
	 * @see #setRETURN_EXPRESSION_TO_REPLACE(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_RETURN_EXPRESSION_TO_REPLACE()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getRETURN_EXPRESSION_TO_REPLACE();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getRETURN_EXPRESSION_TO_REPLACE <em>RETURN EXPRESSION TO REPLACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RETURN EXPRESSION TO REPLACE</em>' attribute.
	 * @see #getRETURN_EXPRESSION_TO_REPLACE()
	 * @generated
	 */
	void setRETURN_EXPRESSION_TO_REPLACE(String value);

	/**
	 * Returns the value of the '<em><b>Value Type Mapping</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type Mapping</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Mapping</em>' attribute list.
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_ValueTypeMapping()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** List of the ValueTypes filled during the pass1 \052/'"
	 * @generated
	 */
	EList<String> getValueTypeMapping();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link km2ecore.CompilingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see km2ecore.CompilingMode
	 * @see #setMode(CompilingMode)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Mode()
	 * @model required="true" transient="true"
	 *        annotation="kermeta documentation='/** The choosen compiling mode \052/'"
	 * @generated
	 */
	CompilingMode getMode();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see km2ecore.CompilingMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(CompilingMode value);

	/**
	 * Returns the value of the '<em><b>Static Operation Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Operation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Operation Mode</em>' attribute.
	 * @see #setStaticOperationMode(Boolean)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_StaticOperationMode()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 * @generated
	 */
	Boolean getStaticOperationMode();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getStaticOperationMode <em>Static Operation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Operation Mode</em>' attribute.
	 * @see #getStaticOperationMode()
	 * @generated
	 */
	void setStaticOperationMode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Km Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Km Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Km Input</em>' attribute.
	 * @see #setKmInput(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_KmInput()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 *        annotation="kermeta documentation='/** The input model (as input of the transformation) \052/'"
	 * @generated
	 */
	String getKmInput();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getKmInput <em>Km Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km Input</em>' attribute.
	 * @see #getKmInput()
	 * @generated
	 */
	void setKmInput(String value);

	/**
	 * Returns the value of the '<em><b>Ft Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ft Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ft Stack</em>' reference.
	 * @see #setFtStack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FtStack()
	 * @model
	 * @generated
	 */
	Stack<LambdaExpression> getFtStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFtStack <em>Ft Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Stack</em>' reference.
	 * @see #getFtStack()
	 * @generated
	 */
	void setFtStack(Stack<LambdaExpression> value);

	/**
	 * Returns the value of the '<em><b>Cond Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Stack</em>' reference.
	 * @see #setCondStack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_CondStack()
	 * @model type="kermeta.utils.Stack<kermeta.standard.JavaString>"
	 * @generated
	 */
	Stack<String> getCondStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getCondStack <em>Cond Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Stack</em>' reference.
	 * @see #getCondStack()
	 * @generated
	 */
	void setCondStack(Stack<String> value);

	/**
	 * Returns the value of the '<em><b>Simk Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simk Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simk Output</em>' attribute.
	 * @see #setSimkOutput(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_SimkOutput()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 *        annotation="kermeta documentation='/** The simk model (as output of the transformation) \052/'"
	 * @generated
	 */
	String getSimkOutput();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getSimkOutput <em>Simk Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simk Output</em>' attribute.
	 * @see #getSimkOutput()
	 * @generated
	 */
	void setSimkOutput(String value);

	/**
	 * Returns the value of the '<em><b>JAVA CLASS EXCEPTION SWITCHER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JAVA CLASS EXCEPTION SWITCHER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JAVA CLASS EXCEPTION SWITCHER</em>' attribute.
	 * @see #setJAVA_CLASS_EXCEPTION_SWITCHER(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_JAVA_CLASS_EXCEPTION_SWITCHER()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 *        annotation="kermeta documentation='/** CONSTANTS \052/'"
	 * @generated
	 */
	String getJAVA_CLASS_EXCEPTION_SWITCHER();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getJAVA_CLASS_EXCEPTION_SWITCHER <em>JAVA CLASS EXCEPTION SWITCHER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JAVA CLASS EXCEPTION SWITCHER</em>' attribute.
	 * @see #getJAVA_CLASS_EXCEPTION_SWITCHER()
	 * @generated
	 */
	void setJAVA_CLASS_EXCEPTION_SWITCHER(String value);

	/**
	 * Returns the value of the '<em><b>After Lbd Exp Activation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Lbd Exp Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Lbd Exp Activation</em>' attribute.
	 * @see #setAfterLbdExpActivation(Boolean)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_AfterLbdExpActivation()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean" required="true"
	 * @generated
	 */
	Boolean getAfterLbdExpActivation();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getAfterLbdExpActivation <em>After Lbd Exp Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Lbd Exp Activation</em>' attribute.
	 * @see #getAfterLbdExpActivation()
	 * @generated
	 */
	void setAfterLbdExpActivation(Boolean value);

	/**
	 * Returns the value of the '<em><b>FUNCTION TYPE COMPILATION TASK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FUNCTION TYPE COMPILATION TASK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FUNCTION TYPE COMPILATION TASK</em>' attribute.
	 * @see #setFUNCTION_TYPE_COMPILATION_TASK(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_FUNCTION_TYPE_COMPILATION_TASK()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getFUNCTION_TYPE_COMPILATION_TASK();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getFUNCTION_TYPE_COMPILATION_TASK <em>FUNCTION TYPE COMPILATION TASK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FUNCTION TYPE COMPILATION TASK</em>' attribute.
	 * @see #getFUNCTION_TYPE_COMPILATION_TASK()
	 * @generated
	 */
	void setFUNCTION_TYPE_COMPILATION_TASK(String value);

	/**
	 * Returns the value of the '<em><b>Inc kR Error Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc kR Error Stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc kR Error Stack</em>' attribute.
	 * @see #setInc_kRErrorStack(Integer)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Inc_kRErrorStack()
	 * @model dataType="kermeta.standard.JavaInteger"
	 * @generated
	 */
	Integer getInc_kRErrorStack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getInc_kRErrorStack <em>Inc kR Error Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc kR Error Stack</em>' attribute.
	 * @see #getInc_kRErrorStack()
	 * @generated
	 */
	void setInc_kRErrorStack(Integer value);

	/**
	 * Returns the value of the '<em><b>Traceability Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceability Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceability Input</em>' attribute.
	 * @see #setTraceabilityInput(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_TraceabilityInput()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 *        annotation="kermeta documentation='/** The input model (as input of the transformation) \052/'"
	 * @generated
	 */
	String getTraceabilityInput();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getTraceabilityInput <em>Traceability Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability Input</em>' attribute.
	 * @see #getTraceabilityInput()
	 * @generated
	 */
	void setTraceabilityInput(String value);

	/**
	 * Returns the value of the '<em><b>Tasks stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks stack</em>' reference.
	 * @see #setTasks_stack(Stack)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Tasks_stack()
	 * @model type="kermeta.utils.Stack<kermeta.standard.JavaString>"
	 * @generated
	 */
	Stack<String> getTasks_stack();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getTasks_stack <em>Tasks stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasks stack</em>' reference.
	 * @see #getTasks_stack()
	 * @generated
	 */
	void setTasks_stack(Stack<String> value);

	/**
	 * Returns the value of the '<em><b>Mu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mu</em>' reference.
	 * @see #setMu(ModelingUnit)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Mu()
	 * @model required="true"
	 *        annotation="kermeta documentation='/** The modeling units source \052/'"
	 * @generated
	 */
	ModelingUnit getMu();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getMu <em>Mu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mu</em>' reference.
	 * @see #getMu()
	 * @generated
	 */
	void setMu(ModelingUnit value);

	/**
	 * Returns the value of the '<em><b>SELF EXPRESSION TO REPLACE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SELF EXPRESSION TO REPLACE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SELF EXPRESSION TO REPLACE</em>' attribute.
	 * @see #setSELF_EXPRESSION_TO_REPLACE(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_SELF_EXPRESSION_TO_REPLACE()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getSELF_EXPRESSION_TO_REPLACE();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getSELF_EXPRESSION_TO_REPLACE <em>SELF EXPRESSION TO REPLACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SELF EXPRESSION TO REPLACE</em>' attribute.
	 * @see #getSELF_EXPRESSION_TO_REPLACE()
	 * @generated
	 */
	void setSELF_EXPRESSION_TO_REPLACE(String value);

	/**
	 * Returns the value of the '<em><b>KERMETA SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KERMETA SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KERMETA SEPARATOR</em>' attribute.
	 * @see #setKERMETA_SEPARATOR(String)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_KERMETA_SEPARATOR()
	 * @model dataType="kermeta.standard.JavaString" required="true"
	 * @generated
	 */
	String getKERMETA_SEPARATOR();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getKERMETA_SEPARATOR <em>KERMETA SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KERMETA SEPARATOR</em>' attribute.
	 * @see #getKERMETA_SEPARATOR()
	 * @generated
	 */
	void setKERMETA_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>Inc ft Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc ft Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc ft Suffix</em>' attribute.
	 * @see #setInc_ftSuffix(Integer)
	 * @see km2ecore.Km2ecorePackage#getKM2EcoreContext_Inc_ftSuffix()
	 * @model dataType="kermeta.standard.JavaInteger"
	 * @generated
	 */
	Integer getInc_ftSuffix();

	/**
	 * Sets the value of the '{@link km2ecore.KM2EcoreContext#getInc_ftSuffix <em>Inc ft Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc ft Suffix</em>' attribute.
	 * @see #getInc_ftSuffix()
	 * @generated
	 */
	void setInc_ftSuffix(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the identifier\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"idLoopCond_\", this.getCondStack().peek());\n\nreturn result;\n'"
	 * @generated
	 */
	String getLoopConditionId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setInc_kRErrorStack(kermeta.standard.helper.IntegerWrapper.plus(this.getInc_kRErrorStack(), 1));\n\n\tthis.getKRErrorStack().push(kermeta.standard.helper.IntegerWrapper.toString(this.getInc_kRErrorStack()));\n'"
	 * @generated
	 */
	void pushKRErrorStack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Save the context\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getNotImplementedException())) );\n\n'"
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the identifier\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"idIfCond_\", this.getCondStack().peek());\n\nreturn result;\n'"
	 * @generated
	 */
	String getIfConditionId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_5 = false;\n\tidIfCond_5 = kermeta.standard.helper.BooleanWrapper.and(this.getFtSuffixActivation(), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFtSuffix().size(), 0));\n\n\tif( idIfCond_5 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"_lbdExp\", this.getFtSuffix().peek());\n}\n else {\n\n\tresult = \"\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String printLbdExpSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_6 = false;\n\tidIfCond_6 = kermeta.standard.helper.IntegerWrapper.isGreater(this.getResultLastStatementStack().size(), 0);\n\n\tif( idIfCond_6 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> str_set = kermeta.standard.helper.StringWrapper.split(this.getResultLastStatementStack().peek(), this.getTYPE_SEPARATOR());\n\n\tresult = str_set.last();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getResultLastStatementType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Initialize the constants\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setJAVA_CLASS_EXCEPTION_SWITCHER(\"org.kermeta.compil.runtime.helper.error.KRuntimeError\");\n\n\tthis.setVARIABLE_EXCEPTION_SWITCHER(\"ex_switcher\");\n\n\tthis.setCOLLECTION_UTIL_CLASS(\"org.kermeta.compil.runtime.helper.basetypes.CollectionUtil\");\n\n\tthis.setOBJECT_UTIL_CLASS(\"org.kermeta.compil.runtime.helper.language.ObjectUtil\");\n\n\tthis.setJAVA_CLASS_EXECUTION_CONTEXT(\"org.kermeta.compil.runtime.ExecutionContext\");\n\n\tthis.setJAVA_INSTANCE_EXECUTION_CONTEXT(kermeta.standard.helper.StringWrapper.plus(this.getJAVA_CLASS_EXECUTION_CONTEXT(), \".getInstance()\"));\n\n\tthis.setNOT_EVALUATED_MESSAGE(\"//FIXME This statement cannot be evaluated without an assignment: \");\n\n\tthis.setSELF_EXPRESSION_TO_REPLACE(\"SELF_EXPRESSION_TO_REPLACE_STR\");\n\n\tthis.setRETURN_EXPRESSION_TO_REPLACE(\"RETURN_EXPRESSION_TO_REPLACE_STR\");\n\n\tthis.setRETURN_EXPRESSION_TO_REPLACE_SPECIAL(\"RETURN_EXPRESSION_TO_REPLACE_SPECIAL_STR\");\n\n\tthis.setSEPARATOR_STATEMENT_FT(\"SEPARATOR_STATEMENT_FT_STR\");\n\n\tthis.setPREVIOUS_STATEMENT_FT(\"PREVIOUS_STATEMENT_FT_STR\");\n\n\tthis.setTYPE_SEPARATOR(\"TYPE_SEPARATOR\");\n\n\tthis.setFUNCTION_TYPE_COMPILATION_TASK(\"FunctionType_Compilation\");\n\n\tthis.setKERMETA_SEPARATOR(\"::\");\n\n\tthis.setJAVA_SEPARATOR(\".\");\n'"
	 * @generated
	 */
	void initializeConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setInc_ftSuffix(kermeta.standard.helper.IntegerWrapper.plus(this.getInc_ftSuffix(), 1));\n\n\tthis.getFtSuffix().push(kermeta.standard.helper.IntegerWrapper.toString(this.getInc_ftSuffix()));\n'"
	 * @generated
	 */
	void pushFtSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_7 = false;\n\tidIfCond_7 = kermeta.standard.helper.IntegerWrapper.isGreater(this.getResultLastStatementStack().size(), 0);\n\n\tif( idIfCond_7 ) {\n\n\tthis.setInc_resultLastStatementStack(this.getInc_resultLastStatementStack());\n\n\tthis.getResultLastStatementStack().pop();\n}\n\n'"
	 * @generated
	 */
	void popResultLastStatementStack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * All methods from Type, Class and Object that are called via Switcher in order to resolve the following issue:\r\n\t * Type.isInstance: not possible directly in Java\r\n\t * Class.clone: not possible directly in Java\r\n\t * 22.getMetaClass: not possible directly in Java\r\n\t * Limits: each new methods\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"getMetaClass\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"container\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"checkInvariants\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"checkAllInvariants\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"equals\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isNotEqual\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isKindOf\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"get\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"set\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isSet\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"unset\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"oid\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"toString\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isFrozen\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isVoid\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"hashcode\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"freeze\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"asType\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isInstanceOf\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"containingResource\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"clone\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"deepClone\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isInstance\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isSuperTypeOf\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getFrameworkOperations()).add(\"isSubTypeOf\");\n'"
	 * @generated
	 */
	void initializeFrameworkOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_8 = false;\n\tidIfCond_8 = kermeta.standard.helper.BooleanWrapper.and(this.getFtSuffixActivation(), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFtSuffix().size(), 0));\n\n\tif( idIfCond_8 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"_ft\", this.getFtSuffix().peek());\n}\n else {\n\n\tresult = \"\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String printFtSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setInc_condStack(kermeta.standard.helper.IntegerWrapper.plus(this.getInc_condStack(), 1));\n\n\tthis.getCondStack().push(kermeta.standard.helper.IntegerWrapper.toString(this.getInc_condStack()));\n'"
	 * @generated
	 */
	void pushCondStack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setKmInput(modelInput);\n\n\tthis.setTraceabilityInput(traceInput);\n\n\tthis.setTasks_stack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.getTasks_stack().push(\"Start\");\n\n\tthis.setCondStack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setInc_condStack(0);\n\n\tthis.setKRErrorStack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setInc_kRErrorStack(0);\n\n\tthis.initializeConstants();\n\n\tthis.setCompiledJavaExtern(\"\");\n\n\tthis.setCurrent_valueType(null);\n\n\tthis.setFtStack(((kermeta.utils.Stack<kermeta.language.behavior.LambdaExpression>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setCurrent_param_ft(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.getCurrent_param_ft().push(\"\");\n\n\tthis.setFtSuffix(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setInc_ftSuffix(0);\n\n\tthis.setFtSuffixActivation(false);\n\n\tthis.setAfterLbdExpActivation(false);\n\n\tthis.setFtContextualSelf(\"\");\n\n\tthis.setFtReturnType(\"\");\n\n\tthis.setBeforeLambdaExpressionResult(\"\");\n\n\tthis.setFtProductTypeStack(((kermeta.utils.Stack<kermeta.language.structure.ProductType>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setFtMapTypeStack(((kermeta.utils.Stack<kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setResultLastStatementStack(((kermeta.utils.Stack<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStack())));\n\n\tthis.setInc_resultLastStatementStack(0);\n\n\tthis.setJavaKeyWordList(((km2ecore.common.JavaKeyWordList) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.common.CommonPackage.eINSTANCE.getJavaKeyWordList())));\n\n\tthis.getJavaKeyWordList().initialize();\n\n\tthis.initializeFrameworkOperations();\n\n\tthis.setStaticOperationMode(false);\n\n\tthis.setInputRepository(((kermeta.persistence.EMFRepository) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.persistence.PersistencePackage.eINSTANCE.getEMFRepository())));\n\n\tkermeta.persistence.Resource modelResource = this.getInputRepository().createResource(modelInput, \"http://www.kermeta.org/kermeta/1_2_0//kermeta\");\n\n\tmodelResource.load();\n\n\tthis.setMu(((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(modelResource.instances().one(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))));\n\n\tjava.lang.Boolean idIfCond_9 = false;\n\tidIfCond_9 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(traceInput)), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(traceInput, \"\"));\n\n\tif( idIfCond_9 ) {\n\n\tkermeta.persistence.Resource traceResource = this.getInputRepository().createResource(traceInput, \"http://www.kermeta.org/Traceability\");\n\n\ttraceResource.load();\n\n\tthis.setTraceModel(((traceability.TraceModel) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(traceResource.instances().one(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TraceModel\"))));\n\n\t((km2ecore.SourceTracer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.Km2ecorePackage.eINSTANCE.getSourceTracer())).addSourceInformation(this);\n}\n\n\n\tthis.setOutputRepository(((kermeta.persistence.EMFRepository) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.persistence.PersistencePackage.eINSTANCE.getEMFRepository())));\n\n\tthis.setSimkModel(((simk.SIMKModel) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSIMKModel())));\n'"
	 * @generated
	 */
	void initialize(String modelInput, String traceInput);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get the identifier\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_10 = false;\n\tidIfCond_10 = kermeta.standard.helper.IntegerWrapper.isGreater(this.getResultLastStatementStack().size(), 0);\n\n\tif( idIfCond_10 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> str_set = kermeta.standard.helper.StringWrapper.split(this.getResultLastStatementStack().peek(), this.getTYPE_SEPARATOR());\n\n\tresult = str_set.first();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getResultLastStatementId();

} // KM2EcoreContext
