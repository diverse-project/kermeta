/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import org.eclipse.emf.common.util.EList;

import art.instance.TransmissionBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.PrimitiveType#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends ComponentType {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.TransmissionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see art.type.TypePackage#getPrimitiveType_Binding()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransmissionBinding> getBinding();

} // PrimitiveType
