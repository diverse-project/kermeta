/**
 * <copyright>
 * </copyright>
 *
 * $Id: OcompareFactoryImpl.java,v 1.1 2008-08-20 09:50:08 fmunoz Exp $
 */
package ocompare.impl;

import ocompare.*;

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
public class OcompareFactoryImpl extends EFactoryImpl implements OcompareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OcompareFactory init() {
		try {
			OcompareFactory theOcompareFactory = (OcompareFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/decompose/compare"); 
			if (theOcompareFactory != null) {
				return theOcompareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OcompareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcompareFactoryImpl() {
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
			case OcomparePackage.COMPARE_ELEMENT: return createCompareElement();
			case OcomparePackage.COMPARE: return createCompare();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareElement createCompareElement() {
		CompareElementImpl compareElement = new CompareElementImpl();
		return compareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compare createCompare() {
		CompareImpl compare = new CompareImpl();
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcomparePackage getOcomparePackage() {
		return (OcomparePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OcomparePackage getPackage() {
		return OcomparePackage.eINSTANCE;
	}

} //OcompareFactoryImpl
