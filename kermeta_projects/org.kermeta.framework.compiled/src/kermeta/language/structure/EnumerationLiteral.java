/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EnumerationLiteral.java,v 1.1 2008-06-24 14:23:26 cfaucher Exp $
 */
package kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getEnumerationLiteral()
 * @model annotation="kermeta documentation='Item definition for enumeration'"
 * @generated
 */
public interface EnumerationLiteral extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' container reference.
   * @see #setEnumeration(Enumeration)
   * @see kermeta.language.structure.StructurePackage#getEnumerationLiteral_Enumeration()
   * @see kermeta.language.structure.Enumeration#getOwnedLiteral
   * @model opposite="ownedLiteral"
   *        annotation="kermeta ecore.isTransient='true'"
   *        annotation="kermeta documentation='Owning Enumeration'"
   * @generated
   */
  Enumeration getEnumeration();

  /**
   * Sets the value of the '{@link kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' container reference.
   * @see #getEnumeration()
   * @generated
   */
  void setEnumeration(Enumeration value);

} // EnumerationLiteral
