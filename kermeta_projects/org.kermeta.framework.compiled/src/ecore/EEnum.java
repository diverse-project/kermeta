/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EEnum.java,v 1.1 2008-06-24 14:23:20 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEEnum()
 * @model
 * @generated
 */
public interface EEnum extends EDataType
{
  /**
   * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
   * The list contents are of type {@link ecore.EEnumLiteral}.
   * It is bidirectional and its opposite is '{@link ecore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ELiterals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ELiterals</em>' containment reference list.
   * @see ecore.EcorePackage#getEEnum_ELiterals()
   * @see ecore.EEnumLiteral#getEEnum
   * @model opposite="eEnum" containment="true"
   * @generated
   */
  EList<EEnumLiteral> getELiterals();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  EEnumLiteral op_getEEnumLiteral(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  EEnumLiteral getEEnumLiteral(int value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  EEnumLiteral getEEnumLiteralByLiteral(String literal);

} // EEnum
