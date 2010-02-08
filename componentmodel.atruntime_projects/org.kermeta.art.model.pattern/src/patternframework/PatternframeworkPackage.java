/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework;

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
 * @see patternframework.PatternframeworkFactory
 * @model kind="package"
 * @generated
 */
public interface PatternframeworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patternframework";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/fr.irisa.triskell.kermeta.patternmatching/src/kermeta/pattern/metamodel/PatternFramework.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patternframework";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternframeworkPackage eINSTANCE = patternframework.impl.PatternframeworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link patternframework.impl.ModelPatternImpl <em>Model Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternframework.impl.ModelPatternImpl
	 * @see patternframework.impl.PatternframeworkPackageImpl#getModelPattern()
	 * @generated
	 */
	int MODEL_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PATTERN__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PATTERN__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Feature Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PATTERN__FEATURE_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Falsepositivepatterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PATTERN__FALSEPOSITIVEPATTERNS = 3;

	/**
	 * The number of structural features of the '<em>Model Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link patternframework.impl.PModelImpl <em>PModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternframework.impl.PModelImpl
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPModel()
	 * @generated
	 */
	int PMODEL = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMODEL__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMODEL__ROLES = 1;

	/**
	 * The number of structural features of the '<em>PModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link patternframework.impl.PObjectImpl <em>PObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternframework.impl.PObjectImpl
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPObject()
	 * @generated
	 */
	int POBJECT = 2;

	/**
	 * The number of structural features of the '<em>PObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link patternframework.impl.PConstraintImpl <em>PConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternframework.impl.PConstraintImpl
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPConstraint()
	 * @generated
	 */
	int PCONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>PConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link patternframework.impl.PRoleImpl <em>PRole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternframework.impl.PRoleImpl
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPRole()
	 * @generated
	 */
	int PROLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE__PLAYER = 1;

	/**
	 * The number of structural features of the '<em>PRole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link patternframework.PConstraintLanguage <em>PConstraint Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternframework.PConstraintLanguage
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPConstraintLanguage()
	 * @generated
	 */
	int PCONSTRAINT_LANGUAGE = 5;

	/**
	 * The meta object id for the '<em>PExpression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPExpression()
	 * @generated
	 */
	int PEXPRESSION = 6;

	/**
	 * The meta object id for the '<em>PLabel</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see patternframework.impl.PatternframeworkPackageImpl#getPLabel()
	 * @generated
	 */
	int PLABEL = 7;


	/**
	 * Returns the meta object for class '{@link patternframework.ModelPattern <em>Model Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Pattern</em>'.
	 * @see patternframework.ModelPattern
	 * @generated
	 */
	EClass getModelPattern();

	/**
	 * Returns the meta object for the containment reference '{@link patternframework.ModelPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see patternframework.ModelPattern#getPattern()
	 * @see #getModelPattern()
	 * @generated
	 */
	EReference getModelPattern_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link patternframework.ModelPattern#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see patternframework.ModelPattern#getConstraints()
	 * @see #getModelPattern()
	 * @generated
	 */
	EReference getModelPattern_Constraints();

	/**
	 * Returns the meta object for the attribute list '{@link patternframework.ModelPattern#getFeatureIdentifier <em>Feature Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Identifier</em>'.
	 * @see patternframework.ModelPattern#getFeatureIdentifier()
	 * @see #getModelPattern()
	 * @generated
	 */
	EAttribute getModelPattern_FeatureIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link patternframework.ModelPattern#getFalsepositivepatterns <em>Falsepositivepatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Falsepositivepatterns</em>'.
	 * @see patternframework.ModelPattern#getFalsepositivepatterns()
	 * @see #getModelPattern()
	 * @generated
	 */
	EReference getModelPattern_Falsepositivepatterns();

	/**
	 * Returns the meta object for class '{@link patternframework.PModel <em>PModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PModel</em>'.
	 * @see patternframework.PModel
	 * @generated
	 */
	EClass getPModel();

	/**
	 * Returns the meta object for the reference list '{@link patternframework.PModel#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content</em>'.
	 * @see patternframework.PModel#getContent()
	 * @see #getPModel()
	 * @generated
	 */
	EReference getPModel_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link patternframework.PModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see patternframework.PModel#getRoles()
	 * @see #getPModel()
	 * @generated
	 */
	EReference getPModel_Roles();

	/**
	 * Returns the meta object for class '{@link patternframework.PObject <em>PObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PObject</em>'.
	 * @see patternframework.PObject
	 * @generated
	 */
	EClass getPObject();

	/**
	 * Returns the meta object for class '{@link patternframework.PConstraint <em>PConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConstraint</em>'.
	 * @see patternframework.PConstraint
	 * @generated
	 */
	EClass getPConstraint();

	/**
	 * Returns the meta object for the attribute '{@link patternframework.PConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see patternframework.PConstraint#getExpression()
	 * @see #getPConstraint()
	 * @generated
	 */
	EAttribute getPConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link patternframework.PConstraint#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see patternframework.PConstraint#getLanguage()
	 * @see #getPConstraint()
	 * @generated
	 */
	EAttribute getPConstraint_Language();

	/**
	 * Returns the meta object for class '{@link patternframework.PRole <em>PRole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRole</em>'.
	 * @see patternframework.PRole
	 * @generated
	 */
	EClass getPRole();

	/**
	 * Returns the meta object for the attribute '{@link patternframework.PRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patternframework.PRole#getName()
	 * @see #getPRole()
	 * @generated
	 */
	EAttribute getPRole_Name();

	/**
	 * Returns the meta object for the reference '{@link patternframework.PRole#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see patternframework.PRole#getPlayer()
	 * @see #getPRole()
	 * @generated
	 */
	EReference getPRole_Player();

	/**
	 * Returns the meta object for enum '{@link patternframework.PConstraintLanguage <em>PConstraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PConstraint Language</em>'.
	 * @see patternframework.PConstraintLanguage
	 * @generated
	 */
	EEnum getPConstraintLanguage();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>PExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PExpression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getPExpression();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>PLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PLabel</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getPLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternframeworkFactory getPatternframeworkFactory();

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
		 * The meta object literal for the '{@link patternframework.impl.ModelPatternImpl <em>Model Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternframework.impl.ModelPatternImpl
		 * @see patternframework.impl.PatternframeworkPackageImpl#getModelPattern()
		 * @generated
		 */
		EClass MODEL_PATTERN = eINSTANCE.getModelPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PATTERN__PATTERN = eINSTANCE.getModelPattern_Pattern();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PATTERN__CONSTRAINTS = eINSTANCE.getModelPattern_Constraints();

		/**
		 * The meta object literal for the '<em><b>Feature Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PATTERN__FEATURE_IDENTIFIER = eINSTANCE.getModelPattern_FeatureIdentifier();

		/**
		 * The meta object literal for the '<em><b>Falsepositivepatterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PATTERN__FALSEPOSITIVEPATTERNS = eINSTANCE.getModelPattern_Falsepositivepatterns();

		/**
		 * The meta object literal for the '{@link patternframework.impl.PModelImpl <em>PModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternframework.impl.PModelImpl
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPModel()
		 * @generated
		 */
		EClass PMODEL = eINSTANCE.getPModel();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMODEL__CONTENT = eINSTANCE.getPModel_Content();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMODEL__ROLES = eINSTANCE.getPModel_Roles();

		/**
		 * The meta object literal for the '{@link patternframework.impl.PObjectImpl <em>PObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternframework.impl.PObjectImpl
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPObject()
		 * @generated
		 */
		EClass POBJECT = eINSTANCE.getPObject();

		/**
		 * The meta object literal for the '{@link patternframework.impl.PConstraintImpl <em>PConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternframework.impl.PConstraintImpl
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPConstraint()
		 * @generated
		 */
		EClass PCONSTRAINT = eINSTANCE.getPConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCONSTRAINT__EXPRESSION = eINSTANCE.getPConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCONSTRAINT__LANGUAGE = eINSTANCE.getPConstraint_Language();

		/**
		 * The meta object literal for the '{@link patternframework.impl.PRoleImpl <em>PRole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternframework.impl.PRoleImpl
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPRole()
		 * @generated
		 */
		EClass PROLE = eINSTANCE.getPRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROLE__NAME = eINSTANCE.getPRole_Name();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROLE__PLAYER = eINSTANCE.getPRole_Player();

		/**
		 * The meta object literal for the '{@link patternframework.PConstraintLanguage <em>PConstraint Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternframework.PConstraintLanguage
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPConstraintLanguage()
		 * @generated
		 */
		EEnum PCONSTRAINT_LANGUAGE = eINSTANCE.getPConstraintLanguage();

		/**
		 * The meta object literal for the '<em>PExpression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPExpression()
		 * @generated
		 */
		EDataType PEXPRESSION = eINSTANCE.getPExpression();

		/**
		 * The meta object literal for the '<em>PLabel</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see patternframework.impl.PatternframeworkPackageImpl#getPLabel()
		 * @generated
		 */
		EDataType PLABEL = eINSTANCE.getPLabel();

	}

} //PatternframeworkPackage
