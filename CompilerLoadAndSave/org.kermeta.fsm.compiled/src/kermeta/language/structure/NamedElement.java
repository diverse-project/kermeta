/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: NamedElement.java,v 1.1 2008-07-02 09:13:20 ftanguy Exp $
 */
package kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see kermeta.language.structure.StructurePackage#getNamedElement_Name()
   * @model dataType="kermeta.standard.String" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kermeta.language.structure.NamedElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Returns the qualified name of this named element. Qualified name is \r\n\t * the list of the names of the packages hierarchically ordered, delimited by\r\n\t * a \"::\", followed by the name of this named element.\r\n\t \052/'"
   * @generated
   */
  String qualifiedName();

} // NamedElement
