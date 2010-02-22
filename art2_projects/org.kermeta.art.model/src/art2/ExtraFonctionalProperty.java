/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Fonctional Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.ExtraFonctionalProperty#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getExtraFonctionalProperty()
 * @model
 * @generated
 */
public interface ExtraFonctionalProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Types</b></em>' reference list.
	 * The list contents are of type {@link art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Types</em>' reference list.
	 * @see art2.Art2Package#getExtraFonctionalProperty_PortTypes()
	 * @model
	 * @generated
	 */
	EList<PortTypeRef> getPortTypes();

} // ExtraFonctionalProperty
