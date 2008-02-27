/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoaderPackage.java,v 1.3 2008-02-27 15:21:09 dvojtise Exp $
 */
package org.kermeta.io.loader;

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
 * @see org.kermeta.io.loader.LoaderFactory
 * @model kind="package"
 * @generated
 */
public interface LoaderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "loader";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/Loader";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "loader";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoaderPackage eINSTANCE = org.kermeta.io.loader.impl.LoaderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.AbstractStepImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getAbstractStep()
	 * @generated
	 */
	int ABSTRACT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__CURRENT_STEP = 1;

	/**
	 * The number of structural features of the '<em>Abstract Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.LoadingStepImpl <em>Loading Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.LoadingStepImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getLoadingStep()
	 * @generated
	 */
	int LOADING_STEP = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__STEPS = ABSTRACT_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__CURRENT_STEP = ABSTRACT_STEP__CURRENT_STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__NAME = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__DONE = ABSTRACT_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__ACTION = ABSTRACT_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Propagate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__PROPAGATE = ABSTRACT_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Perform Action If Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP__PERFORM_ACTION_IF_ERROR = ABSTRACT_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Loading Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.LoaderImpl <em>Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.LoaderImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getLoader()
	 * @generated
	 */
	int LOADER = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__STEPS = ABSTRACT_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__CURRENT_STEP = ABSTRACT_STEP__CURRENT_STEP;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__DATAS = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__URI = ABSTRACT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.KMTLoaderImpl <em>KMT Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.KMTLoaderImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getKMTLoader()
	 * @generated
	 */
	int KMT_LOADER = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMT_LOADER__STEPS = LOADER__STEPS;

	/**
	 * The feature id for the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMT_LOADER__CURRENT_STEP = LOADER__CURRENT_STEP;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMT_LOADER__DATAS = LOADER__DATAS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMT_LOADER__URI = LOADER__URI;

	/**
	 * The number of structural features of the '<em>KMT Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMT_LOADER_FEATURE_COUNT = LOADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.EcoreLoaderImpl <em>Ecore Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.EcoreLoaderImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getEcoreLoader()
	 * @generated
	 */
	int ECORE_LOADER = 3;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_LOADER__STEPS = LOADER__STEPS;

	/**
	 * The feature id for the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_LOADER__CURRENT_STEP = LOADER__CURRENT_STEP;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_LOADER__DATAS = LOADER__DATAS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_LOADER__URI = LOADER__URI;

	/**
	 * The number of structural features of the '<em>Ecore Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_LOADER_FEATURE_COUNT = LOADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.KMLoaderImpl <em>KM Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.KMLoaderImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getKMLoader()
	 * @generated
	 */
	int KM_LOADER = 4;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_LOADER__STEPS = LOADER__STEPS;

	/**
	 * The feature id for the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_LOADER__CURRENT_STEP = LOADER__CURRENT_STEP;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_LOADER__DATAS = LOADER__DATAS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_LOADER__URI = LOADER__URI;

	/**
	 * The number of structural features of the '<em>KM Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_LOADER_FEATURE_COUNT = LOADER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.LoadingContextImpl <em>Loading Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.LoadingContextImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getLoadingContext()
	 * @generated
	 */
	int LOADING_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Loaders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_CONTEXT__LOADERS = 0;

	/**
	 * The number of structural features of the '<em>Loading Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADING_CONTEXT_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.ILoadingDatas <em>ILoading Datas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.ILoadingDatas
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getILoadingDatas()
	 * @generated
	 */
	int ILOADING_DATAS = 6;

	/**
	 * The feature id for the '<em><b>Kermeta Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILOADING_DATAS__KERMETA_UNIT = 0;

	/**
	 * The number of structural features of the '<em>ILoading Datas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILOADING_DATAS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.kermeta.io.loader.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.loader.impl.ActionImpl
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getURI()
	 * @generated
	 */
	int URI = 9;


	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.LoadingStep <em>Loading Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loading Step</em>'.
	 * @see org.kermeta.io.loader.LoadingStep
	 * @generated
	 */
	EClass getLoadingStep();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.loader.LoadingStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.io.loader.LoadingStep#getName()
	 * @see #getLoadingStep()
	 * @generated
	 */
	EAttribute getLoadingStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.loader.LoadingStep#isDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see org.kermeta.io.loader.LoadingStep#isDone()
	 * @see #getLoadingStep()
	 * @generated
	 */
	EAttribute getLoadingStep_Done();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.io.loader.LoadingStep#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.kermeta.io.loader.LoadingStep#getAction()
	 * @see #getLoadingStep()
	 * @generated
	 */
	EReference getLoadingStep_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.loader.LoadingStep#isPropagate <em>Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagate</em>'.
	 * @see org.kermeta.io.loader.LoadingStep#isPropagate()
	 * @see #getLoadingStep()
	 * @generated
	 */
	EAttribute getLoadingStep_Propagate();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.loader.LoadingStep#isPerformActionIfError <em>Perform Action If Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perform Action If Error</em>'.
	 * @see org.kermeta.io.loader.LoadingStep#isPerformActionIfError()
	 * @see #getLoadingStep()
	 * @generated
	 */
	EAttribute getLoadingStep_PerformActionIfError();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loader</em>'.
	 * @see org.kermeta.io.loader.Loader
	 * @generated
	 */
	EClass getLoader();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.io.loader.Loader#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datas</em>'.
	 * @see org.kermeta.io.loader.Loader#getDatas()
	 * @see #getLoader()
	 * @generated
	 */
	EReference getLoader_Datas();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.loader.Loader#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.kermeta.io.loader.Loader#getUri()
	 * @see #getLoader()
	 * @generated
	 */
	EAttribute getLoader_Uri();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.KMTLoader <em>KMT Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KMT Loader</em>'.
	 * @see org.kermeta.io.loader.KMTLoader
	 * @generated
	 */
	EClass getKMTLoader();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.EcoreLoader <em>Ecore Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Loader</em>'.
	 * @see org.kermeta.io.loader.EcoreLoader
	 * @generated
	 */
	EClass getEcoreLoader();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.KMLoader <em>KM Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KM Loader</em>'.
	 * @see org.kermeta.io.loader.KMLoader
	 * @generated
	 */
	EClass getKMLoader();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.LoadingContext <em>Loading Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loading Context</em>'.
	 * @see org.kermeta.io.loader.LoadingContext
	 * @generated
	 */
	EClass getLoadingContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.io.loader.LoadingContext#getLoaders <em>Loaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loaders</em>'.
	 * @see org.kermeta.io.loader.LoadingContext#getLoaders()
	 * @see #getLoadingContext()
	 * @generated
	 */
	EReference getLoadingContext_Loaders();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.ILoadingDatas <em>ILoading Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILoading Datas</em>'.
	 * @see org.kermeta.io.loader.ILoadingDatas
	 * @generated
	 */
	EClass getILoadingDatas();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.io.loader.ILoadingDatas#getKermetaUnit <em>Kermeta Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kermeta Unit</em>'.
	 * @see org.kermeta.io.loader.ILoadingDatas#getKermetaUnit()
	 * @see #getILoadingDatas()
	 * @generated
	 */
	EReference getILoadingDatas_KermetaUnit();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.AbstractStep <em>Abstract Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Step</em>'.
	 * @see org.kermeta.io.loader.AbstractStep
	 * @generated
	 */
	EClass getAbstractStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.io.loader.AbstractStep#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.kermeta.io.loader.AbstractStep#getSteps()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_Steps();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.io.loader.AbstractStep#getCurrentStep <em>Current Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Step</em>'.
	 * @see org.kermeta.io.loader.AbstractStep#getCurrentStep()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_CurrentStep();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.loader.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.kermeta.io.loader.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.loader.Action#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.kermeta.io.loader.Action#getClass_()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Class();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoaderFactory getLoaderFactory();

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
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.LoadingStepImpl <em>Loading Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.LoadingStepImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getLoadingStep()
		 * @generated
		 */
		EClass LOADING_STEP = eINSTANCE.getLoadingStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADING_STEP__NAME = eINSTANCE.getLoadingStep_Name();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADING_STEP__DONE = eINSTANCE.getLoadingStep_Done();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADING_STEP__ACTION = eINSTANCE.getLoadingStep_Action();

		/**
		 * The meta object literal for the '<em><b>Propagate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADING_STEP__PROPAGATE = eINSTANCE.getLoadingStep_Propagate();

		/**
		 * The meta object literal for the '<em><b>Perform Action If Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADING_STEP__PERFORM_ACTION_IF_ERROR = eINSTANCE.getLoadingStep_PerformActionIfError();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.LoaderImpl <em>Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.LoaderImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getLoader()
		 * @generated
		 */
		EClass LOADER = eINSTANCE.getLoader();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADER__DATAS = eINSTANCE.getLoader_Datas();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADER__URI = eINSTANCE.getLoader_Uri();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.KMTLoaderImpl <em>KMT Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.KMTLoaderImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getKMTLoader()
		 * @generated
		 */
		EClass KMT_LOADER = eINSTANCE.getKMTLoader();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.EcoreLoaderImpl <em>Ecore Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.EcoreLoaderImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getEcoreLoader()
		 * @generated
		 */
		EClass ECORE_LOADER = eINSTANCE.getEcoreLoader();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.KMLoaderImpl <em>KM Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.KMLoaderImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getKMLoader()
		 * @generated
		 */
		EClass KM_LOADER = eINSTANCE.getKMLoader();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.LoadingContextImpl <em>Loading Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.LoadingContextImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getLoadingContext()
		 * @generated
		 */
		EClass LOADING_CONTEXT = eINSTANCE.getLoadingContext();

		/**
		 * The meta object literal for the '<em><b>Loaders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADING_CONTEXT__LOADERS = eINSTANCE.getLoadingContext_Loaders();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.ILoadingDatas <em>ILoading Datas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.ILoadingDatas
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getILoadingDatas()
		 * @generated
		 */
		EClass ILOADING_DATAS = eINSTANCE.getILoadingDatas();

		/**
		 * The meta object literal for the '<em><b>Kermeta Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ILOADING_DATAS__KERMETA_UNIT = eINSTANCE.getILoadingDatas_KermetaUnit();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.AbstractStepImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getAbstractStep()
		 * @generated
		 */
		EClass ABSTRACT_STEP = eINSTANCE.getAbstractStep();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__STEPS = eINSTANCE.getAbstractStep_Steps();

		/**
		 * The meta object literal for the '<em><b>Current Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__CURRENT_STEP = eINSTANCE.getAbstractStep_CurrentStep();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.loader.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.loader.impl.ActionImpl
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CLASS = eINSTANCE.getAction_Class();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.kermeta.io.loader.impl.LoaderPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //LoaderPackage
