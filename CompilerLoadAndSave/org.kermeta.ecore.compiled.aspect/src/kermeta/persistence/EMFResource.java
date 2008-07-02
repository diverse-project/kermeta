/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFResource.java,v 1.1 2008-07-02 09:43:57 ftanguy Exp $
 */
package kermeta.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.persistence.PersistencePackage#getEMFResource()
 * @model annotation="kermeta documentation='/**\r\n * Extension of the Resource class definition that is specific to EMF Repository.\r\n * User is not supposed to directly create it. Otherwise it will not be correctly initialized\r\n * You must To create one \r\n \052/'"
 * @generated
 */
public interface EMFResource extends Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Resource.save()\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Set<Object>.remove(Object)\r\n\t * Remove the instance from the Resource\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 * @generated
	 */
	void remove(kermeta.language.structure.Object instance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model new_uriDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Resource.saveWithNewURI(String)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 * @generated
	 */
	void saveWithNewURI(String new_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Checks the Resource using the EMF validation function, and saves it if\r\n\t * validation succeeds\r\n\t * Applies validation to all root objects of the Resource\r\n\t * Returns true if the validation reports no error, raises exceptions otherwise\r\n\t \052/'"
	 * @generated
	 */
	boolean saveAndValidateWithEMF();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Resource.load()\r\n\t * In case the metamodelURI was not previously set, metamodelURI is filled with\r\n\t * the nsuri of the root package of the metamodel used to load the Resource after\r\n\t * a successful load\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Resource'"
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Set<Object>.add(Object)\r\n\t * Add an instance to the Resource \r\n\t * Ensures that the instance is referenced by a one and only one Resource of the same Repository\r\n\t * Ensures that the instance does not appear more than once in the Resource\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 * @generated
	 */
	void add(kermeta.language.structure.Object instance);

} // EMFResource
