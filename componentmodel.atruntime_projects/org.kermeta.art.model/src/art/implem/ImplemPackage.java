/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see art.implem.ImplemFactory
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
	String eNS_URI = "http://art/implem";

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
	ImplemPackage eINSTANCE = art.implem.impl.ImplemPackageImpl.init();

	/**
	 * The meta object id for the '{@link art.implem.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.implem.impl.ComponentImplementationImpl
	 * @see art.implem.impl.ImplemPackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link art.implem.impl.FractalComponentImpl <em>Fractal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.implem.impl.FractalComponentImpl
	 * @see art.implem.impl.ImplemPackageImpl#getFractalComponent()
	 * @generated
	 */
	int FRACTAL_COMPONENT = 1;

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
	 * The meta object id for the '{@link art.implem.impl.OSGiComponentImpl <em>OS Gi Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.implem.impl.OSGiComponentImpl
	 * @see art.implem.impl.ImplemPackageImpl#getOSGiComponent()
	 * @generated
	 */
	int OS_GI_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__URL = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OS Gi Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art.implem.impl.PortImplementationImpl <em>Port Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.implem.impl.PortImplementationImpl
	 * @see art.implem.impl.ImplemPackageImpl#getPortImplementation()
	 * @generated
	 */
	int PORT_IMPLEMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Port Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IMPLEMENTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link art.implem.impl.OSGiPortImpl <em>OS Gi Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.implem.impl.OSGiPortImpl
	 * @see art.implem.impl.ImplemPackageImpl#getOSGiPort()
	 * @generated
	 */
	int OS_GI_PORT = 4;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_PORT__SERVICE_ID = PORT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OS Gi Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_PORT_FEATURE_COUNT = PORT_IMPLEMENTATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link art.implem.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see art.implem.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for class '{@link art.implem.FractalComponent <em>Fractal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fractal Component</em>'.
	 * @see art.implem.FractalComponent
	 * @generated
	 */
	EClass getFractalComponent();

	/**
	 * Returns the meta object for the attribute '{@link art.implem.FractalComponent#getControllerDesc <em>Controller Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller Desc</em>'.
	 * @see art.implem.FractalComponent#getControllerDesc()
	 * @see #getFractalComponent()
	 * @generated
	 */
	EAttribute getFractalComponent_ControllerDesc();

	/**
	 * Returns the meta object for the attribute '{@link art.implem.FractalComponent#getContentDesc <em>Content Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Desc</em>'.
	 * @see art.implem.FractalComponent#getContentDesc()
	 * @see #getFractalComponent()
	 * @generated
	 */
	EAttribute getFractalComponent_ContentDesc();

	/**
	 * Returns the meta object for class '{@link art.implem.OSGiComponent <em>OS Gi Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Component</em>'.
	 * @see art.implem.OSGiComponent
	 * @generated
	 */
	EClass getOSGiComponent();

	/**
	 * Returns the meta object for the attribute '{@link art.implem.OSGiComponent#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see art.implem.OSGiComponent#getURL()
	 * @see #getOSGiComponent()
	 * @generated
	 */
	EAttribute getOSGiComponent_URL();

	/**
	 * Returns the meta object for class '{@link art.implem.PortImplementation <em>Port Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Implementation</em>'.
	 * @see art.implem.PortImplementation
	 * @generated
	 */
	EClass getPortImplementation();

	/**
	 * Returns the meta object for class '{@link art.implem.OSGiPort <em>OS Gi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Port</em>'.
	 * @see art.implem.OSGiPort
	 * @generated
	 */
	EClass getOSGiPort();

	/**
	 * Returns the meta object for the attribute '{@link art.implem.OSGiPort#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see art.implem.OSGiPort#getServiceId()
	 * @see #getOSGiPort()
	 * @generated
	 */
	EAttribute getOSGiPort_ServiceId();

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
		 * The meta object literal for the '{@link art.implem.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.implem.impl.ComponentImplementationImpl
		 * @see art.implem.impl.ImplemPackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '{@link art.implem.impl.FractalComponentImpl <em>Fractal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.implem.impl.FractalComponentImpl
		 * @see art.implem.impl.ImplemPackageImpl#getFractalComponent()
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
		 * The meta object literal for the '{@link art.implem.impl.OSGiComponentImpl <em>OS Gi Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.implem.impl.OSGiComponentImpl
		 * @see art.implem.impl.ImplemPackageImpl#getOSGiComponent()
		 * @generated
		 */
		EClass OS_GI_COMPONENT = eINSTANCE.getOSGiComponent();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_COMPONENT__URL = eINSTANCE.getOSGiComponent_URL();

		/**
		 * The meta object literal for the '{@link art.implem.impl.PortImplementationImpl <em>Port Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.implem.impl.PortImplementationImpl
		 * @see art.implem.impl.ImplemPackageImpl#getPortImplementation()
		 * @generated
		 */
		EClass PORT_IMPLEMENTATION = eINSTANCE.getPortImplementation();

		/**
		 * The meta object literal for the '{@link art.implem.impl.OSGiPortImpl <em>OS Gi Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.implem.impl.OSGiPortImpl
		 * @see art.implem.impl.ImplemPackageImpl#getOSGiPort()
		 * @generated
		 */
		EClass OS_GI_PORT = eINSTANCE.getOSGiPort();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_PORT__SERVICE_ID = eINSTANCE.getOSGiPort_ServiceId();

	}

} //ImplemPackage
