/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsName.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Os Name</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.OsName#getOsname <em>Osname</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getOsName()
 * @model
 * @generated
 */
public interface OsName extends NativeCodeDirective {
	/**
	 * Returns the value of the '<em><b>Osname</b></em>' attribute. The
	 * literals are from the enumeration {@link option.OsNameEnum}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osname</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Osname</em>' attribute.
	 * @see option.OsNameEnum
	 * @see #setOsname(OsNameEnum)
	 * @see option.OptionPackage#getOsName_Osname()
	 * @model required="true"
	 * @generated
	 */
	OsNameEnum getOsname();

	/**
	 * Sets the value of the '{@link option.OsName#getOsname <em>Osname</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Osname</em>' attribute.
	 * @see option.OsNameEnum
	 * @see #getOsname()
	 * @generated
	 */
	void setOsname(OsNameEnum value);

} // OsName
