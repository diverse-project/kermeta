/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl;

import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getCollectionLiteralPart()
 * @model abstract="true"
 * @generated
 */
public interface CollectionLiteralPart extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Collection Literal Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Literal Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Literal Exp</em>' container reference.
	 * @see #setCollectionLiteralExp(CollectionLiteralExp)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getCollectionLiteralPart_CollectionLiteralExp()
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionLiteralExp#getPart
	 * @model opposite="part" required="true" ordered="false"
	 * @generated
	 */
	CollectionLiteralExp getCollectionLiteralExp();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Literal Exp</em>' container reference.
	 * @see #getCollectionLiteralExp()
	 * @generated
	 */
	void setCollectionLiteralExp(CollectionLiteralExp value);

} // CollectionLiteralPart
