/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackageImpl.java,v 1.1 2006-12-01 12:23:38 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;

import java.util.ArrayList;
import java.util.Date;

import java.util.EnumSet;
import java.util.HashSet;

import java.util.Set;

import org.eclipse.core.resources.IFile;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

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
	private EClass dependencyEClass = null;

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
	private EClass actionEClass = null;

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
	private EDataType stringEDataType = null;

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
	private EDataType arrayListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSetEDataType = null;

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
	public EClass getKPM() {
		return kpmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPM_Units() {
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
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Path() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_LastTimeModified() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Kpm() {
		return (EReference)unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_OwnedDependencies() {
		return (EReference)unitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Project() {
		return (EReference)unitEClass.getEStructuralFeatures().get(5);
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
	public EReference getDependency_From() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_To() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Kpm() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
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
	public EDataType getString() {
		return stringEDataType;
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
	public EDataType getArrayList() {
		return arrayListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashSet() {
		return hashSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnumSet() {
		return enumSetEDataType;
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
		kpmEClass = createEClass(KPM);
		createEReference(kpmEClass, KPM__UNITS);
		createEReference(kpmEClass, KPM__DEPENDENCIES);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__PATH);
		createEAttribute(unitEClass, UNIT__LAST_TIME_MODIFIED);
		createEReference(unitEClass, UNIT__KPM);
		createEReference(unitEClass, UNIT__OWNED_DEPENDENCIES);
		createEReference(unitEClass, UNIT__PROJECT);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__CONTAINER);

		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__CONTENTS);

		projectEClass = createEClass(PROJECT);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__TYPE);
		createEReference(dependencyEClass, DEPENDENCY__EVENT);
		createEReference(dependencyEClass, DEPENDENCY__ACTIONS);
		createEReference(dependencyEClass, DEPENDENCY__FROM);
		createEReference(dependencyEClass, DEPENDENCY__TO);
		createEReference(dependencyEClass, DEPENDENCY__KPM);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		iFileEDataType = createEDataType(IFILE);
		iFolderEDataType = createEDataType(IFOLDER);
		iProjectEDataType = createEDataType(IPROJECT);
		dateEDataType = createEDataType(DATE);
		arrayListEDataType = createEDataType(ARRAY_LIST);
		hashSetEDataType = createEDataType(HASH_SET);
		enumSetEDataType = createEDataType(ENUM_SET);
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
		fileEClass.getESuperTypes().add(this.getUnit());
		directoryEClass.getESuperTypes().add(this.getFile());
		projectEClass.getESuperTypes().add(this.getDirectory());

		// Initialize classes and features; add operations and parameters
		initEClass(kpmEClass, fr.irisa.triskell.kermeta.kpm.KPM.class, "KPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPM_Units(), this.getUnit(), null, "units", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPM_Dependencies(), this.getDependency(), this.getDependency_Kpm(), "dependencies", null, 0, -1, fr.irisa.triskell.kermeta.kpm.KPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(kpmEClass, this.getFile(), "createFileIfNecessary", 0, 1);
		addEParameter(op, this.getString(), "fileName", 0, 1);
		addEParameter(op, this.getString(), "filePath", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "createFileIfNecessary", 0, 1);
		addEParameter(op, this.getIFile(), "iFile", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "createFile", 0, 1);
		addEParameter(op, this.getString(), "fileRelativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "createFile", 0, 1);
		addEParameter(op, this.getString(), "fileName", 0, 1);
		addEParameter(op, this.getString(), "filePath", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "findFile", 0, 1);
		addEParameter(op, this.getString(), "fileRelativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "findFile", 0, 1);
		addEParameter(op, this.getString(), "fileName", 0, 1);
		addEParameter(op, this.getString(), "filePath", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "createDirectoryIfNecessary", 0, 1);
		addEParameter(op, this.getString(), "directoryName", 0, 1);
		addEParameter(op, this.getString(), "directoryPath", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "createDirectoryIfNecessary", 0, 1);
		addEParameter(op, this.getIFolder(), "iDirectory", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "createDirectory", 0, 1);
		addEParameter(op, this.getString(), "directoryName", 0, 1);
		addEParameter(op, this.getString(), "directoryPath", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "createDirectory", 0, 1);
		addEParameter(op, this.getString(), "directoryRelativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "findDirectory", 0, 1);
		addEParameter(op, this.getString(), "directoryRelativeName", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "findDirectory", 0, 1);
		addEParameter(op, this.getString(), "directoryName", 0, 1);
		addEParameter(op, this.getString(), "directoryPath", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "createProjectIfNecessary", 0, 1);
		addEParameter(op, this.getString(), "projectName", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "createProjectIfNecessary", 0, 1);
		addEParameter(op, this.getIProject(), "iProject", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "createProject", 0, 1);
		addEParameter(op, this.getString(), "projectName", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "createProject", 0, 1);
		addEParameter(op, this.getIProject(), "iProject", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "findProject", 0, 1);
		addEParameter(op, this.getString(), "projectName", 0, 1);

		op = addEOperation(kpmEClass, this.getProject(), "findProject", 0, 1);
		addEParameter(op, this.getIProject(), "iProject", 0, 1);

		op = addEOperation(kpmEClass, null, "removeFile");
		addEParameter(op, this.getFile(), "file", 0, 1);

		op = addEOperation(kpmEClass, null, "removeFile");
		addEParameter(op, this.getString(), "fileName", 0, 1);
		addEParameter(op, this.getString(), "filePath", 0, 1);

		op = addEOperation(kpmEClass, null, "removeDirectory");
		addEParameter(op, this.getDirectory(), "directory", 0, 1);

		op = addEOperation(kpmEClass, null, "removeDirectory");
		addEParameter(op, this.getString(), "directoryName", 0, 1);
		addEParameter(op, this.getString(), "directoryPath", 0, 1);

		op = addEOperation(kpmEClass, null, "removeProject");
		addEParameter(op, this.getString(), "projectName", 0, 1);

		op = addEOperation(kpmEClass, null, "removeProject");
		addEParameter(op, this.getProject(), "project", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "createFile", 0, 1);
		addEParameter(op, this.getIFile(), "iFile", 0, 1);

		op = addEOperation(kpmEClass, this.getFile(), "findFile", 0, 1);
		addEParameter(op, this.getIFile(), "iFile", 0, 1);

		op = addEOperation(kpmEClass, null, "removeFile");
		addEParameter(op, this.getIFile(), "iFile", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "createDirectory", 0, 1);
		addEParameter(op, this.getIFolder(), "iDirectory", 0, 1);

		op = addEOperation(kpmEClass, null, "removeDirectory");
		addEParameter(op, this.getIFolder(), "iDirectory", 0, 1);

		op = addEOperation(kpmEClass, this.getDirectory(), "findDirectory", 0, 1);
		addEParameter(op, this.getIFolder(), "iFolder", 0, 1);

		op = addEOperation(kpmEClass, null, "removeProject");
		addEParameter(op, this.getIProject(), "iProject", 0, 1);

		op = addEOperation(kpmEClass, this.getDependency(), "createDependency", 0, 1);
		addEParameter(op, this.getUnit(), "from", 0, 1);
		addEParameter(op, this.getUnit(), "to", 0, 1);
		addEParameter(op, this.getString(), "typeName", 0, 1);
		addEParameter(op, this.getString(), "eventName", 0, 1);
		addEParameter(op, this.getArrayList(), "actionsName", 0, 1);

		op = addEOperation(kpmEClass, null, "removeDependencies");
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(kpmEClass, null, "removeUnit");
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(kpmEClass, this.getDependency(), "findDependency", 0, 1);
		addEParameter(op, this.getUnit(), "from", 0, 1);
		addEParameter(op, this.getUnit(), "to", 0, 1);
		addEParameter(op, this.getString(), "typeName", 0, 1);
		addEParameter(op, this.getString(), "eventName", 0, 1);

		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Name(), this.getString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Path(), this.getString(), "path", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_LastTimeModified(), this.getDate(), "lastTimeModified", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Kpm(), this.getKPM(), null, "kpm", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_OwnedDependencies(), this.getDependency(), null, "ownedDependencies", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Project(), this.getProject(), null, "project", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(unitEClass, this.getboolean(), "isFile", 0, 1);

		addEOperation(unitEClass, this.getboolean(), "isProject", 0, 1);

		addEOperation(unitEClass, this.getboolean(), "isDirectory", 0, 1);

		addEOperation(unitEClass, null, "changed");

		addEOperation(unitEClass, this.getString(), "getRelativeName", 0, 1);

		addEOperation(unitEClass, this.getString(), "getAbsoluteName", 0, 1);

		op = addEOperation(unitEClass, this.getHashSet(), "getDependencies", 0, 1);
		addEParameter(op, this.getString(), "type", 0, 1);

		addEOperation(unitEClass, this.getString(), "getExtension", 0, 1);

		op = addEOperation(unitEClass, null, "receiveEvent");
		addEParameter(op, this.getString(), "name", 0, 1);

		op = addEOperation(unitEClass, this.getHashSet(), "getDependencies", 0, 1);
		addEParameter(op, this.getUnit(), "unit", 0, 1);

		op = addEOperation(unitEClass, null, "removeDependencies");
		addEParameter(op, this.getUnit(), "to", 0, 1);

		op = addEOperation(unitEClass, this.getDependency(), "findDependency", 0, 1);
		addEParameter(op, this.getUnit(), "to", 0, 1);
		addEParameter(op, this.getString(), "typeName", 0, 1);
		addEParameter(op, this.getString(), "eventName", 0, 1);

		addEOperation(unitEClass, this.getArrayList(), "getDependenciesUnit", 0, 1);

		op = addEOperation(unitEClass, this.getHashSet(), "getDependenciesWithEvent", 0, 1);
		addEParameter(op, this.getString(), "eventName", 0, 1);

		op = addEOperation(unitEClass, null, "removeDependencies");
		addEParameter(op, this.getType(), "type", 0, 1);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_Container(), this.getDirectory(), null, "container", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Contents(), this.getFile(), null, "contents", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Type(), this.getType(), null, "type", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Event(), this.getEvent(), null, "event", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Actions(), this.getAction(), null, "actions", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_From(), this.getUnit(), null, "from", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_To(), this.getUnit(), null, "to", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Kpm(), this.getKPM(), this.getKPM_Dependencies(), "kpm", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dependencyEClass, null, "process");

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), this.getString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(typeEClass, this.getboolean(), "equals", 0, 1);
		addEParameter(op, this.getType(), "type", 0, 1);

		op = addEOperation(typeEClass, this.getboolean(), "equals", 0, 1);
		addEParameter(op, this.getString(), "type", 0, 1);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), this.getString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(actionEClass, null, "execute");
		addEParameter(op, this.getDependency(), "dependency", 0, 1);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), this.getString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eventEClass, this.getboolean(), "equals", 0, 1);
		addEParameter(op, this.getEvent(), "event", 0, 1);

		op = addEOperation(eventEClass, this.getboolean(), "equals", 0, 1);
		addEParameter(op, this.getString(), "name", 0, 1);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFolderEDataType, IFolder.class, "IFolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashSetEDataType, HashSet.class, "HashSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSetEDataType, EnumSet.class, "EnumSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KpmPackageImpl
