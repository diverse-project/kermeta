/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementType.java,v 1.1 2008-02-20 14:16:35 ffleurey Exp $
 */
package acm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acm.ElementType#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see acm.AcmPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' attribute.
	 * @see #setHierarchy(Boolean)
	 * @see acm.AcmPackage#getElementType_Hierarchy()
	 * @model default="false" dataType="acm.Boolean"
	 * @generated
	 */
	Boolean getHierarchy();

	/**
	 * Sets the value of the '{@link acm.ElementType#getHierarchy <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy</em>' attribute.
	 * @see #getHierarchy()
	 * @generated
	 */
	void setHierarchy(Boolean value);

} // ElementType
