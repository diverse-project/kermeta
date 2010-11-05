/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.implem_relaxed.impl;

import art_relaxed.implem_relaxed.*;

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
public class Implem_relaxedFactoryImpl extends EFactoryImpl implements Implem_relaxedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Implem_relaxedFactory init() {
		try {
			Implem_relaxedFactory theImplem_relaxedFactory = (Implem_relaxedFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/implem_relaxed"); 
			if (theImplem_relaxedFactory != null) {
				return theImplem_relaxedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Implem_relaxedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implem_relaxedFactoryImpl() {
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
			case Implem_relaxedPackage.FRACTAL_COMPONENT: return createFractalComponent();
			case Implem_relaxedPackage.OS_GI_COMPONENT: return createOSGiComponent();
			case Implem_relaxedPackage.OS_GI_TYPE: return createOSGiType();
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
	public OSGiType createOSGiType() {
		OSGiTypeImpl osGiType = new OSGiTypeImpl();
		return osGiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implem_relaxedPackage getImplem_relaxedPackage() {
		return (Implem_relaxedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Implem_relaxedPackage getPackage() {
		return Implem_relaxedPackage.eINSTANCE;
	}

} //Implem_relaxedFactoryImpl
