/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_runner_test001PackageImpl.java,v 1.1 2007-11-19 12:17:25 cfaucher Exp $
 */
package comp_runner_test001.impl;

import comp_runner_test001.Comp_runner_test001Factory;
import comp_runner_test001.Comp_runner_test001Package;
import comp_runner_test001.Main;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Comp_runner_test001PackageImpl extends EPackageImpl implements Comp_runner_test001Package
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
   * @see comp_runner_test001.Comp_runner_test001Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Comp_runner_test001PackageImpl()
  {
    super(eNS_URI, Comp_runner_test001Factory.eINSTANCE);
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
  public static Comp_runner_test001Package init()
  {
    if (isInited) return (Comp_runner_test001Package)EPackage.Registry.INSTANCE.getEPackage(Comp_runner_test001Package.eNS_URI);

    // Obtain or create and register package
    Comp_runner_test001PackageImpl theComp_runner_test001Package = (Comp_runner_test001PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Comp_runner_test001PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Comp_runner_test001PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theComp_runner_test001Package.createPackageContents();

    // Initialize created meta-data
    theComp_runner_test001Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theComp_runner_test001Package.freeze();

    return theComp_runner_test001Package;
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
  public EDataType getString()
  {
    return stringEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBoolean()
  {
    return booleanEDataType;
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
  public Comp_runner_test001Factory getComp_runner_test001Factory()
  {
    return (Comp_runner_test001Factory)getEFactoryInstance();
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
    stringEDataType = createEDataType(STRING);
    booleanEDataType = createEDataType(BOOLEAN);
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

    addEOperation(mainEClass, null, "main0", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = addEOperation(mainEClass, null, "main1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text0", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mainEClass, null, "main2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text0", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text1", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mainEClass, null, "main3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getBoolean(), "condition", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mainEClass, null, "main4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text0", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getBoolean(), "condition", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mainEClass, null, "main5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text0", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getBoolean(), "condition", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mainEClass, null, "main6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getBoolean(), "condition", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text0", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mainEClass, null, "main7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text0", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getBoolean(), "condition", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getString(), "text1", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Initialize data types
    initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
       "body", "do\n\tstdio.writeln(\"The runner class will be generated for main0\")\nend"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"The runner class will be generated for main1\")\nend"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"The runner class will be generated for main2\")\nend"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"The runner class will not be generated for main3\")\nend",
       "documentation", "/****** Cases that should be in error ******/"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"The runner class will not be generated for main4\")\nend"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"The runner class will not be generated for main5\")\nend"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"MThe runner class will not be generated for main6\")\nend"
       });			
    addAnnotation
      (mainEClass.getEOperations().get(7), 
       source, 
       new String[] 
       {
       "body", "do\n\tstdio.writeln(\"The runner class will not be generated for main7\")\nend"
       });	
  }

} //Comp_runner_test001PackageImpl
