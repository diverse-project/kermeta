/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.smartadapters.core.SmartAdapters4DiVAPackage;

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
 * @see org.smartadapters.core.adaptations.AdaptationsFactory
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
	String eNS_URI = "http://SmartAdapters4ART/smartadapters/core/adaptations";

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
	AdaptationsPackage eINSTANCE = org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl <em>Setruntime System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl
	 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeSystem()
	 * @generated
	 */
	int SETRUNTIME_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__ADAPTER = SmartAdapters4DiVAPackage.SET_ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>System To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__SYSTEM_TO_SET = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFROOT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFSERVICES = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reftypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFTYPES = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refdata Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFDATA_TYPES = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM__REFNAME = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Setruntime System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIME_SYSTEM_FEATURE_COUNT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceComponentInstanceImpl <em>Setruntimeinstance Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstanceComponentInstanceImpl
	 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__ADAPTER = SmartAdapters4DiVAPackage.SET_ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>Component Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refbinding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refcontroller Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFCONTROLLER_DESC = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refcontent Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFCONTENT_DESC = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPONENT_INSTANCE_FEATURE_COUNT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl <em>Setruntimeinstance Primitive Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl
	 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__ADAPTER = SmartAdapters4DiVAPackage.SET_ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>Primitive Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refbinding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refcontroller Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFCONTROLLER_DESC = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refcontent Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFCONTENT_DESC = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Primitive Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE_FEATURE_COUNT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl <em>Setruntimeinstance Composite Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl
	 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__ADAPTER = SmartAdapters4DiVAPackage.SET_ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>Composite Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refsub Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refdelegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refbinding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refcontroller Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFCONTROLLER_DESC = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Refcontent Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFCONTENT_DESC = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Composite Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE_FEATURE_COUNT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl <em>Setruntimeinstance Transmission Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl
	 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__ADAPTER = SmartAdapters4DiVAPackage.SET_ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>Transmission Binding To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refserver Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Setruntimeinstance Transmission Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETRUNTIMEINSTANCE_TRANSMISSION_BINDING_FEATURE_COUNT = SmartAdapters4DiVAPackage.SET_ADAPTATION_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.adaptations.SetruntimeSystem <em>Setruntime System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntime System</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem
	 * @generated
	 */
	EClass getSetruntimeSystem();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getSystemToSet <em>System To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System To Set</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem#getSystemToSet()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_SystemToSet();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefroot <em>Refroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refroot</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem#getRefroot()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_Refroot();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefservices <em>Refservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refservices</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem#getRefservices()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_Refservices();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getReftypes <em>Reftypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reftypes</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem#getReftypes()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_Reftypes();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefdataTypes <em>Refdata Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refdata Types</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem#getRefdataTypes()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EReference getSetruntimeSystem_RefdataTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem#getRefname()
	 * @see #getSetruntimeSystem()
	 * @generated
	 */
	EAttribute getSetruntimeSystem_Refname();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance <em>Setruntimeinstance Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Component Instance</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance
	 * @generated
	 */
	EClass getSetruntimeinstanceComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getComponentInstanceToSet <em>Component Instance To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance To Set</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getComponentInstanceToSet()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_ComponentInstanceToSet();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reftype</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getReftype()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefstate <em>Refstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refstate</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefstate()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceComponentInstance_Refstate();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefsuperComponent <em>Refsuper Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refsuper Component</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefsuperComponent()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_RefsuperComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefattribute <em>Refattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refattribute</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefattribute()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_Refattribute();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefbinding <em>Refbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refbinding</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefbinding()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceComponentInstance_Refbinding();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefcontrollerDesc <em>Refcontroller Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refcontroller Desc</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefcontrollerDesc()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceComponentInstance_RefcontrollerDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefcontentDesc <em>Refcontent Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refcontent Desc</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefcontentDesc()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceComponentInstance_RefcontentDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance#getRefname()
	 * @see #getSetruntimeinstanceComponentInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceComponentInstance_Refname();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance <em>Setruntimeinstance Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Primitive Instance</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance
	 * @generated
	 */
	EClass getSetruntimeinstancePrimitiveInstance();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getPrimitiveInstanceToSet <em>Primitive Instance To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Instance To Set</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getPrimitiveInstanceToSet()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reftype</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getReftype()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefstate <em>Refstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refstate</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefstate()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstancePrimitiveInstance_Refstate();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefsuperComponent <em>Refsuper Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refsuper Component</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefsuperComponent()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_RefsuperComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefattribute <em>Refattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refattribute</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefattribute()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_Refattribute();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefbinding <em>Refbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refbinding</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefbinding()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EReference getSetruntimeinstancePrimitiveInstance_Refbinding();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontrollerDesc <em>Refcontroller Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refcontroller Desc</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontrollerDesc()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstancePrimitiveInstance_RefcontrollerDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontentDesc <em>Refcontent Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refcontent Desc</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontentDesc()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstancePrimitiveInstance_RefcontentDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefname()
	 * @see #getSetruntimeinstancePrimitiveInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstancePrimitiveInstance_Refname();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance <em>Setruntimeinstance Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Composite Instance</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance
	 * @generated
	 */
	EClass getSetruntimeinstanceCompositeInstance();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getCompositeInstanceToSet <em>Composite Instance To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite Instance To Set</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getCompositeInstanceToSet()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_CompositeInstanceToSet();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefsubComponent <em>Refsub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refsub Component</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefsubComponent()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_RefsubComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefdelegation <em>Refdelegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refdelegation</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefdelegation()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Refdelegation();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reftype</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getReftype()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefstate <em>Refstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refstate</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefstate()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceCompositeInstance_Refstate();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefsuperComponent <em>Refsuper Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refsuper Component</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefsuperComponent()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_RefsuperComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefattribute <em>Refattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refattribute</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefattribute()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Refattribute();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefbinding <em>Refbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refbinding</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefbinding()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EReference getSetruntimeinstanceCompositeInstance_Refbinding();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefcontrollerDesc <em>Refcontroller Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refcontroller Desc</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefcontrollerDesc()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceCompositeInstance_RefcontrollerDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefcontentDesc <em>Refcontent Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refcontent Desc</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefcontentDesc()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceCompositeInstance_RefcontentDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance#getRefname()
	 * @see #getSetruntimeinstanceCompositeInstance()
	 * @generated
	 */
	EAttribute getSetruntimeinstanceCompositeInstance_Refname();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding <em>Setruntimeinstance Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setruntimeinstance Transmission Binding</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding
	 * @generated
	 */
	EClass getSetruntimeinstanceTransmissionBinding();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Binding To Set</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient <em>Refclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refclient</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_Refclient();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver <em>Refserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refserver</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_Refserver();

	/**
	 * Returns the meta object for the reference '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance <em>Refserver Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refserver Instance</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance()
	 * @see #getSetruntimeinstanceTransmissionBinding()
	 * @generated
	 */
	EReference getSetruntimeinstanceTransmissionBinding_RefserverInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefId()
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
		 * The meta object literal for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl <em>Setruntime System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.adaptations.impl.SetruntimeSystemImpl
		 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeSystem()
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
		 * The meta object literal for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceComponentInstanceImpl <em>Setruntimeinstance Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstanceComponentInstanceImpl
		 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceComponentInstance()
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
		 * The meta object literal for the '<em><b>Refcontroller Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFCONTROLLER_DESC = eINSTANCE.getSetruntimeinstanceComponentInstance_RefcontrollerDesc();

		/**
		 * The meta object literal for the '<em><b>Refcontent Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFCONTENT_DESC = eINSTANCE.getSetruntimeinstanceComponentInstance_RefcontentDesc();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME = eINSTANCE.getSetruntimeinstanceComponentInstance_Refname();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl <em>Setruntimeinstance Primitive Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl
		 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstancePrimitiveInstance()
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
		 * The meta object literal for the '<em><b>Refcontroller Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFCONTROLLER_DESC = eINSTANCE.getSetruntimeinstancePrimitiveInstance_RefcontrollerDesc();

		/**
		 * The meta object literal for the '<em><b>Refcontent Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFCONTENT_DESC = eINSTANCE.getSetruntimeinstancePrimitiveInstance_RefcontentDesc();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME = eINSTANCE.getSetruntimeinstancePrimitiveInstance_Refname();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl <em>Setruntimeinstance Composite Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl
		 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceCompositeInstance()
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
		 * The meta object literal for the '<em><b>Refcontroller Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFCONTROLLER_DESC = eINSTANCE.getSetruntimeinstanceCompositeInstance_RefcontrollerDesc();

		/**
		 * The meta object literal for the '<em><b>Refcontent Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFCONTENT_DESC = eINSTANCE.getSetruntimeinstanceCompositeInstance_RefcontentDesc();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME = eINSTANCE.getSetruntimeinstanceCompositeInstance_Refname();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl <em>Setruntimeinstance Transmission Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl
		 * @see org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl#getSetruntimeinstanceTransmissionBinding()
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
