/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Void.java,v 1.1 2008-07-02 09:13:29 ftanguy Exp $
 */
package kermeta.standard;

import kermeta.language.structure.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Void</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getVoid()
 * @model annotation="kermeta documentation='/**\r\n * The class Void \r\n * By convention it is a sub-type of everything\r\n \052/'"
 * @generated
 */
public interface Void extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Return true\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  boolean isVoid();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Returns true\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  boolean isInstanceOf(Type type);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Returns the String identifier \'<void>\'\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  String toString();

} // Void
