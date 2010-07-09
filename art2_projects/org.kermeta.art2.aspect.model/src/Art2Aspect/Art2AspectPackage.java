/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import art2.Art2Package;
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
 * @see Art2Aspect.Art2AspectFactory
 * @model kind="package"
 * @generated
 */
public interface Art2AspectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Art2Aspect";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ArtAspect/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Art2Aspect";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Art2AspectPackage eINSTANCE = Art2Aspect.impl.Art2AspectPackageImpl.init();

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.AspectRootImpl <em>Aspect Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.AspectRootImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getAspectRoot()
	 * @generated
	 */
	int ASPECT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ROOT__ASPECTS = 0;

	/**
	 * The number of structural features of the '<em>Aspect Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.AspectDefinitionImpl <em>Aspect Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.AspectDefinitionImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getAspectDefinition()
	 * @generated
	 */
	int ASPECT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEFINITION__NAME = Art2Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEFINITION__BINDINGS = Art2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEFINITION__POINTCUT = Art2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEFINITION__ADVICE = Art2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aspect Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEFINITION_FEATURE_COUNT = Art2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.PointcutDefinitionImpl <em>Pointcut Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.PointcutDefinitionImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPointcutDefinition()
	 * @generated
	 */
	int POINTCUT_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Component Type Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS = 0;

	/**
	 * The feature id for the '<em><b>Node Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_DEFINITION__NODE_PATTERNS = 1;

	/**
	 * The feature id for the '<em><b>Port Type Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_DEFINITION__PORT_TYPE_PATTERNS = 2;

	/**
	 * The number of structural features of the '<em>Pointcut Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.BindingPatternImpl <em>Binding Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.BindingPatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getBindingPattern()
	 * @generated
	 */
	int BINDING_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PATTERN__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PATTERN__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Binding Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.ComponentTypePatternImpl <em>Component Type Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.ComponentTypePatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getComponentTypePattern()
	 * @generated
	 */
	int COMPONENT_TYPE_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Required Port Type Ref Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS = 0;

	/**
	 * The feature id for the '<em><b>Provided Port Type Ref Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_PATTERN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Component Type Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.NodePatternImpl <em>Node Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.NodePatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getNodePattern()
	 * @generated
	 */
	int NODE_PATTERN = 5;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.PortPatternImpl <em>Port Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.PortPatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPortPattern()
	 * @generated
	 */
	int PORT_PATTERN = 6;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.ComponentPatternImpl <em>Component Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.ComponentPatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getComponentPattern()
	 * @generated
	 */
	int COMPONENT_PATTERN = 7;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.PortTypePatternImpl <em>Port Type Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.PortTypePatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPortTypePattern()
	 * @generated
	 */
	int PORT_TYPE_PATTERN = 8;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.PortTypeRefPatternImpl <em>Port Type Ref Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.PortTypeRefPatternImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPortTypeRefPattern()
	 * @generated
	 */
	int PORT_TYPE_REF_PATTERN = 9;

	/**
	 * The meta object id for the '{@link Art2Aspect.impl.PatternNamedElementImpl <em>Pattern Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Art2Aspect.impl.PatternNamedElementImpl
	 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPatternNamedElement()
	 * @generated
	 */
	int PATTERN_NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__NAME_PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN__NAME_PATTERN = PATTERN_NAMED_ELEMENT__NAME_PATTERN;

	/**
	 * The feature id for the '<em><b>Component Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN__COMPONENT_PATTERNS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PATTERN_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PATTERN__REF = 0;

	/**
	 * The number of structural features of the '<em>Port Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PATTERN__NAME_PATTERN = PATTERN_NAMED_ELEMENT__NAME_PATTERN;

	/**
	 * The feature id for the '<em><b>Provided Port Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Port Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PATTERN_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_PATTERN__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Port Type Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF_PATTERN__NAME_PATTERN = PATTERN_NAMED_ELEMENT__NAME_PATTERN;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF_PATTERN__REF = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Type Ref Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF_PATTERN_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link Art2Aspect.AspectRoot <em>Aspect Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Root</em>'.
	 * @see Art2Aspect.AspectRoot
	 * @generated
	 */
	EClass getAspectRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.AspectRoot#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see Art2Aspect.AspectRoot#getAspects()
	 * @see #getAspectRoot()
	 * @generated
	 */
	EReference getAspectRoot_Aspects();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.AspectDefinition <em>Aspect Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Definition</em>'.
	 * @see Art2Aspect.AspectDefinition
	 * @generated
	 */
	EClass getAspectDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.AspectDefinition#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see Art2Aspect.AspectDefinition#getBindings()
	 * @see #getAspectDefinition()
	 * @generated
	 */
	EReference getAspectDefinition_Bindings();

	/**
	 * Returns the meta object for the containment reference '{@link Art2Aspect.AspectDefinition#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointcut</em>'.
	 * @see Art2Aspect.AspectDefinition#getPointcut()
	 * @see #getAspectDefinition()
	 * @generated
	 */
	EReference getAspectDefinition_Pointcut();

	/**
	 * Returns the meta object for the containment reference '{@link Art2Aspect.AspectDefinition#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advice</em>'.
	 * @see Art2Aspect.AspectDefinition#getAdvice()
	 * @see #getAspectDefinition()
	 * @generated
	 */
	EReference getAspectDefinition_Advice();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.PointcutDefinition <em>Pointcut Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut Definition</em>'.
	 * @see Art2Aspect.PointcutDefinition
	 * @generated
	 */
	EClass getPointcutDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.PointcutDefinition#getComponentTypePatterns <em>Component Type Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Type Patterns</em>'.
	 * @see Art2Aspect.PointcutDefinition#getComponentTypePatterns()
	 * @see #getPointcutDefinition()
	 * @generated
	 */
	EReference getPointcutDefinition_ComponentTypePatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.PointcutDefinition#getNodePatterns <em>Node Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Patterns</em>'.
	 * @see Art2Aspect.PointcutDefinition#getNodePatterns()
	 * @see #getPointcutDefinition()
	 * @generated
	 */
	EReference getPointcutDefinition_NodePatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.PointcutDefinition#getPortTypePatterns <em>Port Type Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Type Patterns</em>'.
	 * @see Art2Aspect.PointcutDefinition#getPortTypePatterns()
	 * @see #getPointcutDefinition()
	 * @generated
	 */
	EReference getPointcutDefinition_PortTypePatterns();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.BindingPattern <em>Binding Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Pattern</em>'.
	 * @see Art2Aspect.BindingPattern
	 * @generated
	 */
	EClass getBindingPattern();

	/**
	 * Returns the meta object for the reference '{@link Art2Aspect.BindingPattern#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Art2Aspect.BindingPattern#getSource()
	 * @see #getBindingPattern()
	 * @generated
	 */
	EReference getBindingPattern_Source();

	/**
	 * Returns the meta object for the reference '{@link Art2Aspect.BindingPattern#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Art2Aspect.BindingPattern#getTarget()
	 * @see #getBindingPattern()
	 * @generated
	 */
	EReference getBindingPattern_Target();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.ComponentTypePattern <em>Component Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Pattern</em>'.
	 * @see Art2Aspect.ComponentTypePattern
	 * @generated
	 */
	EClass getComponentTypePattern();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.ComponentTypePattern#getRequiredPortTypeRefPatterns <em>Required Port Type Ref Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Port Type Ref Patterns</em>'.
	 * @see Art2Aspect.ComponentTypePattern#getRequiredPortTypeRefPatterns()
	 * @see #getComponentTypePattern()
	 * @generated
	 */
	EReference getComponentTypePattern_RequiredPortTypeRefPatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.ComponentTypePattern#getProvidedPortTypeRefPatterns <em>Provided Port Type Ref Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Port Type Ref Patterns</em>'.
	 * @see Art2Aspect.ComponentTypePattern#getProvidedPortTypeRefPatterns()
	 * @see #getComponentTypePattern()
	 * @generated
	 */
	EReference getComponentTypePattern_ProvidedPortTypeRefPatterns();

	/**
	 * Returns the meta object for the reference '{@link Art2Aspect.ComponentTypePattern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see Art2Aspect.ComponentTypePattern#getType()
	 * @see #getComponentTypePattern()
	 * @generated
	 */
	EReference getComponentTypePattern_Type();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.NodePattern <em>Node Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Pattern</em>'.
	 * @see Art2Aspect.NodePattern
	 * @generated
	 */
	EClass getNodePattern();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.NodePattern#getComponentPatterns <em>Component Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Patterns</em>'.
	 * @see Art2Aspect.NodePattern#getComponentPatterns()
	 * @see #getNodePattern()
	 * @generated
	 */
	EReference getNodePattern_ComponentPatterns();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.PortPattern <em>Port Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Pattern</em>'.
	 * @see Art2Aspect.PortPattern
	 * @generated
	 */
	EClass getPortPattern();

	/**
	 * Returns the meta object for the reference '{@link Art2Aspect.PortPattern#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see Art2Aspect.PortPattern#getRef()
	 * @see #getPortPattern()
	 * @generated
	 */
	EReference getPortPattern_Ref();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.ComponentPattern <em>Component Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Pattern</em>'.
	 * @see Art2Aspect.ComponentPattern
	 * @generated
	 */
	EClass getComponentPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.ComponentPattern#getProvidedPortPatterns <em>Provided Port Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Port Patterns</em>'.
	 * @see Art2Aspect.ComponentPattern#getProvidedPortPatterns()
	 * @see #getComponentPattern()
	 * @generated
	 */
	EReference getComponentPattern_ProvidedPortPatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link Art2Aspect.ComponentPattern#getRequiredPortPatterns <em>Required Port Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Port Patterns</em>'.
	 * @see Art2Aspect.ComponentPattern#getRequiredPortPatterns()
	 * @see #getComponentPattern()
	 * @generated
	 */
	EReference getComponentPattern_RequiredPortPatterns();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.PortTypePattern <em>Port Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Pattern</em>'.
	 * @see Art2Aspect.PortTypePattern
	 * @generated
	 */
	EClass getPortTypePattern();

	/**
	 * Returns the meta object for the reference '{@link Art2Aspect.PortTypePattern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see Art2Aspect.PortTypePattern#getType()
	 * @see #getPortTypePattern()
	 * @generated
	 */
	EReference getPortTypePattern_Type();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.PortTypeRefPattern <em>Port Type Ref Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Ref Pattern</em>'.
	 * @see Art2Aspect.PortTypeRefPattern
	 * @generated
	 */
	EClass getPortTypeRefPattern();

	/**
	 * Returns the meta object for the reference '{@link Art2Aspect.PortTypeRefPattern#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see Art2Aspect.PortTypeRefPattern#getRef()
	 * @see #getPortTypeRefPattern()
	 * @generated
	 */
	EReference getPortTypeRefPattern_Ref();

	/**
	 * Returns the meta object for class '{@link Art2Aspect.PatternNamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Named Element</em>'.
	 * @see Art2Aspect.PatternNamedElement
	 * @generated
	 */
	EClass getPatternNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Art2Aspect.PatternNamedElement#getNamePattern <em>Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Pattern</em>'.
	 * @see Art2Aspect.PatternNamedElement#getNamePattern()
	 * @see #getPatternNamedElement()
	 * @generated
	 */
	EAttribute getPatternNamedElement_NamePattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Art2AspectFactory getArt2AspectFactory();

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
		 * The meta object literal for the '{@link Art2Aspect.impl.AspectRootImpl <em>Aspect Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.AspectRootImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getAspectRoot()
		 * @generated
		 */
		EClass ASPECT_ROOT = eINSTANCE.getAspectRoot();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_ROOT__ASPECTS = eINSTANCE.getAspectRoot_Aspects();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.AspectDefinitionImpl <em>Aspect Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.AspectDefinitionImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getAspectDefinition()
		 * @generated
		 */
		EClass ASPECT_DEFINITION = eINSTANCE.getAspectDefinition();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_DEFINITION__BINDINGS = eINSTANCE.getAspectDefinition_Bindings();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_DEFINITION__POINTCUT = eINSTANCE.getAspectDefinition_Pointcut();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_DEFINITION__ADVICE = eINSTANCE.getAspectDefinition_Advice();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.PointcutDefinitionImpl <em>Pointcut Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.PointcutDefinitionImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPointcutDefinition()
		 * @generated
		 */
		EClass POINTCUT_DEFINITION = eINSTANCE.getPointcutDefinition();

		/**
		 * The meta object literal for the '<em><b>Component Type Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS = eINSTANCE.getPointcutDefinition_ComponentTypePatterns();

		/**
		 * The meta object literal for the '<em><b>Node Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT_DEFINITION__NODE_PATTERNS = eINSTANCE.getPointcutDefinition_NodePatterns();

		/**
		 * The meta object literal for the '<em><b>Port Type Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT_DEFINITION__PORT_TYPE_PATTERNS = eINSTANCE.getPointcutDefinition_PortTypePatterns();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.BindingPatternImpl <em>Binding Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.BindingPatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getBindingPattern()
		 * @generated
		 */
		EClass BINDING_PATTERN = eINSTANCE.getBindingPattern();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PATTERN__SOURCE = eINSTANCE.getBindingPattern_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PATTERN__TARGET = eINSTANCE.getBindingPattern_Target();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.ComponentTypePatternImpl <em>Component Type Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.ComponentTypePatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getComponentTypePattern()
		 * @generated
		 */
		EClass COMPONENT_TYPE_PATTERN = eINSTANCE.getComponentTypePattern();

		/**
		 * The meta object literal for the '<em><b>Required Port Type Ref Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS = eINSTANCE.getComponentTypePattern_RequiredPortTypeRefPatterns();

		/**
		 * The meta object literal for the '<em><b>Provided Port Type Ref Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS = eINSTANCE.getComponentTypePattern_ProvidedPortTypeRefPatterns();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_PATTERN__TYPE = eINSTANCE.getComponentTypePattern_Type();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.NodePatternImpl <em>Node Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.NodePatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getNodePattern()
		 * @generated
		 */
		EClass NODE_PATTERN = eINSTANCE.getNodePattern();

		/**
		 * The meta object literal for the '<em><b>Component Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PATTERN__COMPONENT_PATTERNS = eINSTANCE.getNodePattern_ComponentPatterns();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.PortPatternImpl <em>Port Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.PortPatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPortPattern()
		 * @generated
		 */
		EClass PORT_PATTERN = eINSTANCE.getPortPattern();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PATTERN__REF = eINSTANCE.getPortPattern_Ref();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.ComponentPatternImpl <em>Component Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.ComponentPatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getComponentPattern()
		 * @generated
		 */
		EClass COMPONENT_PATTERN = eINSTANCE.getComponentPattern();

		/**
		 * The meta object literal for the '<em><b>Provided Port Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS = eINSTANCE.getComponentPattern_ProvidedPortPatterns();

		/**
		 * The meta object literal for the '<em><b>Required Port Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS = eINSTANCE.getComponentPattern_RequiredPortPatterns();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.PortTypePatternImpl <em>Port Type Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.PortTypePatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPortTypePattern()
		 * @generated
		 */
		EClass PORT_TYPE_PATTERN = eINSTANCE.getPortTypePattern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE_PATTERN__TYPE = eINSTANCE.getPortTypePattern_Type();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.PortTypeRefPatternImpl <em>Port Type Ref Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.PortTypeRefPatternImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPortTypeRefPattern()
		 * @generated
		 */
		EClass PORT_TYPE_REF_PATTERN = eINSTANCE.getPortTypeRefPattern();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE_REF_PATTERN__REF = eINSTANCE.getPortTypeRefPattern_Ref();

		/**
		 * The meta object literal for the '{@link Art2Aspect.impl.PatternNamedElementImpl <em>Pattern Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Art2Aspect.impl.PatternNamedElementImpl
		 * @see Art2Aspect.impl.Art2AspectPackageImpl#getPatternNamedElement()
		 * @generated
		 */
		EClass PATTERN_NAMED_ELEMENT = eINSTANCE.getPatternNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__NAME_PATTERN = eINSTANCE.getPatternNamedElement_NamePattern();

	}

} //Art2AspectPackage
