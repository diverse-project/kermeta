/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.Concat#getPropertyNames <em>Property Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getConcat()
 * @model
 * @generated
 */
public interface Concat extends BinaryDirective {
	/**
	 * Returns the value of the '<em><b>Property Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Names</em>' attribute list.
	 * @see directives.DirectivesPackage#getConcat_PropertyNames()
	 * @model dataType="directives.String"
	 * @generated
	 */
	EList<String> getPropertyNames();

} // Concat
