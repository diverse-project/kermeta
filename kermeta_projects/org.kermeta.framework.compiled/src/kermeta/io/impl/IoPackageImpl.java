/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: IoPackageImpl.java,v 1.1 2008-06-24 14:23:39 cfaucher Exp $
 */
package kermeta.io.impl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.FileIO;
import kermeta.io.IoFactory;
import kermeta.io.IoPackage;
import kermeta.io.StdIO;

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoPackageImpl extends EPackageImpl implements IoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileIOEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stdIOEClass = null;

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
   * @see kermeta.io.IoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IoPackageImpl()
  {
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
  public static IoPackage init()
  {
    if (isInited) return (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);

    // Obtain or create and register package
    IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new IoPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) : KermetaPackage.eINSTANCE);
    StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) : StandardPackage.eINSTANCE);
    UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) : UtilsPackage.eINSTANCE);
    ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
    KunitPackageImpl theKunitPackage = (KunitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) : KunitPackage.eINSTANCE);
    EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
    InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) : InterpreterPackage.eINSTANCE);
    LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
    BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
    StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
    PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
    ecore.impl.EcorePackageImpl theEcorePackage_1 = (ecore.impl.EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.EcorePackage.eNS_URI) : ecore.EcorePackage.eINSTANCE);

    // Create package meta-data objects
    theIoPackage.createPackageContents();
    theKermetaPackage.createPackageContents();
    theStandardPackage.createPackageContents();
    theUtilsPackage.createPackageContents();
    theExceptionsPackage.createPackageContents();
    theKunitPackage.createPackageContents();
    theEcorePackage.createPackageContents();
    theInterpreterPackage.createPackageContents();
    theLanguagePackage.createPackageContents();
    theBehaviorPackage.createPackageContents();
    theStructurePackage.createPackageContents();
    thePersistencePackage.createPackageContents();
    theEcorePackage_1.createPackageContents();

    // Initialize created meta-data
    theIoPackage.initializePackageContents();
    theKermetaPackage.initializePackageContents();
    theStandardPackage.initializePackageContents();
    theUtilsPackage.initializePackageContents();
    theExceptionsPackage.initializePackageContents();
    theKunitPackage.initializePackageContents();
    theEcorePackage.initializePackageContents();
    theInterpreterPackage.initializePackageContents();
    theLanguagePackage.initializePackageContents();
    theBehaviorPackage.initializePackageContents();
    theStructurePackage.initializePackageContents();
    thePersistencePackage.initializePackageContents();
    theEcorePackage_1.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIoPackage.freeze();

    return theIoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileIO()
  {
    return fileIOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStdIO()
  {
    return stdIOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IoFactory getIoFactory()
  {
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fileIOEClass = createEClass(FILE_IO);

    stdIOEClass = createEClass(STD_IO);
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

    // Obtain other dependent packages
    StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
    StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fileIOEClass.getESuperTypes().add(theStructurePackage.getObject());
    stdIOEClass.getESuperTypes().add(theStructurePackage.getObject());

    // Initialize classes and features; add operations and parameters
    initEClass(fileIOEClass, FileIO.class, "FileIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(fileIOEClass, null, "writeTextFile", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fileIOEClass, theStandardPackage.getString(), "readTextFile", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(stdIOEClass, StdIO.class, "StdIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(stdIOEClass, null, "writeln", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(stdIOEClass, null, "errorln", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(stdIOEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(stdIOEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(stdIOEClass, theStandardPackage.getString(), "read", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "prompt", 0, 1, IS_UNIQUE, IS_ORDERED);

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
      (this, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Contains file input/output related classes. \r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\r\n */"
       });		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Contains standard input/output related classes. \r\n */"
       });		
    addAnnotation
      (fileIOEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Implementation of simple helpers to read ans write text files\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\r\n */"
       });		
    addAnnotation
      (fileIOEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Writes a String in a text file\r\n\t */"
       });		
    addAnnotation
      (fileIOEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Reads a text file\r\n\t */"
       });		
    addAnnotation
      (stdIOEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * An implementation of StdIO : standard input/output\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\r\n */"
       });		
    addAnnotation
      (stdIOEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Writeln the object to standard output\r\n\t */"
       });		
    addAnnotation
      (stdIOEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Writeln the object to error output\r\n\t */"
       });		
    addAnnotation
      (stdIOEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Writes the object to error output\r\n\t */"
       });		
    addAnnotation
      (stdIOEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Writes the object to standard output\r\n\t */"
       });		
    addAnnotation
      (stdIOEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Reads a String from standard input\r\n\t */"
       });
  }

} //IoPackageImpl
