/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoPackageImpl.java,v 1.21 2008-04-28 11:50:12 ftanguy Exp $
 */
package org.kermeta.io.impl;

import antlr.ANTLRException;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.KmPackage;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

import fr.irisa.triskell.traceability.helper.Tracer;

import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.io.ErrorMessage;
import org.kermeta.io.IBuildingState;
import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitLoader;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.Message;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.ParseErrorMessage;
import org.kermeta.io.ParsingError;
import org.kermeta.io.TypeDefinitionCache;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.io.WarningMessage;

import org.kermeta.io.plugin.IOPlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoPackageImpl extends EPackageImpl implements IoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBuildingStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaUnitStorerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaUnitLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warningMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseErrorMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parsingErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionCacheEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaUnitRequireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tracerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType astNodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType antlrExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioPluginEDataType = null;

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
	 * @see org.kermeta.io.IoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IoPackageImpl() {
		super(eNS_URI, IoFactory.eINSTANCE);
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
	public static IoPackage init() {
		if (isInited) return (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);

		// Obtain or create and register package
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new IoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		KmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIoPackage.createPackageContents();

		// Initialize created meta-data
		theIoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIoPackage.freeze();

		return theIoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaUnit() {
		return kermetaUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_Storer() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_Uri() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_ModelingUnit() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_InternalPackageEntries() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_ExternalPackageEntries() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_ImportedKermetaUnits() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_Importers() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_BuildingState() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_Messages() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_NeedASTTraces() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_TypeChecked() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_Framework() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_Tracer() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_ConstraintChecked() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_Aspects() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_IsBeingTypechecked() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_TypeDefinitionCache() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnit_KermetaUnitRequires() {
		return (EReference)kermetaUnitEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_Locked() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaUnit_BaseAspects() {
		return (EAttribute)kermetaUnitEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBuildingState() {
		return iBuildingStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaUnitStorer() {
		return kermetaUnitStorerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnitStorer_KermetaUnits() {
		return (EReference)kermetaUnitStorerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnitStorer_KermetaUnitsBeingLoaded() {
		return (EReference)kermetaUnitStorerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnitStorer_KermetaUnitsBeingUnloaded() {
		return (EReference)kermetaUnitStorerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageEntry() {
		return packageEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageEntry_QualifiedName() {
		return (EAttribute)packageEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageEntry_Package() {
		return (EReference)packageEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaUnitLoader() {
		return kermetaUnitLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnitLoader_KermetaUnits() {
		return (EReference)kermetaUnitLoaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Value() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Target() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorMessage() {
		return errorMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarningMessage() {
		return warningMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParseErrorMessage() {
		return parseErrorMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParseErrorMessage_Node() {
		return (EAttribute)parseErrorMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParsingError() {
		return parsingErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParsingError_Offset() {
		return (EAttribute)parsingErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParsingError_Length() {
		return (EAttribute)parsingErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParsingError_LineNumber() {
		return (EAttribute)parsingErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionCache() {
		return typeDefinitionCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinitionCache_KermetaUnit() {
		return (EReference)typeDefinitionCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinitionCache_Entries() {
		return (EAttribute)typeDefinitionCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinitionCache_ExternalSearchAuthorized() {
		return (EAttribute)typeDefinitionCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionCacheEntry() {
		return typeDefinitionCacheEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinitionCacheEntry_QualifiedName() {
		return (EAttribute)typeDefinitionCacheEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinitionCacheEntry_TypeDefinition() {
		return (EReference)typeDefinitionCacheEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaUnitRequire() {
		return kermetaUnitRequireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnitRequire_KermetaUnit() {
		return (EReference)kermetaUnitRequireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaUnitRequire_Require() {
		return (EReference)kermetaUnitRequireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		return setEDataType;
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
	public EDataType getTracer() {
		return tracerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getASTNode() {
		return astNodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getANTLRException() {
		return antlrExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOPlugin() {
		return ioPluginEDataType;
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
	public IoFactory getIoFactory() {
		return (IoFactory)getEFactoryInstance();
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
		kermetaUnitEClass = createEClass(KERMETA_UNIT);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__STORER);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__URI);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__MODELING_UNIT);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__IMPORTED_KERMETA_UNITS);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__IMPORTERS);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__BUILDING_STATE);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__MESSAGES);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__NEED_AST_TRACES);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__TYPE_CHECKED);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__FRAMEWORK);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__TRACER);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__CONSTRAINT_CHECKED);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__ASPECTS);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__IS_BEING_TYPECHECKED);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__TYPE_DEFINITION_CACHE);
		createEReference(kermetaUnitEClass, KERMETA_UNIT__KERMETA_UNIT_REQUIRES);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__LOCKED);
		createEAttribute(kermetaUnitEClass, KERMETA_UNIT__BASE_ASPECTS);

		iBuildingStateEClass = createEClass(IBUILDING_STATE);

		kermetaUnitStorerEClass = createEClass(KERMETA_UNIT_STORER);
		createEReference(kermetaUnitStorerEClass, KERMETA_UNIT_STORER__KERMETA_UNITS);
		createEReference(kermetaUnitStorerEClass, KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_LOADED);
		createEReference(kermetaUnitStorerEClass, KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_UNLOADED);

		packageEntryEClass = createEClass(PACKAGE_ENTRY);
		createEAttribute(packageEntryEClass, PACKAGE_ENTRY__QUALIFIED_NAME);
		createEReference(packageEntryEClass, PACKAGE_ENTRY__PACKAGE);

		kermetaUnitLoaderEClass = createEClass(KERMETA_UNIT_LOADER);
		createEReference(kermetaUnitLoaderEClass, KERMETA_UNIT_LOADER__KERMETA_UNITS);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__VALUE);
		createEAttribute(messageEClass, MESSAGE__TARGET);

		errorMessageEClass = createEClass(ERROR_MESSAGE);

		warningMessageEClass = createEClass(WARNING_MESSAGE);

		parseErrorMessageEClass = createEClass(PARSE_ERROR_MESSAGE);
		createEAttribute(parseErrorMessageEClass, PARSE_ERROR_MESSAGE__NODE);

		parsingErrorEClass = createEClass(PARSING_ERROR);
		createEAttribute(parsingErrorEClass, PARSING_ERROR__OFFSET);
		createEAttribute(parsingErrorEClass, PARSING_ERROR__LENGTH);
		createEAttribute(parsingErrorEClass, PARSING_ERROR__LINE_NUMBER);

		typeDefinitionCacheEClass = createEClass(TYPE_DEFINITION_CACHE);
		createEReference(typeDefinitionCacheEClass, TYPE_DEFINITION_CACHE__KERMETA_UNIT);
		createEAttribute(typeDefinitionCacheEClass, TYPE_DEFINITION_CACHE__ENTRIES);
		createEAttribute(typeDefinitionCacheEClass, TYPE_DEFINITION_CACHE__EXTERNAL_SEARCH_AUTHORIZED);

		typeDefinitionCacheEntryEClass = createEClass(TYPE_DEFINITION_CACHE_ENTRY);
		createEAttribute(typeDefinitionCacheEntryEClass, TYPE_DEFINITION_CACHE_ENTRY__QUALIFIED_NAME);
		createEReference(typeDefinitionCacheEntryEClass, TYPE_DEFINITION_CACHE_ENTRY__TYPE_DEFINITION);

		kermetaUnitRequireEClass = createEClass(KERMETA_UNIT_REQUIRE);
		createEReference(kermetaUnitRequireEClass, KERMETA_UNIT_REQUIRE__KERMETA_UNIT);
		createEReference(kermetaUnitRequireEClass, KERMETA_UNIT_REQUIRE__REQUIRE);

		// Create data types
		setEDataType = createEDataType(SET);
		listEDataType = createEDataType(LIST);
		tracerEDataType = createEDataType(TRACER);
		astNodeEDataType = createEDataType(AST_NODE);
		antlrExceptionEDataType = createEDataType(ANTLR_EXCEPTION);
		ioPluginEDataType = createEDataType(IO_PLUGIN);
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

		// Obtain other dependent packages
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		errorMessageEClass.getESuperTypes().add(this.getMessage());
		warningMessageEClass.getESuperTypes().add(this.getMessage());
		parseErrorMessageEClass.getESuperTypes().add(this.getErrorMessage());
		parsingErrorEClass.getESuperTypes().add(this.getErrorMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(kermetaUnitEClass, KermetaUnit.class, "KermetaUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermetaUnit_Storer(), this.getKermetaUnitStorer(), this.getKermetaUnitStorer_KermetaUnits(), "storer", null, 1, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_ModelingUnit(), theStructurePackage.getModelingUnit(), null, "modelingUnit", null, 1, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_InternalPackageEntries(), this.getPackageEntry(), null, "internalPackageEntries", null, 0, -1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_ExternalPackageEntries(), this.getPackageEntry(), null, "externalPackageEntries", null, 0, -1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_ImportedKermetaUnits(), this.getKermetaUnit(), this.getKermetaUnit_Importers(), "importedKermetaUnits", null, 0, -1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_Importers(), this.getKermetaUnit(), this.getKermetaUnit_ImportedKermetaUnits(), "importers", null, 0, -1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_BuildingState(), this.getIBuildingState(), null, "buildingState", null, 1, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_Messages(), this.getMessage(), null, "messages", null, 0, -1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_NeedASTTraces(), ecorePackage.getEBoolean(), "needASTTraces", null, 0, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_TypeChecked(), ecorePackage.getEBoolean(), "typeChecked", null, 1, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_Framework(), ecorePackage.getEBoolean(), "framework", null, 0, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_Tracer(), this.getTracer(), "tracer", null, 0, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_ConstraintChecked(), ecorePackage.getEBoolean(), "constraintChecked", null, 1, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(theStructurePackage.getTypeDefinition());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theStructurePackage.getTypeDefinition());
		g2.getETypeArguments().add(g3);
		initEAttribute(getKermetaUnit_Aspects(), g1, "aspects", null, 0, 1, KermetaUnit.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_IsBeingTypechecked(), ecorePackage.getEBoolean(), "isBeingTypechecked", null, 0, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_TypeDefinitionCache(), this.getTypeDefinitionCache(), this.getTypeDefinitionCache_KermetaUnit(), "typeDefinitionCache", null, 1, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnit_KermetaUnitRequires(), this.getKermetaUnitRequire(), null, "kermetaUnitRequires", null, 0, -1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKermetaUnit_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, KermetaUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theStructurePackage.getTypeDefinition());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theStructurePackage.getTypeDefinition());
		g2.getETypeArguments().add(g3);
		initEAttribute(getKermetaUnit_BaseAspects(), g1, "baseAspects", null, 0, 1, KermetaUnit.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(kermetaUnitEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "addInternalPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "addInternalPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "findInternalpackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getRequire(), "addRequire", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKermetaUnit(), "kermetaUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getUsing(), "addUsing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEString(), "getRequires", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "importKermetaUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKermetaUnit(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "force", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "recursive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "addExternalPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getPackage(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "getPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "getInternalPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "getExternalPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getTypeDefinition(), "getInternalTypeDefinitionByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "getPackages", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "getInternalPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getPackage(), "getExternalPackage", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEBoolean(), "isLoading", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEBoolean(), "isErroneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "storeTrace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getObject(), "getModelElementByNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, ecorePackage.getEJavaObject(), "getNodeByModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEString(), "getUsings", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEBoolean(), "isWarned", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "parsingError", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getANTLRException(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEString(), "getUniquePackageQualifiedNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, null, "addTypeDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getTypeDefinition(), "typeDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getTypeDefinitionContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, ecorePackage.getEBoolean(), "isIndirectlyErroneous", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, null, "lock", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, this.getKermetaUnit(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kermetaUnitEClass, null, "fillTypeDefinitionCache", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iBuildingStateEClass, IBuildingState.class, "IBuildingState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kermetaUnitStorerEClass, KermetaUnitStorer.class, "KermetaUnitStorer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermetaUnitStorer_KermetaUnits(), this.getKermetaUnit(), this.getKermetaUnit_Storer(), "kermetaUnits", null, 0, -1, KermetaUnitStorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnitStorer_KermetaUnitsBeingLoaded(), this.getKermetaUnit(), null, "kermetaUnitsBeingLoaded", null, 0, -1, KermetaUnitStorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnitStorer_KermetaUnitsBeingUnloaded(), this.getKermetaUnit(), null, "kermetaUnitsBeingUnloaded", null, 0, -1, KermetaUnitStorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(kermetaUnitStorerEClass, this.getKermetaUnit(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitStorerEClass, this.getKermetaUnit(), "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitStorerEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kermetaUnitStorerEClass, null, "unload", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageEntryEClass, PackageEntry.class, "PackageEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageEntry_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, PackageEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageEntry_Package(), theStructurePackage.getPackage(), null, "package", null, 1, 1, PackageEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kermetaUnitLoaderEClass, KermetaUnitLoader.class, "KermetaUnitLoader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermetaUnitLoader_KermetaUnits(), this.getKermetaUnit(), null, "kermetaUnits", null, 0, -1, KermetaUnitLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(kermetaUnitLoaderEClass, this.getKermetaUnit(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Value(), ecorePackage.getEString(), "value", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Target(), ecorePackage.getEJavaObject(), "target", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorMessageEClass, ErrorMessage.class, "ErrorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(warningMessageEClass, WarningMessage.class, "WarningMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parseErrorMessageEClass, ParseErrorMessage.class, "ParseErrorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParseErrorMessage_Node(), this.getASTNode(), "node", null, 0, 1, ParseErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parsingErrorEClass, ParsingError.class, "ParsingError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParsingError_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1, ParsingError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParsingError_Length(), ecorePackage.getEInt(), "length", null, 0, 1, ParsingError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParsingError_LineNumber(), ecorePackage.getEInt(), "lineNumber", null, 0, 1, ParsingError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionCacheEClass, TypeDefinitionCache.class, "TypeDefinitionCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinitionCache_KermetaUnit(), this.getKermetaUnit(), this.getKermetaUnit_TypeDefinitionCache(), "kermetaUnit", null, 1, 1, TypeDefinitionCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTypeDefinitionCacheEntry());
		g1.getETypeArguments().add(g2);
		initEAttribute(getTypeDefinitionCache_Entries(), g1, "entries", null, 1, 1, TypeDefinitionCache.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDefinitionCache_ExternalSearchAuthorized(), ecorePackage.getEBoolean(), "externalSearchAuthorized", null, 1, 1, TypeDefinitionCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(typeDefinitionCacheEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeDefinitionCacheEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeDefinitionCacheEClass, null, "addTypeDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getTypeDefinition(), "typeDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeDefinitionCacheEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeDefinitionCacheEClass, theStructurePackage.getTypeDefinition(), "getTypeDefinitionByQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeDefinitionCacheEntryEClass, TypeDefinitionCacheEntry.class, "TypeDefinitionCacheEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinitionCacheEntry_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, TypeDefinitionCacheEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinitionCacheEntry_TypeDefinition(), theStructurePackage.getTypeDefinition(), null, "typeDefinition", null, 1, 1, TypeDefinitionCacheEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kermetaUnitRequireEClass, KermetaUnitRequire.class, "KermetaUnitRequire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermetaUnitRequire_KermetaUnit(), this.getKermetaUnit(), null, "kermetaUnit", null, 1, 1, KermetaUnitRequire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaUnitRequire_Require(), theStructurePackage.getRequire(), null, "require", null, 1, 1, KermetaUnitRequire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tracerEDataType, Tracer.class, "Tracer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(astNodeEDataType, ASTNode.class, "ASTNode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(antlrExceptionEDataType, ANTLRException.class, "ANTLRException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioPluginEDataType, IOPlugin.class, "IOPlugin", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IoPackageImpl
