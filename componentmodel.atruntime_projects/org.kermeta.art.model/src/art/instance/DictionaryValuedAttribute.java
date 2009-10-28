/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Valued Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.DictionaryValuedAttribute#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getDictionaryValuedAttribute()
 * @model
 * @generated
 */
public interface DictionaryValuedAttribute extends ValuedAttribute {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see art.instance.InstancePackage#getDictionaryValuedAttribute_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // DictionaryValuedAttribute
