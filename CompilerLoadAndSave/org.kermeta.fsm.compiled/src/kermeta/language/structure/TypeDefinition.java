/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TypeDefinition.java,v 1.1 2008-07-02 09:13:21 ftanguy Exp $
 */
package kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.TypeDefinition#isIsAspect <em>Is Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTypeDefinition()
 * @model annotation="kermeta documentation='This boolean allows to tell if this Type definition is an aspect or not\nIf it is an aspect, then at runtime, its definition will be merged with the definition of another\nTypeDefinition that has exactly the same qualified name'"
 *        annotation="kermeta documentation='Abstraction for type definitions (ClassDefinition, ModelTypeDefinition, DataType inherit\nthis class)'"
 * @generated
 */
public interface TypeDefinition extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Is Aspect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Aspect</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Aspect</em>' attribute.
   * @see #setIsAspect(boolean)
   * @see kermeta.language.structure.StructurePackage#getTypeDefinition_IsAspect()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isIsAspect();

  /**
   * Sets the value of the '{@link kermeta.language.structure.TypeDefinition#isIsAspect <em>Is Aspect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Aspect</em>' attribute.
   * @see #isIsAspect()
   * @generated
   */
  void setIsAspect(boolean value);

} // TypeDefinition
