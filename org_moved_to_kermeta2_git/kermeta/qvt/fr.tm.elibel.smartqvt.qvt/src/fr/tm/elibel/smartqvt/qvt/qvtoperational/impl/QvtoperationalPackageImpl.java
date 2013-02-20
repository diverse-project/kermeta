/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.impl;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;

import fr.tm.elibel.smartqvt.qvt.emof.impl.EmofPackageImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;

import fr.tm.elibel.smartqvt.qvt.essentialocl.impl.EssentialoclPackageImpl;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.impl.ImperativeoclPackageImpl;

import fr.tm.elibel.smartqvt.qvt.primitivetypes.PrimitivetypesPackage;

import fr.tm.elibel.smartqvt.qvt.primitivetypes.impl.PrimitivetypesPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;

import fr.tm.elibel.smartqvt.qvt.qvtbase.impl.QvtbasePackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;

import fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.Constructor;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ConstructorBody;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.Library;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelParameter;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.Module;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalFactory;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.impl.QvttemplatePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QvtoperationalPackageImpl extends EPackageImpl implements QvtoperationalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveInExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importKindEEnum = null;

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
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QvtoperationalPackageImpl() {
		super(eNS_URI, QvtoperationalFactory.eINSTANCE);
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
	public static QvtoperationalPackage init() {
		if (isInited) return (QvtoperationalPackage)EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI);

		// Obtain or create and register package
		QvtoperationalPackageImpl theQvtoperationalPackage = (QvtoperationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QvtoperationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QvtoperationalPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EmofPackageImpl theEmofPackage = (EmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) instanceof EmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) : EmofPackage.eINSTANCE);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) : PrimitivetypesPackage.eINSTANCE);
		EssentialoclPackageImpl theEssentialoclPackage = (EssentialoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) instanceof EssentialoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) : EssentialoclPackage.eINSTANCE);
		ImperativeoclPackageImpl theImperativeoclPackage = (ImperativeoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) instanceof ImperativeoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) : ImperativeoclPackage.eINSTANCE);
		QvtbasePackageImpl theQvtbasePackage = (QvtbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI) instanceof QvtbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI) : QvtbasePackage.eINSTANCE);
		QvttemplatePackageImpl theQvttemplatePackage = (QvttemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) instanceof QvttemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) : QvttemplatePackage.eINSTANCE);
		QvtrelationPackageImpl theQvtrelationPackage = (QvtrelationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI) instanceof QvtrelationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI) : QvtrelationPackage.eINSTANCE);
		QvtcorePackageImpl theQvtcorePackage = (QvtcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI) instanceof QvtcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI) : QvtcorePackage.eINSTANCE);

		// Create package meta-data objects
		theQvtoperationalPackage.createPackageContents();
		theEmofPackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();
		theEssentialoclPackage.createPackageContents();
		theImperativeoclPackage.createPackageContents();
		theQvtbasePackage.createPackageContents();
		theQvttemplatePackage.createPackageContents();
		theQvtrelationPackage.createPackageContents();
		theQvtcorePackage.createPackageContents();

		// Initialize created meta-data
		theQvtoperationalPackage.initializePackageContents();
		theEmofPackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();
		theEssentialoclPackage.initializePackageContents();
		theImperativeoclPackage.initializePackageContents();
		theQvtbasePackage.initializePackageContents();
		theQvttemplatePackage.initializePackageContents();
		theQvtrelationPackage.initializePackageContents();
		theQvtcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQvtoperationalPackage.freeze();

		return theQvtoperationalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorBody() {
		return constructorBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualProperty() {
		return contextualPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualProperty_Context() {
		return (EReference)contextualPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualProperty_InitExpression() {
		return (EReference)contextualPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualProperty_Overridden() {
		return (EReference)contextualPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryOperation() {
		return entryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelper() {
		return helperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelper_IsQuery() {
		return (EAttribute)helperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeCallExp() {
		return imperativeCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImperativeCallExp_IsVirtual() {
		return (EAttribute)imperativeCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeOperation() {
		return imperativeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Body() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Context() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImperativeOperation_IsBlackbox() {
		return (EAttribute)imperativeOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Overridden() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Result() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingBody() {
		return mappingBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBody_EndSection() {
		return (EReference)mappingBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBody_InitSection() {
		return (EReference)mappingBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingCallExp() {
		return mappingCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingCallExp_IsStrict() {
		return (EAttribute)mappingCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingOperation() {
		return mappingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Disjunct() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Inherited() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Merged() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_RefinedRelation() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_When() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Where() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingParameter() {
		return mappingParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingParameter_Extent() {
		return (EReference)mappingParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingParameter_ReferredDomain() {
		return (EReference)mappingParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelParameter() {
		return modelParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_AdditionalCondition() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_ConformanceKind() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Metamodel() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ConfigProperty() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Entry() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_IsBlackbox() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleImport() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_OwnedTag() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_OwnedVariable() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_UsedModelType() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleImport() {
		return moduleImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_Binding() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_ImportedModule() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImport_Kind() {
		return (EAttribute)moduleImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_Module() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExp() {
		return objectExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExp_Body() {
		return (EReference)objectExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExp_ReferredObject() {
		return (EReference)objectExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationBody() {
		return operationBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBody_Content() {
		return (EReference)operationBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBody_Operation() {
		return (EReference)operationBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBody_Variable() {
		return (EReference)operationBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalTransformation() {
		return operationalTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_IntermediateClass() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_IntermediateProperty() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_ModelParameter() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_Refined() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_Relation() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveExp() {
		return resolveExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveExp_Condition() {
		return (EReference)resolveExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExp_IsDeferred() {
		return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExp_IsInverse() {
		return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExp_One() {
		return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveExp_Target() {
		return (EReference)resolveExpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveInExp() {
		return resolveInExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveInExp_InMapping() {
		return (EReference)resolveInExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarParameter() {
		return varParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarParameter_CtxOwner() {
		return (EReference)varParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarParameter_Kind() {
		return (EAttribute)varParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarParameter_ResOwner() {
		return (EReference)varParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKind() {
		return directionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportKind() {
		return importKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtoperationalFactory getQvtoperationalFactory() {
		return (QvtoperationalFactory)getEFactoryInstance();
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
		constructorEClass = createEClass(CONSTRUCTOR);

		constructorBodyEClass = createEClass(CONSTRUCTOR_BODY);

		contextualPropertyEClass = createEClass(CONTEXTUAL_PROPERTY);
		createEReference(contextualPropertyEClass, CONTEXTUAL_PROPERTY__CONTEXT);
		createEReference(contextualPropertyEClass, CONTEXTUAL_PROPERTY__INIT_EXPRESSION);
		createEReference(contextualPropertyEClass, CONTEXTUAL_PROPERTY__OVERRIDDEN);

		entryOperationEClass = createEClass(ENTRY_OPERATION);

		helperEClass = createEClass(HELPER);
		createEAttribute(helperEClass, HELPER__IS_QUERY);

		imperativeCallExpEClass = createEClass(IMPERATIVE_CALL_EXP);
		createEAttribute(imperativeCallExpEClass, IMPERATIVE_CALL_EXP__IS_VIRTUAL);

		imperativeOperationEClass = createEClass(IMPERATIVE_OPERATION);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__BODY);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__CONTEXT);
		createEAttribute(imperativeOperationEClass, IMPERATIVE_OPERATION__IS_BLACKBOX);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__OVERRIDDEN);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__RESULT);

		libraryEClass = createEClass(LIBRARY);

		mappingBodyEClass = createEClass(MAPPING_BODY);
		createEReference(mappingBodyEClass, MAPPING_BODY__END_SECTION);
		createEReference(mappingBodyEClass, MAPPING_BODY__INIT_SECTION);

		mappingCallExpEClass = createEClass(MAPPING_CALL_EXP);
		createEAttribute(mappingCallExpEClass, MAPPING_CALL_EXP__IS_STRICT);

		mappingOperationEClass = createEClass(MAPPING_OPERATION);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__DISJUNCT);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__INHERITED);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__MERGED);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__REFINED_RELATION);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__WHEN);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__WHERE);

		mappingParameterEClass = createEClass(MAPPING_PARAMETER);
		createEReference(mappingParameterEClass, MAPPING_PARAMETER__EXTENT);
		createEReference(mappingParameterEClass, MAPPING_PARAMETER__REFERRED_DOMAIN);

		modelParameterEClass = createEClass(MODEL_PARAMETER);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__ADDITIONAL_CONDITION);
		createEAttribute(modelTypeEClass, MODEL_TYPE__CONFORMANCE_KIND);
		createEReference(modelTypeEClass, MODEL_TYPE__METAMODEL);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__CONFIG_PROPERTY);
		createEReference(moduleEClass, MODULE__ENTRY);
		createEAttribute(moduleEClass, MODULE__IS_BLACKBOX);
		createEReference(moduleEClass, MODULE__MODULE_IMPORT);
		createEReference(moduleEClass, MODULE__OWNED_TAG);
		createEReference(moduleEClass, MODULE__OWNED_VARIABLE);
		createEReference(moduleEClass, MODULE__USED_MODEL_TYPE);

		moduleImportEClass = createEClass(MODULE_IMPORT);
		createEReference(moduleImportEClass, MODULE_IMPORT__BINDING);
		createEReference(moduleImportEClass, MODULE_IMPORT__IMPORTED_MODULE);
		createEAttribute(moduleImportEClass, MODULE_IMPORT__KIND);
		createEReference(moduleImportEClass, MODULE_IMPORT__MODULE);

		objectExpEClass = createEClass(OBJECT_EXP);
		createEReference(objectExpEClass, OBJECT_EXP__BODY);
		createEReference(objectExpEClass, OBJECT_EXP__REFERRED_OBJECT);

		operationBodyEClass = createEClass(OPERATION_BODY);
		createEReference(operationBodyEClass, OPERATION_BODY__CONTENT);
		createEReference(operationBodyEClass, OPERATION_BODY__OPERATION);
		createEReference(operationBodyEClass, OPERATION_BODY__VARIABLE);

		operationalTransformationEClass = createEClass(OPERATIONAL_TRANSFORMATION);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__REFINED);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__RELATION);

		resolveExpEClass = createEClass(RESOLVE_EXP);
		createEReference(resolveExpEClass, RESOLVE_EXP__CONDITION);
		createEAttribute(resolveExpEClass, RESOLVE_EXP__IS_DEFERRED);
		createEAttribute(resolveExpEClass, RESOLVE_EXP__IS_INVERSE);
		createEAttribute(resolveExpEClass, RESOLVE_EXP__ONE);
		createEReference(resolveExpEClass, RESOLVE_EXP__TARGET);

		resolveInExpEClass = createEClass(RESOLVE_IN_EXP);
		createEReference(resolveInExpEClass, RESOLVE_IN_EXP__IN_MAPPING);

		varParameterEClass = createEClass(VAR_PARAMETER);
		createEReference(varParameterEClass, VAR_PARAMETER__CTX_OWNER);
		createEAttribute(varParameterEClass, VAR_PARAMETER__KIND);
		createEReference(varParameterEClass, VAR_PARAMETER__RES_OWNER);

		// Create enums
		directionKindEEnum = createEEnum(DIRECTION_KIND);
		importKindEEnum = createEEnum(IMPORT_KIND);
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
		EmofPackage theEmofPackage = (EmofPackage)EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI);
		EssentialoclPackage theEssentialoclPackage = (EssentialoclPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		QvtrelationPackage theQvtrelationPackage = (QvtrelationPackage)EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI);
		ImperativeoclPackage theImperativeoclPackage = (ImperativeoclPackage)EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI);

		// Add supertypes to classes
		constructorEClass.getESuperTypes().add(this.getImperativeOperation());
		constructorBodyEClass.getESuperTypes().add(this.getOperationBody());
		contextualPropertyEClass.getESuperTypes().add(theEmofPackage.getProperty());
		entryOperationEClass.getESuperTypes().add(this.getImperativeOperation());
		helperEClass.getESuperTypes().add(this.getImperativeOperation());
		imperativeCallExpEClass.getESuperTypes().add(theEssentialoclPackage.getOperationCallExp());
		imperativeOperationEClass.getESuperTypes().add(theEmofPackage.getOperation());
		libraryEClass.getESuperTypes().add(this.getModule());
		mappingBodyEClass.getESuperTypes().add(this.getOperationBody());
		mappingCallExpEClass.getESuperTypes().add(this.getImperativeCallExp());
		mappingOperationEClass.getESuperTypes().add(this.getImperativeOperation());
		mappingParameterEClass.getESuperTypes().add(this.getVarParameter());
		modelParameterEClass.getESuperTypes().add(this.getVarParameter());
		modelTypeEClass.getESuperTypes().add(theEmofPackage.getClass_());
		moduleEClass.getESuperTypes().add(theEmofPackage.getClass_());
		moduleEClass.getESuperTypes().add(theEmofPackage.getPackage());
		moduleImportEClass.getESuperTypes().add(theEmofPackage.getElement());
		objectExpEClass.getESuperTypes().add(theImperativeoclPackage.getInstantiationExp());
		operationBodyEClass.getESuperTypes().add(theEmofPackage.getElement());
		operationalTransformationEClass.getESuperTypes().add(this.getModule());
		resolveExpEClass.getESuperTypes().add(theEssentialoclPackage.getCallExp());
		resolveInExpEClass.getESuperTypes().add(this.getResolveExp());
		varParameterEClass.getESuperTypes().add(theEssentialoclPackage.getVariable());
		varParameterEClass.getESuperTypes().add(theEmofPackage.getParameter());

		// Initialize classes and features; add operations and parameters
		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorBodyEClass, ConstructorBody.class, "ConstructorBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualPropertyEClass, ContextualProperty.class, "ContextualProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextualProperty_Context(), theEmofPackage.getClass_(), null, "context", null, 1, 1, ContextualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextualProperty_InitExpression(), theEssentialoclPackage.getOclExpression(), null, "initExpression", null, 0, 1, ContextualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextualProperty_Overridden(), theEmofPackage.getProperty(), null, "overridden", null, 1, 1, ContextualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entryOperationEClass, EntryOperation.class, "EntryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelper_IsQuery(), thePrimitivetypesPackage.getBoolean(), "isQuery", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imperativeCallExpEClass, ImperativeCallExp.class, "ImperativeCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImperativeCallExp_IsVirtual(), thePrimitivetypesPackage.getBoolean(), "isVirtual", null, 0, 1, ImperativeCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imperativeOperationEClass, ImperativeOperation.class, "ImperativeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImperativeOperation_Body(), this.getOperationBody(), this.getOperationBody_Operation(), "body", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImperativeOperation_Context(), this.getVarParameter(), this.getVarParameter_CtxOwner(), "context", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImperativeOperation_IsBlackbox(), thePrimitivetypesPackage.getBoolean(), "isBlackbox", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeOperation_Overridden(), this.getImperativeOperation(), null, "overridden", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImperativeOperation_Result(), this.getVarParameter(), this.getVarParameter_ResOwner(), "result", null, 0, -1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingBodyEClass, MappingBody.class, "MappingBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingBody_EndSection(), theEssentialoclPackage.getOclExpression(), null, "endSection", null, 0, -1, MappingBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingBody_InitSection(), theEssentialoclPackage.getOclExpression(), null, "initSection", null, 0, -1, MappingBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingCallExpEClass, MappingCallExp.class, "MappingCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingCallExp_IsStrict(), thePrimitivetypesPackage.getBoolean(), "isStrict", null, 0, 1, MappingCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingOperationEClass, MappingOperation.class, "MappingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingOperation_Disjunct(), this.getMappingOperation(), null, "disjunct", null, 0, -1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Inherited(), this.getMappingOperation(), null, "inherited", null, 0, -1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Merged(), this.getMappingOperation(), null, "merged", null, 0, -1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_RefinedRelation(), theQvtrelationPackage.getRelation(), null, "refinedRelation", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMappingOperation_When(), theEssentialoclPackage.getOclExpression(), null, "when", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMappingOperation_Where(), theEssentialoclPackage.getOclExpression(), null, "where", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mappingParameterEClass, MappingParameter.class, "MappingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingParameter_Extent(), this.getModelParameter(), null, "extent", null, 0, 1, MappingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMappingParameter_ReferredDomain(), theQvtrelationPackage.getRelationDomain(), null, "referredDomain", null, 0, 1, MappingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelParameterEClass, ModelParameter.class, "ModelParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_AdditionalCondition(), theEssentialoclPackage.getOclExpression(), null, "additionalCondition", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelType_ConformanceKind(), thePrimitivetypesPackage.getString(), "conformanceKind", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Metamodel(), theEmofPackage.getPackage(), null, "metamodel", null, 1, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ConfigProperty(), theEmofPackage.getProperty(), null, "configProperty", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Entry(), this.getEntryOperation(), null, "entry", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModule_IsBlackbox(), thePrimitivetypesPackage.getBoolean(), "isBlackbox", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModuleImport(), this.getModuleImport(), this.getModuleImport_Module(), "moduleImport", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_OwnedTag(), theEmofPackage.getTag(), null, "ownedTag", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_OwnedVariable(), theEssentialoclPackage.getVariable(), null, "ownedVariable", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_UsedModelType(), this.getModelType(), null, "usedModelType", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleImportEClass, ModuleImport.class, "ModuleImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleImport_Binding(), this.getModelType(), null, "binding", null, 0, -1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImport_ImportedModule(), this.getModule(), null, "importedModule", null, 1, 1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModuleImport_Kind(), this.getImportKind(), "kind", null, 0, 1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImport_Module(), this.getModule(), this.getModule_ModuleImport(), "module", null, 0, 1, ModuleImport.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectExpEClass, ObjectExp.class, "ObjectExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectExp_Body(), this.getConstructorBody(), null, "body", null, 1, 1, ObjectExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectExp_ReferredObject(), theEssentialoclPackage.getVariable(), null, "referredObject", null, 1, 1, ObjectExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationBodyEClass, OperationBody.class, "OperationBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationBody_Content(), theEssentialoclPackage.getOclExpression(), null, "content", null, 0, -1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationBody_Operation(), this.getImperativeOperation(), this.getImperativeOperation_Body(), "operation", null, 0, 1, OperationBody.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationBody_Variable(), theEssentialoclPackage.getVariable(), null, "variable", null, 0, -1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationalTransformationEClass, OperationalTransformation.class, "OperationalTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalTransformation_IntermediateClass(), theEmofPackage.getClass_(), null, "intermediateClass", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_IntermediateProperty(), theEmofPackage.getProperty(), null, "intermediateProperty", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_ModelParameter(), this.getModelParameter(), null, "modelParameter", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_Refined(), theQvtrelationPackage.getRelationalTransformation(), null, "refined", null, 0, 1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationalTransformation_Relation(), theQvtrelationPackage.getRelation(), null, "relation", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveExpEClass, ResolveExp.class, "ResolveExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveExp_Condition(), theEssentialoclPackage.getOclExpression(), null, "condition", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResolveExp_IsDeferred(), thePrimitivetypesPackage.getBoolean(), "isDeferred", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveExp_IsInverse(), thePrimitivetypesPackage.getBoolean(), "isInverse", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveExp_One(), thePrimitivetypesPackage.getBoolean(), "one", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolveExp_Target(), theEssentialoclPackage.getVariable(), null, "target", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resolveInExpEClass, ResolveInExp.class, "ResolveInExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveInExp_InMapping(), this.getMappingOperation(), null, "inMapping", null, 0, 1, ResolveInExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(varParameterEClass, VarParameter.class, "VarParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarParameter_CtxOwner(), this.getImperativeOperation(), this.getImperativeOperation_Context(), "ctxOwner", null, 0, 1, VarParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVarParameter_Kind(), this.getDirectionKind(), "kind", null, 0, 1, VarParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarParameter_ResOwner(), this.getImperativeOperation(), this.getImperativeOperation_Result(), "resOwner", null, 0, 1, VarParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
		addEEnumLiteral(directionKindEEnum, DirectionKind.IN_LITERAL);
		addEEnumLiteral(directionKindEEnum, DirectionKind.INOUT_LITERAL);
		addEEnumLiteral(directionKindEEnum, DirectionKind.OUT_LITERAL);

		initEEnum(importKindEEnum, ImportKind.class, "ImportKind");
		addEEnumLiteral(importKindEEnum, ImportKind.EXTENSION_LITERAL);
		addEEnumLiteral(importKindEEnum, ImportKind.ACCESS_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //QvtoperationalPackageImpl
