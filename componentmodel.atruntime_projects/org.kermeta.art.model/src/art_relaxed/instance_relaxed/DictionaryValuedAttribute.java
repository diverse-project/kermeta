/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

import art_relaxed.type_relaxed.Dictionary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Valued Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute#getEntries <em>Entries</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getDictionaryValuedAttribute()
 * @model
 * @generated
 */
public interface DictionaryValuedAttribute extends AttributeInstance {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getDictionaryValuedAttribute_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Dictionary)
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getDictionaryValuedAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Dictionary getAttribute();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Dictionary value);

} // DictionaryValuedAttribute
