/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

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
 * @see org.kermeta.art2adaptation.Art2adaptationFactory
 * @model kind="package"
 * @generated
 */
public interface Art2adaptationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "art2adaptation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art2adaptation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "art2adaptation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Art2adaptationPackage eINSTANCE = org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AdaptationPrimitiveImpl <em>Adaptation Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AdaptationPrimitiveImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAdaptationPrimitive()
	 * @generated
	 */
	int ADAPTATION_PRIMITIVE = 0;

	/**
	 * The number of structural features of the '<em>Adaptation Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PRIMITIVE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AdaptationModelImpl <em>Adaptation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AdaptationModelImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAdaptationModel()
	 * @generated
	 */
	int ADAPTATION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Adaptations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MODEL__ADAPTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Adaptation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.TypeAdaptationImpl <em>Type Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.TypeAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getTypeAdaptation()
	 * @generated
	 */
	int TYPE_ADAPTATION = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.InstanceAdaptationImpl <em>Instance Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.InstanceAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getInstanceAdaptation()
	 * @generated
	 */
	int INSTANCE_ADAPTATION = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddTypeImpl <em>Add Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddTypeImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddType()
	 * @generated
	 */
	int ADD_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TYPE__REF = TYPE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TYPE_FEATURE_COUNT = TYPE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveTypeImpl <em>Remove Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveTypeImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveType()
	 * @generated
	 */
	int REMOVE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TYPE__REF = TYPE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TYPE_FEATURE_COUNT = TYPE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddInstanceImpl <em>Add Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddInstanceImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddInstance()
	 * @generated
	 */
	int ADD_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INSTANCE__REF = INSTANCE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INSTANCE_FEATURE_COUNT = INSTANCE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveInstanceImpl <em>Remove Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveInstanceImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveInstance()
	 * @generated
	 */
	int REMOVE_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INSTANCE__REF = INSTANCE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INSTANCE_FEATURE_COUNT = INSTANCE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.ThirdPartyAdaptationImpl <em>Third Party Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.ThirdPartyAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getThirdPartyAdaptation()
	 * @generated
	 */
	int THIRD_PARTY_ADAPTATION = 8;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Third Party Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddThirdPartyImpl <em>Add Third Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddThirdPartyImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddThirdParty()
	 * @generated
	 */
	int ADD_THIRD_PARTY = 9;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_THIRD_PARTY__REF = THIRD_PARTY_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Third Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_THIRD_PARTY_FEATURE_COUNT = THIRD_PARTY_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveThirdPartyImpl <em>Remove Third Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveThirdPartyImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveThirdParty()
	 * @generated
	 */
	int REMOVE_THIRD_PARTY = 10;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_THIRD_PARTY__REF = THIRD_PARTY_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Third Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_THIRD_PARTY_FEATURE_COUNT = THIRD_PARTY_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.BindingAdaptationImpl <em>Binding Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.BindingAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getBindingAdaptation()
	 * @generated
	 */
	int BINDING_ADAPTATION = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binding Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddBindingImpl <em>Add Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddBindingImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddBinding()
	 * @generated
	 */
	int ADD_BINDING = 12;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING__REF = BINDING_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BINDING_FEATURE_COUNT = BINDING_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveBindingImpl <em>Remove Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveBindingImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveBinding()
	 * @generated
	 */
	int REMOVE_BINDING = 13;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BINDING__REF = BINDING_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BINDING_FEATURE_COUNT = BINDING_ADAPTATION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.FragmentBindingAdaptationImpl <em>Fragment Binding Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.FragmentBindingAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getFragmentBindingAdaptation()
	 * @generated
	 */
	int FRAGMENT_BINDING_ADAPTATION = 14;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_BINDING_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fragment Binding Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_BINDING_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddFragmentBindingImpl <em>Add Fragment Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddFragmentBindingImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddFragmentBinding()
	 * @generated
	 */
	int ADD_FRAGMENT_BINDING = 15;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FRAGMENT_BINDING__REF = FRAGMENT_BINDING_ADAPTATION__REF;

	/**
	 * The feature id for the '<em><b>Target Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FRAGMENT_BINDING__TARGET_NODE_NAME = FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME;

	/**
	 * The number of structural features of the '<em>Add Fragment Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FRAGMENT_BINDING_FEATURE_COUNT = FRAGMENT_BINDING_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveFragmentBindingImpl <em>Remove Fragment Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveFragmentBindingImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveFragmentBinding()
	 * @generated
	 */
	int REMOVE_FRAGMENT_BINDING = 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FRAGMENT_BINDING__REF = FRAGMENT_BINDING_ADAPTATION__REF;

	/**
	 * The feature id for the '<em><b>Target Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FRAGMENT_BINDING__TARGET_NODE_NAME = FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME;

	/**
	 * The number of structural features of the '<em>Remove Fragment Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FRAGMENT_BINDING_FEATURE_COUNT = FRAGMENT_BINDING_ADAPTATION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.UpdateInstanceImpl <em>Update Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.UpdateInstanceImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getUpdateInstance()
	 * @generated
	 */
	int UPDATE_INSTANCE = 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_INSTANCE__REF = INSTANCE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Update Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_INSTANCE_FEATURE_COUNT = INSTANCE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.UpdateDictionaryInstanceImpl <em>Update Dictionary Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.UpdateDictionaryInstanceImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getUpdateDictionaryInstance()
	 * @generated
	 */
	int UPDATE_DICTIONARY_INSTANCE = 18;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DICTIONARY_INSTANCE__REF = INSTANCE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Update Dictionary Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DICTIONARY_INSTANCE_FEATURE_COUNT = INSTANCE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.UpdateTypeImpl <em>Update Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.UpdateTypeImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__REF = TYPE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_FEATURE_COUNT = TYPE_ADAPTATION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.DeployUnitAdaptationImpl <em>Deploy Unit Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.DeployUnitAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getDeployUnitAdaptation()
	 * @generated
	 */
	int DEPLOY_UNIT_ADAPTATION = 20;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deploy Unit Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddDeployUnitImpl <em>Add Deploy Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddDeployUnitImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddDeployUnit()
	 * @generated
	 */
	int ADD_DEPLOY_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEPLOY_UNIT__REF = DEPLOY_UNIT_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Deploy Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEPLOY_UNIT_FEATURE_COUNT = DEPLOY_UNIT_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveDeployUnitImpl <em>Remove Deploy Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveDeployUnitImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveDeployUnit()
	 * @generated
	 */
	int REMOVE_DEPLOY_UNIT = 22;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DEPLOY_UNIT__REF = DEPLOY_UNIT_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Deploy Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DEPLOY_UNIT_FEATURE_COUNT = DEPLOY_UNIT_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AdaptationPrimitive <em>Adaptation Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Primitive</em>'.
	 * @see org.kermeta.art2adaptation.AdaptationPrimitive
	 * @generated
	 */
	EClass getAdaptationPrimitive();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AdaptationModel <em>Adaptation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Model</em>'.
	 * @see org.kermeta.art2adaptation.AdaptationModel
	 * @generated
	 */
	EClass getAdaptationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2adaptation.AdaptationModel#getAdaptations <em>Adaptations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptations</em>'.
	 * @see org.kermeta.art2adaptation.AdaptationModel#getAdaptations()
	 * @see #getAdaptationModel()
	 * @generated
	 */
	EReference getAdaptationModel_Adaptations();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.TypeAdaptation <em>Type Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.TypeAdaptation
	 * @generated
	 */
	EClass getTypeAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.TypeAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.TypeAdaptation#getRef()
	 * @see #getTypeAdaptation()
	 * @generated
	 */
	EReference getTypeAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.InstanceAdaptation <em>Instance Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.InstanceAdaptation
	 * @generated
	 */
	EClass getInstanceAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.InstanceAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.InstanceAdaptation#getRef()
	 * @see #getInstanceAdaptation()
	 * @generated
	 */
	EReference getInstanceAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddType <em>Add Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Type</em>'.
	 * @see org.kermeta.art2adaptation.AddType
	 * @generated
	 */
	EClass getAddType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveType <em>Remove Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Type</em>'.
	 * @see org.kermeta.art2adaptation.RemoveType
	 * @generated
	 */
	EClass getRemoveType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddInstance <em>Add Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Instance</em>'.
	 * @see org.kermeta.art2adaptation.AddInstance
	 * @generated
	 */
	EClass getAddInstance();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveInstance <em>Remove Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Instance</em>'.
	 * @see org.kermeta.art2adaptation.RemoveInstance
	 * @generated
	 */
	EClass getRemoveInstance();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.ThirdPartyAdaptation <em>Third Party Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Party Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.ThirdPartyAdaptation
	 * @generated
	 */
	EClass getThirdPartyAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.ThirdPartyAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.ThirdPartyAdaptation#getRef()
	 * @see #getThirdPartyAdaptation()
	 * @generated
	 */
	EReference getThirdPartyAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddThirdParty <em>Add Third Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Third Party</em>'.
	 * @see org.kermeta.art2adaptation.AddThirdParty
	 * @generated
	 */
	EClass getAddThirdParty();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveThirdParty <em>Remove Third Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Third Party</em>'.
	 * @see org.kermeta.art2adaptation.RemoveThirdParty
	 * @generated
	 */
	EClass getRemoveThirdParty();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.BindingAdaptation <em>Binding Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.BindingAdaptation
	 * @generated
	 */
	EClass getBindingAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.BindingAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.BindingAdaptation#getRef()
	 * @see #getBindingAdaptation()
	 * @generated
	 */
	EReference getBindingAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddBinding <em>Add Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Binding</em>'.
	 * @see org.kermeta.art2adaptation.AddBinding
	 * @generated
	 */
	EClass getAddBinding();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveBinding <em>Remove Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Binding</em>'.
	 * @see org.kermeta.art2adaptation.RemoveBinding
	 * @generated
	 */
	EClass getRemoveBinding();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.FragmentBindingAdaptation <em>Fragment Binding Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Binding Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.FragmentBindingAdaptation
	 * @generated
	 */
	EClass getFragmentBindingAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.FragmentBindingAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.FragmentBindingAdaptation#getRef()
	 * @see #getFragmentBindingAdaptation()
	 * @generated
	 */
	EReference getFragmentBindingAdaptation_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2adaptation.FragmentBindingAdaptation#getTargetNodeName <em>Target Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Node Name</em>'.
	 * @see org.kermeta.art2adaptation.FragmentBindingAdaptation#getTargetNodeName()
	 * @see #getFragmentBindingAdaptation()
	 * @generated
	 */
	EAttribute getFragmentBindingAdaptation_TargetNodeName();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddFragmentBinding <em>Add Fragment Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Fragment Binding</em>'.
	 * @see org.kermeta.art2adaptation.AddFragmentBinding
	 * @generated
	 */
	EClass getAddFragmentBinding();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveFragmentBinding <em>Remove Fragment Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Fragment Binding</em>'.
	 * @see org.kermeta.art2adaptation.RemoveFragmentBinding
	 * @generated
	 */
	EClass getRemoveFragmentBinding();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.UpdateInstance <em>Update Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Instance</em>'.
	 * @see org.kermeta.art2adaptation.UpdateInstance
	 * @generated
	 */
	EClass getUpdateInstance();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.UpdateDictionaryInstance <em>Update Dictionary Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Dictionary Instance</em>'.
	 * @see org.kermeta.art2adaptation.UpdateDictionaryInstance
	 * @generated
	 */
	EClass getUpdateDictionaryInstance();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Type</em>'.
	 * @see org.kermeta.art2adaptation.UpdateType
	 * @generated
	 */
	EClass getUpdateType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.DeployUnitAdaptation <em>Deploy Unit Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy Unit Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.DeployUnitAdaptation
	 * @generated
	 */
	EClass getDeployUnitAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.DeployUnitAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.DeployUnitAdaptation#getRef()
	 * @see #getDeployUnitAdaptation()
	 * @generated
	 */
	EReference getDeployUnitAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddDeployUnit <em>Add Deploy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Deploy Unit</em>'.
	 * @see org.kermeta.art2adaptation.AddDeployUnit
	 * @generated
	 */
	EClass getAddDeployUnit();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveDeployUnit <em>Remove Deploy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Deploy Unit</em>'.
	 * @see org.kermeta.art2adaptation.RemoveDeployUnit
	 * @generated
	 */
	EClass getRemoveDeployUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Art2adaptationFactory getArt2adaptationFactory();

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
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AdaptationPrimitiveImpl <em>Adaptation Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AdaptationPrimitiveImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAdaptationPrimitive()
		 * @generated
		 */
		EClass ADAPTATION_PRIMITIVE = eINSTANCE.getAdaptationPrimitive();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AdaptationModelImpl <em>Adaptation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AdaptationModelImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAdaptationModel()
		 * @generated
		 */
		EClass ADAPTATION_MODEL = eINSTANCE.getAdaptationModel();

		/**
		 * The meta object literal for the '<em><b>Adaptations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_MODEL__ADAPTATIONS = eINSTANCE.getAdaptationModel_Adaptations();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.TypeAdaptationImpl <em>Type Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.TypeAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getTypeAdaptation()
		 * @generated
		 */
		EClass TYPE_ADAPTATION = eINSTANCE.getTypeAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ADAPTATION__REF = eINSTANCE.getTypeAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.InstanceAdaptationImpl <em>Instance Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.InstanceAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getInstanceAdaptation()
		 * @generated
		 */
		EClass INSTANCE_ADAPTATION = eINSTANCE.getInstanceAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ADAPTATION__REF = eINSTANCE.getInstanceAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddTypeImpl <em>Add Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddTypeImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddType()
		 * @generated
		 */
		EClass ADD_TYPE = eINSTANCE.getAddType();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveTypeImpl <em>Remove Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveTypeImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveType()
		 * @generated
		 */
		EClass REMOVE_TYPE = eINSTANCE.getRemoveType();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddInstanceImpl <em>Add Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddInstanceImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddInstance()
		 * @generated
		 */
		EClass ADD_INSTANCE = eINSTANCE.getAddInstance();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveInstanceImpl <em>Remove Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveInstanceImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveInstance()
		 * @generated
		 */
		EClass REMOVE_INSTANCE = eINSTANCE.getRemoveInstance();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.ThirdPartyAdaptationImpl <em>Third Party Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.ThirdPartyAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getThirdPartyAdaptation()
		 * @generated
		 */
		EClass THIRD_PARTY_ADAPTATION = eINSTANCE.getThirdPartyAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_PARTY_ADAPTATION__REF = eINSTANCE.getThirdPartyAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddThirdPartyImpl <em>Add Third Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddThirdPartyImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddThirdParty()
		 * @generated
		 */
		EClass ADD_THIRD_PARTY = eINSTANCE.getAddThirdParty();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveThirdPartyImpl <em>Remove Third Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveThirdPartyImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveThirdParty()
		 * @generated
		 */
		EClass REMOVE_THIRD_PARTY = eINSTANCE.getRemoveThirdParty();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.BindingAdaptationImpl <em>Binding Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.BindingAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getBindingAdaptation()
		 * @generated
		 */
		EClass BINDING_ADAPTATION = eINSTANCE.getBindingAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ADAPTATION__REF = eINSTANCE.getBindingAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddBindingImpl <em>Add Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddBindingImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddBinding()
		 * @generated
		 */
		EClass ADD_BINDING = eINSTANCE.getAddBinding();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveBindingImpl <em>Remove Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveBindingImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveBinding()
		 * @generated
		 */
		EClass REMOVE_BINDING = eINSTANCE.getRemoveBinding();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.FragmentBindingAdaptationImpl <em>Fragment Binding Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.FragmentBindingAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getFragmentBindingAdaptation()
		 * @generated
		 */
		EClass FRAGMENT_BINDING_ADAPTATION = eINSTANCE.getFragmentBindingAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_BINDING_ADAPTATION__REF = eINSTANCE.getFragmentBindingAdaptation_Ref();

		/**
		 * The meta object literal for the '<em><b>Target Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME = eINSTANCE.getFragmentBindingAdaptation_TargetNodeName();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddFragmentBindingImpl <em>Add Fragment Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddFragmentBindingImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddFragmentBinding()
		 * @generated
		 */
		EClass ADD_FRAGMENT_BINDING = eINSTANCE.getAddFragmentBinding();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveFragmentBindingImpl <em>Remove Fragment Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveFragmentBindingImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveFragmentBinding()
		 * @generated
		 */
		EClass REMOVE_FRAGMENT_BINDING = eINSTANCE.getRemoveFragmentBinding();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.UpdateInstanceImpl <em>Update Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.UpdateInstanceImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getUpdateInstance()
		 * @generated
		 */
		EClass UPDATE_INSTANCE = eINSTANCE.getUpdateInstance();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.UpdateDictionaryInstanceImpl <em>Update Dictionary Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.UpdateDictionaryInstanceImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getUpdateDictionaryInstance()
		 * @generated
		 */
		EClass UPDATE_DICTIONARY_INSTANCE = eINSTANCE.getUpdateDictionaryInstance();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.UpdateTypeImpl <em>Update Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.UpdateTypeImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getUpdateType()
		 * @generated
		 */
		EClass UPDATE_TYPE = eINSTANCE.getUpdateType();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.DeployUnitAdaptationImpl <em>Deploy Unit Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.DeployUnitAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getDeployUnitAdaptation()
		 * @generated
		 */
		EClass DEPLOY_UNIT_ADAPTATION = eINSTANCE.getDeployUnitAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY_UNIT_ADAPTATION__REF = eINSTANCE.getDeployUnitAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddDeployUnitImpl <em>Add Deploy Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddDeployUnitImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddDeployUnit()
		 * @generated
		 */
		EClass ADD_DEPLOY_UNIT = eINSTANCE.getAddDeployUnit();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveDeployUnitImpl <em>Remove Deploy Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveDeployUnitImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveDeployUnit()
		 * @generated
		 */
		EClass REMOVE_DEPLOY_UNIT = eINSTANCE.getRemoveDeployUnit();

	}

} //Art2adaptationPackage
