/**
 * $Id: SimkPackage.java,v 1.6 2008-08-18 09:20:20 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SimkPackage.java,v 1.6 2008-08-18 09:20:20 cfaucher Exp $
 */
package org.kermeta.simk;

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
 * @see org.kermeta.simk.SimkFactory
 * @model kind="package"
 * @generated
 */
public interface SimkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/simk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimkPackage eINSTANCE = org.kermeta.simk.impl.SimkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMNamedElementImpl <em>SM Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMNamedElementImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMNamedElement()
	 * @generated
	 */
	int SM_NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>SM Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SIMKModelImpl <em>SIMK Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SIMKModelImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSIMKModel()
	 * @generated
	 */
	int SIMK_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SM Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__SM_CONTEXTS = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL__STATIC_METHODS = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SIMK Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMK_MODEL_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.StaticMethodImpl <em>Static Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.StaticMethodImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getStaticMethod()
	 * @generated
	 */
	int STATIC_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SM Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__SM_PARAMETERS = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SM Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__SM_RETURN = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SM Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__SM_CONTEXT = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__ID = SM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__BODY = SM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__USAGES = SM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__PARENT_METHOD = SM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__PARENT_REFERENCE = SM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD__PARENT_ATTRIBUTE = SM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Static Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METHOD_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMContextImpl <em>SM Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMContextImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMContext()
	 * @generated
	 */
	int SM_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>SM Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__SM_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Static Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__STATIC_METHODS = 1;

	/**
	 * The feature id for the '<em><b>SM Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT__SM_CLASS = 2;

	/**
	 * The number of structural features of the '<em>SM Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMPackageImpl <em>SM Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMPackageImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMPackage()
	 * @generated
	 */
	int SM_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PACKAGE__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SM Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PACKAGE__SM_CLASS = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub SM Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PACKAGE__SUB_SM_PACKAGE = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent SM Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PACKAGE__PARENT_SM_PACKAGE = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SM Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PACKAGE_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMClassImpl <em>SM Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMClassImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMClass()
	 * @generated
	 */
	int SM_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SM Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__SM_PACKAGE = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS__USAGES = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SM Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CLASS_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMParameterImpl <em>SM Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMParameterImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMParameter()
	 * @generated
	 */
	int SM_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__NAME = SM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER__TYPE = SM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SM Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_PARAMETER_FEATURE_COUNT = SM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMTypedElementImpl <em>SM Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMTypedElementImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMTypedElement()
	 * @generated
	 */
	int SM_TYPED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>SM Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.impl.SMReturnImpl <em>SM Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.impl.SMReturnImpl
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMReturn()
	 * @generated
	 */
	int SM_RETURN = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN__TYPE = SM_TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>SM Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_RETURN_FEATURE_COUNT = SM_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.simk.SMUsage <em>SM Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.simk.SMUsage
	 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMUsage()
	 * @generated
	 */
	int SM_USAGE = 9;


	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SIMKModel <em>SIMK Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIMK Model</em>'.
	 * @see org.kermeta.simk.SIMKModel
	 * @generated
	 */
	EClass getSIMKModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.simk.SIMKModel#getSMContexts <em>SM Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SM Contexts</em>'.
	 * @see org.kermeta.simk.SIMKModel#getSMContexts()
	 * @see #getSIMKModel()
	 * @generated
	 */
	EReference getSIMKModel_SMContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.simk.SIMKModel#getStaticMethods <em>Static Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Methods</em>'.
	 * @see org.kermeta.simk.SIMKModel#getStaticMethods()
	 * @see #getSIMKModel()
	 * @generated
	 */
	EReference getSIMKModel_StaticMethods();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.StaticMethod <em>Static Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Method</em>'.
	 * @see org.kermeta.simk.StaticMethod
	 * @generated
	 */
	EClass getStaticMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.simk.StaticMethod#getSMParameters <em>SM Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SM Parameters</em>'.
	 * @see org.kermeta.simk.StaticMethod#getSMParameters()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_SMParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.simk.StaticMethod#getSMReturn <em>SM Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SM Return</em>'.
	 * @see org.kermeta.simk.StaticMethod#getSMReturn()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_SMReturn();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.simk.StaticMethod#getSMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SM Context</em>'.
	 * @see org.kermeta.simk.StaticMethod#getSMContext()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_SMContext();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.simk.StaticMethod#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.simk.StaticMethod#getId()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EAttribute getStaticMethod_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.simk.StaticMethod#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.kermeta.simk.StaticMethod#getBody()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EAttribute getStaticMethod_Body();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.simk.StaticMethod#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usages</em>'.
	 * @see org.kermeta.simk.StaticMethod#getUsages()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EAttribute getStaticMethod_Usages();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.simk.StaticMethod#getParentMethod <em>Parent Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Method</em>'.
	 * @see org.kermeta.simk.StaticMethod#getParentMethod()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_ParentMethod();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.simk.StaticMethod#getParentReference <em>Parent Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Reference</em>'.
	 * @see org.kermeta.simk.StaticMethod#getParentReference()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_ParentReference();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.simk.StaticMethod#getParentAttribute <em>Parent Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Attribute</em>'.
	 * @see org.kermeta.simk.StaticMethod#getParentAttribute()
	 * @see #getStaticMethod()
	 * @generated
	 */
	EReference getStaticMethod_ParentAttribute();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Context</em>'.
	 * @see org.kermeta.simk.SMContext
	 * @generated
	 */
	EClass getSMContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.simk.SMContext#getSMPackage <em>SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SM Package</em>'.
	 * @see org.kermeta.simk.SMContext#getSMPackage()
	 * @see #getSMContext()
	 * @generated
	 */
	EReference getSMContext_SMPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.simk.SMContext#getStaticMethods <em>Static Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Static Methods</em>'.
	 * @see org.kermeta.simk.SMContext#getStaticMethods()
	 * @see #getSMContext()
	 * @generated
	 */
	EReference getSMContext_StaticMethods();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.simk.SMContext#getSMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SM Class</em>'.
	 * @see org.kermeta.simk.SMContext#getSMClass()
	 * @see #getSMContext()
	 * @generated
	 */
	EReference getSMContext_SMClass();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMPackage <em>SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Package</em>'.
	 * @see org.kermeta.simk.SMPackage
	 * @generated
	 */
	EClass getSMPackage();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.simk.SMPackage#getSMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SM Class</em>'.
	 * @see org.kermeta.simk.SMPackage#getSMClass()
	 * @see #getSMPackage()
	 * @generated
	 */
	EReference getSMPackage_SMClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.simk.SMPackage#getSubSMPackage <em>Sub SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub SM Package</em>'.
	 * @see org.kermeta.simk.SMPackage#getSubSMPackage()
	 * @see #getSMPackage()
	 * @generated
	 */
	EReference getSMPackage_SubSMPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.simk.SMPackage#getParentSMPackage <em>Parent SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent SM Package</em>'.
	 * @see org.kermeta.simk.SMPackage#getParentSMPackage()
	 * @see #getSMPackage()
	 * @generated
	 */
	EReference getSMPackage_ParentSMPackage();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Class</em>'.
	 * @see org.kermeta.simk.SMClass
	 * @generated
	 */
	EClass getSMClass();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.simk.SMClass#getSMPackage <em>SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SM Package</em>'.
	 * @see org.kermeta.simk.SMClass#getSMPackage()
	 * @see #getSMClass()
	 * @generated
	 */
	EReference getSMClass_SMPackage();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.simk.SMClass#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usages</em>'.
	 * @see org.kermeta.simk.SMClass#getUsages()
	 * @see #getSMClass()
	 * @generated
	 */
	EAttribute getSMClass_Usages();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMNamedElement <em>SM Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Named Element</em>'.
	 * @see org.kermeta.simk.SMNamedElement
	 * @generated
	 */
	EClass getSMNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.simk.SMNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.simk.SMNamedElement#getName()
	 * @see #getSMNamedElement()
	 * @generated
	 */
	EAttribute getSMNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMParameter <em>SM Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Parameter</em>'.
	 * @see org.kermeta.simk.SMParameter
	 * @generated
	 */
	EClass getSMParameter();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMTypedElement <em>SM Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Typed Element</em>'.
	 * @see org.kermeta.simk.SMTypedElement
	 * @generated
	 */
	EClass getSMTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.simk.SMTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.kermeta.simk.SMTypedElement#getType()
	 * @see #getSMTypedElement()
	 * @generated
	 */
	EAttribute getSMTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.kermeta.simk.SMReturn <em>SM Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Return</em>'.
	 * @see org.kermeta.simk.SMReturn
	 * @generated
	 */
	EClass getSMReturn();

	/**
	 * Returns the meta object for enum '{@link org.kermeta.simk.SMUsage <em>SM Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SM Usage</em>'.
	 * @see org.kermeta.simk.SMUsage
	 * @generated
	 */
	EEnum getSMUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimkFactory getSimkFactory();

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
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SIMKModelImpl <em>SIMK Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SIMKModelImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSIMKModel()
		 * @generated
		 */
		EClass SIMK_MODEL = eINSTANCE.getSIMKModel();

		/**
		 * The meta object literal for the '<em><b>SM Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMK_MODEL__SM_CONTEXTS = eINSTANCE.getSIMKModel_SMContexts();

		/**
		 * The meta object literal for the '<em><b>Static Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMK_MODEL__STATIC_METHODS = eINSTANCE.getSIMKModel_StaticMethods();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.StaticMethodImpl <em>Static Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.StaticMethodImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getStaticMethod()
		 * @generated
		 */
		EClass STATIC_METHOD = eINSTANCE.getStaticMethod();

		/**
		 * The meta object literal for the '<em><b>SM Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__SM_PARAMETERS = eINSTANCE.getStaticMethod_SMParameters();

		/**
		 * The meta object literal for the '<em><b>SM Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__SM_RETURN = eINSTANCE.getStaticMethod_SMReturn();

		/**
		 * The meta object literal for the '<em><b>SM Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__SM_CONTEXT = eINSTANCE.getStaticMethod_SMContext();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METHOD__ID = eINSTANCE.getStaticMethod_Id();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METHOD__BODY = eINSTANCE.getStaticMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METHOD__USAGES = eINSTANCE.getStaticMethod_Usages();

		/**
		 * The meta object literal for the '<em><b>Parent Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__PARENT_METHOD = eINSTANCE.getStaticMethod_ParentMethod();

		/**
		 * The meta object literal for the '<em><b>Parent Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__PARENT_REFERENCE = eINSTANCE.getStaticMethod_ParentReference();

		/**
		 * The meta object literal for the '<em><b>Parent Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_METHOD__PARENT_ATTRIBUTE = eINSTANCE.getStaticMethod_ParentAttribute();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMContextImpl <em>SM Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMContextImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMContext()
		 * @generated
		 */
		EClass SM_CONTEXT = eINSTANCE.getSMContext();

		/**
		 * The meta object literal for the '<em><b>SM Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__SM_PACKAGE = eINSTANCE.getSMContext_SMPackage();

		/**
		 * The meta object literal for the '<em><b>Static Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__STATIC_METHODS = eINSTANCE.getSMContext_StaticMethods();

		/**
		 * The meta object literal for the '<em><b>SM Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CONTEXT__SM_CLASS = eINSTANCE.getSMContext_SMClass();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMPackageImpl <em>SM Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMPackageImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMPackage()
		 * @generated
		 */
		EClass SM_PACKAGE = eINSTANCE.getSMPackage();

		/**
		 * The meta object literal for the '<em><b>SM Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_PACKAGE__SM_CLASS = eINSTANCE.getSMPackage_SMClass();

		/**
		 * The meta object literal for the '<em><b>Sub SM Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_PACKAGE__SUB_SM_PACKAGE = eINSTANCE.getSMPackage_SubSMPackage();

		/**
		 * The meta object literal for the '<em><b>Parent SM Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_PACKAGE__PARENT_SM_PACKAGE = eINSTANCE.getSMPackage_ParentSMPackage();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMClassImpl <em>SM Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMClassImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMClass()
		 * @generated
		 */
		EClass SM_CLASS = eINSTANCE.getSMClass();

		/**
		 * The meta object literal for the '<em><b>SM Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CLASS__SM_PACKAGE = eINSTANCE.getSMClass_SMPackage();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_CLASS__USAGES = eINSTANCE.getSMClass_Usages();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMNamedElementImpl <em>SM Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMNamedElementImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMNamedElement()
		 * @generated
		 */
		EClass SM_NAMED_ELEMENT = eINSTANCE.getSMNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_NAMED_ELEMENT__NAME = eINSTANCE.getSMNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMParameterImpl <em>SM Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMParameterImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMParameter()
		 * @generated
		 */
		EClass SM_PARAMETER = eINSTANCE.getSMParameter();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMTypedElementImpl <em>SM Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMTypedElementImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMTypedElement()
		 * @generated
		 */
		EClass SM_TYPED_ELEMENT = eINSTANCE.getSMTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SM_TYPED_ELEMENT__TYPE = eINSTANCE.getSMTypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.impl.SMReturnImpl <em>SM Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.impl.SMReturnImpl
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMReturn()
		 * @generated
		 */
		EClass SM_RETURN = eINSTANCE.getSMReturn();

		/**
		 * The meta object literal for the '{@link org.kermeta.simk.SMUsage <em>SM Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.simk.SMUsage
		 * @see org.kermeta.simk.impl.SimkPackageImpl#getSMUsage()
		 * @generated
		 */
		EEnum SM_USAGE = eINSTANCE.getSMUsage();

	}

} //SimkPackage
