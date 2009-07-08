/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem.impl;

import art.implem.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import art.implem.FractalComponent;
import art.implem.ImplemFactory;
import art.implem.ImplemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplemFactoryImpl extends EFactoryImpl implements ImplemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplemFactory init() {
		try {
			ImplemFactory theImplemFactory = (ImplemFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/implem"); 
			if (theImplemFactory != null) {
				return theImplemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImplemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImplemPackage.FRACTAL_COMPONENT: return createFractalComponent();
			case ImplemPackage.OS_GI_COMPONENT: return createOSGiComponent();
			case ImplemPackage.PORT_IMPLEMENTATION: return createPortImplementation();
			case ImplemPackage.OS_GI_PORT: return createOSGiPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FractalComponent createFractalComponent() {
		FractalComponentImpl fractalComponent = new FractalComponentImpl();
		return fractalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSGiComponent createOSGiComponent() {
		OSGiComponentImpl osGiComponent = new OSGiComponentImpl();
		return osGiComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortImplementation createPortImplementation() {
		PortImplementationImpl portImplementation = new PortImplementationImpl();
		return portImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSGiPort createOSGiPort() {
		OSGiPortImpl osGiPort = new OSGiPortImpl();
		return osGiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplemPackage getImplemPackage() {
		return (ImplemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImplemPackage getPackage() {
		return ImplemPackage.eINSTANCE;
	}

} //ImplemFactoryImpl
