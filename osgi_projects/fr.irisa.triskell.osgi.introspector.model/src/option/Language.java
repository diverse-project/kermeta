/**
 * <copyright>
 * </copyright>
 *
 * $Id: Language.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.Language#getIsoCode <em>Iso Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends NativeCodeDirective {
	/**
	 * Returns the value of the '<em><b>Iso Code</b></em>' attribute. The
	 * literals are from the enumeration {@link option.ISOCodeLanguage}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Iso Code</em>' attribute.
	 * @see option.ISOCodeLanguage
	 * @see #setIsoCode(ISOCodeLanguage)
	 * @see option.OptionPackage#getLanguage_IsoCode()
	 * @model required="true"
	 * @generated
	 */
	ISOCodeLanguage getIsoCode();

	/**
	 * Sets the value of the '{@link option.Language#getIsoCode <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Code</em>' attribute.
	 * @see option.ISOCodeLanguage
	 * @see #getIsoCode()
	 * @generated
	 */
	void setIsoCode(ISOCodeLanguage value);

} // Language
