/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterpreterPackage.java,v 1.3 2008-09-22 14:45:47 cfaucher Exp $
 */
package kermeta.interpreter;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see kermeta.interpreter.InterpreterFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/kermeta/1_2_0//kermeta/interpreter'"
 *        annotation="kermeta documentation='/**\r\n * Contains a set of classes whose function is to evaluate a kermeta \r\n * expression written as a string.\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/interpreter_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface InterpreterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interpreter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/1_2_0//kermeta/interpreter/kermeta_temp_uri";

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
	InterpreterPackage eINSTANCE = kermeta.interpreter.impl.InterpreterPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link kermeta.interpreter.impl.DynamicExpressionImpl <em>Dynamic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.interpreter.impl.DynamicExpressionImpl
	 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getDynamicExpression()
	 * @generated
	 */
	int DYNAMIC_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__EXPRESSION = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__ERRORS = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__FORMAL_PARAMETERS = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Self Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION__SELF_CLASS = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dynamic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kermeta.interpreter.impl.KermetaErrorImpl <em>Kermeta Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.interpreter.impl.KermetaErrorImpl
	 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getKermetaError()
	 * @generated
	 */
	int KERMETA_ERROR = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__CONTAINER = StructurePackage.OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR__MESSAGE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kermeta Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_ERROR_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.interpreter.impl.ParseErrorImpl <em>Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.interpreter.impl.ParseErrorImpl
	 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getParseError()
	 * @generated
	 */
	int PARSE_ERROR = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__FILE = KERMETA_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__TAG = KERMETA_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__FILE_NAME = KERMETA_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__LINE_NUMBER = KERMETA_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__OWNED_TAGS = KERMETA_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__OID = KERMETA_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__CONTAINER = KERMETA_ERROR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR__MESSAGE = KERMETA_ERROR__MESSAGE;

	/**
	 * The number of structural features of the '<em>Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR_FEATURE_COUNT = KERMETA_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.interpreter.impl.TypeErrorImpl <em>Type Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.interpreter.impl.TypeErrorImpl
	 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getTypeError()
	 * @generated
	 */
	int TYPE_ERROR = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__FILE = KERMETA_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__TAG = KERMETA_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__FILE_NAME = KERMETA_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__LINE_NUMBER = KERMETA_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__OWNED_TAGS = KERMETA_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__OID = KERMETA_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__CONTAINER = KERMETA_ERROR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR__MESSAGE = KERMETA_ERROR__MESSAGE;

	/**
	 * The number of structural features of the '<em>Type Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ERROR_FEATURE_COUNT = KERMETA_ERROR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link kermeta.interpreter.DynamicExpression <em>Dynamic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Expression</em>'.
	 * @see kermeta.interpreter.DynamicExpression
	 * @generated
	 */
	EClass getDynamicExpression();

	/**
	 * Returns the meta object for the reference '{@link kermeta.interpreter.DynamicExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see kermeta.interpreter.DynamicExpression#getExpression()
	 * @see #getDynamicExpression()
	 * @generated
	 */
	EReference getDynamicExpression_Expression();

	/**
	 * Returns the meta object for the reference list '{@link kermeta.interpreter.DynamicExpression#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Errors</em>'.
	 * @see kermeta.interpreter.DynamicExpression#getErrors()
	 * @see #getDynamicExpression()
	 * @generated
	 */
	EReference getDynamicExpression_Errors();

	/**
	 * Returns the meta object for the reference '{@link kermeta.interpreter.DynamicExpression#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal Parameters</em>'.
	 * @see kermeta.interpreter.DynamicExpression#getFormalParameters()
	 * @see #getDynamicExpression()
	 * @generated
	 */
	EReference getDynamicExpression_FormalParameters();

	/**
	 * Returns the meta object for the reference '{@link kermeta.interpreter.DynamicExpression#getSelfClass <em>Self Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Self Class</em>'.
	 * @see kermeta.interpreter.DynamicExpression#getSelfClass()
	 * @see #getDynamicExpression()
	 * @generated
	 */
	EReference getDynamicExpression_SelfClass();

	/**
	 * Returns the meta object for class '{@link kermeta.interpreter.KermetaError <em>Kermeta Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Error</em>'.
	 * @see kermeta.interpreter.KermetaError
	 * @generated
	 */
	EClass getKermetaError();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.interpreter.KermetaError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see kermeta.interpreter.KermetaError#getMessage()
	 * @see #getKermetaError()
	 * @generated
	 */
	EAttribute getKermetaError_Message();

	/**
	 * Returns the meta object for class '{@link kermeta.interpreter.ParseError <em>Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parse Error</em>'.
	 * @see kermeta.interpreter.ParseError
	 * @generated
	 */
	EClass getParseError();

	/**
	 * Returns the meta object for class '{@link kermeta.interpreter.TypeError <em>Type Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Error</em>'.
	 * @see kermeta.interpreter.TypeError
	 * @generated
	 */
	EClass getTypeError();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterpreterFactory getInterpreterFactory();

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
		 * The meta object literal for the '{@link kermeta.interpreter.impl.DynamicExpressionImpl <em>Dynamic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.interpreter.impl.DynamicExpressionImpl
		 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getDynamicExpression()
		 * @generated
		 */
		EClass DYNAMIC_EXPRESSION = eINSTANCE.getDynamicExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_EXPRESSION__EXPRESSION = eINSTANCE
				.getDynamicExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_EXPRESSION__ERRORS = eINSTANCE
				.getDynamicExpression_Errors();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_EXPRESSION__FORMAL_PARAMETERS = eINSTANCE
				.getDynamicExpression_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Self Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_EXPRESSION__SELF_CLASS = eINSTANCE
				.getDynamicExpression_SelfClass();

		/**
		 * The meta object literal for the '{@link kermeta.interpreter.impl.KermetaErrorImpl <em>Kermeta Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.interpreter.impl.KermetaErrorImpl
		 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getKermetaError()
		 * @generated
		 */
		EClass KERMETA_ERROR = eINSTANCE.getKermetaError();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_ERROR__MESSAGE = eINSTANCE.getKermetaError_Message();

		/**
		 * The meta object literal for the '{@link kermeta.interpreter.impl.ParseErrorImpl <em>Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.interpreter.impl.ParseErrorImpl
		 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getParseError()
		 * @generated
		 */
		EClass PARSE_ERROR = eINSTANCE.getParseError();

		/**
		 * The meta object literal for the '{@link kermeta.interpreter.impl.TypeErrorImpl <em>Type Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.interpreter.impl.TypeErrorImpl
		 * @see kermeta.interpreter.impl.InterpreterPackageImpl#getTypeError()
		 * @generated
		 */
		EClass TYPE_ERROR = eINSTANCE.getTypeError();

	}

} //InterpreterPackage
