/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Model.java,v 1.1 2008-07-02 09:13:20 ftanguy Exp $
 */
package kermeta.language.structure;

import kermeta.standard.Collection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getModel_Contents()
   * @model
   * @generated
   */
  EList<kermeta.language.structure.Object> getContents();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n \t * Add the Object if it is copmpatible with the ModelDefinition. Other objects are ignored.\r\n \t * Returns the object if it has been added (One can check that some element have been ignored or not)\r\n \t * return Void if not added\r\n \t \052/'"
   * @generated
   */
  kermeta.language.structure.Object addCompatible(kermeta.language.structure.Object objectToAdd);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n \t * Remove an object from the model\r\n \t \052/'"
   * @generated
   */
  void remove(kermeta.language.structure.Object obj);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n \t * Add all the Object of the collection that are copmpatible with the ModelDefinition. Other objects are ignored.\r\n \t * Returns the list of Object that have been added (One can check that some element have been ignored or not)\r\n \t \052/'"
   * @generated
   */
  Collection<kermeta.language.structure.Object> addAllCompatible(Collection<kermeta.language.structure.Object> objectsToAdd);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n \t * Add an object to the model. According to the ModelType, the typechecker will statically verify if the object can be added or not\r\n \t \052/'"
   * @generated
   */
  void add(kermeta.language.structure.Object obj);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model ordered="false"
   *        annotation="kermeta documentation='/**\r\n \t * Returns a set of all the elements of the model that are instance of the given Type\r\n \t \052/'"
   * @generated
   */
  EList<kermeta.language.structure.Object> filter(Type typeName);

} // Model
