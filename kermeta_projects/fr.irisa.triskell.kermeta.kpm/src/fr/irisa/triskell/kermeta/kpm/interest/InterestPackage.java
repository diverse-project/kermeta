/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestPackage.java,v 1.1 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestFactory
 * @model kind="package"
 * @generated
 */
public interface InterestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://interest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterestPackage eINSTANCE = fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestKeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestKeyImpl
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterestKey()
	 * @generated
	 */
	int INTEREST_KEY = 0;

	/**
	 * The feature id for the '<em><b>Declaring Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_KEY__DECLARING_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_KEY__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestEntryImpl
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterestEntry()
	 * @generated
	 */
	int INTEREST_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestHostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestHostImpl
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterestHost()
	 * @generated
	 */
	int INTEREST_HOST = 2;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_HOST__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_HOST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Interest</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.extension.Interest
	 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterest()
	 * @generated
	 */
	int INTEREST = 3;

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestKey
	 * @generated
	 */
	EClass getInterestKey();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getDeclaringObject <em>Declaring Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaring Object</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getDeclaringObject()
	 * @see #getInterestKey()
	 * @generated
	 */
	EAttribute getInterestKey_DeclaringObject();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestKey#getUnit()
	 * @see #getInterestKey()
	 * @generated
	 */
	EReference getInterestKey_Unit();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestEntry
	 * @generated
	 */
	EClass getInterestEntry();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getKey()
	 * @see #getInterestEntry()
	 * @generated
	 */
	EReference getInterestEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestEntry#getValue()
	 * @see #getInterestEntry()
	 * @generated
	 */
	EAttribute getInterestEntry_Value();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestHost
	 * @generated
	 */
	EClass getInterestHost();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestHost#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestHost#getEntries()
	 * @see #getInterestHost()
	 * @generated
	 */
	EReference getInterestHost_Entries();

	/**
	 * Returns the meta object for data type '{@link fr.irisa.triskell.kermeta.extension.Interest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interest</em>'.
	 * @see fr.irisa.triskell.kermeta.extension.Interest
	 * @model instanceClass="fr.irisa.triskell.kermeta.extension.Interest"
	 * @generated
	 */
	EDataType getInterest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterestFactory getInterestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestKeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestKeyImpl
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterestKey()
		 * @generated
		 */
		EClass INTEREST_KEY = eINSTANCE.getInterestKey();

		/**
		 * The meta object literal for the '<em><b>Declaring Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEREST_KEY__DECLARING_OBJECT = eINSTANCE.getInterestKey_DeclaringObject();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEREST_KEY__UNIT = eINSTANCE.getInterestKey_Unit();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestEntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestEntryImpl
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterestEntry()
		 * @generated
		 */
		EClass INTEREST_ENTRY = eINSTANCE.getInterestEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEREST_ENTRY__KEY = eINSTANCE.getInterestEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEREST_ENTRY__VALUE = eINSTANCE.getInterestEntry_Value();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestHostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestHostImpl
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterestHost()
		 * @generated
		 */
		EClass INTEREST_HOST = eINSTANCE.getInterestHost();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEREST_HOST__ENTRIES = eINSTANCE.getInterestHost_Entries();

		/**
		 * The meta object literal for the '<em>Interest</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.extension.Interest
		 * @see fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl#getInterest()
		 * @generated
		 */
		EDataType INTEREST = eINSTANCE.getInterest();

}

} //InterestPackage
