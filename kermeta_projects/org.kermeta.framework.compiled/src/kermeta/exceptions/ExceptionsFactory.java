/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ExceptionsFactory.java,v 1.1 2008-06-24 14:23:18 cfaucher Exp $
 */
package kermeta.exceptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.exceptions.ExceptionsPackage
 * @generated
 */
public interface ExceptionsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExceptionsFactory eINSTANCE = kermeta.exceptions.impl.ExceptionsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception</em>'.
   * @generated
   */
  kermeta.exceptions.Exception createException();

  /**
   * Returns a new object of class '<em>Runtime Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Runtime Error</em>'.
   * @generated
   */
  RuntimeError createRuntimeError();

  /**
   * Returns a new object of class '<em>Call On Void Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call On Void Target</em>'.
   * @generated
   */
  CallOnVoidTarget createCallOnVoidTarget();

  /**
   * Returns a new object of class '<em>Type Cast Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Cast Error</em>'.
   * @generated
   */
  TypeCastError createTypeCastError();

  /**
   * Returns a new object of class '<em>Not Implemented Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Implemented Exception</em>'.
   * @generated
   */
  NotImplementedException createNotImplementedException();

  /**
   * Returns a new object of class '<em>Upper Bound Reached Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Upper Bound Reached Error</em>'.
   * @generated
   */
  UpperBoundReachedError createUpperBoundReachedError();

  /**
   * Returns a new object of class '<em>Abstract Class Instantiation Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Class Instantiation Error</em>'.
   * @generated
   */
  AbstractClassInstantiationError createAbstractClassInstantiationError();

  /**
   * Returns a new object of class '<em>Incompatible Type Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Incompatible Type Error</em>'.
   * @generated
   */
  IncompatibleTypeError createIncompatibleTypeError();

  /**
   * Returns a new object of class '<em>Division By Zero</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division By Zero</em>'.
   * @generated
   */
  DivisionByZero createDivisionByZero();

  /**
   * Returns a new object of class '<em>Overflow Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Overflow Error</em>'.
   * @generated
   */
  OverflowError createOverflowError();

  /**
   * Returns a new object of class '<em>Void Operand Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void Operand Error</em>'.
   * @generated
   */
  VoidOperandError createVoidOperandError();

  /**
   * Returns a new object of class '<em>String Index Out Of Bound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Index Out Of Bound</em>'.
   * @generated
   */
  StringIndexOutOfBound createStringIndexOutOfBound();

  /**
   * Returns a new object of class '<em>String Format Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Format Exception</em>'.
   * @generated
   */
  StringFormatException createStringFormatException();

  /**
   * Returns a new object of class '<em>Index Out Of Bound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Out Of Bound</em>'.
   * @generated
   */
  IndexOutOfBound createIndexOutOfBound();

  /**
   * Returns a new object of class '<em>Empty Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Collection</em>'.
   * @generated
   */
  EmptyCollection createEmptyCollection();

  /**
   * Returns a new object of class '<em>Iterator Is Off</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterator Is Off</em>'.
   * @generated
   */
  IteratorIsOff createIteratorIsOff();

  /**
   * Returns a new object of class '<em>IO Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IO Exception</em>'.
   * @generated
   */
  IOException createIOException();

  /**
   * Returns a new object of class '<em>File Not Found Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Not Found Exception</em>'.
   * @generated
   */
  FileNotFoundException createFileNotFoundException();

  /**
   * Returns a new object of class '<em>Constraint Violated Pre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Violated Pre</em>'.
   * @generated
   */
  ConstraintViolatedPre createConstraintViolatedPre();

  /**
   * Returns a new object of class '<em>Constraint Violated Post</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Violated Post</em>'.
   * @generated
   */
  ConstraintViolatedPost createConstraintViolatedPost();

  /**
   * Returns a new object of class '<em>Constraint Violated Inv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Violated Inv</em>'.
   * @generated
   */
  ConstraintViolatedInv createConstraintViolatedInv();

  /**
   * Returns a new object of class '<em>Resource Load Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Load Exception</em>'.
   * @generated
   */
  ResourceLoadException createResourceLoadException();

  /**
   * Returns a new object of class '<em>Resource Save Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Save Exception</em>'.
   * @generated
   */
  ResourceSaveException createResourceSaveException();

  /**
   * Returns a new object of class '<em>Resource Create Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Create Exception</em>'.
   * @generated
   */
  ResourceCreateException createResourceCreateException();

  /**
   * Returns a new object of class '<em>Resource Unconformity Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Unconformity Exception</em>'.
   * @generated
   */
  ResourceUnconformityException createResourceUnconformityException();

  /**
   * Returns a new object of class '<em>Dynamic Expression Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Expression Exception</em>'.
   * @generated
   */
  DynamicExpressionException createDynamicExpressionException();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ExceptionsPackage getExceptionsPackage();

} //ExceptionsFactory
