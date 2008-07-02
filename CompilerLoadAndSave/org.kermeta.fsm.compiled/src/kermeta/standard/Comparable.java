/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comparable.java,v 1.1 2008-07-02 09:13:29 ftanguy Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getComparable()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The abstract class Comparable defines a set of operation\r\n * to compare instances of a class.\r\n * Sub-classes only has to implement abstract operation compareTo.\r\n * All other methods are defined w.r.t. the compareTo operation\r\n \052/'"
 * @generated
 */
public interface Comparable extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * return true if self < other\r\n\t \052/'"
   * @generated
   */
  boolean isLower(kermeta.language.structure.Object other);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * return true if self >= other\r\n\t \052/'"
   * @generated
   */
  boolean isGreaterOrEqual(kermeta.language.structure.Object other);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Integer"
   *        annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * This method should be implemented by any class that inherits\r\n\t * from Comparable.\r\n\t * returns 0 if self = other\r\n\t * returns > 0 if  self > other\r\n\t * returns < 0 if  self < other\r\n\t \052/'"
   * @generated
   */
  int compareTo(kermeta.language.structure.Object other);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * return true if self <= other\r\n\t \052/'"
   * @generated
   */
  boolean isLowerOrEqual(kermeta.language.structure.Object other);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * return true if self > other\r\n\t \052/'"
   * @generated
   */
  boolean isGreater(kermeta.language.structure.Object other);

} // Comparable
