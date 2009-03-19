/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpoonPackage.java,v 1.1 2007/02/14 20:38:07 barais Exp $
 */
package emf.spoon;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see emf.spoon.SpoonFactory
 * @model kind="package"
 * @generated
 */
public interface SpoonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spoon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spoon";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spoon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpoonPackage eINSTANCE = emf.spoon.impl.SpoonPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.spoon.impl.DummyImpl <em>Dummy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.impl.DummyImpl
	 * @see emf.spoon.impl.SpoonPackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 0;

	/**
	 * The number of structural features of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see emf.spoon.impl.SpoonPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The meta object id for the '<em>Constructor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Constructor
	 * @see emf.spoon.impl.SpoonPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 2;

	/**
	 * The meta object id for the '<em>Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Method
	 * @see emf.spoon.impl.SpoonPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 3;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see emf.spoon.impl.SpoonPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 4;

	/**
	 * The meta object id for the '<em>Field</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Field
	 * @see emf.spoon.impl.SpoonPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see emf.spoon.impl.SpoonPackageImpl#getString()
	 * @generated
	 */
	int STRING = 6;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see emf.spoon.impl.SpoonPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 7;

	/**
	 * The meta object id for the '<em>Annotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.annotation.Annotation
	 * @see emf.spoon.impl.SpoonPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 8;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see emf.spoon.impl.SpoonPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 9;

	/**
	 * The meta object id for the '<em>Binary Operator Kind</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.BinaryOperatorKind
	 * @see emf.spoon.impl.SpoonPackageImpl#getBinaryOperatorKind()
	 * @generated
	 */
	int BINARY_OPERATOR_KIND = 10;

	/**
	 * The meta object id for the '<em>Unary Operator Kind</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.UnaryOperatorKind
	 * @see emf.spoon.impl.SpoonPackageImpl#getUnaryOperatorKind()
	 * @generated
	 */
	int UNARY_OPERATOR_KIND = 11;

	/**
	 * The meta object id for the '<em>Modifier Kind</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.ModifierKind
	 * @see emf.spoon.impl.SpoonPackageImpl#getModifierKind()
	 * @generated
	 */
	int MODIFIER_KIND = 12;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see emf.spoon.impl.SpoonPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 13;


	/**
	 * Returns the meta object for class '{@link emf.spoon.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy</em>'.
	 * @see emf.spoon.Dummy
	 * @generated
	 */
	EClass getDummy();

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
	 * Returns the meta object for data type '{@link java.lang.reflect.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constructor</em>'.
	 * @see java.lang.reflect.Constructor
	 * @model instanceClass="java.lang.reflect.Constructor"
	 * @generated
	 */
	EDataType getConstructor();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method</em>'.
	 * @see java.lang.reflect.Method
	 * @model instanceClass="java.lang.reflect.Method"
	 * @generated
	 */
	EDataType getMethod();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Field</em>'.
	 * @see java.lang.reflect.Field
	 * @model instanceClass="java.lang.reflect.Field"
	 * @generated
	 */
	EDataType getField();

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
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class"
	 * @generated
	 */
	EDataType getClass_();

	/**
	 * Returns the meta object for data type '{@link java.lang.annotation.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Annotation</em>'.
	 * @see java.lang.annotation.Annotation
	 * @model instanceClass="java.lang.annotation.Annotation"
	 * @generated
	 */
	EDataType getAnnotation();

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
	 * Returns the meta object for data type '{@link spoon.reflect.code.BinaryOperatorKind <em>Binary Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Operator Kind</em>'.
	 * @see spoon.reflect.code.BinaryOperatorKind
	 * @model instanceClass="spoon.reflect.code.BinaryOperatorKind"
	 * @generated
	 */
	EDataType getBinaryOperatorKind();

	/**
	 * Returns the meta object for data type '{@link spoon.reflect.code.UnaryOperatorKind <em>Unary Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unary Operator Kind</em>'.
	 * @see spoon.reflect.code.UnaryOperatorKind
	 * @model instanceClass="spoon.reflect.code.UnaryOperatorKind"
	 * @generated
	 */
	EDataType getUnaryOperatorKind();

	/**
	 * Returns the meta object for data type '{@link spoon.reflect.declaration.ModifierKind <em>Modifier Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modifier Kind</em>'.
	 * @see spoon.reflect.declaration.ModifierKind
	 * @model instanceClass="spoon.reflect.declaration.ModifierKind"
	 * @generated
	 */
	EDataType getModifierKind();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpoonFactory getSpoonFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link emf.spoon.impl.DummyImpl <em>Dummy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.impl.DummyImpl
		 * @see emf.spoon.impl.SpoonPackageImpl#getDummy()
		 * @generated
		 */
		EClass DUMMY = eINSTANCE.getDummy();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see emf.spoon.impl.SpoonPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Constructor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Constructor
		 * @see emf.spoon.impl.SpoonPackageImpl#getConstructor()
		 * @generated
		 */
		EDataType CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em>Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Method
		 * @see emf.spoon.impl.SpoonPackageImpl#getMethod()
		 * @generated
		 */
		EDataType METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see emf.spoon.impl.SpoonPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Field</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Field
		 * @see emf.spoon.impl.SpoonPackageImpl#getField()
		 * @generated
		 */
		EDataType FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see emf.spoon.impl.SpoonPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see emf.spoon.impl.SpoonPackageImpl#getClass_()
		 * @generated
		 */
		EDataType CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em>Annotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.annotation.Annotation
		 * @see emf.spoon.impl.SpoonPackageImpl#getAnnotation()
		 * @generated
		 */
		EDataType ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see emf.spoon.impl.SpoonPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Binary Operator Kind</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.BinaryOperatorKind
		 * @see emf.spoon.impl.SpoonPackageImpl#getBinaryOperatorKind()
		 * @generated
		 */
		EDataType BINARY_OPERATOR_KIND = eINSTANCE.getBinaryOperatorKind();

		/**
		 * The meta object literal for the '<em>Unary Operator Kind</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.UnaryOperatorKind
		 * @see emf.spoon.impl.SpoonPackageImpl#getUnaryOperatorKind()
		 * @generated
		 */
		EDataType UNARY_OPERATOR_KIND = eINSTANCE.getUnaryOperatorKind();

		/**
		 * The meta object literal for the '<em>Modifier Kind</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.ModifierKind
		 * @see emf.spoon.impl.SpoonPackageImpl#getModifierKind()
		 * @generated
		 */
		EDataType MODIFIER_KIND = eINSTANCE.getModifierKind();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see emf.spoon.impl.SpoonPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //SpoonPackage
