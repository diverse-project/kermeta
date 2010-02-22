/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.ServiceDataType#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getServiceDataType()
 * @model
 * @generated
 */
public interface ServiceDataType extends AbstractDataType {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see art2.Art2Package#getServiceDataType_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // ServiceDataType
