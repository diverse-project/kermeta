/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestFactoryImpl.java,v 1.2 2008-03-05 07:58:39 ftanguy Exp $
 */
package org.kermeta.model.interest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.model.interest.*;
import org.kermeta.model.interest.Concern;
import org.kermeta.model.interest.InterestFactory;
import org.kermeta.model.interest.InterestHost;
import org.kermeta.model.interest.InterestPackage;
import org.kermeta.model.interest.WorriedObject;

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
			case InterestPackage.INTEREST_HOST: return createInterestHost();
			case InterestPackage.CONCERN: return createConcern();
			case InterestPackage.WORRIED_OBJECT: return createWorriedObject();
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
			case InterestPackage.ID_NOT_FOUND_EXCEPTION:
				return createIdNotFoundExceptionFromString(eDataType, initialValue);
			case InterestPackage.INTERESTED_OBJECT:
				return createInterestedObjectFromString(eDataType, initialValue);
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
			case InterestPackage.ID_NOT_FOUND_EXCEPTION:
				return convertIdNotFoundExceptionToString(eDataType, instanceValue);
			case InterestPackage.INTERESTED_OBJECT:
				return convertInterestedObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public Concern createConcern() {
		ConcernImpl concern = new ConcernImpl();
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorriedObject createWorriedObject() {
		WorriedObjectImpl worriedObject = new WorriedObjectImpl();
		return worriedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdNotFoundException createIdNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (IdNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestedObject createInterestedObjectFromString(EDataType eDataType, String initialValue) {
		return (InterestedObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterestedObjectToString(EDataType eDataType, Object instanceValue) {
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
