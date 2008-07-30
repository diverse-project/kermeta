/**
 * <copyright>
 * </copyright>
 *
 * $Id: Resolution.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.Resolution#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getResolution()
 * @model
 * @generated
 */
public interface Resolution extends ImportPackageDirective {
	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute. The
	 * literals are from the enumeration {@link option.ResolutionEnum}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see option.ResolutionEnum
	 * @see #setResolution(ResolutionEnum)
	 * @see option.OptionPackage#getResolution_Resolution()
	 * @model required="true"
	 * @generated
	 */
	ResolutionEnum getResolution();

	/**
	 * Sets the value of the '{@link option.Resolution#getResolution <em>Resolution</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolution</em>' attribute.
	 * @see option.ResolutionEnum
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(ResolutionEnum value);

} // Resolution
