/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import smartadapters4ART.Smartadapters4ARTPackage;

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
 * @see smartadapters4ART.adaptations.AdaptationsFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SmartAdapters4ART/adaptations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptationsPackage eINSTANCE = smartadapters4ART.adaptations.impl.AdaptationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link smartadapters4ART.adaptations.impl.SetruntimeNodeImpl <em>Setruntime Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.adaptations.impl.SetruntimeNodeImpl
	 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeNode()
	 * @generated
	 */
	int SETRUNTIME_NODE = 0;

	/**
	 * The feature id for the '<em><b>Node To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_NODE__NODE_TO_SET = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_NODE__COMPONENTS = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Setruntime Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_NODE_FEATURE_COUNT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartadapters4ART.adaptations.impl.SetruntimeSystemImpl <em>Setruntime System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.adaptations.impl.SetruntimeSystemImpl
	 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeSystem()
	 * @generated
	 */
	int SETRUNTIME_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>System To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__SYSTEM_TO_SET = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFROOT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFSERVICES = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reftypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFTYPES = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refdata Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFDATA_TYPES = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFNAME = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Setruntime System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM_FEATURE_COUNT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl <em>Setruntimeinstance Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl
	 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Component Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refbinding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE_FEATURE_COUNT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl <em>Setruntimeinstance Primitive Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl
	 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Primitive Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refbinding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Primitive Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE_FEATURE_COUNT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl <em>Setruntimeinstance Composite Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl
	 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Composite Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refsub Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refdelegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refbinding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Composite Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE_FEATURE_COUNT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl <em>Setruntimeinstance Transmission Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartadapters4ART.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl
	 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Transmission Binding To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refserver Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Transmission Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING_FEATURE_COUNT = Smartadapters4ARTPackage.SET_ADAPTATION_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link smartadapters4ART.adaptations.SetruntimeNode <em>Setruntime Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntime Node</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeNode
	 * @generated
	 */
	EClass getSetruntimeNode();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeNode#getNodeToSet <em>Node To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node To Set</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeNode#getNodeToSet()
	 * @see #getSetruntimeNode()
	 * @generated
	 */
	EReference getSetruntimeNode_NodeToSet();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeNode#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeNode#getComponents()
	 * @see #getSetruntimeNode()
	 * @generated
	 */
	EReference getSetruntimeNode_Components();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.adaptations.SetruntimeSystem <em>Setruntime System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntime System</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem
	 * @generated
	 */
	EClass getSetruntimeSystem();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeSystem#getSystemToSet <em>System To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System To Set</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem#getSystemToSet()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_SystemToSet();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefroot <em>Refroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refroot</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem#getRefroot()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_Refroot();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefservices <em>Refservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refservices</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem#getRefservices()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_Refservices();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeSystem#getReftypes <em>Reftypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reftypes</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem#getReftypes()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_Reftypes();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefdataTypes <em>Refdata Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refdata Types</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem#getRefdataTypes()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_RefdataTypes();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeSystem#getRefname()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EAttribute getSetruntimeSystem_Refname();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance <em>Setruntimeinstance Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Component Instance</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance
	 * @generated
	 */
	EClass getSetruntimeinstanceComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getComponentInstanceToSet <em>Component Instance To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance To Set</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getComponentInstanceToSet()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_ComponentInstanceToSet();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reftype</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getReftype()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefstate <em>Refstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refstate</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefstate()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceComponentInstance_Refstate();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefsuperComponent <em>Refsuper Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refsuper Component</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefsuperComponent()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_RefsuperComponent();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefattribute <em>Refattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refattribute</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefattribute()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_Refattribute();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefbinding <em>Refbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refbinding</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefbinding()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_Refbinding();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefname()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceComponentInstance_Refname();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance <em>Setruntimeinstance Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Primitive Instance</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance
	 * @generated
	 */
	EClass getSetruntimeinstancePrimitiveInstance();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getPrimitiveInstanceToSet <em>Primitive Instance To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Instance To Set</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getPrimitiveInstanceToSet()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reftype</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getReftype()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefstate <em>Refstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refstate</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefstate()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstancePrimitiveInstance_Refstate();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefsuperComponent <em>Refsuper Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refsuper Component</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefsuperComponent()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_RefsuperComponent();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefattribute <em>Refattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refattribute</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefattribute()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_Refattribute();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefbinding <em>Refbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refbinding</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefbinding()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_Refbinding();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance#getRefname()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstancePrimitiveInstance_Refname();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance <em>Setruntimeinstance Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Composite Instance</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance
	 * @generated
	 */
	EClass getSetruntimeinstanceCompositeInstance();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getCompositeInstanceToSet <em>Composite Instance To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite Instance To Set</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getCompositeInstanceToSet()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_CompositeInstanceToSet();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsubComponent <em>Refsub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refsub Component</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsubComponent()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_RefsubComponent();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefdelegation <em>Refdelegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refdelegation</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefdelegation()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Refdelegation();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reftype</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getReftype()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefstate <em>Refstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refstate</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefstate()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceCompositeInstance_Refstate();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsuperComponent <em>Refsuper Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refsuper Component</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsuperComponent()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_RefsuperComponent();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefattribute <em>Refattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refattribute</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefattribute()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Refattribute();

	/**
	 * Returns the meta object for the reference list '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefbinding <em>Refbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refbinding</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefbinding()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Refbinding();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefname()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceCompositeInstance_Refname();

	/**
	 * Returns the meta object for class '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding <em>Setruntimeinstance Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Transmission Binding</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding
	 * @generated
	 */
	EClass getSetruntimeinstanceTransmissionBinding();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Binding To Set</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient <em>Refclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refclient</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_Refclient();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver <em>Refserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refserver</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_Refserver();

	/**
	 * Returns the meta object for the reference '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance <em>Refserver Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refserver Instance</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_RefserverInstance();

	/**
	 * Returns the meta object for the attribute '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefId()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceTransmissionBinding_RefId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptationsFactory getAdaptationsFactory();

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
		 * The meta object literal for the '{@link smartadapters4ART.adaptations.impl.SetruntimeNodeImpl <em>Setruntime Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.adaptations.impl.SetruntimeNodeImpl
		 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeNode()
		 * @generated
		 */
		EClass SETRUNTIME_NODE = eINSTANCE.getSetruntimeNode();

		/**
		 * The meta object literal for the '<em><b>Node To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_NODE__NODE_TO_SET = eINSTANCE.getSetruntimeNode_NodeToSet();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_NODE__COMPONENTS = eINSTANCE.getSetruntimeNode_Components();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.adaptations.impl.SetruntimeSystemImpl <em>Setruntime System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.adaptations.impl.SetruntimeSystemImpl
		 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeSystem()
		 * @generated
		 */
		EClass SETRUNTIME_SYSTEM = eINSTANCE.getSetruntimeSystem();

		/**
		 * The meta object literal for the '<em><b>System To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_SYSTEM__SYSTEM_TO_SET = eINSTANCE.getSetruntimeSystem_SystemToSet();

		/**
		 * The meta object literal for the '<em><b>Refroot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_SYSTEM__REFROOT = eINSTANCE.getSetruntimeSystem_Refroot();

		/**
		 * The meta object literal for the '<em><b>Refservices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_SYSTEM__REFSERVICES = eINSTANCE.getSetruntimeSystem_Refservices();

		/**
		 * The meta object literal for the '<em><b>Reftypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_SYSTEM__REFTYPES = eINSTANCE.getSetruntimeSystem_Reftypes();

		/**
		 * The meta object literal for the '<em><b>Refdata Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIME_SYSTEM__REFDATA_TYPES = eINSTANCE.getSetruntimeSystem_RefdataTypes();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIME_SYSTEM__REFNAME = eINSTANCE.getSetruntimeSystem_Refname();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl <em>Setruntimeinstance Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl
		 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceComponentInstance()
		 * @generated
		 */
		EClass SETRUNTIMEINSTANCE_COMPONENT_INSTANCE = eINSTANCE.getSetruntimeinstanceComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component Instance To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET = eINSTANCE.getSetruntimeinstanceComponentInstance_ComponentInstanceToSet();

		/**
		 * The meta object literal for the '<em><b>Reftype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE = eINSTANCE.getSetruntimeinstanceComponentInstance_Reftype();

		/**
		 * The meta object literal for the '<em><b>Refstate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE = eINSTANCE.getSetruntimeinstanceComponentInstance_Refstate();

		/**
		 * The meta object literal for the '<em><b>Refsuper Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT = eINSTANCE.getSetruntimeinstanceComponentInstance_RefsuperComponent();

		/**
		 * The meta object literal for the '<em><b>Refattribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE = eINSTANCE.getSetruntimeinstanceComponentInstance_Refattribute();

		/**
		 * The meta object literal for the '<em><b>Refbinding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING = eINSTANCE.getSetruntimeinstanceComponentInstance_Refbinding();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME = eINSTANCE.getSetruntimeinstanceComponentInstance_Refname();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl <em>Setruntimeinstance Primitive Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl
		 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstancePrimitiveInstance()
		 * @generated
		 */
		EClass SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE = eINSTANCE.getSetruntimeinstancePrimitiveInstance();

		/**
		 * The meta object literal for the '<em><b>Primitive Instance To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET = eINSTANCE.getSetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet();

		/**
		 * The meta object literal for the '<em><b>Reftype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE = eINSTANCE.getSetruntimeinstancePrimitiveInstance_Reftype();

		/**
		 * The meta object literal for the '<em><b>Refstate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE = eINSTANCE.getSetruntimeinstancePrimitiveInstance_Refstate();

		/**
		 * The meta object literal for the '<em><b>Refsuper Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT = eINSTANCE.getSetruntimeinstancePrimitiveInstance_RefsuperComponent();

		/**
		 * The meta object literal for the '<em><b>Refattribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE = eINSTANCE.getSetruntimeinstancePrimitiveInstance_Refattribute();

		/**
		 * The meta object literal for the '<em><b>Refbinding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING = eINSTANCE.getSetruntimeinstancePrimitiveInstance_Refbinding();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME = eINSTANCE.getSetruntimeinstancePrimitiveInstance_Refname();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl <em>Setruntimeinstance Composite Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl
		 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceCompositeInstance()
		 * @generated
		 */
		EClass SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE = eINSTANCE.getSetruntimeinstanceCompositeInstance();

		/**
		 * The meta object literal for the '<em><b>Composite Instance To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET = eINSTANCE.getSetruntimeinstanceCompositeInstance_CompositeInstanceToSet();

		/**
		 * The meta object literal for the '<em><b>Refsub Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT = eINSTANCE.getSetruntimeinstanceCompositeInstance_RefsubComponent();

		/**
		 * The meta object literal for the '<em><b>Refdelegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION = eINSTANCE.getSetruntimeinstanceCompositeInstance_Refdelegation();

		/**
		 * The meta object literal for the '<em><b>Reftype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE = eINSTANCE.getSetruntimeinstanceCompositeInstance_Reftype();

		/**
		 * The meta object literal for the '<em><b>Refstate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE = eINSTANCE.getSetruntimeinstanceCompositeInstance_Refstate();

		/**
		 * The meta object literal for the '<em><b>Refsuper Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT = eINSTANCE.getSetruntimeinstanceCompositeInstance_RefsuperComponent();

		/**
		 * The meta object literal for the '<em><b>Refattribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE = eINSTANCE.getSetruntimeinstanceCompositeInstance_Refattribute();

		/**
		 * The meta object literal for the '<em><b>Refbinding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING = eINSTANCE.getSetruntimeinstanceCompositeInstance_Refbinding();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME = eINSTANCE.getSetruntimeinstanceCompositeInstance_Refname();

		/**
		 * The meta object literal for the '{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl <em>Setruntimeinstance Transmission Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartadapters4ART.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl
		 * @see smartadapters4ART.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceTransmissionBinding()
		 * @generated
		 */
		EClass SETRUNTIMEINSTANCE_TRANSMISSION_BINDING = eINSTANCE.getSetruntimeinstanceTransmissionBinding();

		/**
		 * The meta object literal for the '<em><b>Transmission Binding To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET = eINSTANCE.getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet();

		/**
		 * The meta object literal for the '<em><b>Refclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT = eINSTANCE.getSetruntimeinstanceTransmissionBinding_Refclient();

		/**
		 * The meta object literal for the '<em><b>Refserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER = eINSTANCE.getSetruntimeinstanceTransmissionBinding_Refserver();

		/**
		 * The meta object literal for the '<em><b>Refserver Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE = eINSTANCE.getSetruntimeinstanceTransmissionBinding_RefserverInstance();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID = eINSTANCE.getSetruntimeinstanceTransmissionBinding_RefId();

	}

} //AdaptationsPackage
