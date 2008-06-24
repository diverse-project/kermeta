/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Resource.java,v 1.1 2008-06-24 14:23:39 cfaucher Exp $
 */
package kermeta.persistence;

import kermeta.standard.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.Resource#getDependentResources <em>Dependent Resources</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getContents <em>Contents</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.Resource#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getResource()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The main class that handle a loaded/saved model.\r\n * There are a few important things to note for the developer :\r\n * \r\n * - load a Resource : this loads a Collection of instances corresponding to the\r\n *   objects in the loaded model. If the Collection of instances is empty, than \r\n *\t a ResourceLoadException is raised\r\n *\r\n * - save a Resource : this saves the collection of instances in a new file. This can\r\n *   be correctly done if and only if the instances saved are conform to the metamodel\r\n *   linked to this resource (this link does not need to be explicit. It is normally retrieved\r\n *   through the EMF model -- see Java wrapping \"Resource.java\").\r\n * \r\n * - add/remove an instance to the Resource : this adds an element in the resource. It cannot\r\n *   be \"simply\" added because of the following potential errors :\r\n *\r\n *   - The object added is not conform to the metamodel -> Error\r\n *   - The object was already added in the resource -> Not a real error : we do nothing\r\n *   - The object to remove does not exist -> redirect to a collection-specific error\r\n *   - The object to remove is attached to an object in the collection -> \"dependency-violation\" exception?\r\n\r\n \052/'"
 * @generated
 */
public interface Resource extends Set<kermeta.language.structure.Object>
{
  /**
   * Returns the value of the '<em><b>Dependent Resources</b></em>' reference list.
   * The list contents are of type {@link kermeta.persistence.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependent Resources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependent Resources</em>' reference list.
   * @see kermeta.persistence.PersistencePackage#getResource_DependentResources()
   * @model derived="true" ordered="false"
   *        annotation="kermeta isReadOnly='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Returns the set of Resources the current Resource, which must have been loaded,\r\n\t * depends on, an empty set if current Resource has no dependency\r\n\t \052/'"
   * @generated
   */
  EList<Resource> getDependentResources();

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
   * @see kermeta.persistence.PersistencePackage#getResource_Contents()
   * @model derived="true" ordered="false"
   *        annotation="kermeta isReadOnly='true'"
   *        annotation="kermeta documentation='/** \r\n\t * Returns the set of all Objects directly or indirectly contained by the Resource,\r\n\t * or an empty set if the Resource is empty\r\n\t \052/'"
   * @generated
   */
  EList<kermeta.language.structure.Object> getContents();

  /**
   * Returns the value of the '<em><b>Repository</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link kermeta.persistence.Repository#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' container reference.
   * @see #setRepository(Repository)
   * @see kermeta.persistence.PersistencePackage#getResource_Repository()
   * @see kermeta.persistence.Repository#getResources
   * @model opposite="resources" transient="false"
   *        annotation="kermeta documentation='/**\r\n\t * Repository used to create the Resource\r\n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \r\n\t * one Resource of a given Repository\r\n\t \052/'"
   * @generated
   */
  Repository getRepository();

  /**
   * Sets the value of the '{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' container reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(Repository value);

  /**
   * Returns the value of the '<em><b>Meta Model URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Model URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Model URI</em>' attribute.
   * @see #setMetaModelURI(String)
   * @see kermeta.persistence.PersistencePackage#getResource_MetaModelURI()
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Uri of the meta-model of the Resource to load\r\n\t \052/'"
   * @generated
   */
  String getMetaModelURI();

  /**
   * Sets the value of the '{@link kermeta.persistence.Resource#getMetaModelURI <em>Meta Model URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Model URI</em>' attribute.
   * @see #getMetaModelURI()
   * @generated
   */
  void setMetaModelURI(String value);

  /**
   * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Read Only</em>' attribute.
   * @see #setIsReadOnly(boolean)
   * @see kermeta.persistence.PersistencePackage#getResource_IsReadOnly()
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Indicates weither this resource will be updated when saving the repository\r\n\t * This is useful if the repository contains some metamodels that should not be saved.\r\n\t *\r\n\t * Note that in the current version, it doesn\'t ensure that you have not modified its content (using the freeze)\r\n\t * If you modify the elements of such resource, other resource that depend on it will be incorrectly saved \r\n\t \052/'"
   * @generated
   */
  boolean isIsReadOnly();

  /**
   * Sets the value of the '{@link kermeta.persistence.Resource#isIsReadOnly <em>Is Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Read Only</em>' attribute.
   * @see #isIsReadOnly()
   * @generated
   */
  void setIsReadOnly(boolean value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see kermeta.persistence.PersistencePackage#getResource_Uri()
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Uri of the Resource to load\r\n\t \052/'"
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link kermeta.persistence.Resource#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Save a Resource in the file specified by the current value of uri \r\n\t \052/'"
   * @generated
   */
  void save();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model new_uriDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Save a Resource in a file referenced by the new uri. \r\n\t \052/'"
   * @generated
   */
  void saveWithNewURI(String new_uri);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Loads the Resource, thus making content of the Resource browsable.\r\n\t * Raises a ResourceLoadException in case loaded Resource is empty\r\n\t \052/'"
   * @generated
   */
  void load();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * The entities contained in the model-instance, that are provided when user loads a resource \r\n\t * instances == rootContents\r\n\t * this is a loop on Resource itself in order to get backward compatibility\r\n\t * user should use the resource directly since this is a collection\r\n\t \052/'"
   * @generated
   */
  Resource instances();

} // Resource
