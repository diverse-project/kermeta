/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackageImpl.java,v 1.9 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.ANDExpression;
import fr.irisa.triskell.kermeta.kpm.AbstractEntity;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEntry;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
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
import fr.irisa.triskell.kermeta.kpm.SimpleExpression;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.TypeFilter;

import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.interest.InterestPackage;

import fr.irisa.triskell.kermeta.kpm.interest.impl.InterestPackageImpl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass dependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEntryEClass = null;

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
	public EReference getDependency_In() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Event() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Outs() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Name() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Type() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(4);
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
	public EReference getIn_Dependency() {
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
	public EReference getOut_Dependency() {
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
	public EReference getKPM_Dependencies() {
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
	public EReference getKPM_DependencyTypes() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(6);
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
	public EReference getUnit_Dependencies() {
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
	public EReference getUnit_DependsOnUnits() {
		return (EReference)unitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_DependentUnits() {
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
	public EClass getDependencyType() {
		return dependencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_Name() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyEntry() {
		return dependencyEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyEntry_Type() {
		return (EReference)dependencyEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyEntry_Unit() {
		return (EReference)dependencyEntryEClass.getEStructuralFeatures().get(1);
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
		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__IN);
		createEReference(dependencyEClass, DEPENDENCY__EVENT);
		createEReference(dependencyEClass, DEPENDENCY__OUTS);
		createEAttribute(dependencyEClass, DEPENDENCY__NAME);
		createEReference(dependencyEClass, DEPENDENCY__TYPE);

		inEClass = createEClass(IN);
		createEReference(inEClass, IN__DEPENDENCY);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__EXTENSION_POINT);

		outEClass = createEClass(OUT);
		createEReference(outEClass, OUT__ACTION);
		createEReference(outEClass, OUT__DEPENDENCY);
		createEAttribute(outEClass, OUT__INDEPENDANT);

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
		createEReference(kpmEClass, KPM__DEPENDENCIES);
		createEReference(kpmEClass, KPM__EVENTS);
		createEReference(kpmEClass, KPM__UNITS);
		createEReference(kpmEClass, KPM__DEPENDENCY_TYPES);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__TYPE);
		createEReference(unitEClass, UNIT__DEPENDENCIES);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__LAST_TIME_MODIFIED);
		createEAttribute(unitEClass, UNIT__VALUE);
		createEReference(unitEClass, UNIT__DEPENDS_ON_UNITS);
		createEReference(unitEClass, UNIT__DEPENDENT_UNITS);

		existFilterEClass = createEClass(EXIST_FILTER);

		dependencyTypeEClass = createEClass(DEPENDENCY_TYPE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__NAME);

		dependencyEntryEClass = createEClass(DEPENDENCY_ENTRY);
		createEReference(dependencyEntryEClass, DEPENDENCY_ENTRY__TYPE);
		createEReference(dependencyEntryEClass, DEPENDENCY_ENTRY__UNIT);

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
		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_In(), this.getIn(), this.getIn_Dependency(), "in", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Event(), this.getEvent(), null, "event", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Outs(), this.getOut(), this.getOut_Dependency(), "outs", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Type(), this.getDependencyType(), null, "type", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(dependencyEClass, null, "process");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "synchrone", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		op = addEOperation(dependencyEClass, null, "setEvent");
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(dependencyEClass, null, "setType");
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(dependencyEClass, this.getOut(), "findOut", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "actionId", 0, 1);

		op = addEOperation(dependencyEClass, null, "removeOut");
		addEParameter(op, ecorePackage.getEString(), "actionId", 0, 1);

		initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIn_Dependency(), this.getDependency(), this.getDependency_In(), "dependency", null, 1, 1, In.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ExtensionPoint(), ecorePackage.getEString(), "extensionPoint", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(actionEClass, null, "execute");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);

		initEClass(outEClass, Out.class, "Out", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOut_Action(), this.getAction(), null, "action", null, 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOut_Dependency(), this.getDependency(), this.getDependency_Outs(), "dependency", null, 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOut_Independant(), ecorePackage.getEBoolean(), "independant", "false", 0, 1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(outEClass, null, "process");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(filterEClass, ecorePackage.getEBoolean(), "matches", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nestedExpressionEClass, NestedExpression.class, "NestedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedExpression_Expression(), this.getSimpleExpression(), null, "expression", null, 1, 1, NestedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(nestedExpressionEClass, ecorePackage.getEBoolean(), "evaluateIn", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1);

		op = addEOperation(nestedExpressionEClass, ecorePackage.getEBoolean(), "evaluateOut", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1);

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

		op = addEOperation(abstractEntityEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Value(), ecorePackage.getEString(), "value", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eventEClass, ecorePackage.getEBoolean(), "equals", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(eventEClass, ecorePackage.getEBoolean(), "equals", 0, 1);
		addEParameter(op, this.getEvent(), "event", 0, 1);

		initEClass(simpleExpressionEClass, SimpleExpression.class, "SimpleExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleExpression_SubExpression(), this.getNestedExpression(), null, "subExpression", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(simpleExpressionEClass, ecorePackage.getEBoolean(), "evaluateIn", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(simpleExpressionEClass, ecorePackage.getEBoolean(), "evaluateOut", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		initEClass(kpmEClass, fr.irisa.triskell.kermeta.kpm.KPM.class, "KPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPM_Actions(), this.getAction(), null, "actions", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Filters(), this.getFilter(), null, "filters", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Types(), this.getType(), null, "types", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Events(), this.getEvent(), null, "events", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Units(), this.getUnit(), null, "units", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_DependencyTypes(), this.getDependencyType(), null, "dependencyTypes", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getAction(), "createAction", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "extensionPoint", 0, 1);

		op = addEOperation(kpmEClass, this.getAction(), "findAction", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "extensionPoint", 0, 1);

		op = addEOperation(kpmEClass, this.getEvent(), "findEvent", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getNameFilter(), "createNameFilter", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "regex", 0, 1);

		op = addEOperation(kpmEClass, this.getNameFilter(), "findNameFilter", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "regex", 0, 1);

		addEOperation(kpmEClass, this.getExistFilter(), "getExistFilter", 0, 1);

		op = addEOperation(kpmEClass, this.getDependencyType(), "findDependencyType", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getDependencyType(), "getDependencyType", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getDependency(), "findDependency", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getEvent(), "getEvent", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getUnit(), "findUnit", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Type(), this.getType(), null, "type", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_LastTimeModified(), ecorePackage.getEDate(), "lastTimeModified", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Value(), ecorePackage.getEString(), "value", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_DependsOnUnits(), this.getDependencyEntry(), null, "dependsOnUnits", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_DependentUnits(), this.getDependencyEntry(), null, "dependentUnits", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(unitEClass, null, "changed");

		op = addEOperation(unitEClass, null, "receiveEvent");
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "synchrone", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		op = addEOperation(unitEClass, ecorePackage.getEBoolean(), "hasDependencyNamed", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		op = addEOperation(unitEClass, null, "receiveSynchroneEvent");
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);

		op = addEOperation(unitEClass, null, "receiveAsynchroneEvent");
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);

		op = addEOperation(unitEClass, null, "beDependentOf");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, this.getDependencyType(), "type", 0, 1);

		op = addEOperation(unitEClass, null, "beDependentOf");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, this.getDependency(), "dependency", 0, 1);

		op = addEOperation(unitEClass, null, "getFree");
		addEParameter(op, this.getDependencyType(), "type", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(unitEClass, this.getDependencyEntry(), "findDependentUnit", 0, 1);
		addEParameter(op, this.getDependencyType(), "type", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(unitEClass, this.getDependencyEntry(), "findUnitIDependOn", 0, 1);
		addEParameter(op, this.getDependencyType(), "type", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(unitEClass, this.getDependencyEntry(), "findUnitIDependOn", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "type", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(unitEClass, this.getDependencyEntry(), "findDependentUnit", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "type", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(unitEClass, null, "receiveSynchroneEvent");
		addEParameter(op, ecorePackage.getEString(), "event", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "args", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		op = addEOperation(unitEClass, this.getDependency(), "findDependency", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);

		initEClass(existFilterEClass, ExistFilter.class, "ExistFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyTypeEClass, DependencyType.class, "DependencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEntryEClass, DependencyEntry.class, "DependencyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyEntry_Type(), this.getDependencyType(), null, "type", null, 1, 1, DependencyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyEntry_Unit(), this.getUnit(), null, "unit", null, 1, 1, DependencyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KpmPackageImpl
