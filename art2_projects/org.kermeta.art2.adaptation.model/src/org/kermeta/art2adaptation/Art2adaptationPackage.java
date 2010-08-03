/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

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
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.ComponentTypeAdaptationImpl <em>Component Type Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.ComponentTypeAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getComponentTypeAdaptation()
	 * @generated
	 */
	int COMPONENT_TYPE_ADAPTATION = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Type Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.ComponentInstanceAdaptationImpl <em>Component Instance Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.ComponentInstanceAdaptationImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getComponentInstanceAdaptation()
	 * @generated
	 */
	int COMPONENT_INSTANCE_ADAPTATION = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_ADAPTATION__REF = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Instance Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_ADAPTATION_FEATURE_COUNT = ADAPTATION_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddComponentTypeImpl <em>Add Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddComponentTypeImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddComponentType()
	 * @generated
	 */
	int ADD_COMPONENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPONENT_TYPE__REF = COMPONENT_TYPE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPONENT_TYPE_FEATURE_COUNT = COMPONENT_TYPE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveComponentTypeImpl <em>Remove Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveComponentTypeImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveComponentType()
	 * @generated
	 */
	int REMOVE_COMPONENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMPONENT_TYPE__REF = COMPONENT_TYPE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMPONENT_TYPE_FEATURE_COUNT = COMPONENT_TYPE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.AddComponentInstanceImpl <em>Add Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.AddComponentInstanceImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddComponentInstance()
	 * @generated
	 */
	int ADD_COMPONENT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPONENT_INSTANCE__REF = COMPONENT_INSTANCE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Add Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2adaptation.impl.RemoveComponentInstanceImpl <em>Remove Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2adaptation.impl.RemoveComponentInstanceImpl
	 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveComponentInstance()
	 * @generated
	 */
	int REMOVE_COMPONENT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMPONENT_INSTANCE__REF = COMPONENT_INSTANCE_ADAPTATION__REF;

	/**
	 * The number of structural features of the '<em>Remove Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_ADAPTATION_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.ComponentTypeAdaptation <em>Component Type Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.ComponentTypeAdaptation
	 * @generated
	 */
	EClass getComponentTypeAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.ComponentTypeAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.ComponentTypeAdaptation#getRef()
	 * @see #getComponentTypeAdaptation()
	 * @generated
	 */
	EReference getComponentTypeAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.ComponentInstanceAdaptation <em>Component Instance Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Adaptation</em>'.
	 * @see org.kermeta.art2adaptation.ComponentInstanceAdaptation
	 * @generated
	 */
	EClass getComponentInstanceAdaptation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2adaptation.ComponentInstanceAdaptation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2adaptation.ComponentInstanceAdaptation#getRef()
	 * @see #getComponentInstanceAdaptation()
	 * @generated
	 */
	EReference getComponentInstanceAdaptation_Ref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddComponentType <em>Add Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Component Type</em>'.
	 * @see org.kermeta.art2adaptation.AddComponentType
	 * @generated
	 */
	EClass getAddComponentType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveComponentType <em>Remove Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Component Type</em>'.
	 * @see org.kermeta.art2adaptation.RemoveComponentType
	 * @generated
	 */
	EClass getRemoveComponentType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.AddComponentInstance <em>Add Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Component Instance</em>'.
	 * @see org.kermeta.art2adaptation.AddComponentInstance
	 * @generated
	 */
	EClass getAddComponentInstance();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2adaptation.RemoveComponentInstance <em>Remove Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Component Instance</em>'.
	 * @see org.kermeta.art2adaptation.RemoveComponentInstance
	 * @generated
	 */
	EClass getRemoveComponentInstance();

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
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.ComponentTypeAdaptationImpl <em>Component Type Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.ComponentTypeAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getComponentTypeAdaptation()
		 * @generated
		 */
		EClass COMPONENT_TYPE_ADAPTATION = eINSTANCE.getComponentTypeAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_ADAPTATION__REF = eINSTANCE.getComponentTypeAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.ComponentInstanceAdaptationImpl <em>Component Instance Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.ComponentInstanceAdaptationImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getComponentInstanceAdaptation()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_ADAPTATION = eINSTANCE.getComponentInstanceAdaptation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_ADAPTATION__REF = eINSTANCE.getComponentInstanceAdaptation_Ref();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddComponentTypeImpl <em>Add Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddComponentTypeImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddComponentType()
		 * @generated
		 */
		EClass ADD_COMPONENT_TYPE = eINSTANCE.getAddComponentType();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveComponentTypeImpl <em>Remove Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveComponentTypeImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveComponentType()
		 * @generated
		 */
		EClass REMOVE_COMPONENT_TYPE = eINSTANCE.getRemoveComponentType();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.AddComponentInstanceImpl <em>Add Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.AddComponentInstanceImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getAddComponentInstance()
		 * @generated
		 */
		EClass ADD_COMPONENT_INSTANCE = eINSTANCE.getAddComponentInstance();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2adaptation.impl.RemoveComponentInstanceImpl <em>Remove Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2adaptation.impl.RemoveComponentInstanceImpl
		 * @see org.kermeta.art2adaptation.impl.Art2adaptationPackageImpl#getRemoveComponentInstance()
		 * @generated
		 */
		EClass REMOVE_COMPONENT_INSTANCE = eINSTANCE.getRemoveComponentInstance();

	}

} //Art2adaptationPackage
