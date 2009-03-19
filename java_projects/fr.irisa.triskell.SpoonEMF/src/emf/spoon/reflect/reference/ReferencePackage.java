/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencePackage.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import emf.spoon.facade.FacadePackage;

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
 * @see emf.spoon.reflect.reference.ReferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ReferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spoon#reflect.reference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spoon.reflect.reference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencePackage eINSTANCE = emf.spoon.reflect.reference.impl.ReferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtGenericElementReferenceImpl <em>Ct Generic Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtGenericElementReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtGenericElementReference()
	 * @generated
	 */
	int CT_GENERIC_ELEMENT_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS = FacadePackage.CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Generic Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT = FacadePackage.CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl <em>Ct Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtTypeReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtTypeReference()
	 * @generated
	 */
	int CT_TYPE_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS = CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__SIMPLE_NAME = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__ANNOTATIONS = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__DECLARATION = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__DECLARING_TYPE = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__PACKAGE = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__ACTUAL_CLASS = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Primitif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__PRIMITIF = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE__QUALIFIED_NAME = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ct Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE_FEATURE_COUNT = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtArrayTypeReferenceImpl <em>Ct Array Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtArrayTypeReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtArrayTypeReference()
	 * @generated
	 */
	int CT_ARRAY_TYPE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS = CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__SIMPLE_NAME = CT_TYPE_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__ANNOTATIONS = CT_TYPE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__DECLARATION = CT_TYPE_REFERENCE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__DECLARING_TYPE = CT_TYPE_REFERENCE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__PACKAGE = CT_TYPE_REFERENCE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__ACTUAL_CLASS = CT_TYPE_REFERENCE__ACTUAL_CLASS;

	/**
	 * The feature id for the '<em><b>Primitif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__PRIMITIF = CT_TYPE_REFERENCE__PRIMITIF;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__QUALIFIED_NAME = CT_TYPE_REFERENCE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE = CT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Array Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE_FEATURE_COUNT = CT_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl <em>Ct Executable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtExecutableReference()
	 * @generated
	 */
	int CT_EXECUTABLE_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__ACTUAL_TYPE_ARGUMENTS = CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__SIMPLE_NAME = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__ANNOTATIONS = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__DECLARATION = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__TYPE = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__DECLARING_TYPE = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__STATIC = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Actual Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ct Executable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE_FEATURE_COUNT = CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtReferenceImpl <em>Ct Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtReference()
	 * @generated
	 */
	int CT_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_REFERENCE__SIMPLE_NAME = FacadePackage.CT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_REFERENCE__ANNOTATIONS = FacadePackage.CT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_REFERENCE__DECLARATION = FacadePackage.CT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_REFERENCE_FEATURE_COUNT = FacadePackage.CT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtVariableReferenceImpl <em>Ct Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtVariableReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtVariableReference()
	 * @generated
	 */
	int CT_VARIABLE_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_REFERENCE__SIMPLE_NAME = CT_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_REFERENCE__ANNOTATIONS = CT_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_REFERENCE__DECLARATION = CT_REFERENCE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_REFERENCE__TYPE = CT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_REFERENCE_FEATURE_COUNT = CT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl <em>Ct Field Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtFieldReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtFieldReference()
	 * @generated
	 */
	int CT_FIELD_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__SIMPLE_NAME = CT_VARIABLE_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__ANNOTATIONS = CT_VARIABLE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__DECLARATION = CT_VARIABLE_REFERENCE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__TYPE = CT_VARIABLE_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__DECLARING_TYPE = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__FINAL = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__STATIC = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__ACTUAL_FIELD = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE__QUALIFIED_NAME = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ct Field Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE_FEATURE_COUNT = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtLocalVariableReferenceImpl <em>Ct Local Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtLocalVariableReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtLocalVariableReference()
	 * @generated
	 */
	int CT_LOCAL_VARIABLE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_REFERENCE__SIMPLE_NAME = CT_VARIABLE_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_REFERENCE__ANNOTATIONS = CT_VARIABLE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_REFERENCE__DECLARATION = CT_VARIABLE_REFERENCE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_REFERENCE__TYPE = CT_VARIABLE_REFERENCE__TYPE;

	/**
	 * The number of structural features of the '<em>Ct Local Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_REFERENCE_FEATURE_COUNT = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtPackageReferenceImpl <em>Ct Package Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtPackageReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtPackageReference()
	 * @generated
	 */
	int CT_PACKAGE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_REFERENCE__SIMPLE_NAME = CT_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_REFERENCE__ANNOTATIONS = CT_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_REFERENCE__DECLARATION = CT_REFERENCE__DECLARATION;

	/**
	 * The number of structural features of the '<em>Ct Package Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_REFERENCE_FEATURE_COUNT = CT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtParameterReferenceImpl <em>Ct Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtParameterReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtParameterReference()
	 * @generated
	 */
	int CT_PARAMETER_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE__SIMPLE_NAME = CT_VARIABLE_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE__ANNOTATIONS = CT_VARIABLE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE__DECLARATION = CT_VARIABLE_REFERENCE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE__TYPE = CT_VARIABLE_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Declaring Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE_FEATURE_COUNT = CT_VARIABLE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl <em>Ct Type Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl
	 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtTypeParameterReference()
	 * @generated
	 */
	int CT_TYPE_PARAMETER_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__ACTUAL_TYPE_ARGUMENTS = CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__SIMPLE_NAME = CT_TYPE_REFERENCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__ANNOTATIONS = CT_TYPE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__DECLARATION = CT_TYPE_REFERENCE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__DECLARING_TYPE = CT_TYPE_REFERENCE__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__PACKAGE = CT_TYPE_REFERENCE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__ACTUAL_CLASS = CT_TYPE_REFERENCE__ACTUAL_CLASS;

	/**
	 * The feature id for the '<em><b>Primitif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__PRIMITIF = CT_TYPE_REFERENCE__PRIMITIF;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__QUALIFIED_NAME = CT_TYPE_REFERENCE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__UPPER = CT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE__BOUNDS = CT_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Type Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE_FEATURE_COUNT = CT_TYPE_REFERENCE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtArrayTypeReference <em>Ct Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Array Type Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtArrayTypeReference
	 * @generated
	 */
	EClass getCtArrayTypeReference();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtArrayTypeReference#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see emf.spoon.reflect.reference.CtArrayTypeReference#getComponentType()
	 * @see #getCtArrayTypeReference()
	 * @generated
	 */
	EReference getCtArrayTypeReference_ComponentType();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtExecutableReference <em>Ct Executable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Executable Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference
	 * @generated
	 */
	EClass getCtExecutableReference();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtExecutableReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference#getType()
	 * @see #getCtExecutableReference()
	 * @generated
	 */
	EReference getCtExecutableReference_Type();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtExecutableReference#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Type</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference#getDeclaringType()
	 * @see #getCtExecutableReference()
	 * @generated
	 */
	EReference getCtExecutableReference_DeclaringType();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.reference.CtExecutableReference#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Types</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference#getParameterTypes()
	 * @see #getCtExecutableReference()
	 * @generated
	 */
	EReference getCtExecutableReference_ParameterTypes();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtExecutableReference#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference#getStatic()
	 * @see #getCtExecutableReference()
	 * @generated
	 */
	EAttribute getCtExecutableReference_Static();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtExecutableReference#getActualConstructor <em>Actual Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Constructor</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference#getActualConstructor()
	 * @see #getCtExecutableReference()
	 * @generated
	 */
	EAttribute getCtExecutableReference_ActualConstructor();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtExecutableReference#getActualMethod <em>Actual Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Method</em>'.
	 * @see emf.spoon.reflect.reference.CtExecutableReference#getActualMethod()
	 * @see #getCtExecutableReference()
	 * @generated
	 */
	EAttribute getCtExecutableReference_ActualMethod();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtFieldReference <em>Ct Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Field Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtFieldReference
	 * @generated
	 */
	EClass getCtFieldReference();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtFieldReference#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Type</em>'.
	 * @see emf.spoon.reflect.reference.CtFieldReference#getDeclaringType()
	 * @see #getCtFieldReference()
	 * @generated
	 */
	EReference getCtFieldReference_DeclaringType();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtFieldReference#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see emf.spoon.reflect.reference.CtFieldReference#getFinal()
	 * @see #getCtFieldReference()
	 * @generated
	 */
	EAttribute getCtFieldReference_Final();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtFieldReference#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see emf.spoon.reflect.reference.CtFieldReference#getStatic()
	 * @see #getCtFieldReference()
	 * @generated
	 */
	EAttribute getCtFieldReference_Static();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtFieldReference#getActualField <em>Actual Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Field</em>'.
	 * @see emf.spoon.reflect.reference.CtFieldReference#getActualField()
	 * @see #getCtFieldReference()
	 * @generated
	 */
	EAttribute getCtFieldReference_ActualField();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtFieldReference#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see emf.spoon.reflect.reference.CtFieldReference#getQualifiedName()
	 * @see #getCtFieldReference()
	 * @generated
	 */
	EAttribute getCtFieldReference_QualifiedName();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtGenericElementReference <em>Ct Generic Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Generic Element Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtGenericElementReference
	 * @generated
	 */
	EClass getCtGenericElementReference();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.reference.CtGenericElementReference#getActualTypeArguments <em>Actual Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Type Arguments</em>'.
	 * @see emf.spoon.reflect.reference.CtGenericElementReference#getActualTypeArguments()
	 * @see #getCtGenericElementReference()
	 * @generated
	 */
	EReference getCtGenericElementReference_ActualTypeArguments();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtLocalVariableReference <em>Ct Local Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Local Variable Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtLocalVariableReference
	 * @generated
	 */
	EClass getCtLocalVariableReference();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtPackageReference <em>Ct Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Package Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtPackageReference
	 * @generated
	 */
	EClass getCtPackageReference();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtParameterReference <em>Ct Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Parameter Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtParameterReference
	 * @generated
	 */
	EClass getCtParameterReference();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtParameterReference#getDeclaringExecutable <em>Declaring Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Executable</em>'.
	 * @see emf.spoon.reflect.reference.CtParameterReference#getDeclaringExecutable()
	 * @see #getCtParameterReference()
	 * @generated
	 */
	EReference getCtParameterReference_DeclaringExecutable();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtReference <em>Ct Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtReference
	 * @generated
	 */
	EClass getCtReference();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtReference#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see emf.spoon.reflect.reference.CtReference#getSimpleName()
	 * @see #getCtReference()
	 * @generated
	 */
	EAttribute getCtReference_SimpleName();

	/**
	 * Returns the meta object for the attribute list '{@link emf.spoon.reflect.reference.CtReference#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see emf.spoon.reflect.reference.CtReference#getAnnotations()
	 * @see #getCtReference()
	 * @generated
	 */
	EAttribute getCtReference_Annotations();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtReference#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see emf.spoon.reflect.reference.CtReference#getDeclaration()
	 * @see #getCtReference()
	 * @generated
	 */
	EReference getCtReference_Declaration();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtTypeParameterReference <em>Ct Type Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type Parameter Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeParameterReference
	 * @generated
	 */
	EClass getCtTypeParameterReference();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtTypeParameterReference#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeParameterReference#getUpper()
	 * @see #getCtTypeParameterReference()
	 * @generated
	 */
	EAttribute getCtTypeParameterReference_Upper();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.reference.CtTypeParameterReference#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounds</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeParameterReference#getBounds()
	 * @see #getCtTypeParameterReference()
	 * @generated
	 */
	EReference getCtTypeParameterReference_Bounds();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtTypeReference <em>Ct Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeReference
	 * @generated
	 */
	EClass getCtTypeReference();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtTypeReference#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Type</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeReference#getDeclaringType()
	 * @see #getCtTypeReference()
	 * @generated
	 */
	EReference getCtTypeReference_DeclaringType();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtTypeReference#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeReference#getPackage()
	 * @see #getCtTypeReference()
	 * @generated
	 */
	EReference getCtTypeReference_Package();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtTypeReference#getActualClass <em>Actual Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Class</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeReference#getActualClass()
	 * @see #getCtTypeReference()
	 * @generated
	 */
	EAttribute getCtTypeReference_ActualClass();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtTypeReference#getPrimitif <em>Primitif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitif</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeReference#getPrimitif()
	 * @see #getCtTypeReference()
	 * @generated
	 */
	EAttribute getCtTypeReference_Primitif();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.reference.CtTypeReference#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see emf.spoon.reflect.reference.CtTypeReference#getQualifiedName()
	 * @see #getCtTypeReference()
	 * @generated
	 */
	EAttribute getCtTypeReference_QualifiedName();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.reference.CtVariableReference <em>Ct Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Variable Reference</em>'.
	 * @see emf.spoon.reflect.reference.CtVariableReference
	 * @generated
	 */
	EClass getCtVariableReference();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.reference.CtVariableReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see emf.spoon.reflect.reference.CtVariableReference#getType()
	 * @see #getCtVariableReference()
	 * @generated
	 */
	EReference getCtVariableReference_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferenceFactory getReferenceFactory();

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
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtArrayTypeReferenceImpl <em>Ct Array Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtArrayTypeReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtArrayTypeReference()
		 * @generated
		 */
		EClass CT_ARRAY_TYPE_REFERENCE = eINSTANCE.getCtArrayTypeReference();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE = eINSTANCE.getCtArrayTypeReference_ComponentType();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl <em>Ct Executable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtExecutableReference()
		 * @generated
		 */
		EClass CT_EXECUTABLE_REFERENCE = eINSTANCE.getCtExecutableReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE_REFERENCE__TYPE = eINSTANCE.getCtExecutableReference_Type();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE_REFERENCE__DECLARING_TYPE = eINSTANCE.getCtExecutableReference_DeclaringType();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES = eINSTANCE.getCtExecutableReference_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_EXECUTABLE_REFERENCE__STATIC = eINSTANCE.getCtExecutableReference_Static();

		/**
		 * The meta object literal for the '<em><b>Actual Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR = eINSTANCE.getCtExecutableReference_ActualConstructor();

		/**
		 * The meta object literal for the '<em><b>Actual Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD = eINSTANCE.getCtExecutableReference_ActualMethod();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl <em>Ct Field Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtFieldReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtFieldReference()
		 * @generated
		 */
		EClass CT_FIELD_REFERENCE = eINSTANCE.getCtFieldReference();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FIELD_REFERENCE__DECLARING_TYPE = eINSTANCE.getCtFieldReference_DeclaringType();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_FIELD_REFERENCE__FINAL = eINSTANCE.getCtFieldReference_Final();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_FIELD_REFERENCE__STATIC = eINSTANCE.getCtFieldReference_Static();

		/**
		 * The meta object literal for the '<em><b>Actual Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_FIELD_REFERENCE__ACTUAL_FIELD = eINSTANCE.getCtFieldReference_ActualField();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_FIELD_REFERENCE__QUALIFIED_NAME = eINSTANCE.getCtFieldReference_QualifiedName();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtGenericElementReferenceImpl <em>Ct Generic Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtGenericElementReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtGenericElementReference()
		 * @generated
		 */
		EClass CT_GENERIC_ELEMENT_REFERENCE = eINSTANCE.getCtGenericElementReference();

		/**
		 * The meta object literal for the '<em><b>Actual Type Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS = eINSTANCE.getCtGenericElementReference_ActualTypeArguments();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtLocalVariableReferenceImpl <em>Ct Local Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtLocalVariableReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtLocalVariableReference()
		 * @generated
		 */
		EClass CT_LOCAL_VARIABLE_REFERENCE = eINSTANCE.getCtLocalVariableReference();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtPackageReferenceImpl <em>Ct Package Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtPackageReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtPackageReference()
		 * @generated
		 */
		EClass CT_PACKAGE_REFERENCE = eINSTANCE.getCtPackageReference();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtParameterReferenceImpl <em>Ct Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtParameterReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtParameterReference()
		 * @generated
		 */
		EClass CT_PARAMETER_REFERENCE = eINSTANCE.getCtParameterReference();

		/**
		 * The meta object literal for the '<em><b>Declaring Executable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE = eINSTANCE.getCtParameterReference_DeclaringExecutable();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtReferenceImpl <em>Ct Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtReference()
		 * @generated
		 */
		EClass CT_REFERENCE = eINSTANCE.getCtReference();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_REFERENCE__SIMPLE_NAME = eINSTANCE.getCtReference_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_REFERENCE__ANNOTATIONS = eINSTANCE.getCtReference_Annotations();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_REFERENCE__DECLARATION = eINSTANCE.getCtReference_Declaration();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl <em>Ct Type Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtTypeParameterReference()
		 * @generated
		 */
		EClass CT_TYPE_PARAMETER_REFERENCE = eINSTANCE.getCtTypeParameterReference();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_TYPE_PARAMETER_REFERENCE__UPPER = eINSTANCE.getCtTypeParameterReference_Upper();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE_PARAMETER_REFERENCE__BOUNDS = eINSTANCE.getCtTypeParameterReference_Bounds();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl <em>Ct Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtTypeReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtTypeReference()
		 * @generated
		 */
		EClass CT_TYPE_REFERENCE = eINSTANCE.getCtTypeReference();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE_REFERENCE__DECLARING_TYPE = eINSTANCE.getCtTypeReference_DeclaringType();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TYPE_REFERENCE__PACKAGE = eINSTANCE.getCtTypeReference_Package();

		/**
		 * The meta object literal for the '<em><b>Actual Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_TYPE_REFERENCE__ACTUAL_CLASS = eINSTANCE.getCtTypeReference_ActualClass();

		/**
		 * The meta object literal for the '<em><b>Primitif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_TYPE_REFERENCE__PRIMITIF = eINSTANCE.getCtTypeReference_Primitif();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_TYPE_REFERENCE__QUALIFIED_NAME = eINSTANCE.getCtTypeReference_QualifiedName();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.reference.impl.CtVariableReferenceImpl <em>Ct Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.reference.impl.CtVariableReferenceImpl
		 * @see emf.spoon.reflect.reference.impl.ReferencePackageImpl#getCtVariableReference()
		 * @generated
		 */
		EClass CT_VARIABLE_REFERENCE = eINSTANCE.getCtVariableReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_VARIABLE_REFERENCE__TYPE = eINSTANCE.getCtVariableReference_Type();

	}

} //ReferencePackage
