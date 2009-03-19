/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationPackageImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import emf.spoon.SpoonPackage;
import emf.spoon.facade.FacadePackage;
import emf.spoon.facade.impl.FacadePackageImpl;
import emf.spoon.impl.SpoonPackageImpl;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.impl.CodePackageImpl;
import emf.spoon.reflect.declaration.CtAnnotation;
import emf.spoon.reflect.declaration.CtAnnotationElementValue;
import emf.spoon.reflect.declaration.CtAnnotationType;
import emf.spoon.reflect.declaration.CtAnonymousExecutable;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.CtConstructor;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtEnum;
import emf.spoon.reflect.declaration.CtExecutable;
import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.declaration.CtGenericElement;
import emf.spoon.reflect.declaration.CtInterface;
import emf.spoon.reflect.declaration.CtMethod;
import emf.spoon.reflect.declaration.CtModifiable;
import emf.spoon.reflect.declaration.CtNamedElement;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.CtParameter;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.declaration.CtType;
import emf.spoon.reflect.declaration.CtTypeParameter;
import emf.spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.declaration.CtVariable;
import emf.spoon.reflect.declaration.DeclarationFactory;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.ReferencePackage;
import emf.spoon.reflect.reference.impl.ReferencePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationPackageImpl extends EPackageImpl implements DeclarationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAnonymousExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctGenericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctModifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcePositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctAnnotationElementValueEClass = null;

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
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeclarationPackageImpl() {
		super(eNS_URI, DeclarationFactory.eINSTANCE);
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
	public static DeclarationPackage init() {
		if (isInited) return (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);

		// Obtain or create and register package
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DeclarationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SpoonPackageImpl theSpoonPackage = (SpoonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) instanceof SpoonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) : SpoonPackage.eINSTANCE);
		ReferencePackageImpl theReferencePackage = (ReferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI) instanceof ReferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI) : ReferencePackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);

		// Create package meta-data objects
		theDeclarationPackage.createPackageContents();
		theSpoonPackage.createPackageContents();
		theReferencePackage.createPackageContents();
		theCodePackage.createPackageContents();
		theFacadePackage.createPackageContents();

		// Initialize created meta-data
		theDeclarationPackage.initializePackageContents();
		theSpoonPackage.initializePackageContents();
		theReferencePackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theFacadePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeclarationPackage.freeze();

		return theDeclarationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAnnotation() {
		return ctAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAnnotation_AnnotationType() {
		return (EReference)ctAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtAnnotation_ActualAnnotation() {
		return (EAttribute)ctAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAnnotation_ElementsVal() {
		return (EReference)ctAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAnnotationType() {
		return ctAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAnonymousExecutable() {
		return ctAnonymousExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAnonymousExecutable_Body() {
		return (EReference)ctAnonymousExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAnonymousExecutable_OwnerClass() {
		return (EReference)ctAnonymousExecutableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtClass() {
		return ctClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtClass_Superclass() {
		return (EReference)ctClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtClass_AnonymousExecutables() {
		return (EReference)ctClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtClass_Constructors() {
		return (EReference)ctClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtConstructor() {
		return ctConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtElement() {
		return ctElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtElement_Annotations() {
		return (EReference)ctElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtElement_Position() {
		return (EReference)ctElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtElement_DocComment() {
		return (EAttribute)ctElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtElement_Parent() {
		return (EReference)ctElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtEnum() {
		return ctEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtExecutable() {
		return ctExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtExecutable_EXECUTABLE_SEPARATOR() {
		return (EAttribute)ctExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutable_Parameters() {
		return (EReference)ctExecutableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutable_Body() {
		return (EReference)ctExecutableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutable_ThrownTypes() {
		return (EReference)ctExecutableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutable_DeclaringType() {
		return (EReference)ctExecutableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtField() {
		return ctFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtField_FIELD_SEPARATOR() {
		return (EAttribute)ctFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtField_DeclaringType() {
		return (EReference)ctFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtGenericElement() {
		return ctGenericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtGenericElement_FormalTypeParameters() {
		return (EReference)ctGenericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtInterface() {
		return ctInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtMethod() {
		return ctMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtModifiable() {
		return ctModifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtModifiable_Modifiers() {
		return (EAttribute)ctModifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtNamedElement() {
		return ctNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtNamedElement_SimpleName() {
		return (EAttribute)ctNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtNamedElement_Reference() {
		return (EReference)ctNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtPackage() {
		return ctPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtPackage_PACKAGE_SEPARATOR() {
		return (EAttribute)ctPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtPackage_TOP_LEVEL_PACKAGE_NAME() {
		return (EAttribute)ctPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtPackage_Packages() {
		return (EReference)ctPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtPackage_Types() {
		return (EReference)ctPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtPackage_QualifiedName() {
		return (EAttribute)ctPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtPackage_DeclaringPackage() {
		return (EReference)ctPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtParameter() {
		return ctParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtParameter_VarArgs() {
		return (EAttribute)ctParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtSimpleType() {
		return ctSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtSimpleType_INNERTTYPE_SEPARATOR() {
		return (EAttribute)ctSimpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSimpleType_Fields() {
		return (EReference)ctSimpleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSimpleType_NestedTypes() {
		return (EReference)ctSimpleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtSimpleType_ActualClass() {
		return (EAttribute)ctSimpleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSimpleType_DeclaringType() {
		return (EReference)ctSimpleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSimpleType_AllFields() {
		return (EReference)ctSimpleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtSimpleType_TopLevel() {
		return (EAttribute)ctSimpleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtSimpleType_Package() {
		return (EReference)ctSimpleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtSimpleType_QualifiedName() {
		return (EAttribute)ctSimpleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtType() {
		return ctTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtType_Methods() {
		return (EReference)ctTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtType_Superinterfaces() {
		return (EReference)ctTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtType_AllMethods() {
		return (EReference)ctTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtTypeParameter() {
		return ctTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtTypeParameter_Name() {
		return (EAttribute)ctTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTypeParameter_Bounds() {
		return (EReference)ctTypeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtTypedElement() {
		return ctTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTypedElement_Type() {
		return (EReference)ctTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtVariable() {
		return ctVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtVariable_DefaultExpression() {
		return (EReference)ctVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcePosition() {
		return sourcePositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePosition_Line() {
		return (EAttribute)sourcePositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePosition_Column() {
		return (EAttribute)sourcePositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePosition_File() {
		return (EAttribute)sourcePositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtAnnotationElementValue() {
		return ctAnnotationElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtAnnotationElementValue_Key() {
		return (EAttribute)ctAnnotationElementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtAnnotationElementValue_ValueString() {
		return (EAttribute)ctAnnotationElementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAnnotationElementValue_ValueRef() {
		return (EReference)ctAnnotationElementValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtAnnotationElementValue_ValueElement() {
		return (EReference)ctAnnotationElementValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtAnnotationElementValue_Many() {
		return (EAttribute)ctAnnotationElementValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactory getDeclarationFactory() {
		return (DeclarationFactory)getEFactoryInstance();
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
		ctAnnotationEClass = createEClass(CT_ANNOTATION);
		createEReference(ctAnnotationEClass, CT_ANNOTATION__ANNOTATION_TYPE);
		createEAttribute(ctAnnotationEClass, CT_ANNOTATION__ACTUAL_ANNOTATION);
		createEReference(ctAnnotationEClass, CT_ANNOTATION__ELEMENTS_VAL);

		ctAnnotationTypeEClass = createEClass(CT_ANNOTATION_TYPE);

		ctAnonymousExecutableEClass = createEClass(CT_ANONYMOUS_EXECUTABLE);
		createEReference(ctAnonymousExecutableEClass, CT_ANONYMOUS_EXECUTABLE__BODY);
		createEReference(ctAnonymousExecutableEClass, CT_ANONYMOUS_EXECUTABLE__OWNER_CLASS);

		ctClassEClass = createEClass(CT_CLASS);
		createEReference(ctClassEClass, CT_CLASS__SUPERCLASS);
		createEReference(ctClassEClass, CT_CLASS__ANONYMOUS_EXECUTABLES);
		createEReference(ctClassEClass, CT_CLASS__CONSTRUCTORS);

		ctConstructorEClass = createEClass(CT_CONSTRUCTOR);

		ctElementEClass = createEClass(CT_ELEMENT);
		createEReference(ctElementEClass, CT_ELEMENT__ANNOTATIONS);
		createEReference(ctElementEClass, CT_ELEMENT__POSITION);
		createEAttribute(ctElementEClass, CT_ELEMENT__DOC_COMMENT);
		createEReference(ctElementEClass, CT_ELEMENT__PARENT);

		ctEnumEClass = createEClass(CT_ENUM);

		ctExecutableEClass = createEClass(CT_EXECUTABLE);
		createEAttribute(ctExecutableEClass, CT_EXECUTABLE__EXECUTABLE_SEPARATOR);
		createEReference(ctExecutableEClass, CT_EXECUTABLE__PARAMETERS);
		createEReference(ctExecutableEClass, CT_EXECUTABLE__BODY);
		createEReference(ctExecutableEClass, CT_EXECUTABLE__THROWN_TYPES);
		createEReference(ctExecutableEClass, CT_EXECUTABLE__DECLARING_TYPE);

		ctFieldEClass = createEClass(CT_FIELD);
		createEAttribute(ctFieldEClass, CT_FIELD__FIELD_SEPARATOR);
		createEReference(ctFieldEClass, CT_FIELD__DECLARING_TYPE);

		ctGenericElementEClass = createEClass(CT_GENERIC_ELEMENT);
		createEReference(ctGenericElementEClass, CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS);

		ctInterfaceEClass = createEClass(CT_INTERFACE);

		ctMethodEClass = createEClass(CT_METHOD);

		ctModifiableEClass = createEClass(CT_MODIFIABLE);
		createEAttribute(ctModifiableEClass, CT_MODIFIABLE__MODIFIERS);

		ctNamedElementEClass = createEClass(CT_NAMED_ELEMENT);
		createEAttribute(ctNamedElementEClass, CT_NAMED_ELEMENT__SIMPLE_NAME);
		createEReference(ctNamedElementEClass, CT_NAMED_ELEMENT__REFERENCE);

		ctPackageEClass = createEClass(CT_PACKAGE);
		createEAttribute(ctPackageEClass, CT_PACKAGE__PACKAGE_SEPARATOR);
		createEAttribute(ctPackageEClass, CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME);
		createEReference(ctPackageEClass, CT_PACKAGE__PACKAGES);
		createEReference(ctPackageEClass, CT_PACKAGE__TYPES);
		createEAttribute(ctPackageEClass, CT_PACKAGE__QUALIFIED_NAME);
		createEReference(ctPackageEClass, CT_PACKAGE__DECLARING_PACKAGE);

		ctParameterEClass = createEClass(CT_PARAMETER);
		createEAttribute(ctParameterEClass, CT_PARAMETER__VAR_ARGS);

		ctSimpleTypeEClass = createEClass(CT_SIMPLE_TYPE);
		createEAttribute(ctSimpleTypeEClass, CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR);
		createEReference(ctSimpleTypeEClass, CT_SIMPLE_TYPE__FIELDS);
		createEReference(ctSimpleTypeEClass, CT_SIMPLE_TYPE__NESTED_TYPES);
		createEAttribute(ctSimpleTypeEClass, CT_SIMPLE_TYPE__ACTUAL_CLASS);
		createEReference(ctSimpleTypeEClass, CT_SIMPLE_TYPE__DECLARING_TYPE);
		createEReference(ctSimpleTypeEClass, CT_SIMPLE_TYPE__ALL_FIELDS);
		createEAttribute(ctSimpleTypeEClass, CT_SIMPLE_TYPE__TOP_LEVEL);
		createEReference(ctSimpleTypeEClass, CT_SIMPLE_TYPE__PACKAGE);
		createEAttribute(ctSimpleTypeEClass, CT_SIMPLE_TYPE__QUALIFIED_NAME);

		ctTypeEClass = createEClass(CT_TYPE);
		createEReference(ctTypeEClass, CT_TYPE__METHODS);
		createEReference(ctTypeEClass, CT_TYPE__SUPERINTERFACES);
		createEReference(ctTypeEClass, CT_TYPE__ALL_METHODS);

		ctTypeParameterEClass = createEClass(CT_TYPE_PARAMETER);
		createEAttribute(ctTypeParameterEClass, CT_TYPE_PARAMETER__NAME);
		createEReference(ctTypeParameterEClass, CT_TYPE_PARAMETER__BOUNDS);

		ctTypedElementEClass = createEClass(CT_TYPED_ELEMENT);
		createEReference(ctTypedElementEClass, CT_TYPED_ELEMENT__TYPE);

		ctVariableEClass = createEClass(CT_VARIABLE);
		createEReference(ctVariableEClass, CT_VARIABLE__DEFAULT_EXPRESSION);

		sourcePositionEClass = createEClass(SOURCE_POSITION);
		createEAttribute(sourcePositionEClass, SOURCE_POSITION__LINE);
		createEAttribute(sourcePositionEClass, SOURCE_POSITION__COLUMN);
		createEAttribute(sourcePositionEClass, SOURCE_POSITION__FILE);

		ctAnnotationElementValueEClass = createEClass(CT_ANNOTATION_ELEMENT_VALUE);
		createEAttribute(ctAnnotationElementValueEClass, CT_ANNOTATION_ELEMENT_VALUE__KEY);
		createEAttribute(ctAnnotationElementValueEClass, CT_ANNOTATION_ELEMENT_VALUE__VALUE_STRING);
		createEReference(ctAnnotationElementValueEClass, CT_ANNOTATION_ELEMENT_VALUE__VALUE_REF);
		createEReference(ctAnnotationElementValueEClass, CT_ANNOTATION_ELEMENT_VALUE__VALUE_ELEMENT);
		createEAttribute(ctAnnotationElementValueEClass, CT_ANNOTATION_ELEMENT_VALUE__MANY);
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
		FacadePackage theFacadePackage = (FacadePackage)EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);
		ReferencePackage theReferencePackage = (ReferencePackage)EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI);
		SpoonPackage theSpoonPackage = (SpoonPackage)EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Add supertypes to classes
		ctAnnotationEClass.getESuperTypes().add(this.getCtElement());
		ctAnnotationEClass.getESuperTypes().add(theFacadePackage.getCtAnnotation());
		ctAnnotationTypeEClass.getESuperTypes().add(this.getCtSimpleType());
		ctAnnotationTypeEClass.getESuperTypes().add(theFacadePackage.getCtAnnotationType());
		ctAnonymousExecutableEClass.getESuperTypes().add(this.getCtElement());
		ctAnonymousExecutableEClass.getESuperTypes().add(this.getCtModifiable());
		ctAnonymousExecutableEClass.getESuperTypes().add(theFacadePackage.getCtAnonymousExecutable());
		ctClassEClass.getESuperTypes().add(this.getCtType());
		ctClassEClass.getESuperTypes().add(theFacadePackage.getCtClass());
		ctConstructorEClass.getESuperTypes().add(this.getCtExecutable());
		ctConstructorEClass.getESuperTypes().add(theFacadePackage.getCtConstructor());
		ctElementEClass.getESuperTypes().add(theFacadePackage.getCtElement());
		ctEnumEClass.getESuperTypes().add(this.getCtType());
		ctEnumEClass.getESuperTypes().add(theFacadePackage.getCtEnum());
		ctExecutableEClass.getESuperTypes().add(this.getCtGenericElement());
		ctExecutableEClass.getESuperTypes().add(this.getCtNamedElement());
		ctExecutableEClass.getESuperTypes().add(theFacadePackage.getCtExecutable());
		ctFieldEClass.getESuperTypes().add(this.getCtNamedElement());
		ctFieldEClass.getESuperTypes().add(this.getCtVariable());
		ctFieldEClass.getESuperTypes().add(theFacadePackage.getCtField());
		ctGenericElementEClass.getESuperTypes().add(this.getCtElement());
		ctGenericElementEClass.getESuperTypes().add(theFacadePackage.getCtGenericElement());
		ctInterfaceEClass.getESuperTypes().add(this.getCtType());
		ctInterfaceEClass.getESuperTypes().add(theFacadePackage.getCtInterface());
		ctMethodEClass.getESuperTypes().add(this.getCtExecutable());
		ctMethodEClass.getESuperTypes().add(this.getCtTypedElement());
		ctMethodEClass.getESuperTypes().add(theFacadePackage.getCtMethod());
		ctModifiableEClass.getESuperTypes().add(theFacadePackage.getCtModifiable());
		ctNamedElementEClass.getESuperTypes().add(this.getCtElement());
		ctNamedElementEClass.getESuperTypes().add(this.getCtModifiable());
		ctNamedElementEClass.getESuperTypes().add(theFacadePackage.getCtNamedElement());
		ctPackageEClass.getESuperTypes().add(this.getCtNamedElement());
		ctPackageEClass.getESuperTypes().add(theFacadePackage.getCtPackage());
		ctParameterEClass.getESuperTypes().add(this.getCtNamedElement());
		ctParameterEClass.getESuperTypes().add(this.getCtVariable());
		ctParameterEClass.getESuperTypes().add(theFacadePackage.getCtParameter());
		ctSimpleTypeEClass.getESuperTypes().add(this.getCtNamedElement());
		ctSimpleTypeEClass.getESuperTypes().add(theFacadePackage.getCtSimpleType());
		ctTypeEClass.getESuperTypes().add(this.getCtGenericElement());
		ctTypeEClass.getESuperTypes().add(this.getCtSimpleType());
		ctTypeEClass.getESuperTypes().add(theFacadePackage.getCtType());
		ctTypeParameterEClass.getESuperTypes().add(this.getCtElement());
		ctTypeParameterEClass.getESuperTypes().add(theFacadePackage.getCtTypeParameter());
		ctTypedElementEClass.getESuperTypes().add(theFacadePackage.getCtTypedElement());
		ctVariableEClass.getESuperTypes().add(this.getCtNamedElement());
		ctVariableEClass.getESuperTypes().add(this.getCtTypedElement());
		ctVariableEClass.getESuperTypes().add(theFacadePackage.getCtVariable());
		sourcePositionEClass.getESuperTypes().add(theFacadePackage.getSourcePosition());

		// Initialize classes and features; add operations and parameters
		initEClass(ctAnnotationEClass, CtAnnotation.class, "CtAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtAnnotation_AnnotationType(), theReferencePackage.getCtTypeReference(), null, "AnnotationType", null, 0, 1, CtAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtAnnotation_ActualAnnotation(), theSpoonPackage.getObject(), "ActualAnnotation", null, 0, 1, CtAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAnnotation_ElementsVal(), this.getCtAnnotationElementValue(), null, "ElementsVal", null, 0, -1, CtAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctAnnotationTypeEClass, CtAnnotationType.class, "CtAnnotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctAnonymousExecutableEClass, CtAnonymousExecutable.class, "CtAnonymousExecutable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtAnonymousExecutable_Body(), theCodePackage.getCtBlock(), null, "Body", null, 0, 1, CtAnonymousExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAnonymousExecutable_OwnerClass(), this.getCtClass(), this.getCtClass_AnonymousExecutables(), "OwnerClass", null, 0, 1, CtAnonymousExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctClassEClass, CtClass.class, "CtClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtClass_Superclass(), theReferencePackage.getCtTypeReference(), null, "Superclass", null, 0, 1, CtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtClass_AnonymousExecutables(), this.getCtAnonymousExecutable(), this.getCtAnonymousExecutable_OwnerClass(), "AnonymousExecutables", null, 0, -1, CtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtClass_Constructors(), this.getCtConstructor(), null, "Constructors", null, 0, -1, CtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctConstructorEClass, CtConstructor.class, "CtConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctElementEClass, CtElement.class, "CtElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtElement_Annotations(), this.getCtAnnotation(), null, "Annotations", null, 0, -1, CtElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtElement_Position(), this.getSourcePosition(), null, "Position", null, 0, 1, CtElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtElement_DocComment(), theSpoonPackage.getString(), "DocComment", null, 0, 1, CtElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtElement_Parent(), this.getCtElement(), null, "Parent", null, 0, 1, CtElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctEnumEClass, CtEnum.class, "CtEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctExecutableEClass, CtExecutable.class, "CtExecutable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtExecutable_EXECUTABLE_SEPARATOR(), theSpoonPackage.getString(), "EXECUTABLE_SEPARATOR", null, 0, 1, CtExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtExecutable_Parameters(), this.getCtParameter(), null, "Parameters", null, 0, -1, CtExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtExecutable_Body(), theCodePackage.getCtBlock(), null, "Body", null, 0, 1, CtExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtExecutable_ThrownTypes(), theReferencePackage.getCtTypeReference(), null, "ThrownTypes", null, 0, -1, CtExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtExecutable_DeclaringType(), this.getCtType(), null, "DeclaringType", null, 0, 1, CtExecutable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctFieldEClass, CtField.class, "CtField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtField_FIELD_SEPARATOR(), theSpoonPackage.getString(), "FIELD_SEPARATOR", null, 0, 1, CtField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtField_DeclaringType(), this.getCtSimpleType(), this.getCtSimpleType_Fields(), "DeclaringType", null, 0, 1, CtField.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctGenericElementEClass, CtGenericElement.class, "CtGenericElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtGenericElement_FormalTypeParameters(), theReferencePackage.getCtTypeReference(), null, "FormalTypeParameters", null, 0, -1, CtGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctInterfaceEClass, CtInterface.class, "CtInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctMethodEClass, CtMethod.class, "CtMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctModifiableEClass, CtModifiable.class, "CtModifiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtModifiable_Modifiers(), theSpoonPackage.getModifierKind(), "Modifiers", null, 0, -1, CtModifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctNamedElementEClass, CtNamedElement.class, "CtNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtNamedElement_SimpleName(), theSpoonPackage.getString(), "SimpleName", null, 0, 1, CtNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtNamedElement_Reference(), theReferencePackage.getCtReference(), null, "Reference", null, 0, 1, CtNamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctPackageEClass, CtPackage.class, "CtPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtPackage_PACKAGE_SEPARATOR(), theSpoonPackage.getString(), "PACKAGE_SEPARATOR", null, 0, 1, CtPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtPackage_TOP_LEVEL_PACKAGE_NAME(), theSpoonPackage.getString(), "TOP_LEVEL_PACKAGE_NAME", null, 0, 1, CtPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtPackage_Packages(), this.getCtPackage(), this.getCtPackage_DeclaringPackage(), "Packages", null, 0, -1, CtPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtPackage_Types(), this.getCtSimpleType(), this.getCtSimpleType_Package(), "Types", null, 0, -1, CtPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtPackage_QualifiedName(), theSpoonPackage.getString(), "QualifiedName", "", 0, 1, CtPackage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtPackage_DeclaringPackage(), this.getCtPackage(), this.getCtPackage_Packages(), "DeclaringPackage", null, 0, 1, CtPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctParameterEClass, CtParameter.class, "CtParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtParameter_VarArgs(), theSpoonPackage.getBoolean(), "VarArgs", null, 0, 1, CtParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctSimpleTypeEClass, CtSimpleType.class, "CtSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtSimpleType_INNERTTYPE_SEPARATOR(), theSpoonPackage.getString(), "INNERTTYPE_SEPARATOR", null, 0, 1, CtSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSimpleType_Fields(), this.getCtField(), this.getCtField_DeclaringType(), "Fields", null, 0, -1, CtSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSimpleType_NestedTypes(), this.getCtSimpleType(), this.getCtSimpleType_DeclaringType(), "NestedTypes", null, 0, -1, CtSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtSimpleType_ActualClass(), theSpoonPackage.getClass_(), "ActualClass", null, 0, 1, CtSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSimpleType_DeclaringType(), this.getCtSimpleType(), this.getCtSimpleType_NestedTypes(), "DeclaringType", null, 0, 1, CtSimpleType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSimpleType_AllFields(), this.getCtField(), this.getCtField_DeclaringType(), "AllFields", null, 0, -1, CtSimpleType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtSimpleType_TopLevel(), theSpoonPackage.getBoolean(), "TopLevel", null, 0, 1, CtSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtSimpleType_Package(), this.getCtPackage(), this.getCtPackage_Types(), "Package", null, 0, 1, CtSimpleType.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtSimpleType_QualifiedName(), theSpoonPackage.getString(), "QualifiedName", null, 0, 1, CtSimpleType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTypeEClass, CtType.class, "CtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtType_Methods(), this.getCtMethod(), null, "Methods", null, 0, -1, CtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtType_Superinterfaces(), theReferencePackage.getCtTypeReference(), null, "Superinterfaces", null, 0, -1, CtType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtType_AllMethods(), this.getCtMethod(), null, "AllMethods", null, 0, -1, CtType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTypeParameterEClass, CtTypeParameter.class, "CtTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtTypeParameter_Name(), theSpoonPackage.getString(), "Name", null, 0, 1, CtTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtTypeParameter_Bounds(), theReferencePackage.getCtTypeReference(), null, "Bounds", null, 0, -1, CtTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTypedElementEClass, CtTypedElement.class, "CtTypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtTypedElement_Type(), theReferencePackage.getCtTypeReference(), null, "Type", null, 0, 1, CtTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctVariableEClass, CtVariable.class, "CtVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtVariable_DefaultExpression(), theCodePackage.getCtExpression(), null, "DefaultExpression", null, 0, 1, CtVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcePositionEClass, SourcePosition.class, "SourcePosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourcePosition_Line(), theSpoonPackage.getInteger(), "Line", null, 0, 1, SourcePosition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourcePosition_Column(), theSpoonPackage.getInteger(), "Column", null, 0, 1, SourcePosition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourcePosition_File(), theSpoonPackage.getFile(), "File", null, 0, 1, SourcePosition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctAnnotationElementValueEClass, CtAnnotationElementValue.class, "CtAnnotationElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtAnnotationElementValue_Key(), theSpoonPackage.getString(), "key", null, 0, 1, CtAnnotationElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtAnnotationElementValue_ValueString(), theSpoonPackage.getString(), "valueString", null, 0, -1, CtAnnotationElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAnnotationElementValue_ValueRef(), theReferencePackage.getCtReference(), null, "valueRef", null, 0, -1, CtAnnotationElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtAnnotationElementValue_ValueElement(), this.getCtElement(), null, "valueElement", null, 0, -1, CtAnnotationElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtAnnotationElementValue_Many(), theSpoonPackage.getBoolean(), "Many", null, 0, 1, CtAnnotationElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// SpoonGenerics
		createSpoonGenericsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>SpoonGenerics</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSpoonGenericsAnnotations() {
		String source = "SpoonGenerics";		
		addAnnotation
		  (getCtExecutable_EXECUTABLE_SEPARATOR(), 
		   source, 
		   new String[] {
			 "type", "java.lang.String"
		   });		
		addAnnotation
		  (getCtField_FIELD_SEPARATOR(), 
		   source, 
		   new String[] {
			 "type", "java.lang.String"
		   });		
		addAnnotation
		  (getCtPackage_PACKAGE_SEPARATOR(), 
		   source, 
		   new String[] {
			 "type", "java.lang.String"
		   });		
		addAnnotation
		  (getCtPackage_TOP_LEVEL_PACKAGE_NAME(), 
		   source, 
		   new String[] {
			 "type", "java.lang.String"
		   });		
		addAnnotation
		  (getCtSimpleType_INNERTTYPE_SEPARATOR(), 
		   source, 
		   new String[] {
			 "type", "java.lang.String"
		   });
	}

} //DeclarationPackageImpl
