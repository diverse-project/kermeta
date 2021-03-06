/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_body_test002PackageImpl.java,v 1.3 2009-02-17 13:41:03 cfaucher Exp $
 */
package comp_body_test002.impl;

import comp_body_test002.Comp_body_test002Factory;
import comp_body_test002.Comp_body_test002Package;
import comp_body_test002.Main;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Comp_body_test002PackageImpl extends EPackageImpl implements Comp_body_test002Package
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
   * @see comp_body_test002.Comp_body_test002Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Comp_body_test002PackageImpl()
  {
    super(eNS_URI, Comp_body_test002Factory.eINSTANCE);
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
  public static Comp_body_test002Package init()
  {
    if (isInited) return (Comp_body_test002Package)EPackage.Registry.INSTANCE.getEPackage(Comp_body_test002Package.eNS_URI);

    // Obtain or create and register package
    Comp_body_test002PackageImpl theComp_body_test002Package = (Comp_body_test002PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Comp_body_test002PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Comp_body_test002PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theComp_body_test002Package.createPackageContents();

    // Initialize created meta-data
    theComp_body_test002Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theComp_body_test002Package.freeze();

    return theComp_body_test002Package;
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
  public EDataType get_KermetaSpecialTypesAlias_()
  {
    return _KermetaSpecialTypesAlias_EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_body_test002Factory getComp_body_test002Factory()
  {
    return (Comp_body_test002Factory)getEFactoryInstance();
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

    // Create data types
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

    addEOperation(mainEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Initialize data types
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
       "body", "do\n\tstdio.writeln(\"Main method has been executed\")\nend"
       });	
  }

} //Comp_body_test002PackageImpl
