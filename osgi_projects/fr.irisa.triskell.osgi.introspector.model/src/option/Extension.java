/**
 * <copyright>
 * </copyright>
 *
 * $Id: Extension.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.Extension#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends FragmentHostDirective {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute. The
	 * literals are from the enumeration {@link option.ExtensionEnum}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see option.ExtensionEnum
	 * @see #setExtension(ExtensionEnum)
	 * @see option.OptionPackage#getExtension_Extension()
	 * @model required="true"
	 * @generated
	 */
	ExtensionEnum getExtension();

	/**
	 * Sets the value of the '{@link option.Extension#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see option.ExtensionEnum
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(ExtensionEnum value);

} // Extension
