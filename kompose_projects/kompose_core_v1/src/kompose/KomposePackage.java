/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see kompose.KomposeFactory
 * @model kind="package"
 * @generated
 */
public interface KomposePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kompose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kompose/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kompose";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KomposePackage eINSTANCE = kompose.impl.KomposePackageImpl.init();

	/**
	 * The meta object id for the '{@link kompose.impl.MatcherImpl <em>Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.MatcherImpl
	 * @see kompose.impl.KomposePackageImpl#getMatcher()
	 * @generated
	 */
	int MATCHER = 0;

	/**
	 * The number of structural features of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ContextImpl
	 * @see kompose.impl.KomposePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MODE = 0;

	/**
	 * The feature id for the '<em><b>Composed Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__COMPOSED_MODEL_URI = 1;

	/**
	 * The feature id for the '<em><b>Aspect Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ASPECT_MODEL_URI = 2;

	/**
	 * The feature id for the '<em><b>Primary Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PRIMARY_MODEL_URI = 3;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__METAMODEL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Predirectives PM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PREDIRECTIVES_PM = 5;

	/**
	 * The feature id for the '<em><b>Predirectives AM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PREDIRECTIVES_AM = 6;

	/**
	 * The feature id for the '<em><b>Postdirectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__POSTDIRECTIVES = 7;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link kompose.impl.MergerImpl <em>Merger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.MergerImpl
	 * @see kompose.impl.KomposePackageImpl#getMerger()
	 * @generated
	 */
	int MERGER = 2;

	/**
	 * The number of structural features of the '<em>Merger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ComposerImpl <em>Composer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ComposerImpl
	 * @see kompose.impl.KomposePackageImpl#getComposer()
	 * @generated
	 */
	int COMPOSER = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__ENGINE = 1;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__MERGER = 2;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER__MATCHER = 3;

	/**
	 * The number of structural features of the '<em>Composer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link kompose.impl.EngineImpl <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.EngineImpl
	 * @see kompose.impl.KomposePackageImpl#getEngine()
	 * @generated
	 */
	int ENGINE = 4;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.ConflictResolverImpl <em>Conflict Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.ConflictResolverImpl
	 * @see kompose.impl.KomposePackageImpl#getConflictResolver()
	 * @generated
	 */
	int CONFLICT_RESOLVER = 5;

	/**
	 * The number of structural features of the '<em>Conflict Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLVER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.SignatureImpl
	 * @see kompose.impl.KomposePackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 6;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.impl.MatchImpl
	 * @see kompose.impl.KomposePackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 7;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompose.Modes <em>Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompose.Modes
	 * @see kompose.impl.KomposePackageImpl#getModes()
	 * @generated
	 */
	int MODES = 8;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see kompose.impl.KomposePackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;


	/**
	 * Returns the meta object for class '{@link kompose.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher</em>'.
	 * @see kompose.Matcher
	 * @generated
	 */
	EClass getMatcher();

	/**
	 * Returns the meta object for class '{@link kompose.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see kompose.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Context#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kompose.Context#getMode()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Mode();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Context#getComposedModelURI <em>Composed Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composed Model URI</em>'.
	 * @see kompose.Context#getComposedModelURI()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_ComposedModelURI();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Context#getAspectModelURI <em>Aspect Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Model URI</em>'.
	 * @see kompose.Context#getAspectModelURI()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_AspectModelURI();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Context#getPrimaryModelURI <em>Primary Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Model URI</em>'.
	 * @see kompose.Context#getPrimaryModelURI()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_PrimaryModelURI();

	/**
	 * Returns the meta object for the attribute '{@link kompose.Context#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see kompose.Context#getMetamodelName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_MetamodelName();

	/**
	 * Returns the meta object for the containment reference list '{@link kompose.Context#getPostdirectives <em>Postdirectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postdirectives</em>'.
	 * @see kompose.Context#getPostdirectives()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Postdirectives();

	/**
	 * Returns the meta object for the containment reference list '{@link kompose.Context#getPredirectivesPM <em>Predirectives PM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predirectives PM</em>'.
	 * @see kompose.Context#getPredirectivesPM()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_PredirectivesPM();

	/**
	 * Returns the meta object for the containment reference list '{@link kompose.Context#getPredirectivesAM <em>Predirectives AM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predirectives AM</em>'.
	 * @see kompose.Context#getPredirectivesAM()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_PredirectivesAM();

	/**
	 * Returns the meta object for class '{@link kompose.Merger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merger</em>'.
	 * @see kompose.Merger
	 * @generated
	 */
	EClass getMerger();

	/**
	 * Returns the meta object for class '{@link kompose.Composer <em>Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composer</em>'.
	 * @see kompose.Composer
	 * @generated
	 */
	EClass getComposer();

	/**
	 * Returns the meta object for the reference '{@link kompose.Composer#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see kompose.Composer#getContext()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_Context();

	/**
	 * Returns the meta object for the reference '{@link kompose.Composer#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see kompose.Composer#getEngine()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_Engine();

	/**
	 * Returns the meta object for the reference '{@link kompose.Composer#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merger</em>'.
	 * @see kompose.Composer#getMerger()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_Merger();

	/**
	 * Returns the meta object for the reference '{@link kompose.Composer#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matcher</em>'.
	 * @see kompose.Composer#getMatcher()
	 * @see #getComposer()
	 * @generated
	 */
	EReference getComposer_Matcher();

	/**
	 * Returns the meta object for class '{@link kompose.Engine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see kompose.Engine
	 * @generated
	 */
	EClass getEngine();

	/**
	 * Returns the meta object for class '{@link kompose.ConflictResolver <em>Conflict Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Resolver</em>'.
	 * @see kompose.ConflictResolver
	 * @generated
	 */
	EClass getConflictResolver();

	/**
	 * Returns the meta object for class '{@link kompose.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see kompose.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for class '{@link kompose.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see kompose.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for enum '{@link kompose.Modes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modes</em>'.
	 * @see kompose.Modes
	 * @generated
	 */
	EEnum getModes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KomposeFactory getKomposeFactory();

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
		 * The meta object literal for the '{@link kompose.impl.MatcherImpl <em>Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.MatcherImpl
		 * @see kompose.impl.KomposePackageImpl#getMatcher()
		 * @generated
		 */
		EClass MATCHER = eINSTANCE.getMatcher();

		/**
		 * The meta object literal for the '{@link kompose.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ContextImpl
		 * @see kompose.impl.KomposePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__MODE = eINSTANCE.getContext_Mode();

		/**
		 * The meta object literal for the '<em><b>Composed Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__COMPOSED_MODEL_URI = eINSTANCE.getContext_ComposedModelURI();

		/**
		 * The meta object literal for the '<em><b>Aspect Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__ASPECT_MODEL_URI = eINSTANCE.getContext_AspectModelURI();

		/**
		 * The meta object literal for the '<em><b>Primary Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__PRIMARY_MODEL_URI = eINSTANCE.getContext_PrimaryModelURI();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__METAMODEL_NAME = eINSTANCE.getContext_MetamodelName();

		/**
		 * The meta object literal for the '<em><b>Postdirectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__POSTDIRECTIVES = eINSTANCE.getContext_Postdirectives();

		/**
		 * The meta object literal for the '<em><b>Predirectives PM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PREDIRECTIVES_PM = eINSTANCE.getContext_PredirectivesPM();

		/**
		 * The meta object literal for the '<em><b>Predirectives AM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PREDIRECTIVES_AM = eINSTANCE.getContext_PredirectivesAM();

		/**
		 * The meta object literal for the '{@link kompose.impl.MergerImpl <em>Merger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.MergerImpl
		 * @see kompose.impl.KomposePackageImpl#getMerger()
		 * @generated
		 */
		EClass MERGER = eINSTANCE.getMerger();

		/**
		 * The meta object literal for the '{@link kompose.impl.ComposerImpl <em>Composer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ComposerImpl
		 * @see kompose.impl.KomposePackageImpl#getComposer()
		 * @generated
		 */
		EClass COMPOSER = eINSTANCE.getComposer();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__CONTEXT = eINSTANCE.getComposer_Context();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__ENGINE = eINSTANCE.getComposer_Engine();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__MERGER = eINSTANCE.getComposer_Merger();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSER__MATCHER = eINSTANCE.getComposer_Matcher();

		/**
		 * The meta object literal for the '{@link kompose.impl.EngineImpl <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.EngineImpl
		 * @see kompose.impl.KomposePackageImpl#getEngine()
		 * @generated
		 */
		EClass ENGINE = eINSTANCE.getEngine();

		/**
		 * The meta object literal for the '{@link kompose.impl.ConflictResolverImpl <em>Conflict Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.ConflictResolverImpl
		 * @see kompose.impl.KomposePackageImpl#getConflictResolver()
		 * @generated
		 */
		EClass CONFLICT_RESOLVER = eINSTANCE.getConflictResolver();

		/**
		 * The meta object literal for the '{@link kompose.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.SignatureImpl
		 * @see kompose.impl.KomposePackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '{@link kompose.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.impl.MatchImpl
		 * @see kompose.impl.KomposePackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '{@link kompose.Modes <em>Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompose.Modes
		 * @see kompose.impl.KomposePackageImpl#getModes()
		 * @generated
		 */
		EEnum MODES = eINSTANCE.getModes();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see kompose.impl.KomposePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //KomposePackage
