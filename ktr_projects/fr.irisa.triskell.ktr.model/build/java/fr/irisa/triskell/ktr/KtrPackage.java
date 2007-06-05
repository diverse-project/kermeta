/**
 * <copyright>
 * </copyright>
 *
 * $Id: KtrPackage.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

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
 * @see fr.irisa.triskell.ktr.KtrFactory
 * @model kind="package"
 *        annotation="kermeta.req platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km='platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km' http://www.eclipse.org/emf/2002/Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface KtrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ktr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/Ktr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ktr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KtrPackage eINSTANCE = fr.irisa.triskell.ktr.impl.KtrPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.ktr.impl.InterpretationPatternModelImpl <em>Interpretation Pattern Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.ktr.impl.InterpretationPatternModelImpl
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getInterpretationPatternModel()
	 * @generated
	 */
	int INTERPRETATION_PATTERN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_PATTERN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_PATTERN_MODEL__RULES = 1;

	/**
	 * The number of structural features of the '<em>Interpretation Pattern Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_PATTERN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl <em>Interpretation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.ktr.impl.InterpretationRuleImpl
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getInterpretationRule()
	 * @generated
	 */
	int INTERPRETATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Productions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE__PRODUCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE__VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Super Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE__SUPER_RULE = 4;

	/**
	 * The feature id for the '<em><b>Owning Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE__OWNING_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Interpretation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_RULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.ktr.impl.RuleVariableImpl <em>Rule Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.ktr.impl.RuleVariableImpl
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getRuleVariable()
	 * @generated
	 */
	int RULE_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Init Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE__INIT_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Var Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE__VAR_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Owning Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE__OWNING_RULE = 3;

	/**
	 * The number of structural features of the '<em>Rule Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.ktr.impl.RulePatternImpl <em>Rule Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.ktr.impl.RulePatternImpl
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getRulePattern()
	 * @generated
	 */
	int RULE_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN__SOURCE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN__SOURCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Owning Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN__OWNING_RULE = 4;

	/**
	 * The number of structural features of the '<em>Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl <em>Rule Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.ktr.impl.RuleProductionImpl
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getRuleProduction()
	 * @generated
	 */
	int RULE_PRODUCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PRODUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PRODUCTION__TARGET_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PRODUCTION__TARGET_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Init Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PRODUCTION__INIT_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Owning Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PRODUCTION__OWNING_RULE = 4;

	/**
	 * The number of structural features of the '<em>Rule Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PRODUCTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.ktr.impl.SingletonRuleProductionImpl <em>Singleton Rule Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.ktr.impl.SingletonRuleProductionImpl
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getSingletonRuleProduction()
	 * @generated
	 */
	int SINGLETON_RULE_PRODUCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION__NAME = RULE_PRODUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION__TARGET_ELEMENT = RULE_PRODUCTION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION__TARGET_MODEL = RULE_PRODUCTION__TARGET_MODEL;

	/**
	 * The feature id for the '<em><b>Init Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION__INIT_EXPR = RULE_PRODUCTION__INIT_EXPR;

	/**
	 * The feature id for the '<em><b>Owning Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION__OWNING_RULE = RULE_PRODUCTION__OWNING_RULE;

	/**
	 * The feature id for the '<em><b>Id Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION__ID_EXPR = RULE_PRODUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton Rule Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RULE_PRODUCTION_FEATURE_COUNT = RULE_PRODUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getString()
	 * @generated
	 */
	int STRING = 6;


	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.ktr.InterpretationPatternModel <em>Interpretation Pattern Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation Pattern Model</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationPatternModel
	 * @generated
	 */
	EClass getInterpretationPatternModel();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.InterpretationPatternModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationPatternModel#getName()
	 * @see #getInterpretationPatternModel()
	 * @generated
	 */
	EAttribute getInterpretationPatternModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.ktr.InterpretationPatternModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationPatternModel#getRules()
	 * @see #getInterpretationPatternModel()
	 * @generated
	 */
	EReference getInterpretationPatternModel_Rules();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.ktr.InterpretationRule <em>Interpretation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation Rule</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule
	 * @generated
	 */
	EClass getInterpretationRule();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.InterpretationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getName()
	 * @see #getInterpretationRule()
	 * @generated
	 */
	EAttribute getInterpretationRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.ktr.InterpretationRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getSource()
	 * @see #getInterpretationRule()
	 * @generated
	 */
	EReference getInterpretationRule_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.ktr.InterpretationRule#getProductions <em>Productions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productions</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getProductions()
	 * @see #getInterpretationRule()
	 * @generated
	 */
	EReference getInterpretationRule_Productions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.ktr.InterpretationRule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getVariables()
	 * @see #getInterpretationRule()
	 * @generated
	 */
	EReference getInterpretationRule_Variables();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.ktr.InterpretationRule#getSuperRule <em>Super Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Rule</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getSuperRule()
	 * @see #getInterpretationRule()
	 * @generated
	 */
	EReference getInterpretationRule_SuperRule();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.ktr.InterpretationRule#getOwningModel <em>Owning Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Model</em>'.
	 * @see fr.irisa.triskell.ktr.InterpretationRule#getOwningModel()
	 * @see #getInterpretationRule()
	 * @generated
	 */
	EReference getInterpretationRule_OwningModel();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.ktr.RuleVariable <em>Rule Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Variable</em>'.
	 * @see fr.irisa.triskell.ktr.RuleVariable
	 * @generated
	 */
	EClass getRuleVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RuleVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.ktr.RuleVariable#getName()
	 * @see #getRuleVariable()
	 * @generated
	 */
	EAttribute getRuleVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RuleVariable#getInitExpr <em>Init Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Expr</em>'.
	 * @see fr.irisa.triskell.ktr.RuleVariable#getInitExpr()
	 * @see #getRuleVariable()
	 * @generated
	 */
	EAttribute getRuleVariable_InitExpr();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.ktr.RuleVariable#getVarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var Type</em>'.
	 * @see fr.irisa.triskell.ktr.RuleVariable#getVarType()
	 * @see #getRuleVariable()
	 * @generated
	 */
	EReference getRuleVariable_VarType();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.ktr.RuleVariable#getOwningRule <em>Owning Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Rule</em>'.
	 * @see fr.irisa.triskell.ktr.RuleVariable#getOwningRule()
	 * @see #getRuleVariable()
	 * @generated
	 */
	EReference getRuleVariable_OwningRule();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.ktr.RulePattern <em>Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Pattern</em>'.
	 * @see fr.irisa.triskell.ktr.RulePattern
	 * @generated
	 */
	EClass getRulePattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RulePattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.ktr.RulePattern#getName()
	 * @see #getRulePattern()
	 * @generated
	 */
	EAttribute getRulePattern_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.ktr.RulePattern#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see fr.irisa.triskell.ktr.RulePattern#getSourceElement()
	 * @see #getRulePattern()
	 * @generated
	 */
	EReference getRulePattern_SourceElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RulePattern#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Model</em>'.
	 * @see fr.irisa.triskell.ktr.RulePattern#getSourceModel()
	 * @see #getRulePattern()
	 * @generated
	 */
	EAttribute getRulePattern_SourceModel();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RulePattern#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see fr.irisa.triskell.ktr.RulePattern#getCondition()
	 * @see #getRulePattern()
	 * @generated
	 */
	EAttribute getRulePattern_Condition();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.ktr.RulePattern#getOwningRule <em>Owning Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Rule</em>'.
	 * @see fr.irisa.triskell.ktr.RulePattern#getOwningRule()
	 * @see #getRulePattern()
	 * @generated
	 */
	EReference getRulePattern_OwningRule();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.ktr.RuleProduction <em>Rule Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Production</em>'.
	 * @see fr.irisa.triskell.ktr.RuleProduction
	 * @generated
	 */
	EClass getRuleProduction();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RuleProduction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.ktr.RuleProduction#getName()
	 * @see #getRuleProduction()
	 * @generated
	 */
	EAttribute getRuleProduction_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.ktr.RuleProduction#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Element</em>'.
	 * @see fr.irisa.triskell.ktr.RuleProduction#getTargetElement()
	 * @see #getRuleProduction()
	 * @generated
	 */
	EReference getRuleProduction_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RuleProduction#getTargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Model</em>'.
	 * @see fr.irisa.triskell.ktr.RuleProduction#getTargetModel()
	 * @see #getRuleProduction()
	 * @generated
	 */
	EAttribute getRuleProduction_TargetModel();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.RuleProduction#getInitExpr <em>Init Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Expr</em>'.
	 * @see fr.irisa.triskell.ktr.RuleProduction#getInitExpr()
	 * @see #getRuleProduction()
	 * @generated
	 */
	EAttribute getRuleProduction_InitExpr();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.ktr.RuleProduction#getOwningRule <em>Owning Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Rule</em>'.
	 * @see fr.irisa.triskell.ktr.RuleProduction#getOwningRule()
	 * @see #getRuleProduction()
	 * @generated
	 */
	EReference getRuleProduction_OwningRule();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.ktr.SingletonRuleProduction <em>Singleton Rule Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Rule Production</em>'.
	 * @see fr.irisa.triskell.ktr.SingletonRuleProduction
	 * @generated
	 */
	EClass getSingletonRuleProduction();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.ktr.SingletonRuleProduction#getIdExpr <em>Id Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Expr</em>'.
	 * @see fr.irisa.triskell.ktr.SingletonRuleProduction#getIdExpr()
	 * @see #getSingletonRuleProduction()
	 * @generated
	 */
	EAttribute getSingletonRuleProduction_IdExpr();

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
	KtrFactory getKtrFactory();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.ktr.impl.InterpretationPatternModelImpl <em>Interpretation Pattern Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.ktr.impl.InterpretationPatternModelImpl
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getInterpretationPatternModel()
		 * @generated
		 */
		EClass INTERPRETATION_PATTERN_MODEL = eINSTANCE.getInterpretationPatternModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETATION_PATTERN_MODEL__NAME = eINSTANCE.getInterpretationPatternModel_Name();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_PATTERN_MODEL__RULES = eINSTANCE.getInterpretationPatternModel_Rules();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.ktr.impl.InterpretationRuleImpl <em>Interpretation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.ktr.impl.InterpretationRuleImpl
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getInterpretationRule()
		 * @generated
		 */
		EClass INTERPRETATION_RULE = eINSTANCE.getInterpretationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETATION_RULE__NAME = eINSTANCE.getInterpretationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_RULE__SOURCE = eINSTANCE.getInterpretationRule_Source();

		/**
		 * The meta object literal for the '<em><b>Productions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_RULE__PRODUCTIONS = eINSTANCE.getInterpretationRule_Productions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_RULE__VARIABLES = eINSTANCE.getInterpretationRule_Variables();

		/**
		 * The meta object literal for the '<em><b>Super Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_RULE__SUPER_RULE = eINSTANCE.getInterpretationRule_SuperRule();

		/**
		 * The meta object literal for the '<em><b>Owning Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_RULE__OWNING_MODEL = eINSTANCE.getInterpretationRule_OwningModel();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.ktr.impl.RuleVariableImpl <em>Rule Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.ktr.impl.RuleVariableImpl
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getRuleVariable()
		 * @generated
		 */
		EClass RULE_VARIABLE = eINSTANCE.getRuleVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VARIABLE__NAME = eINSTANCE.getRuleVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Init Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VARIABLE__INIT_EXPR = eINSTANCE.getRuleVariable_InitExpr();

		/**
		 * The meta object literal for the '<em><b>Var Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_VARIABLE__VAR_TYPE = eINSTANCE.getRuleVariable_VarType();

		/**
		 * The meta object literal for the '<em><b>Owning Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_VARIABLE__OWNING_RULE = eINSTANCE.getRuleVariable_OwningRule();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.ktr.impl.RulePatternImpl <em>Rule Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.ktr.impl.RulePatternImpl
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getRulePattern()
		 * @generated
		 */
		EClass RULE_PATTERN = eINSTANCE.getRulePattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_PATTERN__NAME = eINSTANCE.getRulePattern_Name();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_PATTERN__SOURCE_ELEMENT = eINSTANCE.getRulePattern_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_PATTERN__SOURCE_MODEL = eINSTANCE.getRulePattern_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_PATTERN__CONDITION = eINSTANCE.getRulePattern_Condition();

		/**
		 * The meta object literal for the '<em><b>Owning Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_PATTERN__OWNING_RULE = eINSTANCE.getRulePattern_OwningRule();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.ktr.impl.RuleProductionImpl <em>Rule Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.ktr.impl.RuleProductionImpl
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getRuleProduction()
		 * @generated
		 */
		EClass RULE_PRODUCTION = eINSTANCE.getRuleProduction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_PRODUCTION__NAME = eINSTANCE.getRuleProduction_Name();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_PRODUCTION__TARGET_ELEMENT = eINSTANCE.getRuleProduction_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Target Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_PRODUCTION__TARGET_MODEL = eINSTANCE.getRuleProduction_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Init Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_PRODUCTION__INIT_EXPR = eINSTANCE.getRuleProduction_InitExpr();

		/**
		 * The meta object literal for the '<em><b>Owning Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_PRODUCTION__OWNING_RULE = eINSTANCE.getRuleProduction_OwningRule();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.ktr.impl.SingletonRuleProductionImpl <em>Singleton Rule Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.ktr.impl.SingletonRuleProductionImpl
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getSingletonRuleProduction()
		 * @generated
		 */
		EClass SINGLETON_RULE_PRODUCTION = eINSTANCE.getSingletonRuleProduction();

		/**
		 * The meta object literal for the '<em><b>Id Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLETON_RULE_PRODUCTION__ID_EXPR = eINSTANCE.getSingletonRuleProduction_IdExpr();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.irisa.triskell.ktr.impl.KtrPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //KtrPackage
