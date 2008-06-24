/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: UnknownJavaObject.java,v 1.1 2008-06-24 14:23:38 cfaucher Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Java Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getUnknownJavaObject()
 * @model annotation="kermeta documentation='/** \r\n  * This special object is used to represent java objects that cannot be concretely used with kermeta\r\n  * <b>the only actions possible on these objects are : assignment and passing them as parameter</b>\r\n  * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\r\n  \052/'"
 * @generated
 */
public interface UnknownJavaObject extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n \t * NOT IMPLEMENTED\r\n \t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  String toString();

} // UnknownJavaObject
