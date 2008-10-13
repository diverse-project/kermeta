/**
 * <copyright>
 * </copyright>
 *
 * $Id: OcomparePackage.java,v 1.1 2008-10-13 20:03:35 fmunoz Exp $
 */
package ocompare;

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
 * @see ocompare.OcompareFactory
 * @model kind="package"
 * @generated
 */
public interface OcomparePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ocompare";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/decompose/compare";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocompare";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcomparePackage eINSTANCE = ocompare.impl.OcomparePackageImpl.init();

	/**
	 * The meta object id for the '{@link ocompare.impl.CompareElementImpl <em>Compare Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocompare.impl.CompareElementImpl
	 * @see ocompare.impl.OcomparePackageImpl#getCompareElement()
	 * @generated
	 */
	int COMPARE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Original URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_ELEMENT__ORIGINAL_URI = 0;

	/**
	 * The feature id for the '<em><b>Result URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_ELEMENT__RESULT_URI = 1;

	/**
	 * The feature id for the '<em><b>Diff URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_ELEMENT__DIFF_URI = 2;

	/**
	 * The feature id for the '<em><b>Match URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_ELEMENT__MATCH_URI = 3;

	/**
	 * The number of structural features of the '<em>Compare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ocompare.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocompare.impl.CompareImpl
	 * @see ocompare.impl.OcomparePackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 1;

	/**
	 * The feature id for the '<em><b>To Compare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__TO_COMPARE = 0;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link ocompare.CompareElement <em>Compare Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Element</em>'.
	 * @see ocompare.CompareElement
	 * @generated
	 */
	EClass getCompareElement();

	/**
	 * Returns the meta object for the attribute '{@link ocompare.CompareElement#getOriginalURI <em>Original URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original URI</em>'.
	 * @see ocompare.CompareElement#getOriginalURI()
	 * @see #getCompareElement()
	 * @generated
	 */
	EAttribute getCompareElement_OriginalURI();

	/**
	 * Returns the meta object for the attribute '{@link ocompare.CompareElement#getResultURI <em>Result URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result URI</em>'.
	 * @see ocompare.CompareElement#getResultURI()
	 * @see #getCompareElement()
	 * @generated
	 */
	EAttribute getCompareElement_ResultURI();

	/**
	 * Returns the meta object for the attribute '{@link ocompare.CompareElement#getDiffURI <em>Diff URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff URI</em>'.
	 * @see ocompare.CompareElement#getDiffURI()
	 * @see #getCompareElement()
	 * @generated
	 */
	EAttribute getCompareElement_DiffURI();

	/**
	 * Returns the meta object for the attribute '{@link ocompare.CompareElement#getMatchURI <em>Match URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match URI</em>'.
	 * @see ocompare.CompareElement#getMatchURI()
	 * @see #getCompareElement()
	 * @generated
	 */
	EAttribute getCompareElement_MatchURI();

	/**
	 * Returns the meta object for class '{@link ocompare.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare</em>'.
	 * @see ocompare.Compare
	 * @generated
	 */
	EClass getCompare();

	/**
	 * Returns the meta object for the containment reference list '{@link ocompare.Compare#getToCompare <em>To Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Compare</em>'.
	 * @see ocompare.Compare#getToCompare()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_ToCompare();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OcompareFactory getOcompareFactory();

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
		 * The meta object literal for the '{@link ocompare.impl.CompareElementImpl <em>Compare Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocompare.impl.CompareElementImpl
		 * @see ocompare.impl.OcomparePackageImpl#getCompareElement()
		 * @generated
		 */
		EClass COMPARE_ELEMENT = eINSTANCE.getCompareElement();

		/**
		 * The meta object literal for the '<em><b>Original URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_ELEMENT__ORIGINAL_URI = eINSTANCE.getCompareElement_OriginalURI();

		/**
		 * The meta object literal for the '<em><b>Result URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_ELEMENT__RESULT_URI = eINSTANCE.getCompareElement_ResultURI();

		/**
		 * The meta object literal for the '<em><b>Diff URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_ELEMENT__DIFF_URI = eINSTANCE.getCompareElement_DiffURI();

		/**
		 * The meta object literal for the '<em><b>Match URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_ELEMENT__MATCH_URI = eINSTANCE.getCompareElement_MatchURI();

		/**
		 * The meta object literal for the '{@link ocompare.impl.CompareImpl <em>Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocompare.impl.CompareImpl
		 * @see ocompare.impl.OcomparePackageImpl#getCompare()
		 * @generated
		 */
		EClass COMPARE = eINSTANCE.getCompare();

		/**
		 * The meta object literal for the '<em><b>To Compare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__TO_COMPARE = eINSTANCE.getCompare_ToCompare();

	}

} //OcomparePackage
