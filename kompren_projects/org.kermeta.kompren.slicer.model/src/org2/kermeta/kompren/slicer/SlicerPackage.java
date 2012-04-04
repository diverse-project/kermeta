/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer;

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
 * @see org2.kermeta.kompren.slicer.SlicerFactory
 * @model kind="package"
 * @generated
 */
public interface SlicerPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slicer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org.kermeta.kompren/org/kermeta/kompren/slicer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.kermeta.kompren.slicer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlicerPackage eINSTANCE = org2.kermeta.kompren.slicer.impl.SlicerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.SlicerImpl <em>Slicer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.SlicerImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicer()
	 * @generated
	 */
	int SLICER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__URI_METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__STRICT = 3;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__HELPER = 4;

	/**
	 * The feature id for the '<em><b>On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__ON_START = 5;

	/**
	 * The feature id for the '<em><b>On End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__ON_END = 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__RADIUS = 8;

	/**
	 * The feature id for the '<em><b>Sliced Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__SLICED_ELEMENTS = 9;

	/**
	 * The feature id for the '<em><b>Input Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__INPUT_CLASSES = 10;

	/**
	 * The number of structural features of the '<em>Slicer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.ConstraintImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.RadiusImpl <em>Radius</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.RadiusImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getRadius()
	 * @generated
	 */
	int RADIUS = 2;

	/**
	 * The feature id for the '<em><b>Focused Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS__FOCUSED_CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.SlicedElementImpl <em>Sliced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.SlicedElementImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicedElement()
	 * @generated
	 */
	int SLICED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT__IS_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Sliced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.SlicedClassImpl <em>Sliced Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.SlicedClassImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicedClass()
	 * @generated
	 */
	int SLICED_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__IS_OPTION = SLICED_ELEMENT__IS_OPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__EXPRESSION = SLICED_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__CTX = SLICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__DOMAIN = SLICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sliced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS_FEATURE_COUNT = SLICED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.SlicedPropertyImpl <em>Sliced Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.SlicedPropertyImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicedProperty()
	 * @generated
	 */
	int SLICED_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__IS_OPTION = SLICED_ELEMENT__IS_OPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__EXPRESSION = SLICED_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__OPPOSITE = SLICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__SRC = SLICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__TGT = SLICED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__DOMAIN = SLICED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sliced Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY_FEATURE_COUNT = SLICED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.OppositeCreationImpl <em>Opposite Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.OppositeCreationImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getOppositeCreation()
	 * @generated
	 */
	int OPPOSITE_CREATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_CREATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Opposite Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_CREATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org2.kermeta.kompren.slicer.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org2.kermeta.kompren.slicer.impl.VarDeclImpl
	 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__VAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.Slicer <em>Slicer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slicer</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer
	 * @generated
	 */
	EClass getSlicer();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getName()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#getUriMetamodel <em>Uri Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Metamodel</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getUriMetamodel()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_UriMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#isActive()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Active();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#isStrict()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Strict();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#getHelper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getHelper()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Helper();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#getOnStart <em>On Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Start</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getOnStart()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_OnStart();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Slicer#getOnEnd <em>On End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On End</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getOnEnd()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_OnEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link org2.kermeta.kompren.slicer.Slicer#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getConstraints()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link org2.kermeta.kompren.slicer.Slicer#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Radius</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getRadius()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_Radius();

	/**
	 * Returns the meta object for the containment reference list '{@link org2.kermeta.kompren.slicer.Slicer#getSlicedElements <em>Sliced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sliced Elements</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getSlicedElements()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_SlicedElements();

	/**
	 * Returns the meta object for the reference list '{@link org2.kermeta.kompren.slicer.Slicer#getInputClasses <em>Input Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Classes</em>'.
	 * @see org2.kermeta.kompren.slicer.Slicer#getInputClasses()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_InputClasses();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org2.kermeta.kompren.slicer.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org2.kermeta.kompren.slicer.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org2.kermeta.kompren.slicer.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.Radius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radius</em>'.
	 * @see org2.kermeta.kompren.slicer.Radius
	 * @generated
	 */
	EClass getRadius();

	/**
	 * Returns the meta object for the reference list '{@link org2.kermeta.kompren.slicer.Radius#getFocusedClasses <em>Focused Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Focused Classes</em>'.
	 * @see org2.kermeta.kompren.slicer.Radius#getFocusedClasses()
	 * @see #getRadius()
	 * @generated
	 */
	EReference getRadius_FocusedClasses();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.SlicedClass <em>Sliced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliced Class</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedClass
	 * @generated
	 */
	EClass getSlicedClass();

	/**
	 * Returns the meta object for the containment reference '{@link org2.kermeta.kompren.slicer.SlicedClass#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ctx</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedClass#getCtx()
	 * @see #getSlicedClass()
	 * @generated
	 */
	EReference getSlicedClass_Ctx();

	/**
	 * Returns the meta object for the reference '{@link org2.kermeta.kompren.slicer.SlicedClass#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedClass#getDomain()
	 * @see #getSlicedClass()
	 * @generated
	 */
	EReference getSlicedClass_Domain();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.SlicedProperty <em>Sliced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliced Property</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedProperty
	 * @generated
	 */
	EClass getSlicedProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org2.kermeta.kompren.slicer.SlicedProperty#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opposite</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedProperty#getOpposite()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Opposite();

	/**
	 * Returns the meta object for the containment reference '{@link org2.kermeta.kompren.slicer.SlicedProperty#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedProperty#getSrc()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Src();

	/**
	 * Returns the meta object for the containment reference '{@link org2.kermeta.kompren.slicer.SlicedProperty#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tgt</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedProperty#getTgt()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org2.kermeta.kompren.slicer.SlicedProperty#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedProperty#getDomain()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Domain();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.OppositeCreation <em>Opposite Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposite Creation</em>'.
	 * @see org2.kermeta.kompren.slicer.OppositeCreation
	 * @generated
	 */
	EClass getOppositeCreation();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.OppositeCreation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org2.kermeta.kompren.slicer.OppositeCreation#getName()
	 * @see #getOppositeCreation()
	 * @generated
	 */
	EAttribute getOppositeCreation_Name();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.SlicedElement <em>Sliced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliced Element</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedElement
	 * @generated
	 */
	EClass getSlicedElement();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.SlicedElement#isIsOption <em>Is Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedElement#isIsOption()
	 * @see #getSlicedElement()
	 * @generated
	 */
	EAttribute getSlicedElement_IsOption();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.SlicedElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org2.kermeta.kompren.slicer.SlicedElement#getExpression()
	 * @see #getSlicedElement()
	 * @generated
	 */
	EAttribute getSlicedElement_Expression();

	/**
	 * Returns the meta object for class '{@link org2.kermeta.kompren.slicer.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see org2.kermeta.kompren.slicer.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the attribute '{@link org2.kermeta.kompren.slicer.VarDecl#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see org2.kermeta.kompren.slicer.VarDecl#getVarName()
	 * @see #getVarDecl()
	 * @generated
	 */
	EAttribute getVarDecl_VarName();

	/**
	 * Returns the meta object for the reference '{@link org2.kermeta.kompren.slicer.VarDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org2.kermeta.kompren.slicer.VarDecl#getType()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlicerFactory getSlicerFactory();

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
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.SlicerImpl <em>Slicer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.SlicerImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicer()
		 * @generated
		 */
		EClass SLICER = eINSTANCE.getSlicer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__NAME = eINSTANCE.getSlicer_Name();

		/**
		 * The meta object literal for the '<em><b>Uri Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__URI_METAMODEL = eINSTANCE.getSlicer_UriMetamodel();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__ACTIVE = eINSTANCE.getSlicer_Active();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__STRICT = eINSTANCE.getSlicer_Strict();

		/**
		 * The meta object literal for the '<em><b>Helper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__HELPER = eINSTANCE.getSlicer_Helper();

		/**
		 * The meta object literal for the '<em><b>On Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__ON_START = eINSTANCE.getSlicer_OnStart();

		/**
		 * The meta object literal for the '<em><b>On End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__ON_END = eINSTANCE.getSlicer_OnEnd();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__CONSTRAINTS = eINSTANCE.getSlicer_Constraints();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__RADIUS = eINSTANCE.getSlicer_Radius();

		/**
		 * The meta object literal for the '<em><b>Sliced Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__SLICED_ELEMENTS = eINSTANCE.getSlicer_SlicedElements();

		/**
		 * The meta object literal for the '<em><b>Input Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__INPUT_CLASSES = eINSTANCE.getSlicer_InputClasses();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.ConstraintImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.RadiusImpl <em>Radius</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.RadiusImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getRadius()
		 * @generated
		 */
		EClass RADIUS = eINSTANCE.getRadius();

		/**
		 * The meta object literal for the '<em><b>Focused Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIUS__FOCUSED_CLASSES = eINSTANCE.getRadius_FocusedClasses();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.SlicedClassImpl <em>Sliced Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.SlicedClassImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicedClass()
		 * @generated
		 */
		EClass SLICED_CLASS = eINSTANCE.getSlicedClass();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_CLASS__CTX = eINSTANCE.getSlicedClass_Ctx();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_CLASS__DOMAIN = eINSTANCE.getSlicedClass_Domain();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.SlicedPropertyImpl <em>Sliced Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.SlicedPropertyImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicedProperty()
		 * @generated
		 */
		EClass SLICED_PROPERTY = eINSTANCE.getSlicedProperty();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__OPPOSITE = eINSTANCE.getSlicedProperty_Opposite();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__SRC = eINSTANCE.getSlicedProperty_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__TGT = eINSTANCE.getSlicedProperty_Tgt();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__DOMAIN = eINSTANCE.getSlicedProperty_Domain();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.OppositeCreationImpl <em>Opposite Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.OppositeCreationImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getOppositeCreation()
		 * @generated
		 */
		EClass OPPOSITE_CREATION = eINSTANCE.getOppositeCreation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPOSITE_CREATION__NAME = eINSTANCE.getOppositeCreation_Name();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.SlicedElementImpl <em>Sliced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.SlicedElementImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getSlicedElement()
		 * @generated
		 */
		EClass SLICED_ELEMENT = eINSTANCE.getSlicedElement();

		/**
		 * The meta object literal for the '<em><b>Is Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICED_ELEMENT__IS_OPTION = eINSTANCE.getSlicedElement_IsOption();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICED_ELEMENT__EXPRESSION = eINSTANCE.getSlicedElement_Expression();

		/**
		 * The meta object literal for the '{@link org2.kermeta.kompren.slicer.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org2.kermeta.kompren.slicer.impl.VarDeclImpl
		 * @see org2.kermeta.kompren.slicer.impl.SlicerPackageImpl#getVarDecl()
		 * @generated
		 */
		EClass VAR_DECL = eINSTANCE.getVarDecl();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECL__VAR_NAME = eINSTANCE.getVarDecl_VarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

	}

} //SlicerPackage
