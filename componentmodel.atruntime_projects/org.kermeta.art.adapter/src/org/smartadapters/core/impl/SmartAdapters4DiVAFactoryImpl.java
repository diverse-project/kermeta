/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smartadapters.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartAdapters4DiVAFactoryImpl extends EFactoryImpl implements SmartAdapters4DiVAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartAdapters4DiVAFactory init() {
		try {
			SmartAdapters4DiVAFactory theSmartAdapters4DiVAFactory = (SmartAdapters4DiVAFactory)EPackage.Registry.INSTANCE.getEFactory("http://SmartAdapters4ART/smartadapters/core"); 
			if (theSmartAdapters4DiVAFactory != null) {
				return theSmartAdapters4DiVAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartAdapters4DiVAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartAdapters4DiVAFactoryImpl() {
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
			case SmartAdapters4DiVAPackage.ADAPTER: return createAdapter();
			case SmartAdapters4DiVAPackage.ASPECT: return createAspect();
			case SmartAdapters4DiVAPackage.MAKE_UNIQUE: return createmakeUnique();
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
			case SmartAdapters4DiVAPackage.UNIQUE_TYPE:
				return createuniqueTypeFromString(eDataType, initialValue);
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
			case SmartAdapters4DiVAPackage.UNIQUE_TYPE:
				return convertuniqueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAdapter() {
		AdapterImpl adapter = new AdapterImpl();
		return adapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public makeUnique createmakeUnique() {
		makeUniqueImpl makeUnique = new makeUniqueImpl();
		return makeUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uniqueType createuniqueTypeFromString(EDataType eDataType, String initialValue) {
		uniqueType result = uniqueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertuniqueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartAdapters4DiVAPackage getSmartAdapters4DiVAPackage() {
		return (SmartAdapters4DiVAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartAdapters4DiVAPackage getPackage() {
		return SmartAdapters4DiVAPackage.eINSTANCE;
	}

} //SmartAdapters4DiVAFactoryImpl
