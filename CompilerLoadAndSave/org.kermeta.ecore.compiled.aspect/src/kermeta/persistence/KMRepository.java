/**
 * <copyright>
 * </copyright>
 *
 * $Id: KMRepository.java,v 1.1 2008-07-02 09:43:57 ftanguy Exp $
 */
package kermeta.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KM Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.persistence.PersistencePackage#getKMRepository()
 * @model annotation="kermeta documentation='/**\r\n * Repository that stores and manages XMI files representing Kermeta models\r\n \052/'"
 * @generated
 */
public interface KMRepository extends Repository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.String" mm_uriDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\r\n \t * NOT IMPLEMENTED\r\n \t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Repository'"
	 * @generated
	 */
	Resource createResource(String uri, String mm_uri);

} // KMRepository
