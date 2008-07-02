/**
 * <copyright>
 * </copyright>
 *
 * $Id: Repository.java,v 1.1 2008-07-02 09:43:57 ftanguy Exp $
 */
package kermeta.persistence;

import kermeta.standard.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.Repository#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getRepository()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * Abstract resource container, that contains a list of available loaded resources, \r\n * and methods to create or get a resource given an URI.\r\n \052/'"
 * @generated
 */
public interface Repository extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.persistence.Resource}.
	 * It is bidirectional and its opposite is '{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see kermeta.persistence.PersistencePackage#getRepository_Resources()
	 * @see kermeta.persistence.Resource#getRepository
	 * @model opposite="repository" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/**\r\n\t * Resources created by this Repository \r\n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \r\n\t * one Resource of a given Repository\r\n\t \052/'"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.String" mm_uriDataType="kermeta.standard.String"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Creates a new Resource with given uri, and an optional mm_uri\r\n\t * mm_uri is required when creating a new model from scratch.\r\n\t * Raises a ResourceCreate exception in case the Repository already\r\n\t * contains a Resource with the given uri\r\n\t * If uri does not points to an existing model file (in the case of\r\n\t * a model creation), calls to load() operation will fail as long as\r\n\t * the model has not been saved once\r\n\t \052/'"
	 * @generated
	 */
	Resource createResource(String uri, String mm_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Search for elements referenced by one element contained by this repository  that are not contained by this repository\r\n\t * ie. element that EMF would claim as \"not contained in a resource\"\r\n\t * example of use :\r\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\r\n     *\treport := repository.findDanglingModelElements()\r\n     *\treport.each{ diag | stdio.writeln(diag.toString ) }\r\n\t \052/'"
	 * @generated
	 */
	Set<DanglingDiagnostic> findDanglingModelElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the Resource associated with the given uri if this uri is associated with\r\n\t * an already created Resource of the Repository.\r\n\t * If the Repository contains no Resource associated with the given uri, creates\r\n\t * a new Resource and loads it.\r\n\t * Raises a ResourceCreate exception if the given uri does not point to an existing\r\n\t * model file \r\n\t \052/'"
	 * @generated
	 */
	Resource getResource(String uri);

} // Repository
