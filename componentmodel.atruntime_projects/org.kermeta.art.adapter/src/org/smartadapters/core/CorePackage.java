/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;

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
 * @see org.smartadapters.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SmartAdapters4ART/smartadapters/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.smartadapters.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.AdapterImpl <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.AdapterImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Adapt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__ADAPT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.AspectImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PERSISTENT = 2;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.AdaptationImpl <em>Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.AdaptationImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getAdaptation()
	 * @generated
	 */
	int ADAPTATION = 2;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION__ADAPTER = 0;

	/**
	 * The number of structural features of the '<em>Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.cloneAdaptationImpl <em>clone Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.cloneAdaptationImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getcloneAdaptation()
	 * @generated
	 */
	int CLONE_ADAPTATION = 3;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_ADAPTATION__ADAPTER = ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_ADAPTATION__IS_UNIQUE = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>clone Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.createAdaptationImpl <em>create Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.createAdaptationImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getcreateAdaptation()
	 * @generated
	 */
	int CREATE_ADAPTATION = 4;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ADAPTATION__ADAPTER = ADAPTATION__ADAPTER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ADAPTATION__IS_UNIQUE = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>create Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.setAdaptationImpl <em>set Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.setAdaptationImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getsetAdaptation()
	 * @generated
	 */
	int SET_ADAPTATION = 5;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ADAPTATION__ADAPTER = ADAPTATION__ADAPTER;

	/**
	 * The number of structural features of the '<em>set Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.impl.unsetAdaptationImpl <em>unset Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.impl.unsetAdaptationImpl
	 * @see org.smartadapters.core.impl.CorePackageImpl#getunsetAdaptation()
	 * @generated
	 */
	int UNSET_ADAPTATION = 6;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ADAPTATION__ADAPTER = ADAPTATION__ADAPTER;

	/**
	 * The number of structural features of the '<em>unset Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ADAPTATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smartadapters.core.uniqueType <em>unique Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smartadapters.core.uniqueType
	 * @see org.smartadapters.core.impl.CorePackageImpl#getuniqueType()
	 * @generated
	 */
	int UNIQUE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see org.smartadapters.core.Adapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link org.smartadapters.core.Adapter#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect</em>'.
	 * @see org.smartadapters.core.Adapter#getAspect()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smartadapters.core.Adapter#getAdapt <em>Adapt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adapt</em>'.
	 * @see org.smartadapters.core.Adapter#getAdapt()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Adapt();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.Adapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smartadapters.core.Adapter#getName()
	 * @see #getAdapter()
	 * @generated
	 */
	EAttribute getAdapter_Name();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.smartadapters.core.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference '{@link org.smartadapters.core.Aspect#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.smartadapters.core.Aspect#getTemplate()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Template();

	/**
	 * Returns the meta object for the containment reference '{@link org.smartadapters.core.Aspect#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.smartadapters.core.Aspect#getStructure()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Structure();

	/**
	 * Returns the meta object for the reference list '{@link org.smartadapters.core.Aspect#getPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persistent</em>'.
	 * @see org.smartadapters.core.Aspect#getPersistent()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Persistent();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.Adaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation</em>'.
	 * @see org.smartadapters.core.Adaptation
	 * @generated
	 */
	EClass getAdaptation();

	/**
	 * Returns the meta object for the container reference '{@link org.smartadapters.core.Adaptation#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Adapter</em>'.
	 * @see org.smartadapters.core.Adaptation#getAdapter()
	 * @see #getAdaptation()
	 * @generated
	 */
	EReference getAdaptation_Adapter();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.cloneAdaptation <em>clone Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>clone Adaptation</em>'.
	 * @see org.smartadapters.core.cloneAdaptation
	 * @generated
	 */
	EClass getcloneAdaptation();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.cloneAdaptation#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.smartadapters.core.cloneAdaptation#getIsUnique()
	 * @see #getcloneAdaptation()
	 * @generated
	 */
	EAttribute getcloneAdaptation_IsUnique();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.createAdaptation <em>create Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>create Adaptation</em>'.
	 * @see org.smartadapters.core.createAdaptation
	 * @generated
	 */
	EClass getcreateAdaptation();

	/**
	 * Returns the meta object for the attribute '{@link org.smartadapters.core.createAdaptation#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.smartadapters.core.createAdaptation#getIsUnique()
	 * @see #getcreateAdaptation()
	 * @generated
	 */
	EAttribute getcreateAdaptation_IsUnique();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.setAdaptation <em>set Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>set Adaptation</em>'.
	 * @see org.smartadapters.core.setAdaptation
	 * @generated
	 */
	EClass getsetAdaptation();

	/**
	 * Returns the meta object for class '{@link org.smartadapters.core.unsetAdaptation <em>unset Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>unset Adaptation</em>'.
	 * @see org.smartadapters.core.unsetAdaptation
	 * @generated
	 */
	EClass getunsetAdaptation();

	/**
	 * Returns the meta object for enum '{@link org.smartadapters.core.uniqueType <em>unique Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>unique Type</em>'.
	 * @see org.smartadapters.core.uniqueType
	 * @generated
	 */
	EEnum getuniqueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.smartadapters.core.impl.AdapterImpl <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.AdapterImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__ASPECT = eINSTANCE.getAdapter_Aspect();

		/**
		 * The meta object literal for the '<em><b>Adapt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__ADAPT = eINSTANCE.getAdapter_Adapt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER__NAME = eINSTANCE.getAdapter_Name();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.AspectImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__TEMPLATE = eINSTANCE.getAspect_Template();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__STRUCTURE = eINSTANCE.getAspect_Structure();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__PERSISTENT = eINSTANCE.getAspect_Persistent();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.impl.AdaptationImpl <em>Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.AdaptationImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getAdaptation()
		 * @generated
		 */
		EClass ADAPTATION = eINSTANCE.getAdaptation();

		/**
		 * The meta object literal for the '<em><b>Adapter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION__ADAPTER = eINSTANCE.getAdaptation_Adapter();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.impl.cloneAdaptationImpl <em>clone Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.cloneAdaptationImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getcloneAdaptation()
		 * @generated
		 */
		EClass CLONE_ADAPTATION = eINSTANCE.getcloneAdaptation();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE_ADAPTATION__IS_UNIQUE = eINSTANCE.getcloneAdaptation_IsUnique();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.impl.createAdaptationImpl <em>create Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.createAdaptationImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getcreateAdaptation()
		 * @generated
		 */
		EClass CREATE_ADAPTATION = eINSTANCE.getcreateAdaptation();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ADAPTATION__IS_UNIQUE = eINSTANCE.getcreateAdaptation_IsUnique();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.impl.setAdaptationImpl <em>set Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.setAdaptationImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getsetAdaptation()
		 * @generated
		 */
		EClass SET_ADAPTATION = eINSTANCE.getsetAdaptation();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.impl.unsetAdaptationImpl <em>unset Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.impl.unsetAdaptationImpl
		 * @see org.smartadapters.core.impl.CorePackageImpl#getunsetAdaptation()
		 * @generated
		 */
		EClass UNSET_ADAPTATION = eINSTANCE.getunsetAdaptation();

		/**
		 * The meta object literal for the '{@link org.smartadapters.core.uniqueType <em>unique Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smartadapters.core.uniqueType
		 * @see org.smartadapters.core.impl.CorePackageImpl#getuniqueType()
		 * @generated
		 */
		EEnum UNIQUE_TYPE = eINSTANCE.getuniqueType();

	}

} //CorePackage
