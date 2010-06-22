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
 * A representation of the model object '<em><b>Integration Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.IntegrationPattern#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link art2.IntegrationPattern#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getIntegrationPattern()
 * @model
 * @generated
 */
public interface IntegrationPattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Extra Fonctional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link art2.ExtraFonctionalProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Fonctional Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Fonctional Properties</em>' containment reference list.
	 * @see art2.Art2Package#getIntegrationPattern_ExtraFonctionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraFonctionalProperty> getExtraFonctionalProperties();

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
	 * @see art2.Art2Package#getIntegrationPattern_PortTypes()
	 * @model
	 * @generated
	 */
	EList<PortTypeRef> getPortTypes();

} // IntegrationPattern
