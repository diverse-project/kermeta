/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackageImpl.java,v 1.8 2007-02-08 15:37:03 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.AbstractDirectory;
import fr.irisa.triskell.kermeta.kpm.AbstractExpression;
import fr.irisa.triskell.kermeta.kpm.AbstractFile;
import fr.irisa.triskell.kermeta.kpm.AbstractProject;
import fr.irisa.triskell.kermeta.kpm.AbstractUnit;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.And;
import fr.irisa.triskell.kermeta.kpm.Container;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEvent;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.workspace.IAction;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Or;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.SuitedExpression;
import fr.irisa.triskell.kermeta.kpm.TypeFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

import fr.irisa.triskell.kermeta.kpm.workspace.KermetaUnitInterest;

import java.util.ArrayList;

import java.util.Date;

import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import org.eclipse.core.resources.IResource;

import org.eclipse.core.runtime.IProgressMonitor;

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
	private EClass abstractFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProjectEClass = null;

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
	private EClass nameFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractUnitEClass = null;

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
	private EClass dependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEventEClass = null;

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
	private EClass typeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

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
	private EClass kpmEClass = null;

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
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suitedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFolderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaUnitInterestEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashtableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

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
	public EClass getAbstractFile() {
		return abstractFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDirectory() {
		return abstractDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProject() {
		return abstractProjectEClass;
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
	public EClass getNameFilter() {
		return nameFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameFilter_RegexIn() {
		return (EAttribute)nameFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameFilter_RegexOut() {
		return (EAttribute)nameFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractUnit() {
		return abstractUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractUnit_TypeName() {
		return (EAttribute)abstractUnitEClass.getEStructuralFeatures().get(0);
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
	public EReference getDependency_Event() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Actions() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_In() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Outs() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Name() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(5);
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
	public EClass getDependencyEvent() {
		return dependencyEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyEvent_Name() {
		return (EAttribute)dependencyEventEClass.getEStructuralFeatures().get(0);
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
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Container() {
		return (EReference)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectory_Contents() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
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
	public EReference getUnit_Dependencies() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Kpm() {
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
	public EAttribute getUnit_Path() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_LastTimeModified() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(4);
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
	public EReference getKPM_Units() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Events() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Dependencies() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Actions() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Filters() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Types() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Expressions() {
		return (EReference)kpmEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
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
	public EReference getExpression_SubExpressions() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExpression() {
		return abstractExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractExpression_Filter() {
		return (EReference)abstractExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExpression_Id() {
		return (EAttribute)abstractExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuitedExpression() {
		return suitedExpressionEClass;
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
	public EDataType getArrayList() {
		return arrayListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getboolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFolder() {
		return iFolderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIResource() {
		return iResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaUnitInterest() {
		return kermetaUnitInterestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashtable() {
		return hashtableEDataType;
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
		abstractFileEClass = createEClass(ABSTRACT_FILE);

		abstractDirectoryEClass = createEClass(ABSTRACT_DIRECTORY);

		abstractProjectEClass = createEClass(ABSTRACT_PROJECT);

		filterEClass = createEClass(FILTER);

		nameFilterEClass = createEClass(NAME_FILTER);
		createEAttribute(nameFilterEClass, NAME_FILTER__REGEX_IN);
		createEAttribute(nameFilterEClass, NAME_FILTER__REGEX_OUT);

		abstractUnitEClass = createEClass(ABSTRACT_UNIT);
		createEAttribute(abstractUnitEClass, ABSTRACT_UNIT__TYPE_NAME);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__TYPE);
		createEReference(dependencyEClass, DEPENDENCY__EVENT);
		createEReference(dependencyEClass, DEPENDENCY__ACTIONS);
		createEReference(dependencyEClass, DEPENDENCY__IN);
		createEReference(dependencyEClass, DEPENDENCY__OUTS);
		createEAttribute(dependencyEClass, DEPENDENCY__NAME);

		dependencyTypeEClass = createEClass(DEPENDENCY_TYPE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__NAME);

		dependencyEventEClass = createEClass(DEPENDENCY_EVENT);
		createEAttribute(dependencyEventEClass, DEPENDENCY_EVENT__NAME);

		existFilterEClass = createEClass(EXIST_FILTER);

		typeFilterEClass = createEClass(TYPE_FILTER);
		createEReference(typeFilterEClass, TYPE_FILTER__TYPE);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__CONTAINER);

		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__CONTENTS);

		projectEClass = createEClass(PROJECT);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__DEPENDENCIES);
		createEReference(unitEClass, UNIT__KPM);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__PATH);
		createEAttribute(unitEClass, UNIT__LAST_TIME_MODIFIED);

		kpmEClass = createEClass(KPM);
		createEReference(kpmEClass, KPM__EVENTS);
		createEReference(kpmEClass, KPM__DEPENDENCIES);
		createEReference(kpmEClass, KPM__ACTIONS);
		createEReference(kpmEClass, KPM__FILTERS);
		createEReference(kpmEClass, KPM__TYPES);
		createEReference(kpmEClass, KPM__EXPRESSIONS);
		createEReference(kpmEClass, KPM__UNITS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);

		abstractExpressionEClass = createEClass(ABSTRACT_EXPRESSION);
		createEReference(abstractExpressionEClass, ABSTRACT_EXPRESSION__FILTER);
		createEAttribute(abstractExpressionEClass, ABSTRACT_EXPRESSION__ID);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__SUB_EXPRESSIONS);

		suitedExpressionEClass = createEClass(SUITED_EXPRESSION);

		// Create data types
		stringEDataType = createEDataType(STRING);
		arrayListEDataType = createEDataType(ARRAY_LIST);
		booleanEDataType = createEDataType(BOOLEAN);
		iFileEDataType = createEDataType(IFILE);
		iFolderEDataType = createEDataType(IFOLDER);
		iProjectEDataType = createEDataType(IPROJECT);
		dateEDataType = createEDataType(DATE);
		iResourceEDataType = createEDataType(IRESOURCE);
		kermetaUnitInterestEDataType = createEDataType(KERMETA_UNIT_INTEREST);
		hashtableEDataType = createEDataType(HASHTABLE);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
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
		abstractFileEClass.getESuperTypes().add(this.getAbstractUnit());
		abstractDirectoryEClass.getESuperTypes().add(this.getAbstractUnit());
		abstractProjectEClass.getESuperTypes().add(this.getAbstractUnit());
		nameFilterEClass.getESuperTypes().add(this.getFilter());
		existFilterEClass.getESuperTypes().add(this.getFilter());
		typeFilterEClass.getESuperTypes().add(this.getFilter());
		fileEClass.getESuperTypes().add(this.getUnit());
		fileEClass.getESuperTypes().add(this.getAbstractFile());
		directoryEClass.getESuperTypes().add(this.getFile());
		directoryEClass.getESuperTypes().add(this.getAbstractDirectory());
		projectEClass.getESuperTypes().add(this.getUnit());
		projectEClass.getESuperTypes().add(this.getAbstractProject());
		unitEClass.getESuperTypes().add(this.getAbstractUnit());
		andEClass.getESuperTypes().add(this.getAbstractExpression());
		andEClass.getESuperTypes().add(this.getSuitedExpression());
		orEClass.getESuperTypes().add(this.getAbstractExpression());
		orEClass.getESuperTypes().add(this.getSuitedExpression());
		expressionEClass.getESuperTypes().add(this.getAbstractExpression());
		suitedExpressionEClass.getESuperTypes().add(this.getAbstractExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractFileEClass, AbstractFile.class, "AbstractFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractDirectoryEClass, AbstractDirectory.class, "AbstractDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractProjectEClass, AbstractProject.class, "AbstractProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(filterEClass, this.getboolean(), "apply", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(filterEClass, this.getboolean(), "apply", 0, 1);
		addEParameter(op, this.getIResource(), "resource", 0, 1);

		initEClass(nameFilterEClass, NameFilter.class, "NameFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameFilter_RegexIn(), this.getString(), "regexIn", null, 0, 1, NameFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameFilter_RegexOut(), this.getString(), "regexOut", null, 0, 1, NameFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractUnitEClass, AbstractUnit.class, "AbstractUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractUnit_TypeName(), this.getString(), "typeName", null, 0, 1, AbstractUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Type(), this.getDependencyType(), null, "type", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Event(), this.getDependencyEvent(), null, "event", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Actions(), this.getAction(), null, "actions", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_In(), this.getExpression(), null, "in", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Outs(), this.getExpression(), null, "outs", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Name(), this.getString(), "name", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dependencyEClass, null, "process");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, this.getHashtable(), "params", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		op = addEOperation(dependencyEClass, this.getboolean(), "isExecutable", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(dependencyEClass, this.getboolean(), "couldBeExecutable", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		initEClass(dependencyTypeEClass, DependencyType.class, "DependencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyType_Name(), this.getString(), "name", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEventEClass, DependencyEvent.class, "DependencyEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyEvent_Name(), this.getString(), "name", null, 0, 1, DependencyEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dependencyEventEClass, this.getboolean(), "equals", 0, 1);
		addEParameter(op, this.getString(), "eventName", 0, 1);

		initEClass(existFilterEClass, ExistFilter.class, "ExistFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeFilterEClass, TypeFilter.class, "TypeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeFilter_Type(), this.getAbstractUnit(), null, "type", null, 1, 1, TypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_Container(), this.getDirectory(), this.getDirectory_Contents(), "container", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Contents(), this.getFile(), this.getFile_Container(), "contents", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Kpm(), this.getKPM(), this.getKPM_Units(), "kpm", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Name(), this.getString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Path(), this.getString(), "path", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_LastTimeModified(), this.getDate(), "lastTimeModified", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(unitEClass, null, "receiveEvent");
		addEParameter(op, this.getString(), "eventName", 0, 1);
		addEParameter(op, this.getHashtable(), "params", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		op = addEOperation(unitEClass, this.getArrayList(), "getDependenciesWithEvent", 0, 1);
		addEParameter(op, this.getString(), "eventName", 0, 1);

		addEOperation(unitEClass, this.getboolean(), "isFile", 0, 1);

		addEOperation(unitEClass, this.getboolean(), "isDirectory", 0, 1);

		addEOperation(unitEClass, this.getboolean(), "isProject", 0, 1);

		op = addEOperation(unitEClass, null, "changed");
		addEParameter(op, this.getKermetaUnitInterest(), "changer", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		addEOperation(unitEClass, null, "remove");

		initEClass(kpmEClass, fr.irisa.triskell.kermeta.kpm.KPM.class, "KPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPM_Events(), this.getDependencyEvent(), null, "events", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Actions(), this.getAction(), null, "actions", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Filters(), this.getFilter(), null, "filters", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Types(), this.getDependencyType(), null, "types", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Units(), this.getUnit(), this.getUnit_Kpm(), "units", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(kpmEClass, this.getNameFilter(), "getNameFilter", 0, 1);
		addEParameter(op, this.getString(), "regex", 0, 1);

		op = addEOperation(kpmEClass, this.getAction(), "getAction", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getDependencyEvent(), "getEvent", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getExpression(), "getExpression", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getDependency(), "getDependency", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "findFile", 0, 1);
		addEParameter(op, this.getString(), "relativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "findFile", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);
		addEParameter(op, this.getString(), "path", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "findFile", 0, 1);
		addEParameter(op, this.getIFile(), "ifile", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "findDirectory", 0, 1);
		addEParameter(op, this.getString(), "relativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "findDirectory", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);
		addEParameter(op, this.getString(), "path", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "findDirectory", 0, 1);
		addEParameter(op, this.getIFolder(), "ifolder", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "findProject", 0, 1);
		addEParameter(op, this.getString(), "relativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "findProject", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);
		addEParameter(op, this.getString(), "path", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "findProject", 0, 1);
		addEParameter(op, this.getIProject(), "iproject", 0, 1);

		op = addEOperation(kpmEClass, null, "removeFile");
		addEParameter(op, this.getFile(), "unit", 0, 1);

		op = addEOperation(kpmEClass, null, "removeDirectory");
		addEParameter(op, this.getDirectory(), "unit", 0, 1);

		op = addEOperation(kpmEClass, null, "removeProject");
		addEParameter(op, this.getProject(), "unit", 0, 1);

		op = addEOperation(kpmEClass, null, "removeFile");
		addEParameter(op, this.getIFile(), "unit", 0, 1);

		op = addEOperation(kpmEClass, null, "removeDirectory");
		addEParameter(op, this.getIFolder(), "unit", 0, 1);

		op = addEOperation(kpmEClass, null, "removeProject");
		addEParameter(op, this.getIProject(), "unit", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "createDirectory", 0, 1);
		addEParameter(op, this.getIFolder(), "ifolder", 0, 1);

		op = addEOperation(kpmEClass, this.getDependencyType(), "getType", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);

		addEOperation(kpmEClass, this.getExistFilter(), "getExistFilter", 0, 1);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), this.getString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(actionEClass, null, "execute");
		addEParameter(op, this.getUnit(), "unit", 0, 1);
		addEParameter(op, this.getArrayList(), "dependents", 0, 1);
		addEParameter(op, this.getHashtable(), "params", 0, 1);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);

		initEClass(abstractExpressionEClass, AbstractExpression.class, "AbstractExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractExpression_Filter(), this.getFilter(), null, "filter", null, 1, 1, AbstractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractExpression_Id(), this.getString(), "id", null, 0, 1, AbstractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(abstractExpressionEClass, this.getboolean(), "evaluate", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(abstractExpressionEClass, this.getboolean(), "evaluate", 0, 1);
		addEParameter(op, this.getIResource(), "resource", 0, 1);

		op = addEOperation(abstractExpressionEClass, this.getString(), "getDependentFrom", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_SubExpressions(), this.getSuitedExpression(), null, "subExpressions", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suitedExpressionEClass, SuitedExpression.class, "SuitedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFolderEDataType, IFolder.class, "IFolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iResourceEDataType, IResource.class, "IResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaUnitInterestEDataType, KermetaUnitInterest.class, "KermetaUnitInterest", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashtableEDataType, Hashtable.class, "Hashtable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KpmPackageImpl
