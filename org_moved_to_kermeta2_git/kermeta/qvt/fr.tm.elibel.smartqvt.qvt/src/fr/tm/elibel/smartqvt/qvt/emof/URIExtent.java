/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getURIExtent()
 * @model
 * @generated
 */
public interface URIExtent extends Extent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	String contextURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	Element element(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	String uri(Element element);

} // URIExtent
