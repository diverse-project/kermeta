/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_assignment_test004PackageImpl.java,v 1.2 2009-02-17 13:40:51 cfaucher Exp $
 */
package comp_assignment_test004.impl;

import comp_assignment_test004.Comp_assignment_test004Factory;
import comp_assignment_test004.Comp_assignment_test004Package;
import comp_assignment_test004.Main;

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
public class Comp_assignment_test004PackageImpl extends EPackageImpl implements Comp_assignment_test004Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bEClass = null;

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
  private EDataType _KermetaSpecialTypesAlias_EDataType = null;

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
   * @see comp_assignment_test004.Comp_assignment_test004Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Comp_assignment_test004PackageImpl()
  {
    super(eNS_URI, Comp_assignment_test004Factory.eINSTANCE);
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
  public static Comp_assignment_test004Package init()
  {
    if (isInited) return (Comp_assignment_test004Package)EPackage.Registry.INSTANCE.getEPackage(Comp_assignment_test004Package.eNS_URI);

    // Obtain or create and register package
    Comp_assignment_test004PackageImpl theComp_assignment_test004Package = (Comp_assignment_test004PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Comp_assignment_test004PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Comp_assignment_test004PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theComp_assignment_test004Package.createPackageContents();

    // Initialize created meta-data
    theComp_assignment_test004Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theComp_assignment_test004Package.freeze();

    return theComp_assignment_test004Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMain()
  {
    return mainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getA()
  {
    return aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getA_Name()
  {
    return (EAttribute)aEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getA_B()
  {
    return (EReference)aEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getB()
  {
    return bEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getString()
  {
    return stringEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType get_KermetaSpecialTypesAlias_()
  {
    return _KermetaSpecialTypesAlias_EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_assignment_test004Factory getComp_assignment_test004Factory()
  {
    return (Comp_assignment_test004Factory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mainEClass = createEClass(MAIN);

    aEClass = createEClass(A);
    createEAttribute(aEClass, A__NAME);
    createEReference(aEClass, A__B);

    bEClass = createEClass(B);

    // Create data types
    stringEDataType = createEDataType(STRING);
    _KermetaSpecialTypesAlias_EDataType = createEDataType(_KERMETA_SPECIAL_TYPES_ALIAS_);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(mainEClass, null, "main", 0, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(aEClass, comp_assignment_test004.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getA_Name(), this.getString(), "name", null, 0, 1, comp_assignment_test004.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getA_B(), this.getB(), null, "b", null, 0, -1, comp_assignment_test004.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bEClass, comp_assignment_test004.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize data types
    initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(_KermetaSpecialTypesAlias_EDataType, Object.class, "_KermetaSpecialTypesAlias_", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // kermeta
    createKermetaAnnotations();
  }

  /**
   * Initializes the annotations for <b>kermeta</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createKermetaAnnotations()
  {
    String source = "kermeta";		
    addAnnotation
      (mainEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "body", "do\n\tvar a : comp_assignment_test004::A init comp_assignment_test004::A.new\n\ta.name := \"Assignment of a feature\"\n\tvar b1 : comp_assignment_test004::B init comp_assignment_test004::B.new\n\tvar b2 : comp_assignment_test004::B init comp_assignment_test004::B.new\n\ta.b.add(b1)\n\ta.b.add(b2)\n\tstdio.writeln(\"a.name: \".plus(a.name))\n\ta.b.each{e | stdio.writeln(\"b: \".plus(e.toString))}\nend"
       });			
    addAnnotation
      (getA_Name(), 
       source, 
       new String[] 
       {
       "isComposite", "true"
       });
  }

} //Comp_assignment_test004PackageImpl
