/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: StandardPackageImpl.java,v 1.1 2008-06-24 14:23:36 cfaucher Exp $
 */
package kermeta.standard.impl;

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

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.NotComparableException;
import kermeta.standard.OrderedCollection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardFactory;
import kermeta.standard.StandardPackage;
import kermeta.standard.Summable;
import kermeta.standard.UnknownJavaObject;
import kermeta.standard.ValueType;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class StandardPackageImpl extends EPackageImpl implements StandardPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass summableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notComparableExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderedCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderedSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iteratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownJavaObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kermetaSpecialTypesAliasEClass = null;

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
  private EDataType integerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType realEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType characterEDataType = null;

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
  private EDataType unlimitedNaturalEDataType = null;

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
   * @see kermeta.standard.StandardPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StandardPackageImpl()
  {
    super(eNS_URI, StandardFactory.eINSTANCE);
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
  public static StandardPackage init()
  {
    if (isInited) return (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

    // Obtain or create and register package
    StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new StandardPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) : KermetaPackage.eINSTANCE);
    UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) : UtilsPackage.eINSTANCE);
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
    theStandardPackage.createPackageContents();
    theKermetaPackage.createPackageContents();
    theUtilsPackage.createPackageContents();
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
    theStandardPackage.initializePackageContents();
    theKermetaPackage.initializePackageContents();
    theUtilsPackage.initializePackageContents();
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
    theStandardPackage.freeze();

    return theStandardPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoid()
  {
    return voidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueType()
  {
    return valueTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparable()
  {
    return comparableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSummable()
  {
    return summableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotComparableException()
  {
    return notComparableExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollection()
  {
    return collectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSet()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBag()
  {
    return bagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderedCollection()
  {
    return orderedCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderedSet()
  {
    return orderedSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterator()
  {
    return iteratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownJavaObject()
  {
    return unknownJavaObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKermetaSpecialTypesAlias()
  {
    return kermetaSpecialTypesAliasEClass;
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
  public EDataType getInteger()
  {
    return integerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getReal()
  {
    return realEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCharacter()
  {
    return characterEDataType;
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
  public EDataType getUnlimitedNatural()
  {
    return unlimitedNaturalEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StandardFactory getStandardFactory()
  {
    return (StandardFactory)getEFactoryInstance();
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
    voidEClass = createEClass(VOID);

    valueTypeEClass = createEClass(VALUE_TYPE);

    comparableEClass = createEClass(COMPARABLE);

    summableEClass = createEClass(SUMMABLE);

    notComparableExceptionEClass = createEClass(NOT_COMPARABLE_EXCEPTION);

    collectionEClass = createEClass(COLLECTION);

    setEClass = createEClass(SET);

    bagEClass = createEClass(BAG);

    orderedCollectionEClass = createEClass(ORDERED_COLLECTION);

    orderedSetEClass = createEClass(ORDERED_SET);

    sequenceEClass = createEClass(SEQUENCE);

    iteratorEClass = createEClass(ITERATOR);

    unknownJavaObjectEClass = createEClass(UNKNOWN_JAVA_OBJECT);

    kermetaSpecialTypesAliasEClass = createEClass(KERMETA_SPECIAL_TYPES_ALIAS);

    // Create data types
    booleanEDataType = createEDataType(BOOLEAN);
    integerEDataType = createEDataType(INTEGER);
    realEDataType = createEDataType(REAL);
    characterEDataType = createEDataType(CHARACTER);
    stringEDataType = createEDataType(STRING);
    unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
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
    ExceptionsPackage theExceptionsPackage = (ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI);

    // Create type parameters
    ETypeParameter summableEClass_G = addETypeParameter(summableEClass, "G");
    ETypeParameter collectionEClass_G = addETypeParameter(collectionEClass, "G");
    ETypeParameter setEClass_G = addETypeParameter(setEClass, "G");
    ETypeParameter bagEClass_G = addETypeParameter(bagEClass, "G");
    ETypeParameter orderedCollectionEClass_G = addETypeParameter(orderedCollectionEClass, "G");
    ETypeParameter orderedSetEClass_G = addETypeParameter(orderedSetEClass, "G");
    ETypeParameter sequenceEClass_G = addETypeParameter(sequenceEClass, "G");
    ETypeParameter iteratorEClass_G = addETypeParameter(iteratorEClass, "G");

    // Set bounds for type parameters

    // Add supertypes to classes
    voidEClass.getESuperTypes().add(theStructurePackage.getObject());
    valueTypeEClass.getESuperTypes().add(theStructurePackage.getObject());
    comparableEClass.getESuperTypes().add(theStructurePackage.getObject());
    summableEClass.getESuperTypes().add(theStructurePackage.getObject());
    notComparableExceptionEClass.getESuperTypes().add(theExceptionsPackage.getException());
    collectionEClass.getESuperTypes().add(theStructurePackage.getObject());
    EGenericType g1 = createEGenericType(this.getCollection());
    EGenericType g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    setEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    bagEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(orderedCollectionEClass_G);
    g1.getETypeArguments().add(g2);
    orderedCollectionEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(orderedSetEClass_G);
    g1.getETypeArguments().add(g2);
    orderedSetEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOrderedCollection());
    g2 = createEGenericType(orderedSetEClass_G);
    g1.getETypeArguments().add(g2);
    orderedSetEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(sequenceEClass_G);
    g1.getETypeArguments().add(g2);
    sequenceEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getOrderedCollection());
    g2 = createEGenericType(sequenceEClass_G);
    g1.getETypeArguments().add(g2);
    sequenceEClass.getEGenericSuperTypes().add(g1);
    iteratorEClass.getESuperTypes().add(theStructurePackage.getObject());
    unknownJavaObjectEClass.getESuperTypes().add(theStructurePackage.getObject());

    // Initialize classes and features; add operations and parameters
    initEClass(voidEClass, kermeta.standard.Void.class, "Void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(voidEClass, this.getBoolean(), "isVoid", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = addEOperation(voidEClass, this.getBoolean(), "isInstanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(voidEClass, this.getString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparableEClass, kermeta.standard.Comparable.class, "Comparable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(comparableEClass, this.getBoolean(), "isLower", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(comparableEClass, this.getBoolean(), "isGreaterOrEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(comparableEClass, this.getInteger(), "compareTo", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(comparableEClass, this.getBoolean(), "isLowerOrEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(comparableEClass, this.getBoolean(), "isGreater", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(summableEClass, Summable.class, "Summable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(summableEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(summableEClass_G);
    addEParameter(op, g1, "other", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(summableEClass_G);
    initEOperation(op, g1);

    initEClass(notComparableExceptionEClass, NotComparableException.class, "NotComparableException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionEClass, Collection.class, "Collection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(collectionEClass, null, "reject", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "rejector", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, this.getInteger(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "excludes", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "one", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, this.getBoolean(), "containsAll", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "sum", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, this.getBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "asSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "includes", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "excludesAll", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(collectionEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(collectionEClass, this.getBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "asBag", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, this.getBoolean(), "isUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
    addETypeParameter(op, "T");
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "collector", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "any", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    initEOperation(op, g1);

    addEOperation(collectionEClass, this.getBoolean(), "empty", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "forAllCpl", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "f", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "existsCpl", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "f", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(collectionEClass, this.getBoolean(), "isNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "detect", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "detector", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(collectionEClass_G);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, null, "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getIterator());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, null, "addAll", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "includesAll", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "select", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "selector", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    addEOperation(collectionEClass, this.getInteger(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "asOrderedSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, this.getBoolean(), "forAll", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "func", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, this.getBoolean(), "exists", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "func", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "each", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "func", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(collectionEClass, null, "collect", 0, 1, IS_UNIQUE, IS_ORDERED);
    ETypeParameter t1 = addETypeParameter(op, "T");
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "collector", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(collectionEClass, null, "asSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(collectionEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(setEClass, null, "intersection", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(setEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(setEClass, this.getBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(setEClass, null, "sortedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "comparator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(setEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(setEClass, null, "asSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "quickSort", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "q", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "comparator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "concatenate", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "less", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "pivot", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "symmetricDifference", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "s", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "flatten", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(theStructurePackage.getObject());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "asOrderedSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "asBag", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "union", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "unionWithBag", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(setEClass, null, "asSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(setEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(bagEClass, Bag.class, "Bag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(bagEClass, null, "intersection", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, this.getBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(bagEClass, null, "sortedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "comparator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "asSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "quickSort", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "q", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getKermetaSpecialTypesAlias(), "comparator", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "concatenate", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "less", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "pivot", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "excluding", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(bagEClass_G);
    addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "flatten", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(theStructurePackage.getObject());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "intersectionWithSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "asOrderedSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "including", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(bagEClass_G);
    addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "asBag", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "union", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getCollection());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getBag());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(bagEClass, null, "removeOne", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(bagEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(bagEClass, null, "removeFromOid", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "elementOid", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(bagEClass, null, "asSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSet());
    g2 = createEGenericType(bagEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(orderedCollectionEClass, OrderedCollection.class, "OrderedCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(orderedCollectionEClass, null, "addAt", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedCollectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedCollectionEClass, null, "removeAt", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedCollectionEClass, null, "last", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedCollectionEClass_G);
    initEOperation(op, g1);

    op = addEOperation(orderedCollectionEClass, this.getBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedCollectionEClass, this.getInteger(), "indexOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedCollectionEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedCollectionEClass, null, "elementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedCollectionEClass_G);
    initEOperation(op, g1);

    op = addEOperation(orderedCollectionEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedCollectionEClass_G);
    initEOperation(op, g1);

    initEClass(orderedSetEClass, OrderedSet.class, "OrderedSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(orderedSetEClass, null, "append", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedSetEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(orderedSetEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(orderedSetEClass, null, "addAt", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedSetEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedSetEClass, null, "insertAt", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedSetEClass_G);
    addEParameter(op, g1, "subject", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(orderedSetEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(orderedSetEClass, null, "preppend", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedSetEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(orderedSetEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(orderedSetEClass, this.getBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedSetEClass, null, "at", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(orderedSetEClass_G);
    initEOperation(op, g1);

    op = addEOperation(orderedSetEClass, this.getVoid(), "add", 0, 1, IS_UNIQUE, !IS_ORDERED);
    g1 = createEGenericType(orderedSetEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(orderedSetEClass, null, "subSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "min", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "max", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOrderedSet());
    g2 = createEGenericType(orderedSetEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(sequenceEClass, null, "subSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "min", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "max", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(sequenceEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(sequenceEClass, null, "append", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(sequenceEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(sequenceEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(sequenceEClass, null, "insertAt", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(sequenceEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(sequenceEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(sequenceEClass, null, "preppend", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(sequenceEClass_G);
    addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getSequence());
    g2 = createEGenericType(sequenceEClass_G);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(sequenceEClass, this.getBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(sequenceEClass, null, "at", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getInteger(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(sequenceEClass_G);
    initEOperation(op, g1);

    initEClass(iteratorEClass, Iterator.class, "Iterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(iteratorEClass, this.getBoolean(), "hasNext", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(iteratorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(iteratorEClass_G);
    initEOperation(op, g1);

    addEOperation(iteratorEClass, this.getBoolean(), "isOff", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(unknownJavaObjectEClass, UnknownJavaObject.class, "UnknownJavaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(unknownJavaObjectEClass, this.getString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(kermetaSpecialTypesAliasEClass, Object.class, "KermetaSpecialTypesAlias", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    // Initialize data types
    initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(realEDataType, Double.class, "Real", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(characterEDataType, char.class, "Character", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unlimitedNaturalEDataType, Object.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create annotations
    // kermeta
    createKermetaAnnotations();
    // kermeta.functionType
    createKermeta_1Annotations();
    // kermeta.post
    createKermeta_2Annotations();
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
       "documentation", "/**\r\n * Defines value types \r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/primitive_types_view.png\"/>\r\n */"
       });		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Defines Collection types \r\n * <img src=\"./figures/collections_view.png\"/>\r\n */"
       });		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Contains types dedicated to dealing with java objects\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\r\n */"
       });		
    addAnnotation
      (voidEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * The class Void \r\n * By convention it is a sub-type of everything\r\n */"
       });		
    addAnnotation
      (voidEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Return true\r\n\t */"
       });		
    addAnnotation
      (voidEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (voidEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns true\r\n\t */"
       });		
    addAnnotation
      (voidEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (voidEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the String identifier \'<void>\'\r\n\t */"
       });		
    addAnnotation
      (voidEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (valueTypeEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * The abstract class ValueType does not contain any feature.\r\n * However, any instance of a sub-class of ValueType will be passed by value \r\n * instead of by reference for any other objects.\r\n * that means that each time you := such object it will call the clone function associated to it (Not implemented yet except for Integer, String and boolean!!!)\r\n * \r\n */"
       });		
    addAnnotation
      (comparableEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * The abstract class Comparable defines a set of operation\r\n * to compare instances of a class.\r\n * Sub-classes only has to implement abstract operation compareTo.\r\n * All other methods are defined w.r.t. the compareTo operation\r\n */"
       });		
    addAnnotation
      (comparableEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * return true if self < other\r\n\t */"
       });		
    addAnnotation
      (comparableEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * return true if self >= other\r\n\t */"
       });		
    addAnnotation
      (comparableEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (comparableEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * This method should be implemented by any class that inherits\r\n\t * from Comparable.\r\n\t * returns 0 if self = other\r\n\t * returns > 0 if  self > other\r\n\t * returns < 0 if  self < other\r\n\t */"
       });		
    addAnnotation
      (comparableEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * return true if self <= other\r\n\t */"
       });		
    addAnnotation
      (comparableEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * return true if self > other\r\n\t */"
       });		
    addAnnotation
      (summableEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * The abstract class Summable defines a set of operation\r\n * to sum instances of a class.\r\n * Sub-classes only has to implement abstract operation plus.\r\n  */"
       });		
    addAnnotation
      (summableEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (summableEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Summarization method to be implemented by any summable class.\r\n\t * The parameter must have the same type (or one of its subtypes)\r\n\t *  than the current object .\r\n\t */"
       });		
    addAnnotation
      (notComparableExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * raised when two objects are not comparable\r\n */"
       });		
    addAnnotation
      (unlimitedNaturalEDataType, 
       source, 
       new String[] 
       {
       "alias", "kermeta::standard::Integer"
       });		
    addAnnotation
      (unlimitedNaturalEDataType, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Unlimited natural is used for reflection.\r\n * It is mapped to integer.equals().\r\n * Any negative number is interpreted as \'*\'\r\n */"
       });		
    addAnnotation
      (collectionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Collection is the root abstract class for all kermeta collections\r\n */"
       });		
    addAnnotation
      (collectionEClass, 
       source, 
       new String[] 
       {
       "EMF_needReference", "isUnique=false isOrdered=false javaClass=java.lang.ArrayList"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Sequence composed of elements of the Collection that\r\n\t * do not validate the rejector function\r\n\t * example :\r\n\t * aCollection2 := aCollection.reject { e | \r\n     *     \\/* put here a condition that returns true for elements that must  be exclude in the resulting Collection *\\/\r\n     * }\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the number of instances of element in the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes all instances of element from the Collection, based on\r\n\t * G.equals(Object) definition\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns true if the Collection does not contain element\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns an element from the Collection or void if the Collection is empty\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns true if current Collection contains all elements of Collection elements\r\n\t * See Collection<G>.contains(Object)\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(7), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a Boolean stating whether the Collection contains at least one\r\n\t * instance of element, based on G.equals(elt : Object) definition\r\n\t * Note: for checking whether a physical element is contained by the collection,\r\n\t * make use of G.oid()\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(8), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(8), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Sequence built from the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(9), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Adds an element in the Collection (default implementation)\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(10), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * OCL API alignment, doeas the same as contains\r\n\t * See Collection<G>.contains(Object)\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(11), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns true if the Collection contains no element of Collection elements\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(12), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes all elements from the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(13), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * OCL alignment API, does the same as empty\r\n\t * See Collection<G>.empty()\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(14), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(14), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag built from the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(15), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a Boolean stating whether the the collector function evaluates to a\r\n\t * different value for each element of the Collection\r\n\t * example :\r\n\t * aCollection2 := aCollection.isUnique { e | \\/* put here an expression that must be unique for all elements, for example e.name *\\/ }\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(16), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns an element from the Collection\r\n\t * Raises an EmptyCollection exception if the Collection is empty\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(17), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a Boolean stating whether the Collection is empty\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(18), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * To be written #####################################\r\n\t * => result := self.forAll{x | self.forAll {y | f(x,y)}}\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(19), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * To be written #####################################\r\n\t * => result := self.exists{x | self.exists {y | f(x,y)}}\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(20), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * OCL alignment API\r\n\t * Returns a Boolean stating whether the Collection contains at least\r\n\t * one element \r\n\t * See also Collection<G>.contains(Object)\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(21), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns an element of the Collection (usually the first) for which the detector function\r\n\t * is not false\r\n\t * Returns void if no elements is validated by the detector function\r\n\t * example : \r\n\t * anObject := aCollection.detect { e | \\/* a condition *\\/} // returns an element that fulfill the condition.\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(22), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns an Iterator on the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(23), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Adds all elements from the Collection elements in the current Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(24), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * OCL API alignment, does the same as containsAll\r\n\t * See Collection<G>.containsAll(Collection<G>)\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(25), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Sequence composed of elements of the Collection that\r\n\t * validate the selector function\r\n\t * example :\r\n\t * aCollection2 := aCollection.select { e | \r\n     *    \\/* put here a condition that returns true for elements that must  be included in the resulting Collection *\\/\r\n\t * }\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(26), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the number of elements in the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(27), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(27), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new OrderedSet built from the Collection\r\n\t */"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(28), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a Boolean stating whether no element of the Collection invalidates\r\n\t * the condition specified by function func\r\n\t * example : \r\n\t * aBoolean := aCollection.forAll { e | \\/* put here a condition *\\/ } // return true if the condition is true for all elements in the collection.\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(29), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a Boolean stating whether at least one element of the Collection\r\n\t * validates the condition specified by function func\r\n\t * example :\r\n\t * aBoolean := aCollection.exists { e | \\/* a condition *\\/} // returns true if at least one element fulfill the condition.\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(30), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Runs function func on each element of the Collection\r\n\t * example : \r\n\t * aCollection.each { e | \\/* do something with each element e of this collection *\\/ }\r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(31), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Sequence which content corresponds to the result\r\n\t * of running the collector function for each element of the Collection\r\n\t * The new collection size is the same as in the original collection, and which element types is the type of the result of the expression.\r\n\t * example :\r\n\t * aCollection2 := aCollection.collect { e | \\/* put here an expression, for example e.name *\\/ } \r\n\t */"
       });			
    addAnnotation
      (collectionEClass.getEOperations().get(32), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (collectionEClass.getEOperations().get(32), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set built from the Collection\r\n\t */"
       });		
    addAnnotation
      (setEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * A Set is a non-ordered collection that contains distinct elements\r\n * (with regards to the G.equals(Object) operation)\r\n */"
       });		
    addAnnotation
      (setEClass, 
       source, 
       new String[] 
       {
       "EMF_needReference", "isUnique=true isOrdered=false javaClass=java.lang.ArrayList"
       });		
    addAnnotation
      (setEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set corresponding to the intersection of the Set elements\r\n\t * with the current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set corresponding to the difference between the\r\n\t * current Set and the Set elements, ie all elements contained by \r\n\t * the current Set that do not appear in the elements Set \r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.remove(G)\r\n\t * Removes the element from the Set if it is contained by the Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (setEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (setEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a ordered set of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */"
       });			
    addAnnotation
      (setEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.add(G)\r\n\t * Adds elt to the Set if it is not already contained by the\r\n\t * Set, does nothing otherwise\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (setEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence composed of all elements of current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (setEClass.getEOperations().get(7), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Recursive sort of the given (ordered) set using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */"
       });			
    addAnnotation
      (setEClass.getEOperations().get(8), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(9), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set which contents corresponds to the symmetric\r\n\t * difference between current Set and Set s, ie all elements of\r\n\t * each Set that do not appear in the other one\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(10), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Set, as many elements as the Collection contains\r\n\t * Duplicates are removed\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(11), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet that contains all elements of current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(11), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (setEClass.getEOperations().get(12), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag composed of all elements of current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(12), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (setEClass.getEOperations().get(13), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set corresponding to the union of the Set elements\r\n\t * with the current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(14), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag corresponding to the union of the Bag elements\r\n\t * with the current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(15), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set composed of all elements of current Set\r\n\t */"
       });		
    addAnnotation
      (setEClass.getEOperations().get(15), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (bagEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Bag is a concrete non-ordered Collection allowing duplicates\r\n */"
       });		
    addAnnotation
      (bagEClass, 
       source, 
       new String[] 
       {
       "EMF_needReference", "isUnique=false isOrdered=false javaClass=java.lang.ArrayList"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag corresponding to the intersection of elements\r\n\t * and the Bag\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a sequence of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */"
       });			
    addAnnotation
      (bagEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence containing all elements of current Bag\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Recursive sort of the given sequence using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */"
       });			
    addAnnotation
      (bagEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag from which all instances of object have been\r\n\t * removed\r\n \t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(7), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(8), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Set corresponding to the intersection of a Set of\r\n\t * elements and the Bag\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(9), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet containing elements of the Bag without duplicates\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(9), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(10), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag and the element object\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(11), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag containing all elements of current Bag\t\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(11), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(12), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns a new Bag corresponding to the union of elements and\r\n\t * current Bag\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(13), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes one instance of element from the Bag\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(14), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t */"
       });			
    addAnnotation
      (bagEClass.getEOperations().get(15), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set containing elements of the Bag without duplicates\r\n\t */"
       });		
    addAnnotation
      (bagEClass.getEOperations().get(15), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Collection"
       });		
    addAnnotation
      (orderedCollectionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * An OrderedCollection is the root abstract class for all ordered Collections.\r\n */"
       });		
    addAnnotation
      (orderedCollectionEClass, 
       source, 
       new String[] 
       {
       "EMF_needReference", "isUnique=false isOrdered=true javaClass=java.lang.ArrayList"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Adds element in the OrderedCollection at rank index\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t */"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Removes the element at rank index from the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t */"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the last element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t */"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current OrderedCollection\r\n\t */"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/** \r\n\t * Returns the index of the first instance of element in the OrderedCollection\r\n\t * or -1 if the element is not contained by the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t */"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the element at rank index in the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t */"
       });		
    addAnnotation
      (orderedCollectionEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "documentation", "/** \r\n\t * Returns the first element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * An OrderedSet is a Set that contained ordered distinct elements\r\n */"
       });		
    addAnnotation
      (orderedSetEClass, 
       source, 
       new String[] 
       {
       "EMF_needReference", "isUnique=true isOrdered=true javaClass=java.lang.ArrayList"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in head\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides OrderedCollection<G>.addAt(Integer, G)\r\n\t * Adds element in the OrderedSet at rank index if the ordered set does\r\n\t * not already contain the element, does nothing otherwise\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::OrderedCollection"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted at rank index\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in tail\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * See OrderedCollection<G>.equals(Object) \r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::OrderedCollection"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedSet\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * See Set<G>.add(G)\r\n\t */"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(6), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Set"
       });		
    addAnnotation
      (orderedSetEClass.getEOperations().get(7), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new OrderedSet composed of elements of current ordered\r\n\t * set from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the ordered set or min is larger than max\r\n\t */"
       });		
    addAnnotation
      (sequenceEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * A Sequence is an OrderedCollection of elements allowing duplicates\r\n */"
       });		
    addAnnotation
      (sequenceEClass, 
       source, 
       new String[] 
       {
       "EMF_needReference", "isUnique=false isOrdered=true javaClass=java.util.ArrayList"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new Sequence composed of elements of current sequence\r\n\t * from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the sequence or min is larger than max\r\n\t */"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in head\r\n\t */"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted at rank index\r\n\t */"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in tail\r\n\t */"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides OrderedCollection<G>.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Sequence\t\r\n\t */"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::OrderedCollection"
       });		
    addAnnotation
      (sequenceEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the Sequence\r\n\t */"
       });		
    addAnnotation
      (iteratorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Iterator to be used with Collection\r\n * See also Collection<G>.getIterator()\r\n */"
       });		
    addAnnotation
      (iteratorEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns true if the iterator has a next element\r\n\t */"
       });		
    addAnnotation
      (iteratorEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the next element of the iterator\r\n\t * Raises IteratorIsOff exception in case the iterator is on the last element \r\n\t */"
       });		
    addAnnotation
      (iteratorEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns true if the iterator is on the last element\r\n\t * i.e. returns not self.hasNext()\r\n\t */"
       });		
    addAnnotation
      (unknownJavaObjectEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** \r\n  * This special object is used to represent java objects that cannot be concretely used with kermeta\r\n  * <b>the only actions possible on these objects are : assignment and passing them as parameter</b>\r\n  * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\r\n  */"
       });		
    addAnnotation
      (unknownJavaObjectEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n \t * NOT IMPLEMENTED\r\n \t */"
       });		
    addAnnotation
      (unknownJavaObjectEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (kermetaSpecialTypesAliasEClass, 
       source, 
       new String[] 
       {
       "alias", "KermetaSpecialTypesAlias"
       });
  }

  /**
   * Initializes the annotations for <b>kermeta.functionType</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createKermeta_1Annotations()
  {
    String source = "kermeta.functionType";																													
    addAnnotation
      ((collectionEClass.getEOperations().get(0)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Boolean"
       });																				
    addAnnotation
      ((collectionEClass.getEOperations().get(15)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Collection::isUnique::T"
       });					
    addAnnotation
      ((collectionEClass.getEOperations().get(18)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", null,
       "1", "kermeta::standard::Boolean"
       });			
    addAnnotation
      ((collectionEClass.getEOperations().get(19)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", null,
       "1", "kermeta::standard::Boolean"
       });				
    addAnnotation
      ((collectionEClass.getEOperations().get(21)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Boolean"
       });						
    addAnnotation
      ((collectionEClass.getEOperations().get(25)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Boolean"
       });						
    addAnnotation
      ((collectionEClass.getEOperations().get(28)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Boolean"
       });			
    addAnnotation
      ((collectionEClass.getEOperations().get(29)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Boolean"
       });			
    addAnnotation
      ((collectionEClass.getEOperations().get(30)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::language::structure::Object"
       });			
    addAnnotation
      ((collectionEClass.getEOperations().get(31)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", "kermeta::standard::Collection::G",
       "1", "kermeta::standard::Collection::collect::T"
       });													
    addAnnotation
      ((setEClass.getEOperations().get(4)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", null,
       "1", "kermeta::standard::Integer"
       });							
    addAnnotation
      ((setEClass.getEOperations().get(7)).getEParameters().get(1), 
       source, 
       new String[] 
       {
       "0", null,
       "1", "kermeta::standard::Integer"
       });																			
    addAnnotation
      ((bagEClass.getEOperations().get(2)).getEParameters().get(0), 
       source, 
       new String[] 
       {
       "0", null,
       "1", "kermeta::standard::Integer"
       });					
    addAnnotation
      ((bagEClass.getEOperations().get(4)).getEParameters().get(1), 
       source, 
       new String[] 
       {
       "0", null,
       "1", "kermeta::standard::Integer"
       });																																																							
  }

  /**
   * Initializes the annotations for <b>kermeta.post</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createKermeta_2Annotations()
  {
    String source = "kermeta.post";																																
    addAnnotation
      (collectionEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "doesntContainsElementAnymore", ""
       });																																																																																															
    addAnnotation
      (bagEClass.getEOperations().get(14), 
       source, 
       new String[] 
       {
       "doesntContainsElementAnymore", ""
       });																																										
  }

} //StandardPackageImpl
