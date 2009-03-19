/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtGenericElementReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Generic Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtGenericElementReference#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtGenericElementReference()
 * @model
 * @generated
 */
public interface CtGenericElementReference extends EObject, spoon.reflect.reference.CtGenericElementReference {
	/**
	 * Returns the value of the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Type Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Type Arguments</em>' reference list.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtGenericElementReference_ActualTypeArguments()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	List getActualTypeArguments();

} // CtGenericElementReference