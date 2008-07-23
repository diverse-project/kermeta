/**
 * <copyright>
 * </copyright>
 *
 * $Id: KruntimeconfigurationFactoryImpl.java,v 1.2 2008-07-23 12:37:36 ftanguy Exp $
 */
package org.kermeta.kruntimeconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.kruntimeconfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KruntimeconfigurationFactoryImpl extends EFactoryImpl implements KruntimeconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KruntimeconfigurationFactory init() {
		try {
			KruntimeconfigurationFactory theKruntimeconfigurationFactory = (KruntimeconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kruntimeconfiguration"); 
			if (theKruntimeconfigurationFactory != null) {
				return theKruntimeconfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KruntimeconfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KruntimeconfigurationFactoryImpl() {
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
			case KruntimeconfigurationPackage.CONFIGURATION: return createConfiguration();
			case KruntimeconfigurationPackage.ENTRY: return createEntry();
			case KruntimeconfigurationPackage.PERSISTENCE: return createPersistence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistence createPersistence() {
		PersistenceImpl persistence = new PersistenceImpl();
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KruntimeconfigurationPackage getKruntimeconfigurationPackage() {
		return (KruntimeconfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KruntimeconfigurationPackage getPackage() {
		return KruntimeconfigurationPackage.eINSTANCE;
	}

} //KruntimeconfigurationFactoryImpl
