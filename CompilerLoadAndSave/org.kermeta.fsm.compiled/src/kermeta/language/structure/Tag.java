/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Tag.java,v 1.1 2008-07-02 09:13:20 ftanguy Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Tag#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.structure.Tag#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTag()
 * @model annotation="kermeta documentation='Tag is intended to be used to add documentation on a  model element,\nor add some textual information that cannot be expressed with any\nmodel element definition.'"
 * @generated
 */
public interface Tag extends kermeta.language.structure.Object
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
   * @see kermeta.language.structure.StructurePackage#getTag_Name()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Tag#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see kermeta.language.structure.StructurePackage#getTag_Value()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Tag#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.Object}.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.Object#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getTag_Object()
   * @see kermeta.language.structure.Object#getTag
   * @model opposite="tag" required="true"
   * @generated
   */
  EList<kermeta.language.structure.Object> getObject();

} // Tag
