/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EMFRepository.java,v 1.1 2008-07-02 09:13:19 ftanguy Exp $
 */
package kermeta.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.EMFRepository#isUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}</li>
 *   <li>{@link kermeta.persistence.EMFRepository#isIgnoreLoadErrors <em>Ignore Load Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getEMFRepository()
 * @model annotation="kermeta documentation='/**\r\n * Repository that stores and manages resources that come from EMF\r\n \052/'"
 * @generated
 */
public interface EMFRepository extends Repository
{
  /**
   * Returns the value of the '<em><b>Use Interpreter Internal Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Interpreter Internal Resources</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Interpreter Internal Resources</em>' attribute.
   * @see #setUseInterpreterInternalResources(boolean)
   * @see kermeta.persistence.PersistencePackage#getEMFRepository_UseInterpreterInternalResources()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isUseInterpreterInternalResources();

  /**
   * Sets the value of the '{@link kermeta.persistence.EMFRepository#isUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Interpreter Internal Resources</em>' attribute.
   * @see #isUseInterpreterInternalResources()
   * @generated
   */
  void setUseInterpreterInternalResources(boolean value);

  /**
   * Returns the value of the '<em><b>Ignore Load Errors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Load Errors</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Load Errors</em>' attribute.
   * @see #setIgnoreLoadErrors(boolean)
   * @see kermeta.persistence.PersistencePackage#getEMFRepository_IgnoreLoadErrors()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isIgnoreLoadErrors();

  /**
   * Sets the value of the '{@link kermeta.persistence.EMFRepository#isIgnoreLoadErrors <em>Ignore Load Errors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Load Errors</em>' attribute.
   * @see #isIgnoreLoadErrors()
   * @generated
   */
  void setIgnoreLoadErrors(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model uriDataType="kermeta.standard.String" mm_uriDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Overrides Repository.createResource(String, String)\r\n\t * Create a new resource for a model given by its uri, \r\n\t * which meta-model is stored in file given by mm_uri\r\n\t * If file already exists, you\'ll be able to call the load method to concretly load the model\r\n\t * otherwise, you can only call the save method\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::persistence::Repository'"
   * @generated
   */
  Resource createResource(String uri, String mm_uri);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String" uriDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Return a normalized version of the Uri\r\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\r\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \r\n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\r\n\t * to check how a given uri is normalized by kermeta\r\n\t \052/'"
   * @generated
   */
  String normalizeUri(String uri);

} // EMFRepository
