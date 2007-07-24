/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestFactoryImpl.java,v 1.2 2007-07-24 13:47:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.interest.InterestEntry;
import fr.irisa.triskell.kermeta.kpm.interest.InterestFactory;
import fr.irisa.triskell.kermeta.kpm.interest.InterestHost;
import fr.irisa.triskell.kermeta.kpm.interest.InterestKey;
import fr.irisa.triskell.kermeta.kpm.interest.InterestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterestFactoryImpl extends EFactoryImpl implements InterestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterestFactory init() {
		try {
			InterestFactory theInterestFactory = (InterestFactory)EPackage.Registry.INSTANCE.getEFactory("http://interest"); 
			if (theInterestFactory != null) {
				return theInterestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestFactoryImpl() {
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
			case InterestPackage.INTEREST_KEY: return createInterestKey();
			case InterestPackage.INTEREST_ENTRY: return createInterestEntry();
			case InterestPackage.INTEREST_HOST: return createInterestHost();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InterestPackage.INTEREST:
				return createInterestFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InterestPackage.INTEREST:
				return convertInterestToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestKey createInterestKey() {
		InterestKeyImpl interestKey = new InterestKeyImpl();
		return interestKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestEntry createInterestEntry() {
		InterestEntryImpl interestEntry = new InterestEntryImpl();
		return interestEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestHost createInterestHost() {
		InterestHostImpl interestHost = new InterestHostImpl();
		return interestHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interest createInterestFromString(EDataType eDataType, String initialValue) {
		return (Interest)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestPackage getInterestPackage() {
		return (InterestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterestPackage getPackage() {
		return InterestPackage.eINSTANCE;
	}

} //InterestFactoryImpl
