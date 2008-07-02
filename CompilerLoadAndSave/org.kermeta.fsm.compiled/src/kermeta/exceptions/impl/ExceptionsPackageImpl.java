/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ExceptionsPackageImpl.java,v 1.1 2008-07-02 09:13:28 ftanguy Exp $
 */
package kermeta.exceptions.impl;

import fsm.FsmPackage;

import fsm.impl.FsmPackageImpl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.AbstractClassInstantiationError;
import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ConstraintViolatedInv;
import kermeta.exceptions.ConstraintViolatedPost;
import kermeta.exceptions.ConstraintViolatedPre;
import kermeta.exceptions.DivisionByZero;
import kermeta.exceptions.DynamicExpressionException;
import kermeta.exceptions.EmptyCollection;
import kermeta.exceptions.ExceptionsFactory;
import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.FileNotFoundException;
import kermeta.exceptions.IOException;
import kermeta.exceptions.IncompatibleTypeError;
import kermeta.exceptions.IndexOutOfBound;
import kermeta.exceptions.IteratorIsOff;
import kermeta.exceptions.NotImplementedException;
import kermeta.exceptions.OverflowError;
import kermeta.exceptions.ResourceCreateException;
import kermeta.exceptions.ResourceLoadException;
import kermeta.exceptions.ResourceSaveException;
import kermeta.exceptions.ResourceUnconformityException;
import kermeta.exceptions.RuntimeError;
import kermeta.exceptions.StringFormatException;
import kermeta.exceptions.StringIndexOutOfBound;
import kermeta.exceptions.TypeCastError;
import kermeta.exceptions.UpperBoundReachedError;
import kermeta.exceptions.VoidOperandError;

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

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionsPackageImpl extends EPackageImpl implements ExceptionsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runtimeErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callOnVoidTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeCastErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notImplementedExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass upperBoundReachedErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractClassInstantiationErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass incompatibleTypeErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionByZeroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overflowErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidOperandErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringIndexOutOfBoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringFormatExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexOutOfBoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iteratorIsOffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ioExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileNotFoundExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintViolatedPreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintViolatedPostEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintViolatedInvEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceLoadExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceSaveExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceCreateExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceUnconformityExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicExpressionExceptionEClass = null;

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
   * @see kermeta.exceptions.ExceptionsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExceptionsPackageImpl()
  {
    super(eNS_URI, ExceptionsFactory.eINSTANCE);
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
  public static ExceptionsPackage init()
  {
    if (isInited) return (ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI);

    // Obtain or create and register package
    ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ExceptionsPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) : KermetaPackage.eINSTANCE);
    LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
    StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
    BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
    StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) : StandardPackage.eINSTANCE);
    UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) : UtilsPackage.eINSTANCE);
    IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
    KunitPackageImpl theKunitPackage = (KunitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) : KunitPackage.eINSTANCE);
    EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
    InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) : InterpreterPackage.eINSTANCE);
    PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
    FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);

    // Create package meta-data objects
    theExceptionsPackage.createPackageContents();
    theKermetaPackage.createPackageContents();
    theLanguagePackage.createPackageContents();
    theStructurePackage.createPackageContents();
    theBehaviorPackage.createPackageContents();
    theStandardPackage.createPackageContents();
    theUtilsPackage.createPackageContents();
    theIoPackage.createPackageContents();
    theKunitPackage.createPackageContents();
    theEcorePackage.createPackageContents();
    theInterpreterPackage.createPackageContents();
    thePersistencePackage.createPackageContents();
    theFsmPackage.createPackageContents();

    // Initialize created meta-data
    theExceptionsPackage.initializePackageContents();
    theKermetaPackage.initializePackageContents();
    theLanguagePackage.initializePackageContents();
    theStructurePackage.initializePackageContents();
    theBehaviorPackage.initializePackageContents();
    theStandardPackage.initializePackageContents();
    theUtilsPackage.initializePackageContents();
    theIoPackage.initializePackageContents();
    theKunitPackage.initializePackageContents();
    theEcorePackage.initializePackageContents();
    theInterpreterPackage.initializePackageContents();
    thePersistencePackage.initializePackageContents();
    theFsmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExceptionsPackage.freeze();

    return theExceptionsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getException()
  {
    return exceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getException_Message()
  {
    return (EAttribute)exceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getException_NestedException()
  {
    return (EReference)exceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getException_StackTrace()
  {
    return (EAttribute)exceptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuntimeError()
  {
    return runtimeErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuntimeError_Expression()
  {
    return (EReference)runtimeErrorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallOnVoidTarget()
  {
    return callOnVoidTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeCastError()
  {
    return typeCastErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotImplementedException()
  {
    return notImplementedExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpperBoundReachedError()
  {
    return upperBoundReachedErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractClassInstantiationError()
  {
    return abstractClassInstantiationErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncompatibleTypeError()
  {
    return incompatibleTypeErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivisionByZero()
  {
    return divisionByZeroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOverflowError()
  {
    return overflowErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoidOperandError()
  {
    return voidOperandErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringIndexOutOfBound()
  {
    return stringIndexOutOfBoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringFormatException()
  {
    return stringFormatExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexOutOfBound()
  {
    return indexOutOfBoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyCollection()
  {
    return emptyCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIteratorIsOff()
  {
    return iteratorIsOffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIOException()
  {
    return ioExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileNotFoundException()
  {
    return fileNotFoundExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintViolatedPre()
  {
    return constraintViolatedPreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintViolatedPost()
  {
    return constraintViolatedPostEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintViolatedInv()
  {
    return constraintViolatedInvEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceLoadException()
  {
    return resourceLoadExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceSaveException()
  {
    return resourceSaveExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceCreateException()
  {
    return resourceCreateExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceUnconformityException()
  {
    return resourceUnconformityExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicExpressionException()
  {
    return dynamicExpressionExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionsFactory getExceptionsFactory()
  {
    return (ExceptionsFactory)getEFactoryInstance();
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
    exceptionEClass = createEClass(EXCEPTION);
    createEAttribute(exceptionEClass, EXCEPTION__MESSAGE);
    createEReference(exceptionEClass, EXCEPTION__NESTED_EXCEPTION);
    createEAttribute(exceptionEClass, EXCEPTION__STACK_TRACE);

    runtimeErrorEClass = createEClass(RUNTIME_ERROR);
    createEReference(runtimeErrorEClass, RUNTIME_ERROR__EXPRESSION);

    callOnVoidTargetEClass = createEClass(CALL_ON_VOID_TARGET);

    typeCastErrorEClass = createEClass(TYPE_CAST_ERROR);

    notImplementedExceptionEClass = createEClass(NOT_IMPLEMENTED_EXCEPTION);

    upperBoundReachedErrorEClass = createEClass(UPPER_BOUND_REACHED_ERROR);

    abstractClassInstantiationErrorEClass = createEClass(ABSTRACT_CLASS_INSTANTIATION_ERROR);

    incompatibleTypeErrorEClass = createEClass(INCOMPATIBLE_TYPE_ERROR);

    divisionByZeroEClass = createEClass(DIVISION_BY_ZERO);

    overflowErrorEClass = createEClass(OVERFLOW_ERROR);

    voidOperandErrorEClass = createEClass(VOID_OPERAND_ERROR);

    stringIndexOutOfBoundEClass = createEClass(STRING_INDEX_OUT_OF_BOUND);

    stringFormatExceptionEClass = createEClass(STRING_FORMAT_EXCEPTION);

    indexOutOfBoundEClass = createEClass(INDEX_OUT_OF_BOUND);

    emptyCollectionEClass = createEClass(EMPTY_COLLECTION);

    iteratorIsOffEClass = createEClass(ITERATOR_IS_OFF);

    ioExceptionEClass = createEClass(IO_EXCEPTION);

    fileNotFoundExceptionEClass = createEClass(FILE_NOT_FOUND_EXCEPTION);

    constraintViolatedPreEClass = createEClass(CONSTRAINT_VIOLATED_PRE);

    constraintViolatedPostEClass = createEClass(CONSTRAINT_VIOLATED_POST);

    constraintViolatedInvEClass = createEClass(CONSTRAINT_VIOLATED_INV);

    resourceLoadExceptionEClass = createEClass(RESOURCE_LOAD_EXCEPTION);

    resourceSaveExceptionEClass = createEClass(RESOURCE_SAVE_EXCEPTION);

    resourceCreateExceptionEClass = createEClass(RESOURCE_CREATE_EXCEPTION);

    resourceUnconformityExceptionEClass = createEClass(RESOURCE_UNCONFORMITY_EXCEPTION);

    dynamicExpressionExceptionEClass = createEClass(DYNAMIC_EXPRESSION_EXCEPTION);
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
    BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    exceptionEClass.getESuperTypes().add(theStructurePackage.getObject());
    runtimeErrorEClass.getESuperTypes().add(this.getException());
    callOnVoidTargetEClass.getESuperTypes().add(this.getRuntimeError());
    typeCastErrorEClass.getESuperTypes().add(this.getRuntimeError());
    notImplementedExceptionEClass.getESuperTypes().add(this.getRuntimeError());
    upperBoundReachedErrorEClass.getESuperTypes().add(this.getRuntimeError());
    abstractClassInstantiationErrorEClass.getESuperTypes().add(this.getRuntimeError());
    incompatibleTypeErrorEClass.getESuperTypes().add(this.getRuntimeError());
    divisionByZeroEClass.getESuperTypes().add(this.getException());
    overflowErrorEClass.getESuperTypes().add(this.getException());
    voidOperandErrorEClass.getESuperTypes().add(this.getException());
    stringIndexOutOfBoundEClass.getESuperTypes().add(this.getException());
    stringFormatExceptionEClass.getESuperTypes().add(this.getException());
    indexOutOfBoundEClass.getESuperTypes().add(this.getException());
    emptyCollectionEClass.getESuperTypes().add(this.getException());
    iteratorIsOffEClass.getESuperTypes().add(this.getException());
    ioExceptionEClass.getESuperTypes().add(this.getException());
    fileNotFoundExceptionEClass.getESuperTypes().add(this.getIOException());
    constraintViolatedPreEClass.getESuperTypes().add(this.getException());
    constraintViolatedPostEClass.getESuperTypes().add(this.getException());
    constraintViolatedInvEClass.getESuperTypes().add(this.getException());
    resourceLoadExceptionEClass.getESuperTypes().add(this.getException());
    resourceSaveExceptionEClass.getESuperTypes().add(this.getException());
    resourceCreateExceptionEClass.getESuperTypes().add(this.getException());
    resourceUnconformityExceptionEClass.getESuperTypes().add(this.getException());
    dynamicExpressionExceptionEClass.getESuperTypes().add(this.getException());

    // Initialize classes and features; add operations and parameters
    initEClass(exceptionEClass, kermeta.exceptions.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getException_Message(), theStandardPackage.getString(), "message", null, 0, 1, kermeta.exceptions.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getException_NestedException(), this.getException(), null, "nestedException", null, 0, 1, kermeta.exceptions.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getException_StackTrace(), theStandardPackage.getString(), "stackTrace", null, 0, 1, kermeta.exceptions.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runtimeErrorEClass, RuntimeError.class, "RuntimeError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuntimeError_Expression(), theBehaviorPackage.getExpression(), null, "expression", null, 0, 1, RuntimeError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callOnVoidTargetEClass, CallOnVoidTarget.class, "CallOnVoidTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeCastErrorEClass, TypeCastError.class, "TypeCastError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notImplementedExceptionEClass, NotImplementedException.class, "NotImplementedException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(upperBoundReachedErrorEClass, UpperBoundReachedError.class, "UpperBoundReachedError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractClassInstantiationErrorEClass, AbstractClassInstantiationError.class, "AbstractClassInstantiationError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(incompatibleTypeErrorEClass, IncompatibleTypeError.class, "IncompatibleTypeError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divisionByZeroEClass, DivisionByZero.class, "DivisionByZero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(overflowErrorEClass, OverflowError.class, "OverflowError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(voidOperandErrorEClass, VoidOperandError.class, "VoidOperandError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringIndexOutOfBoundEClass, StringIndexOutOfBound.class, "StringIndexOutOfBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringFormatExceptionEClass, StringFormatException.class, "StringFormatException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(indexOutOfBoundEClass, IndexOutOfBound.class, "IndexOutOfBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emptyCollectionEClass, EmptyCollection.class, "EmptyCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iteratorIsOffEClass, IteratorIsOff.class, "IteratorIsOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ioExceptionEClass, IOException.class, "IOException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fileNotFoundExceptionEClass, FileNotFoundException.class, "FileNotFoundException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constraintViolatedPreEClass, ConstraintViolatedPre.class, "ConstraintViolatedPre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constraintViolatedPostEClass, ConstraintViolatedPost.class, "ConstraintViolatedPost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constraintViolatedInvEClass, ConstraintViolatedInv.class, "ConstraintViolatedInv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceLoadExceptionEClass, ResourceLoadException.class, "ResourceLoadException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceSaveExceptionEClass, ResourceSaveException.class, "ResourceSaveException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceCreateExceptionEClass, ResourceCreateException.class, "ResourceCreateException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceUnconformityExceptionEClass, ResourceUnconformityException.class, "ResourceUnconformityException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dynamicExpressionExceptionEClass, DynamicExpressionException.class, "DynamicExpressionException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
       "documentation", "/** \r\n * Contains the definition of a Kermeta exception and a few basic exceptions.\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/exceptions_package.png\"/>\r\n */"
       });		
    addAnnotation
      (exceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Generic exceptions\r\n * The main class from which all the exception inherit\r\n */"
       });		
    addAnnotation
      (runtimeErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Exception for interpreter exceptions */"
       });		
    addAnnotation
      (callOnVoidTargetEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Occurs when a feature is called on void */"
       });		
    addAnnotation
      (typeCastErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Occurs when a cast (Object::asType operation) fails\r\n */"
       });		
    addAnnotation
      (notImplementedExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Use this exception whenyou want to forbid the access to an unimplemented operation \r\n * and invite to implement it\r\n */"
       });		
    addAnnotation
      (upperBoundReachedErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** \r\n * Use this exception when user tries to add an element to a property which type is collection\r\n * which has an upper bound != -1 ( ie *)\r\n */"
       });		
    addAnnotation
      (abstractClassInstantiationErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Creation on an abstract class. Usually this is detected by the type-checker. The only\r\n * case where this happens is when instantiating a type variable, whose bound type turns\r\n * out to be abstract.\r\n */"
       });		
    addAnnotation
      (incompatibleTypeErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Raised by the Object::set operation if the type of the \r\n * Object to set has an incompatible type.\r\n */"
       });		
    addAnnotation
      (divisionByZeroEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** well-known attempt to divide with a zero valued divider */"
       });		
    addAnnotation
      (overflowErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** the figure oversteps the capacity of the numeric variable */"
       });		
    addAnnotation
      (voidOperandErrorEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** one of the required operands is void */"
       });		
    addAnnotation
      (stringIndexOutOfBoundEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** the data overstep the size of the string variable */"
       });		
    addAnnotation
      (stringFormatExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * to be written #########################################\r\n */"
       });		
    addAnnotation
      (indexOutOfBoundEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Occurs when trying to access out of bounds elements */"
       });		
    addAnnotation
      (emptyCollectionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Occurs when trying to access element on an empty collection */"
       });		
    addAnnotation
      (iteratorIsOffEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Occurs when calling next() operation while iterator is already\r\n * positioned on the last element of a collection\r\n */"
       });		
    addAnnotation
      (ioExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** an interaction with the underlying system failed */"
       });		
    addAnnotation
      (fileNotFoundExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** the file has not be found on the underlying system */"
       });		
    addAnnotation
      (constraintViolatedPreEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** the pre-condition is not satisfied */"
       });		
    addAnnotation
      (constraintViolatedPostEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** the post-condition is not satisfied */"
       });		
    addAnnotation
      (constraintViolatedInvEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** some fixes declared in the invariant condition ave been changed */"
       });		
    addAnnotation
      (resourceLoadExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Occurs when Resource loading fails for some reasons */"
       });		
    addAnnotation
      (resourceSaveExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Occurs when Resource saving fails for some reasons */"
       });		
    addAnnotation
      (resourceCreateExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Occurs when trying to crate a Resource already existing in the Repository */"
       });		
    addAnnotation
      (resourceUnconformityExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/** Raised when user tries to add an object that is not conform to the metamodel */"
       });		
    addAnnotation
      (dynamicExpressionExceptionEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * to be written #########################################\r\n */"
       });
  }

} //ExceptionsPackageImpl
