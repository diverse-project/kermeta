/**
 * <copyright>
 * </copyright>
 *
 * $Id: FacadeFactoryImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.facade.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import emf.spoon.facade.FacadeFactory;
import emf.spoon.facade.FacadePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacadeFactoryImpl extends EFactoryImpl implements FacadeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacadeFactory init() {
		try {
			FacadeFactory theFacadeFactory = (FacadeFactory)EPackage.Registry.INSTANCE.getEFactory("null"); 
			if (theFacadeFactory != null) {
				return theFacadeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FacadeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacadeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacadePackage getFacadePackage() {
		return (FacadePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static FacadePackage getPackage() {
		return FacadePackage.eINSTANCE;
	}

} //FacadeFactoryImpl
