/**
 * <copyright>
 * </copyright>
 *
 * $Id: KtrPackageImpl.java,v 1.2 2007-07-31 13:19:20 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.InterpretationPatternModel;
import fr.irisa.triskell.ktr.InterpretationRule;
import fr.irisa.triskell.ktr.KtrFactory;
import fr.irisa.triskell.ktr.KtrPackage;
import fr.irisa.triskell.ktr.RulePattern;
import fr.irisa.triskell.ktr.RuleProduction;
import fr.irisa.triskell.ktr.RuleVariable;
import fr.irisa.triskell.ktr.SingletonRuleProduction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KtrPackageImpl extends EPackageImpl implements KtrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpretationPatternModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpretationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleProductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonRuleProductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.irisa.triskell.ktr.KtrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KtrPackageImpl() {
		super(eNS_URI, KtrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KtrPackage init() {
		if (isInited) return (KtrPackage)EPackage.Registry.INSTANCE.getEPackage(KtrPackage.eNS_URI);

		// Obtain or create and register package
		KtrPackageImpl theKtrPackage = (KtrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof KtrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new KtrPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKtrPackage.createPackageContents();

		// Initialize created meta-data
		theKtrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKtrPackage.freeze();

		return theKtrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpretationPatternModel() {
		return interpretationPatternModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpretationPatternModel_Name() {
		return (EAttribute)interpretationPatternModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretationPatternModel_Rules() {
		return (EReference)interpretationPatternModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpretationRule() {
		return interpretationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpretationRule_Name() {
		return (EAttribute)interpretationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretationRule_Source() {
		return (EReference)interpretationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretationRule_Productions() {
		return (EReference)interpretationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretationRule_Variables() {
		return (EReference)interpretationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretationRule_SuperRule() {
		return (EReference)interpretationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretationRule_OwningModel() {
		return (EReference)interpretationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleVariable() {
		return ruleVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVariable_Name() {
		return (EAttribute)ruleVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVariable_InitExpr() {
		return (EAttribute)ruleVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariable_VarType() {
		return (EReference)ruleVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariable_OwningRule() {
		return (EReference)ruleVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulePattern() {
		return rulePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulePattern_Name() {
		return (EAttribute)rulePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRulePattern_SourceElement() {
		return (EReference)rulePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulePattern_SourceModel() {
		return (EAttribute)rulePatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulePattern_Condition() {
		return (EAttribute)rulePatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRulePattern_OwningRule() {
		return (EReference)rulePatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleProduction() {
		return ruleProductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleProduction_Name() {
		return (EAttribute)ruleProductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleProduction_TargetElement() {
		return (EReference)ruleProductionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleProduction_TargetModel() {
		return (EAttribute)ruleProductionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleProduction_InitExpr() {
		return (EAttribute)ruleProductionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleProduction_OwningRule() {
		return (EReference)ruleProductionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonRuleProduction() {
		return singletonRuleProductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonRuleProduction_IdExpr() {
		return (EAttribute)singletonRuleProductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtrFactory getKtrFactory() {
		return (KtrFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interpretationPatternModelEClass = createEClass(INTERPRETATION_PATTERN_MODEL);
		createEAttribute(interpretationPatternModelEClass, INTERPRETATION_PATTERN_MODEL__NAME);
		createEReference(interpretationPatternModelEClass, INTERPRETATION_PATTERN_MODEL__RULES);

		interpretationRuleEClass = createEClass(INTERPRETATION_RULE);
		createEAttribute(interpretationRuleEClass, INTERPRETATION_RULE__NAME);
		createEReference(interpretationRuleEClass, INTERPRETATION_RULE__SOURCE);
		createEReference(interpretationRuleEClass, INTERPRETATION_RULE__PRODUCTIONS);
		createEReference(interpretationRuleEClass, INTERPRETATION_RULE__VARIABLES);
		createEReference(interpretationRuleEClass, INTERPRETATION_RULE__SUPER_RULE);
		createEReference(interpretationRuleEClass, INTERPRETATION_RULE__OWNING_MODEL);

		ruleVariableEClass = createEClass(RULE_VARIABLE);
		createEAttribute(ruleVariableEClass, RULE_VARIABLE__NAME);
		createEAttribute(ruleVariableEClass, RULE_VARIABLE__INIT_EXPR);
		createEReference(ruleVariableEClass, RULE_VARIABLE__VAR_TYPE);
		createEReference(ruleVariableEClass, RULE_VARIABLE__OWNING_RULE);

		rulePatternEClass = createEClass(RULE_PATTERN);
		createEAttribute(rulePatternEClass, RULE_PATTERN__NAME);
		createEReference(rulePatternEClass, RULE_PATTERN__SOURCE_ELEMENT);
		createEAttribute(rulePatternEClass, RULE_PATTERN__SOURCE_MODEL);
		createEAttribute(rulePatternEClass, RULE_PATTERN__CONDITION);
		createEReference(rulePatternEClass, RULE_PATTERN__OWNING_RULE);

		ruleProductionEClass = createEClass(RULE_PRODUCTION);
		createEAttribute(ruleProductionEClass, RULE_PRODUCTION__NAME);
		createEReference(ruleProductionEClass, RULE_PRODUCTION__TARGET_ELEMENT);
		createEAttribute(ruleProductionEClass, RULE_PRODUCTION__TARGET_MODEL);
		createEAttribute(ruleProductionEClass, RULE_PRODUCTION__INIT_EXPR);
		createEReference(ruleProductionEClass, RULE_PRODUCTION__OWNING_RULE);

		singletonRuleProductionEClass = createEClass(SINGLETON_RULE_PRODUCTION);
		createEAttribute(singletonRuleProductionEClass, SINGLETON_RULE_PRODUCTION__ID_EXPR);

		// Create data types
		stringEDataType = createEDataType(STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		singletonRuleProductionEClass.getESuperTypes().add(this.getRuleProduction());

		// Initialize classes and features; add operations and parameters
		initEClass(interpretationPatternModelEClass, InterpretationPatternModel.class, "InterpretationPatternModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterpretationPatternModel_Name(), this.getString(), "name", null, 1, 1, InterpretationPatternModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretationPatternModel_Rules(), this.getInterpretationRule(), this.getInterpretationRule_OwningModel(), "rules", null, 0, -1, InterpretationPatternModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interpretationRuleEClass, InterpretationRule.class, "InterpretationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterpretationRule_Name(), this.getString(), "name", null, 1, 1, InterpretationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretationRule_Source(), this.getRulePattern(), this.getRulePattern_OwningRule(), "source", null, 1, 1, InterpretationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretationRule_Productions(), this.getRuleProduction(), this.getRuleProduction_OwningRule(), "productions", null, 0, -1, InterpretationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretationRule_Variables(), this.getRuleVariable(), this.getRuleVariable_OwningRule(), "variables", null, 0, -1, InterpretationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretationRule_SuperRule(), this.getInterpretationRule(), null, "superRule", null, 0, 1, InterpretationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretationRule_OwningModel(), this.getInterpretationPatternModel(), this.getInterpretationPatternModel_Rules(), "owningModel", null, 1, 1, InterpretationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleVariableEClass, RuleVariable.class, "RuleVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleVariable_Name(), this.getString(), "name", null, 1, 1, RuleVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleVariable_InitExpr(), this.getString(), "initExpr", null, 1, 1, RuleVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariable_VarType(), ecorePackage.getEClass(), null, "varType", null, 1, 1, RuleVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariable_OwningRule(), this.getInterpretationRule(), this.getInterpretationRule_Variables(), "owningRule", null, 1, 1, RuleVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulePatternEClass, RulePattern.class, "RulePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRulePattern_Name(), this.getString(), "name", null, 1, 1, RulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRulePattern_SourceElement(), ecorePackage.getEClass(), null, "sourceElement", null, 1, 1, RulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRulePattern_SourceModel(), this.getString(), "sourceModel", null, 0, 1, RulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRulePattern_Condition(), this.getString(), "condition", null, 0, 1, RulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRulePattern_OwningRule(), this.getInterpretationRule(), this.getInterpretationRule_Source(), "owningRule", null, 1, 1, RulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleProductionEClass, RuleProduction.class, "RuleProduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleProduction_Name(), this.getString(), "name", null, 1, 1, RuleProduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleProduction_TargetElement(), ecorePackage.getEClass(), null, "targetElement", null, 1, 1, RuleProduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleProduction_TargetModel(), this.getString(), "targetModel", null, 0, 1, RuleProduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleProduction_InitExpr(), this.getString(), "initExpr", null, 0, 1, RuleProduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleProduction_OwningRule(), this.getInterpretationRule(), this.getInterpretationRule_Productions(), "owningRule", null, 1, 1, RuleProduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonRuleProductionEClass, SingletonRuleProduction.class, "SingletonRuleProduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingletonRuleProduction_IdExpr(), this.getString(), "idExpr", null, 1, 1, SingletonRuleProduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta.req
		createKermetaAnnotations();
		// kermeta
		createKermeta_1Annotations();
		// kermeta.inv
		createKermeta_2Annotations();
		// kermeta.inv.doc
		createKermeta_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta.req</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta.req";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km", "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km",
			 "http://www.eclipse.org/emf/2002/Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });																															
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta";			
		addAnnotation
		  (interpretationPatternModelEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class describes the structure and the behavior of an interpretation pattern model\r\n */"
		   });				
		addAnnotation
		  (getInterpretationPatternModel_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the Interpretation model */"
		   });		
		addAnnotation
		  (getInterpretationPatternModel_Rules(), 
		   source, 
		   new String[] {
			 "documentation", "/** Interpretation rules defined by the interpretation model */"
		   });		
		addAnnotation
		  (interpretationRuleEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class defines an interpretation rule of the InterpretationPatternModel\r\n */"
		   });		
		addAnnotation
		  (getInterpretationRule_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the InterpretationRule */"
		   });		
		addAnnotation
		  (getInterpretationRule_Source(), 
		   source, 
		   new String[] {
			 "documentation", "/** Pattern of the InterpretationRule */"
		   });		
		addAnnotation
		  (getInterpretationRule_Productions(), 
		   source, 
		   new String[] {
			 "documentation", "/** Set of production of the InterpretationRule */"
		   });		
		addAnnotation
		  (getInterpretationRule_Variables(), 
		   source, 
		   new String[] {
			 "documentation", "/** Set of variables of the InterpretationRule */"
		   });		
		addAnnotation
		  (getInterpretationRule_SuperRule(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the super rule of the InterpretationRule */"
		   });		
		addAnnotation
		  (getInterpretationRule_OwningModel(), 
		   source, 
		   new String[] {
			 "documentation", "/** Reference to the InterpretationPatternModel */"
		   });		
		addAnnotation
		  (ruleVariableEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class defines a variable of an InterpretationRule.\r\n */"
		   });		
		addAnnotation
		  (getRuleVariable_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the variable */"
		   });		
		addAnnotation
		  (getRuleVariable_InitExpr(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Kermeta expression for variable initialization */"
		   });		
		addAnnotation
		  (getRuleVariable_VarType(), 
		   source, 
		   new String[] {
			 "documentation", "/** Ecore type of the variable */"
		   });		
		addAnnotation
		  (getRuleVariable_OwningRule(), 
		   source, 
		   new String[] {
			 "documentation", "/** Reference to the InterpretationRule */"
		   });		
		addAnnotation
		  (rulePatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class defines the matching pattern of an InterpretationRule\r\n */"
		   });		
		addAnnotation
		  (getRulePattern_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the RulePattern */"
		   });		
		addAnnotation
		  (getRulePattern_SourceElement(), 
		   source, 
		   new String[] {
			 "documentation", "/** Ecore type of input model elements matched by the RulePattern */"
		   });		
		addAnnotation
		  (getRulePattern_SourceModel(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the model from which input elements must be matched */"
		   });		
		addAnnotation
		  (getRulePattern_Condition(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Kermeta condition expression that has to be validated by the input model element */"
		   });		
		addAnnotation
		  (getRulePattern_OwningRule(), 
		   source, 
		   new String[] {
			 "documentation", "/** Reference to the InterpretationRule */"
		   });		
		addAnnotation
		  (ruleProductionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class defines one of the \"outputs\" of an InterpretationRule\r\n */"
		   });		
		addAnnotation
		  (getRuleProduction_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the RuleProduction */"
		   });		
		addAnnotation
		  (getRuleProduction_TargetElement(), 
		   source, 
		   new String[] {
			 "documentation", "/** Ecore type of output model element allocated by the RuleProduction */"
		   });		
		addAnnotation
		  (getRuleProduction_TargetModel(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Name of the model to which output elements must be assigned */"
		   });		
		addAnnotation
		  (getRuleProduction_InitExpr(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Kermeta initialization expression of the allocated output model element */"
		   });		
		addAnnotation
		  (getRuleProduction_OwningRule(), 
		   source, 
		   new String[] {
			 "documentation", "/** Reference to the InterpretationRule */"
		   });		
		addAnnotation
		  (singletonRuleProductionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class defines a singleton output of an InterpretationRule.\r\n */"
		   });		
		addAnnotation
		  (getSingletonRuleProduction_IdExpr(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Expression that identifies the singleton object (based on input model elements) */"
		   });
	}

	/**
	 * Initializes the annotations for <b>kermeta.inv</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_2Annotations() {
		String source = "kermeta.inv";				
		addAnnotation
		  (interpretationPatternModelEClass, 
		   source, 
		   new String[] {
			 "rulesName", "rules.each{r1 | not (rules.exists{r2 | (r1.isNotEqual(r2)) and (r1.name.equals(r2.name))})}"
		   });																													
	}

	/**
	 * Initializes the annotations for <b>kermeta.inv.doc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_3Annotations() {
		String source = "kermeta.inv.doc";					
		addAnnotation
		  (interpretationPatternModelEClass, 
		   source, 
		   new String[] {
			 "documentation", "/** All InterpretationRules must have a distinct name */"
		   });																												
	}

} //KtrPackageImpl
