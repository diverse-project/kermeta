/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART;

import art_relaxed.AspectModelElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.InstantiationStrategy#getAdviceElements <em>Advice Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.Smartadapters4ARTPackage#getInstantiationStrategy()
 * @model abstract="true"
 * @generated
 */
public interface InstantiationStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Advice Elements</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.AspectModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice Elements</em>' reference list.
	 * @see smartadapters4ART.Smartadapters4ARTPackage#getInstantiationStrategy_AdviceElements()
	 * @model
	 * @generated
	 */
	EList<AspectModelElement> getAdviceElements();

} // InstantiationStrategy
