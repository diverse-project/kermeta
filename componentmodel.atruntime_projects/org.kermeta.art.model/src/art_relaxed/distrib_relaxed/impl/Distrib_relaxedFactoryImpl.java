/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.distrib_relaxed.impl;

import art_relaxed.distrib_relaxed.*;

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
public class Distrib_relaxedFactoryImpl extends EFactoryImpl implements Distrib_relaxedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Distrib_relaxedFactory init() {
		try {
			Distrib_relaxedFactory theDistrib_relaxedFactory = (Distrib_relaxedFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/distrib_relaxed"); 
			if (theDistrib_relaxedFactory != null) {
				return theDistrib_relaxedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Distrib_relaxedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distrib_relaxedFactoryImpl() {
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
			case Distrib_relaxedPackage.NODE: return createNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distrib_relaxedPackage getDistrib_relaxedPackage() {
		return (Distrib_relaxedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Distrib_relaxedPackage getPackage() {
		return Distrib_relaxedPackage.eINSTANCE;
	}

} //Distrib_relaxedFactoryImpl
