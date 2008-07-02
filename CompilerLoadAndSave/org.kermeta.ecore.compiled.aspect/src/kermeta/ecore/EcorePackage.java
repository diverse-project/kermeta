/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcorePackage.java,v 1.1 2008-07-02 09:43:54 ftanguy Exp $
 */
package kermeta.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see kermeta.ecore.EcoreFactory
 * @model kind="package"
 *        annotation="kermeta documentation='/** \r\n * Contains the definition of a Kermeta classes used for compatibility with Ecore \r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/ecore_compatibility_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = kermeta.ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link kermeta.ecore.impl.EFeatureMapEntryImpl <em>EFeature Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.ecore.impl.EFeatureMapEntryImpl
	 * @see kermeta.ecore.impl.EcorePackageImpl#getEFeatureMapEntry()
	 * @generated
	 */
	int EFEATURE_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAP_ENTRY__VALUE = org.eclipse.emf.ecore.EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EStructural Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME = org.eclipse.emf.ecore.EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EFeature Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAP_ENTRY_FEATURE_COUNT = org.eclipse.emf.ecore.EcorePackage.EOBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link kermeta.ecore.EFeatureMapEntry <em>EFeature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFeature Map Entry</em>'.
	 * @see kermeta.ecore.EFeatureMapEntry
	 * @generated
	 */
	EClass getEFeatureMapEntry();

	/**
	 * Returns the meta object for the containment reference '{@link kermeta.ecore.EFeatureMapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see kermeta.ecore.EFeatureMapEntry#getValue()
	 * @see #getEFeatureMapEntry()
	 * @generated
	 */
	EReference getEFeatureMapEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.ecore.EFeatureMapEntry#getEStructuralFeatureName <em>EStructural Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EStructural Feature Name</em>'.
	 * @see kermeta.ecore.EFeatureMapEntry#getEStructuralFeatureName()
	 * @see #getEFeatureMapEntry()
	 * @generated
	 */
	EAttribute getEFeatureMapEntry_EStructuralFeatureName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link kermeta.ecore.impl.EFeatureMapEntryImpl <em>EFeature Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.ecore.impl.EFeatureMapEntryImpl
		 * @see kermeta.ecore.impl.EcorePackageImpl#getEFeatureMapEntry()
		 * @generated
		 */
		EClass EFEATURE_MAP_ENTRY = eINSTANCE.getEFeatureMapEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE_MAP_ENTRY__VALUE = eINSTANCE.getEFeatureMapEntry_Value();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME = eINSTANCE.getEFeatureMapEntry_EStructuralFeatureName();

	}

} //EcorePackage
