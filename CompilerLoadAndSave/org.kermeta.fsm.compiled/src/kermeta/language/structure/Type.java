/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Type.java,v 1.1 2008-07-02 09:13:21 ftanguy Exp $
 */
package kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getType()
 * @model
 * @generated
 */
public interface Type extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Type Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Container</em>' container reference.
   * @see #setTypeContainer(TypeContainer)
   * @see kermeta.language.structure.StructurePackage#getType_TypeContainer()
   * @see kermeta.language.structure.TypeContainer#getContainedType
   * @model opposite="containedType" transient="false"
   * @generated
   */
  TypeContainer getTypeContainer();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Container</em>' container reference.
   * @see #getTypeContainer()
   * @generated
   */
  void setTypeContainer(TypeContainer value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Returns a copy of passed Object built by recursively copying attribute\r\n\t * properties, and referencing original reference properties values\r\n\t \052/'"
   * @generated
   */
  kermeta.language.structure.Object clone(kermeta.language.structure.Object objectToClone);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Implements Type.isInstance(Object)\r\n\t \052/'"
   * @generated
   */
  boolean isInstance(kermeta.language.structure.Object element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n \t * Implements Type.isSuperTypeOf(Type)\r\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\r\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\r\n \t * to extend it.\r\n \t \052/'"
   * @generated
   */
  boolean isSuperTypeOf(Type object);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Returns a copy of passed Object built by recursively copying values of\r\n\t * all properties, no matter the property kind\r\n\t \052/'"
   * @generated
   */
  kermeta.language.structure.Object deepClone(kermeta.language.structure.Object objectToClone);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n \t * Implements Type.isSubTypeOf(Type)\r\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\r\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\r\n \t * to extend it.\r\n \t \052/'"
   * @generated
   */
  boolean isSubTypeOf(Type object);

} // Type
