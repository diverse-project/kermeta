/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance.impl;

import ecorewithaspectandInherithance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorewithaspectandInherithanceFactoryImpl extends EFactoryImpl implements EcorewithaspectandInherithanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcorewithaspectandInherithanceFactory init() {
		try {
			EcorewithaspectandInherithanceFactory theEcorewithaspectandInherithanceFactory = (EcorewithaspectandInherithanceFactory)EPackage.Registry.INSTANCE.getEFactory("http://mm/1.0"); 
			if (theEcorewithaspectandInherithanceFactory != null) {
				return theEcorewithaspectandInherithanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcorewithaspectandInherithanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorewithaspectandInherithanceFactoryImpl() {
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
			case EcorewithaspectandInherithancePackage.A: return createA();
			case EcorewithaspectandInherithancePackage.B: return createB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A createA() {
		AImpl a = new AImpl();
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B createB() {
		BImpl b = new BImpl();
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorewithaspectandInherithancePackage getEcorewithaspectandInherithancePackage() {
		return (EcorewithaspectandInherithancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorewithaspectandInherithancePackage getPackage() {
		return EcorewithaspectandInherithancePackage.eINSTANCE;
	}

} //EcorewithaspectandInherithanceFactoryImpl
