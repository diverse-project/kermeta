/**
 * <copyright>
 * </copyright>
 *
 * $Id: Visibility.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.Visibility#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getVisibility()
 * @model
 * @generated
 */
public interface Visibility extends RequireBundleDirective {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute. The
	 * literals are from the enumeration {@link option.VisibilityEnum}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see option.VisibilityEnum
	 * @see #setVisibility(VisibilityEnum)
	 * @see option.OptionPackage#getVisibility_Visibility()
	 * @model required="true"
	 * @generated
	 */
	VisibilityEnum getVisibility();

	/**
	 * Sets the value of the '{@link option.Visibility#getVisibility <em>Visibility</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Visibility</em>' attribute.
	 * @see option.VisibilityEnum
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityEnum value);

} // Visibility
