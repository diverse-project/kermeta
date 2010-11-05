/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART;

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
 * @see smartadapters4ART.Smartadapters4ARTFactory
 * @model kind="package"
 * @generated
 */
public interface Smartadapters4ARTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartadapters4ART";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SmartAdapters4ART";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartadapters4ART";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Smartadapters4ARTPackage eINSTANCE = smartadapters4ART.impl.Smartadapters4ARTPackageImpl.init();

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.AspectImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__POINTCUT = 1;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ADVICE = 2;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__STRATEGIES = 3;

	/**
	 * The feature id for the '<em><b>Adapt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ADAPT = 4;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.AdaptationImpl <em>Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.AdaptationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getAdaptation()
	 * @generated
	 */
	int ADAPTATION = 1;

	/**
	 * The number of structural features of the '<em>Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.CloneAdaptationImpl <em>Clone Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.CloneAdaptationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getCloneAdaptation()
	 * @generated
	 */
	int CLONE_ADAPTATION = 2;

	/**
	 * The number of structural features of the '<em>Clone Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.CreateAdaptationImpl <em>Create Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.CreateAdaptationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getCreateAdaptation()
	 * @generated
	 */
	int CREATE_ADAPTATION = 3;

	/**
	 * The number of structural features of the '<em>Create Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.SetAdaptationImpl <em>Set Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.SetAdaptationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getSetAdaptation()
	 * @generated
	 */
	int SET_ADAPTATION = 4;

	/**
	 * The number of structural features of the '<em>Set Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.UnsetAdaptationImpl <em>Unset Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.UnsetAdaptationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getUnsetAdaptation()
	 * @generated
	 */
	int UNSET_ADAPTATION = 5;

	/**
	 * The number of structural features of the '<em>Unset Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.AdviceModelImpl <em>Advice Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.AdviceModelImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getAdviceModel()
	 * @generated
	 */
	int ADVICE_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_MODEL__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Advice Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.PointcutModelImpl <em>Pointcut Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.PointcutModelImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getPointcutModel()
	 * @generated
	 */
	int POINTCUT_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_MODEL__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Pointcut Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.InstantiationStrategyImpl <em>Instantiation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.InstantiationStrategyImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getInstantiationStrategy()
	 * @generated
	 */
	int INSTANTIATION_STRATEGY = 8;

	/**
	 * The feature id for the '<em><b>Advice Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STRATEGY__ADVICE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Instantiation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_STRATEGY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.GlobalInstantiationImpl <em>Global Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.GlobalInstantiationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getGlobalInstantiation()
	 * @generated
	 */
	int GLOBAL_INSTANTIATION = 9;

	/**
	 * The feature id for the '<em><b>Advice Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INSTANTIATION__ADVICE_ELEMENTS = INSTANTIATION_STRATEGY__ADVICE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Global Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INSTANTIATION_FEATURE_COUNT = INSTANTIATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.ScopedInstantiationImpl <em>Scoped Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.ScopedInstantiationImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getScopedInstantiation()
	 * @generated
	 */
	int SCOPED_INSTANTIATION = 10;

	/**
	 * The feature id for the '<em><b>Advice Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_INSTANTIATION__ADVICE_ELEMENTS = INSTANTIATION_STRATEGY__ADVICE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Pointcut Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_INSTANTIATION__POINTCUT_ELEMENTS = INSTANTIATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scoped Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_INSTANTIATION_FEATURE_COUNT = INSTANTIATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.PerRoleMatchImpl <em>Per Role Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.PerRoleMatchImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getPerRoleMatch()
	 * @generated
	 */
	int PER_ROLE_MATCH = 11;

	/**
	 * The feature id for the '<em><b>Advice Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_ROLE_MATCH__ADVICE_ELEMENTS = SCOPED_INSTANTIATION__ADVICE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Pointcut Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_ROLE_MATCH__POINTCUT_ELEMENTS = SCOPED_INSTANTIATION__POINTCUT_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Per Role Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_ROLE_MATCH_FEATURE_COUNT = SCOPED_INSTANTIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartadapters4ART.impl.PerElementMatchImpl <em>Per Element Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.impl.PerElementMatchImpl
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getPerElementMatch()
	 * @generated
	 */
	int PER_ELEMENT_MATCH = 12;

	/**
	 * The feature id for the '<em><b>Advice Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_ELEMENT_MATCH__ADVICE_ELEMENTS = SCOPED_INSTANTIATION__ADVICE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Pointcut Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_ELEMENT_MATCH__POINTCUT_ELEMENTS = SCOPED_INSTANTIATION__POINTCUT_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Per Element Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_ELEMENT_MATCH_FEATURE_COUNT = SCOPED_INSTANTIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getString()
	 * @generated
	 */
	int STRING = 13;


	/**
	 * Returns the meta object for class '{@link smartadapters4ART.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see smartadapters4ART.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.Aspect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartadapters4ART.Aspect#getName()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Name();

	/**
	 * Returns the meta object for the containment reference '{@link smartadapters4ART.Aspect#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointcut</em>'.
	 * @see smartadapters4ART.Aspect#getPointcut()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Pointcut();

	/**
	 * Returns the meta object for the containment reference '{@link smartadapters4ART.Aspect#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advice</em>'.
	 * @see smartadapters4ART.Aspect#getAdvice()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Advice();

	/**
	 * Returns the meta object for the containment reference list '{@link smartadapters4ART.Aspect#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see smartadapters4ART.Aspect#getStrategies()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link smartadapters4ART.Aspect#getAdapt <em>Adapt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adapt</em>'.
	 * @see smartadapters4ART.Aspect#getAdapt()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Adapt();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.Adaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation</em>'.
	 * @see smartadapters4ART.Adaptation
	 * @generated
	 */
	EClass getAdaptation();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.CloneAdaptation <em>Clone Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone Adaptation</em>'.
	 * @see smartadapters4ART.CloneAdaptation
	 * @generated
	 */
	EClass getCloneAdaptation();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.CreateAdaptation <em>Create Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Adaptation</em>'.
	 * @see smartadapters4ART.CreateAdaptation
	 * @generated
	 */
	EClass getCreateAdaptation();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.SetAdaptation <em>Set Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Adaptation</em>'.
	 * @see smartadapters4ART.SetAdaptation
	 * @generated
	 */
	EClass getSetAdaptation();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.UnsetAdaptation <em>Unset Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Adaptation</em>'.
	 * @see smartadapters4ART.UnsetAdaptation
	 * @generated
	 */
	EClass getUnsetAdaptation();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.AdviceModel <em>Advice Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice Model</em>'.
	 * @see smartadapters4ART.AdviceModel
	 * @generated
	 */
	EClass getAdviceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link smartadapters4ART.AdviceModel#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see smartadapters4ART.AdviceModel#getContent()
	 * @see #getAdviceModel()
	 * @generated
	 */
	EReference getAdviceModel_Content();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.PointcutModel <em>Pointcut Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut Model</em>'.
	 * @see smartadapters4ART.PointcutModel
	 * @generated
	 */
	EClass getPointcutModel();

	/**
	 * Returns the meta object for the containment reference list '{@link smartadapters4ART.PointcutModel#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see smartadapters4ART.PointcutModel#getContent()
	 * @see #getPointcutModel()
	 * @generated
	 */
	EReference getPointcutModel_Content();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.InstantiationStrategy <em>Instantiation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Strategy</em>'.
	 * @see smartadapters4ART.InstantiationStrategy
	 * @generated
	 */
	EClass getInstantiationStrategy();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.InstantiationStrategy#getAdviceElements <em>Advice Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Advice Elements</em>'.
	 * @see smartadapters4ART.InstantiationStrategy#getAdviceElements()
	 * @see #getInstantiationStrategy()
	 * @generated
	 */
	EReference getInstantiationStrategy_AdviceElements();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.GlobalInstantiation <em>Global Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Instantiation</em>'.
	 * @see smartadapters4ART.GlobalInstantiation
	 * @generated
	 */
	EClass getGlobalInstantiation();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.ScopedInstantiation <em>Scoped Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Instantiation</em>'.
	 * @see smartadapters4ART.ScopedInstantiation
	 * @generated
	 */
	EClass getScopedInstantiation();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.ScopedInstantiation#getPointcutElements <em>Pointcut Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointcut Elements</em>'.
	 * @see smartadapters4ART.ScopedInstantiation#getPointcutElements()
	 * @see #getScopedInstantiation()
	 * @generated
	 */
	EReference getScopedInstantiation_PointcutElements();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.PerRoleMatch <em>Per Role Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Role Match</em>'.
	 * @see smartadapters4ART.PerRoleMatch
	 * @generated
	 */
	EClass getPerRoleMatch();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.PerElementMatch <em>Per Element Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Element Match</em>'.
	 * @see smartadapters4ART.PerElementMatch
	 * @generated
	 */
	EClass getPerElementMatch();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Smartadapters4ARTFactory getSmartadapters4ARTFactory();

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
		 * The meta object literal for the '{@link smartadapters4ART.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.AspectImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__NAME = eINSTANCE.getAspect_Name();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__POINTCUT = eINSTANCE.getAspect_Pointcut();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ADVICE = eINSTANCE.getAspect_Advice();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__STRATEGIES = eINSTANCE.getAspect_Strategies();

		/**
		 * The meta object literal for the '<em><b>Adapt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ADAPT = eINSTANCE.getAspect_Adapt();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.AdaptationImpl <em>Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.AdaptationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getAdaptation()
		 * @generated
		 */
		EClass ADAPTATION = eINSTANCE.getAdaptation();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.CloneAdaptationImpl <em>Clone Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.CloneAdaptationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getCloneAdaptation()
		 * @generated
		 */
		EClass CLONE_ADAPTATION = eINSTANCE.getCloneAdaptation();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.CreateAdaptationImpl <em>Create Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.CreateAdaptationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getCreateAdaptation()
		 * @generated
		 */
		EClass CREATE_ADAPTATION = eINSTANCE.getCreateAdaptation();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.SetAdaptationImpl <em>Set Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.SetAdaptationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getSetAdaptation()
		 * @generated
		 */
		EClass SET_ADAPTATION = eINSTANCE.getSetAdaptation();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.UnsetAdaptationImpl <em>Unset Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.UnsetAdaptationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getUnsetAdaptation()
		 * @generated
		 */
		EClass UNSET_ADAPTATION = eINSTANCE.getUnsetAdaptation();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.AdviceModelImpl <em>Advice Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.AdviceModelImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getAdviceModel()
		 * @generated
		 */
		EClass ADVICE_MODEL = eINSTANCE.getAdviceModel();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE_MODEL__CONTENT = eINSTANCE.getAdviceModel_Content();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.PointcutModelImpl <em>Pointcut Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.PointcutModelImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getPointcutModel()
		 * @generated
		 */
		EClass POINTCUT_MODEL = eINSTANCE.getPointcutModel();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT_MODEL__CONTENT = eINSTANCE.getPointcutModel_Content();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.InstantiationStrategyImpl <em>Instantiation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.InstantiationStrategyImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getInstantiationStrategy()
		 * @generated
		 */
		EClass INSTANTIATION_STRATEGY = eINSTANCE.getInstantiationStrategy();

		/**
		 * The meta object literal for the '<em><b>Advice Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_STRATEGY__ADVICE_ELEMENTS = eINSTANCE.getInstantiationStrategy_AdviceElements();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.GlobalInstantiationImpl <em>Global Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.GlobalInstantiationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getGlobalInstantiation()
		 * @generated
		 */
		EClass GLOBAL_INSTANTIATION = eINSTANCE.getGlobalInstantiation();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.ScopedInstantiationImpl <em>Scoped Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.ScopedInstantiationImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getScopedInstantiation()
		 * @generated
		 */
		EClass SCOPED_INSTANTIATION = eINSTANCE.getScopedInstantiation();

		/**
		 * The meta object literal for the '<em><b>Pointcut Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_INSTANTIATION__POINTCUT_ELEMENTS = eINSTANCE.getScopedInstantiation_PointcutElements();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.PerRoleMatchImpl <em>Per Role Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.PerRoleMatchImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getPerRoleMatch()
		 * @generated
		 */
		EClass PER_ROLE_MATCH = eINSTANCE.getPerRoleMatch();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.impl.PerElementMatchImpl <em>Per Element Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.impl.PerElementMatchImpl
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getPerElementMatch()
		 * @generated
		 */
		EClass PER_ELEMENT_MATCH = eINSTANCE.getPerElementMatch();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see smartadapters4ART.impl.Smartadapters4ARTPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //Smartadapters4ARTPackage
