/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.implem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import patternframework.PatternframeworkPackage;

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
 * @see pattern.art.implem.ImplemFactory
 * @model kind="package"
 * @generated
 */
public interface ImplemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "implem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/pattern/art/implem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "implem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplemPackage eINSTANCE = pattern.art.implem.impl.ImplemPackageImpl.init();

	/**
	 * The meta object id for the '{@link pattern.art.implem.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.implem.impl.ComponentImplementationImpl
	 * @see pattern.art.implem.impl.ImplemPackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__PID = PatternframeworkPackage.POBJECT__PID;

	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.art.implem.impl.FractalComponentImpl <em>Fractal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.implem.impl.FractalComponentImpl
	 * @see pattern.art.implem.impl.ImplemPackageImpl#getFractalComponent()
	 * @generated
	 */
	int FRACTAL_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTAL_COMPONENT__PID = COMPONENT_IMPLEMENTATION__PID;

	/**
	 * The feature id for the '<em><b>Controller Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTAL_COMPONENT__CONTROLLER_DESC = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTAL_COMPONENT__CONTENT_DESC = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fractal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTAL_COMPONENT_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pattern.art.implem.impl.OSGiComponentImpl <em>OS Gi Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.implem.impl.OSGiComponentImpl
	 * @see pattern.art.implem.impl.ImplemPackageImpl#getOSGiComponent()
	 * @generated
	 */
	int OS_GI_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__PID = COMPONENT_IMPLEMENTATION__PID;

	/**
	 * The feature id for the '<em><b>Implementing Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__IMPLEMENTING_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OS Gi Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pattern.art.implem.impl.TypeImplementationImpl <em>Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.implem.impl.TypeImplementationImpl
	 * @see pattern.art.implem.impl.ImplemPackageImpl#getTypeImplementation()
	 * @generated
	 */
	int TYPE_IMPLEMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_IMPLEMENTATION__PID = PatternframeworkPackage.POBJECT__PID;

	/**
	 * The number of structural features of the '<em>Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_IMPLEMENTATION_FEATURE_COUNT = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.art.implem.impl.OSGiTypeImpl <em>OS Gi Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.implem.impl.OSGiTypeImpl
	 * @see pattern.art.implem.impl.ImplemPackageImpl#getOSGiType()
	 * @generated
	 */
	int OS_GI_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_TYPE__PID = TYPE_IMPLEMENTATION__PID;

	/**
	 * The feature id for the '<em><b>Generate Instance Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE = TYPE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OS Gi Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_TYPE_FEATURE_COUNT = TYPE_IMPLEMENTATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link pattern.art.implem.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see pattern.art.implem.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for class '{@link pattern.art.implem.FractalComponent <em>Fractal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fractal Component</em>'.
	 * @see pattern.art.implem.FractalComponent
	 * @generated
	 */
	EClass getFractalComponent();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.implem.FractalComponent#getControllerDesc <em>Controller Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller Desc</em>'.
	 * @see pattern.art.implem.FractalComponent#getControllerDesc()
	 * @see #getFractalComponent()
	 * @generated
	 */
	EAttribute getFractalComponent_ControllerDesc();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.implem.FractalComponent#getContentDesc <em>Content Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Desc</em>'.
	 * @see pattern.art.implem.FractalComponent#getContentDesc()
	 * @see #getFractalComponent()
	 * @generated
	 */
	EAttribute getFractalComponent_ContentDesc();

	/**
	 * Returns the meta object for class '{@link pattern.art.implem.OSGiComponent <em>OS Gi Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Component</em>'.
	 * @see pattern.art.implem.OSGiComponent
	 * @generated
	 */
	EClass getOSGiComponent();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.implem.OSGiComponent#getImplementingClass <em>Implementing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementing Class</em>'.
	 * @see pattern.art.implem.OSGiComponent#getImplementingClass()
	 * @see #getOSGiComponent()
	 * @generated
	 */
	EAttribute getOSGiComponent_ImplementingClass();

	/**
	 * Returns the meta object for class '{@link pattern.art.implem.TypeImplementation <em>Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Implementation</em>'.
	 * @see pattern.art.implem.TypeImplementation
	 * @generated
	 */
	EClass getTypeImplementation();

	/**
	 * Returns the meta object for class '{@link pattern.art.implem.OSGiType <em>OS Gi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Type</em>'.
	 * @see pattern.art.implem.OSGiType
	 * @generated
	 */
	EClass getOSGiType();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.implem.OSGiType#getGenerateInstanceBundle <em>Generate Instance Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Instance Bundle</em>'.
	 * @see pattern.art.implem.OSGiType#getGenerateInstanceBundle()
	 * @see #getOSGiType()
	 * @generated
	 */
	EAttribute getOSGiType_GenerateInstanceBundle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplemFactory getImplemFactory();

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
		 * The meta object literal for the '{@link pattern.art.implem.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.implem.impl.ComponentImplementationImpl
		 * @see pattern.art.implem.impl.ImplemPackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '{@link pattern.art.implem.impl.FractalComponentImpl <em>Fractal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.implem.impl.FractalComponentImpl
		 * @see pattern.art.implem.impl.ImplemPackageImpl#getFractalComponent()
		 * @generated
		 */
		EClass FRACTAL_COMPONENT = eINSTANCE.getFractalComponent();

		/**
		 * The meta object literal for the '<em><b>Controller Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTAL_COMPONENT__CONTROLLER_DESC = eINSTANCE.getFractalComponent_ControllerDesc();

		/**
		 * The meta object literal for the '<em><b>Content Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRACTAL_COMPONENT__CONTENT_DESC = eINSTANCE.getFractalComponent_ContentDesc();

		/**
		 * The meta object literal for the '{@link pattern.art.implem.impl.OSGiComponentImpl <em>OS Gi Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.implem.impl.OSGiComponentImpl
		 * @see pattern.art.implem.impl.ImplemPackageImpl#getOSGiComponent()
		 * @generated
		 */
		EClass OS_GI_COMPONENT = eINSTANCE.getOSGiComponent();

		/**
		 * The meta object literal for the '<em><b>Implementing Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_COMPONENT__IMPLEMENTING_CLASS = eINSTANCE.getOSGiComponent_ImplementingClass();

		/**
		 * The meta object literal for the '{@link pattern.art.implem.impl.TypeImplementationImpl <em>Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.implem.impl.TypeImplementationImpl
		 * @see pattern.art.implem.impl.ImplemPackageImpl#getTypeImplementation()
		 * @generated
		 */
		EClass TYPE_IMPLEMENTATION = eINSTANCE.getTypeImplementation();

		/**
		 * The meta object literal for the '{@link pattern.art.implem.impl.OSGiTypeImpl <em>OS Gi Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.implem.impl.OSGiTypeImpl
		 * @see pattern.art.implem.impl.ImplemPackageImpl#getOSGiType()
		 * @generated
		 */
		EClass OS_GI_TYPE = eINSTANCE.getOSGiType();

		/**
		 * The meta object literal for the '<em><b>Generate Instance Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE = eINSTANCE.getOSGiType_GenerateInstanceBundle();

	}

} //ImplemPackage
