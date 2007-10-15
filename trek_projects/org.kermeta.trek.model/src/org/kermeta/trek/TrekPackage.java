/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekPackage.java,v 1.1 2007-10-15 16:54:07 fmunoz Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.kermeta.trek.TrekFactory
 * @model kind="package"
 * @generated
 */
public interface TrekPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trek";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "trek";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trek";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrekPackage eINSTANCE = org.kermeta.trek.impl.TrekPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.trek.impl.UseKaseModelImpl <em>Use Kase Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.trek.impl.UseKaseModelImpl
	 * @see org.kermeta.trek.impl.TrekPackageImpl#getUseKaseModel()
	 * @generated
	 */
	int USE_KASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Kuse Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KASE_MODEL__KUSE_CASES = 0;

	/**
	 * The feature id for the '<em><b>Ktest Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KASE_MODEL__KTEST_CASES = 1;

	/**
	 * The feature id for the '<em><b>Ktags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KASE_MODEL__KTAGS = 2;

	/**
	 * The feature id for the '<em><b>Kuser Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KASE_MODEL__KUSER_STORIES = 3;

	/**
	 * The number of structural features of the '<em>Use Kase Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_KASE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.trek.impl.KUseCaseImpl <em>KUse Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.trek.impl.KUseCaseImpl
	 * @see org.kermeta.trek.impl.TrekPackageImpl#getKUseCase()
	 * @generated
	 */
	int KUSE_CASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__ID = 1;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__SHORT_SUMMARY = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__USE = 4;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__USED_BY = 5;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__VERIFIED_BY = 6;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__REFINES = 7;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__REFINED_BY = 8;

	/**
	 * The feature id for the '<em><b>Covers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__COVERS = 9;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE__TAGS = 11;

	/**
	 * The number of structural features of the '<em>KUse Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSE_CASE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.kermeta.trek.impl.KTestCaseImpl <em>KTest Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.trek.impl.KTestCaseImpl
	 * @see org.kermeta.trek.impl.TrekPackageImpl#getKTestCase()
	 * @generated
	 */
	int KTEST_CASE = 2;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTEST_CASE__VERIFIES = 0;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTEST_CASE__TEST_CASE = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTEST_CASE__FILE = 2;

	/**
	 * The number of structural features of the '<em>KTest Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTEST_CASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.trek.impl.KUserStoryImpl <em>KUser Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.trek.impl.KUserStoryImpl
	 * @see org.kermeta.trek.impl.TrekPackageImpl#getKUserStory()
	 * @generated
	 */
	int KUSER_STORY = 3;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSER_STORY__COVERED_BY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSER_STORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSER_STORY__ID = 2;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSER_STORY__SUMMARY = 3;

	/**
	 * The feature id for the '<em><b>Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSER_STORY__SHORT_SUMMARY = 4;

	/**
	 * The number of structural features of the '<em>KUser Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUSER_STORY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.kermeta.trek.impl.KTagElementImpl <em>KTag Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.trek.impl.KTagElementImpl
	 * @see org.kermeta.trek.impl.TrekPackageImpl#getKTagElement()
	 * @generated
	 */
	int KTAG_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTAG_ELEMENT__CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTAG_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>KTag Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTAG_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.trek.KUseLevel <em>KUse Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.trek.KUseLevel
	 * @see org.kermeta.trek.impl.TrekPackageImpl#getKUseLevel()
	 * @generated
	 */
	int KUSE_LEVEL = 5;


	/**
	 * Returns the meta object for class '{@link org.kermeta.trek.UseKaseModel <em>Use Kase Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Kase Model</em>'.
	 * @see org.kermeta.trek.UseKaseModel
	 * @generated
	 */
	EClass getUseKaseModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.trek.UseKaseModel#getKuseCases <em>Kuse Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kuse Cases</em>'.
	 * @see org.kermeta.trek.UseKaseModel#getKuseCases()
	 * @see #getUseKaseModel()
	 * @generated
	 */
	EReference getUseKaseModel_KuseCases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.trek.UseKaseModel#getKtestCases <em>Ktest Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ktest Cases</em>'.
	 * @see org.kermeta.trek.UseKaseModel#getKtestCases()
	 * @see #getUseKaseModel()
	 * @generated
	 */
	EReference getUseKaseModel_KtestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.trek.UseKaseModel#getKtags <em>Ktags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ktags</em>'.
	 * @see org.kermeta.trek.UseKaseModel#getKtags()
	 * @see #getUseKaseModel()
	 * @generated
	 */
	EReference getUseKaseModel_Ktags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.trek.UseKaseModel#getKuserStories <em>Kuser Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kuser Stories</em>'.
	 * @see org.kermeta.trek.UseKaseModel#getKuserStories()
	 * @see #getUseKaseModel()
	 * @generated
	 */
	EReference getUseKaseModel_KuserStories();

	/**
	 * Returns the meta object for class '{@link org.kermeta.trek.KUseCase <em>KUse Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KUse Case</em>'.
	 * @see org.kermeta.trek.KUseCase
	 * @generated
	 */
	EClass getKUseCase();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUseCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.trek.KUseCase#getName()
	 * @see #getKUseCase()
	 * @generated
	 */
	EAttribute getKUseCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUseCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.trek.KUseCase#getId()
	 * @see #getKUseCase()
	 * @generated
	 */
	EAttribute getKUseCase_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUseCase#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.kermeta.trek.KUseCase#getSummary()
	 * @see #getKUseCase()
	 * @generated
	 */
	EAttribute getKUseCase_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUseCase#getShortSummary <em>Short Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Summary</em>'.
	 * @see org.kermeta.trek.KUseCase#getShortSummary()
	 * @see #getKUseCase()
	 * @generated
	 */
	EAttribute getKUseCase_ShortSummary();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUseCase#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see org.kermeta.trek.KUseCase#getUse()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_Use();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUseCase#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By</em>'.
	 * @see org.kermeta.trek.KUseCase#getUsedBy()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_UsedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUseCase#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By</em>'.
	 * @see org.kermeta.trek.KUseCase#getVerifiedBy()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_VerifiedBy();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.trek.KUseCase#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see org.kermeta.trek.KUseCase#getRefines()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_Refines();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUseCase#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined By</em>'.
	 * @see org.kermeta.trek.KUseCase#getRefinedBy()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_RefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUseCase#getCovers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covers</em>'.
	 * @see org.kermeta.trek.KUseCase#getCovers()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_Covers();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUseCase#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.kermeta.trek.KUseCase#getLevel()
	 * @see #getKUseCase()
	 * @generated
	 */
	EAttribute getKUseCase_Level();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUseCase#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.kermeta.trek.KUseCase#getTags()
	 * @see #getKUseCase()
	 * @generated
	 */
	EReference getKUseCase_Tags();

	/**
	 * Returns the meta object for class '{@link org.kermeta.trek.KTestCase <em>KTest Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KTest Case</em>'.
	 * @see org.kermeta.trek.KTestCase
	 * @generated
	 */
	EClass getKTestCase();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.trek.KTestCase#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verifies</em>'.
	 * @see org.kermeta.trek.KTestCase#getVerifies()
	 * @see #getKTestCase()
	 * @generated
	 */
	EReference getKTestCase_Verifies();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KTestCase#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Case</em>'.
	 * @see org.kermeta.trek.KTestCase#getTestCase()
	 * @see #getKTestCase()
	 * @generated
	 */
	EAttribute getKTestCase_TestCase();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KTestCase#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.kermeta.trek.KTestCase#getFile()
	 * @see #getKTestCase()
	 * @generated
	 */
	EAttribute getKTestCase_File();

	/**
	 * Returns the meta object for class '{@link org.kermeta.trek.KUserStory <em>KUser Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KUser Story</em>'.
	 * @see org.kermeta.trek.KUserStory
	 * @generated
	 */
	EClass getKUserStory();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.trek.KUserStory#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered By</em>'.
	 * @see org.kermeta.trek.KUserStory#getCoveredBy()
	 * @see #getKUserStory()
	 * @generated
	 */
	EReference getKUserStory_CoveredBy();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUserStory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.trek.KUserStory#getName()
	 * @see #getKUserStory()
	 * @generated
	 */
	EAttribute getKUserStory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUserStory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.trek.KUserStory#getId()
	 * @see #getKUserStory()
	 * @generated
	 */
	EAttribute getKUserStory_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUserStory#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.kermeta.trek.KUserStory#getSummary()
	 * @see #getKUserStory()
	 * @generated
	 */
	EAttribute getKUserStory_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KUserStory#getShortSummary <em>Short Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Summary</em>'.
	 * @see org.kermeta.trek.KUserStory#getShortSummary()
	 * @see #getKUserStory()
	 * @generated
	 */
	EAttribute getKUserStory_ShortSummary();

	/**
	 * Returns the meta object for class '{@link org.kermeta.trek.KTagElement <em>KTag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KTag Element</em>'.
	 * @see org.kermeta.trek.KTagElement
	 * @generated
	 */
	EClass getKTagElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KTagElement#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept</em>'.
	 * @see org.kermeta.trek.KTagElement#getConcept()
	 * @see #getKTagElement()
	 * @generated
	 */
	EAttribute getKTagElement_Concept();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.trek.KTagElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.trek.KTagElement#getName()
	 * @see #getKTagElement()
	 * @generated
	 */
	EAttribute getKTagElement_Name();

	/**
	 * Returns the meta object for enum '{@link org.kermeta.trek.KUseLevel <em>KUse Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KUse Level</em>'.
	 * @see org.kermeta.trek.KUseLevel
	 * @generated
	 */
	EEnum getKUseLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrekFactory getTrekFactory();

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
		 * The meta object literal for the '{@link org.kermeta.trek.impl.UseKaseModelImpl <em>Use Kase Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.trek.impl.UseKaseModelImpl
		 * @see org.kermeta.trek.impl.TrekPackageImpl#getUseKaseModel()
		 * @generated
		 */
		EClass USE_KASE_MODEL = eINSTANCE.getUseKaseModel();

		/**
		 * The meta object literal for the '<em><b>Kuse Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_KASE_MODEL__KUSE_CASES = eINSTANCE.getUseKaseModel_KuseCases();

		/**
		 * The meta object literal for the '<em><b>Ktest Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_KASE_MODEL__KTEST_CASES = eINSTANCE.getUseKaseModel_KtestCases();

		/**
		 * The meta object literal for the '<em><b>Ktags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_KASE_MODEL__KTAGS = eINSTANCE.getUseKaseModel_Ktags();

		/**
		 * The meta object literal for the '<em><b>Kuser Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_KASE_MODEL__KUSER_STORIES = eINSTANCE.getUseKaseModel_KuserStories();

		/**
		 * The meta object literal for the '{@link org.kermeta.trek.impl.KUseCaseImpl <em>KUse Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.trek.impl.KUseCaseImpl
		 * @see org.kermeta.trek.impl.TrekPackageImpl#getKUseCase()
		 * @generated
		 */
		EClass KUSE_CASE = eINSTANCE.getKUseCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSE_CASE__NAME = eINSTANCE.getKUseCase_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSE_CASE__ID = eINSTANCE.getKUseCase_Id();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSE_CASE__SUMMARY = eINSTANCE.getKUseCase_Summary();

		/**
		 * The meta object literal for the '<em><b>Short Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSE_CASE__SHORT_SUMMARY = eINSTANCE.getKUseCase_ShortSummary();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__USE = eINSTANCE.getKUseCase_Use();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__USED_BY = eINSTANCE.getKUseCase_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Verified By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__VERIFIED_BY = eINSTANCE.getKUseCase_VerifiedBy();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__REFINES = eINSTANCE.getKUseCase_Refines();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__REFINED_BY = eINSTANCE.getKUseCase_RefinedBy();

		/**
		 * The meta object literal for the '<em><b>Covers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__COVERS = eINSTANCE.getKUseCase_Covers();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSE_CASE__LEVEL = eINSTANCE.getKUseCase_Level();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSE_CASE__TAGS = eINSTANCE.getKUseCase_Tags();

		/**
		 * The meta object literal for the '{@link org.kermeta.trek.impl.KTestCaseImpl <em>KTest Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.trek.impl.KTestCaseImpl
		 * @see org.kermeta.trek.impl.TrekPackageImpl#getKTestCase()
		 * @generated
		 */
		EClass KTEST_CASE = eINSTANCE.getKTestCase();

		/**
		 * The meta object literal for the '<em><b>Verifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KTEST_CASE__VERIFIES = eINSTANCE.getKTestCase_Verifies();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KTEST_CASE__TEST_CASE = eINSTANCE.getKTestCase_TestCase();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KTEST_CASE__FILE = eINSTANCE.getKTestCase_File();

		/**
		 * The meta object literal for the '{@link org.kermeta.trek.impl.KUserStoryImpl <em>KUser Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.trek.impl.KUserStoryImpl
		 * @see org.kermeta.trek.impl.TrekPackageImpl#getKUserStory()
		 * @generated
		 */
		EClass KUSER_STORY = eINSTANCE.getKUserStory();

		/**
		 * The meta object literal for the '<em><b>Covered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUSER_STORY__COVERED_BY = eINSTANCE.getKUserStory_CoveredBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSER_STORY__NAME = eINSTANCE.getKUserStory_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSER_STORY__ID = eINSTANCE.getKUserStory_Id();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSER_STORY__SUMMARY = eINSTANCE.getKUserStory_Summary();

		/**
		 * The meta object literal for the '<em><b>Short Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUSER_STORY__SHORT_SUMMARY = eINSTANCE.getKUserStory_ShortSummary();

		/**
		 * The meta object literal for the '{@link org.kermeta.trek.impl.KTagElementImpl <em>KTag Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.trek.impl.KTagElementImpl
		 * @see org.kermeta.trek.impl.TrekPackageImpl#getKTagElement()
		 * @generated
		 */
		EClass KTAG_ELEMENT = eINSTANCE.getKTagElement();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KTAG_ELEMENT__CONCEPT = eINSTANCE.getKTagElement_Concept();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KTAG_ELEMENT__NAME = eINSTANCE.getKTagElement_Name();

		/**
		 * The meta object literal for the '{@link org.kermeta.trek.KUseLevel <em>KUse Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.trek.KUseLevel
		 * @see org.kermeta.trek.impl.TrekPackageImpl#getKUseLevel()
		 * @generated
		 */
		EEnum KUSE_LEVEL = eINSTANCE.getKUseLevel();

	}

} //TrekPackage
