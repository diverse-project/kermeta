/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: MultiplicityElement.java,v 1.1 2008-07-02 09:13:20 ftanguy Exp $
 */
package kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement()
 * @model annotation="kermeta documentation=' Model elements with a multiplicity [lower..upper] inherit this class'"
 * @generated
 */
public interface MultiplicityElement extends TypedElement
{
  /**
   * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Ordered</em>' attribute.
   * @see #setIsOrdered(boolean)
   * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_IsOrdered()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isIsOrdered();

  /**
   * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Ordered</em>' attribute.
   * @see #isIsOrdered()
   * @generated
   */
  void setIsOrdered(boolean value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(int)
   * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_Upper()
   * @model dataType="kermeta.standard.Integer"
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_Lower()
   * @model dataType="kermeta.standard.Integer"
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Unique</em>' attribute.
   * @see #setIsUnique(boolean)
   * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_IsUnique()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isIsUnique();

  /**
   * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#isIsUnique <em>Is Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Unique</em>' attribute.
   * @see #isIsUnique()
   * @generated
   */
  void setIsUnique(boolean value);

} // MultiplicityElement
