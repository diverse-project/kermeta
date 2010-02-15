/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.DictionaryValue#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getDictionaryValue()
 * @model
 * @generated
 */
public interface DictionaryValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(DictionaryAttribute)
	 * @see art2.Art2Package#getDictionaryValue_Attribute()
	 * @model required="true"
	 * @generated
	 */
	DictionaryAttribute getAttribute();

	/**
	 * Sets the value of the '{@link art2.DictionaryValue#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(DictionaryAttribute value);

} // DictionaryValue
