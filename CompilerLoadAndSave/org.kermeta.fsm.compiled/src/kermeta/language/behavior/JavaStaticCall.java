/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: JavaStaticCall.java,v 1.1 2008-07-02 09:13:25 ftanguy Exp $
 */
package kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Static Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}</li>
 *   <li>{@link kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}</li>
 *   <li>{@link kermeta.language.behavior.JavaStaticCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall()
 * @model annotation="kermeta documentation='This class represent a call to an extern Java operation. \nThis Java operation must be static and have at least one RuntimeO'"
 * @generated
 */
public interface JavaStaticCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Jmethod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jmethod</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jmethod</em>' attribute.
   * @see #setJmethod(String)
   * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Jmethod()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getJmethod();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jmethod</em>' attribute.
   * @see #getJmethod()
   * @generated
   */
  void setJmethod(String value);

  /**
   * Returns the value of the '<em><b>Jclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jclass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jclass</em>' attribute.
   * @see #setJclass(String)
   * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Jclass()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getJclass();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jclass</em>' attribute.
   * @see #getJclass()
   * @generated
   */
  void setJclass(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.behavior.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see kermeta.language.behavior.BehaviorPackage#getJavaStaticCall_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParameters();

} // JavaStaticCall
