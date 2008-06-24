/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: UtilsPackageImpl.java,v 1.1 2008-06-24 14:23:28 cfaucher Exp $
 */
package kermeta.utils.impl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.IoPackage;

import kermeta.io.impl.IoPackageImpl;

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

import kermeta.utils.Hashtable;
import kermeta.utils.Stack;
import kermeta.utils.UtilsFactory;
import kermeta.utils.UtilsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsPackageImpl extends EPackageImpl implements UtilsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringBufferEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hashtableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stackEClass = null;

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
   * @see kermeta.utils.UtilsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UtilsPackageImpl()
  {
    super(eNS_URI, UtilsFactory.eINSTANCE);
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
  public static UtilsPackage init()
  {
    if (isInited) return (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);

    // Obtain or create and register package
    UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UtilsPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) : KermetaPackage.eINSTANCE);
    StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) : StandardPackage.eINSTANCE);
    ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
    KunitPackageImpl theKunitPackage = (KunitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) : KunitPackage.eINSTANCE);
    EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
    InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) : InterpreterPackage.eINSTANCE);
    LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
    BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
    StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
    IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
    PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
    ecore.impl.EcorePackageImpl theEcorePackage_1 = (ecore.impl.EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.EcorePackage.eNS_URI) : ecore.EcorePackage.eINSTANCE);

    // Create package meta-data objects
    theUtilsPackage.createPackageContents();
    theKermetaPackage.createPackageContents();
    theStandardPackage.createPackageContents();
    theExceptionsPackage.createPackageContents();
    theKunitPackage.createPackageContents();
    theEcorePackage.createPackageContents();
    theInterpreterPackage.createPackageContents();
    theLanguagePackage.createPackageContents();
    theBehaviorPackage.createPackageContents();
    theStructurePackage.createPackageContents();
    theIoPackage.createPackageContents();
    thePersistencePackage.createPackageContents();
    theEcorePackage_1.createPackageContents();

    // Initialize created meta-data
    theUtilsPackage.initializePackageContents();
    theKermetaPackage.initializePackageContents();
    theStandardPackage.initializePackageContents();
    theExceptionsPackage.initializePackageContents();
    theKunitPackage.initializePackageContents();
    theEcorePackage.initializePackageContents();
    theInterpreterPackage.initializePackageContents();
    theLanguagePackage.initializePackageContents();
    theBehaviorPackage.initializePackageContents();
    theStructurePackage.initializePackageContents();
    theIoPackage.initializePackageContents();
    thePersistencePackage.initializePackageContents();
    theEcorePackage_1.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUtilsPackage.freeze();

    return theUtilsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringBuffer()
  {
    return stringBufferEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHashtable()
  {
    return hashtableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStack()
  {
    return stackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilsFactory getUtilsFactory()
  {
    return (UtilsFactory)getEFactoryInstance();
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
    stringBufferEClass = createEClass(STRING_BUFFER);

    hashtableEClass = createEClass(HASHTABLE);

    stackEClass = createEClass(STACK);
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
    ETypeParameter hashtableEClass_K = addETypeParameter(hashtableEClass, "K");
    ETypeParameter hashtableEClass_V = addETypeParameter(hashtableEClass, "V");
    ETypeParameter stackEClass_G = addETypeParameter(stackEClass, "G");

    // Set bounds for type parameters

    // Add supertypes to classes
    stringBufferEClass.getESuperTypes().add(theStructurePackage.getObject());
    hashtableEClass.getESuperTypes().add(theStructurePackage.getObject());
    EGenericType g1 = createEGenericType(theStandardPackage.getSequence());
    EGenericType g2 = createEGenericType(stackEClass_G);
    g1.getETypeArguments().add(g2);
    stackEClass.getEGenericSuperTypes().add(g1);

    // Initialize classes and features; add operations and parameters
    initEClass(stringBufferEClass, kermeta.utils.StringBuffer.class, "StringBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(stringBufferEClass, this.getStringBuffer(), "append", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "arg0", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(stringBufferEClass, theStandardPackage.getInteger(), "length", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(stringBufferEClass, theStandardPackage.getString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hashtableEClass, Hashtable.class, "Hashtable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(hashtableEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(hashtableEClass, null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(hashtableEClass_K);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(hashtableEClass_V);
    initEOperation(op, g1);

    op = addEOperation(hashtableEClass, theStandardPackage.getBoolean(), "containsKey", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(hashtableEClass_K);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(hashtableEClass, null, "put", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(hashtableEClass_K);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(hashtableEClass_V);
    addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(hashtableEClass, null, "values", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(theStandardPackage.getCollection());
    g2 = createEGenericType(hashtableEClass_V);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(hashtableEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(hashtableEClass_K);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(hashtableEClass, null, "keys", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(theStandardPackage.getSet());
    g2 = createEGenericType(hashtableEClass_K);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(hashtableEClass, null, "keyIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(theStandardPackage.getIterator());
    g2 = createEGenericType(hashtableEClass_K);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(hashtableEClass, null, "valueIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(theStandardPackage.getIterator());
    g2 = createEGenericType(hashtableEClass_V);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    addEOperation(hashtableEClass, theStandardPackage.getInteger(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(stackEClass, null, "peek", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(stackEClass_G);
    initEOperation(op, g1);

    op = addEOperation(stackEClass, null, "pop", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(stackEClass_G);
    initEOperation(op, g1);

    op = addEOperation(stackEClass, null, "push", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(stackEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

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
       "documentation", "/** \r\n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\r\n * metamodel\r\n * \r\n * <img src=\"./figures/utils_package.png\"/>\r\n */"
       });		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "documentation", "/** \r\n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\r\n * metamodel\r\n */"
       });		
    addAnnotation
      (stringBufferEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\n * This class mimic the behavior of the java\'s StringBuffer class. This enables better performance in long\n * string concatenation.<br>\n * <b>Only work on Strings</b>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\n */"
       });		
    addAnnotation
      (stringBufferEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\n\t * Append a given string at the end of this StringBuffer\n\t * @param arg0 A string to append at the end of this StringBuffer\n\t * @return A reference to this object\n\t */"
       });		
    addAnnotation
      (stringBufferEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\n\t * Return the length of the StringBuffer\n\t * @return length of the StringBuffer\n\t */"
       });		
    addAnnotation
      (stringBufferEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\n\t *Convert this StringBuffer to String and return its value\n\t *@return The string value of this StringBuffer\n\t */"
       });		
    addAnnotation
      (stringBufferEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (hashtableEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * An implementation of hashtable\r\n * This implementation is for speed optimisation it cannot be serialized. \r\n * If your wish to serialize its content you need to copy its content into a classical ecore structure (attribute or references)\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes all elements from the Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the value for key \'key\' if it exists, otherwise returns Void\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\t\r\n\t * Returns a Boolean stating whether a key is present or not in this Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Adds a entry into the Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a collection containing the elements of this Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes the entry with key equals to \'key\'\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a set containing the hash keys of this Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(7), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns an iterator over the Keys of this Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(8), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns an iterator over the values of this Hashtable\r\n\t */"
       });		
    addAnnotation
      (hashtableEClass.getEOperations().get(9), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the size of this Hashtable\r\n\t */"
       });		
    addAnnotation
      (stackEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * An implementation of stack\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n */"
       });		
    addAnnotation
      (stackEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Gets the element at the top of the stack\r\n\t */"
       });		
    addAnnotation
      (stackEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Get and remove the element at the top of the stack\r\n\t */"
       });		
    addAnnotation
      (stackEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Pushes an element into the stack\r\n\t */"
       });
  }

} //UtilsPackageImpl
