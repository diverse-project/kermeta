/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterEntry.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.ParameterEntry#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getParameterEntry()
 * @model abstract="true"
 * @generated
 */
public interface ParameterEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see option.OptionPackage#getParameterEntry_Token()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link option.ParameterEntry#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // ParameterEntry
