/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackageImpl.java,v 1.16 2008-02-04 10:54:36 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.irisa.triskell.kermeta.kpm.ANDExpression;
import fr.irisa.triskell.kermeta.kpm.AbstractEntity;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.NestedExpression;
import fr.irisa.triskell.kermeta.kpm.NullExpression;
import fr.irisa.triskell.kermeta.kpm.ORExpression;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.SimpleExpression;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.TypeFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KpmPackageImpl extends EPackageImpl implements KpmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

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
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KpmPackageImpl() {
		super(eNS_URI, KpmFactory.eINSTANCE);
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
	public static KpmPackage init() {
		if (isInited) return (KpmPackage)EPackage.Registry.INSTANCE.getEPackage(KpmPackage.eNS_URI);

		// Obtain or create and register package
		KpmPackageImpl theKpmPackage = (KpmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof KpmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new KpmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKpmPackage.createPackageContents();

		// Initialize created meta-data
		theKpmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKpmPackage.freeze();

		return theKpmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Type() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_From() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_To() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIn() {
		return inEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIn_Rule() {
		return (EReference)inEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ExtensionPoint() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOut() {
		return outEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOut_Action() {
		return (EReference)outEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOut_Rule() {
		return (EReference)outEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOut_Independant() {
		return (EAttribute)outEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOut_Parameters() {
		return (EReference)outEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedExpression() {
		return nestedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedExpression_Expression() {
		return (EReference)nestedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORExpression() {
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDExpression() {
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterExpression() {
		return filterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterExpression_Filter() {
		return (EReference)filterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeFilter() {
		return typeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeFilter_Type() {
		return (EReference)typeFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameFilter() {
		return nameFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameFilter_Regex() {
		return (EAttribute)nameFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEntity() {
		return abstractEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEntity_Expression() {
		return (EReference)abstractEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Value() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullExpression() {
		return nullExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleExpression() {
		return simpleExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleExpression_SubExpression() {
		return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPM() {
		return kpmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Actions() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Filters() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Types() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Rules() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Events() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Units() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_RuleTypes() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_In() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Event() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Outs() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Type() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Type() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Rules() {
		return (EReference)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_LastTimeModified() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Value() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Dependencies() {
		return (EReference)unitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Dependents() {
		return (EReference)unitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistFilter() {
		return existFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleType() {
		return ruleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Name() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmFactory getKpmFactory() {
		return (KpmFactory)getEFactoryInstance();
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
		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__IN);
		createEReference(ruleEClass, RULE__EVENT);
		createEReference(ruleEClass, RULE__OUTS);
		createEAttribute(ruleEClass, RULE__NAME);
		createEReference(ruleEClass, RULE__TYPE);

		inEClass = createEClass(IN);
		createEReference(inEClass, IN__RULE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__EXTENSION_POINT);

		outEClass = createEClass(OUT);
		createEReference(outEClass, OUT__ACTION);
		createEReference(outEClass, OUT__RULE);
		createEAttribute(outEClass, OUT__INDEPENDANT);
		createEReference(outEClass, OUT__PARAMETERS);

		filterEClass = createEClass(FILTER);

		expressionEClass = createEClass(EXPRESSION);

		nestedExpressionEClass = createEClass(NESTED_EXPRESSION);
		createEReference(nestedExpressionEClass, NESTED_EXPRESSION__EXPRESSION);

		orExpressionEClass = createEClass(OR_EXPRESSION);

		andExpressionEClass = createEClass(AND_EXPRESSION);

		filterExpressionEClass = createEClass(FILTER_EXPRESSION);
		createEReference(filterExpressionEClass, FILTER_EXPRESSION__FILTER);

		typeFilterEClass = createEClass(TYPE_FILTER);
		createEReference(typeFilterEClass, TYPE_FILTER__TYPE);

		nameFilterEClass = createEClass(NAME_FILTER);
		createEAttribute(nameFilterEClass, NAME_FILTER__REGEX);

		abstractEntityEClass = createEClass(ABSTRACT_ENTITY);
		createEReference(abstractEntityEClass, ABSTRACT_ENTITY__EXPRESSION);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__VALUE);

		nullExpressionEClass = createEClass(NULL_EXPRESSION);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		simpleExpressionEClass = createEClass(SIMPLE_EXPRESSION);
		createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__SUB_EXPRESSION);

		kpmEClass = createEClass(KPM);
		createEReference(kpmEClass, KPM__ACTIONS);
		createEReference(kpmEClass, KPM__FILTERS);
		createEReference(kpmEClass, KPM__TYPES);
		createEReference(kpmEClass, KPM__RULES);
		createEReference(kpmEClass, KPM__EVENTS);
		createEReference(kpmEClass, KPM__UNITS);
		createEReference(kpmEClass, KPM__RULE_TYPES);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__TYPE);
		createEReference(unitEClass, UNIT__RULES);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__LAST_TIME_MODIFIED);
		createEAttribute(unitEClass, UNIT__VALUE);
		createEReference(unitEClass, UNIT__DEPENDENCIES);
		createEReference(unitEClass, UNIT__DEPENDENTS);

		existFilterEClass = createEClass(EXIST_FILTER);

		ruleTypeEClass = createEClass(RULE_TYPE);
		createEAttribute(ruleTypeEClass, RULE_TYPE__NAME);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__TYPE);
		createEReference(dependencyEClass, DEPENDENCY__FROM);
		createEReference(dependencyEClass, DEPENDENCY__TO);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		// Create data types
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		listEDataType = createEDataType(LIST);
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
		inEClass.getESuperTypes().add(this.getAbstractEntity());
		outEClass.getESuperTypes().add(this.getAbstractEntity());
		nestedExpressionEClass.getESuperTypes().add(this.getExpression());
		orExpressionEClass.getESuperTypes().add(this.getNestedExpression());
		andExpressionEClass.getESuperTypes().add(this.getNestedExpression());
		filterExpressionEClass.getESuperTypes().add(this.getSimpleExpression());
		typeFilterEClass.getESuperTypes().add(this.getFilter());
		nameFilterEClass.getESuperTypes().add(this.getFilter());
		nullExpressionEClass.getESuperTypes().add(this.getSimpleExpression());
		simpleExpressionEClass.getESuperTypes().add(this.getExpression());
		existFilterEClass.getESuperTypes().add(this.getFilter());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_In(), this.getIn(), this.getIn_Rule(), "in", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Event(), this.getEvent(), null, "event", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Outs(), this.getOut(), this.getOut_Rule(), "outs", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Type(), this.getRuleType(), null, "type", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(ruleEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "synchrone", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "args", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ruleEClass, null, "setEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ruleEClass, null, "setType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ruleEClass, this.getOut(), "findOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "actionId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ruleEClass, null, "removeOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "actionId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIn_Rule(), this.getRule(), this.getRule_In(), "rule", null, 1, 1, In.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ExtensionPoint(), ecorePackage.getEString(), "extensionPoint", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(actionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outEClass, Out.class, "Out", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOut_Action(), this.getAction(), null, "action", null, 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOut_Rule(), this.getRule(), this.getRule_Outs(), "rule", null, 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOut_Independant(), ecorePackage.getEBoolean(), "independant", "false", 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOut_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(outEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(filterEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nestedExpressionEClass, NestedExpression.class, "NestedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedExpression_Expression(), this.getSimpleExpression(), null, "expression", null, 1, 1, NestedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(nestedExpressionEClass, ecorePackage.getEBoolean(), "evaluateIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(nestedExpressionEClass, ecorePackage.getEBoolean(), "evaluateOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orExpressionEClass, ORExpression.class, "ORExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpressionEClass, ANDExpression.class, "ANDExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterExpressionEClass, FilterExpression.class, "FilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterExpression_Filter(), this.getFilter(), null, "filter", null, 1, 1, FilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeFilterEClass, TypeFilter.class, "TypeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeFilter_Type(), this.getType(), null, "type", null, 1, 1, TypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameFilterEClass, NameFilter.class, "NameFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameFilter_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, NameFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEntityEClass, AbstractEntity.class, "AbstractEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEntity_Expression(), this.getSimpleExpression(), null, "expression", null, 1, 1, AbstractEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(abstractEntityEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Value(), ecorePackage.getEString(), "value", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eventEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eventEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleExpressionEClass, SimpleExpression.class, "SimpleExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleExpression_SubExpression(), this.getNestedExpression(), null, "subExpression", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(simpleExpressionEClass, ecorePackage.getEBoolean(), "evaluateIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleExpressionEClass, ecorePackage.getEBoolean(), "evaluateOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kpmEClass, fr.irisa.triskell.kermeta.kpm.KPM.class, "KPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPM_Actions(), this.getAction(), null, "actions", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Filters(), this.getFilter(), null, "filters", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Types(), this.getType(), null, "types", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Rules(), this.getRule(), null, "rules", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Events(), this.getEvent(), null, "events", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Units(), this.getUnit(), null, "units", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_RuleTypes(), this.getRuleType(), null, "ruleTypes", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getAction(), "createAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "extensionPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getAction(), "findAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "extensionPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getEvent(), "findEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getNameFilter(), "createNameFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "regex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getNameFilter(), "findNameFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "regex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kpmEClass, this.getExistFilter(), "getExistFilter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getRuleType(), "findRuleType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getRuleType(), "getRuleType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getRule(), "findRule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getEvent(), "getEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getUnit(), "findUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpmEClass, null, "removeUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Type(), this.getType(), null, "type", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Rules(), this.getRule(), null, "rules", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_LastTimeModified(), ecorePackage.getEDate(), "lastTimeModified", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Value(), ecorePackage.getEString(), "value", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Dependents(), this.getDependency(), null, "dependents", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(unitEClass, null, "changed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, null, "receiveEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "synchrone", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "args", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, ecorePackage.getEBoolean(), "hasRuleNamed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, null, "receiveSynchroneEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "args", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, null, "receiveAsynchroneEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "args", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, null, "beDependentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRuleType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, null, "beDependentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRule(), "dependency", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, null, "getFree", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRuleType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, this.getDependency(), "findDependentUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRuleType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, this.getDependency(), "findUnitIDependOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRuleType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, this.getDependency(), "findUnitIDependOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, this.getDependency(), "findDependentUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, this.getRule(), "findRule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(existFilterEClass, ExistFilter.class, "ExistFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleTypeEClass, RuleType.class, "RuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Type(), this.getRuleType(), null, "type", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_From(), this.getUnit(), null, "from", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_To(), this.getUnit(), null, "to", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KpmPackageImpl
